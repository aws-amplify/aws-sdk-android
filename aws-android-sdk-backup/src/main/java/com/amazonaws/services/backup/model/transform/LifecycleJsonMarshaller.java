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
 * JSON marshaller for POJO Lifecycle
 */
class LifecycleJsonMarshaller {

    public void marshall(Lifecycle lifecycle, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (lifecycle.getMoveToColdStorageAfterDays() != null) {
            Long moveToColdStorageAfterDays = lifecycle.getMoveToColdStorageAfterDays();
            jsonWriter.name("MoveToColdStorageAfterDays");
            jsonWriter.value(moveToColdStorageAfterDays);
        }
        if (lifecycle.getDeleteAfterDays() != null) {
            Long deleteAfterDays = lifecycle.getDeleteAfterDays();
            jsonWriter.name("DeleteAfterDays");
            jsonWriter.value(deleteAfterDays);
        }
        jsonWriter.endObject();
    }

    private static LifecycleJsonMarshaller instance;

    public static LifecycleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LifecycleJsonMarshaller();
        return instance;
    }
}
