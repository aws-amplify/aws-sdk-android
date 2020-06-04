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
 * JSON marshaller for POJO KeyPair
 */
class KeyPairJsonMarshaller {

    public void marshall(KeyPair keyPair, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (keyPair.getName() != null) {
            String name = keyPair.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (keyPair.getArn() != null) {
            String arn = keyPair.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (keyPair.getSupportCode() != null) {
            String supportCode = keyPair.getSupportCode();
            jsonWriter.name("supportCode");
            jsonWriter.value(supportCode);
        }
        if (keyPair.getCreatedAt() != null) {
            java.util.Date createdAt = keyPair.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (keyPair.getLocation() != null) {
            ResourceLocation location = keyPair.getLocation();
            jsonWriter.name("location");
            ResourceLocationJsonMarshaller.getInstance().marshall(location, jsonWriter);
        }
        if (keyPair.getResourceType() != null) {
            String resourceType = keyPair.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (keyPair.getTags() != null) {
            java.util.List<Tag> tags = keyPair.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (keyPair.getFingerprint() != null) {
            String fingerprint = keyPair.getFingerprint();
            jsonWriter.name("fingerprint");
            jsonWriter.value(fingerprint);
        }
        jsonWriter.endObject();
    }

    private static KeyPairJsonMarshaller instance;

    public static KeyPairJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KeyPairJsonMarshaller();
        return instance;
    }
}
