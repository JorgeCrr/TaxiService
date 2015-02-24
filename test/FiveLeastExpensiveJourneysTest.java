/**
 * 
 */
import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.taxiservice.Destination;
import com.example.taxiservice.FiveLeastExpensiveJourneys;
import com.example.taxiservice.Journey;
import com.example.taxiservice.Taxi;

/**
 * @author Jorge
 *
 */
public class FiveLeastExpensiveJourneysTest {

	/**
	 * @throws java.lang.Exception
	 */
	
	private ArrayList<Journey> journeys = new ArrayList<Journey>();
	
	@Before
	public void setUp() throws Exception {		
		DateFormat format = new SimpleDateFormat("DD/MM/YYYY", Locale.ENGLISH);
		Journey journey = new Journey(2, format.parse("12/1/2015"), (short) 3);
		journey.setCost(34.6F);
		journey.setTaxi(new Taxi("F46373", "Jorge"));
		journey.setDestination(new Destination("Jebel Ali", 23));
		journeys.add(journey);
		
		journey = new Journey(2, format.parse("12/1/2015"), (short) 3);
		journey.setCost(34.6F);
		journey.setTaxi(new Taxi("F46373", "Jorge"));
		journey.setDestination(new Destination("Jebel Ali", 23));
		journeys.add(journey);
		
		journey = new Journey(2, format.parse("12/1/2015"), (short) 3);
		journey.setCost(34.6F);
		journey.setTaxi(new Taxi("F46373", "Jorge"));
		journey.setDestination(new Destination("Jebel Ali", 23));
		journeys.add(journey);
		
		journey = new Journey(2, format.parse("12/1/2015"), (short) 3);
		journey.setCost(34.6F);
		journey.setTaxi(new Taxi("F46373", "Jorge"));
		journey.setDestination(new Destination("Jebel Ali", 23));
		journeys.add(journey);
		
		journey = new Journey(2, format.parse("12/1/2015"), (short) 3);
		journey.setCost(34.6F);
		journey.setTaxi(new Taxi("F46373", "Jorge"));
		journey.setDestination(new Destination("Jebel Ali", 23));
		journeys.add(journey);
		
		journey = new Journey(2, format.parse("12/1/2015"), (short) 3);
		journey.setCost(34.6F);
		journey.setTaxi(new Taxi("F46373", "Jorge"));
		journey.setDestination(new Destination("Jebel Ali", 23));
		journeys.add(journey);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		journeys.clear();
	}

	/**
	 * Test method for {@link com.example.taxiservice.FiveLeastExpensiveJourneys#FiveLeastExpensiveJourneys(int)}.
	 */
	@Test
	public void testFiveLeastExpensiveJourneys() {
		
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.example.taxiservice.FiveLeastExpensiveJourneys#generateReport(java.util.ArrayList)}.
	 */
	@Test
	public void testGenerateReport() {
		FiveLeastExpensiveJourneys trips = new FiveLeastExpensiveJourneys(5);
		
		fail("Not yet implemented"); // TODO
	}

}
