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

package com.amazonaws.services.schemas.model.transform;

import com.amazonaws.services.schemas.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RegistrySummary
 */
class RegistrySummaryJsonMarshaller {

    public void marshall(RegistrySummary registrySummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (registrySummary.getRegistryArn() != null) {
            String registryArn = registrySummary.getRegistryArn();
            jsonWriter.name("RegistryArn");
            jsonWriter.value(registryArn);
        }
        if (registrySummary.getRegistryName() != null) {
            String registryName = registrySummary.getRegistryName();
            jsonWriter.name("RegistryName");
            jsonWriter.value(registryName);
        }
        if (registrySummary.getTags() != null) {
            java.util.Map<String, String> tags = registrySummary.getTags();
            jsonWriter.name("Tags");
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

    private static RegistrySummaryJsonMarshaller instance;

    public static RegistrySummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RegistrySummaryJsonMarshaller();
        return instance;
    }
}
