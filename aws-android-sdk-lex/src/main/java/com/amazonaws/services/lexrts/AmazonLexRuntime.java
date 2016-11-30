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

package com.amazonaws.services.lexrts;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.lexrts.model.*;

/**
 * Interface for accessing Amazon Lex Runtime Service
 * <p>
 * Amazon Lex provides both build and runtime endpoints. Each endpoint provides
 * a set of operations (API). Your application uses the runtime API to
 * understand user utterances (user input text or voice). For example, suppose
 * user says "I want pizza", your application sends this input to Amazon Lex
 * using the runtime API. Amazon Lex recognizes that the user request is for the
 * OrderPizza intent (one of the intents defined in the application). Then
 * Amazon Lex engages in user conversation on behalf of the application to
 * elicit required information (slot values, such as pizza size and crust type),
 * and then performs fulfillment activity (that you configured when you created
 * the application). You use the build-time API to create and manage your Amazon
 * Lex applications. For a list of build-time operations, see the build-time
 * API. .
 * </p>
 **/
public interface AmazonLexRuntime {

    /**
     * Overrides the default endpoint for this client
     * ("https://runtime.lex.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "runtime.lex.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://runtime.lex.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
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
     * @param endpoint The endpoint (ex: "runtime.lex.us-east-1.amazonaws.com")
     *            or a full URL, including the protocol (ex:
     *            "https://runtime.lex.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonLexRuntime#setEndpoint(String)}, sets the
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
     * Sends user input (speech or text), at runtime, to Amazon Lex. Amazon Lex
     * uses the machine learning model (built for the specific bot), in order to
     * interpret the user input specified in the request.
     * </p>
     * <note>
     * <p>
     * When building Amazon Lex text bots, you can use the <code>PostText</code>
     * API operation, which supports response cards. When building Amazon Lex
     * bots that communicate by speech alone or by speech and text, you use the
     * this API.
     * </p>
     * </note>
     * <p>
     * In response, Amazon Lex returns the next <code>message</code> to convey
     * to the user and the message type (<code>dialogState</code>). Based on the
     * user interaction context, Amazon Lex knows the message to return and the
     * message type indicates whether to expect a user response for that
     * message. For example, consider the following response messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "What pizza toppings would you like?" - For this message, the
     * <code>dialogState</code> would be <code>ElicitSlot</code> (that is, a
     * user response is expected).
     * </p>
     * </li>
     * <li>
     * <p>
     * "Your order has been placed." - For this message, Amazon Lex returns one
     * of the following dialog states depending on how the fulfillment is
     * configured for the intent (see <code>fulfillmentActivity</code> in
     * <code>CreateIntent</code>):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FulFilled</code> – The intent <code>fulfillmentActivity</code> is
     * configured with a Lambda function to fulfill the intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfilment</code> – The intent's
     * <code>fulfillmentActivity</code> is configured to simply return the
     * intent data back to the client application.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param postContentRequest
     * @return postContentResult The response from the PostContent service
     *         method, as returned by Amazon Lex Runtime Service.
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws UnsupportedMediaTypeException
     * @throws NotAcceptableException
     * @throws RequestTimeoutException
     * @throws DependencyFailedException
     * @throws BadGatewayException
     * @throws LoopDetectedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Runtime Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    PostContentResult postContent(PostContentRequest postContentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sends user input text to Amazon Lex at runtime. Amazon Lex uses the
     * machine learning model that the service built for the application to
     * interpret user input.
     * </p>
     * <p>
     * In response, Amazon Lex returns the next message to convey to the user
     * (based on the context of the user interaction) and whether to expect a
     * user response to the message (<code>dialogState</code>). For example,
     * consider the following response messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "What pizza toppings would you like?" – In this case, the
     * <code>dialogState</code> would be <code>ElicitSlot</code> (that is, a
     * user response is expected).
     * </p>
     * </li>
     * <li>
     * <p>
     * "Your order has been placed." – In this case, Amazon Lex returns one of
     * the following <code>dialogState</code> values depending on how the intent
     * fulfillment is configured (see <code>fulfillmentActivity</code> in
     * <code>CreateIntent</code>):
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FulFilled</code> – The intent fulfillment is configured through a
     * Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadyForFulfilment</code> – The intent's
     * <code>fulfillmentActivity</code> is to simply return the intent data back
     * to the client application.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param postTextRequest
     * @return postTextResult The response from the PostText service method, as
     *         returned by Amazon Lex Runtime Service.
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws DependencyFailedException
     * @throws BadGatewayException
     * @throws LoopDetectedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Lex Runtime Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    PostTextResult postText(PostTextRequest postTextRequest) throws AmazonClientException,
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
