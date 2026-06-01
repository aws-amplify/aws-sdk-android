/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model.transform;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AdapterVersionOverview
 */
class AdapterVersionOverviewJsonMarshaller {

    public void marshall(AdapterVersionOverview adapterVersionOverview, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (adapterVersionOverview.getAdapterId() != null) {
            String adapterId = adapterVersionOverview.getAdapterId();
            jsonWriter.name("AdapterId");
            jsonWriter.value(adapterId);
        }
        if (adapterVersionOverview.getAdapterVersion() != null) {
            String adapterVersion = adapterVersionOverview.getAdapterVersion();
            jsonWriter.name("AdapterVersion");
            jsonWriter.value(adapterVersion);
        }
        if (adapterVersionOverview.getCreationTime() != null) {
            java.util.Date creationTime = adapterVersionOverview.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (adapterVersionOverview.getFeatureTypes() != null) {
            java.util.List<String> featureTypes = adapterVersionOverview.getFeatureTypes();
            jsonWriter.name("FeatureTypes");
            jsonWriter.beginArray();
            for (String featureTypesItem : featureTypes) {
                if (featureTypesItem != null) {
                    jsonWriter.value(featureTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (adapterVersionOverview.getStatus() != null) {
            String status = adapterVersionOverview.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (adapterVersionOverview.getStatusMessage() != null) {
            String statusMessage = adapterVersionOverview.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        jsonWriter.endObject();
    }

    private static AdapterVersionOverviewJsonMarshaller instance;

    public static AdapterVersionOverviewJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AdapterVersionOverviewJsonMarshaller();
        return instance;
    }
}
