package DataLab;

import java.util.ArrayList;

import core.data.DataSource;

public class BabyNamesRunner {
	public static void main(String[] args) {
		DataSource ds = DataSource.connect("https://data.cityofnewyork.us/resource/25th-nujf.json").load();
		ArrayList<BabyNames> babies = ds.fetchList(BabyNames.class, "brth_yr", "gndr", "ethcty", "nm", "cnt", "rnk");
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
