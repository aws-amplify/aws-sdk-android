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

package com.amazonaws.services.codebuild;

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

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.services.codebuild.model.transform.*;

/**
 * Client for accessing AWS CodeBuild. All service calls made using this client
 * are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS CodeBuild</fullname>
 * <p>
 * AWS CodeBuild is a fully managed build service in the cloud. AWS CodeBuild
 * compiles your source code, runs unit tests, and produces artifacts that are
 * ready to deploy. AWS CodeBuild eliminates the need to provision, manage, and
 * scale your own build servers. It provides prepackaged build environments for
 * the most popular programming languages and build tools, such as Apache Maven,
 * Gradle, and more. You can also fully customize build environments in AWS
 * CodeBuild to use your own build tools. AWS CodeBuild scales automatically to
 * meet peak build requests. You pay only for the build time you consume. For
 * more information about AWS CodeBuild, see the <i> <a
 * href="https://docs.aws.amazon.com/codebuild/latest/userguide/welcome.html"
 * >AWS CodeBuild User Guide</a>.</i>
 * </p>
 * <p>
 * AWS CodeBuild supports these operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>BatchDeleteBuilds</code>: Deletes one or more builds.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BatchGetBuilds</code>: Gets information about one or more builds.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BatchGetProjects</code>: Gets information about one or more build
 * projects. A <i>build project</i> defines how AWS CodeBuild runs a build. This
 * includes information such as where to get the source code to build, the build
 * environment to use, the build commands to run, and where to store the build
 * output. A <i>build environment</i> is a representation of operating system,
 * programming language runtime, and tools that AWS CodeBuild uses to run a
 * build. You can add tags to build projects to help manage your resources and
 * costs.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BatchGetReportGroups</code>: Returns an array of report groups.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BatchGetReports</code>: Returns an array of reports.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateProject</code>: Creates a build project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateReportGroup</code>: Creates a report group. A report group
 * contains a collection of reports.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateWebhook</code>: For an existing AWS CodeBuild build project that
 * has its source code stored in a GitHub or Bitbucket repository, enables AWS
 * CodeBuild to start rebuilding the source code every time a code change is
 * pushed to the repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteProject</code>: Deletes a build project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteReport</code>: Deletes a report.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteReportGroup</code>: Deletes a report group.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteResourcePolicy</code>: Deletes a resource policy that is
 * identified by its resource ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteSourceCredentials</code>: Deletes a set of GitHub, GitHub
 * Enterprise, or Bitbucket source credentials.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteWebhook</code>: For an existing AWS CodeBuild build project that
 * has its source code stored in a GitHub or Bitbucket repository, stops AWS
 * CodeBuild from rebuilding the source code every time a code change is pushed
 * to the repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeTestCases</code>: Returns a list of details about test cases
 * for a report.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>GetResourcePolicy</code>: Gets a resource policy that is identified by
 * its resource ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ImportSourceCredentials</code>: Imports the source repository
 * credentials for an AWS CodeBuild project that has its source code stored in a
 * GitHub, GitHub Enterprise, or Bitbucket repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>InvalidateProjectCache</code>: Resets the cache for a project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListBuilds</code>: Gets a list of build IDs, with each build ID
 * representing a single build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListBuildsForProject</code>: Gets a list of build IDs for the specified
 * build project, with each build ID representing a single build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListCuratedEnvironmentImages</code>: Gets information about Docker
 * images that are managed by AWS CodeBuild.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListProjects</code>: Gets a list of build project names, with each
 * build project name representing a single build project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListReportGroups</code>: Gets a list ARNs for the report groups in the
 * current AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListReports</code>: Gets a list ARNs for the reports in the current AWS
 * account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListReportsForReportGroup</code>: Returns a list of ARNs for the
 * reports that belong to a <code>ReportGroup</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListSharedProjects</code>: Gets a list of ARNs associated with projects
 * shared with the current AWS account or user.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListSharedReportGroups</code>: Gets a list of ARNs associated with
 * report groups shared with the current AWS account or user
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListSourceCredentials</code>: Returns a list of
 * <code>SourceCredentialsInfo</code> objects. Each
 * <code>SourceCredentialsInfo</code> object includes the authentication type,
 * token ARN, and type of source provider for one set of credentials.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>PutResourcePolicy</code>: Stores a resource policy for the ARN of a
 * <code>Project</code> or <code>ReportGroup</code> object.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>StartBuild</code>: Starts running a build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>StopBuild</code>: Attempts to stop running a build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateProject</code>: Changes the settings of an existing build
 * project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateReportGroup</code>: Changes a report group.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateWebhook</code>: Changes the settings of an existing webhook.
 * </p>
 * </li>
 * </ul>
 */
