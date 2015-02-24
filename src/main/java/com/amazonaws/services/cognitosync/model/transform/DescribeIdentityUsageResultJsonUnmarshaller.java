/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitosync.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * Describe Identity Usage Result JSON Unmarshaller
 */
public class DescribeIdentityUsageResultJsonUnmarshaller implements Unmarshaller<DescribeIdentityUsageResult, JsonUnmarshallerContext> {

    public DescribeIdentityUsageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeIdentityUsageResult describeIdentityUsageResult = new DescribeIdentityUsageResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            
            if (name.equals("IdentityUsage")) {
                describeIdentityUsageResult.setIdentityUsage(IdentityUsageJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            {
                reader.skipValue();
            }
            
        }
        reader.endObject();
        
        return describeIdentityUsageResult;
    }

    private static DescribeIdentityUsageResultJsonUnmarshaller instance;
    public static DescribeIdentityUsageResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new DescribeIdentityUsageResultJsonUnmarshaller();
        return instance;
    }
}
    