/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot;

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

import com.amazonaws.services.iot.model.*;
import com.amazonaws.services.iot.model.transform.*;

/**
 * Client for accessing AWSIot.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * AWS IoT <p>
 * AWS IoT provides secure, bi-directional communication between
 * Internet-connected things (such as sensors, actuators, embedded
 * devices, or smart appliances) and the AWS cloud. You can discover your
 * custom IoT-Data endpoint to communicate with, configure rules for data
 * processing and integration with other services, organize resources
 * associated with each thing (Thing Registry), configure logging, and
 * create and manage policies and credentials to authenticate things.
 * </p>
 * <p>
 * For more information about how AWS IoT works, see the
 * <a href="http://docs.aws.amazon.com/iot/latest/developerguide/aws-iot-how-it-works.html"> Developer Guide </a>
 * .
 * </p>
 */
public class AWSIotClient extends AmazonWebServiceClient implements AWSIot {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWSIot exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AWSIot.  A credentials provider chain will be used
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
    public AWSIotClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSIot.  A credentials provider chain will be used
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
     *                       client connects to AWSIot
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSIotClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSIot using the specified AWS account credentials.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AWSIotClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSIot using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSIot
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSIotClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSIot using the specified AWS account credentials provider.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AWSIotClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSIot using the specified AWS account credentials
     * provider and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSIot
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSIotClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSIot using the specified AWS account credentials
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
     *                       client connects to AWSIot
     *                       (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSIotClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSIot using the specified AWS account credentials
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
     *                       client connects to AWSIot
     *                       (ex: proxy settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSIotClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new TransferConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeleteConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TransferAlreadyCompletedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SqlParseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnauthorizedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new VersionsLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CertificateStateExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalFailureExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ThrottlingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MalformedPolicyExceptionUnmarshaller());
        
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());
        
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("iot.us-east-1.amazonaws.com");
        
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/iot/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/iot/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;
        
