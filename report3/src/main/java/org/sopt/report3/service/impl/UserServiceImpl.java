package org.sopt.report3.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.sopt.report3.model.DefaultRes;
import org.sopt.report3.model.User;
import org.sopt.report3.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service //이거 없이 그냥 인터페이스나 구현체 만들지 말고 바로 메소드 생성도 가능하다. (오버라이드 되고 안되고의 차이..?)
public class UserServiceImpl implements UserService {

    private static final List<User> userList = new LinkedList<>();
    User user1 = new User(1610408, "최수정", "서버");
    User user2 = new User(1510408, "최뚜띠", "안드로이드");
    User user3 = new User(1410408, "최수똥", "iOS");
    User user4 = new User(1310408, "최냥냥", "디자인");
    User user5 = new User(1210408, "최몽몽", "기획");
    User user6 = new User(1110408, "최몽땅", "기획");


    @Override
    public DefaultRes<String> getCurrentTime() {
        Calendar calendar = Calendar.getInstance();
        java.util.Date date = calendar.getTime();
        String today = (new SimpleDateFormat("yyyy.MM.dd HH시mm분").format(date));

        return DefaultRes.res(HttpStatus.OK.value(),"현재시간",today);
    }

    @Override
    public DefaultRes<List<User>> getUserListandSearchByNameOrName(final Optional<String> name, final Optional<String> part) {
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
                return DefaultRes.res(HttpStatus.NOT_FOUND.value(),"없습니다.");
            }
            return DefaultRes.res(HttpStatus.OK.value(),"이름으로 조회성공",byNameList);
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
                    return DefaultRes.res(HttpStatus.NOT_FOUND.value(),"없습니다.");

                }
                return DefaultRes.res(HttpStatus.OK.value(),"파트로 조회성공",byPartList);

            }else{

                return DefaultRes.res(HttpStatus.OK.value(),"모든회원 조회성공",userList);

            }

        }

    }

    @Override
    public DefaultRes<List<User>> searchSameId(final int user_idx) {
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
            return DefaultRes.res(HttpStatus.NOT_FOUND.value(),"없습니다.");

        }
        return DefaultRes.res(HttpStatus.OK.value(),"회원id로 검색성공",idx_List);

    }

    @Override
    public DefaultRes<List<User>> saveUser(final User user) {
        if(userList.isEmpty()){

            userList.add(user1);
            userList.add(user2);
            userList.add(user3);
            userList.add(user4);
            userList.add(user5);
            userList.add(user6);

        }
        userList.add(user);
        return DefaultRes.res(HttpStatus.OK.value(),"회원 저장성공",userList);

    }

    @Override
    public DefaultRes<List<User>> updateUser(final int user_idx,final User user) {
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
        return DefaultRes.res(HttpStatus.OK.value(),"회원정보 수정성공",userList);
    }

    @Override
    public DefaultRes<List<User>> deleteUser(final int user_idx) {

        //log.info("그담엔 여기롱롱오오오올"+String.valueOf(user_idx)); 약간의 자바자체의 문제
        if(userList.isEmpty()){

            userList.add(user1);
            userList.add(user2);
            userList.add(user3);
            userList.add(user4);
            userList.add(user5);
            userList.add(user6);

        }

        for(User u : userList){
            //log.info(String.valueOf(u.getUser_idx()));
            if(u.getUser_idx() == user_idx){
                userList.remove(u);
            }
        }
        return DefaultRes.res(HttpStatus.OK.value(),"회원정보 삭제성공");
    }
}
