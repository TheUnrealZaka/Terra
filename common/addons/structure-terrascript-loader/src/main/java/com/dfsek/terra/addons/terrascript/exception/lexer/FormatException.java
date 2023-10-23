/*
 * Copyright (c) 2020-2021 Polyhedral Development
 *
 * The Terra Core Addons are licensed under the terms of the MIT License. For more details,
 * reference the LICENSE file in this module's root directory.
 */

package com.dfsek.terra.addons.terrascript.exception.lexer;

import java.io.Serial;

import com.dfsek.terra.addons.terrascript.lexer.SourcePosition;


public class FormatException extends TokenizerException {
    
    @Serial
    private static final long serialVersionUID = -791308012940744455L;
    
    public FormatException(String message, SourcePosition position) {
        super(message, position);
    }
    
    public FormatException(String message, SourcePosition position, Throwable cause) {
        super(message, position, cause);
    }
}