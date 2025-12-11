package palg.Cviko12;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Uloha02
{
    public static void main(String[] args) throws NoSuchAlgorithmException
    {
        String heslo1 = "12346_Jarda1985";
        System.out.println(encrypt(heslo1,"MD5"));
        System.out.println(encrypt(heslo1,"SHA256"));
    }
    public static String encrypt(String input, String algorithm) throws NoSuchAlgorithmException
    {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        byte[] bytes = messageDigest.digest(input.getBytes());
        return bytesToHex(bytes);
    }
    public static String bytesToHex(byte[] bytes)
    {
        StringBuilder sb = new StringBuilder();
        for(var b : bytes){
            sb.append(String.format("%02x ",b));
        }
        return sb.toString();
    }
}
