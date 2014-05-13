package ru.ibs.updateservice;

import javax.ejb.Stateless;
import javax.jws.WebService;

import ru.ibs.updateservice.tables.Table;
import ru.ibs.updateservice.tables.TableFactory;
import ru.ibs.updateservice.tables.Tables;

@WebService(portName = "UpdateServiceSOAP", serviceName = "UpdateService", endpointInterface = "ru.ibs.updateservice.UpdateService", targetNamespace = "http://www.ibs.ru/UpdateService/", wsdlLocation = "META-INF/wsdl/ru/ibs/updateservice/UpdateService/UpdateService.wsdl")
@Stateless
public class UpdateServiceImplBean {

   public ru.ibs.updateservice.OutputData update(
         byte[] obsoleteData,java.lang.String obsoleteDataType, 
         byte[] actualData, java.lang.String actualDataType,
         java.util.List<ru.ibs.updateservice.IndexMapping> keyColumnMapping,
         java.util.List<ru.ibs.updateservice.IndexMapping> mergeColumnMapping,
         java.lang.Boolean complexKey) {
      
      int firstKeyColumnIndex = keyColumnMapping.get(0).getSourceIndex().intValue();
      Table obsoleteTable = TableFactory.createTable(obsoleteData, obsoleteDataType, firstKeyColumnIndex);
      
      firstKeyColumnIndex = keyColumnMapping.get(0).getTargetIndex().intValue();
      Table actualTable = TableFactory.createTable(actualData, actualDataType, firstKeyColumnIndex);
      
      Tables.update(obsoleteTable, actualTable, keyColumnMapping, mergeColumnMapping, complexKey);
      
      return null;
   }
}