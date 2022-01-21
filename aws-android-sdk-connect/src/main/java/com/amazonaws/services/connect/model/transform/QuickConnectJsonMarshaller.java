/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO QuickConnect
 */
class QuickConnectJsonMarshaller {

    public void marshall(QuickConnect quickConnect, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (quickConnect.getQuickConnectARN() != null) {
            String quickConnectARN = quickConnect.getQuickConnectARN();
            jsonWriter.name("QuickConnectARN");
            jsonWriter.value(quickConnectARN);
        }
        if (quickConnect.getQuickConnectId() != null) {
            String quickConnectId = quickConnect.getQuickConnectId();
            jsonWriter.name("QuickConnectId");
            jsonWriter.value(quickConnectId);
        }
        if (quickConnect.getName() != null) {
            String name = quickConnect.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (quickConnect.getDescription() != null) {
            String description = quickConnect.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (quickConnect.getQuickConnectConfig() != null) {
            QuickConnectConfig quickConnectConfig = quickConnect.getQuickConnectConfig();
            jsonWriter.name("QuickConnectConfig");
            QuickConnectConfigJsonMarshaller.getInstance().marshall(quickConnectConfig, jsonWriter);
        }
        if (quickConnect.getTags() != null) {
            java.util.Map<String, String> tags = quickConnect.getTags();
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

    private static QuickConnectJsonMarshaller instance;

    public static QuickConnectJsonMarshaller getInstance() {
        if (instance == null)
            instance = new QuickConnectJsonMarshaller();
        return instance;
    }
}
