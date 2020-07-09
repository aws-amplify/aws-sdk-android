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
 * JSON unmarshaller for POJO SecretListEntry
 */
class SecretListEntryJsonUnmarshaller implements Unmarshaller<SecretListEntry, JsonUnmarshallerContext> {

    public SecretListEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SecretListEntry secretListEntry = new SecretListEntry();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ARN")) {
                secretListEntry.setARN(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Name")) {
                secretListEntry.setName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Description")) {
                secretListEntry.setDescription(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("KmsKeyId")) {
                secretListEntry.setKmsKeyId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("RotationEnabled")) {
                secretListEntry.setRotationEnabled(BooleanJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("RotationLambdaARN")) {
                secretListEntry.setRotationLambdaARN(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("RotationRules")) {
                secretListEntry.setRotationRules(RotationRulesTypeJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LastRotatedDate")) {
                secretListEntry.setLastRotatedDate(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LastChangedDate")) {
                secretListEntry.setLastChangedDate(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LastAccessedDate")) {
                secretListEntry.setLastAccessedDate(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("DeletedDate")) {
                secretListEntry.setDeletedDate(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Tags")) {
                secretListEntry.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("SecretVersionsToStages")) {
                secretListEntry.setSecretVersionsToStages(new MapUnmarshaller<java.util.List<String>>(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
)
)
.unmarshall(context));
            } else if (name.equals("OwningService")) {
                secretListEntry.setOwningService(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("CreatedDate")) {
                secretListEntry.setCreatedDate(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return secretListEntry;
    }

    private static SecretListEntryJsonUnmarshaller instance;
    public static SecretListEntryJsonUnmarshaller getInstance() {
        if (instance == null) instance = new SecretListEntryJsonUnmarshaller();
        return instance;
    }
}
