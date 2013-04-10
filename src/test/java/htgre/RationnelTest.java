package htgre;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class RationnelTest {

	@Test
	public void testAddtion() {
		Rationnal a = new Rationnal(2, 3);
		Rationnal b = new Rationnal(3, 4);

		Rationnal result = a.add(b);

		assertRationnalEquals(result, 17, 12);

	}

	@Test
	public void testNeg() {
		Rationnal a = new Rationnal(2, 3);

		Rationnal result = a.neg();

		assertRationnalEquals(result, -2, 3);
	}

	@Test
	public void testSub() {
		Rationnal a = new Rationnal(2, 3);
		Rationnal b = new Rationnal(3, 4);

		Rationnal result = a.sub(b);

		assertRationnalEquals(result, -1, 12);
	}

	@Test
	public void testToString() {
		Rationnal a = new Rationnal(2, 3);

		String result = a.toString();

		assertEquals(result, "2/3");
	}

	@Test
	public void testSimplifier() {
		Rationnal a = new Rationnal(70, 49);

		String result = a.toString();

		assertEquals(result, "10/7");
	}

	private void assertRationnalEquals(Rationnal result, int expectedNumer, int expectedDenom) {
		assertEquals(expectedNumer, result.numer);
		assertEquals(expectedDenom, result.denom);
	}
}
