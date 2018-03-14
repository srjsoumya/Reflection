package demotestng;

import org.testng.annotations.Test;

public class DemoTest {
	@Test(priority=-2)
	public void createCustomerTest() {
		System.out.println("1:Test createCustomerTest");
		//int[]arr=new int[3];
		//arr[5]=67;
	}
	
	@Test(dependsOnMethods="createCustomerTest",priority=-3)
	public void editCustomerTest() {
		System.out.println("2:Test editCustomerTest");
	}
	
	@Test(dependsOnMethods="createCustomerTest",priority=-4)
	public void deleteCustomerTest() {
		System.out.println("3:Test deleteCustomerTest");
	}
	
	@Test(priority=-1)
	public void createProjectTest() {
		System.out.println("4:Test createProjectTest");
	}
	
	@Test(dependsOnMethods="createProjectTest",priority=-5)
	public void editProjectTest() {
		System.out.println("5:Test editProjectTest");
	}
	
	@Test(dependsOnMethods="createProjectTest",priority=-6)
	public void deleteProjectTest() {
		System.out.println("6:Test deleteProjectTest");
	}
	
	

}
