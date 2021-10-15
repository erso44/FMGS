package server.assembler;

import org.springframework.stereotype.Component;
import server.builder.PageBuilder;
import server.model.Display;

import java.util.List;

@Component
public class InitPageAssembler {

  public Display assembleDefaultPageA() {
    return new PageBuilder()
      .setMenuEntriesLeft(List.of("CO RTE", "ALTN/CO RTE", "FLT NBR", "LAT", "COST INDEX", "CRT FL/TEMP"))
      .setMenuEntriesRight(List.of("FROM/TO", "INIT REQUEST*", "", "LONG", "WIND>"))
      .setPage("INIT")
      .build();
  }
}
