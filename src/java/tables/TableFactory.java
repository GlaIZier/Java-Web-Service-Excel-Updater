package ru.ibs.updateservice.tables;

import java.io.IOException;

public abstract class TableFactory {
   
   public static Table createTable(byte[] data, String type, int firstKeyColumnIndex) {
      if (type.equalsIgnoreCase("xlsx") ) {
         try {
            return new XLSXTable(data, firstKeyColumnIndex);
         }
         catch (IOException e) {
            e.printStackTrace();
         }
      }
      else if (type.equalsIgnoreCase("csv")) {
        // return new CSVTable(data, firstKeyColumnIndex);
      }
      // Other table types...
      return null;
   }
   
   public static Table createTable(String type) {
      if (type.equalsIgnoreCase("xlsx") ) {
         return new XLSXTable();
      }
      else if (type.equalsIgnoreCase("csv")) {
        // return new CSVTable();
      }
      // Other table types...
      return null;
   }

}
