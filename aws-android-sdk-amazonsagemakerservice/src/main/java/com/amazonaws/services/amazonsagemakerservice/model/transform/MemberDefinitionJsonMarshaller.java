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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MemberDefinition
 */
class MemberDefinitionJsonMarshaller {

    public void marshall(MemberDefinition memberDefinition, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (memberDefinition.getCognitoMemberDefinition() != null) {
            CognitoMemberDefinition cognitoMemberDefinition = memberDefinition
                    .getCognitoMemberDefinition();
            jsonWriter.name("CognitoMemberDefinition");
            CognitoMemberDefinitionJsonMarshaller.getInstance().marshall(cognitoMemberDefinition,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static MemberDefinitionJsonMarshaller instance;

    public static MemberDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MemberDefinitionJsonMarshaller();
        return instance;
    }
}
