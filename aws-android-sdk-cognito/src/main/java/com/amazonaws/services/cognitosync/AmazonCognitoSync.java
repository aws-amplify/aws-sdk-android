/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.cognitosync.model.*;

/**
 * Interface for accessing Amazon Cognito Sync <fullname>Amazon Cognito
 * Sync</fullname>
 * <p>
 * Amazon Cognito Sync provides an AWS service and client library that enable
 * cross-device syncing of application-related user data. High-level client
 * libraries are available for both iOS and Android. You can use these libraries
 * to persist data locally so that it's available even if the device is offline.
 * Developer credentials don't need to be stored on the mobile device to access
 * the service. You can use Amazon Cognito to obtain a normalized user ID and
 * credentials. User data is persisted in a dataset that can store up to 1 MB of
 * key-value pairs, and you can have up to 20 datasets per user identity.
 * </p>
 * <p>
 * With Amazon Cognito Sync, the data stored for each identity is accessible
 * only to credentials assigned to that identity. In order to use the Cognito
 * Sync service, you need to make API calls using credentials retrieved with <a
 * href=
 * "http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/Welcome.html"
 * >Amazon Cognito Identity service</a>.
 * </p>
 * <p>
 * If you want to use Cognito Sync in an Android or iOS application, you will
 * probably want to make API calls via the AWS Mobile SDK. To learn more, see
 * the <a href=
 * "http://docs.aws.amazon.com/mobile/sdkforandroid/developerguide/cognito-sync.html"
 * >Developer Guide for Android</a> and the <a href=
 * "http://docs.aws.amazon.com/mobile/sdkforios/developerguide/cognito-sync.html"
 * >Developer Guide for iOS</a>.
 * </p>
 * @deprecated The Amazon Cognito Sync SDK for Android is deprecated as of release 2.9.0. Please use the AWS AppSync SDK for Android along with AWS AppSync service instead.
 */
@Deprecated
public interface AmazonCognitoSync {

