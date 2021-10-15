package server.builder;

import server.model.Display;

import java.util.List;

public class PageBuilder {

  private final Display page;

  public PageBuilder() {
    this.page = new Display();
  }

  public PageBuilder setMenuEntriesLeft(List<List<String>> entries) {
    this.page.setMenuEntriesLeft(entries);
    return this;
  }

  public PageBuilder setMenuEntriesRight(List<List<String>> entries) {
    this.page.setMenuEntriesRight(entries);
    return this;
  }

  public PageBuilder setPage(String page) {
    this.page.setPage(page);
    return this;
  }

  public Display build() {
    return page;
  }
}
