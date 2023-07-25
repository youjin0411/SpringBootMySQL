package com.example.database_study;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class MemberController {
    /*
    @Autowired
    MemberRepository memberRepository; //data-jpa create

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public Map<String, Object> registerMember(@RequestBody Member member) {
        member.setCreatedAt(new Date());
        memberRepository.save(member);
        Map<String, Object> result = new HashMap<>();
        result.put("result", "success");
        result.put("data", member);
        return result;
    }

    @GetMapping("/members")
    public Iterable<Member> getMembers(){
        return memberRepository.findAll();
    }

    @GetMapping("/members/{id}")
    public Member getMember(@PathVariable("id") Integer id){
        Optional<Member> member = memberRepository.findById(id);
        return member.get();
    }


    // 방학끝난 후 D delete 부터 해야 한다고 꼬옥 전달 !!!!

     */
}
