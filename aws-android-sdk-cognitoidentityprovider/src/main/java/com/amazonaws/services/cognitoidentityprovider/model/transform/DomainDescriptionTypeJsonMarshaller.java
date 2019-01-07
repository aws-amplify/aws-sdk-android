/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DomainDescriptionType
 */
class DomainDescriptionTypeJsonMarshaller {

    public void marshall(DomainDescriptionType domainDescriptionType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (domainDescriptionType.getUserPoolId() != null) {
            String userPoolId = domainDescriptionType.getUserPoolId();
            jsonWriter.name("UserPoolId");
            jsonWriter.value(userPoolId);
        }
        if (domainDescriptionType.getAWSAccountId() != null) {
            String aWSAccountId = domainDescriptionType.getAWSAccountId();
            jsonWriter.name("AWSAccountId");
            jsonWriter.value(aWSAccountId);
        }
        if (domainDescriptionType.getDomain() != null) {
            String domain = domainDescriptionType.getDomain();
            jsonWriter.name("Domain");
            jsonWriter.value(domain);
        }
        if (domainDescriptionType.getS3Bucket() != null) {
            String s3Bucket = domainDescriptionType.getS3Bucket();
            jsonWriter.name("S3Bucket");
            jsonWriter.value(s3Bucket);
        }
        if (domainDescriptionType.getCloudFrontDistribution() != null) {
            String cloudFrontDistribution = domainDescriptionType.getCloudFrontDistribution();
            jsonWriter.name("CloudFrontDistribution");
            jsonWriter.value(cloudFrontDistribution);
        }
        if (domainDescriptionType.getVersion() != null) {
            String version = domainDescriptionType.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        if (domainDescriptionType.getStatus() != null) {
            String status = domainDescriptionType.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (domainDescriptionType.getCustomDomainConfig() != null) {
            CustomDomainConfigType customDomainConfig = domainDescriptionType
                    .getCustomDomainConfig();
            jsonWriter.name("CustomDomainConfig");
            CustomDomainConfigTypeJsonMarshaller.getInstance().marshall(customDomainConfig,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DomainDescriptionTypeJsonMarshaller instance;

    public static DomainDescriptionTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DomainDescriptionTypeJsonMarshaller();
        return instance;
    }
}
