package server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.assembler.PerformanceAssembler;
import server.model.Performance;

@Service
public class PerformanceService {

  @Autowired
  private PerformanceAssembler performanceAssembler;

  public Performance loadPerformance() {
    // depends on performance page side
    return performanceAssembler.assembleTakeOff();
  }
}
