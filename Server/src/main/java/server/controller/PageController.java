package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import server.model.AircraftStatus;
import server.model.Display;
import server.model.Store;
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
  private AircraftStatusService aircraftStatusService;
  @Autowired
  private StoreService storeService;

  @GetMapping("/aircraftStatus")
  public AircraftStatus loadAircraftStatus() {
    return aircraftStatusService.loadAircraftStatus();
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

  @PostMapping("/store")
  public Store store(@RequestBody Store store) {
    return storeService.save(store);
  }
}
