package server.model;

import lombok.Data;

import java.util.List;

@Data
public class MCDUMenu {

  private String page;
  private List<String> menuEntriesLeft;
  private String menuEntryRight;
  private String information;
}
