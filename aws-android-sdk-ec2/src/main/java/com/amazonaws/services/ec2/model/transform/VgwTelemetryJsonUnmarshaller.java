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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO VgwTelemetry
 */
class VgwTelemetryJsonUnmarshaller implements Unmarshaller<VgwTelemetry, JsonUnmarshallerContext> {

    public VgwTelemetry unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        VgwTelemetry vgwTelemetry = new VgwTelemetry();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AcceptedRouteCount")) {
                vgwTelemetry.setAcceptedRouteCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastStatusChange")) {
                vgwTelemetry.setLastStatusChange(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutsideIpAddress")) {
                vgwTelemetry.setOutsideIpAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                vgwTelemetry.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusMessage")) {
                vgwTelemetry.setStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CertificateArn")) {
                vgwTelemetry.setCertificateArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return vgwTelemetry;
    }

    private static VgwTelemetryJsonUnmarshaller instance;

    public static VgwTelemetryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VgwTelemetryJsonUnmarshaller();
        return instance;
    }
}
