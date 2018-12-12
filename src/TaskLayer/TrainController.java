package TaskLayer;

import DataSource.DataHandler;
import DataSource.FileHandler;
import Domain.Train;
import Domain.trainPart.TrainPart;
import Domain.trainPart.TrainPartFactory;

public class TrainController {
	private DataHandler dh = new FileHandler();
	
	//new train
	public Train createTrain(String code) {
		Train t1 = new Train(code);
		dh.addTrain(t1);
		
		
		return t1;
	}
	

	
	
	public void AddTrainPart(Train t, String type) {
		TrainPartFactory tpf = new TrainPartFactory();
		TrainPart trainpart = tpf.makeTrainPart(type);
		t.addParts(trainpart);
		String trainCode = t.getCode();
		dh.editTrain(trainCode, t);
		
		
	}

	public void delTrainPart(String trainCode, int index) {
		
	}
	
	
	
	public void selectTrain() {
		
	}
	public void delTrain(String trainCode) {
		dh.deleteTrain(trainCode);
		
		
	}
}
