//Aisyah Amini Nur - 1177050010
//Melani Nurul Mudyawati - 1177050060
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;
import java.util.concurrent.TimeUnit;
public class Sequential_Search
{
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		int j, k=0, number, size;
		boolean found = false;

		System.out.print("Masukan Ukuran Array = ");
		size = sc.nextInt();
		int[] intArray = new int[size];

		for (j=0; j<size; j++)
		intArray[j] = (int) (random()*size);
		
		System.out.println();
		System.out.print("Masukan nomor yang di cari = ");
		number = sc.nextInt();
		
		double startTime = System.currentTimeMillis();
	
		k=0;

		while (!found && k<size)
			if (intArray[k]==number)
			found=true;
			else
			k ++;
		
		System.out.println();
		if (found)
		System.out.println("Posisi Data Ditemukan = " + k);

		else
		System.out.println("Nomor yang dicari tidak ditemukan");
		if (size <= 10000)
		{
			double estimatedTime1 = System.currentTimeMillis() - startTime;
			System.out.println("waktu eksekusi : " +estimatedTime1+ " milisekon");
		}
		else
		{
			double estimatedTime2 = (System.currentTimeMillis() - startTime) * 0.001;
			System.out.println("waktu eksekusi : " +estimatedTime2+ " sekon");
		}

	}
}