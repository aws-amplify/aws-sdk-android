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
package com.amazonaws.services.application-autoscaling;

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

import com.amazonaws.services.application-autoscaling.model.*;
import com.amazonaws.services.application-autoscaling.model.transform.*;

/**
 * Client for accessing Application Auto Scaling.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <p>With Application Auto Scaling, you can configure automatic scaling for the following resources:</p> <ul> <li> <p>Amazon ECS services</p> </li> <li> <p>Amazon EC2 Spot Fleet requests</p> </li> <li> <p>Amazon EMR clusters</p> </li> <li> <p>Amazon AppStream 2.0 fleets</p> </li> <li> <p>Amazon DynamoDB tables and global secondary indexes throughput capacity</p> </li> <li> <p>Amazon Aurora Replicas</p> </li> <li> <p>Amazon SageMaker endpoint variants</p> </li> <li> <p>Custom resources provided by your own applications or services</p> </li> <li> <p>Amazon Comprehend document classification endpoints</p> </li> <li> <p>AWS Lambda function provisioned concurrency</p> </li> <li> <p>Amazon Keyspaces (for Apache Cassandra) tables</p> </li> </ul> <p> <b>API Summary</b> </p> <p>The Application Auto Scaling service API includes three key sets of actions: </p> <ul> <li> <p>Register and manage scalable targets - Register AWS or custom resources as scalable targets (a resource that Application Auto Scaling can scale), set minimum and maximum capacity limits, and retrieve information on existing scalable targets.</p> </li> <li> <p>Configure and manage automatic scaling - Define scaling policies to dynamically scale your resources in response to CloudWatch alarms, schedule one-time or recurring scaling actions, and retrieve your recent scaling activity history.</p> </li> <li> <p>Suspend and resume scaling - Temporarily suspend and later resume automatic scaling by calling the <a href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html">RegisterScalableTarget</a> API action for any Application Auto Scaling scalable target. You can suspend and resume (individually or in combination) scale-out activities that are triggered by a scaling policy, scale-in activities that are triggered by a scaling policy, and scheduled scaling.</p> </li> </ul> <p>To learn more about Application Auto Scaling, including information about granting IAM users required permissions for Application Auto Scaling actions, see the <a href="https://docs.aws.amazon.com/autoscaling/application/userguide/what-is-application-auto-scaling.html">Application Auto Scaling User Guide</a>.</p>
 */
