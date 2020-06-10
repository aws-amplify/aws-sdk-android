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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InstanceTagNotificationAttribute
 */
class InstanceTagNotificationAttributeJsonMarshaller {

    public void marshall(InstanceTagNotificationAttribute instanceTagNotificationAttribute,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instanceTagNotificationAttribute.getInstanceTagKeys() != null) {
            java.util.List<String> instanceTagKeys = instanceTagNotificationAttribute
                    .getInstanceTagKeys();
            jsonWriter.name("InstanceTagKeys");
            jsonWriter.beginArray();
            for (String instanceTagKeysItem : instanceTagKeys) {
                if (instanceTagKeysItem != null) {
                    jsonWriter.value(instanceTagKeysItem);
                }
            }
            jsonWriter.endArray();
        }
        if (instanceTagNotificationAttribute.getIncludeAllTagsOfInstance() != null) {
            Boolean includeAllTagsOfInstance = instanceTagNotificationAttribute
                    .getIncludeAllTagsOfInstance();
            jsonWriter.name("IncludeAllTagsOfInstance");
            jsonWriter.value(includeAllTagsOfInstance);
        }
        jsonWriter.endObject();
    }

    private static InstanceTagNotificationAttributeJsonMarshaller instance;

    public static InstanceTagNotificationAttributeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceTagNotificationAttributeJsonMarshaller();
        return instance;
    }
}
