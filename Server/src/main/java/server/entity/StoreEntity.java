package server.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class StoreEntity {

  @Id
  private String uuid;

  private String page;
  private String element;
  private String value;
}
