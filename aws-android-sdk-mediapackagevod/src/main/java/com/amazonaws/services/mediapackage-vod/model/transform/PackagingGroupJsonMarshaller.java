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
package com.amazonaws.services.mediapackage-vod.model.transform;

import com.amazonaws.services.mediapackage-vod.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PackagingGroup
 */
class PackagingGroupJsonMarshaller {

    public void marshall(PackagingGroup packagingGroup, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (packagingGroup.getArn() != null) {
            String arn = packagingGroup.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (packagingGroup.getAuthorization() != null) {
            Authorization authorization = packagingGroup.getAuthorization();
            jsonWriter.name("Authorization");
            AuthorizationJsonMarshaller.getInstance().marshall(authorization, jsonWriter);
        }
        if (packagingGroup.getDomainName() != null) {
            String domainName = packagingGroup.getDomainName();
            jsonWriter.name("DomainName");
            jsonWriter.value(domainName);
        }
        if (packagingGroup.getId() != null) {
            String id = packagingGroup.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (packagingGroup.getTags() != null) {
            java.util.Map<String, String> tags = packagingGroup.getTags();
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

    private static PackagingGroupJsonMarshaller instance;
    public static PackagingGroupJsonMarshaller getInstance() {
        if (instance == null) instance = new PackagingGroupJsonMarshaller();
        return instance;
    }
}
