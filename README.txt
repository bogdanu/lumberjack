Lumberjack
==========

This is an extension to the Simple Logging Facade for Java (SLF4J) library that enhances it by adding
support for Java Varargs logging methods. This library requires Java version 1.5 or later.

The library provides a JackLogger interface that extends org.slf4j.Logger and in addition
it defines varargs log methods. The JackLogger objects are created with the JackLoggerFactory.


Example usage
-------------

JackLogger logger = JackLoggerFactory.getLogger(LoggerFactory.getLogger(Weather.class));
logger.info("Hello {}! The current time is {}:{}:{}, and after {} hours the weather will be {}.", "Jack", 13, 30, 0, 5, "sunny");


Web site
--------

https://github.com/bogdanu/lumberjack#lumberjack


Report bugs
-----------

Found a bug? Please file an issue at https://github.com/bogdanu/lumberjack/issues


Mailing list
------------

If you have questions or comments please send an email to lumberjack-project@googlegroups.com, or you can subscribe
to the mailing list http://groups.google.com/group/lumberjack-project

