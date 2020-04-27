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

package com.amazonaws.services.accessanalyzer.model.transform;

import com.amazonaws.services.accessanalyzer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListArchiveRulesResult
 */
public class ListArchiveRulesResultJsonUnmarshaller implements
        Unmarshaller<ListArchiveRulesResult, JsonUnmarshallerContext> {

    public ListArchiveRulesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListArchiveRulesResult listArchiveRulesResult = new ListArchiveRulesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("archiveRules")) {
                listArchiveRulesResult.setArchiveRules(new ListUnmarshaller<ArchiveRuleSummary>(
                        ArchiveRuleSummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("nextToken")) {
                listArchiveRulesResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listArchiveRulesResult;
    }

    private static ListArchiveRulesResultJsonUnmarshaller instance;

    public static ListArchiveRulesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListArchiveRulesResultJsonUnmarshaller();
        return instance;
    }
}
