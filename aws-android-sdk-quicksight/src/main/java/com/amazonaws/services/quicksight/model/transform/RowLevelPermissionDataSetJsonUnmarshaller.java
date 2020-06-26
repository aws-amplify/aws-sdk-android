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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO RowLevelPermissionDataSet
 */
class RowLevelPermissionDataSetJsonUnmarshaller implements
        Unmarshaller<RowLevelPermissionDataSet, JsonUnmarshallerContext> {

    public RowLevelPermissionDataSet unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RowLevelPermissionDataSet rowLevelPermissionDataSet = new RowLevelPermissionDataSet();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                rowLevelPermissionDataSet.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PermissionPolicy")) {
                rowLevelPermissionDataSet.setPermissionPolicy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return rowLevelPermissionDataSet;
    }

    private static RowLevelPermissionDataSetJsonUnmarshaller instance;

    public static RowLevelPermissionDataSetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RowLevelPermissionDataSetJsonUnmarshaller();
        return instance;
    }
}
