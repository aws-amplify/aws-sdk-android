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

package com.amazonaws.services.amazonelasticmapreduce.model.transform;

import com.amazonaws.services.amazonelasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BlockPublicAccessConfigurationMetadata
 */
class BlockPublicAccessConfigurationMetadataJsonMarshaller {

    public void marshall(
            BlockPublicAccessConfigurationMetadata blockPublicAccessConfigurationMetadata,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (blockPublicAccessConfigurationMetadata.getCreationDateTime() != null) {
            java.util.Date creationDateTime = blockPublicAccessConfigurationMetadata
                    .getCreationDateTime();
            jsonWriter.name("CreationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (blockPublicAccessConfigurationMetadata.getCreatedByArn() != null) {
            String createdByArn = blockPublicAccessConfigurationMetadata.getCreatedByArn();
            jsonWriter.name("CreatedByArn");
            jsonWriter.value(createdByArn);
        }
        jsonWriter.endObject();
    }

    private static BlockPublicAccessConfigurationMetadataJsonMarshaller instance;

    public static BlockPublicAccessConfigurationMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BlockPublicAccessConfigurationMetadataJsonMarshaller();
        return instance;
    }
}
