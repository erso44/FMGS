package server.builder;

import server.model.Display;

import java.util.List;

public class MCDUMenuBuilder {

  private final Display mcduMenu;

  public MCDUMenuBuilder() {
    mcduMenu = new Display();
  }

  public MCDUMenuBuilder setPage(String page) {
    mcduMenu.setPage(page);
    return this;
  }

  public MCDUMenuBuilder setMenuEntriesLeft(List<String> entries) {
    mcduMenu.setMenuEntriesLeft(entries);
    return this;
  }

  public MCDUMenuBuilder setMenuEntryRight(List<String> entries) {
    mcduMenu.setMenuEntriesRight(entries);
    return this;
  }

  public MCDUMenuBuilder setInformation(String information) {
    mcduMenu.setInformation(information);
    return this;
  }

  public Display build() {
    return mcduMenu;
  }
}
