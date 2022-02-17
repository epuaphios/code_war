package com.test;
https://n11scdn.akamaized.net/custom/upload/79/22/842990334588989773.svg
public class test {

    public static String[] main(String[] args) {

        String s = "abcde";
        String[] ch = s.split("");
        String ch1[] = new String[(int) (Math.ceil((double)s.length()/2))];
        int y=0;
        if(s.length()%2==0) {
            for (int i = 0; i < s.length(); i += 2) {
                        ch1[y] = (ch[i])+(ch[i + 1]);
                        y++;
            }
        }
        else {
            for (int i = 0; i < s.length()-1; i += 2) {

                if(i<s.length()) {
                    ch1[y] = (ch[i])+(ch[i + 1]);
                    y++;
                }

                }
                ch1[(int) (Math.ceil((double)s.length()/2))-1] = (ch[s.length()-1])+("_");
                //System.out.println(ch1[i]);}

        }

        return ch1;
    }

}