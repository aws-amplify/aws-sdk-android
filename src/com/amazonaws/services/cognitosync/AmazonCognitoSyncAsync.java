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
package com.amazonaws.services.cognitosync;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.cognitosync.model.*;

/**
 * Interface for accessing AmazonCognitoSync asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * 
 */
public interface AmazonCognitoSyncAsync extends AmazonCognitoSync {
    /**
     *
     * @param updateRecordsRequest Container for the necessary parameters to
     *           execute the UpdateRecords operation on AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateRecords service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateRecordsResult> updateRecordsAsync(UpdateRecordsRequest updateRecordsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param updateRecordsRequest Container for the necessary parameters to
     *           execute the UpdateRecords operation on AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateRecords service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateRecordsResult> updateRecordsAsync(UpdateRecordsRequest updateRecordsRequest,
            AsyncHandler<UpdateRecordsRequest, UpdateRecordsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param describeIdentityPoolUsageRequest Container for the necessary
     *           parameters to execute the DescribeIdentityPoolUsage operation on
     *           AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeIdentityPoolUsage service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeIdentityPoolUsageResult> describeIdentityPoolUsageAsync(DescribeIdentityPoolUsageRequest describeIdentityPoolUsageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param describeIdentityPoolUsageRequest Container for the necessary
     *           parameters to execute the DescribeIdentityPoolUsage operation on
     *           AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeIdentityPoolUsage service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeIdentityPoolUsageResult> describeIdentityPoolUsageAsync(DescribeIdentityPoolUsageRequest describeIdentityPoolUsageRequest,
            AsyncHandler<DescribeIdentityPoolUsageRequest, DescribeIdentityPoolUsageResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param listDatasetsRequest Container for the necessary parameters to
     *           execute the ListDatasets operation on AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         ListDatasets service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest listDatasetsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param listDatasetsRequest Container for the necessary parameters to
     *           execute the ListDatasets operation on AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListDatasets service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest listDatasetsRequest,
            AsyncHandler<ListDatasetsRequest, ListDatasetsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param listIdentityPoolUsageRequest Container for the necessary
     *           parameters to execute the ListIdentityPoolUsage operation on
     *           AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         ListIdentityPoolUsage service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListIdentityPoolUsageResult> listIdentityPoolUsageAsync(ListIdentityPoolUsageRequest listIdentityPoolUsageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param listIdentityPoolUsageRequest Container for the necessary
     *           parameters to execute the ListIdentityPoolUsage operation on
     *           AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListIdentityPoolUsage service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListIdentityPoolUsageResult> listIdentityPoolUsageAsync(ListIdentityPoolUsageRequest listIdentityPoolUsageRequest,
            AsyncHandler<ListIdentityPoolUsageRequest, ListIdentityPoolUsageResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param listRecordsRequest Container for the necessary parameters to
     *           execute the ListRecords operation on AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         ListRecords service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListRecordsResult> listRecordsAsync(ListRecordsRequest listRecordsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param listRecordsRequest Container for the necessary parameters to
     *           execute the ListRecords operation on AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListRecords service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListRecordsResult> listRecordsAsync(ListRecordsRequest listRecordsRequest,
            AsyncHandler<ListRecordsRequest, ListRecordsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param describeDatasetRequest Container for the necessary parameters
     *           to execute the DescribeDataset operation on AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDataset service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest describeDatasetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param describeDatasetRequest Container for the necessary parameters
     *           to execute the DescribeDataset operation on AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDataset service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest describeDatasetRequest,
            AsyncHandler<DescribeDatasetRequest, DescribeDatasetResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param deleteDatasetRequest Container for the necessary parameters to
     *           execute the DeleteDataset operation on AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDataset service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param deleteDatasetRequest Container for the necessary parameters to
     *           execute the DeleteDataset operation on AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDataset service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest,
            AsyncHandler<DeleteDatasetRequest, DeleteDatasetResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param describeIdentityUsageRequest Container for the necessary
     *           parameters to execute the DescribeIdentityUsage operation on
     *           AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeIdentityUsage service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeIdentityUsageResult> describeIdentityUsageAsync(DescribeIdentityUsageRequest describeIdentityUsageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param describeIdentityUsageRequest Container for the necessary
     *           parameters to execute the DescribeIdentityUsage operation on
     *           AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeIdentityUsage service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeIdentityUsageResult> describeIdentityUsageAsync(DescribeIdentityUsageRequest describeIdentityUsageRequest,
            AsyncHandler<DescribeIdentityUsageRequest, DescribeIdentityUsageResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        