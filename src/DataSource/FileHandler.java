package DataSource;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import Domain.Train;

public class FileHandler implements DataHandler {
	private String filePath = "mySave.txt";
	private File f = new File(filePath);
	private PrintWriter writer;
	private TextEditor ed = new TextEditor();
	



	@Override
	public void addTrain(Train t) {
		try {
			ed.write(ed.trainTotxt(t));
			System.out.println("train is added to the file mysave.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}


	@Override
	public void editTrain(String oldTraincode, Train newTrain) {
		try {
			//delete old one
			ed.delTrain(oldTraincode);
			System.out.println("old is deleted");
		} catch (IOException e) {
			e.printStackTrace();
		}
		//add new one
		addTrain(newTrain);
		System.out.println("new is added");

		
		
	}


	@Override
	public void deleteTrain(String trainCode) {
		try {
			ed.delTrain(trainCode);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}


	@Override
	public Train selectTrain(String trainName) {
		try {
			ed.findTrain("test");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		// TODO Auto-generated method stub
		
	}
	
	

}
