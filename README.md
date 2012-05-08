# Lumberjack

This is an extension to the Simple Logging Facade for Java (SLF4J) library that enhances it by adding
support for Java Varargs logging methods. This library requires Java version 1.5 or later.

The library provides a JackLogger interface that extends org.slf4j.Logger and in addition
it defines varargs log methods. The JackLogger objects are created with the JackLoggerFactory.

## Example usage

```java
JackLogger logger = JackLoggerFactory.getLogger(LoggerFactory.getLogger(Weather.class));

logger.info("Hello {}! The current time is {}:{}:{}, and after {} hours the weather will be {}.", "Jack", 13, 30, 0, 5, "sunny");
```

## Javadoc

http://bogdanu.github.com/lumberjack/

## Maven usage

To use Lumberjack in your project just add the following dependency to the <dependencies /> section in your pom.xml file:

```xml
<dependency>
    <groupId>gg.pistol</groupId>
    <artifactId>lumberjack</artifactId>
    <version>0.0.2</version>
</dependency>
```

