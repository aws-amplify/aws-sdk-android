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

package com.amazonaws.services.medialive.model.transform;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InputSpecification
 */
class InputSpecificationJsonMarshaller {

    public void marshall(InputSpecification inputSpecification, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (inputSpecification.getCodec() != null) {
            String codec = inputSpecification.getCodec();
            jsonWriter.name("Codec");
            jsonWriter.value(codec);
        }
        if (inputSpecification.getMaximumBitrate() != null) {
            String maximumBitrate = inputSpecification.getMaximumBitrate();
            jsonWriter.name("MaximumBitrate");
            jsonWriter.value(maximumBitrate);
        }
        if (inputSpecification.getResolution() != null) {
            String resolution = inputSpecification.getResolution();
            jsonWriter.name("Resolution");
            jsonWriter.value(resolution);
        }
        jsonWriter.endObject();
    }

    private static InputSpecificationJsonMarshaller instance;

    public static InputSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InputSpecificationJsonMarshaller();
        return instance;
    }
}
