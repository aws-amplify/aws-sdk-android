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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DataCatalogEncryptionSettings
 */
class DataCatalogEncryptionSettingsJsonMarshaller {

    public void marshall(DataCatalogEncryptionSettings dataCatalogEncryptionSettings,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dataCatalogEncryptionSettings.getEncryptionAtRest() != null) {
            EncryptionAtRest encryptionAtRest = dataCatalogEncryptionSettings.getEncryptionAtRest();
            jsonWriter.name("EncryptionAtRest");
            EncryptionAtRestJsonMarshaller.getInstance().marshall(encryptionAtRest, jsonWriter);
        }
        if (dataCatalogEncryptionSettings.getConnectionPasswordEncryption() != null) {
            ConnectionPasswordEncryption connectionPasswordEncryption = dataCatalogEncryptionSettings
                    .getConnectionPasswordEncryption();
            jsonWriter.name("ConnectionPasswordEncryption");
            ConnectionPasswordEncryptionJsonMarshaller.getInstance().marshall(
                    connectionPasswordEncryption, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DataCatalogEncryptionSettingsJsonMarshaller instance;

    public static DataCatalogEncryptionSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DataCatalogEncryptionSettingsJsonMarshaller();
        return instance;
    }
}
