package agent;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import agent.bean.FlightInfoBean;
import agent.controller.Controller;

@SpringBootTest
public class ControllerTest {

	
	@Test
	public void testFlightSearch() {
		Controller controller= mock (Controller.class);
		ArrayList<FlightInfoBean> beans = new ArrayList<FlightInfoBean>();
		beans.add(new FlightInfoBean("EM893", "Emirates", "2.45 Hrs", "12.45 Pm", "10.00 Am", 0, 9700d, "Coimbatore", "Dubai", "", ""));
		
		when(controller.checkFlights("Coimbatore", "USA", "10-08-2020", "")).thenReturn(beans);
		
		assertEquals(controller.checkFlights("Coimbatore", "USA", "10-08-2020", ""), beans);

	}
}
