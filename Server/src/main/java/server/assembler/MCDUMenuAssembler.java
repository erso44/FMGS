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
      .setMenuEntriesLeft(List.of("<FMGC", "<DATA LINK", "<AIDS", "<CFDS [REQ]"))
      .setMenuEntryRight(List.of("RETURN>"))
      .setInformation("SELECT DESIRED SYSTEM.")
      .build();
  }
}
