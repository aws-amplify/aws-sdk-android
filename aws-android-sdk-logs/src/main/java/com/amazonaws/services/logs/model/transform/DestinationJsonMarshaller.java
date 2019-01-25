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

package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Destination
 */
class DestinationJsonMarshaller {

    public void marshall(Destination destination, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (destination.getDestinationName() != null) {
            String destinationName = destination.getDestinationName();
            jsonWriter.name("destinationName");
            jsonWriter.value(destinationName);
        }
        if (destination.getTargetArn() != null) {
            String targetArn = destination.getTargetArn();
            jsonWriter.name("targetArn");
            jsonWriter.value(targetArn);
        }
        if (destination.getRoleArn() != null) {
            String roleArn = destination.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        if (destination.getAccessPolicy() != null) {
            String accessPolicy = destination.getAccessPolicy();
            jsonWriter.name("accessPolicy");
            jsonWriter.value(accessPolicy);
        }
        if (destination.getArn() != null) {
            String arn = destination.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (destination.getCreationTime() != null) {
            Long creationTime = destination.getCreationTime();
            jsonWriter.name("creationTime");
            jsonWriter.value(creationTime);
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
