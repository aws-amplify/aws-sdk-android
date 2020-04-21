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

package com.amazonaws.services.amazonguardduty.model.transform;

import com.amazonaws.services.amazonguardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Destination
 */
class DestinationJsonMarshaller {

    public void marshall(Destination destination, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (destination.getDestinationId() != null) {
            String destinationId = destination.getDestinationId();
            jsonWriter.name("DestinationId");
            jsonWriter.value(destinationId);
        }
        if (destination.getDestinationType() != null) {
            String destinationType = destination.getDestinationType();
            jsonWriter.name("DestinationType");
            jsonWriter.value(destinationType);
        }
        if (destination.getStatus() != null) {
            String status = destination.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static DestinationJsonMarshaller instance;

    public static DestinationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DestinationJsonMarshaller();
        return instance;
    }
}
