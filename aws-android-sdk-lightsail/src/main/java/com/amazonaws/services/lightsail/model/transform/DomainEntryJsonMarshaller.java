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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DomainEntry
 */
class DomainEntryJsonMarshaller {

    public void marshall(DomainEntry domainEntry, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (domainEntry.getId() != null) {
            String id = domainEntry.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (domainEntry.getName() != null) {
            String name = domainEntry.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (domainEntry.getTarget() != null) {
            String target = domainEntry.getTarget();
            jsonWriter.name("target");
            jsonWriter.value(target);
        }
        if (domainEntry.getIsAlias() != null) {
            Boolean isAlias = domainEntry.getIsAlias();
            jsonWriter.name("isAlias");
            jsonWriter.value(isAlias);
        }
        if (domainEntry.getType() != null) {
            String type = domainEntry.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (domainEntry.getOptions() != null) {
            java.util.Map<String, String> options = domainEntry.getOptions();
            jsonWriter.name("options");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> optionsEntry : options.entrySet()) {
                String optionsValue = optionsEntry.getValue();
                if (optionsValue != null) {
                    jsonWriter.name(optionsEntry.getKey());
                    jsonWriter.value(optionsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static DomainEntryJsonMarshaller instance;

    public static DomainEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DomainEntryJsonMarshaller();
        return instance;
    }
}
