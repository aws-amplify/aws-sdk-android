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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO StaticIp
 */
class StaticIpJsonMarshaller {

    public void marshall(StaticIp staticIp, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (staticIp.getName() != null) {
            String name = staticIp.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (staticIp.getArn() != null) {
            String arn = staticIp.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (staticIp.getSupportCode() != null) {
            String supportCode = staticIp.getSupportCode();
            jsonWriter.name("supportCode");
            jsonWriter.value(supportCode);
        }
        if (staticIp.getCreatedAt() != null) {
            java.util.Date createdAt = staticIp.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (staticIp.getLocation() != null) {
            ResourceLocation location = staticIp.getLocation();
            jsonWriter.name("location");
            ResourceLocationJsonMarshaller.getInstance().marshall(location, jsonWriter);
        }
        if (staticIp.getResourceType() != null) {
            String resourceType = staticIp.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (staticIp.getIpAddress() != null) {
            String ipAddress = staticIp.getIpAddress();
            jsonWriter.name("ipAddress");
            jsonWriter.value(ipAddress);
        }
        if (staticIp.getAttachedTo() != null) {
            String attachedTo = staticIp.getAttachedTo();
            jsonWriter.name("attachedTo");
            jsonWriter.value(attachedTo);
        }
        if (staticIp.getIsAttached() != null) {
            Boolean isAttached = staticIp.getIsAttached();
            jsonWriter.name("isAttached");
            jsonWriter.value(isAttached);
        }
        jsonWriter.endObject();
    }

    private static StaticIpJsonMarshaller instance;

    public static StaticIpJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StaticIpJsonMarshaller();
        return instance;
    }
}
