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

package com.amazonaws.services.personalize.model.transform;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AlgorithmImage
 */
class AlgorithmImageJsonMarshaller {

    public void marshall(AlgorithmImage algorithmImage, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (algorithmImage.getName() != null) {
            String name = algorithmImage.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (algorithmImage.getDockerURI() != null) {
            String dockerURI = algorithmImage.getDockerURI();
            jsonWriter.name("dockerURI");
            jsonWriter.value(dockerURI);
        }
        jsonWriter.endObject();
    }

    private static AlgorithmImageJsonMarshaller instance;

    public static AlgorithmImageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AlgorithmImageJsonMarshaller();
        return instance;
    }
}
