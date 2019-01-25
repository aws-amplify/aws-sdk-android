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
 * JSON marshaller for POJO CodeSigning
 */
class CodeSigningJsonMarshaller {

    public void marshall(CodeSigning codeSigning, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (codeSigning.getAwsSignerJobId() != null) {
            String awsSignerJobId = codeSigning.getAwsSignerJobId();
            jsonWriter.name("awsSignerJobId");
            jsonWriter.value(awsSignerJobId);
        }
        if (codeSigning.getStartSigningJobParameter() != null) {
            StartSigningJobParameter startSigningJobParameter = codeSigning
                    .getStartSigningJobParameter();
            jsonWriter.name("startSigningJobParameter");
            StartSigningJobParameterJsonMarshaller.getInstance().marshall(startSigningJobParameter,
                    jsonWriter);
        }
        if (codeSigning.getCustomCodeSigning() != null) {
            CustomCodeSigning customCodeSigning = codeSigning.getCustomCodeSigning();
            jsonWriter.name("customCodeSigning");
            CustomCodeSigningJsonMarshaller.getInstance().marshall(customCodeSigning, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static CodeSigningJsonMarshaller instance;

    public static CodeSigningJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CodeSigningJsonMarshaller();
        return instance;
    }
}
