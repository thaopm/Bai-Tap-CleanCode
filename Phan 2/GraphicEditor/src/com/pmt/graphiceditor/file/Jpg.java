package com.pmt.graphiceditor.file;

import com.pmt.graphiceditor.logic.iFile;

public class Jpg implements iFile {

	public static final String EXTENSION = "jpg";
	private String fileOpenned;

	@Override
	public void openFile(String fileName) {
		fileOpenned = fileName;
		System.out.println(EXTENSION + ":  open " + fileName);
	}

	@Override
	public void parseFile() {
		if (fileOpenned != null) {
			System.out.println(EXTENSION + ":  parse");
		} else {
			System.out.println("Nothing to parse");
		}
	}

	@Override
	public void saveFile() {
		if (fileOpenned != null) {
			System.out.println(EXTENSION + ":  save");
		} else {
			System.out.println("Nothing to save");
		}
	}

}
