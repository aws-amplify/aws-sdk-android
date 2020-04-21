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

package com.amazonaws.services.amazonroute53domains;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.amazonroute53domains.model.*;

/**
 * Interface for accessing Amazon Route 53 Domains
 * <p>
 * Amazon Route 53 API actions let you register domain names and perform related
 * operations.
 * </p>
 **/
public interface AmazonRoute53Domains {

    /**
     * Overrides the default endpoint for this client
     * ("https://route53domains.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "route53domains.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://route53domains.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex:
     *            "route53domains.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex:
     *            "https://route53domains.us-east-1.amazonaws.com") of the
     *            region specific AWS endpoint this client will communicate
     *            with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonRoute53Domains#setEndpoint(String)}, sets
     * the regional endpoint for this client's service calls. Callers can use
     * this method to control which AWS region they want to work with.
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
     * Accepts the transfer of a domain from another AWS account to the current
     * AWS account. You initiate a transfer between AWS accounts using <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_TransferDomainToAnotherAwsAccount.html"
     * >TransferDomainToAnotherAwsAccount</a>.
     * </p>
     * <p>
     * Use either <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ListOperations.html"
     * >ListOperations</a> or <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a> to determine whether the operation succeeded. <a
     * href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a> provides additional information, for example,
     * <code>Domain Transfer from Aws Account 111122223333 has been cancelled</code>
     * .
     * </p>
     * 
     * @param acceptDomainTransferFromAnotherAwsAccountRequest <p>
     *            The AcceptDomainTransferFromAnotherAwsAccount request includes
     *            the following elements.
     *            </p>
     * @return acceptDomainTransferFromAnotherAwsAccountResult The response from
     *         the AcceptDomainTransferFromAnotherAwsAccount service method, as
     *         returned by Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws OperationLimitExceededException
     * @throws DomainLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    AcceptDomainTransferFromAnotherAwsAccountResult acceptDomainTransferFromAnotherAwsAccount(
            AcceptDomainTransferFromAnotherAwsAccountRequest acceptDomainTransferFromAnotherAwsAccountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Cancels the transfer of a domain from the current AWS account to another
     * AWS account. You initiate a transfer between AWS accounts using <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_TransferDomainToAnotherAwsAccount.html"
     * >TransferDomainToAnotherAwsAccount</a>.
     * </p>
     * <important>
     * <p>
     * You must cancel the transfer before the other AWS account accepts the
     * transfer using <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AcceptDomainTransferFromAnotherAwsAccount.html"
     * >AcceptDomainTransferFromAnotherAwsAccount</a>.
     * </p>
     * </important>
     * <p>
     * Use either <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ListOperations.html"
     * >ListOperations</a> or <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a> to determine whether the operation succeeded. <a
     * href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a> provides additional information, for example,
     * <code>Domain Transfer from Aws Account 111122223333 has been cancelled</code>
     * .
     * </p>
     * 
     * @param cancelDomainTransferToAnotherAwsAccountRequest <p>
     *            The CancelDomainTransferToAnotherAwsAccount request includes
     *            the following element.
     *            </p>
     * @return cancelDomainTransferToAnotherAwsAccountResult The response from
     *         the CancelDomainTransferToAnotherAwsAccount service method, as
     *         returned by Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws OperationLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CancelDomainTransferToAnotherAwsAccountResult cancelDomainTransferToAnotherAwsAccount(
            CancelDomainTransferToAnotherAwsAccountRequest cancelDomainTransferToAnotherAwsAccountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This operation checks the availability of one domain name. Note that if
     * the availability status of a domain is pending, you must submit another
     * request to determine the availability of the domain name.
     * </p>
     * 
     * @param checkDomainAvailabilityRequest <p>
     *            The CheckDomainAvailability request contains the following
     *            elements.
     *            </p>
     * @return checkDomainAvailabilityResult The response from the
     *         CheckDomainAvailability service method, as returned by Amazon
     *         Route 53 Domains.
     * @throws InvalidInputException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CheckDomainAvailabilityResult checkDomainAvailability(
            CheckDomainAvailabilityRequest checkDomainAvailabilityRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Checks whether a domain name can be transferred to Amazon Route 53.
     * </p>
     * 
     * @param checkDomainTransferabilityRequest <p>
     *            The CheckDomainTransferability request contains the following
     *            elements.
     *            </p>
     * @return checkDomainTransferabilityResult The response from the
     *         CheckDomainTransferability service method, as returned by Amazon
     *         Route 53 Domains.
     * @throws InvalidInputException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CheckDomainTransferabilityResult checkDomainTransferability(
            CheckDomainTransferabilityRequest checkDomainTransferabilityRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This operation deletes the specified tags for a domain.
     * </p>
     * <p>
     * All tag operations are eventually consistent; subsequent operations might
     * not immediately represent all issued operations.
     * </p>
     * 
     * @param deleteTagsForDomainRequest <p>
     *            The DeleteTagsForDomainRequest includes the following
     *            elements.
     *            </p>
     * @return deleteTagsForDomainResult The response from the
     *         DeleteTagsForDomain service method, as returned by Amazon Route
     *         53 Domains.
     * @throws InvalidInputException
     * @throws OperationLimitExceededException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteTagsForDomainResult deleteTagsForDomain(
            DeleteTagsForDomainRequest deleteTagsForDomainRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * This operation disables automatic renewal of domain registration for the
     * specified domain.
     * </p>
     * 
     * @param disableDomainAutoRenewRequest
     * @return disableDomainAutoRenewResult The response from the
     *         DisableDomainAutoRenew service method, as returned by Amazon
     *         Route 53 Domains.
     * @throws InvalidInputException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DisableDomainAutoRenewResult disableDomainAutoRenew(
            DisableDomainAutoRenewRequest disableDomainAutoRenewRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This operation removes the transfer lock on the domain (specifically the
     * <code>clientTransferProhibited</code> status) to allow domain transfers.
     * We recommend you refrain from performing this action unless you intend to
     * transfer the domain to a different registrar. Successful submission
     * returns an operation ID that you can use to track the progress and
     * completion of the action. If the request is not completed successfully,
     * the domain registrant will be notified by email.
     * </p>
     * 
     * @param disableDomainTransferLockRequest <p>
     *            The DisableDomainTransferLock request includes the following
     *            element.
     *            </p>
     * @return disableDomainTransferLockResult The response from the
     *         DisableDomainTransferLock service method, as returned by Amazon
     *         Route 53 Domains.
     * @throws InvalidInputException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws OperationLimitExceededException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DisableDomainTransferLockResult disableDomainTransferLock(
            DisableDomainTransferLockRequest disableDomainTransferLockRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This operation configures Amazon Route 53 to automatically renew the
     * specified domain before the domain registration expires. The cost of
     * renewing your domain registration is billed to your AWS account.
     * </p>
     * <p>
     * The period during which you can renew a domain name varies by TLD. For a
     * list of TLDs and their renewal policies, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html"
     * >Domains That You Can Register with Amazon Route 53</a> in the <i>Amazon
     * Route 53 Developer Guide</i>. Route 53 requires that you renew before the
     * end of the renewal period so we can complete processing before the
     * deadline.
     * </p>
     * 
     * @param enableDomainAutoRenewRequest
     * @return enableDomainAutoRenewResult The response from the
     *         EnableDomainAutoRenew service method, as returned by Amazon Route
     *         53 Domains.
     * @throws InvalidInputException
     * @throws UnsupportedTLDException
     * @throws TLDRulesViolationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    EnableDomainAutoRenewResult enableDomainAutoRenew(
            EnableDomainAutoRenewRequest enableDomainAutoRenewRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This operation sets the transfer lock on the domain (specifically the
     * <code>clientTransferProhibited</code> status) to prevent domain
     * transfers. Successful submission returns an operation ID that you can use
     * to track the progress and completion of the action. If the request is not
     * completed successfully, the domain registrant will be notified by email.
     * </p>
     * 
     * @param enableDomainTransferLockRequest <p>
     *            A request to set the transfer lock for the specified domain.
     *            </p>
     * @return enableDomainTransferLockResult The response from the
     *         EnableDomainTransferLock service method, as returned by Amazon
     *         Route 53 Domains.
     * @throws InvalidInputException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws OperationLimitExceededException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    EnableDomainTransferLockResult enableDomainTransferLock(
            EnableDomainTransferLockRequest enableDomainTransferLockRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * For operations that require confirmation that the email address for the
     * registrant contact is valid, such as registering a new domain, this
     * operation returns information about whether the registrant contact has
     * responded.
     * </p>
     * <p>
     * If you want us to resend the email, use the
     * <code>ResendContactReachabilityEmail</code> operation.
     * </p>
     * 
     * @param getContactReachabilityStatusRequest
     * @return getContactReachabilityStatusResult The response from the
     *         GetContactReachabilityStatus service method, as returned by
     *         Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws OperationLimitExceededException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetContactReachabilityStatusResult getContactReachabilityStatus(
            GetContactReachabilityStatusRequest getContactReachabilityStatusRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This operation returns detailed information about a specified domain that
     * is associated with the current AWS account. Contact information for the
     * domain is also returned as part of the output.
     * </p>
     * 
     * @param getDomainDetailRequest <p>
     *            The GetDomainDetail request includes the following element.
     *            </p>
     * @return getDomainDetailResult The response from the GetDomainDetail
     *         service method, as returned by Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetDomainDetailResult getDomainDetail(GetDomainDetailRequest getDomainDetailRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * The GetDomainSuggestions operation returns a list of suggested domain
     * names.
     * </p>
     * 
     * @param getDomainSuggestionsRequest
     * @return getDomainSuggestionsResult The response from the
     *         GetDomainSuggestions service method, as returned by Amazon Route
     *         53 Domains.
     * @throws InvalidInputException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetDomainSuggestionsResult getDomainSuggestions(
            GetDomainSuggestionsRequest getDomainSuggestionsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * This operation returns the current status of an operation that is not
     * completed.
     * </p>
     * 
     * @param getOperationDetailRequest <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     *            >GetOperationDetail</a> request includes the following
     *            element.
     *            </p>
     * @return getOperationDetailResult The response from the GetOperationDetail
     *         service method, as returned by Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetOperationDetailResult getOperationDetail(GetOperationDetailRequest getOperationDetailRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This operation returns all the domain names registered with Amazon Route
     * 53 for the current AWS account.
     * </p>
     * 
     * @param listDomainsRequest <p>
     *            The ListDomains request includes the following elements.
     *            </p>
     * @return listDomainsResult The response from the ListDomains service
     *         method, as returned by Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListDomainsResult listDomains(ListDomainsRequest listDomainsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about all of the operations that return an operation
     * ID and that have ever been performed on domains that were registered by
     * the current account.
     * </p>
     * 
     * @param listOperationsRequest <p>
     *            The ListOperations request includes the following elements.
     *            </p>
     * @return listOperationsResult The response from the ListOperations service
     *         method, as returned by Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListOperationsResult listOperations(ListOperationsRequest listOperationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This operation returns all of the tags that are associated with the
     * specified domain.
     * </p>
     * <p>
     * All tag operations are eventually consistent; subsequent operations might
     * not immediately represent all issued operations.
     * </p>
     * 
     * @param listTagsForDomainRequest <p>
     *            The ListTagsForDomainRequest includes the following elements.
     *            </p>
     * @return listTagsForDomainResult The response from the ListTagsForDomain
     *         service method, as returned by Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws OperationLimitExceededException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListTagsForDomainResult listTagsForDomain(ListTagsForDomainRequest listTagsForDomainRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This operation registers a domain. Domains are registered either by
     * Amazon Registrar (for .com, .net, and .org domains) or by our registrar
     * associate, Gandi (for all other domains). For some top-level domains
     * (TLDs), this operation requires extra parameters.
     * </p>
     * <p>
     * When you register a domain, Amazon Route 53 does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a Route 53 hosted zone that has the same name as the domain.
     * Route 53 assigns four name servers to your hosted zone and automatically
     * updates your domain registration with the names of these name servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Enables autorenew, so your domain registration will renew automatically
     * each year. We'll notify you in advance of the renewal date so you can
     * choose whether to renew the registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optionally enables privacy protection, so WHOIS queries return contact
     * information either for Amazon Registrar (for .com, .net, and .org
     * domains) or for our registrar associate, Gandi (for all other TLDs). If
     * you don't enable privacy protection, WHOIS queries return the information
     * that you entered for the registrant, admin, and tech contacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * If registration is successful, returns an operation ID that you can use
     * to track the progress and completion of the action. If the request is not
     * completed successfully, the domain registrant is notified by email.
     * </p>
     * </li>
     * <li>
     * <p>
     * Charges your AWS account an amount based on the top-level domain. For
     * more information, see <a
     * href="http://aws.amazon.com/route53/pricing/">Amazon Route 53
     * Pricing</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param registerDomainRequest <p>
     *            The RegisterDomain request includes the following elements.
     *            </p>
     * @return registerDomainResult The response from the RegisterDomain service
     *         method, as returned by Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws UnsupportedTLDException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws DomainLimitExceededException
     * @throws OperationLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    RegisterDomainResult registerDomain(RegisterDomainRequest registerDomainRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Rejects the transfer of a domain from another AWS account to the current
     * AWS account. You initiate a transfer between AWS accounts using <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_TransferDomainToAnotherAwsAccount.html"
     * >TransferDomainToAnotherAwsAccount</a>.
     * </p>
     * <p>
     * Use either <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ListOperations.html"
     * >ListOperations</a> or <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a> to determine whether the operation succeeded. <a
     * href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a> provides additional information, for example,
     * <code>Domain Transfer from Aws Account 111122223333 has been cancelled</code>
     * .
     * </p>
     * 
     * @param rejectDomainTransferFromAnotherAwsAccountRequest <p>
     *            The RejectDomainTransferFromAnotherAwsAccount request includes
     *            the following element.
     *            </p>
     * @return rejectDomainTransferFromAnotherAwsAccountResult The response from
     *         the RejectDomainTransferFromAnotherAwsAccount service method, as
     *         returned by Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws OperationLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    RejectDomainTransferFromAnotherAwsAccountResult rejectDomainTransferFromAnotherAwsAccount(
            RejectDomainTransferFromAnotherAwsAccountRequest rejectDomainTransferFromAnotherAwsAccountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This operation renews a domain for the specified number of years. The
     * cost of renewing your domain is billed to your AWS account.
     * </p>
     * <p>
     * We recommend that you renew your domain several weeks before the
     * expiration date. Some TLD registries delete domains before the expiration
     * date if you haven't renewed far enough in advance. For more information
     * about renewing domain registration, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/domain-renew.html"
     * >Renewing Registration for a Domain</a> in the <i>Amazon Route 53
     * Developer Guide</i>.
     * </p>
     * 
     * @param renewDomainRequest <p>
     *            A <code>RenewDomain</code> request includes the number of
     *            years that you want to renew for and the current expiration
     *            year.
     *            </p>
     * @return renewDomainResult The response from the RenewDomain service
     *         method, as returned by Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws UnsupportedTLDException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws OperationLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    RenewDomainResult renewDomain(RenewDomainRequest renewDomainRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * For operations that require confirmation that the email address for the
     * registrant contact is valid, such as registering a new domain, this
     * operation resends the confirmation email to the current email address for
     * the registrant contact.
     * </p>
     * 
     * @param resendContactReachabilityEmailRequest
     * @return resendContactReachabilityEmailResult The response from the
     *         ResendContactReachabilityEmail service method, as returned by
     *         Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws OperationLimitExceededException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ResendContactReachabilityEmailResult resendContactReachabilityEmail(
            ResendContactReachabilityEmailRequest resendContactReachabilityEmailRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This operation returns the AuthCode for the domain. To transfer a domain
     * to another registrar, you provide this value to the new registrar.
     * </p>
     * 
     * @param retrieveDomainAuthCodeRequest <p>
     *            A request for the authorization code for the specified domain.
     *            To transfer a domain to another registrar, you provide this
     *            value to the new registrar.
     *            </p>
     * @return retrieveDomainAuthCodeResult The response from the
     *         RetrieveDomainAuthCode service method, as returned by Amazon
     *         Route 53 Domains.
     * @throws InvalidInputException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    RetrieveDomainAuthCodeResult retrieveDomainAuthCode(
            RetrieveDomainAuthCodeRequest retrieveDomainAuthCodeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Transfers a domain from another registrar to Amazon Route 53. When the
     * transfer is complete, the domain is registered either with Amazon
     * Registrar (for .com, .net, and .org domains) or with our registrar
     * associate, Gandi (for all other TLDs).
     * </p>
     * <p>
     * For more information about transferring domains, see the following
     * topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For transfer requirements, a detailed procedure, and information about
     * viewing the status of a domain that you're transferring to Route 53, see
     * <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/domain-transfer-to-route-53.html"
     * >Transferring Registration for a Domain to Amazon Route 53</a> in the
     * <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For information about how to transfer a domain from one AWS account to
     * another, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_TransferDomainToAnotherAwsAccount.html"
     * >TransferDomainToAnotherAwsAccount</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For information about how to transfer a domain to another domain
     * registrar, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/domain-transfer-from-route-53.html"
     * >Transferring a Domain from Amazon Route 53 to Another Registrar</a> in
     * the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the registrar for your domain is also the DNS service provider for the
     * domain, we highly recommend that you transfer your DNS service to Route
     * 53 or to another DNS service provider before you transfer your
     * registration. Some registrars provide free DNS service when you purchase
     * a domain registration. When you transfer the registration, the previous
     * registrar will not renew your domain registration and could end your DNS
     * service at any time.
     * </p>
     * <important>
     * <p>
     * If the registrar for your domain is also the DNS service provider for the
     * domain and you don't transfer DNS service to another provider, your
     * website, email, and the web applications associated with the domain might
     * become unavailable.
     * </p>
     * </important>
     * <p>
     * If the transfer is successful, this method returns an operation ID that
     * you can use to track the progress and completion of the action. If the
     * transfer doesn't complete successfully, the domain registrant will be
     * notified by email.
     * </p>
     * 
     * @param transferDomainRequest <p>
     *            The TransferDomain request includes the following elements.
     *            </p>
     * @return transferDomainResult The response from the TransferDomain service
     *         method, as returned by Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws UnsupportedTLDException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws DomainLimitExceededException
     * @throws OperationLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    TransferDomainResult transferDomain(TransferDomainRequest transferDomainRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Transfers a domain from the current AWS account to another AWS account.
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The AWS account that you're transferring the domain to must accept the
     * transfer. If the other account doesn't accept the transfer within 3 days,
     * we cancel the transfer. See <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AcceptDomainTransferFromAnotherAwsAccount.html"
     * >AcceptDomainTransferFromAnotherAwsAccount</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can cancel the transfer before the other account accepts it. See <a
     * href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_CancelDomainTransferToAnotherAwsAccount.html"
     * >CancelDomainTransferToAnotherAwsAccount</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The other account can reject the transfer. See <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_RejectDomainTransferFromAnotherAwsAccount.html"
     * >RejectDomainTransferFromAnotherAwsAccount</a>.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * When you transfer a domain from one AWS account to another, Route 53
     * doesn't transfer the hosted zone that is associated with the domain. DNS
     * resolution isn't affected if the domain and the hosted zone are owned by
     * separate accounts, so transferring the hosted zone is optional. For
     * information about transferring the hosted zone to another AWS account,
     * see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/hosted-zones-migrating.html"
     * >Migrating a Hosted Zone to a Different AWS Account</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use either <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ListOperations.html"
     * >ListOperations</a> or <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a> to determine whether the operation succeeded. <a
     * href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a> provides additional information, for example,
     * <code>Domain Transfer from Aws Account 111122223333 has been cancelled</code>
     * .
     * </p>
     * 
     * @param transferDomainToAnotherAwsAccountRequest <p>
     *            The TransferDomainToAnotherAwsAccount request includes the
     *            following elements.
     *            </p>
     * @return transferDomainToAnotherAwsAccountResult The response from the
     *         TransferDomainToAnotherAwsAccount service method, as returned by
     *         Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws OperationLimitExceededException
     * @throws DuplicateRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    TransferDomainToAnotherAwsAccountResult transferDomainToAnotherAwsAccount(
            TransferDomainToAnotherAwsAccountRequest transferDomainToAnotherAwsAccountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This operation updates the contact information for a particular domain.
     * You must specify information for at least one contact: registrant,
     * administrator, or technical.
     * </p>
     * <p>
     * If the update is successful, this method returns an operation ID that you
     * can use to track the progress and completion of the action. If the
     * request is not completed successfully, the domain registrant will be
     * notified by email.
     * </p>
     * 
     * @param updateDomainContactRequest <p>
     *            The UpdateDomainContact request includes the following
     *            elements.
     *            </p>
     * @return updateDomainContactResult The response from the
     *         UpdateDomainContact service method, as returned by Amazon Route
     *         53 Domains.
     * @throws InvalidInputException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws OperationLimitExceededException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateDomainContactResult updateDomainContact(
            UpdateDomainContactRequest updateDomainContactRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * This operation updates the specified domain contact's privacy setting.
     * When privacy protection is enabled, contact information such as email
     * address is replaced either with contact information for Amazon Registrar
     * (for .com, .net, and .org domains) or with contact information for our
     * registrar associate, Gandi.
     * </p>
     * <p>
     * This operation affects only the contact information for the specified
     * contact type (registrant, administrator, or tech). If the request
     * succeeds, Amazon Route 53 returns an operation ID that you can use with
     * <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a> to track the progress and completion of the
     * action. If the request doesn't complete successfully, the domain
     * registrant will be notified by email.
     * </p>
     * <important>
     * <p>
     * By disabling the privacy service via API, you consent to the publication
     * of the contact information provided for this domain via the public WHOIS
     * database. You certify that you are the registrant of this domain name and
     * have the authority to make this decision. You may withdraw your consent
     * at any time by enabling privacy protection using either
     * <code>UpdateDomainContactPrivacy</code> or the Route 53 console. Enabling
     * privacy protection removes the contact information provided for this
     * domain from the WHOIS database. For more information on our privacy
     * practices, see <a
     * href="https://aws.amazon.com/privacy/">https://aws.amazon
     * .com/privacy/</a>.
     * </p>
     * </important>
     * 
     * @param updateDomainContactPrivacyRequest <p>
     *            The UpdateDomainContactPrivacy request includes the following
     *            elements.
     *            </p>
     * @return updateDomainContactPrivacyResult The response from the
     *         UpdateDomainContactPrivacy service method, as returned by Amazon
     *         Route 53 Domains.
     * @throws InvalidInputException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws OperationLimitExceededException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateDomainContactPrivacyResult updateDomainContactPrivacy(
            UpdateDomainContactPrivacyRequest updateDomainContactPrivacyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This operation replaces the current set of name servers for the domain
     * with the specified set of name servers. If you use Amazon Route 53 as
     * your DNS service, specify the four name servers in the delegation set for
     * the hosted zone for the domain.
     * </p>
     * <p>
     * If successful, this operation returns an operation ID that you can use to
     * track the progress and completion of the action. If the request is not
     * completed successfully, the domain registrant will be notified by email.
     * </p>
     * 
     * @param updateDomainNameserversRequest <p>
     *            Replaces the current set of name servers for the domain with
     *            the specified set of name servers. If you use Amazon Route 53
     *            as your DNS service, specify the four name servers in the
     *            delegation set for the hosted zone for the domain.
     *            </p>
     *            <p>
     *            If successful, this operation returns an operation ID that you
     *            can use to track the progress and completion of the action. If
     *            the request is not completed successfully, the domain
     *            registrant will be notified by email.
     *            </p>
     * @return updateDomainNameserversResult The response from the
     *         UpdateDomainNameservers service method, as returned by Amazon
     *         Route 53 Domains.
     * @throws InvalidInputException
     * @throws DuplicateRequestException
     * @throws TLDRulesViolationException
     * @throws OperationLimitExceededException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateDomainNameserversResult updateDomainNameservers(
            UpdateDomainNameserversRequest updateDomainNameserversRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This operation adds or updates tags for a specified domain.
     * </p>
     * <p>
     * All tag operations are eventually consistent; subsequent operations might
     * not immediately represent all issued operations.
     * </p>
     * 
     * @param updateTagsForDomainRequest <p>
     *            The UpdateTagsForDomainRequest includes the following
     *            elements.
     *            </p>
     * @return updateTagsForDomainResult The response from the
     *         UpdateTagsForDomain service method, as returned by Amazon Route
     *         53 Domains.
     * @throws InvalidInputException
     * @throws OperationLimitExceededException
     * @throws UnsupportedTLDException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateTagsForDomainResult updateTagsForDomain(
            UpdateTagsForDomainRequest updateTagsForDomainRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns all the domain-related billing records for the current AWS
     * account for a specified period
     * </p>
     * 
     * @param viewBillingRequest <p>
     *            The ViewBilling request includes the following elements.
     *            </p>
     * @return viewBillingResult The response from the ViewBilling service
     *         method, as returned by Amazon Route 53 Domains.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 Domains indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ViewBillingResult viewBilling(ViewBillingRequest viewBillingRequest)
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
