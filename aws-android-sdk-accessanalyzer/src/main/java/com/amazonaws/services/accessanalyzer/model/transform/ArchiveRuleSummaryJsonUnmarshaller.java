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
 * JSON unmarshaller for POJO ArchiveRuleSummary
 */
class ArchiveRuleSummaryJsonUnmarshaller implements
        Unmarshaller<ArchiveRuleSummary, JsonUnmarshallerContext> {

    public ArchiveRuleSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ArchiveRuleSummary archiveRuleSummary = new ArchiveRuleSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("createdAt")) {
                archiveRuleSummary.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("filter")) {
                archiveRuleSummary.setFilter(new MapUnmarshaller<Criterion>(
                        CriterionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ruleName")) {
                archiveRuleSummary.setRuleName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("updatedAt")) {
                archiveRuleSummary.setUpdatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return archiveRuleSummary;
    }

    private static ArchiveRuleSummaryJsonUnmarshaller instance;

    public static ArchiveRuleSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ArchiveRuleSummaryJsonUnmarshaller();
        return instance;
    }
}
