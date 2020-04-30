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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO HlsEncryptionSettings
 */
class HlsEncryptionSettingsJsonUnmarshaller implements
        Unmarshaller<HlsEncryptionSettings, JsonUnmarshallerContext> {

    public HlsEncryptionSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HlsEncryptionSettings hlsEncryptionSettings = new HlsEncryptionSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ConstantInitializationVector")) {
                hlsEncryptionSettings.setConstantInitializationVector(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EncryptionMethod")) {
                hlsEncryptionSettings.setEncryptionMethod(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InitializationVectorInManifest")) {
                hlsEncryptionSettings.setInitializationVectorInManifest(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OfflineEncrypted")) {
                hlsEncryptionSettings.setOfflineEncrypted(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SpekeKeyProvider")) {
                hlsEncryptionSettings.setSpekeKeyProvider(SpekeKeyProviderJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("StaticKeyProvider")) {
                hlsEncryptionSettings.setStaticKeyProvider(StaticKeyProviderJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                hlsEncryptionSettings.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return hlsEncryptionSettings;
    }

    private static HlsEncryptionSettingsJsonUnmarshaller instance;

    public static HlsEncryptionSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HlsEncryptionSettingsJsonUnmarshaller();
        return instance;
    }
}
