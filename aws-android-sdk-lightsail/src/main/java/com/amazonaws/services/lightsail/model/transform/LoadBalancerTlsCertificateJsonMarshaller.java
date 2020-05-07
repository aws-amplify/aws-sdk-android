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
 * JSON marshaller for POJO LoadBalancerTlsCertificate
 */
class LoadBalancerTlsCertificateJsonMarshaller {

    public void marshall(LoadBalancerTlsCertificate loadBalancerTlsCertificate,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (loadBalancerTlsCertificate.getName() != null) {
            String name = loadBalancerTlsCertificate.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (loadBalancerTlsCertificate.getArn() != null) {
            String arn = loadBalancerTlsCertificate.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (loadBalancerTlsCertificate.getSupportCode() != null) {
            String supportCode = loadBalancerTlsCertificate.getSupportCode();
            jsonWriter.name("supportCode");
            jsonWriter.value(supportCode);
        }
        if (loadBalancerTlsCertificate.getCreatedAt() != null) {
            java.util.Date createdAt = loadBalancerTlsCertificate.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (loadBalancerTlsCertificate.getLocation() != null) {
            ResourceLocation location = loadBalancerTlsCertificate.getLocation();
            jsonWriter.name("location");
            ResourceLocationJsonMarshaller.getInstance().marshall(location, jsonWriter);
        }
        if (loadBalancerTlsCertificate.getResourceType() != null) {
            String resourceType = loadBalancerTlsCertificate.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (loadBalancerTlsCertificate.getTags() != null) {
            java.util.List<Tag> tags = loadBalancerTlsCertificate.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (loadBalancerTlsCertificate.getLoadBalancerName() != null) {
            String loadBalancerName = loadBalancerTlsCertificate.getLoadBalancerName();
            jsonWriter.name("loadBalancerName");
            jsonWriter.value(loadBalancerName);
        }
        if (loadBalancerTlsCertificate.getIsAttached() != null) {
            Boolean isAttached = loadBalancerTlsCertificate.getIsAttached();
            jsonWriter.name("isAttached");
            jsonWriter.value(isAttached);
        }
        if (loadBalancerTlsCertificate.getStatus() != null) {
            String status = loadBalancerTlsCertificate.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (loadBalancerTlsCertificate.getDomainName() != null) {
            String domainName = loadBalancerTlsCertificate.getDomainName();
            jsonWriter.name("domainName");
            jsonWriter.value(domainName);
        }
        if (loadBalancerTlsCertificate.getDomainValidationRecords() != null) {
            java.util.List<LoadBalancerTlsCertificateDomainValidationRecord> domainValidationRecords = loadBalancerTlsCertificate
                    .getDomainValidationRecords();
            jsonWriter.name("domainValidationRecords");
            jsonWriter.beginArray();
            for (LoadBalancerTlsCertificateDomainValidationRecord domainValidationRecordsItem : domainValidationRecords) {
                if (domainValidationRecordsItem != null) {
                    LoadBalancerTlsCertificateDomainValidationRecordJsonMarshaller.getInstance()
                            .marshall(domainValidationRecordsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (loadBalancerTlsCertificate.getFailureReason() != null) {
            String failureReason = loadBalancerTlsCertificate.getFailureReason();
            jsonWriter.name("failureReason");
            jsonWriter.value(failureReason);
        }
        if (loadBalancerTlsCertificate.getIssuedAt() != null) {
            java.util.Date issuedAt = loadBalancerTlsCertificate.getIssuedAt();
            jsonWriter.name("issuedAt");
            jsonWriter.value(issuedAt);
        }
        if (loadBalancerTlsCertificate.getIssuer() != null) {
            String issuer = loadBalancerTlsCertificate.getIssuer();
            jsonWriter.name("issuer");
            jsonWriter.value(issuer);
        }
        if (loadBalancerTlsCertificate.getKeyAlgorithm() != null) {
            String keyAlgorithm = loadBalancerTlsCertificate.getKeyAlgorithm();
            jsonWriter.name("keyAlgorithm");
            jsonWriter.value(keyAlgorithm);
        }
        if (loadBalancerTlsCertificate.getNotAfter() != null) {
            java.util.Date notAfter = loadBalancerTlsCertificate.getNotAfter();
            jsonWriter.name("notAfter");
            jsonWriter.value(notAfter);
        }
        if (loadBalancerTlsCertificate.getNotBefore() != null) {
            java.util.Date notBefore = loadBalancerTlsCertificate.getNotBefore();
            jsonWriter.name("notBefore");
            jsonWriter.value(notBefore);
        }
        if (loadBalancerTlsCertificate.getRenewalSummary() != null) {
            LoadBalancerTlsCertificateRenewalSummary renewalSummary = loadBalancerTlsCertificate
                    .getRenewalSummary();
            jsonWriter.name("renewalSummary");
            LoadBalancerTlsCertificateRenewalSummaryJsonMarshaller.getInstance().marshall(
                    renewalSummary, jsonWriter);
        }
        if (loadBalancerTlsCertificate.getRevocationReason() != null) {
            String revocationReason = loadBalancerTlsCertificate.getRevocationReason();
            jsonWriter.name("revocationReason");
            jsonWriter.value(revocationReason);
        }
        if (loadBalancerTlsCertificate.getRevokedAt() != null) {
            java.util.Date revokedAt = loadBalancerTlsCertificate.getRevokedAt();
            jsonWriter.name("revokedAt");
            jsonWriter.value(revokedAt);
        }
        if (loadBalancerTlsCertificate.getSerial() != null) {
            String serial = loadBalancerTlsCertificate.getSerial();
            jsonWriter.name("serial");
            jsonWriter.value(serial);
        }
        if (loadBalancerTlsCertificate.getSignatureAlgorithm() != null) {
            String signatureAlgorithm = loadBalancerTlsCertificate.getSignatureAlgorithm();
            jsonWriter.name("signatureAlgorithm");
            jsonWriter.value(signatureAlgorithm);
        }
        if (loadBalancerTlsCertificate.getSubject() != null) {
            String subject = loadBalancerTlsCertificate.getSubject();
            jsonWriter.name("subject");
            jsonWriter.value(subject);
        }
        if (loadBalancerTlsCertificate.getSubjectAlternativeNames() != null) {
            java.util.List<String> subjectAlternativeNames = loadBalancerTlsCertificate
                    .getSubjectAlternativeNames();
            jsonWriter.name("subjectAlternativeNames");
            jsonWriter.beginArray();
            for (String subjectAlternativeNamesItem : subjectAlternativeNames) {
                if (subjectAlternativeNamesItem != null) {
                    jsonWriter.value(subjectAlternativeNamesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static LoadBalancerTlsCertificateJsonMarshaller instance;

    public static LoadBalancerTlsCertificateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LoadBalancerTlsCertificateJsonMarshaller();
        return instance;
    }
}
