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
 * JSON marshaller for POJO VolumeFrom
 */
class VolumeFromJsonMarshaller {

    public void marshall(VolumeFrom volumeFrom, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (volumeFrom.getSourceContainer() != null) {
            String sourceContainer = volumeFrom.getSourceContainer();
            jsonWriter.name("sourceContainer");
            jsonWriter.value(sourceContainer);
        }
        if (volumeFrom.getReadOnly() != null) {
            Boolean readOnly = volumeFrom.getReadOnly();
            jsonWriter.name("readOnly");
            jsonWriter.value(readOnly);
        }
        jsonWriter.endObject();
    }

    private static VolumeFromJsonMarshaller instance;

    public static VolumeFromJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VolumeFromJsonMarshaller();
        return instance;
    }
}
