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

package com.amazonaws.services.a4b.model.transform;

import com.amazonaws.services.a4b.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO BusinessReportSchedule
 */
class BusinessReportScheduleJsonUnmarshaller implements
        Unmarshaller<BusinessReportSchedule, JsonUnmarshallerContext> {

    public BusinessReportSchedule unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        BusinessReportSchedule businessReportSchedule = new BusinessReportSchedule();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ScheduleArn")) {
                businessReportSchedule.setScheduleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ScheduleName")) {
                businessReportSchedule.setScheduleName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("S3BucketName")) {
                businessReportSchedule.setS3BucketName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("S3KeyPrefix")) {
                businessReportSchedule.setS3KeyPrefix(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Format")) {
                businessReportSchedule.setFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContentRange")) {
                businessReportSchedule.setContentRange(BusinessReportContentRangeJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Recurrence")) {
                businessReportSchedule.setRecurrence(BusinessReportRecurrenceJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastBusinessReport")) {
                businessReportSchedule.setLastBusinessReport(BusinessReportJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return businessReportSchedule;
    }

    private static BusinessReportScheduleJsonUnmarshaller instance;

    public static BusinessReportScheduleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BusinessReportScheduleJsonUnmarshaller();
        return instance;
    }
}
