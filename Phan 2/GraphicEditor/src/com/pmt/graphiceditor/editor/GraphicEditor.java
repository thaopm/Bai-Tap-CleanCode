package com.pmt.graphiceditor.editor;

import com.pmt.graphiceditor.file.Bmp;
import com.pmt.graphiceditor.file.Gif;
import com.pmt.graphiceditor.file.Jpg;
import com.pmt.graphiceditor.file.Png;
import com.pmt.graphiceditor.logic.iFile;

public class GraphicEditor {

	private iFile file;

	public void openFile(String fileName) throws Exception {
		String extension = fileName.substring(fileName.length() - 3);
		switch (extension) {
		case "bmp":
			file = new Bmp();
			break;
		case "gif":
			file = new Gif();
			break;
		case "png":
			file = new Png();
			break;
		case "jpg":
			file = new Jpg();
			break;
		default:
			throw (new Exception("Unknown file type"));
		}
		file.openFile(fileName);
	}
	
	public void parseFile() {
		file.parseFile();
	}

	public void saveFile() {
		file.saveFile();
	}
}
