import java.util.Scanner;

public class OptimumPathProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// your code goes here
		System.out.println("Please enter number of rows in the grid");
		Scanner in = new Scanner(System.in);
		int numOfRows = in.nextInt();
		System.out.println("Please enter number of columns in the grid");
		int numOfColumns = in.nextInt();

		if (!((numOfRows >= 1) && (numOfColumns <= 5000))) {
			System.out.println("The number of Rows need to be > 1 and number of Columns < 5000");
			System.exit(0);
		} else {
			System.out.println("Enter the number of Satellites ");
			int numOfSatellites  = in.nextInt();	
			System.out.println("Please enter the Row And Column of the Satellite with R#Column one by 1");
			String[] positionOfSatellite = new String[numOfSatellites];
			for (int i=0; i < numOfSatellites; i++) {
				// Here get the data
				positionOfSatellite[i] = in.next();
			}
			int optimizationResult = launchingSatellites(numOfRows, numOfColumns, numOfSatellites,positionOfSatellite);
			System.out.println(optimizationResult);
		}

	}

	private static int launchingSatellites(int numOfRows, int numOfColumns, int numOfSatellites,
			String[] positionOfSatellite) {
			//Here what we do is, have a counter for the number of Rows
			//Keep incrementing
			// then collect the max
			int[] satellitesInRow = new int[numOfRows];
			
			for (int i= 0; i < numOfSatellites; i++) {
				int hashPosition = positionOfSatellite[i].indexOf("#");
				int rownum = Integer.parseInt(positionOfSatellite[i].substring(0, hashPosition));;
				satellitesInRow[rownum-1]++;
			}
			int optimized = satellitesInRow[0];
			for (int i = 1; i <numOfRows; i++) {
				if (satellitesInRow[i] > optimized) 
					optimized = satellitesInRow[i];
			}
		
			if (optimized < 3) 
				optimized = 0;
		return optimized;
	}

}
