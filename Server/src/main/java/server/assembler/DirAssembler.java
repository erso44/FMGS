package server.assembler;

import org.springframework.stereotype.Component;
import server.builder.DirBuilder;
import server.model.Dir;

import java.util.List;

@Component
public class DirAssembler {

  public Dir assemble() {
    return new DirBuilder()
      .setWaypoints(List.of("waypoint1, waypoint2, waypoint3"))
      .setDat(List.of("dat1, dat2, dat3"))
      .build();
  }
}
