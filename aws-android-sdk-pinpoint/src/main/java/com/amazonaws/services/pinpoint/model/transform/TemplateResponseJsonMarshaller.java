/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO TemplateResponse
 */
class TemplateResponseJsonMarshaller {

    public void marshall(TemplateResponse templateResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (templateResponse.getArn() != null) {
            String arn = templateResponse.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (templateResponse.getCreationDate() != null) {
            String creationDate = templateResponse.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (templateResponse.getLastModifiedDate() != null) {
            String lastModifiedDate = templateResponse.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (templateResponse.getTags() != null) {
            java.util.Map<String, String> tags = templateResponse.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (templateResponse.getTemplateName() != null) {
            String templateName = templateResponse.getTemplateName();
            jsonWriter.name("TemplateName");
            jsonWriter.value(templateName);
        }
        if (templateResponse.getTemplateType() != null) {
            String templateType = templateResponse.getTemplateType();
            jsonWriter.name("TemplateType");
            jsonWriter.value(templateType);
        }
        jsonWriter.endObject();
    }

    private static TemplateResponseJsonMarshaller instance;

    public static TemplateResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TemplateResponseJsonMarshaller();
        return instance;
    }
}
