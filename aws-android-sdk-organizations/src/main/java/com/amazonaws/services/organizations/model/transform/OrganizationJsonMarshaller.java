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

package com.amazonaws.services.organizations.model.transform;

import com.amazonaws.services.organizations.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Organization
 */
class OrganizationJsonMarshaller {

    public void marshall(Organization organization, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (organization.getId() != null) {
            String id = organization.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (organization.getArn() != null) {
            String arn = organization.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (organization.getFeatureSet() != null) {
            String featureSet = organization.getFeatureSet();
            jsonWriter.name("FeatureSet");
            jsonWriter.value(featureSet);
        }
        if (organization.getMasterAccountArn() != null) {
            String masterAccountArn = organization.getMasterAccountArn();
            jsonWriter.name("MasterAccountArn");
            jsonWriter.value(masterAccountArn);
        }
        if (organization.getMasterAccountId() != null) {
            String masterAccountId = organization.getMasterAccountId();
            jsonWriter.name("MasterAccountId");
            jsonWriter.value(masterAccountId);
        }
        if (organization.getMasterAccountEmail() != null) {
            String masterAccountEmail = organization.getMasterAccountEmail();
            jsonWriter.name("MasterAccountEmail");
            jsonWriter.value(masterAccountEmail);
        }
        if (organization.getAvailablePolicyTypes() != null) {
            java.util.List<PolicyTypeSummary> availablePolicyTypes = organization
                    .getAvailablePolicyTypes();
            jsonWriter.name("AvailablePolicyTypes");
            jsonWriter.beginArray();
            for (PolicyTypeSummary availablePolicyTypesItem : availablePolicyTypes) {
                if (availablePolicyTypesItem != null) {
                    PolicyTypeSummaryJsonMarshaller.getInstance().marshall(
                            availablePolicyTypesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static OrganizationJsonMarshaller instance;

    public static OrganizationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OrganizationJsonMarshaller();
        return instance;
    }
}
