package vtiger.Testclass;


import org.testng.annotations.Test;

import junit.framework.Assert;
import pClass.HomePage;
import pClass.LeadInformationPage;
import pClass.LeadsPage;
import vtiger.Utils.BaseClass;

public class LeadTestPage extends BaseClass{
	@Test
	public void leadTestPage(){
	//String expected=eUtil.getExcelData(, rownum, cellnum);
	HomePage hp=new HomePage(driver);
    hp.Leads();
    LeadsPage lp=new LeadsPage(driver);
    lp.createLead("jere", "lkkh", "jggk", "jhgkj", "fjgk");
    LeadInformationPage lpinfo=new LeadInformationPage(driver);
    lpinfo.LeadInfo();
    String actualresult =  lpinfo.LeadInfoo();
    System.out.println(actualresult);
   // Assert.assertEquals(expected,actualresult );
			
	}
	

}
