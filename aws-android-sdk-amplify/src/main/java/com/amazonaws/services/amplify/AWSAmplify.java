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

package com.amazonaws.services.amplify;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.amplify.model.*;

/**
 * Interface for accessing AWS Amplify
 * <p>
 * Welcome to the AWS Amplify API documentation. This reference provides
 * descriptions of the actions and data types for the Amplify API.
 * </p>
 * <p>
 * Amplify enables developers to develop and deploy cloud-powered mobile and web
 * apps. The Amplify Console provides a continuous delivery and hosting service
 * for web applications. For more information, see the <a
 * href="https://docs.aws.amazon.com/amplify/latest/userguide/welcome.html"
 * >Amplify Console User Guide</a>. The Amplify Framework is a comprehensive set
 * of SDKs, libraries, tools, and documentation for client app development. For
 * more information, see the <a
 * href="https://aws-amplify.github.io/docs/">Amplify Framework.</a>
 * </p>
 **/
public interface AWSAmplify {

    /**
     * Overrides the default endpoint for this client
     * ("https://amplify.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "amplify.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://amplify.us-east-1.amazonaws.com"). If the protocol is not
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
     * @param endpoint The endpoint (ex: "amplify.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://amplify.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSAmplify#setEndpoint(String)}, sets the
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
     * Creates a new Amplify app.
     * </p>
     * 
     * @param createAppRequest <p>
     *            The request structure used to create apps in Amplify.
     *            </p>
     * @return createAppResult The response from the CreateApp service method,
     *         as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws DependentServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateAppResult createApp(CreateAppRequest createAppRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a new backend environment for an Amplify app.
     * </p>
     * 
     * @param createBackendEnvironmentRequest <p>
     *            The request structure for the backend environment create
     *            request.
     *            </p>
     * @return createBackendEnvironmentResult The response from the
     *         CreateBackendEnvironment service method, as returned by AWS
     *         Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateBackendEnvironmentResult createBackendEnvironment(
            CreateBackendEnvironmentRequest createBackendEnvironmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new branch for an Amplify app.
     * </p>
     * 
     * @param createBranchRequest <p>
     *            The request structure for the create branch request.
     *            </p>
     * @return createBranchResult The response from the CreateBranch service
     *         method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws DependentServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateBranchResult createBranch(CreateBranchRequest createBranchRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a deployment for a manually deployed Amplify app. Manually
     * deployed apps are not connected to a repository.
     * </p>
     * 
     * @param createDeploymentRequest <p>
     *            The request structure for the create a new deployment request.
     *            </p>
     * @return createDeploymentResult The response from the CreateDeployment
     *         service method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDeploymentResult createDeployment(CreateDeploymentRequest createDeploymentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new domain association for an Amplify app. This action
     * associates a custom domain with the Amplify app
     * </p>
     * 
     * @param createDomainAssociationRequest <p>
     *            The request structure for the create domain association
     *            request.
     *            </p>
     * @return createDomainAssociationResult The response from the
     *         CreateDomainAssociation service method, as returned by AWS
     *         Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws DependentServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDomainAssociationResult createDomainAssociation(
            CreateDomainAssociationRequest createDomainAssociationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new webhook on an Amplify app.
     * </p>
     * 
     * @param createWebhookRequest <p>
     *            The request structure for the create webhook request.
     *            </p>
     * @return createWebhookResult The response from the CreateWebhook service
     *         method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws DependentServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateWebhookResult createWebhook(CreateWebhookRequest createWebhookRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an existing Amplify app specified by an app ID.
     * </p>
     * 
     * @param deleteAppRequest <p>
     *            Describes the request structure for the delete app request.
     *            </p>
     * @return deleteAppResult The response from the DeleteApp service method,
     *         as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws DependentServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteAppResult deleteApp(DeleteAppRequest deleteAppRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a backend environment for an Amplify app.
     * </p>
     * 
     * @param deleteBackendEnvironmentRequest <p>
     *            The request structure for the delete backend environment
     *            request.
     *            </p>
     * @return deleteBackendEnvironmentResult The response from the
     *         DeleteBackendEnvironment service method, as returned by AWS
     *         Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws DependentServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteBackendEnvironmentResult deleteBackendEnvironment(
            DeleteBackendEnvironmentRequest deleteBackendEnvironmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a branch for an Amplify app.
     * </p>
     * 
     * @param deleteBranchRequest <p>
     *            The request structure for the delete branch request.
     *            </p>
     * @return deleteBranchResult The response from the DeleteBranch service
     *         method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws DependentServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteBranchResult deleteBranch(DeleteBranchRequest deleteBranchRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a domain association for an Amplify app.
     * </p>
     * 
     * @param deleteDomainAssociationRequest <p>
     *            The request structure for the delete domain association
     *            request.
     *            </p>
     * @return deleteDomainAssociationResult The response from the
     *         DeleteDomainAssociation service method, as returned by AWS
     *         Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws DependentServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteDomainAssociationResult deleteDomainAssociation(
            DeleteDomainAssociationRequest deleteDomainAssociationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a job for a branch of an Amplify app.
     * </p>
     * 
     * @param deleteJobRequest <p>
     *            The request structure for the delete job request.
     *            </p>
     * @return deleteJobResult The response from the DeleteJob service method,
     *         as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteJobResult deleteJob(DeleteJobRequest deleteJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a webhook.
     * </p>
     * 
     * @param deleteWebhookRequest <p>
     *            The request structure for the delete webhook request.
     *            </p>
     * @return deleteWebhookResult The response from the DeleteWebhook service
     *         method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteWebhookResult deleteWebhook(DeleteWebhookRequest deleteWebhookRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the website access logs for a specific time range using a
     * presigned URL.
     * </p>
     * 
     * @param generateAccessLogsRequest <p>
     *            The request structure for the generate access logs request.
     *            </p>
     * @return generateAccessLogsResult The response from the GenerateAccessLogs
     *         service method, as returned by AWS Amplify.
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GenerateAccessLogsResult generateAccessLogs(GenerateAccessLogsRequest generateAccessLogsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns an existing Amplify app by appID.
     * </p>
     * 
     * @param getAppRequest <p>
     *            The request structure for the get app request.
     *            </p>
     * @return getAppResult The response from the GetApp service method, as
     *         returned by AWS Amplify.
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetAppResult getApp(GetAppRequest getAppRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns the artifact info that corresponds to an artifact id.
     * </p>
     * 
     * @param getArtifactUrlRequest <p>
     *            Returns the request structure for the get artifact request.
     *            </p>
     * @return getArtifactUrlResult The response from the GetArtifactUrl service
     *         method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetArtifactUrlResult getArtifactUrl(GetArtifactUrlRequest getArtifactUrlRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a backend environment for an Amplify app.
     * </p>
     * 
     * @param getBackendEnvironmentRequest <p>
     *            The request structure for the get backend environment request.
     *            </p>
     * @return getBackendEnvironmentResult The response from the
     *         GetBackendEnvironment service method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetBackendEnvironmentResult getBackendEnvironment(
            GetBackendEnvironmentRequest getBackendEnvironmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a branch for an Amplify app.
     * </p>
     * 
     * @param getBranchRequest <p>
     *            The request structure for the get branch request.
     *            </p>
     * @return getBranchResult The response from the GetBranch service method,
     *         as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetBranchResult getBranch(GetBranchRequest getBranchRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns the domain information for an Amplify app.
     * </p>
     * 
     * @param getDomainAssociationRequest <p>
     *            The request structure for the get domain association request.
     *            </p>
     * @return getDomainAssociationResult The response from the
     *         GetDomainAssociation service method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDomainAssociationResult getDomainAssociation(
            GetDomainAssociationRequest getDomainAssociationRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a job for a branch of an Amplify app.
     * </p>
     * 
     * @param getJobRequest <p>
     *            The request structure for the get job request.
     *            </p>
     * @return getJobResult The response from the GetJob service method, as
     *         returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetJobResult getJob(GetJobRequest getJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns the webhook information that corresponds to a specified webhook
     * ID.
     * </p>
     * 
     * @param getWebhookRequest <p>
     *            The request structure for the get webhook request.
     *            </p>
     * @return getWebhookResult The response from the GetWebhook service method,
     *         as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetWebhookResult getWebhook(GetWebhookRequest getWebhookRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of the existing Amplify apps.
     * </p>
     * 
     * @param listAppsRequest <p>
     *            The request structure for the list apps request.
     *            </p>
     * @return listAppsResult The response from the ListApps service method, as
     *         returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListAppsResult listApps(ListAppsRequest listAppsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of artifacts for a specified app, branch, and job.
     * </p>
     * 
     * @param listArtifactsRequest <p>
     *            Describes the request structure for the list artifacts
     *            request.
     *            </p>
     * @return listArtifactsResult The response from the ListArtifacts service
     *         method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListArtifactsResult listArtifacts(ListArtifactsRequest listArtifactsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the backend environments for an Amplify app.
     * </p>
     * 
     * @param listBackendEnvironmentsRequest <p>
     *            The request structure for the list backend environments
     *            request.
     *            </p>
     * @return listBackendEnvironmentsResult The response from the
     *         ListBackendEnvironments service method, as returned by AWS
     *         Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListBackendEnvironmentsResult listBackendEnvironments(
            ListBackendEnvironmentsRequest listBackendEnvironmentsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the branches of an Amplify app.
     * </p>
     * 
     * @param listBranchesRequest <p>
     *            The request structure for the list branches request.
     *            </p>
     * @return listBranchesResult The response from the ListBranches service
     *         method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListBranchesResult listBranches(ListBranchesRequest listBranchesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the domain associations for an Amplify app.
     * </p>
     * 
     * @param listDomainAssociationsRequest <p>
     *            The request structure for the list domain associations
     *            request.
     *            </p>
     * @return listDomainAssociationsResult The response from the
     *         ListDomainAssociations service method, as returned by AWS
     *         Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDomainAssociationsResult listDomainAssociations(
            ListDomainAssociationsRequest listDomainAssociationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the jobs for a branch of an Amplify app.
     * </p>
     * 
     * @param listJobsRequest <p>
     *            The request structure for the list jobs request.
     *            </p>
     * @return listJobsResult The response from the ListJobs service method, as
     *         returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListJobsResult listJobs(ListJobsRequest listJobsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of tags for a specified Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listTagsForResourceRequest <p>
     *            The request structure to use to list tags for a resource.
     *            </p>
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS Amplify.
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of webhooks for an Amplify app.
     * </p>
     * 
     * @param listWebhooksRequest <p>
     *            The request structure for the list webhooks request.
     *            </p>
     * @return listWebhooksResult The response from the ListWebhooks service
     *         method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListWebhooksResult listWebhooks(ListWebhooksRequest listWebhooksRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts a deployment for a manually deployed app. Manually deployed apps
     * are not connected to a repository.
     * </p>
     * 
     * @param startDeploymentRequest <p>
     *            The request structure for the start a deployment request.
     *            </p>
     * @return startDeploymentResult The response from the StartDeployment
     *         service method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartDeploymentResult startDeployment(StartDeploymentRequest startDeploymentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts a new job for a branch of an Amplify app.
     * </p>
     * 
     * @param startJobRequest <p>
     *            The request structure for the start job request.
     *            </p>
     * @return startJobResult The response from the StartJob service method, as
     *         returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartJobResult startJob(StartJobRequest startJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Stops a job that is in progress for a branch of an Amplify app.
     * </p>
     * 
     * @param stopJobRequest <p>
     *            The request structure for the stop job request.
     *            </p>
     * @return stopJobResult The response from the StopJob service method, as
     *         returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StopJobResult stopJob(StopJobRequest stopJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Tags the resource with a tag key and value.
     * </p>
     * 
     * @param tagResourceRequest <p>
     *            The request structure to tag a resource with a tag key and
     *            value.
     *            </p>
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AWS Amplify.
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Untags a resource with a specified Amazon Resource Name (ARN).
     * </p>
     * 
     * @param untagResourceRequest <p>
     *            The request structure for the untag resource request.
     *            </p>
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by AWS Amplify.
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an existing Amplify app.
     * </p>
     * 
     * @param updateAppRequest <p>
     *            The request structure for the update app request.
     *            </p>
     * @return updateAppResult The response from the UpdateApp service method,
     *         as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateAppResult updateApp(UpdateAppRequest updateAppRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates a branch for an Amplify app.
     * </p>
     * 
     * @param updateBranchRequest <p>
     *            The request structure for the update branch request.
     *            </p>
     * @return updateBranchResult The response from the UpdateBranch service
     *         method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws DependentServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateBranchResult updateBranch(UpdateBranchRequest updateBranchRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new domain association for an Amplify app.
     * </p>
     * 
     * @param updateDomainAssociationRequest <p>
     *            The request structure for the update domain association
     *            request.
     *            </p>
     * @return updateDomainAssociationResult The response from the
     *         UpdateDomainAssociation service method, as returned by AWS
     *         Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws DependentServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateDomainAssociationResult updateDomainAssociation(
            UpdateDomainAssociationRequest updateDomainAssociationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a webhook.
     * </p>
     * 
     * @param updateWebhookRequest <p>
     *            The request structure for the update webhook request.
     *            </p>
     * @return updateWebhookResult The response from the UpdateWebhook service
     *         method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws DependentServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateWebhookResult updateWebhook(UpdateWebhookRequest updateWebhookRequest)
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
