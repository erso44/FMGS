package server.builder;

import server.model.Performance;

public class PerformanceBuilder {

  private final Performance performance;

  public PerformanceBuilder() {
    performance = new Performance();
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

  public Performance build() {
    return performance;
  }
}
