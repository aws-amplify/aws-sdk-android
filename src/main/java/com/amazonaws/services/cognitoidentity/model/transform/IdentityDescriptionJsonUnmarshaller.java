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

package com.amazonaws.services.cognitoidentity.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * Identity Description JSON Unmarshaller
 */
public class IdentityDescriptionJsonUnmarshaller implements Unmarshaller<IdentityDescription, JsonUnmarshallerContext> {

    public IdentityDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        IdentityDescription identityDescription = new IdentityDescription();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            
            if (name.equals("IdentityId")) {
                identityDescription.setIdentityId(StringJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("Logins")) {
                identityDescription.setLogins(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()).unmarshall(context));
            } else 
            if (name.equals("CreationDate")) {
                identityDescription.setCreationDate(DateJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("LastModifiedDate")) {
                identityDescription.setLastModifiedDate(DateJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            {
                reader.skipValue();
            }
            
        }
        reader.endObject();
        
        return identityDescription;
    }

    private static IdentityDescriptionJsonUnmarshaller instance;
    public static IdentityDescriptionJsonUnmarshaller getInstance() {
        if (instance == null) instance = new IdentityDescriptionJsonUnmarshaller();
        return instance;
    }
}
    