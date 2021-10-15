package server.builder;

import server.model.Display;

public class PerformanceBuilder {

  private final Display performance;

  public PerformanceBuilder() {
    performance = new Display();
  }

  public PerformanceBuilder setPage(String page) {
    this.performance.setPage(page);
    return this;
  }

  public PerformanceBuilder setPrevPhase(String phase) {
    this.performance.setPrevPhase(phase);
    return this;
  }

  public PerformanceBuilder setNextPhase(String phase) {
    this.performance.setNextPhase(phase);
    return this;
  }

  public Display build() {
    return performance;
  }
}
