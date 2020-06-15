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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BusinessReportSchedule
 */
class BusinessReportScheduleJsonMarshaller {

    public void marshall(BusinessReportSchedule businessReportSchedule, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (businessReportSchedule.getScheduleArn() != null) {
            String scheduleArn = businessReportSchedule.getScheduleArn();
            jsonWriter.name("ScheduleArn");
            jsonWriter.value(scheduleArn);
        }
        if (businessReportSchedule.getScheduleName() != null) {
            String scheduleName = businessReportSchedule.getScheduleName();
            jsonWriter.name("ScheduleName");
            jsonWriter.value(scheduleName);
        }
        if (businessReportSchedule.getS3BucketName() != null) {
            String s3BucketName = businessReportSchedule.getS3BucketName();
            jsonWriter.name("S3BucketName");
            jsonWriter.value(s3BucketName);
        }
        if (businessReportSchedule.getS3KeyPrefix() != null) {
            String s3KeyPrefix = businessReportSchedule.getS3KeyPrefix();
            jsonWriter.name("S3KeyPrefix");
            jsonWriter.value(s3KeyPrefix);
        }
        if (businessReportSchedule.getFormat() != null) {
            String format = businessReportSchedule.getFormat();
            jsonWriter.name("Format");
            jsonWriter.value(format);
        }
        if (businessReportSchedule.getContentRange() != null) {
            BusinessReportContentRange contentRange = businessReportSchedule.getContentRange();
            jsonWriter.name("ContentRange");
            BusinessReportContentRangeJsonMarshaller.getInstance().marshall(contentRange,
                    jsonWriter);
        }
        if (businessReportSchedule.getRecurrence() != null) {
            BusinessReportRecurrence recurrence = businessReportSchedule.getRecurrence();
            jsonWriter.name("Recurrence");
            BusinessReportRecurrenceJsonMarshaller.getInstance().marshall(recurrence, jsonWriter);
        }
        if (businessReportSchedule.getLastBusinessReport() != null) {
            BusinessReport lastBusinessReport = businessReportSchedule.getLastBusinessReport();
            jsonWriter.name("LastBusinessReport");
            BusinessReportJsonMarshaller.getInstance().marshall(lastBusinessReport, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static BusinessReportScheduleJsonMarshaller instance;

    public static BusinessReportScheduleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BusinessReportScheduleJsonMarshaller();
        return instance;
    }
}
