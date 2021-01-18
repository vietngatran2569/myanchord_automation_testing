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

WebUI.setText(findTestObject('Page_Myanchords/Login/input_email'), 'editor@myanchords.com')

WebUI.click(findTestObject('Page_Myanchords/Login/button_submit'))

WebUI.setEncryptedText(findTestObject('Page_Myanchords/Login/input_pass'), 'HwXnxaZD17M=')

WebUI.click(findTestObject('Page_Myanchords/Login/button_submit'))

WebUI.click(findTestObject('Page_Myanchords/Editor/div_editor'))

WebUI.setText(findTestObject('Page_Myanchords/Editor/input_chordname'), 'Normal')

WebUI.click(findTestObject('Page_Myanchords/Editor/btn_search'))

WebUI.clearText(findTestObject('Page_Myanchords/Editor/input_chordname'))

WebUI.setText(findTestObject('Page_Myanchords/Editor/input_content'), 'Yuki')

WebUI.click(findTestObject('Page_Myanchords/Editor/btn_search'))

WebUI.clearText(findTestObject('Page_Myanchords/Editor/input_content'))

WebUI.setText(findTestObject('Page_Myanchords/Editor/input_songname'), 'Yuki')

WebUI.click(findTestObject('Page_Myanchords/Editor/btn_search'))

WebUI.clearText(findTestObject('Page_Myanchords/Editor/input_songname'))

WebUI.refresh()

