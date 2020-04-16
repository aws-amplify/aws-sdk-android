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
 * JSON marshaller for POJO ResourceDetails
 */
class ResourceDetailsJsonMarshaller {

    public void marshall(ResourceDetails resourceDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (resourceDetails.getAwsCodeBuildProject() != null) {
            AwsCodeBuildProjectDetails awsCodeBuildProject = resourceDetails
                    .getAwsCodeBuildProject();
            jsonWriter.name("AwsCodeBuildProject");
            AwsCodeBuildProjectDetailsJsonMarshaller.getInstance().marshall(awsCodeBuildProject,
                    jsonWriter);
        }
        if (resourceDetails.getAwsCloudFrontDistribution() != null) {
            AwsCloudFrontDistributionDetails awsCloudFrontDistribution = resourceDetails
                    .getAwsCloudFrontDistribution();
            jsonWriter.name("AwsCloudFrontDistribution");
            AwsCloudFrontDistributionDetailsJsonMarshaller.getInstance().marshall(
                    awsCloudFrontDistribution, jsonWriter);
        }
        if (resourceDetails.getAwsEc2Instance() != null) {
            AwsEc2InstanceDetails awsEc2Instance = resourceDetails.getAwsEc2Instance();
            jsonWriter.name("AwsEc2Instance");
            AwsEc2InstanceDetailsJsonMarshaller.getInstance().marshall(awsEc2Instance, jsonWriter);
        }
        if (resourceDetails.getAwsEc2NetworkInterface() != null) {
            AwsEc2NetworkInterfaceDetails awsEc2NetworkInterface = resourceDetails
                    .getAwsEc2NetworkInterface();
            jsonWriter.name("AwsEc2NetworkInterface");
            AwsEc2NetworkInterfaceDetailsJsonMarshaller.getInstance().marshall(
                    awsEc2NetworkInterface, jsonWriter);
        }
        if (resourceDetails.getAwsEc2SecurityGroup() != null) {
            AwsEc2SecurityGroupDetails awsEc2SecurityGroup = resourceDetails
                    .getAwsEc2SecurityGroup();
            jsonWriter.name("AwsEc2SecurityGroup");
            AwsEc2SecurityGroupDetailsJsonMarshaller.getInstance().marshall(awsEc2SecurityGroup,
                    jsonWriter);
        }
        if (resourceDetails.getAwsElbv2LoadBalancer() != null) {
            AwsElbv2LoadBalancerDetails awsElbv2LoadBalancer = resourceDetails
                    .getAwsElbv2LoadBalancer();
            jsonWriter.name("AwsElbv2LoadBalancer");
            AwsElbv2LoadBalancerDetailsJsonMarshaller.getInstance().marshall(awsElbv2LoadBalancer,
                    jsonWriter);
        }
        if (resourceDetails.getAwsElasticsearchDomain() != null) {
            AwsElasticsearchDomainDetails awsElasticsearchDomain = resourceDetails
                    .getAwsElasticsearchDomain();
            jsonWriter.name("AwsElasticsearchDomain");
            AwsElasticsearchDomainDetailsJsonMarshaller.getInstance().marshall(
                    awsElasticsearchDomain, jsonWriter);
        }
        if (resourceDetails.getAwsS3Bucket() != null) {
            AwsS3BucketDetails awsS3Bucket = resourceDetails.getAwsS3Bucket();
            jsonWriter.name("AwsS3Bucket");
            AwsS3BucketDetailsJsonMarshaller.getInstance().marshall(awsS3Bucket, jsonWriter);
        }
        if (resourceDetails.getAwsS3Object() != null) {
            AwsS3ObjectDetails awsS3Object = resourceDetails.getAwsS3Object();
            jsonWriter.name("AwsS3Object");
            AwsS3ObjectDetailsJsonMarshaller.getInstance().marshall(awsS3Object, jsonWriter);
        }
        if (resourceDetails.getAwsIamAccessKey() != null) {
            AwsIamAccessKeyDetails awsIamAccessKey = resourceDetails.getAwsIamAccessKey();
            jsonWriter.name("AwsIamAccessKey");
            AwsIamAccessKeyDetailsJsonMarshaller.getInstance()
                    .marshall(awsIamAccessKey, jsonWriter);
        }
        if (resourceDetails.getAwsIamRole() != null) {
            AwsIamRoleDetails awsIamRole = resourceDetails.getAwsIamRole();
            jsonWriter.name("AwsIamRole");
            AwsIamRoleDetailsJsonMarshaller.getInstance().marshall(awsIamRole, jsonWriter);
        }
        if (resourceDetails.getAwsKmsKey() != null) {
            AwsKmsKeyDetails awsKmsKey = resourceDetails.getAwsKmsKey();
            jsonWriter.name("AwsKmsKey");
            AwsKmsKeyDetailsJsonMarshaller.getInstance().marshall(awsKmsKey, jsonWriter);
        }
        if (resourceDetails.getAwsLambdaFunction() != null) {
            AwsLambdaFunctionDetails awsLambdaFunction = resourceDetails.getAwsLambdaFunction();
            jsonWriter.name("AwsLambdaFunction");
            AwsLambdaFunctionDetailsJsonMarshaller.getInstance().marshall(awsLambdaFunction,
                    jsonWriter);
        }
        if (resourceDetails.getAwsLambdaLayerVersion() != null) {
            AwsLambdaLayerVersionDetails awsLambdaLayerVersion = resourceDetails
                    .getAwsLambdaLayerVersion();
            jsonWriter.name("AwsLambdaLayerVersion");
            AwsLambdaLayerVersionDetailsJsonMarshaller.getInstance().marshall(
                    awsLambdaLayerVersion, jsonWriter);
        }
        if (resourceDetails.getAwsRdsDbInstance() != null) {
            AwsRdsDbInstanceDetails awsRdsDbInstance = resourceDetails.getAwsRdsDbInstance();
            jsonWriter.name("AwsRdsDbInstance");
            AwsRdsDbInstanceDetailsJsonMarshaller.getInstance().marshall(awsRdsDbInstance,
                    jsonWriter);
        }
        if (resourceDetails.getAwsSnsTopic() != null) {
            AwsSnsTopicDetails awsSnsTopic = resourceDetails.getAwsSnsTopic();
            jsonWriter.name("AwsSnsTopic");
            AwsSnsTopicDetailsJsonMarshaller.getInstance().marshall(awsSnsTopic, jsonWriter);
        }
        if (resourceDetails.getAwsSqsQueue() != null) {
            AwsSqsQueueDetails awsSqsQueue = resourceDetails.getAwsSqsQueue();
            jsonWriter.name("AwsSqsQueue");
            AwsSqsQueueDetailsJsonMarshaller.getInstance().marshall(awsSqsQueue, jsonWriter);
        }
        if (resourceDetails.getAwsWafWebAcl() != null) {
            AwsWafWebAclDetails awsWafWebAcl = resourceDetails.getAwsWafWebAcl();
            jsonWriter.name("AwsWafWebAcl");
            AwsWafWebAclDetailsJsonMarshaller.getInstance().marshall(awsWafWebAcl, jsonWriter);
        }
        if (resourceDetails.getContainer() != null) {
            ContainerDetails container = resourceDetails.getContainer();
            jsonWriter.name("Container");
            ContainerDetailsJsonMarshaller.getInstance().marshall(container, jsonWriter);
        }
        if (resourceDetails.getOther() != null) {
            java.util.Map<String, String> other = resourceDetails.getOther();
            jsonWriter.name("Other");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> otherEntry : other.entrySet()) {
                String otherValue = otherEntry.getValue();
                if (otherValue != null) {
                    jsonWriter.name(otherEntry.getKey());
                    jsonWriter.value(otherValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static ResourceDetailsJsonMarshaller instance;

    public static ResourceDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceDetailsJsonMarshaller();
        return instance;
    }
}
