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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ProvisioningTemplateVersionSummary
 */
class ProvisioningTemplateVersionSummaryJsonMarshaller {

    public void marshall(ProvisioningTemplateVersionSummary provisioningTemplateVersionSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (provisioningTemplateVersionSummary.getVersionId() != null) {
            Integer versionId = provisioningTemplateVersionSummary.getVersionId();
            jsonWriter.name("versionId");
            jsonWriter.value(versionId);
        }
        if (provisioningTemplateVersionSummary.getCreationDate() != null) {
            java.util.Date creationDate = provisioningTemplateVersionSummary.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        if (provisioningTemplateVersionSummary.getIsDefaultVersion() != null) {
            Boolean isDefaultVersion = provisioningTemplateVersionSummary.getIsDefaultVersion();
            jsonWriter.name("isDefaultVersion");
            jsonWriter.value(isDefaultVersion);
        }
        jsonWriter.endObject();
    }

    private static ProvisioningTemplateVersionSummaryJsonMarshaller instance;

    public static ProvisioningTemplateVersionSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProvisioningTemplateVersionSummaryJsonMarshaller();
        return instance;
    }
}
