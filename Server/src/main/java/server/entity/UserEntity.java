package server.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(schema = "fmgs", name = "user")
@Entity
@Getter
@Setter
public class UserEntity {

  @Id
  private String uuid;
}
