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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EndpointSummary
 */
class EndpointSummaryJsonMarshaller {

    public void marshall(EndpointSummary endpointSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (endpointSummary.getEndpointName() != null) {
            String endpointName = endpointSummary.getEndpointName();
            jsonWriter.name("EndpointName");
            jsonWriter.value(endpointName);
        }
        if (endpointSummary.getEndpointArn() != null) {
            String endpointArn = endpointSummary.getEndpointArn();
            jsonWriter.name("EndpointArn");
            jsonWriter.value(endpointArn);
        }
        if (endpointSummary.getCreationTime() != null) {
            java.util.Date creationTime = endpointSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (endpointSummary.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = endpointSummary.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (endpointSummary.getEndpointStatus() != null) {
            String endpointStatus = endpointSummary.getEndpointStatus();
            jsonWriter.name("EndpointStatus");
            jsonWriter.value(endpointStatus);
        }
        jsonWriter.endObject();
    }

    private static EndpointSummaryJsonMarshaller instance;

    public static EndpointSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EndpointSummaryJsonMarshaller();
        return instance;
    }
}
