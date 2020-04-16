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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * Additional details about a resource related to a finding.
 * </p>
 * <p>
 * To provide the details, use the object that corresponds to the resource type.
 * For example, if the resource type is <code>AwsEc2Instance</code>, then you
 * use the <code>AwsEc2Instance</code> object to provide the details.
 * </p>
 * <p>
 * If the type-specific object does not contain all of the fields you want to
 * populate, then you use the <code>Other</code> object to populate those
 * additional fields.
 * </p>
 * <p>
 * You also use the <code>Other</code> object to populate the details when the
 * selected type does not have a corresponding object.
 * </p>
 */
public class ResourceDetails implements Serializable {
    /**
     * <p>
     * Details for an AWS CodeBuild project.
     * </p>
     */
    private AwsCodeBuildProjectDetails awsCodeBuildProject;

    /**
     * <p>
     * Details about a CloudFront distribution.
     * </p>
     */
    private AwsCloudFrontDistributionDetails awsCloudFrontDistribution;

    /**
     * <p>
     * Details about an Amazon EC2 instance related to a finding.
     * </p>
     */
    private AwsEc2InstanceDetails awsEc2Instance;

    /**
     * <p>
     * Details for an AWS EC2 network interface.
     * </p>
     */
    private AwsEc2NetworkInterfaceDetails awsEc2NetworkInterface;

    /**
     * <p>
     * Details for an EC2 security group.
     * </p>
     */
    private AwsEc2SecurityGroupDetails awsEc2SecurityGroup;

    /**
     * <p>
     * Details about a load balancer.
     * </p>
     */
    private AwsElbv2LoadBalancerDetails awsElbv2LoadBalancer;

    /**
     * <p>
     * Details for an Elasticsearch domain.
     * </p>
     */
    private AwsElasticsearchDomainDetails awsElasticsearchDomain;

    /**
     * <p>
     * Details about an Amazon S3 Bucket related to a finding.
     * </p>
     */
    private AwsS3BucketDetails awsS3Bucket;

    /**
     * <p>
     * Details about an Amazon S3 object related to a finding.
     * </p>
     */
    private AwsS3ObjectDetails awsS3Object;

    /**
     * <p>
     * Details about an IAM access key related to a finding.
     * </p>
     */
    private AwsIamAccessKeyDetails awsIamAccessKey;

    /**
     * <p>
     * Details about an IAM role.
     * </p>
     */
    private AwsIamRoleDetails awsIamRole;

    /**
     * <p>
     * Details about a KMS key.
     * </p>
     */
    private AwsKmsKeyDetails awsKmsKey;

    /**
     * <p>
     * Details about a Lambda function.
     * </p>
     */
    private AwsLambdaFunctionDetails awsLambdaFunction;

    /**
     * <p>
     * Details for a Lambda layer version.
     * </p>
     */
    private AwsLambdaLayerVersionDetails awsLambdaLayerVersion;

    /**
     * <p>
     * Details for an RDS database instance.
     * </p>
     */
    private AwsRdsDbInstanceDetails awsRdsDbInstance;

    /**
     * <p>
     * Details about an SNS topic.
     * </p>
     */
    private AwsSnsTopicDetails awsSnsTopic;

    /**
     * <p>
     * Details about an SQS queue.
     * </p>
     */
    private AwsSqsQueueDetails awsSqsQueue;

    /**
     * <p>
     * Details for a WAF WebACL.
     * </p>
     */
    private AwsWafWebAclDetails awsWafWebAcl;

    /**
     * <p>
     * Details about a container resource related to a finding.
     * </p>
     */
    private ContainerDetails container;

    /**
     * <p>
     * Details about a resource that are not available in a type-specific
     * details object. Use the <code>Other</code> object in the following cases.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The type-specific object does not contain all of the fields that you want
     * to populate. In this case, first use the type-specific object to populate
     * those fields. Use the <code>Other</code> object to populate the fields
     * that are missing from the type-specific object.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type does not have a corresponding object. This includes
     * resources for which the type is <code>Other</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> other;

    /**
     * <p>
     * Details for an AWS CodeBuild project.
     * </p>
     *
     * @return <p>
     *         Details for an AWS CodeBuild project.
     *         </p>
     */
    public AwsCodeBuildProjectDetails getAwsCodeBuildProject() {
        return awsCodeBuildProject;
    }

    /**
     * <p>
     * Details for an AWS CodeBuild project.
     * </p>
     *
     * @param awsCodeBuildProject <p>
     *            Details for an AWS CodeBuild project.
     *            </p>
     */
    public void setAwsCodeBuildProject(AwsCodeBuildProjectDetails awsCodeBuildProject) {
        this.awsCodeBuildProject = awsCodeBuildProject;
    }

