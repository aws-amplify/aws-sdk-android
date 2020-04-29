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
 * JSON marshaller for POJO Namespace
 */
class NamespaceJsonMarshaller {

    public void marshall(Namespace namespace, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (namespace.getId() != null) {
            String id = namespace.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (namespace.getArn() != null) {
            String arn = namespace.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (namespace.getName() != null) {
            String name = namespace.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (namespace.getType() != null) {
            String type = namespace.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (namespace.getDescription() != null) {
            String description = namespace.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (namespace.getServiceCount() != null) {
            Integer serviceCount = namespace.getServiceCount();
            jsonWriter.name("ServiceCount");
            jsonWriter.value(serviceCount);
        }
        if (namespace.getProperties() != null) {
            NamespaceProperties properties = namespace.getProperties();
            jsonWriter.name("Properties");
            NamespacePropertiesJsonMarshaller.getInstance().marshall(properties, jsonWriter);
        }
        if (namespace.getCreateDate() != null) {
            java.util.Date createDate = namespace.getCreateDate();
            jsonWriter.name("CreateDate");
            jsonWriter.value(createDate);
        }
        if (namespace.getCreatorRequestId() != null) {
            String creatorRequestId = namespace.getCreatorRequestId();
            jsonWriter.name("CreatorRequestId");
            jsonWriter.value(creatorRequestId);
        }
        jsonWriter.endObject();
    }

    private static NamespaceJsonMarshaller instance;

    public static NamespaceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NamespaceJsonMarshaller();
        return instance;
    }
}
