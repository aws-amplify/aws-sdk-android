/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Interface for accessing AWS Lambda <fullname>Lambda</fullname>
 * <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * Lambda is a compute service that lets you run code without provisioning or
 * managing servers. Lambda runs your code on a high-availability compute
 * infrastructure and performs all of the administration of the compute
 * resources, including server and operating system maintenance, capacity
 * provisioning and automatic scaling, code monitoring and logging. With Lambda,
 * you can run code for virtually any type of application or backend service.
 * For more information about the Lambda service, see <a
 * href="https://docs.aws.amazon.com/lambda/latest/dg/welcome.html">What is
 * Lambda</a> in the <b>Lambda Developer Guide</b>.
 * </p>
 * <p>
 * The <i>Lambda API Reference</i> provides information about each of the API
 * methods, including details about the parameters in each API request and
 * response.
 * </p>
 * <p/>
 * <p>
 * You can use Software Development Kits (SDKs), Integrated Development
 * Environment (IDE) Toolkits, and command line tools to access the API. For
 * installation instructions, see <a href="http://aws.amazon.com/tools/">Tools
 * for Amazon Web Services</a>.
 * </p>
 * <p>
 * For a list of Region-specific endpoints that Lambda supports, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/lambda-service.html/"
 * >Lambda endpoints and quotas </a> in the <i>Amazon Web Services General
 * Reference.</i>.
 * </p>
 * <p>
 * When making the API calls, you will need to authenticate your request by
 * providing a signature. Lambda supports signature version 4. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
 * >Signature Version 4 signing process</a> in the <i>Amazon Web Services
 * General Reference.</i>.
 * </p>
 * <p>
 * <b>CA certificates</b>
 * </p>
 * <p>
 * Because Amazon Web Services SDKs use the CA certificates from your computer,
 * changes to the certificates on the Amazon Web Services servers can cause
 * connection failures when you attempt to use an SDK. You can prevent these
 * failures by keeping your computer's CA certificates and operating system
 * up-to-date. If you encounter this issue in a corporate environment and do not
 * manage your own computer, you might need to ask an administrator to assist
 * with the update process. The following list shows minimum operating system
 * and Java versions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Microsoft Windows versions that have updates from January 2005 or later
 * installed contain at least one of the required CAs in their trust list.
 * </p>
 * </li>
 * <li>
 * <p>
 * Mac OS X 10.4 with Java for Mac OS X 10.4 Release 5 (February 2007), Mac OS X
 * 10.5 (October 2007), and later versions contain at least one of the required
 * CAs in their trust list.
 * </p>
 * </li>
 * <li>
 * <p>
 * Red Hat Enterprise Linux 5 (March 2007), 6, and 7 and CentOS 5, 6, and 7 all
 * contain at least one of the required CAs in their default trusted CA list.
 * </p>
 * </li>
 * <li>
 * <p>
 * Java 1.4.2_12 (May 2006), 5 Update 2 (March 2005), and all later versions,
 * including Java 6 (December 2006), 7, and 8, contain at least one of the
 * required CAs in their default trusted CA list.
 * </p>
 * </li>
 * </ul>
 * <p>
 * When accessing the Lambda management console or Lambda API endpoints, whether
 * through browsers or programmatically, you will need to ensure your client
 * machines support any of the following CAs:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Amazon Root CA 1
 * </p>
 * </li>
 * <li>
 * <p>
 * Starfield Services Root Certificate Authority - G2
 * </p>
 * </li>
 * <li>
 * <p>
 * Starfield Class 2 Certification Authority
 * </p>
 * </li>
 * </ul>
 * <p>
 * Root certificates from the first two authorities are available from <a
 * href="https://www.amazontrust.com/repository/">Amazon trust services</a>, but
 * keeping your computer up-to-date is the more straightforward solution. To
 * learn more about ACM-provided certificates, see <a
 * href="http://aws.amazon.com/certificate-manager/faqs/#certificates">Amazon
 * Web Services Certificate Manager FAQs.</a>
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
     * Invokes a Lambda function. You can invoke a function synchronously (and
     * wait for the response), or asynchronously. To invoke a function
     * asynchronously, set <code>InvocationType</code> to <code>Event</code>.
     * </p>
     * <p>
     * For <a href=
     * "https://docs.aws.amazon.com/lambda/latest/dg/invocation-sync.html"
     * >synchronous invocation</a>, details about the function response,
     * including errors, are included in the response body and headers. For
     * either invocation type, you can find more information in the <a href=
     * "https://docs.aws.amazon.com/lambda/latest/dg/monitoring-functions.html"
     * >execution log</a> and <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-x-ray.html"
     * >trace</a>.
     * </p>
     * <p>
     * When an error occurs, your function may be invoked multiple times. Retry
     * behavior varies by error type, client, event source, and invocation type.
     * For example, if you invoke a function asynchronously and it returns an
     * error, Lambda executes the function up to two more times. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/lambda/latest/dg/retries-on-errors.html"
     * >Retry Behavior</a>.
     * </p>
     * <p>
     * For <a href=
     * "https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html"
     * >asynchronous invocation</a>, Lambda adds events to a queue before
     * sending them to your function. If your function does not have enough
     * capacity to keep up with the queue, events may be lost. Occasionally,
     * your function may receive the same event multiple times, even if no error
     * occurs. To retain events that were not processed, configure your function
     * with a <a href=
     * "https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq"
     * >dead-letter queue</a>.
     * </p>
     * <p>
     * The status code in the API response doesn't reflect function errors.
     * Error codes are reserved for errors that prevent your function from
     * executing, such as permissions errors, <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/limits.html">limit
     * errors</a>, or issues with your function's code and configuration. For
     * example, Lambda returns <code>TooManyRequestsException</code> if
     * executing the function would cause you to exceed a concurrency limit at
     * either the account level (<code>ConcurrentInvocationLimitExceeded</code>)
     * or function level (
     * <code>ReservedFunctionConcurrentInvocationLimitExceeded</code>).
     * </p>
     * <p>
     * For functions with a long timeout, your client might be disconnected
     * during synchronous invocation while it waits for a response. Configure
     * your HTTP client, SDK, firewall, proxy, or operating system to allow for
     * long connections with timeout or keep-alive settings.
     * </p>
     * <p>
     * This operation requires permission for the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/list_awslambda.html"
     * >lambda:InvokeFunction</a> action.
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
     * @throws EFSMountConnectivityException
     * @throws EFSMountFailureException
     * @throws EFSMountTimeoutException
     * @throws EFSIOException
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
     * @throws ResourceConflictException
     * @throws ResourceNotReadyException
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
