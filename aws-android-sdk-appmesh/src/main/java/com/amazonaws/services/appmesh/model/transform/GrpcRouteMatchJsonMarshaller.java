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
 * JSON marshaller for POJO GrpcRouteMatch
 */
class GrpcRouteMatchJsonMarshaller {

    public void marshall(GrpcRouteMatch grpcRouteMatch, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (grpcRouteMatch.getMetadata() != null) {
            java.util.List<GrpcRouteMetadata> metadata = grpcRouteMatch.getMetadata();
            jsonWriter.name("metadata");
            jsonWriter.beginArray();
            for (GrpcRouteMetadata metadataItem : metadata) {
                if (metadataItem != null) {
                    GrpcRouteMetadataJsonMarshaller.getInstance()
                            .marshall(metadataItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (grpcRouteMatch.getMethodName() != null) {
            String methodName = grpcRouteMatch.getMethodName();
            jsonWriter.name("methodName");
            jsonWriter.value(methodName);
        }
        if (grpcRouteMatch.getServiceName() != null) {
            String serviceName = grpcRouteMatch.getServiceName();
            jsonWriter.name("serviceName");
            jsonWriter.value(serviceName);
        }
        jsonWriter.endObject();
    }

    private static GrpcRouteMatchJsonMarshaller instance;

    public static GrpcRouteMatchJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GrpcRouteMatchJsonMarshaller();
        return instance;
    }
}
