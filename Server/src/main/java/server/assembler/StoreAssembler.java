package server.assembler;

import org.springframework.stereotype.Component;
import server.builder.StoreEntityBuilder;
import server.entity.StoreEntity;
import server.model.Store;

@Component
public class StoreAssembler {

  public StoreEntity transform(Store store) {
    return new StoreEntityBuilder()
      .setPage(store.getPage())
      .setElement(store.getElement())
      .setValue(store.getValue())
      .build();
  }
}
