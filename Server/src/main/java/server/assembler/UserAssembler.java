package server.assembler;

import org.springframework.stereotype.Component;
import server.builder.UserBuilder;
import server.entity.UserEntity;
import server.model.User;

@Component
public class UserAssembler {

  public User transform(UserEntity userEntity) {
    return new UserBuilder()
      .setUUID(userEntity.getUuid())
      .build();
  }
}
