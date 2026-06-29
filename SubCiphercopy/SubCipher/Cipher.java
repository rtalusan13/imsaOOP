/**
 *  Class that encodes and decodes individual characters using the "Caesar cipher".
 *  Nandana Varma 11/7/22
 *  Asked for help from Ryan and Emily
 */
public class Cipher 
{
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static String SHIFTED = "qwertyuiopasdfghjklzxcvbnm";
    /**
     *  Constructs a Cipher object.
     */
    public Cipher() 
    {
    // currently, does nothing
    }
    /**
     * Encodes a single character.
     *   @param ch the character to be encoded
     *   @return the character three later in the alphabet, with wrap-around
     */
    public char encode(char ch) {
        boolean upper = false;
        if (Character.isLetter(ch))
        {
            if(Character.isUpperCase(ch))
            {
                ch = Character.toLowerCase(ch);
                upper = true;
            }
            int index = Cipher.ALPHABET.indexOf(ch);
            if(upper)
            {
                String shifted = SHIFTED;
                String a = SHIFTED.substring(0,1);
                String b = SHIFTED.substring(1,26);
                SHIFTED = b+a;
                return Character.toUpperCase(shifted.charAt(index));
            }
            String shifted = SHIFTED;
            String a = SHIFTED.substring(0,1);
            String b = SHIFTED.substring(1,26);
            SHIFTED = b+a;
            return shifted.charAt(index);
            
            
        }
        String a = SHIFTED.substring(0,1);
        String b = SHIFTED.substring(1,26);
        SHIFTED = b+a;
        return ch;
    }
    /**
     * Decodes a single character.
     *   @param ch the character to be decoded
     *   @return the character three earlier in the alphabet, with wrap-around
     */
    public char decode(char ch) {
        boolean upper = false;
        if (Character.isLetter(ch))
        {
            if(Character.isUpperCase(ch))
            {
                ch = Character.toLowerCase(ch);
                upper = true;
            }
            int index = Cipher.SHIFTED.indexOf(ch);
            if(upper)
            {
                String a = SHIFTED.substring(0,1);
                String b = SHIFTED.substring(1,26);
                SHIFTED = b+a;
                return Character.toUpperCase(Cipher.ALPHABET.charAt(index));
            }
            String a = SHIFTED.substring(0,1);
            String b = SHIFTED.substring(1,26);
            SHIFTED = b+a;
            return Cipher.ALPHABET.charAt(index);
            
            
        }
        String a = SHIFTED.substring(0,1);
        String b = SHIFTED.substring(1,26);
        SHIFTED = b+a;
        return ch;
    }
}