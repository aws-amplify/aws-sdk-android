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
 * Identity Usage JSON Unmarshaller
 */
public class IdentityUsageJsonUnmarshaller implements Unmarshaller<IdentityUsage, JsonUnmarshallerContext> {

    public IdentityUsage unmarshall(JsonUnmarshallerContext context) throws Exception {
        IdentityUsage identityUsage = new IdentityUsage();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            
            if (name.equals("IdentityId")) {
                identityUsage.setIdentityId(StringJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("IdentityPoolId")) {
                identityUsage.setIdentityPoolId(StringJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("LastModifiedDate")) {
                identityUsage.setLastModifiedDate(DateJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("DatasetCount")) {
                identityUsage.setDatasetCount(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("DataStorage")) {
                identityUsage.setDataStorage(LongJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            {
                reader.skipValue();
            }
            
        }
        reader.endObject();
        
        return identityUsage;
    }

    private static IdentityUsageJsonUnmarshaller instance;
    public static IdentityUsageJsonUnmarshaller getInstance() {
        if (instance == null) instance = new IdentityUsageJsonUnmarshaller();
        return instance;
    }
}
    