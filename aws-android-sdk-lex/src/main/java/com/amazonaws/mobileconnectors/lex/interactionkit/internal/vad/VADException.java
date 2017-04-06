/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.lex.interactionkit.internal.vad;

import com.amazonaws.AmazonClientException;

/**
 * An exception thrown from a Voice Activity Detection module.
 */
public class VADException extends AmazonClientException {

    /**
     * Generated serial UID.
     */
    private static final long serialVersionUID = -6299168403661684245L;

    /**
     * @param detailMessage the message of the exception.
     */
    public VADException(final String detailMessage) {
        super(detailMessage);
    }

    /**
     * @param throwable the underlying cause of the exception.
     */
    public VADException(final Throwable throwable) {
        super(throwable);
    }

    /**
     * @param detailMessage the message of the exception.
     * @param throwable the underlying cause of the exception.
     */
    public VADException(final String detailMessage, final Throwable throwable) {
        super(detailMessage, throwable);
    }
}
