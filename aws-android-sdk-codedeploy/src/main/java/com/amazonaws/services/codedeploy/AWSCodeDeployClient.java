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

package com.amazonaws.services.codedeploy;

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

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.services.codedeploy.model.transform.*;

/**
 * Client for accessing AWS CodeDeploy. All service calls made using this client
 * are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS CodeDeploy</fullname>
 * <p>
 * AWS CodeDeploy is a deployment service that automates application deployments
 * to Amazon EC2 instances, on-premises instances running in your own facility,
 * serverless AWS Lambda functions, or applications in an Amazon ECS service.
 * </p>
 * <p>
 * You can deploy a nearly unlimited variety of application content, such as an
 * updated Lambda function, updated applications in an Amazon ECS service, code,
 * web and configuration files, executables, packages, scripts, multimedia
 * files, and so on. AWS CodeDeploy can deploy application content stored in
 * Amazon S3 buckets, GitHub repositories, or Bitbucket repositories. You do not
 * need to make changes to your existing code before you can use AWS CodeDeploy.
 * </p>
 * <p>
 * AWS CodeDeploy makes it easier for you to rapidly release new features, helps
 * you avoid downtime during application deployment, and handles the complexity
 * of updating your applications, without many of the risks associated with
 * error-prone manual deployments.
 * </p>
 * <p>
 * <b>AWS CodeDeploy Components</b>
 * </p>
 * <p>
 * Use the information in this guide to help you work with the following AWS
 * CodeDeploy components:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Application</b>: A name that uniquely identifies the application you want
 * to deploy. AWS CodeDeploy uses this name, which functions as a container, to
 * ensure the correct combination of revision, deployment configuration, and
 * deployment group are referenced during a deployment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deployment group</b>: A set of individual instances, CodeDeploy Lambda
 * deployment configuration settings, or an Amazon ECS service and network
 * details. A Lambda deployment group specifies how to route traffic to a new
 * version of a Lambda function. An Amazon ECS deployment group specifies the
 * service created in Amazon ECS to deploy, a load balancer, and a listener to
 * reroute production traffic to an updated containerized application. An
 * EC2/On-premises deployment group contains individually tagged instances,
 * Amazon EC2 instances in Amazon EC2 Auto Scaling groups, or both. All
 * deployment groups can specify optional trigger, alarm, and rollback settings.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deployment configuration</b>: A set of deployment rules and deployment
 * success and failure conditions used by AWS CodeDeploy during a deployment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deployment</b>: The process and the components used when updating a Lambda
 * function, a containerized application in an Amazon ECS service, or of
 * installing content on one or more instances.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Application revisions</b>: For an AWS Lambda deployment, this is an
 * AppSpec file that specifies the Lambda function to be updated and one or more
 * functions to validate deployment lifecycle events. For an Amazon ECS
 * deployment, this is an AppSpec file that specifies the Amazon ECS task
 * definition, container, and port where production traffic is rerouted. For an
 * EC2/On-premises deployment, this is an archive file that contains source
 * content—source code, webpages, executable files, and deployment scripts—along
 * with an AppSpec file. Revisions are stored in Amazon S3 buckets or GitHub
 * repositories. For Amazon S3, a revision is uniquely identified by its Amazon
 * S3 object key and its ETag, version, or both. For GitHub, a revision is
 * uniquely identified by its commit ID.
 * </p>
 * </li>
 * </ul>
 * <p>
 * This guide also contains information to help you get details about the
 * instances in your deployments, to make on-premises instances available for
 * AWS CodeDeploy deployments, to get details about a Lambda function
 * deployment, and to get details about Amazon ECS service deployments.
 * </p>
 * <p>
 * <b>AWS CodeDeploy Information Resources</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/codedeploy/latest/userguide">AWS
 * CodeDeploy User Guide</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/codedeploy/latest/APIReference/">AWS
 * CodeDeploy API Reference Guide</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cli/latest/reference/deploy/index.html">
 * AWS CLI Reference for AWS CodeDeploy</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://forums.aws.amazon.com/forum.jspa?forumID=179">AWS CodeDeploy
 * Developer Forum</a>
 * </p>
 * </li>
 * </ul>
 */
