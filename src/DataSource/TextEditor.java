package DataSource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import Domain.Train;
import Train_part.TrainPart;

public class TextEditor {

	private String filePath = "mySave.txt";
	private File f = new File(filePath);
	private PrintWriter writer;

	public List findTrain(String code) throws FileNotFoundException, IOException {
		List train;

		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		    System.out.println(line);
		    //line = line.replaceAll("-+-+-", ",");
		    List<String> items = Arrays.asList(line.split("\\s*,\\s*"));
		    if (items.get(0).equals(code)) {
		    	return items;
		    }
		    System.out.println(items.get(0));
		    }
		}

		return null;

	}

	public void write(String yourText) throws FileNotFoundException {

		if (f.exists() && !f.isDirectory()) {
			writer = new PrintWriter(new FileOutputStream(new File(filePath), true));

		} else {
			writer = new PrintWriter(filePath);
		}

		writer.append(yourText);
		writer.close();

	}

	public String trainTotxt(Train t) {
		String spaceingChar = "\n";
		// test format to save train to.txt
		// the format is trainCode: type-type-type
		// spaceingChar ; is added in the end of the whole train
		String s = "";
		s += t.getCode();
		s += " ,";

		List parts = t.getPartsTypes();
		Iterator i = parts.iterator();
		String type;
		while (i.hasNext()) {
			TrainPart part = (TrainPart) i.next();
			type = part.getType();
			s += type + ",";

		}
		s = s.substring(0, s.length() - 1);
		s += spaceingChar;
		return s;
	}
}
