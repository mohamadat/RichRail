package DataSource;

import Domain.Train;

public interface DataHandler {
	public void addTrain(Train t);
	public void editTrain(String oldTraincode, Train newTrain);
	public void deleteTrain(String trainCode);
	public Train selectTrain(String trainName);
		


}
