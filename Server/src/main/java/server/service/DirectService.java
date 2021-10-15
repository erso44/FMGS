package server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.assembler.DirectAssembler;
import server.model.Display;

@Service
public class DirectService {

  @Autowired
  private DirectAssembler directAssembler;

  public Display loadDir() {
    // check if data exists assemble
    // else default
    return directAssembler.assembleDefault();
  }
}
