package org.green;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SamplePojo extends BaseClasses{
	
	
	public SamplePojo() {
		
		PageFactory.initElements(driver, this);

	}
	
    @FindBy(id="username")
	private static WebElement txtuser;
    
	@FindBy(id="password")
	private static WebElement txtpass;

    @FindBy(id="login" )
	private static WebElement logbut;
    
    @FindBy(id="location")
    private static WebElement loc;
    
    @FindBy(id="hotels")
    private static WebElement hot;
    
    @FindBy(id="room_type")
    private static WebElement rmtype;
    
    @FindBy(id="room_nos")
    private static WebElement rmno;
    
    @FindBy(id="adult_room")
    private static WebElement Adrm;
    
    @FindBy(id="child_room")
    private static WebElement chrm;
    
    public static WebElement getRadio() {
		return radio;
	}


	public static void setRadio(WebElement radio) {
		SamplePojo.radio = radio;
	}


	public static WebElement getCont() {
		return cont;
	}


	public static void setCont(WebElement cont) {
		SamplePojo.cont = cont;
	}

	@FindBy(id="Submit")
    private static WebElement search;
    @FindBy(id="radiobutton_0")
     private static WebElement radio;
    @FindBy(id="continue")
    private static WebElement cont;
    @FindBy(id="first_name")
	private static WebElement fstnam;
    @FindBy(id="order_no")
    private static WebElement img;
    
    public static WebElement getImg() {
		return img;
	}


	public static WebElement getFstnam() {
		return fstnam;
	}


	public static WebElement getLstnam() {
		return lstnam;
	}


	public static WebElement getAdd() {
		return add;
	}


	public static WebElement getCcnum() {
		return ccnum;
	}


	public static WebElement getCctype() {
		return cctype;
	}


	public static WebElement getCcexmonth() {
		return ccexmonth;
	}


	public static WebElement getCcexyear() {
		return ccexyear;
	}


	public static WebElement getCcv() {
		return ccv;
	}


	public static WebElement getBooknow() {
		return booknow;
	}

	@FindBy(id="last_name")
    private static WebElement lstnam;
    @FindBy(id="address")
    private static WebElement add;
    @FindBy(id="cc_num")
    private static WebElement ccnum;
    @FindBy(id="cc_type")
    private static WebElement cctype;
    @FindBy(id="cc_exp_month")
    private static WebElement ccexmonth;
    @FindBy(id="cc_exp_year")
    private static 	WebElement ccexyear;
    @FindBy(id="cc_cvv")
    private static WebElement ccv;
    @FindBy(id="book_now")
    private static WebElement booknow;

	public static void setHot(WebElement hot) {
		SamplePojo.hot = hot;
	}


	public static void setRmtype(WebElement rmtype) {
		SamplePojo.rmtype = rmtype;
	}


	public static void setRmno(WebElement rmno) {
		SamplePojo.rmno = rmno;
	}


	public static void setAdrm(WebElement adrm) {
		Adrm = adrm;
	}


	public static void setChrm(WebElement chrm) {
		SamplePojo.chrm = chrm;
	}


	public static void setSearch(WebElement search) {
		SamplePojo.search = search;
	}


	public WebElement getHot() {
		return hot;
	}


	public static WebElement getRmtype() {
		return rmtype;
	}


	public static WebElement getRmno() {
		return rmno;
	}


	public static WebElement getAdrm() {
		return Adrm;
	}


	public static WebElement getChrm() {
		return chrm;
	}


	public static WebElement getSearch() {
		return search;
	}


	public static WebElement getLoc() {
		return loc;
	}


	public static void setLoc(WebElement loc) {
		SamplePojo.loc = loc;
	}


	public static void setTxtuser(WebElement txtuser) {
		SamplePojo.txtuser = txtuser;
	}


	public static void setTxtpass(WebElement txtpass) {
		SamplePojo.txtpass = txtpass;
	}


	public static void setLogbut(WebElement logbut) {
		SamplePojo.logbut = logbut;
	}


	public static WebElement getTxtuser() {
		return txtuser;
	}
	

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getLogbut() {
		return logbut;
	}


	
	}
	  
		  
	  
	
	
	
	

