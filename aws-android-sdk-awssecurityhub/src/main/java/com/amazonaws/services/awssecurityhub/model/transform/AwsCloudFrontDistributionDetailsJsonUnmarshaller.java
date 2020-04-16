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
 * JSON unmarshaller for POJO AwsCloudFrontDistributionDetails
 */
class AwsCloudFrontDistributionDetailsJsonUnmarshaller implements
        Unmarshaller<AwsCloudFrontDistributionDetails, JsonUnmarshallerContext> {

    public AwsCloudFrontDistributionDetails unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AwsCloudFrontDistributionDetails awsCloudFrontDistributionDetails = new AwsCloudFrontDistributionDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DomainName")) {
                awsCloudFrontDistributionDetails.setDomainName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ETag")) {
                awsCloudFrontDistributionDetails.setETag(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                awsCloudFrontDistributionDetails.setLastModifiedTime(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Logging")) {
                awsCloudFrontDistributionDetails
                        .setLogging(AwsCloudFrontDistributionLoggingJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Origins")) {
                awsCloudFrontDistributionDetails
                        .setOrigins(AwsCloudFrontDistributionOriginsJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Status")) {
                awsCloudFrontDistributionDetails.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WebAclId")) {
                awsCloudFrontDistributionDetails.setWebAclId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return awsCloudFrontDistributionDetails;
    }

    private static AwsCloudFrontDistributionDetailsJsonUnmarshaller instance;

    public static AwsCloudFrontDistributionDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsCloudFrontDistributionDetailsJsonUnmarshaller();
        return instance;
    }
}
