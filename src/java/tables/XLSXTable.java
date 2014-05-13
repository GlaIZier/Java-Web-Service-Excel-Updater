package ru.ibs.updateservice.tables;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sun.org.apache.regexp.internal.recompile;

public class XLSXTable extends Table {

   private Workbook workbook;
   
   private Sheet sheet;
   
   XLSXTable(byte[] data, int firstKeyColumnIndex) throws IOException {
      super(firstKeyColumnIndex);
      InputStream byteArrayInputStream = null;
      try {
         byteArrayInputStream = new ByteArrayInputStream(data);
         workbook = new XSSFWorkbook(byteArrayInputStream); 
      }
      catch (IOException e) {
         e.printStackTrace();
      }
      finally {
         byteArrayInputStream.close();
      }
      sheet = workbook.getSheetAt(Table.FIRST_INDEX);
   }
   
   XLSXTable() {
      super(Table.FIRST_INDEX);
      workbook = new XSSFWorkbook();
      sheet = workbook.createSheet("Generated sheet");
   }
   
   @Override
   public void createMap() {
      Map<Object, Integer> map = new HashMap<Object, Integer>();
      
      for (Row row : sheet) {
         Cell cell = row.getCell(super.getFirstKeyColumnIndex());
         cell.setCellType(Cell.CELL_TYPE_STRING);
         map.put( (Object) cell.getStringCellValue(), row.getRowNum() );
      }
      
      super.setColumnMap(map);
   }
   
   @Override
   public int getRowsNumber() {
      return sheet.getLastRowNum();
   }
   
   @Override
   public int getColumnsNumber() {
      return sheet.getRow(sheet.getFirstRowNum()).getLastCellNum();
   }
   
   
   @Override
   public int getFirstRowNumber() {
      return sheet.getFirstRowNum();
   }
   
   @Override
   public int getFirstColumnNumber() {
      Row row = sheet.getRow(getFirstRowNumber());
      return row.getFirstCellNum();
   }
   
   @Override
   public Object getCell(int rowIndex, int columnIndex) {
      Row row = sheet.getRow(rowIndex);
      Cell cell = row.getCell(columnIndex);
      cell.setCellType(Cell.CELL_TYPE_STRING);
      return (Object) cell.getStringCellValue();
   }
   
   @Override
   public void setCell(int rowIndex, int columnIndex, Object value) {
      Row row = sheet.getRow(rowIndex);
      Cell cell = row.getCell(columnIndex);
      cell.setCellValue((String) value);
   }
}
