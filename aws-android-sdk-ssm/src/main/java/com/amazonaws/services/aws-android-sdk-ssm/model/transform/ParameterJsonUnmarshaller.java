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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO Parameter
 */
class ParameterJsonUnmarshaller implements Unmarshaller<Parameter, JsonUnmarshallerContext> {

    public Parameter unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Parameter parameter = new Parameter();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                parameter.setName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Type")) {
                parameter.setType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Value")) {
                parameter.setValue(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Version")) {
                parameter.setVersion(LongJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Selector")) {
                parameter.setSelector(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("SourceResult")) {
                parameter.setSourceResult(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LastModifiedDate")) {
                parameter.setLastModifiedDate(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ARN")) {
                parameter.setARN(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("DataType")) {
                parameter.setDataType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return parameter;
    }

    private static ParameterJsonUnmarshaller instance;
    public static ParameterJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ParameterJsonUnmarshaller();
        return instance;
    }
}
