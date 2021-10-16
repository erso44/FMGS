package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;
import server.model.User;
import server.service.UserService;

@RestController
@RequestMapping(value = "/api/user")
@CrossOrigin(origins = "*")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping
  public User loadUser(@RequestParam @Nullable String uuid) {
    return userService.loadUser(uuid);
  }
}
