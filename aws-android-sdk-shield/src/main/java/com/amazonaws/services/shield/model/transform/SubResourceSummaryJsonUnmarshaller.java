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

package com.amazonaws.services.shield.model.transform;

import com.amazonaws.services.shield.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO SubResourceSummary
 */
class SubResourceSummaryJsonUnmarshaller implements
        Unmarshaller<SubResourceSummary, JsonUnmarshallerContext> {

    public SubResourceSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SubResourceSummary subResourceSummary = new SubResourceSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Type")) {
                subResourceSummary.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                subResourceSummary.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AttackVectors")) {
                subResourceSummary.setAttackVectors(new ListUnmarshaller<SummarizedAttackVector>(
                        SummarizedAttackVectorJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Counters")) {
                subResourceSummary.setCounters(new ListUnmarshaller<SummarizedCounter>(
                        SummarizedCounterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return subResourceSummary;
    }

    private static SubResourceSummaryJsonUnmarshaller instance;

    public static SubResourceSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SubResourceSummaryJsonUnmarshaller();
        return instance;
    }
}
