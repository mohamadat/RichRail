package Domain;

import java.io.FileNotFoundException;

import java.io.UnsupportedEncodingException;

import DataSource.DataHandler;
import DataSource.FileHandler;
import DataSource.TextEditor;
import TaskLayer.TrainController;
import TaskLayer.TrainPartController;
import Domain.trainPart.*;
public class Main {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

		TrainController tc = new TrainController();
		TrainPartController tpc = new TrainPartController();
		
		// make new Train
		Train t = tc.createTrain("ns_train");
		Train t2 = tc.createTrain("red_train");

		
		// add parts
    	tc.AddTrainPart("ns_train","passenger1");	
    	tc.AddTrainPart("ns_train","wagon");
    	tc.AddTrainPart("ns_train","newPart");	


		
		//delete parts
		tc.delTrainPart("ns_train", 1);

    	
		
		//delete train
		tc.delTrain("ns_train");

		
		
		//find train
		tc.selectTrain("red");

		

		
	//	tc.AddTrainPart(t2,"passenger1");	
		//tc.AddTrainPart(t2,"passenger1");	
		//tc.AddTrainPart(t2,"passenger1");	
		
		//tc.createTrain("b");
		
		//tc.AddTrainPart("ns","");

		//tc.delTrain("ns");
		
		tc.delTrainPart("ns", 1);
		//tc.selectTrain("red");
		//tc.delTrainPart("red", 1);
		
		//tc.AddTrainPart(t,"wagon");
		//tc.AddTrainPart(t,"passenger1");	
		//tc.AddTrainPart(t,"wagon");
		//tc.AddTrainPart(t,"passenger1");	
		//tc.delTrain("nhhhhhhs");
		
		//Train Part
		TrainPartType type = tpc.CreateTrainPartType("testWagons", 20);
		
	
}
	
	
}