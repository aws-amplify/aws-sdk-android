/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SigV4Authorization
 */
class SigV4AuthorizationJsonMarshaller {

    public void marshall(SigV4Authorization sigV4Authorization, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sigV4Authorization.getSigningRegion() != null) {
            String signingRegion = sigV4Authorization.getSigningRegion();
            jsonWriter.name("signingRegion");
            jsonWriter.value(signingRegion);
        }
        if (sigV4Authorization.getServiceName() != null) {
            String serviceName = sigV4Authorization.getServiceName();
            jsonWriter.name("serviceName");
            jsonWriter.value(serviceName);
        }
        if (sigV4Authorization.getRoleArn() != null) {
            String roleArn = sigV4Authorization.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        jsonWriter.endObject();
    }

    private static SigV4AuthorizationJsonMarshaller instance;

    public static SigV4AuthorizationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SigV4AuthorizationJsonMarshaller();
        return instance;
    }
}
