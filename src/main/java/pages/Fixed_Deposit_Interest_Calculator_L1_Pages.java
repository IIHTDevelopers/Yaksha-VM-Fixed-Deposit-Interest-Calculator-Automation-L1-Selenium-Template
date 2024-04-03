package pages;


import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class Fixed_Deposit_Interest_Calculator_L1_Pages extends StartupPage 
{
	public SoftAssert softAssert;
	/*
	 * WebElemet Declaration
	 */	
	By personalFinanceNavigationMenu = By.xpath("");
	By fixedDepositInterestCalculatorLink = By.xpath(""); 
	By investmentAmountTextfield = By.xpath("");
	By investmentPeriodTextfield = By.xpath("");
	By rateOfReturnTextfield = By.xpath("");
	By interestFrequencyYearlyButton = By.xpath("");
	By taxRateTextfield = By.xpath("");
	By totalInterestContentBox = By.xpath("");
	By totalInterestResultButton = By.xpath("");
	By totalInterestValue = By.xpath("");
	By totalPaymentResultButton = By.xpath("");
	By totalPaymentValue = By.xpath("");
	By totalCorpusResultButton = By.xpath("");
	By totalCorpusValue = By.xpath("");
	By totalTaxAmountResultButton = By.xpath("");
	By totalTaxAmountValue = By.xpath("");
	By totalInterestRupeesValueTextLink = By.xpath("");
	By submitButton = By.xpath("");


	/*
	 * Getting the page name
	 */	
	String pageName = this.getClass().getSimpleName();


	/*
	 * constructor Initialization
	 */	
	public Fixed_Deposit_Interest_Calculator_L1_Pages(WebDriver driver) 
	{
		super(driver);
	}	


	/**@Test0
	 * about this method validateTitleOfCurrentPage() 
	 * @param : null
	 * @description : get the title of the home page and validate
	 * @return : String
	 * @author : Yaksha
	 */
	public String validateTitleOfCurrentPage() throws Exception {
		
		return null;
	}
	
	/**@Test1
	 * about this method navigateToFixedDepositInterestCalculatorPage() 
	 * @param : null
	 * @description : mousehover to Personal Finance Navigation bar and will click on fixed deposit interest calculator
	 * @return : return the title of fixed deposit interest calculator
	 * @author : Yaksha
	 */
	public String navigateToFixedDepositInterestCalculatorPage() throws Exception {
				
		return null;
	}
	
	/**@Test2
	 * about this method enterInvestmentAmountInFixedDepositInterestCalculatorForm() 
	 * @param : Map<String, String>,  get the data from json file as type Map<String, String> expectedData
	 * @description : enter value in Your Investment Amount text field as per json expected data and fetch the value of that text field ,
	 * @return : fetch the value from the in Your Investment Amount text field as string type
	 * @author : Yaksha
	 */
	public String enterInvestmentAmountInFixedDepositInterestCalculatorForm(Map<String, String> expectedData) throws Exception {
		
		return null;
	}
	
	/**@Test3
	 * about this method enterInvestmentPeriodInFixedDepositInterestCalculatorForm() 
	 * @param : Map<String, String>,  get the data from json file as type Map<String, String> expectedData
	 * @description : enter value in Your Investment Period text field as per json expected data and fetch the value of that text field ,
	 * @return : fetch the value from the in Your Investment Period text field as string type
	 * @author : Yaksha
	 */
	public String enterInvestmentPeriodInFixedDepositInterestCalculatorForm(Map<String, String> expectedData) throws Exception {
		
		return null;
	}
	
	/**@Test4
	 * about this method enterRateOfReturnInFixedDepositInterestCalculatorForm() 
	 * @param : Map<String, String>,  get the data from json file as type Map<String, String> expectedData
	 * @description : enter value in Your Rate Of Return text field as per json expected data and fetch the value of that text field ,
	 * @return : fetch the value from the in Your Investment Period text field as string type
	 * @author : Yaksha
	 */
	public String enterRateOfReturnInFixedDepositInterestCalculatorForm(Map<String, String> expectedData) throws Exception {
		
		return null;
	}
	
	/**@test5
	 * about this method selectInterestFrequencyButtonInFixedDepositInterestCalculatorForm() 
	 * @param : null
	 * @description : click on Interest Frequency Button, if Interest Frequency Button is present in that page
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean selectInterestFrequencyButtonInFixedDepositInterestCalculatorForm() throws Exception {
		
		return false;
	}
	
	/**@Test6
	 * about this method enterTaxRateInFixedDepositInterestCalculatorForm() 
	 * @param :Map<String, String>,  get the data from json file as type Map<String, String> expectedData
	 * @description : enter value in Your Tax Rate text field as per json expected data and fetch the value of that text field ,
	 * @return : fetch the value from the Tax Rate  text field as string type
	 * @author : Yaksha
	 */
	public String enterTaxRateInFixedDepositInterestCalculatorForm(Map<String, String> expectedData) throws Exception {
		
		return null;
	}
	
	/**@test7
	 * about this method fetchTotalInterest() 
	 * @param : null
	 * @description : get the total interest value if is it display in the page
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean fetchTotalInterest() throws Exception {
		
		return false;
	}
	
	/**@test8
	 * about this method fetchTotalPayment() 
	 * @param : null
	 * @description : get the total Payment value if is it display in the page
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean fetchTotalPayment() throws Exception {
		
		return false;
	}
	
	/**@test9
	 * about this method fetchTotalCorpus() 
	 * @param : null
	 * @description : get the total Corpus value if is it display in the page
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean fetchTotalCorpus() throws Exception {
		
		return false;
	}
	
	/**@test10
	 * about this method fetchTaxAmount() 
	 * @param : null
	 * @description : get the total TaxAmount value if is it display in the page
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean fetchTaxAmount() throws Exception {
		
		return false;
	}
}