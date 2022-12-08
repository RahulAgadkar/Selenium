package Genric_Scripts;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Genric_ScreenShot {
		public static void getPhoto(WebDriver driver) throws IOException{
			String Photo="./Photos/";
			Date d = new Date(0);
			String d1=d.toString().replaceAll(":","-");
		
			TakesScreenshot ts=(TakesScreenshot) driver;
			File src= ts.getScreenshotAs(OutputType.FILE);
			File dst=new File(Photo+d1+".jpeg");
			FileHandler.copy(src, dst);
		}

	}
