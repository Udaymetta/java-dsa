package com.dsa.external;

public class Space {

    public static void main(String[] args) {
        String s = " I    am     rasheed";

        char c[] = s.toCharArray();
        StringBuilder n = new StringBuilder();
        for(int i=0; i < c.length;i++){//      I am
            if(c[i] == ' ' && c[i+1] ==' '){
                continue;
            }
            else
                n.append(c[i]);
        }
//        char m = 'l';
        System.out.println(n.toString().trim());

    }
}
