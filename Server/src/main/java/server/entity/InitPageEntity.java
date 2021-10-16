package server.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(schema = "fmgs", name = "init")
@Entity
@Getter
@Setter
public class InitPageEntity {

  @Id
  private String userUUID;

  private String CO_RTE;
  private String ALTN_CO_RTE;
  private String FLT_NBR;
  private String LAT;
  private String COST_INDEX;
  private String CRZ_FL_TEMP;
  private String FROM_TO;
  private String LONGITUDE;
}
