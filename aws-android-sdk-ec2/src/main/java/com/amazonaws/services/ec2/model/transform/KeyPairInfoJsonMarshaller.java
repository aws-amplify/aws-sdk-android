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
 * JSON marshaller for POJO KeyPairInfo
 */
class KeyPairInfoJsonMarshaller {

    public void marshall(KeyPairInfo keyPairInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (keyPairInfo.getKeyPairId() != null) {
            String keyPairId = keyPairInfo.getKeyPairId();
            jsonWriter.name("KeyPairId");
            jsonWriter.value(keyPairId);
        }
        if (keyPairInfo.getKeyFingerprint() != null) {
            String keyFingerprint = keyPairInfo.getKeyFingerprint();
            jsonWriter.name("KeyFingerprint");
            jsonWriter.value(keyFingerprint);
        }
        if (keyPairInfo.getKeyName() != null) {
            String keyName = keyPairInfo.getKeyName();
            jsonWriter.name("KeyName");
            jsonWriter.value(keyName);
        }
        if (keyPairInfo.getTags() != null) {
            java.util.List<Tag> tags = keyPairInfo.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static KeyPairInfoJsonMarshaller instance;

    public static KeyPairInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KeyPairInfoJsonMarshaller();
        return instance;
    }
}
