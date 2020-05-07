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
 * JSON marshaller for POJO LoadBalancerTlsCertificateRenewalSummary
 */
class LoadBalancerTlsCertificateRenewalSummaryJsonMarshaller {

    public void marshall(
            LoadBalancerTlsCertificateRenewalSummary loadBalancerTlsCertificateRenewalSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (loadBalancerTlsCertificateRenewalSummary.getRenewalStatus() != null) {
            String renewalStatus = loadBalancerTlsCertificateRenewalSummary.getRenewalStatus();
            jsonWriter.name("renewalStatus");
            jsonWriter.value(renewalStatus);
        }
        if (loadBalancerTlsCertificateRenewalSummary.getDomainValidationOptions() != null) {
            java.util.List<LoadBalancerTlsCertificateDomainValidationOption> domainValidationOptions = loadBalancerTlsCertificateRenewalSummary
                    .getDomainValidationOptions();
            jsonWriter.name("domainValidationOptions");
            jsonWriter.beginArray();
            for (LoadBalancerTlsCertificateDomainValidationOption domainValidationOptionsItem : domainValidationOptions) {
                if (domainValidationOptionsItem != null) {
                    LoadBalancerTlsCertificateDomainValidationOptionJsonMarshaller.getInstance()
                            .marshall(domainValidationOptionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static LoadBalancerTlsCertificateRenewalSummaryJsonMarshaller instance;

    public static LoadBalancerTlsCertificateRenewalSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LoadBalancerTlsCertificateRenewalSummaryJsonMarshaller();
        return instance;
    }
}
