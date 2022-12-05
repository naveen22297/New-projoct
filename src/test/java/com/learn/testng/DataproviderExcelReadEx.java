package com.learn.testng;

import org.testng.annotations.Test;

public class DataproviderExcelReadEx {
	//yuvraj prog
	@Test
	public void data() {
		
	/*	Object [][] cvE= dataProviderreuse();
		for (int i = 0; i < cvE.length; i++) {
			for (int j = 0; j < cvE.length; j++) {
				System.out.println(cvE[i][j]);
			}
			
		}*/
	}
	
	/*@DataProvider
	public  Object[][]  dataProviderreuse() {
		// file read
		Object[][] twodimensionarray=null;
		Object value = null;
				try {
					// file -> locate
					File f = new File("C:\\Users\\Yuvaraj\\eclipse-workspace\\Oct_SampleProject\\src"
							+ "\\test\\resources\\TestData\\Oct_TestData.xlsx");
					FileInputStream fis = new FileInputStream(f);
					// workbook interface
					Workbook wb = new XSSFWorkbook(fis);
					Sheet sheet = wb.getSheet("Sheet1");
					int totalnumberofrows = sheet.getPhysicalNumberOfRows();
					int totalNumberofCells = sheet.getRow(0).getPhysicalNumberOfCells();
				twodimensionarray= new Object[totalnumberofrows-1][totalNumberofCells];	
				for (int i = 1; i < totalnumberofrows; i++) {
					Row row = sheet.getRow(i);
					for (int j = 0; j < totalNumberofCells; j++) {
						Cell cell = row.getCell(j);
						int type = cell.getCellType();
						if(type==1) {
							 value = cell.getStringCellValue();
							 System.out.println(value);
						}else if(type==0) {
							if(DateUtil.isCellDateFormatted(cell)) {
								Date dateCellValue = cell.getDateCellValue();
								SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yy");
								value= sf.format(dateCellValue);
								System.out.println(value);
							}else {
								double numericCellValue = cell.getNumericCellValue();
								long l = (long)numericCellValue;
								value = String.valueOf(l);
								System.out.println(value);
							}
							twodimensionarray[i-1][j]=value;
						}
						
					}
				}	
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return twodimensionarray;
				
				
	}
*/


}
