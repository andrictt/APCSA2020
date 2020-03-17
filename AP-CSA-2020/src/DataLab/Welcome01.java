package DataLab;

import core.data.*;

public class Welcome01 {
   public static void main(String[] args) {
	      String id = "KATL";
	      String id1 = "KSDM";
	      DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/" + id + ".xml"); 
	      DataSource ds1 = DataSource.connect("http://weather.gov/xml/current_obs/" + id1 + ".xml"); 
	      ds.setCacheTimeout(15 * 60);  
	      ds.load();
	      ds1.setCacheTimeout(15 * 60);  
	      ds1.load();
      //ds.printUsageString();
	      float temp = ds.fetchFloat("temp_f");
	      String loc = ds.fetchString("location");
	      float temp1 = ds1.fetchFloat("temp_f");
	      String loc1 = ds1.fetchString("location");
	      System.out.println("The temperature at " + loc + " is " + temp + "F");
	      System.out.println("The temperature at " + loc1 + " is " + temp1 + "F");
   }
}
