/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DetectMitigationActionsTaskTarget
 */
class DetectMitigationActionsTaskTargetJsonMarshaller {

    public void marshall(DetectMitigationActionsTaskTarget detectMitigationActionsTaskTarget,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (detectMitigationActionsTaskTarget.getViolationIds() != null) {
            java.util.List<String> violationIds = detectMitigationActionsTaskTarget
                    .getViolationIds();
            jsonWriter.name("violationIds");
            jsonWriter.beginArray();
            for (String violationIdsItem : violationIds) {
                if (violationIdsItem != null) {
                    jsonWriter.value(violationIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (detectMitigationActionsTaskTarget.getSecurityProfileName() != null) {
            String securityProfileName = detectMitigationActionsTaskTarget.getSecurityProfileName();
            jsonWriter.name("securityProfileName");
            jsonWriter.value(securityProfileName);
        }
        if (detectMitigationActionsTaskTarget.getBehaviorName() != null) {
            String behaviorName = detectMitigationActionsTaskTarget.getBehaviorName();
            jsonWriter.name("behaviorName");
            jsonWriter.value(behaviorName);
        }
        jsonWriter.endObject();
    }

    private static DetectMitigationActionsTaskTargetJsonMarshaller instance;

    public static DetectMitigationActionsTaskTargetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DetectMitigationActionsTaskTargetJsonMarshaller();
        return instance;
    }
}
