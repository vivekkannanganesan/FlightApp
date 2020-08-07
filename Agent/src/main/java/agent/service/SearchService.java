package agent.service;

import java.util.ArrayList;

import agent.bean.FlightInfoBean;

public interface SearchService {

	ArrayList<FlightInfoBean> checkFlights(String source, String destination, String travelDate, String returnDate);

	void saveOrUpdate(FlightInfoBean flightInfoBean);
	
	
	ArrayList<FlightInfoBean> getAllFlights();

}
