package server.builder;

import server.model.MCDUMenu;

import java.util.List;

public class MCDUMenuBuilder {

  private final MCDUMenu mcduMenu;

  public MCDUMenuBuilder() {
    mcduMenu = new MCDUMenu();
  }

  public MCDUMenuBuilder setPage(String page) {
    mcduMenu.setPage(page);
    return this;
  }

  public MCDUMenuBuilder setMenuEntriesLeft(List<String> entries) {
    mcduMenu.setMenuEntriesLeft(entries);
    return this;
  }

  public MCDUMenuBuilder setMenuEntryRight(String entry) {
    mcduMenu.setMenuEntryRight(entry);
    return this;
  }

  public MCDUMenuBuilder setInformation(String information) {
    mcduMenu.setInformation(information);
    return this;
  }

  public MCDUMenu build() {
    return mcduMenu;
  }
}
