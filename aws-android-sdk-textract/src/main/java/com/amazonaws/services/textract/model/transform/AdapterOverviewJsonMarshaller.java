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
 * JSON marshaller for POJO AdapterOverview
 */
class AdapterOverviewJsonMarshaller {

    public void marshall(AdapterOverview adapterOverview, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (adapterOverview.getAdapterId() != null) {
            String adapterId = adapterOverview.getAdapterId();
            jsonWriter.name("AdapterId");
            jsonWriter.value(adapterId);
        }
        if (adapterOverview.getAdapterName() != null) {
            String adapterName = adapterOverview.getAdapterName();
            jsonWriter.name("AdapterName");
            jsonWriter.value(adapterName);
        }
        if (adapterOverview.getCreationTime() != null) {
            java.util.Date creationTime = adapterOverview.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (adapterOverview.getFeatureTypes() != null) {
            java.util.List<String> featureTypes = adapterOverview.getFeatureTypes();
            jsonWriter.name("FeatureTypes");
            jsonWriter.beginArray();
            for (String featureTypesItem : featureTypes) {
                if (featureTypesItem != null) {
                    jsonWriter.value(featureTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AdapterOverviewJsonMarshaller instance;

    public static AdapterOverviewJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AdapterOverviewJsonMarshaller();
        return instance;
    }
}
