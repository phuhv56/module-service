package service.controllers;

import common.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController
{
    @Autowired
    private UserService userService;

    @PostMapping(value = "/create")
    public ResponseEntity<?> create(@RequestBody User object) {
        try {
            return success(userService.create(object));
        } catch (Exception ex) {
            return error(ex);
        }
    }

}
