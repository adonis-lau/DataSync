package bid.adonis.lau.utisl;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.piccolo.io.FileFormatException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


/**
 * @Description:
 * @Author: adonis lau
 * @Eamil: adonis.lau.dev@gmail.com
 * @Date: 2017/10/27 23:44
 */
public class ExcelUtils {

    private static final String EXTENSION_XLS = "xls";
    private static final String EXTENSION_XLSX = "xlsx";

    /***
     * <pre>
     * 取得Workbook对象(xls和xlsx对象不同,不过都是Workbook的实现类)
     *   xls:HSSFWorkbook
     *   xlsx：XSSFWorkbook
     * @param filePath
     * @return
     * @throws IOException
     * </pre>
     */
    private static Workbook getWorkbook(String filePath) {
        Workbook workbook = null;
        InputStream is;
        try {
            is = new FileInputStream(filePath);
            if (filePath.endsWith(EXTENSION_XLS)) {
                workbook = new HSSFWorkbook(is);
            } else if (filePath.endsWith(EXTENSION_XLSX)) {
                workbook = new XSSFWorkbook(is);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return workbook;
    }

    /**
     * 文件检查
     *
     * @param filePath
     * @throws FileNotFoundException
     * @throws FileFormatException
     */
    private static void preReadCheck(String filePath) throws FileNotFoundException, FileFormatException {
        // 常规检查
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("传入的文件不存在：" + filePath);
        }

        if (!(filePath.endsWith(EXTENSION_XLS) || filePath.endsWith(EXTENSION_XLSX))) {
            throw new FileFormatException("传入的文件不是excel");
        }
    }

    /**
     * 读取excel文件内容
     *
     * @param filePath
     * @throws FileNotFoundException
     * @throws FileFormatException
     */
    public static List<List<String>> readExcel(String filePath) throws FileNotFoundException, FileFormatException {
        // 检查
        preReadCheck(filePath);
        // 获取workbook对象
        Workbook workbook = null;
        List<List<String>> excelList = new ArrayList<>();
        List<String> rowList = null;
        try {
            workbook = getWorkbook(filePath);
            // 读文件 一个sheet一个sheet地读取
            for (int numSheet = 0; numSheet < workbook.getNumberOfSheets(); numSheet++) {
                Sheet sheet = workbook.getSheetAt(numSheet);
                if (sheet == null) {
                    break;
                }
                if (sheet.getLastRowNum() == 0) {
                    break;
                }

                int firstRowIndex = sheet.getFirstRowNum();
                int lastRowIndex = sheet.getLastRowNum();
//                System.out.println(firstRowIndex);
                // 读取首行 即,表头
                Row firstRow = sheet.getRow(firstRowIndex);
                rowList = new ArrayList<>();
                for (int i = firstRow.getFirstCellNum(); i <= firstRow.getLastCellNum(); i++) {
//                    System.out.println(firstRow.getFirstCellNum());
//                    System.out.println(firstRow.getLastCellNum());
                    Cell cell = firstRow.getCell(i);
                    String cellValue = getCellValue(cell, true);
                    rowList.add(cellValue);
                }
                excelList.add(rowList);

                // 读取数据行
                for (int rowIndex = firstRowIndex + 1; rowIndex <= lastRowIndex; rowIndex++) {
                    Row currentRow = sheet.getRow(rowIndex);// 当前行
                    int firstColumnIndex = currentRow.getFirstCellNum(); // 首列
                    int lastColumnIndex = currentRow.getLastCellNum();// 最后一列
                    rowList = new ArrayList<>();
                    for (int columnIndex = firstColumnIndex; columnIndex <= lastColumnIndex; columnIndex++) {
                        Cell currentCell = currentRow.getCell(columnIndex);// 当前单元格
                        String currentCellValue = getCellValue(currentCell, true);// 当前单元格的值
                        rowList.add(currentCellValue);
                    }
                    excelList.add(rowList);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return excelList;
    }

    /**
     * 取单元格的值
     *
     * @param cell       单元格对象
     * @param treatAsStr 为true时，当做文本来取值 (取到的是文本，不会把“1”取成“1.0”)
     * @return
     */
    private static String getCellValue(Cell cell, boolean treatAsStr) {
        if (cell == null) {
            return "";
        }

        if (treatAsStr) {
            // 虽然excel中设置的都是文本，但是数字文本还被读错，如“1”取成“1.0”
            // 加上下面这句，临时把它当做文本来读取
            cell.setCellType(Cell.CELL_TYPE_STRING);
        }

        if (cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
            return String.valueOf(cell.getBooleanCellValue());
        } else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
            return String.valueOf(cell.getNumericCellValue());
        } else {
            return String.valueOf(cell.getStringCellValue());
        }
    }

    public static void main(String[] args) {
        try {
            List<List<String>> excelList = readExcel("F:\\Work\\Outside\\静安决策\\国别.xlsx");
            for (List<String> rowList : excelList) {
                for (String cellValue : rowList) {
                    System.out.print(cellValue + "\t");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (FileFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}