    /**
     * Overrides the default endpoint for this client
     * ("https://cognito-sync.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "cognito-sync.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://cognito-sync.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex: "cognito-sync.us-east-1.amazonaws.com")
     *            or a full URL, including the protocol (ex:
     *            "https://cognito-sync.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonCognitoSync#setEndpoint(String)}, sets the
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
     * Deletes the specific dataset. The dataset will be deleted permanently,
     * and the action can't be undone. Datasets that this dataset was merged
     * with will no longer report the merge. Any subsequent operation on this
     * dataset will result in a ResourceNotFoundException.
     * </p>
     * <p>
     * This API can be called with temporary user credentials provided by
     * Cognito Identity or with developer credentials.
     * </p>
     * 
     * @param deleteDatasetRequest A request to delete the specific dataset.
     * @return deleteDatasetResult The response from the DeleteDataset service
     *         method, as returned by Amazon Cognito Sync.
     * @throws NotAuthorizedException Thrown when a user is not authorized to
     *             access the requested resource.
     * @throws InvalidParameterException Thrown when a request parameter does
     *             not comply with the associated constraints.
     * @throws ResourceNotFoundException Thrown if the resource doesn't exist.
     * @throws InternalErrorException Indicates an internal service error.
     * @throws TooManyRequestsException Thrown if the request is throttled.
     * @throws ResourceConflictException Thrown if an update can't be applied
     *             because the resource was changed by another call and this
     *             would result in a conflict.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Sync indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteDatasetResult deleteDataset(DeleteDatasetRequest deleteDatasetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets meta data about a dataset by identity and dataset name. With Amazon
     * Cognito Sync, each identity has access only to its own data. Thus, the
     * credentials used to make this API call need to have access to the
     * identity data.
     * </p>
     * <p>
     * This API can be called with temporary user credentials provided by
     * Cognito Identity or with developer credentials. You should use Cognito
     * Identity credentials to make this API call.
     * </p>
     * 
     * @param describeDatasetRequest A request for meta data about a dataset
     *            (creation date, number of records, size) by owner and dataset
     *            name.
     * @return describeDatasetResult The response from the DescribeDataset
     *         service method, as returned by Amazon Cognito Sync.
     * @throws NotAuthorizedException Thrown when a user is not authorized to
     *             access the requested resource.
     * @throws InvalidParameterException Thrown when a request parameter does
     *             not comply with the associated constraints.
     * @throws ResourceNotFoundException Thrown if the resource doesn't exist.
     * @throws InternalErrorException Indicates an internal service error.
     * @throws TooManyRequestsException Thrown if the request is throttled.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Sync indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeDatasetResult describeDataset(DescribeDatasetRequest describeDatasetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists datasets for an identity. With Amazon Cognito Sync, each identity
     * has access only to its own data. Thus, the credentials used to make this
     * API call need to have access to the identity data.
     * </p>
     * <p>
     * ListDatasets can be called with temporary user credentials provided by
     * Cognito Identity or with developer credentials. You should use the
     * Cognito Identity credentials to make this API call.
     * </p>
     * 
     * @param listDatasetsRequest Request for a list of datasets for an
     *            identity.
     * @return listDatasetsResult The response from the ListDatasets service
     *         method, as returned by Amazon Cognito Sync.
     * @throws NotAuthorizedException Thrown when a user is not authorized to
     *             access the requested resource.
     * @throws InvalidParameterException Thrown when a request parameter does
     *             not comply with the associated constraints.
     * @throws InternalErrorException Indicates an internal service error.
     * @throws TooManyRequestsException Thrown if the request is throttled.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Sync indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDatasetsResult listDatasets(ListDatasetsRequest listDatasetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets paginated records, optionally changed after a particular sync count
     * for a dataset and identity. With Amazon Cognito Sync, each identity has
     * access only to its own data. Thus, the credentials used to make this API
     * call need to have access to the identity data.
     * </p>
     * <p>
     * ListRecords can be called with temporary user credentials provided by
     * Cognito Identity or with developer credentials. You should use Cognito
     * Identity credentials to make this API call.
     * </p>
     * 
     * @param listRecordsRequest A request for a list of records.
     * @return listRecordsResult The response from the ListRecords service
     *         method, as returned by Amazon Cognito Sync.
     * @throws InvalidParameterException Thrown when a request parameter does
     *             not comply with the associated constraints.
     * @throws NotAuthorizedException Thrown when a user is not authorized to
     *             access the requested resource.
     * @throws TooManyRequestsException Thrown if the request is throttled.
     * @throws InternalErrorException Indicates an internal service error.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Sync indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListRecordsResult listRecords(ListRecordsRequest listRecordsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Registers a device to receive push sync notifications.
     * </p>
     * <p>
     * This API can only be called with temporary credentials provided by
     * Cognito Identity. You cannot call this API with developer credentials.
     * </p>
     * 
     * @param registerDeviceRequest <p>
     *            A request to RegisterDevice.
     *            </p>
     * @return registerDeviceResult The response from the RegisterDevice service
     *         method, as returned by Amazon Cognito Sync.
     * @throws NotAuthorizedException Thrown when a user is not authorized to
     *             access the requested resource.
     * @throws InvalidParameterException Thrown when a request parameter does
     *             not comply with the associated constraints.
     * @throws ResourceNotFoundException Thrown if the resource doesn't exist.
     * @throws InternalErrorException Indicates an internal service error.
     * @throws InvalidConfigurationException
     * @throws TooManyRequestsException Thrown if the request is throttled.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Sync indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    RegisterDeviceResult registerDevice(RegisterDeviceRequest registerDeviceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Subscribes to receive notifications when a dataset is modified by another
     * device.
     * </p>
     * <p>
     * This API can only be called with temporary credentials provided by
     * Cognito Identity. You cannot call this API with developer credentials.
     * </p>
     * 
     * @param subscribeToDatasetRequest <p>
     *            A request to SubscribeToDatasetRequest.
     *            </p>
     * @return subscribeToDatasetResult The response from the SubscribeToDataset
     *         service method, as returned by Amazon Cognito Sync.
     * @throws NotAuthorizedException Thrown when a user is not authorized to
     *             access the requested resource.
     * @throws InvalidParameterException Thrown when a request parameter does
     *             not comply with the associated constraints.
     * @throws ResourceNotFoundException Thrown if the resource doesn't exist.
     * @throws InternalErrorException Indicates an internal service error.
     * @throws InvalidConfigurationException
     * @throws TooManyRequestsException Thrown if the request is throttled.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Sync indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    SubscribeToDatasetResult subscribeToDataset(SubscribeToDatasetRequest subscribeToDatasetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Unsubscribes from receiving notifications when a dataset is modified by
     * another device.
     * </p>
     * <p>
     * This API can only be called with temporary credentials provided by
     * Cognito Identity. You cannot call this API with developer credentials.
     * </p>
     * 
     * @param unsubscribeFromDatasetRequest <p>
     *            A request to UnsubscribeFromDataset.
     *            </p>
     * @return unsubscribeFromDatasetResult The response from the
     *         UnsubscribeFromDataset service method, as returned by Amazon
     *         Cognito Sync.
     * @throws NotAuthorizedException Thrown when a user is not authorized to
     *             access the requested resource.
     * @throws InvalidParameterException Thrown when a request parameter does
     *             not comply with the associated constraints.
     * @throws ResourceNotFoundException Thrown if the resource doesn't exist.
     * @throws InternalErrorException Indicates an internal service error.
     * @throws InvalidConfigurationException
     * @throws TooManyRequestsException Thrown if the request is throttled.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Sync indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UnsubscribeFromDatasetResult unsubscribeFromDataset(
            UnsubscribeFromDatasetRequest unsubscribeFromDatasetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Posts updates to records and adds and deletes records for a dataset and
     * user.
     * </p>
     * <p>
     * The sync count in the record patch is your last known sync count for that
     * record. The server will reject an UpdateRecords request with a
     * ResourceConflictException if you try to patch a record with a new value
     * but a stale sync count.
     * </p>
     * <p>
     * For example, if the sync count on the server is 5 for a key called
     * highScore and you try and submit a new highScore with sync count of 4,
     * the request will be rejected. To obtain the current sync count for a
     * record, call ListRecords. On a successful update of the record, the
     * response returns the new sync count for that record. You should present
     * that sync count the next time you try to update that same record. When
     * the record does not exist, specify the sync count as 0.
     * </p>
     * <p>
     * This API can be called with temporary user credentials provided by
     * Cognito Identity or with developer credentials.
     * </p>
     * 
     * @param updateRecordsRequest A request to post updates to records or add
     *            and delete records for a dataset and user.
     * @return updateRecordsResult The response from the UpdateRecords service
     *         method, as returned by Amazon Cognito Sync.
     * @throws InvalidParameterException Thrown when a request parameter does
     *             not comply with the associated constraints.
     * @throws LimitExceededException Thrown when the limit on the number of
     *             objects or operations has been exceeded.
     * @throws NotAuthorizedException Thrown when a user is not authorized to
     *             access the requested resource.
     * @throws ResourceNotFoundException Thrown if the resource doesn't exist.
     * @throws ResourceConflictException Thrown if an update can't be applied
     *             because the resource was changed by another call and this
     *             would result in a conflict.
     * @throws InvalidLambdaFunctionOutputException <p>
     *             The AWS Lambda function returned invalid output or an
     *             exception.
     *             </p>
     * @throws LambdaThrottledException <p>
     *             AWS Lambda throttled your account, please contact AWS Support
     *             </p>
     * @throws TooManyRequestsException Thrown if the request is throttled.
     * @throws InternalErrorException Indicates an internal service error.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Cognito Sync indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateRecordsResult updateRecords(UpdateRecordsRequest updateRecordsRequest)
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
