package server.assembler;

import org.springframework.stereotype.Component;
import server.builder.PageBuilder;
import server.model.Display;

import java.util.List;

@Component
public class InitPageAssembler {

  public Display assembleDefaultPageA() {
    return new PageBuilder()
      .setMenuEntriesLeft(
        List.of(
          List.of("CO RTE", "[][][][][][]"),
          List.of("ALTN/CO RTE", "____ ______"),
          List.of("FLT NBR", "[][][][][][]"),
          List.of("LAT", "____ __"),
          List.of("COST INDEX", "___"),
          List.of("CRT FL/TEMP", "_____ /___°")))
      .setMenuEntriesRight(
        List.of(
          List.of("FROM/TO", "[][][]/[][][]"),
          List.of("INIT", "REQUEST*"),
          List.of("", ""),
          List.of("LONG", "_____ __"),
          List.of("WIND>", ""),
          List.of("", "")))
      .setPage("INIT A")
      .build();
  }
}
