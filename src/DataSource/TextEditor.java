package DataSource;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.lang.model.element.Element;

import Domain.Train;
import Train_part.TrainPart;

public class TextEditor {

	private String filePath = "mySave.txt";
	private File f = new File(filePath);
	private PrintWriter writer;
	
	
	public void write(String yourText) throws FileNotFoundException {
		
		if ( f.exists() && !f.isDirectory() ) {
			writer = new PrintWriter(new FileOutputStream(new File(filePath), true));
			
		}
		else {
			writer = new PrintWriter(filePath);
		}
		
		writer.append(yourText);
		writer.close();
		
	}
	
	public String trainTotxt(Train t) {
		String spaceingChar = "\n";
		//test format to save train to.txt
		//the format is trainCode: type-type-type
		//spaceingChar ; is added in the end of the whole train
			String s = "";
			s += t.getCode();
			s += " -";

			List parts = t.getPartsTypes();
			Iterator i = parts.iterator();
			String type;
			while (i.hasNext()) {
			TrainPart part = (TrainPart) i.next();
			type = part.getType();
			s += type + "-+-+-" ;
				
			}
		    s = s.substring(0, s.length() - 5);
		    s += spaceingChar ;
			return s;
	}
}
