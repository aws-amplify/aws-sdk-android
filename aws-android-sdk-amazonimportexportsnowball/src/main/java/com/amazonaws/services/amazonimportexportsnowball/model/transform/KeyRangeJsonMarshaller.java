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

package com.amazonaws.services.amazonimportexportsnowball.model.transform;

import com.amazonaws.services.amazonimportexportsnowball.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO KeyRange
 */
class KeyRangeJsonMarshaller {

    public void marshall(KeyRange keyRange, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (keyRange.getBeginMarker() != null) {
            String beginMarker = keyRange.getBeginMarker();
            jsonWriter.name("BeginMarker");
            jsonWriter.value(beginMarker);
        }
        if (keyRange.getEndMarker() != null) {
            String endMarker = keyRange.getEndMarker();
            jsonWriter.name("EndMarker");
            jsonWriter.value(endMarker);
        }
        jsonWriter.endObject();
    }

    private static KeyRangeJsonMarshaller instance;

    public static KeyRangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KeyRangeJsonMarshaller();
        return instance;
    }
}
