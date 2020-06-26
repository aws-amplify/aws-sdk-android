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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DataCaptureConfigSummary
 */
class DataCaptureConfigSummaryJsonUnmarshaller implements
        Unmarshaller<DataCaptureConfigSummary, JsonUnmarshallerContext> {

    public DataCaptureConfigSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DataCaptureConfigSummary dataCaptureConfigSummary = new DataCaptureConfigSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("EnableCapture")) {
                dataCaptureConfigSummary.setEnableCapture(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CaptureStatus")) {
                dataCaptureConfigSummary.setCaptureStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CurrentSamplingPercentage")) {
                dataCaptureConfigSummary.setCurrentSamplingPercentage(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DestinationS3Uri")) {
                dataCaptureConfigSummary.setDestinationS3Uri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KmsKeyId")) {
                dataCaptureConfigSummary.setKmsKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return dataCaptureConfigSummary;
    }

    private static DataCaptureConfigSummaryJsonUnmarshaller instance;

    public static DataCaptureConfigSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataCaptureConfigSummaryJsonUnmarshaller();
        return instance;
    }
}
