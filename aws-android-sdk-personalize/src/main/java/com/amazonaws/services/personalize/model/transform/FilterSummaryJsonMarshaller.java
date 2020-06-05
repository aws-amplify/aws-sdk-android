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

package com.amazonaws.services.personalize.model.transform;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FilterSummary
 */
class FilterSummaryJsonMarshaller {

    public void marshall(FilterSummary filterSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (filterSummary.getName() != null) {
            String name = filterSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (filterSummary.getFilterArn() != null) {
            String filterArn = filterSummary.getFilterArn();
            jsonWriter.name("filterArn");
            jsonWriter.value(filterArn);
        }
        if (filterSummary.getCreationDateTime() != null) {
            java.util.Date creationDateTime = filterSummary.getCreationDateTime();
            jsonWriter.name("creationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (filterSummary.getLastUpdatedDateTime() != null) {
            java.util.Date lastUpdatedDateTime = filterSummary.getLastUpdatedDateTime();
            jsonWriter.name("lastUpdatedDateTime");
            jsonWriter.value(lastUpdatedDateTime);
        }
        if (filterSummary.getDatasetGroupArn() != null) {
            String datasetGroupArn = filterSummary.getDatasetGroupArn();
            jsonWriter.name("datasetGroupArn");
            jsonWriter.value(datasetGroupArn);
        }
        if (filterSummary.getFailureReason() != null) {
            String failureReason = filterSummary.getFailureReason();
            jsonWriter.name("failureReason");
            jsonWriter.value(failureReason);
        }
        if (filterSummary.getStatus() != null) {
            String status = filterSummary.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static FilterSummaryJsonMarshaller instance;

    public static FilterSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FilterSummaryJsonMarshaller();
        return instance;
    }
}
