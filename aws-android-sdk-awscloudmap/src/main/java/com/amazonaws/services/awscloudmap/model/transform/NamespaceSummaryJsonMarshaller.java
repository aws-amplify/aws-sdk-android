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

package com.amazonaws.services.awscloudmap.model.transform;

import com.amazonaws.services.awscloudmap.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NamespaceSummary
 */
class NamespaceSummaryJsonMarshaller {

    public void marshall(NamespaceSummary namespaceSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (namespaceSummary.getId() != null) {
            String id = namespaceSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (namespaceSummary.getArn() != null) {
            String arn = namespaceSummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (namespaceSummary.getName() != null) {
            String name = namespaceSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (namespaceSummary.getType() != null) {
            String type = namespaceSummary.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (namespaceSummary.getDescription() != null) {
            String description = namespaceSummary.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (namespaceSummary.getServiceCount() != null) {
            Integer serviceCount = namespaceSummary.getServiceCount();
            jsonWriter.name("ServiceCount");
            jsonWriter.value(serviceCount);
        }
        if (namespaceSummary.getProperties() != null) {
            NamespaceProperties properties = namespaceSummary.getProperties();
            jsonWriter.name("Properties");
            NamespacePropertiesJsonMarshaller.getInstance().marshall(properties, jsonWriter);
        }
        if (namespaceSummary.getCreateDate() != null) {
            java.util.Date createDate = namespaceSummary.getCreateDate();
            jsonWriter.name("CreateDate");
            jsonWriter.value(createDate);
        }
        jsonWriter.endObject();
    }

    private static NamespaceSummaryJsonMarshaller instance;

    public static NamespaceSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NamespaceSummaryJsonMarshaller();
        return instance;
    }
}
