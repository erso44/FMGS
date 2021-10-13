package server.model;

import lombok.Data;

import java.util.List;

@Data
public class Dir {

  private List<String> waypoints;
  private List<String> dat;
}
