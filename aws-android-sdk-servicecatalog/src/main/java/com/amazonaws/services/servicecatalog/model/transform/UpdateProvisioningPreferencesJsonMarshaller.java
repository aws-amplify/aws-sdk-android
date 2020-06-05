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

package com.amazonaws.services.servicecatalog.model.transform;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UpdateProvisioningPreferences
 */
class UpdateProvisioningPreferencesJsonMarshaller {

    public void marshall(UpdateProvisioningPreferences updateProvisioningPreferences,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (updateProvisioningPreferences.getStackSetAccounts() != null) {
            java.util.List<String> stackSetAccounts = updateProvisioningPreferences
                    .getStackSetAccounts();
            jsonWriter.name("StackSetAccounts");
            jsonWriter.beginArray();
            for (String stackSetAccountsItem : stackSetAccounts) {
                if (stackSetAccountsItem != null) {
                    jsonWriter.value(stackSetAccountsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (updateProvisioningPreferences.getStackSetRegions() != null) {
            java.util.List<String> stackSetRegions = updateProvisioningPreferences
                    .getStackSetRegions();
            jsonWriter.name("StackSetRegions");
            jsonWriter.beginArray();
            for (String stackSetRegionsItem : stackSetRegions) {
                if (stackSetRegionsItem != null) {
                    jsonWriter.value(stackSetRegionsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (updateProvisioningPreferences.getStackSetFailureToleranceCount() != null) {
            Integer stackSetFailureToleranceCount = updateProvisioningPreferences
                    .getStackSetFailureToleranceCount();
            jsonWriter.name("StackSetFailureToleranceCount");
            jsonWriter.value(stackSetFailureToleranceCount);
        }
        if (updateProvisioningPreferences.getStackSetFailureTolerancePercentage() != null) {
            Integer stackSetFailureTolerancePercentage = updateProvisioningPreferences
                    .getStackSetFailureTolerancePercentage();
            jsonWriter.name("StackSetFailureTolerancePercentage");
            jsonWriter.value(stackSetFailureTolerancePercentage);
        }
        if (updateProvisioningPreferences.getStackSetMaxConcurrencyCount() != null) {
            Integer stackSetMaxConcurrencyCount = updateProvisioningPreferences
                    .getStackSetMaxConcurrencyCount();
            jsonWriter.name("StackSetMaxConcurrencyCount");
            jsonWriter.value(stackSetMaxConcurrencyCount);
        }
        if (updateProvisioningPreferences.getStackSetMaxConcurrencyPercentage() != null) {
            Integer stackSetMaxConcurrencyPercentage = updateProvisioningPreferences
                    .getStackSetMaxConcurrencyPercentage();
            jsonWriter.name("StackSetMaxConcurrencyPercentage");
            jsonWriter.value(stackSetMaxConcurrencyPercentage);
        }
        if (updateProvisioningPreferences.getStackSetOperationType() != null) {
            String stackSetOperationType = updateProvisioningPreferences.getStackSetOperationType();
            jsonWriter.name("StackSetOperationType");
            jsonWriter.value(stackSetOperationType);
        }
        jsonWriter.endObject();
    }

    private static UpdateProvisioningPreferencesJsonMarshaller instance;

    public static UpdateProvisioningPreferencesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UpdateProvisioningPreferencesJsonMarshaller();
        return instance;
    }
}