    /**
     * <p>
     * Details for an AWS CodeBuild project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsCodeBuildProject <p>
     *            Details for an AWS CodeBuild project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDetails withAwsCodeBuildProject(AwsCodeBuildProjectDetails awsCodeBuildProject) {
        this.awsCodeBuildProject = awsCodeBuildProject;
        return this;
    }

    /**
     * <p>
     * Details about a CloudFront distribution.
     * </p>
     *
     * @return <p>
     *         Details about a CloudFront distribution.
     *         </p>
     */
    public AwsCloudFrontDistributionDetails getAwsCloudFrontDistribution() {
        return awsCloudFrontDistribution;
    }

    /**
     * <p>
     * Details about a CloudFront distribution.
     * </p>
     *
     * @param awsCloudFrontDistribution <p>
     *            Details about a CloudFront distribution.
     *            </p>
     */
    public void setAwsCloudFrontDistribution(
            AwsCloudFrontDistributionDetails awsCloudFrontDistribution) {
        this.awsCloudFrontDistribution = awsCloudFrontDistribution;
    }

    /**
     * <p>
     * Details about a CloudFront distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsCloudFrontDistribution <p>
     *            Details about a CloudFront distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDetails withAwsCloudFrontDistribution(
            AwsCloudFrontDistributionDetails awsCloudFrontDistribution) {
        this.awsCloudFrontDistribution = awsCloudFrontDistribution;
        return this;
    }

    /**
     * <p>
     * Details about an Amazon EC2 instance related to a finding.
     * </p>
     *
     * @return <p>
     *         Details about an Amazon EC2 instance related to a finding.
     *         </p>
     */
    public AwsEc2InstanceDetails getAwsEc2Instance() {
        return awsEc2Instance;
    }

    /**
     * <p>
     * Details about an Amazon EC2 instance related to a finding.
     * </p>
     *
     * @param awsEc2Instance <p>
     *            Details about an Amazon EC2 instance related to a finding.
     *            </p>
     */
    public void setAwsEc2Instance(AwsEc2InstanceDetails awsEc2Instance) {
        this.awsEc2Instance = awsEc2Instance;
    }

    /**
     * <p>
     * Details about an Amazon EC2 instance related to a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsEc2Instance <p>
     *            Details about an Amazon EC2 instance related to a finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDetails withAwsEc2Instance(AwsEc2InstanceDetails awsEc2Instance) {
        this.awsEc2Instance = awsEc2Instance;
        return this;
    }

    /**
     * <p>
     * Details for an AWS EC2 network interface.
     * </p>
     *
     * @return <p>
     *         Details for an AWS EC2 network interface.
     *         </p>
     */
    public AwsEc2NetworkInterfaceDetails getAwsEc2NetworkInterface() {
        return awsEc2NetworkInterface;
    }

    /**
     * <p>
     * Details for an AWS EC2 network interface.
     * </p>
     *
     * @param awsEc2NetworkInterface <p>
     *            Details for an AWS EC2 network interface.
     *            </p>
     */
    public void setAwsEc2NetworkInterface(AwsEc2NetworkInterfaceDetails awsEc2NetworkInterface) {
        this.awsEc2NetworkInterface = awsEc2NetworkInterface;
    }

    /**
     * <p>
     * Details for an AWS EC2 network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsEc2NetworkInterface <p>
     *            Details for an AWS EC2 network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDetails withAwsEc2NetworkInterface(
            AwsEc2NetworkInterfaceDetails awsEc2NetworkInterface) {
        this.awsEc2NetworkInterface = awsEc2NetworkInterface;
        return this;
    }

    /**
     * <p>
     * Details for an EC2 security group.
     * </p>
     *
     * @return <p>
     *         Details for an EC2 security group.
     *         </p>
     */
    public AwsEc2SecurityGroupDetails getAwsEc2SecurityGroup() {
        return awsEc2SecurityGroup;
    }

    /**
     * <p>
     * Details for an EC2 security group.
     * </p>
     *
     * @param awsEc2SecurityGroup <p>
     *            Details for an EC2 security group.
     *            </p>
     */
    public void setAwsEc2SecurityGroup(AwsEc2SecurityGroupDetails awsEc2SecurityGroup) {
        this.awsEc2SecurityGroup = awsEc2SecurityGroup;
    }

