package com.pmt.graphiceditor.main;

import com.pmt.graphiceditor.editor.GraphicEditor;

public class Main {
	public static void main(String[] args) {
		GraphicEditor editor = new GraphicEditor();
		try {
			editor.openFile("image.abc");
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		editor.parseFile();
		editor.saveFile();
	}
}
