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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeHumanTaskUiResult
 */
public class DescribeHumanTaskUiResultJsonUnmarshaller implements
        Unmarshaller<DescribeHumanTaskUiResult, JsonUnmarshallerContext> {

    public DescribeHumanTaskUiResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeHumanTaskUiResult describeHumanTaskUiResult = new DescribeHumanTaskUiResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("HumanTaskUiArn")) {
                describeHumanTaskUiResult.setHumanTaskUiArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HumanTaskUiName")) {
                describeHumanTaskUiResult.setHumanTaskUiName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                describeHumanTaskUiResult.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UiTemplate")) {
                describeHumanTaskUiResult.setUiTemplate(UiTemplateInfoJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeHumanTaskUiResult;
    }

    private static DescribeHumanTaskUiResultJsonUnmarshaller instance;

    public static DescribeHumanTaskUiResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeHumanTaskUiResultJsonUnmarshaller();
        return instance;
    }
}
