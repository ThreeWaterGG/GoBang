import static org.junit.Assert.*;

import org.junit.Test;

public class JCounterTest {

	JCounter jcounter = new JCounter();

	@Test
	public void test() {
		System.out.println("This is test for JCounterTest");
		assertEquals(0, jcounter.getCounterNum());
	}

}
