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

package com.amazonaws.services.amplify.model.transform;

import com.amazonaws.services.amplify.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DomainAssociation
 */
class DomainAssociationJsonMarshaller {

    public void marshall(DomainAssociation domainAssociation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (domainAssociation.getDomainAssociationArn() != null) {
            String domainAssociationArn = domainAssociation.getDomainAssociationArn();
            jsonWriter.name("domainAssociationArn");
            jsonWriter.value(domainAssociationArn);
        }
        if (domainAssociation.getDomainName() != null) {
            String domainName = domainAssociation.getDomainName();
            jsonWriter.name("domainName");
            jsonWriter.value(domainName);
        }
        if (domainAssociation.getEnableAutoSubDomain() != null) {
            Boolean enableAutoSubDomain = domainAssociation.getEnableAutoSubDomain();
            jsonWriter.name("enableAutoSubDomain");
            jsonWriter.value(enableAutoSubDomain);
        }
        if (domainAssociation.getAutoSubDomainCreationPatterns() != null) {
            java.util.List<String> autoSubDomainCreationPatterns = domainAssociation
                    .getAutoSubDomainCreationPatterns();
            jsonWriter.name("autoSubDomainCreationPatterns");
            jsonWriter.beginArray();
            for (String autoSubDomainCreationPatternsItem : autoSubDomainCreationPatterns) {
                if (autoSubDomainCreationPatternsItem != null) {
                    jsonWriter.value(autoSubDomainCreationPatternsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (domainAssociation.getAutoSubDomainIAMRole() != null) {
            String autoSubDomainIAMRole = domainAssociation.getAutoSubDomainIAMRole();
            jsonWriter.name("autoSubDomainIAMRole");
            jsonWriter.value(autoSubDomainIAMRole);
        }
        if (domainAssociation.getDomainStatus() != null) {
            String domainStatus = domainAssociation.getDomainStatus();
            jsonWriter.name("domainStatus");
            jsonWriter.value(domainStatus);
        }
        if (domainAssociation.getStatusReason() != null) {
            String statusReason = domainAssociation.getStatusReason();
            jsonWriter.name("statusReason");
            jsonWriter.value(statusReason);
        }
        if (domainAssociation.getCertificateVerificationDNSRecord() != null) {
            String certificateVerificationDNSRecord = domainAssociation
                    .getCertificateVerificationDNSRecord();
            jsonWriter.name("certificateVerificationDNSRecord");
            jsonWriter.value(certificateVerificationDNSRecord);
        }
        if (domainAssociation.getSubDomains() != null) {
            java.util.List<SubDomain> subDomains = domainAssociation.getSubDomains();
            jsonWriter.name("subDomains");
            jsonWriter.beginArray();
            for (SubDomain subDomainsItem : subDomains) {
                if (subDomainsItem != null) {
                    SubDomainJsonMarshaller.getInstance().marshall(subDomainsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static DomainAssociationJsonMarshaller instance;

    public static DomainAssociationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DomainAssociationJsonMarshaller();
        return instance;
    }
}
