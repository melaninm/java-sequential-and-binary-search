//Aisyah Amini Nur - 1177050010
//Melani Nurul Mudyawati - 1177050060
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;
public class BSearch
{
    public static void main(String[] Args)
    {
        int k, angka, size;
        System.out.println("Program Binary Search");
        System.out.println();
        System.out.println("Kumpulan data Array of Random");
        boolean notfound=true;
		Scanner sc = new Scanner(System.in);
		boolean found = false;

		System.out.print("Masukan Ukuran Array = ");
		size = sc.nextInt();
		int[] intarray = new int[size];
        for(int i=0;i<size;i++)
		{
             intarray[i] = (int) (random()*size);
        }
		Arrays.sort(intarray);
		
        System.out.print("\nMasukan angka yang ingin dicari = ");
        angka=sc.nextInt();
		
		double startTime = System.currentTimeMillis(); 
		k=0;
       
        int batasAtas=intarray.length-1;
        int batasBawah=0;
       
        while (notfound)
        {
            int posisiSekarang = (batasAtas + batasBawah)/2;
            if(intarray[posisiSekarang] == angka)
            {
                notfound=false;
                System.out.println("Angka "+angka+" ditemukan" );
            }
            else if(batasBawah>batasAtas)
            {
            System.out.println("Angka " +angka+" tidak ditemukan");
            break;
            }
            else
            {
                if(intarray[posisiSekarang]< angka)
                {
                    batasBawah = posisiSekarang+1;
                }
                else
                {
                    batasAtas = posisiSekarang-1;
                }
            }
        }
		if(size <= 10000)
		{
			double estimated1 = System.currentTimeMillis() - startTime;
			System.out.println("Waktu eksekusi = " +estimated1+ " Milisekon");
		}
		else
		{
			double estimated2 = System.currentTimeMillis() - startTime *0.001;
			System.out.println("Waktu eksekusi = " +estimated2+ " sekon");
		}
    }
}