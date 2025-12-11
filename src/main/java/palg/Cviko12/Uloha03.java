package palg.Cviko12;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Uloha03
{
    public static void main(String[] args) throws IOException
    {
        Path path = Paths.get(System.getProperty("user.dir"),"input", "allWords.txt");
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        String[] words = lines.toArray(new String[0]);
        printAnagrams(words);
    }

    // Doplň metodu, která bude ze vstupu vybírat dvojice slov, které jsou přesmyčkami
    // (např. reklama <-> karamel)
    public static void printAnagrams(String[] words)
    {
        HashMap<String, List<String>> map = new HashMap<>();
        for(var w1: words){
            var s = sort(w1);
            if(map.containsKey(s)){// Když map už obsahuje klíč s, přidej w1 do listu
                map.get(s).add(w1);
            }
            else {// Když ne, přidej do map novou položku
                var list = new ArrayList<String>();
                list.add(w1);
                map.put(s,list);
            }
        }
        for(var v : map.values()){
            if(v.size() == 1)
                continue;
            for(var p : v)
                System.out.println(p);
            System.out.println();
        }
    }
    private static String sort(String s){
        var pole = s.toCharArray();
        Arrays.sort(pole);
        return new String(pole);
    }
}
