package io.metaloom.loom.test.data;

import java.nio.file.Path;

public interface DocData extends TestData {

	default Path sampleTXT() {
		return root().resolve("folderA/sample.txt");
	}

	default Path samplePDF() {
		return root().resolve("folderA/sample.pdf");
	}

	default Path sampleDOCX() {
		return root().resolve("folderA/sample.docx");
	}

	default Path sampleEPUB() {
		return root().resolve("folderA/sample.epub");
	}

	default Path sampleODT() {
		return root().resolve("folderA/sample.odt");
	}
}
