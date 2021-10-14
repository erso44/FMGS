package server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.assembler.MCDUMenuAssembler;
import server.model.MCDUMenu;

@Service
public class MCDUMenuService {

  @Autowired
  private MCDUMenuAssembler mcduMenuAssembler;

  public MCDUMenu loadMCDUMenu() {
    return mcduMenuAssembler.assembleDefault();
  }
}
