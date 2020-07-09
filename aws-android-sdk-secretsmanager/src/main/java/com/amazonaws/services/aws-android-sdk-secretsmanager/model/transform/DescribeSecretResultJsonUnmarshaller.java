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
package com.amazonaws.services.aws-android-sdk-secretsmanager.model.transform;

import com.amazonaws.services.aws-android-sdk-secretsmanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for response DescribeSecretResult
 */
public class DescribeSecretResultJsonUnmarshaller implements Unmarshaller<DescribeSecretResult, JsonUnmarshallerContext> {

    public DescribeSecretResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeSecretResult describeSecretResult = new DescribeSecretResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ARN")) {
                describeSecretResult.setARN(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Name")) {
                describeSecretResult.setName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Description")) {
                describeSecretResult.setDescription(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("KmsKeyId")) {
                describeSecretResult.setKmsKeyId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("RotationEnabled")) {
                describeSecretResult.setRotationEnabled(BooleanJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("RotationLambdaARN")) {
                describeSecretResult.setRotationLambdaARN(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("RotationRules")) {
                describeSecretResult.setRotationRules(RotationRulesTypeJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LastRotatedDate")) {
                describeSecretResult.setLastRotatedDate(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LastChangedDate")) {
                describeSecretResult.setLastChangedDate(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LastAccessedDate")) {
                describeSecretResult.setLastAccessedDate(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("DeletedDate")) {
                describeSecretResult.setDeletedDate(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Tags")) {
                describeSecretResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("VersionIdsToStages")) {
                describeSecretResult.setVersionIdsToStages(new MapUnmarshaller<java.util.List<String>>(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
)
)
.unmarshall(context));
            } else if (name.equals("OwningService")) {
                describeSecretResult.setOwningService(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("CreatedDate")) {
                describeSecretResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeSecretResult;
    }

    private static DescribeSecretResultJsonUnmarshaller instance;
    public static DescribeSecretResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new DescribeSecretResultJsonUnmarshaller();
        return instance;
    }
}
