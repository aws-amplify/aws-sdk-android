/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EventRiskType
 */
class EventRiskTypeJsonMarshaller {

    public void marshall(EventRiskType eventRiskType, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (eventRiskType.getRiskDecision() != null) {
            String riskDecision = eventRiskType.getRiskDecision();
            jsonWriter.name("RiskDecision");
            jsonWriter.value(riskDecision);
        }
        if (eventRiskType.getRiskLevel() != null) {
            String riskLevel = eventRiskType.getRiskLevel();
            jsonWriter.name("RiskLevel");
            jsonWriter.value(riskLevel);
        }
        jsonWriter.endObject();
    }

    private static EventRiskTypeJsonMarshaller instance;

    public static EventRiskTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventRiskTypeJsonMarshaller();
        return instance;
    }
}
