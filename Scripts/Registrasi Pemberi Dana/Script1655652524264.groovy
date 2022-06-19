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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.p2p.alamisharia.co.id/')

WebUI.click(findTestObject('Page_Login  ALAMI Peer-to-Peer Lending Syariah/a_Daftar disini'))

WebUI.click(findTestObject('Object Repository/Page_ALAMI Daftar  ALAMI Peer-to-Peer Lendi_33cbd2/div_Pemberi Dana                           _b3d4b2'))

WebUI.setText(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_Nama Lengkap_name'), 
    'User Alami')

WebUI.setText(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_Email_email'), 
    ('alami' + System.nanoTime()) + '@alami.com')

WebUI.setText(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_No. Handphone_phone'), 
    '081234567890')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_Password_password'), 
    '8SQVv/p9jVT+ln2sr/QRUA==')

WebUI.click(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/label_Individual'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/select_-- Silahkan Pilih --                _9f24ad'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/button_Lanjutkan'))

WebUI.scrollToElement(findTestObject('Page_Daftar Sebagai Pemberi Dana  ALAMI Peer-to-Peer Lending Syariah/Kontak dan Media Sosial Kami'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_Saya tertarik update info terbaru ALA_1ed3da'))

WebUI.click(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_Saya sudah membaca dan setuju dengan__c3b002'))

WebUI.click(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/button_Lanjutkan_1'))

WebUI.waitForElementPresent(findTestObject('Page_Daftar Sebagai Pemberi Dana  ALAMI Peer-to-Peer Lending Syariah/Berhasil Terdaftar'), 
    0)

WebUI.closeBrowser()

