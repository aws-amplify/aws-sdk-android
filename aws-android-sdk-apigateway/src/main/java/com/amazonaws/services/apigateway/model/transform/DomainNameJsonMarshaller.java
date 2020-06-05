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

package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DomainName
 */
class DomainNameJsonMarshaller {

    public void marshall(DomainName domainName, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (domainName.getDomainName() != null) {
            String domainName = domainName.getDomainName();
            jsonWriter.name("domainName");
            jsonWriter.value(domainName);
        }
        if (domainName.getCertificateName() != null) {
            String certificateName = domainName.getCertificateName();
            jsonWriter.name("certificateName");
            jsonWriter.value(certificateName);
        }
        if (domainName.getCertificateArn() != null) {
            String certificateArn = domainName.getCertificateArn();
            jsonWriter.name("certificateArn");
            jsonWriter.value(certificateArn);
        }
        if (domainName.getCertificateUploadDate() != null) {
            java.util.Date certificateUploadDate = domainName.getCertificateUploadDate();
            jsonWriter.name("certificateUploadDate");
            jsonWriter.value(certificateUploadDate);
        }
        if (domainName.getRegionalDomainName() != null) {
            String regionalDomainName = domainName.getRegionalDomainName();
            jsonWriter.name("regionalDomainName");
            jsonWriter.value(regionalDomainName);
        }
        if (domainName.getRegionalHostedZoneId() != null) {
            String regionalHostedZoneId = domainName.getRegionalHostedZoneId();
            jsonWriter.name("regionalHostedZoneId");
            jsonWriter.value(regionalHostedZoneId);
        }
        if (domainName.getRegionalCertificateName() != null) {
            String regionalCertificateName = domainName.getRegionalCertificateName();
            jsonWriter.name("regionalCertificateName");
            jsonWriter.value(regionalCertificateName);
        }
        if (domainName.getRegionalCertificateArn() != null) {
            String regionalCertificateArn = domainName.getRegionalCertificateArn();
            jsonWriter.name("regionalCertificateArn");
            jsonWriter.value(regionalCertificateArn);
        }
        if (domainName.getDistributionDomainName() != null) {
            String distributionDomainName = domainName.getDistributionDomainName();
            jsonWriter.name("distributionDomainName");
            jsonWriter.value(distributionDomainName);
        }
        if (domainName.getDistributionHostedZoneId() != null) {
            String distributionHostedZoneId = domainName.getDistributionHostedZoneId();
            jsonWriter.name("distributionHostedZoneId");
            jsonWriter.value(distributionHostedZoneId);
        }
        if (domainName.getEndpointConfiguration() != null) {
            EndpointConfiguration endpointConfiguration = domainName.getEndpointConfiguration();
            jsonWriter.name("endpointConfiguration");
            EndpointConfigurationJsonMarshaller.getInstance().marshall(endpointConfiguration,
                    jsonWriter);
        }
        if (domainName.getDomainNameStatus() != null) {
            String domainNameStatus = domainName.getDomainNameStatus();
            jsonWriter.name("domainNameStatus");
            jsonWriter.value(domainNameStatus);
        }
        if (domainName.getDomainNameStatusMessage() != null) {
            String domainNameStatusMessage = domainName.getDomainNameStatusMessage();
            jsonWriter.name("domainNameStatusMessage");
            jsonWriter.value(domainNameStatusMessage);
        }
        if (domainName.getSecurityPolicy() != null) {
            String securityPolicy = domainName.getSecurityPolicy();
            jsonWriter.name("securityPolicy");
            jsonWriter.value(securityPolicy);
        }
        if (domainName.getTags() != null) {
            java.util.Map<String, String> tags = domainName.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static DomainNameJsonMarshaller instance;

    public static DomainNameJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DomainNameJsonMarshaller();
        return instance;
    }
}
