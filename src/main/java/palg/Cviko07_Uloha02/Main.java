package palg.Cviko07_Uloha02;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        var r = search(new File("P:\\palg2025b"), "Balikovna.java");
        System.out.println(r);
    }

    // Doplň metodu tak, aby ve složce "startDir" a jejích podsložkách
    // hledala soubor s názvem "fileName". Pokud ho najde, vrátí celou cestu k němu.
    public static String search(File startDir, String fileName)
    {
        for(var child : startDir.listFiles()){
            if(child.getName().equals(fileName)){
                return child.getAbsolutePath();
            }
            else if(child.isDirectory()){
                var childResult = search(child,fileName);
                if(childResult != null)
                    return childResult;
            }
        }
        return null;
    }
}
