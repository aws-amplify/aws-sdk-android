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
 * JSON marshaller for POJO SigningProfileParameter
 */
class SigningProfileParameterJsonMarshaller {

    public void marshall(SigningProfileParameter signingProfileParameter, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (signingProfileParameter.getCertificateArn() != null) {
            String certificateArn = signingProfileParameter.getCertificateArn();
            jsonWriter.name("certificateArn");
            jsonWriter.value(certificateArn);
        }
        if (signingProfileParameter.getPlatform() != null) {
            String platform = signingProfileParameter.getPlatform();
            jsonWriter.name("platform");
            jsonWriter.value(platform);
        }
        if (signingProfileParameter.getCertificatePathOnDevice() != null) {
            String certificatePathOnDevice = signingProfileParameter.getCertificatePathOnDevice();
            jsonWriter.name("certificatePathOnDevice");
            jsonWriter.value(certificatePathOnDevice);
        }
        jsonWriter.endObject();
    }

    private static SigningProfileParameterJsonMarshaller instance;

    public static SigningProfileParameterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SigningProfileParameterJsonMarshaller();
        return instance;
    }
}
