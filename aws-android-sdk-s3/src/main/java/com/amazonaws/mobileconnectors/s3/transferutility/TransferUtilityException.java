/**
 * Copyright 2019-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * <p>
 * http://aws.amazon.com/apache2.0
 * <p>
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.s3.transferutility;

/**
 * Checked Exception thrown by TransferUtility
 */
public class TransferUtilityException extends Exception {
    /**
     * Default constructor.
     */
    public TransferUtilityException() {
        super();
    }

    /**
     * @param message the exception message.
     */
    public TransferUtilityException(final String message) {
        super(message);
    }

    /**
     * @param message the exception message.
     * @param cause the throwable object that contains the cause.
     */
    public TransferUtilityException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * @param cause the throwable object that contains the cause
     */
    public TransferUtilityException(final Throwable cause) {
        super(cause);
    }
}
