package server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.assembler.UserAssembler;
import server.builder.UserEntityBuilder;
import server.entity.UserEntity;
import server.model.User;
import server.repository.UserRepository;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;
  @Autowired
  private UserAssembler userAssembler;

  public User loadUser(String uuid) {
    Optional<UserEntity> userEntityOptional = userRepository.findById(uuid);

    UserEntity userEntity;
    if (userEntityOptional.isEmpty()) {
      userEntity = new UserEntityBuilder()
        .setUUID(createUUID())
        .build();
    } else {
      userEntity = userEntityOptional.get();
    }

    return userAssembler.transform(userEntity);
  }

  private String createUUID() {
    return UUID.randomUUID().toString();
  }
}