    /**
     * <p>
     * Details for an EC2 security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsEc2SecurityGroup <p>
     *            Details for an EC2 security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDetails withAwsEc2SecurityGroup(AwsEc2SecurityGroupDetails awsEc2SecurityGroup) {
        this.awsEc2SecurityGroup = awsEc2SecurityGroup;
        return this;
    }

    /**
     * <p>
     * Details about a load balancer.
     * </p>
     *
     * @return <p>
     *         Details about a load balancer.
     *         </p>
     */
    public AwsElbv2LoadBalancerDetails getAwsElbv2LoadBalancer() {
        return awsElbv2LoadBalancer;
    }

    /**
     * <p>
     * Details about a load balancer.
     * </p>
     *
     * @param awsElbv2LoadBalancer <p>
     *            Details about a load balancer.
     *            </p>
     */
    public void setAwsElbv2LoadBalancer(AwsElbv2LoadBalancerDetails awsElbv2LoadBalancer) {
        this.awsElbv2LoadBalancer = awsElbv2LoadBalancer;
    }

    /**
     * <p>
     * Details about a load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsElbv2LoadBalancer <p>
     *            Details about a load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDetails withAwsElbv2LoadBalancer(AwsElbv2LoadBalancerDetails awsElbv2LoadBalancer) {
        this.awsElbv2LoadBalancer = awsElbv2LoadBalancer;
        return this;
    }

    /**
     * <p>
     * Details for an Elasticsearch domain.
     * </p>
     *
     * @return <p>
     *         Details for an Elasticsearch domain.
     *         </p>
     */
    public AwsElasticsearchDomainDetails getAwsElasticsearchDomain() {
        return awsElasticsearchDomain;
    }

    /**
     * <p>
     * Details for an Elasticsearch domain.
     * </p>
     *
     * @param awsElasticsearchDomain <p>
     *            Details for an Elasticsearch domain.
     *            </p>
     */
    public void setAwsElasticsearchDomain(AwsElasticsearchDomainDetails awsElasticsearchDomain) {
        this.awsElasticsearchDomain = awsElasticsearchDomain;
    }

    /**
     * <p>
     * Details for an Elasticsearch domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsElasticsearchDomain <p>
     *            Details for an Elasticsearch domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDetails withAwsElasticsearchDomain(
            AwsElasticsearchDomainDetails awsElasticsearchDomain) {
        this.awsElasticsearchDomain = awsElasticsearchDomain;
        return this;
    }

    /**
     * <p>
     * Details about an Amazon S3 Bucket related to a finding.
     * </p>
     *
     * @return <p>
     *         Details about an Amazon S3 Bucket related to a finding.
     *         </p>
     */
    public AwsS3BucketDetails getAwsS3Bucket() {
        return awsS3Bucket;
    }

    /**
     * <p>
     * Details about an Amazon S3 Bucket related to a finding.
     * </p>
     *
     * @param awsS3Bucket <p>
     *            Details about an Amazon S3 Bucket related to a finding.
     *            </p>
     */
    public void setAwsS3Bucket(AwsS3BucketDetails awsS3Bucket) {
        this.awsS3Bucket = awsS3Bucket;
    }

    /**
     * <p>
     * Details about an Amazon S3 Bucket related to a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsS3Bucket <p>
     *            Details about an Amazon S3 Bucket related to a finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDetails withAwsS3Bucket(AwsS3BucketDetails awsS3Bucket) {
        this.awsS3Bucket = awsS3Bucket;
        return this;
    }

    /**
     * <p>
     * Details about an Amazon S3 object related to a finding.
     * </p>
     *
     * @return <p>
     *         Details about an Amazon S3 object related to a finding.
     *         </p>
     */
    public AwsS3ObjectDetails getAwsS3Object() {
        return awsS3Object;
    }

    /**
     * <p>
     * Details about an Amazon S3 object related to a finding.
     * </p>
     *
     * @param awsS3Object <p>
     *            Details about an Amazon S3 object related to a finding.
     *            </p>
     */
    public void setAwsS3Object(AwsS3ObjectDetails awsS3Object) {
        this.awsS3Object = awsS3Object;
    }

    /**
     * <p>
     * Details about an Amazon S3 object related to a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsS3Object <p>
     *            Details about an Amazon S3 object related to a finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDetails withAwsS3Object(AwsS3ObjectDetails awsS3Object) {
        this.awsS3Object = awsS3Object;
        return this;
    }

    /**
     * <p>
     * Details about an IAM access key related to a finding.
     * </p>
     *
     * @return <p>
     *         Details about an IAM access key related to a finding.
     *         </p>
     */
    public AwsIamAccessKeyDetails getAwsIamAccessKey() {
        return awsIamAccessKey;
    }

