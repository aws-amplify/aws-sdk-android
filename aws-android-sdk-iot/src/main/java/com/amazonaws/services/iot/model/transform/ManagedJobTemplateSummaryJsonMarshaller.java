/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO ManagedJobTemplateSummary
 */
class ManagedJobTemplateSummaryJsonMarshaller {

    public void marshall(ManagedJobTemplateSummary managedJobTemplateSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (managedJobTemplateSummary.getTemplateArn() != null) {
            String templateArn = managedJobTemplateSummary.getTemplateArn();
            jsonWriter.name("templateArn");
            jsonWriter.value(templateArn);
        }
        if (managedJobTemplateSummary.getTemplateName() != null) {
            String templateName = managedJobTemplateSummary.getTemplateName();
            jsonWriter.name("templateName");
            jsonWriter.value(templateName);
        }
        if (managedJobTemplateSummary.getDescription() != null) {
            String description = managedJobTemplateSummary.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (managedJobTemplateSummary.getEnvironments() != null) {
            java.util.List<String> environments = managedJobTemplateSummary.getEnvironments();
            jsonWriter.name("environments");
            jsonWriter.beginArray();
            for (String environmentsItem : environments) {
                if (environmentsItem != null) {
                    jsonWriter.value(environmentsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (managedJobTemplateSummary.getTemplateVersion() != null) {
            String templateVersion = managedJobTemplateSummary.getTemplateVersion();
            jsonWriter.name("templateVersion");
            jsonWriter.value(templateVersion);
        }
        jsonWriter.endObject();
    }

    private static ManagedJobTemplateSummaryJsonMarshaller instance;

    public static ManagedJobTemplateSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ManagedJobTemplateSummaryJsonMarshaller();
        return instance;
    }
}
