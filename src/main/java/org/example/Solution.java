package org.example;

public class Solution {
    private String s1;
    private String s2;

    public Solution(String s1, String s2) {
        this.s1="abcde";
        this.s2="qwer";
    }


    public void Test1(){
        String answer = "";
        int a = s1.length()/2;
        if(s1.length()%2==0){
            answer = s1.substring(a-1, a+1);
        }
        else answer=s1.substring(a, a+1);
        System.out.println(answer);
    }

    public void Test2(){
        String answer = "";
        int a = s2.length()/2;
        if(s2.length()%2==0) answer = s2.substring(a-1, a+1);
        else answer=s2.substring(a, a+1);
        System.out.println(answer);
    }
}
