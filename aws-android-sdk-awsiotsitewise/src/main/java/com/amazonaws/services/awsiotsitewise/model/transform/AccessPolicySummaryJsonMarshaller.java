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

package com.amazonaws.services.awsiotsitewise.model.transform;

import com.amazonaws.services.awsiotsitewise.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AccessPolicySummary
 */
class AccessPolicySummaryJsonMarshaller {

    public void marshall(AccessPolicySummary accessPolicySummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (accessPolicySummary.getId() != null) {
            String id = accessPolicySummary.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (accessPolicySummary.getIdentity() != null) {
            Identity identity = accessPolicySummary.getIdentity();
            jsonWriter.name("identity");
            IdentityJsonMarshaller.getInstance().marshall(identity, jsonWriter);
        }
        if (accessPolicySummary.getResource() != null) {
            Resource resource = accessPolicySummary.getResource();
            jsonWriter.name("resource");
            ResourceJsonMarshaller.getInstance().marshall(resource, jsonWriter);
        }
        if (accessPolicySummary.getPermission() != null) {
            String permission = accessPolicySummary.getPermission();
            jsonWriter.name("permission");
            jsonWriter.value(permission);
        }
        if (accessPolicySummary.getCreationDate() != null) {
            java.util.Date creationDate = accessPolicySummary.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        if (accessPolicySummary.getLastUpdateDate() != null) {
            java.util.Date lastUpdateDate = accessPolicySummary.getLastUpdateDate();
            jsonWriter.name("lastUpdateDate");
            jsonWriter.value(lastUpdateDate);
        }
        jsonWriter.endObject();
    }

    private static AccessPolicySummaryJsonMarshaller instance;

    public static AccessPolicySummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AccessPolicySummaryJsonMarshaller();
        return instance;
    }
}
