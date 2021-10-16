package server.service.pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.assembler.InitPageAssembler;
import server.entity.InitPageEntity;
import server.model.Display;
import server.repository.InitRepository;

import java.util.Optional;

@Service
public class InitPageService {

  @Autowired
  private InitPageAssembler initPageAssembler;
  @Autowired
  private InitRepository initRepository;

  public Display loadInitAPage(String uuid) {
    Optional<InitPageEntity> initPageEntityOptional = initRepository.findById(uuid);

    if (initPageEntityOptional.isEmpty()) {
      return initPageAssembler.assembleEmptyPageA();
    }

    return initPageAssembler.transformAPage(initPageEntityOptional.get());

  }

  public Display loadInitBPage() {
    return initPageAssembler.assembleDefaultPageB();
  }
}
