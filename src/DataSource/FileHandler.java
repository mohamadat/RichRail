package DataSource;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import Domain.Train;
import Domain.trainPart.TrainPart;
import Domain.trainPart.TrainPartFactory;

public class FileHandler implements DataHandler {
	File f = new File("txt/mySave.txt");
	File t = new File("txt/types.txt");
	private String filePath = "mySave.txt";
	private TextEditor ed = new TextEditor();

	@Override
	public void addTrain(Train t) {
		try {
			ed.write(ed.trainTotxt(t),f);
			System.out.println("train is added to the file mysave.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void editTrain(String oldTraincode, Train newTrain) {
		try {
			// delete old one
			ed.delTrain(oldTraincode);
			System.out.println("old is deleted");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// add new one
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
		TrainPartFactory tpf = new TrainPartFactory();
		Train t = null;

		try {
			List l = ed.findTrain(trainName);
			System.out.println(String.valueOf(l.get(0)));
			t = new Train(String.valueOf(l.get(0)));

			for (int i = 1; i < l.size(); i++) {
				TrainPart part = tpf.makeTrainPart(String.valueOf(l.get(i)));
				t.addParts(part);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
		// TODO Auto-generated method stub

	}

	@Override
	public List selectAllTrainCodes() {

		return ed.selectAllcodes();
	}

	@Override
	public void addRollerType(String type, int zitPlaatsen) {
		String s = type +", "+ zitPlaatsen+"\n";
		 try {
			ed.write(s,t);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List selectAllTypes() {
		return ed.selectAlltypes();
	}

}
