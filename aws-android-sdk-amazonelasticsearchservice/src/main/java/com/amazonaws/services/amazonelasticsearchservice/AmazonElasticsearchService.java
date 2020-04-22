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

package com.amazonaws.services.amazonelasticsearchservice;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.amazonelasticsearchservice.model.*;

/**
 * Interface for accessing Amazon Elasticsearch Service <fullname>Amazon
 * Elasticsearch Configuration Service</fullname>
 * <p>
 * Use the Amazon Elasticsearch Configuration API to create, configure, and
 * manage Elasticsearch domains.
 * </p>
 * <p>
 * For sample code that uses the Configuration API, see the <a href=
 * "https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-configuration-samples.html"
 * >Amazon Elasticsearch Service Developer Guide</a>. The guide also contains <a
 * href=
 * "https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-request-signing.html"
 * >sample code for sending signed HTTP requests to the Elasticsearch APIs</a>.
 * </p>
 * <p>
 * The endpoint for configuration service requests is region-specific:
 * es.<i>region</i>.amazonaws.com. For example, es.us-east-1.amazonaws.com. For
 * a current list of supported regions and endpoints, see <a href=
 * "http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticsearch-service-regions"
 * target="_blank">Regions and Endpoints</a>.
 * </p>
 **/
public interface AmazonElasticsearchService {

