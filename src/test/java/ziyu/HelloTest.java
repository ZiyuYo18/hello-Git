package ziyu;

import org.junit.Test;

public class HelloTest {

	@Test
	public void testHello() {
		Hello hello = new Hello();
		String maven = hello.sayHello("Hello,Git");
		System.out.println(maven);
	}
}
