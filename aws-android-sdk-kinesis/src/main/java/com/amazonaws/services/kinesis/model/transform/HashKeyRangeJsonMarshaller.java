/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HashKeyRange
 */
class HashKeyRangeJsonMarshaller {

    public void marshall(HashKeyRange hashKeyRange, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hashKeyRange.getStartingHashKey() != null) {
            String startingHashKey = hashKeyRange.getStartingHashKey();
            jsonWriter.name("StartingHashKey");
            jsonWriter.value(startingHashKey);
        }
        if (hashKeyRange.getEndingHashKey() != null) {
            String endingHashKey = hashKeyRange.getEndingHashKey();
            jsonWriter.name("EndingHashKey");
            jsonWriter.value(endingHashKey);
        }
        jsonWriter.endObject();
    }

    private static HashKeyRangeJsonMarshaller instance;

    public static HashKeyRangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HashKeyRangeJsonMarshaller();
        return instance;
    }
}
