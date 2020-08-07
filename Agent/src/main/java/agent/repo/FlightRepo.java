package agent.repo;

import org.springframework.data.repository.CrudRepository;

import agent.bean.FlightInfoBean;

public interface FlightRepo extends CrudRepository<FlightInfoBean, Integer>  {

}
