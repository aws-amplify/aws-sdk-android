/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Locale;

/**
 * Utilities for converting objects to strings.
 */
public class StringUtils {

    private static final String DEFAULT_ENCODING = "UTF-8";

    /** UTF8. */
    public static final Charset UTF8 = Charset.forName(DEFAULT_ENCODING);

    /**
     * Converts object to Integer.
     * @param value object value.
     * @return Integer.
     */
    public static Integer toInteger(StringBuilder value) {
        return Integer.parseInt(value.toString());
    }

    /**
     * Converts object to string.
     * @param value object value.
     * @return String.
     */
    public static String toString(StringBuilder value) {
        return value.toString();
    }

    /**
     * Converts
     * @param value object value.
     * @return Boolean.
     */
    public static Boolean toBoolean(StringBuilder value) {
        return Boolean.getBoolean(value.toString());
    }

    /**
     * Converts Integer to String.
     * @param value Integer value.
     * @return String.
     */
    public static String fromInteger(Integer value) {
        return Integer.toString(value);
    }

    /**
     * Converts Long to String.
     * @param value Long value.
     * @return String.
     */
    public static String fromLong(Long value) {
        return Long.toString(value);
    }

    /**
     * Converts String to String.
     * @param value String value.
     * @return String.
     */
    public static String fromString(String value) {
        return value;
    }

    /**
     * Converts Boolean to String.
     * @param value Boolean value.
     * @return String.
     */
    public static String fromBoolean(Boolean value) {
        return Boolean.toString(value);
    }

    /**
     * Converts BigInteger to String.
     * @param value BigInteger value.
     * @return String.
     */
    public static String fromBigInteger(BigInteger value) {
        return value.toString();
    }

    /**
     * Converts BigDecimal to String.
     * @param value Big Decimal value.
     * @return String.
     */
    public static String fromBigDecimal(BigDecimal value) {
        return value.toString();
    }

    /**
     * Converts from String to BigInteger.
     * @param s String value.
     * @return BigInteger.
     */
    public static BigInteger toBigInteger(String s) {
        return new BigInteger(s);
    }

    /**
     * Converts from String to BigDecimal.
     * @param s String value.
     * @return BigDecimal.
     */
    public static BigDecimal toBigDecimal(String s) {
        return new BigDecimal(s);
    }

    /**
     * Converts Float to String.
     * @param value Float value.
     * @return String.
     */
    public static String fromFloat(Float value) {
        return Float.toString(value);
    }

    /**
     * Converts the specified date to an ISO 8601 timestamp string and returns
     * it.
     *
     * @param value The date to format as an ISO 8601 timestamp string.
     * @return An ISO 8601 timestamp string created from the specified date.
     */
    public static String fromDate(Date value) {
        return DateUtils.formatISO8601Date(value);
    }

    /**
     * Returns the string representation of the specified double.
     *
     * @param d The double to represent as a string.
     * @return The string representation of the specified double.
     */
    public static String fromDouble(Double d) {
        return Double.toString(d);
    }

    /**
     * Returns the string representation of the specified Byte.
     *
     * @param b The Byte to represent as a string.
     * @return The string representation of the specified Byte.
     */
    public static String fromByte(Byte b) {
        return Byte.toString(b);
    }

    /**
     * Base64 encodes the data in the specified byte buffer and returns it as a
     * base64 encoded string.
     *
     * @param byteBuffer The data to base64 encode and return as a string.
     * @return The base64 encoded contents of the specified byte buffer.
     */
    public static String fromByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return Base64.encodeAsString(byteBuffer.array());
        }
        final byte[] binaryData = new byte[byteBuffer.limit()];
        byteBuffer.get(binaryData);
        return Base64.encodeAsString(binaryData);
    }

    /**
     * Finds partToMatch in original string and replaces.
     * @param originalString original string.
     * @param partToMatch string to match.
     * @param replacement string to replace with.
     * @return replaced string.
     */
    public static String replace(String originalString, String partToMatch, String replacement) {
        StringBuffer buffer = new StringBuffer(originalString.length());
        buffer.append(originalString);

        int indexOf = buffer.indexOf(partToMatch);
        while (indexOf != -1) {
            buffer = buffer.replace(indexOf, indexOf + partToMatch.length(), replacement);
            indexOf = buffer.indexOf(partToMatch);
        }

        return buffer.toString();
    }

    /**
     * Joins the strings in parts with joiner between each string
     *
     * @param joiner the string to insert between the strings in parts
     * @param parts the parts to join
     * @return joined string.
     */
    public static String join(String joiner, String... parts) {
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            builder.append(parts[i]);
            if (i < parts.length - 1) {
                builder.append(joiner);
            }
        }
        return builder.toString();
    }

    /**
     * Converts a string to lower case with Locale.ENGLISH.
     *
     * @param str the string to lower case
     * @return the lower case of the string, or null if the string is null
     */
    public static String lowerCase(String str) {
        if (str == null) {
            return null;
        } else if (str.isEmpty()) {
            return "";
        } else {
            return str.toLowerCase(Locale.ENGLISH);
        }
    }

    /**
     * Converts a string to upper case with Locale.ENGLISH.
     *
     * @param str the string to upper case
     * @return the upper case of the string, or null if the string is null
     */
    public static String upperCase(String str) {
        if (str == null) {
            return null;
        } else if (str.isEmpty()) {
            return "";
        } else {
            return str.toUpperCase(Locale.ENGLISH);
        }
    }

    /**
     * Checks if a CharSequence is whitespace, empty ("") or null.
     *
     * @param cs the CharSequence to check, may be null
     * @return if the CharSequence is null, empty or whitespace
     */
    @SuppressWarnings("checkstyle:innerassignment")
    public static boolean isBlank(final CharSequence cs) {
        int strLen;
        if (cs == null || (strLen = cs.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
