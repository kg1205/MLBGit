package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Itv_Rc {


	WebDriver driver;

	public Itv_Rc(WebDriver d) {
		driver = d;
	}

	By Transactions = By.xpath("//div[contains(text(),'Transactions')]");
	By Nc_Dbc = By.xpath(
			"//div[contains(text(),'NC / DBC / RC / TV')]");
	By ItvRc = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/section/div[4]/div[2]/div[2]");
	By AddNcDbc = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[1]/div[3]/div[1]");
	By invoiceDate = By.xpath("//input[@placeholder='INVOICE DATE']");
	By StaffName=By.xpath("//div[@class='flex aic gap10']//div//select[@class='drop-select']");
	By CustName = By.xpath("//input[@placeholder='CUST NO./NAME']");
	By ItemDrp1=By.xpath("//tr[2]//td[1]//div[1]//select[1]");
	By NoOfCyl=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[6]/div/div[2]/div/div[2]/div/div/table/tr[2]/td[2]/div/div/input");
	By NoOFReg=By.xpath("//tr[2]//td[3]//div[1]//div[1]//input[1]");
	By CylDep=By.xpath("//tr[2]//td[4]//div[1]//div[1]//input[1]");
	By RegDep=By.xpath("//tr[2]//td[5]//div[1]//div[1]//input[1]");
	By AdminChrge=By.xpath("//tr[2]//td[6]//div[1]//select[1]");
	By FetchDep = By.xpath("//div[normalize-space()='FETCH DEPOSITS AND CHARGES']");
	By Calculate = By.xpath("//div[normalize-space()='CALCULATE']");
	By Save = By.xpath("//div[normalize-space()='SAVE']");
	
	
	public void ClickonTransactions() {
		driver.findElement(Transactions).click();
	}

	public void ClickonNcDbc() {
		driver.findElement(Nc_Dbc).click();
	}

	public void ClickonItvRcSub() {
		driver.findElement(ItvRc).click();
	}
	
	public void ClickOnAdd() {
		driver.findElement(AddNcDbc).click();
	}

	public void EnterInvoiceDate(String date) {
		driver.findElement(invoiceDate).sendKeys(date);
	}

	public void SelectStaffName() {
		driver.findElement(StaffName).click();
		WebElement ss = driver.findElement(StaffName);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void EnterCustName(String name) {
		driver.findElement(CustName).sendKeys(name);
	}

	public void SelectItem() {
		driver.findElement(ItemDrp1).click();
		WebElement ss = driver.findElement(ItemDrp1);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void EnterNoOfCyl(String num) {
		driver.findElement(NoOfCyl).sendKeys(num);
	}

	public void EnterNoOfReg(String num) {
		driver.findElement(NoOFReg).sendKeys(num);
	}

	public void EnterCylDep(String num) {
		driver.findElement(CylDep).sendKeys(num);
	}
	public void EnterRegDep(String num) {
		driver.findElement(RegDep).sendKeys(num);
	}
	public void SelectAdminCharge() {
		driver.findElement(AdminChrge).click();
		WebElement ss = driver.findElement(AdminChrge);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void ClickOnFetchDepAndCharges() {
		driver.findElement(FetchDep).click();
	}

	public void ClickonCalculate() {
		driver.findElement(Calculate).click();
	}

	public void ClickonSave() {
		driver.findElement(Save).click();
	}

	
	
	
}
