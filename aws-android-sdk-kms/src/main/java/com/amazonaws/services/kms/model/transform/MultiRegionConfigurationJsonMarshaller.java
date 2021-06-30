/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO MultiRegionConfiguration
 */
class MultiRegionConfigurationJsonMarshaller {

    public void marshall(MultiRegionConfiguration multiRegionConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (multiRegionConfiguration.getMultiRegionKeyType() != null) {
            String multiRegionKeyType = multiRegionConfiguration.getMultiRegionKeyType();
            jsonWriter.name("MultiRegionKeyType");
            jsonWriter.value(multiRegionKeyType);
        }
        if (multiRegionConfiguration.getPrimaryKey() != null) {
            MultiRegionKey primaryKey = multiRegionConfiguration.getPrimaryKey();
            jsonWriter.name("PrimaryKey");
            MultiRegionKeyJsonMarshaller.getInstance().marshall(primaryKey, jsonWriter);
        }
        if (multiRegionConfiguration.getReplicaKeys() != null) {
            java.util.List<MultiRegionKey> replicaKeys = multiRegionConfiguration.getReplicaKeys();
            jsonWriter.name("ReplicaKeys");
            jsonWriter.beginArray();
            for (MultiRegionKey replicaKeysItem : replicaKeys) {
                if (replicaKeysItem != null) {
                    MultiRegionKeyJsonMarshaller.getInstance()
                            .marshall(replicaKeysItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static MultiRegionConfigurationJsonMarshaller instance;

    public static MultiRegionConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MultiRegionConfigurationJsonMarshaller();
        return instance;
    }
}
