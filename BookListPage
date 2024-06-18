package Books.Book_Download_List;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BookListPage {
 
	static void BooksDownloadListByAuthor(String authorName) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\npan2\\Documents\\chromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fte.mohan43u.space/");
		Thread.sleep(10000);
		List<WebElement> authorNames=driver.findElements(By.xpath("//td[text()='"+authorName+"']"));
		int numberOfAuthos = authorNames.size();
		System.out.println("The author Name is "+ authorName);
		System.out.println("There are "+ numberOfAuthos + " records found for " + authorName );
		System.out.println("---------------------------------------------------------------------------------------");
		if(numberOfAuthos>0) {
			for(int i=0; i<numberOfAuthos;i++) {
			
			//	System.out.println(author);
				List<WebElement> BookNames = driver.findElements(By.xpath("//td[text()='"+authorName+"']/following-sibling::td[1]"));
				List<WebElement> BookNumber = driver.findElements(By.xpath("//td[text()='"+authorName+"']/preceding-sibling::td[1]"));
				List<WebElement> TotalDownloadedTimes = driver.findElements(By.xpath("//td[text()='"+authorName+"']/following-sibling::td[2]"));
				List<WebElement> EpubDownloadedTimes = driver.findElements(By.xpath("//td[text()='"+authorName+"']/following-sibling::td[3]/a"));
				List<WebElement> MobiDownloadedTimes = driver.findElements(By.xpath("//td[text()='"+authorName+"']/following-sibling::td[4]/a"));
				List<WebElement> AfourPDFownloadedTimes = driver.findElements(By.xpath("//td[text()='"+authorName+"']/following-sibling::td[5]/a"));
				List<WebElement> SixInchPDFDownloadedTimes = driver.findElements(By.xpath("//td[text()='"+authorName+"']/following-sibling::td[6]/a"));
				String bookNames = BookNames.get(i).getText();
				String bookNumber = BookNumber.get(i).getText();
				String totalDownloadedTimes = TotalDownloadedTimes.get(i).getText();
				String epubDownloadedTimes = EpubDownloadedTimes.get(i).getText();
				String mobiDownloadedTimes = MobiDownloadedTimes.get(i).getText();
				String afourPDFownloadedTimes = AfourPDFownloadedTimes.get(i).getText();
				String sixInchPDFDownloadedTimes = SixInchPDFDownloadedTimes.get(i).getText();
				String author =	authorNames.get(i).getText();
				
				System.out.println("Author Name: " + authorName);
				System.out.println("Book Number: " + bookNumber);
				System.out.println("Book Name: " + bookNames);
				System.out.println("Total downloaded times : " + totalDownloadedTimes);
				System.out.println("Epub downloaded times: " + epubDownloadedTimes);
				System.out.println("Mobi downloaded times: " + mobiDownloadedTimes);
				System.out.println("Afour pdf downloaded times: " + afourPDFownloadedTimes);
				System.out.println("Six inch PDF downloaded times: " + sixInchPDFDownloadedTimes);
				System.out.println("---------------------------------------------------------------------------------------");
				
				List<WebElement> authorNextPageNumber =driver.findElements(By.xpath("(//td[text()='"+author+"'])["+i+"+1]/preceding-sibling::td[1]/../following-sibling::tr/td[1]"));
				List<WebElement> authorNextName = driver.findElements(By.xpath("(//td[text()='"+author+"'])["+i+"+1]/preceding-sibling::td[1]/../following-sibling::tr/td[1]/following-sibling::td[1]"));
				int authorNextBookNumbers = authorNextPageNumber.size();
				for(int j =0 ; i<authorNextBookNumbers; j++) {
					String AuthorNextPageNumber = authorNextPageNumber.get(j).getText();
					String AuthorNextName = authorNextName.get(j).getText();
					int bookNumberCount = Integer.parseInt(bookNumber)-Integer.parseInt(AuthorNextPageNumber);
					String authorNameForNoName =driver.findElement(By.xpath("//td[text()='"+AuthorNextPageNumber+"']/following-sibling::td[1]")).getText();
					String bookNamesForNoName =driver.findElement(By.xpath("//td[text()='"+AuthorNextPageNumber+"']/following-sibling::td[2]")).getText();
					String totalDownloadedTimesNoName =driver.findElement(By.xpath("//td[text()='"+AuthorNextPageNumber+"']/following-sibling::td[3]")).getText();
					String epubDownloadedTimesNoName =driver.findElement(By.xpath("//td[text()='"+AuthorNextPageNumber+"']/following-sibling::td[4]")).getText();
					String mobiDownloadedTimesNoName =driver.findElement(By.xpath("//td[text()='"+AuthorNextPageNumber+"']/following-sibling::td[5]")).getText();
					String afourPDFownloadedTimesNoName =driver.findElement(By.xpath("//td[text()='"+AuthorNextPageNumber+"']/following-sibling::td[6]")).getText();
					String sixInchPDFDownloadedTimesNoName =driver.findElement(By.xpath("//td[text()='"+AuthorNextPageNumber+"']/following-sibling::td[7]")).getText();

					if(bookNumberCount==j+1&&AuthorNextName.toString().equals("")) {
						System.out.println("Book Number: " + AuthorNextPageNumber);
						System.out.println("Author Name: " + authorNameForNoName);
						System.out.println("Book Name: " + bookNamesForNoName);
						System.out.println("Total downloaded times : " + totalDownloadedTimesNoName);
						System.out.println("Epub downloaded times: " + epubDownloadedTimesNoName);
						System.out.println("Mobi downloaded times: " + mobiDownloadedTimesNoName);
						System.out.println("Afour pdf downloaded times: " + afourPDFownloadedTimesNoName);
						System.out.println("Six inch PDF downloaded times: " + sixInchPDFDownloadedTimesNoName);
						System.out.println("---------------------------------------------------------------------------------------");

						
					}
					else {
						break;
					}
				}
				
				
			}
		}
		else {
			System.out.println("There is no authors found , Please check the author name");
		}
		driver.quit();
	}
}
