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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SeveritySummary
 */
class SeveritySummaryJsonMarshaller {

    public void marshall(SeveritySummary severitySummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (severitySummary.getCriticalCount() != null) {
            Integer criticalCount = severitySummary.getCriticalCount();
            jsonWriter.name("CriticalCount");
            jsonWriter.value(criticalCount);
        }
        if (severitySummary.getHighCount() != null) {
            Integer highCount = severitySummary.getHighCount();
            jsonWriter.name("HighCount");
            jsonWriter.value(highCount);
        }
        if (severitySummary.getMediumCount() != null) {
            Integer mediumCount = severitySummary.getMediumCount();
            jsonWriter.name("MediumCount");
            jsonWriter.value(mediumCount);
        }
        if (severitySummary.getLowCount() != null) {
            Integer lowCount = severitySummary.getLowCount();
            jsonWriter.name("LowCount");
            jsonWriter.value(lowCount);
        }
        if (severitySummary.getInformationalCount() != null) {
            Integer informationalCount = severitySummary.getInformationalCount();
            jsonWriter.name("InformationalCount");
            jsonWriter.value(informationalCount);
        }
        if (severitySummary.getUnspecifiedCount() != null) {
            Integer unspecifiedCount = severitySummary.getUnspecifiedCount();
            jsonWriter.name("UnspecifiedCount");
            jsonWriter.value(unspecifiedCount);
        }
        jsonWriter.endObject();
    }

    private static SeveritySummaryJsonMarshaller instance;
    public static SeveritySummaryJsonMarshaller getInstance() {
        if (instance == null) instance = new SeveritySummaryJsonMarshaller();
        return instance;
    }
}
