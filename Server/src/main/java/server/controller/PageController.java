package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import server.model.Dir;
import server.model.MCDUMenu;
import server.model.Performance;
import server.service.DirService;
import server.service.MCDUMenuService;
import server.service.PerformanceService;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class PageController {

  @Autowired
  private DirService dirService;
  @Autowired
  private PerformanceService performanceService;
  @Autowired
  private MCDUMenuService mcduMenuService;

  @GetMapping( "/dir")
  public Dir loadDirectionPage() {
    return dirService.loadDir();
  }

  @GetMapping("/perf")
  public Performance loadPerformancePage() { return performanceService.loadPerformance(); }

  @GetMapping("/mcdumenu")
  public MCDUMenu loadMCDUMenuPage() {
    return mcduMenuService.loadMCDUMenu();
  }
}
