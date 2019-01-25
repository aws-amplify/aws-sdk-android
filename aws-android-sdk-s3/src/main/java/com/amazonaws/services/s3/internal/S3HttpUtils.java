/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.internal;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class S3HttpUtils {

    private static final String DEFAULT_ENCODING = "UTF-8";

    /**
     * Regex which matches any of the sequences that we need to fix up after
     * URLEncoder.encode().
     */
    private static final Pattern ENCODED_CHARACTERS_PATTERN;
    static {
        final StringBuilder pattern = new StringBuilder();

        pattern
                .append(Pattern.quote("+"))
                .append("|")
                .append(Pattern.quote("*"))
                .append("|")
                .append(Pattern.quote("%7E"))
                .append("|")
                .append(Pattern.quote("%2F"))
                .append("|")
                .append(Pattern.quote("%3A"))
                .append("|")
                .append(Pattern.quote("%27"))
                .append("|")
                .append(Pattern.quote("%28"))
                .append("|")
                .append(Pattern.quote("%29"))
                .append("|")
                .append(Pattern.quote("%21"))
                .append("|")
                .append(Pattern.quote("%5B"))
                .append("|")
                .append(Pattern.quote("%5D"))
                .append("|")
                .append(Pattern.quote("%24"));

        ENCODED_CHARACTERS_PATTERN = Pattern.compile(pattern.toString());
    }

    /**
     * Encode the URL String or part of URL
     *
     * @param value Entire or part of the URL
     * @param path True if value is a path
     * @return The encoded string
     */
    public static String urlEncode(final String value, final boolean path) {
        if (value == null) {
            return "";
        }

        try {
            final String encoded = URLEncoder.encode(value, DEFAULT_ENCODING);

            final Matcher matcher = ENCODED_CHARACTERS_PATTERN.matcher(encoded);
            final StringBuffer buffer = new StringBuffer(encoded.length());

            while (matcher.find()) {
                String replacement = matcher.group(0);

                if ("+".equals(replacement)) {
                    replacement = " ";
                } else if ("*".equals(replacement)) {
                    replacement = "%2A";
                } else if ("%7E".equals(replacement)) {
                    replacement = "~";
                } else if (path && "%2F".equals(replacement)) {
                    replacement = "/";
                } else if (path && "%3A".equals(replacement)) {
                    replacement = ":";
                } else if (path && "%27".equals(replacement)) {
                    replacement = "'";
                } else if (path && "%28".equals(replacement)) {
                    replacement = "(";
                } else if (path && "%29".equals(replacement)) {
                    replacement = ")";
                } else if (path && "%21".equals(replacement)) {
                    replacement = "!";
                } else if (path && "%5B".equals(replacement)) {
                    replacement = "[";
                } else if (path && "%5D".equals(replacement)) {
                    replacement = "]";
                }
                matcher.appendReplacement(buffer, replacement);
            }

            matcher.appendTail(buffer);
            return buffer.toString();

        } catch (final UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Decode a string for use in the path of a URL; uses URLDecoder.decode,
     * which decodes a string for use in the query portion of a URL.
     *
     * @param value The value to decode
     * @return The decoded value if parameter is not null, otherwise, null is
     *         returned.
     */
    public static String urlDecode(final String value) {
        if (value == null) {
            return null;
        }

        try {
            return URLDecoder.decode(value, DEFAULT_ENCODING);
        } catch (final UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }

}
