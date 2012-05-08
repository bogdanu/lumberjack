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

http://bogdanu.github.com/lumberjack/javadoc/

## Maven usage

To use Lumberjack in your project just add the following dependency to the &lt;dependencies /&gt; section
in your pom.xml file.

```xml
<dependency>
    <groupId>gg.pistol</groupId>
    <artifactId>lumberjack</artifactId>
    <version>0.0.2</version>
</dependency>
```

## Download

If you prefer to manually include the JAR dependencies in your project's classpath, then you can download the following
Lumberjack archive.

Download latest release: https://github.com/downloads/bogdanu/lumberjack/lumberjack-0.0.2.zip

Lumberjack uses and depends on the SLF4J project, so you will also need to include in the classpath the SLF4J JARs.

## Report bugs

Found a bug? Please file an issue at https://github.com/bogdanu/lumberjack/issues

## Mailing list

If you have questions or comments please send an email to lumberjack-project@googlegroups.com, or you can subscribe
to the mailing list http://groups.google.com/group/lumberjack-project

## License

Lumberjack is licensed under the MIT license, the same license used by the SLF4J project. This means that there are
no additional restrictions to use Lumberjack.

The full text of the license terms is available at https://raw.github.com/bogdanu/lumberjack/master/LICENSE.txt

