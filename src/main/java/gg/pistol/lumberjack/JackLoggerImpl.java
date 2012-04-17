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
 * Implementation of JackLogger that wraps a {@link org.slf4j.Logger} and uses it for logging.
 * 
 * @author Bogdan Pistol
 */
// package access
class JackLoggerImpl extends AbstractJackLogger {

    public JackLoggerImpl(Logger logger) {
        super();
        this.logger = logger;
    }

    @Override
    public void trace(String format, Object arg1, Object arg2, Object... otherArgs) {
        if (logger.isTraceEnabled()) { 
            logger.trace(format, createArray(arg1, arg2, otherArgs));
        }
    }

    @Override
    public void debug(String format, Object arg1, Object arg2, Object... otherArgs) {
        if (logger.isDebugEnabled()) {
            logger.debug(format, createArray(arg1, arg2, otherArgs));
        }
    }

    @Override
    public void info(String format, Object arg1, Object arg2, Object... otherArgs) {
        if (logger.isInfoEnabled()) {
            logger.info(format, createArray(arg1, arg2, otherArgs));
        }
    }

    @Override
    public void warn(String format, Object arg1, Object arg2, Object... otherArgs) {
        if (logger.isWarnEnabled()) {
            logger.warn(format, createArray(arg1, arg2, otherArgs));
        }
    }

    @Override
    public void error(String format, Object arg1, Object arg2, Object... otherArgs) {
        if (logger.isErrorEnabled()) {
            logger.error(format, createArray(arg1, arg2, otherArgs));
        }
    }

    private Object[] createArray(Object arg1, Object arg2, Object... otherArgs) {
        Object[] array = new Object[otherArgs.length + 2];
        array[0] = arg1;
        array[1] = arg2;
        System.arraycopy(otherArgs, 0, array, 2, otherArgs.length);
        return array;
    }

}
