package org.sopt.report3.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DefaultRes<T>{



    private int statusCode;
    private String responseMessage;
    private T responseData;

    public DefaultRes(final HttpStatus statusCode, final String resposneMessage){
        this.statusCode = statusCode.value();
        this.responseMessage = resposneMessage;
        this.responseData = null;
    }

    public static<T> DefaultRes<T> res(final int statusCode, final String responseMessage){
        return res(statusCode,responseMessage,null);
    }

    public static<T> DefaultRes<T> res(final int statusCode, final String responseMessage, final T t){
        return DefaultRes.<T>builder().responseData(t).statusCode(statusCode)
                .responseMessage(responseMessage).build();

    }

}