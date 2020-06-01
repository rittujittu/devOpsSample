package devOpsSample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSample {
	@Test
	public void test() {
		TestBean bean = new TestBean();
		bean.setName("Jittu");
		Assert.assertTrue(bean.getName() == "Jittu");
	}
}
