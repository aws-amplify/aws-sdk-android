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
package com.amazonaws.services.amazonimportexportsnowball;

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

import com.amazonaws.services.amazonimportexportsnowball.model.*;
import com.amazonaws.services.amazonimportexportsnowball.model.transform.*;

/**
 * Client for accessing Amazon Import/Export Snowball.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <p>AWS Snowball is a petabyte-scale data transport solution that uses secure devices to transfer large amounts of data between your on-premises data centers and Amazon Simple Storage Service (Amazon S3). The Snowball commands described here provide access to the same functionality that is available in the AWS Snowball Management Console, which enables you to create and manage jobs for Snowball. To transfer data locally with a Snowball device, you'll need to use the Snowball client or the Amazon S3 API adapter for Snowball. For more information, see the <a href="https://docs.aws.amazon.com/AWSImportExport/latest/ug/api-reference.html">User Guide</a>.</p>
 */
public class AmazonImport/ExportSnowballClient extends AmazonWebServiceClient implements AmazonImport/ExportSnowball { 
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Import/Export Snowball exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AmazonImport/ExportSnowball.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonImport/ExportSnowballClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonImport/ExportSnowball.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonImport/ExportSnowball
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonImport/ExportSnowballClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonImport/ExportSnowball using the specified AWS account credentials.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor.
     *
     * Static AWSCredentials can be passed for quick testing. However,
     * it is strongly recommended to use Amazon Cognito vended
     * temporary credentials for use in production. This can be
     * achieved by using {@link AWSMobileClient}. Please see 
     * https://aws-amplify.github.io/docs/android/authentication 
     * for instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#64;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonImport/ExportSnowballClient client = new AmazonImport/ExportSnowballClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#64;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonImport/ExportSnowballClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonImport/ExportSnowball using the specified AWS account credentials
     * and client configuration options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor.
     *
     * Static AWSCredentials can be passed for quick testing. However,
     * it is strongly recommended to use Amazon Cognito vended
     * temporary credentials for use in production. This can be
     * achieved by using {@link AWSMobileClient}. Please see 
     * https://aws-amplify.github.io/docs/android/authentication 
     * for instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#64;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonImport/ExportSnowballClient client = new AmazonImport/ExportSnowballClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#64;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonImport/ExportSnowball
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonImport/ExportSnowballClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonImport/ExportSnowball using the specified AWS account credentials provider.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}.
     *
     * Static AWSCredentials can be passed for quick testing. However,
     * it is strongly recommended to use Amazon Cognito vended
     * temporary credentials for use in production. This can be
     * achieved by using {@link AWSMobileClient}. Please see 
     * https://aws-amplify.github.io/docs/android/authentication 
     * for instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#64;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonImport/ExportSnowballClient client = new AmazonImport/ExportSnowballClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#64;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonImport/ExportSnowballClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonImport/ExportSnowball using the specified AWS account credentials
     * provider and client configuration options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}.
     *
     * Static AWSCredentials can be passed for quick testing. However,
     * it is strongly recommended to use Amazon Cognito vended
     * temporary credentials for use in production. This can be
     * achieved by using {@link AWSMobileClient}. Please see 
     * https://aws-amplify.github.io/docs/android/authentication 
     * for instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#64;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonImport/ExportSnowballClient client = new AmazonImport/ExportSnowballClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#64;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonImport/ExportSnowball
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonImport/ExportSnowballClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonImport/ExportSnowball using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonImport/ExportSnowball
     *                       (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonImport/ExportSnowballClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonImport/ExportSnowball using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}.
     *
     * Static AWSCredentials can be passed for quick testing. However,
     * it is strongly recommended to use Amazon Cognito vended
     * temporary credentials for use in production. This can be
     * achieved by using {@link AWSMobileClient}. Please see 
     * https://aws-amplify.github.io/docs/android/authentication 
     * for instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#64;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonImport/ExportSnowballClient client = new AmazonImport/ExportSnowballClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#64;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonImport/ExportSnowball
     *                       (ex: proxy settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonImport/ExportSnowballClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new ClusterLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new Ec2RequestFailedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidAddressExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidInputCombinationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidJobStateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidNextTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidResourceExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new KMSRequestFailedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedAddressExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());
        
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("snowball.us-east-1.amazonaws.com");
        this.endpointPrefix = "snowball";
        
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/amazonimportexportsnowball/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/amazonimportexportsnowball/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>Cancels a cluster job. You can only cancel a cluster job while it's in the <code>AwaitingQuorum</code> status. You'll have at least an hour after creating a cluster job to cancel it.</p>
     * @param cancelClusterRequest 
     * @return cancelClusterResult The response from the CancelCluster service method, as returned by Amazon Import/Export Snowball.
     * @throws KMSRequestFailedException 
     * @throws InvalidJobStateException 
     * @throws InvalidResourceException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CancelClusterResult cancelCluster(CancelClusterRequest cancelClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(cancelClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelClusterRequest> request = null;
        Response<CancelClusterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelClusterRequestMarshaller().marshall(cancelClusterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CancelClusterResult, JsonUnmarshallerContext> unmarshaller = new CancelClusterResultJsonUnmarshaller();
            JsonResponseHandler<CancelClusterResult> responseHandler = new JsonResponseHandler<CancelClusterResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Cancels the specified job. You can only cancel a job before its <code>JobState</code> value changes to <code>PreparingAppliance</code>. Requesting the <code>ListJobs</code> or <code>DescribeJob</code> action returns a job's <code>JobState</code> as part of the response element data returned.</p>
     * @param cancelJobRequest 
     * @return cancelJobResult The response from the CancelJob service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws InvalidJobStateException 
     * @throws KMSRequestFailedException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CancelJobResult cancelJob(CancelJobRequest cancelJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(cancelJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelJobRequest> request = null;
        Response<CancelJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelJobRequestMarshaller().marshall(cancelJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CancelJobResult, JsonUnmarshallerContext> unmarshaller = new CancelJobResultJsonUnmarshaller();
            JsonResponseHandler<CancelJobResult> responseHandler = new JsonResponseHandler<CancelJobResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Creates an address for a Snowball to be shipped to. In most regions, addresses are validated at the time of creation. The address you provide must be located within the serviceable area of your region. If the address is invalid or unsupported, then an exception is thrown.</p>
     * @param createAddressRequest 
     * @return createAddressResult The response from the CreateAddress service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidAddressException 
     * @throws UnsupportedAddressException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateAddressResult createAddress(CreateAddressRequest createAddressRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createAddressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAddressRequest> request = null;
        Response<CreateAddressResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAddressRequestMarshaller().marshall(createAddressRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateAddressResult, JsonUnmarshallerContext> unmarshaller = new CreateAddressResultJsonUnmarshaller();
            JsonResponseHandler<CreateAddressResult> responseHandler = new JsonResponseHandler<CreateAddressResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Creates an empty cluster. Each cluster supports five nodes. You use the <a>CreateJob</a> action separately to create the jobs for each of these nodes. The cluster does not ship until these five node jobs have been created.</p>
     * @param createClusterRequest 
     * @return createClusterResult The response from the CreateCluster service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws KMSRequestFailedException 
     * @throws InvalidInputCombinationException 
     * @throws Ec2RequestFailedException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateClusterResult createCluster(CreateClusterRequest createClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClusterRequest> request = null;
        Response<CreateClusterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateClusterRequestMarshaller().marshall(createClusterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateClusterResult, JsonUnmarshallerContext> unmarshaller = new CreateClusterResultJsonUnmarshaller();
            JsonResponseHandler<CreateClusterResult> responseHandler = new JsonResponseHandler<CreateClusterResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Creates a job to import or export data between Amazon S3 and your on-premises data center. Your AWS account must have the right trust policies and permissions in place to create a job for Snowball. If you're creating a job for a node in a cluster, you only need to provide the <code>clusterId</code> value; the other job attributes are inherited from the cluster. </p>
     * @param createJobRequest 
     * @return createJobResult The response from the CreateJob service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws KMSRequestFailedException 
     * @throws InvalidInputCombinationException 
     * @throws ClusterLimitExceededException 
     * @throws Ec2RequestFailedException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateJobResult createJob(CreateJobRequest createJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateJobRequest> request = null;
        Response<CreateJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateJobRequestMarshaller().marshall(createJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateJobResult, JsonUnmarshallerContext> unmarshaller = new CreateJobResultJsonUnmarshaller();
            JsonResponseHandler<CreateJobResult> responseHandler = new JsonResponseHandler<CreateJobResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Takes an <code>AddressId</code> and returns specific details about that address in the form of an <code>Address</code> object.</p>
     * @param describeAddressRequest 
     * @return describeAddressResult The response from the DescribeAddress service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAddressResult describeAddress(DescribeAddressRequest describeAddressRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAddressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAddressRequest> request = null;
        Response<DescribeAddressResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAddressRequestMarshaller().marshall(describeAddressRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAddressResult, JsonUnmarshallerContext> unmarshaller = new DescribeAddressResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAddressResult> responseHandler = new JsonResponseHandler<DescribeAddressResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Returns a specified number of <code>ADDRESS</code> objects. Calling this API in one of the US regions will return addresses from the list of all addresses associated with this account in all US regions.</p>
     * @param describeAddressesRequest 
     * @return describeAddressesResult The response from the DescribeAddresses service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws InvalidNextTokenException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAddressesResult describeAddresses(DescribeAddressesRequest describeAddressesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAddressesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAddressesRequest> request = null;
        Response<DescribeAddressesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAddressesRequestMarshaller().marshall(describeAddressesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeAddressesResult, JsonUnmarshallerContext> unmarshaller = new DescribeAddressesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeAddressesResult> responseHandler = new JsonResponseHandler<DescribeAddressesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Returns information about a specific cluster including shipping information, cluster status, and other important metadata.</p>
     * @param describeClusterRequest 
     * @return describeClusterResult The response from the DescribeCluster service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClusterResult describeCluster(DescribeClusterRequest describeClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterRequest> request = null;
        Response<DescribeClusterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClusterRequestMarshaller().marshall(describeClusterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeClusterResult, JsonUnmarshallerContext> unmarshaller = new DescribeClusterResultJsonUnmarshaller();
            JsonResponseHandler<DescribeClusterResult> responseHandler = new JsonResponseHandler<DescribeClusterResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Returns information about a specific job including shipping information, job status, and other important metadata. </p>
     * @param describeJobRequest 
     * @return describeJobResult The response from the DescribeJob service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeJobResult describeJob(DescribeJobRequest describeJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeJobRequest> request = null;
        Response<DescribeJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeJobRequestMarshaller().marshall(describeJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeJobResult, JsonUnmarshallerContext> unmarshaller = new DescribeJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribeJobResult> responseHandler = new JsonResponseHandler<DescribeJobResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Returns a link to an Amazon S3 presigned URL for the manifest file associated with the specified <code>JobId</code> value. You can access the manifest file for up to 60 minutes after this request has been made. To access the manifest file after 60 minutes have passed, you'll have to make another call to the <code>GetJobManifest</code> action.</p> <p>The manifest is an encrypted file that you can download after your job enters the <code>WithCustomer</code> status. The manifest is decrypted by using the <code>UnlockCode</code> code value, when you pass both values to the Snowball through the Snowball client when the client is started for the first time.</p> <p>As a best practice, we recommend that you don't save a copy of an <code>UnlockCode</code> value in the same location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access to the Snowball associated with that job.</p> <p>The credentials of a given job, including its manifest file and unlock code, expire 90 days after the job is created.</p>
     * @param getJobManifestRequest 
     * @return getJobManifestResult The response from the GetJobManifest service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws InvalidJobStateException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetJobManifestResult getJobManifest(GetJobManifestRequest getJobManifestRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getJobManifestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobManifestRequest> request = null;
        Response<GetJobManifestResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobManifestRequestMarshaller().marshall(getJobManifestRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetJobManifestResult, JsonUnmarshallerContext> unmarshaller = new GetJobManifestResultJsonUnmarshaller();
            JsonResponseHandler<GetJobManifestResult> responseHandler = new JsonResponseHandler<GetJobManifestResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Returns the <code>UnlockCode</code> code value for the specified job. A particular <code>UnlockCode</code> value can be accessed for up to 90 days after the associated job has been created.</p> <p>The <code>UnlockCode</code> value is a 29-character code with 25 alphanumeric characters and 4 hyphens. This code is used to decrypt the manifest file when it is passed along with the manifest to the Snowball through the Snowball client when the client is started for the first time.</p> <p>As a best practice, we recommend that you don't save a copy of the <code>UnlockCode</code> in the same location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access to the Snowball associated with that job.</p>
     * @param getJobUnlockCodeRequest 
     * @return getJobUnlockCodeResult The response from the GetJobUnlockCode service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws InvalidJobStateException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetJobUnlockCodeResult getJobUnlockCode(GetJobUnlockCodeRequest getJobUnlockCodeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getJobUnlockCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobUnlockCodeRequest> request = null;
        Response<GetJobUnlockCodeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobUnlockCodeRequestMarshaller().marshall(getJobUnlockCodeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetJobUnlockCodeResult, JsonUnmarshallerContext> unmarshaller = new GetJobUnlockCodeResultJsonUnmarshaller();
            JsonResponseHandler<GetJobUnlockCodeResult> responseHandler = new JsonResponseHandler<GetJobUnlockCodeResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Returns information about the Snowball service limit for your account, and also the number of Snowballs your account has in use.</p> <p>The default service limit for the number of Snowballs that you can have at one time is 1. If you want to increase your service limit, contact AWS Support.</p>
     * @param getSnowballUsageRequest 
     * @return getSnowballUsageResult The response from the GetSnowballUsage service method, as returned by Amazon Import/Export Snowball.
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetSnowballUsageResult getSnowballUsage(GetSnowballUsageRequest getSnowballUsageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSnowballUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSnowballUsageRequest> request = null;
        Response<GetSnowballUsageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSnowballUsageRequestMarshaller().marshall(getSnowballUsageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSnowballUsageResult, JsonUnmarshallerContext> unmarshaller = new GetSnowballUsageResultJsonUnmarshaller();
            JsonResponseHandler<GetSnowballUsageResult> responseHandler = new JsonResponseHandler<GetSnowballUsageResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Returns an Amazon S3 presigned URL for an update file associated with a specified <code>JobId</code>.</p>
     * @param getSoftwareUpdatesRequest 
     * @return getSoftwareUpdatesResult The response from the GetSoftwareUpdates service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws InvalidJobStateException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetSoftwareUpdatesResult getSoftwareUpdates(GetSoftwareUpdatesRequest getSoftwareUpdatesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSoftwareUpdatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSoftwareUpdatesRequest> request = null;
        Response<GetSoftwareUpdatesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSoftwareUpdatesRequestMarshaller().marshall(getSoftwareUpdatesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSoftwareUpdatesResult, JsonUnmarshallerContext> unmarshaller = new GetSoftwareUpdatesResultJsonUnmarshaller();
            JsonResponseHandler<GetSoftwareUpdatesResult> responseHandler = new JsonResponseHandler<GetSoftwareUpdatesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Returns an array of <code>JobListEntry</code> objects of the specified length. Each <code>JobListEntry</code> object is for a job in the specified cluster and contains a job's state, a job's ID, and other information.</p>
     * @param listClusterJobsRequest 
     * @return listClusterJobsResult The response from the ListClusterJobs service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws InvalidNextTokenException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListClusterJobsResult listClusterJobs(ListClusterJobsRequest listClusterJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listClusterJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListClusterJobsRequest> request = null;
        Response<ListClusterJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListClusterJobsRequestMarshaller().marshall(listClusterJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListClusterJobsResult, JsonUnmarshallerContext> unmarshaller = new ListClusterJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListClusterJobsResult> responseHandler = new JsonResponseHandler<ListClusterJobsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Returns an array of <code>ClusterListEntry</code> objects of the specified length. Each <code>ClusterListEntry</code> object contains a cluster's state, a cluster's ID, and other important status information.</p>
     * @param listClustersRequest 
     * @return listClustersResult The response from the ListClusters service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidNextTokenException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListClustersResult listClusters(ListClustersRequest listClustersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListClustersRequest> request = null;
        Response<ListClustersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListClustersRequestMarshaller().marshall(listClustersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListClustersResult, JsonUnmarshallerContext> unmarshaller = new ListClustersResultJsonUnmarshaller();
            JsonResponseHandler<ListClustersResult> responseHandler = new JsonResponseHandler<ListClustersResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>This action returns a list of the different Amazon EC2 Amazon Machine Images (AMIs) that are owned by your AWS account that would be supported for use on a Snowball Edge device. Currently, supported AMIs are based on the CentOS 7 (x86_64) - with Updates HVM, Ubuntu Server 14.04 LTS (HVM), and Ubuntu 16.04 LTS - Xenial (HVM) images, available on the AWS Marketplace.</p>
     * @param listCompatibleImagesRequest 
     * @return listCompatibleImagesResult The response from the ListCompatibleImages service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidNextTokenException 
     * @throws Ec2RequestFailedException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListCompatibleImagesResult listCompatibleImages(ListCompatibleImagesRequest listCompatibleImagesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listCompatibleImagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCompatibleImagesRequest> request = null;
        Response<ListCompatibleImagesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCompatibleImagesRequestMarshaller().marshall(listCompatibleImagesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListCompatibleImagesResult, JsonUnmarshallerContext> unmarshaller = new ListCompatibleImagesResultJsonUnmarshaller();
            JsonResponseHandler<ListCompatibleImagesResult> responseHandler = new JsonResponseHandler<ListCompatibleImagesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Returns an array of <code>JobListEntry</code> objects of the specified length. Each <code>JobListEntry</code> object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case of export jobs. Calling this API action in one of the US regions will return jobs from the list of all jobs associated with this account in all US regions.</p>
     * @param listJobsRequest 
     * @return listJobsResult The response from the ListJobs service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidNextTokenException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListJobsResult listJobs(ListJobsRequest listJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJobsRequest> request = null;
        Response<ListJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJobsRequestMarshaller().marshall(listJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListJobsResult, JsonUnmarshallerContext> unmarshaller = new ListJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListJobsResult> responseHandler = new JsonResponseHandler<ListJobsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>While a cluster's <code>ClusterState</code> value is in the <code>AwaitingQuorum</code> state, you can update some of the information associated with a cluster. Once the cluster changes to a different job state, usually 60 minutes after the cluster being created, this action is no longer available.</p>
     * @param updateClusterRequest 
     * @return updateClusterResult The response from the UpdateCluster service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws InvalidJobStateException 
     * @throws KMSRequestFailedException 
     * @throws InvalidInputCombinationException 
     * @throws Ec2RequestFailedException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateClusterResult updateCluster(UpdateClusterRequest updateClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateClusterRequest> request = null;
        Response<UpdateClusterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateClusterRequestMarshaller().marshall(updateClusterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateClusterResult, JsonUnmarshallerContext> unmarshaller = new UpdateClusterResultJsonUnmarshaller();
            JsonResponseHandler<UpdateClusterResult> responseHandler = new JsonResponseHandler<UpdateClusterResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>While a job's <code>JobState</code> value is <code>New</code>, you can update some of the information associated with a job. Once the job changes to a different job state, usually within 60 minutes of the job being created, this action is no longer available.</p>
     * @param updateJobRequest 
     * @return updateJobResult The response from the UpdateJob service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws InvalidJobStateException 
     * @throws KMSRequestFailedException 
     * @throws InvalidInputCombinationException 
     * @throws ClusterLimitExceededException 
     * @throws Ec2RequestFailedException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateJobResult updateJob(UpdateJobRequest updateJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateJobRequest> request = null;
        Response<UpdateJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateJobRequestMarshaller().marshall(updateJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateJobResult, JsonUnmarshallerContext> unmarshaller = new UpdateJobResultJsonUnmarshaller();
            JsonResponseHandler<UpdateJobResult> responseHandler = new JsonResponseHandler<UpdateJobResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }


    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     *
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
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(jsonErrorUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
