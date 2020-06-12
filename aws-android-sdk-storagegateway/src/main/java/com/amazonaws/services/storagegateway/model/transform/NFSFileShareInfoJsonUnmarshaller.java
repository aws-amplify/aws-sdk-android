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

package com.amazonaws.services.storagegateway.model.transform;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO NFSFileShareInfo
 */
class NFSFileShareInfoJsonUnmarshaller implements
        Unmarshaller<NFSFileShareInfo, JsonUnmarshallerContext> {

    public NFSFileShareInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        NFSFileShareInfo nFSFileShareInfo = new NFSFileShareInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("NFSFileShareDefaults")) {
                nFSFileShareInfo.setNFSFileShareDefaults(NFSFileShareDefaultsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FileShareARN")) {
                nFSFileShareInfo.setFileShareARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FileShareId")) {
                nFSFileShareInfo.setFileShareId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FileShareStatus")) {
                nFSFileShareInfo.setFileShareStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GatewayARN")) {
                nFSFileShareInfo.setGatewayARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KMSEncrypted")) {
                nFSFileShareInfo.setKMSEncrypted(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KMSKey")) {
                nFSFileShareInfo.setKMSKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Path")) {
                nFSFileShareInfo.setPath(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Role")) {
                nFSFileShareInfo.setRole(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LocationARN")) {
                nFSFileShareInfo.setLocationARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultStorageClass")) {
                nFSFileShareInfo.setDefaultStorageClass(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ObjectACL")) {
                nFSFileShareInfo.setObjectACL(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ClientList")) {
                nFSFileShareInfo.setClientList(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Squash")) {
                nFSFileShareInfo.setSquash(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReadOnly")) {
                nFSFileShareInfo.setReadOnly(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GuessMIMETypeEnabled")) {
                nFSFileShareInfo.setGuessMIMETypeEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequesterPays")) {
                nFSFileShareInfo.setRequesterPays(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                nFSFileShareInfo.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return nFSFileShareInfo;
    }

    private static NFSFileShareInfoJsonUnmarshaller instance;

    public static NFSFileShareInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NFSFileShareInfoJsonUnmarshaller();
        return instance;
    }
}
