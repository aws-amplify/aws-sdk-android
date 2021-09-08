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

package com.amazonaws.services.iotdata;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.iotdata.model.*;

/**
 * Interface for accessing AWS IoT Data <fullname>IoT data</fullname>
 * <p>
 * IoT data enables secure, bi-directional communication between
 * Internet-connected things (such as sensors, actuators, embedded devices, or
 * smart appliances) and the Amazon Web Services cloud. It implements a broker
 * for applications and things to publish messages over HTTP (Publish) and
 * retrieve, update, and delete shadows. A shadow is a persistent representation
 * of your things and their state in the Amazon Web Services cloud.
 * </p>
 * <p>
 * Find the endpoint address for actions in IoT data by running this CLI
 * command:
 * </p>
 * <p>
 * <code>aws iot describe-endpoint --endpoint-type iot:Data-ATS</code>
 * </p>
 * <p>
 * The service name used by <a href=
 * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
 * >Amazon Web ServicesSignature Version 4</a> to sign requests is:
 * <i>iotdevicegateway</i>.
 * </p>
 **/
public interface AWSIotData {

    /**
     * Overrides the default endpoint for this client
     * ("https://data.iot.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "data.iot.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://data.iot.us-east-1.amazonaws.com"). If the protocol is not
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
     * @param endpoint The endpoint (ex: "data.iot.us-east-1.amazonaws.com") or
     *            a full URL, including the protocol (ex:
     *            "https://data.iot.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSIotData#setEndpoint(String)}, sets the
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
     * Deletes the shadow for the specified thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >DeleteThingShadow</a> action.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/iot/latest/developerguide/API_DeleteThingShadow.html"
     * >DeleteThingShadow</a> in the IoT Developer Guide.
     * </p>
     * 
     * @param deleteThingShadowRequest <p>
     *            The input for the DeleteThingShadow operation.
     *            </p>
     * @return deleteThingShadowResult The response from the DeleteThingShadow
     *         service method, as returned by AWS IoT Data.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws MethodNotAllowedException
     * @throws UnsupportedDocumentEncodingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Data indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteThingShadowResult deleteThingShadow(DeleteThingShadowRequest deleteThingShadowRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the details of a single retained message for the specified topic.
     * </p>
     * <p>
     * This action returns the message payload of the retained message, which
     * can incur messaging costs. To list only the topic names of the retained
     * messages, call <a
     * href="/iot/latest/developerguide/API_iotdata_ListRetainedMessages.html"
     * >ListRetainedMessages</a>.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiotfleethubfordevicemanagement.html#awsiotfleethubfordevicemanagement-actions-as-permissions"
     * >GetRetainedMessage</a> action.
     * </p>
     * <p>
     * For more information about messaging costs, see <a
     * href="http://aws.amazon.com/iot-core/pricing/#Messaging">IoT Core pricing
     * - Messaging</a>.
     * </p>
     * 
     * @param getRetainedMessageRequest <p>
     *            The input for the GetRetainedMessage operation.
     *            </p>
     * @return getRetainedMessageResult The response from the GetRetainedMessage
     *         service method, as returned by AWS IoT Data.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws MethodNotAllowedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Data indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRetainedMessageResult getRetainedMessage(GetRetainedMessageRequest getRetainedMessageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the shadow for the specified thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >GetThingShadow</a> action.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/iot/latest/developerguide/API_GetThingShadow.html"
     * >GetThingShadow</a> in the IoT Developer Guide.
     * </p>
     * 
     * @param getThingShadowRequest <p>
     *            The input for the GetThingShadow operation.
     *            </p>
     * @return getThingShadowResult The response from the GetThingShadow service
     *         method, as returned by AWS IoT Data.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws MethodNotAllowedException
     * @throws UnsupportedDocumentEncodingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Data indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetThingShadowResult getThingShadow(GetThingShadowRequest getThingShadowRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the shadows for the specified thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >ListNamedShadowsForThing</a> action.
     * </p>
     * 
     * @param listNamedShadowsForThingRequest
     * @return listNamedShadowsForThingResult The response from the
     *         ListNamedShadowsForThing service method, as returned by AWS IoT
     *         Data.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws MethodNotAllowedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Data indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListNamedShadowsForThingResult listNamedShadowsForThing(
            ListNamedShadowsForThingRequest listNamedShadowsForThingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists summary information about the retained messages stored for the
     * account.
     * </p>
     * <p>
     * This action returns only the topic names of the retained messages. It
     * doesn't return any message payloads. Although this action doesn't return
     * a message payload, it can still incur messaging costs.
     * </p>
     * <p>
     * To get the message payload of a retained message, call <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/API_iotdata_GetRetainedMessage.html"
     * >GetRetainedMessage</a> with the topic name of the retained message.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiotfleethubfordevicemanagement.html#awsiotfleethubfordevicemanagement-actions-as-permissions"
     * >ListRetainedMessages</a> action.
     * </p>
     * <p>
     * For more information about messaging costs, see <a
     * href="http://aws.amazon.com/iot-core/pricing/#Messaging">IoT Core pricing
     * - Messaging</a>.
     * </p>
     * 
     * @param listRetainedMessagesRequest
     * @return listRetainedMessagesResult The response from the
     *         ListRetainedMessages service method, as returned by AWS IoT Data.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws MethodNotAllowedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Data indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListRetainedMessagesResult listRetainedMessages(
            ListRetainedMessagesRequest listRetainedMessagesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Publishes an MQTT message.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >Publish</a> action.
     * </p>
     * <p>
     * For more information about MQTT messages, see <a
     * href="http://docs.aws.amazon.com/iot/latest/developerguide/mqtt.html"
     * >MQTT Protocol</a> in the IoT Developer Guide.
     * </p>
     * <p>
     * For more information about messaging costs, see <a
     * href="http://aws.amazon.com/iot-core/pricing/#Messaging">IoT Core pricing
     * - Messaging</a>.
     * </p>
     * 
     * @param publishRequest <p>
     *            The input for the Publish operation.
     *            </p>
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws UnauthorizedException
     * @throws MethodNotAllowedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Data indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void publish(PublishRequest publishRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates the shadow for the specified thing.
     * </p>
     * <p>
     * Requires permission to access the <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
     * >UpdateThingShadow</a> action.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/iot/latest/developerguide/API_UpdateThingShadow.html"
     * >UpdateThingShadow</a> in the IoT Developer Guide.
     * </p>
     * 
     * @param updateThingShadowRequest <p>
     *            The input for the UpdateThingShadow operation.
     *            </p>
     * @return updateThingShadowResult The response from the UpdateThingShadow
     *         service method, as returned by AWS IoT Data.
     * @throws ConflictException
     * @throws RequestEntityTooLargeException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws UnauthorizedException
     * @throws ServiceUnavailableException
     * @throws InternalFailureException
     * @throws MethodNotAllowedException
     * @throws UnsupportedDocumentEncodingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Data indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateThingShadowResult updateThingShadow(UpdateThingShadowRequest updateThingShadowRequest)
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
