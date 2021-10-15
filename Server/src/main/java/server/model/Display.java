package server.model;

import lombok.Data;

import java.util.List;

@Data
public class Display {

  private String page;
  private List<List<String>> menuEntriesLeft;
  private List<List<String>> menuEntriesRight;
  private String information;
  private String prevPhase;
  private String nextPhase;

}
