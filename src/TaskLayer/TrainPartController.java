package TaskLayer;

import java.util.List;

import DataSource.DataHandler;
import DataSource.FileHandler;
import Domain.trainPart.TrainPartType;
import Domain.trainPart.newType;

public class TrainPartController {
	private DataHandler dh = new FileHandler();

	public TrainPartType CreateTrainPartType(String code, int zitplaats) {
		TrainPartType tpt = new newType(code, zitplaats);
		return tpt;
	}

	public void delTrainPartType(String type) {

	}

	
	
	public List selectTrainPartTypes(){
		//the format will be [type,typeZitplaatsen,nextType,nextTypeZitplaatsen]
	return dh.selectAllTypes();
		
		
		
	}

}
