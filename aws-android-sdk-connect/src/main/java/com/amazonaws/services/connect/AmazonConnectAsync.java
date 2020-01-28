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

package com.amazonaws.services.connect;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.connect.model.*;

/**
 * Interface for accessing Amazon Connect asynchronously.
 * <p>
 * Amazon Connect is a cloud-based contact center solution that makes it easy to
 * set up and manage a customer contact center and provide reliable customer
 * engagement at any scale.
 * </p>
 * <p>
 * Amazon Connect provides rich metrics and real-time reporting that allow you
 * to optimize contact routing. You can also resolve customer issues more
 * efficiently by putting customers in touch with the right agents.
 * </p>
 * <p>
 * There are limits to the number of Amazon Connect resources that you can
 * create and limits to the number of requests that you can make per second. For
 * more information, see <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html"
 * >Amazon Connect Service Limits</a> in the <i>Amazon Connect Administrator
 * Guide</i>.
 * </p>
 **/
public interface AmazonConnectAsync extends AmazonConnect {
    /**
     * <p>
     * Creates a user account for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createUserRequest
     * @return A Java Future object containing the response from the CreateUser
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws LimitExceededException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a user account for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createUserRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the CreateUser
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws LimitExceededException
     * @throws DuplicateResourceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest,
            AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a user account from the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteUserRequest
     * @return A Java Future object containing the response from the DeleteUser
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteUserAsync(DeleteUserRequest deleteUserRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a user account from the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteUserRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the DeleteUser
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteUserAsync(DeleteUserRequest deleteUserRequest,
            AsyncHandler<DeleteUserRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Describes the specified user account. You can find the instance ID in the
     * console (it’s the final part of the ARN). The console does not display
     * the user IDs. Instead, list the users and note the IDs provided in the
     * output.
     * </p>
     * 
     * @param describeUserRequest
     * @return A Java Future object containing the response from the
     *         DescribeUser service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeUserResult> describeUserAsync(DescribeUserRequest describeUserRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified user account. You can find the instance ID in the
     * console (it’s the final part of the ARN). The console does not display
     * the user IDs. Instead, list the users and note the IDs provided in the
     * output.
     * </p>
     * 
     * @param describeUserRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeUser service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeUserResult> describeUserAsync(DescribeUserRequest describeUserRequest,
            AsyncHandler<DescribeUserRequest, DescribeUserResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified hierarchy group.
     * </p>
     * 
     * @param describeUserHierarchyGroupRequest
     * @return A Java Future object containing the response from the
     *         DescribeUserHierarchyGroup service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeUserHierarchyGroupResult> describeUserHierarchyGroupAsync(
            DescribeUserHierarchyGroupRequest describeUserHierarchyGroupRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified hierarchy group.
     * </p>
     * 
     * @param describeUserHierarchyGroupRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeUserHierarchyGroup service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeUserHierarchyGroupResult> describeUserHierarchyGroupAsync(
            DescribeUserHierarchyGroupRequest describeUserHierarchyGroupRequest,
            AsyncHandler<DescribeUserHierarchyGroupRequest, DescribeUserHierarchyGroupResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the hierarchy structure of the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param describeUserHierarchyStructureRequest
     * @return A Java Future object containing the response from the
     *         DescribeUserHierarchyStructure service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeUserHierarchyStructureResult> describeUserHierarchyStructureAsync(
            DescribeUserHierarchyStructureRequest describeUserHierarchyStructureRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the hierarchy structure of the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param describeUserHierarchyStructureRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeUserHierarchyStructure service method, as returned by
     *         Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeUserHierarchyStructureResult> describeUserHierarchyStructureAsync(
            DescribeUserHierarchyStructureRequest describeUserHierarchyStructureRequest,
            AsyncHandler<DescribeUserHierarchyStructureRequest, DescribeUserHierarchyStructureResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the contact attributes for the specified contact.
     * </p>
     * 
     * @param getContactAttributesRequest
     * @return A Java Future object containing the response from the
     *         GetContactAttributes service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetContactAttributesResult> getContactAttributesAsync(
            GetContactAttributesRequest getContactAttributesRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Retrieves the contact attributes for the specified contact.
     * </p>
     * 
     * @param getContactAttributesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetContactAttributes service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetContactAttributesResult> getContactAttributesAsync(
            GetContactAttributesRequest getContactAttributesRequest,
            AsyncHandler<GetContactAttributesRequest, GetContactAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the real-time metric data from the specified Amazon Connect
     * instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-reports.html"
     * >Real-time Metrics Reports</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param getCurrentMetricDataRequest
     * @return A Java Future object containing the response from the
     *         GetCurrentMetricData service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetCurrentMetricDataResult> getCurrentMetricDataAsync(
            GetCurrentMetricDataRequest getCurrentMetricDataRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Gets the real-time metric data from the specified Amazon Connect
     * instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-reports.html"
     * >Real-time Metrics Reports</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param getCurrentMetricDataRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetCurrentMetricData service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetCurrentMetricDataResult> getCurrentMetricDataAsync(
            GetCurrentMetricDataRequest getCurrentMetricDataRequest,
            AsyncHandler<GetCurrentMetricDataRequest, GetCurrentMetricDataResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves a token for federation.
     * </p>
     * 
     * @param getFederationTokenRequest
     * @return A Java Future object containing the response from the
     *         GetFederationToken service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws UserNotFoundException
     * @throws InternalServiceException
     * @throws DuplicateResourceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetFederationTokenResult> getFederationTokenAsync(
            GetFederationTokenRequest getFederationTokenRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Retrieves a token for federation.
     * </p>
     * 
     * @param getFederationTokenRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetFederationToken service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws UserNotFoundException
     * @throws InternalServiceException
     * @throws DuplicateResourceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetFederationTokenResult> getFederationTokenAsync(
            GetFederationTokenRequest getFederationTokenRequest,
            AsyncHandler<GetFederationTokenRequest, GetFederationTokenResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets historical metric data from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics.html"
     * >Historical Metrics Reports</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param getMetricDataRequest
     * @return A Java Future object containing the response from the
     *         GetMetricData service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetMetricDataResult> getMetricDataAsync(GetMetricDataRequest getMetricDataRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets historical metric data from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics.html"
     * >Historical Metrics Reports</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param getMetricDataRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetMetricData service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetMetricDataResult> getMetricDataAsync(GetMetricDataRequest getMetricDataRequest,
            AsyncHandler<GetMetricDataRequest, GetMetricDataResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information about the contact flows for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listContactFlowsRequest
     * @return A Java Future object containing the response from the
     *         ListContactFlows service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListContactFlowsResult> listContactFlowsAsync(
            ListContactFlowsRequest listContactFlowsRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Provides information about the contact flows for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listContactFlowsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListContactFlows service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListContactFlowsResult> listContactFlowsAsync(
            ListContactFlowsRequest listContactFlowsRequest,
            AsyncHandler<ListContactFlowsRequest, ListContactFlowsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information about the hours of operation for the specified
     * Amazon Connect instance.
     * </p>
     * 
     * @param listHoursOfOperationsRequest
     * @return A Java Future object containing the response from the
     *         ListHoursOfOperations service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListHoursOfOperationsResult> listHoursOfOperationsAsync(
            ListHoursOfOperationsRequest listHoursOfOperationsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information about the hours of operation for the specified
     * Amazon Connect instance.
     * </p>
     * 
     * @param listHoursOfOperationsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListHoursOfOperations service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListHoursOfOperationsResult> listHoursOfOperationsAsync(
            ListHoursOfOperationsRequest listHoursOfOperationsRequest,
            AsyncHandler<ListHoursOfOperationsRequest, ListHoursOfOperationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information about the phone numbers for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listPhoneNumbersRequest
     * @return A Java Future object containing the response from the
     *         ListPhoneNumbers service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListPhoneNumbersResult> listPhoneNumbersAsync(
            ListPhoneNumbersRequest listPhoneNumbersRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Provides information about the phone numbers for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listPhoneNumbersRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListPhoneNumbers service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListPhoneNumbersResult> listPhoneNumbersAsync(
            ListPhoneNumbersRequest listPhoneNumbersRequest,
            AsyncHandler<ListPhoneNumbersRequest, ListPhoneNumbersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information about the queues for the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param listQueuesRequest
     * @return A Java Future object containing the response from the ListQueues
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListQueuesResult> listQueuesAsync(ListQueuesRequest listQueuesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information about the queues for the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param listQueuesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the ListQueues
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListQueuesResult> listQueuesAsync(ListQueuesRequest listQueuesRequest,
            AsyncHandler<ListQueuesRequest, ListQueuesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides summary information about the routing profiles for the specified
     * Amazon Connect instance.
     * </p>
     * 
     * @param listRoutingProfilesRequest
     * @return A Java Future object containing the response from the
     *         ListRoutingProfiles service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListRoutingProfilesResult> listRoutingProfilesAsync(
            ListRoutingProfilesRequest listRoutingProfilesRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Provides summary information about the routing profiles for the specified
     * Amazon Connect instance.
     * </p>
     * 
     * @param listRoutingProfilesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListRoutingProfiles service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListRoutingProfilesResult> listRoutingProfilesAsync(
            ListRoutingProfilesRequest listRoutingProfilesRequest,
            AsyncHandler<ListRoutingProfilesRequest, ListRoutingProfilesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides summary information about the security profiles for the
     * specified Amazon Connect instance.
     * </p>
     * 
     * @param listSecurityProfilesRequest
     * @return A Java Future object containing the response from the
     *         ListSecurityProfiles service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListSecurityProfilesResult> listSecurityProfilesAsync(
            ListSecurityProfilesRequest listSecurityProfilesRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Provides summary information about the security profiles for the
     * specified Amazon Connect instance.
     * </p>
     * 
     * @param listSecurityProfilesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListSecurityProfiles service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListSecurityProfilesResult> listSecurityProfilesAsync(
            ListSecurityProfilesRequest listSecurityProfilesRequest,
            AsyncHandler<ListSecurityProfilesRequest, ListSecurityProfilesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest listTagsForResourceRequest,
            AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides summary information about the hierarchy groups for the specified
     * Amazon Connect instance.
     * </p>
     * 
     * @param listUserHierarchyGroupsRequest
     * @return A Java Future object containing the response from the
     *         ListUserHierarchyGroups service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListUserHierarchyGroupsResult> listUserHierarchyGroupsAsync(
            ListUserHierarchyGroupsRequest listUserHierarchyGroupsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides summary information about the hierarchy groups for the specified
     * Amazon Connect instance.
     * </p>
     * 
     * @param listUserHierarchyGroupsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListUserHierarchyGroups service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListUserHierarchyGroupsResult> listUserHierarchyGroupsAsync(
            ListUserHierarchyGroupsRequest listUserHierarchyGroupsRequest,
            AsyncHandler<ListUserHierarchyGroupsRequest, ListUserHierarchyGroupsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides summary information about the users for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listUsersRequest
     * @return A Java Future object containing the response from the ListUsers
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides summary information about the users for the specified Amazon
     * Connect instance.
     * </p>
     * 
     * @param listUsersRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the ListUsers
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest,
            AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Initiates a contact flow to start a new chat for the customer. Response
     * of this API provides a token required to obtain credentials from the <a
     * href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> API in the Amazon Connect Participant
     * Service.
     * </p>
     * <p>
     * When a new chat contact is successfully created, clients need to
     * subscribe to the participant’s connection for the created chat within 5
     * minutes. This is achieved by invoking <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> with WEBSOCKET and
     * CONNECTION_CREDENTIALS.
     * </p>
     * 
     * @param startChatContactRequest
     * @return A Java Future object containing the response from the
     *         StartChatContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartChatContactResult> startChatContactAsync(
            StartChatContactRequest startChatContactRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Initiates a contact flow to start a new chat for the customer. Response
     * of this API provides a token required to obtain credentials from the <a
     * href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> API in the Amazon Connect Participant
     * Service.
     * </p>
     * <p>
     * When a new chat contact is successfully created, clients need to
     * subscribe to the participant’s connection for the created chat within 5
     * minutes. This is achieved by invoking <a href=
     * "https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> with WEBSOCKET and
     * CONNECTION_CREDENTIALS.
     * </p>
     * 
     * @param startChatContactRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartChatContact service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartChatContactResult> startChatContactAsync(
            StartChatContactRequest startChatContactRequest,
            AsyncHandler<StartChatContactRequest, StartChatContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Initiates a contact flow to place an outbound call to a customer.
     * </p>
     * <p>
     * There is a 60 second dialing timeout for this operation. If the call is
     * not connected after 60 seconds, it fails.
     * </p>
     * 
     * @param startOutboundVoiceContactRequest
     * @return A Java Future object containing the response from the
     *         StartOutboundVoiceContact service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws LimitExceededException
     * @throws DestinationNotAllowedException
     * @throws OutboundContactNotPermittedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartOutboundVoiceContactResult> startOutboundVoiceContactAsync(
            StartOutboundVoiceContactRequest startOutboundVoiceContactRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Initiates a contact flow to place an outbound call to a customer.
     * </p>
     * <p>
     * There is a 60 second dialing timeout for this operation. If the call is
     * not connected after 60 seconds, it fails.
     * </p>
     * 
     * @param startOutboundVoiceContactRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartOutboundVoiceContact service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws LimitExceededException
     * @throws DestinationNotAllowedException
     * @throws OutboundContactNotPermittedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartOutboundVoiceContactResult> startOutboundVoiceContactAsync(
            StartOutboundVoiceContactRequest startOutboundVoiceContactRequest,
            AsyncHandler<StartOutboundVoiceContactRequest, StartOutboundVoiceContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Ends the specified contact.
     * </p>
     * 
     * @param stopContactRequest
     * @return A Java Future object containing the response from the StopContact
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ContactNotFoundException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopContactResult> stopContactAsync(StopContactRequest stopContactRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Ends the specified contact.
     * </p>
     * 
     * @param stopContactRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the StopContact
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws ContactNotFoundException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopContactResult> stopContactAsync(StopContactRequest stopContactRequest,
            AsyncHandler<StopContactRequest, StopContactResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * <p>
     * The supported resource type is users.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future object containing the response from the TagResource
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> tagResourceAsync(TagResourceRequest tagResourceRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * <p>
     * The supported resource type is users.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the TagResource
     *         service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> tagResourceAsync(TagResourceRequest tagResourceRequest,
            AsyncHandler<TagResourceRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future object containing the response from the
     *         UntagResource service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> untagResourceAsync(UntagResourceRequest untagResourceRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UntagResource service method, as returned by Amazon Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws InternalServiceException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            AsyncHandler<UntagResourceRequest, Void> asyncHandler) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Creates or updates the contact attributes associated with the specified
     * contact.
     * </p>
     * <p>
     * You can add or update attributes for both ongoing and completed contacts.
     * For example, you can update the customer's name or the reason the
     * customer called while the call is active, or add notes about steps that
     * the agent took during the call that are displayed to the next agent that
     * takes the call. You can also update attributes for a contact using data
     * from your CRM application and save the data with the contact in Amazon
     * Connect. You could also flag calls for additional analysis, such as legal
     * review or identifying abusive callers.
     * </p>
     * <p>
     * Contact attributes are available in Amazon Connect for 24 months, and are
     * then deleted.
     * </p>
     * <p>
     * <b>Important:</b> You cannot use the operation to update attributes for
     * contacts that occurred prior to the release of the API, September 12,
     * 2018. You can update attributes only for contacts that started after the
     * release of the API. If you attempt to update attributes for a contact
     * that occurred prior to the release of the API, a 400 error is returned.
     * This applies also to queued callbacks that were initiated prior to the
     * release of the API but are still active in your instance.
     * </p>
     * 
     * @param updateContactAttributesRequest
     * @return A Java Future object containing the response from the
     *         UpdateContactAttributes service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateContactAttributesResult> updateContactAttributesAsync(
            UpdateContactAttributesRequest updateContactAttributesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates or updates the contact attributes associated with the specified
     * contact.
     * </p>
     * <p>
     * You can add or update attributes for both ongoing and completed contacts.
     * For example, you can update the customer's name or the reason the
     * customer called while the call is active, or add notes about steps that
     * the agent took during the call that are displayed to the next agent that
     * takes the call. You can also update attributes for a contact using data
     * from your CRM application and save the data with the contact in Amazon
     * Connect. You could also flag calls for additional analysis, such as legal
     * review or identifying abusive callers.
     * </p>
     * <p>
     * Contact attributes are available in Amazon Connect for 24 months, and are
     * then deleted.
     * </p>
     * <p>
     * <b>Important:</b> You cannot use the operation to update attributes for
     * contacts that occurred prior to the release of the API, September 12,
     * 2018. You can update attributes only for contacts that started after the
     * release of the API. If you attempt to update attributes for a contact
     * that occurred prior to the release of the API, a 400 error is returned.
     * This applies also to queued callbacks that were initiated prior to the
     * release of the API but are still active in your instance.
     * </p>
     * 
     * @param updateContactAttributesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateContactAttributes service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateContactAttributesResult> updateContactAttributesAsync(
            UpdateContactAttributesRequest updateContactAttributesRequest,
            AsyncHandler<UpdateContactAttributesRequest, UpdateContactAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Assigns the specified hierarchy group to the specified user.
     * </p>
     * 
     * @param updateUserHierarchyRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserHierarchy service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateUserHierarchyAsync(UpdateUserHierarchyRequest updateUserHierarchyRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Assigns the specified hierarchy group to the specified user.
     * </p>
     * 
     * @param updateUserHierarchyRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateUserHierarchy service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateUserHierarchyAsync(UpdateUserHierarchyRequest updateUserHierarchyRequest,
            AsyncHandler<UpdateUserHierarchyRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the identity information for the specified user.
     * </p>
     * 
     * @param updateUserIdentityInfoRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserIdentityInfo service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateUserIdentityInfoAsync(
            UpdateUserIdentityInfoRequest updateUserIdentityInfoRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the identity information for the specified user.
     * </p>
     * 
     * @param updateUserIdentityInfoRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateUserIdentityInfo service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateUserIdentityInfoAsync(
            UpdateUserIdentityInfoRequest updateUserIdentityInfoRequest,
            AsyncHandler<UpdateUserIdentityInfoRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the phone configuration settings for the specified user.
     * </p>
     * 
     * @param updateUserPhoneConfigRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserPhoneConfig service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateUserPhoneConfigAsync(
            UpdateUserPhoneConfigRequest updateUserPhoneConfigRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the phone configuration settings for the specified user.
     * </p>
     * 
     * @param updateUserPhoneConfigRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateUserPhoneConfig service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateUserPhoneConfigAsync(
            UpdateUserPhoneConfigRequest updateUserPhoneConfigRequest,
            AsyncHandler<UpdateUserPhoneConfigRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Assigns the specified routing profile to the specified user.
     * </p>
     * 
     * @param updateUserRoutingProfileRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserRoutingProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateUserRoutingProfileAsync(
            UpdateUserRoutingProfileRequest updateUserRoutingProfileRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Assigns the specified routing profile to the specified user.
     * </p>
     * 
     * @param updateUserRoutingProfileRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateUserRoutingProfile service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateUserRoutingProfileAsync(
            UpdateUserRoutingProfileRequest updateUserRoutingProfileRequest,
            AsyncHandler<UpdateUserRoutingProfileRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Assigns the specified security profiles to the specified user.
     * </p>
     * 
     * @param updateUserSecurityProfilesRequest
     * @return A Java Future object containing the response from the
     *         UpdateUserSecurityProfiles service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateUserSecurityProfilesAsync(
            UpdateUserSecurityProfilesRequest updateUserSecurityProfilesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Assigns the specified security profiles to the specified user.
     * </p>
     * 
     * @param updateUserSecurityProfilesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateUserSecurityProfiles service method, as returned by Amazon
     *         Connect.
     * @throws InvalidRequestException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> updateUserSecurityProfilesAsync(
            UpdateUserSecurityProfilesRequest updateUserSecurityProfilesRequest,
            AsyncHandler<UpdateUserSecurityProfilesRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

}
