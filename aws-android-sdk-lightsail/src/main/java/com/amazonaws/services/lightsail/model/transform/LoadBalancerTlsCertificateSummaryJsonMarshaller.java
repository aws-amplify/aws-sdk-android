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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LoadBalancerTlsCertificateSummary
 */
class LoadBalancerTlsCertificateSummaryJsonMarshaller {

    public void marshall(LoadBalancerTlsCertificateSummary loadBalancerTlsCertificateSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (loadBalancerTlsCertificateSummary.getName() != null) {
            String name = loadBalancerTlsCertificateSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (loadBalancerTlsCertificateSummary.getIsAttached() != null) {
            Boolean isAttached = loadBalancerTlsCertificateSummary.getIsAttached();
            jsonWriter.name("isAttached");
            jsonWriter.value(isAttached);
        }
        jsonWriter.endObject();
    }

    private static LoadBalancerTlsCertificateSummaryJsonMarshaller instance;

    public static LoadBalancerTlsCertificateSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LoadBalancerTlsCertificateSummaryJsonMarshaller();
        return instance;
    }
}
