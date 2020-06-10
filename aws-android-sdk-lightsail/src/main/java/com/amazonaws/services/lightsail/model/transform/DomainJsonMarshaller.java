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
 * JSON marshaller for POJO Domain
 */
class DomainJsonMarshaller {

    public void marshall(Domain domain, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (domain.getName() != null) {
            String name = domain.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (domain.getArn() != null) {
            String arn = domain.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (domain.getSupportCode() != null) {
            String supportCode = domain.getSupportCode();
            jsonWriter.name("supportCode");
            jsonWriter.value(supportCode);
        }
        if (domain.getCreatedAt() != null) {
            java.util.Date createdAt = domain.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (domain.getLocation() != null) {
            ResourceLocation location = domain.getLocation();
            jsonWriter.name("location");
            ResourceLocationJsonMarshaller.getInstance().marshall(location, jsonWriter);
        }
        if (domain.getResourceType() != null) {
            String resourceType = domain.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (domain.getTags() != null) {
            java.util.List<Tag> tags = domain.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (domain.getDomainEntries() != null) {
            java.util.List<DomainEntry> domainEntries = domain.getDomainEntries();
            jsonWriter.name("domainEntries");
            jsonWriter.beginArray();
            for (DomainEntry domainEntriesItem : domainEntries) {
                if (domainEntriesItem != null) {
                    DomainEntryJsonMarshaller.getInstance().marshall(domainEntriesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static DomainJsonMarshaller instance;

    public static DomainJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DomainJsonMarshaller();
        return instance;
    }
}
