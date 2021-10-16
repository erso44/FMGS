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

    if (store.getPage().equals("INIT A") || store.getPage().equals("INIT B")) {

      if (store.getElement().equals("CO RTE")) {
        initPageEntity.setCO_RTE(store.getElement());
      } else if (store.getElement().equals("ALTN_CO_RTE")) {
        initPageEntity.setALTN_CO_RTE(store.getElement());
      } else if (store.getElement().equals("FLT NBR")) {
        initPageEntity.setFLT_NBR(store.getElement());
      } else if (store.getElement().equals("LAT")) {
        initPageEntity.setLAT(store.getElement());
      } else if (store.getElement().equals("COST INDEX")) {
        initPageEntity.setCOST_INDEX(store.getElement());
      } else if (store.getElement().equals("CRZ FL TEMP")) {
        initPageEntity.setCRZ_FL_TEMP(store.getElement());
      } else if (store.getElement().equals("FROM TO")) {
        initPageEntity.setFROM_TO(store.getElement());
      } else if (store.getElement().equals("LONG")) {
        initPageEntity.setLONGITUDE(store.getElement());
      }

      initRepository.save(initPageEntity);
    }

    return store;
  }
}
