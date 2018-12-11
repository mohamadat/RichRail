package Domain;

import java.util.ArrayList;
import java.util.List;

import Train_part.TrainPart;

public class Train {
	String code;
	List parts;
	
	public Train(String code) {
		this.code = code;
	this.parts = new ArrayList<TrainPart>();	
	}
	
	
	public void addComponent(TrainPart trainpart) {
		this.parts.add(trainpart);
	}
	
	
	
public List getParts() {
		return parts;
	}

@Override
public String toString() {
	String s = ";";
	for (Object object : parts) {
		s += object + "," ;
		
	}
    s = s.substring(0, s.length() - 1);

	s+=";";
	return code;

}

}
