package com.pmt.graphiceditor.logic;

public class FileLogic {
	
	public String getFileExtension(String fileName) {
		return fileName.substring(fileName.length() - 3);
	}
}
