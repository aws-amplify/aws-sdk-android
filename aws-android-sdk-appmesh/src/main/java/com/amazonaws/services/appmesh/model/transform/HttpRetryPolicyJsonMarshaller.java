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
 * JSON marshaller for POJO HttpRetryPolicy
 */
class HttpRetryPolicyJsonMarshaller {

    public void marshall(HttpRetryPolicy httpRetryPolicy, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (httpRetryPolicy.getHttpRetryEvents() != null) {
            java.util.List<String> httpRetryEvents = httpRetryPolicy.getHttpRetryEvents();
            jsonWriter.name("httpRetryEvents");
            jsonWriter.beginArray();
            for (String httpRetryEventsItem : httpRetryEvents) {
                if (httpRetryEventsItem != null) {
                    jsonWriter.value(httpRetryEventsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (httpRetryPolicy.getMaxRetries() != null) {
            Long maxRetries = httpRetryPolicy.getMaxRetries();
            jsonWriter.name("maxRetries");
            jsonWriter.value(maxRetries);
        }
        if (httpRetryPolicy.getPerRetryTimeout() != null) {
            Duration perRetryTimeout = httpRetryPolicy.getPerRetryTimeout();
            jsonWriter.name("perRetryTimeout");
            DurationJsonMarshaller.getInstance().marshall(perRetryTimeout, jsonWriter);
        }
        if (httpRetryPolicy.getTcpRetryEvents() != null) {
            java.util.List<String> tcpRetryEvents = httpRetryPolicy.getTcpRetryEvents();
            jsonWriter.name("tcpRetryEvents");
            jsonWriter.beginArray();
            for (String tcpRetryEventsItem : tcpRetryEvents) {
                if (tcpRetryEventsItem != null) {
                    jsonWriter.value(tcpRetryEventsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static HttpRetryPolicyJsonMarshaller instance;

    public static HttpRetryPolicyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HttpRetryPolicyJsonMarshaller();
        return instance;
    }
}
