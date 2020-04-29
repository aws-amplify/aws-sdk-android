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

package com.amazonaws.services.awswafregional.model.transform;

import com.amazonaws.services.awswafregional.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO RegexMatchSet
 */
class RegexMatchSetJsonUnmarshaller implements Unmarshaller<RegexMatchSet, JsonUnmarshallerContext> {

    public RegexMatchSet unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RegexMatchSet regexMatchSet = new RegexMatchSet();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("RegexMatchSetId")) {
                regexMatchSet.setRegexMatchSetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                regexMatchSet.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RegexMatchTuples")) {
                regexMatchSet.setRegexMatchTuples(new ListUnmarshaller<RegexMatchTuple>(
                        RegexMatchTupleJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return regexMatchSet;
    }

    private static RegexMatchSetJsonUnmarshaller instance;

    public static RegexMatchSetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RegexMatchSetJsonUnmarshaller();
        return instance;
    }
}
