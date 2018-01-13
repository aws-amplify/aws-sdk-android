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

package com.amazonaws.mobileconnectors.lex.interactionkit.internal.audio;

import com.amazonaws.AmazonClientException;

/**
 * Exceptions thrown when there'a an error during AudioSource operations.
 */
public class AudioSourceException extends AmazonClientException {

    /**
     * Create an AudioSourceException with a message.
     * @param detailMessage the message.
     */
    public AudioSourceException(final String detailMessage) {
        super(detailMessage);
    }

    /**
     * Create an AudioSourceException with an exception cause.
     * @param throwable the cause of the exception.
     */
    public AudioSourceException(final Throwable throwable) {
        super(throwable);
    }

    /**
     * Create an AudioSourceException with a message and an exception cause.
     * @param detailMessage the message.
     * @param throwable the cause of the exception.
     */
    public AudioSourceException(final String detailMessage, final Throwable throwable) {
        super(detailMessage, throwable);
    }
}
