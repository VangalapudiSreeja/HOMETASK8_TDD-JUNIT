package tddjunit;

import static org.junit.Assert.*;


import org.junit.Test;

public class RemoveAFirstTwoCharacters {
	/*TODO List 
	 * 1. "" => ""
	 * 2. "A" => ""
	 * 3. "B" => "B"
	 * 4. "AA" => ""
	 * 5. "AB" => "B"
	 * 6. "BA" => "B"
	 * 7. "AACD" => "CD"
	 * 8. "ABCD" => "BCD"
	 * 9. "BACD" => "BCD";
	 * 10. "BBAA" => "BBAA"
	 * 11. "BCDE" => "BCDE"
	 * 12. "AABAA" => "AABAA"
	 * 13. "BCDAB" => "BCDAB"
	 * 14. "AAAAAAA" => "AAAAA"
	 */
	
	RemovefirstA removeA = new RemovefirstA();

	@Test
	public void testfirstchar() {

		assertEquals("BCD",removeA.remove("ABCD"));
	}
	@Test
	public void testfirsttwochar() {

		assertEquals("CD",removeA.remove("AACD"));
	}
	@Test
	public void testsecondchar() {

		assertEquals("BCD",removeA.remove("BACD"));
	}
	@Test
	public void testnoAs() {
		assertEquals("BCD",removeA.remove("BCD"));
	}
	@Test
	public void testLastchar() {

		assertEquals("BCDA",removeA.remove("BCDA"));
	}
	@Test
	public void test1st2Aslast2As() {

		assertEquals("BAA",removeA.remove("AABAA"));
	}

	@Test
	public void testempty() {

		assertEquals("", removeA.remove(""));
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
