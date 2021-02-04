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
 * JSON marshaller for POJO ServerCertificateSummary
 */
class ServerCertificateSummaryJsonMarshaller {

    public void marshall(ServerCertificateSummary serverCertificateSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (serverCertificateSummary.getServerCertificateArn() != null) {
            String serverCertificateArn = serverCertificateSummary.getServerCertificateArn();
            jsonWriter.name("serverCertificateArn");
            jsonWriter.value(serverCertificateArn);
        }
        if (serverCertificateSummary.getServerCertificateStatus() != null) {
            String serverCertificateStatus = serverCertificateSummary.getServerCertificateStatus();
            jsonWriter.name("serverCertificateStatus");
            jsonWriter.value(serverCertificateStatus);
        }
        if (serverCertificateSummary.getServerCertificateStatusDetail() != null) {
            String serverCertificateStatusDetail = serverCertificateSummary
                    .getServerCertificateStatusDetail();
            jsonWriter.name("serverCertificateStatusDetail");
            jsonWriter.value(serverCertificateStatusDetail);
        }
        jsonWriter.endObject();
    }

    private static ServerCertificateSummaryJsonMarshaller instance;

    public static ServerCertificateSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServerCertificateSummaryJsonMarshaller();
        return instance;
    }
}
