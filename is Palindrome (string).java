import java.io.*;
import  java.util.*;
class UserMainCode
{
public int isPalindrome(String input1){
String str=input1.toLowerCase();
        String str1="";
        for(int i=str.length()-1;i>=0;i--)
        {
            str1+=str.charAt(i);
        }
        if(str.equals(str1))
        return 2;
        else
        return 1;
    }
}