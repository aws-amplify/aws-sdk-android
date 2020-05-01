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

package com.amazonaws.services.amazonelasticfilesystem.model.transform;

import com.amazonaws.services.amazonelasticfilesystem.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PosixUser
 */
class PosixUserJsonMarshaller {

    public void marshall(PosixUser posixUser, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (posixUser.getUid() != null) {
            Long uid = posixUser.getUid();
            jsonWriter.name("Uid");
            jsonWriter.value(uid);
        }
        if (posixUser.getGid() != null) {
            Long gid = posixUser.getGid();
            jsonWriter.name("Gid");
            jsonWriter.value(gid);
        }
        if (posixUser.getSecondaryGids() != null) {
            java.util.List<Long> secondaryGids = posixUser.getSecondaryGids();
            jsonWriter.name("SecondaryGids");
            jsonWriter.beginArray();
            for (Long secondaryGidsItem : secondaryGids) {
                if (secondaryGidsItem != null) {
                    jsonWriter.value(secondaryGidsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static PosixUserJsonMarshaller instance;

    public static PosixUserJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PosixUserJsonMarshaller();
        return instance;
    }
}
