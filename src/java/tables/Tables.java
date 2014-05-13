package ru.ibs.updateservice.tables;

import java.util.List;

import ru.ibs.updateservice.IndexMapping;

public class Tables {
   
   public static void update(Table sourceTable, Table targetTable, 
         List<IndexMapping> keyColumnMapping, List<IndexMapping> mergeColumnMapping,
         boolean isCompexType) {
      
      /*
       * Algorithm:
       * Creating hashmap for obsolete data for fast search in the future.
       * Iterate through the actual table looking for data in obsolete hashmap.
       *    Check another key columns. Depending of different cases (complex key or not?  
       *    Are other keys equal?) do different things. 
       */
      
      // Just take first key value from list of keys
      int obsoleteFirstKeyColumnIndex = keyColumnMapping.get(Table.FIRST_INDEX).
         getSourceIndex().intValue();
      sourceTable.createMap();
      
      Table updatedTable = TableFactory.createTable("xlsx");
      Table erroneousTable = TableFactory.createTable("xlsx");
      
      for (int rowIndex = targetTable.getFirstRowNumber(); rowIndex < targetTable.getRowsNumber(); 
         rowIndex++) {
         int countFoundRecords = 0;
         //look for the same key in the obsolete table
         Integer foundRowIndex = sourceTable.getColumnMap().get(
               targetTable.getCell(rowIndex, targetTable.getFirstKeyColumnIndex() ) );
         // if found 
         if (foundRowIndex != null) {
            boolean otherKeysEqual = compareKeys(foundRowIndex, keyColumnMapping, 
                  sourceTable, targetTable);      
            if (otherKeysEqual) {
               // TODO
               copyRow(foundRowIndex, sourceTable, updatedTable );
               //updateCells(mergeColumnMapping, sheets[ACTUAL_INDEX], sheets[UPDATED_INDEX] );
               countFoundRecords++;
            }
         }
      
      }

   }

   private static boolean compareKeys(Integer foundIndexRow, List<IndexMapping> keyColumnMapping,
         Table sourceTable, Table targetTable) {

      for (IndexMapping pair : keyColumnMapping) {
         String sourceCellValue = (String) sourceTable.getCell(foundIndexRow, pair.getSourceIndex()
               .intValue());
         String targetCellValue = (String) targetTable.getCell(foundIndexRow, pair.getTargetIndex()
               .intValue());
         if (!sourceCellValue.equals(targetCellValue)) {
            return false;
         }
      }
      return true;
   }
   
   // TODO
   private static void copyRow(Integer foundRowIndex, Table sourceTable, Table targetTable) {
      for (int columnIndex = sourceTable.getFirstColumnNumber(); columnIndex < sourceTable
            .getColumnsNumber(); columnIndex++) {
         String bufferCellValue = (String) sourceTable.getCell(foundRowIndex, columnIndex);
         // add to the end of the table
         targetTable.setCell(targetTable.getRowsNumber(), columnIndex, bufferCellValue);
      }
   }
}
