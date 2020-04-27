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

package com.amazonaws.services.accessanalyzer.model.transform;

import com.amazonaws.services.accessanalyzer.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AnalyzedResource
 */
class AnalyzedResourceJsonMarshaller {

    public void marshall(AnalyzedResource analyzedResource, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (analyzedResource.getActions() != null) {
            java.util.List<String> actions = analyzedResource.getActions();
            jsonWriter.name("actions");
            jsonWriter.beginArray();
            for (String actionsItem : actions) {
                if (actionsItem != null) {
                    jsonWriter.value(actionsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (analyzedResource.getAnalyzedAt() != null) {
            java.util.Date analyzedAt = analyzedResource.getAnalyzedAt();
            jsonWriter.name("analyzedAt");
            jsonWriter.value(analyzedAt);
        }
        if (analyzedResource.getCreatedAt() != null) {
            java.util.Date createdAt = analyzedResource.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (analyzedResource.getError() != null) {
            String error = analyzedResource.getError();
            jsonWriter.name("error");
            jsonWriter.value(error);
        }
        if (analyzedResource.getIsPublic() != null) {
            Boolean isPublic = analyzedResource.getIsPublic();
            jsonWriter.name("isPublic");
            jsonWriter.value(isPublic);
        }
        if (analyzedResource.getResourceArn() != null) {
            String resourceArn = analyzedResource.getResourceArn();
            jsonWriter.name("resourceArn");
            jsonWriter.value(resourceArn);
        }
        if (analyzedResource.getResourceOwnerAccount() != null) {
            String resourceOwnerAccount = analyzedResource.getResourceOwnerAccount();
            jsonWriter.name("resourceOwnerAccount");
            jsonWriter.value(resourceOwnerAccount);
        }
        if (analyzedResource.getResourceType() != null) {
            String resourceType = analyzedResource.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (analyzedResource.getSharedVia() != null) {
            java.util.List<String> sharedVia = analyzedResource.getSharedVia();
            jsonWriter.name("sharedVia");
            jsonWriter.beginArray();
            for (String sharedViaItem : sharedVia) {
                if (sharedViaItem != null) {
                    jsonWriter.value(sharedViaItem);
                }
            }
            jsonWriter.endArray();
        }
        if (analyzedResource.getStatus() != null) {
            String status = analyzedResource.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (analyzedResource.getUpdatedAt() != null) {
            java.util.Date updatedAt = analyzedResource.getUpdatedAt();
            jsonWriter.name("updatedAt");
            jsonWriter.value(updatedAt);
        }
        jsonWriter.endObject();
    }

    private static AnalyzedResourceJsonMarshaller instance;

    public static AnalyzedResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AnalyzedResourceJsonMarshaller();
        return instance;
    }
}
