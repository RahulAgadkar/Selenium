package Test_Scripts;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Genric_Scripts.Base_Test;
import Genric_Scripts.Genric_Fetch_data;
import Pom_Scripts.Pom_Script;

public class Facebook extends Base_Test {
	
	@Test
	public void test() throws InterruptedException, EncryptedDocumentException, IOException {
		String username=Genric_Fetch_data.getData("Sheet1",0, 0);
		String password=Genric_Fetch_data.getData("Sheet1",1, 0);
	Pom_Script p=new Pom_Script(driver);
	p.userName(username);
	p.passWord(password);
	p.clickLogin();	
}
}
