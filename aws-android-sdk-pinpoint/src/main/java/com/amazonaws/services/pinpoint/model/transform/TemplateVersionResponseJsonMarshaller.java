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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TemplateVersionResponse
 */
class TemplateVersionResponseJsonMarshaller {

    public void marshall(TemplateVersionResponse templateVersionResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (templateVersionResponse.getCreationDate() != null) {
            String creationDate = templateVersionResponse.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (templateVersionResponse.getDefaultSubstitutions() != null) {
            String defaultSubstitutions = templateVersionResponse.getDefaultSubstitutions();
            jsonWriter.name("DefaultSubstitutions");
            jsonWriter.value(defaultSubstitutions);
        }
        if (templateVersionResponse.getLastModifiedDate() != null) {
            String lastModifiedDate = templateVersionResponse.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (templateVersionResponse.getTemplateDescription() != null) {
            String templateDescription = templateVersionResponse.getTemplateDescription();
            jsonWriter.name("TemplateDescription");
            jsonWriter.value(templateDescription);
        }
        if (templateVersionResponse.getTemplateName() != null) {
            String templateName = templateVersionResponse.getTemplateName();
            jsonWriter.name("TemplateName");
            jsonWriter.value(templateName);
        }
        if (templateVersionResponse.getTemplateType() != null) {
            String templateType = templateVersionResponse.getTemplateType();
            jsonWriter.name("TemplateType");
            jsonWriter.value(templateType);
        }
        if (templateVersionResponse.getVersion() != null) {
            String version = templateVersionResponse.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static TemplateVersionResponseJsonMarshaller instance;

    public static TemplateVersionResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TemplateVersionResponseJsonMarshaller();
        return instance;
    }
}
