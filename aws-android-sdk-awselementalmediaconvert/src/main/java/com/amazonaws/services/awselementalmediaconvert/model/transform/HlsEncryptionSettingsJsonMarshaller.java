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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HlsEncryptionSettings
 */
class HlsEncryptionSettingsJsonMarshaller {

    public void marshall(HlsEncryptionSettings hlsEncryptionSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (hlsEncryptionSettings.getConstantInitializationVector() != null) {
            String constantInitializationVector = hlsEncryptionSettings
                    .getConstantInitializationVector();
            jsonWriter.name("ConstantInitializationVector");
            jsonWriter.value(constantInitializationVector);
        }
        if (hlsEncryptionSettings.getEncryptionMethod() != null) {
            String encryptionMethod = hlsEncryptionSettings.getEncryptionMethod();
            jsonWriter.name("EncryptionMethod");
            jsonWriter.value(encryptionMethod);
        }
        if (hlsEncryptionSettings.getInitializationVectorInManifest() != null) {
            String initializationVectorInManifest = hlsEncryptionSettings
                    .getInitializationVectorInManifest();
            jsonWriter.name("InitializationVectorInManifest");
            jsonWriter.value(initializationVectorInManifest);
        }
        if (hlsEncryptionSettings.getOfflineEncrypted() != null) {
            String offlineEncrypted = hlsEncryptionSettings.getOfflineEncrypted();
            jsonWriter.name("OfflineEncrypted");
            jsonWriter.value(offlineEncrypted);
        }
        if (hlsEncryptionSettings.getSpekeKeyProvider() != null) {
            SpekeKeyProvider spekeKeyProvider = hlsEncryptionSettings.getSpekeKeyProvider();
            jsonWriter.name("SpekeKeyProvider");
            SpekeKeyProviderJsonMarshaller.getInstance().marshall(spekeKeyProvider, jsonWriter);
        }
        if (hlsEncryptionSettings.getStaticKeyProvider() != null) {
            StaticKeyProvider staticKeyProvider = hlsEncryptionSettings.getStaticKeyProvider();
            jsonWriter.name("StaticKeyProvider");
            StaticKeyProviderJsonMarshaller.getInstance().marshall(staticKeyProvider, jsonWriter);
        }
        if (hlsEncryptionSettings.getType() != null) {
            String type = hlsEncryptionSettings.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static HlsEncryptionSettingsJsonMarshaller instance;

    public static HlsEncryptionSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HlsEncryptionSettingsJsonMarshaller();
        return instance;
    }
}
