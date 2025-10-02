package palg;

import java.io.IOException;

public class Cviko02_Uloha03
{
    // Chytré hodinky zaznamenávají každý den počet hodin strávených sportem (smartSportData.txt).
    // Doplň metodu maxZeroIntervalLength, která zjistí, kolik nejvýše dní za sebou bylo zaznamenáno zcela beze sportu.

    public static void main(String[] args) throws IOException {
        System.out.println(
                maxZeroIntervalLength(
                        Cviko02_FileUtils.integersFromFile("smartSportData.txt")
                )
        );
    }

    public static int maxZeroIntervalLength( int[] values )
    {
        // Vrať největší počet nul, vyskytujících se v poli za sebou
        int currentZerosCount=0;
        int result=0;
        for(int i=0; i<values.length; i++)
        {
            if(values[i] == 0)
                currentZerosCount++;
            else
                currentZerosCount = 0;

            if(currentZerosCount > result)
                result = currentZerosCount;
        }
        return result;
    }
}
