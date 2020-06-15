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

package com.amazonaws.services.a4b;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.a4b.model.*;

/**
 * Interface for accessing Alexa For Business
 * <p>
 * Alexa for Business helps you use Alexa in your organization. Alexa for
 * Business provides you with the tools to manage Alexa devices, enroll your
 * users, and assign skills, at scale. You can build your own context-aware
 * voice skills using the Alexa Skills Kit and the Alexa for Business API
 * operations. You can also make these available as private skills for your
 * organization. Alexa for Business makes it efficient to voice-enable your
 * products and services, thus providing context-aware voice experiences for
 * your customers. Device makers building with the Alexa Voice Service (AVS) can
 * create fully integrated solutions, register their products with Alexa for
 * Business, and manage them as shared devices in their organization.
 * </p>
 **/
public interface AlexaForBusiness {

    /**
     * Overrides the default endpoint for this client
     * ("https://a4b.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "a4b.us-east-1.amazonaws.com")
     * or a full URL, including the protocol (ex:
     * "https://a4b.us-east-1.amazonaws.com"). If the protocol is not specified
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
     * @param endpoint The endpoint (ex: "a4b.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://a4b.us-east-1.amazonaws.com") of the region specific
     *            AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AlexaForBusiness#setEndpoint(String)}, sets the
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
     * Associates a skill with the organization under the customer's AWS
     * account. If a skill is private, the user implicitly accepts access to
     * this skill during enablement.
     * </p>
     * 
     * @param approveSkillRequest
     * @return approveSkillResult The response from the ApproveSkill service
     *         method, as returned by Alexa For Business.
     * @throws LimitExceededException
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ApproveSkillResult approveSkill(ApproveSkillRequest approveSkillRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates a contact with a given address book.
     * </p>
     * 
     * @param associateContactWithAddressBookRequest
     * @return associateContactWithAddressBookResult The response from the
     *         AssociateContactWithAddressBook service method, as returned by
     *         Alexa For Business.
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AssociateContactWithAddressBookResult associateContactWithAddressBook(
            AssociateContactWithAddressBookRequest associateContactWithAddressBookRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates a device with the specified network profile.
     * </p>
     * 
     * @param associateDeviceWithNetworkProfileRequest
     * @return associateDeviceWithNetworkProfileResult The response from the
     *         AssociateDeviceWithNetworkProfile service method, as returned by
     *         Alexa For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws DeviceNotRegisteredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AssociateDeviceWithNetworkProfileResult associateDeviceWithNetworkProfile(
            AssociateDeviceWithNetworkProfileRequest associateDeviceWithNetworkProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates a device with a given room. This applies all the settings from
     * the room profile to the device, and all the skills in any skill groups
     * added to that room. This operation requires the device to be online, or
     * else a manual sync is required.
     * </p>
     * 
     * @param associateDeviceWithRoomRequest
     * @return associateDeviceWithRoomResult The response from the
     *         AssociateDeviceWithRoom service method, as returned by Alexa For
     *         Business.
     * @throws LimitExceededException
     * @throws ConcurrentModificationException
     * @throws DeviceNotRegisteredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AssociateDeviceWithRoomResult associateDeviceWithRoom(
            AssociateDeviceWithRoomRequest associateDeviceWithRoomRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates a skill group with a given room. This enables all skills in
     * the associated skill group on all devices in the room.
     * </p>
     * 
     * @param associateSkillGroupWithRoomRequest
     * @return associateSkillGroupWithRoomResult The response from the
     *         AssociateSkillGroupWithRoom service method, as returned by Alexa
     *         For Business.
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AssociateSkillGroupWithRoomResult associateSkillGroupWithRoom(
            AssociateSkillGroupWithRoomRequest associateSkillGroupWithRoomRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates a skill with a skill group.
     * </p>
     * 
     * @param associateSkillWithSkillGroupRequest
     * @return associateSkillWithSkillGroupResult The response from the
     *         AssociateSkillWithSkillGroup service method, as returned by Alexa
     *         For Business.
     * @throws ConcurrentModificationException
     * @throws NotFoundException
     * @throws SkillNotLinkedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AssociateSkillWithSkillGroupResult associateSkillWithSkillGroup(
            AssociateSkillWithSkillGroupRequest associateSkillWithSkillGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Makes a private skill available for enrolled users to enable on their
     * devices.
     * </p>
     * 
     * @param associateSkillWithUsersRequest
     * @return associateSkillWithUsersResult The response from the
     *         AssociateSkillWithUsers service method, as returned by Alexa For
     *         Business.
     * @throws ConcurrentModificationException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AssociateSkillWithUsersResult associateSkillWithUsers(
            AssociateSkillWithUsersRequest associateSkillWithUsersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an address book with the specified details.
     * </p>
     * 
     * @param createAddressBookRequest
     * @return createAddressBookResult The response from the CreateAddressBook
     *         service method, as returned by Alexa For Business.
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateAddressBookResult createAddressBook(CreateAddressBookRequest createAddressBookRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a recurring schedule for usage reports to deliver to the
     * specified S3 location with a specified daily or weekly interval.
     * </p>
     * 
     * @param createBusinessReportScheduleRequest
     * @return createBusinessReportScheduleResult The response from the
     *         CreateBusinessReportSchedule service method, as returned by Alexa
     *         For Business.
     * @throws AlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateBusinessReportScheduleResult createBusinessReportSchedule(
            CreateBusinessReportScheduleRequest createBusinessReportScheduleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds a new conference provider under the user's AWS account.
     * </p>
     * 
     * @param createConferenceProviderRequest
     * @return createConferenceProviderResult The response from the
     *         CreateConferenceProvider service method, as returned by Alexa For
     *         Business.
     * @throws AlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateConferenceProviderResult createConferenceProvider(
            CreateConferenceProviderRequest createConferenceProviderRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a contact with the specified details.
     * </p>
     * 
     * @param createContactRequest
     * @return createContactResult The response from the CreateContact service
     *         method, as returned by Alexa For Business.
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateContactResult createContact(CreateContactRequest createContactRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a gateway group with the specified details.
     * </p>
     * 
     * @param createGatewayGroupRequest
     * @return createGatewayGroupResult The response from the CreateGatewayGroup
     *         service method, as returned by Alexa For Business.
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateGatewayGroupResult createGatewayGroup(CreateGatewayGroupRequest createGatewayGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a network profile with the specified details.
     * </p>
     * 
     * @param createNetworkProfileRequest
     * @return createNetworkProfileResult The response from the
     *         CreateNetworkProfile service method, as returned by Alexa For
     *         Business.
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws ConcurrentModificationException
     * @throws InvalidCertificateAuthorityException
     * @throws InvalidServiceLinkedRoleStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateNetworkProfileResult createNetworkProfile(
            CreateNetworkProfileRequest createNetworkProfileRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a new room profile with the specified details.
     * </p>
     * 
     * @param createProfileRequest
     * @return createProfileResult The response from the CreateProfile service
     *         method, as returned by Alexa For Business.
     * @throws LimitExceededException
     * @throws AlreadyExistsException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateProfileResult createProfile(CreateProfileRequest createProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a room with the specified details.
     * </p>
     * 
     * @param createRoomRequest
     * @return createRoomResult The response from the CreateRoom service method,
     *         as returned by Alexa For Business.
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateRoomResult createRoom(CreateRoomRequest createRoomRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a skill group with a specified name and description.
     * </p>
     * 
     * @param createSkillGroupRequest
     * @return createSkillGroupResult The response from the CreateSkillGroup
     *         service method, as returned by Alexa For Business.
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateSkillGroupResult createSkillGroup(CreateSkillGroupRequest createSkillGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a user.
     * </p>
     * 
     * @param createUserRequest
     * @return createUserResult The response from the CreateUser service method,
     *         as returned by Alexa For Business.
     * @throws ResourceInUseException
     * @throws LimitExceededException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateUserResult createUser(CreateUserRequest createUserRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes an address book by the address book ARN.
     * </p>
     * 
     * @param deleteAddressBookRequest
     * @return deleteAddressBookResult The response from the DeleteAddressBook
     *         service method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteAddressBookResult deleteAddressBook(DeleteAddressBookRequest deleteAddressBookRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the recurring report delivery schedule with the specified
     * schedule ARN.
     * </p>
     * 
     * @param deleteBusinessReportScheduleRequest
     * @return deleteBusinessReportScheduleResult The response from the
     *         DeleteBusinessReportSchedule service method, as returned by Alexa
     *         For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteBusinessReportScheduleResult deleteBusinessReportSchedule(
            DeleteBusinessReportScheduleRequest deleteBusinessReportScheduleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a conference provider.
     * </p>
     * 
     * @param deleteConferenceProviderRequest
     * @return deleteConferenceProviderResult The response from the
     *         DeleteConferenceProvider service method, as returned by Alexa For
     *         Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteConferenceProviderResult deleteConferenceProvider(
            DeleteConferenceProviderRequest deleteConferenceProviderRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a contact by the contact ARN.
     * </p>
     * 
     * @param deleteContactRequest
     * @return deleteContactResult The response from the DeleteContact service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteContactResult deleteContact(DeleteContactRequest deleteContactRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes a device from Alexa For Business.
     * </p>
     * 
     * @param deleteDeviceRequest
     * @return deleteDeviceResult The response from the DeleteDevice service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws InvalidCertificateAuthorityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteDeviceResult deleteDevice(DeleteDeviceRequest deleteDeviceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * When this action is called for a specified shared device, it allows
     * authorized users to delete the device's entire previous history of voice
     * input data and associated response data. This action can be called once
     * every 24 hours for a specific shared device.
     * </p>
     * 
     * @param deleteDeviceUsageDataRequest
     * @return deleteDeviceUsageDataResult The response from the
     *         DeleteDeviceUsageData service method, as returned by Alexa For
     *         Business.
     * @throws NotFoundException
     * @throws DeviceNotRegisteredException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteDeviceUsageDataResult deleteDeviceUsageData(
            DeleteDeviceUsageDataRequest deleteDeviceUsageDataRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a gateway group.
     * </p>
     * 
     * @param deleteGatewayGroupRequest
     * @return deleteGatewayGroupResult The response from the DeleteGatewayGroup
     *         service method, as returned by Alexa For Business.
     * @throws ResourceAssociatedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteGatewayGroupResult deleteGatewayGroup(DeleteGatewayGroupRequest deleteGatewayGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a network profile by the network profile ARN.
     * </p>
     * 
     * @param deleteNetworkProfileRequest
     * @return deleteNetworkProfileResult The response from the
     *         DeleteNetworkProfile service method, as returned by Alexa For
     *         Business.
     * @throws ResourceInUseException
     * @throws ConcurrentModificationException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteNetworkProfileResult deleteNetworkProfile(
            DeleteNetworkProfileRequest deleteNetworkProfileRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a room profile by the profile ARN.
     * </p>
     * 
     * @param deleteProfileRequest
     * @return deleteProfileResult The response from the DeleteProfile service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteProfileResult deleteProfile(DeleteProfileRequest deleteProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a room by the room ARN.
     * </p>
     * 
     * @param deleteRoomRequest
     * @return deleteRoomResult The response from the DeleteRoom service method,
     *         as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteRoomResult deleteRoom(DeleteRoomRequest deleteRoomRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes room skill parameter details by room, skill, and parameter key
     * ID.
     * </p>
     * 
     * @param deleteRoomSkillParameterRequest
     * @return deleteRoomSkillParameterResult The response from the
     *         DeleteRoomSkillParameter service method, as returned by Alexa For
     *         Business.
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteRoomSkillParameterResult deleteRoomSkillParameter(
            DeleteRoomSkillParameterRequest deleteRoomSkillParameterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Unlinks a third-party account from a skill.
     * </p>
     * 
     * @param deleteSkillAuthorizationRequest
     * @return deleteSkillAuthorizationResult The response from the
     *         DeleteSkillAuthorization service method, as returned by Alexa For
     *         Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteSkillAuthorizationResult deleteSkillAuthorization(
            DeleteSkillAuthorizationRequest deleteSkillAuthorizationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a skill group by skill group ARN.
     * </p>
     * 
     * @param deleteSkillGroupRequest
     * @return deleteSkillGroupResult The response from the DeleteSkillGroup
     *         service method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteSkillGroupResult deleteSkillGroup(DeleteSkillGroupRequest deleteSkillGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a specified user by user ARN and enrollment ARN.
     * </p>
     * 
     * @param deleteUserRequest
     * @return deleteUserResult The response from the DeleteUser service method,
     *         as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Disassociates a contact from a given address book.
     * </p>
     * 
     * @param disassociateContactFromAddressBookRequest
     * @return disassociateContactFromAddressBookResult The response from the
     *         DisassociateContactFromAddressBook service method, as returned by
     *         Alexa For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociateContactFromAddressBookResult disassociateContactFromAddressBook(
            DisassociateContactFromAddressBookRequest disassociateContactFromAddressBookRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates a device from its current room. The device continues to be
     * connected to the Wi-Fi network and is still registered to the account.
     * The device settings and skills are removed from the room.
     * </p>
     * 
     * @param disassociateDeviceFromRoomRequest
     * @return disassociateDeviceFromRoomResult The response from the
     *         DisassociateDeviceFromRoom service method, as returned by Alexa
     *         For Business.
     * @throws ConcurrentModificationException
     * @throws DeviceNotRegisteredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociateDeviceFromRoomResult disassociateDeviceFromRoom(
            DisassociateDeviceFromRoomRequest disassociateDeviceFromRoomRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates a skill from a skill group.
     * </p>
     * 
     * @param disassociateSkillFromSkillGroupRequest
     * @return disassociateSkillFromSkillGroupResult The response from the
     *         DisassociateSkillFromSkillGroup service method, as returned by
     *         Alexa For Business.
     * @throws ConcurrentModificationException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociateSkillFromSkillGroupResult disassociateSkillFromSkillGroup(
            DisassociateSkillFromSkillGroupRequest disassociateSkillFromSkillGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Makes a private skill unavailable for enrolled users and prevents them
     * from enabling it on their devices.
     * </p>
     * 
     * @param disassociateSkillFromUsersRequest
     * @return disassociateSkillFromUsersResult The response from the
     *         DisassociateSkillFromUsers service method, as returned by Alexa
     *         For Business.
     * @throws ConcurrentModificationException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociateSkillFromUsersResult disassociateSkillFromUsers(
            DisassociateSkillFromUsersRequest disassociateSkillFromUsersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates a skill group from a specified room. This disables all
     * skills in the skill group on all devices in the room.
     * </p>
     * 
     * @param disassociateSkillGroupFromRoomRequest
     * @return disassociateSkillGroupFromRoomResult The response from the
     *         DisassociateSkillGroupFromRoom service method, as returned by
     *         Alexa For Business.
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociateSkillGroupFromRoomResult disassociateSkillGroupFromRoom(
            DisassociateSkillGroupFromRoomRequest disassociateSkillGroupFromRoomRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Forgets smart home appliances associated to a room.
     * </p>
     * 
     * @param forgetSmartHomeAppliancesRequest
     * @return forgetSmartHomeAppliancesResult The response from the
     *         ForgetSmartHomeAppliances service method, as returned by Alexa
     *         For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ForgetSmartHomeAppliancesResult forgetSmartHomeAppliances(
            ForgetSmartHomeAppliancesRequest forgetSmartHomeAppliancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets address the book details by the address book ARN.
     * </p>
     * 
     * @param getAddressBookRequest
     * @return getAddressBookResult The response from the GetAddressBook service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetAddressBookResult getAddressBook(GetAddressBookRequest getAddressBookRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the existing conference preferences.
     * </p>
     * 
     * @param getConferencePreferenceRequest
     * @return getConferencePreferenceResult The response from the
     *         GetConferencePreference service method, as returned by Alexa For
     *         Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetConferencePreferenceResult getConferencePreference(
            GetConferencePreferenceRequest getConferencePreferenceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets details about a specific conference provider.
     * </p>
     * 
     * @param getConferenceProviderRequest
     * @return getConferenceProviderResult The response from the
     *         GetConferenceProvider service method, as returned by Alexa For
     *         Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetConferenceProviderResult getConferenceProvider(
            GetConferenceProviderRequest getConferenceProviderRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the contact details by the contact ARN.
     * </p>
     * 
     * @param getContactRequest
     * @return getContactResult The response from the GetContact service method,
     *         as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetContactResult getContact(GetContactRequest getContactRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets the details of a device by device ARN.
     * </p>
     * 
     * @param getDeviceRequest
     * @return getDeviceResult The response from the GetDevice service method,
     *         as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDeviceResult getDevice(GetDeviceRequest getDeviceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves the details of a gateway.
     * </p>
     * 
     * @param getGatewayRequest
     * @return getGatewayResult The response from the GetGateway service method,
     *         as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetGatewayResult getGateway(GetGatewayRequest getGatewayRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves the details of a gateway group.
     * </p>
     * 
     * @param getGatewayGroupRequest
     * @return getGatewayGroupResult The response from the GetGatewayGroup
     *         service method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetGatewayGroupResult getGatewayGroup(GetGatewayGroupRequest getGatewayGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the configured values for the user enrollment invitation email
     * template.
     * </p>
     * 
     * @param getInvitationConfigurationRequest
     * @return getInvitationConfigurationResult The response from the
     *         GetInvitationConfiguration service method, as returned by Alexa
     *         For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetInvitationConfigurationResult getInvitationConfiguration(
            GetInvitationConfigurationRequest getInvitationConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the network profile details by the network profile ARN.
     * </p>
     * 
     * @param getNetworkProfileRequest
     * @return getNetworkProfileResult The response from the GetNetworkProfile
     *         service method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws InvalidSecretsManagerResourceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetNetworkProfileResult getNetworkProfile(GetNetworkProfileRequest getNetworkProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the details of a room profile by profile ARN.
     * </p>
     * 
     * @param getProfileRequest
     * @return getProfileResult The response from the GetProfile service method,
     *         as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetProfileResult getProfile(GetProfileRequest getProfileRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets room details by room ARN.
     * </p>
     * 
     * @param getRoomRequest
     * @return getRoomResult The response from the GetRoom service method, as
     *         returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRoomResult getRoom(GetRoomRequest getRoomRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets room skill parameter details by room, skill, and parameter key ARN.
     * </p>
     * 
     * @param getRoomSkillParameterRequest
     * @return getRoomSkillParameterResult The response from the
     *         GetRoomSkillParameter service method, as returned by Alexa For
     *         Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRoomSkillParameterResult getRoomSkillParameter(
            GetRoomSkillParameterRequest getRoomSkillParameterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets skill group details by skill group ARN.
     * </p>
     * 
     * @param getSkillGroupRequest
     * @return getSkillGroupResult The response from the GetSkillGroup service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetSkillGroupResult getSkillGroup(GetSkillGroupRequest getSkillGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the details of the schedules that a user configured. A download URL
     * of the report associated with each schedule is returned every time this
     * action is called. A new download URL is returned each time, and is valid
     * for 24 hours.
     * </p>
     * 
     * @param listBusinessReportSchedulesRequest
     * @return listBusinessReportSchedulesResult The response from the
     *         ListBusinessReportSchedules service method, as returned by Alexa
     *         For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListBusinessReportSchedulesResult listBusinessReportSchedules(
            ListBusinessReportSchedulesRequest listBusinessReportSchedulesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists conference providers under a specific AWS account.
     * </p>
     * 
     * @param listConferenceProvidersRequest
     * @return listConferenceProvidersResult The response from the
     *         ListConferenceProviders service method, as returned by Alexa For
     *         Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListConferenceProvidersResult listConferenceProviders(
            ListConferenceProvidersRequest listConferenceProvidersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the device event history, including device connection status, for
     * up to 30 days.
     * </p>
     * 
     * @param listDeviceEventsRequest
     * @return listDeviceEventsResult The response from the ListDeviceEvents
     *         service method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDeviceEventsResult listDeviceEvents(ListDeviceEventsRequest listDeviceEventsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a list of gateway group summaries. Use GetGatewayGroup to
     * retrieve details of a specific gateway group.
     * </p>
     * 
     * @param listGatewayGroupsRequest
     * @return listGatewayGroupsResult The response from the ListGatewayGroups
     *         service method, as returned by Alexa For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListGatewayGroupsResult listGatewayGroups(ListGatewayGroupsRequest listGatewayGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a list of gateway summaries. Use GetGateway to retrieve details
     * of a specific gateway. An optional gateway group ARN can be provided to
     * only retrieve gateway summaries of gateways that are associated with that
     * gateway group ARN.
     * </p>
     * 
     * @param listGatewaysRequest
     * @return listGatewaysResult The response from the ListGateways service
     *         method, as returned by Alexa For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListGatewaysResult listGateways(ListGatewaysRequest listGatewaysRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all enabled skills in a specific skill group.
     * </p>
     * 
     * @param listSkillsRequest
     * @return listSkillsResult The response from the ListSkills service method,
     *         as returned by Alexa For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListSkillsResult listSkills(ListSkillsRequest listSkillsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists all categories in the Alexa skill store.
     * </p>
     * 
     * @param listSkillsStoreCategoriesRequest
     * @return listSkillsStoreCategoriesResult The response from the
     *         ListSkillsStoreCategories service method, as returned by Alexa
     *         For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListSkillsStoreCategoriesResult listSkillsStoreCategories(
            ListSkillsStoreCategoriesRequest listSkillsStoreCategoriesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all skills in the Alexa skill store by category.
     * </p>
     * 
     * @param listSkillsStoreSkillsByCategoryRequest
     * @return listSkillsStoreSkillsByCategoryResult The response from the
     *         ListSkillsStoreSkillsByCategory service method, as returned by
     *         Alexa For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListSkillsStoreSkillsByCategoryResult listSkillsStoreSkillsByCategory(
            ListSkillsStoreSkillsByCategoryRequest listSkillsStoreSkillsByCategoryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all of the smart home appliances associated with a room.
     * </p>
     * 
     * @param listSmartHomeAppliancesRequest
     * @return listSmartHomeAppliancesResult The response from the
     *         ListSmartHomeAppliances service method, as returned by Alexa For
     *         Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListSmartHomeAppliancesResult listSmartHomeAppliances(
            ListSmartHomeAppliancesRequest listSmartHomeAppliancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all tags for the specified resource.
     * </p>
     * 
     * @param listTagsRequest
     * @return listTagsResult The response from the ListTags service method, as
     *         returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsResult listTags(ListTagsRequest listTagsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Sets the conference preferences on a specific conference provider at the
     * account level.
     * </p>
     * 
     * @param putConferencePreferenceRequest
     * @return putConferencePreferenceResult The response from the
     *         PutConferencePreference service method, as returned by Alexa For
     *         Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutConferencePreferenceResult putConferencePreference(
            PutConferencePreferenceRequest putConferencePreferenceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Configures the email template for the user enrollment invitation with the
     * specified attributes.
     * </p>
     * 
     * @param putInvitationConfigurationRequest
     * @return putInvitationConfigurationResult The response from the
     *         PutInvitationConfiguration service method, as returned by Alexa
     *         For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutInvitationConfigurationResult putInvitationConfiguration(
            PutInvitationConfigurationRequest putInvitationConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates room skill parameter details by room, skill, and parameter key
     * ID. Not all skills have a room skill parameter.
     * </p>
     * 
     * @param putRoomSkillParameterRequest
     * @return putRoomSkillParameterResult The response from the
     *         PutRoomSkillParameter service method, as returned by Alexa For
     *         Business.
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutRoomSkillParameterResult putRoomSkillParameter(
            PutRoomSkillParameterRequest putRoomSkillParameterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Links a user's account to a third-party skill provider. If this API
     * operation is called by an assumed IAM role, the skill being linked must
     * be a private skill. Also, the skill must be owned by the AWS account that
     * assumed the IAM role.
     * </p>
     * 
     * @param putSkillAuthorizationRequest
     * @return putSkillAuthorizationResult The response from the
     *         PutSkillAuthorization service method, as returned by Alexa For
     *         Business.
     * @throws UnauthorizedException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutSkillAuthorizationResult putSkillAuthorization(
            PutSkillAuthorizationRequest putSkillAuthorizationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Registers an Alexa-enabled device built by an Original Equipment
     * Manufacturer (OEM) using Alexa Voice Service (AVS).
     * </p>
     * 
     * @param registerAVSDeviceRequest
     * @return registerAVSDeviceResult The response from the RegisterAVSDevice
     *         service method, as returned by Alexa For Business.
     * @throws LimitExceededException
     * @throws ConcurrentModificationException
     * @throws InvalidDeviceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    RegisterAVSDeviceResult registerAVSDevice(RegisterAVSDeviceRequest registerAVSDeviceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates a skill from the organization under a user's AWS account.
     * If the skill is a private skill, it moves to an AcceptStatus of PENDING.
     * Any private or public skill that is rejected can be added later by
     * calling the ApproveSkill API.
     * </p>
     * 
     * @param rejectSkillRequest
     * @return rejectSkillResult The response from the RejectSkill service
     *         method, as returned by Alexa For Business.
     * @throws ConcurrentModificationException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    RejectSkillResult rejectSkill(RejectSkillRequest rejectSkillRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Determines the details for the room from which a skill request was
     * invoked. This operation is used by skill developers.
     * </p>
     * 
     * @param resolveRoomRequest
     * @return resolveRoomResult The response from the ResolveRoom service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ResolveRoomResult resolveRoom(ResolveRoomRequest resolveRoomRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Revokes an invitation and invalidates the enrollment URL.
     * </p>
     * 
     * @param revokeInvitationRequest
     * @return revokeInvitationResult The response from the RevokeInvitation
     *         service method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    RevokeInvitationResult revokeInvitation(RevokeInvitationRequest revokeInvitationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Searches address books and lists the ones that meet a set of filter and
     * sort criteria.
     * </p>
     * 
     * @param searchAddressBooksRequest
     * @return searchAddressBooksResult The response from the SearchAddressBooks
     *         service method, as returned by Alexa For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    SearchAddressBooksResult searchAddressBooks(SearchAddressBooksRequest searchAddressBooksRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Searches contacts and lists the ones that meet a set of filter and sort
     * criteria.
     * </p>
     * 
     * @param searchContactsRequest
     * @return searchContactsResult The response from the SearchContacts service
     *         method, as returned by Alexa For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    SearchContactsResult searchContacts(SearchContactsRequest searchContactsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Searches devices and lists the ones that meet a set of filter criteria.
     * </p>
     * 
     * @param searchDevicesRequest
     * @return searchDevicesResult The response from the SearchDevices service
     *         method, as returned by Alexa For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    SearchDevicesResult searchDevices(SearchDevicesRequest searchDevicesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Searches network profiles and lists the ones that meet a set of filter
     * and sort criteria.
     * </p>
     * 
     * @param searchNetworkProfilesRequest
     * @return searchNetworkProfilesResult The response from the
     *         SearchNetworkProfiles service method, as returned by Alexa For
     *         Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    SearchNetworkProfilesResult searchNetworkProfiles(
            SearchNetworkProfilesRequest searchNetworkProfilesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Searches room profiles and lists the ones that meet a set of filter
     * criteria.
     * </p>
     * 
     * @param searchProfilesRequest
     * @return searchProfilesResult The response from the SearchProfiles service
     *         method, as returned by Alexa For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    SearchProfilesResult searchProfiles(SearchProfilesRequest searchProfilesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Searches rooms and lists the ones that meet a set of filter and sort
     * criteria.
     * </p>
     * 
     * @param searchRoomsRequest
     * @return searchRoomsResult The response from the SearchRooms service
     *         method, as returned by Alexa For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    SearchRoomsResult searchRooms(SearchRoomsRequest searchRoomsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Searches skill groups and lists the ones that meet a set of filter and
     * sort criteria.
     * </p>
     * 
     * @param searchSkillGroupsRequest
     * @return searchSkillGroupsResult The response from the SearchSkillGroups
     *         service method, as returned by Alexa For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    SearchSkillGroupsResult searchSkillGroups(SearchSkillGroupsRequest searchSkillGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Searches users and lists the ones that meet a set of filter and sort
     * criteria.
     * </p>
     * 
     * @param searchUsersRequest
     * @return searchUsersResult The response from the SearchUsers service
     *         method, as returned by Alexa For Business.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    SearchUsersResult searchUsers(SearchUsersRequest searchUsersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Triggers an asynchronous flow to send text, SSML, or audio announcements
     * to rooms that are identified by a search or filter.
     * </p>
     * 
     * @param sendAnnouncementRequest
     * @return sendAnnouncementResult The response from the SendAnnouncement
     *         service method, as returned by Alexa For Business.
     * @throws LimitExceededException
     * @throws AlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    SendAnnouncementResult sendAnnouncement(SendAnnouncementRequest sendAnnouncementRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sends an enrollment invitation email with a URL to a user. The URL is
     * valid for 30 days or until you call this operation again, whichever comes
     * first.
     * </p>
     * 
     * @param sendInvitationRequest
     * @return sendInvitationResult The response from the SendInvitation service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws InvalidUserStatusException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    SendInvitationResult sendInvitation(SendInvitationRequest sendInvitationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Resets a device and its account to the known default settings. This
     * clears all information and settings set by previous users in the
     * following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Bluetooth - This unpairs all bluetooth devices paired with your echo
     * device.
     * </p>
     * </li>
     * <li>
     * <p>
     * Volume - This resets the echo device's volume to the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Notifications - This clears all notifications from your echo device.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lists - This clears all to-do items from your echo device.
     * </p>
     * </li>
     * <li>
     * <p>
     * Settings - This internally syncs the room's profile (if the device is
     * assigned to a room), contacts, address books, delegation access for
     * account linking, and communications (if enabled on the room profile).
     * </p>
     * </li>
     * </ul>
     * 
     * @param startDeviceSyncRequest
     * @return startDeviceSyncResult The response from the StartDeviceSync
     *         service method, as returned by Alexa For Business.
     * @throws DeviceNotRegisteredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartDeviceSyncResult startDeviceSync(StartDeviceSyncRequest startDeviceSyncRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Initiates the discovery of any smart home appliances associated with the
     * room.
     * </p>
     * 
     * @param startSmartHomeApplianceDiscoveryRequest
     * @return startSmartHomeApplianceDiscoveryResult The response from the
     *         StartSmartHomeApplianceDiscovery service method, as returned by
     *         Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartSmartHomeApplianceDiscoveryResult startSmartHomeApplianceDiscovery(
            StartSmartHomeApplianceDiscoveryRequest startSmartHomeApplianceDiscoveryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds metadata tags to a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes metadata tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates address book details by the address book ARN.
     * </p>
     * 
     * @param updateAddressBookRequest
     * @return updateAddressBookResult The response from the UpdateAddressBook
     *         service method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws NameInUseException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateAddressBookResult updateAddressBook(UpdateAddressBookRequest updateAddressBookRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the configuration of the report delivery schedule with the
     * specified schedule ARN.
     * </p>
     * 
     * @param updateBusinessReportScheduleRequest
     * @return updateBusinessReportScheduleResult The response from the
     *         UpdateBusinessReportSchedule service method, as returned by Alexa
     *         For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateBusinessReportScheduleResult updateBusinessReportSchedule(
            UpdateBusinessReportScheduleRequest updateBusinessReportScheduleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an existing conference provider's settings.
     * </p>
     * 
     * @param updateConferenceProviderRequest
     * @return updateConferenceProviderResult The response from the
     *         UpdateConferenceProvider service method, as returned by Alexa For
     *         Business.
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateConferenceProviderResult updateConferenceProvider(
            UpdateConferenceProviderRequest updateConferenceProviderRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the contact details by the contact ARN.
     * </p>
     * 
     * @param updateContactRequest
     * @return updateContactResult The response from the UpdateContact service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateContactResult updateContact(UpdateContactRequest updateContactRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the device name by device ARN.
     * </p>
     * 
     * @param updateDeviceRequest
     * @return updateDeviceResult The response from the UpdateDevice service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws ConcurrentModificationException
     * @throws DeviceNotRegisteredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateDeviceResult updateDevice(UpdateDeviceRequest updateDeviceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the details of a gateway. If any optional field is not provided,
     * the existing corresponding value is left unmodified.
     * </p>
     * 
     * @param updateGatewayRequest
     * @return updateGatewayResult The response from the UpdateGateway service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws NameInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateGatewayResult updateGateway(UpdateGatewayRequest updateGatewayRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the details of a gateway group. If any optional field is not
     * provided, the existing corresponding value is left unmodified.
     * </p>
     * 
     * @param updateGatewayGroupRequest
     * @return updateGatewayGroupResult The response from the UpdateGatewayGroup
     *         service method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws NameInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateGatewayGroupResult updateGatewayGroup(UpdateGatewayGroupRequest updateGatewayGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a network profile by the network profile ARN.
     * </p>
     * 
     * @param updateNetworkProfileRequest
     * @return updateNetworkProfileResult The response from the
     *         UpdateNetworkProfile service method, as returned by Alexa For
     *         Business.
     * @throws NotFoundException
     * @throws NameInUseException
     * @throws ConcurrentModificationException
     * @throws InvalidCertificateAuthorityException
     * @throws InvalidSecretsManagerResourceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateNetworkProfileResult updateNetworkProfile(
            UpdateNetworkProfileRequest updateNetworkProfileRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates an existing room profile by room profile ARN.
     * </p>
     * 
     * @param updateProfileRequest
     * @return updateProfileResult The response from the UpdateProfile service
     *         method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws NameInUseException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateProfileResult updateProfile(UpdateProfileRequest updateProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates room details by room ARN.
     * </p>
     * 
     * @param updateRoomRequest
     * @return updateRoomResult The response from the UpdateRoom service method,
     *         as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws NameInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateRoomResult updateRoom(UpdateRoomRequest updateRoomRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates skill group details by skill group ARN.
     * </p>
     * 
     * @param updateSkillGroupRequest
     * @return updateSkillGroupResult The response from the UpdateSkillGroup
     *         service method, as returned by Alexa For Business.
     * @throws NotFoundException
     * @throws NameInUseException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Alexa
     *             For Business indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateSkillGroupResult updateSkillGroup(UpdateSkillGroupRequest updateSkillGroupRequest)
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
