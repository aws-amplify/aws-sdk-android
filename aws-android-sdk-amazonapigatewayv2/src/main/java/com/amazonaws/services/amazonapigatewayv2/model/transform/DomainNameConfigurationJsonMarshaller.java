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

package com.amazonaws.services.amazonapigatewayv2.model.transform;

import com.amazonaws.services.amazonapigatewayv2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DomainNameConfiguration
 */
class DomainNameConfigurationJsonMarshaller {

    public void marshall(DomainNameConfiguration domainNameConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (domainNameConfiguration.getApiGatewayDomainName() != null) {
            String apiGatewayDomainName = domainNameConfiguration.getApiGatewayDomainName();
            jsonWriter.name("ApiGatewayDomainName");
            jsonWriter.value(apiGatewayDomainName);
        }
        if (domainNameConfiguration.getCertificateArn() != null) {
            String certificateArn = domainNameConfiguration.getCertificateArn();
            jsonWriter.name("CertificateArn");
            jsonWriter.value(certificateArn);
        }
        if (domainNameConfiguration.getCertificateName() != null) {
            String certificateName = domainNameConfiguration.getCertificateName();
            jsonWriter.name("CertificateName");
            jsonWriter.value(certificateName);
        }
        if (domainNameConfiguration.getCertificateUploadDate() != null) {
            java.util.Date certificateUploadDate = domainNameConfiguration
                    .getCertificateUploadDate();
            jsonWriter.name("CertificateUploadDate");
            jsonWriter.value(certificateUploadDate);
        }
        if (domainNameConfiguration.getDomainNameStatus() != null) {
            String domainNameStatus = domainNameConfiguration.getDomainNameStatus();
            jsonWriter.name("DomainNameStatus");
            jsonWriter.value(domainNameStatus);
        }
        if (domainNameConfiguration.getDomainNameStatusMessage() != null) {
            String domainNameStatusMessage = domainNameConfiguration.getDomainNameStatusMessage();
            jsonWriter.name("DomainNameStatusMessage");
            jsonWriter.value(domainNameStatusMessage);
        }
        if (domainNameConfiguration.getEndpointType() != null) {
            String endpointType = domainNameConfiguration.getEndpointType();
            jsonWriter.name("EndpointType");
            jsonWriter.value(endpointType);
        }
        if (domainNameConfiguration.getHostedZoneId() != null) {
            String hostedZoneId = domainNameConfiguration.getHostedZoneId();
            jsonWriter.name("HostedZoneId");
            jsonWriter.value(hostedZoneId);
        }
        if (domainNameConfiguration.getSecurityPolicy() != null) {
            String securityPolicy = domainNameConfiguration.getSecurityPolicy();
            jsonWriter.name("SecurityPolicy");
            jsonWriter.value(securityPolicy);
        }
        jsonWriter.endObject();
    }

    private static DomainNameConfigurationJsonMarshaller instance;

    public static DomainNameConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DomainNameConfigurationJsonMarshaller();
        return instance;
    }
}
