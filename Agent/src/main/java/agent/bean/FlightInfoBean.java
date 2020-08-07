package agent.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table
public class FlightInfoBean {

	  
	@Id  
	@Column
	private String flightNumber;
	@Column
	private String aName;
	@Column
	private String duration;
	@Column
	private String arrivalTime;
	@Column
	private String deprtTime;
	@Column
	private Integer noStops;
	@Column
	private Double price;
	@Column
	private String source;
	@Column
	private String destination;
	@Column
	private String travelDate;
	@Column
	private String returnDate;
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDeprtTime() {
		return deprtTime;
	}
	public void setDeprtTime(String deprtTime) {
		this.deprtTime = deprtTime;
	}
	public Integer getNoStops() {
		return noStops;
	}
	public void setNoStops(Integer noStops) {
		this.noStops = noStops;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	@Override
	public String toString() {
		return "FlightInfoBean [flightNumber=" + flightNumber + ", aName=" + aName + ", duration=" + duration
				+ ", arrivalTime=" + arrivalTime + ", deprtTime=" + deprtTime + ", noStops=" + noStops + ", price="
				+ price + ", source=" + source + ", destination=" + destination + ", travelDate=" + travelDate
				+ ", returnDate=" + returnDate + "]";
	}
	public FlightInfoBean(String flightNumber, String aName, String duration, String arrivalTime, String deprtTime,
			Integer noStops, Double price, String source, String destination, String travelDate, String returnDate) {
		super();
		this.flightNumber = flightNumber;
		this.aName = aName;
		this.duration = duration;
		this.arrivalTime = arrivalTime;
		this.deprtTime = deprtTime;
		this.noStops = noStops;
		this.price = price;
		this.source = source;
		this.destination = destination;
		this.travelDate = travelDate;
		this.returnDate = returnDate;
	}
	
	public FlightInfoBean() {
		
	}
	
	
}
