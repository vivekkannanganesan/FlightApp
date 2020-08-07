package agent.service.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import agent.bean.FlightInfoBean;
import agent.repo.FlightRepo;
import agent.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService{
	
	
	@Autowired 
	private FlightRepo flightRepo;

	public ArrayList<FlightInfoBean> checkFlights(String source, String destination, String travelDate,
			String returnDate) {
		// TODO Auto-generated method stub
		ArrayList<FlightInfoBean> flightInfoBeans = new ArrayList<FlightInfoBean>();  
		flightRepo.findAll().forEach(flightInfoBean-> flightInfoBeans.add(flightInfoBean));  
		
		ArrayList<FlightInfoBean> finalList = new ArrayList<FlightInfoBean>();
		for(FlightInfoBean flightInfoBean : flightInfoBeans) {
			
			if(flightInfoBean.getSource().toLowerCase().contains(source.toLowerCase()) &&  flightInfoBean.getDestination().toLowerCase().contains(destination.toLowerCase())) {
				flightInfoBean.setTravelDate(travelDate);
				flightInfoBean.setReturnDate(returnDate);
				finalList.add(flightInfoBean);
			}
		}
		
		return finalList;
	}

	public void saveOrUpdate(FlightInfoBean flightInfoBean) {
		// TODO Auto-generated method stub
		System.out.println("Saved");
		flightRepo.save(new FlightInfoBean("Al123", "AirIndia", "2.45 Hrs", "12.45 Pm", "10.00 Am", 0, 1700d, "Coimbatore", "Chennai", "", ""));
		flightRepo.save(new FlightInfoBean("LF232", "Lufthansa", "3 Hrs", "9.00 Pm", "12.00 Am", 0, 2000d, "Coimbatore", "Chennai", "", ""));
		flightRepo.save(new FlightInfoBean("SP789", "Spicejet", "4.00 Hrs", "01.00 Pm", "05.00 Am", 0, 1350d, "Coimbatore", "Chennai", "", ""));
		flightRepo.save(new FlightInfoBean("Al876", "AirIndia", "2.45 Hrs", "12.45 Pm", "10.00 Am", 0, 1800d, "Chennai", "Bangalore", "", ""));
		flightRepo.save(new FlightInfoBean("EM123", "Emirates", "2.45 Hrs", "12.45 Pm", "10.00 Am", 0, 2700d, "Chennai", "Dubai", "", ""));
		flightRepo.save(new FlightInfoBean("AM123", "AirMalaysia", "2.45 Hrs", "12.45 Pm", "10.00 Am", 0, 17000d, "Chennai", "Malasiya", "", ""));
		flightRepo.save(new FlightInfoBean("Al173", "AirIndia", "2.45 Hrs", "12.45 Pm", "10.00 Am", 0, 3700d, "Chennai", "Delhi", "", ""));
		flightRepo.save(new FlightInfoBean("EM178", "Emirates", "2.45 Hrs", "12.45 Pm", "10.00 Am", 0, 5700d, "Chennai", "Quatar", "", ""));
		flightRepo.save(new FlightInfoBean("EM893", "Emirates", "2.45 Hrs", "12.45 Pm", "10.00 Am", 0, 9700d, "Coimbatore", "Dubai", "", ""));
		flightRepo.save(new FlightInfoBean("EM893", "Emirates", "2.45 Hrs", "12.45 Pm", "10.00 Am", 0, 9700d, "Coimbatore", "Bangalore", "", ""));
		
		
		flightRepo.save(flightInfoBean);
	}

	public ArrayList<FlightInfoBean> getAllFlights() {
		// TODO Auto-generated method stub
		saveOrUpdate(new FlightInfoBean("Al123", "AirIndia", "2.45 Hrs", "12.45 Pm", "10.00 Am", 0, 1700d, "Coimbatore", "Chennai", "", ""));
		ArrayList<FlightInfoBean> flightInfoBeans = new ArrayList<FlightInfoBean>();  
		flightRepo.findAll().forEach(flightInfoBean-> flightInfoBeans.add(flightInfoBean));  
		return flightInfoBeans;
	}

}
