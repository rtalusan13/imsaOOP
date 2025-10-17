package MyCipherAttempt;

/**
* Class that encodes and decodes individual characters using the "Caesar cipher".
*
*/
public class Cipher {
private String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
private String SHIFTED = "qwertyuiopasdfghjklzxcvbnm";
char temp;
char[] charArray = SHIFTED.toCharArray();
/**
* Constructs a Cipher object.
*/
public Cipher() {

}
/**
* Encodes a single character.
* @param ch the character to be encoded
* @return the character three later in the alphabet, with wrap-around
*/
public char encode(char ch) {
int index = ALPHABET.indexOf(ch);
return SHIFTED.charAt(index);
}
/**
* Decodes a single character.
* @param ch the character to be decoded
* @return the character three earlier in the alphabet, with wrap-around
*/
public char decode(char ch) {
    char mpt = '\0';
if(Character.isWhitespace(ch)){
    return mpt;
}
if(Character.isUpperCase(ch)){
    char rt = Character.toLowerCase(ch);
    int index = SHIFTED.indexOf(rt);
    char convert = ALPHABET.charAt(index);
    System.out.print(Character.toUpperCase(convert));
    return Character.toUpperCase(convert);
    
    temp = charArray[0];
    for(int i = 1; i < SHIFTED.length(); i++){
        charArray[i-1] = charArray[i];
    }
    charArray[25] = temp;
    for(int i = 25; i>0;i--){
        String characterToString = Character.toString(charArray[i]);
        String s = characterToString + s;
    }
}
else{
    int index = SHIFTED.indexOf(ch);
    System.out.print(ALPHABET.charAt(index));
    return ALPHABET.charAt(index);
    
    temp = charArray[0];
    for(int i = 1; i < SHIFTED.length(); i++){
        charArray[i-1] = charArray[i];
    }
    charArray[25] = temp;
    for(int i = 25; i>0;i--){
        String characterToString = Character.toString(charArray[i]);
        String s = characterToString + s;
    }
}
}
public char rotate(){
    String s;
    
    return '\0';
}
public String combiner(String characterToString){
    
}
}
