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

package com.amazonaws.services.awstransferfamily.model.transform;

import com.amazonaws.services.awstransferfamily.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ListedUser
 */
class ListedUserJsonMarshaller {

    public void marshall(ListedUser listedUser, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (listedUser.getArn() != null) {
            String arn = listedUser.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (listedUser.getHomeDirectory() != null) {
            String homeDirectory = listedUser.getHomeDirectory();
            jsonWriter.name("HomeDirectory");
            jsonWriter.value(homeDirectory);
        }
        if (listedUser.getHomeDirectoryType() != null) {
            String homeDirectoryType = listedUser.getHomeDirectoryType();
            jsonWriter.name("HomeDirectoryType");
            jsonWriter.value(homeDirectoryType);
        }
        if (listedUser.getRole() != null) {
            String role = listedUser.getRole();
            jsonWriter.name("Role");
            jsonWriter.value(role);
        }
        if (listedUser.getSshPublicKeyCount() != null) {
            Integer sshPublicKeyCount = listedUser.getSshPublicKeyCount();
            jsonWriter.name("SshPublicKeyCount");
            jsonWriter.value(sshPublicKeyCount);
        }
        if (listedUser.getUserName() != null) {
            String userName = listedUser.getUserName();
            jsonWriter.name("UserName");
            jsonWriter.value(userName);
        }
        jsonWriter.endObject();
    }

    private static ListedUserJsonMarshaller instance;

    public static ListedUserJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ListedUserJsonMarshaller();
        return instance;
    }
}
