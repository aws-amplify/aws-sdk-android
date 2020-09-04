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
 * JSON unmarshaller for POJO OpsItem
 */
class OpsItemJsonUnmarshaller implements Unmarshaller<OpsItem, JsonUnmarshallerContext> {

    public OpsItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        OpsItem opsItem = new OpsItem();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CreatedBy")) {
                opsItem.setCreatedBy(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("CreatedTime")) {
                opsItem.setCreatedTime(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Description")) {
                opsItem.setDescription(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LastModifiedBy")) {
                opsItem.setLastModifiedBy(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                opsItem.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Notifications")) {
                opsItem.setNotifications(new ListUnmarshaller<OpsItemNotification>(OpsItemNotificationJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("Priority")) {
                opsItem.setPriority(IntegerJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("RelatedOpsItems")) {
                opsItem.setRelatedOpsItems(new ListUnmarshaller<RelatedOpsItem>(RelatedOpsItemJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("Status")) {
                opsItem.setStatus(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("OpsItemId")) {
                opsItem.setOpsItemId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Version")) {
                opsItem.setVersion(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Title")) {
                opsItem.setTitle(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Source")) {
                opsItem.setSource(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("OperationalData")) {
                opsItem.setOperationalData(new MapUnmarshaller<OpsItemDataValue>(OpsItemDataValueJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("Category")) {
                opsItem.setCategory(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Severity")) {
                opsItem.setSeverity(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return opsItem;
    }

    private static OpsItemJsonUnmarshaller instance;
    public static OpsItemJsonUnmarshaller getInstance() {
        if (instance == null) instance = new OpsItemJsonUnmarshaller();
        return instance;
    }
}
