package server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.assembler.DirAssembler;
import server.model.Dir;

@Service
public class DirService {

  @Autowired
  private DirAssembler dirAssembler;

  public Dir loadDir() {
    // check if data exists assemble
    // else default
    return dirAssembler.assembleDefault();
  }
}
