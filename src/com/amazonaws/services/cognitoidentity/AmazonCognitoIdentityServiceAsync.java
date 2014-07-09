/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidentity;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.cognitoidentity.model.*;

/**
 * Interface for accessing AmazonCognitoIdentityService asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * 
 */
public interface AmazonCognitoIdentityServiceAsync extends AmazonCognitoIdentityService {
    /**
     *
     * @param listIdentityPoolsRequest Container for the necessary parameters
     *           to execute the ListIdentityPools operation on
     *           AmazonCognitoIdentityService.
     * 
     * @return A Java Future object containing the response from the
     *         ListIdentityPools service method, as returned by
     *         AmazonCognitoIdentityService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListIdentityPoolsResult> listIdentityPoolsAsync(ListIdentityPoolsRequest listIdentityPoolsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param listIdentityPoolsRequest Container for the necessary parameters
     *           to execute the ListIdentityPools operation on
     *           AmazonCognitoIdentityService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListIdentityPools service method, as returned by
     *         AmazonCognitoIdentityService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListIdentityPoolsResult> listIdentityPoolsAsync(ListIdentityPoolsRequest listIdentityPoolsRequest,
            AsyncHandler<ListIdentityPoolsRequest, ListIdentityPoolsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param getOpenIdTokenRequest Container for the necessary parameters to
     *           execute the GetOpenIdToken operation on AmazonCognitoIdentityService.
     * 
     * @return A Java Future object containing the response from the
     *         GetOpenIdToken service method, as returned by
     *         AmazonCognitoIdentityService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetOpenIdTokenResult> getOpenIdTokenAsync(GetOpenIdTokenRequest getOpenIdTokenRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param getOpenIdTokenRequest Container for the necessary parameters to
     *           execute the GetOpenIdToken operation on AmazonCognitoIdentityService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetOpenIdToken service method, as returned by
     *         AmazonCognitoIdentityService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetOpenIdTokenResult> getOpenIdTokenAsync(GetOpenIdTokenRequest getOpenIdTokenRequest,
            AsyncHandler<GetOpenIdTokenRequest, GetOpenIdTokenResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param unlinkIdentityRequest Container for the necessary parameters to
     *           execute the UnlinkIdentity operation on AmazonCognitoIdentityService.
     * 
     * @return A Java Future object containing the response from the
     *         UnlinkIdentity service method, as returned by
     *         AmazonCognitoIdentityService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> unlinkIdentityAsync(UnlinkIdentityRequest unlinkIdentityRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param unlinkIdentityRequest Container for the necessary parameters to
     *           execute the UnlinkIdentity operation on AmazonCognitoIdentityService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UnlinkIdentity service method, as returned by
     *         AmazonCognitoIdentityService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> unlinkIdentityAsync(UnlinkIdentityRequest unlinkIdentityRequest,
            AsyncHandler<UnlinkIdentityRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param describeIdentityPoolRequest Container for the necessary
     *           parameters to execute the DescribeIdentityPool operation on
     *           AmazonCognitoIdentityService.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeIdentityPool service method, as returned by
     *         AmazonCognitoIdentityService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeIdentityPoolResult> describeIdentityPoolAsync(DescribeIdentityPoolRequest describeIdentityPoolRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param describeIdentityPoolRequest Container for the necessary
     *           parameters to execute the DescribeIdentityPool operation on
     *           AmazonCognitoIdentityService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeIdentityPool service method, as returned by
     *         AmazonCognitoIdentityService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeIdentityPoolResult> describeIdentityPoolAsync(DescribeIdentityPoolRequest describeIdentityPoolRequest,
            AsyncHandler<DescribeIdentityPoolRequest, DescribeIdentityPoolResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param getIdRequest Container for the necessary parameters to execute
     *           the GetId operation on AmazonCognitoIdentityService.
     * 
     * @return A Java Future object containing the response from the GetId
     *         service method, as returned by AmazonCognitoIdentityService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetIdResult> getIdAsync(GetIdRequest getIdRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param getIdRequest Container for the necessary parameters to execute
     *           the GetId operation on AmazonCognitoIdentityService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the GetId
     *         service method, as returned by AmazonCognitoIdentityService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetIdResult> getIdAsync(GetIdRequest getIdRequest,
            AsyncHandler<GetIdRequest, GetIdResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param deleteIdentityPoolRequest Container for the necessary
     *           parameters to execute the DeleteIdentityPool operation on
     *           AmazonCognitoIdentityService.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteIdentityPool service method, as returned by
     *         AmazonCognitoIdentityService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteIdentityPoolAsync(DeleteIdentityPoolRequest deleteIdentityPoolRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param deleteIdentityPoolRequest Container for the necessary
     *           parameters to execute the DeleteIdentityPool operation on
     *           AmazonCognitoIdentityService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteIdentityPool service method, as returned by
     *         AmazonCognitoIdentityService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteIdentityPoolAsync(DeleteIdentityPoolRequest deleteIdentityPoolRequest,
            AsyncHandler<DeleteIdentityPoolRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param listIdentitiesRequest Container for the necessary parameters to
     *           execute the ListIdentities operation on AmazonCognitoIdentityService.
     * 
     * @return A Java Future object containing the response from the
     *         ListIdentities service method, as returned by
     *         AmazonCognitoIdentityService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListIdentitiesResult> listIdentitiesAsync(ListIdentitiesRequest listIdentitiesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param listIdentitiesRequest Container for the necessary parameters to
     *           execute the ListIdentities operation on AmazonCognitoIdentityService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListIdentities service method, as returned by
     *         AmazonCognitoIdentityService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListIdentitiesResult> listIdentitiesAsync(ListIdentitiesRequest listIdentitiesRequest,
            AsyncHandler<ListIdentitiesRequest, ListIdentitiesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param updateIdentityPoolRequest Container for the necessary
     *           parameters to execute the UpdateIdentityPool operation on
     *           AmazonCognitoIdentityService.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateIdentityPool service method, as returned by
     *         AmazonCognitoIdentityService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateIdentityPoolResult> updateIdentityPoolAsync(UpdateIdentityPoolRequest updateIdentityPoolRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param updateIdentityPoolRequest Container for the necessary
     *           parameters to execute the UpdateIdentityPool operation on
     *           AmazonCognitoIdentityService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateIdentityPool service method, as returned by
     *         AmazonCognitoIdentityService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateIdentityPoolResult> updateIdentityPoolAsync(UpdateIdentityPoolRequest updateIdentityPoolRequest,
            AsyncHandler<UpdateIdentityPoolRequest, UpdateIdentityPoolResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param createIdentityPoolRequest Container for the necessary
     *           parameters to execute the CreateIdentityPool operation on
     *           AmazonCognitoIdentityService.
     * 
     * @return A Java Future object containing the response from the
     *         CreateIdentityPool service method, as returned by
     *         AmazonCognitoIdentityService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateIdentityPoolResult> createIdentityPoolAsync(CreateIdentityPoolRequest createIdentityPoolRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param createIdentityPoolRequest Container for the necessary
     *           parameters to execute the CreateIdentityPool operation on
     *           AmazonCognitoIdentityService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateIdentityPool service method, as returned by
     *         AmazonCognitoIdentityService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoIdentityService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateIdentityPoolResult> createIdentityPoolAsync(CreateIdentityPoolRequest createIdentityPoolRequest,
            AsyncHandler<CreateIdentityPoolRequest, CreateIdentityPoolResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        