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
 * JSON marshaller for POJO GrpcRouteMetadataMatchMethod
 */
class GrpcRouteMetadataMatchMethodJsonMarshaller {

    public void marshall(GrpcRouteMetadataMatchMethod grpcRouteMetadataMatchMethod,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (grpcRouteMetadataMatchMethod.getExact() != null) {
            String exact = grpcRouteMetadataMatchMethod.getExact();
            jsonWriter.name("exact");
            jsonWriter.value(exact);
        }
        if (grpcRouteMetadataMatchMethod.getPrefix() != null) {
            String prefix = grpcRouteMetadataMatchMethod.getPrefix();
            jsonWriter.name("prefix");
            jsonWriter.value(prefix);
        }
        if (grpcRouteMetadataMatchMethod.getRange() != null) {
            MatchRange range = grpcRouteMetadataMatchMethod.getRange();
            jsonWriter.name("range");
            MatchRangeJsonMarshaller.getInstance().marshall(range, jsonWriter);
        }
        if (grpcRouteMetadataMatchMethod.getRegex() != null) {
            String regex = grpcRouteMetadataMatchMethod.getRegex();
            jsonWriter.name("regex");
            jsonWriter.value(regex);
        }
        if (grpcRouteMetadataMatchMethod.getSuffix() != null) {
            String suffix = grpcRouteMetadataMatchMethod.getSuffix();
            jsonWriter.name("suffix");
            jsonWriter.value(suffix);
        }
        jsonWriter.endObject();
    }

    private static GrpcRouteMetadataMatchMethodJsonMarshaller instance;

    public static GrpcRouteMetadataMatchMethodJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GrpcRouteMetadataMatchMethodJsonMarshaller();
        return instance;
    }
}
