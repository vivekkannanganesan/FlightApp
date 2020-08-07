package agent.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import agent.bean.FlightInfoBean;
import agent.service.SearchService;

@RestController
@RequestMapping(value="/controller")
public class Controller {

	@Autowired
	private SearchService searchService;
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public void  saveOrUpdate(@RequestBody FlightInfoBean flightInfoBean) {
		searchService.saveOrUpdate(flightInfoBean);
		
	}
	
	@GetMapping(value="/check")
	public ArrayList<FlightInfoBean>  checkFlights(@RequestParam String source, @RequestParam String destination, @RequestParam String travelDate, @RequestParam(required=false) String returnDate) {
		return searchService.checkFlights(source, destination, travelDate, returnDate);
	}
	
	@GetMapping(value="/getAllFlights")
	public ArrayList<FlightInfoBean>  getAllFlights() {
		return searchService.getAllFlights();
	}
	
	
	 
	
	
	
	
}
