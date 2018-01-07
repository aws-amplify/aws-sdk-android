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

package com.amazonaws.mobileconnectors.lex.interactionkit.internal.audio.encoder;

import com.amazonaws.AmazonClientException;

/**
 * Exceptions thrown when there's an error during AudioEncoder operations.
 */
public class AudioEncoderException extends AmazonClientException {

    /**
     * Generated serial version UID.
     */
    private static final long serialVersionUID = -4016454290306351776L;

    /**
     * Create an AudioEncoderException with a message.
     * @param detailMessage the message.
     */
    public AudioEncoderException(final String detailMessage) {
        super(detailMessage);
    }

    /**
     * Create an AudioEncoderException with an exception cause.
     * @param throwable the cause of the exception.
     */
    public AudioEncoderException(final Throwable throwable) {
        super(throwable);
    }

    /**
     * Create an AudioEncoderException with a message and an exception cause.
     * @param detailMessage the message
     * @param throwable the cause of the exception.
     */
    public AudioEncoderException(final String detailMessage, final Throwable throwable) {
        super(detailMessage, throwable);
    }
}