    /**
     * <p>
     * Details about an IAM access key related to a finding.
     * </p>
     *
     * @param awsIamAccessKey <p>
     *            Details about an IAM access key related to a finding.
     *            </p>
     */
    public void setAwsIamAccessKey(AwsIamAccessKeyDetails awsIamAccessKey) {
        this.awsIamAccessKey = awsIamAccessKey;
    }

    /**
     * <p>
     * Details about an IAM access key related to a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsIamAccessKey <p>
     *            Details about an IAM access key related to a finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDetails withAwsIamAccessKey(AwsIamAccessKeyDetails awsIamAccessKey) {
        this.awsIamAccessKey = awsIamAccessKey;
        return this;
    }

    /**
     * <p>
     * Details about an IAM role.
     * </p>
     *
     * @return <p>
     *         Details about an IAM role.
     *         </p>
     */
    public AwsIamRoleDetails getAwsIamRole() {
        return awsIamRole;
    }

    /**
     * <p>
     * Details about an IAM role.
     * </p>
     *
     * @param awsIamRole <p>
     *            Details about an IAM role.
     *            </p>
     */
    public void setAwsIamRole(AwsIamRoleDetails awsIamRole) {
        this.awsIamRole = awsIamRole;
    }

    /**
     * <p>
     * Details about an IAM role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsIamRole <p>
     *            Details about an IAM role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDetails withAwsIamRole(AwsIamRoleDetails awsIamRole) {
        this.awsIamRole = awsIamRole;
        return this;
    }

    /**
     * <p>
     * Details about a KMS key.
     * </p>
     *
     * @return <p>
     *         Details about a KMS key.
     *         </p>
     */
    public AwsKmsKeyDetails getAwsKmsKey() {
        return awsKmsKey;
    }

    /**
     * <p>
     * Details about a KMS key.
     * </p>
     *
     * @param awsKmsKey <p>
     *            Details about a KMS key.
     *            </p>
     */
    public void setAwsKmsKey(AwsKmsKeyDetails awsKmsKey) {
        this.awsKmsKey = awsKmsKey;
    }

    /**
     * <p>
     * Details about a KMS key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsKmsKey <p>
     *            Details about a KMS key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDetails withAwsKmsKey(AwsKmsKeyDetails awsKmsKey) {
        this.awsKmsKey = awsKmsKey;
        return this;
    }

    /**
     * <p>
     * Details about a Lambda function.
     * </p>
     *
     * @return <p>
     *         Details about a Lambda function.
     *         </p>
     */
    public AwsLambdaFunctionDetails getAwsLambdaFunction() {
        return awsLambdaFunction;
    }

    /**
     * <p>
     * Details about a Lambda function.
     * </p>
     *
     * @param awsLambdaFunction <p>
     *            Details about a Lambda function.
     *            </p>
     */
    public void setAwsLambdaFunction(AwsLambdaFunctionDetails awsLambdaFunction) {
        this.awsLambdaFunction = awsLambdaFunction;
    }

    /**
     * <p>
     * Details about a Lambda function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsLambdaFunction <p>
     *            Details about a Lambda function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDetails withAwsLambdaFunction(AwsLambdaFunctionDetails awsLambdaFunction) {
        this.awsLambdaFunction = awsLambdaFunction;
        return this;
    }

    /**
     * <p>
     * Details for a Lambda layer version.
     * </p>
     *
     * @return <p>
     *         Details for a Lambda layer version.
     *         </p>
     */
    public AwsLambdaLayerVersionDetails getAwsLambdaLayerVersion() {
        return awsLambdaLayerVersion;
    }

    /**
     * <p>
     * Details for a Lambda layer version.
     * </p>
     *
     * @param awsLambdaLayerVersion <p>
     *            Details for a Lambda layer version.
     *            </p>
     */
    public void setAwsLambdaLayerVersion(AwsLambdaLayerVersionDetails awsLambdaLayerVersion) {
        this.awsLambdaLayerVersion = awsLambdaLayerVersion;
    }

    /**
     * <p>
     * Details for a Lambda layer version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsLambdaLayerVersion <p>
     *            Details for a Lambda layer version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDetails withAwsLambdaLayerVersion(
            AwsLambdaLayerVersionDetails awsLambdaLayerVersion) {
        this.awsLambdaLayerVersion = awsLambdaLayerVersion;
        return this;
    }

    /**
     * <p>
     * Details for an RDS database instance.
     * </p>
     *
     * @return <p>
     *         Details for an RDS database instance.
     *         </p>
     */
    public AwsRdsDbInstanceDetails getAwsRdsDbInstance() {
        return awsRdsDbInstance;
    }

