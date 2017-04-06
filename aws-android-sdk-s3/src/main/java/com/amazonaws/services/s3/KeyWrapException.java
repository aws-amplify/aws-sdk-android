/*
 * Copyright 2014-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

    public KeyWrapException() {
        super();
    }

    public KeyWrapException(String s) {
        super(s);
    }

    public KeyWrapException(String message, Throwable cause) {
        super(message, cause);
    }

    public KeyWrapException(Throwable cause) {
        super(cause);
    }
}
