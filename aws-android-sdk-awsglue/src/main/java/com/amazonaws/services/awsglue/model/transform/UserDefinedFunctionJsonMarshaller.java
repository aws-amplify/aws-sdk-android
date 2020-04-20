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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UserDefinedFunction
 */
class UserDefinedFunctionJsonMarshaller {

    public void marshall(UserDefinedFunction userDefinedFunction, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (userDefinedFunction.getFunctionName() != null) {
            String functionName = userDefinedFunction.getFunctionName();
            jsonWriter.name("FunctionName");
            jsonWriter.value(functionName);
        }
        if (userDefinedFunction.getClassName() != null) {
            String className = userDefinedFunction.getClassName();
            jsonWriter.name("ClassName");
            jsonWriter.value(className);
        }
        if (userDefinedFunction.getOwnerName() != null) {
            String ownerName = userDefinedFunction.getOwnerName();
            jsonWriter.name("OwnerName");
            jsonWriter.value(ownerName);
        }
        if (userDefinedFunction.getOwnerType() != null) {
            String ownerType = userDefinedFunction.getOwnerType();
            jsonWriter.name("OwnerType");
            jsonWriter.value(ownerType);
        }
        if (userDefinedFunction.getCreateTime() != null) {
            java.util.Date createTime = userDefinedFunction.getCreateTime();
            jsonWriter.name("CreateTime");
            jsonWriter.value(createTime);
        }
        if (userDefinedFunction.getResourceUris() != null) {
            java.util.List<ResourceUri> resourceUris = userDefinedFunction.getResourceUris();
            jsonWriter.name("ResourceUris");
            jsonWriter.beginArray();
            for (ResourceUri resourceUrisItem : resourceUris) {
                if (resourceUrisItem != null) {
                    ResourceUriJsonMarshaller.getInstance().marshall(resourceUrisItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static UserDefinedFunctionJsonMarshaller instance;

    public static UserDefinedFunctionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserDefinedFunctionJsonMarshaller();
        return instance;
    }
}
