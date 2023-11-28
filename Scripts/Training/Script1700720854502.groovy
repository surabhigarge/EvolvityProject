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

WebUI.click(findTestObject('Object Repository/Page_Evolvity/button_Hemant'))

WebUI.click(findTestObject('Object Repository/Page_Evolvity/a_Impostazioni'))

WebUI.maximizeWindow()

String strText = 'Training'

WebUI.click(findTestObject('Object Repository/Page_Evolvity/span_Training', [('TrainingText') : strText]))

WebUI.click(findTestObject('Object Repository/Page_Evolvity/img'))

WebUI.click(findTestObject('Object Repository/Page_Evolvity/div_3 ways community creates a healthy life'))

//WebUI.click(findTestObject('Object Repository/Page_Evolvity/img_mr-2 mt-2'))
//WebUI.switchToWindowTitle('Olivia Affuso: 3 ways community creates a healthy life | TED Talk')
//WebUI.switchToWindowTitle('Evolvity')
WebUI.click(findTestObject('Object Repository/Page_Evolvity/button_Hemant'))

WebUI.click(findTestObject('Object Repository/Page_Evolvity/span_Logout'))

WebUI.closeBrowser()

