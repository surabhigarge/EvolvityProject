package common
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class Login {

	@Given("User is on Login Page")
	def Navigate() {
		WebUI.navigateToUrl('https://staging.humanlytic.com/app/login/prysmian')
	}

	@When("Enter valid (.*) and (.*)")
	def Enter(String Username, String Password) {

		WebUI.setText(findTestObject('Object Repository/Page_Evolvity/input_email'), Username)

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Evolvity/input_password'), Password)

		WebUI.click(findTestObject('Object Repository/Page_Evolvity/button_Accedi'))

		WebUI.waitForElementPresent(findTestObject('Page_Neocogita/video_measurement-canvas'), 3)
	}

	@Then("User should logged in")
	def homePage() {
		WebUI.click(findTestObject('Object Repository/Page_Neocogita/video_measurement-canvas'))

		WebUI.navigateToUrl('https://staging.humanlytic.com/app/login/dashboard')

		WebUI.click(findTestObject('Object Repository/Page_Evolvity/h4_Vital parameters'))
	}
}