import org.junit.Test;
import static org.junit.Assert.*;

public class StringWeaverTest {
	StringWeaver sw = new StringWeaver();
	@Test
	public void greatertest() {
		String output = sw.getWeavedString("aaa", "bb");
		assertEquals("bbaaabb", output);
	}

	@Test
	public void smallertest() {
		String output = sw.getWeavedString("aa", "bbb");
		assertEquals("aabbbaa", output);
	}

	@Test
	public void equaltest() {
		String output = sw.getWeavedString("aaa", "bbb");
		assertEquals("ababab", output);
	}
	@Test
	public void nulltest() {
		String output = sw.getWeavedString("", "bb");
		assertEquals("-1", output);
		
	}
}
