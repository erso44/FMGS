package server.assembler;

import org.springframework.stereotype.Component;
import server.builder.PerformanceBuilder;
import server.model.Performance;

@Component
public class PerformanceAssembler {

  public Performance assembleTakeOff() {
    return new PerformanceBuilder()
      .setPage("TAKE OFF")
      .setPrevPhase("PREV PHASE")
      .setNextPhase("Next PHASE")
      .build();
  }
}
