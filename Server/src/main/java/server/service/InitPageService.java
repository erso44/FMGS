package server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.assembler.InitPageAssembler;
import server.model.Display;

@Service
public class InitPageService {

  @Autowired
  private InitPageAssembler initPageAssembler;

  public Display loadInitAPage() {
    return initPageAssembler.assembleDefaultPageA();
  }
}
