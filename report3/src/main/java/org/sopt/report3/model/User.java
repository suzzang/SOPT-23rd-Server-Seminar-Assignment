package org.sopt.report3.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class User {
    //이번 과제는 컨트롤과 서비스를 분리해보는것!

    //맥북에서 알트 엔터 -> 커맨드+N

    private int user_idx;
    private String name;
    private String part;

    public User(){

    }

}
