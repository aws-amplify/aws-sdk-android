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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NetworkAcl
 */
class NetworkAclJsonMarshaller {

    public void marshall(NetworkAcl networkAcl, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (networkAcl.getAssociations() != null) {
            java.util.List<NetworkAclAssociation> associations = networkAcl.getAssociations();
            jsonWriter.name("Associations");
            jsonWriter.beginArray();
            for (NetworkAclAssociation associationsItem : associations) {
                if (associationsItem != null) {
                    NetworkAclAssociationJsonMarshaller.getInstance().marshall(associationsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (networkAcl.getEntries() != null) {
            java.util.List<NetworkAclEntry> entries = networkAcl.getEntries();
            jsonWriter.name("Entries");
            jsonWriter.beginArray();
            for (NetworkAclEntry entriesItem : entries) {
                if (entriesItem != null) {
                    NetworkAclEntryJsonMarshaller.getInstance().marshall(entriesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (networkAcl.getIsDefault() != null) {
            Boolean isDefault = networkAcl.getIsDefault();
            jsonWriter.name("IsDefault");
            jsonWriter.value(isDefault);
        }
        if (networkAcl.getNetworkAclId() != null) {
            String networkAclId = networkAcl.getNetworkAclId();
            jsonWriter.name("NetworkAclId");
            jsonWriter.value(networkAclId);
        }
        if (networkAcl.getTags() != null) {
            java.util.List<Tag> tags = networkAcl.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (networkAcl.getVpcId() != null) {
            String vpcId = networkAcl.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        if (networkAcl.getOwnerId() != null) {
            String ownerId = networkAcl.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        jsonWriter.endObject();
    }

    private static NetworkAclJsonMarshaller instance;

    public static NetworkAclJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NetworkAclJsonMarshaller();
        return instance;
    }
}
