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
 * List Identity Pool Usage Result JSON Unmarshaller
 */
public class ListIdentityPoolUsageResultJsonUnmarshaller implements Unmarshaller<ListIdentityPoolUsageResult, JsonUnmarshallerContext> {

    public ListIdentityPoolUsageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListIdentityPoolUsageResult listIdentityPoolUsageResult = new ListIdentityPoolUsageResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            
            if (name.equals("IdentityPoolUsages")) {
                listIdentityPoolUsageResult.setIdentityPoolUsages(new ListUnmarshaller<IdentityPoolUsage>(IdentityPoolUsageJsonUnmarshaller.getInstance()).unmarshall(context));
            } else 
            if (name.equals("MaxResults")) {
                listIdentityPoolUsageResult.setMaxResults(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("Count")) {
                listIdentityPoolUsageResult.setCount(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("NextToken")) {
                listIdentityPoolUsageResult.setNextToken(StringJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            {
                reader.skipValue();
            }
            
        }
        reader.endObject();
        
        return listIdentityPoolUsageResult;
    }

    private static ListIdentityPoolUsageResultJsonUnmarshaller instance;
    public static ListIdentityPoolUsageResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ListIdentityPoolUsageResultJsonUnmarshaller();
        return instance;
    }
}
    