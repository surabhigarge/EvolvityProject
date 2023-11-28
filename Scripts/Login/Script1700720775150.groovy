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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.navigateToUrl('https://staging.humanlytic.com/app/login/prysmian')

WebUI.setText(findTestObject('Object Repository/Page_Evolvity/input_email'), 'hemant.uchchasare@5exceptions.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Evolvity/input_password'), '7Dxoto1EjKfoc3Lmys/f5Q==')

WebUI.click(findTestObject('Object Repository/Page_Evolvity/button_Accedi'))

WebUI.waitForElementVisible(findTestObject('Page_Neocogita/video_measurement-canvas'), 4)

WebUI.click(findTestObject('Object Repository/Page_Neocogita/video_measurement-canvas'))

WebUI.navigateToUrl('https://staging.humanlytic.com/app/login/dashboard')

WebUI.click(findTestObject('Object Repository/Page_Evolvity/h4_Vital parameters'))

WebUI.rightClick(findTestObject('Object Repository/Page_Evolvity/h4_Vital parameters'))

WebUI.click(findTestObject('Object Repository/Page_Evolvity/div_Dashboard General'))

