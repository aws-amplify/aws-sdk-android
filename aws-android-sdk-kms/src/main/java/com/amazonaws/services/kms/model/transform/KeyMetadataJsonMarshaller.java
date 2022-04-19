/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO KeyMetadata
 */
class KeyMetadataJsonMarshaller {

    public void marshall(KeyMetadata keyMetadata, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (keyMetadata.getAWSAccountId() != null) {
            String aWSAccountId = keyMetadata.getAWSAccountId();
            jsonWriter.name("AWSAccountId");
            jsonWriter.value(aWSAccountId);
        }
        if (keyMetadata.getKeyId() != null) {
            String keyId = keyMetadata.getKeyId();
            jsonWriter.name("KeyId");
            jsonWriter.value(keyId);
        }
        if (keyMetadata.getArn() != null) {
            String arn = keyMetadata.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (keyMetadata.getCreationDate() != null) {
            java.util.Date creationDate = keyMetadata.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (keyMetadata.getEnabled() != null) {
            Boolean enabled = keyMetadata.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (keyMetadata.getDescription() != null) {
            String description = keyMetadata.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (keyMetadata.getKeyUsage() != null) {
            String keyUsage = keyMetadata.getKeyUsage();
            jsonWriter.name("KeyUsage");
            jsonWriter.value(keyUsage);
        }
        if (keyMetadata.getKeyState() != null) {
            String keyState = keyMetadata.getKeyState();
            jsonWriter.name("KeyState");
            jsonWriter.value(keyState);
        }
        if (keyMetadata.getDeletionDate() != null) {
            java.util.Date deletionDate = keyMetadata.getDeletionDate();
            jsonWriter.name("DeletionDate");
            jsonWriter.value(deletionDate);
        }
        if (keyMetadata.getValidTo() != null) {
            java.util.Date validTo = keyMetadata.getValidTo();
            jsonWriter.name("ValidTo");
            jsonWriter.value(validTo);
        }
        if (keyMetadata.getOrigin() != null) {
            String origin = keyMetadata.getOrigin();
            jsonWriter.name("Origin");
            jsonWriter.value(origin);
        }
        if (keyMetadata.getCustomKeyStoreId() != null) {
            String customKeyStoreId = keyMetadata.getCustomKeyStoreId();
            jsonWriter.name("CustomKeyStoreId");
            jsonWriter.value(customKeyStoreId);
        }
        if (keyMetadata.getCloudHsmClusterId() != null) {
            String cloudHsmClusterId = keyMetadata.getCloudHsmClusterId();
            jsonWriter.name("CloudHsmClusterId");
            jsonWriter.value(cloudHsmClusterId);
        }
        if (keyMetadata.getExpirationModel() != null) {
            String expirationModel = keyMetadata.getExpirationModel();
            jsonWriter.name("ExpirationModel");
            jsonWriter.value(expirationModel);
        }
        if (keyMetadata.getKeyManager() != null) {
            String keyManager = keyMetadata.getKeyManager();
            jsonWriter.name("KeyManager");
            jsonWriter.value(keyManager);
        }
        if (keyMetadata.getCustomerMasterKeySpec() != null) {
            String customerMasterKeySpec = keyMetadata.getCustomerMasterKeySpec();
            jsonWriter.name("CustomerMasterKeySpec");
            jsonWriter.value(customerMasterKeySpec);
        }
        if (keyMetadata.getKeySpec() != null) {
            String keySpec = keyMetadata.getKeySpec();
            jsonWriter.name("KeySpec");
            jsonWriter.value(keySpec);
        }
        if (keyMetadata.getEncryptionAlgorithms() != null) {
            java.util.List<String> encryptionAlgorithms = keyMetadata.getEncryptionAlgorithms();
            jsonWriter.name("EncryptionAlgorithms");
            jsonWriter.beginArray();
            for (String encryptionAlgorithmsItem : encryptionAlgorithms) {
                if (encryptionAlgorithmsItem != null) {
                    jsonWriter.value(encryptionAlgorithmsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (keyMetadata.getSigningAlgorithms() != null) {
            java.util.List<String> signingAlgorithms = keyMetadata.getSigningAlgorithms();
            jsonWriter.name("SigningAlgorithms");
            jsonWriter.beginArray();
            for (String signingAlgorithmsItem : signingAlgorithms) {
                if (signingAlgorithmsItem != null) {
                    jsonWriter.value(signingAlgorithmsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (keyMetadata.getMultiRegion() != null) {
            Boolean multiRegion = keyMetadata.getMultiRegion();
            jsonWriter.name("MultiRegion");
            jsonWriter.value(multiRegion);
        }
        if (keyMetadata.getMultiRegionConfiguration() != null) {
            MultiRegionConfiguration multiRegionConfiguration = keyMetadata
                    .getMultiRegionConfiguration();
            jsonWriter.name("MultiRegionConfiguration");
            MultiRegionConfigurationJsonMarshaller.getInstance().marshall(multiRegionConfiguration,
                    jsonWriter);
        }
        if (keyMetadata.getPendingDeletionWindowInDays() != null) {
            Integer pendingDeletionWindowInDays = keyMetadata.getPendingDeletionWindowInDays();
            jsonWriter.name("PendingDeletionWindowInDays");
            jsonWriter.value(pendingDeletionWindowInDays);
        }
        if (keyMetadata.getMacAlgorithms() != null) {
            java.util.List<String> macAlgorithms = keyMetadata.getMacAlgorithms();
            jsonWriter.name("MacAlgorithms");
            jsonWriter.beginArray();
            for (String macAlgorithmsItem : macAlgorithms) {
                if (macAlgorithmsItem != null) {
                    jsonWriter.value(macAlgorithmsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static KeyMetadataJsonMarshaller instance;

    public static KeyMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KeyMetadataJsonMarshaller();
        return instance;
    }
}
