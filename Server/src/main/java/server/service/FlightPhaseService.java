package server.service;

import org.springframework.stereotype.Service;
import server.model.Display;

@Service
public class FlightPhaseService {
  public Display loadFlightPhase() {
    // return current flight phase
    // this is just an example
    Display d = new Display();
    d.setInformation("PRE_FLIGHT");
    return d;
  }
}
