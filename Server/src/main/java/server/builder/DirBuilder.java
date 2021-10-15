package server.builder;

import server.model.Display;

import java.util.List;

public class DirBuilder {

  private final Display direction;

  public DirBuilder() {
    direction = new Display();
  }

  public DirBuilder setPage(String page) {
    this.direction.setPage(page);
    return this;
  }

  public DirBuilder setWaypoints(List<String> waypoints) {
    this.direction.setMenuEntriesLeft(waypoints);
    return this;
  }

  public DirBuilder setDat(List<String> dats) {
    this.direction.setMenuEntriesRight(dats);
    return this;
  }

  public Display build() {
    return direction;
  }

}
