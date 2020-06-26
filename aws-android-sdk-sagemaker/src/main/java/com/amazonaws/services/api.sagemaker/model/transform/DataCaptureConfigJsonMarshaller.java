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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DataCaptureConfig
 */
class DataCaptureConfigJsonMarshaller {

    public void marshall(DataCaptureConfig dataCaptureConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (dataCaptureConfig.getEnableCapture() != null) {
            Boolean enableCapture = dataCaptureConfig.getEnableCapture();
            jsonWriter.name("EnableCapture");
            jsonWriter.value(enableCapture);
        }
        if (dataCaptureConfig.getInitialSamplingPercentage() != null) {
            Integer initialSamplingPercentage = dataCaptureConfig.getInitialSamplingPercentage();
            jsonWriter.name("InitialSamplingPercentage");
            jsonWriter.value(initialSamplingPercentage);
        }
        if (dataCaptureConfig.getDestinationS3Uri() != null) {
            String destinationS3Uri = dataCaptureConfig.getDestinationS3Uri();
            jsonWriter.name("DestinationS3Uri");
            jsonWriter.value(destinationS3Uri);
        }
        if (dataCaptureConfig.getKmsKeyId() != null) {
            String kmsKeyId = dataCaptureConfig.getKmsKeyId();
            jsonWriter.name("KmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        if (dataCaptureConfig.getCaptureOptions() != null) {
            java.util.List<CaptureOption> captureOptions = dataCaptureConfig.getCaptureOptions();
            jsonWriter.name("CaptureOptions");
            jsonWriter.beginArray();
            for (CaptureOption captureOptionsItem : captureOptions) {
                if (captureOptionsItem != null) {
                    CaptureOptionJsonMarshaller.getInstance().marshall(captureOptionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (dataCaptureConfig.getCaptureContentTypeHeader() != null) {
            CaptureContentTypeHeader captureContentTypeHeader = dataCaptureConfig
                    .getCaptureContentTypeHeader();
            jsonWriter.name("CaptureContentTypeHeader");
            CaptureContentTypeHeaderJsonMarshaller.getInstance().marshall(captureContentTypeHeader,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DataCaptureConfigJsonMarshaller instance;

    public static DataCaptureConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DataCaptureConfigJsonMarshaller();
        return instance;
    }
}
