package me.boukadi.creational.factorymethod;

public class FileLoggerFactory extends LoggerFactory {
	@Override
	public Logger getLogger() {
		return new FileLogger();
	}
	
}
