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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO StartSigningJobParameter
 */
class StartSigningJobParameterJsonMarshaller {

    public void marshall(StartSigningJobParameter startSigningJobParameter, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (startSigningJobParameter.getSigningProfileParameter() != null) {
            SigningProfileParameter signingProfileParameter = startSigningJobParameter
                    .getSigningProfileParameter();
            jsonWriter.name("signingProfileParameter");
            SigningProfileParameterJsonMarshaller.getInstance().marshall(signingProfileParameter,
                    jsonWriter);
        }
        if (startSigningJobParameter.getSigningProfileName() != null) {
            String signingProfileName = startSigningJobParameter.getSigningProfileName();
            jsonWriter.name("signingProfileName");
            jsonWriter.value(signingProfileName);
        }
        if (startSigningJobParameter.getDestination() != null) {
            Destination destination = startSigningJobParameter.getDestination();
            jsonWriter.name("destination");
            DestinationJsonMarshaller.getInstance().marshall(destination, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static StartSigningJobParameterJsonMarshaller instance;

    public static StartSigningJobParameterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StartSigningJobParameterJsonMarshaller();
        return instance;
    }
}
