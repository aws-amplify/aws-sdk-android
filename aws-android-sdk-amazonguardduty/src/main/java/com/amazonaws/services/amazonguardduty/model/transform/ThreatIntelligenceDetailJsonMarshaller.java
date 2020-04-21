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

package com.amazonaws.services.amazonguardduty.model.transform;

import com.amazonaws.services.amazonguardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ThreatIntelligenceDetail
 */
class ThreatIntelligenceDetailJsonMarshaller {

    public void marshall(ThreatIntelligenceDetail threatIntelligenceDetail, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (threatIntelligenceDetail.getThreatListName() != null) {
            String threatListName = threatIntelligenceDetail.getThreatListName();
            jsonWriter.name("ThreatListName");
            jsonWriter.value(threatListName);
        }
        if (threatIntelligenceDetail.getThreatNames() != null) {
            java.util.List<String> threatNames = threatIntelligenceDetail.getThreatNames();
            jsonWriter.name("ThreatNames");
            jsonWriter.beginArray();
            for (String threatNamesItem : threatNames) {
                if (threatNamesItem != null) {
                    jsonWriter.value(threatNamesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ThreatIntelligenceDetailJsonMarshaller instance;

    public static ThreatIntelligenceDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ThreatIntelligenceDetailJsonMarshaller();
        return instance;
    }
}
