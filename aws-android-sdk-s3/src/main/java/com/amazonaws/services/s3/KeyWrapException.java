/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3;

/**
 * Key wrapping related security exception.
 */
public class KeyWrapException extends SecurityException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     */
    public KeyWrapException() {
        super();
    }

    /**
     * Constructor.
     *
     * @param message the error message.
     */
    public KeyWrapException(String message) {
        super(message);
    }

    /**
     * Constructor.
     *
     * @param message the error message.
     * @param cause the error cause.
     */
    public KeyWrapException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor.
     *
     * @param cause the error cause.
     */
    public KeyWrapException(Throwable cause) {
        super(cause);
    }
}
