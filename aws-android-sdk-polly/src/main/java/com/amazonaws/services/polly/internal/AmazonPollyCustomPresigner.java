/*
 * Copyright 2017-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.polly.internal;

import static com.amazonaws.util.StringUtils.UTF8;

import com.amazonaws.Request;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.util.HttpUtils;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AmazonPollyCustomPresigner extends AWS4Signer {

    private static final String DEFAULT_ENCODING = "UTF-8";

    protected InputStream getBinaryRequestPayloadStream(Request<?> request) {
        if (HttpUtils.usePayloadForQueryParameters(request)) {
            final String encodedParameters = AmazonPollyCustomPresigner.encodeParameters(request);
            if (encodedParameters == null) {
                return new ByteArrayInputStream(new byte[0]);
            }

            return new ByteArrayInputStream(
                    encodedParameters.getBytes(UTF8));
        }

        return getBinaryRequestPayloadStreamWithoutQueryParams(request);
    }

    /**
     * Original copy from com.amazonaws.util.HttpUtils
     * Creates an encoded query string from all the parameters in the specified
     * request.
     *
     * @param request The request containing the parameters to encode.
     * @return Null if no parameters were present, otherwise the encoded query
     *         string for the parameters present in the specified request.
     */
    public static String encodeParameters(Request<?> request) {
        AmazonPollyCustomRequest<?> customRequest = (AmazonPollyCustomRequest<?>) request;

        final Map<String, List<String>> parametersWithList = customRequest.getParametersWithList();
        if (parametersWithList.isEmpty()) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        String parameterSeparator = "";
        try {
            for (final Entry<String, List<String>> entry : parametersWithList.entrySet()) {
                final String encodedName = URLEncoder.encode(entry.getKey(), DEFAULT_ENCODING);
                final List<String> values = entry.getValue();

                if (values == null) {
                    continue;
                }

                sb.append(parameterSeparator);
                parameterSeparator = "&";

                String valueSeparator = "";
                for (String value : values) {
                    sb.append(valueSeparator);
                    valueSeparator = "&";
                    
                    final String encodedValue = URLEncoder.encode(value, DEFAULT_ENCODING);
                    sb.append(encodedName).append("=").append(encodedValue);
                }
            }
        } catch (final UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
        return sb.toString();
    }

    protected String getCanonicalizedQueryString(Request<?> request) {
        /*
         * If we're using POST and we don't have any request payload content,
         * then any request query parameters will be sent as the payload, and
         * not in the actual query string.
         */
        if (HttpUtils.usePayloadForQueryParameters(request)) {
            return "";
        } else {
            if (AmazonPollyCustomRequest.class.equals(request.getClass())) {
                return this.getCanonicalizedQueryStringForListParameters(((AmazonPollyCustomRequest<?>) request)
                        .getParametersWithList());
            } else {
                return this.getCanonicalizedQueryString(request.getParameters());
            }
        }
    }

    /**
     * Examines the specified query string parameters and returns a
     * canonicalized form.
     * <p>
     * The canonicalized query string is formed by first sorting all the query
     * string parameters, then URI encoding both the key and value and then
     * joining them, in order, separating key value pairs with an '&'.
     *
     * @param parameters The query string parameters to be canonicalized.
     * @return A canonicalized form for the specified query string parameters.
     */
    protected String getCanonicalizedQueryStringForListParameters(Map<String, List<String>> parameters) {
        final StringBuilder builder = new StringBuilder();
        
        ArrayList<String> sortedKeys = new ArrayList<String>(parameters.keySet());
        Collections.sort(sortedKeys);
        
        final Iterator<String> keyIter = sortedKeys.iterator();
        while (keyIter.hasNext()) {
            final String key = keyIter.next();
            final List<String> values = parameters.get(key);

            final String urlEncodedKey = HttpUtils.urlEncode(key, false);
            Collections.sort(values);
            final Iterator<String> valuesIter = values.iterator();
            while (valuesIter.hasNext()) {
                builder.append(urlEncodedKey).append("=").append(HttpUtils.urlEncode(valuesIter.next(), false));
                if (valuesIter.hasNext()) {
                    builder.append("&");
                }
            }
            
            if (keyIter.hasNext()) {
                builder.append("&");
            }
        }
        
        return builder.toString();
    }
}
