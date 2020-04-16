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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AwsEc2NetworkInterfaceDetails
 */
class AwsEc2NetworkInterfaceDetailsJsonUnmarshaller implements
        Unmarshaller<AwsEc2NetworkInterfaceDetails, JsonUnmarshallerContext> {

    public AwsEc2NetworkInterfaceDetails unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AwsEc2NetworkInterfaceDetails awsEc2NetworkInterfaceDetails = new AwsEc2NetworkInterfaceDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Attachment")) {
                awsEc2NetworkInterfaceDetails
                        .setAttachment(AwsEc2NetworkInterfaceAttachmentJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("NetworkInterfaceId")) {
                awsEc2NetworkInterfaceDetails.setNetworkInterfaceId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecurityGroups")) {
                awsEc2NetworkInterfaceDetails
                        .setSecurityGroups(new ListUnmarshaller<AwsEc2NetworkInterfaceSecurityGroup>(
                                AwsEc2NetworkInterfaceSecurityGroupJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SourceDestCheck")) {
                awsEc2NetworkInterfaceDetails.setSourceDestCheck(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return awsEc2NetworkInterfaceDetails;
    }

    private static AwsEc2NetworkInterfaceDetailsJsonUnmarshaller instance;

    public static AwsEc2NetworkInterfaceDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2NetworkInterfaceDetailsJsonUnmarshaller();
        return instance;
    }
}
