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

package com.amazonaws.services.awsiotsitewise;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.awsiotsitewise.model.*;

/**
 * Interface for accessing AWS IoT SiteWise
 * <p>
 * Welcome to the AWS IoT SiteWise API Reference. AWS IoT SiteWise is an AWS
 * service that connects <a href=
 * "https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications"
 * >Industrial Internet of Things (IIoT)</a> devices to the power of the AWS
 * Cloud. For more information, see the <a
 * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/">AWS IoT
 * SiteWise User Guide</a>. For information about AWS IoT SiteWise quotas, see
 * <a href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
 * >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
 * </p>
 **/
public interface AWSIoTSiteWise {

    /**
     * Overrides the default endpoint for this client
     * ("https://iotsitewise.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "iotsitewise.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://iotsitewise.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex: "iotsitewise.us-east-1.amazonaws.com")
     *            or a full URL, including the protocol (ex:
     *            "https://iotsitewise.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSIoTSiteWise#setEndpoint(String)}, sets the
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
     * Associates a child asset with the given parent asset through a hierarchy
     * defined in the parent asset's model. For more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/add-associated-assets.html"
     * >Associating Assets</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param associateAssetsRequest
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws ConflictingOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void associateAssets(AssociateAssetsRequest associateAssetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates a group (batch) of assets with an AWS IoT SiteWise Monitor
     * project.
     * </p>
     * 
     * @param batchAssociateProjectAssetsRequest
     * @return batchAssociateProjectAssetsResult The response from the
     *         BatchAssociateProjectAssets service method, as returned by AWS
     *         IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchAssociateProjectAssetsResult batchAssociateProjectAssets(
            BatchAssociateProjectAssetsRequest batchAssociateProjectAssetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates a group (batch) of assets from an AWS IoT SiteWise Monitor
     * project.
     * </p>
     * 
     * @param batchDisassociateProjectAssetsRequest
     * @return batchDisassociateProjectAssetsResult The response from the
     *         BatchDisassociateProjectAssets service method, as returned by AWS
     *         IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchDisassociateProjectAssetsResult batchDisassociateProjectAssets(
            BatchDisassociateProjectAssetsRequest batchDisassociateProjectAssetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sends a list of asset property values to AWS IoT SiteWise. Each value is
     * a timestamp-quality-value (TQV) data point. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/ingest-api.html"
     * >Ingesting Data Using the API</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * <p>
     * To identify an asset property, you must specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>assetId</code> and <code>propertyId</code> of an asset
     * property.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>propertyAlias</code>, which is a data stream alias (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). To define an
     * asset property's alias, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * With respect to Unix epoch time, AWS IoT SiteWise accepts only TQVs that
     * have a timestamp of no more than 15 minutes in the past and no more than
     * 5 minutes in the future. AWS IoT SiteWise rejects timestamps outside of
     * the inclusive range of [-15, +5] minutes and returns a
     * <code>TimestampOutOfRangeException</code> error.
     * </p>
     * <p>
     * For each asset property, AWS IoT SiteWise overwrites TQVs with duplicate
     * timestamps unless the newer TQV has a different quality. For example, if
     * you store a TQV <code>{T1, GOOD, V1}</code>, then storing
     * <code>{T1, GOOD, V2}</code> replaces the existing TQV.
     * </p>
     * </important>
     * 
     * @param batchPutAssetPropertyValueRequest
     * @return batchPutAssetPropertyValueResult The response from the
     *         BatchPutAssetPropertyValue service method, as returned by AWS IoT
     *         SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws ServiceUnavailableException
     * @throws ConflictingOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchPutAssetPropertyValueResult batchPutAssetPropertyValue(
            BatchPutAssetPropertyValueRequest batchPutAssetPropertyValueRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an access policy that grants the specified AWS Single Sign-On
     * user or group access to the specified AWS IoT SiteWise Monitor portal or
     * project resource.
     * </p>
     * 
     * @param createAccessPolicyRequest
     * @return createAccessPolicyResult The response from the CreateAccessPolicy
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateAccessPolicyResult createAccessPolicy(CreateAccessPolicyRequest createAccessPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an asset from an existing asset model. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-assets.html"
     * >Creating Assets</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param createAssetRequest
     * @return createAssetResult The response from the CreateAsset service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws ConflictingOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateAssetResult createAsset(CreateAssetRequest createAssetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an asset model from specified property and hierarchy definitions.
     * You create assets from asset models. With asset models, you can easily
     * create assets of the same type that have standardized definitions. Each
     * asset created from a model inherits the asset model's property and
     * hierarchy definitions. For more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/define-models.html"
     * >Defining Asset Models</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param createAssetModelRequest
     * @return createAssetModelResult The response from the CreateAssetModel
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws ConflictingOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateAssetModelResult createAssetModel(CreateAssetModelRequest createAssetModelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a dashboard in an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param createDashboardRequest
     * @return createDashboardResult The response from the CreateDashboard
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDashboardResult createDashboard(CreateDashboardRequest createDashboardRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a gateway, which is a virtual or edge device that delivers
     * industrial data streams from local servers to AWS IoT SiteWise. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/gateway-connector.html"
     * >Ingesting data using a gateway</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * 
     * @param createGatewayRequest
     * @return createGatewayResult The response from the CreateGateway service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateGatewayResult createGateway(CreateGatewayRequest createGatewayRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a portal, which can contain projects and dashboards. Before you
     * can create a portal, you must configure AWS Single Sign-On in the current
     * Region. AWS IoT SiteWise Monitor uses AWS SSO to manage user permissions.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-get-started.html#mon-gs-sso"
     * >Enabling AWS SSO</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Before you can sign in to a new portal, you must add at least one AWS SSO
     * user or group to that portal. For more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/administer-portals.html#portal-change-admins"
     * >Adding or Removing Portal Administrators</a> in the <i>AWS IoT SiteWise
     * User Guide</i>.
     * </p>
     * </note>
     * 
     * @param createPortalRequest
     * @return createPortalResult The response from the CreatePortal service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreatePortalResult createPortal(CreatePortalRequest createPortalRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a project in the specified portal.
     * </p>
     * 
     * @param createProjectRequest
     * @return createProjectResult The response from the CreateProject service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateProjectResult createProject(CreateProjectRequest createProjectRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an access policy that grants the specified AWS Single Sign-On
     * identity access to the specified AWS IoT SiteWise Monitor resource. You
     * can use this action to revoke access to an AWS IoT SiteWise Monitor
     * resource.
     * </p>
     * 
     * @param deleteAccessPolicyRequest
     * @return deleteAccessPolicyResult The response from the DeleteAccessPolicy
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteAccessPolicyResult deleteAccessPolicy(DeleteAccessPolicyRequest deleteAccessPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an asset. This action can't be undone. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/delete-assets-and-models.html"
     * >Deleting Assets and Models</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * You can't delete an asset that's associated to another asset. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DisassociateAssets.html"
     * >DisassociateAssets</a>.
     * </p>
     * </note>
     * 
     * @param deleteAssetRequest
     * @return deleteAssetResult The response from the DeleteAsset service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ConflictingOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteAssetResult deleteAsset(DeleteAssetRequest deleteAssetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an asset model. This action can't be undone. You must delete all
     * assets created from an asset model before you can delete the model. Also,
     * you can't delete an asset model if a parent asset model exists that
     * contains a property formula expression that depends on the asset model
     * that you want to delete. For more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/delete-assets-and-models.html"
     * >Deleting Assets and Models</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * 
     * @param deleteAssetModelRequest
     * @return deleteAssetModelResult The response from the DeleteAssetModel
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ConflictingOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteAssetModelResult deleteAssetModel(DeleteAssetModelRequest deleteAssetModelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a dashboard from AWS IoT SiteWise Monitor.
     * </p>
     * 
     * @param deleteDashboardRequest
     * @return deleteDashboardResult The response from the DeleteDashboard
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteDashboardResult deleteDashboard(DeleteDashboardRequest deleteDashboardRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a gateway from AWS IoT SiteWise. When you delete a gateway, some
     * of the gateway's files remain in your gateway's file system. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/data-retention.html"
     * >Data retention</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param deleteGatewayRequest
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteGateway(DeleteGatewayRequest deleteGatewayRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a portal from AWS IoT SiteWise Monitor.
     * </p>
     * 
     * @param deletePortalRequest
     * @return deletePortalResult The response from the DeletePortal service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ConflictingOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeletePortalResult deletePortal(DeletePortalRequest deletePortalRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a project from AWS IoT SiteWise Monitor.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return deleteProjectResult The response from the DeleteProject service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteProjectResult deleteProject(DeleteProjectRequest deleteProjectRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes an access policy, which specifies an AWS SSO user or group's
     * access to an AWS IoT SiteWise Monitor portal or project.
     * </p>
     * 
     * @param describeAccessPolicyRequest
     * @return describeAccessPolicyResult The response from the
     *         DescribeAccessPolicy service method, as returned by AWS IoT
     *         SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeAccessPolicyResult describeAccessPolicy(
            DescribeAccessPolicyRequest describeAccessPolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves information about an asset.
     * </p>
     * 
     * @param describeAssetRequest
     * @return describeAssetResult The response from the DescribeAsset service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeAssetResult describeAsset(DescribeAssetRequest describeAssetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about an asset model.
     * </p>
     * 
     * @param describeAssetModelRequest
     * @return describeAssetModelResult The response from the DescribeAssetModel
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeAssetModelResult describeAssetModel(DescribeAssetModelRequest describeAssetModelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about an asset's property.
     * </p>
     * 
     * @param describeAssetPropertyRequest
     * @return describeAssetPropertyResult The response from the
     *         DescribeAssetProperty service method, as returned by AWS IoT
     *         SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeAssetPropertyResult describeAssetProperty(
            DescribeAssetPropertyRequest describeAssetPropertyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about a dashboard.
     * </p>
     * 
     * @param describeDashboardRequest
     * @return describeDashboardResult The response from the DescribeDashboard
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeDashboardResult describeDashboard(DescribeDashboardRequest describeDashboardRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about a gateway.
     * </p>
     * 
     * @param describeGatewayRequest
     * @return describeGatewayResult The response from the DescribeGateway
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeGatewayResult describeGateway(DescribeGatewayRequest describeGatewayRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about a gateway capability configuration. Each
     * gateway capability defines data sources for a gateway. A capability
     * configuration can contain multiple data source configurations. If you
     * define OPC-UA sources for a gateway in the AWS IoT SiteWise console, all
     * of your OPC-UA sources are stored in one capability configuration. To
     * list all capability configurations for a gateway, use <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGateway.html"
     * >DescribeGateway</a>.
     * </p>
     * 
     * @param describeGatewayCapabilityConfigurationRequest
     * @return describeGatewayCapabilityConfigurationResult The response from
     *         the DescribeGatewayCapabilityConfiguration service method, as
     *         returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeGatewayCapabilityConfigurationResult describeGatewayCapabilityConfiguration(
            DescribeGatewayCapabilityConfigurationRequest describeGatewayCapabilityConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the current AWS IoT SiteWise logging options.
     * </p>
     * 
     * @param describeLoggingOptionsRequest
     * @return describeLoggingOptionsResult The response from the
     *         DescribeLoggingOptions service method, as returned by AWS IoT
     *         SiteWise.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeLoggingOptionsResult describeLoggingOptions(
            DescribeLoggingOptionsRequest describeLoggingOptionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about a portal.
     * </p>
     * 
     * @param describePortalRequest
     * @return describePortalResult The response from the DescribePortal service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribePortalResult describePortal(DescribePortalRequest describePortalRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about a project.
     * </p>
     * 
     * @param describeProjectRequest
     * @return describeProjectResult The response from the DescribeProject
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeProjectResult describeProject(DescribeProjectRequest describeProjectRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates a child asset from the given parent asset through a
     * hierarchy defined in the parent asset's model.
     * </p>
     * 
     * @param disassociateAssetsRequest
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ConflictingOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void disassociateAssets(DisassociateAssetsRequest disassociateAssetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets aggregated values for an asset property. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/query-industrial-data.html#aggregates"
     * >Querying Aggregated Property Values</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * <p>
     * To identify an asset property, you must specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>assetId</code> and <code>propertyId</code> of an asset
     * property.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>propertyAlias</code>, which is a data stream alias (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). To define an
     * asset property's alias, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAssetPropertyAggregatesRequest
     * @return getAssetPropertyAggregatesResult The response from the
     *         GetAssetPropertyAggregates service method, as returned by AWS IoT
     *         SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetAssetPropertyAggregatesResult getAssetPropertyAggregates(
            GetAssetPropertyAggregatesRequest getAssetPropertyAggregatesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets an asset property's current value. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/query-industrial-data.html#current-values"
     * >Querying Current Property Values</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * <p>
     * To identify an asset property, you must specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>assetId</code> and <code>propertyId</code> of an asset
     * property.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>propertyAlias</code>, which is a data stream alias (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). To define an
     * asset property's alias, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAssetPropertyValueRequest
     * @return getAssetPropertyValueResult The response from the
     *         GetAssetPropertyValue service method, as returned by AWS IoT
     *         SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetAssetPropertyValueResult getAssetPropertyValue(
            GetAssetPropertyValueRequest getAssetPropertyValueRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the history of an asset property's values. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/query-industrial-data.html#historical-values"
     * >Querying Historical Property Values</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * <p>
     * To identify an asset property, you must specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>assetId</code> and <code>propertyId</code> of an asset
     * property.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>propertyAlias</code>, which is a data stream alias (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). To define an
     * asset property's alias, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAssetPropertyValueHistoryRequest
     * @return getAssetPropertyValueHistoryResult The response from the
     *         GetAssetPropertyValueHistory service method, as returned by AWS
     *         IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetAssetPropertyValueHistoryResult getAssetPropertyValueHistory(
            GetAssetPropertyValueHistoryRequest getAssetPropertyValueHistoryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a paginated list of access policies for an AWS SSO identity (a
     * user or group) or an AWS IoT SiteWise Monitor resource (a portal or
     * project).
     * </p>
     * 
     * @param listAccessPoliciesRequest
     * @return listAccessPoliciesResult The response from the ListAccessPolicies
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListAccessPoliciesResult listAccessPolicies(ListAccessPoliciesRequest listAccessPoliciesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a paginated list of summaries of all asset models.
     * </p>
     * 
     * @param listAssetModelsRequest
     * @return listAssetModelsResult The response from the ListAssetModels
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListAssetModelsResult listAssetModels(ListAssetModelsRequest listAssetModelsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a paginated list of asset summaries.
     * </p>
     * 
     * @param listAssetsRequest
     * @return listAssetsResult The response from the ListAssets service method,
     *         as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListAssetsResult listAssets(ListAssetsRequest listAssetsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves a paginated list of the assets associated to a parent asset (
     * <code>assetId</code>) by a given hierarchy (<code>hierarchyId</code>).
     * </p>
     * 
     * @param listAssociatedAssetsRequest
     * @return listAssociatedAssetsResult The response from the
     *         ListAssociatedAssets service method, as returned by AWS IoT
     *         SiteWise.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListAssociatedAssetsResult listAssociatedAssets(
            ListAssociatedAssetsRequest listAssociatedAssetsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves a paginated list of dashboards for an AWS IoT SiteWise Monitor
     * project.
     * </p>
     * 
     * @param listDashboardsRequest
     * @return listDashboardsResult The response from the ListDashboards service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDashboardsResult listDashboards(ListDashboardsRequest listDashboardsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a paginated list of gateways.
     * </p>
     * 
     * @param listGatewaysRequest
     * @return listGatewaysResult The response from the ListGateways service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListGatewaysResult listGateways(ListGatewaysRequest listGatewaysRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a paginated list of AWS IoT SiteWise Monitor portals.
     * </p>
     * 
     * @param listPortalsRequest
     * @return listPortalsResult The response from the ListPortals service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListPortalsResult listPortals(ListPortalsRequest listPortalsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a paginated list of assets associated with an AWS IoT SiteWise
     * Monitor project.
     * </p>
     * 
     * @param listProjectAssetsRequest
     * @return listProjectAssetsResult The response from the ListProjectAssets
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListProjectAssetsResult listProjectAssets(ListProjectAssetsRequest listProjectAssetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a paginated list of projects for an AWS IoT SiteWise Monitor
     * portal.
     * </p>
     * 
     * @param listProjectsRequest
     * @return listProjectsResult The response from the ListProjects service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListProjectsResult listProjects(ListProjectsRequest listProjectsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the list of tags for an AWS IoT SiteWise resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS IoT
     *         SiteWise.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Sets logging options for AWS IoT SiteWise.
     * </p>
     * 
     * @param putLoggingOptionsRequest
     * @return putLoggingOptionsResult The response from the PutLoggingOptions
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ConflictingOperationException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutLoggingOptionsResult putLoggingOptions(PutLoggingOptionsRequest putLoggingOptionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds tags to an AWS IoT SiteWise resource. If a tag already exists for
     * the resource, this operation updates the tag's value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws TooManyTagsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes a tag from an AWS IoT SiteWise resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an existing access policy that specifies an AWS SSO user or
     * group's access to an AWS IoT SiteWise Monitor portal or project resource.
     * </p>
     * 
     * @param updateAccessPolicyRequest
     * @return updateAccessPolicyResult The response from the UpdateAccessPolicy
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateAccessPolicyResult updateAccessPolicy(UpdateAccessPolicyRequest updateAccessPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an asset's name. For more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/update-assets-and-models.html"
     * >Updating Assets and Models</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * 
     * @param updateAssetRequest
     * @return updateAssetResult The response from the UpdateAsset service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ConflictingOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateAssetResult updateAsset(UpdateAssetRequest updateAssetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an asset model and all of the assets that were created from the
     * model. Each asset created from the model inherits the updated asset
     * model's property and hierarchy definitions. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/update-assets-and-models.html"
     * >Updating Assets and Models</a> in the <i>AWS IoT SiteWise User
     * Guide</i>.
     * </p>
     * <important>
     * <p>
     * This action overwrites the existing model with the provided model. To
     * avoid deleting your asset model's properties or hierarchies, you must
     * include their definitions in the updated asset model payload. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAssetModel.html"
     * >DescribeAssetModel</a>.
     * </p>
     * <p>
     * If you remove a property from an asset model or update a property's
     * formula expression, AWS IoT SiteWise deletes all previous data for that
     * property. If you remove a hierarchy definition from an asset model, AWS
     * IoT SiteWise disassociates every asset associated with that hierarchy.
     * You can't change the type or data type of an existing property.
     * </p>
     * </important>
     * 
     * @param updateAssetModelRequest
     * @return updateAssetModelResult The response from the UpdateAssetModel
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws ConflictingOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateAssetModelResult updateAssetModel(UpdateAssetModelRequest updateAssetModelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an asset property's alias and notification state.
     * </p>
     * 
     * @param updateAssetPropertyRequest
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ConflictingOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void updateAssetProperty(UpdateAssetPropertyRequest updateAssetPropertyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an AWS IoT SiteWise Monitor dashboard.
     * </p>
     * 
     * @param updateDashboardRequest
     * @return updateDashboardResult The response from the UpdateDashboard
     *         service method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateDashboardResult updateDashboard(UpdateDashboardRequest updateDashboardRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a gateway's name.
     * </p>
     * 
     * @param updateGatewayRequest
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ConflictingOperationException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void updateGateway(UpdateGatewayRequest updateGatewayRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates a gateway capability configuration or defines a new capability
     * configuration. Each gateway capability defines data sources for a
     * gateway. A capability configuration can contain multiple data source
     * configurations. If you define OPC-UA sources for a gateway in the AWS IoT
     * SiteWise console, all of your OPC-UA sources are stored in one capability
     * configuration. To list all capability configurations for a gateway, use
     * <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeGateway.html"
     * >DescribeGateway</a>.
     * </p>
     * 
     * @param updateGatewayCapabilityConfigurationRequest
     * @return updateGatewayCapabilityConfigurationResult The response from the
     *         UpdateGatewayCapabilityConfiguration service method, as returned
     *         by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ConflictingOperationException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateGatewayCapabilityConfigurationResult updateGatewayCapabilityConfiguration(
            UpdateGatewayCapabilityConfigurationRequest updateGatewayCapabilityConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an AWS IoT SiteWise Monitor portal.
     * </p>
     * 
     * @param updatePortalRequest
     * @return updatePortalResult The response from the UpdatePortal service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws ConflictingOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdatePortalResult updatePortal(UpdatePortalRequest updatePortalRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an AWS IoT SiteWise Monitor project.
     * </p>
     * 
     * @param updateProjectRequest
     * @return updateProjectResult The response from the UpdateProject service
     *         method, as returned by AWS IoT SiteWise.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             IoT SiteWise indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateProjectResult updateProject(UpdateProjectRequest updateProjectRequest)
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
