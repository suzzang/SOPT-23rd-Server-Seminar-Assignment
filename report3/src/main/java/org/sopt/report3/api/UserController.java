package org.sopt.report3.api;

import lombok.extern.slf4j.Slf4j;
import org.sopt.report3.model.User;
import org.sopt.report3.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    //우선 여기서 리턴 할때 상태코드 무조건 200으로 집어넣어서 실패했을때의 데이터(뭐가 잘못된건지를 클라가 직접볼수있도록)를 볼수 있게 해줘야 한다!!!!!!!


    @GetMapping("/") //시간보여주기
    public ResponseEntity getTime(){
        return new ResponseEntity<>(userService.getCurrentTime(), HttpStatus.OK);
    }

    @GetMapping("/users") //모든 회원 조회, 파라미터에 따라 네임검색,파트검색 가능
    public ResponseEntity getUserList(@RequestParam(value = "name",required = false)final Optional<String> name,
                                      @RequestParam(value = "part",required = false)final Optional<String> part){

        return new ResponseEntity<>(userService.getUserListandSearchByNameOrName(name,part),HttpStatus.OK);
    }

    @GetMapping("/users/{user_idx}") // 유저아이디엑스의 패쓰값을 통해 검색가능
    public ResponseEntity searchByIdx(@PathVariable(value = "user_idx")final int user_idx){
        return new ResponseEntity<>(userService.searchSameId(user_idx),HttpStatus.OK);

    }

    @PostMapping("/users")//새로운 유저 정보 입력
    public ResponseEntity save(@RequestBody final User user){
        return new ResponseEntity<>(userService.saveUser(user),HttpStatus.OK);
    }

    @PutMapping("/users/{user_idx}")//기존에 존재하던 회원을 뽑아내기 위해 패쓰값으로 아이디엑스를 주고 다시 바디로 수정한 유저값을 보내도록 한다
    public ResponseEntity update(@PathVariable(value = "user_idx")final int user_idx,
                                 @RequestBody final User user){
        return new ResponseEntity<>(userService.updateUser(user_idx,user),HttpStatus.OK);
    }
    @DeleteMapping("/users/{user_idx}")// 유저아이디엑스를 패쓰로 보내고 해당 유저를 찾아 삭제한다.
    public ResponseEntity delete(@PathVariable(value = "user_idx")final int user_idx){
      //  log.info(" 제일먼저 여기롱롱 "+String.valueOf(user_idx));
        return new ResponseEntity<>(userService.deleteUser(user_idx),HttpStatus.OK);
    }


}
