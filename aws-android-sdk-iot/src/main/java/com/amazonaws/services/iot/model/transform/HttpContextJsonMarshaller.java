/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HttpContext
 */
class HttpContextJsonMarshaller {

    public void marshall(HttpContext httpContext, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (httpContext.getHeaders() != null) {
            java.util.Map<String, String> headers = httpContext.getHeaders();
            jsonWriter.name("headers");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> headersEntry : headers.entrySet()) {
                String headersValue = headersEntry.getValue();
                if (headersValue != null) {
                    jsonWriter.name(headersEntry.getKey());
                    jsonWriter.value(headersValue);
                }
            }
            jsonWriter.endObject();
        }
        if (httpContext.getQueryString() != null) {
            String queryString = httpContext.getQueryString();
            jsonWriter.name("queryString");
            jsonWriter.value(queryString);
        }
        jsonWriter.endObject();
    }

    private static HttpContextJsonMarshaller instance;

    public static HttpContextJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HttpContextJsonMarshaller();
        return instance;
    }
}
