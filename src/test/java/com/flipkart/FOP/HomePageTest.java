package com.flipkart.FOP;

	import org.testng.annotations.Test;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
	import org.testng.Assert;
	import org.testng.annotations.Test;
	

	public class HomePageTest {

		HomePageObject homePage;
		BasePage bp;

		public HomePageTest() {
			homePage = new HomePageObject();
			bp = new BasePage();
		}
//		@Test
//		public void verifyall() {
//			Assert.assertTrue(bp.elementFound(homePage.getwomen()));
//			Assert.assertTrue(bp.elementFound1(homePage.getdresses()));
//			
//			Assert.assertTrue(bp.elementFound2(homePage.gettshirt()));
//			
//			}
//	    @Test
		public void clicktabs() {
		
			bp.clickable(homePage.getwomen());
		bp.getTitlte();
			 
			bp.clickable(homePage.getdresses());
			bp.getTitlte();
			int counts= homePage.getimagecount().size();
			int base=homePage.getproductcount();
	       bp.productcounts(base, counts);
		   // bp.clickable(homePage.gettshirt());
      	  //  bp.getTitlte();
		}
	    
//	    @Test
//	    public void mailtabs()
//	    {
//	    bp.setText(homePage.mailtab(),"kalai");
//	    bp.clickable(homePage.mailbutton());
//	    bp.getTxtAttribute(homePage.mailtab());
//	    }
//	    
//	    @Test	   
//		public void sizedisplayed()
//		{
//	    	
//	    	
//    	bp.clickable(homePage.getwomen());
//	    	bp.scrolldown(homePage.getlarge());
//	     Assert.assertTrue(bp.checksize(homePage.getmedium()));
//	     
//	     
//    }
//		@Test
//	    public void mouse()
//	    {   bp.clickable(homePage.getdresses());
//	    	bp.scrolldown(homePage.getwomenscroll());
//            bp.mouseover(homePage.getclickimage());
//	    }
	}
	


