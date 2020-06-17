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

package com.amazonaws.services.snowball.model.transform;

import com.amazonaws.services.snowball.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CompatibleImage
 */
class CompatibleImageJsonMarshaller {

    public void marshall(CompatibleImage compatibleImage, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (compatibleImage.getAmiId() != null) {
            String amiId = compatibleImage.getAmiId();
            jsonWriter.name("AmiId");
            jsonWriter.value(amiId);
        }
        if (compatibleImage.getName() != null) {
            String name = compatibleImage.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        jsonWriter.endObject();
    }

    private static CompatibleImageJsonMarshaller instance;

    public static CompatibleImageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CompatibleImageJsonMarshaller();
        return instance;
    }
}
