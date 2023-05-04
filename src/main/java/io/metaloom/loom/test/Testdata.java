package io.metaloom.loom.test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Testdata implements TestValues {

	private File root;

	public Testdata(File root) {
		this.root = root;
	}

	public File root() {
		return root;
	}

	public Path sampleVideoPath() {
		return Paths.get(root.getAbsolutePath(), "folderA/folderB/pexels-jack-sparrow-5977265.mp4");
	}

	public String sampleVideoSHA512() {
		return SHA512SUM;
	}

	public String sampleVideoFingerprint() {
		return VIDEO_FINGERPRINT;
	}

	public String sampleVideoChunkHash() {
		return VIDEO_CHUNK_HASH;
	}

	public String sampleVideoSHA256() {
		return SHA256SUM;
	}

	public Path sampleVideo2Path() {
		return Paths.get(root.getAbsolutePath(), "folderA/folderB/pexels-mikhail-nilov-7626566.mp4");
	}

	public Path sampleVideo3Path() {
		return Paths.get(root.getAbsolutePath(), "folderA/folderC/pexels-fauxels-group-of-friends-smiling-3248275.mp4");
	}

	public Path sampleImage1Path() {
		return Paths.get(root.getAbsolutePath(), "folderA/pexels-photo-2379005.jpeg");
	}

}
