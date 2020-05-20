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

package com.amazonaws.services.codedeploy.model.transform;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO EC2TagSet
 */
class EC2TagSetJsonUnmarshaller implements Unmarshaller<EC2TagSet, JsonUnmarshallerContext> {

    public EC2TagSet unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EC2TagSet eC2TagSet = new EC2TagSet();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ec2TagSetList")) {
                eC2TagSet.setEc2TagSetList(new ListUnmarshaller<java.util.List<EC2TagFilter>>(
                        new ListUnmarshaller<EC2TagFilter>(EC2TagFilterJsonUnmarshaller
                                .getInstance()
                        )
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return eC2TagSet;
    }

    private static EC2TagSetJsonUnmarshaller instance;

    public static EC2TagSetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EC2TagSetJsonUnmarshaller();
        return instance;
    }
}
