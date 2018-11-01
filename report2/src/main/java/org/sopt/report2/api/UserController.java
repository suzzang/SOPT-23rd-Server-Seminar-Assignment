package org.sopt.report2.api;

import org.sopt.report2.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@RestController
public class UserController {
    private final static List<User> userList = new LinkedList<>();
    User user1 = new User(1610408,"최수정","서버");
    User user2 = new User(1510408,"최뚜띠","안드로이드");
    User user3 = new User(1410408,"최수똥","iOS");
    User user4 = new User(1310408,"최냥냥","디자인");
    User user5 = new User(1210408,"최몽몽","기획");


    @GetMapping("/")
    public String getCurrentTime(){
        return "시간";
    }

    @GetMapping("/users")
    public List<User> getUserList(){ 
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);

        if(userList.isEmpty()){
            return null;
        }else {
            return userList;
        }
    }
//    @GetMapping("/users")
//    public String searchSameName(@RequestParam(value = "name")final String name){
//        return "Dd"; //for문 돌려가면서 비교 검색
//    }
//    @GetMapping("/users")
//    public String searchSamePart(@RequestParam(value = "part")final String part){
//        return "Dd"; //for문 돌려가면서 비교 검색
//    }

//    @GetMapping("/users/{user_idx}")
//    public String searchSameId(@PathVariable(value = "user_idx")final int user_idx){
//        return "Dd";
//    }
//    @PostMapping("/users")
//    public List<User> saveUser(){
//        return userList;//새로 저장된 리스트 출력
//    }
//    @PutMapping("/users/{user_idx}")
//    public User updateUser(@PathVariable(value = "user_idx")final int user_idx){
//        return userList.get(user_idx); //해당 인덱스의 유저를 뽑아와서 수정함 그리고 나서 그 유저 객체만 리턴
//    }
//    @DeleteMapping("/users/{user_idx}")
//    public List<User> deleteUser(@PathVariable(value = "user_idx")final int user_idx){
//        return userList; //해당 유저인덱스의 유저객체 삭제하고 유저리스트 다시 리턴
//    }
}
