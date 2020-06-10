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
 * JSON marshaller for POJO LoadBalancerTlsCertificateDomainValidationRecord
 */
class LoadBalancerTlsCertificateDomainValidationRecordJsonMarshaller {

    public void marshall(
            LoadBalancerTlsCertificateDomainValidationRecord loadBalancerTlsCertificateDomainValidationRecord,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (loadBalancerTlsCertificateDomainValidationRecord.getName() != null) {
            String name = loadBalancerTlsCertificateDomainValidationRecord.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (loadBalancerTlsCertificateDomainValidationRecord.getType() != null) {
            String type = loadBalancerTlsCertificateDomainValidationRecord.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (loadBalancerTlsCertificateDomainValidationRecord.getValue() != null) {
            String value = loadBalancerTlsCertificateDomainValidationRecord.getValue();
            jsonWriter.name("value");
            jsonWriter.value(value);
        }
        if (loadBalancerTlsCertificateDomainValidationRecord.getValidationStatus() != null) {
            String validationStatus = loadBalancerTlsCertificateDomainValidationRecord
                    .getValidationStatus();
            jsonWriter.name("validationStatus");
            jsonWriter.value(validationStatus);
        }
        if (loadBalancerTlsCertificateDomainValidationRecord.getDomainName() != null) {
            String domainName = loadBalancerTlsCertificateDomainValidationRecord.getDomainName();
            jsonWriter.name("domainName");
            jsonWriter.value(domainName);
        }
        jsonWriter.endObject();
    }

    private static LoadBalancerTlsCertificateDomainValidationRecordJsonMarshaller instance;

    public static LoadBalancerTlsCertificateDomainValidationRecordJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LoadBalancerTlsCertificateDomainValidationRecordJsonMarshaller();
        return instance;
    }
}
