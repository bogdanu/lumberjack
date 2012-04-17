Lumberjack

This is an extension to the Simple Logging Facade for Java (SLF4J) library that enhances it by adding
support for Java Varargs logging methods. This library requires Java version 1.5 or later.

The library provides a JackLogger interface that extends org.slf4j.Logger and in addition
it defines varargs log methods. The JackLogger objects are created with the JackLoggerFactory.

Example usage:

JackLogger logger = JackLoggerFactory.getLogger(LoggerFactory.getLogger(Weather.class));
logger.info("Hello {}! The current time is {}:{}:{}, and after {} hours the weather will be {}.", "Jack", 13, 30, 0, 5, "sunny");