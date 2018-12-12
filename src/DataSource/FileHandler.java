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
	public void editTrain(Train oldTrain, Train newTrain) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteTrain(Train t) {
		// TODO Auto-generated method stub
		
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