public class AWSCodeDeployClient extends AmazonWebServiceClient implements AWSCodeDeploy {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS CodeDeploy exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AWSCodeDeploy. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
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
    public AWSCodeDeployClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSCodeDeploy. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
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
     *            how this client connects to AWSCodeDeploy (ex: proxy settings,
     *            retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSCodeDeployClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSCodeDeploy using
     * the specified AWS account credentials.
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
     *         AWSCodeDeployClient client = new AWSCodeDeployClient(AWSMobileClient.getInstance());
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
    public AWSCodeDeployClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSCodeDeploy using
     * the specified AWS account credentials and client configuration options.
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
     *         AWSCodeDeployClient client = new AWSCodeDeployClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSCodeDeploy (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AWSCodeDeployClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSCodeDeploy using
     * the specified AWS account credentials provider.
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
     *         AWSCodeDeployClient client = new AWSCodeDeployClient(AWSMobileClient.getInstance());
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
    public AWSCodeDeployClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSCodeDeploy using
     * the specified AWS account credentials provider and client configuration
     * options.
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
     *         AWSCodeDeployClient client = new AWSCodeDeployClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSCodeDeploy (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AWSCodeDeployClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSCodeDeploy using
     * the specified AWS account credentials provider, client configuration
     * options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSCodeDeploy (ex: proxy settings,
     *            retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSCodeDeployClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSCodeDeploy using
     * the specified AWS account credentials provider, client configuration
     * options and request metric collector.
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
     *         AWSCodeDeployClient client = new AWSCodeDeployClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSCodeDeploy (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSCodeDeployClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AlarmsLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ApplicationAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ApplicationDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ApplicationLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ApplicationNameRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ArnNotSupportedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new BatchLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new BucketNameFilterRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentAlreadyCompletedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentConfigAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentConfigDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentConfigInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentConfigLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentConfigNameRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentGroupAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentGroupDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentGroupLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentGroupNameRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentIdRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentIsNotInReadyStateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentNotStartedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentTargetDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentTargetIdRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeploymentTargetListSizeExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DescriptionTooLongExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ECSServiceMappingLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new GitHubAccountTokenDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new GitHubAccountTokenNameRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new IamArnRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new IamSessionArnAlreadyRegisteredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new IamUserArnAlreadyRegisteredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new IamUserArnRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InstanceDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InstanceIdRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InstanceLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InstanceNameAlreadyRegisteredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InstanceNameRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InstanceNotRegisteredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidAlarmConfigExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidApplicationNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidArnExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidAutoRollbackConfigExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidAutoScalingGroupExceptionUnmarshaller());
        jsonErrorUnmarshallers
                .add(new InvalidBlueGreenDeploymentConfigurationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidBucketNameFilterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidComputePlatformExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDeployedStateFilterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDeploymentConfigNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDeploymentGroupNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDeploymentIdExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDeploymentInstanceTypeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDeploymentStatusExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDeploymentStyleExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDeploymentTargetIdExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDeploymentWaitTypeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidEC2TagCombinationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidEC2TagExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidECSServiceExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidExternalIdExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidFileExistsBehaviorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidGitHubAccountTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidGitHubAccountTokenNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidIamSessionArnExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidIamUserArnExceptionUnmarshaller());
        jsonErrorUnmarshallers
                .add(new InvalidIgnoreApplicationStopFailuresValueExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidInputExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidInstanceNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidInstanceStatusExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidInstanceTypeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidKeyPrefixFilterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidLifecycleEventHookExecutionIdExceptionUnmarshaller());
        jsonErrorUnmarshallers
                .add(new InvalidLifecycleEventHookExecutionStatusExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidLoadBalancerInfoExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidMinimumHealthyHostValueExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidNextTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidOnPremisesTagCombinationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidOperationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRegistrationStatusExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRevisionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRoleExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidSortByExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidSortOrderExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidTagExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidTagFilterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidTagsToAddExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidTargetFilterNameExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidTargetGroupPairExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidTargetInstancesExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidTimeRangeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidTrafficRoutingConfigurationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidTriggerConfigExceptionUnmarshaller());
        jsonErrorUnmarshallers
                .add(new InvalidUpdateOutdatedInstancesOnlyValueExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LifecycleEventAlreadyCompletedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LifecycleHookLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MultipleIamArnsProvidedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new OperationNotSupportedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceArnRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceValidationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RevisionDoesNotExistExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RevisionRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RoleRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TagLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TagRequiredExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TagSetListLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ThrottlingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TriggerTargetsLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedActionForDeploymentTypeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("codedeploy.us-east-1.amazonaws.com");
        this.endpointPrefix = "codedeploy";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/codedeploy/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/codedeploy/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Adds tags to on-premises instances.
     * </p>
     * 
     * @param addTagsToOnPremisesInstancesRequest <p>
     *            Represents the input of, and adds tags to, an on-premises
     *            instance operation.
     *            </p>
     * @throws InstanceNameRequiredException
     * @throws InvalidInstanceNameException
     * @throws TagRequiredException
     * @throws InvalidTagException
     * @throws TagLimitExceededException
     * @throws InstanceLimitExceededException
     * @throws InstanceNotRegisteredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void addTagsToOnPremisesInstances(
            AddTagsToOnPremisesInstancesRequest addTagsToOnPremisesInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(addTagsToOnPremisesInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsToOnPremisesInstancesRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsToOnPremisesInstancesRequestMarshaller()
                        .marshall(addTagsToOnPremisesInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about one or more application revisions. The maximum
     * number of application revisions that can be returned is 25.
     * </p>
     * 
     * @param batchGetApplicationRevisionsRequest <p>
     *            Represents the input of a
     *            <code>BatchGetApplicationRevisions</code> operation.
     *            </p>
     * @return batchGetApplicationRevisionsResult The response from the
     *         BatchGetApplicationRevisions service method, as returned by AWS
     *         CodeDeploy.
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws RevisionRequiredException
     * @throws InvalidRevisionException
     * @throws BatchLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchGetApplicationRevisionsResult batchGetApplicationRevisions(
            BatchGetApplicationRevisionsRequest batchGetApplicationRevisionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchGetApplicationRevisionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetApplicationRevisionsRequest> request = null;
        Response<BatchGetApplicationRevisionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetApplicationRevisionsRequestMarshaller()
                        .marshall(batchGetApplicationRevisionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetApplicationRevisionsResult, JsonUnmarshallerContext> unmarshaller = new BatchGetApplicationRevisionsResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetApplicationRevisionsResult> responseHandler = new JsonResponseHandler<BatchGetApplicationRevisionsResult>(
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
     * Gets information about one or more applications. The maximum number of
     * applications that can be returned is 100.
     * </p>
     * 
     * @param batchGetApplicationsRequest <p>
     *            Represents the input of a <code>BatchGetApplications</code>
     *            operation.
     *            </p>
     * @return batchGetApplicationsResult The response from the
     *         BatchGetApplications service method, as returned by AWS
     *         CodeDeploy.
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws ApplicationDoesNotExistException
     * @throws BatchLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchGetApplicationsResult batchGetApplications(
            BatchGetApplicationsRequest batchGetApplicationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchGetApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetApplicationsRequest> request = null;
        Response<BatchGetApplicationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetApplicationsRequestMarshaller()
                        .marshall(batchGetApplicationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetApplicationsResult, JsonUnmarshallerContext> unmarshaller = new BatchGetApplicationsResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetApplicationsResult> responseHandler = new JsonResponseHandler<BatchGetApplicationsResult>(
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
     * Gets information about one or more deployment groups.
     * </p>
     * 
     * @param batchGetDeploymentGroupsRequest <p>
     *            Represents the input of a
     *            <code>BatchGetDeploymentGroups</code> operation.
     *            </p>
     * @return batchGetDeploymentGroupsResult The response from the
     *         BatchGetDeploymentGroups service method, as returned by AWS
     *         CodeDeploy.
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws ApplicationDoesNotExistException
     * @throws DeploymentGroupNameRequiredException
     * @throws InvalidDeploymentGroupNameException
     * @throws BatchLimitExceededException
     * @throws DeploymentConfigDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchGetDeploymentGroupsResult batchGetDeploymentGroups(
            BatchGetDeploymentGroupsRequest batchGetDeploymentGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchGetDeploymentGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetDeploymentGroupsRequest> request = null;
        Response<BatchGetDeploymentGroupsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetDeploymentGroupsRequestMarshaller()
                        .marshall(batchGetDeploymentGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetDeploymentGroupsResult, JsonUnmarshallerContext> unmarshaller = new BatchGetDeploymentGroupsResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetDeploymentGroupsResult> responseHandler = new JsonResponseHandler<BatchGetDeploymentGroupsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * This method works, but is deprecated. Use
     * <code>BatchGetDeploymentTargets</code> instead.
     * </p>
     * </note>
     * <p>
     * Returns an array of one or more instances associated with a deployment.
     * This method works with EC2/On-premises and AWS Lambda compute platforms.
     * The newer <code>BatchGetDeploymentTargets</code> works with all compute
     * platforms. The maximum number of instances that can be returned is 25.
     * </p>
     * 
     * @param batchGetDeploymentInstancesRequest <p>
     *            Represents the input of a
     *            <code>BatchGetDeploymentInstances</code> operation.
     *            </p>
     * @return batchGetDeploymentInstancesResult The response from the
     *         BatchGetDeploymentInstances service method, as returned by AWS
     *         CodeDeploy.
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     * @throws InstanceIdRequiredException
     * @throws InvalidDeploymentIdException
     * @throws InvalidInstanceNameException
     * @throws BatchLimitExceededException
     * @throws InvalidComputePlatformException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    @Deprecated
    public BatchGetDeploymentInstancesResult batchGetDeploymentInstances(
            BatchGetDeploymentInstancesRequest batchGetDeploymentInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchGetDeploymentInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetDeploymentInstancesRequest> request = null;
        Response<BatchGetDeploymentInstancesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetDeploymentInstancesRequestMarshaller()
                        .marshall(batchGetDeploymentInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetDeploymentInstancesResult, JsonUnmarshallerContext> unmarshaller = new BatchGetDeploymentInstancesResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetDeploymentInstancesResult> responseHandler = new JsonResponseHandler<BatchGetDeploymentInstancesResult>(
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
     * Returns an array of one or more targets associated with a deployment.
     * This method works with all compute types and should be used instead of
     * the deprecated <code>BatchGetDeploymentInstances</code>. The maximum
     * number of targets that can be returned is 25.
     * </p>
     * <p>
     * The type of targets returned depends on the deployment's compute platform
     * or deployment method:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>EC2/On-premises</b>: Information about EC2 instance targets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS Lambda</b>: Information about Lambda functions targets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon ECS</b>: Information about Amazon ECS service targets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CloudFormation</b>: Information about targets of blue/green
     * deployments initiated by a CloudFormation stack update.
     * </p>
     * </li>
     * </ul>
     * 
     * @param batchGetDeploymentTargetsRequest
     * @return batchGetDeploymentTargetsResult The response from the
     *         BatchGetDeploymentTargets service method, as returned by AWS
     *         CodeDeploy.
     * @throws InvalidDeploymentIdException
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     * @throws DeploymentNotStartedException
     * @throws DeploymentTargetIdRequiredException
     * @throws InvalidDeploymentTargetIdException
     * @throws DeploymentTargetDoesNotExistException
     * @throws DeploymentTargetListSizeExceededException
     * @throws InstanceDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchGetDeploymentTargetsResult batchGetDeploymentTargets(
            BatchGetDeploymentTargetsRequest batchGetDeploymentTargetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchGetDeploymentTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetDeploymentTargetsRequest> request = null;
        Response<BatchGetDeploymentTargetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetDeploymentTargetsRequestMarshaller()
                        .marshall(batchGetDeploymentTargetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetDeploymentTargetsResult, JsonUnmarshallerContext> unmarshaller = new BatchGetDeploymentTargetsResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetDeploymentTargetsResult> responseHandler = new JsonResponseHandler<BatchGetDeploymentTargetsResult>(
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
     * Gets information about one or more deployments. The maximum number of
     * deployments that can be returned is 25.
     * </p>
     * 
     * @param batchGetDeploymentsRequest <p>
     *            Represents the input of a <code>BatchGetDeployments</code>
     *            operation.
     *            </p>
     * @return batchGetDeploymentsResult The response from the
     *         BatchGetDeployments service method, as returned by AWS
     *         CodeDeploy.
     * @throws DeploymentIdRequiredException
     * @throws InvalidDeploymentIdException
     * @throws BatchLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchGetDeploymentsResult batchGetDeployments(
            BatchGetDeploymentsRequest batchGetDeploymentsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchGetDeploymentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetDeploymentsRequest> request = null;
        Response<BatchGetDeploymentsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetDeploymentsRequestMarshaller()
                        .marshall(batchGetDeploymentsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetDeploymentsResult, JsonUnmarshallerContext> unmarshaller = new BatchGetDeploymentsResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetDeploymentsResult> responseHandler = new JsonResponseHandler<BatchGetDeploymentsResult>(
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
     * Gets information about one or more on-premises instances. The maximum
     * number of on-premises instances that can be returned is 25.
     * </p>
     * 
     * @param batchGetOnPremisesInstancesRequest <p>
     *            Represents the input of a
     *            <code>BatchGetOnPremisesInstances</code> operation.
     *            </p>
     * @return batchGetOnPremisesInstancesResult The response from the
     *         BatchGetOnPremisesInstances service method, as returned by AWS
     *         CodeDeploy.
     * @throws InstanceNameRequiredException
     * @throws InvalidInstanceNameException
     * @throws BatchLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchGetOnPremisesInstancesResult batchGetOnPremisesInstances(
            BatchGetOnPremisesInstancesRequest batchGetOnPremisesInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchGetOnPremisesInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetOnPremisesInstancesRequest> request = null;
        Response<BatchGetOnPremisesInstancesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetOnPremisesInstancesRequestMarshaller()
                        .marshall(batchGetOnPremisesInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetOnPremisesInstancesResult, JsonUnmarshallerContext> unmarshaller = new BatchGetOnPremisesInstancesResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetOnPremisesInstancesResult> responseHandler = new JsonResponseHandler<BatchGetOnPremisesInstancesResult>(
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
     * For a blue/green deployment, starts the process of rerouting traffic from
     * instances in the original environment to instances in the replacement
     * environment without waiting for a specified wait time to elapse. (Traffic
     * rerouting, which is achieved by registering instances in the replacement
     * environment with the load balancer, can start as soon as all instances
     * have a status of Ready.)
     * </p>
     * 
     * @param continueDeploymentRequest
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     * @throws DeploymentAlreadyCompletedException
     * @throws InvalidDeploymentIdException
     * @throws DeploymentIsNotInReadyStateException
     * @throws UnsupportedActionForDeploymentTypeException
     * @throws InvalidDeploymentWaitTypeException
     * @throws InvalidDeploymentStatusException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void continueDeployment(ContinueDeploymentRequest continueDeploymentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(continueDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ContinueDeploymentRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ContinueDeploymentRequestMarshaller()
                        .marshall(continueDeploymentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an application.
     * </p>
     * 
     * @param createApplicationRequest <p>
     *            Represents the input of a <code>CreateApplication</code>
     *            operation.
     *            </p>
     * @return createApplicationResult The response from the CreateApplication
     *         service method, as returned by AWS CodeDeploy.
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws ApplicationAlreadyExistsException
     * @throws ApplicationLimitExceededException
     * @throws InvalidComputePlatformException
     * @throws InvalidTagsToAddException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateApplicationResult createApplication(
            CreateApplicationRequest createApplicationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApplicationRequest> request = null;
        Response<CreateApplicationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApplicationRequestMarshaller()
                        .marshall(createApplicationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateApplicationResult, JsonUnmarshallerContext> unmarshaller = new CreateApplicationResultJsonUnmarshaller();
            JsonResponseHandler<CreateApplicationResult> responseHandler = new JsonResponseHandler<CreateApplicationResult>(
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
     * Deploys an application revision through the specified deployment group.
     * </p>
     * 
     * @param createDeploymentRequest <p>
     *            Represents the input of a <code>CreateDeployment</code>
     *            operation.
     *            </p>
     * @return createDeploymentResult The response from the CreateDeployment
     *         service method, as returned by AWS CodeDeploy.
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws ApplicationDoesNotExistException
     * @throws DeploymentGroupNameRequiredException
     * @throws InvalidDeploymentGroupNameException
     * @throws DeploymentGroupDoesNotExistException
     * @throws RevisionRequiredException
     * @throws RevisionDoesNotExistException
     * @throws InvalidRevisionException
     * @throws InvalidDeploymentConfigNameException
     * @throws DeploymentConfigDoesNotExistException
     * @throws DescriptionTooLongException
     * @throws DeploymentLimitExceededException
     * @throws InvalidTargetInstancesException
     * @throws InvalidAutoRollbackConfigException
     * @throws InvalidLoadBalancerInfoException
     * @throws InvalidFileExistsBehaviorException
     * @throws InvalidRoleException
     * @throws InvalidAutoScalingGroupException
     * @throws ThrottlingException
     * @throws InvalidUpdateOutdatedInstancesOnlyValueException
     * @throws InvalidIgnoreApplicationStopFailuresValueException
     * @throws InvalidGitHubAccountTokenException
     * @throws InvalidTrafficRoutingConfigurationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDeploymentResult createDeployment(CreateDeploymentRequest createDeploymentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeploymentRequest> request = null;
        Response<CreateDeploymentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeploymentRequestMarshaller().marshall(createDeploymentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDeploymentResult, JsonUnmarshallerContext> unmarshaller = new CreateDeploymentResultJsonUnmarshaller();
            JsonResponseHandler<CreateDeploymentResult> responseHandler = new JsonResponseHandler<CreateDeploymentResult>(
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
     * Creates a deployment configuration.
     * </p>
     * 
     * @param createDeploymentConfigRequest <p>
     *            Represents the input of a <code>CreateDeploymentConfig</code>
     *            operation.
     *            </p>
     * @return createDeploymentConfigResult The response from the
     *         CreateDeploymentConfig service method, as returned by AWS
     *         CodeDeploy.
     * @throws InvalidDeploymentConfigNameException
     * @throws DeploymentConfigNameRequiredException
     * @throws DeploymentConfigAlreadyExistsException
     * @throws InvalidMinimumHealthyHostValueException
     * @throws DeploymentConfigLimitExceededException
     * @throws InvalidComputePlatformException
     * @throws InvalidTrafficRoutingConfigurationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDeploymentConfigResult createDeploymentConfig(
            CreateDeploymentConfigRequest createDeploymentConfigRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDeploymentConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeploymentConfigRequest> request = null;
        Response<CreateDeploymentConfigResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeploymentConfigRequestMarshaller()
                        .marshall(createDeploymentConfigRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDeploymentConfigResult, JsonUnmarshallerContext> unmarshaller = new CreateDeploymentConfigResultJsonUnmarshaller();
            JsonResponseHandler<CreateDeploymentConfigResult> responseHandler = new JsonResponseHandler<CreateDeploymentConfigResult>(
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
     * Creates a deployment group to which application revisions are deployed.
     * </p>
     * 
     * @param createDeploymentGroupRequest <p>
     *            Represents the input of a <code>CreateDeploymentGroup</code>
     *            operation.
     *            </p>
     * @return createDeploymentGroupResult The response from the
     *         CreateDeploymentGroup service method, as returned by AWS
     *         CodeDeploy.
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws ApplicationDoesNotExistException
     * @throws DeploymentGroupNameRequiredException
     * @throws InvalidDeploymentGroupNameException
     * @throws DeploymentGroupAlreadyExistsException
     * @throws InvalidEC2TagException
     * @throws InvalidTagException
     * @throws InvalidAutoScalingGroupException
     * @throws InvalidDeploymentConfigNameException
     * @throws DeploymentConfigDoesNotExistException
     * @throws RoleRequiredException
     * @throws InvalidRoleException
     * @throws DeploymentGroupLimitExceededException
     * @throws LifecycleHookLimitExceededException
     * @throws InvalidTriggerConfigException
     * @throws TriggerTargetsLimitExceededException
     * @throws InvalidAlarmConfigException
     * @throws AlarmsLimitExceededException
     * @throws InvalidAutoRollbackConfigException
     * @throws InvalidLoadBalancerInfoException
     * @throws InvalidDeploymentStyleException
     * @throws InvalidBlueGreenDeploymentConfigurationException
     * @throws InvalidEC2TagCombinationException
     * @throws InvalidOnPremisesTagCombinationException
     * @throws TagSetListLimitExceededException
     * @throws InvalidInputException
     * @throws ThrottlingException
     * @throws InvalidECSServiceException
     * @throws InvalidTargetGroupPairException
     * @throws ECSServiceMappingLimitExceededException
     * @throws InvalidTagsToAddException
     * @throws InvalidTrafficRoutingConfigurationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDeploymentGroupResult createDeploymentGroup(
            CreateDeploymentGroupRequest createDeploymentGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDeploymentGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeploymentGroupRequest> request = null;
        Response<CreateDeploymentGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeploymentGroupRequestMarshaller()
                        .marshall(createDeploymentGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDeploymentGroupResult, JsonUnmarshallerContext> unmarshaller = new CreateDeploymentGroupResultJsonUnmarshaller();
            JsonResponseHandler<CreateDeploymentGroupResult> responseHandler = new JsonResponseHandler<CreateDeploymentGroupResult>(
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
     * Deletes an application.
     * </p>
     * 
     * @param deleteApplicationRequest <p>
     *            Represents the input of a <code>DeleteApplication</code>
     *            operation.
     *            </p>
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws InvalidRoleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteApplication(DeleteApplicationRequest deleteApplicationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationRequestMarshaller()
                        .marshall(deleteApplicationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a deployment configuration.
     * </p>
     * <note>
     * <p>
     * A deployment configuration cannot be deleted if it is currently in use.
     * Predefined configurations cannot be deleted.
     * </p>
     * </note>
     * 
     * @param deleteDeploymentConfigRequest <p>
     *            Represents the input of a <code>DeleteDeploymentConfig</code>
     *            operation.
     *            </p>
     * @throws InvalidDeploymentConfigNameException
     * @throws DeploymentConfigNameRequiredException
     * @throws DeploymentConfigInUseException
     * @throws InvalidOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteDeploymentConfig(DeleteDeploymentConfigRequest deleteDeploymentConfigRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDeploymentConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeploymentConfigRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeploymentConfigRequestMarshaller()
                        .marshall(deleteDeploymentConfigRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a deployment group.
     * </p>
     * 
     * @param deleteDeploymentGroupRequest <p>
     *            Represents the input of a <code>DeleteDeploymentGroup</code>
     *            operation.
     *            </p>
     * @return deleteDeploymentGroupResult The response from the
     *         DeleteDeploymentGroup service method, as returned by AWS
     *         CodeDeploy.
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws DeploymentGroupNameRequiredException
     * @throws InvalidDeploymentGroupNameException
     * @throws InvalidRoleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteDeploymentGroupResult deleteDeploymentGroup(
            DeleteDeploymentGroupRequest deleteDeploymentGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDeploymentGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeploymentGroupRequest> request = null;
        Response<DeleteDeploymentGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeploymentGroupRequestMarshaller()
                        .marshall(deleteDeploymentGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDeploymentGroupResult, JsonUnmarshallerContext> unmarshaller = new DeleteDeploymentGroupResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDeploymentGroupResult> responseHandler = new JsonResponseHandler<DeleteDeploymentGroupResult>(
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
     * Deletes a GitHub account connection.
     * </p>
     * 
     * @param deleteGitHubAccountTokenRequest <p>
     *            Represents the input of a <code>DeleteGitHubAccount</code>
     *            operation.
     *            </p>
     * @return deleteGitHubAccountTokenResult The response from the
     *         DeleteGitHubAccountToken service method, as returned by AWS
     *         CodeDeploy.
     * @throws GitHubAccountTokenNameRequiredException
     * @throws GitHubAccountTokenDoesNotExistException
     * @throws InvalidGitHubAccountTokenNameException
     * @throws ResourceValidationException
     * @throws OperationNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteGitHubAccountTokenResult deleteGitHubAccountToken(
            DeleteGitHubAccountTokenRequest deleteGitHubAccountTokenRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteGitHubAccountTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGitHubAccountTokenRequest> request = null;
        Response<DeleteGitHubAccountTokenResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGitHubAccountTokenRequestMarshaller()
                        .marshall(deleteGitHubAccountTokenRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteGitHubAccountTokenResult, JsonUnmarshallerContext> unmarshaller = new DeleteGitHubAccountTokenResultJsonUnmarshaller();
            JsonResponseHandler<DeleteGitHubAccountTokenResult> responseHandler = new JsonResponseHandler<DeleteGitHubAccountTokenResult>(
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
     * Deletes resources linked to an external ID.
     * </p>
     * 
     * @param deleteResourcesByExternalIdRequest
     * @return deleteResourcesByExternalIdResult The response from the
     *         DeleteResourcesByExternalId service method, as returned by AWS
     *         CodeDeploy.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteResourcesByExternalIdResult deleteResourcesByExternalId(
            DeleteResourcesByExternalIdRequest deleteResourcesByExternalIdRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteResourcesByExternalIdRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourcesByExternalIdRequest> request = null;
        Response<DeleteResourcesByExternalIdResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourcesByExternalIdRequestMarshaller()
                        .marshall(deleteResourcesByExternalIdRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteResourcesByExternalIdResult, JsonUnmarshallerContext> unmarshaller = new DeleteResourcesByExternalIdResultJsonUnmarshaller();
            JsonResponseHandler<DeleteResourcesByExternalIdResult> responseHandler = new JsonResponseHandler<DeleteResourcesByExternalIdResult>(
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
     * Deregisters an on-premises instance.
     * </p>
     * 
     * @param deregisterOnPremisesInstanceRequest <p>
     *            Represents the input of a
     *            <code>DeregisterOnPremisesInstance</code> operation.
     *            </p>
     * @throws InstanceNameRequiredException
     * @throws InvalidInstanceNameException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deregisterOnPremisesInstance(
            DeregisterOnPremisesInstanceRequest deregisterOnPremisesInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deregisterOnPremisesInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterOnPremisesInstanceRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterOnPremisesInstanceRequestMarshaller()
                        .marshall(deregisterOnPremisesInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about an application.
     * </p>
     * 
     * @param getApplicationRequest <p>
     *            Represents the input of a <code>GetApplication</code>
     *            operation.
     *            </p>
     * @return getApplicationResult The response from the GetApplication service
     *         method, as returned by AWS CodeDeploy.
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws ApplicationDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetApplicationResult getApplication(GetApplicationRequest getApplicationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationRequest> request = null;
        Response<GetApplicationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationRequestMarshaller().marshall(getApplicationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetApplicationResult, JsonUnmarshallerContext> unmarshaller = new GetApplicationResultJsonUnmarshaller();
            JsonResponseHandler<GetApplicationResult> responseHandler = new JsonResponseHandler<GetApplicationResult>(
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
     * Gets information about an application revision.
     * </p>
     * 
     * @param getApplicationRevisionRequest <p>
     *            Represents the input of a <code>GetApplicationRevision</code>
     *            operation.
     *            </p>
     * @return getApplicationRevisionResult The response from the
     *         GetApplicationRevision service method, as returned by AWS
     *         CodeDeploy.
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws RevisionDoesNotExistException
     * @throws RevisionRequiredException
     * @throws InvalidRevisionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetApplicationRevisionResult getApplicationRevision(
            GetApplicationRevisionRequest getApplicationRevisionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getApplicationRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationRevisionRequest> request = null;
        Response<GetApplicationRevisionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationRevisionRequestMarshaller()
                        .marshall(getApplicationRevisionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetApplicationRevisionResult, JsonUnmarshallerContext> unmarshaller = new GetApplicationRevisionResultJsonUnmarshaller();
            JsonResponseHandler<GetApplicationRevisionResult> responseHandler = new JsonResponseHandler<GetApplicationRevisionResult>(
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
     * Gets information about a deployment.
     * </p>
     * <note>
     * <p>
     * The <code>content</code> property of the <code>appSpecContent</code>
     * object in the returned revision is always null. Use
     * <code>GetApplicationRevision</code> and the <code>sha256</code> property
     * of the returned <code>appSpecContent</code> object to get the content of
     * the deployment’s AppSpec file.
     * </p>
     * </note>
     * 
     * @param getDeploymentRequest <p>
     *            Represents the input of a <code>GetDeployment</code>
     *            operation.
     *            </p>
     * @return getDeploymentResult The response from the GetDeployment service
     *         method, as returned by AWS CodeDeploy.
     * @throws DeploymentIdRequiredException
     * @throws InvalidDeploymentIdException
     * @throws DeploymentDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDeploymentResult getDeployment(GetDeploymentRequest getDeploymentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentRequest> request = null;
        Response<GetDeploymentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentRequestMarshaller().marshall(getDeploymentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDeploymentResult, JsonUnmarshallerContext> unmarshaller = new GetDeploymentResultJsonUnmarshaller();
            JsonResponseHandler<GetDeploymentResult> responseHandler = new JsonResponseHandler<GetDeploymentResult>(
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
     * Gets information about a deployment configuration.
     * </p>
     * 
     * @param getDeploymentConfigRequest <p>
     *            Represents the input of a <code>GetDeploymentConfig</code>
     *            operation.
     *            </p>
     * @return getDeploymentConfigResult The response from the
     *         GetDeploymentConfig service method, as returned by AWS
     *         CodeDeploy.
     * @throws InvalidDeploymentConfigNameException
     * @throws DeploymentConfigNameRequiredException
     * @throws DeploymentConfigDoesNotExistException
     * @throws InvalidComputePlatformException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDeploymentConfigResult getDeploymentConfig(
            GetDeploymentConfigRequest getDeploymentConfigRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDeploymentConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentConfigRequest> request = null;
        Response<GetDeploymentConfigResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentConfigRequestMarshaller()
                        .marshall(getDeploymentConfigRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDeploymentConfigResult, JsonUnmarshallerContext> unmarshaller = new GetDeploymentConfigResultJsonUnmarshaller();
            JsonResponseHandler<GetDeploymentConfigResult> responseHandler = new JsonResponseHandler<GetDeploymentConfigResult>(
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
     * Gets information about a deployment group.
     * </p>
     * 
     * @param getDeploymentGroupRequest <p>
     *            Represents the input of a <code>GetDeploymentGroup</code>
     *            operation.
     *            </p>
     * @return getDeploymentGroupResult The response from the GetDeploymentGroup
     *         service method, as returned by AWS CodeDeploy.
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws ApplicationDoesNotExistException
     * @throws DeploymentGroupNameRequiredException
     * @throws InvalidDeploymentGroupNameException
     * @throws DeploymentGroupDoesNotExistException
     * @throws DeploymentConfigDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDeploymentGroupResult getDeploymentGroup(
            GetDeploymentGroupRequest getDeploymentGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDeploymentGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentGroupRequest> request = null;
        Response<GetDeploymentGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentGroupRequestMarshaller()
                        .marshall(getDeploymentGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDeploymentGroupResult, JsonUnmarshallerContext> unmarshaller = new GetDeploymentGroupResultJsonUnmarshaller();
            JsonResponseHandler<GetDeploymentGroupResult> responseHandler = new JsonResponseHandler<GetDeploymentGroupResult>(
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
     * Gets information about an instance as part of a deployment.
     * </p>
     * 
     * @param getDeploymentInstanceRequest <p>
     *            Represents the input of a <code>GetDeploymentInstance</code>
     *            operation.
     *            </p>
     * @return getDeploymentInstanceResult The response from the
     *         GetDeploymentInstance service method, as returned by AWS
     *         CodeDeploy.
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     * @throws InstanceIdRequiredException
     * @throws InvalidDeploymentIdException
     * @throws InstanceDoesNotExistException
     * @throws InvalidInstanceNameException
     * @throws InvalidComputePlatformException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    @Deprecated
    public GetDeploymentInstanceResult getDeploymentInstance(
            GetDeploymentInstanceRequest getDeploymentInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDeploymentInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentInstanceRequest> request = null;
        Response<GetDeploymentInstanceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentInstanceRequestMarshaller()
                        .marshall(getDeploymentInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDeploymentInstanceResult, JsonUnmarshallerContext> unmarshaller = new GetDeploymentInstanceResultJsonUnmarshaller();
            JsonResponseHandler<GetDeploymentInstanceResult> responseHandler = new JsonResponseHandler<GetDeploymentInstanceResult>(
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
     * Returns information about a deployment target.
     * </p>
     * 
     * @param getDeploymentTargetRequest
     * @return getDeploymentTargetResult The response from the
     *         GetDeploymentTarget service method, as returned by AWS
     *         CodeDeploy.
     * @throws InvalidDeploymentIdException
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     * @throws DeploymentNotStartedException
     * @throws DeploymentTargetIdRequiredException
     * @throws InvalidDeploymentTargetIdException
     * @throws DeploymentTargetDoesNotExistException
     * @throws InvalidInstanceNameException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDeploymentTargetResult getDeploymentTarget(
            GetDeploymentTargetRequest getDeploymentTargetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDeploymentTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentTargetRequest> request = null;
        Response<GetDeploymentTargetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentTargetRequestMarshaller()
                        .marshall(getDeploymentTargetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDeploymentTargetResult, JsonUnmarshallerContext> unmarshaller = new GetDeploymentTargetResultJsonUnmarshaller();
            JsonResponseHandler<GetDeploymentTargetResult> responseHandler = new JsonResponseHandler<GetDeploymentTargetResult>(
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
     * Gets information about an on-premises instance.
     * </p>
     * 
     * @param getOnPremisesInstanceRequest <p>
     *            Represents the input of a <code>GetOnPremisesInstance</code>
     *            operation.
     *            </p>
     * @return getOnPremisesInstanceResult The response from the
     *         GetOnPremisesInstance service method, as returned by AWS
     *         CodeDeploy.
     * @throws InstanceNameRequiredException
     * @throws InstanceNotRegisteredException
     * @throws InvalidInstanceNameException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetOnPremisesInstanceResult getOnPremisesInstance(
            GetOnPremisesInstanceRequest getOnPremisesInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getOnPremisesInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOnPremisesInstanceRequest> request = null;
        Response<GetOnPremisesInstanceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOnPremisesInstanceRequestMarshaller()
                        .marshall(getOnPremisesInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetOnPremisesInstanceResult, JsonUnmarshallerContext> unmarshaller = new GetOnPremisesInstanceResultJsonUnmarshaller();
            JsonResponseHandler<GetOnPremisesInstanceResult> responseHandler = new JsonResponseHandler<GetOnPremisesInstanceResult>(
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
     * Lists information about revisions for an application.
     * </p>
     * 
     * @param listApplicationRevisionsRequest <p>
     *            Represents the input of a
     *            <code>ListApplicationRevisions</code> operation.
     *            </p>
     * @return listApplicationRevisionsResult The response from the
     *         ListApplicationRevisions service method, as returned by AWS
     *         CodeDeploy.
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws InvalidSortByException
     * @throws InvalidSortOrderException
     * @throws InvalidBucketNameFilterException
     * @throws InvalidKeyPrefixFilterException
     * @throws BucketNameFilterRequiredException
     * @throws InvalidDeployedStateFilterException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListApplicationRevisionsResult listApplicationRevisions(
            ListApplicationRevisionsRequest listApplicationRevisionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listApplicationRevisionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationRevisionsRequest> request = null;
        Response<ListApplicationRevisionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationRevisionsRequestMarshaller()
                        .marshall(listApplicationRevisionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListApplicationRevisionsResult, JsonUnmarshallerContext> unmarshaller = new ListApplicationRevisionsResultJsonUnmarshaller();
            JsonResponseHandler<ListApplicationRevisionsResult> responseHandler = new JsonResponseHandler<ListApplicationRevisionsResult>(
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
     * Lists the applications registered with the IAM user or AWS account.
     * </p>
     * 
     * @param listApplicationsRequest <p>
     *            Represents the input of a <code>ListApplications</code>
     *            operation.
     *            </p>
     * @return listApplicationsResult The response from the ListApplications
     *         service method, as returned by AWS CodeDeploy.
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListApplicationsResult listApplications(ListApplicationsRequest listApplicationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationsRequest> request = null;
        Response<ListApplicationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationsRequestMarshaller().marshall(listApplicationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListApplicationsResult, JsonUnmarshallerContext> unmarshaller = new ListApplicationsResultJsonUnmarshaller();
            JsonResponseHandler<ListApplicationsResult> responseHandler = new JsonResponseHandler<ListApplicationsResult>(
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
     * Lists the deployment configurations with the IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentConfigsRequest <p>
     *            Represents the input of a <code>ListDeploymentConfigs</code>
     *            operation.
     *            </p>
     * @return listDeploymentConfigsResult The response from the
     *         ListDeploymentConfigs service method, as returned by AWS
     *         CodeDeploy.
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDeploymentConfigsResult listDeploymentConfigs(
            ListDeploymentConfigsRequest listDeploymentConfigsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDeploymentConfigsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentConfigsRequest> request = null;
        Response<ListDeploymentConfigsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentConfigsRequestMarshaller()
                        .marshall(listDeploymentConfigsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDeploymentConfigsResult, JsonUnmarshallerContext> unmarshaller = new ListDeploymentConfigsResultJsonUnmarshaller();
            JsonResponseHandler<ListDeploymentConfigsResult> responseHandler = new JsonResponseHandler<ListDeploymentConfigsResult>(
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
     * Lists the deployment groups for an application registered with the IAM
     * user or AWS account.
     * </p>
     * 
     * @param listDeploymentGroupsRequest <p>
     *            Represents the input of a <code>ListDeploymentGroups</code>
     *            operation.
     *            </p>
     * @return listDeploymentGroupsResult The response from the
     *         ListDeploymentGroups service method, as returned by AWS
     *         CodeDeploy.
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws ApplicationDoesNotExistException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDeploymentGroupsResult listDeploymentGroups(
            ListDeploymentGroupsRequest listDeploymentGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDeploymentGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentGroupsRequest> request = null;
        Response<ListDeploymentGroupsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentGroupsRequestMarshaller()
                        .marshall(listDeploymentGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDeploymentGroupsResult, JsonUnmarshallerContext> unmarshaller = new ListDeploymentGroupsResultJsonUnmarshaller();
            JsonResponseHandler<ListDeploymentGroupsResult> responseHandler = new JsonResponseHandler<ListDeploymentGroupsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <note>
     * <p>
     * The newer <code>BatchGetDeploymentTargets</code> should be used instead
     * because it works with all compute types.
     * <code>ListDeploymentInstances</code> throws an exception if it is used
     * with a compute platform other than EC2/On-premises or AWS Lambda.
     * </p>
     * </note>
     * <p>
     * Lists the instance for a deployment associated with the IAM user or AWS
     * account.
     * </p>
     * 
     * @param listDeploymentInstancesRequest <p>
     *            Represents the input of a <code>ListDeploymentInstances</code>
     *            operation.
     *            </p>
     * @return listDeploymentInstancesResult The response from the
     *         ListDeploymentInstances service method, as returned by AWS
     *         CodeDeploy.
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     * @throws DeploymentNotStartedException
     * @throws InvalidNextTokenException
     * @throws InvalidDeploymentIdException
     * @throws InvalidInstanceStatusException
     * @throws InvalidInstanceTypeException
     * @throws InvalidDeploymentInstanceTypeException
     * @throws InvalidTargetFilterNameException
     * @throws InvalidComputePlatformException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    @Deprecated
    public ListDeploymentInstancesResult listDeploymentInstances(
            ListDeploymentInstancesRequest listDeploymentInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDeploymentInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentInstancesRequest> request = null;
        Response<ListDeploymentInstancesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentInstancesRequestMarshaller()
                        .marshall(listDeploymentInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDeploymentInstancesResult, JsonUnmarshallerContext> unmarshaller = new ListDeploymentInstancesResultJsonUnmarshaller();
            JsonResponseHandler<ListDeploymentInstancesResult> responseHandler = new JsonResponseHandler<ListDeploymentInstancesResult>(
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
     * Returns an array of target IDs that are associated a deployment.
     * </p>
     * 
     * @param listDeploymentTargetsRequest
     * @return listDeploymentTargetsResult The response from the
     *         ListDeploymentTargets service method, as returned by AWS
     *         CodeDeploy.
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     * @throws DeploymentNotStartedException
     * @throws InvalidNextTokenException
     * @throws InvalidDeploymentIdException
     * @throws InvalidInstanceStatusException
     * @throws InvalidInstanceTypeException
     * @throws InvalidDeploymentInstanceTypeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDeploymentTargetsResult listDeploymentTargets(
            ListDeploymentTargetsRequest listDeploymentTargetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDeploymentTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentTargetsRequest> request = null;
        Response<ListDeploymentTargetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentTargetsRequestMarshaller()
                        .marshall(listDeploymentTargetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDeploymentTargetsResult, JsonUnmarshallerContext> unmarshaller = new ListDeploymentTargetsResultJsonUnmarshaller();
            JsonResponseHandler<ListDeploymentTargetsResult> responseHandler = new JsonResponseHandler<ListDeploymentTargetsResult>(
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
     * Lists the deployments in a deployment group for an application registered
     * with the IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentsRequest <p>
     *            Represents the input of a <code>ListDeployments</code>
     *            operation.
     *            </p>
     * @return listDeploymentsResult The response from the ListDeployments
     *         service method, as returned by AWS CodeDeploy.
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws ApplicationDoesNotExistException
     * @throws InvalidDeploymentGroupNameException
     * @throws DeploymentGroupDoesNotExistException
     * @throws DeploymentGroupNameRequiredException
     * @throws InvalidTimeRangeException
     * @throws InvalidDeploymentStatusException
     * @throws InvalidNextTokenException
     * @throws InvalidExternalIdException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDeploymentsResult listDeployments(ListDeploymentsRequest listDeploymentsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDeploymentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentsRequest> request = null;
        Response<ListDeploymentsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentsRequestMarshaller().marshall(listDeploymentsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDeploymentsResult, JsonUnmarshallerContext> unmarshaller = new ListDeploymentsResultJsonUnmarshaller();
            JsonResponseHandler<ListDeploymentsResult> responseHandler = new JsonResponseHandler<ListDeploymentsResult>(
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
     * Lists the names of stored connections to GitHub accounts.
     * </p>
     * 
     * @param listGitHubAccountTokenNamesRequest <p>
     *            Represents the input of a
     *            <code>ListGitHubAccountTokenNames</code> operation.
     *            </p>
     * @return listGitHubAccountTokenNamesResult The response from the
     *         ListGitHubAccountTokenNames service method, as returned by AWS
     *         CodeDeploy.
     * @throws InvalidNextTokenException
     * @throws ResourceValidationException
     * @throws OperationNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListGitHubAccountTokenNamesResult listGitHubAccountTokenNames(
            ListGitHubAccountTokenNamesRequest listGitHubAccountTokenNamesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listGitHubAccountTokenNamesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGitHubAccountTokenNamesRequest> request = null;
        Response<ListGitHubAccountTokenNamesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGitHubAccountTokenNamesRequestMarshaller()
                        .marshall(listGitHubAccountTokenNamesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListGitHubAccountTokenNamesResult, JsonUnmarshallerContext> unmarshaller = new ListGitHubAccountTokenNamesResultJsonUnmarshaller();
            JsonResponseHandler<ListGitHubAccountTokenNamesResult> responseHandler = new JsonResponseHandler<ListGitHubAccountTokenNamesResult>(
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
     * Gets a list of names for one or more on-premises instances.
     * </p>
     * <p>
     * Unless otherwise specified, both registered and deregistered on-premises
     * instance names are listed. To list only registered or deregistered
     * on-premises instance names, use the registration status parameter.
     * </p>
     * 
     * @param listOnPremisesInstancesRequest <p>
     *            Represents the input of a <code>ListOnPremisesInstances</code>
     *            operation.
     *            </p>
     * @return listOnPremisesInstancesResult The response from the
     *         ListOnPremisesInstances service method, as returned by AWS
     *         CodeDeploy.
     * @throws InvalidRegistrationStatusException
     * @throws InvalidTagFilterException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListOnPremisesInstancesResult listOnPremisesInstances(
            ListOnPremisesInstancesRequest listOnPremisesInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listOnPremisesInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOnPremisesInstancesRequest> request = null;
        Response<ListOnPremisesInstancesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOnPremisesInstancesRequestMarshaller()
                        .marshall(listOnPremisesInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListOnPremisesInstancesResult, JsonUnmarshallerContext> unmarshaller = new ListOnPremisesInstancesResultJsonUnmarshaller();
            JsonResponseHandler<ListOnPremisesInstancesResult> responseHandler = new JsonResponseHandler<ListOnPremisesInstancesResult>(
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
     * Returns a list of tags for the resource identified by a specified Amazon
     * Resource Name (ARN). Tags are used to organize and categorize your
     * CodeDeploy resources.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS
     *         CodeDeploy.
     * @throws ArnNotSupportedException
     * @throws InvalidArnException
     * @throws ResourceArnRequiredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestMarshaller()
                        .marshall(listTagsForResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTagsForResourceResult, JsonUnmarshallerContext> unmarshaller = new ListTagsForResourceResultJsonUnmarshaller();
            JsonResponseHandler<ListTagsForResourceResult> responseHandler = new JsonResponseHandler<ListTagsForResourceResult>(
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
     * Sets the result of a Lambda validation function. The function validates
     * lifecycle hooks during a deployment that uses the AWS Lambda or Amazon
     * ECS compute platform. For AWS Lambda deployments, the available lifecycle
     * hooks are <code>BeforeAllowTraffic</code> and
     * <code>AfterAllowTraffic</code>. For Amazon ECS deployments, the available
     * lifecycle hooks are <code>BeforeInstall</code>, <code>AfterInstall</code>, <code>AfterAllowTestTraffic</code>, <code>BeforeAllowTraffic</code>,
     * and <code>AfterAllowTraffic</code>. Lambda validation functions return
     * <code>Succeeded</code> or <code>Failed</code>. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/reference-appspec-file-structure-hooks.html#appspec-hooks-lambda"
     * >AppSpec 'hooks' Section for an AWS Lambda Deployment </a> and <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/reference-appspec-file-structure-hooks.html#appspec-hooks-ecs"
     * >AppSpec 'hooks' Section for an Amazon ECS Deployment</a>.
     * </p>
     * 
     * @param putLifecycleEventHookExecutionStatusRequest
     * @return putLifecycleEventHookExecutionStatusResult The response from the
     *         PutLifecycleEventHookExecutionStatus service method, as returned
     *         by AWS CodeDeploy.
     * @throws InvalidLifecycleEventHookExecutionStatusException
     * @throws InvalidLifecycleEventHookExecutionIdException
     * @throws LifecycleEventAlreadyCompletedException
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     * @throws InvalidDeploymentIdException
     * @throws UnsupportedActionForDeploymentTypeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutLifecycleEventHookExecutionStatusResult putLifecycleEventHookExecutionStatus(
            PutLifecycleEventHookExecutionStatusRequest putLifecycleEventHookExecutionStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putLifecycleEventHookExecutionStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutLifecycleEventHookExecutionStatusRequest> request = null;
        Response<PutLifecycleEventHookExecutionStatusResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutLifecycleEventHookExecutionStatusRequestMarshaller()
                        .marshall(putLifecycleEventHookExecutionStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutLifecycleEventHookExecutionStatusResult, JsonUnmarshallerContext> unmarshaller = new PutLifecycleEventHookExecutionStatusResultJsonUnmarshaller();
            JsonResponseHandler<PutLifecycleEventHookExecutionStatusResult> responseHandler = new JsonResponseHandler<PutLifecycleEventHookExecutionStatusResult>(
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
     * Registers with AWS CodeDeploy a revision for the specified application.
     * </p>
     * 
     * @param registerApplicationRevisionRequest <p>
     *            Represents the input of a RegisterApplicationRevision
     *            operation.
     *            </p>
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws DescriptionTooLongException
     * @throws RevisionRequiredException
     * @throws InvalidRevisionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void registerApplicationRevision(
            RegisterApplicationRevisionRequest registerApplicationRevisionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(registerApplicationRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterApplicationRevisionRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterApplicationRevisionRequestMarshaller()
                        .marshall(registerApplicationRevisionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Registers an on-premises instance.
     * </p>
     * <note>
     * <p>
     * Only one IAM ARN (an IAM session ARN or IAM user ARN) is supported in the
     * request. You cannot use both.
     * </p>
     * </note>
     * 
     * @param registerOnPremisesInstanceRequest <p>
     *            Represents the input of the register on-premises instance
     *            operation.
     *            </p>
     * @throws InstanceNameAlreadyRegisteredException
     * @throws IamArnRequiredException
     * @throws IamSessionArnAlreadyRegisteredException
     * @throws IamUserArnAlreadyRegisteredException
     * @throws InstanceNameRequiredException
     * @throws IamUserArnRequiredException
     * @throws InvalidInstanceNameException
     * @throws InvalidIamSessionArnException
     * @throws InvalidIamUserArnException
     * @throws MultipleIamArnsProvidedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void registerOnPremisesInstance(
            RegisterOnPremisesInstanceRequest registerOnPremisesInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(registerOnPremisesInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterOnPremisesInstanceRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterOnPremisesInstanceRequestMarshaller()
                        .marshall(registerOnPremisesInstanceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Removes one or more tags from one or more on-premises instances.
     * </p>
     * 
     * @param removeTagsFromOnPremisesInstancesRequest <p>
     *            Represents the input of a
     *            <code>RemoveTagsFromOnPremisesInstances</code> operation.
     *            </p>
     * @throws InstanceNameRequiredException
     * @throws InvalidInstanceNameException
     * @throws TagRequiredException
     * @throws InvalidTagException
     * @throws TagLimitExceededException
     * @throws InstanceLimitExceededException
     * @throws InstanceNotRegisteredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void removeTagsFromOnPremisesInstances(
            RemoveTagsFromOnPremisesInstancesRequest removeTagsFromOnPremisesInstancesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(removeTagsFromOnPremisesInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsFromOnPremisesInstancesRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsFromOnPremisesInstancesRequestMarshaller()
                        .marshall(removeTagsFromOnPremisesInstancesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * In a blue/green deployment, overrides any specified wait time and starts
     * terminating instances immediately after the traffic routing is complete.
     * </p>
     * 
     * @param skipWaitTimeForInstanceTerminationRequest
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     * @throws DeploymentAlreadyCompletedException
     * @throws InvalidDeploymentIdException
     * @throws DeploymentNotStartedException
     * @throws UnsupportedActionForDeploymentTypeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    @Deprecated
    public void skipWaitTimeForInstanceTermination(
            SkipWaitTimeForInstanceTerminationRequest skipWaitTimeForInstanceTerminationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(skipWaitTimeForInstanceTerminationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SkipWaitTimeForInstanceTerminationRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SkipWaitTimeForInstanceTerminationRequestMarshaller()
                        .marshall(skipWaitTimeForInstanceTerminationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Attempts to stop an ongoing deployment.
     * </p>
     * 
     * @param stopDeploymentRequest <p>
     *            Represents the input of a <code>StopDeployment</code>
     *            operation.
     *            </p>
     * @return stopDeploymentResult The response from the StopDeployment service
     *         method, as returned by AWS CodeDeploy.
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     * @throws DeploymentGroupDoesNotExistException
     * @throws DeploymentAlreadyCompletedException
     * @throws InvalidDeploymentIdException
     * @throws UnsupportedActionForDeploymentTypeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StopDeploymentResult stopDeployment(StopDeploymentRequest stopDeploymentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopDeploymentRequest> request = null;
        Response<StopDeploymentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopDeploymentRequestMarshaller().marshall(stopDeploymentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopDeploymentResult, JsonUnmarshallerContext> unmarshaller = new StopDeploymentResultJsonUnmarshaller();
            JsonResponseHandler<StopDeploymentResult> responseHandler = new JsonResponseHandler<StopDeploymentResult>(
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
     * Associates the list of tags in the input <code>Tags</code> parameter with
     * the resource identified by the <code>ResourceArn</code> input parameter.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AWS CodeDeploy.
     * @throws ResourceArnRequiredException
     * @throws ApplicationDoesNotExistException
     * @throws DeploymentGroupDoesNotExistException
     * @throws DeploymentConfigDoesNotExistException
     * @throws TagRequiredException
     * @throws InvalidTagsToAddException
     * @throws ArnNotSupportedException
     * @throws InvalidArnException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestMarshaller().marshall(tagResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<TagResourceResult, JsonUnmarshallerContext> unmarshaller = new TagResourceResultJsonUnmarshaller();
            JsonResponseHandler<TagResourceResult> responseHandler = new JsonResponseHandler<TagResourceResult>(
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
     * Disassociates a resource from a list of tags. The resource is identified
     * by the <code>ResourceArn</code> input parameter. The tags are identified
     * by the list of keys in the <code>TagKeys</code> input parameter.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by AWS CodeDeploy.
     * @throws ResourceArnRequiredException
     * @throws ApplicationDoesNotExistException
     * @throws DeploymentGroupDoesNotExistException
     * @throws DeploymentConfigDoesNotExistException
     * @throws TagRequiredException
     * @throws InvalidTagsToAddException
     * @throws ArnNotSupportedException
     * @throws InvalidArnException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestMarshaller().marshall(untagResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UntagResourceResult, JsonUnmarshallerContext> unmarshaller = new UntagResourceResultJsonUnmarshaller();
            JsonResponseHandler<UntagResourceResult> responseHandler = new JsonResponseHandler<UntagResourceResult>(
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
     * Changes the name of an application.
     * </p>
     * 
     * @param updateApplicationRequest <p>
     *            Represents the input of an <code>UpdateApplication</code>
     *            operation.
     *            </p>
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws ApplicationAlreadyExistsException
     * @throws ApplicationDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void updateApplication(UpdateApplicationRequest updateApplicationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApplicationRequestMarshaller()
                        .marshall(updateApplicationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Changes information about a deployment group.
     * </p>
     * 
     * @param updateDeploymentGroupRequest <p>
     *            Represents the input of an <code>UpdateDeploymentGroup</code>
     *            operation.
     *            </p>
     * @return updateDeploymentGroupResult The response from the
     *         UpdateDeploymentGroup service method, as returned by AWS
     *         CodeDeploy.
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws ApplicationDoesNotExistException
     * @throws InvalidDeploymentGroupNameException
     * @throws DeploymentGroupAlreadyExistsException
     * @throws DeploymentGroupNameRequiredException
     * @throws DeploymentGroupDoesNotExistException
     * @throws InvalidEC2TagException
     * @throws InvalidTagException
     * @throws InvalidAutoScalingGroupException
     * @throws InvalidDeploymentConfigNameException
     * @throws DeploymentConfigDoesNotExistException
     * @throws InvalidRoleException
     * @throws LifecycleHookLimitExceededException
     * @throws InvalidTriggerConfigException
     * @throws TriggerTargetsLimitExceededException
     * @throws InvalidAlarmConfigException
     * @throws AlarmsLimitExceededException
     * @throws InvalidAutoRollbackConfigException
     * @throws InvalidLoadBalancerInfoException
     * @throws InvalidDeploymentStyleException
     * @throws InvalidBlueGreenDeploymentConfigurationException
     * @throws InvalidEC2TagCombinationException
     * @throws InvalidOnPremisesTagCombinationException
     * @throws TagSetListLimitExceededException
     * @throws InvalidInputException
     * @throws ThrottlingException
     * @throws InvalidECSServiceException
     * @throws InvalidTargetGroupPairException
     * @throws ECSServiceMappingLimitExceededException
     * @throws InvalidTrafficRoutingConfigurationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateDeploymentGroupResult updateDeploymentGroup(
            UpdateDeploymentGroupRequest updateDeploymentGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDeploymentGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDeploymentGroupRequest> request = null;
        Response<UpdateDeploymentGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDeploymentGroupRequestMarshaller()
                        .marshall(updateDeploymentGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDeploymentGroupResult, JsonUnmarshallerContext> unmarshaller = new UpdateDeploymentGroupResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDeploymentGroupResult> responseHandler = new JsonResponseHandler<UpdateDeploymentGroupResult>(
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
