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
 * JSON marshaller for POJO GrpcRetryPolicy
 */
class GrpcRetryPolicyJsonMarshaller {

    public void marshall(GrpcRetryPolicy grpcRetryPolicy, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (grpcRetryPolicy.getGrpcRetryEvents() != null) {
            java.util.List<String> grpcRetryEvents = grpcRetryPolicy.getGrpcRetryEvents();
            jsonWriter.name("grpcRetryEvents");
            jsonWriter.beginArray();
            for (String grpcRetryEventsItem : grpcRetryEvents) {
                if (grpcRetryEventsItem != null) {
                    jsonWriter.value(grpcRetryEventsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (grpcRetryPolicy.getHttpRetryEvents() != null) {
            java.util.List<String> httpRetryEvents = grpcRetryPolicy.getHttpRetryEvents();
            jsonWriter.name("httpRetryEvents");
            jsonWriter.beginArray();
            for (String httpRetryEventsItem : httpRetryEvents) {
                if (httpRetryEventsItem != null) {
                    jsonWriter.value(httpRetryEventsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (grpcRetryPolicy.getMaxRetries() != null) {
            Long maxRetries = grpcRetryPolicy.getMaxRetries();
            jsonWriter.name("maxRetries");
            jsonWriter.value(maxRetries);
        }
        if (grpcRetryPolicy.getPerRetryTimeout() != null) {
            Duration perRetryTimeout = grpcRetryPolicy.getPerRetryTimeout();
            jsonWriter.name("perRetryTimeout");
            DurationJsonMarshaller.getInstance().marshall(perRetryTimeout, jsonWriter);
        }
        if (grpcRetryPolicy.getTcpRetryEvents() != null) {
            java.util.List<String> tcpRetryEvents = grpcRetryPolicy.getTcpRetryEvents();
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

    private static GrpcRetryPolicyJsonMarshaller instance;

    public static GrpcRetryPolicyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GrpcRetryPolicyJsonMarshaller();
        return instance;
    }
}
