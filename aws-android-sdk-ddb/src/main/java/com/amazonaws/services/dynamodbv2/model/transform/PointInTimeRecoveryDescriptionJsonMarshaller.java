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

package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PointInTimeRecoveryDescription
 */
class PointInTimeRecoveryDescriptionJsonMarshaller {

    public void marshall(PointInTimeRecoveryDescription pointInTimeRecoveryDescription,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (pointInTimeRecoveryDescription.getPointInTimeRecoveryStatus() != null) {
            String pointInTimeRecoveryStatus = pointInTimeRecoveryDescription
                    .getPointInTimeRecoveryStatus();
            jsonWriter.name("PointInTimeRecoveryStatus");
            jsonWriter.value(pointInTimeRecoveryStatus);
        }
        if (pointInTimeRecoveryDescription.getEarliestRestorableDateTime() != null) {
            java.util.Date earliestRestorableDateTime = pointInTimeRecoveryDescription
                    .getEarliestRestorableDateTime();
            jsonWriter.name("EarliestRestorableDateTime");
            jsonWriter.value(earliestRestorableDateTime);
        }
        if (pointInTimeRecoveryDescription.getLatestRestorableDateTime() != null) {
            java.util.Date latestRestorableDateTime = pointInTimeRecoveryDescription
                    .getLatestRestorableDateTime();
            jsonWriter.name("LatestRestorableDateTime");
            jsonWriter.value(latestRestorableDateTime);
        }
        jsonWriter.endObject();
    }

    private static PointInTimeRecoveryDescriptionJsonMarshaller instance;

    public static PointInTimeRecoveryDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PointInTimeRecoveryDescriptionJsonMarshaller();
        return instance;
    }
}
