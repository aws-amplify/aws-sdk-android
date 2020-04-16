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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DataCaptureConfigSummary
 */
class DataCaptureConfigSummaryJsonMarshaller {

    public void marshall(DataCaptureConfigSummary dataCaptureConfigSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (dataCaptureConfigSummary.getEnableCapture() != null) {
            Boolean enableCapture = dataCaptureConfigSummary.getEnableCapture();
            jsonWriter.name("EnableCapture");
            jsonWriter.value(enableCapture);
        }
        if (dataCaptureConfigSummary.getCaptureStatus() != null) {
            String captureStatus = dataCaptureConfigSummary.getCaptureStatus();
            jsonWriter.name("CaptureStatus");
            jsonWriter.value(captureStatus);
        }
        if (dataCaptureConfigSummary.getCurrentSamplingPercentage() != null) {
            Integer currentSamplingPercentage = dataCaptureConfigSummary
                    .getCurrentSamplingPercentage();
            jsonWriter.name("CurrentSamplingPercentage");
            jsonWriter.value(currentSamplingPercentage);
        }
        if (dataCaptureConfigSummary.getDestinationS3Uri() != null) {
            String destinationS3Uri = dataCaptureConfigSummary.getDestinationS3Uri();
            jsonWriter.name("DestinationS3Uri");
            jsonWriter.value(destinationS3Uri);
        }
        if (dataCaptureConfigSummary.getKmsKeyId() != null) {
            String kmsKeyId = dataCaptureConfigSummary.getKmsKeyId();
            jsonWriter.name("KmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        jsonWriter.endObject();
    }

    private static DataCaptureConfigSummaryJsonMarshaller instance;

    public static DataCaptureConfigSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DataCaptureConfigSummaryJsonMarshaller();
        return instance;
    }
}
