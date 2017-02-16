package com.uniquechar;

/**
 * Hello world!
 *
 */
public class uniquechar {
    public static void main( String[] args ) {
        String str = new String();
        boolean output = false;
    }
    public static boolean uniqueChar(String str){
        for(int i = 0; i<str.length() ; i++)
        {
            Character charOfStr = str.charAt(i);
            int count = 0;
            for(int j = i; j<str.length(); j++)
            {
                if(charOfStr == str.charAt(j))
                    count++;
            }
            if(count>1)
                return false;
        }
        return true;
    }
}
