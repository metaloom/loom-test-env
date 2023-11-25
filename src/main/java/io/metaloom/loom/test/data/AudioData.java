package io.metaloom.loom.test.data;

import java.nio.file.Path;

public interface AudioData extends TestData {

	default Path sampleAudioMedia() {
		return root().resolve("folderA/folderC/glossy-168156.mp3");
	}
}
