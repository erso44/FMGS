package server.builder;

import server.entity.StoreEntity;

public class StoreEntityBuilder {

  private final StoreEntity storeEntity;

  public StoreEntityBuilder() {
    this.storeEntity = new StoreEntity();
  }

  public StoreEntityBuilder setPage(String page) {
    this.storeEntity.setPage(page);
    return this;
  }

  public StoreEntityBuilder setElement(String element) {
    this.storeEntity.setElement(element);
    return this;
  }

  public StoreEntityBuilder setValue(String value) {
    this.storeEntity.setValue(value);
    return this;
  }

  public StoreEntity build() {
    return storeEntity;
  }
}