    /**
     * <p>
     * Details for an RDS database instance.
     * </p>
     *
     * @param awsRdsDbInstance <p>
     *            Details for an RDS database instance.
     *            </p>
     */
    public void setAwsRdsDbInstance(AwsRdsDbInstanceDetails awsRdsDbInstance) {
        this.awsRdsDbInstance = awsRdsDbInstance;
    }

    /**
     * <p>
     * Details for an RDS database instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsRdsDbInstance <p>
     *            Details for an RDS database instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDetails withAwsRdsDbInstance(AwsRdsDbInstanceDetails awsRdsDbInstance) {
        this.awsRdsDbInstance = awsRdsDbInstance;
        return this;
    }

    /**
     * <p>
     * Details about an SNS topic.
     * </p>
     *
     * @return <p>
     *         Details about an SNS topic.
     *         </p>
     */
    public AwsSnsTopicDetails getAwsSnsTopic() {
        return awsSnsTopic;
    }

    /**
     * <p>
     * Details about an SNS topic.
     * </p>
     *
     * @param awsSnsTopic <p>
     *            Details about an SNS topic.
     *            </p>
     */
    public void setAwsSnsTopic(AwsSnsTopicDetails awsSnsTopic) {
        this.awsSnsTopic = awsSnsTopic;
    }

    /**
     * <p>
     * Details about an SNS topic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsSnsTopic <p>
     *            Details about an SNS topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDetails withAwsSnsTopic(AwsSnsTopicDetails awsSnsTopic) {
        this.awsSnsTopic = awsSnsTopic;
        return this;
    }

    /**
     * <p>
     * Details about an SQS queue.
     * </p>
     *
     * @return <p>
     *         Details about an SQS queue.
     *         </p>
     */
    public AwsSqsQueueDetails getAwsSqsQueue() {
        return awsSqsQueue;
    }

    /**
     * <p>
     * Details about an SQS queue.
     * </p>
     *
     * @param awsSqsQueue <p>
     *            Details about an SQS queue.
     *            </p>
     */
    public void setAwsSqsQueue(AwsSqsQueueDetails awsSqsQueue) {
        this.awsSqsQueue = awsSqsQueue;
    }

    /**
     * <p>
     * Details about an SQS queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsSqsQueue <p>
     *            Details about an SQS queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDetails withAwsSqsQueue(AwsSqsQueueDetails awsSqsQueue) {
        this.awsSqsQueue = awsSqsQueue;
        return this;
    }

    /**
     * <p>
     * Details for a WAF WebACL.
     * </p>
     *
     * @return <p>
     *         Details for a WAF WebACL.
     *         </p>
     */
    public AwsWafWebAclDetails getAwsWafWebAcl() {
        return awsWafWebAcl;
    }

    /**
     * <p>
     * Details for a WAF WebACL.
     * </p>
     *
     * @param awsWafWebAcl <p>
     *            Details for a WAF WebACL.
     *            </p>
     */
    public void setAwsWafWebAcl(AwsWafWebAclDetails awsWafWebAcl) {
        this.awsWafWebAcl = awsWafWebAcl;
    }

    /**
     * <p>
     * Details for a WAF WebACL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsWafWebAcl <p>
     *            Details for a WAF WebACL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDetails withAwsWafWebAcl(AwsWafWebAclDetails awsWafWebAcl) {
        this.awsWafWebAcl = awsWafWebAcl;
        return this;
    }

    /**
     * <p>
     * Details about a container resource related to a finding.
     * </p>
     *
     * @return <p>
     *         Details about a container resource related to a finding.
     *         </p>
     */
    public ContainerDetails getContainer() {
        return container;
    }

    /**
     * <p>
     * Details about a container resource related to a finding.
     * </p>
     *
     * @param container <p>
     *            Details about a container resource related to a finding.
     *            </p>
     */
    public void setContainer(ContainerDetails container) {
        this.container = container;
    }

