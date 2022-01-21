/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for response ListSecurityProfilePermissionsResult
 */
public class ListSecurityProfilePermissionsResultJsonUnmarshaller implements
        Unmarshaller<ListSecurityProfilePermissionsResult, JsonUnmarshallerContext> {

    public ListSecurityProfilePermissionsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        ListSecurityProfilePermissionsResult listSecurityProfilePermissionsResult = new ListSecurityProfilePermissionsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Permissions")) {
                listSecurityProfilePermissionsResult.setPermissions(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                listSecurityProfilePermissionsResult.setNextToken(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listSecurityProfilePermissionsResult;
    }

    private static ListSecurityProfilePermissionsResultJsonUnmarshaller instance;

    public static ListSecurityProfilePermissionsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListSecurityProfilePermissionsResultJsonUnmarshaller();
        return instance;
    }
}
