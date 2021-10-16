package server.builder;

import server.model.User;

public class UserBuilder {

  private final User user;

  public UserBuilder() {
    this.user = new User();
  }

  public UserBuilder setUUID(String uuid) {
    this.user.setUuid(uuid);
    return this;
  }

  public User build() {
    return user;
  }
}
