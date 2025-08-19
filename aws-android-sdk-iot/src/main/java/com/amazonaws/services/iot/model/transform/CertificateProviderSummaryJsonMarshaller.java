/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO CertificateProviderSummary
 */
class CertificateProviderSummaryJsonMarshaller {

    public void marshall(CertificateProviderSummary certificateProviderSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (certificateProviderSummary.getCertificateProviderName() != null) {
            String certificateProviderName = certificateProviderSummary
                    .getCertificateProviderName();
            jsonWriter.name("certificateProviderName");
            jsonWriter.value(certificateProviderName);
        }
        if (certificateProviderSummary.getCertificateProviderArn() != null) {
            String certificateProviderArn = certificateProviderSummary.getCertificateProviderArn();
            jsonWriter.name("certificateProviderArn");
            jsonWriter.value(certificateProviderArn);
        }
        jsonWriter.endObject();
    }

    private static CertificateProviderSummaryJsonMarshaller instance;

    public static CertificateProviderSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CertificateProviderSummaryJsonMarshaller();
        return instance;
    }
}
