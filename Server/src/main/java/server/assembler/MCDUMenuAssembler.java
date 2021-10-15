package server.assembler;

import org.springframework.stereotype.Component;
import server.builder.MCDUMenuBuilder;
import server.model.Display;

import java.util.List;

@Component
public class MCDUMenuAssembler {

  public Display assembleDefault() {
    return new MCDUMenuBuilder()
      .setPage("MCDU MENU")
      .setMenuEntriesLeft(
        List.of(
          List.of("<FMGC", ""),
          List.of("<DATA LINK", ""),
          List.of("<AIDS", ""),
          List.of("<CFDS [REQ]", "")))
      .setMenuEntryRight(
        List.of(
          List.of("RETURN>", "")))
      .setInformation("SELECT DESIRED SYSTEM.")
      .build();
  }
}
