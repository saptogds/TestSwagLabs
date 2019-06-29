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


suiteProperties.put('id', 'Test Suites/TS-1 Login')

suiteProperties.put('name', 'TS-1 Login')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Sapto\\Katalon Studio\\TestSwagLabs\\Reports\\TS-1 Login\\20190628_144423\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/TS-1 Login', suiteProperties, [new TestCaseBinding('Test Cases/TC-01 Login with valid username standard_user and valid password', 'Test Cases/TC-01 Login with valid username standard_user and valid password',  null), new TestCaseBinding('Test Cases/TC-02 Login with valid username locked_out_user and valid password', 'Test Cases/TC-02 Login with valid username locked_out_user and valid password',  null), new TestCaseBinding('Test Cases/TC-03 Login with valid username problem_user and valid password', 'Test Cases/TC-03 Login with valid username problem_user and valid password',  null), new TestCaseBinding('Test Cases/TC-04 Login with valid username performance_glitch_user and valid password', 'Test Cases/TC-04 Login with valid username performance_glitch_user and valid password',  null), new TestCaseBinding('Test Cases/TC-05 Login with valid username and invalid password', 'Test Cases/TC-05 Login with valid username and invalid password',  null), new TestCaseBinding('Test Cases/TC-06 Login with invalid username and valid password', 'Test Cases/TC-06 Login with invalid username and valid password',  null), new TestCaseBinding('Test Cases/TC-07 Login with invalid username and invalid password', 'Test Cases/TC-07 Login with invalid username and invalid password',  null)])
