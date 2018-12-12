package TaskLayer;

import Domain.trainPart.TrainPartType;
import Domain.trainPart.newType;

public class TrainPartController {
	
	
	public TrainPartType CreateTrainPartType(String code, int zitplaats) {
		TrainPartType tpt = new newType(code, zitplaats); 
		return tpt;
	}
	
	
	public void selectTrainPartTypes(){
		
	}
	
	
	public void delTrainPartType(String type) {
		
	}

}
