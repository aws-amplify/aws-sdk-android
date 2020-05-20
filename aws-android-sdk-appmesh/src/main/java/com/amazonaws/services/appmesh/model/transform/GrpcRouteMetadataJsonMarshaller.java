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
 * JSON marshaller for POJO GrpcRouteMetadata
 */
class GrpcRouteMetadataJsonMarshaller {

    public void marshall(GrpcRouteMetadata grpcRouteMetadata, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (grpcRouteMetadata.getInvert() != null) {
            Boolean invert = grpcRouteMetadata.getInvert();
            jsonWriter.name("invert");
            jsonWriter.value(invert);
        }
        if (grpcRouteMetadata.getMatch() != null) {
            GrpcRouteMetadataMatchMethod match = grpcRouteMetadata.getMatch();
            jsonWriter.name("match");
            GrpcRouteMetadataMatchMethodJsonMarshaller.getInstance().marshall(match, jsonWriter);
        }
        if (grpcRouteMetadata.getName() != null) {
            String name = grpcRouteMetadata.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        jsonWriter.endObject();
    }

    private static GrpcRouteMetadataJsonMarshaller instance;

    public static GrpcRouteMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GrpcRouteMetadataJsonMarshaller();
        return instance;
    }
}
