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
 * JSON marshaller for POJO RiskExceptionConfigurationType
 */
class RiskExceptionConfigurationTypeJsonMarshaller {

    public void marshall(RiskExceptionConfigurationType riskExceptionConfigurationType,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (riskExceptionConfigurationType.getBlockedIPRangeList() != null) {
            java.util.List<String> blockedIPRangeList = riskExceptionConfigurationType
                    .getBlockedIPRangeList();
            jsonWriter.name("BlockedIPRangeList");
            jsonWriter.beginArray();
            for (String blockedIPRangeListItem : blockedIPRangeList) {
                if (blockedIPRangeListItem != null) {
                    jsonWriter.value(blockedIPRangeListItem);
                }
            }
            jsonWriter.endArray();
        }
        if (riskExceptionConfigurationType.getSkippedIPRangeList() != null) {
            java.util.List<String> skippedIPRangeList = riskExceptionConfigurationType
                    .getSkippedIPRangeList();
            jsonWriter.name("SkippedIPRangeList");
            jsonWriter.beginArray();
            for (String skippedIPRangeListItem : skippedIPRangeList) {
                if (skippedIPRangeListItem != null) {
                    jsonWriter.value(skippedIPRangeListItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static RiskExceptionConfigurationTypeJsonMarshaller instance;

    public static RiskExceptionConfigurationTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RiskExceptionConfigurationTypeJsonMarshaller();
        return instance;
    }
}
