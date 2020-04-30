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

package com.amazonaws.services.awsiotevents;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.awsiotevents.model.*;

/**
 * Interface for accessing AWS IoT Events
 * <p>
 * AWS IoT Events monitors your equipment or device fleets for failures or
 * changes in operation, and triggers actions when such events occur. You can
 * use AWS IoT Events API operations to create, read, update, and delete inputs
 * and detector models, and to list their versions.
 * </p>
 **/
public interface AWSIoTEvents {

    /**
     * Overrides the default endpoint for this client
     * ("https://iotevents.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "iotevents.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://iotevents.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex: "iotevents.us-east-1.amazonaws.com") or
     *            a full URL, including the protocol (ex:
     *            "https://iotevents.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSIoTEvents#setEndpoint(String)}, sets the
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
     * Creates a detector model.
     * </p>
     * 
     * @param createDetectorModelRequest
     * @return createDetectorModelResult The response from the
     *         CreateDetectorModel service method, as returned by AWS IoT
     *         Events.
     * @throws InvalidRequestException
     * @throws ResourceInUseException
     * @throws ResourceAlreadyExistsException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Events indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDetectorModelResult createDetectorModel(
            CreateDetectorModelRequest createDetectorModelRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates an input.
     * </p>
     * 
     * @param createInputRequest
     * @return createInputResult The response from the CreateInput service
     *         method, as returned by AWS IoT Events.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ServiceUnavailableException
     * @throws ResourceAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Events indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateInputResult createInput(CreateInputRequest createInputRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a detector model. Any active instances of the detector model are
     * also deleted.
     * </p>
     * 
     * @param deleteDetectorModelRequest
     * @return deleteDetectorModelResult The response from the
     *         DeleteDetectorModel service method, as returned by AWS IoT
     *         Events.
     * @throws InvalidRequestException
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Events indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteDetectorModelResult deleteDetectorModel(
            DeleteDetectorModelRequest deleteDetectorModelRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes an input.
     * </p>
     * 
     * @param deleteInputRequest
     * @return deleteInputResult The response from the DeleteInput service
     *         method, as returned by AWS IoT Events.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ServiceUnavailableException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Events indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteInputResult deleteInput(DeleteInputRequest deleteInputRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes a detector model. If the <code>version</code> parameter is not
     * specified, information about the latest version is returned.
     * </p>
     * 
     * @param describeDetectorModelRequest
     * @return describeDetectorModelResult The response from the
     *         DescribeDetectorModel service method, as returned by AWS IoT
     *         Events.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Events indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeDetectorModelResult describeDetectorModel(
            DescribeDetectorModelRequest describeDetectorModelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes an input.
     * </p>
     * 
     * @param describeInputRequest
     * @return describeInputResult The response from the DescribeInput service
     *         method, as returned by AWS IoT Events.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Events indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeInputResult describeInput(DescribeInputRequest describeInputRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the current settings of the AWS IoT Events logging options.
     * </p>
     * 
     * @param describeLoggingOptionsRequest
     * @return describeLoggingOptionsResult The response from the
     *         DescribeLoggingOptions service method, as returned by AWS IoT
     *         Events.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws ServiceUnavailableException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Events indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeLoggingOptionsResult describeLoggingOptions(
            DescribeLoggingOptionsRequest describeLoggingOptionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all the versions of a detector model. Only the metadata associated
     * with each detector model version is returned.
     * </p>
     * 
     * @param listDetectorModelVersionsRequest
     * @return listDetectorModelVersionsResult The response from the
     *         ListDetectorModelVersions service method, as returned by AWS IoT
     *         Events.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Events indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDetectorModelVersionsResult listDetectorModelVersions(
            ListDetectorModelVersionsRequest listDetectorModelVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the detector models you have created. Only the metadata associated
     * with each detector model is returned.
     * </p>
     * 
     * @param listDetectorModelsRequest
     * @return listDetectorModelsResult The response from the ListDetectorModels
     *         service method, as returned by AWS IoT Events.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Events indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDetectorModelsResult listDetectorModels(ListDetectorModelsRequest listDetectorModelsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the inputs you have created.
     * </p>
     * 
     * @param listInputsRequest
     * @return listInputsResult The response from the ListInputs service method,
     *         as returned by AWS IoT Events.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Events indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListInputsResult listInputs(ListInputsRequest listInputsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the tags (metadata) you have assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS IoT
     *         Events.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Events indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Sets or updates the AWS IoT Events logging options.
     * </p>
     * <p>
     * If you update the value of any <code>loggingOptions</code> field, it
     * takes up to one minute for the change to take effect. If you change the
     * policy attached to the role you specified in the <code>roleArn</code>
     * field (for example, to correct an invalid policy), it takes up to five
     * minutes for that change to take effect.
     * </p>
     * 
     * @param putLoggingOptionsRequest
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ServiceUnavailableException
     * @throws UnsupportedOperationException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Events indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void putLoggingOptions(PutLoggingOptionsRequest putLoggingOptionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds to or modifies the tags of the given resource. Tags are metadata
     * that can be used to manage a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AWS IoT Events.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Events indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes the given tags (metadata) from the resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by AWS IoT Events.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Events indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a detector model. Detectors (instances) spawned by the previous
     * version are deleted and then re-created as new inputs arrive.
     * </p>
     * 
     * @param updateDetectorModelRequest
     * @return updateDetectorModelResult The response from the
     *         UpdateDetectorModel service method, as returned by AWS IoT
     *         Events.
     * @throws InvalidRequestException
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Events indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateDetectorModelResult updateDetectorModel(
            UpdateDetectorModelRequest updateDetectorModelRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates an input.
     * </p>
     * 
     * @param updateInputRequest
     * @return updateInputResult The response from the UpdateInput service
     *         method, as returned by AWS IoT Events.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ServiceUnavailableException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT Events indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateInputResult updateInput(UpdateInputRequest updateInputRequest)
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
