import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://myanchords.com/')

WebUI.click(findTestObject('Page_Myanchords/Login/span_login'))

WebUI.setText(findTestObject('Page_Myanchords/Login/input_email'), 'ngattv.neonstudio@gmail.com')

WebUI.click(findTestObject('Page_Myanchords/Login/button_submit'))

WebUI.setEncryptedText(findTestObject('Page_Myanchords/Login/input_pass'), 'vOA/pK4z/72yq6MkG9e3eBj3lQ9MtC9o')

WebUI.click(findTestObject('Page_Myanchords/Login/button_submit'))

WebUI.refresh()

WebUI.click(findTestObject('Page_Myanchords/Comment/btn_category'))

WebUI.click(findTestObject('Page_Myanchords/Comment/div_pop'))

WebUI.click(findTestObject('Page_Myanchords/Comment/div_song'))

WebUI.click(findTestObject('Page_Myanchords/Comment/input_comment'))

WebUI.setText(findTestObject('Page_Myanchords/Comment/input_comment'), 'so good')

WebUI.click(findTestObject('Page_Myanchords/Comment/btn_addcomment'))

