package DataSource;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import Domain.Train;
import Domain.trainPart.*;

public class TextEditor {

	private String filePath = "txt/mySave.txt";
	private File f = new File(filePath);
	private PrintWriter writer;

	public void delTrain(String code) throws IOException {
		File tempFile = new File("txt/myTempFile.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			String line;
			while ((line = br.readLine()) != null) {
				List<String> items = Arrays.asList(line.split("\\s*,\\s*"));
				System.out.println("i am items.0" + items.get(0));
				if (items.get(0).trim().equals(code)) {
					// System.out.println("fouuuuuuund");
					continue;
				}
				writer.write(line);
				writer.write("\n");

			}

			br.close();
			writer.close();
			System.out.println(f.exists());
			boolean b = f.delete();
			System.out.println("delete state is " + b);
			if (tempFile.renameTo(f)) {
				System.out.println("rename is done");
			} else {
				System.out.println("faild");
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List findTrain(String code) throws FileNotFoundException, IOException {
		List train;

		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				List<String> items = Arrays.asList(line.split("\\s*,\\s*"));

				// test
				System.out.println("list 0 " + items.get(0));
				System.out.println("code  " + code);
				System.out.println();

				if (items.get(0).trim().equalsIgnoreCase(code)) {
					System.out.println("TrainFound");
					return items;
				}
				System.out.println(items.get(0));
			}
		}
		System.out.println("not found");
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

	public List selectAllcodes() {
		String trainCode;
		List allCodes = new ArrayList<String>();

		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			String line;
			while ((line = br.readLine()) != null) {
				List<String> items = Arrays.asList(line.split("\\s*,\\s*"));
				trainCode = items.get(0);
				allCodes.add(trainCode);

			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allCodes;
	}
}
