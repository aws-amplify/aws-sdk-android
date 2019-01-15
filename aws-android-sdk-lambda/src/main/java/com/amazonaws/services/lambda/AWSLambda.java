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

package com.amazonaws.services.lambda;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.lambda.model.*;

/**
 * Interface for accessing AWS Lambda <fullname>AWS Lambda</fullname>
 * <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This is the <i>AWS Lambda API Reference</i>. The AWS Lambda Developer Guide
 * provides additional information. For the service overview, see <a
 * href="http://docs.aws.amazon.com/lambda/latest/dg/welcome.html">What is AWS
 * Lambda</a>, and for information about how the service works, see <a
 * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"
 * >AWS Lambda: How it Works</a> in the <b>AWS Lambda Developer Guide</b>.
 * </p>
 **/
public interface AWSLambda {

    /**
     * Overrides the default endpoint for this client
     * ("https://lambda.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "lambda.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://lambda.us-east-1.amazonaws.com"). If the protocol is not
     * specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint The endpoint (ex: "lambda.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://lambda.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSLambda#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException If the given region is null,
     *             or if this service isn't available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;

    /**
     * <p>
     * Invokes a Lambda function. For an example, see <a href=
     * "http://docs.aws.amazon.com/lambda/latest/dg/with-dynamodb-create-function.html#with-dbb-invoke-manually"
     * >Create the Lambda Function and Test It Manually</a>.
     * </p>
     * <p>
     * Specify just a function name to invoke the latest version of the
     * function. To invoke a published version, use the <code>Qualifier</code>
     * parameter to specify a <a href=
     * "http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"
     * >version or alias</a>.
     * </p>
     * <p>
     * If you use the <code>RequestResponse</code> (synchronous) invocation
     * option, the function will be invoked only once. If you use the
     * <code>Event</code> (asynchronous) invocation option, the function will be
     * invoked at least once in response to an event and the function must be
     * idempotent to handle this.
     * </p>
     * <p>
     * For functions with a long timeout, your client may be disconnected during
     * synchronous invocation while it waits for a response. Configure your HTTP
     * client, SDK, firewall, proxy, or operating system to allow for long
     * connections with timeout or keep-alive settings.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:InvokeFunction</code> action.
     * </p>
     * <p>
     * The <code>TooManyRequestsException</code> noted below will return the
     * following: <code>ConcurrentInvocationLimitExceeded</code> will be
     * returned if you have no functions with reserved concurrency and have
     * exceeded your account concurrent limit or if a function without reserved
     * concurrency exceeds the account's unreserved concurrency limit.
     * <code>ReservedFunctionConcurrentInvocationLimitExceeded</code> will be
     * returned when a function with reserved concurrency exceeds its configured
     * concurrency limit.
     * </p>
     * 
     * @param invokeRequest
     * @return invokeResult The response from the Invoke service method, as
     *         returned by AWS Lambda.
     * @throws ServiceException
     * @throws ResourceNotFoundException
     * @throws InvalidRequestContentException
     * @throws RequestTooLargeException
     * @throws UnsupportedMediaTypeException
     * @throws TooManyRequestsException
     * @throws InvalidParameterValueException
     * @throws EC2UnexpectedException
     * @throws SubnetIPAddressLimitReachedException
     * @throws ENILimitReachedException
     * @throws EC2ThrottledException
     * @throws EC2AccessDeniedException
     * @throws InvalidSubnetIDException
     * @throws InvalidSecurityGroupIDException
     * @throws InvalidZipFileException
     * @throws KMSDisabledException
     * @throws KMSInvalidStateException
     * @throws KMSAccessDeniedException
     * @throws KMSNotFoundException
     * @throws InvalidRuntimeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Lambda indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    InvokeResult invoke(InvokeRequest invokeRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request The originally executed request.
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
