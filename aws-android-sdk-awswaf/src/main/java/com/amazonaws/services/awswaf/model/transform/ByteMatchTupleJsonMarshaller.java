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
 * JSON marshaller for POJO ByteMatchTuple
 */
class ByteMatchTupleJsonMarshaller {

    public void marshall(ByteMatchTuple byteMatchTuple, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (byteMatchTuple.getFieldToMatch() != null) {
            FieldToMatch fieldToMatch = byteMatchTuple.getFieldToMatch();
            jsonWriter.name("FieldToMatch");
            FieldToMatchJsonMarshaller.getInstance().marshall(fieldToMatch, jsonWriter);
        }
        if (byteMatchTuple.getTargetString() != null) {
            java.nio.ByteBuffer targetString = byteMatchTuple.getTargetString();
            jsonWriter.name("TargetString");
            jsonWriter.value(targetString);
        }
        if (byteMatchTuple.getTextTransformation() != null) {
            String textTransformation = byteMatchTuple.getTextTransformation();
            jsonWriter.name("TextTransformation");
            jsonWriter.value(textTransformation);
        }
        if (byteMatchTuple.getPositionalConstraint() != null) {
            String positionalConstraint = byteMatchTuple.getPositionalConstraint();
            jsonWriter.name("PositionalConstraint");
            jsonWriter.value(positionalConstraint);
        }
        jsonWriter.endObject();
    }

    private static ByteMatchTupleJsonMarshaller instance;

    public static ByteMatchTupleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ByteMatchTupleJsonMarshaller();
        return instance;
    }
}
