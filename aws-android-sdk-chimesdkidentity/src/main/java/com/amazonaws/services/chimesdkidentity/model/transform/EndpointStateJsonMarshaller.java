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

package com.amazonaws.services.chimesdkidentity.model.transform;

import com.amazonaws.services.chimesdkidentity.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EndpointState
 */
class EndpointStateJsonMarshaller {

    public void marshall(EndpointState endpointState, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (endpointState.getStatus() != null) {
            String status = endpointState.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (endpointState.getStatusReason() != null) {
            String statusReason = endpointState.getStatusReason();
            jsonWriter.name("StatusReason");
            jsonWriter.value(statusReason);
        }
        jsonWriter.endObject();
    }

    private static EndpointStateJsonMarshaller instance;

    public static EndpointStateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EndpointStateJsonMarshaller();
        return instance;
    }
}
