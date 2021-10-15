package server.builder;


import server.model.AircraftStatus;

public class StatusBuilder {

  private final AircraftStatus status;

  public StatusBuilder() {
    this.status = new AircraftStatus();
  }

  public StatusBuilder setFlightPhase(String phase) {
    this.status.setFlightPhase(phase);
    return this;
  }

  public StatusBuilder setEngines(boolean running) {
    this.status.setEngines(running);
    return this;
  }

  public AircraftStatus build() {
    return status;
  }
}
