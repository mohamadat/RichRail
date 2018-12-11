package Domain;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import DataSource.DataHandler;
import DataSource.FileHandler;
import TaskLayer.TrainController;
import TaskLayer.TrainPartController;
import Train_part.TrainPartType;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

		TrainController tc = new TrainController();
		TrainPartController tpc = new TrainPartController();
		
		
		Train t = tc.createTrain("redTrain");
		tc.AddTrainPart(t,"wagon");
		tc.AddTrainPart(t,"passenger1");		
		
		TrainPartType type = tpc.CreateTrainPartType("testWagons", 20);
		
		
		DataHandler file = new FileHandler();
		file.addTrain(t);
}
	
	
}