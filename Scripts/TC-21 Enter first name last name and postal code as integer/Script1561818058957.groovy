import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Object Repository/TC-21/Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_user-name'), 
    'standard_user')

WebUI.setEncryptedText(findTestObject('Object Repository/TC-21/Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_password'), 
    'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/TC-21/Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_btn_action'))

WebUI.click(findTestObject('Object Repository/TC-21/Page_Swag Labs/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/TC-21/Page_Swag Labs/span_1'))

WebUI.click(findTestObject('Object Repository/TC-21/Page_Swag Labs/a_CHECKOUT'))

WebUI.setText(findTestObject('Object Repository/TC-21/Page_Swag Labs/input_Checkout Your Information_first-name'), '123')

WebUI.setText(findTestObject('Object Repository/TC-21/Page_Swag Labs/input_Checkout Your Information_last-name'), '123')

WebUI.setText(findTestObject('Object Repository/TC-21/Page_Swag Labs/input_Checkout Your Information_postal-code'), '123')

WebUI.click(findTestObject('Object Repository/TC-21/Page_Swag Labs/input_CANCEL_btn_primary cart_button'))
