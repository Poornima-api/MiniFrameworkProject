package Test;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.SearchPage;

public class SearchTest extends BaseTest {
	@Test
	public void searchVerification() {
		SearchPage sp=new SearchPage(driver);
		sp.srchbtnclick("computer");
	}

}