public class ApplicationAutoScalingClient extends AmazonWebServiceClient implements ApplicationAutoScaling { 
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Application Auto Scaling exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * ApplicationAutoScaling.  A credentials provider chain will be used
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
    public ApplicationAutoScalingClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * ApplicationAutoScaling.  A credentials provider chain will be used
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
     *                       client connects to ApplicationAutoScaling
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public ApplicationAutoScalingClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * ApplicationAutoScaling using the specified AWS account credentials.
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
     *         ApplicationAutoScalingClient client = new ApplicationAutoScalingClient(AWSMobileClient.getInstance());
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
    public ApplicationAutoScalingClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * ApplicationAutoScaling using the specified AWS account credentials
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
     *         ApplicationAutoScalingClient client = new ApplicationAutoScalingClient(AWSMobileClient.getInstance());
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
     *                       client connects to ApplicationAutoScaling
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public ApplicationAutoScalingClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * ApplicationAutoScaling using the specified AWS account credentials provider.
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
     *         ApplicationAutoScalingClient client = new ApplicationAutoScalingClient(AWSMobileClient.getInstance());
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
    public ApplicationAutoScalingClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * ApplicationAutoScaling using the specified AWS account credentials
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
     *         ApplicationAutoScalingClient client = new ApplicationAutoScalingClient(AWSMobileClient.getInstance());
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
     *                       client connects to ApplicationAutoScaling
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public ApplicationAutoScalingClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * ApplicationAutoScaling using the specified AWS account credentials
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
     *                       client connects to ApplicationAutoScaling
     *                       (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public ApplicationAutoScalingClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * ApplicationAutoScaling using the specified AWS account credentials
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
     *         ApplicationAutoScalingClient client = new ApplicationAutoScalingClient(AWSMobileClient.getInstance());
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
     *                       client connects to ApplicationAutoScaling
     *                       (ex: proxy settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public ApplicationAutoScalingClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new ConcurrentUpdateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new FailedResourceAccessExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServiceExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidNextTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ObjectNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ValidationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());
        
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("application-autoscaling.us-east-1.amazonaws.com");
        this.endpointPrefix = "application-autoscaling";
        
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/application-autoscaling/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/application-autoscaling/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>Deletes the specified scaling policy for an Application Auto Scaling scalable target.</p> <p>Deleting a step scaling policy deletes the underlying alarm action, but does not delete the CloudWatch alarm associated with the scaling policy, even if it no longer has an associated action.</p> <p>For more information, see <a href="https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html#delete-step-scaling-policy">Delete a Step Scaling Policy</a> and <a href="https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html#delete-target-tracking-policy">Delete a Target Tracking Scaling Policy</a> in the <i>Application Auto Scaling User Guide</i>.</p>
     * @param deleteScalingPolicyRequest 
     * @return deleteScalingPolicyResult The response from the DeleteScalingPolicy service method, as returned by Application Auto Scaling.
     * @throws ValidationException 
     * @throws ObjectNotFoundException 
     * @throws ConcurrentUpdateException 
     * @throws InternalServiceException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Application Auto Scaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteScalingPolicyResult deleteScalingPolicy(DeleteScalingPolicyRequest deleteScalingPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteScalingPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteScalingPolicyRequest> request = null;
        Response<DeleteScalingPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteScalingPolicyRequestMarshaller().marshall(deleteScalingPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteScalingPolicyResult, JsonUnmarshallerContext> unmarshaller = new DeleteScalingPolicyResultJsonUnmarshaller();
            JsonResponseHandler<DeleteScalingPolicyResult> responseHandler = new JsonResponseHandler<DeleteScalingPolicyResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Deletes the specified scheduled action for an Application Auto Scaling scalable target.</p> <p>For more information, see <a href="https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-scheduled-scaling.html#delete-scheduled-action">Delete a Scheduled Action</a> in the <i>Application Auto Scaling User Guide</i>.</p>
     * @param deleteScheduledActionRequest 
     * @return deleteScheduledActionResult The response from the DeleteScheduledAction service method, as returned by Application Auto Scaling.
     * @throws ValidationException 
     * @throws ObjectNotFoundException 
     * @throws ConcurrentUpdateException 
     * @throws InternalServiceException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Application Auto Scaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteScheduledActionResult deleteScheduledAction(DeleteScheduledActionRequest deleteScheduledActionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteScheduledActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteScheduledActionRequest> request = null;
        Response<DeleteScheduledActionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteScheduledActionRequestMarshaller().marshall(deleteScheduledActionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteScheduledActionResult, JsonUnmarshallerContext> unmarshaller = new DeleteScheduledActionResultJsonUnmarshaller();
            JsonResponseHandler<DeleteScheduledActionResult> responseHandler = new JsonResponseHandler<DeleteScheduledActionResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Deregisters an Application Auto Scaling scalable target when you have finished using it. To see which resources have been registered, use <a href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_DescribeScalableTargets.html">DescribeScalableTargets</a>. </p> <note> <p>Deregistering a scalable target deletes the scaling policies and the scheduled actions that are associated with it.</p> </note>
     * @param deregisterScalableTargetRequest 
     * @return deregisterScalableTargetResult The response from the DeregisterScalableTarget service method, as returned by Application Auto Scaling.
     * @throws ValidationException 
     * @throws ObjectNotFoundException 
     * @throws ConcurrentUpdateException 
     * @throws InternalServiceException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Application Auto Scaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeregisterScalableTargetResult deregisterScalableTarget(DeregisterScalableTargetRequest deregisterScalableTargetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deregisterScalableTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterScalableTargetRequest> request = null;
        Response<DeregisterScalableTargetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterScalableTargetRequestMarshaller().marshall(deregisterScalableTargetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeregisterScalableTargetResult, JsonUnmarshallerContext> unmarshaller = new DeregisterScalableTargetResultJsonUnmarshaller();
            JsonResponseHandler<DeregisterScalableTargetResult> responseHandler = new JsonResponseHandler<DeregisterScalableTargetResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Gets information about the scalable targets in the specified namespace.</p> <p>You can filter the results using <code>ResourceIds</code> and <code>ScalableDimension</code>.</p>
     * @param describeScalableTargetsRequest 
     * @return describeScalableTargetsResult The response from the DescribeScalableTargets service method, as returned by Application Auto Scaling.
     * @throws ValidationException 
     * @throws InvalidNextTokenException 
     * @throws ConcurrentUpdateException 
     * @throws InternalServiceException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Application Auto Scaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeScalableTargetsResult describeScalableTargets(DescribeScalableTargetsRequest describeScalableTargetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeScalableTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScalableTargetsRequest> request = null;
        Response<DescribeScalableTargetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeScalableTargetsRequestMarshaller().marshall(describeScalableTargetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeScalableTargetsResult, JsonUnmarshallerContext> unmarshaller = new DescribeScalableTargetsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeScalableTargetsResult> responseHandler = new JsonResponseHandler<DescribeScalableTargetsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Provides descriptive information about the scaling activities in the specified namespace from the previous six weeks.</p> <p>You can filter the results using <code>ResourceId</code> and <code>ScalableDimension</code>.</p>
     * @param describeScalingActivitiesRequest 
     * @return describeScalingActivitiesResult The response from the DescribeScalingActivities service method, as returned by Application Auto Scaling.
     * @throws ValidationException 
     * @throws InvalidNextTokenException 
     * @throws ConcurrentUpdateException 
     * @throws InternalServiceException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Application Auto Scaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeScalingActivitiesResult describeScalingActivities(DescribeScalingActivitiesRequest describeScalingActivitiesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeScalingActivitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScalingActivitiesRequest> request = null;
        Response<DescribeScalingActivitiesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeScalingActivitiesRequestMarshaller().marshall(describeScalingActivitiesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeScalingActivitiesResult, JsonUnmarshallerContext> unmarshaller = new DescribeScalingActivitiesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeScalingActivitiesResult> responseHandler = new JsonResponseHandler<DescribeScalingActivitiesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Describes the Application Auto Scaling scaling policies for the specified service namespace.</p> <p>You can filter the results using <code>ResourceId</code>, <code>ScalableDimension</code>, and <code>PolicyNames</code>.</p> <p>For more information, see <a href="https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html">Target Tracking Scaling Policies</a> and <a href="https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html">Step Scaling Policies</a> in the <i>Application Auto Scaling User Guide</i>.</p>
     * @param describeScalingPoliciesRequest 
     * @return describeScalingPoliciesResult The response from the DescribeScalingPolicies service method, as returned by Application Auto Scaling.
     * @throws ValidationException 
     * @throws FailedResourceAccessException 
     * @throws InvalidNextTokenException 
     * @throws ConcurrentUpdateException 
     * @throws InternalServiceException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Application Auto Scaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeScalingPoliciesResult describeScalingPolicies(DescribeScalingPoliciesRequest describeScalingPoliciesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeScalingPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScalingPoliciesRequest> request = null;
        Response<DescribeScalingPoliciesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeScalingPoliciesRequestMarshaller().marshall(describeScalingPoliciesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeScalingPoliciesResult, JsonUnmarshallerContext> unmarshaller = new DescribeScalingPoliciesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeScalingPoliciesResult> responseHandler = new JsonResponseHandler<DescribeScalingPoliciesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Describes the Application Auto Scaling scheduled actions for the specified service namespace.</p> <p>You can filter the results using the <code>ResourceId</code>, <code>ScalableDimension</code>, and <code>ScheduledActionNames</code> parameters.</p> <p>For more information, see <a href="https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-scheduled-scaling.html">Scheduled Scaling</a> in the <i>Application Auto Scaling User Guide</i>.</p>
     * @param describeScheduledActionsRequest 
     * @return describeScheduledActionsResult The response from the DescribeScheduledActions service method, as returned by Application Auto Scaling.
     * @throws ValidationException 
     * @throws InvalidNextTokenException 
     * @throws ConcurrentUpdateException 
     * @throws InternalServiceException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Application Auto Scaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeScheduledActionsResult describeScheduledActions(DescribeScheduledActionsRequest describeScheduledActionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeScheduledActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScheduledActionsRequest> request = null;
        Response<DescribeScheduledActionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeScheduledActionsRequestMarshaller().marshall(describeScheduledActionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeScheduledActionsResult, JsonUnmarshallerContext> unmarshaller = new DescribeScheduledActionsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeScheduledActionsResult> responseHandler = new JsonResponseHandler<DescribeScheduledActionsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Creates or updates a scaling policy for an Application Auto Scaling scalable target.</p> <p>Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scaling policy applies to the scalable target identified by those three attributes. You cannot create a scaling policy until you have registered the resource as a scalable target.</p> <p>Multiple scaling policies can be in force at the same time for the same scalable target. You can have one or more target tracking scaling policies, one or more step scaling policies, or both. However, there is a chance that multiple policies could conflict, instructing the scalable target to scale out or in at the same time. Application Auto Scaling gives precedence to the policy that provides the largest capacity for both scale out and scale in. For example, if one policy increases capacity by 3, another policy increases capacity by 200 percent, and the current capacity is 10, Application Auto Scaling uses the policy with the highest calculated capacity (200% of 10 = 20) and scales out to 30. </p> <p>We recommend caution, however, when using target tracking scaling policies with step scaling policies because conflicts between these policies can cause undesirable behavior. For example, if the step scaling policy initiates a scale-in activity before the target tracking policy is ready to scale in, the scale-in activity will not be blocked. After the scale-in activity completes, the target tracking policy could instruct the scalable target to scale out again. </p> <p>For more information, see <a href="https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html">Target Tracking Scaling Policies</a> and <a href="https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html">Step Scaling Policies</a> in the <i>Application Auto Scaling User Guide</i>.</p> <note> <p>If a scalable target is deregistered, the scalable target is no longer available to execute scaling policies. Any scaling policies that were specified for the scalable target are deleted.</p> </note>
     * @param putScalingPolicyRequest 
     * @return putScalingPolicyResult The response from the PutScalingPolicy service method, as returned by Application Auto Scaling.
     * @throws ValidationException 
     * @throws LimitExceededException 
     * @throws ObjectNotFoundException 
     * @throws ConcurrentUpdateException 
     * @throws FailedResourceAccessException 
     * @throws InternalServiceException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Application Auto Scaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PutScalingPolicyResult putScalingPolicy(PutScalingPolicyRequest putScalingPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putScalingPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutScalingPolicyRequest> request = null;
        Response<PutScalingPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutScalingPolicyRequestMarshaller().marshall(putScalingPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutScalingPolicyResult, JsonUnmarshallerContext> unmarshaller = new PutScalingPolicyResultJsonUnmarshaller();
            JsonResponseHandler<PutScalingPolicyResult> responseHandler = new JsonResponseHandler<PutScalingPolicyResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Creates or updates a scheduled action for an Application Auto Scaling scalable target.</p> <p>Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scheduled action applies to the scalable target identified by those three attributes. You cannot create a scheduled action until you have registered the resource as a scalable target.</p> <p>When start and end times are specified with a recurring schedule using a cron expression or rates, they form the boundaries of when the recurring action starts and stops.</p> <p>To update a scheduled action, specify the parameters that you want to change. If you don't specify start and end times, the old values are deleted.</p> <p>For more information, see <a href="https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-scheduled-scaling.html">Scheduled Scaling</a> in the <i>Application Auto Scaling User Guide</i>.</p> <note> <p>If a scalable target is deregistered, the scalable target is no longer available to run scheduled actions. Any scheduled actions that were specified for the scalable target are deleted.</p> </note>
     * @param putScheduledActionRequest 
     * @return putScheduledActionResult The response from the PutScheduledAction service method, as returned by Application Auto Scaling.
     * @throws ValidationException 
     * @throws LimitExceededException 
     * @throws ObjectNotFoundException 
     * @throws ConcurrentUpdateException 
     * @throws InternalServiceException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Application Auto Scaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PutScheduledActionResult putScheduledAction(PutScheduledActionRequest putScheduledActionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putScheduledActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutScheduledActionRequest> request = null;
        Response<PutScheduledActionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutScheduledActionRequestMarshaller().marshall(putScheduledActionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutScheduledActionResult, JsonUnmarshallerContext> unmarshaller = new PutScheduledActionResultJsonUnmarshaller();
            JsonResponseHandler<PutScheduledActionResult> responseHandler = new JsonResponseHandler<PutScheduledActionResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>Registers or updates a scalable target. </p> <p>A scalable target is a resource that Application Auto Scaling can scale out and scale in. Scalable targets are uniquely identified by the combination of resource ID, scalable dimension, and namespace. </p> <p>When you register a new scalable target, you must specify values for minimum and maximum capacity. Application Auto Scaling scaling policies will not scale capacity to values that are outside of this range.</p> <p>After you register a scalable target, you do not need to register it again to use other Application Auto Scaling operations. To see which resources have been registered, use <a href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_DescribeScalableTargets.html">DescribeScalableTargets</a>. You can also view the scaling policies for a service namespace by using <a href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_DescribeScalableTargets.html">DescribeScalableTargets</a>. If you no longer need a scalable target, you can deregister it by using <a href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_DeregisterScalableTarget.html">DeregisterScalableTarget</a>.</p> <p>To update a scalable target, specify the parameters that you want to change. Include the parameters that identify the scalable target: resource ID, scalable dimension, and namespace. Any parameters that you don't specify are not changed by this update request. </p>
     * @param registerScalableTargetRequest 
     * @return registerScalableTargetResult The response from the RegisterScalableTarget service method, as returned by Application Auto Scaling.
     * @throws ValidationException 
     * @throws LimitExceededException 
     * @throws ConcurrentUpdateException 
     * @throws InternalServiceException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Application Auto Scaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RegisterScalableTargetResult registerScalableTarget(RegisterScalableTargetRequest registerScalableTargetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(registerScalableTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterScalableTargetRequest> request = null;
        Response<RegisterScalableTargetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterScalableTargetRequestMarshaller().marshall(registerScalableTargetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RegisterScalableTargetResult, JsonUnmarshallerContext> unmarshaller = new RegisterScalableTargetResultJsonUnmarshaller();
            JsonResponseHandler<RegisterScalableTargetResult> responseHandler = new JsonResponseHandler<RegisterScalableTargetResult>(unmarshaller);

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
