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
 * JSON unmarshaller for POJO ResourceDetails
 */
class ResourceDetailsJsonUnmarshaller implements
        Unmarshaller<ResourceDetails, JsonUnmarshallerContext> {

    public ResourceDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ResourceDetails resourceDetails = new ResourceDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AwsCodeBuildProject")) {
                resourceDetails.setAwsCodeBuildProject(AwsCodeBuildProjectDetailsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AwsCloudFrontDistribution")) {
                resourceDetails
                        .setAwsCloudFrontDistribution(AwsCloudFrontDistributionDetailsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("AwsEc2Instance")) {
                resourceDetails.setAwsEc2Instance(AwsEc2InstanceDetailsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AwsEc2NetworkInterface")) {
                resourceDetails
                        .setAwsEc2NetworkInterface(AwsEc2NetworkInterfaceDetailsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("AwsEc2SecurityGroup")) {
                resourceDetails.setAwsEc2SecurityGroup(AwsEc2SecurityGroupDetailsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AwsElbv2LoadBalancer")) {
                resourceDetails.setAwsElbv2LoadBalancer(AwsElbv2LoadBalancerDetailsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AwsElasticsearchDomain")) {
                resourceDetails
                        .setAwsElasticsearchDomain(AwsElasticsearchDomainDetailsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("AwsS3Bucket")) {
                resourceDetails.setAwsS3Bucket(AwsS3BucketDetailsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AwsS3Object")) {
                resourceDetails.setAwsS3Object(AwsS3ObjectDetailsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AwsIamAccessKey")) {
                resourceDetails.setAwsIamAccessKey(AwsIamAccessKeyDetailsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AwsIamRole")) {
                resourceDetails.setAwsIamRole(AwsIamRoleDetailsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AwsKmsKey")) {
                resourceDetails.setAwsKmsKey(AwsKmsKeyDetailsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AwsLambdaFunction")) {
                resourceDetails.setAwsLambdaFunction(AwsLambdaFunctionDetailsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AwsLambdaLayerVersion")) {
                resourceDetails
                        .setAwsLambdaLayerVersion(AwsLambdaLayerVersionDetailsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("AwsRdsDbInstance")) {
                resourceDetails.setAwsRdsDbInstance(AwsRdsDbInstanceDetailsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AwsSnsTopic")) {
                resourceDetails.setAwsSnsTopic(AwsSnsTopicDetailsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AwsSqsQueue")) {
                resourceDetails.setAwsSqsQueue(AwsSqsQueueDetailsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AwsWafWebAcl")) {
                resourceDetails.setAwsWafWebAcl(AwsWafWebAclDetailsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Container")) {
                resourceDetails.setContainer(ContainerDetailsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Other")) {
                resourceDetails.setOther(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return resourceDetails;
    }

    private static ResourceDetailsJsonUnmarshaller instance;

    public static ResourceDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceDetailsJsonUnmarshaller();
        return instance;
    }
}
