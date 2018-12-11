package Train_part;

public class TrainPart {
	private TrainPartType type;

	public TrainPart(TrainPartType type) {
		this.type = type;
	}
	
	public TrainPart() {
		this.type = null;
	}

	public TrainPartType getType() {
		return type;
	}

	public void setType(TrainPartType type) {
		this.type = type;
	}
	
	
	

}
