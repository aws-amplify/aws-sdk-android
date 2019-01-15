/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AliasListEntry
 */
class AliasListEntryJsonMarshaller {

    public void marshall(AliasListEntry aliasListEntry, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (aliasListEntry.getAliasName() != null) {
            String aliasName = aliasListEntry.getAliasName();
            jsonWriter.name("AliasName");
            jsonWriter.value(aliasName);
        }
        if (aliasListEntry.getAliasArn() != null) {
            String aliasArn = aliasListEntry.getAliasArn();
            jsonWriter.name("AliasArn");
            jsonWriter.value(aliasArn);
        }
        if (aliasListEntry.getTargetKeyId() != null) {
            String targetKeyId = aliasListEntry.getTargetKeyId();
            jsonWriter.name("TargetKeyId");
            jsonWriter.value(targetKeyId);
        }
        jsonWriter.endObject();
    }

    private static AliasListEntryJsonMarshaller instance;

    public static AliasListEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AliasListEntryJsonMarshaller();
        return instance;
    }
}
