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

package com.amazonaws.services.tagging;

import java.util.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.tagging.model.*;
import com.amazonaws.services.tagging.model.transform.*;

/**
 * Client for accessing AWS Resource Groups Tagging API. All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <fullname>Resource Groups Tagging API</fullname>
 * <p>
 * This guide describes the API operations for the resource groups tagging.
 * </p>
 * <p>
 * A tag is a label that you assign to an AWS resource. A tag consists of a key
 * and a value, both of which you define. For example, if you have two Amazon
 * EC2 instances, you might assign both a tag key of "Stack." But the value of
 * "Stack" might be "Testing" for one and "Production" for the other.
 * </p>
 * <p>
 * Tagging can help you organize your resources and enables you to simplify
 * resource management, access management and cost allocation.
 * </p>
 * <p>
 * You can use the resource groups tagging API operations to complete the
 * following tasks:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Tag and untag supported resources located in the specified Region for the AWS
 * account.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use tag-based filters to search for resources located in the specified Region
 * for the AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * List all existing tag keys in the specified Region for the AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * List all existing values for the specified key in the specified Region for
 * the AWS account.
 * </p>
 * </li>
 * </ul>
 * <p>
 * To use resource groups tagging API operations, you must add the following
 * permissions to your IAM policy:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>tag:GetResources</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>tag:TagResources</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>tag:UntagResources</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>tag:GetTagKeys</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>tag:GetTagValues</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * You'll also need permissions to access the resources of individual services
 * so that you can tag and untag those resources.
 * </p>
 * <p>
 * For more information on IAM policies, see <a href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_manage.html"
 * >Managing IAM Policies</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * You can use the Resource Groups Tagging API to tag resources for the
 * following AWS services.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Alexa for Business (a4b)
 * </p>
 * </li>
 * <li>
 * <p>
 * API Gateway
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon AppStream
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS AppSync
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS App Mesh
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Athena
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Aurora
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Backup
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Certificate Manager
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Certificate Manager Private CA
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Cloud Directory
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS CloudFormation
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon CloudFront
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS CloudHSM
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS CloudTrail
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon CloudWatch (alarms only)
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon CloudWatch Events
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon CloudWatch Logs
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS CodeBuild
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS CodeCommit
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS CodePipeline
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS CodeStar
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Cognito Identity
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Cognito User Pools
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Comprehend
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Config
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Data Exchange
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Data Pipeline
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Database Migration Service
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS DataSync
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Device Farm
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Direct Connect
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Directory Service
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon DynamoDB
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon EBS
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon EC2
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon ECR
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon ECS
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon EKS
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Elastic Beanstalk
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Elastic File System
 * </p>
 * </li>
 * <li>
 * <p>
 * Elastic Load Balancing
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon ElastiCache
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Elasticsearch Service
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Elemental MediaLive
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Elemental MediaPackage
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Elemental MediaTailor
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon EMR
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon FSx
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon S3 Glacier
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Glue
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon GuardDuty
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Inspector
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS IoT Analytics
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS IoT Core
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS IoT Device Defender
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS IoT Device Management
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS IoT Events
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS IoT Greengrass
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS IoT 1-Click
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS IoT Things Graph
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Key Management Service
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Kinesis
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Kinesis Data Analytics
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Kinesis Data Firehose
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Lambda
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS License Manager
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Machine Learning
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon MQ
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon MSK
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Neptune
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS OpsWorks
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Organizations
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Quantum Ledger Database (QLDB)
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon RDS
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Redshift
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Resource Access Manager
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Resource Groups
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS RoboMaker
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Route 53
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Route 53 Resolver
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon S3 (buckets only)
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon SageMaker
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Secrets Manager
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Security Hub
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Service Catalog
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Simple Email Service (SES)
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Simple Notification Service (SNS)
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Simple Queue Service (SQS)
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Simple Workflow Service
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Step Functions
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Storage Gateway
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Systems Manager
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Transfer for SFTP
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS WAF Regional
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon VPC
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon WorkSpaces
 * </p>
 * </li>
 * </ul>
 */
