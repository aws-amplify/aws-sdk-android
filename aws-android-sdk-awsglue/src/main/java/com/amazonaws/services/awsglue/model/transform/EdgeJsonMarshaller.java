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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Edge
 */
class EdgeJsonMarshaller {

    public void marshall(Edge edge, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (edge.getSourceId() != null) {
            String sourceId = edge.getSourceId();
            jsonWriter.name("SourceId");
            jsonWriter.value(sourceId);
        }
        if (edge.getDestinationId() != null) {
            String destinationId = edge.getDestinationId();
            jsonWriter.name("DestinationId");
            jsonWriter.value(destinationId);
        }
        jsonWriter.endObject();
    }

    private static EdgeJsonMarshaller instance;

    public static EdgeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EdgeJsonMarshaller();
        return instance;
    }
}
