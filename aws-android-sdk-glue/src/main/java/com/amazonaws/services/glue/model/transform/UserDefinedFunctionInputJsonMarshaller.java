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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UserDefinedFunctionInput
 */
class UserDefinedFunctionInputJsonMarshaller {

    public void marshall(UserDefinedFunctionInput userDefinedFunctionInput, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (userDefinedFunctionInput.getFunctionName() != null) {
            String functionName = userDefinedFunctionInput.getFunctionName();
            jsonWriter.name("FunctionName");
            jsonWriter.value(functionName);
        }
        if (userDefinedFunctionInput.getClassName() != null) {
            String className = userDefinedFunctionInput.getClassName();
            jsonWriter.name("ClassName");
            jsonWriter.value(className);
        }
        if (userDefinedFunctionInput.getOwnerName() != null) {
            String ownerName = userDefinedFunctionInput.getOwnerName();
            jsonWriter.name("OwnerName");
            jsonWriter.value(ownerName);
        }
        if (userDefinedFunctionInput.getOwnerType() != null) {
            String ownerType = userDefinedFunctionInput.getOwnerType();
            jsonWriter.name("OwnerType");
            jsonWriter.value(ownerType);
        }
        if (userDefinedFunctionInput.getResourceUris() != null) {
            java.util.List<ResourceUri> resourceUris = userDefinedFunctionInput.getResourceUris();
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

    private static UserDefinedFunctionInputJsonMarshaller instance;

    public static UserDefinedFunctionInputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserDefinedFunctionInputJsonMarshaller();
        return instance;
    }
}
