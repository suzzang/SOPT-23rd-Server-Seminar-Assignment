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

    User empty = new User(-1,"없습니다","없습니다");



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
            int name_flag = 0;
            List<User> byNameList = new LinkedList<>();
            for (User u : userList) {
                if (u.getName().equals(name.get())) { //Optional 쓸 때 객체안의 String 값을 가져오기위해 get()메소드를 쓴다
                    byNameList.add(u);
                    name_flag++;
                }
            }
            if(name_flag==0){
                byNameList.add(empty);
            }
            return byNameList;
        }else{
            if(part.isPresent()){
                int part_flag = 0;
                List<User> byPartList = new LinkedList<>();
                for(User u : userList){
                    if (u.getPart().equals(part.get())){
                        byPartList.add(u);
                        part_flag++;
                    }
                }
                if(part_flag==0){
                    byPartList.add(empty);
                }
                return byPartList;
            }else{

                return userList;
            }

        }

    }


    @GetMapping("/users/{user_idx}")
    public List<User> searchSameId(@PathVariable(value = "user_idx")final int user_idx){
        if(userList.isEmpty()){

            userList.add(user1);
            userList.add(user2);
            userList.add(user3);
            userList.add(user4);
            userList.add(user5);
            userList.add(user6);

        }

        int idx_flag = 0;
        List<User>idx_List = new LinkedList<>();

        for(User u : userList){
            if(u.getUser_idx()==user_idx){
                idx_List.add(u);
                idx_flag++;
            }
        }
        if(idx_flag==0){
            idx_List.add(empty);
        }
        return idx_List;

    }


    @PostMapping("/users")
    public List<User> saveUser(@RequestBody final User user){
        if(userList.isEmpty()){

            userList.add(user1);
            userList.add(user2);
            userList.add(user3);
            userList.add(user4);
            userList.add(user5);
            userList.add(user6);

        }

        userList.add(user);

        return userList;//새로 저장된 리스트 출력
    }


    @PutMapping("/users/{user_idx}")
    public List<User> updateUser(@PathVariable(value = "user_idx")final int user_idx,
                           @RequestBody final User user){
        if(userList.isEmpty()){

            userList.add(user1);
            userList.add(user2);
            userList.add(user3);
            userList.add(user4);
            userList.add(user5);
            userList.add(user6);

        }

        for(User u : userList){
            if(u.getUser_idx() == user_idx){
                userList.remove(u);

            }
        }
        userList.add(user);
        return userList; //수정된 유저정보를 가진 리스트를 다시 출력
    }

    @DeleteMapping("/users/{user_idx}")
    public List<User> deleteUser(@PathVariable(value = "user_idx")final int user_idx){
        if(userList.isEmpty()){

            userList.add(user1);
            userList.add(user2);
            userList.add(user3);
            userList.add(user4);
            userList.add(user5);
            userList.add(user6);

        }
        for(User u : userList){
            if(u.getUser_idx() == user_idx){
                userList.remove(u);
            }
        }
        return userList;
    }

}
