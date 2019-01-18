/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Portions copyright 2006-2009 James Murty. Please see LICENSE.txt
 * for applicable license terms and NOTICE.txt for applicable notices.
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

package com.amazonaws.services.s3.internal;

import com.amazonaws.Request;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.ResponseHeaderOverrides;
import com.amazonaws.util.StringUtils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Utilities useful for REST/HTTP S3Service implementations.
 */
public class RestUtils {
    /**
     * The set of request parameters which must be included in the canonical
     * string to sign.
     */
    private static final List<String> SIGNED_PARAMETERS = Arrays.asList(new String[] {
        "acl", "torrent", "logging", "location", "policy", "requestPayment", "versioning",
        "versions", "versionId", "notification", "uploadId", "uploads", "partNumber", "website",
        "delete", "lifecycle", "tagging", "cors", "restore", "replication", "accelerate",
        "inventory", "analytics", "metrics",
        ResponseHeaderOverrides.RESPONSE_HEADER_CACHE_CONTROL,
        ResponseHeaderOverrides.RESPONSE_HEADER_CONTENT_DISPOSITION,
        ResponseHeaderOverrides.RESPONSE_HEADER_CONTENT_ENCODING,
        ResponseHeaderOverrides.RESPONSE_HEADER_CONTENT_LANGUAGE,
        ResponseHeaderOverrides.RESPONSE_HEADER_CONTENT_TYPE,
        ResponseHeaderOverrides.RESPONSE_HEADER_EXPIRES,
    });

    /**
     * Calculate the canonical string for a REST/HTTP request to S3. When
     * expires is non-null, it will be used instead of the Date header.
     *
     * @param method the HTTP verb.
     * @param resource the HTTP-encoded resource path.
     * @param request the request to be canonicalized.
     * @param expires when expires is non-null,
     *                it will be used instead of the Date header.
     * @param <T> the class type of the request.
     * @return The canonical string representation for the given S3 request.
     */
    public static <T> String makeS3CanonicalString(String method,
            String resource, Request<T> request, String expires) {
        return makeS3CanonicalString(method, resource, request, expires, null);
    }

    /**
     * Calculate the canonical string for a REST/HTTP request to S3.
     *
     * @param method
     *            The HTTP verb.
     * @param resource
     *            The HTTP-encoded resource path.
     * @param request
     *            The request to be canonicalized.
     * @param expires
     *            When expires is non-null, it will be used instead of the Date
     *            header.
     * @param <T> the class type of the request.
     * @param additionalQueryParamsToSign
     *            A collection of user-specified query parameters that should be
     *            included in the canonical request, in addition to those
     *            default parameters that are always signed.
     * @return The canonical string representation for the given S3 request.
     */
    public static <T> String makeS3CanonicalString(String method,
            String resource, Request<T> request, String expires,
            Collection<String> additionalQueryParamsToSign) {

        final StringBuilder buf = new StringBuilder();
        buf.append(method + "\n");

        // Add all interesting headers to a list, then sort them. "Interesting"
        // is defined as Content-MD5, Content-Type, Date, and x-amz-
        final Map<String, String> headersMap = request.getHeaders();
        final SortedMap<String, String> interestingHeaders = new TreeMap<String, String>();
        if (headersMap != null && headersMap.size() > 0) {
            final Iterator<Map.Entry<String, String>> headerIter = headersMap.entrySet().iterator();
            while (headerIter.hasNext()) {
                final Map.Entry<String, String> entry = headerIter.next();
                final String key = entry.getKey();
                final String value = entry.getValue();

                if (key == null) {
                    continue;
                }
                final String lk = StringUtils.lowerCase(key);

                // Ignore any headers that are not particularly interesting.
                if ("content-type".equals(lk) || "content-md5".equals(lk) || "date".equals(lk) ||
                        lk.startsWith(Headers.AMAZON_PREFIX)) {
                    interestingHeaders.put(lk, value);
                }
            }
        }

        // Remove default date timestamp if "x-amz-date" is set.
        if (interestingHeaders.containsKey(Headers.S3_ALTERNATE_DATE)) {
            interestingHeaders.put("date", "");
        }

        // Use the expires value as the timestamp if it is available. This
        // trumps both the default
        // "date" timestamp, and the "x-amz-date" header.
        if (expires != null) {
            interestingHeaders.put("date", expires);
        }

        // These headers require that we still put a new line in after them,
        // even if they don't exist.
        if (!interestingHeaders.containsKey("content-type")) {
            interestingHeaders.put("content-type", "");
        }
        if (!interestingHeaders.containsKey("content-md5")) {
            interestingHeaders.put("content-md5", "");
        }

        // Any parameters that are prefixed with "x-amz-" need to be included
        // in the headers section of the canonical string to sign
        for (final Map.Entry<String, String> parameter : request.getParameters().entrySet()) {
            if (parameter.getKey().startsWith("x-amz-")) {
                interestingHeaders.put(parameter.getKey(), parameter.getValue());
            }
        }

        // Add all the interesting headers (i.e.: all that startwith x-amz- ;-))
        for (final Iterator<Map.Entry<String, String>> i = interestingHeaders.entrySet().iterator(); i.hasNext();) {
            final Map.Entry<String, String> entry = i.next();
            final String key = entry.getKey();
            final String value = entry.getValue();

            if (key.startsWith(Headers.AMAZON_PREFIX)) {
                buf.append(key).append(':');
                if (value != null) {
                    buf.append(value);
                }
            } else if (value != null) {
                buf.append(value);
            }
            buf.append("\n");
        }

        // Add all the interesting parameters
        buf.append(resource);
        final String[] parameterNames = request.getParameters().keySet().toArray(
                new String[request.getParameters().size()]);
        Arrays.sort(parameterNames);
        char separator = '?';
        for (final String parameterName : parameterNames) {
            // Skip any parameters that aren't part of the canonical signed
            // string
            if (!SIGNED_PARAMETERS.contains(parameterName)
                 &&
                 (additionalQueryParamsToSign == null ||
                 !additionalQueryParamsToSign.contains(parameterName))
            ) {
                continue;
            }
            if (buf.length() == 0) {
                buf.append(separator);
            }

            buf.append(parameterName);
            final String parameterValue = request.getParameters().get(parameterName);
            if (parameterValue != null) {
                buf.append("=").append(parameterValue);
            }

            separator = '&';
        }

        return buf.toString();
    }

}
