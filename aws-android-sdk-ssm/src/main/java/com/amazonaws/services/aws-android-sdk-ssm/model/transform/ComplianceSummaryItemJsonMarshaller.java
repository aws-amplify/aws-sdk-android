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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ComplianceSummaryItem
 */
class ComplianceSummaryItemJsonMarshaller {

    public void marshall(ComplianceSummaryItem complianceSummaryItem, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (complianceSummaryItem.getComplianceType() != null) {
            String complianceType = complianceSummaryItem.getComplianceType();
            jsonWriter.name("ComplianceType");
            jsonWriter.value(complianceType);
        }
        if (complianceSummaryItem.getCompliantSummary() != null) {
            CompliantSummary compliantSummary = complianceSummaryItem.getCompliantSummary();
            jsonWriter.name("CompliantSummary");
            CompliantSummaryJsonMarshaller.getInstance().marshall(compliantSummary, jsonWriter);
        }
        if (complianceSummaryItem.getNonCompliantSummary() != null) {
            NonCompliantSummary nonCompliantSummary = complianceSummaryItem.getNonCompliantSummary();
            jsonWriter.name("NonCompliantSummary");
            NonCompliantSummaryJsonMarshaller.getInstance().marshall(nonCompliantSummary, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ComplianceSummaryItemJsonMarshaller instance;
    public static ComplianceSummaryItemJsonMarshaller getInstance() {
        if (instance == null) instance = new ComplianceSummaryItemJsonMarshaller();
        return instance;
    }
}
