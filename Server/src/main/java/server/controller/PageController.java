package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import server.model.Display;
import server.service.DirService;
import server.service.InitPageService;
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
  @Autowired
  private InitPageService initPageService;

  @GetMapping( "/dir")
  public Display loadDirectionPage() {
    return dirService.loadDir();
  }

  @GetMapping("/perf")
  public Display loadPerformancePage() { return performanceService.loadPerformance(); }

  @GetMapping("/mcdumenu")
  public Display loadMCDUMenuPage() {
    return mcduMenuService.loadMCDUMenu();
  }

  @GetMapping("/initapage")
  public Display loadInitApAge() {
    return initPageService.loadInitAPage();
  }
}
