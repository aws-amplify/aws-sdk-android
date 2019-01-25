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

package com.amazonaws.transform;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.util.json.AwsJsonReader;

/** JsonUnmarshallerContext class. */
public class JsonUnmarshallerContext {

    private final AwsJsonReader reader;
    private final HttpResponse httpResponse;

    /**
     * Constructor.
     * @param reader the AwsJsonReader.
     */
    public JsonUnmarshallerContext(AwsJsonReader reader) {
        this(reader, null);
    }

    /**
     * Constructor.
     * @param reader the AwsJsonReader.
     * @param httpResponse the HTTP response.
     */
    public JsonUnmarshallerContext(AwsJsonReader reader, HttpResponse httpResponse) {
        this.reader = reader;
        this.httpResponse = httpResponse;
    }

    /**
     * @return the AwsJsonReader.
     */
    public AwsJsonReader getReader() {
        return reader;
    }

    /**
     * Returns the value of the header with the specified name from the
     * response, or null if not present.
     *
     * @param header The name of the header to lookup.
     * @return The value of the header with the specified name from the response,
     *         or null if not present.
     */
    public String getHeader(String header) {
        if (httpResponse == null)
            return null;

        return httpResponse.getHeaders().get(header);
    }

    /**
     * @return the HTTP response.
     */
    public HttpResponse getHttpResponse() {
        return httpResponse;
    }
}
