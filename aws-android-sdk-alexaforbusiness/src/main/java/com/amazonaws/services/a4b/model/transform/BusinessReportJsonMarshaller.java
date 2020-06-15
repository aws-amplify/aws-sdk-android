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
 * JSON marshaller for POJO BusinessReport
 */
class BusinessReportJsonMarshaller {

    public void marshall(BusinessReport businessReport, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (businessReport.getStatus() != null) {
            String status = businessReport.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (businessReport.getFailureCode() != null) {
            String failureCode = businessReport.getFailureCode();
            jsonWriter.name("FailureCode");
            jsonWriter.value(failureCode);
        }
        if (businessReport.getS3Location() != null) {
            BusinessReportS3Location s3Location = businessReport.getS3Location();
            jsonWriter.name("S3Location");
            BusinessReportS3LocationJsonMarshaller.getInstance().marshall(s3Location, jsonWriter);
        }
        if (businessReport.getDeliveryTime() != null) {
            java.util.Date deliveryTime = businessReport.getDeliveryTime();
            jsonWriter.name("DeliveryTime");
            jsonWriter.value(deliveryTime);
        }
        if (businessReport.getDownloadUrl() != null) {
            String downloadUrl = businessReport.getDownloadUrl();
            jsonWriter.name("DownloadUrl");
            jsonWriter.value(downloadUrl);
        }
        jsonWriter.endObject();
    }

    private static BusinessReportJsonMarshaller instance;

    public static BusinessReportJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BusinessReportJsonMarshaller();
        return instance;
    }
}
