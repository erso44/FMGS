package server.assembler;

import org.springframework.stereotype.Component;
import server.builder.PerformanceBuilder;
import server.model.Display;

@Component
public class PerformanceAssembler {

  public Display assembleTakeOff() {
    return new PerformanceBuilder()
      .setPage("TAKE OFF")
      .setPrevPhase("PREV PHASE")
      .setNextPhase("Next PHASE")
      .build();
  }
}
