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
 * JSON marshaller for POJO Tmpfs
 */
class TmpfsJsonMarshaller {

    public void marshall(Tmpfs tmpfs, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (tmpfs.getContainerPath() != null) {
            String containerPath = tmpfs.getContainerPath();
            jsonWriter.name("containerPath");
            jsonWriter.value(containerPath);
        }
        if (tmpfs.getSize() != null) {
            Integer size = tmpfs.getSize();
            jsonWriter.name("size");
            jsonWriter.value(size);
        }
        if (tmpfs.getMountOptions() != null) {
            java.util.List<String> mountOptions = tmpfs.getMountOptions();
            jsonWriter.name("mountOptions");
            jsonWriter.beginArray();
            for (String mountOptionsItem : mountOptions) {
                if (mountOptionsItem != null) {
                    jsonWriter.value(mountOptionsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TmpfsJsonMarshaller instance;

    public static TmpfsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TmpfsJsonMarshaller();
        return instance;
    }
}
