package com.lph;

/**
 * @Author : lvpenghui
 * @Description : Java += 操作符实质
 * @Date : Created in 15:07 2017/12/11
 * @ModifiedBy :
 */
public class Operator {
    public static void main() {
        int i = 1;
        short j = 2;

        //自动转型，语法正确，相当于 j = (short) (j+i);
        j += i;

        //编译出错，Incompatible types.Required:shortFound:int
        //j = i+j;
    }
}
