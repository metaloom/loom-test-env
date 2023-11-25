package io.metaloom.loom.test.data;

import java.nio.file.Path;

public interface ImageData extends TestData {

	default Path sampleImage1Path() {
		return root().resolve("folderA/pexels-photo-2379005.jpeg");
	}

}
