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
 * JSON unmarshaller for POJO RegexPatternSetSummary
 */
class RegexPatternSetSummaryJsonUnmarshaller implements
        Unmarshaller<RegexPatternSetSummary, JsonUnmarshallerContext> {

    public RegexPatternSetSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RegexPatternSetSummary regexPatternSetSummary = new RegexPatternSetSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("RegexPatternSetId")) {
                regexPatternSetSummary.setRegexPatternSetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                regexPatternSetSummary.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return regexPatternSetSummary;
    }

    private static RegexPatternSetSummaryJsonUnmarshaller instance;

    public static RegexPatternSetSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RegexPatternSetSummaryJsonUnmarshaller();
        return instance;
    }
}
