package server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.entity.InitPageEntity;
import server.model.Store;
import server.repository.InitRepository;

import java.util.Optional;

@Service
public class StoreService {

  @Autowired
  private InitRepository initRepository;

  public Store save(Store store) {
    Optional<InitPageEntity> initPageEntityOptional = initRepository.findById(store.getUserUUID());

    InitPageEntity initPageEntity;
    if (initPageEntityOptional.isEmpty()) {
      initPageEntity = new InitPageEntity();
    } else {
      initPageEntity = initPageEntityOptional.get();
    }

    if (store.getPage().equals("INIT A")) {

      if (store.getElement().equals("FLT NBR")) {
        initPageEntity.setFLT_NBR(store.getElement());
      } else if (store.getElement().equals("")) {

      }


      initRepository.save(initPageEntity);

    } else if (store.getPage().equals("INIT B")) {

    }


    return store;
  }
}
