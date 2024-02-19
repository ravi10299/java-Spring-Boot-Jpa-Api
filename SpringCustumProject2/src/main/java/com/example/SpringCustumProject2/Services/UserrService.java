package com.example.SpringCustumProject2.Services;

import com.example.SpringCustumProject2.Entity.Userr;
import com.example.SpringCustumProject2.Repository.UserrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserrService {
    @Autowired
    UserrRepository userrRepository;
    @Autowired
    PasswordEncoder passwordEncoder;


    public Userr adduser(Userr userr) {
//        return userrRepository.save(userr);
        Userr u = new Userr();
        u.setUserName(userr.getUserName());
        u.setPassword(passwordEncoder.encode(userr.getPassword()));
        return userrRepository.save(u);
    }

    public List<Userr> ShowData() {
        return userrRepository.findAll();
    }

    //this method is used to the matching the password and user_name is the database then match to the data then inter the next page...

//    public boolean authenticate(String name,String password){
//        Userr userr =userrRepository.findbyname(name,password);
//        return userr !=null && passwordEncoder.matches(password,userr.getPassword());
//    }
}
