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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetFindingsFilterResult
 */
public class GetFindingsFilterResultJsonUnmarshaller implements
        Unmarshaller<GetFindingsFilterResult, JsonUnmarshallerContext> {

    public GetFindingsFilterResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetFindingsFilterResult getFindingsFilterResult = new GetFindingsFilterResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("action")) {
                getFindingsFilterResult.setAction(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("arn")) {
                getFindingsFilterResult.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                getFindingsFilterResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("findingCriteria")) {
                getFindingsFilterResult.setFindingCriteria(FindingCriteriaJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("id")) {
                getFindingsFilterResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                getFindingsFilterResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("position")) {
                getFindingsFilterResult.setPosition(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                getFindingsFilterResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getFindingsFilterResult;
    }

    private static GetFindingsFilterResultJsonUnmarshaller instance;

    public static GetFindingsFilterResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetFindingsFilterResultJsonUnmarshaller();
        return instance;
    }
}
