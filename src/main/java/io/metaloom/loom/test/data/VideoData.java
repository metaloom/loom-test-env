package io.metaloom.loom.test.data;

import java.nio.file.Path;

import io.metaloom.utils.hash.ChunkHash;
import io.metaloom.utils.hash.MD5;
import io.metaloom.utils.hash.SHA256;
import io.metaloom.utils.hash.SHA512;

public interface VideoData extends TestData{

	default Path sampleVideoPath() {
		return root().resolve("folderA/folderB/pexels-jack-sparrow-5977265.mp4");
	}
	
	default  Path sampleVideo2Path() {
		return root().resolve("folderA/folderB/pexels-mikhail-nilov-7626566.mp4");
	}
	
	default  Path sampleVideo3Path() {
		return root().resolve("folderA/folderC/pexels-fauxels-group-of-friends-smiling-3248275.mp4");
	}

	default  SHA512 sampleVideoSHA512() {
		return SHA512SUM;
	}

	default  MD5 sampleVideoMD5() {
		return MD5SUM;
	}

	default  String sampleVideoFingerprint() {
		return VIDEO_FINGERPRINT_STR;
	}

	default  ChunkHash sampleVideoChunkHash() {
		return VIDEO_CHUNK_HASH;
	}

	default  SHA256 sampleVideoSHA256() {
		return SHA256SUM;
	}

}
