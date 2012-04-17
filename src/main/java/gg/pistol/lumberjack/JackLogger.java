/*
 * Copyright (c) 2012 Bogdan Pistol
 * All rights reserved.
 *
 * Permission is hereby granted, free  of charge, to any person obtaining
 * a  copy  of this  software  and  associated  documentation files  (the
 * "Software"), to  deal in  the Software without  restriction, including
 * without limitation  the rights to  use, copy, modify,  merge, publish,
 * distribute,  sublicense, and/or sell  copies of  the Software,  and to
 * permit persons to whom the Software  is furnished to do so, subject to
 * the following conditions:
 *
 * The  above  copyright  notice  and  this permission  notice  shall  be
 * included in all copies or substantial portions of the Software.
 *
 * THE  SOFTWARE IS  PROVIDED  "AS  IS", WITHOUT  WARRANTY  OF ANY  KIND,
 * EXPRESS OR  IMPLIED, INCLUDING  BUT NOT LIMITED  TO THE  WARRANTIES OF
 * MERCHANTABILITY,    FITNESS    FOR    A   PARTICULAR    PURPOSE    AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE,  ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package gg.pistol.lumberjack;

import org.slf4j.Logger;

/**
 * Extension of {@link org.slf4j.Logger} that enables the use of varargs for logging methods.
 * <p>
 * Example usage:
 * 
 * <pre>
 * JackLogger logger = JackLoggerFactory.getLogger(LoggerFactory.getLogger(Weather.class));
 * logger.info("Hello {}! The current time is {}:{}:{}, and after {} hours the weather will be {}.", "Jack", 13, 30, 0, 5, "sunny");
 * </pre>
 * 
 * @author Bogdan Pistol
 */
public interface JackLogger extends Logger {

    /**
     * Log a message at the TRACE level according to the specified format and arguments.
     * 
     * @param format
     *            the way to set out the arguments
     * @param arg1
     *            the first of the argument series
     * @param arg2
     *            the seconds of the argument series
     * @param otherArgs
     *            the rest of the argument series
     */
    void trace(String format, Object arg1, Object arg2, Object... otherArgs);

    /**
     * Log a message at the DEBUG level according to the specified format and arguments.
     * 
     * @param format
     *            the way to set out the arguments
     * @param arg1
     *            the first of the argument series
     * @param arg2
     *            the seconds of the argument series
     * @param otherArgs
     *            the rest of the argument series
     */
    void debug(String format, Object arg1, Object arg2, Object... otherArgs);

    /**
     * Log a message at the INFO level according to the specified format and arguments.
     * 
     * @param format
     *            the way to set out the arguments
     * @param arg1
     *            the first of the argument series
     * @param arg2
     *            the seconds of the argument series
     * @param otherArgs
     *            the rest of the argument series
     */
    void info(String format, Object arg1, Object arg2, Object... otherArgs);

    /**
     * Log a message at the WARN level according to the specified format and arguments.
     * 
     * @param format
     *            the way to set out the arguments
     * @param arg1
     *            the first of the argument series
     * @param arg2
     *            the seconds of the argument series
     * @param otherArgs
     *            the rest of the argument series
     */
    void warn(String format, Object arg1, Object arg2, Object... otherArgs);

    /**
     * Log a message at the ERROR level according to the specified format and arguments.
     * 
     * @param format
     *            the way to set out the arguments
     * @param arg1
     *            the first of the argument series
     * @param arg2
     *            the seconds of the argument series
     * @param otherArgs
     *            the rest of the argument series
     */
    void error(String format, Object arg1, Object arg2, Object... otherArgs);

}
