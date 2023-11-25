package io.metaloom.loom.test.data;

import java.nio.file.Path;

public interface OtherData extends TestData {

	default Path sampleBogusDoc() {
		return root().resolve("folderA/random.doc");
	}

	default Path sampleBogusMP4() {
		return root().resolve("folderA/random.mp4");
	}

	default Path sampleBogusJPG() {
		return root().resolve("folderA/random.jpg");
	}

	default Path sampleBogusMP3() {
		return root().resolve("folderA/random.mp3");
	}

	default Path sampleBogusBin() {
		return root().resolve("folderA/random.bin");
	}

	default Path missingMP4() {
		return root().resolve("missing.mp4");
	}
}
