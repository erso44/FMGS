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

  public Display assembleDefaultPageB() {
    return new PageBuilder()
      .setMenuEntriesLeft(
        List.of(
          List.of("", "[][][][][][]"),
          List.of("", "____ ______"),
          List.of("", "[][][][][][]"),
          List.of("", "____ __"),
          List.of("", "___"),
          List.of("", "_____ /___°")))
      .setMenuEntriesRight(
        List.of(
          List.of("", "[][][]/[][][]"),
          List.of("", "REQUEST*"),
          List.of("", ""),
          List.of("", "_____ __"),
          List.of(">", ""),
          List.of("", "")))
      .setPage("INIT B")
      .build();
  }
}
