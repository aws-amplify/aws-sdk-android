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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AddOn
 */
class AddOnJsonMarshaller {

    public void marshall(AddOn addOn, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (addOn.getName() != null) {
            String name = addOn.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (addOn.getStatus() != null) {
            String status = addOn.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (addOn.getSnapshotTimeOfDay() != null) {
            String snapshotTimeOfDay = addOn.getSnapshotTimeOfDay();
            jsonWriter.name("snapshotTimeOfDay");
            jsonWriter.value(snapshotTimeOfDay);
        }
        if (addOn.getNextSnapshotTimeOfDay() != null) {
            String nextSnapshotTimeOfDay = addOn.getNextSnapshotTimeOfDay();
            jsonWriter.name("nextSnapshotTimeOfDay");
            jsonWriter.value(nextSnapshotTimeOfDay);
        }
        jsonWriter.endObject();
    }

    private static AddOnJsonMarshaller instance;

    public static AddOnJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AddOnJsonMarshaller();
        return instance;
    }
}
