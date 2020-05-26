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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO VgwTelemetry
 */
class VgwTelemetryJsonMarshaller {

    public void marshall(VgwTelemetry vgwTelemetry, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (vgwTelemetry.getAcceptedRouteCount() != null) {
            Integer acceptedRouteCount = vgwTelemetry.getAcceptedRouteCount();
            jsonWriter.name("AcceptedRouteCount");
            jsonWriter.value(acceptedRouteCount);
        }
        if (vgwTelemetry.getLastStatusChange() != null) {
            java.util.Date lastStatusChange = vgwTelemetry.getLastStatusChange();
            jsonWriter.name("LastStatusChange");
            jsonWriter.value(lastStatusChange);
        }
        if (vgwTelemetry.getOutsideIpAddress() != null) {
            String outsideIpAddress = vgwTelemetry.getOutsideIpAddress();
            jsonWriter.name("OutsideIpAddress");
            jsonWriter.value(outsideIpAddress);
        }
        if (vgwTelemetry.getStatus() != null) {
            String status = vgwTelemetry.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (vgwTelemetry.getStatusMessage() != null) {
            String statusMessage = vgwTelemetry.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        if (vgwTelemetry.getCertificateArn() != null) {
            String certificateArn = vgwTelemetry.getCertificateArn();
            jsonWriter.name("CertificateArn");
            jsonWriter.value(certificateArn);
        }
        jsonWriter.endObject();
    }

    private static VgwTelemetryJsonMarshaller instance;

    public static VgwTelemetryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VgwTelemetryJsonMarshaller();
        return instance;
    }
}
