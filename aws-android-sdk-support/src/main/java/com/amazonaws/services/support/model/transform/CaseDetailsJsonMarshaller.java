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

package com.amazonaws.services.support.model.transform;

import com.amazonaws.services.support.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CaseDetails
 */
class CaseDetailsJsonMarshaller {

    public void marshall(CaseDetails caseDetails, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (caseDetails.getCaseId() != null) {
            String caseId = caseDetails.getCaseId();
            jsonWriter.name("caseId");
            jsonWriter.value(caseId);
        }
        if (caseDetails.getDisplayId() != null) {
            String displayId = caseDetails.getDisplayId();
            jsonWriter.name("displayId");
            jsonWriter.value(displayId);
        }
        if (caseDetails.getSubject() != null) {
            String subject = caseDetails.getSubject();
            jsonWriter.name("subject");
            jsonWriter.value(subject);
        }
        if (caseDetails.getStatus() != null) {
            String status = caseDetails.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (caseDetails.getServiceCode() != null) {
            String serviceCode = caseDetails.getServiceCode();
            jsonWriter.name("serviceCode");
            jsonWriter.value(serviceCode);
        }
        if (caseDetails.getCategoryCode() != null) {
            String categoryCode = caseDetails.getCategoryCode();
            jsonWriter.name("categoryCode");
            jsonWriter.value(categoryCode);
        }
        if (caseDetails.getSeverityCode() != null) {
            String severityCode = caseDetails.getSeverityCode();
            jsonWriter.name("severityCode");
            jsonWriter.value(severityCode);
        }
        if (caseDetails.getSubmittedBy() != null) {
            String submittedBy = caseDetails.getSubmittedBy();
            jsonWriter.name("submittedBy");
            jsonWriter.value(submittedBy);
        }
        if (caseDetails.getTimeCreated() != null) {
            String timeCreated = caseDetails.getTimeCreated();
            jsonWriter.name("timeCreated");
            jsonWriter.value(timeCreated);
        }
        if (caseDetails.getRecentCommunications() != null) {
            RecentCaseCommunications recentCommunications = caseDetails.getRecentCommunications();
            jsonWriter.name("recentCommunications");
            RecentCaseCommunicationsJsonMarshaller.getInstance().marshall(recentCommunications,
                    jsonWriter);
        }
        if (caseDetails.getCcEmailAddresses() != null) {
            java.util.List<String> ccEmailAddresses = caseDetails.getCcEmailAddresses();
            jsonWriter.name("ccEmailAddresses");
            jsonWriter.beginArray();
            for (String ccEmailAddressesItem : ccEmailAddresses) {
                if (ccEmailAddressesItem != null) {
                    jsonWriter.value(ccEmailAddressesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (caseDetails.getLanguage() != null) {
            String language = caseDetails.getLanguage();
            jsonWriter.name("language");
            jsonWriter.value(language);
        }
        jsonWriter.endObject();
    }

    private static CaseDetailsJsonMarshaller instance;

    public static CaseDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CaseDetailsJsonMarshaller();
        return instance;
    }
}
