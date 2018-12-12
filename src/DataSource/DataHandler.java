package DataSource;

import Domain.Train;

public interface DataHandler {
	public void addTrain(Train t);
	public void editTrain(Train oldTrain, Train newTrain);
	public void deleteTrain(String trainCode);
	public Train selectTrain(String trainName);
		


}
