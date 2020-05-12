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

package com.amazonaws.services.iotsitewise.model.transform;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AssetModelSummary
 */
class AssetModelSummaryJsonMarshaller {

    public void marshall(AssetModelSummary assetModelSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (assetModelSummary.getId() != null) {
            String id = assetModelSummary.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (assetModelSummary.getArn() != null) {
            String arn = assetModelSummary.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (assetModelSummary.getName() != null) {
            String name = assetModelSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (assetModelSummary.getDescription() != null) {
            String description = assetModelSummary.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (assetModelSummary.getCreationDate() != null) {
            java.util.Date creationDate = assetModelSummary.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        if (assetModelSummary.getLastUpdateDate() != null) {
            java.util.Date lastUpdateDate = assetModelSummary.getLastUpdateDate();
            jsonWriter.name("lastUpdateDate");
            jsonWriter.value(lastUpdateDate);
        }
        if (assetModelSummary.getStatus() != null) {
            AssetModelStatus status = assetModelSummary.getStatus();
            jsonWriter.name("status");
            AssetModelStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AssetModelSummaryJsonMarshaller instance;

    public static AssetModelSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssetModelSummaryJsonMarshaller();
        return instance;
    }
}