    /**
     * Overrides the default endpoint for this client
     * ("https://es.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "es.us-east-1.amazonaws.com")
     * or a full URL, including the protocol (ex:
     * "https://es.us-east-1.amazonaws.com"). If the protocol is not specified
     * here, the default protocol from this client's {@link ClientConfiguration}
     * will be used, which by default is HTTPS.
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
     * @param endpoint The endpoint (ex: "es.us-east-1.amazonaws.com") or a full
     *            URL, including the protocol (ex:
     *            "https://es.us-east-1.amazonaws.com") of the region specific
     *            AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonElasticsearchService#setEndpoint(String)},
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
     * Attaches tags to an existing Elasticsearch domain. Tags are a set of
     * case-sensitive key value pairs. An Elasticsearch domain may have up to 10
     * tags. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-awsresorcetagging"
     * target="_blank"> Tagging Amazon Elasticsearch Service Domains for more
     * information.</a>
     * </p>
     * 
     * @param addTagsRequest <p>
     *            Container for the parameters to the
     *            <code><a>AddTags</a></code> operation. Specify the tags that
     *            you want to attach to the Elasticsearch domain.
     *            </p>
     * @throws BaseException
     * @throws LimitExceededException
     * @throws ValidationException
     * @throws InternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void addTags(AddTagsRequest addTagsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Associates a package with an Amazon ES domain.
     * </p>
     * 
     * @param associatePackageRequest <p>
     *            Container for request parameters to
     *            <code> <a>AssociatePackage</a> </code> operation.
     *            </p>
     * @return associatePackageResult The response from the AssociatePackage
     *         service method, as returned by Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AssociatePackageResult associatePackage(AssociatePackageRequest associatePackageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Cancels a scheduled service software update for an Amazon ES domain. You
     * can only perform this operation before the
     * <code>AutomatedUpdateDate</code> and when the <code>UpdateStatus</code>
     * is in the <code>PENDING_UPDATE</code> state.
     * </p>
     * 
     * @param cancelElasticsearchServiceSoftwareUpdateRequest <p>
     *            Container for the parameters to the
     *            <code><a>CancelElasticsearchServiceSoftwareUpdate</a></code>
     *            operation. Specifies the name of the Elasticsearch domain that
     *            you wish to cancel a service software update on.
     *            </p>
     * @return cancelElasticsearchServiceSoftwareUpdateResult The response from
     *         the CancelElasticsearchServiceSoftwareUpdate service method, as
     *         returned by Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CancelElasticsearchServiceSoftwareUpdateResult cancelElasticsearchServiceSoftwareUpdate(
            CancelElasticsearchServiceSoftwareUpdateRequest cancelElasticsearchServiceSoftwareUpdateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new Elasticsearch domain. For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomains"
     * target="_blank">Creating Elasticsearch Domains</a> in the <i>Amazon
     * Elasticsearch Service Developer Guide</i>.
     * </p>
     * 
     * @param createElasticsearchDomainRequest
     * @return createElasticsearchDomainResult The response from the
     *         CreateElasticsearchDomain service method, as returned by Amazon
     *         Elasticsearch Service.
     * @throws BaseException
     * @throws DisabledOperationException
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws LimitExceededException
     * @throws ResourceAlreadyExistsException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateElasticsearchDomainResult createElasticsearchDomain(
            CreateElasticsearchDomainRequest createElasticsearchDomainRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Create a package for use with Amazon ES domains.
     * </p>
     * 
     * @param createPackageRequest <p>
     *            Container for request parameters to
     *            <code> <a>CreatePackage</a> </code> operation.
     *            </p>
     * @return createPackageResult The response from the CreatePackage service
     *         method, as returned by Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws LimitExceededException
     * @throws InvalidTypeException
     * @throws ResourceAlreadyExistsException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreatePackageResult createPackage(CreatePackageRequest createPackageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Permanently deletes the specified Elasticsearch domain and all of its
     * data. Once a domain is deleted, it cannot be recovered.
     * </p>
     * 
     * @param deleteElasticsearchDomainRequest <p>
     *            Container for the parameters to the
     *            <code><a>DeleteElasticsearchDomain</a></code> operation.
     *            Specifies the name of the Elasticsearch domain that you want
     *            to delete.
     *            </p>
     * @return deleteElasticsearchDomainResult The response from the
     *         DeleteElasticsearchDomain service method, as returned by Amazon
     *         Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteElasticsearchDomainResult deleteElasticsearchDomain(
            DeleteElasticsearchDomainRequest deleteElasticsearchDomainRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the service-linked role that Elasticsearch Service uses to manage
     * and maintain VPC domains. Role deletion will fail if any existing VPC
     * domains use the role. You must delete any such Elasticsearch domains
     * before deleting the role. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-enabling-slr"
     * target="_blank">Deleting Elasticsearch Service Role</a> in <i>VPC
     * Endpoints for Amazon Elasticsearch Service Domains</i>.
     * </p>
     * 
     * @param deleteElasticsearchServiceRoleRequest
     * @throws BaseException
     * @throws InternalException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteElasticsearchServiceRole(
            DeleteElasticsearchServiceRoleRequest deleteElasticsearchServiceRoleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Delete the package.
     * </p>
     * 
     * @param deletePackageRequest <p>
     *            Container for request parameters to
     *            <code> <a>DeletePackage</a> </code> operation.
     *            </p>
     * @return deletePackageResult The response from the DeletePackage service
     *         method, as returned by Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeletePackageResult deletePackage(DeletePackageRequest deletePackageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns domain configuration information about the specified
     * Elasticsearch domain, including the domain ID, domain endpoint, and
     * domain ARN.
     * </p>
     * 
     * @param describeElasticsearchDomainRequest <p>
     *            Container for the parameters to the
     *            <code><a>DescribeElasticsearchDomain</a></code> operation.
     *            </p>
     * @return describeElasticsearchDomainResult The response from the
     *         DescribeElasticsearchDomain service method, as returned by Amazon
     *         Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeElasticsearchDomainResult describeElasticsearchDomain(
            DescribeElasticsearchDomainRequest describeElasticsearchDomainRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides cluster configuration information about the specified
     * Elasticsearch domain, such as the state, creation date, update version,
     * and update date for cluster options.
     * </p>
     * 
     * @param describeElasticsearchDomainConfigRequest <p>
     *            Container for the parameters to the
     *            <code>DescribeElasticsearchDomainConfig</code> operation.
     *            Specifies the domain name for which you want configuration
     *            information.
     *            </p>
     * @return describeElasticsearchDomainConfigResult The response from the
     *         DescribeElasticsearchDomainConfig service method, as returned by
     *         Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeElasticsearchDomainConfigResult describeElasticsearchDomainConfig(
            DescribeElasticsearchDomainConfigRequest describeElasticsearchDomainConfigRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns domain configuration information about the specified
     * Elasticsearch domains, including the domain ID, domain endpoint, and
     * domain ARN.
     * </p>
     * 
     * @param describeElasticsearchDomainsRequest <p>
     *            Container for the parameters to the
     *            <code><a>DescribeElasticsearchDomains</a></code> operation. By
     *            default, the API returns the status of all Elasticsearch
     *            domains.
     *            </p>
     * @return describeElasticsearchDomainsResult The response from the
     *         DescribeElasticsearchDomains service method, as returned by
     *         Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeElasticsearchDomainsResult describeElasticsearchDomains(
            DescribeElasticsearchDomainsRequest describeElasticsearchDomainsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describe Elasticsearch Limits for a given InstanceType and
     * ElasticsearchVersion. When modifying existing Domain, specify the
     * <code> <a>DomainName</a> </code> to know what Limits are supported for
     * modifying.
     * </p>
     * 
     * @param describeElasticsearchInstanceTypeLimitsRequest <p>
     *            Container for the parameters to
     *            <code> <a>DescribeElasticsearchInstanceTypeLimits</a> </code>
     *            operation.
     *            </p>
     * @return describeElasticsearchInstanceTypeLimitsResult The response from
     *         the DescribeElasticsearchInstanceTypeLimits service method, as
     *         returned by Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeElasticsearchInstanceTypeLimitsResult describeElasticsearchInstanceTypeLimits(
            DescribeElasticsearchInstanceTypeLimitsRequest describeElasticsearchInstanceTypeLimitsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes all packages available to Amazon ES. Includes options for
     * filtering, limiting the number of results, and pagination.
     * </p>
     * 
     * @param describePackagesRequest <p>
     *            Container for request parameters to
     *            <code> <a>DescribePackage</a> </code> operation.
     *            </p>
     * @return describePackagesResult The response from the DescribePackages
     *         service method, as returned by Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribePackagesResult describePackages(DescribePackagesRequest describePackagesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists available reserved Elasticsearch instance offerings.
     * </p>
     * 
     * @param describeReservedElasticsearchInstanceOfferingsRequest <p>
     *            Container for parameters to
     *            <code>DescribeReservedElasticsearchInstanceOfferings</code>
     *            </p>
     * @return describeReservedElasticsearchInstanceOfferingsResult The response
     *         from the DescribeReservedElasticsearchInstanceOfferings service
     *         method, as returned by Amazon Elasticsearch Service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws DisabledOperationException
     * @throws InternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeReservedElasticsearchInstanceOfferingsResult describeReservedElasticsearchInstanceOfferings(
            DescribeReservedElasticsearchInstanceOfferingsRequest describeReservedElasticsearchInstanceOfferingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about reserved Elasticsearch instances for this
     * account.
     * </p>
     * 
     * @param describeReservedElasticsearchInstancesRequest <p>
     *            Container for parameters to
     *            <code>DescribeReservedElasticsearchInstances</code>
     *            </p>
     * @return describeReservedElasticsearchInstancesResult The response from
     *         the DescribeReservedElasticsearchInstances service method, as
     *         returned by Amazon Elasticsearch Service.
     * @throws ResourceNotFoundException
     * @throws InternalException
     * @throws ValidationException
     * @throws DisabledOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeReservedElasticsearchInstancesResult describeReservedElasticsearchInstances(
            DescribeReservedElasticsearchInstancesRequest describeReservedElasticsearchInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Dissociates a package from the Amazon ES domain.
     * </p>
     * 
     * @param dissociatePackageRequest <p>
     *            Container for request parameters to
     *            <code> <a>DissociatePackage</a> </code> operation.
     *            </p>
     * @return dissociatePackageResult The response from the DissociatePackage
     *         service method, as returned by Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DissociatePackageResult dissociatePackage(DissociatePackageRequest dissociatePackageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of upgrade compatible Elastisearch versions. You can
     * optionally pass a <code> <a>DomainName</a> </code> to get all upgrade
     * compatible Elasticsearch versions for that specific domain.
     * </p>
     * 
     * @param getCompatibleElasticsearchVersionsRequest <p>
     *            Container for request parameters to
     *            <code> <a>GetCompatibleElasticsearchVersions</a> </code>
     *            operation.
     *            </p>
     * @return getCompatibleElasticsearchVersionsResult The response from the
     *         GetCompatibleElasticsearchVersions service method, as returned by
     *         Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws DisabledOperationException
     * @throws ValidationException
     * @throws InternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetCompatibleElasticsearchVersionsResult getCompatibleElasticsearchVersions(
            GetCompatibleElasticsearchVersionsRequest getCompatibleElasticsearchVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the complete history of the last 10 upgrades that were
     * performed on the domain.
     * </p>
     * 
     * @param getUpgradeHistoryRequest <p>
     *            Container for request parameters to
     *            <code> <a>GetUpgradeHistory</a> </code> operation.
     *            </p>
     * @return getUpgradeHistoryResult The response from the GetUpgradeHistory
     *         service method, as returned by Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws DisabledOperationException
     * @throws ValidationException
     * @throws InternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetUpgradeHistoryResult getUpgradeHistory(GetUpgradeHistoryRequest getUpgradeHistoryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the latest status of the last upgrade or upgrade eligibility
     * check that was performed on the domain.
     * </p>
     * 
     * @param getUpgradeStatusRequest <p>
     *            Container for request parameters to
     *            <code> <a>GetUpgradeStatus</a> </code> operation.
     *            </p>
     * @return getUpgradeStatusResult The response from the GetUpgradeStatus
     *         service method, as returned by Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws DisabledOperationException
     * @throws ValidationException
     * @throws InternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetUpgradeStatusResult getUpgradeStatus(GetUpgradeStatusRequest getUpgradeStatusRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the name of all Elasticsearch domains owned by the current user's
     * account.
     * </p>
     * 
     * @param listDomainNamesRequest
     * @return listDomainNamesResult The response from the ListDomainNames
     *         service method, as returned by Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListDomainNamesResult listDomainNames(ListDomainNamesRequest listDomainNamesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all Amazon ES domains associated with the package.
     * </p>
     * 
     * @param listDomainsForPackageRequest <p>
     *            Container for request parameters to
     *            <code> <a>ListDomainsForPackage</a> </code> operation.
     *            </p>
     * @return listDomainsForPackageResult The response from the
     *         ListDomainsForPackage service method, as returned by Amazon
     *         Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListDomainsForPackageResult listDomainsForPackage(
            ListDomainsForPackageRequest listDomainsForPackageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * List all Elasticsearch instance types that are supported for given
     * ElasticsearchVersion
     * </p>
     * 
     * @param listElasticsearchInstanceTypesRequest <p>
     *            Container for the parameters to the
     *            <code> <a>ListElasticsearchInstanceTypes</a> </code>
     *            operation.
     *            </p>
     * @return listElasticsearchInstanceTypesResult The response from the
     *         ListElasticsearchInstanceTypes service method, as returned by
     *         Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListElasticsearchInstanceTypesResult listElasticsearchInstanceTypes(
            ListElasticsearchInstanceTypesRequest listElasticsearchInstanceTypesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * List all supported Elasticsearch versions
     * </p>
     * 
     * @param listElasticsearchVersionsRequest <p>
     *            Container for the parameters to the
     *            <code> <a>ListElasticsearchVersions</a> </code> operation.
     *            <p>
     *            Use <code> <a>MaxResults</a> </code> to control the maximum
     *            number of results to retrieve in a single call.
     *            </p>
     *            <p>
     *            Use <code> <a>NextToken</a> </code> in response to retrieve
     *            more results. If the received response does not contain a
     *            NextToken, then there are no more results to retrieve.
     *            </p>
     *            </p>
     * @return listElasticsearchVersionsResult The response from the
     *         ListElasticsearchVersions service method, as returned by Amazon
     *         Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListElasticsearchVersionsResult listElasticsearchVersions(
            ListElasticsearchVersionsRequest listElasticsearchVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all packages associated with the Amazon ES domain.
     * </p>
     * 
     * @param listPackagesForDomainRequest <p>
     *            Container for request parameters to
     *            <code> <a>ListPackagesForDomain</a> </code> operation.
     *            </p>
     * @return listPackagesForDomainResult The response from the
     *         ListPackagesForDomain service method, as returned by Amazon
     *         Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListPackagesForDomainResult listPackagesForDomain(
            ListPackagesForDomainRequest listPackagesForDomainRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns all tags for the given Elasticsearch domain.
     * </p>
     * 
     * @param listTagsRequest <p>
     *            Container for the parameters to the
     *            <code><a>ListTags</a></code> operation. Specify the
     *            <code>ARN</code> for the Elasticsearch domain to which the
     *            tags are attached that you want to view are attached.
     *            </p>
     * @return listTagsResult The response from the ListTags service method, as
     *         returned by Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListTagsResult listTags(ListTagsRequest listTagsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Allows you to purchase reserved Elasticsearch instances.
     * </p>
     * 
     * @param purchaseReservedElasticsearchInstanceOfferingRequest <p>
     *            Container for parameters to
     *            <code>PurchaseReservedElasticsearchInstanceOffering</code>
     *            </p>
     * @return purchaseReservedElasticsearchInstanceOfferingResult The response
     *         from the PurchaseReservedElasticsearchInstanceOffering service
     *         method, as returned by Amazon Elasticsearch Service.
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws LimitExceededException
     * @throws DisabledOperationException
     * @throws ValidationException
     * @throws InternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    PurchaseReservedElasticsearchInstanceOfferingResult purchaseReservedElasticsearchInstanceOffering(
            PurchaseReservedElasticsearchInstanceOfferingRequest purchaseReservedElasticsearchInstanceOfferingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes the specified set of tags from the specified Elasticsearch
     * domain.
     * </p>
     * 
     * @param removeTagsRequest <p>
     *            Container for the parameters to the
     *            <code><a>RemoveTags</a></code> operation. Specify the
     *            <code>ARN</code> for the Elasticsearch domain from which you
     *            want to remove the specified <code>TagKey</code>.
     *            </p>
     * @throws BaseException
     * @throws ValidationException
     * @throws InternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void removeTags(RemoveTagsRequest removeTagsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Schedules a service software update for an Amazon ES domain.
     * </p>
     * 
     * @param startElasticsearchServiceSoftwareUpdateRequest <p>
     *            Container for the parameters to the
     *            <code><a>StartElasticsearchServiceSoftwareUpdate</a></code>
     *            operation. Specifies the name of the Elasticsearch domain that
     *            you wish to schedule a service software update on.
     *            </p>
     * @return startElasticsearchServiceSoftwareUpdateResult The response from
     *         the StartElasticsearchServiceSoftwareUpdate service method, as
     *         returned by Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    StartElasticsearchServiceSoftwareUpdateResult startElasticsearchServiceSoftwareUpdate(
            StartElasticsearchServiceSoftwareUpdateRequest startElasticsearchServiceSoftwareUpdateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the cluster configuration of the specified Elasticsearch domain,
     * setting as setting the instance type and the number of instances.
     * </p>
     * 
     * @param updateElasticsearchDomainConfigRequest <p>
     *            Container for the parameters to the
     *            <code><a>UpdateElasticsearchDomain</a></code> operation.
     *            Specifies the type and number of instances in the domain
     *            cluster.
     *            </p>
     * @return updateElasticsearchDomainConfigResult The response from the
     *         UpdateElasticsearchDomainConfig service method, as returned by
     *         Amazon Elasticsearch Service.
     * @throws BaseException
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UpdateElasticsearchDomainConfigResult updateElasticsearchDomainConfig(
            UpdateElasticsearchDomainConfigRequest updateElasticsearchDomainConfigRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Allows you to either upgrade your domain or perform an Upgrade
     * eligibility check to a compatible Elasticsearch version.
     * </p>
     * 
     * @param upgradeElasticsearchDomainRequest <p>
     *            Container for request parameters to
     *            <code> <a>UpgradeElasticsearchDomain</a> </code> operation.
     *            </p>
     * @return upgradeElasticsearchDomainResult The response from the
     *         UpgradeElasticsearchDomain service method, as returned by Amazon
     *         Elasticsearch Service.
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws DisabledOperationException
     * @throws ValidationException
     * @throws InternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elasticsearch Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UpgradeElasticsearchDomainResult upgradeElasticsearchDomain(
            UpgradeElasticsearchDomainRequest upgradeElasticsearchDomainRequest)
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
