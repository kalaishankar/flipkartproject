package com.flipkart.FOP;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

	public class HomePageObject extends BasePage {
		
	

		@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
		private WebElement women;

		@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
		private WebElement dresses;

		@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
		private WebElement tshirt;
		
		@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/a")
		private WebElement womentab;
		
		@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/ul/li[1]/a")
		private WebElement dressestab;
		
		@FindBy(xpath = "//*[@id='center_column']/div[1]/div")
		private WebElement tshirttab;
		
		@FindBy(xpath = "//*[@id='newsletter-input']")
		private WebElement mailtab;
		
		@FindBy(xpath = "//*[@id='newsletter_block_left']/div/form/div/button")
		private WebElement mailbutton;

		@FindBy(xpath = "//*[@id='layered_id_attribute_group_2']")
		private WebElement size;
		
		@FindBy(xpath = "//*[@id='ul_layered_id_attribute_group_1']/li[2]/label/a")
		private WebElement medium;
		
		@FindBy(xpath = "//*[@id='center_column']/h1/span[2]")
		private WebElement productcount;
		
		//@FindBys(@FindBy(className="icon-eye-open"))
		@FindBys(@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div//div//div/a/img"))
		private List<WebElement> countimage;
	
		@FindBy(xpath = "//*[@id='homefeatured']/li[2]/div/div[1]/div/a[1]/img")
		private WebElement imageclick;
		
		
		@FindBy(xpath = "//*[@id='center_column']/div[3]/div[2]/form")
		private WebElement womenscroll;
		
		
		
	    public HomePageObject() {
			PageFactory.initElements(driver, this);
		}

		public WebElement getwomen() {
			return women;
	    }

       public WebElement getdresses() {
			return dresses;
		}
		
		public WebElement gettshirt() {
			return tshirt;
		}
		
		public WebElement getwomentab() {
			return womentab;
		}
		
		public WebElement getdressestab() {
			return dressestab;
		}
		
		public WebElement gettshirttab() {
			return tshirttab;
		}
	
		public WebElement mailtab() {
			return mailtab;
		}
		public WebElement mailbutton() {
			return mailbutton;
		}
		
		public WebElement getlarge() {
			return size;
		}
		public WebElement getmedium() {
			return medium;
		}
		public int getproductcount() {
			String txt=productcount.getText();
			String[] arr=txt.split("");
			String value=arr[2];
			int result=Integer.parseInt(value);
			return result;
		}
        public List<WebElement> getimagecount()
        {
			
        	return countimage;
        	
        }
	
	    public WebElement getclickimage()
	    {
	    	return imageclick;
	    }
	    public WebElement getwomenscroll()
	    {
	    	return womenscroll;
	    }
	

	}



