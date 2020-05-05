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

package com.amazonaws.services.support.model.transform;

import com.amazonaws.services.support.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TrustedAdvisorCheckDescription
 */
class TrustedAdvisorCheckDescriptionJsonMarshaller {

    public void marshall(TrustedAdvisorCheckDescription trustedAdvisorCheckDescription,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (trustedAdvisorCheckDescription.getId() != null) {
            String id = trustedAdvisorCheckDescription.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (trustedAdvisorCheckDescription.getName() != null) {
            String name = trustedAdvisorCheckDescription.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (trustedAdvisorCheckDescription.getDescription() != null) {
            String description = trustedAdvisorCheckDescription.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (trustedAdvisorCheckDescription.getCategory() != null) {
            String category = trustedAdvisorCheckDescription.getCategory();
            jsonWriter.name("category");
            jsonWriter.value(category);
        }
        if (trustedAdvisorCheckDescription.getMetadata() != null) {
            java.util.List<String> metadata = trustedAdvisorCheckDescription.getMetadata();
            jsonWriter.name("metadata");
            jsonWriter.beginArray();
            for (String metadataItem : metadata) {
                if (metadataItem != null) {
                    jsonWriter.value(metadataItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TrustedAdvisorCheckDescriptionJsonMarshaller instance;

    public static TrustedAdvisorCheckDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrustedAdvisorCheckDescriptionJsonMarshaller();
        return instance;
    }
}
