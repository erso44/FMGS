package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import server.model.Dir;
import server.model.Performance;
import server.service.DirService;
import server.service.PerformanceService;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class PageController {

  @Autowired
  private DirService dirService;
  @Autowired
  private PerformanceService performanceService;

  @GetMapping( "/dir")
  public Dir loadDir() {
    return dirService.loadDir();
  }

  @GetMapping("/perf")
  public Performance loadPerf() { return performanceService.loadPerformance(); }
}