        return config;
    }

    /**
     * <p>
     * Creates a thing in the Thing Registry.
     * </p>
     *
     * @param createThingRequest Container for the necessary parameters to
     *           execute the CreateThing service method on AWSIot.
     * 
     * @return The response from the CreateThing service method, as returned
     *         by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceAlreadyExistsException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateThingResult createThing(CreateThingRequest createThingRequest) {
        ExecutionContext executionContext = createExecutionContext(createThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateThingRequest> request = null;
        Response<CreateThingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateThingRequestMarshaller().marshall(createThingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateThingResult, JsonUnmarshallerContext> unmarshaller = new CreateThingResultJsonUnmarshaller();
            JsonResponseHandler<CreateThingResult> responseHandler = new JsonResponseHandler<CreateThingResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the things associated with the specified principal.
     * </p>
     *
     * @param listPrincipalThingsRequest Container for the necessary
     *           parameters to execute the ListPrincipalThings service method on
     *           AWSIot.
     * 
     * @return The response from the ListPrincipalThings service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListPrincipalThingsResult listPrincipalThings(ListPrincipalThingsRequest listPrincipalThingsRequest) {
        ExecutionContext executionContext = createExecutionContext(listPrincipalThingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPrincipalThingsRequest> request = null;
        Response<ListPrincipalThingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPrincipalThingsRequestMarshaller().marshall(listPrincipalThingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPrincipalThingsResult, JsonUnmarshallerContext> unmarshaller = new ListPrincipalThingsResultJsonUnmarshaller();
            JsonResponseHandler<ListPrincipalThingsResult> responseHandler = new JsonResponseHandler<ListPrincipalThingsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Rejects a pending certificate transfer. After AWS IoT rejects a
     * certificate transfer, the certificate status changes from
     * <b>PENDING_TRANFER</b> to <b>INACTIVE</b> .
     * </p>
     * <p>
     * To check for pending certificate transfers, call ListCertificates to
     * enumerate your certificates.
     * </p>
     * <p>
     * This operation can only be called by the transfer destination. After
     * it is called, the certificate will be returned to the source's account
     * in the INACTIVE state.
     * </p>
     *
     * @param rejectCertificateTransferRequest Container for the necessary
     *           parameters to execute the RejectCertificateTransfer service method on
     *           AWSIot.
     * 
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws TransferAlreadyCompletedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void rejectCertificateTransfer(RejectCertificateTransferRequest rejectCertificateTransferRequest) {
        ExecutionContext executionContext = createExecutionContext(rejectCertificateTransferRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<RejectCertificateTransferRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new RejectCertificateTransferRequestMarshaller().marshall(rejectCertificateTransferRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Attaches the specified principal to the specified thing.
     * </p>
     *
     * @param attachThingPrincipalRequest Container for the necessary
     *           parameters to execute the AttachThingPrincipal service method on
     *           AWSIot.
     * 
     * @return The response from the AttachThingPrincipal service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AttachThingPrincipalResult attachThingPrincipal(AttachThingPrincipalRequest attachThingPrincipalRequest) {
        ExecutionContext executionContext = createExecutionContext(attachThingPrincipalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachThingPrincipalRequest> request = null;
        Response<AttachThingPrincipalResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachThingPrincipalRequestMarshaller().marshall(attachThingPrincipalRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AttachThingPrincipalResult, JsonUnmarshallerContext> unmarshaller = new AttachThingPrincipalResultJsonUnmarshaller();
            JsonResponseHandler<AttachThingPrincipalResult> responseHandler = new JsonResponseHandler<AttachThingPrincipalResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about the specified policy with the policy document
     * of the default version.
     * </p>
     *
     * @param getPolicyRequest Container for the necessary parameters to
     *           execute the GetPolicy service method on AWSIot.
     * 
     * @return The response from the GetPolicy service method, as returned by
     *         AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetPolicyResult getPolicy(GetPolicyRequest getPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(getPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPolicyRequest> request = null;
        Response<GetPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPolicyRequestMarshaller().marshall(getPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetPolicyResult, JsonUnmarshallerContext> unmarshaller = new GetPolicyResultJsonUnmarshaller();
            JsonResponseHandler<GetPolicyResult> responseHandler = new JsonResponseHandler<GetPolicyResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about the specified policy version.
     * </p>
     *
     * @param getPolicyVersionRequest Container for the necessary parameters
     *           to execute the GetPolicyVersion service method on AWSIot.
     * 
     * @return The response from the GetPolicyVersion service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetPolicyVersionResult getPolicyVersion(GetPolicyVersionRequest getPolicyVersionRequest) {
        ExecutionContext executionContext = createExecutionContext(getPolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPolicyVersionRequest> request = null;
        Response<GetPolicyVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPolicyVersionRequestMarshaller().marshall(getPolicyVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetPolicyVersionResult, JsonUnmarshallerContext> unmarshaller = new GetPolicyVersionResultJsonUnmarshaller();
            JsonResponseHandler<GetPolicyVersionResult> responseHandler = new JsonResponseHandler<GetPolicyVersionResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Removes the specified policy from the specified certificate.
     * </p>
     *
     * @param detachPrincipalPolicyRequest Container for the necessary
     *           parameters to execute the DetachPrincipalPolicy service method on
     *           AWSIot.
     * 
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void detachPrincipalPolicy(DetachPrincipalPolicyRequest detachPrincipalPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(detachPrincipalPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DetachPrincipalPolicyRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DetachPrincipalPolicyRequestMarshaller().marshall(detachPrincipalPolicyRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Returns a unique endpoint specific to the AWS account making the
     * call. You specify the following URI when updating state information
     * for your thing: https:// <i>endpoint</i> /things/ <i>thingName</i>
     * /shadow.
     * </p>
     *
     * @param describeEndpointRequest Container for the necessary parameters
     *           to execute the DescribeEndpoint service method on AWSIot.
     * 
     * @return The response from the DescribeEndpoint service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws UnauthorizedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEndpointResult describeEndpoint(DescribeEndpointRequest describeEndpointRequest) {
        ExecutionContext executionContext = createExecutionContext(describeEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEndpointRequest> request = null;
        Response<DescribeEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEndpointRequestMarshaller().marshall(describeEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEndpointResult, JsonUnmarshallerContext> unmarshaller = new DescribeEndpointResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEndpointResult> responseHandler = new JsonResponseHandler<DescribeEndpointResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new version of the specified AWS IoT policy. To update a
     * policy, create a new policy version. A managed policy can have up to
     * five versions. If the policy has five versions, you must use
     * DeletePolicyVersion to delete an existing version before you create a
     * new one.
     * </p>
     * <p>
     * Optionally, you can set the new version as the policy's default
     * version. The default version is the operative version (that is, the
     * version that is in effect for the certificates to which the policy is
     * attached).
     * </p>
     *
     * @param createPolicyVersionRequest Container for the necessary
     *           parameters to execute the CreatePolicyVersion service method on
     *           AWSIot.
     * 
     * @return The response from the CreatePolicyVersion service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws MalformedPolicyException
     * @throws UnauthorizedException
     * @throws VersionsLimitExceededException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreatePolicyVersionResult createPolicyVersion(CreatePolicyVersionRequest createPolicyVersionRequest) {
        ExecutionContext executionContext = createExecutionContext(createPolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePolicyVersionRequest> request = null;
        Response<CreatePolicyVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePolicyVersionRequestMarshaller().marshall(createPolicyVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreatePolicyVersionResult, JsonUnmarshallerContext> unmarshaller = new CreatePolicyVersionResultJsonUnmarshaller();
            JsonResponseHandler<CreatePolicyVersionResult> responseHandler = new JsonResponseHandler<CreatePolicyVersionResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about the specified rule.
     * </p>
     *
     * @param getTopicRuleRequest Container for the necessary parameters to
     *           execute the GetTopicRule service method on AWSIot.
     * 
     * @return The response from the GetTopicRule service method, as returned
     *         by AWSIot.
     * 
     * @throws InvalidRequestException
     * @throws InternalException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetTopicRuleResult getTopicRule(GetTopicRuleRequest getTopicRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(getTopicRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTopicRuleRequest> request = null;
        Response<GetTopicRuleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTopicRuleRequestMarshaller().marshall(getTopicRuleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetTopicRuleResult, JsonUnmarshallerContext> unmarshaller = new GetTopicRuleResultJsonUnmarshaller();
            JsonResponseHandler<GetTopicRuleResult> responseHandler = new JsonResponseHandler<GetTopicRuleResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Enables the specified rule.
     * </p>
     *
     * @param enableTopicRuleRequest Container for the necessary parameters
     *           to execute the EnableTopicRule service method on AWSIot.
     * 
     * 
     * @throws InvalidRequestException
     * @throws InternalException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void enableTopicRule(EnableTopicRuleRequest enableTopicRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(enableTopicRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<EnableTopicRuleRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new EnableTopicRuleRequestMarshaller().marshall(enableTopicRuleRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Gets information about the specified certificate.
     * </p>
     *
     * @param describeCertificateRequest Container for the necessary
     *           parameters to execute the DescribeCertificate service method on
     *           AWSIot.
     * 
     * @return The response from the DescribeCertificate service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCertificateResult describeCertificate(DescribeCertificateRequest describeCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCertificateRequest> request = null;
        Response<DescribeCertificateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCertificateRequestMarshaller().marshall(describeCertificateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCertificateResult, JsonUnmarshallerContext> unmarshaller = new DescribeCertificateResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCertificateResult> responseHandler = new JsonResponseHandler<DescribeCertificateResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists your certificates.
     * </p>
     * <p>
     * The results are paginated with a default page size of 25. You can use
     * the returned marker to retrieve additional results.
     * </p>
     *
     * @param listCertificatesRequest Container for the necessary parameters
     *           to execute the ListCertificates service method on AWSIot.
     * 
     * @return The response from the ListCertificates service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListCertificatesResult listCertificates(ListCertificatesRequest listCertificatesRequest) {
        ExecutionContext executionContext = createExecutionContext(listCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCertificatesRequest> request = null;
        Response<ListCertificatesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCertificatesRequestMarshaller().marshall(listCertificatesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListCertificatesResult, JsonUnmarshallerContext> unmarshaller = new ListCertificatesResultJsonUnmarshaller();
            JsonResponseHandler<ListCertificatesResult> responseHandler = new JsonResponseHandler<ListCertificatesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Sets the logging options.
     * </p>
     *
     * @param setLoggingOptionsRequest Container for the necessary parameters
     *           to execute the SetLoggingOptions service method on AWSIot.
     * 
     * 
     * @throws InvalidRequestException
     * @throws InternalException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setLoggingOptions(SetLoggingOptionsRequest setLoggingOptionsRequest) {
        ExecutionContext executionContext = createExecutionContext(setLoggingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<SetLoggingOptionsRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new SetLoggingOptionsRequestMarshaller().marshall(setLoggingOptionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Deletes the specified certificate.
     * </p>
     * <p>
     * A certificate cannot be deleted if it has a policy attached to it or
     * if its status is set to ACTIVE. To delete a certificate, first use the
     * DetachPrincipalPolicy API to detach all policies. Next, use the
     * UpdateCertificate API to set the certificate to the INACTIVE status.
     * </p>
     *
     * @param deleteCertificateRequest Container for the necessary parameters
     *           to execute the DeleteCertificate service method on AWSIot.
     * 
     * 
     * @throws CertificateStateException
     * @throws DeleteConflictException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteCertificate(DeleteCertificateRequest deleteCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteCertificateRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DeleteCertificateRequestMarshaller().marshall(deleteCertificateRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Lists the rules for the specific topic.
     * </p>
     *
     * @param listTopicRulesRequest Container for the necessary parameters to
     *           execute the ListTopicRules service method on AWSIot.
     * 
     * @return The response from the ListTopicRules service method, as
     *         returned by AWSIot.
     * 
     * @throws InvalidRequestException
     * @throws InternalException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTopicRulesResult listTopicRules(ListTopicRulesRequest listTopicRulesRequest) {
        ExecutionContext executionContext = createExecutionContext(listTopicRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTopicRulesRequest> request = null;
        Response<ListTopicRulesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTopicRulesRequestMarshaller().marshall(listTopicRulesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTopicRulesResult, JsonUnmarshallerContext> unmarshaller = new ListTopicRulesResultJsonUnmarshaller();
            JsonResponseHandler<ListTopicRulesResult> responseHandler = new JsonResponseHandler<ListTopicRulesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified thing from the Thing Registry.
     * </p>
     *
     * @param deleteThingRequest Container for the necessary parameters to
     *           execute the DeleteThing service method on AWSIot.
     * 
     * @return The response from the DeleteThing service method, as returned
     *         by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteThingResult deleteThing(DeleteThingRequest deleteThingRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteThingRequest> request = null;
        Response<DeleteThingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteThingRequestMarshaller().marshall(deleteThingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteThingResult, JsonUnmarshallerContext> unmarshaller = new DeleteThingResultJsonUnmarshaller();
            JsonResponseHandler<DeleteThingResult> responseHandler = new JsonResponseHandler<DeleteThingResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Accepts a pending certificate transfer. The default state of the
     * certificate is INACTIVE.
     * </p>
     * <p>
     * To check for pending certificate transfers, call ListCertificates to
     * enumerate your certificates.
     * </p>
     *
     * @param acceptCertificateTransferRequest Container for the necessary
     *           parameters to execute the AcceptCertificateTransfer service method on
     *           AWSIot.
     * 
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws TransferAlreadyCompletedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void acceptCertificateTransfer(AcceptCertificateTransferRequest acceptCertificateTransferRequest) {
        ExecutionContext executionContext = createExecutionContext(acceptCertificateTransferRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<AcceptCertificateTransferRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new AcceptCertificateTransferRequestMarshaller().marshall(acceptCertificateTransferRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Deletes the specified version of the specified policy. You cannot
     * delete the default version of a policy using this API. To delete the
     * default version of a policy, use DeletePolicy. To find out which
     * version of a policy is marked as the default version, use
     * ListPolicyVersions.
     * </p>
     *
     * @param deletePolicyVersionRequest Container for the necessary
     *           parameters to execute the DeletePolicyVersion service method on
     *           AWSIot.
     * 
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws DeleteConflictException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deletePolicyVersion(DeletePolicyVersionRequest deletePolicyVersionRequest) {
        ExecutionContext executionContext = createExecutionContext(deletePolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeletePolicyVersionRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DeletePolicyVersionRequestMarshaller().marshall(deletePolicyVersionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Replaces the specified rule. You must specify all parameters for the
     * new rule. Creating rules is an administrator-level action. Any user
     * who has permission to create rules will be able to access data
     * processed by the rule.
     * </p>
     *
     * @param replaceTopicRuleRequest Container for the necessary parameters
     *           to execute the ReplaceTopicRule service method on AWSIot.
     * 
     * 
     * @throws SqlParseException
     * @throws InvalidRequestException
     * @throws InternalException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void replaceTopicRule(ReplaceTopicRuleRequest replaceTopicRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(replaceTopicRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ReplaceTopicRuleRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new ReplaceTopicRuleRequestMarshaller().marshall(replaceTopicRuleRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Sets the specified version of the specified policy as the policy's
     * default (operative) version. This action affects all certificates to
     * which the policy is attached. To list the principals the policy is
     * attached to, use the ListPrincipalPolicy API.
     * </p>
     *
     * @param setDefaultPolicyVersionRequest Container for the necessary
     *           parameters to execute the SetDefaultPolicyVersion service method on
     *           AWSIot.
     * 
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setDefaultPolicyVersion(SetDefaultPolicyVersionRequest setDefaultPolicyVersionRequest) {
        ExecutionContext executionContext = createExecutionContext(setDefaultPolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<SetDefaultPolicyVersionRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new SetDefaultPolicyVersionRequestMarshaller().marshall(setDefaultPolicyVersionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Lists the policies attached to the specified principal. If you use an
     * Cognito identity, the ID must be in
     * <a href="http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_GetCredentialsForIdentity.html#API_GetCredentialsForIdentity_RequestSyntax"> AmazonCognito Identity format </a>
     * .
     * </p>
     *
     * @param listPrincipalPoliciesRequest Container for the necessary
     *           parameters to execute the ListPrincipalPolicies service method on
     *           AWSIot.
     * 
     * @return The response from the ListPrincipalPolicies service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListPrincipalPoliciesResult listPrincipalPolicies(ListPrincipalPoliciesRequest listPrincipalPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(listPrincipalPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPrincipalPoliciesRequest> request = null;
        Response<ListPrincipalPoliciesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPrincipalPoliciesRequestMarshaller().marshall(listPrincipalPoliciesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPrincipalPoliciesResult, JsonUnmarshallerContext> unmarshaller = new ListPrincipalPoliciesResultJsonUnmarshaller();
            JsonResponseHandler<ListPrincipalPoliciesResult> responseHandler = new JsonResponseHandler<ListPrincipalPoliciesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Transfers the specified certificate to the specified AWS account.
     * </p>
     * <p>
     * You can cancel the transfer until it is acknowledged by the
     * recipient.
     * </p>
     * <p>
     * No notification is sent to the transfer destination's account. It is
     * up to the caller to notify the transfer target.
     * </p>
     * <p>
     * The certificate being transferred must not be in the ACTIVE state.
     * You can use the UpdateCertificate API to deactivate it.
     * </p>
     * <p>
     * The certificate must not have any policies attached to it. You can
     * use the DetachPrincipalPolicy API to detach them.
     * </p>
     *
     * @param transferCertificateRequest Container for the necessary
     *           parameters to execute the TransferCertificate service method on
     *           AWSIot.
     * 
     * @return The response from the TransferCertificate service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws TransferConflictException
     * @throws CertificateStateException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public TransferCertificateResult transferCertificate(TransferCertificateRequest transferCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(transferCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TransferCertificateRequest> request = null;
        Response<TransferCertificateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TransferCertificateRequestMarshaller().marshall(transferCertificateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<TransferCertificateResult, JsonUnmarshallerContext> unmarshaller = new TransferCertificateResultJsonUnmarshaller();
            JsonResponseHandler<TransferCertificateResult> responseHandler = new JsonResponseHandler<TransferCertificateResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists your policies.
     * </p>
     *
     * @param listPoliciesRequest Container for the necessary parameters to
     *           execute the ListPolicies service method on AWSIot.
     * 
     * @return The response from the ListPolicies service method, as returned
     *         by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListPoliciesResult listPolicies(ListPoliciesRequest listPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(listPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPoliciesRequest> request = null;
        Response<ListPoliciesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPoliciesRequestMarshaller().marshall(listPoliciesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPoliciesResult, JsonUnmarshallerContext> unmarshaller = new ListPoliciesResultJsonUnmarshaller();
            JsonResponseHandler<ListPoliciesResult> responseHandler = new JsonResponseHandler<ListPoliciesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified policy.
     * </p>
     * <p>
     * A policy cannot be deleted if it has non-default versions or it is
     * attached to any certificate.
     * </p>
     * <p>
     * To delete a policy, use the DeletePolicyVersion API to delete all
     * non-default versions of the policy; use the DetachPrincipalPolicy API
     * to detach the policy from any certificate; and then use the
     * DeletePolicy API to delete the policy.
     * </p>
     * <p>
     * When a policy is deleted using DeletePolicy, its default version is
     * deleted with it.
     * </p>
     *
     * @param deletePolicyRequest Container for the necessary parameters to
     *           execute the DeletePolicy service method on AWSIot.
     * 
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws DeleteConflictException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deletePolicy(DeletePolicyRequest deletePolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(deletePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeletePolicyRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DeletePolicyRequestMarshaller().marshall(deletePolicyRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Detaches the specified principal from the specified thing.
     * </p>
     *
     * @param detachThingPrincipalRequest Container for the necessary
     *           parameters to execute the DetachThingPrincipal service method on
     *           AWSIot.
     * 
     * @return The response from the DetachThingPrincipal service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DetachThingPrincipalResult detachThingPrincipal(DetachThingPrincipalRequest detachThingPrincipalRequest) {
        ExecutionContext executionContext = createExecutionContext(detachThingPrincipalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachThingPrincipalRequest> request = null;
        Response<DetachThingPrincipalResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachThingPrincipalRequestMarshaller().marshall(detachThingPrincipalRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DetachThingPrincipalResult, JsonUnmarshallerContext> unmarshaller = new DetachThingPrincipalResultJsonUnmarshaller();
            JsonResponseHandler<DetachThingPrincipalResult> responseHandler = new JsonResponseHandler<DetachThingPrincipalResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about the specified thing.
     * </p>
     *
     * @param describeThingRequest Container for the necessary parameters to
     *           execute the DescribeThing service method on AWSIot.
     * 
     * @return The response from the DescribeThing service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeThingResult describeThing(DescribeThingRequest describeThingRequest) {
        ExecutionContext executionContext = createExecutionContext(describeThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeThingRequest> request = null;
        Response<DescribeThingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeThingRequestMarshaller().marshall(describeThingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeThingResult, JsonUnmarshallerContext> unmarshaller = new DescribeThingResultJsonUnmarshaller();
            JsonResponseHandler<DescribeThingResult> responseHandler = new JsonResponseHandler<DescribeThingResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a rule. Creating rules is an administrator-level action. Any
     * user who has permission to create rules will be able to access data
     * processed by the rule.
     * </p>
     *
     * @param createTopicRuleRequest Container for the necessary parameters
     *           to execute the CreateTopicRule service method on AWSIot.
     * 
     * 
     * @throws SqlParseException
     * @throws InvalidRequestException
     * @throws InternalException
     * @throws ResourceAlreadyExistsException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createTopicRule(CreateTopicRuleRequest createTopicRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(createTopicRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateTopicRuleRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new CreateTopicRuleRequestMarshaller().marshall(createTopicRuleRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Creates a 2048-bit RSA key pair and issues an X.509 certificate using
     * the issued public key.
     * </p>
     * <p>
     * <b>Note</b> This is the only time AWS IoT issues the private key for
     * this certificate, so it is important to keep it in a secure location.
     * </p>
     *
     * @param createKeysAndCertificateRequest Container for the necessary
     *           parameters to execute the CreateKeysAndCertificate service method on
     *           AWSIot.
     * 
     * @return The response from the CreateKeysAndCertificate service method,
     *         as returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateKeysAndCertificateResult createKeysAndCertificate(CreateKeysAndCertificateRequest createKeysAndCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(createKeysAndCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateKeysAndCertificateRequest> request = null;
        Response<CreateKeysAndCertificateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateKeysAndCertificateRequestMarshaller().marshall(createKeysAndCertificateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateKeysAndCertificateResult, JsonUnmarshallerContext> unmarshaller = new CreateKeysAndCertificateResultJsonUnmarshaller();
            JsonResponseHandler<CreateKeysAndCertificateResult> responseHandler = new JsonResponseHandler<CreateKeysAndCertificateResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Attaches the specified policy to the specified principal (certificate
     * or other credential).
     * </p>
     *
     * @param attachPrincipalPolicyRequest Container for the necessary
     *           parameters to execute the AttachPrincipalPolicy service method on
     *           AWSIot.
     * 
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws LimitExceededException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void attachPrincipalPolicy(AttachPrincipalPolicyRequest attachPrincipalPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(attachPrincipalPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<AttachPrincipalPolicyRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new AttachPrincipalPolicyRequestMarshaller().marshall(attachPrincipalPolicyRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Disables the specified rule.
     * </p>
     *
     * @param disableTopicRuleRequest Container for the necessary parameters
     *           to execute the DisableTopicRule service method on AWSIot.
     * 
     * 
     * @throws InvalidRequestException
     * @throws InternalException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void disableTopicRule(DisableTopicRuleRequest disableTopicRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(disableTopicRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DisableTopicRuleRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DisableTopicRuleRequestMarshaller().marshall(disableTopicRuleRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Lists the versions of the specified policy, and identifies the
     * default version.
     * </p>
     *
     * @param listPolicyVersionsRequest Container for the necessary
     *           parameters to execute the ListPolicyVersions service method on AWSIot.
     * 
     * @return The response from the ListPolicyVersions service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListPolicyVersionsResult listPolicyVersions(ListPolicyVersionsRequest listPolicyVersionsRequest) {
        ExecutionContext executionContext = createExecutionContext(listPolicyVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPolicyVersionsRequest> request = null;
        Response<ListPolicyVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPolicyVersionsRequestMarshaller().marshall(listPolicyVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPolicyVersionsResult, JsonUnmarshallerContext> unmarshaller = new ListPolicyVersionsResultJsonUnmarshaller();
            JsonResponseHandler<ListPolicyVersionsResult> responseHandler = new JsonResponseHandler<ListPolicyVersionsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the status of the specified certificate. This operation is
     * idempotent.
     * </p>
     * <p>
     * Moving a certificate from the ACTIVE state (including REVOKED) will
     * not disconnect currently connected devices, but these devices will be
     * unable to reconnect.
     * </p>
     * <p>
     * The ACTIVE state is required to authenticate devices connecting to
     * AWS IoT using a certificate.
     * </p>
     *
     * @param updateCertificateRequest Container for the necessary parameters
     *           to execute the UpdateCertificate service method on AWSIot.
     * 
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws CertificateStateException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateCertificate(UpdateCertificateRequest updateCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(updateCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateCertificateRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new UpdateCertificateRequestMarshaller().marshall(updateCertificateRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Cancels a pending transfer for the specified certificate.
     * </p>
     * <p>
     * <b>Note</b> Only the transfer source account can use this operation
     * to cancel a transfer. (Transfer destinations can use
     * RejectCertificateTransfer instead.) After transfer, AWS IoT returns
     * the certificate to the source account in the INACTIVE state. After the
     * destination account has accepted the transfer, the transfer cannot be
     * cancelled.
     * </p>
     * <p>
     * After a certificate transfer is cancelled, the status of the
     * certificate changes from PENDING_TRANSFER to INACTIVE.
     * </p>
     *
     * @param cancelCertificateTransferRequest Container for the necessary
     *           parameters to execute the CancelCertificateTransfer service method on
     *           AWSIot.
     * 
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws TransferAlreadyCompletedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void cancelCertificateTransfer(CancelCertificateTransferRequest cancelCertificateTransferRequest) {
        ExecutionContext executionContext = createExecutionContext(cancelCertificateTransferRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CancelCertificateTransferRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new CancelCertificateTransferRequestMarshaller().marshall(cancelCertificateTransferRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Updates the data for a thing.
     * </p>
     *
     * @param updateThingRequest Container for the necessary parameters to
     *           execute the UpdateThing service method on AWSIot.
     * 
     * @return The response from the UpdateThing service method, as returned
     *         by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateThingResult updateThing(UpdateThingRequest updateThingRequest) {
        ExecutionContext executionContext = createExecutionContext(updateThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateThingRequest> request = null;
        Response<UpdateThingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateThingRequestMarshaller().marshall(updateThingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateThingResult, JsonUnmarshallerContext> unmarshaller = new UpdateThingResultJsonUnmarshaller();
            JsonResponseHandler<UpdateThingResult> responseHandler = new JsonResponseHandler<UpdateThingResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists your things. You can pass an AttributeName or AttributeValue to
     * filter your things (for example, "ListThings where AttributeName=Color
     * and AttributeValue=Red").
     * </p>
     *
     * @param listThingsRequest Container for the necessary parameters to
     *           execute the ListThings service method on AWSIot.
     * 
     * @return The response from the ListThings service method, as returned
     *         by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListThingsResult listThings(ListThingsRequest listThingsRequest) {
        ExecutionContext executionContext = createExecutionContext(listThingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListThingsRequest> request = null;
        Response<ListThingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListThingsRequestMarshaller().marshall(listThingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListThingsResult, JsonUnmarshallerContext> unmarshaller = new ListThingsResultJsonUnmarshaller();
            JsonResponseHandler<ListThingsResult> responseHandler = new JsonResponseHandler<ListThingsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an AWS IoT policy.
     * </p>
     * <p>
     * The created policy is the default version for the policy. This
     * operation creates a policy version with a version identifier of
     * <b>1</b> and sets <b>1</b> as the policy's default version.
     * </p>
     *
     * @param createPolicyRequest Container for the necessary parameters to
     *           execute the CreatePolicy service method on AWSIot.
     * 
     * @return The response from the CreatePolicy service method, as returned
     *         by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws MalformedPolicyException
     * @throws UnauthorizedException
     * @throws ResourceAlreadyExistsException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreatePolicyResult createPolicy(CreatePolicyRequest createPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(createPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePolicyRequest> request = null;
        Response<CreatePolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePolicyRequestMarshaller().marshall(createPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreatePolicyResult, JsonUnmarshallerContext> unmarshaller = new CreatePolicyResultJsonUnmarshaller();
            JsonResponseHandler<CreatePolicyResult> responseHandler = new JsonResponseHandler<CreatePolicyResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the logging options.
     * </p>
     *
     * @param getLoggingOptionsRequest Container for the necessary parameters
     *           to execute the GetLoggingOptions service method on AWSIot.
     * 
     * @return The response from the GetLoggingOptions service method, as
     *         returned by AWSIot.
     * 
     * @throws InvalidRequestException
     * @throws InternalException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetLoggingOptionsResult getLoggingOptions(GetLoggingOptionsRequest getLoggingOptionsRequest) {
        ExecutionContext executionContext = createExecutionContext(getLoggingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLoggingOptionsRequest> request = null;
        Response<GetLoggingOptionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLoggingOptionsRequestMarshaller().marshall(getLoggingOptionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetLoggingOptionsResult, JsonUnmarshallerContext> unmarshaller = new GetLoggingOptionsResultJsonUnmarshaller();
            JsonResponseHandler<GetLoggingOptionsResult> responseHandler = new JsonResponseHandler<GetLoggingOptionsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the principals associated with the specified thing.
     * </p>
     *
     * @param listThingPrincipalsRequest Container for the necessary
     *           parameters to execute the ListThingPrincipals service method on
     *           AWSIot.
     * 
     * @return The response from the ListThingPrincipals service method, as
     *         returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListThingPrincipalsResult listThingPrincipals(ListThingPrincipalsRequest listThingPrincipalsRequest) {
        ExecutionContext executionContext = createExecutionContext(listThingPrincipalsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListThingPrincipalsRequest> request = null;
        Response<ListThingPrincipalsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListThingPrincipalsRequestMarshaller().marshall(listThingPrincipalsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListThingPrincipalsResult, JsonUnmarshallerContext> unmarshaller = new ListThingPrincipalsResultJsonUnmarshaller();
            JsonResponseHandler<ListThingPrincipalsResult> responseHandler = new JsonResponseHandler<ListThingPrincipalsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an X.509 certificate using the specified certificate signing
     * request.
     * </p>
     * <p>
     * <b>Note</b> Reusing the same certificate signing request (CSR)
     * results in a distinct certificate.
     * </p>
     * <p>
     * You can create multiple certificates in a batch by creating a
     * directory, copying multiple .csr files into that directory, and then
     * specifying that directory on the command line. The following commands
     * show how to create a batch of certificates given a batch of CSRs.
     * </p>
     * <p>
     * Assuming a set of CSRs are located inside of the directory
     * my-csr-directory:
     * </p>
     * <p>
     * >
     * </p>
     * <p>
     * On Linux and OS X, the command is:
     * </p>
     * <p>
     * $ ls my-csr-directory/ | xargs -I {} aws iot
     * create-certificate-from-csr --certificate-signing-request
     * file://my-csr-directory/{}
     * </p>
     * <p>
     * This command lists all of the CSRs in my-csr-directory and pipes each
     * CSR file name to the aws iot create-certificate-from-csr AWS CLI
     * command to create a certificate for the corresponding CSR.
     * </p>
     * <p>
     * The aws iot create-certificate-from-csr part of the command can also
     * be run in parallel to speed up the certificate creation process:
     * </p>
     * <p>
     * $ ls my-csr-directory/ | xargs -P 10 -I {} aws iot
     * create-certificate-from-csr --certificate-signing-request
     * file://my-csr-directory/{}
     * </p>
     * <p>
     * On Windows PowerShell, the command to create certificates for all
     * CSRs in my-csr-directory is:
     * </p>
     * <p>
     * > ls -Name my-csr-directory | %{aws iot create-certificate-from-csr
     * --certificate-signing-request file://my-csr-directory/$_}
     * </p>
     * <p>
     * On a Windows command prompt, the command to create certificates for
     * all CSRs in my-csr-directory is:
     * </p>
     * <p>
     * > forfiles /p my-csr-directory /c "cmd /c aws iot
     * create-certificate-from-csr --certificate-signing-request
     * file://@path"
     * </p>
     *
     * @param createCertificateFromCsrRequest Container for the necessary
     *           parameters to execute the CreateCertificateFromCsr service method on
     *           AWSIot.
     * 
     * @return The response from the CreateCertificateFromCsr service method,
     *         as returned by AWSIot.
     * 
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateCertificateFromCsrResult createCertificateFromCsr(CreateCertificateFromCsrRequest createCertificateFromCsrRequest) {
        ExecutionContext executionContext = createExecutionContext(createCertificateFromCsrRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCertificateFromCsrRequest> request = null;
        Response<CreateCertificateFromCsrResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCertificateFromCsrRequestMarshaller().marshall(createCertificateFromCsrRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateCertificateFromCsrResult, JsonUnmarshallerContext> unmarshaller = new CreateCertificateFromCsrResultJsonUnmarshaller();
            JsonResponseHandler<CreateCertificateFromCsrResult> responseHandler = new JsonResponseHandler<CreateCertificateFromCsrResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the specified rule.
     * </p>
     *
     * @param deleteTopicRuleRequest Container for the necessary parameters
     *           to execute the DeleteTopicRule service method on AWSIot.
     * 
     * 
     * @throws InvalidRequestException
     * @throws InternalException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSIot indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteTopicRule(DeleteTopicRuleRequest deleteTopicRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteTopicRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteTopicRuleRequest> request;
        awsRequestMetrics.startEvent(Field.RequestMarshallTime);
        try {
            request = new DeleteTopicRuleRequestMarshaller().marshall(deleteTopicRuleRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
        } finally {
            awsRequestMetrics.endEvent(Field.RequestMarshallTime);
        }
        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }

    @Override
    public void setEndpoint(String endpoint) {
        super.setEndpoint(endpoint);
    }

    @Override
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        super.setEndpoint(endpoint, serviceName, regionId);
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
        