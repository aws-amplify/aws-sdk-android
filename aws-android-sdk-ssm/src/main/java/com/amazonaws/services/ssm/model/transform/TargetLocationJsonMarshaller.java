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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TargetLocation
 */
class TargetLocationJsonMarshaller {

    public void marshall(TargetLocation targetLocation, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (targetLocation.getAccounts() != null) {
            java.util.List<String> accounts = targetLocation.getAccounts();
            jsonWriter.name("Accounts");
            jsonWriter.beginArray();
            for (String accountsItem : accounts) {
                if (accountsItem != null) {
                    jsonWriter.value(accountsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (targetLocation.getRegions() != null) {
            java.util.List<String> regions = targetLocation.getRegions();
            jsonWriter.name("Regions");
            jsonWriter.beginArray();
            for (String regionsItem : regions) {
                if (regionsItem != null) {
                    jsonWriter.value(regionsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (targetLocation.getTargetLocationMaxConcurrency() != null) {
            String targetLocationMaxConcurrency = targetLocation.getTargetLocationMaxConcurrency();
            jsonWriter.name("TargetLocationMaxConcurrency");
            jsonWriter.value(targetLocationMaxConcurrency);
        }
        if (targetLocation.getTargetLocationMaxErrors() != null) {
            String targetLocationMaxErrors = targetLocation.getTargetLocationMaxErrors();
            jsonWriter.name("TargetLocationMaxErrors");
            jsonWriter.value(targetLocationMaxErrors);
        }
        if (targetLocation.getExecutionRoleName() != null) {
            String executionRoleName = targetLocation.getExecutionRoleName();
            jsonWriter.name("ExecutionRoleName");
            jsonWriter.value(executionRoleName);
        }
        jsonWriter.endObject();
    }

    private static TargetLocationJsonMarshaller instance;

    public static TargetLocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TargetLocationJsonMarshaller();
        return instance;
    }
}
