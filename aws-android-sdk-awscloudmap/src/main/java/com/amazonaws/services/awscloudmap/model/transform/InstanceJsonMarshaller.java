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

package com.amazonaws.services.awscloudmap.model.transform;

import com.amazonaws.services.awscloudmap.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Instance
 */
class InstanceJsonMarshaller {

    public void marshall(Instance instance, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instance.getId() != null) {
            String id = instance.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (instance.getCreatorRequestId() != null) {
            String creatorRequestId = instance.getCreatorRequestId();
            jsonWriter.name("CreatorRequestId");
            jsonWriter.value(creatorRequestId);
        }
        if (instance.getAttributes() != null) {
            java.util.Map<String, String> attributes = instance.getAttributes();
            jsonWriter.name("Attributes");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> attributesEntry : attributes.entrySet()) {
                String attributesValue = attributesEntry.getValue();
                if (attributesValue != null) {
                    jsonWriter.name(attributesEntry.getKey());
                    jsonWriter.value(attributesValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static InstanceJsonMarshaller instance;

    public static InstanceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceJsonMarshaller();
        return instance;
    }
}
