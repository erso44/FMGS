package server.assembler;

import org.springframework.stereotype.Component;
import server.builder.StoreEntityBuilder;
import server.entity.StoreEntity;
import server.model.Store;

import java.util.UUID;

@Component
public class StoreAssembler {

  public StoreEntity transform(Store store) {
    return new StoreEntityBuilder()
      .setUUID(createUUID())
      .setPage(store.getPage())
      .setElement(store.getElement())
      .setValue(store.getValue())
      .build();
  }

  private String createUUID() {
    return UUID.randomUUID().toString();
  }
}
