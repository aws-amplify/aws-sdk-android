/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * a set of operations (API). Your conversational bot uses the runtime API to
 * understand user utterances (user input text or voice). For example, suppose a
 * user says "I want pizza", your bot sends this input to Amazon Lex using the
 * runtime API. Amazon Lex recognizes that the user request is for the
 * OrderPizza intent (one of the intents defined in the bot). Then Amazon Lex
 * engages in user conversation on behalf of the bot to elicit required
 * information (slot values, such as pizza size and crust type), and then
 * performs fulfillment activity (that you configured when you created the bot).
 * You use the build-time API to create and manage your Amazon Lex bot. For a
 * list of build-time operations, see the build-time API, .
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
     * Sends user input (text or speech) to Amazon Lex. Clients use this API to
     * send requests to Amazon Lex at runtime. Amazon Lex interprets the user
     * input using the machine learning model that it built for the bot.
     * </p>
     * <p>
     * In response, Amazon Lex returns the next message to convey to the user.
     * Consider the following example messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a user input "I would like a pizza," Amazon Lex might return a
     * response with a message eliciting slot data (for example,
     * <code>PizzaSize</code>): "What size pizza would you like?".
     * </p>
     * </li>
     * <li>
     * <p>
     * After the user provides all of the pizza order information, Amazon Lex
     * might return a response with a message to get user confirmation:
     * "Order the pizza?".
     * </p>
     * </li>
     * <li>
     * <p>
     * After the user replies "Yes" to the confirmation prompt, Amazon Lex might
     * return a conclusion statement:
     * "Thank you, your cheese pizza has been ordered.".
     * </p>
     * </li>
     * </ul>
     * <p>
     * Not all Amazon Lex messages require a response from the user. For
     * example, conclusion statements do not require a response. Some messages
     * require only a yes or no response. In addition to the
     * <code>message</code>, Amazon Lex provides additional context about the
     * message in the response that you can use to enhance client behavior, such
     * as displaying the appropriate client user interface. Consider the
     * following examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the message is to elicit slot data, Amazon Lex returns the following
     * context information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>x-amz-lex-dialog-state</code> header set to <code>ElicitSlot</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-lex-intent-name</code> header set to the intent name in the
     * current context
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-lex-slot-to-elicit</code> header set to the slot name for
     * which the <code>message</code> is eliciting information
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-amz-lex-slots</code> header set to a map of slots configured for
     * the intent with their current values
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * If the message is a confirmation prompt, the
     * <code>x-amz-lex-dialog-state</code> header is set to
     * <code>Confirmation</code> and the <code>x-amz-lex-slot-to-elicit</code>
     * header is omitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the message is a clarification prompt configured for the intent,
     * indicating that the user intent is not understood, the
     * <code>x-amz-dialog-state</code> header is set to
     * <code>ElicitIntent</code> and the <code>x-amz-slot-to-elicit</code>
     * header is omitted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In addition, Amazon Lex also returns your application-specific
     * <code>sessionAttributes</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html"
     * >Managing Conversation Context</a>.
     * </p>
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
     * Sends user input (text-only) to Amazon Lex. Client applications can use
     * this API to send requests to Amazon Lex at runtime. Amazon Lex then
     * interprets the user input using the machine learning model it built for
     * the bot.
     * </p>
     * <p>
     * In response, Amazon Lex returns the next <code>message</code> to convey
     * to the user an optional <code>responseCard</code> to display. Consider
     * the following example messages:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a user input "I would like a pizza", Amazon Lex might return a
     * response with a message eliciting slot data (for example, PizzaSize):
     * "What size pizza would you like?"
     * </p>
     * </li>
     * <li>
     * <p>
     * After the user provides all of the pizza order information, Amazon Lex
     * might return a response with a message to obtain user confirmation
     * "Proceed with the pizza order?".
     * </p>
     * </li>
     * <li>
     * <p>
     * After the user replies to a confirmation prompt with a "yes", Amazon Lex
     * might return a conclusion statement:
     * "Thank you, your cheese pizza has been ordered.".
     * </p>
     * </li>
     * </ul>
     * <p>
     * Not all Amazon Lex messages require a user response. For example, a
     * conclusion statement does not require a response. Some messages require
     * only a "yes" or "no" user response. In addition to the
     * <code>message</code>, Amazon Lex provides additional context about the
     * message in the response that you might use to enhance client behavior,
     * for example, to display the appropriate client user interface. These are
     * the <code>slotToElicit</code>, <code>dialogState</code>,
     * <code>intentName</code>, and <code>slots</code> fields in the response.
     * Consider the following examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the message is to elicit slot data, Amazon Lex returns the following
     * context information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>dialogState</code> set to ElicitSlot
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>intentName</code> set to the intent name in the current context
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>slotToElicit</code> set to the slot name for which the
     * <code>message</code> is eliciting information
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>slots</code> set to a map of slots, configured for the intent, with
     * currently known values
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * If the message is a confirmation prompt, the <code>dialogState</code> is
     * set to ConfirmIntent and <code>SlotToElicit</code> is set to null.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the message is a clarification prompt (configured for the intent) that
     * indicates that user intent is not understood, the
     * <code>dialogState</code> is set to ElicitIntent and
     * <code>slotToElicit</code> is set to null.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In addition, Amazon Lex also returns your application-specific
     * <code>sessionAttributes</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/context-mgmt.html"
     * >Managing Conversation Context</a>.
     * </p>
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
