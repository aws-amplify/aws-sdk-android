/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EndpointFilter
 */
class EndpointFilterJsonMarshaller {

    public void marshall(EndpointFilter endpointFilter, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (endpointFilter.getModelArn() != null) {
            String modelArn = endpointFilter.getModelArn();
            jsonWriter.name("ModelArn");
            jsonWriter.value(modelArn);
        }
        if (endpointFilter.getStatus() != null) {
            String status = endpointFilter.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (endpointFilter.getCreationTimeBefore() != null) {
            java.util.Date creationTimeBefore = endpointFilter.getCreationTimeBefore();
            jsonWriter.name("CreationTimeBefore");
            jsonWriter.value(creationTimeBefore);
        }
        if (endpointFilter.getCreationTimeAfter() != null) {
            java.util.Date creationTimeAfter = endpointFilter.getCreationTimeAfter();
            jsonWriter.name("CreationTimeAfter");
            jsonWriter.value(creationTimeAfter);
        }
        jsonWriter.endObject();
    }

    private static EndpointFilterJsonMarshaller instance;

    public static EndpointFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EndpointFilterJsonMarshaller();
        return instance;
    }
}
