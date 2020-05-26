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

package com.amazonaws.services.dlm.model.transform;

import com.amazonaws.services.dlm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO LifecyclePolicy
 */
class LifecyclePolicyJsonUnmarshaller implements
        Unmarshaller<LifecyclePolicy, JsonUnmarshallerContext> {

    public LifecyclePolicy unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LifecyclePolicy lifecyclePolicy = new LifecyclePolicy();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("PolicyId")) {
                lifecyclePolicy.setPolicyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                lifecyclePolicy.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                lifecyclePolicy.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusMessage")) {
                lifecyclePolicy.setStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExecutionRoleArn")) {
                lifecyclePolicy.setExecutionRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DateCreated")) {
                lifecyclePolicy.setDateCreated(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DateModified")) {
                lifecyclePolicy.setDateModified(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PolicyDetails")) {
                lifecyclePolicy.setPolicyDetails(PolicyDetailsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                lifecyclePolicy.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PolicyArn")) {
                lifecyclePolicy.setPolicyArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return lifecyclePolicy;
    }

    private static LifecyclePolicyJsonUnmarshaller instance;

    public static LifecyclePolicyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LifecyclePolicyJsonUnmarshaller();
        return instance;
    }
}
