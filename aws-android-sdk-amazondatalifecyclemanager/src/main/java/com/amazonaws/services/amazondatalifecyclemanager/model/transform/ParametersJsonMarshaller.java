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

package com.amazonaws.services.amazondatalifecyclemanager.model.transform;

import com.amazonaws.services.amazondatalifecyclemanager.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Parameters
 */
class ParametersJsonMarshaller {

    public void marshall(Parameters parameters, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (parameters.getExcludeBootVolume() != null) {
            Boolean excludeBootVolume = parameters.getExcludeBootVolume();
            jsonWriter.name("ExcludeBootVolume");
            jsonWriter.value(excludeBootVolume);
        }
        jsonWriter.endObject();
    }

    private static ParametersJsonMarshaller instance;

    public static ParametersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ParametersJsonMarshaller();
        return instance;
    }
}
