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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TemplateVersion
 */
class TemplateVersionJsonMarshaller {

    public void marshall(TemplateVersion templateVersion, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (templateVersion.getCreatedTime() != null) {
            java.util.Date createdTime = templateVersion.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (templateVersion.getErrors() != null) {
            java.util.List<TemplateError> errors = templateVersion.getErrors();
            jsonWriter.name("Errors");
            jsonWriter.beginArray();
            for (TemplateError errorsItem : errors) {
                if (errorsItem != null) {
                    TemplateErrorJsonMarshaller.getInstance().marshall(errorsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (templateVersion.getVersionNumber() != null) {
            Long versionNumber = templateVersion.getVersionNumber();
            jsonWriter.name("VersionNumber");
            jsonWriter.value(versionNumber);
        }
        if (templateVersion.getStatus() != null) {
            String status = templateVersion.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (templateVersion.getDataSetConfigurations() != null) {
            java.util.List<DataSetConfiguration> dataSetConfigurations = templateVersion
                    .getDataSetConfigurations();
            jsonWriter.name("DataSetConfigurations");
            jsonWriter.beginArray();
            for (DataSetConfiguration dataSetConfigurationsItem : dataSetConfigurations) {
                if (dataSetConfigurationsItem != null) {
                    DataSetConfigurationJsonMarshaller.getInstance().marshall(
                            dataSetConfigurationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (templateVersion.getDescription() != null) {
            String description = templateVersion.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (templateVersion.getSourceEntityArn() != null) {
            String sourceEntityArn = templateVersion.getSourceEntityArn();
            jsonWriter.name("SourceEntityArn");
            jsonWriter.value(sourceEntityArn);
        }
        jsonWriter.endObject();
    }

    private static TemplateVersionJsonMarshaller instance;

    public static TemplateVersionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TemplateVersionJsonMarshaller();
        return instance;
    }
}
