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

package com.amazonaws.services.awswaf.model.transform;

import com.amazonaws.services.awswaf.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ByteMatchSet
 */
class ByteMatchSetJsonMarshaller {

    public void marshall(ByteMatchSet byteMatchSet, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (byteMatchSet.getByteMatchSetId() != null) {
            String byteMatchSetId = byteMatchSet.getByteMatchSetId();
            jsonWriter.name("ByteMatchSetId");
            jsonWriter.value(byteMatchSetId);
        }
        if (byteMatchSet.getName() != null) {
            String name = byteMatchSet.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (byteMatchSet.getByteMatchTuples() != null) {
            java.util.List<ByteMatchTuple> byteMatchTuples = byteMatchSet.getByteMatchTuples();
            jsonWriter.name("ByteMatchTuples");
            jsonWriter.beginArray();
            for (ByteMatchTuple byteMatchTuplesItem : byteMatchTuples) {
                if (byteMatchTuplesItem != null) {
                    ByteMatchTupleJsonMarshaller.getInstance().marshall(byteMatchTuplesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ByteMatchSetJsonMarshaller instance;

    public static ByteMatchSetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ByteMatchSetJsonMarshaller();
        return instance;
    }
}
