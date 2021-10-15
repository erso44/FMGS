package server.service;

import org.springframework.stereotype.Service;
import server.builder.StatusBuilder;
import server.model.AircraftStatus;

@Service
public class AircraftStatusService {
  public AircraftStatus loadAircraftStatus() {
    // return current flight phase
    // this is just an example
    return new StatusBuilder()
      .setFlightPhase("PRE_FLIGHT")
      .setEngines(false)
      .build();
  }
}
