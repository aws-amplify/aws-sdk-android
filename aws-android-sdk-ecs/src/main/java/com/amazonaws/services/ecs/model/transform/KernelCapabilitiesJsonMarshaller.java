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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO KernelCapabilities
 */
class KernelCapabilitiesJsonMarshaller {

    public void marshall(KernelCapabilities kernelCapabilities, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (kernelCapabilities.getAdd() != null) {
            java.util.List<String> add = kernelCapabilities.getAdd();
            jsonWriter.name("add");
            jsonWriter.beginArray();
            for (String addItem : add) {
                if (addItem != null) {
                    jsonWriter.value(addItem);
                }
            }
            jsonWriter.endArray();
        }
        if (kernelCapabilities.getDrop() != null) {
            java.util.List<String> drop = kernelCapabilities.getDrop();
            jsonWriter.name("drop");
            jsonWriter.beginArray();
            for (String dropItem : drop) {
                if (dropItem != null) {
                    jsonWriter.value(dropItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static KernelCapabilitiesJsonMarshaller instance;

    public static KernelCapabilitiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KernelCapabilitiesJsonMarshaller();
        return instance;
    }
}
