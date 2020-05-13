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

package com.amazonaws.services.macie2;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.macie2.model.*;

/**
 * Interface for accessing Amazon Macie 2
 * <p>
 * Amazon Macie
 * </p>
 **/
public interface AmazonMacie2 {

    /**
     * Overrides the default endpoint for this client
     * ("https://macie2.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "macie2.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://macie2.us-east-1.amazonaws.com"). If the protocol is not
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
     * @param endpoint The endpoint (ex: "macie2.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://macie2.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonMacie2#setEndpoint(String)}, sets the
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
     * Accepts an Amazon Macie membership invitation that was received from a
     * specific account.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @return acceptInvitationResult The response from the AcceptInvitation
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AcceptInvitationResult acceptInvitation(AcceptInvitationRequest acceptInvitationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Archives one or more findings.
     * </p>
     * 
     * @param archiveFindingsRequest
     * @return archiveFindingsResult The response from the ArchiveFindings
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ArchiveFindingsResult archiveFindings(ArchiveFindingsRequest archiveFindingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about one or more custom data identifiers.
     * </p>
     * 
     * @param batchGetCustomDataIdentifiersRequest
     * @return batchGetCustomDataIdentifiersResult The response from the
     *         BatchGetCustomDataIdentifiers service method, as returned by
     *         Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchGetCustomDataIdentifiersResult batchGetCustomDataIdentifiers(
            BatchGetCustomDataIdentifiersRequest batchGetCustomDataIdentifiersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates and defines the settings for a classification job.
     * </p>
     * 
     * @param createClassificationJobRequest
     * @return createClassificationJobResult The response from the
     *         CreateClassificationJob service method, as returned by Amazon
     *         Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateClassificationJobResult createClassificationJob(
            CreateClassificationJobRequest createClassificationJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates and defines the criteria and other settings for a custom data
     * identifier.
     * </p>
     * 
     * @param createCustomDataIdentifierRequest
     * @return createCustomDataIdentifierResult The response from the
     *         CreateCustomDataIdentifier service method, as returned by Amazon
     *         Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateCustomDataIdentifierResult createCustomDataIdentifier(
            CreateCustomDataIdentifierRequest createCustomDataIdentifierRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates and defines the criteria and other settings for a findings
     * filter.
     * </p>
     * 
     * @param createFindingsFilterRequest
     * @return createFindingsFilterResult The response from the
     *         CreateFindingsFilter service method, as returned by Amazon Macie
     *         2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateFindingsFilterResult createFindingsFilter(
            CreateFindingsFilterRequest createFindingsFilterRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Sends an Amazon Macie membership invitation to one or more accounts.
     * </p>
     * 
     * @param createInvitationsRequest
     * @return createInvitationsResult The response from the CreateInvitations
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateInvitationsResult createInvitations(CreateInvitationsRequest createInvitationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates an account with an Amazon Macie master account.
     * </p>
     * 
     * @param createMemberRequest
     * @return createMemberResult The response from the CreateMember service
     *         method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateMemberResult createMember(CreateMemberRequest createMemberRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates sample findings.
     * </p>
     * 
     * @param createSampleFindingsRequest
     * @return createSampleFindingsResult The response from the
     *         CreateSampleFindings service method, as returned by Amazon Macie
     *         2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateSampleFindingsResult createSampleFindings(
            CreateSampleFindingsRequest createSampleFindingsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Declines Amazon Macie membership invitations that were received from
     * specific accounts.
     * </p>
     * 
     * @param declineInvitationsRequest
     * @return declineInvitationsResult The response from the DeclineInvitations
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeclineInvitationsResult declineInvitations(DeclineInvitationsRequest declineInvitationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a custom data identifier.
     * </p>
     * 
     * @param deleteCustomDataIdentifierRequest
     * @return deleteCustomDataIdentifierResult The response from the
     *         DeleteCustomDataIdentifier service method, as returned by Amazon
     *         Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteCustomDataIdentifierResult deleteCustomDataIdentifier(
            DeleteCustomDataIdentifierRequest deleteCustomDataIdentifierRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a findings filter.
     * </p>
     * 
     * @param deleteFindingsFilterRequest
     * @return deleteFindingsFilterResult The response from the
     *         DeleteFindingsFilter service method, as returned by Amazon Macie
     *         2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteFindingsFilterResult deleteFindingsFilter(
            DeleteFindingsFilterRequest deleteFindingsFilterRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes Amazon Macie membership invitations that were received from
     * specific accounts.
     * </p>
     * 
     * @param deleteInvitationsRequest
     * @return deleteInvitationsResult The response from the DeleteInvitations
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteInvitationsResult deleteInvitations(DeleteInvitationsRequest deleteInvitationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the association between an Amazon Macie master account and an
     * account.
     * </p>
     * 
     * @param deleteMemberRequest
     * @return deleteMemberResult The response from the DeleteMember service
     *         method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteMemberResult deleteMember(DeleteMemberRequest deleteMemberRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves (queries) statistical data and other information about one or
     * more S3 buckets that Amazon Macie monitors and analyzes.
     * </p>
     * 
     * @param describeBucketsRequest
     * @return describeBucketsResult The response from the DescribeBuckets
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeBucketsResult describeBuckets(DescribeBucketsRequest describeBucketsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the status and settings for a classification
     * job.
     * </p>
     * 
     * @param describeClassificationJobRequest
     * @return describeClassificationJobResult The response from the
     *         DescribeClassificationJob service method, as returned by Amazon
     *         Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeClassificationJobResult describeClassificationJob(
            DescribeClassificationJobRequest describeClassificationJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the Amazon Macie configuration settings for
     * an AWS organization.
     * </p>
     * 
     * @param describeOrganizationConfigurationRequest
     * @return describeOrganizationConfigurationResult The response from the
     *         DescribeOrganizationConfiguration service method, as returned by
     *         Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeOrganizationConfigurationResult describeOrganizationConfiguration(
            DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disables an Amazon Macie account and deletes Macie resources for the
     * account.
     * </p>
     * 
     * @param disableMacieRequest
     * @return disableMacieResult The response from the DisableMacie service
     *         method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisableMacieResult disableMacie(DisableMacieRequest disableMacieRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disables an account as a delegated administrator of Amazon Macie for an
     * AWS organization.
     * </p>
     * 
     * @param disableOrganizationAdminAccountRequest
     * @return disableOrganizationAdminAccountResult The response from the
     *         DisableOrganizationAdminAccount service method, as returned by
     *         Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisableOrganizationAdminAccountResult disableOrganizationAdminAccount(
            DisableOrganizationAdminAccountRequest disableOrganizationAdminAccountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates a member account from its Amazon Macie master account.
     * </p>
     * 
     * @param disassociateFromMasterAccountRequest
     * @return disassociateFromMasterAccountResult The response from the
     *         DisassociateFromMasterAccount service method, as returned by
     *         Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociateFromMasterAccountResult disassociateFromMasterAccount(
            DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates an Amazon Macie master account from a member account.
     * </p>
     * 
     * @param disassociateMemberRequest
     * @return disassociateMemberResult The response from the DisassociateMember
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociateMemberResult disassociateMember(DisassociateMemberRequest disassociateMemberRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables Amazon Macie and specifies the configuration settings for a Macie
     * account.
     * </p>
     * 
     * @param enableMacieRequest
     * @return enableMacieResult The response from the EnableMacie service
     *         method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    EnableMacieResult enableMacie(EnableMacieRequest enableMacieRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables an account as a delegated administrator of Amazon Macie for an
     * AWS organization.
     * </p>
     * 
     * @param enableOrganizationAdminAccountRequest
     * @return enableOrganizationAdminAccountResult The response from the
     *         EnableOrganizationAdminAccount service method, as returned by
     *         Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    EnableOrganizationAdminAccountResult enableOrganizationAdminAccount(
            EnableOrganizationAdminAccountRequest enableOrganizationAdminAccountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves (queries) aggregated statistical data for all the S3 buckets
     * that Amazon Macie monitors and analyzes.
     * </p>
     * 
     * @param getBucketStatisticsRequest
     * @return getBucketStatisticsResult The response from the
     *         GetBucketStatistics service method, as returned by Amazon Macie
     *         2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetBucketStatisticsResult getBucketStatistics(
            GetBucketStatisticsRequest getBucketStatisticsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves the configuration settings for exporting data classification
     * results.
     * </p>
     * 
     * @param getClassificationExportConfigurationRequest
     * @return getClassificationExportConfigurationResult The response from the
     *         GetClassificationExportConfiguration service method, as returned
     *         by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetClassificationExportConfigurationResult getClassificationExportConfiguration(
            GetClassificationExportConfigurationRequest getClassificationExportConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the criteria and other settings for a custom
     * data identifier.
     * </p>
     * 
     * @param getCustomDataIdentifierRequest
     * @return getCustomDataIdentifierResult The response from the
     *         GetCustomDataIdentifier service method, as returned by Amazon
     *         Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetCustomDataIdentifierResult getCustomDataIdentifier(
            GetCustomDataIdentifierRequest getCustomDataIdentifierRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves (queries) aggregated statistical data about findings.
     * </p>
     * 
     * @param getFindingStatisticsRequest
     * @return getFindingStatisticsResult The response from the
     *         GetFindingStatistics service method, as returned by Amazon Macie
     *         2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetFindingStatisticsResult getFindingStatistics(
            GetFindingStatisticsRequest getFindingStatisticsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves information about one or more findings.
     * </p>
     * 
     * @param getFindingsRequest
     * @return getFindingsResult The response from the GetFindings service
     *         method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetFindingsResult getFindings(GetFindingsRequest getFindingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the criteria and other settings for a
     * findings filter.
     * </p>
     * 
     * @param getFindingsFilterRequest
     * @return getFindingsFilterResult The response from the GetFindingsFilter
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetFindingsFilterResult getFindingsFilter(GetFindingsFilterRequest getFindingsFilterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the count of Amazon Macie membership invitations that were
     * received by an account.
     * </p>
     * 
     * @param getInvitationsCountRequest
     * @return getInvitationsCountResult The response from the
     *         GetInvitationsCount service method, as returned by Amazon Macie
     *         2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetInvitationsCountResult getInvitationsCount(
            GetInvitationsCountRequest getInvitationsCountRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the current status and configuration settings
     * for an Amazon Macie account.
     * </p>
     * 
     * @param getMacieSessionRequest
     * @return getMacieSessionResult The response from the GetMacieSession
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetMacieSessionResult getMacieSession(GetMacieSessionRequest getMacieSessionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the Amazon Macie master account for an
     * account.
     * </p>
     * 
     * @param getMasterAccountRequest
     * @return getMasterAccountResult The response from the GetMasterAccount
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetMasterAccountResult getMasterAccount(GetMasterAccountRequest getMasterAccountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about a member account that's associated with an
     * Amazon Macie master account.
     * </p>
     * 
     * @param getMemberRequest
     * @return getMemberResult The response from the GetMember service method,
     *         as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetMemberResult getMember(GetMemberRequest getMemberRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves (queries) quotas and aggregated usage data for one or more
     * accounts.
     * </p>
     * 
     * @param getUsageStatisticsRequest
     * @return getUsageStatisticsResult The response from the GetUsageStatistics
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetUsageStatisticsResult getUsageStatistics(GetUsageStatisticsRequest getUsageStatisticsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves (queries) aggregated usage data for an account.
     * </p>
     * 
     * @param getUsageTotalsRequest
     * @return getUsageTotalsResult The response from the GetUsageTotals service
     *         method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetUsageTotalsResult getUsageTotals(GetUsageTotalsRequest getUsageTotalsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the status and settings for one or more
     * classification jobs.
     * </p>
     * 
     * @param listClassificationJobsRequest
     * @return listClassificationJobsResult The response from the
     *         ListClassificationJobs service method, as returned by Amazon
     *         Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListClassificationJobsResult listClassificationJobs(
            ListClassificationJobsRequest listClassificationJobsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a subset of information about all the custom data identifiers
     * for an account.
     * </p>
     * 
     * @param listCustomDataIdentifiersRequest
     * @return listCustomDataIdentifiersResult The response from the
     *         ListCustomDataIdentifiers service method, as returned by Amazon
     *         Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListCustomDataIdentifiersResult listCustomDataIdentifiers(
            ListCustomDataIdentifiersRequest listCustomDataIdentifiersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a subset of information about one or more findings.
     * </p>
     * 
     * @param listFindingsRequest
     * @return listFindingsResult The response from the ListFindings service
     *         method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListFindingsResult listFindings(ListFindingsRequest listFindingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a subset of information about all the findings filters for an
     * account.
     * </p>
     * 
     * @param listFindingsFiltersRequest
     * @return listFindingsFiltersResult The response from the
     *         ListFindingsFilters service method, as returned by Amazon Macie
     *         2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListFindingsFiltersResult listFindingsFilters(
            ListFindingsFiltersRequest listFindingsFiltersRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves information about all the Amazon Macie membership invitations
     * that were received by an account.
     * </p>
     * 
     * @param listInvitationsRequest
     * @return listInvitationsResult The response from the ListInvitations
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListInvitationsResult listInvitations(ListInvitationsRequest listInvitationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the accounts that are associated with an
     * Amazon Macie master account.
     * </p>
     * 
     * @param listMembersRequest
     * @return listMembersResult The response from the ListMembers service
     *         method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListMembersResult listMembers(ListMembersRequest listMembersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the account that's designated as the
     * delegated administrator of Amazon Macie for an AWS organization.
     * </p>
     * 
     * @param listOrganizationAdminAccountsRequest
     * @return listOrganizationAdminAccountsResult The response from the
     *         ListOrganizationAdminAccounts service method, as returned by
     *         Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListOrganizationAdminAccountsResult listOrganizationAdminAccounts(
            ListOrganizationAdminAccountsRequest listOrganizationAdminAccountsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the tags (keys and values) that are associated with a
     * classification job, custom data identifier, findings filter, or member
     * account.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon Macie
     *         2.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates or updates the configuration settings for exporting data
     * classification results.
     * </p>
     * 
     * @param putClassificationExportConfigurationRequest
     * @return putClassificationExportConfigurationResult The response from the
     *         PutClassificationExportConfiguration service method, as returned
     *         by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutClassificationExportConfigurationResult putClassificationExportConfiguration(
            PutClassificationExportConfigurationRequest putClassificationExportConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds or updates one or more tags (keys and values) that are associated
     * with a classification job, custom data identifier, findings filter, or
     * member account.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon Macie 2.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Tests a custom data identifier.
     * </p>
     * 
     * @param testCustomDataIdentifierRequest
     * @return testCustomDataIdentifierResult The response from the
     *         TestCustomDataIdentifier service method, as returned by Amazon
     *         Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    TestCustomDataIdentifierResult testCustomDataIdentifier(
            TestCustomDataIdentifierRequest testCustomDataIdentifierRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Reactivates (unarchives) one or more findings.
     * </p>
     * 
     * @param unarchiveFindingsRequest
     * @return unarchiveFindingsResult The response from the UnarchiveFindings
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UnarchiveFindingsResult unarchiveFindings(UnarchiveFindingsRequest unarchiveFindingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes one or more tags (keys and values) from a classification job,
     * custom data identifier, findings filter, or member account.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon Macie 2.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Cancels a classification job.
     * </p>
     * 
     * @param updateClassificationJobRequest
     * @return updateClassificationJobResult The response from the
     *         UpdateClassificationJob service method, as returned by Amazon
     *         Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateClassificationJobResult updateClassificationJob(
            UpdateClassificationJobRequest updateClassificationJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the criteria and other settings for a findings filter.
     * </p>
     * 
     * @param updateFindingsFilterRequest
     * @return updateFindingsFilterResult The response from the
     *         UpdateFindingsFilter service method, as returned by Amazon Macie
     *         2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateFindingsFilterResult updateFindingsFilter(
            UpdateFindingsFilterRequest updateFindingsFilterRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Suspends or re-enables an Amazon Macie account, or updates the
     * configuration settings for a Macie account.
     * </p>
     * 
     * @param updateMacieSessionRequest
     * @return updateMacieSessionResult The response from the UpdateMacieSession
     *         service method, as returned by Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateMacieSessionResult updateMacieSession(UpdateMacieSessionRequest updateMacieSessionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables an Amazon Macie master account to suspend or re-enable a member
     * account.
     * </p>
     * 
     * @param updateMemberSessionRequest
     * @return updateMemberSessionResult The response from the
     *         UpdateMemberSession service method, as returned by Amazon Macie
     *         2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateMemberSessionResult updateMemberSession(
            UpdateMemberSessionRequest updateMemberSessionRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates Amazon Macie configuration settings for an AWS organization.
     * </p>
     * 
     * @param updateOrganizationConfigurationRequest
     * @return updateOrganizationConfigurationResult The response from the
     *         UpdateOrganizationConfiguration service method, as returned by
     *         Amazon Macie 2.
     * @throws ValidationException <p>
     *             The request failed because it contains a syntax error.
     *             </p>
     * @throws InternalServerException <p>
     *             The request failed due to an unknown internal server error,
     *             exception, or failure.
     *             </p>
     * @throws ServiceQuotaExceededException <p>
     *             The request failed because fulfilling the request would
     *             exceed one or more service quotas for your account.
     *             </p>
     * @throws AccessDeniedException <p>
     *             The request was denied because you don't have sufficient
     *             access to the specified resource.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             The request failed because the specified resource wasn't
     *             found.
     *             </p>
     * @throws ThrottlingException <p>
     *             The request failed because you sent too many requests during
     *             a certain amount of time.
     *             </p>
     * @throws ConflictException <p>
     *             The request failed because it conflicts with the current
     *             state of the specified resource.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie 2 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateOrganizationConfigurationResult updateOrganizationConfiguration(
            UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest)
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
