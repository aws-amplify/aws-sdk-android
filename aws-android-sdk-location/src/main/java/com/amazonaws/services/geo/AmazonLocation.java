/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.geo.model.*;

/**
 * Interface for accessing AWS Location service
 * <p>
 * Suite of geospatial services including Maps, Places, Routes, Tracking, and
 * Geofencing
 * </p>
 **/
public interface AmazonLocation {

    /**
     * Overrides the default endpoint for this client
     * ("https://geo.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "geo.us-east-1.amazonaws.com")
     * or a full URL, including the protocol (ex:
     * "https://geo.us-east-1.amazonaws.com"). If the protocol is not specified
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
     * @param endpoint The endpoint (ex: "geo.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://geo.us-east-1.amazonaws.com") of the region specific
     *            AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonLocation#setEndpoint(String)}, sets the
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
     * Creates an association between a geofence collection and a tracker
     * resource. This allows the tracker resource to communicate location data
     * to the linked geofence collection.
     * </p>
     * <p>
     * You can associate up to five geofence collections to each tracker
     * resource.
     * </p>
     * <note>
     * <p>
     * Currently not supported — Cross-account configurations, such as creating
     * associations between a tracker resource in one account and a geofence
     * collection in another account.
     * </p>
     * </note>
     * 
     * @param associateTrackerConsumerRequest
     * @return associateTrackerConsumerResult The response from the
     *         AssociateTrackerConsumer service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    AssociateTrackerConsumerResult associateTrackerConsumer(
            AssociateTrackerConsumerRequest associateTrackerConsumerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the position history of one or more devices from a tracker
     * resource.
     * </p>
     * 
     * @param batchDeleteDevicePositionHistoryRequest
     * @return batchDeleteDevicePositionHistoryResult The response from the
     *         BatchDeleteDevicePositionHistory service method, as returned by
     *         AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    BatchDeleteDevicePositionHistoryResult batchDeleteDevicePositionHistory(
            BatchDeleteDevicePositionHistoryRequest batchDeleteDevicePositionHistoryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a batch of geofences from a geofence collection.
     * </p>
     * <note>
     * <p>
     * This operation deletes the resource permanently.
     * </p>
     * </note>
     * 
     * @param batchDeleteGeofenceRequest
     * @return batchDeleteGeofenceResult The response from the
     *         BatchDeleteGeofence service method, as returned by AWS Location
     *         service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    BatchDeleteGeofenceResult batchDeleteGeofence(
            BatchDeleteGeofenceRequest batchDeleteGeofenceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Evaluates device positions against the geofence geometries from a given
     * geofence collection.
     * </p>
     * <p>
     * This operation always returns an empty response because geofences are
     * asynchronously evaluated. The evaluation determines if the device has
     * entered or exited a geofenced area, and then publishes one of the
     * following events to Amazon EventBridge:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENTER</code> if Amazon Location determines that the tracked device
     * has entered a geofenced area.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXIT</code> if Amazon Location determines that the tracked device
     * has exited a geofenced area.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The last geofence that a device was observed within is tracked for 30
     * days after the most recent device position update.
     * </p>
     * </note>
     * 
     * @param batchEvaluateGeofencesRequest
     * @return batchEvaluateGeofencesResult The response from the
     *         BatchEvaluateGeofences service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    BatchEvaluateGeofencesResult batchEvaluateGeofences(
            BatchEvaluateGeofencesRequest batchEvaluateGeofencesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the latest device positions for requested devices.
     * </p>
     * 
     * @param batchGetDevicePositionRequest
     * @return batchGetDevicePositionResult The response from the
     *         BatchGetDevicePosition service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    BatchGetDevicePositionResult batchGetDevicePosition(
            BatchGetDevicePositionRequest batchGetDevicePositionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * A batch request for storing geofence geometries into a given geofence
     * collection, or updates the geometry of an existing geofence if a geofence
     * ID is included in the request.
     * </p>
     * 
     * @param batchPutGeofenceRequest
     * @return batchPutGeofenceResult The response from the BatchPutGeofence
     *         service method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    BatchPutGeofenceResult batchPutGeofence(BatchPutGeofenceRequest batchPutGeofenceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Uploads position update data for one or more devices to a tracker
     * resource. Amazon Location uses the data when it reports the last known
     * device position and position history. Amazon Location retains location
     * data for 30 days.
     * </p>
     * <note>
     * <p>
     * Position updates are handled based on the <code>PositionFiltering</code>
     * property of the tracker. When <code>PositionFiltering</code> is set to
     * <code>TimeBased</code>, updates are evaluated against linked geofence
     * collections, and location data is stored at a maximum of one position per
     * 30 second interval. If your update frequency is more often than every 30
     * seconds, only one update per 30 seconds is stored for each unique device
     * ID. When <code>PositionFiltering</code> is set to
     * <code>DistanceBased</code> filtering, location data is stored and
     * evaluated against linked geofence collections only if the device has
     * moved more than 30 m (98.4 ft).
     * </p>
     * </note>
     * 
     * @param batchUpdateDevicePositionRequest
     * @return batchUpdateDevicePositionResult The response from the
     *         BatchUpdateDevicePosition service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    BatchUpdateDevicePositionResult batchUpdateDevicePosition(
            BatchUpdateDevicePositionRequest batchUpdateDevicePositionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html"
     * >Calculates a route</a> given the following required parameters:
     * <code>DeparturePostiton</code> and <code>DestinationPosition</code>.
     * Requires that you first <a href=
     * "https://docs.aws.amazon.com/location-routes/latest/APIReference/API_CreateRouteCalculator.html"
     * >create a route calculator resource</a>
     * </p>
     * <p>
     * By default, a request that doesn't specify a departure time uses the best
     * time of day to travel with the best traffic conditions when calculating
     * the route.
     * </p>
     * <p>
     * Additional options include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#departure-time"
     * >Specifying a departure time</a> using either <code>DepartureTime</code>
     * or <code>DepartureNow</code>. This calculates a route based on predictive
     * traffic data at the given time.
     * </p>
     * <note>
     * <p>
     * You can't specify both <code>DepartureTime</code> and
     * <code>DepartureNow</code> in a single request. Specifying both parameters
     * returns an error message.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#travel-mode"
     * >Specifying a travel mode</a> using TravelMode. This lets you specify an
     * additional route preference such as <code>CarModeOptions</code> if
     * traveling by <code>Car</code>, or <code>TruckModeOptions</code> if
     * traveling by <code>Truck</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * </p>
     * 
     * @param calculateRouteRequest
     * @return calculateRouteResult The response from the CalculateRoute service
     *         method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CalculateRouteResult calculateRoute(CalculateRouteRequest calculateRouteRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a geofence collection, which manages and stores geofences.
     * </p>
     * 
     * @param createGeofenceCollectionRequest
     * @return createGeofenceCollectionResult The response from the
     *         CreateGeofenceCollection service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws ConflictException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateGeofenceCollectionResult createGeofenceCollection(
            CreateGeofenceCollectionRequest createGeofenceCollectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a map resource in your AWS account, which provides map tiles of
     * different styles sourced from global location data providers.
     * </p>
     * 
     * @param createMapRequest
     * @return createMapResult The response from the CreateMap service method,
     *         as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ConflictException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateMapResult createMap(CreateMapRequest createMapRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a place index resource in your AWS account, which supports
     * functions with geospatial data sourced from your chosen data provider.
     * </p>
     * 
     * @param createPlaceIndexRequest
     * @return createPlaceIndexResult The response from the CreatePlaceIndex
     *         service method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ConflictException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreatePlaceIndexResult createPlaceIndex(CreatePlaceIndexRequest createPlaceIndexRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a route calculator resource in your AWS account.
     * </p>
     * <p>
     * You can send requests to a route calculator resource to estimate travel
     * time, distance, and get directions. A route calculator sources traffic
     * and road network data from your chosen data provider.
     * </p>
     * 
     * @param createRouteCalculatorRequest
     * @return createRouteCalculatorResult The response from the
     *         CreateRouteCalculator service method, as returned by AWS Location
     *         service.
     * @throws InternalServerException
     * @throws ConflictException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateRouteCalculatorResult createRouteCalculator(
            CreateRouteCalculatorRequest createRouteCalculatorRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a tracker resource in your AWS account, which lets you retrieve
     * current and historical location of devices.
     * </p>
     * 
     * @param createTrackerRequest
     * @return createTrackerResult The response from the CreateTracker service
     *         method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ConflictException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateTrackerResult createTracker(CreateTrackerRequest createTrackerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a geofence collection from your AWS account.
     * </p>
     * <note>
     * <p>
     * This operation deletes the resource permanently. If the geofence
     * collection is the target of a tracker resource, the devices will no
     * longer be monitored.
     * </p>
     * </note>
     * 
     * @param deleteGeofenceCollectionRequest
     * @return deleteGeofenceCollectionResult The response from the
     *         DeleteGeofenceCollection service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteGeofenceCollectionResult deleteGeofenceCollection(
            DeleteGeofenceCollectionRequest deleteGeofenceCollectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a map resource from your AWS account.
     * </p>
     * <note>
     * <p>
     * This operation deletes the resource permanently. If the map is being used
     * in an application, the map may not render.
     * </p>
     * </note>
     * 
     * @param deleteMapRequest
     * @return deleteMapResult The response from the DeleteMap service method,
     *         as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteMapResult deleteMap(DeleteMapRequest deleteMapRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a place index resource from your AWS account.
     * </p>
     * <note>
     * <p>
     * This operation deletes the resource permanently.
     * </p>
     * </note>
     * 
     * @param deletePlaceIndexRequest
     * @return deletePlaceIndexResult The response from the DeletePlaceIndex
     *         service method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeletePlaceIndexResult deletePlaceIndex(DeletePlaceIndexRequest deletePlaceIndexRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a route calculator resource from your AWS account.
     * </p>
     * <note>
     * <p>
     * This operation deletes the resource permanently.
     * </p>
     * </note>
     * 
     * @param deleteRouteCalculatorRequest
     * @return deleteRouteCalculatorResult The response from the
     *         DeleteRouteCalculator service method, as returned by AWS Location
     *         service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteRouteCalculatorResult deleteRouteCalculator(
            DeleteRouteCalculatorRequest deleteRouteCalculatorRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a tracker resource from your AWS account.
     * </p>
     * <note>
     * <p>
     * This operation deletes the resource permanently. If the tracker resource
     * is in use, you may encounter an error. Make sure that the target resource
     * isn't a dependency for your applications.
     * </p>
     * </note>
     * 
     * @param deleteTrackerRequest
     * @return deleteTrackerResult The response from the DeleteTracker service
     *         method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteTrackerResult deleteTracker(DeleteTrackerRequest deleteTrackerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the geofence collection details.
     * </p>
     * 
     * @param describeGeofenceCollectionRequest
     * @return describeGeofenceCollectionResult The response from the
     *         DescribeGeofenceCollection service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeGeofenceCollectionResult describeGeofenceCollection(
            DescribeGeofenceCollectionRequest describeGeofenceCollectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the map resource details.
     * </p>
     * 
     * @param describeMapRequest
     * @return describeMapResult The response from the DescribeMap service
     *         method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeMapResult describeMap(DescribeMapRequest describeMapRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the place index resource details.
     * </p>
     * 
     * @param describePlaceIndexRequest
     * @return describePlaceIndexResult The response from the DescribePlaceIndex
     *         service method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribePlaceIndexResult describePlaceIndex(DescribePlaceIndexRequest describePlaceIndexRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the route calculator resource details.
     * </p>
     * 
     * @param describeRouteCalculatorRequest
     * @return describeRouteCalculatorResult The response from the
     *         DescribeRouteCalculator service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeRouteCalculatorResult describeRouteCalculator(
            DescribeRouteCalculatorRequest describeRouteCalculatorRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the tracker resource details.
     * </p>
     * 
     * @param describeTrackerRequest
     * @return describeTrackerResult The response from the DescribeTracker
     *         service method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeTrackerResult describeTracker(DescribeTrackerRequest describeTrackerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes the association between a tracker resource and a geofence
     * collection.
     * </p>
     * <note>
     * <p>
     * Once you unlink a tracker resource from a geofence collection, the
     * tracker positions will no longer be automatically evaluated against
     * geofences.
     * </p>
     * </note>
     * 
     * @param disassociateTrackerConsumerRequest
     * @return disassociateTrackerConsumerResult The response from the
     *         DisassociateTrackerConsumer service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DisassociateTrackerConsumerResult disassociateTrackerConsumer(
            DisassociateTrackerConsumerRequest disassociateTrackerConsumerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a device's most recent position according to its sample time.
     * </p>
     * <note>
     * <p>
     * Device positions are deleted after 30 days.
     * </p>
     * </note>
     * 
     * @param getDevicePositionRequest
     * @return getDevicePositionResult The response from the GetDevicePosition
     *         service method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetDevicePositionResult getDevicePosition(GetDevicePositionRequest getDevicePositionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the device position history from a tracker resource within a
     * specified range of time.
     * </p>
     * <note>
     * <p>
     * Device positions are deleted after 30 days.
     * </p>
     * </note>
     * 
     * @param getDevicePositionHistoryRequest
     * @return getDevicePositionHistoryResult The response from the
     *         GetDevicePositionHistory service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetDevicePositionHistoryResult getDevicePositionHistory(
            GetDevicePositionHistoryRequest getDevicePositionHistoryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the geofence details from a geofence collection.
     * </p>
     * 
     * @param getGeofenceRequest
     * @return getGeofenceResult The response from the GetGeofence service
     *         method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetGeofenceResult getGeofence(GetGeofenceRequest getGeofenceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves glyphs used to display labels on a map.
     * </p>
     * 
     * @param getMapGlyphsRequest
     * @return getMapGlyphsResult The response from the GetMapGlyphs service
     *         method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetMapGlyphsResult getMapGlyphs(GetMapGlyphsRequest getMapGlyphsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the sprite sheet corresponding to a map resource. The sprite
     * sheet is a PNG image paired with a JSON document describing the offsets
     * of individual icons that will be displayed on a rendered map.
     * </p>
     * 
     * @param getMapSpritesRequest
     * @return getMapSpritesResult The response from the GetMapSprites service
     *         method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetMapSpritesResult getMapSprites(GetMapSpritesRequest getMapSpritesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the map style descriptor from a map resource.
     * </p>
     * <p>
     * The style descriptor contains speciﬁcations on how features render on a
     * map. For example, what data to display, what order to display the data
     * in, and the style for the data. Style descriptors follow the Mapbox Style
     * Specification.
     * </p>
     * 
     * @param getMapStyleDescriptorRequest
     * @return getMapStyleDescriptorResult The response from the
     *         GetMapStyleDescriptor service method, as returned by AWS Location
     *         service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetMapStyleDescriptorResult getMapStyleDescriptor(
            GetMapStyleDescriptorRequest getMapStyleDescriptorRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a vector data tile from the map resource. Map tiles are used by
     * clients to render a map. they're addressed using a grid arrangement with
     * an X coordinate, Y coordinate, and Z (zoom) level.
     * </p>
     * <p>
     * The origin (0, 0) is the top left of the map. Increasing the zoom level
     * by 1 doubles both the X and Y dimensions, so a tile containing data for
     * the entire world at (0/0/0) will be split into 4 tiles at zoom 1 (1/0/0,
     * 1/0/1, 1/1/0, 1/1/1).
     * </p>
     * 
     * @param getMapTileRequest
     * @return getMapTileResult The response from the GetMapTile service method,
     *         as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetMapTileResult getMapTile(GetMapTileRequest getMapTileRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * A batch request to retrieve all device positions.
     * </p>
     * 
     * @param listDevicePositionsRequest
     * @return listDevicePositionsResult The response from the
     *         ListDevicePositions service method, as returned by AWS Location
     *         service.
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListDevicePositionsResult listDevicePositions(
            ListDevicePositionsRequest listDevicePositionsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists geofence collections in your AWS account.
     * </p>
     * 
     * @param listGeofenceCollectionsRequest
     * @return listGeofenceCollectionsResult The response from the
     *         ListGeofenceCollections service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListGeofenceCollectionsResult listGeofenceCollections(
            ListGeofenceCollectionsRequest listGeofenceCollectionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists geofences stored in a given geofence collection.
     * </p>
     * 
     * @param listGeofencesRequest
     * @return listGeofencesResult The response from the ListGeofences service
     *         method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListGeofencesResult listGeofences(ListGeofencesRequest listGeofencesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists map resources in your AWS account.
     * </p>
     * 
     * @param listMapsRequest
     * @return listMapsResult The response from the ListMaps service method, as
     *         returned by AWS Location service.
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListMapsResult listMaps(ListMapsRequest listMapsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists place index resources in your AWS account.
     * </p>
     * 
     * @param listPlaceIndexesRequest
     * @return listPlaceIndexesResult The response from the ListPlaceIndexes
     *         service method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListPlaceIndexesResult listPlaceIndexes(ListPlaceIndexesRequest listPlaceIndexesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists route calculator resources in your AWS account.
     * </p>
     * 
     * @param listRouteCalculatorsRequest
     * @return listRouteCalculatorsResult The response from the
     *         ListRouteCalculators service method, as returned by AWS Location
     *         service.
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListRouteCalculatorsResult listRouteCalculators(
            ListRouteCalculatorsRequest listRouteCalculatorsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of tags that are applied to the specified Amazon Location
     * resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS Location
     *         service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists geofence collections currently associated to the given tracker
     * resource.
     * </p>
     * 
     * @param listTrackerConsumersRequest
     * @return listTrackerConsumersResult The response from the
     *         ListTrackerConsumers service method, as returned by AWS Location
     *         service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListTrackerConsumersResult listTrackerConsumers(
            ListTrackerConsumersRequest listTrackerConsumersRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists tracker resources in your AWS account.
     * </p>
     * 
     * @param listTrackersRequest
     * @return listTrackersResult The response from the ListTrackers service
     *         method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListTrackersResult listTrackers(ListTrackersRequest listTrackersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stores a geofence geometry in a given geofence collection, or updates the
     * geometry of an existing geofence if a geofence ID is included in the
     * request.
     * </p>
     * 
     * @param putGeofenceRequest
     * @return putGeofenceResult The response from the PutGeofence service
     *         method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    PutGeofenceResult putGeofence(PutGeofenceRequest putGeofenceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Reverse geocodes a given coordinate and returns a legible address. Allows
     * you to search for Places or points of interest near a given position.
     * </p>
     * 
     * @param searchPlaceIndexForPositionRequest
     * @return searchPlaceIndexForPositionResult The response from the
     *         SearchPlaceIndexForPosition service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    SearchPlaceIndexForPositionResult searchPlaceIndexForPosition(
            SearchPlaceIndexForPositionRequest searchPlaceIndexForPositionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Geocodes free-form text, such as an address, name, city, or region to
     * allow you to search for Places or points of interest.
     * </p>
     * <p>
     * Includes the option to apply additional parameters to narrow your list of
     * results.
     * </p>
     * <note>
     * <p>
     * You can search for places near a given position using
     * <code>BiasPosition</code>, or filter results within a bounding box using
     * <code>FilterBBox</code>. Providing both parameters simultaneously returns
     * an error.
     * </p>
     * </note>
     * 
     * @param searchPlaceIndexForTextRequest
     * @return searchPlaceIndexForTextResult The response from the
     *         SearchPlaceIndexForText service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    SearchPlaceIndexForTextResult searchPlaceIndexForText(
            SearchPlaceIndexForTextRequest searchPlaceIndexForTextRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified Amazon
     * Location Service resource.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only resources with certain tag values.&lt;/p&gt; &lt;p&gt;You can use the &lt;code&gt;TagResource&lt;/code&gt; operation with an Amazon Location Service resource that already has tags. If you specify a new tag key for the resource, this tag is appended to the tags already associated with the resource. If you specify a tag key that's already associated with the resource, the new tag value that you specify replaces the previous value for that tag. &lt;/p&gt; &lt;p&gt;You can associate up to 50 tags with a resource.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes one or more tags from the specified Amazon Location resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the specified properties of a given geofence collection.
     * </p>
     * 
     * @param updateGeofenceCollectionRequest
     * @return updateGeofenceCollectionResult The response from the
     *         UpdateGeofenceCollection service method, as returned by AWS
     *         Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateGeofenceCollectionResult updateGeofenceCollection(
            UpdateGeofenceCollectionRequest updateGeofenceCollectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the specified properties of a given map resource.
     * </p>
     * 
     * @param updateMapRequest
     * @return updateMapResult The response from the UpdateMap service method,
     *         as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateMapResult updateMap(UpdateMapRequest updateMapRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates the specified properties of a given place index resource.
     * </p>
     * 
     * @param updatePlaceIndexRequest
     * @return updatePlaceIndexResult The response from the UpdatePlaceIndex
     *         service method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdatePlaceIndexResult updatePlaceIndex(UpdatePlaceIndexRequest updatePlaceIndexRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the specified properties for a given route calculator resource.
     * </p>
     * 
     * @param updateRouteCalculatorRequest
     * @return updateRouteCalculatorResult The response from the
     *         UpdateRouteCalculator service method, as returned by AWS Location
     *         service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateRouteCalculatorResult updateRouteCalculator(
            UpdateRouteCalculatorRequest updateRouteCalculatorRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the specified properties of a given tracker resource.
     * </p>
     * 
     * @param updateTrackerRequest
     * @return updateTrackerResult The response from the UpdateTracker service
     *         method, as returned by AWS Location service.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Location service indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateTrackerResult updateTracker(UpdateTrackerRequest updateTrackerRequest)
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
