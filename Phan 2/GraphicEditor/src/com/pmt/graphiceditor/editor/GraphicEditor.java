package com.pmt.graphiceditor.editor;

import com.pmt.graphiceditor.file.Bmp;
import com.pmt.graphiceditor.file.Gif;
import com.pmt.graphiceditor.file.Jpg;
import com.pmt.graphiceditor.file.Png;
import com.pmt.graphiceditor.file.IFile;
import com.pmt.graphiceditor.logic.FileLogic;

public class GraphicEditor {

	private IFile file;
	private FileLogic fileLogic = new FileLogic();

	public void openFile(String fileName) throws Exception {
		switch (fileLogic.getFileExtension(fileName)) {
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
		if (file != null) {
			file.parseFile();
		} else {
			System.out.println("File is not opened");
		}
	}

	public void saveFile() {
		if (file != null) {
			file.saveFile();
		} else {
			System.out.println("File is not opened");
		}
	}
}
