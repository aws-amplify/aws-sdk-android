/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO KeyMetadata
 */
class KeyMetadataJsonUnmarshaller implements Unmarshaller<KeyMetadata, JsonUnmarshallerContext> {

    public KeyMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        KeyMetadata keyMetadata = new KeyMetadata();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AWSAccountId")) {
                keyMetadata.setAWSAccountId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeyId")) {
                keyMetadata.setKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arn")) {
                keyMetadata.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                keyMetadata.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Enabled")) {
                keyMetadata.setEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                keyMetadata.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeyUsage")) {
                keyMetadata.setKeyUsage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeyState")) {
                keyMetadata.setKeyState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeletionDate")) {
                keyMetadata.setDeletionDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ValidTo")) {
                keyMetadata.setValidTo(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Origin")) {
                keyMetadata.setOrigin(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CustomKeyStoreId")) {
                keyMetadata.setCustomKeyStoreId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CloudHsmClusterId")) {
                keyMetadata.setCloudHsmClusterId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExpirationModel")) {
                keyMetadata.setExpirationModel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeyManager")) {
                keyMetadata.setKeyManager(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return keyMetadata;
    }

    private static KeyMetadataJsonUnmarshaller instance;

    public static KeyMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KeyMetadataJsonUnmarshaller();
        return instance;
    }
}
