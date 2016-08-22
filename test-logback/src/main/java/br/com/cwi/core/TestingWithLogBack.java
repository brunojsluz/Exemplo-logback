package br.com.cwi.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestingWithLogBack {

	private final Logger logger = LoggerFactory.getLogger(TestingWithLogBack.class);

	public void testTrace() {
		logger.trace("Testing trace");
	}

	public void testDebug() {
		logger.debug("Testing debug");
	}

	public void testInfo() {
		logger.info("Testing info");
	}

	public void testWarn() {
		logger.warn("Testing warn");
	}

	public void testError() {
		logger.error("Testing error");
	}

	public static void main(String[] args) {

		TestingWithLogBack testing = new TestingWithLogBack();

		for (int i = 0; i < 40000; i++) {
			testing.testTrace();
			testing.testDebug();
			testing.testInfo();
			testing.testWarn();
			testing.testError();
		}

	}

}
