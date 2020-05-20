/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.appmesh.model.transform;

import com.amazonaws.services.appmesh.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HttpRouteMatch
 */
class HttpRouteMatchJsonMarshaller {

    public void marshall(HttpRouteMatch httpRouteMatch, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (httpRouteMatch.getHeaders() != null) {
            java.util.List<HttpRouteHeader> headers = httpRouteMatch.getHeaders();
            jsonWriter.name("headers");
            jsonWriter.beginArray();
            for (HttpRouteHeader headersItem : headers) {
                if (headersItem != null) {
                    HttpRouteHeaderJsonMarshaller.getInstance().marshall(headersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (httpRouteMatch.getMethod() != null) {
            String method = httpRouteMatch.getMethod();
            jsonWriter.name("method");
            jsonWriter.value(method);
        }
        if (httpRouteMatch.getPrefix() != null) {
            String prefix = httpRouteMatch.getPrefix();
            jsonWriter.name("prefix");
            jsonWriter.value(prefix);
        }
        if (httpRouteMatch.getScheme() != null) {
            String scheme = httpRouteMatch.getScheme();
            jsonWriter.name("scheme");
            jsonWriter.value(scheme);
        }
        jsonWriter.endObject();
    }

    private static HttpRouteMatchJsonMarshaller instance;

    public static HttpRouteMatchJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HttpRouteMatchJsonMarshaller();
        return instance;
    }
}
