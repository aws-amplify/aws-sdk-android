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
 * JSON marshaller for POJO LocalGatewayVirtualInterfaceGroup
 */
class LocalGatewayVirtualInterfaceGroupJsonMarshaller {

    public void marshall(LocalGatewayVirtualInterfaceGroup localGatewayVirtualInterfaceGroup,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (localGatewayVirtualInterfaceGroup.getLocalGatewayVirtualInterfaceGroupId() != null) {
            String localGatewayVirtualInterfaceGroupId = localGatewayVirtualInterfaceGroup
                    .getLocalGatewayVirtualInterfaceGroupId();
            jsonWriter.name("LocalGatewayVirtualInterfaceGroupId");
            jsonWriter.value(localGatewayVirtualInterfaceGroupId);
        }
        if (localGatewayVirtualInterfaceGroup.getLocalGatewayVirtualInterfaceIds() != null) {
            java.util.List<String> localGatewayVirtualInterfaceIds = localGatewayVirtualInterfaceGroup
                    .getLocalGatewayVirtualInterfaceIds();
            jsonWriter.name("LocalGatewayVirtualInterfaceIds");
            jsonWriter.beginArray();
            for (String localGatewayVirtualInterfaceIdsItem : localGatewayVirtualInterfaceIds) {
                if (localGatewayVirtualInterfaceIdsItem != null) {
                    jsonWriter.value(localGatewayVirtualInterfaceIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (localGatewayVirtualInterfaceGroup.getLocalGatewayId() != null) {
            String localGatewayId = localGatewayVirtualInterfaceGroup.getLocalGatewayId();
            jsonWriter.name("LocalGatewayId");
            jsonWriter.value(localGatewayId);
        }
        if (localGatewayVirtualInterfaceGroup.getTags() != null) {
            java.util.List<Tag> tags = localGatewayVirtualInterfaceGroup.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static LocalGatewayVirtualInterfaceGroupJsonMarshaller instance;

    public static LocalGatewayVirtualInterfaceGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LocalGatewayVirtualInterfaceGroupJsonMarshaller();
        return instance;
    }
}
