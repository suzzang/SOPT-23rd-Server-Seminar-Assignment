package org.sopt.report2.api;

import lombok.extern.slf4j.Slf4j;
import org.sopt.report2.model.User;
import org.springframework.web.bind.annotation.*;
import sun.rmi.runtime.Log;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
public class UserController {
    private final static List<User> userList = new LinkedList<>();
    User user1 = new User(1610408, "최수정", "서버");
    User user2 = new User(1510408, "최뚜띠", "안드로이드");
    User user3 = new User(1410408, "최수똥", "iOS");
    User user4 = new User(1310408, "최냥냥", "디자인");
    User user5 = new User(1210408, "최몽몽", "기획");
    User user6 = new User(1110408, "최몽땅", "기획");



    @GetMapping("/")
    public String getCurrentTime() {
        Calendar calendar = Calendar.getInstance();
        java.util.Date date = calendar.getTime();
        String today = (new SimpleDateFormat("yyyy.MM.dd HH시mm분").format(date));

        return today;
    }

    @GetMapping("/users")
    public List<User> getUserListandSearchByNameORPart(@RequestParam(value = "name",required = false) final Optional<String> name,
                                                       @RequestParam(value = "part",required = false) final Optional<String> part) {

        if(userList.isEmpty()){

            userList.add(user1);
            userList.add(user2);
            userList.add(user3);
            userList.add(user4);
            userList.add(user5);
            userList.add(user6);

        }

        if(name.isPresent()){
            List<User> byNameList = new LinkedList<>();
            for (User u : userList) {
                if (u.getName().equals(name.get())) { //Optional 쓸 때 객체안의 String 값을 가져오기위해 get()메소드를 쓴다
                    byNameList.add(u);
                }
            }
            return byNameList;
        }else{
            if(part.isPresent()){
                List<User> byPartList = new LinkedList<>();
                for(User u : userList){
                    if (u.getPart().equals(part.get())){
                        byPartList.add(u);
                    }
                }
                return byPartList;
            }else{
                List<User> resultList = new LinkedList<>();
                resultList = userList;
                return resultList;
            }

        }

    }


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
