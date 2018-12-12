/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Set;

/**
 * String utility methods.
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public final class StringUtil {
    public static final String UTF_8 = "UTF-8";

    /**
     * Default constructor
     */
    private StringUtil() {
    }

    /**
     * Determines if a string is null or zero-length.
     *
     * @param string a string
     * @return true if the argument is null or zero-length, otherwise false
     */
    public static boolean isNullOrEmpty(final String string) {
        return string == null || string.length() == 0;
    }

    public static boolean isBlank(final String string) {
        return string == null || string.trim().length() == 0;
    }

    /**
     * Converts an input stream into a string value.
     *
     * @param is an input stream
     * @return a string containing the content of the input stream
     * @throws IOException upon a failure reading the input stream
     */
    public static String convertStreamToString(final InputStream is, final Charset charset)
            throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(is, charset));
        final StringBuilder sb = new StringBuilder();
        String line = null;
        while ((line = br.readLine()) != null) {
            sb.append(line + "\n");
        }
        br.close();
        return sb.toString();
    }

    /**
     * Converts an input stream into a string value.
     *
     * @param is an input stream
     * @return a string containing the content of the input stream
     * @throws IOException upon a failure reading the input stream
     */
    public static String convertStreamToUTF8String(final InputStream is) throws IOException {
        return convertStreamToString(is, Charset.forName(UTF_8));
    }

    /**
     * Reduces the input string to the number of chars, or its length if the
     * number of chars exceeds the input string's length
     *
     * @param input The string to clip
     * @param numChars the number of leading chars to keep (all others will be
     *            removed)
     * @return: the clipped string
     */
    public static String clipString(String input, int numChars, boolean appendEllipses) {
        int end = Math.min(numChars, input.length());
        String output = input.substring(0, end);
        if (appendEllipses) {
            output = (output.length() < input.length()) ? output + "..." : output;
        }
        return output;
    }

    public static String convertArrayToString(String[] stringArr) {
        if (stringArr == null) {
            return "";
        }

        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < stringArr.length; i++) {
            if (i > 0) {
                ret.append(",");
            }
            ret.append("'" + stringArr[i] + "'");
        }
        return ret.toString();
    }

    public static String convertSetToString(Set<String> stringSet) {
        if (stringSet == null) {
            return "";
        }

        StringBuilder ret = new StringBuilder();
        for (String str : stringSet) {
            if (ret.length() > 0) {
                ret.append(",");
            }
            ret.append("'" + str + "'");
        }
        return ret.toString();
    }

    /**
     * Trims string to its last X characters. If string is too short, is padded
     * at the front with given char
     *
     * @param str - string to trim
     * @param len - length of desired string. (must be positive)
     * @param pad - character to pad with
     */
    public static String trimOrPadString(String str, int len, char pad) {
        if (len < 0) {
            len = 0;
        }
        if (str == null) {
            str = "";
        }

        StringBuffer s = new StringBuffer();
        if (str.length() > len - 1) {
            s.append(str.substring(str.length() - len));
        } else {
            for (int i = 0; i < len - str.length(); i++) {
                s.append(pad);
            }
            s.append(str);
        }

        return s.toString();
    }
}
