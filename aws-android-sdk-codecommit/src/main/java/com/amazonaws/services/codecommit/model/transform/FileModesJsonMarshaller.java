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

package com.amazonaws.services.codecommit.model.transform;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FileModes
 */
class FileModesJsonMarshaller {

    public void marshall(FileModes fileModes, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (fileModes.getSource() != null) {
            String source = fileModes.getSource();
            jsonWriter.name("source");
            jsonWriter.value(source);
        }
        if (fileModes.getDestination() != null) {
            String destination = fileModes.getDestination();
            jsonWriter.name("destination");
            jsonWriter.value(destination);
        }
        if (fileModes.getBase() != null) {
            String base = fileModes.getBase();
            jsonWriter.name("base");
            jsonWriter.value(base);
        }
        jsonWriter.endObject();
    }

    private static FileModesJsonMarshaller instance;

    public static FileModesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FileModesJsonMarshaller();
        return instance;
    }
}
