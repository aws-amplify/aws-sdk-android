/**
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.pinpoint.internal.validate;

import java.io.UnsupportedEncodingException;

public class EncodingValidator {

    private final String encoding;

    public EncodingValidator(final String encoding) {
        this.encoding = encoding;
    }

    public void validate() {
        String testString = "!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
        try {
            testString.getBytes(encoding);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(encoding + " encoding is not supported", e);
        }
    }
}
