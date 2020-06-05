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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO UpdateProvisioningPreferences
 */
class UpdateProvisioningPreferencesJsonUnmarshaller implements
        Unmarshaller<UpdateProvisioningPreferences, JsonUnmarshallerContext> {

    public UpdateProvisioningPreferences unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        UpdateProvisioningPreferences updateProvisioningPreferences = new UpdateProvisioningPreferences();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("StackSetAccounts")) {
                updateProvisioningPreferences.setStackSetAccounts(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("StackSetRegions")) {
                updateProvisioningPreferences.setStackSetRegions(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("StackSetFailureToleranceCount")) {
                updateProvisioningPreferences
                        .setStackSetFailureToleranceCount(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("StackSetFailureTolerancePercentage")) {
                updateProvisioningPreferences
                        .setStackSetFailureTolerancePercentage(IntegerJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("StackSetMaxConcurrencyCount")) {
                updateProvisioningPreferences
                        .setStackSetMaxConcurrencyCount(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("StackSetMaxConcurrencyPercentage")) {
                updateProvisioningPreferences
                        .setStackSetMaxConcurrencyPercentage(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("StackSetOperationType")) {
                updateProvisioningPreferences.setStackSetOperationType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return updateProvisioningPreferences;
    }

    private static UpdateProvisioningPreferencesJsonUnmarshaller instance;

    public static UpdateProvisioningPreferencesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateProvisioningPreferencesJsonUnmarshaller();
        return instance;
    }
}
