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
 * JSON marshaller for POJO Filter
 */
class FilterJsonMarshaller {

    public void marshall(Filter filter, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (filter.getName() != null) {
            String name = filter.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (filter.getFilterArn() != null) {
            String filterArn = filter.getFilterArn();
            jsonWriter.name("filterArn");
            jsonWriter.value(filterArn);
        }
        if (filter.getCreationDateTime() != null) {
            java.util.Date creationDateTime = filter.getCreationDateTime();
            jsonWriter.name("creationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (filter.getLastUpdatedDateTime() != null) {
            java.util.Date lastUpdatedDateTime = filter.getLastUpdatedDateTime();
            jsonWriter.name("lastUpdatedDateTime");
            jsonWriter.value(lastUpdatedDateTime);
        }
        if (filter.getDatasetGroupArn() != null) {
            String datasetGroupArn = filter.getDatasetGroupArn();
            jsonWriter.name("datasetGroupArn");
            jsonWriter.value(datasetGroupArn);
        }
        if (filter.getFailureReason() != null) {
            String failureReason = filter.getFailureReason();
            jsonWriter.name("failureReason");
            jsonWriter.value(failureReason);
        }
        if (filter.getFilterExpression() != null) {
            String filterExpression = filter.getFilterExpression();
            jsonWriter.name("filterExpression");
            jsonWriter.value(filterExpression);
        }
        if (filter.getStatus() != null) {
            String status = filter.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static FilterJsonMarshaller instance;

    public static FilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FilterJsonMarshaller();
        return instance;
    }
}
