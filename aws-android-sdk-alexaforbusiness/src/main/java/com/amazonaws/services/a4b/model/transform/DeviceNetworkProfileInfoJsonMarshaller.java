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
 * JSON marshaller for POJO DeviceNetworkProfileInfo
 */
class DeviceNetworkProfileInfoJsonMarshaller {

    public void marshall(DeviceNetworkProfileInfo deviceNetworkProfileInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (deviceNetworkProfileInfo.getNetworkProfileArn() != null) {
            String networkProfileArn = deviceNetworkProfileInfo.getNetworkProfileArn();
            jsonWriter.name("NetworkProfileArn");
            jsonWriter.value(networkProfileArn);
        }
        if (deviceNetworkProfileInfo.getCertificateArn() != null) {
            String certificateArn = deviceNetworkProfileInfo.getCertificateArn();
            jsonWriter.name("CertificateArn");
            jsonWriter.value(certificateArn);
        }
        if (deviceNetworkProfileInfo.getCertificateExpirationTime() != null) {
            java.util.Date certificateExpirationTime = deviceNetworkProfileInfo
                    .getCertificateExpirationTime();
            jsonWriter.name("CertificateExpirationTime");
            jsonWriter.value(certificateExpirationTime);
        }
        jsonWriter.endObject();
    }

    private static DeviceNetworkProfileInfoJsonMarshaller instance;

    public static DeviceNetworkProfileInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeviceNetworkProfileInfoJsonMarshaller();
        return instance;
    }
}
