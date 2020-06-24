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

package com.amazonaws.services.backup.model.transform;

import com.amazonaws.services.backup.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CalculatedLifecycle
 */
class CalculatedLifecycleJsonMarshaller {

    public void marshall(CalculatedLifecycle calculatedLifecycle, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (calculatedLifecycle.getMoveToColdStorageAt() != null) {
            java.util.Date moveToColdStorageAt = calculatedLifecycle.getMoveToColdStorageAt();
            jsonWriter.name("MoveToColdStorageAt");
            jsonWriter.value(moveToColdStorageAt);
        }
        if (calculatedLifecycle.getDeleteAt() != null) {
            java.util.Date deleteAt = calculatedLifecycle.getDeleteAt();
            jsonWriter.name("DeleteAt");
            jsonWriter.value(deleteAt);
        }
        jsonWriter.endObject();
    }

    private static CalculatedLifecycleJsonMarshaller instance;

    public static CalculatedLifecycleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CalculatedLifecycleJsonMarshaller();
        return instance;
    }
}
