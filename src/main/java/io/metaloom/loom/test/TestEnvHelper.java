package io.metaloom.loom.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import io.metaloom.test.container.provider.client.TestDatabaseProvider;
import io.metaloom.test.container.provider.common.config.ProviderConfig;

public final class TestEnvHelper {

	private TestEnvHelper() {
	}

	public static Testdata prepareTestdata(String name) throws IOException {
		File source = new File("src/test/resources/test-fs");
		File dest = new  File("target", "test-env-" + name);
		FileUtils.copyDirectory(source, dest);
		return new Testdata(dest);
	}
	
	public static ProviderConfig prepareProvider() {
		ProviderConfig config = new ProviderConfig();
		config.setProviderHost("localhost");
		config.setProviderPort(7543);
		config.getPostgresql().setPassword("sa");
		config.getPostgresql().setUsername("sa");
		config.getPostgresql().setDatabaseName("test");
		config.getPostgresql().setInternalHost("postgresql");
		config.getPostgresql().setInternalPort(5432);
		config.getPostgresql().setHost("localhost");
		config.getPostgresql().setPort(15432);
		TestDatabaseProvider.localConfig(config);
		return config;
	}
}
