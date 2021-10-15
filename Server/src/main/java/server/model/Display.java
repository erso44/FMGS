package server.model;

import lombok.Data;

import java.util.List;

@Data
public class Display {

  private String page;
  private List<String> menuEntriesLeft;
  private List<String> menuEntriesRight;
  private String information;
  private String prevPhase;
  private String nextPhase;

}
