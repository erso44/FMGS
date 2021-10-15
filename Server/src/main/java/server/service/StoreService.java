package server.service;

import org.springframework.stereotype.Service;
import server.model.Store;

@Service
public class StoreService {

  public Store save(Store store) {
    // save in db
    return store;
  }
}
