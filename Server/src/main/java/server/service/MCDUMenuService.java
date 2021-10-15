package server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.assembler.MCDUMenuAssembler;
import server.model.Display;

@Service
public class MCDUMenuService {

  @Autowired
  private MCDUMenuAssembler mcduMenuAssembler;

  public Display loadMCDUMenu() {
    return mcduMenuAssembler.assembleDefault();
  }
}
