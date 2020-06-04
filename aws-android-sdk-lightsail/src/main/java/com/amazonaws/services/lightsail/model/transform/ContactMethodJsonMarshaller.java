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
 * JSON marshaller for POJO ContactMethod
 */
class ContactMethodJsonMarshaller {

    public void marshall(ContactMethod contactMethod, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (contactMethod.getContactEndpoint() != null) {
            String contactEndpoint = contactMethod.getContactEndpoint();
            jsonWriter.name("contactEndpoint");
            jsonWriter.value(contactEndpoint);
        }
        if (contactMethod.getStatus() != null) {
            String status = contactMethod.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (contactMethod.getProtocol() != null) {
            String protocol = contactMethod.getProtocol();
            jsonWriter.name("protocol");
            jsonWriter.value(protocol);
        }
        if (contactMethod.getName() != null) {
            String name = contactMethod.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (contactMethod.getArn() != null) {
            String arn = contactMethod.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (contactMethod.getCreatedAt() != null) {
            java.util.Date createdAt = contactMethod.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (contactMethod.getLocation() != null) {
            ResourceLocation location = contactMethod.getLocation();
            jsonWriter.name("location");
            ResourceLocationJsonMarshaller.getInstance().marshall(location, jsonWriter);
        }
        if (contactMethod.getResourceType() != null) {
            String resourceType = contactMethod.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (contactMethod.getSupportCode() != null) {
            String supportCode = contactMethod.getSupportCode();
            jsonWriter.name("supportCode");
            jsonWriter.value(supportCode);
        }
        jsonWriter.endObject();
    }

    private static ContactMethodJsonMarshaller instance;

    public static ContactMethodJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContactMethodJsonMarshaller();
        return instance;
    }
}
