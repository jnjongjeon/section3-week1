package com.codestates.member;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/v1/members")
public class MemberController {
    @PostMapping
    public ResponseEntity postMember(@RequestParam("email") String email,
                             @RequestParam("name") String name,
                             @RequestParam("phone") String phone) {
        Map<String,String> map = new HashMap<>();
        map.put("email", email);
        map.put("name", name);
        map.put("phone", phone);
        return new ResponseEntity<>(map, HttpStatus.CREATED);
    }

    @GetMapping("/{member-id}")
    public ResponseEntity getMember(@PathVariable("member-id")long memberId) {
        System.out.println("# memberId: " + "aa");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getMembers() {
        System.out.println("# get Member");
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
