/*
Q2. The daily maximum temperatures recorded in 10 cities during the month of January (for all 31 days) have been tabulated as follows. WAP to read the table elements into a two dimentional array temperature and to find the city and day corresponding to
a) Highest temperature
b) Lowest temperature
*/

import java.util.Random;
public class hl{
	public static void main(String[] args){
		Random rand = new Random();
		System.out.println("   \t1\t2\t3\t4\t5\t6\t7\t8\t9\t10");
		int i, j;
		float temperature[][] = new float[31][10], maxTemp=0, maxCity=0, minTemp=0, minCity=0;
		for(i=0; i<31; ++i){
			System.out.print(i+1+ ":\t");
			for(j=0; j<10; ++j){
				temperature[i][j] = (Math.round((rand.nextFloat() * 6000)) / 100f);
				System.out.print(temperature[i][j] + "\t");
				if(i == 0 && j == 0){
					maxTemp = temperature[0][0];
					maxCity = 0f;
					minTemp = temperature[0][0];
					minCity = 0f;
				}
				else{
					if(maxTemp < temperature[i][j]){
						maxTemp = temperature[i][j];
						maxCity = j;
					}
					if(minTemp > temperature[i][j]){
						minTemp = temperature[i][j];
						minCity = j;
					}
				}
			}
			System.out.println();
		}
		System.out.println("----------------------------------");
		System.out.println("Maximum Temperature = " + maxTemp);
		System.out.println("Maximum Temperature City = " + (maxCity+1));
		System.out.println("Minimum Temperature = " + minTemp);
		System.out.println("Minimum Temperature City = " + (minCity+1));
	}
}
