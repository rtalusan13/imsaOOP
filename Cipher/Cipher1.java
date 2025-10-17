/**
 *  Class that encodes and decodes individual characters using the "Caesar cipher".
 *    
 */
public class Cipher1{
    private String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private String SHIFTED = "qwertyuiopasdfghjklzxcvbnm";
    /**
     *  Constructs a Cipher object.
     */
    public Cipher1() {
        // currently, does nothing
        
    }
    private void rotate()
    {
        
    }
    /**
     * Encodes a single character.
     *   @param ch the character to be encoded
     *   @return the character three later in the alphabet, with wrap-around
     */
    public char encode(char ch) {
        if(Character.isLetter(ch))
        {
            if(Character.isUpperCase(ch))
            {
                ch = Character.toLowerCase(ch);
                int index = ALPHABET.indexOf(ch);
                ch =  SHIFTED.charAt(index);
                ch = Character.toUpperCase(ch);
            }
            else
            {
                int index = ALPHABET.indexOf(ch);
                ch =  SHIFTED.charAt(index);
            }
        }
        
        SHIFTED = SHIFTED + SHIFTED.charAt(0);
        SHIFTED = SHIFTED.substring(1);
        return ch;
        //int index =ALPHABET.indexOf(ch);
        //return SHIFTED.charAt(index);
    }
    /**
     * Decodes a single character.
     *   @param ch the character to be decoded
     *   @return the character three earlier in the alphabet, with wrap-around
     */
    public char decode(char ch) {
        if(Character.isLetter(ch))
        {
            if(Character.isUpperCase(ch))
            {
                ch = Character.toLowerCase(ch);
                int index = SHIFTED.indexOf(ch);
                ch =  ALPHABET.charAt(index);
                ch = Character.toUpperCase(ch);
            }
            else
            {
                int index = SHIFTED.indexOf(ch);
                ch =  ALPHABET.charAt(index); 
            }
        }
        // String charact = "" + SHIFTED.charAt(0);
        // SHIFTED = SHIFTED.substring(1);
        // SHIFTED = SHIFTED + charact;
        /**if(Character.isBreak(ch)){
            
        }*/
        SHIFTED = SHIFTED + SHIFTED.charAt(0);
        SHIFTED = SHIFTED.substring(1);
        return ch;
    }
}