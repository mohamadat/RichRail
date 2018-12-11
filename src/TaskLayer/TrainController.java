package TaskLayer;

import Domain.Train;
import Train_part.TrainPart;
import Train_part.TrainPartFactory;

public class TrainController {
	
	//new train
	public Train createTrain(String code) {
		Train t1 = new Train(code);
		
		return t1;
	}
	

	
	
	public void AddTrainPart(Train t, String type) {
		TrainPartFactory tpf = new TrainPartFactory();
		TrainPart trainpart = tpf.makeTrainPart(type);
		t.addParts(trainpart);
		
		
	}

	public void delTrainPart(String trainCode, int index) {
		
	}
	
	
	
	public void selectTrain() {
		
	}
	public void delTrain(String trainCode) {
		
	}
}
