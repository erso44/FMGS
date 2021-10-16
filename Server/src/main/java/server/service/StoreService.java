package server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.assembler.StoreAssembler;
import server.entity.StoreEntity;
import server.model.Store;
import server.repository.StoreRepository;

@Service
public class StoreService {

  @Autowired
  private StoreRepository storeRepository;
  @Autowired
  private StoreAssembler storeAssembler;

  public Store save(Store store) {
    // save in db
    StoreEntity storeEntity = storeAssembler.transform(store);
    storeRepository.save(storeEntity);
    return store;
  }
}
