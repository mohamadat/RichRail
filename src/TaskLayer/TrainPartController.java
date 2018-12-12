package TaskLayer;

import Train_part.TrainPartType;
import Train_part.newType;

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
