describe('Promise SmartBear',()=> { 
	it('should navigate to SmartBear Site', () => { 
		browser.waitForAngularEnabled(false);
		browser.get('http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx');
		browser.getCurrentUrl().then((url) => {
            expect(url).toBe('http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx');})
	}); 
	it('should accept username and password and should login', () => {
		browser.waitForAngularEnabled(false);
		browser.get('http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx');
		element(by.id("ctl00_MainContent_username")).sendKeys("Tester");
		element(By.name("ctl00$MainContent$password")).sendKeys("test");
	    element(By.className("button")).click();
		browser.getCurrentUrl().then((url) => {
            expect(url).toBe('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx');})
		
	 });
	 it('clicks view all orders', () => {
		browser.waitForAngularEnabled(false);
		browser.get('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx');
		element (by.linkText ('View all orders')).click();
		browser.getCurrentUrl().then((url) => {
            expect(url).toBe('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx');})
		
	}); 

	it('clicks check  all orders', () => {
		browser.waitForAngularEnabled(false);
		browser.get('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx');
		element(By.id("ctl00_MainContent_btnCheckAll")).click(); 	
	}); 

	it('clicks uncheck  all orders', () => {
		browser.waitForAngularEnabled(false);
		browser.get('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx');
		element(By.id("ctl00_MainContent_btnUncheckAll")).click();
		
	}); 

	it('clicks  Delete orders', () => {
		browser.waitForAngularEnabled(false);
		browser.get('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx');
		element(By.id("ctl00_MainContent_orderGrid_ctl02_OrderSelector")).click();
		element(By.name("ctl00$MainContent$btnDelete")).click();	
	}); 


	it('clicks Edit orders', () => {
		browser.waitForAngularEnabled(false);
		browser.get('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx');
		element(by.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[2]/td[13]/input")).click();
		element(by.id('ctl00_MainContent_fmwOrder_ddlProduct')).click();
		element(by.xpath('/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/ol[1]/li[1]/select/option[2]')).click();
		element(by.id('ctl00_MainContent_fmwOrder_txtQuantity')).clear();
		element(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).sendKeys("3");
		element(By.className("btn_dark")).click();
		element(by.id('ctl00_MainContent_fmwOrder_UpdateButton')).click();

	}); 

	it('clicks view all product', () => {
		browser.waitForAngularEnabled(false);
		browser.get('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx');
		element(by.linkText ('View all products')).click();
		browser.getCurrentUrl().then((url) => {
            expect(url).toBe('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Products.aspx');})
		
		
	}); 

	it('clicks to Order products', () => {
		browser.waitForAngularEnabled(false);
		browser.get('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx');
		element (by.linkText ('Order')).click();
		browser.getCurrentUrl().then((url) => {
            expect(url).toBe('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Process.aspx');})

		element(by.id('ctl00_MainContent_fmwOrder_ddlProduct')).click();
		element(by.xpath('/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/ol[1]/li[1]/select/option[3]')).click();
	   
	    element(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("10");
        element(By.id("ctl00_MainContent_fmwOrder_txtUnitPrice")).sendKeys("80");
		element(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/ol[1]/li[5]/input[2]")).click();
		element(By.name("ctl00$MainContent$fmwOrder$txtName")).sendKeys("Devika");
		element(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("indira junction");
        element(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("Ernakulam");
        element(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("Kerala");
		element(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("682030");
		element(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
		element(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("67899");
	    element(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("12/23");
		element(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/div/a")).click();
		
		
	}); 


});