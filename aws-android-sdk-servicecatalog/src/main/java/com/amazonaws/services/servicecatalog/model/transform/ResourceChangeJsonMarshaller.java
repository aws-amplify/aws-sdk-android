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

package com.amazonaws.services.servicecatalog.model.transform;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResourceChange
 */
class ResourceChangeJsonMarshaller {

    public void marshall(ResourceChange resourceChange, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resourceChange.getAction() != null) {
            String action = resourceChange.getAction();
            jsonWriter.name("Action");
            jsonWriter.value(action);
        }
        if (resourceChange.getLogicalResourceId() != null) {
            String logicalResourceId = resourceChange.getLogicalResourceId();
            jsonWriter.name("LogicalResourceId");
            jsonWriter.value(logicalResourceId);
        }
        if (resourceChange.getPhysicalResourceId() != null) {
            String physicalResourceId = resourceChange.getPhysicalResourceId();
            jsonWriter.name("PhysicalResourceId");
            jsonWriter.value(physicalResourceId);
        }
        if (resourceChange.getResourceType() != null) {
            String resourceType = resourceChange.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        if (resourceChange.getReplacement() != null) {
            String replacement = resourceChange.getReplacement();
            jsonWriter.name("Replacement");
            jsonWriter.value(replacement);
        }
        if (resourceChange.getScope() != null) {
            java.util.List<String> scope = resourceChange.getScope();
            jsonWriter.name("Scope");
            jsonWriter.beginArray();
            for (String scopeItem : scope) {
                if (scopeItem != null) {
                    jsonWriter.value(scopeItem);
                }
            }
            jsonWriter.endArray();
        }
        if (resourceChange.getDetails() != null) {
            java.util.List<ResourceChangeDetail> details = resourceChange.getDetails();
            jsonWriter.name("Details");
            jsonWriter.beginArray();
            for (ResourceChangeDetail detailsItem : details) {
                if (detailsItem != null) {
                    ResourceChangeDetailJsonMarshaller.getInstance().marshall(detailsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ResourceChangeJsonMarshaller instance;

    public static ResourceChangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceChangeJsonMarshaller();
        return instance;
    }
}
