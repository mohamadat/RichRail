package Train_part;

import SystemTrain_partsTypes.Passenger1;
import SystemTrain_partsTypes.Wagon;

public class TrainPartFactory {
	
	public TrainPart makeTrainPart(String type) {
		TrainPart tp = new TrainPart();
		if (type.equalsIgnoreCase("Passenger1")) {
			tp.setType(new Passenger1());	
		}
		else if (type.equalsIgnoreCase("wagon")) {
			tp.setType(new Wagon());
			
		}
		
		return tp;
		
		
	}
}
