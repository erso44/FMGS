package server.assembler;

import org.springframework.stereotype.Component;
import server.builder.DirectBuilder;
import server.model.Display;

import java.util.List;

@Component
public class DirectAssembler {

  public Display assembleFake() {
    return new DirectBuilder()
      .setPage("DIR")
      .setWaypoints(List.of(
        List.of("WAYPOINT1", ""),
        List.of("CXR2", ""),
        List.of("TEESY3", ""),
        List.of("WEVEL4", ""),
        List.of("ETG", ""),
        List.of("MIP", ""),
        List.of("X", ""),
        List.of("Y", ""),
        List.of("Z", "")))
      .setDat(List.of(
        List.of("1.4NM", ""),
        List.of("01 '" + " / " + "'", ""),
        List.of("DAT3", "")))
      .build();
  }

  public Display assembleDefault() {
    return new DirectBuilder()
      .setPage("DIR")
      .setWaypoints(List.of(List.of(dirTo())))
      .build();
  }

  private String dirTo() {
    return new StringBuilder().append("DIR TO").append("\n")
      .append("*[]").toString();
  }
}
