package palg.Cviko05_Uloha02;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        // 1) Přidej třídy Queue a Stack implementující rozhraní Waiting

        // 2) Na jedné z nich otestuj, jaký je průměrný počet čekajících,
        //   pokud 100_000 krát provedeme add nebo remove s pravděpodobností 1:1
        Scanner s = new Scanner(System.in);
        Waiting uloziste;
        if(s.nextLine().equals("QUEUE"))
            uloziste = new Queue();
        else
            uloziste = new Stack();
        uloziste.add("AHOJ");

    }
    private static void Ukazka(Queue k)
    {
        k.add("AHOJ");
    }
}
