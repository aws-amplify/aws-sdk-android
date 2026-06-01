/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO AnalyticsDataAssociationResult
 */
class AnalyticsDataAssociationResultJsonMarshaller {

    public void marshall(AnalyticsDataAssociationResult analyticsDataAssociationResult,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (analyticsDataAssociationResult.getDataSetId() != null) {
            String dataSetId = analyticsDataAssociationResult.getDataSetId();
            jsonWriter.name("DataSetId");
            jsonWriter.value(dataSetId);
        }
        if (analyticsDataAssociationResult.getTargetAccountId() != null) {
            String targetAccountId = analyticsDataAssociationResult.getTargetAccountId();
            jsonWriter.name("TargetAccountId");
            jsonWriter.value(targetAccountId);
        }
        if (analyticsDataAssociationResult.getResourceShareId() != null) {
            String resourceShareId = analyticsDataAssociationResult.getResourceShareId();
            jsonWriter.name("ResourceShareId");
            jsonWriter.value(resourceShareId);
        }
        if (analyticsDataAssociationResult.getResourceShareArn() != null) {
            String resourceShareArn = analyticsDataAssociationResult.getResourceShareArn();
            jsonWriter.name("ResourceShareArn");
            jsonWriter.value(resourceShareArn);
        }
        jsonWriter.endObject();
    }

    private static AnalyticsDataAssociationResultJsonMarshaller instance;

    public static AnalyticsDataAssociationResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AnalyticsDataAssociationResultJsonMarshaller();
        return instance;
    }
}
