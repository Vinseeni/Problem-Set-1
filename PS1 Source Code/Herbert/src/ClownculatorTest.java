
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * ClownculatorTest
 * 
 * Description: A set of tests to ensure that the correct salary is calculated
 * and the minimum number of minutes for selected goalIncomes are correct
 *
 * @author Goh Chun Teck
 */
public class ClownculatorTest {

	@Test
	/**
	 * Verify the correct salary calculated in veryShortNames
	 */
	public void testVeryShortNamesTotalSalary() {
		Clownculator log = new Clownculator("veryShortNamesHerbert.txt");
		
		long salary = log.calculateSalary();
		assertEquals("veryShortNamesTotalSalary", 52, salary);
	}
	
	@Test
	/**
	 * Verify the correct salary calculated in shortNames
	 */
	public void testShortNamesTotalSalary() {
		Clownculator log = new Clownculator("shortNamesHerbert.txt");
		
		long salary = log.calculateSalary();
		assertEquals("shortNamesTotalSalary", 401, salary);
	}
	
	@Test
	/**
	 * Verify the correct salary calculated in vmanyNames
	 */
	public void testManyNamesTotalSalary() {
		Clownculator log = new Clownculator("manyNamesHerbert.txt");
		
		long salary = log.calculateSalary();
		assertEquals("manyNamesTotalSalary", 47803, salary);
}

	@Test
	public void testVeryShortNamesGoalIncome() {
		Clownculator log = new Clownculator("veryShortNamesHerbert.txt");
		
		long numMinutes = log.calculateMinimumWork(52);

		numMinutes = log.calculateMinimumWork(30);
		assertEquals("veryShortNamesGoalIncome - $30", 1, numMinutes);
		
		numMinutes = log.calculateMinimumWork(53);
		assertEquals("veryShortNamesGoalIncome - $53", -1, numMinutes);
	}
	
	@Test
	public void testShortNamesGoalIncome() {
		Clownculator log = new Clownculator("shortNamesHerbert.txt");
		
		long numMinutes = log.calculateMinimumWork(401);
		assertEquals("shortNamesGoalIncome - $401", 5, numMinutes);
		
		numMinutes = log.calculateMinimumWork(279);
		assertEquals("shortNamesGoalIncome - $279", 2, numMinutes);
		
		numMinutes = log.calculateMinimumWork(280);
		assertEquals("shortNamesGoalIncome - $280", 3, numMinutes);
		
		numMinutes = log.calculateMinimumWork(402);
		assertEquals("shortNamesGoalIncome - $402", -1, numMinutes);
	}
	
	@Test
	public void testManyNamesGoalIncome() {
		Clownculator log = new Clownculator("manyNamesHerbert.txt");
		
		long numMinutes = log.calculateMinimumWork(47803);
		assertEquals("manyNamesGoalIncome - $47803", 20, numMinutes);
		
		numMinutes = log.calculateMinimumWork(13320);
		assertEquals("manyNamesGoalIncome - $13320", 3, numMinutes);
		
		numMinutes = log.calculateMinimumWork(25567);
		assertEquals("manyNamesGoalIncome - $25567", 6, numMinutes);
		
		numMinutes = log.calculateMinimumWork(47804);
		assertEquals("manyNamesGoalIncome - $47804", -1, numMinutes);
	}
	
}
