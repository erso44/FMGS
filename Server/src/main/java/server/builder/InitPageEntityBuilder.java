package server.builder;

import server.entity.InitPageEntity;

public class InitPageEntityBuilder {

  private final InitPageEntity initPageEntity;

  public InitPageEntityBuilder() {
    this.initPageEntity = new InitPageEntity();
  }

  public InitPageEntityBuilder setCO_RTE(String co_rte) {
    this.initPageEntity.setCO_RTE(co_rte);
    return this;
  }

  public InitPageEntityBuilder setALTN_CO_RTE(String altn_co_rte) {
    this.initPageEntity.setALTN_CO_RTE(altn_co_rte);
    return this;
  }

  public InitPageEntityBuilder setFLT_NBR(String flt_nbr) {
    this.initPageEntity.setFLT_NBR(flt_nbr);
    return this;
  }

  public InitPageEntityBuilder setLAT(String lat) {
    this.initPageEntity.setLAT(lat);
    return this;
  }

  public InitPageEntityBuilder setCOST_INDEX(String cost_index) {
    this.initPageEntity.setCOST_INDEX(cost_index);
    return this;
  }

  public InitPageEntityBuilder setCRZ_FL_TEMP(String crz_fl_temp) {
    this.initPageEntity.setCRZ_FL_TEMP(crz_fl_temp);
    return this;
  }

  public InitPageEntityBuilder setFROM_TO(String from_to) {
    this.initPageEntity.setFROM_TO(from_to);
    return this;
  }

  public InitPageEntityBuilder setLONG(String longitude) {
    this.initPageEntity.setLONGITUDE(longitude);
    return this;
  }

  public InitPageEntity build() {
    return this.initPageEntity;
  }
}
