package server.model;

import lombok.Data;

@Data
public class Performance {

  private String page;
  private String prevPhase;
  private String nextPhase;
}
