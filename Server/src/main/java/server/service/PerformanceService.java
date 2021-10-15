package server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.assembler.PerformanceAssembler;
import server.model.Display;

@Service
public class PerformanceService {

  @Autowired
  private PerformanceAssembler performanceAssembler;

  public Display loadPerformance() {
    // depends on performance page side
    return performanceAssembler.assembleTakeOff();
  }
}
