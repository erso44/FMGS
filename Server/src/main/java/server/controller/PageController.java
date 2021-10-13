package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import server.assembler.DirAssembler;
import server.model.Dir;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class PageController {

  @Autowired
  private DirAssembler dirAssembler;

  @GetMapping(path = "/dir")
  public Dir loadDir() {
    return dirAssembler.assemble();
  }
}
