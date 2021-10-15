package server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.assembler.InitPageAssembler;
import server.model.Display;

import static server.constants.FlightPhase.PRE_FLIGHT;

@Service
public class InitPageService {

  @Autowired
  private InitPageAssembler initPageAssembler;
  @Autowired
  private FlightPhaseService flightPhaseService;

  public Display loadInitPage() {
    if (flightPhaseService.loadFlightPhase().getInformation().equals(PRE_FLIGHT)) {
      return initPageAssembler.assembleDefaultPageA();
    }
    return initPageAssembler.assembleDefaultPageB();
  }
}
