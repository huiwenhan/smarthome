/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.io.console;

/**
 * This interface must be implemented by consoles which want to use the {@link ConsoleInterpreter}.
 * It allows basic output commands.
 *
 * @author Kai Kreuzer - Initial contribution and API
 *
 */
public interface Console {

    public void print(String s);

    public void println(String s);

    /**
     * usage output is treated differently from other output as it might
     * differ between different kinds of consoles
     *
     * @param s the main usage string (console independent)
     */
    public void printUsage(String s);
}
