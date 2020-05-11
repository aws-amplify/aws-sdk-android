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

package com.amazonaws.services.kendra.model.transform;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3DataSourceConfiguration
 */
class S3DataSourceConfigurationJsonMarshaller {

    public void marshall(S3DataSourceConfiguration s3DataSourceConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3DataSourceConfiguration.getBucketName() != null) {
            String bucketName = s3DataSourceConfiguration.getBucketName();
            jsonWriter.name("BucketName");
            jsonWriter.value(bucketName);
        }
        if (s3DataSourceConfiguration.getInclusionPrefixes() != null) {
            java.util.List<String> inclusionPrefixes = s3DataSourceConfiguration
                    .getInclusionPrefixes();
            jsonWriter.name("InclusionPrefixes");
            jsonWriter.beginArray();
            for (String inclusionPrefixesItem : inclusionPrefixes) {
                if (inclusionPrefixesItem != null) {
                    jsonWriter.value(inclusionPrefixesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (s3DataSourceConfiguration.getExclusionPatterns() != null) {
            java.util.List<String> exclusionPatterns = s3DataSourceConfiguration
                    .getExclusionPatterns();
            jsonWriter.name("ExclusionPatterns");
            jsonWriter.beginArray();
            for (String exclusionPatternsItem : exclusionPatterns) {
                if (exclusionPatternsItem != null) {
                    jsonWriter.value(exclusionPatternsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (s3DataSourceConfiguration.getDocumentsMetadataConfiguration() != null) {
            DocumentsMetadataConfiguration documentsMetadataConfiguration = s3DataSourceConfiguration
                    .getDocumentsMetadataConfiguration();
            jsonWriter.name("DocumentsMetadataConfiguration");
            DocumentsMetadataConfigurationJsonMarshaller.getInstance().marshall(
                    documentsMetadataConfiguration, jsonWriter);
        }
        if (s3DataSourceConfiguration.getAccessControlListConfiguration() != null) {
            AccessControlListConfiguration accessControlListConfiguration = s3DataSourceConfiguration
                    .getAccessControlListConfiguration();
            jsonWriter.name("AccessControlListConfiguration");
            AccessControlListConfigurationJsonMarshaller.getInstance().marshall(
                    accessControlListConfiguration, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static S3DataSourceConfigurationJsonMarshaller instance;

    public static S3DataSourceConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3DataSourceConfigurationJsonMarshaller();
        return instance;
    }
}
