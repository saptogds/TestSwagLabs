import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/TS-2 Product List')

suiteProperties.put('name', 'TS-2 Product List')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Sapto\\Katalon Studio\\TestSwagLabs\\Reports\\TS-2 Product List\\20190628_104936\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/TS-2 Product List', suiteProperties, [new TestCaseBinding('Test Cases/TC-1 Login with valid username standard_user and valid password', 'Test Cases/TC-1 Login with valid username standard_user and valid password',  null), new TestCaseBinding('Test Cases/TC-8 Check drop down button for sorting', 'Test Cases/TC-8 Check drop down button for sorting',  null), new TestCaseBinding('Test Cases/TC-9 Check button of product', 'Test Cases/TC-9 Check button of product',  null), new TestCaseBinding('Test Cases/TC-10 Check clickable image of product', 'Test Cases/TC-10 Check clickable image of product',  null), new TestCaseBinding('Test Cases/TC-11 Check button back of product detail', 'Test Cases/TC-11 Check button back of product detail',  null), new TestCaseBinding('Test Cases/TC-12 Check clickable text of product', 'Test Cases/TC-12 Check clickable text of product',  null)])
