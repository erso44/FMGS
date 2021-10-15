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
          List.of("ALTN/CO RTE", "---- ------"),
          List.of("FLT NBR", "[][][][][][]"),
          List.of("LAT", "---- --"),
          List.of("COST INDEX", "---"),
          List.of("CRZ FL/TEMP", "---- /---°")))
      .setMenuEntriesRight(
        List.of(
          List.of("FROM/TO", "[][][]/[][][]"),
          List.of("INIT", "REQUEST*"),
          List.of("", ""),
          List.of("LONG", "----- --"),
          List.of("WIND>", ""),
          List.of("NEXT PAGE", "")))
      .setPage("INIT A")
      .build();
  }

  public Display assembleDefaultPageB() {
    return new PageBuilder()
      .setMenuEntriesLeft(
        List.of(
          List.of("TAXI", "--.-"),
          List.of("TRIP/TIME", "--.-/----"),
          List.of("RTE RSV/%", "--.-/-.-"),
          List.of("ALTN/TIME", "--./----"),
          List.of("FINAL/TIME", "--.-/----"),
          List.of("EXTRA/TIME", "--.-/----")))
      .setMenuEntriesRight(
        List.of(
          List.of("ZFWCG/ ZFW", "[][][]/[][].[]"),
          List.of("", ""),
          List.of("", ""),
          List.of("TOW", "---.-"),
          List.of("LW", "---.-"),
          List.of("PREVIOUS PAGE", "")))
      .setPage("INIT B")
      .build();
  }
}
