/*
 * Copyright 2017-2022 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.cognito.clientcontext.data;

import java.nio.charset.Charset;

/**
 * It provides constants that defines configuration for the library. These
 * constants are used in multiple classes within the library.
 */
public class ConfigurationConstant {

    /**
     * Default CHARSET used while generating byte array.
     */
    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
}