package server.builder;

import server.model.Display;

import java.util.List;

public class DirectBuilder {

  private final Display direction;

  public DirectBuilder() {
    direction = new Display();
  }

  public DirectBuilder setPage(String page) {
    this.direction.setPage(page);
    return this;
  }

  public DirectBuilder setWaypoints(List<List<String>> waypoints) {
    this.direction.setMenuEntriesLeft(waypoints);
    return this;
  }

  public DirectBuilder setDat(List<List<String>> dats) {
    this.direction.setMenuEntriesRight(dats);
    return this;
  }

  public Display build() {
    return direction;
  }

}
