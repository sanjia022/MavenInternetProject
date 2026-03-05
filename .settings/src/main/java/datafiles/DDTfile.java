package datafiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DDTfile {
	public String getvaluefromexcel(String page ,int row, int cell) throws EncryptedDocumentException, IOException {
	
	FileInputStream f1 = new FileInputStream("C:\\Users\\r88st\\eclipse-workspace-fixed\\MavenProject\\DDTfolder\\FormAuthentication.xlsx");
	Workbook w1 = WorkbookFactory.create(f1);
	String value = w1.getSheet(page).getRow(row).getCell(cell).getStringCellValue();
	return value;

}
	
	public String getNumericValuefromexcel(String page ,int row, int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream f1 = new FileInputStream("C:\\Users\\r88st\\eclipse-workspace-fixed\\MavenProject\\DDTfolder\\FormAuthentication.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String value =NumberToTextConverter.toText( (w1.getSheet(page).getRow(row).getCell(cell).getNumericCellValue()));
		return value;

	}
}