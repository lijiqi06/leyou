package com.leyou.common.enums;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
public enum ExceptionEnum {

    PRICE_CONNOT_BE_NULL(400, "价格不能为空")

    ;
    private Integer code;
    private String msg;


    ExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
