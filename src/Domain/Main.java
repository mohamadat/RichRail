package Domain;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import DataSource.DataHandler;
import DataSource.FileHandler;
import DataSource.TextEditor;
import TaskLayer.TrainController;
import TaskLayer.TrainPartController;
import Train_part.TrainPartType;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

		TrainController tc = new TrainController();
		TrainPartController tpc = new TrainPartController();
		
		//Train
		Train t = tc.createTrain("fastTrain");
		Train t2 = tc.createTrain("red");
		Train t3 = tc.createTrain("ns");
		
		tc.AddTrainPart(t2,"passenger1");	
		tc.AddTrainPart(t2,"passenger1");	
		tc.AddTrainPart(t2,"passenger1");	


        //tc.delTrain("red");

		
		//tc.AddTrainPart(t,"wagon");
		//tc.AddTrainPart(t,"passenger1");	
		//tc.AddTrainPart(t,"wagon");
		//tc.AddTrainPart(t,"passenger1");	
		//tc.delTrain("nhhhhhhs");
		
		//Train Part
		TrainPartType type = tpc.CreateTrainPartType("testWagons", 20);
		
	
}
	
	
}