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

public class JackLoggerImplTest {

    private Logger logger;
    private JackLogger jackLogger;

    private String format = "{}+{}+{}";

    private Object arg1 = new Object();
    private Object arg2 = new Object();
    private Object arg3 = new Object();
    private Object[] argArray = new Object[] { arg1, arg2, arg3 };

    @Before
    public void setUp() throws Exception {
        logger = mock(Logger.class);
        jackLogger = JackLoggerFactory.getLogger(logger);
    }
    
    @Test
    public void testTraceVarargs() {
        when(logger.isTraceEnabled()).thenReturn(true);
        jackLogger.trace(format, arg1, arg2, arg3);
        verify(logger).trace(format, argArray);
        reset(logger);
        when(logger.isTraceEnabled()).thenReturn(false);
        jackLogger.trace(format, arg1, arg2, arg3);
        verify(logger, never()).trace(format, argArray);
    }

    @Test
    public void testDebugVarargs() {
        when(logger.isDebugEnabled()).thenReturn(true);
        jackLogger.debug(format, arg1, arg2, arg3);
        verify(logger).debug(format, argArray);
        reset(logger);
        when(logger.isDebugEnabled()).thenReturn(false);
        jackLogger.debug(format, arg1, arg2, arg3);
        verify(logger, never()).debug(format, argArray);
    }

    @Test
    public void testInfoVarargs() {
        when(logger.isInfoEnabled()).thenReturn(true);
        jackLogger.info(format, arg1, arg2, arg3);
        verify(logger).info(format, argArray);
        reset(logger);
        when(logger.isInfoEnabled()).thenReturn(false);
        jackLogger.info(format, arg1, arg2, arg3);
        verify(logger, never()).info(format, argArray);
    }

    @Test
    public void testWarnVarargs() {
        when(logger.isWarnEnabled()).thenReturn(true);
        jackLogger.warn(format, arg1, arg2, arg3);
        verify(logger).warn(format, argArray);
        reset(logger);
        when(logger.isWarnEnabled()).thenReturn(false);
        jackLogger.warn(format, arg1, arg2, arg3);
        verify(logger, never()).warn(format, argArray);
    }

    @Test
    public void testErrorVarargs() {
        when(logger.isErrorEnabled()).thenReturn(true);
        jackLogger.error(format, arg1, arg2, arg3);
        verify(logger).error(format, argArray);
        reset(logger);
        when(logger.isErrorEnabled()).thenReturn(false);
        jackLogger.error(format, arg1, arg2, arg3);
        verify(logger, never()).error(format, argArray);
    }

}
