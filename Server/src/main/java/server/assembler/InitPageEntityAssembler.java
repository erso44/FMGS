package server.assembler;

import org.springframework.stereotype.Component;
import server.builder.InitPageEntityBuilder;
import server.entity.InitPageEntity;

@Component
public class InitPageEntityAssembler {

  public InitPageEntity assembleEmptyInitPage() {
    return new InitPageEntityBuilder()
      .setCO_RTE("[][][][][][]")
      .setALTN_CO_RTE("---- ------")
      .setFLT_NBR("[][][][][][]")
      .setLAT("---- --")
      .setCOST_INDEX("---")
      .setCRZ_FL_TEMP("---- /---°")
      .setFROM_TO("[][][]/[][][]")
      .setLONG("----- --")
      .build();
  }
}
