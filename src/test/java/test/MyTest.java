package test;

import java.util.*;


class Parent {

    private String name = "parent";

    void print() {

        System.out.println(this.name);
    }
}

class Son extends Parent {
    private String name = "son";

//    void print() {
//
//        System.out.println(this.name);
//    }


}


public class MyTest {

    public static void main(String[] args) throws Exception {

        //return 机制  return拷贝

//        System.out.println(getNum());
//        System.out.println(getNum2());
//
//        new Son().print();

//
//        excTest();


    }

    private static void excTest() {
        //        try {
//            int x = 1 / 0;
//        } catch (Exception e) {
//
//            throw  new Exception("xxx");
//        }
    }


    static void change(List list) {
        list = new ArrayList();
        //arrayList.add("1");
        list.add("vv");

    }


    static String getNum() {
        //return 机制

        String A = null;
        try {
            A = "try";
            return A;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            A = "finally";
            //return A;
        }
        return null;


    }

    static String getNum2() {
        //return 机制

        String A = null;
        try {
            A = "try";
            return A;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            A = "finally";
            return A;
            //return "FIN";
        }


    }
}
