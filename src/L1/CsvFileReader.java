package L1;
import java.io.*;
import java.util.ArrayList;
public class CsvFileReader {

	private ArrayList<BiddingResult> list = new ArrayList<BiddingResult>();

	public CsvFileReader(String filename) {

		try {
			var myFile = new File(filename);
			FileReader reader = new FileReader(myFile);

         BufferedReader bufferedReader = new BufferedReader(reader);

			var line = bufferedReader.readLine();
			while (line != null) {

				String[] column = line.split(",");
				int year = Integer.parseInt(column[0]);
				String month = column[1];
				int round = Integer.parseInt(column[2]);
				double premium = Double.parseDouble(column[3]);
				int quota = Integer.parseInt(column[4]);
				int bids = Integer.parseInt(column[5]);

				BiddingResult bid = new BiddingResult("CatA", year, month, round, quota, bids, premium);
				list.add(bid);

				line = bufferedReader.readLine();
			}
			bufferedReader.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public ArrayList<BiddingResult> getList() {
		return list;
	}
}
