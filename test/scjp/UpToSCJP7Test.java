package scjp;

import java.io.IOException;

import org.junit.Test;

public class UpToSCJP7Test {

	UpToSCJP7 scjp7 = new UpToSCJP7();
	
	@Test
	public void test() throws IOException, InterruptedException {
		scjp7.registerFileWather();
	}
}
