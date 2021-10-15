package server.service;

import org.springframework.stereotype.Service;

@Service
public class FlightPhaseService {
  public String loadFlightPhase() {
    // return current flight phase
    // this is just an example
    return "PRE_FLIGHT";
  }
}
