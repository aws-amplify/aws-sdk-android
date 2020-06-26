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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UiTemplateInfo
 */
class UiTemplateInfoJsonMarshaller {

    public void marshall(UiTemplateInfo uiTemplateInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (uiTemplateInfo.getUrl() != null) {
            String url = uiTemplateInfo.getUrl();
            jsonWriter.name("Url");
            jsonWriter.value(url);
        }
        if (uiTemplateInfo.getContentSha256() != null) {
            String contentSha256 = uiTemplateInfo.getContentSha256();
            jsonWriter.name("ContentSha256");
            jsonWriter.value(contentSha256);
        }
        jsonWriter.endObject();
    }

    private static UiTemplateInfoJsonMarshaller instance;

    public static UiTemplateInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UiTemplateInfoJsonMarshaller();
        return instance;
    }
}
