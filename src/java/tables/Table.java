package ru.ibs.updateservice.tables;

import java.util.Map;

public abstract class Table {

   public static final int FIRST_INDEX = 0;
   
   private int firstKeyColumnIndex;
   
   private Map<Object, Integer> columnMap;
   
   protected Table(int firstKeyColumnIndex) {
      // no columnMap yet
      this.firstKeyColumnIndex = firstKeyColumnIndex;
      columnMap = null;
   }
   
   public abstract void createMap();
   
   public abstract int getRowsNumber();
   
   public abstract int getColumnsNumber();
   
   public abstract int getFirstRowNumber();
   
   public abstract int getFirstColumnNumber();
   
   public abstract Object getCell(int rowIndex, int columnIndex);
   
   public abstract void setCell(int rowIndex, int columnIndex, Object value);

   public int getFirstKeyColumnIndex() {
      return firstKeyColumnIndex;
   }

   public void setFirstKeyColumnIndex(int firstKeyColumnIndex) {
      this.firstKeyColumnIndex = firstKeyColumnIndex;
   }

   public Map<Object, Integer> getColumnMap() {
      return columnMap;
   }

   public void setColumnMap(Map<Object, Integer> columnMap) {
      this.columnMap = columnMap;
   }
   
   
}
