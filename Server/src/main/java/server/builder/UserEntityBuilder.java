package server.builder;

import lombok.Data;
import server.entity.UserEntity;

@Data
public class UserEntityBuilder {

  private final UserEntity userEntity;

  public UserEntityBuilder() {
    userEntity = new UserEntity();
  }

  public UserEntityBuilder setUUID(String uuid) {
    this.userEntity.setUuid(uuid);
    return this;
  }

  public UserEntity build() {
    return userEntity;
  }
}
