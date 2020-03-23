package DataLab;

import java.util.ArrayList;

import core.data.DataSource;

public class BabyNamesRunner {
	public static void main(String[] args) {
		
		DataSource ds = DataSource.connect("https://data.cityofnewyork.us/api/views/25th-nujf/rows.xml").load();
		ArrayList<BabyNames> babies = ds.fetchList(BabyNames.class, "row/row/brth_yr", "row/row/gndr", "row/row/ethcty", "row/row/nm", "row/row/cnt", "row/row/rnk");
		System.out.println("Total baby names: " + babies.size());

		int max = 0;
		String name = "";
		for (BabyNames i : babies) {
			if (i.getCount() > max) {
				max = i.getCount();
				name = i.getName();
			}
		}
		System.out.println("The most popular baby name is: " + name + " with a count of " + max);
	}
}
