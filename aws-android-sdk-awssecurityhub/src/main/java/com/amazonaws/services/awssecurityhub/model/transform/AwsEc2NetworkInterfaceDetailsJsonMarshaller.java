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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsEc2NetworkInterfaceDetails
 */
class AwsEc2NetworkInterfaceDetailsJsonMarshaller {

    public void marshall(AwsEc2NetworkInterfaceDetails awsEc2NetworkInterfaceDetails,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsEc2NetworkInterfaceDetails.getAttachment() != null) {
            AwsEc2NetworkInterfaceAttachment attachment = awsEc2NetworkInterfaceDetails
                    .getAttachment();
            jsonWriter.name("Attachment");
            AwsEc2NetworkInterfaceAttachmentJsonMarshaller.getInstance().marshall(attachment,
                    jsonWriter);
        }
        if (awsEc2NetworkInterfaceDetails.getNetworkInterfaceId() != null) {
            String networkInterfaceId = awsEc2NetworkInterfaceDetails.getNetworkInterfaceId();
            jsonWriter.name("NetworkInterfaceId");
            jsonWriter.value(networkInterfaceId);
        }
        if (awsEc2NetworkInterfaceDetails.getSecurityGroups() != null) {
            java.util.List<AwsEc2NetworkInterfaceSecurityGroup> securityGroups = awsEc2NetworkInterfaceDetails
                    .getSecurityGroups();
            jsonWriter.name("SecurityGroups");
            jsonWriter.beginArray();
            for (AwsEc2NetworkInterfaceSecurityGroup securityGroupsItem : securityGroups) {
                if (securityGroupsItem != null) {
                    AwsEc2NetworkInterfaceSecurityGroupJsonMarshaller.getInstance().marshall(
                            securityGroupsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsEc2NetworkInterfaceDetails.getSourceDestCheck() != null) {
            Boolean sourceDestCheck = awsEc2NetworkInterfaceDetails.getSourceDestCheck();
            jsonWriter.name("SourceDestCheck");
            jsonWriter.value(sourceDestCheck);
        }
        jsonWriter.endObject();
    }

    private static AwsEc2NetworkInterfaceDetailsJsonMarshaller instance;

    public static AwsEc2NetworkInterfaceDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2NetworkInterfaceDetailsJsonMarshaller();
        return instance;
    }
}
