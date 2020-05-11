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
 * JSON marshaller for POJO SalesforceStandardObjectAttachmentConfiguration
 */
class SalesforceStandardObjectAttachmentConfigurationJsonMarshaller {

    public void marshall(
            SalesforceStandardObjectAttachmentConfiguration salesforceStandardObjectAttachmentConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (salesforceStandardObjectAttachmentConfiguration.getDocumentTitleFieldName() != null) {
            String documentTitleFieldName = salesforceStandardObjectAttachmentConfiguration
                    .getDocumentTitleFieldName();
            jsonWriter.name("DocumentTitleFieldName");
            jsonWriter.value(documentTitleFieldName);
        }
        if (salesforceStandardObjectAttachmentConfiguration.getFieldMappings() != null) {
            java.util.List<DataSourceToIndexFieldMapping> fieldMappings = salesforceStandardObjectAttachmentConfiguration
                    .getFieldMappings();
            jsonWriter.name("FieldMappings");
            jsonWriter.beginArray();
            for (DataSourceToIndexFieldMapping fieldMappingsItem : fieldMappings) {
                if (fieldMappingsItem != null) {
                    DataSourceToIndexFieldMappingJsonMarshaller.getInstance().marshall(
                            fieldMappingsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static SalesforceStandardObjectAttachmentConfigurationJsonMarshaller instance;

    public static SalesforceStandardObjectAttachmentConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SalesforceStandardObjectAttachmentConfigurationJsonMarshaller();
        return instance;
    }
}
