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
 * JSON marshaller for POJO GrpcRoute
 */
class GrpcRouteJsonMarshaller {

    public void marshall(GrpcRoute grpcRoute, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (grpcRoute.getAction() != null) {
            GrpcRouteAction action = grpcRoute.getAction();
            jsonWriter.name("action");
            GrpcRouteActionJsonMarshaller.getInstance().marshall(action, jsonWriter);
        }
        if (grpcRoute.getMatch() != null) {
            GrpcRouteMatch match = grpcRoute.getMatch();
            jsonWriter.name("match");
            GrpcRouteMatchJsonMarshaller.getInstance().marshall(match, jsonWriter);
        }
        if (grpcRoute.getRetryPolicy() != null) {
            GrpcRetryPolicy retryPolicy = grpcRoute.getRetryPolicy();
            jsonWriter.name("retryPolicy");
            GrpcRetryPolicyJsonMarshaller.getInstance().marshall(retryPolicy, jsonWriter);
        }
        if (grpcRoute.getTimeout() != null) {
            GrpcTimeout timeout = grpcRoute.getTimeout();
            jsonWriter.name("timeout");
            GrpcTimeoutJsonMarshaller.getInstance().marshall(timeout, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static GrpcRouteJsonMarshaller instance;

    public static GrpcRouteJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GrpcRouteJsonMarshaller();
        return instance;
    }
}
