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
 * JSON marshaller for POJO LoadBalancerTlsCertificateDomainValidationOption
 */
class LoadBalancerTlsCertificateDomainValidationOptionJsonMarshaller {

    public void marshall(
            LoadBalancerTlsCertificateDomainValidationOption loadBalancerTlsCertificateDomainValidationOption,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (loadBalancerTlsCertificateDomainValidationOption.getDomainName() != null) {
            String domainName = loadBalancerTlsCertificateDomainValidationOption.getDomainName();
            jsonWriter.name("domainName");
            jsonWriter.value(domainName);
        }
        if (loadBalancerTlsCertificateDomainValidationOption.getValidationStatus() != null) {
            String validationStatus = loadBalancerTlsCertificateDomainValidationOption
                    .getValidationStatus();
            jsonWriter.name("validationStatus");
            jsonWriter.value(validationStatus);
        }
        jsonWriter.endObject();
    }

    private static LoadBalancerTlsCertificateDomainValidationOptionJsonMarshaller instance;

    public static LoadBalancerTlsCertificateDomainValidationOptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LoadBalancerTlsCertificateDomainValidationOptionJsonMarshaller();
        return instance;
    }
}
