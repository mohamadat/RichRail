package Domain;

import java.util.ArrayList;
import java.util.List;

import Domain.trainPart.*;
public class Train {
	String code;
	List<TrainPart> parts;
	
	public Train(String code) {
		this.code = code;
	this.parts = new ArrayList<TrainPart>();	
	}
	
	
	
	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public void addParts(TrainPart trainpart) {
		this.parts.add(trainpart);
	}
	
	
	
public List getPartsTypes() {
	List l = new ArrayList();

	for (Object o : parts) {
		l.add(o.toString());
	}
		return this.parts;
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