public class AWSCodeBuildClient extends AmazonWebServiceClient implements AWSCodeBuild {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS CodeBuild exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AWSCodeBuild. A
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
    public AWSCodeBuildClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSCodeBuild. A
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
     *            how this client connects to AWSCodeBuild (ex: proxy settings,
     *            retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSCodeBuildClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSCodeBuild using
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
     *         AWSCodeBuildClient client = new AWSCodeBuildClient(AWSMobileClient.getInstance());
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
    public AWSCodeBuildClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSCodeBuild using
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
     *         AWSCodeBuildClient client = new AWSCodeBuildClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSCodeBuild (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AWSCodeBuildClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSCodeBuild using
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
     *         AWSCodeBuildClient client = new AWSCodeBuildClient(AWSMobileClient.getInstance());
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
    public AWSCodeBuildClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSCodeBuild using
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
     *         AWSCodeBuildClient client = new AWSCodeBuildClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSCodeBuild (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AWSCodeBuildClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSCodeBuild using
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
     *            how this client connects to AWSCodeBuild (ex: proxy settings,
     *            retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSCodeBuildClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSCodeBuild using
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
     *         AWSCodeBuildClient client = new AWSCodeBuildClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSCodeBuild (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSCodeBuildClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AccountLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidInputExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new OAuthProviderExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("codebuild.us-east-1.amazonaws.com");
        this.endpointPrefix = "codebuild";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/codebuild/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/codebuild/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Deletes one or more builds.
     * </p>
     * 
     * @param batchDeleteBuildsRequest
     * @return batchDeleteBuildsResult The response from the BatchDeleteBuilds
     *         service method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchDeleteBuildsResult batchDeleteBuilds(
            BatchDeleteBuildsRequest batchDeleteBuildsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchDeleteBuildsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteBuildsRequest> request = null;
        Response<BatchDeleteBuildsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteBuildsRequestMarshaller()
                        .marshall(batchDeleteBuildsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchDeleteBuildsResult, JsonUnmarshallerContext> unmarshaller = new BatchDeleteBuildsResultJsonUnmarshaller();
            JsonResponseHandler<BatchDeleteBuildsResult> responseHandler = new JsonResponseHandler<BatchDeleteBuildsResult>(
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
     * Gets information about one or more builds.
     * </p>
     * 
     * @param batchGetBuildsRequest
     * @return batchGetBuildsResult The response from the BatchGetBuilds service
     *         method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchGetBuildsResult batchGetBuilds(BatchGetBuildsRequest batchGetBuildsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchGetBuildsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetBuildsRequest> request = null;
        Response<BatchGetBuildsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetBuildsRequestMarshaller().marshall(batchGetBuildsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetBuildsResult, JsonUnmarshallerContext> unmarshaller = new BatchGetBuildsResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetBuildsResult> responseHandler = new JsonResponseHandler<BatchGetBuildsResult>(
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
     * Gets information about one or more build projects.
     * </p>
     * 
     * @param batchGetProjectsRequest
     * @return batchGetProjectsResult The response from the BatchGetProjects
     *         service method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchGetProjectsResult batchGetProjects(BatchGetProjectsRequest batchGetProjectsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchGetProjectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetProjectsRequest> request = null;
        Response<BatchGetProjectsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetProjectsRequestMarshaller().marshall(batchGetProjectsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetProjectsResult, JsonUnmarshallerContext> unmarshaller = new BatchGetProjectsResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetProjectsResult> responseHandler = new JsonResponseHandler<BatchGetProjectsResult>(
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
     * Returns an array of report groups.
     * </p>
     * 
     * @param batchGetReportGroupsRequest
     * @return batchGetReportGroupsResult The response from the
     *         BatchGetReportGroups service method, as returned by AWS
     *         CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchGetReportGroupsResult batchGetReportGroups(
            BatchGetReportGroupsRequest batchGetReportGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchGetReportGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetReportGroupsRequest> request = null;
        Response<BatchGetReportGroupsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetReportGroupsRequestMarshaller()
                        .marshall(batchGetReportGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetReportGroupsResult, JsonUnmarshallerContext> unmarshaller = new BatchGetReportGroupsResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetReportGroupsResult> responseHandler = new JsonResponseHandler<BatchGetReportGroupsResult>(
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
     * Returns an array of reports.
     * </p>
     * 
     * @param batchGetReportsRequest
     * @return batchGetReportsResult The response from the BatchGetReports
     *         service method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchGetReportsResult batchGetReports(BatchGetReportsRequest batchGetReportsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchGetReportsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetReportsRequest> request = null;
        Response<BatchGetReportsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetReportsRequestMarshaller().marshall(batchGetReportsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetReportsResult, JsonUnmarshallerContext> unmarshaller = new BatchGetReportsResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetReportsResult> responseHandler = new JsonResponseHandler<BatchGetReportsResult>(
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
     * Creates a build project.
     * </p>
     * 
     * @param createProjectRequest
     * @return createProjectResult The response from the CreateProject service
     *         method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceAlreadyExistsException
     * @throws AccountLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateProjectResult createProject(CreateProjectRequest createProjectRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProjectRequest> request = null;
        Response<CreateProjectResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProjectRequestMarshaller().marshall(createProjectRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateProjectResult, JsonUnmarshallerContext> unmarshaller = new CreateProjectResultJsonUnmarshaller();
            JsonResponseHandler<CreateProjectResult> responseHandler = new JsonResponseHandler<CreateProjectResult>(
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
     * Creates a report group. A report group contains a collection of reports.
     * </p>
     * 
     * @param createReportGroupRequest
     * @return createReportGroupResult The response from the CreateReportGroup
     *         service method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceAlreadyExistsException
     * @throws AccountLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateReportGroupResult createReportGroup(
            CreateReportGroupRequest createReportGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createReportGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReportGroupRequest> request = null;
        Response<CreateReportGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReportGroupRequestMarshaller()
                        .marshall(createReportGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateReportGroupResult, JsonUnmarshallerContext> unmarshaller = new CreateReportGroupResultJsonUnmarshaller();
            JsonResponseHandler<CreateReportGroupResult> responseHandler = new JsonResponseHandler<CreateReportGroupResult>(
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
     * For an existing AWS CodeBuild build project that has its source code
     * stored in a GitHub or Bitbucket repository, enables AWS CodeBuild to
     * start rebuilding the source code every time a code change is pushed to
     * the repository.
     * </p>
     * <important>
     * <p>
     * If you enable webhooks for an AWS CodeBuild project, and the project is
     * used as a build step in AWS CodePipeline, then two identical builds are
     * created for each commit. One build is triggered through webhooks, and one
     * through AWS CodePipeline. Because billing is on a per-build basis, you
     * are billed for both builds. Therefore, if you are using AWS CodePipeline,
     * we recommend that you disable webhooks in AWS CodeBuild. In the AWS
     * CodeBuild console, clear the Webhook box. For more information, see step
     * 5 in <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/change-project.html#change-project-console"
     * >Change a Build Project's Settings</a>.
     * </p>
     * </important>
     * 
     * @param createWebhookRequest
     * @return createWebhookResult The response from the CreateWebhook service
     *         method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws OAuthProviderException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateWebhookResult createWebhook(CreateWebhookRequest createWebhookRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createWebhookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWebhookRequest> request = null;
        Response<CreateWebhookResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWebhookRequestMarshaller().marshall(createWebhookRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateWebhookResult, JsonUnmarshallerContext> unmarshaller = new CreateWebhookResultJsonUnmarshaller();
            JsonResponseHandler<CreateWebhookResult> responseHandler = new JsonResponseHandler<CreateWebhookResult>(
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
     * Deletes a build project. When you delete a project, its builds are not
     * deleted.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return deleteProjectResult The response from the DeleteProject service
     *         method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteProjectResult deleteProject(DeleteProjectRequest deleteProjectRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProjectRequest> request = null;
        Response<DeleteProjectResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProjectRequestMarshaller().marshall(deleteProjectRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteProjectResult, JsonUnmarshallerContext> unmarshaller = new DeleteProjectResultJsonUnmarshaller();
            JsonResponseHandler<DeleteProjectResult> responseHandler = new JsonResponseHandler<DeleteProjectResult>(
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
     * Deletes a report.
     * </p>
     * 
     * @param deleteReportRequest
     * @return deleteReportResult The response from the DeleteReport service
     *         method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteReportResult deleteReport(DeleteReportRequest deleteReportRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteReportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReportRequest> request = null;
        Response<DeleteReportResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReportRequestMarshaller().marshall(deleteReportRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteReportResult, JsonUnmarshallerContext> unmarshaller = new DeleteReportResultJsonUnmarshaller();
            JsonResponseHandler<DeleteReportResult> responseHandler = new JsonResponseHandler<DeleteReportResult>(
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
     * <code>DeleteReportGroup</code>: Deletes a report group. Before you delete
     * a report group, you must delete its reports. Use <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/APIReference/API_ListReportsForReportGroup.html"
     * >ListReportsForReportGroup</a> to get the reports in a report group. Use
     * <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/APIReference/API_DeleteReport.html"
     * >DeleteReport</a> to delete the reports. If you call
     * <code>DeleteReportGroup</code> for a report group that contains one or
     * more reports, an exception is thrown.
     * </p>
     * 
     * @param deleteReportGroupRequest
     * @return deleteReportGroupResult The response from the DeleteReportGroup
     *         service method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteReportGroupResult deleteReportGroup(
            DeleteReportGroupRequest deleteReportGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteReportGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReportGroupRequest> request = null;
        Response<DeleteReportGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReportGroupRequestMarshaller()
                        .marshall(deleteReportGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteReportGroupResult, JsonUnmarshallerContext> unmarshaller = new DeleteReportGroupResultJsonUnmarshaller();
            JsonResponseHandler<DeleteReportGroupResult> responseHandler = new JsonResponseHandler<DeleteReportGroupResult>(
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
     * Deletes a resource policy that is identified by its resource ARN.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return deleteResourcePolicyResult The response from the
     *         DeleteResourcePolicy service method, as returned by AWS
     *         CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteResourcePolicyResult deleteResourcePolicy(
            DeleteResourcePolicyRequest deleteResourcePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourcePolicyRequest> request = null;
        Response<DeleteResourcePolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourcePolicyRequestMarshaller()
                        .marshall(deleteResourcePolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteResourcePolicyResult, JsonUnmarshallerContext> unmarshaller = new DeleteResourcePolicyResultJsonUnmarshaller();
            JsonResponseHandler<DeleteResourcePolicyResult> responseHandler = new JsonResponseHandler<DeleteResourcePolicyResult>(
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
     * Deletes a set of GitHub, GitHub Enterprise, or Bitbucket source
     * credentials.
     * </p>
     * 
     * @param deleteSourceCredentialsRequest
     * @return deleteSourceCredentialsResult The response from the
     *         DeleteSourceCredentials service method, as returned by AWS
     *         CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteSourceCredentialsResult deleteSourceCredentials(
            DeleteSourceCredentialsRequest deleteSourceCredentialsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteSourceCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSourceCredentialsRequest> request = null;
        Response<DeleteSourceCredentialsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSourceCredentialsRequestMarshaller()
                        .marshall(deleteSourceCredentialsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteSourceCredentialsResult, JsonUnmarshallerContext> unmarshaller = new DeleteSourceCredentialsResultJsonUnmarshaller();
            JsonResponseHandler<DeleteSourceCredentialsResult> responseHandler = new JsonResponseHandler<DeleteSourceCredentialsResult>(
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
     * For an existing AWS CodeBuild build project that has its source code
     * stored in a GitHub or Bitbucket repository, stops AWS CodeBuild from
     * rebuilding the source code every time a code change is pushed to the
     * repository.
     * </p>
     * 
     * @param deleteWebhookRequest
     * @return deleteWebhookResult The response from the DeleteWebhook service
     *         method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws OAuthProviderException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteWebhookResult deleteWebhook(DeleteWebhookRequest deleteWebhookRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteWebhookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWebhookRequest> request = null;
        Response<DeleteWebhookResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWebhookRequestMarshaller().marshall(deleteWebhookRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteWebhookResult, JsonUnmarshallerContext> unmarshaller = new DeleteWebhookResultJsonUnmarshaller();
            JsonResponseHandler<DeleteWebhookResult> responseHandler = new JsonResponseHandler<DeleteWebhookResult>(
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
     * Returns a list of details about test cases for a report.
     * </p>
     * 
     * @param describeTestCasesRequest
     * @return describeTestCasesResult The response from the DescribeTestCases
     *         service method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeTestCasesResult describeTestCases(
            DescribeTestCasesRequest describeTestCasesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTestCasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTestCasesRequest> request = null;
        Response<DescribeTestCasesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTestCasesRequestMarshaller()
                        .marshall(describeTestCasesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTestCasesResult, JsonUnmarshallerContext> unmarshaller = new DescribeTestCasesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTestCasesResult> responseHandler = new JsonResponseHandler<DescribeTestCasesResult>(
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
     * Gets a resource policy that is identified by its resource ARN.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return getResourcePolicyResult The response from the GetResourcePolicy
     *         service method, as returned by AWS CodeBuild.
     * @throws ResourceNotFoundException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetResourcePolicyResult getResourcePolicy(
            GetResourcePolicyRequest getResourcePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourcePolicyRequest> request = null;
        Response<GetResourcePolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourcePolicyRequestMarshaller()
                        .marshall(getResourcePolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetResourcePolicyResult, JsonUnmarshallerContext> unmarshaller = new GetResourcePolicyResultJsonUnmarshaller();
            JsonResponseHandler<GetResourcePolicyResult> responseHandler = new JsonResponseHandler<GetResourcePolicyResult>(
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
     * Imports the source repository credentials for an AWS CodeBuild project
     * that has its source code stored in a GitHub, GitHub Enterprise, or
     * Bitbucket repository.
     * </p>
     * 
     * @param importSourceCredentialsRequest
     * @return importSourceCredentialsResult The response from the
     *         ImportSourceCredentials service method, as returned by AWS
     *         CodeBuild.
     * @throws InvalidInputException
     * @throws AccountLimitExceededException
     * @throws ResourceAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ImportSourceCredentialsResult importSourceCredentials(
            ImportSourceCredentialsRequest importSourceCredentialsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(importSourceCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportSourceCredentialsRequest> request = null;
        Response<ImportSourceCredentialsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportSourceCredentialsRequestMarshaller()
                        .marshall(importSourceCredentialsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ImportSourceCredentialsResult, JsonUnmarshallerContext> unmarshaller = new ImportSourceCredentialsResultJsonUnmarshaller();
            JsonResponseHandler<ImportSourceCredentialsResult> responseHandler = new JsonResponseHandler<ImportSourceCredentialsResult>(
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
     * Resets the cache for a project.
     * </p>
     * 
     * @param invalidateProjectCacheRequest
     * @return invalidateProjectCacheResult The response from the
     *         InvalidateProjectCache service method, as returned by AWS
     *         CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public InvalidateProjectCacheResult invalidateProjectCache(
            InvalidateProjectCacheRequest invalidateProjectCacheRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(invalidateProjectCacheRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InvalidateProjectCacheRequest> request = null;
        Response<InvalidateProjectCacheResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InvalidateProjectCacheRequestMarshaller()
                        .marshall(invalidateProjectCacheRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<InvalidateProjectCacheResult, JsonUnmarshallerContext> unmarshaller = new InvalidateProjectCacheResultJsonUnmarshaller();
            JsonResponseHandler<InvalidateProjectCacheResult> responseHandler = new JsonResponseHandler<InvalidateProjectCacheResult>(
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
     * Gets a list of build IDs, with each build ID representing a single build.
     * </p>
     * 
     * @param listBuildsRequest
     * @return listBuildsResult The response from the ListBuilds service method,
     *         as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListBuildsResult listBuilds(ListBuildsRequest listBuildsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listBuildsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBuildsRequest> request = null;
        Response<ListBuildsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBuildsRequestMarshaller().marshall(listBuildsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListBuildsResult, JsonUnmarshallerContext> unmarshaller = new ListBuildsResultJsonUnmarshaller();
            JsonResponseHandler<ListBuildsResult> responseHandler = new JsonResponseHandler<ListBuildsResult>(
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
     * Gets a list of build IDs for the specified build project, with each build
     * ID representing a single build.
     * </p>
     * 
     * @param listBuildsForProjectRequest
     * @return listBuildsForProjectResult The response from the
     *         ListBuildsForProject service method, as returned by AWS
     *         CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListBuildsForProjectResult listBuildsForProject(
            ListBuildsForProjectRequest listBuildsForProjectRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listBuildsForProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBuildsForProjectRequest> request = null;
        Response<ListBuildsForProjectResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBuildsForProjectRequestMarshaller()
                        .marshall(listBuildsForProjectRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListBuildsForProjectResult, JsonUnmarshallerContext> unmarshaller = new ListBuildsForProjectResultJsonUnmarshaller();
            JsonResponseHandler<ListBuildsForProjectResult> responseHandler = new JsonResponseHandler<ListBuildsForProjectResult>(
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
     * Gets information about Docker images that are managed by AWS CodeBuild.
     * </p>
     * 
     * @param listCuratedEnvironmentImagesRequest
     * @return listCuratedEnvironmentImagesResult The response from the
     *         ListCuratedEnvironmentImages service method, as returned by AWS
     *         CodeBuild.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListCuratedEnvironmentImagesResult listCuratedEnvironmentImages(
            ListCuratedEnvironmentImagesRequest listCuratedEnvironmentImagesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listCuratedEnvironmentImagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCuratedEnvironmentImagesRequest> request = null;
        Response<ListCuratedEnvironmentImagesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCuratedEnvironmentImagesRequestMarshaller()
                        .marshall(listCuratedEnvironmentImagesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListCuratedEnvironmentImagesResult, JsonUnmarshallerContext> unmarshaller = new ListCuratedEnvironmentImagesResultJsonUnmarshaller();
            JsonResponseHandler<ListCuratedEnvironmentImagesResult> responseHandler = new JsonResponseHandler<ListCuratedEnvironmentImagesResult>(
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
     * Gets a list of build project names, with each build project name
     * representing a single build project.
     * </p>
     * 
     * @param listProjectsRequest
     * @return listProjectsResult The response from the ListProjects service
     *         method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListProjectsResult listProjects(ListProjectsRequest listProjectsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listProjectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProjectsRequest> request = null;
        Response<ListProjectsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProjectsRequestMarshaller().marshall(listProjectsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListProjectsResult, JsonUnmarshallerContext> unmarshaller = new ListProjectsResultJsonUnmarshaller();
            JsonResponseHandler<ListProjectsResult> responseHandler = new JsonResponseHandler<ListProjectsResult>(
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
     * Gets a list ARNs for the report groups in the current AWS account.
     * </p>
     * 
     * @param listReportGroupsRequest
     * @return listReportGroupsResult The response from the ListReportGroups
     *         service method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListReportGroupsResult listReportGroups(ListReportGroupsRequest listReportGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listReportGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReportGroupsRequest> request = null;
        Response<ListReportGroupsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReportGroupsRequestMarshaller().marshall(listReportGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListReportGroupsResult, JsonUnmarshallerContext> unmarshaller = new ListReportGroupsResultJsonUnmarshaller();
            JsonResponseHandler<ListReportGroupsResult> responseHandler = new JsonResponseHandler<ListReportGroupsResult>(
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
     * Returns a list of ARNs for the reports in the current AWS account.
     * </p>
     * 
     * @param listReportsRequest
     * @return listReportsResult The response from the ListReports service
     *         method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListReportsResult listReports(ListReportsRequest listReportsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listReportsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReportsRequest> request = null;
        Response<ListReportsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReportsRequestMarshaller().marshall(listReportsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListReportsResult, JsonUnmarshallerContext> unmarshaller = new ListReportsResultJsonUnmarshaller();
            JsonResponseHandler<ListReportsResult> responseHandler = new JsonResponseHandler<ListReportsResult>(
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
     * Returns a list of ARNs for the reports that belong to a
     * <code>ReportGroup</code>.
     * </p>
     * 
     * @param listReportsForReportGroupRequest
     * @return listReportsForReportGroupResult The response from the
     *         ListReportsForReportGroup service method, as returned by AWS
     *         CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListReportsForReportGroupResult listReportsForReportGroup(
            ListReportsForReportGroupRequest listReportsForReportGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listReportsForReportGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReportsForReportGroupRequest> request = null;
        Response<ListReportsForReportGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReportsForReportGroupRequestMarshaller()
                        .marshall(listReportsForReportGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListReportsForReportGroupResult, JsonUnmarshallerContext> unmarshaller = new ListReportsForReportGroupResultJsonUnmarshaller();
            JsonResponseHandler<ListReportsForReportGroupResult> responseHandler = new JsonResponseHandler<ListReportsForReportGroupResult>(
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
     * Gets a list of projects that are shared with other AWS accounts or users.
     * </p>
     * 
     * @param listSharedProjectsRequest
     * @return listSharedProjectsResult The response from the ListSharedProjects
     *         service method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListSharedProjectsResult listSharedProjects(
            ListSharedProjectsRequest listSharedProjectsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listSharedProjectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSharedProjectsRequest> request = null;
        Response<ListSharedProjectsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSharedProjectsRequestMarshaller()
                        .marshall(listSharedProjectsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListSharedProjectsResult, JsonUnmarshallerContext> unmarshaller = new ListSharedProjectsResultJsonUnmarshaller();
            JsonResponseHandler<ListSharedProjectsResult> responseHandler = new JsonResponseHandler<ListSharedProjectsResult>(
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
     * Gets a list of report groups that are shared with other AWS accounts or
     * users.
     * </p>
     * 
     * @param listSharedReportGroupsRequest
     * @return listSharedReportGroupsResult The response from the
     *         ListSharedReportGroups service method, as returned by AWS
     *         CodeBuild.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListSharedReportGroupsResult listSharedReportGroups(
            ListSharedReportGroupsRequest listSharedReportGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listSharedReportGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSharedReportGroupsRequest> request = null;
        Response<ListSharedReportGroupsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSharedReportGroupsRequestMarshaller()
                        .marshall(listSharedReportGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListSharedReportGroupsResult, JsonUnmarshallerContext> unmarshaller = new ListSharedReportGroupsResultJsonUnmarshaller();
            JsonResponseHandler<ListSharedReportGroupsResult> responseHandler = new JsonResponseHandler<ListSharedReportGroupsResult>(
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
     * Returns a list of <code>SourceCredentialsInfo</code> objects.
     * </p>
     * 
     * @param listSourceCredentialsRequest
     * @return listSourceCredentialsResult The response from the
     *         ListSourceCredentials service method, as returned by AWS
     *         CodeBuild.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListSourceCredentialsResult listSourceCredentials(
            ListSourceCredentialsRequest listSourceCredentialsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listSourceCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSourceCredentialsRequest> request = null;
        Response<ListSourceCredentialsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSourceCredentialsRequestMarshaller()
                        .marshall(listSourceCredentialsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListSourceCredentialsResult, JsonUnmarshallerContext> unmarshaller = new ListSourceCredentialsResultJsonUnmarshaller();
            JsonResponseHandler<ListSourceCredentialsResult> responseHandler = new JsonResponseHandler<ListSourceCredentialsResult>(
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
     * Stores a resource policy for the ARN of a <code>Project</code> or
     * <code>ReportGroup</code> object.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return putResourcePolicyResult The response from the PutResourcePolicy
     *         service method, as returned by AWS CodeBuild.
     * @throws ResourceNotFoundException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutResourcePolicyResult putResourcePolicy(
            PutResourcePolicyRequest putResourcePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutResourcePolicyRequest> request = null;
        Response<PutResourcePolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutResourcePolicyRequestMarshaller()
                        .marshall(putResourcePolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutResourcePolicyResult, JsonUnmarshallerContext> unmarshaller = new PutResourcePolicyResultJsonUnmarshaller();
            JsonResponseHandler<PutResourcePolicyResult> responseHandler = new JsonResponseHandler<PutResourcePolicyResult>(
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
     * Starts running a build.
     * </p>
     * 
     * @param startBuildRequest
     * @return startBuildResult The response from the StartBuild service method,
     *         as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AccountLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartBuildResult startBuild(StartBuildRequest startBuildRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startBuildRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartBuildRequest> request = null;
        Response<StartBuildResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartBuildRequestMarshaller().marshall(startBuildRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartBuildResult, JsonUnmarshallerContext> unmarshaller = new StartBuildResultJsonUnmarshaller();
            JsonResponseHandler<StartBuildResult> responseHandler = new JsonResponseHandler<StartBuildResult>(
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
     * Attempts to stop running a build.
     * </p>
     * 
     * @param stopBuildRequest
     * @return stopBuildResult The response from the StopBuild service method,
     *         as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StopBuildResult stopBuild(StopBuildRequest stopBuildRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopBuildRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopBuildRequest> request = null;
        Response<StopBuildResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopBuildRequestMarshaller().marshall(stopBuildRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopBuildResult, JsonUnmarshallerContext> unmarshaller = new StopBuildResultJsonUnmarshaller();
            JsonResponseHandler<StopBuildResult> responseHandler = new JsonResponseHandler<StopBuildResult>(
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
     * Changes the settings of a build project.
     * </p>
     * 
     * @param updateProjectRequest
     * @return updateProjectResult The response from the UpdateProject service
     *         method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateProjectResult updateProject(UpdateProjectRequest updateProjectRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProjectRequest> request = null;
        Response<UpdateProjectResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProjectRequestMarshaller().marshall(updateProjectRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateProjectResult, JsonUnmarshallerContext> unmarshaller = new UpdateProjectResultJsonUnmarshaller();
            JsonResponseHandler<UpdateProjectResult> responseHandler = new JsonResponseHandler<UpdateProjectResult>(
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
     * Updates a report group.
     * </p>
     * 
     * @param updateReportGroupRequest
     * @return updateReportGroupResult The response from the UpdateReportGroup
     *         service method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateReportGroupResult updateReportGroup(
            UpdateReportGroupRequest updateReportGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateReportGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateReportGroupRequest> request = null;
        Response<UpdateReportGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateReportGroupRequestMarshaller()
                        .marshall(updateReportGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateReportGroupResult, JsonUnmarshallerContext> unmarshaller = new UpdateReportGroupResultJsonUnmarshaller();
            JsonResponseHandler<UpdateReportGroupResult> responseHandler = new JsonResponseHandler<UpdateReportGroupResult>(
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
     * Updates the webhook associated with an AWS CodeBuild build project.
     * </p>
     * <note>
     * <p>
     * If you use Bitbucket for your repository, <code>rotateSecret</code> is
     * ignored.
     * </p>
     * </note>
     * 
     * @param updateWebhookRequest
     * @return updateWebhookResult The response from the UpdateWebhook service
     *         method, as returned by AWS CodeBuild.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws OAuthProviderException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeBuild indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateWebhookResult updateWebhook(UpdateWebhookRequest updateWebhookRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateWebhookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWebhookRequest> request = null;
        Response<UpdateWebhookResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWebhookRequestMarshaller().marshall(updateWebhookRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateWebhookResult, JsonUnmarshallerContext> unmarshaller = new UpdateWebhookResultJsonUnmarshaller();
            JsonResponseHandler<UpdateWebhookResult> responseHandler = new JsonResponseHandler<UpdateWebhookResult>(
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