public class AWSResourceGroupsTaggingAPIClient extends AmazonWebServiceClient implements
        AWSResourceGroupsTaggingAPI {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Resource Groups Tagging API
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AWSResourceGroupsTaggingAPI. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSResourceGroupsTaggingAPIClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSResourceGroupsTaggingAPI. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSResourceGroupsTaggingAPI (ex:
     *            proxy settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSResourceGroupsTaggingAPIClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSResourceGroupsTaggingAPI using the specified AWS account credentials.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor. Static AWSCredentials can be passed for
     * quick testing. However, it is strongly recommended to use Amazon Cognito
     * vended temporary credentials for use in production. This can be achieved
     * by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSResourceGroupsTaggingAPIClient client = new AWSResourceGroupsTaggingAPIClient(
     *                 AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     */
    public AWSResourceGroupsTaggingAPIClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSResourceGroupsTaggingAPI using the specified AWS account credentials
     * and client configuration options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor. Static AWSCredentials can be passed for
     * quick testing. However, it is strongly recommended to use Amazon Cognito
     * vended temporary credentials for use in production. This can be achieved
     * by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSResourceGroupsTaggingAPIClient client = new AWSResourceGroupsTaggingAPIClient(
     *                 AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSResourceGroupsTaggingAPI (ex:
     *            proxy settings, retry counts, etc.).
     */
    public AWSResourceGroupsTaggingAPIClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSResourceGroupsTaggingAPI using the specified AWS account credentials
     * provider.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSResourceGroupsTaggingAPIClient client = new AWSResourceGroupsTaggingAPIClient(
     *                 AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     */
    public AWSResourceGroupsTaggingAPIClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSResourceGroupsTaggingAPI using the specified AWS account credentials
     * provider and client configuration options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSResourceGroupsTaggingAPIClient client = new AWSResourceGroupsTaggingAPIClient(
     *                 AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSResourceGroupsTaggingAPI (ex:
     *            proxy settings, retry counts, etc.).
     */
    public AWSResourceGroupsTaggingAPIClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSResourceGroupsTaggingAPI using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSResourceGroupsTaggingAPI (ex:
     *            proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSResourceGroupsTaggingAPIClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSResourceGroupsTaggingAPI using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AWSResourceGroupsTaggingAPIClient client = new AWSResourceGroupsTaggingAPIClient(
     *                 AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSResourceGroupsTaggingAPI (ex:
     *            proxy settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSResourceGroupsTaggingAPIClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new ConcurrentModificationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConstraintViolationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServiceExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PaginationTokenExpiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ThrottledExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("tagging.us-east-1.amazonaws.com");
        this.endpointPrefix = "tagging";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/tagging/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/tagging/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Describes the status of the <code>StartReportCreation</code> operation.
     * </p>
     * <p>
     * You can call this operation only from the organization's master account
     * and from the us-east-1 Region.
     * </p>
     * 
     * @param describeReportCreationRequest
     * @return describeReportCreationResult The response from the
     *         DescribeReportCreation service method, as returned by AWS
     *         Resource Groups Tagging API.
     * @throws ConstraintViolationException
     * @throws InternalServiceException
     * @throws InvalidParameterException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Groups Tagging API indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeReportCreationResult describeReportCreation(
            DescribeReportCreationRequest describeReportCreationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeReportCreationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReportCreationRequest> request = null;
        Response<DescribeReportCreationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReportCreationRequestMarshaller()
                        .marshall(describeReportCreationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeReportCreationResult, JsonUnmarshallerContext> unmarshaller = new DescribeReportCreationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeReportCreationResult> responseHandler = new JsonResponseHandler<DescribeReportCreationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a table that shows counts of resources that are noncompliant with
     * their tag policies.
     * </p>
     * <p>
     * For more information on tag policies, see <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     * >Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * You can call this operation only from the organization's master account
     * and from the us-east-1 Region.
     * </p>
     * 
     * @param getComplianceSummaryRequest
     * @return getComplianceSummaryResult The response from the
     *         GetComplianceSummary service method, as returned by AWS Resource
     *         Groups Tagging API.
     * @throws ConstraintViolationException
     * @throws InternalServiceException
     * @throws InvalidParameterException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Groups Tagging API indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetComplianceSummaryResult getComplianceSummary(
            GetComplianceSummaryRequest getComplianceSummaryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getComplianceSummaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetComplianceSummaryRequest> request = null;
        Response<GetComplianceSummaryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetComplianceSummaryRequestMarshaller()
                        .marshall(getComplianceSummaryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetComplianceSummaryResult, JsonUnmarshallerContext> unmarshaller = new GetComplianceSummaryResultJsonUnmarshaller();
            JsonResponseHandler<GetComplianceSummaryResult> responseHandler = new JsonResponseHandler<GetComplianceSummaryResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns all the tagged or previously tagged resources that are located in
     * the specified Region for the AWS account.
     * </p>
     * <p>
     * Depending on what information you want returned, you can also specify the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Filters</i> that specify what tags and resource types you want
     * returned. The response includes all tags that are associated with the
     * requested resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * Information about compliance with the account's effective tag policy. For
     * more information on tag policies, see <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     * >Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You can check the <code>PaginationToken</code> response parameter to
     * determine if a query is complete. Queries occasionally return fewer
     * results on a page than allowed. The <code>PaginationToken</code> response
     * parameter value is <code>null</code> <i>only</i> when there are no more
     * results to display.
     * </p>
     * </note>
     * 
     * @param getResourcesRequest
     * @return getResourcesResult The response from the GetResources service
     *         method, as returned by AWS Resource Groups Tagging API.
     * @throws InvalidParameterException
     * @throws ThrottledException
     * @throws InternalServiceException
     * @throws PaginationTokenExpiredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Groups Tagging API indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetResourcesResult getResources(GetResourcesRequest getResourcesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourcesRequest> request = null;
        Response<GetResourcesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourcesRequestMarshaller().marshall(getResourcesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetResourcesResult, JsonUnmarshallerContext> unmarshaller = new GetResourcesResultJsonUnmarshaller();
            JsonResponseHandler<GetResourcesResult> responseHandler = new JsonResponseHandler<GetResourcesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns all tag keys in the specified Region for the AWS account.
     * </p>
     * 
     * @param getTagKeysRequest
     * @return getTagKeysResult The response from the GetTagKeys service method,
     *         as returned by AWS Resource Groups Tagging API.
     * @throws InvalidParameterException
     * @throws ThrottledException
     * @throws InternalServiceException
     * @throws PaginationTokenExpiredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Groups Tagging API indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetTagKeysResult getTagKeys(GetTagKeysRequest getTagKeysRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getTagKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTagKeysRequest> request = null;
        Response<GetTagKeysResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTagKeysRequestMarshaller().marshall(getTagKeysRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetTagKeysResult, JsonUnmarshallerContext> unmarshaller = new GetTagKeysResultJsonUnmarshaller();
            JsonResponseHandler<GetTagKeysResult> responseHandler = new JsonResponseHandler<GetTagKeysResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns all tag values for the specified key in the specified Region for
     * the AWS account.
     * </p>
     * 
     * @param getTagValuesRequest
     * @return getTagValuesResult The response from the GetTagValues service
     *         method, as returned by AWS Resource Groups Tagging API.
     * @throws InvalidParameterException
     * @throws ThrottledException
     * @throws InternalServiceException
     * @throws PaginationTokenExpiredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Groups Tagging API indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetTagValuesResult getTagValues(GetTagValuesRequest getTagValuesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getTagValuesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTagValuesRequest> request = null;
        Response<GetTagValuesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTagValuesRequestMarshaller().marshall(getTagValuesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetTagValuesResult, JsonUnmarshallerContext> unmarshaller = new GetTagValuesResultJsonUnmarshaller();
            JsonResponseHandler<GetTagValuesResult> responseHandler = new JsonResponseHandler<GetTagValuesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Generates a report that lists all tagged resources in accounts across
     * your organization and tells whether each resource is compliant with the
     * effective tag policy. Compliance data is refreshed daily.
     * </p>
     * <p>
     * The generated report is saved to the following location:
     * </p>
     * <p>
     * <code>s3://example-bucket/AwsTagPolicies/o-exampleorgid/YYYY-MM-ddTHH:mm:ssZ/report.csv</code>
     * </p>
     * <p>
     * You can call this operation only from the organization's master account
     * and from the us-east-1 Region.
     * </p>
     * 
     * @param startReportCreationRequest
     * @return startReportCreationResult The response from the
     *         StartReportCreation service method, as returned by AWS Resource
     *         Groups Tagging API.
     * @throws ConcurrentModificationException
     * @throws ConstraintViolationException
     * @throws InternalServiceException
     * @throws InvalidParameterException
     * @throws ThrottledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Groups Tagging API indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public StartReportCreationResult startReportCreation(
            StartReportCreationRequest startReportCreationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startReportCreationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartReportCreationRequest> request = null;
        Response<StartReportCreationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartReportCreationRequestMarshaller()
                        .marshall(startReportCreationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartReportCreationResult, JsonUnmarshallerContext> unmarshaller = new StartReportCreationResultJsonUnmarshaller();
            JsonResponseHandler<StartReportCreationResult> responseHandler = new JsonResponseHandler<StartReportCreationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Applies one or more tags to the specified resources. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Not all resources can have tags. For a list of services that support
     * tagging, see <a href=
     * "http://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/Welcome.html"
     * >this list</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource can have up to 50 tags. For other limits, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws_tagging.html#tag-conventions"
     * >Tag Naming and Usage Conventions</a> in the <i>AWS General
     * Reference.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only tag resources that are located in the specified Region for
     * the AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * To add tags to a resource, you need the necessary permissions for the
     * service that the resource belongs to as well as permissions for adding
     * tags. For more information, see <a href=
     * "http://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/Welcome.html"
     * >this list</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tagResourcesRequest
     * @return tagResourcesResult The response from the TagResources service
     *         method, as returned by AWS Resource Groups Tagging API.
     * @throws InvalidParameterException
     * @throws ThrottledException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Groups Tagging API indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public TagResourcesResult tagResources(TagResourcesRequest tagResourcesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(tagResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourcesRequest> request = null;
        Response<TagResourcesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourcesRequestMarshaller().marshall(tagResourcesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<TagResourcesResult, JsonUnmarshallerContext> unmarshaller = new TagResourcesResultJsonUnmarshaller();
            JsonResponseHandler<TagResourcesResult> responseHandler = new JsonResponseHandler<TagResourcesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Removes the specified tags from the specified resources. When you specify
     * a tag key, the action removes both that key and its associated value. The
     * operation succeeds even if you attempt to remove tags from a resource
     * that were already removed. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To remove tags from a resource, you need the necessary permissions for
     * the service that the resource belongs to as well as permissions for
     * removing tags. For more information, see <a href=
     * "http://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/Welcome.html"
     * >this list</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only tag resources that are located in the specified Region for
     * the AWS account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param untagResourcesRequest
     * @return untagResourcesResult The response from the UntagResources service
     *         method, as returned by AWS Resource Groups Tagging API.
     * @throws InvalidParameterException
     * @throws ThrottledException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Resource Groups Tagging API indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public UntagResourcesResult untagResources(UntagResourcesRequest untagResourcesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(untagResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourcesRequest> request = null;
        Response<UntagResourcesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourcesRequestMarshaller().marshall(untagResourcesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UntagResourcesResult, JsonUnmarshallerContext> unmarshaller = new UntagResourcesResultJsonUnmarshaller();
            JsonResponseHandler<UntagResourcesResult> responseHandler = new JsonResponseHandler<UntagResourcesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request The originally executed request
     * @return The response metadata for the specified request, or null if none
     *         is available.
     * @deprecated ResponseMetadata cache can hold up to 50 requests and
     *             responses in memory and will cause memory issue. This method
     *             now always returns null.
     */
    @Deprecated
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(
                jsonErrorUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