    /**
     * <p>
     * Details about a container resource related to a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param container <p>
     *            Details about a container resource related to a finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDetails withContainer(ContainerDetails container) {
        this.container = container;
        return this;
    }

    /**
     * <p>
     * Details about a resource that are not available in a type-specific
     * details object. Use the <code>Other</code> object in the following cases.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The type-specific object does not contain all of the fields that you want
     * to populate. In this case, first use the type-specific object to populate
     * those fields. Use the <code>Other</code> object to populate the fields
     * that are missing from the type-specific object.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type does not have a corresponding object. This includes
     * resources for which the type is <code>Other</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Details about a resource that are not available in a
     *         type-specific details object. Use the <code>Other</code> object
     *         in the following cases.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The type-specific object does not contain all of the fields that
     *         you want to populate. In this case, first use the type-specific
     *         object to populate those fields. Use the <code>Other</code>
     *         object to populate the fields that are missing from the
     *         type-specific object.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The resource type does not have a corresponding object. This
     *         includes resources for which the type is <code>Other</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.Map<String, String> getOther() {
        return other;
    }

    /**
     * <p>
     * Details about a resource that are not available in a type-specific
     * details object. Use the <code>Other</code> object in the following cases.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The type-specific object does not contain all of the fields that you want
     * to populate. In this case, first use the type-specific object to populate
     * those fields. Use the <code>Other</code> object to populate the fields
     * that are missing from the type-specific object.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type does not have a corresponding object. This includes
     * resources for which the type is <code>Other</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @param other <p>
     *            Details about a resource that are not available in a
     *            type-specific details object. Use the <code>Other</code>
     *            object in the following cases.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The type-specific object does not contain all of the fields
     *            that you want to populate. In this case, first use the
     *            type-specific object to populate those fields. Use the
     *            <code>Other</code> object to populate the fields that are
     *            missing from the type-specific object.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The resource type does not have a corresponding object. This
     *            includes resources for which the type is <code>Other</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setOther(java.util.Map<String, String> other) {
        this.other = other;
    }

    /**
     * <p>
     * Details about a resource that are not available in a type-specific
     * details object. Use the <code>Other</code> object in the following cases.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The type-specific object does not contain all of the fields that you want
     * to populate. In this case, first use the type-specific object to populate
     * those fields. Use the <code>Other</code> object to populate the fields
     * that are missing from the type-specific object.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type does not have a corresponding object. This includes
     * resources for which the type is <code>Other</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param other <p>
     *            Details about a resource that are not available in a
     *            type-specific details object. Use the <code>Other</code>
     *            object in the following cases.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The type-specific object does not contain all of the fields
     *            that you want to populate. In this case, first use the
     *            type-specific object to populate those fields. Use the
     *            <code>Other</code> object to populate the fields that are
     *            missing from the type-specific object.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The resource type does not have a corresponding object. This
     *            includes resources for which the type is <code>Other</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDetails withOther(java.util.Map<String, String> other) {
        this.other = other;
        return this;
    }

    /**
     * <p>
     * Details about a resource that are not available in a type-specific
     * details object. Use the <code>Other</code> object in the following cases.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The type-specific object does not contain all of the fields that you want
     * to populate. In this case, first use the type-specific object to populate
     * those fields. Use the <code>Other</code> object to populate the fields
     * that are missing from the type-specific object.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type does not have a corresponding object. This includes
     * resources for which the type is <code>Other</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The method adds a new key-value pair into Other parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Other.
     * @param value The corresponding value of the entry to be added into Other.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDetails addOtherEntry(String key, String value) {
        if (null == this.other) {
            this.other = new java.util.HashMap<String, String>();
        }
        if (this.other.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.other.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Other.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ResourceDetails clearOtherEntries() {
        this.other = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAwsCodeBuildProject() != null)
            sb.append("AwsCodeBuildProject: " + getAwsCodeBuildProject() + ",");
        if (getAwsCloudFrontDistribution() != null)
            sb.append("AwsCloudFrontDistribution: " + getAwsCloudFrontDistribution() + ",");
        if (getAwsEc2Instance() != null)
            sb.append("AwsEc2Instance: " + getAwsEc2Instance() + ",");
        if (getAwsEc2NetworkInterface() != null)
            sb.append("AwsEc2NetworkInterface: " + getAwsEc2NetworkInterface() + ",");
        if (getAwsEc2SecurityGroup() != null)
            sb.append("AwsEc2SecurityGroup: " + getAwsEc2SecurityGroup() + ",");
        if (getAwsElbv2LoadBalancer() != null)
            sb.append("AwsElbv2LoadBalancer: " + getAwsElbv2LoadBalancer() + ",");
        if (getAwsElasticsearchDomain() != null)
            sb.append("AwsElasticsearchDomain: " + getAwsElasticsearchDomain() + ",");
        if (getAwsS3Bucket() != null)
            sb.append("AwsS3Bucket: " + getAwsS3Bucket() + ",");
        if (getAwsS3Object() != null)
            sb.append("AwsS3Object: " + getAwsS3Object() + ",");
        if (getAwsIamAccessKey() != null)
            sb.append("AwsIamAccessKey: " + getAwsIamAccessKey() + ",");
        if (getAwsIamRole() != null)
            sb.append("AwsIamRole: " + getAwsIamRole() + ",");
        if (getAwsKmsKey() != null)
            sb.append("AwsKmsKey: " + getAwsKmsKey() + ",");
        if (getAwsLambdaFunction() != null)
            sb.append("AwsLambdaFunction: " + getAwsLambdaFunction() + ",");
        if (getAwsLambdaLayerVersion() != null)
            sb.append("AwsLambdaLayerVersion: " + getAwsLambdaLayerVersion() + ",");
        if (getAwsRdsDbInstance() != null)
            sb.append("AwsRdsDbInstance: " + getAwsRdsDbInstance() + ",");
        if (getAwsSnsTopic() != null)
            sb.append("AwsSnsTopic: " + getAwsSnsTopic() + ",");
        if (getAwsSqsQueue() != null)
            sb.append("AwsSqsQueue: " + getAwsSqsQueue() + ",");
        if (getAwsWafWebAcl() != null)
            sb.append("AwsWafWebAcl: " + getAwsWafWebAcl() + ",");
        if (getContainer() != null)
            sb.append("Container: " + getContainer() + ",");
        if (getOther() != null)
            sb.append("Other: " + getOther());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAwsCodeBuildProject() == null) ? 0 : getAwsCodeBuildProject().hashCode());
        hashCode = prime
                * hashCode
                + ((getAwsCloudFrontDistribution() == null) ? 0 : getAwsCloudFrontDistribution()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAwsEc2Instance() == null) ? 0 : getAwsEc2Instance().hashCode());
        hashCode = prime
                * hashCode
                + ((getAwsEc2NetworkInterface() == null) ? 0 : getAwsEc2NetworkInterface()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAwsEc2SecurityGroup() == null) ? 0 : getAwsEc2SecurityGroup().hashCode());
        hashCode = prime * hashCode
                + ((getAwsElbv2LoadBalancer() == null) ? 0 : getAwsElbv2LoadBalancer().hashCode());
        hashCode = prime
                * hashCode
                + ((getAwsElasticsearchDomain() == null) ? 0 : getAwsElasticsearchDomain()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAwsS3Bucket() == null) ? 0 : getAwsS3Bucket().hashCode());
        hashCode = prime * hashCode
                + ((getAwsS3Object() == null) ? 0 : getAwsS3Object().hashCode());
        hashCode = prime * hashCode
                + ((getAwsIamAccessKey() == null) ? 0 : getAwsIamAccessKey().hashCode());
        hashCode = prime * hashCode + ((getAwsIamRole() == null) ? 0 : getAwsIamRole().hashCode());
        hashCode = prime * hashCode + ((getAwsKmsKey() == null) ? 0 : getAwsKmsKey().hashCode());
        hashCode = prime * hashCode
                + ((getAwsLambdaFunction() == null) ? 0 : getAwsLambdaFunction().hashCode());
        hashCode = prime
                * hashCode
                + ((getAwsLambdaLayerVersion() == null) ? 0 : getAwsLambdaLayerVersion().hashCode());
        hashCode = prime * hashCode
                + ((getAwsRdsDbInstance() == null) ? 0 : getAwsRdsDbInstance().hashCode());
        hashCode = prime * hashCode
                + ((getAwsSnsTopic() == null) ? 0 : getAwsSnsTopic().hashCode());
        hashCode = prime * hashCode
                + ((getAwsSqsQueue() == null) ? 0 : getAwsSqsQueue().hashCode());
        hashCode = prime * hashCode
                + ((getAwsWafWebAcl() == null) ? 0 : getAwsWafWebAcl().hashCode());
        hashCode = prime * hashCode + ((getContainer() == null) ? 0 : getContainer().hashCode());
        hashCode = prime * hashCode + ((getOther() == null) ? 0 : getOther().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDetails == false)
            return false;
        ResourceDetails other = (ResourceDetails) obj;

        if (other.getAwsCodeBuildProject() == null ^ this.getAwsCodeBuildProject() == null)
            return false;
        if (other.getAwsCodeBuildProject() != null
                && other.getAwsCodeBuildProject().equals(this.getAwsCodeBuildProject()) == false)
            return false;
        if (other.getAwsCloudFrontDistribution() == null
                ^ this.getAwsCloudFrontDistribution() == null)
            return false;
        if (other.getAwsCloudFrontDistribution() != null
                && other.getAwsCloudFrontDistribution().equals(this.getAwsCloudFrontDistribution()) == false)
            return false;
        if (other.getAwsEc2Instance() == null ^ this.getAwsEc2Instance() == null)
            return false;
        if (other.getAwsEc2Instance() != null
                && other.getAwsEc2Instance().equals(this.getAwsEc2Instance()) == false)
            return false;
        if (other.getAwsEc2NetworkInterface() == null ^ this.getAwsEc2NetworkInterface() == null)
            return false;
        if (other.getAwsEc2NetworkInterface() != null
                && other.getAwsEc2NetworkInterface().equals(this.getAwsEc2NetworkInterface()) == false)
            return false;
        if (other.getAwsEc2SecurityGroup() == null ^ this.getAwsEc2SecurityGroup() == null)
            return false;
        if (other.getAwsEc2SecurityGroup() != null
                && other.getAwsEc2SecurityGroup().equals(this.getAwsEc2SecurityGroup()) == false)
            return false;
        if (other.getAwsElbv2LoadBalancer() == null ^ this.getAwsElbv2LoadBalancer() == null)
            return false;
        if (other.getAwsElbv2LoadBalancer() != null
                && other.getAwsElbv2LoadBalancer().equals(this.getAwsElbv2LoadBalancer()) == false)
            return false;
        if (other.getAwsElasticsearchDomain() == null ^ this.getAwsElasticsearchDomain() == null)
            return false;
        if (other.getAwsElasticsearchDomain() != null
                && other.getAwsElasticsearchDomain().equals(this.getAwsElasticsearchDomain()) == false)
            return false;
        if (other.getAwsS3Bucket() == null ^ this.getAwsS3Bucket() == null)
            return false;
        if (other.getAwsS3Bucket() != null
                && other.getAwsS3Bucket().equals(this.getAwsS3Bucket()) == false)
            return false;
        if (other.getAwsS3Object() == null ^ this.getAwsS3Object() == null)
            return false;
        if (other.getAwsS3Object() != null
                && other.getAwsS3Object().equals(this.getAwsS3Object()) == false)
            return false;
        if (other.getAwsIamAccessKey() == null ^ this.getAwsIamAccessKey() == null)
            return false;
        if (other.getAwsIamAccessKey() != null
                && other.getAwsIamAccessKey().equals(this.getAwsIamAccessKey()) == false)
            return false;
        if (other.getAwsIamRole() == null ^ this.getAwsIamRole() == null)
            return false;
        if (other.getAwsIamRole() != null
                && other.getAwsIamRole().equals(this.getAwsIamRole()) == false)
            return false;
        if (other.getAwsKmsKey() == null ^ this.getAwsKmsKey() == null)
            return false;
        if (other.getAwsKmsKey() != null
                && other.getAwsKmsKey().equals(this.getAwsKmsKey()) == false)
            return false;
        if (other.getAwsLambdaFunction() == null ^ this.getAwsLambdaFunction() == null)
            return false;
        if (other.getAwsLambdaFunction() != null
                && other.getAwsLambdaFunction().equals(this.getAwsLambdaFunction()) == false)
            return false;
        if (other.getAwsLambdaLayerVersion() == null ^ this.getAwsLambdaLayerVersion() == null)
            return false;
        if (other.getAwsLambdaLayerVersion() != null
                && other.getAwsLambdaLayerVersion().equals(this.getAwsLambdaLayerVersion()) == false)
            return false;
        if (other.getAwsRdsDbInstance() == null ^ this.getAwsRdsDbInstance() == null)
            return false;
        if (other.getAwsRdsDbInstance() != null
                && other.getAwsRdsDbInstance().equals(this.getAwsRdsDbInstance()) == false)
            return false;
        if (other.getAwsSnsTopic() == null ^ this.getAwsSnsTopic() == null)
            return false;
        if (other.getAwsSnsTopic() != null
                && other.getAwsSnsTopic().equals(this.getAwsSnsTopic()) == false)
            return false;
        if (other.getAwsSqsQueue() == null ^ this.getAwsSqsQueue() == null)
            return false;
        if (other.getAwsSqsQueue() != null
                && other.getAwsSqsQueue().equals(this.getAwsSqsQueue()) == false)
            return false;
        if (other.getAwsWafWebAcl() == null ^ this.getAwsWafWebAcl() == null)
            return false;
        if (other.getAwsWafWebAcl() != null
                && other.getAwsWafWebAcl().equals(this.getAwsWafWebAcl()) == false)
            return false;
        if (other.getContainer() == null ^ this.getContainer() == null)
            return false;
        if (other.getContainer() != null
                && other.getContainer().equals(this.getContainer()) == false)
            return false;
        if (other.getOther() == null ^ this.getOther() == null)
            return false;
        if (other.getOther() != null && other.getOther().equals(this.getOther()) == false)
            return false;
        return true;
    }
}
