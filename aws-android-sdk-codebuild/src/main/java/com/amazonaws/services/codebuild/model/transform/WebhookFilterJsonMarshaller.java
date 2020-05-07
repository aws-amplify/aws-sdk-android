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

package com.amazonaws.services.codebuild.model.transform;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO WebhookFilter
 */
class WebhookFilterJsonMarshaller {

    public void marshall(WebhookFilter webhookFilter, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (webhookFilter.getType() != null) {
            String type = webhookFilter.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (webhookFilter.getPattern() != null) {
            String pattern = webhookFilter.getPattern();
            jsonWriter.name("pattern");
            jsonWriter.value(pattern);
        }
        if (webhookFilter.getExcludeMatchedPattern() != null) {
            Boolean excludeMatchedPattern = webhookFilter.getExcludeMatchedPattern();
            jsonWriter.name("excludeMatchedPattern");
            jsonWriter.value(excludeMatchedPattern);
        }
        jsonWriter.endObject();
    }

    private static WebhookFilterJsonMarshaller instance;

    public static WebhookFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WebhookFilterJsonMarshaller();
        return instance;
    }
}
