package JavaPracticeSessions;

import org.openqa.selenium.WebDriver;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelFileConnect {
    public static void main(String[] args) {
        WebDriver driver;
        String ChromePath = "/Users/yogeshdhekale/Downloads/chromedriver";
        System.setProperty("webdriver.chrome.driver", ChromePath);
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        String filePath = "/Users/yogeshdhekale/IdeaProjects/SeptJavaPractice/src/JavaPracticeSessions/SeleniumPractice.xlsx";
        try {
            FileInputStream file = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
    }
}
