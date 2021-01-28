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
 * JSON marshaller for POJO ProvisioningTemplateSummary
 */
class ProvisioningTemplateSummaryJsonMarshaller {

    public void marshall(ProvisioningTemplateSummary provisioningTemplateSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (provisioningTemplateSummary.getTemplateArn() != null) {
            String templateArn = provisioningTemplateSummary.getTemplateArn();
            jsonWriter.name("templateArn");
            jsonWriter.value(templateArn);
        }
        if (provisioningTemplateSummary.getTemplateName() != null) {
            String templateName = provisioningTemplateSummary.getTemplateName();
            jsonWriter.name("templateName");
            jsonWriter.value(templateName);
        }
        if (provisioningTemplateSummary.getDescription() != null) {
            String description = provisioningTemplateSummary.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (provisioningTemplateSummary.getCreationDate() != null) {
            java.util.Date creationDate = provisioningTemplateSummary.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        if (provisioningTemplateSummary.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = provisioningTemplateSummary.getLastModifiedDate();
            jsonWriter.name("lastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (provisioningTemplateSummary.getEnabled() != null) {
            Boolean enabled = provisioningTemplateSummary.getEnabled();
            jsonWriter.name("enabled");
            jsonWriter.value(enabled);
        }
        jsonWriter.endObject();
    }

    private static ProvisioningTemplateSummaryJsonMarshaller instance;

    public static ProvisioningTemplateSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProvisioningTemplateSummaryJsonMarshaller();
        return instance;
    }
}
