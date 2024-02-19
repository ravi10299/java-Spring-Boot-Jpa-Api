package com.example.SpringCustumProject2.Controller;

import com.example.SpringCustumProject2.Entity.Userr;
import com.example.SpringCustumProject2.Services.UserrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserrController {
    @Autowired
    UserrService userrService;
    @PostMapping("userr")
    public Userr AddUser(@RequestBody Userr userr){
        return userrService.adduser(userr);
    }
    @GetMapping("Show/userr")
    public List<Userr> showUserr(){
        return userrService.ShowData();
    }

}
