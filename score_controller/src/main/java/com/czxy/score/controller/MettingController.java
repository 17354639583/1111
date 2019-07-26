package com.czxy.score.controller;

import com.czxy.score.domain.Metting;
import com.czxy.score.domain.User;
import com.czxy.score.service.MettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author super璐
 * @version v 1.0
 * @date 2019/7/25
 */
@RestController
@RequestMapping("/metting")
public class MettingController {
    @Autowired
    private MettingService mettingService;

    @GetMapping("/findall")
    public ResponseEntity<List<Metting>> find() {
        try {
            List<Metting> all = mettingService.find();
            return new ResponseEntity<>(all, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<Void> addNews(Metting metting) {
        System.out.println(metting);
        try {
            mettingService.insert(metting);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
