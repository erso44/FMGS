package server.model;

import lombok.Data;

@Data
public class AircraftStatus {

  private String flightPhase;
  private boolean engines;
}
