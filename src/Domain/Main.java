package Domain;

/* this class is for test use
 * plz note that is is only connected to the controller classes 
 */

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
	//	Train t = tc.createTrain("soseh_train");
		//Train t2 = tc.createTrain("red_train");

		
		// add parts
    //	tc.AddTrainPart("soseh_train","passenger1");	
    	//tc.AddTrainPart("soseh_train","zain");	

    	//tc.AddTrainPart("soseh_train","omar");	

    	//tc.AddTrainPart("ns_train","wagon");
    //	tc.AddTrainPart("ns_train","newPart");	


		
		//delete parts
	//	tc.delTrainPart("soseh_train", 2);

    	
		
		//delete train
		//tc.delTrain("ns_train");

		

		//find train
	//	System.out.println(tc.selectTrain("ns_train"));

		
		//Train Part
		//TrainPartType type = tpc.CreateTrainPartType("testWagons", 20);
		tpc.CreateTrainPartType("first type", 88);
		
		//select all trains
		//System.out.println(tc.selectAllTrainCodes());
	//to be added
		/*
		 * select all trains codes in an array
		 * select all types names in an array
		 * 
		 */
}
	
	
}