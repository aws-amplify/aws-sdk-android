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
 * JSON marshaller for POJO DescribedUser
 */
class DescribedUserJsonMarshaller {

    public void marshall(DescribedUser describedUser, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (describedUser.getArn() != null) {
            String arn = describedUser.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (describedUser.getHomeDirectory() != null) {
            String homeDirectory = describedUser.getHomeDirectory();
            jsonWriter.name("HomeDirectory");
            jsonWriter.value(homeDirectory);
        }
        if (describedUser.getHomeDirectoryMappings() != null) {
            java.util.List<HomeDirectoryMapEntry> homeDirectoryMappings = describedUser
                    .getHomeDirectoryMappings();
            jsonWriter.name("HomeDirectoryMappings");
            jsonWriter.beginArray();
            for (HomeDirectoryMapEntry homeDirectoryMappingsItem : homeDirectoryMappings) {
                if (homeDirectoryMappingsItem != null) {
                    HomeDirectoryMapEntryJsonMarshaller.getInstance().marshall(
                            homeDirectoryMappingsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (describedUser.getHomeDirectoryType() != null) {
            String homeDirectoryType = describedUser.getHomeDirectoryType();
            jsonWriter.name("HomeDirectoryType");
            jsonWriter.value(homeDirectoryType);
        }
        if (describedUser.getPolicy() != null) {
            String policy = describedUser.getPolicy();
            jsonWriter.name("Policy");
            jsonWriter.value(policy);
        }
        if (describedUser.getRole() != null) {
            String role = describedUser.getRole();
            jsonWriter.name("Role");
            jsonWriter.value(role);
        }
        if (describedUser.getSshPublicKeys() != null) {
            java.util.List<SshPublicKey> sshPublicKeys = describedUser.getSshPublicKeys();
            jsonWriter.name("SshPublicKeys");
            jsonWriter.beginArray();
            for (SshPublicKey sshPublicKeysItem : sshPublicKeys) {
                if (sshPublicKeysItem != null) {
                    SshPublicKeyJsonMarshaller.getInstance()
                            .marshall(sshPublicKeysItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (describedUser.getTags() != null) {
            java.util.List<Tag> tags = describedUser.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (describedUser.getUserName() != null) {
            String userName = describedUser.getUserName();
            jsonWriter.name("UserName");
            jsonWriter.value(userName);
        }
        jsonWriter.endObject();
    }

    private static DescribedUserJsonMarshaller instance;

    public static DescribedUserJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DescribedUserJsonMarshaller();
        return instance;
    }
}
