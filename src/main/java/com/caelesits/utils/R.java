package com.caelesits.utils;

import lombok.Data;

/**
 * @author Caelesits
 * @create 2022/6/8 18:57
 **/
@Data
public class R {
    private Boolean flag;
    private Object data;

    public R() {

    }

    public R(Boolean flag) {
        this.flag = flag;
    }

    public R(Boolean flag,Object data) {
        this.flag = flag;
        this.data = data;
    }
}
