/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkidentity.model.transform;

import com.amazonaws.services.chimesdkidentity.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListAppInstanceAdminsResult
 */
public class ListAppInstanceAdminsResultJsonUnmarshaller implements
        Unmarshaller<ListAppInstanceAdminsResult, JsonUnmarshallerContext> {

    public ListAppInstanceAdminsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListAppInstanceAdminsResult listAppInstanceAdminsResult = new ListAppInstanceAdminsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AppInstanceArn")) {
                listAppInstanceAdminsResult.setAppInstanceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AppInstanceAdmins")) {
                listAppInstanceAdminsResult
                        .setAppInstanceAdmins(new ListUnmarshaller<AppInstanceAdminSummary>(
                                AppInstanceAdminSummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                listAppInstanceAdminsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listAppInstanceAdminsResult;
    }

    private static ListAppInstanceAdminsResultJsonUnmarshaller instance;

    public static ListAppInstanceAdminsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListAppInstanceAdminsResultJsonUnmarshaller();
        return instance;
    }
}
