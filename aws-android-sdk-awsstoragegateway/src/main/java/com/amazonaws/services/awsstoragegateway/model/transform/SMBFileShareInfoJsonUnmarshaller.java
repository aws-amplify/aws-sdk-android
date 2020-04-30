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

package com.amazonaws.services.awsstoragegateway.model.transform;

import com.amazonaws.services.awsstoragegateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO SMBFileShareInfo
 */
class SMBFileShareInfoJsonUnmarshaller implements
        Unmarshaller<SMBFileShareInfo, JsonUnmarshallerContext> {

    public SMBFileShareInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SMBFileShareInfo sMBFileShareInfo = new SMBFileShareInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("FileShareARN")) {
                sMBFileShareInfo.setFileShareARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FileShareId")) {
                sMBFileShareInfo.setFileShareId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FileShareStatus")) {
                sMBFileShareInfo.setFileShareStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GatewayARN")) {
                sMBFileShareInfo.setGatewayARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KMSEncrypted")) {
                sMBFileShareInfo.setKMSEncrypted(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KMSKey")) {
                sMBFileShareInfo.setKMSKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Path")) {
                sMBFileShareInfo.setPath(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Role")) {
                sMBFileShareInfo.setRole(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LocationARN")) {
                sMBFileShareInfo.setLocationARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultStorageClass")) {
                sMBFileShareInfo.setDefaultStorageClass(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ObjectACL")) {
                sMBFileShareInfo.setObjectACL(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReadOnly")) {
                sMBFileShareInfo.setReadOnly(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GuessMIMETypeEnabled")) {
                sMBFileShareInfo.setGuessMIMETypeEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequesterPays")) {
                sMBFileShareInfo.setRequesterPays(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SMBACLEnabled")) {
                sMBFileShareInfo.setSMBACLEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AdminUserList")) {
                sMBFileShareInfo.setAdminUserList(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ValidUserList")) {
                sMBFileShareInfo.setValidUserList(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("InvalidUserList")) {
                sMBFileShareInfo.setInvalidUserList(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AuditDestinationARN")) {
                sMBFileShareInfo.setAuditDestinationARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Authentication")) {
                sMBFileShareInfo.setAuthentication(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                sMBFileShareInfo.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return sMBFileShareInfo;
    }

    private static SMBFileShareInfoJsonUnmarshaller instance;

    public static SMBFileShareInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SMBFileShareInfoJsonUnmarshaller();
        return instance;
    }
}
