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

package com.amazonaws.mobileconnectors.lex.interactionkit.utils;

/**
 * Represents the mode in which response from Amazon Lex service is expected.
 */

public enum ResponseType {
    // Expect text output.
    TEXT ("text/plain; charset=utf-8"),

    // Expect audio output.
    AUDIO_MPEG("audio/mpeg");

    private final String mimeType;

    private ResponseType(String mode) {
        mimeType = mode;
    }

    public boolean equals(String mode) {
        return mimeType.equals(mode);
    }

    public boolean equals(ResponseType mode) {
        return mode != null && mimeType.equals(mode.toString());
    }

    @Override
    public String toString() {
        return mimeType;
    }
}
