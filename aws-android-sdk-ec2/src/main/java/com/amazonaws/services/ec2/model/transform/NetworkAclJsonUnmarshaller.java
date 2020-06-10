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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO NetworkAcl
 */
class NetworkAclJsonUnmarshaller implements Unmarshaller<NetworkAcl, JsonUnmarshallerContext> {

    public NetworkAcl unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        NetworkAcl networkAcl = new NetworkAcl();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Associations")) {
                networkAcl.setAssociations(new ListUnmarshaller<NetworkAclAssociation>(
                        NetworkAclAssociationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Entries")) {
                networkAcl.setEntries(new ListUnmarshaller<NetworkAclEntry>(
                        NetworkAclEntryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("IsDefault")) {
                networkAcl.setIsDefault(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkAclId")) {
                networkAcl.setNetworkAclId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                networkAcl.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("VpcId")) {
                networkAcl.setVpcId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OwnerId")) {
                networkAcl.setOwnerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return networkAcl;
    }

    private static NetworkAclJsonUnmarshaller instance;

    public static NetworkAclJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkAclJsonUnmarshaller();
        return instance;
    }
}
