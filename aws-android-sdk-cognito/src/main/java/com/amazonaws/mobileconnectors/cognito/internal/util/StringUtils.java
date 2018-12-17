/**
 * Copyright 2013-2018 Amazon.com, 
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

package com.amazonaws.mobileconnectors.cognito.internal.util;

import java.nio.charset.Charset;

/**
 * A utility class of String objects.
 * @deprecated The Amazon Cognito Sync SDK for Android is deprecated as of release 2.9.0. Please use the AWS AppSync SDK for Android along with AWS AppSync service instead.
 */
@Deprecated
public final class StringUtils {
    /**
     * UTF-8 {@link Charset}
     */
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    /**
     * Calculates the byte length of a UTF-8 encoded string. 0 if the string is
     * null.
     * 
     * @param string string to be computed
     * @return byte length of a UTF-8 string in bytes, 0 if null.
     */
    public static long utf8ByteLength(String string) {
        if (string == null) {
            return 0;
        }
        return string.getBytes(UTF_8).length;
    }

    /**
     * Checks whether a String is empty.
     * 
     * @param string a string to check
     * @return true if the string is null or empty, false otherwise
     */
    public static boolean isEmpty(String string) {
        return string == null || string.trim().isEmpty();
    }

    /**
     * Compares two Strings. Returns true if both are null or have the same
     * string value.
     * 
     * @param s1 first string, can be null
     * @param s2 second string, can be null
     * @return true if both are null or have the same string value, false
     *         otherwise
     */
    public static boolean equals(String s1, String s2) {
        if (s1 == null) {
            return s2 == null;
        } else {
            return s1.equals(s2);
        }
    }
}
