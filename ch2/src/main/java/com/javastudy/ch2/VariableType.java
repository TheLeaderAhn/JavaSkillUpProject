package com.javastudy.ch2;

import java.util.Date;

public class VariableType {

    public static void main (String[] args) {

        /*
        * data -- char
        *      __ byte, short, int ,long
        *      -- float, double
        *
        *   기본형 primitive type
        *   booleadn 논리형 문자형 char ,  정수형 byte,short,int,long ,float ,double
        *   계산을 위한 실제 값을 저장한다.
        *
        *   참조형 reference type
        *   객체의 주소를 저장한다. 위 8개 기본형 제외한 나머지
        *
        *
        * */

        Date today = new Date(); // Date 객체 생성 -> 그 주소를 today에 저장한다.

//        논리형 boolean 1 byte  :  True와 false 두가지 타입이므로
//        문자형 char    2 byte:  자바에서 유니코드 2byte 체계를 사용하므로 2바이트
//        정수형  byte   1 byte :  크기가 byte라서 byte
//              short; 2 byte : int를 기준으로 짧아서 2byte
//              int;   4 byte : int를 기준으로
//              long   8 byte :int를 기준으로 길어서 8 byte
//        실수형 fload   4 byte : 부동소수점 - floating - point 방식이라서 float
//             double  8 byte :  float보다 두배의 크기 8 byte 를 같기 때문에 double
//



    }

}
