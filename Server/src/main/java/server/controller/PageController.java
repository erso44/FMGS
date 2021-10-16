package server.controller;

import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import server.model.AircraftStatus;
import server.model.Display;
import server.model.Store;
import server.service.*;
import server.service.pages.DirectService;
import server.service.pages.InitPageService;
import server.service.pages.MCDUMenuService;
import server.service.pages.PerformanceService;

@RestController
@RequestMapping(value = "/api/page")
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
  public Display loadInitAPage(@RequestParam @NotNull String uuid) {
    return initPageService.loadInitAPage(uuid);
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
