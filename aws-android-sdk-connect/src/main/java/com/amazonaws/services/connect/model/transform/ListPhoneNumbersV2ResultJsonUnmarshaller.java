/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListPhoneNumbersV2Result
 */
public class ListPhoneNumbersV2ResultJsonUnmarshaller implements
        Unmarshaller<ListPhoneNumbersV2Result, JsonUnmarshallerContext> {

    public ListPhoneNumbersV2Result unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListPhoneNumbersV2Result listPhoneNumbersV2Result = new ListPhoneNumbersV2Result();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("NextToken")) {
                listPhoneNumbersV2Result.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ListPhoneNumbersSummaryList")) {
                listPhoneNumbersV2Result
                        .setListPhoneNumbersSummaryList(new ListUnmarshaller<ListPhoneNumbersSummary>(
                                ListPhoneNumbersSummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listPhoneNumbersV2Result;
    }

    private static ListPhoneNumbersV2ResultJsonUnmarshaller instance;

    public static ListPhoneNumbersV2ResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListPhoneNumbersV2ResultJsonUnmarshaller();
        return instance;
    }
}
