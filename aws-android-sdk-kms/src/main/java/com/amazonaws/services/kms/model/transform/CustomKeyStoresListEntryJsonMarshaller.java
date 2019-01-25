/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CustomKeyStoresListEntry
 */
class CustomKeyStoresListEntryJsonMarshaller {

    public void marshall(CustomKeyStoresListEntry customKeyStoresListEntry, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (customKeyStoresListEntry.getCustomKeyStoreId() != null) {
            String customKeyStoreId = customKeyStoresListEntry.getCustomKeyStoreId();
            jsonWriter.name("CustomKeyStoreId");
            jsonWriter.value(customKeyStoreId);
        }
        if (customKeyStoresListEntry.getCustomKeyStoreName() != null) {
            String customKeyStoreName = customKeyStoresListEntry.getCustomKeyStoreName();
            jsonWriter.name("CustomKeyStoreName");
            jsonWriter.value(customKeyStoreName);
        }
        if (customKeyStoresListEntry.getCloudHsmClusterId() != null) {
            String cloudHsmClusterId = customKeyStoresListEntry.getCloudHsmClusterId();
            jsonWriter.name("CloudHsmClusterId");
            jsonWriter.value(cloudHsmClusterId);
        }
        if (customKeyStoresListEntry.getTrustAnchorCertificate() != null) {
            String trustAnchorCertificate = customKeyStoresListEntry.getTrustAnchorCertificate();
            jsonWriter.name("TrustAnchorCertificate");
            jsonWriter.value(trustAnchorCertificate);
        }
        if (customKeyStoresListEntry.getConnectionState() != null) {
            String connectionState = customKeyStoresListEntry.getConnectionState();
            jsonWriter.name("ConnectionState");
            jsonWriter.value(connectionState);
        }
        if (customKeyStoresListEntry.getConnectionErrorCode() != null) {
            String connectionErrorCode = customKeyStoresListEntry.getConnectionErrorCode();
            jsonWriter.name("ConnectionErrorCode");
            jsonWriter.value(connectionErrorCode);
        }
        if (customKeyStoresListEntry.getCreationDate() != null) {
            java.util.Date creationDate = customKeyStoresListEntry.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        jsonWriter.endObject();
    }

    private static CustomKeyStoresListEntryJsonMarshaller instance;

    public static CustomKeyStoresListEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CustomKeyStoresListEntryJsonMarshaller();
        return instance;
    }
}
