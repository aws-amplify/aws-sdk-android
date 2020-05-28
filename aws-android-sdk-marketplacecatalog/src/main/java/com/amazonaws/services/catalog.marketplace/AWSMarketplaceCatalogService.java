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

package com.amazonaws.services.catalog.marketplace;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.catalog.marketplace.model.*;

/**
 * Interface for accessing AWS Marketplace Catalog Service
 * <p>
 * Catalog API actions allow you to manage your entities through list, describe,
 * and update capabilities. An entity can be a product or an offer on AWS
 * Marketplace.
 * </p>
 * <p>
 * You can automate your entity update process by integrating the AWS
 * Marketplace Catalog API with your AWS Marketplace product build or deployment
 * pipelines. You can also create your own applications on top of the Catalog
 * API to manage your products on AWS Marketplace.
 * </p>
 **/
public interface AWSMarketplaceCatalogService {

    /**
     * Overrides the default endpoint for this client
     * ("https://catalog.marketplace.us-east-1.amazonaws.com"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "catalog.marketplace.us-east-1.amazonaws.com") or a full URL, including
     * the protocol (ex: "https://catalog.marketplace.us-east-1.amazonaws.com").
     * If the protocol is not specified here, the default protocol from this
     * client's {@link ClientConfiguration} will be used, which by default is
     * HTTPS.
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
     *            "catalog.marketplace.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex:
     *            "https://catalog.marketplace.us-east-1.amazonaws.com") of the
     *            region specific AWS endpoint this client will communicate
     *            with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to
     * {@link AWSMarketplaceCatalogService#setEndpoint(String)}, sets the
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
     * Used to cancel an open change request. Must be sent before the status of
     * the request changes to <code>APPLYING</code>, the final stage of
     * completing your change request. You can describe a change during the
     * 60-day request history retention period for API calls.
     * </p>
     * 
     * @param cancelChangeSetRequest
     * @return cancelChangeSetResult The response from the CancelChangeSet
     *         service method, as returned by AWS Marketplace Catalog Service.
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Marketplace Catalog Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    CancelChangeSetResult cancelChangeSet(CancelChangeSetRequest cancelChangeSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides information about a given change set.
     * </p>
     * 
     * @param describeChangeSetRequest
     * @return describeChangeSetResult The response from the DescribeChangeSet
     *         service method, as returned by AWS Marketplace Catalog Service.
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Marketplace Catalog Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeChangeSetResult describeChangeSet(DescribeChangeSetRequest describeChangeSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the metadata and content of the entity.
     * </p>
     * 
     * @param describeEntityRequest
     * @return describeEntityResult The response from the DescribeEntity service
     *         method, as returned by AWS Marketplace Catalog Service.
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ResourceNotSupportedException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Marketplace Catalog Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    DescribeEntityResult describeEntity(DescribeEntityRequest describeEntityRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the list of change sets owned by the account being used to make
     * the call. You can filter this list by providing any combination of
     * <code>entityId</code>, <code>ChangeSetName</code>, and status. If you
     * provide more than one filter, the API operation applies a logical AND
     * between the filters.
     * </p>
     * <p>
     * You can describe a change during the 60-day request history retention
     * period for API calls.
     * </p>
     * 
     * @param listChangeSetsRequest
     * @return listChangeSetsResult The response from the ListChangeSets service
     *         method, as returned by AWS Marketplace Catalog Service.
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Marketplace Catalog Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ListChangeSetsResult listChangeSets(ListChangeSetsRequest listChangeSetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides the list of entities of a given type.
     * </p>
     * 
     * @param listEntitiesRequest
     * @return listEntitiesResult The response from the ListEntities service
     *         method, as returned by AWS Marketplace Catalog Service.
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Marketplace Catalog Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    ListEntitiesResult listEntities(ListEntitiesRequest listEntitiesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This operation allows you to request changes for your entities. Within a
     * single ChangeSet, you cannot start the same change type against the same
     * entity multiple times. Additionally, when a ChangeSet is running, all the
     * entities targeted by the different changes are locked until the ChangeSet
     * has completed (either succeeded, cancelled, or failed). If you try to
     * start a ChangeSet containing a change against an entity that is already
     * locked, you will receive a <code>ResourceInUseException</code>.
     * </p>
     * <p>
     * For example, you cannot start the ChangeSet described in the <a href=
     * "https://docs.aws.amazon.com/marketplace-catalog/latest/api-reference/API_StartChangeSet.html#API_StartChangeSet_Examples"
     * >example</a> below because it contains two changes to execute the same
     * change type (<code>AddRevisions</code>) against the same entity (
     * <code>entity-id@1)</code>.
     * </p>
     * 
     * @param startChangeSetRequest
     * @return startChangeSetResult The response from the StartChangeSet service
     *         method, as returned by AWS Marketplace Catalog Service.
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Marketplace Catalog Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    StartChangeSetResult startChangeSet(StartChangeSetRequest startChangeSetRequest)
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
