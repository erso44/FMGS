package server.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(schema = "fmgs", name = "fmgs_store")
@Entity
@Getter
@Setter
public class StoreEntity {

  @Id
  private String uuid;

  private String page;
  private String element;
  private String value;
}
