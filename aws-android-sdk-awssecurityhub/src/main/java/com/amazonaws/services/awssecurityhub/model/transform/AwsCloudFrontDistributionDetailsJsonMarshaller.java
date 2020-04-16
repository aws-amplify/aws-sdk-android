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
 * JSON marshaller for POJO AwsCloudFrontDistributionDetails
 */
class AwsCloudFrontDistributionDetailsJsonMarshaller {

    public void marshall(AwsCloudFrontDistributionDetails awsCloudFrontDistributionDetails,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsCloudFrontDistributionDetails.getDomainName() != null) {
            String domainName = awsCloudFrontDistributionDetails.getDomainName();
            jsonWriter.name("DomainName");
            jsonWriter.value(domainName);
        }
        if (awsCloudFrontDistributionDetails.getETag() != null) {
            String eTag = awsCloudFrontDistributionDetails.getETag();
            jsonWriter.name("ETag");
            jsonWriter.value(eTag);
        }
        if (awsCloudFrontDistributionDetails.getLastModifiedTime() != null) {
            String lastModifiedTime = awsCloudFrontDistributionDetails.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (awsCloudFrontDistributionDetails.getLogging() != null) {
            AwsCloudFrontDistributionLogging logging = awsCloudFrontDistributionDetails
                    .getLogging();
            jsonWriter.name("Logging");
            AwsCloudFrontDistributionLoggingJsonMarshaller.getInstance().marshall(logging,
                    jsonWriter);
        }
        if (awsCloudFrontDistributionDetails.getOrigins() != null) {
            AwsCloudFrontDistributionOrigins origins = awsCloudFrontDistributionDetails
                    .getOrigins();
            jsonWriter.name("Origins");
            AwsCloudFrontDistributionOriginsJsonMarshaller.getInstance().marshall(origins,
                    jsonWriter);
        }
        if (awsCloudFrontDistributionDetails.getStatus() != null) {
            String status = awsCloudFrontDistributionDetails.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (awsCloudFrontDistributionDetails.getWebAclId() != null) {
            String webAclId = awsCloudFrontDistributionDetails.getWebAclId();
            jsonWriter.name("WebAclId");
            jsonWriter.value(webAclId);
        }
        jsonWriter.endObject();
    }

    private static AwsCloudFrontDistributionDetailsJsonMarshaller instance;

    public static AwsCloudFrontDistributionDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsCloudFrontDistributionDetailsJsonMarshaller();
        return instance;
    }
}
