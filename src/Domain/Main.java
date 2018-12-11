package Domain;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import DataSource.DataHandler;
import DataSource.FileHandler;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

		TrainController tc = new TrainController();
		
		
		Train t = tc.createTrain("redTrain");
		tc.AddTrainPart(t,"wagon");
		tc.AddTrainPart(t,"passenger1");		
		
		
		DataHandler file = new FileHandler();
		file.addTrain(t);
}
	
	
}