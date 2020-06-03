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

package com.amazonaws.services.mediaconvert.model.transform;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CmafEncryptionSettings
 */
class CmafEncryptionSettingsJsonMarshaller {

    public void marshall(CmafEncryptionSettings cmafEncryptionSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (cmafEncryptionSettings.getConstantInitializationVector() != null) {
            String constantInitializationVector = cmafEncryptionSettings
                    .getConstantInitializationVector();
            jsonWriter.name("ConstantInitializationVector");
            jsonWriter.value(constantInitializationVector);
        }
        if (cmafEncryptionSettings.getEncryptionMethod() != null) {
            String encryptionMethod = cmafEncryptionSettings.getEncryptionMethod();
            jsonWriter.name("EncryptionMethod");
            jsonWriter.value(encryptionMethod);
        }
        if (cmafEncryptionSettings.getInitializationVectorInManifest() != null) {
            String initializationVectorInManifest = cmafEncryptionSettings
                    .getInitializationVectorInManifest();
            jsonWriter.name("InitializationVectorInManifest");
            jsonWriter.value(initializationVectorInManifest);
        }
        if (cmafEncryptionSettings.getSpekeKeyProvider() != null) {
            SpekeKeyProviderCmaf spekeKeyProvider = cmafEncryptionSettings.getSpekeKeyProvider();
            jsonWriter.name("SpekeKeyProvider");
            SpekeKeyProviderCmafJsonMarshaller.getInstance().marshall(spekeKeyProvider, jsonWriter);
        }
        if (cmafEncryptionSettings.getStaticKeyProvider() != null) {
            StaticKeyProvider staticKeyProvider = cmafEncryptionSettings.getStaticKeyProvider();
            jsonWriter.name("StaticKeyProvider");
            StaticKeyProviderJsonMarshaller.getInstance().marshall(staticKeyProvider, jsonWriter);
        }
        if (cmafEncryptionSettings.getType() != null) {
            String type = cmafEncryptionSettings.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static CmafEncryptionSettingsJsonMarshaller instance;

    public static CmafEncryptionSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CmafEncryptionSettingsJsonMarshaller();
        return instance;
    }
}
