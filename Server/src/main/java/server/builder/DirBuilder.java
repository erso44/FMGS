package server.builder;

import server.model.Dir;

import java.util.List;

public class DirBuilder {

  private final Dir direction;

  public DirBuilder() {
    direction = new Dir();
  }

  public DirBuilder setPage(String page) {
    this.direction.setPage(page);
    return this;
  }

  public DirBuilder setWaypoints(List<String> waypoints) {
    this.direction.setWaypoints(waypoints);
    return this;
  }

  public DirBuilder setDat(List<String> dats) {
    this.direction.setDat(dats);
    return this;
  }

  public Dir build() {
    return direction;
  }

}
