package server.assembler;

import org.springframework.stereotype.Component;
import server.builder.DirBuilder;
import server.model.Dir;

import java.util.List;

@Component
public class DirAssembler {

  public Dir assembleFake() {
    return new DirBuilder()
      .setPage("DIR")
      .setWaypoints(List.of("WAYPOINT1", "CXR2", "TEESY3", "WEVEL4", "ETG", "MIP", "X", "Y", "Z"))
      .setDat(List.of("1.4NM", "01 '" + " / " + "'", "DAT3"))
      .build();
  }

  public Dir assembleDefault() {
    return new DirBuilder()
      .setPage("DIR")
      .setWaypoints(List.of(dirTo()))
      .build();
  }

  private String dirTo() {
    return new StringBuilder().append("DIR TO").append("\n")
      .append("*[]").toString();
  }
}
