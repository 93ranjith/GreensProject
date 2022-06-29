package org.green;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PojoProject extends BaseClasses{

		@BeforeClass
		public static void launchUrl() {
			// TODO Auto-generated method stub

		
		launchBrowser();
		maxWindow();
		toPassUrl("http://adactinhotelapp.com/index.php");
		}
		@Test
		public void execqution_test_cs_1() throws IOException {
		SamplePojo l=new SamplePojo();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		toInput(l.getTxtuser(),excelRead(1,1));
		
		toInput(l.getTxtpass(), excelRead(1,2));
		}
		@Test
		public void submit_test_cs_2() throws IOException {
		SamplePojo l=new SamplePojo();
			
		WebElement logbut2 = l.getLogbut();
		clickBtn(logbut2);
		
		
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
        WebElement loc = l.getLoc();
        clickBtn(loc);
        select(loc, "Sydney");
	 
        WebElement hot= l.getHot();
        clickBtn(hot);
        select(hot, "Hotel Sunshine");
        WebElement rmty= l.getRmtype();
        clickBtn(rmty);
        select(rmty, "Double");
	    WebElement rmno= l.getRmno();
	    clickBtn(rmno);
	    select(rmno, "3");
	    WebElement adrm =l.getAdrm();
	    clickBtn(adrm);
	    select(adrm, "2");
	    WebElement chrm =l.getChrm();
		clickBtn(chrm);
		select(chrm, "3");
	    WebElement ser =l.getSearch();
		clickBtn(ser);
	    WebElement rad =l.getRadio();
		clickBtn(rad);

		
	    WebElement coun =l.getCont();	
		clickBtn(coun);
		WebElement fstnam =l.getFstnam();
		toInput(fstnam, "kumaresan");
		WebElement lstnam =l.getLstnam();
		toInput(lstnam, "ravi");
		WebElement add =l.getAdd();
		toInput(add, "Velloer distic,tamilnadu");
		WebElement ccnum =l.getCcnum();
		toInput(ccnum, "5612345689754851");
		WebElement ccty =l.getCctype();
		select(ccty, "VISA");
		WebElement ccmon= l.getCcexmonth();
		select(ccmon, "4");
		WebElement ccyer =l.getCcexyear();
		select(ccyer, "2022");
		WebElement ccv =l.getCcv();
		toInput(ccv, "567");
		WebElement boknow =l.getBooknow();
		clickBtn(boknow);
		WebElement sreensho = l.getImg();
screenShot("imag");
		}
	
}
