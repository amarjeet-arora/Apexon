package annoproject;

import annoproject.TesterInfo.Priority;

@TesterInfo(
		priority = Priority.HIGH,
		createdBy = "Amarjeet",
		tags = {"sales","Finance"}
		)
public class TestApp {
	@Test
	void testDevInv() {
		if(true) {
			throw new RuntimeException("test fails");
		}
	}
	@Test(ennabled = false)
	void testProdEnv() {
		if(false) {
			throw new RuntimeException("test passes");
		}
	}
	@Test
	void testPreProd() {
	 if(10 >1) {
		 
	 }
	}

}
