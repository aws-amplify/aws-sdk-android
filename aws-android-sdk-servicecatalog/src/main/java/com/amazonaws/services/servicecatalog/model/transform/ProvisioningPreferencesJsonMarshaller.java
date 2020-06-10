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
 * JSON marshaller for POJO ProvisioningPreferences
 */
class ProvisioningPreferencesJsonMarshaller {

    public void marshall(ProvisioningPreferences provisioningPreferences, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (provisioningPreferences.getStackSetAccounts() != null) {
            java.util.List<String> stackSetAccounts = provisioningPreferences.getStackSetAccounts();
            jsonWriter.name("StackSetAccounts");
            jsonWriter.beginArray();
            for (String stackSetAccountsItem : stackSetAccounts) {
                if (stackSetAccountsItem != null) {
                    jsonWriter.value(stackSetAccountsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (provisioningPreferences.getStackSetRegions() != null) {
            java.util.List<String> stackSetRegions = provisioningPreferences.getStackSetRegions();
            jsonWriter.name("StackSetRegions");
            jsonWriter.beginArray();
            for (String stackSetRegionsItem : stackSetRegions) {
                if (stackSetRegionsItem != null) {
                    jsonWriter.value(stackSetRegionsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (provisioningPreferences.getStackSetFailureToleranceCount() != null) {
            Integer stackSetFailureToleranceCount = provisioningPreferences
                    .getStackSetFailureToleranceCount();
            jsonWriter.name("StackSetFailureToleranceCount");
            jsonWriter.value(stackSetFailureToleranceCount);
        }
        if (provisioningPreferences.getStackSetFailureTolerancePercentage() != null) {
            Integer stackSetFailureTolerancePercentage = provisioningPreferences
                    .getStackSetFailureTolerancePercentage();
            jsonWriter.name("StackSetFailureTolerancePercentage");
            jsonWriter.value(stackSetFailureTolerancePercentage);
        }
        if (provisioningPreferences.getStackSetMaxConcurrencyCount() != null) {
            Integer stackSetMaxConcurrencyCount = provisioningPreferences
                    .getStackSetMaxConcurrencyCount();
            jsonWriter.name("StackSetMaxConcurrencyCount");
            jsonWriter.value(stackSetMaxConcurrencyCount);
        }
        if (provisioningPreferences.getStackSetMaxConcurrencyPercentage() != null) {
            Integer stackSetMaxConcurrencyPercentage = provisioningPreferences
                    .getStackSetMaxConcurrencyPercentage();
            jsonWriter.name("StackSetMaxConcurrencyPercentage");
            jsonWriter.value(stackSetMaxConcurrencyPercentage);
        }
        jsonWriter.endObject();
    }

    private static ProvisioningPreferencesJsonMarshaller instance;

    public static ProvisioningPreferencesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProvisioningPreferencesJsonMarshaller();
        return instance;
    }
}
