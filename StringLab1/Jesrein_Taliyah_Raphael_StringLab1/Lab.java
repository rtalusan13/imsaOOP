
/**
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lab
{
    private String s1;
    private String s2;
    private String s3;
    //s1.substring(1,4).toUpperCase();
    /**
     * Constructor for objects of class Lab
     */
    public Lab()
    {  
     //Do not write any code here.  
     System.out.println("abcd".contains("cd"));
     System.out.println("abcdefghbc".replace("bc","bc".toUpperCase()));
    }
//the method takes three string parameters s1, s2, and s3 all lowercase and replaces all
//occurances of s2 in s1 with s3 such that the replaced s2 would be in all capital
//letters.  For example "abcefgabc" replace all "abc" with "xyz", the result "XYZefgXYZ",
//which is returned.
    public String replace(String s1, String s2,String s3)
    {
        return (s1.replace(s2,s3.toUpperCase()));
    }
//the following method creates a password from two strings s1 and s2.
//the password takes first three letters of s1 and first three letters
//of s2 and has an * in between. For example, with "abcd" and "qwer",
//the created password would be "abc*qwe".To combine strings, use +.
//Thus "abc"+"xyz" will give "abcxyz".
public String password(String s1, String s2)
{
    String newpassword = s1.substring(0,3) +"*"+ s2.substring(0,3);
    return(newpassword);//dummy statement  
}
//the following method searches for s2 in s1. If s2 is found then returns "success",
//otherwise returns "fail".
public String find(String s1, String s2)
{
    if(s1.contains(s2)){
    return ("success");
    }
    else{
    return ("fail");
    }
}
//this method would return "success" if s1 is longer than 5 characters
//else it would return "fail".
public String length(String s1)
{
    if(s1.length() > 5){
    return ("success");//dummy statement
    }
    else{
    return("fail");
    }
}
}
