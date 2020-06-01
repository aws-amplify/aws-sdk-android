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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Workforce
 */
class WorkforceJsonMarshaller {

    public void marshall(Workforce workforce, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (workforce.getWorkforceName() != null) {
            String workforceName = workforce.getWorkforceName();
            jsonWriter.name("WorkforceName");
            jsonWriter.value(workforceName);
        }
        if (workforce.getWorkforceArn() != null) {
            String workforceArn = workforce.getWorkforceArn();
            jsonWriter.name("WorkforceArn");
            jsonWriter.value(workforceArn);
        }
        if (workforce.getLastUpdatedDate() != null) {
            java.util.Date lastUpdatedDate = workforce.getLastUpdatedDate();
            jsonWriter.name("LastUpdatedDate");
            jsonWriter.value(lastUpdatedDate);
        }
        if (workforce.getSourceIpConfig() != null) {
            SourceIpConfig sourceIpConfig = workforce.getSourceIpConfig();
            jsonWriter.name("SourceIpConfig");
            SourceIpConfigJsonMarshaller.getInstance().marshall(sourceIpConfig, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static WorkforceJsonMarshaller instance;

    public static WorkforceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WorkforceJsonMarshaller();
        return instance;
    }
}
