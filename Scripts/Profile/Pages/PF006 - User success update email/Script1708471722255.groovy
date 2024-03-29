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

Mobile.callTestCase(findTestCase('Profile/Step Definitions/User access profile page'), [:], FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('Profile/btnLogin'), 3, FailureHandling.OPTIONAL)) {
    Mobile.callTestCase(findTestCase('Profile/Step Definitions/User login'), [:], FailureHandling.STOP_ON_FAILURE)
}

Mobile.callTestCase(findTestCase('Profile/Step Definitions/User tap icon pencil button'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Profile/Step Definitions/User tap on preview email'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Profile/Step Definitions/User input update email'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Profile/Step Definitions/User tap simpan button'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Profile/Step Definitions/User see success update notification'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Profile/Step Definitions/User logout'), [:], FailureHandling.STOP_ON_FAILURE)

