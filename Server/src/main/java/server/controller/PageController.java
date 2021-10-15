package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.model.Display;
import server.service.*;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class PageController {

  @Autowired
  private DirectService directService;
  @Autowired
  private PerformanceService performanceService;
  @Autowired
  private MCDUMenuService mcduMenuService;
  @Autowired
  private InitPageService initPageService;
  @Autowired
  private FlightPhaseService flightPhaseService;

  @GetMapping("/flightPhase")
  public Display loadFlightPhase() {
    return flightPhaseService.loadFlightPhase();
  }

  @GetMapping("/dir")
  public Display loadDirectionPage() {
    return directService.loadDir();
  }

  @GetMapping("/perf")
  public Display loadPerformancePage() {
    return performanceService.loadPerformance();
  }

  @GetMapping("/mcdumenu")
  public Display loadMCDUMenuPage() {
    return mcduMenuService.loadMCDUMenu();
  }

  @GetMapping("/initapage")
  public Display loadInitAPage() {
    return initPageService.loadInitAPage();
  }

  @GetMapping("/initbpage")
  public Display loadInitBPage() {
    return initPageService.loadInitBPage();
  }
}
