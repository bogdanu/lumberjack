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

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.Marker;

public class AbstractJackLoggerTest {

    private Logger logger;
    private Marker marker;
    private JackLogger jackLogger;

    private String format = "foo";
    private Object arg1 = new Object();
    private Object arg2 = new Object();
    private Object[] argArray = new Object[] { arg1, arg2 };
    private Throwable throwable = new Throwable();

    @Before
    public void setUp() throws Exception {
        logger = mock(Logger.class);
        marker = mock(Marker.class);
        jackLogger = JackLoggerFactory.getLogger(logger);
    }

    @Test
    public void testGetName() {
        jackLogger.getName();
        verify(logger).getName();
    }

    @Test
    public void testIsTraceEnabled() {
        jackLogger.isTraceEnabled();
        verify(logger).isTraceEnabled();
        reset(logger);
        jackLogger.isTraceEnabled(marker);
        verify(logger).isTraceEnabled(marker);
    }

    @Test
    public void testTrace() {
        jackLogger.trace(format);
        verify(logger).trace(format);
        reset(logger);
        jackLogger.trace(format, arg1);
        verify(logger).trace(format, arg1);
        reset(logger);
        jackLogger.trace(format, arg1, arg2);
        verify(logger).trace(format, arg1, arg2);
        reset(logger);
        jackLogger.trace(format, argArray);
        verify(logger).trace(format, argArray);
        reset(logger);
        jackLogger.trace(format, throwable);
        verify(logger).trace(format, throwable);
        reset(logger);
        jackLogger.trace(marker, format);
        verify(logger).trace(marker, format);
        reset(logger);
        jackLogger.trace(marker, format, arg1);
        verify(logger).trace(marker, format, arg1);
        reset(logger);
        jackLogger.trace(marker, format, arg1, arg2);
        verify(logger).trace(marker, format, arg1, arg2);
        reset(logger);
        jackLogger.trace(marker, format, argArray);
        verify(logger).trace(marker, format, argArray);
        reset(logger);
        jackLogger.trace(marker, format, throwable);
        verify(logger).trace(marker, format, throwable);
    }

    @Test
    public void testIsDebugEnabled() {
        jackLogger.isDebugEnabled();
        verify(logger).isDebugEnabled();
        reset(logger);
        jackLogger.isDebugEnabled(marker);
        verify(logger).isDebugEnabled(marker);
    }

    @Test
    public void testDebug() {
        jackLogger.debug(format);
        verify(logger).debug(format);
        reset(logger);
        jackLogger.debug(format, arg1);
        verify(logger).debug(format, arg1);
        reset(logger);
        jackLogger.debug(format, arg1, arg2);
        verify(logger).debug(format, arg1, arg2);
        reset(logger);
        jackLogger.debug(format, argArray);
        verify(logger).debug(format, argArray);
        reset(logger);
        jackLogger.debug(format, throwable);
        verify(logger).debug(format, throwable);
        reset(logger);
        jackLogger.debug(marker, format);
        verify(logger).debug(marker, format);
        reset(logger);
        jackLogger.debug(marker, format, arg1);
        verify(logger).debug(marker, format, arg1);
        reset(logger);
        jackLogger.debug(marker, format, arg1, arg2);
        verify(logger).debug(marker, format, arg1, arg2);
        reset(logger);
        jackLogger.debug(marker, format, argArray);
        verify(logger).debug(marker, format, argArray);
        reset(logger);
        jackLogger.debug(marker, format, throwable);
        verify(logger).debug(marker, format, throwable);
    }

    @Test
    public void testIsInfoEnabled() {
        jackLogger.isInfoEnabled();
        verify(logger).isInfoEnabled();
        reset(logger);
        jackLogger.isInfoEnabled(marker);
        verify(logger).isInfoEnabled(marker);
    }

    @Test
    public void testInfo() {
        jackLogger.info(format);
        verify(logger).info(format);
        reset(logger);
        jackLogger.info(format, arg1);
        verify(logger).info(format, arg1);
        reset(logger);
        jackLogger.info(format, arg1, arg2);
        verify(logger).info(format, arg1, arg2);
        reset(logger);
        jackLogger.info(format, argArray);
        verify(logger).info(format, argArray);
        reset(logger);
        jackLogger.info(format, throwable);
        verify(logger).info(format, throwable);
        reset(logger);
        jackLogger.info(marker, format);
        verify(logger).info(marker, format);
        reset(logger);
        jackLogger.info(marker, format, arg1);
        verify(logger).info(marker, format, arg1);
        reset(logger);
        jackLogger.info(marker, format, arg1, arg2);
        verify(logger).info(marker, format, arg1, arg2);
        reset(logger);
        jackLogger.info(marker, format, argArray);
        verify(logger).info(marker, format, argArray);
        reset(logger);
        jackLogger.info(marker, format, throwable);
        verify(logger).info(marker, format, throwable);
    }

    @Test
    public void testIsWarnEnabled() {
        jackLogger.isWarnEnabled();
        verify(logger).isWarnEnabled();
        reset(logger);
        jackLogger.isWarnEnabled(marker);
        verify(logger).isWarnEnabled(marker);
    }

    @Test
    public void testWarn() {
        jackLogger.warn(format);
        verify(logger).warn(format);
        reset(logger);
        jackLogger.warn(format, arg1);
        verify(logger).warn(format, arg1);
        reset(logger);
        jackLogger.warn(format, arg1, arg2);
        verify(logger).warn(format, arg1, arg2);
        reset(logger);
        jackLogger.warn(format, argArray);
        verify(logger).warn(format, argArray);
        reset(logger);
        jackLogger.warn(format, throwable);
        verify(logger).warn(format, throwable);
        reset(logger);
        jackLogger.warn(marker, format);
        verify(logger).warn(marker, format);
        reset(logger);
        jackLogger.warn(marker, format, arg1);
        verify(logger).warn(marker, format, arg1);
        reset(logger);
        jackLogger.warn(marker, format, arg1, arg2);
        verify(logger).warn(marker, format, arg1, arg2);
        reset(logger);
        jackLogger.warn(marker, format, argArray);
        verify(logger).warn(marker, format, argArray);
        reset(logger);
        jackLogger.warn(marker, format, throwable);
        verify(logger).warn(marker, format, throwable);
    }

    @Test
    public void testIsErrorEnabled() {
        jackLogger.isErrorEnabled();
        verify(logger).isErrorEnabled();
        reset(logger);
        jackLogger.isErrorEnabled(marker);
        verify(logger).isErrorEnabled(marker);
    }

    @Test
    public void testError() {
        jackLogger.error(format);
        verify(logger).error(format);
        reset(logger);
        jackLogger.error(format, arg1);
        verify(logger).error(format, arg1);
        reset(logger);
        jackLogger.error(format, arg1, arg2);
        verify(logger).error(format, arg1, arg2);
        reset(logger);
        jackLogger.error(format, argArray);
        verify(logger).error(format, argArray);
        reset(logger);
        jackLogger.error(format, throwable);
        verify(logger).error(format, throwable);
        reset(logger);
        jackLogger.error(marker, format);
        verify(logger).error(marker, format);
        reset(logger);
        jackLogger.error(marker, format, arg1);
        verify(logger).error(marker, format, arg1);
        reset(logger);
        jackLogger.error(marker, format, arg1, arg2);
        verify(logger).error(marker, format, arg1, arg2);
        reset(logger);
        jackLogger.error(marker, format, argArray);
        verify(logger).error(marker, format, argArray);
        reset(logger);
        jackLogger.error(marker, format, throwable);
        verify(logger).error(marker, format, throwable);
    }

}
