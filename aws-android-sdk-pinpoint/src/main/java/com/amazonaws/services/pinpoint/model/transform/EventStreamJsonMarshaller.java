/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EventStream
 */
class EventStreamJsonMarshaller {

    public void marshall(EventStream eventStream, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (eventStream.getApplicationId() != null) {
            String applicationId = eventStream.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (eventStream.getDestinationStreamArn() != null) {
            String destinationStreamArn = eventStream.getDestinationStreamArn();
            jsonWriter.name("DestinationStreamArn");
            jsonWriter.value(destinationStreamArn);
        }
        if (eventStream.getExternalId() != null) {
            String externalId = eventStream.getExternalId();
            jsonWriter.name("ExternalId");
            jsonWriter.value(externalId);
        }
        if (eventStream.getLastModifiedDate() != null) {
            String lastModifiedDate = eventStream.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (eventStream.getLastUpdatedBy() != null) {
            String lastUpdatedBy = eventStream.getLastUpdatedBy();
            jsonWriter.name("LastUpdatedBy");
            jsonWriter.value(lastUpdatedBy);
        }
        if (eventStream.getRoleArn() != null) {
            String roleArn = eventStream.getRoleArn();
            jsonWriter.name("RoleArn");
            jsonWriter.value(roleArn);
        }
        jsonWriter.endObject();
    }

    private static EventStreamJsonMarshaller instance;

    public static EventStreamJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventStreamJsonMarshaller();
        return instance;
    }
}
