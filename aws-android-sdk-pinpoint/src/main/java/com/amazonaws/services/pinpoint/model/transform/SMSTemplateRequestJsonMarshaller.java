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
 * JSON marshaller for POJO SMSTemplateRequest
 */
class SMSTemplateRequestJsonMarshaller {

    public void marshall(SMSTemplateRequest sMSTemplateRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sMSTemplateRequest.getBody() != null) {
            String body = sMSTemplateRequest.getBody();
            jsonWriter.name("Body");
            jsonWriter.value(body);
        }
        if (sMSTemplateRequest.getTags() != null) {
            java.util.Map<String, String> tags = sMSTemplateRequest.getTags();
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
        jsonWriter.endObject();
    }

    private static SMSTemplateRequestJsonMarshaller instance;

    public static SMSTemplateRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SMSTemplateRequestJsonMarshaller();
        return instance;
    }
}
