package com.dsa.external;

public class RemoveAdjacentSpaces {

    public static void main(String[] args) {
        String s = " I    am     Uday Kiran";// Output = I am Uday Kiran

        char[] c = s.toCharArray();
        StringBuilder n = new StringBuilder();
        for(int i=0; i < c.length;i++){//      I am
            if(c[i] == ' ' && c[i+1] ==' '){
                continue;
            }
            else
                n.append(c[i]);
        }
        System.out.println(n.toString().trim());
    }
}
