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

package com.amazonaws.services.amazonaugmentedairuntime;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.amazonaugmentedairuntime.model.*;

/**
 * Interface for accessing Amazon Augmented AI Runtime <important>
 * <p>
 * Amazon Augmented AI is in preview release and is subject to change. We do not
 * recommend using this product in production environments.
 * </p>
 * </important>
 * <p>
 * Amazon Augmented AI (Amazon A2I) adds the benefit of human judgment to any
 * machine learning application. When an AI application can't evaluate data with
 * a high degree of confidence, human reviewers can take over. This human review
 * is called a human review workflow. To create and start a human review
 * workflow, you need three resources: a <i>worker task template</i>, a <i>flow
 * definition</i>, and a <i>human loop</i>.
 * </p>
 * <p>
 * For information about these resources and prerequisites for using Amazon A2I,
 * see <a href=
 * "https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-getting-started.html"
 * >Get Started with Amazon Augmented AI</a> in the Amazon SageMaker Developer
 * Guide.
 * </p>
 * <p>
 * This API reference includes information about API actions and data types that
 * you can use to interact with Amazon A2I programmatically. Use this guide to:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Start a human loop with the <code>StartHumanLoop</code> operation when using
 * Amazon A2I with a <i>custom task type</i>. To learn more about the difference
 * between custom and built-in task types, see <a href=
 * "https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-task-types-general.html"
 * >Use Task Types </a>. To learn how to start a human loop using this API, see
 * <a href=
 * "https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-start-human-loop.html#a2i-instructions-starthumanloop"
 * >Create and Start a Human Loop for a Custom Task Type </a> in the Amazon
 * SageMaker Developer Guide.
 * </p>
 * </li>
 * <li>
 * <p>
 * Manage your human loops. You can list all human loops that you have created,
 * describe individual human loops, and stop and delete human loops. To learn
 * more, see <a href=
 * "https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-monitor-humanloop-results.html"
 * >Monitor and Manage Your Human Loop </a> in the Amazon SageMaker Developer
 * Guide.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Amazon A2I integrates APIs from various AWS services to create and start
 * human review workflows for those services. To learn how Amazon A2I uses these
 * APIs, see <a href=
 * "https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-api-references.html">Use
 * APIs in Amazon A2I</a> in the Amazon SageMaker Developer Guide.
 * </p>
 **/
public interface AmazonAugmentedAIRuntime {

    /**
     * Overrides the default endpoint for this client
     * ("https://a2i-runtime.sagemaker.us-east-1.amazonaws.com"). Callers can
     * use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "a2i-runtime.sagemaker.us-east-1.amazonaws.com") or a full URL, including
     * the protocol (ex:
     * "https://a2i-runtime.sagemaker.us-east-1.amazonaws.com"). If the protocol
     * is not specified here, the default protocol from this client's
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
     * @param endpoint The endpoint (ex:
     *            "a2i-runtime.sagemaker.us-east-1.amazonaws.com") or a full
     *            URL, including the protocol (ex:
     *            "https://a2i-runtime.sagemaker.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonAugmentedAIRuntime#setEndpoint(String)},
     * sets the regional endpoint for this client's service calls. Callers can
     * use this method to control which AWS region they want to work with.
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
     * Deletes the specified human loop for a flow definition.
     * </p>
     * 
     * @param deleteHumanLoopRequest
     * @return deleteHumanLoopResult The response from the DeleteHumanLoop
     *         service method, as returned by Amazon Augmented AI Runtime.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Augmented AI Runtime indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteHumanLoopResult deleteHumanLoop(DeleteHumanLoopRequest deleteHumanLoopRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the specified human loop.
     * </p>
     * 
     * @param describeHumanLoopRequest
     * @return describeHumanLoopResult The response from the DescribeHumanLoop
     *         service method, as returned by Amazon Augmented AI Runtime.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Augmented AI Runtime indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeHumanLoopResult describeHumanLoop(DescribeHumanLoopRequest describeHumanLoopRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about human loops, given the specified parameters. If
     * a human loop was deleted, it will not be included.
     * </p>
     * 
     * @param listHumanLoopsRequest
     * @return listHumanLoopsResult The response from the ListHumanLoops service
     *         method, as returned by Amazon Augmented AI Runtime.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Augmented AI Runtime indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListHumanLoopsResult listHumanLoops(ListHumanLoopsRequest listHumanLoopsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts a human loop, provided that at least one activation condition is
     * met.
     * </p>
     * 
     * @param startHumanLoopRequest
     * @return startHumanLoopResult The response from the StartHumanLoop service
     *         method, as returned by Amazon Augmented AI Runtime.
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws InternalServerException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Augmented AI Runtime indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    StartHumanLoopResult startHumanLoop(StartHumanLoopRequest startHumanLoopRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops the specified human loop.
     * </p>
     * 
     * @param stopHumanLoopRequest
     * @return stopHumanLoopResult The response from the StopHumanLoop service
     *         method, as returned by Amazon Augmented AI Runtime.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Augmented AI Runtime indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    StopHumanLoopResult stopHumanLoop(StopHumanLoopRequest stopHumanLoopRequest)
            throws AmazonClientException, AmazonServiceException;

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
