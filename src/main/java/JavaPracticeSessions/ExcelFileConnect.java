package JavaPracticeSessions;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Before;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
This method will be used to fetch data from excel sheet.
Total columns = 5
 */

public class ExcelFileConnect {
//    public static Workbook book;
//    public static Sheet sheet;
WebDriver driver;
    @BeforeTest
    public void setup() {
        String ChromePath = "/Users/yogeshdhekale/Downloads/chromedriver";
        System.setProperty("webdriver.chrome.driver", ChromePath);
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
    }
    @SuppressWarnings("resource")
    @Test
        public void ExcelConnectTest() {
        String filePath = "/Users/yogeshdhekale/IdeaProjects/" +
                "SeptJavaPractice/src/main/java/JavaPracticeSessions/SeleniumPractice.xlsx";
        XSSFSheet sheet = null;
        try {
            FileInputStream file = new FileInputStream(filePath);
            //book = WorkbookFactory.create(file);
            //sheet = book.getSheet("Sheet1");
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            sheet = workbook.getSheet("Sheet1");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
        By firstName = By.id("firstName");
        By lastName = By.id("lastName");
        By emailID = By.id("userEmail");
        By gender = By.xpath("//label[@class='custom-control-label' and @for='gender-radio-2']");
        By mobile = By.id("userNumber");
        By hobbies = By.xpath("//label[@class='custom-control-label' and @for='hobbies-checkbox-1']");
        By submitbutton = By.id("submit");
        WebElement submitBtn = driver.findElement(submitbutton);
        for (int i = 1; i <= rowCount; i++) {
            driver.findElement(firstName).sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
            driver.findElement(lastName).sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
            driver.findElement(emailID).sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
            driver.findElement(gender).sendKeys(sheet.getRow(i).getCell(3).getStringCellValue());
            driver.findElement(mobile).sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
            driver.findElement(hobbies).sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
        }
        Actions act = new Actions(driver);
        act.click(submitBtn).build().perform();
    }
}