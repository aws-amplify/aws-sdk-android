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

package com.amazonaws.services.amazonapigatewayv2;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.amazonapigatewayv2.model.*;

/**
 * Interface for accessing AmazonApiGatewayV2
 * <p>
 * Amazon API Gateway V2
 * </p>
 **/
public interface AmazonApiGatewayV2 {

    /**
     * Overrides the default endpoint for this client
     * ("https://apigateway.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "apigateway.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://apigateway.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex: "apigateway.us-east-1.amazonaws.com")
     *            or a full URL, including the protocol (ex:
     *            "https://apigateway.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonApiGatewayV2#setEndpoint(String)}, sets
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
     * Creates an Api resource.
     * </p>
     * 
     * @param createApiRequest <p>
     *            Creates a new Api resource to represent an API.
     *            </p>
     * @return createApiResult The response from the CreateApi service method,
     *         as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateApiResult createApi(CreateApiRequest createApiRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates an API mapping.
     * </p>
     * 
     * @param createApiMappingRequest <p>
     *            Creates a new ApiMapping resource to represent an API mapping.
     *            </p>
     * @return createApiMappingResult The response from the CreateApiMapping
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateApiMappingResult createApiMapping(CreateApiMappingRequest createApiMappingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an Authorizer for an API.
     * </p>
     * 
     * @param createAuthorizerRequest <p>
     *            Creates a new Authorizer resource to represent an authorizer.
     *            </p>
     * @return createAuthorizerResult The response from the CreateAuthorizer
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateAuthorizerResult createAuthorizer(CreateAuthorizerRequest createAuthorizerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a Deployment for an API.
     * </p>
     * 
     * @param createDeploymentRequest <p>
     *            Creates a new Deployment resource to represent a deployment.
     *            </p>
     * @return createDeploymentResult The response from the CreateDeployment
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateDeploymentResult createDeployment(CreateDeploymentRequest createDeploymentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a domain name.
     * </p>
     * 
     * @param createDomainNameRequest <p>
     *            Creates a new DomainName resource to represent a domain name.
     *            </p>
     * @return createDomainNameResult The response from the CreateDomainName
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AccessDeniedException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateDomainNameResult createDomainName(CreateDomainNameRequest createDomainNameRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an Integration.
     * </p>
     * 
     * @param createIntegrationRequest <p>
     *            Creates a new Integration resource to represent an
     *            integration.
     *            </p>
     * @return createIntegrationResult The response from the CreateIntegration
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateIntegrationResult createIntegration(CreateIntegrationRequest createIntegrationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an IntegrationResponses.
     * </p>
     * 
     * @param createIntegrationResponseRequest <p>
     *            Creates a new IntegrationResponse resource to represent an
     *            integration response.
     *            </p>
     * @return createIntegrationResponseResult The response from the
     *         CreateIntegrationResponse service method, as returned by
     *         AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateIntegrationResponseResult createIntegrationResponse(
            CreateIntegrationResponseRequest createIntegrationResponseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a Model for an API.
     * </p>
     * 
     * @param createModelRequest <p>
     *            Creates a new Model.
     *            </p>
     * @return createModelResult The response from the CreateModel service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateModelResult createModel(CreateModelRequest createModelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a Route for an API.
     * </p>
     * 
     * @param createRouteRequest <p>
     *            Creates a new Route resource to represent a route.
     *            </p>
     * @return createRouteResult The response from the CreateRoute service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateRouteResult createRoute(CreateRouteRequest createRouteRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a RouteResponse for a Route.
     * </p>
     * 
     * @param createRouteResponseRequest <p>
     *            Creates a new RouteResponse resource to represent a route
     *            response.
     *            </p>
     * @return createRouteResponseResult The response from the
     *         CreateRouteResponse service method, as returned by
     *         AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateRouteResponseResult createRouteResponse(
            CreateRouteResponseRequest createRouteResponseRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a Stage for an API.
     * </p>
     * 
     * @param createStageRequest <p>
     *            Creates a new Stage resource to represent a stage.
     *            </p>
     * @return createStageResult The response from the CreateStage service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateStageResult createStage(CreateStageRequest createStageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a VPC link.
     * </p>
     * 
     * @param createVpcLinkRequest <p>
     *            Creates a VPC link
     *            </p>
     * @return createVpcLinkResult The response from the CreateVpcLink service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateVpcLinkResult createVpcLink(CreateVpcLinkRequest createVpcLinkRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the AccessLogSettings for a Stage. To disable access logging for
     * a Stage, delete its AccessLogSettings.
     * </p>
     * 
     * @param deleteAccessLogSettingsRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteAccessLogSettings(DeleteAccessLogSettingsRequest deleteAccessLogSettingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an Api resource.
     * </p>
     * 
     * @param deleteApiRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteApi(DeleteApiRequest deleteApiRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes an API mapping.
     * </p>
     * 
     * @param deleteApiMappingRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteApiMapping(DeleteApiMappingRequest deleteApiMappingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an Authorizer.
     * </p>
     * 
     * @param deleteAuthorizerRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteAuthorizer(DeleteAuthorizerRequest deleteAuthorizerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a CORS configuration.
     * </p>
     * 
     * @param deleteCorsConfigurationRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteCorsConfiguration(DeleteCorsConfigurationRequest deleteCorsConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a Deployment.
     * </p>
     * 
     * @param deleteDeploymentRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteDeployment(DeleteDeploymentRequest deleteDeploymentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a domain name.
     * </p>
     * 
     * @param deleteDomainNameRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteDomainName(DeleteDomainNameRequest deleteDomainNameRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an Integration.
     * </p>
     * 
     * @param deleteIntegrationRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteIntegration(DeleteIntegrationRequest deleteIntegrationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an IntegrationResponses.
     * </p>
     * 
     * @param deleteIntegrationResponseRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteIntegrationResponse(DeleteIntegrationResponseRequest deleteIntegrationResponseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a Model.
     * </p>
     * 
     * @param deleteModelRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteModel(DeleteModelRequest deleteModelRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a Route.
     * </p>
     * 
     * @param deleteRouteRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteRoute(DeleteRouteRequest deleteRouteRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a route request parameter.
     * </p>
     * 
     * @param deleteRouteRequestParameterRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteRouteRequestParameter(
            DeleteRouteRequestParameterRequest deleteRouteRequestParameterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a RouteResponse.
     * </p>
     * 
     * @param deleteRouteResponseRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteRouteResponse(DeleteRouteResponseRequest deleteRouteResponseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the RouteSettings for a stage.
     * </p>
     * 
     * @param deleteRouteSettingsRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteRouteSettings(DeleteRouteSettingsRequest deleteRouteSettingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a Stage.
     * </p>
     * 
     * @param deleteStageRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteStage(DeleteStageRequest deleteStageRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a VPC link.
     * </p>
     * 
     * @param deleteVpcLinkRequest
     * @return deleteVpcLinkResult The response from the DeleteVpcLink service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DeleteVpcLinkResult deleteVpcLink(DeleteVpcLinkRequest deleteVpcLinkRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * @param exportApiRequest
     * @return exportApiResult The response from the ExportApi service method,
     *         as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ExportApiResult exportApi(ExportApiRequest exportApiRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets an Api resource.
     * </p>
     * 
     * @param getApiRequest
     * @return getApiResult The response from the GetApi service method, as
     *         returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetApiResult getApi(GetApiRequest getApiRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets an API mapping.
     * </p>
     * 
     * @param getApiMappingRequest
     * @return getApiMappingResult The response from the GetApiMapping service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetApiMappingResult getApiMapping(GetApiMappingRequest getApiMappingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets API mappings.
     * </p>
     * 
     * @param getApiMappingsRequest
     * @return getApiMappingsResult The response from the GetApiMappings service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetApiMappingsResult getApiMappings(GetApiMappingsRequest getApiMappingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a collection of Api resources.
     * </p>
     * 
     * @param getApisRequest
     * @return getApisResult The response from the GetApis service method, as
     *         returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetApisResult getApis(GetApisRequest getApisRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets an Authorizer.
     * </p>
     * 
     * @param getAuthorizerRequest
     * @return getAuthorizerResult The response from the GetAuthorizer service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetAuthorizerResult getAuthorizer(GetAuthorizerRequest getAuthorizerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the Authorizers for an API.
     * </p>
     * 
     * @param getAuthorizersRequest
     * @return getAuthorizersResult The response from the GetAuthorizers service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetAuthorizersResult getAuthorizers(GetAuthorizersRequest getAuthorizersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a Deployment.
     * </p>
     * 
     * @param getDeploymentRequest
     * @return getDeploymentResult The response from the GetDeployment service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetDeploymentResult getDeployment(GetDeploymentRequest getDeploymentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the Deployments for an API.
     * </p>
     * 
     * @param getDeploymentsRequest
     * @return getDeploymentsResult The response from the GetDeployments service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetDeploymentsResult getDeployments(GetDeploymentsRequest getDeploymentsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a domain name.
     * </p>
     * 
     * @param getDomainNameRequest
     * @return getDomainNameResult The response from the GetDomainName service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetDomainNameResult getDomainName(GetDomainNameRequest getDomainNameRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the domain names for an AWS account.
     * </p>
     * 
     * @param getDomainNamesRequest
     * @return getDomainNamesResult The response from the GetDomainNames service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetDomainNamesResult getDomainNames(GetDomainNamesRequest getDomainNamesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets an Integration.
     * </p>
     * 
     * @param getIntegrationRequest
     * @return getIntegrationResult The response from the GetIntegration service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetIntegrationResult getIntegration(GetIntegrationRequest getIntegrationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets an IntegrationResponses.
     * </p>
     * 
     * @param getIntegrationResponseRequest
     * @return getIntegrationResponseResult The response from the
     *         GetIntegrationResponse service method, as returned by
     *         AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetIntegrationResponseResult getIntegrationResponse(
            GetIntegrationResponseRequest getIntegrationResponseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the IntegrationResponses for an Integration.
     * </p>
     * 
     * @param getIntegrationResponsesRequest
     * @return getIntegrationResponsesResult The response from the
     *         GetIntegrationResponses service method, as returned by
     *         AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetIntegrationResponsesResult getIntegrationResponses(
            GetIntegrationResponsesRequest getIntegrationResponsesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the Integrations for an API.
     * </p>
     * 
     * @param getIntegrationsRequest
     * @return getIntegrationsResult The response from the GetIntegrations
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetIntegrationsResult getIntegrations(GetIntegrationsRequest getIntegrationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a Model.
     * </p>
     * 
     * @param getModelRequest
     * @return getModelResult The response from the GetModel service method, as
     *         returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetModelResult getModel(GetModelRequest getModelRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets a model template.
     * </p>
     * 
     * @param getModelTemplateRequest
     * @return getModelTemplateResult The response from the GetModelTemplate
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetModelTemplateResult getModelTemplate(GetModelTemplateRequest getModelTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the Models for an API.
     * </p>
     * 
     * @param getModelsRequest
     * @return getModelsResult The response from the GetModels service method,
     *         as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetModelsResult getModels(GetModelsRequest getModelsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets a Route.
     * </p>
     * 
     * @param getRouteRequest
     * @return getRouteResult The response from the GetRoute service method, as
     *         returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetRouteResult getRoute(GetRouteRequest getRouteRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets a RouteResponse.
     * </p>
     * 
     * @param getRouteResponseRequest
     * @return getRouteResponseResult The response from the GetRouteResponse
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetRouteResponseResult getRouteResponse(GetRouteResponseRequest getRouteResponseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the RouteResponses for a Route.
     * </p>
     * 
     * @param getRouteResponsesRequest
     * @return getRouteResponsesResult The response from the GetRouteResponses
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetRouteResponsesResult getRouteResponses(GetRouteResponsesRequest getRouteResponsesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the Routes for an API.
     * </p>
     * 
     * @param getRoutesRequest
     * @return getRoutesResult The response from the GetRoutes service method,
     *         as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetRoutesResult getRoutes(GetRoutesRequest getRoutesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets a Stage.
     * </p>
     * 
     * @param getStageRequest
     * @return getStageResult The response from the GetStage service method, as
     *         returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetStageResult getStage(GetStageRequest getStageRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets the Stages for an API.
     * </p>
     * 
     * @param getStagesRequest
     * @return getStagesResult The response from the GetStages service method,
     *         as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetStagesResult getStages(GetStagesRequest getStagesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets a collection of Tag resources.
     * </p>
     * 
     * @param getTagsRequest
     * @return getTagsResult The response from the GetTags service method, as
     *         returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetTagsResult getTags(GetTagsRequest getTagsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets a VPC link.
     * </p>
     * 
     * @param getVpcLinkRequest
     * @return getVpcLinkResult The response from the GetVpcLink service method,
     *         as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetVpcLinkResult getVpcLink(GetVpcLinkRequest getVpcLinkRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets a collection of VPC links.
     * </p>
     * 
     * @param getVpcLinksRequest
     * @return getVpcLinksResult The response from the GetVpcLinks service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetVpcLinksResult getVpcLinks(GetVpcLinksRequest getVpcLinksRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Imports an API.
     * </p>
     * 
     * @param importApiRequest <p>
     *            </p>
     * @return importApiResult The response from the ImportApi service method,
     *         as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ImportApiResult importApi(ImportApiRequest importApiRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Puts an Api resource.
     * </p>
     * 
     * @param reimportApiRequest <p>
     *            </p>
     * @return reimportApiResult The response from the ReimportApi service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ReimportApiResult reimportApi(ReimportApiRequest reimportApiRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new Tag resource to represent a tag.
     * </p>
     * 
     * @param tagResourceRequest <p>
     *            Creates a new Tag resource to represent a tag.
     *            </p>
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a Tag.
     * </p>
     * 
     * @param untagResourceRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void untagResource(UntagResourceRequest untagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates an Api resource.
     * </p>
     * 
     * @param updateApiRequest <p>
     *            Updates an Api.
     *            </p>
     * @return updateApiResult The response from the UpdateApi service method,
     *         as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateApiResult updateApi(UpdateApiRequest updateApiRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * The API mapping.
     * </p>
     * 
     * @param updateApiMappingRequest <p>
     *            Updates an ApiMapping.
     *            </p>
     * @return updateApiMappingResult The response from the UpdateApiMapping
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateApiMappingResult updateApiMapping(UpdateApiMappingRequest updateApiMappingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an Authorizer.
     * </p>
     * 
     * @param updateAuthorizerRequest <p>
     *            Updates an Authorizer.
     *            </p>
     * @return updateAuthorizerResult The response from the UpdateAuthorizer
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateAuthorizerResult updateAuthorizer(UpdateAuthorizerRequest updateAuthorizerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a Deployment.
     * </p>
     * 
     * @param updateDeploymentRequest <p>
     *            Updates a Deployment.
     *            </p>
     * @return updateDeploymentResult The response from the UpdateDeployment
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateDeploymentResult updateDeployment(UpdateDeploymentRequest updateDeploymentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a domain name.
     * </p>
     * 
     * @param updateDomainNameRequest <p>
     *            Updates a DomainName.
     *            </p>
     * @return updateDomainNameResult The response from the UpdateDomainName
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateDomainNameResult updateDomainName(UpdateDomainNameRequest updateDomainNameRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an Integration.
     * </p>
     * 
     * @param updateIntegrationRequest <p>
     *            Updates an Integration.
     *            </p>
     * @return updateIntegrationResult The response from the UpdateIntegration
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateIntegrationResult updateIntegration(UpdateIntegrationRequest updateIntegrationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an IntegrationResponses.
     * </p>
     * 
     * @param updateIntegrationResponseRequest <p>
     *            Updates an IntegrationResponses.
     *            </p>
     * @return updateIntegrationResponseResult The response from the
     *         UpdateIntegrationResponse service method, as returned by
     *         AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateIntegrationResponseResult updateIntegrationResponse(
            UpdateIntegrationResponseRequest updateIntegrationResponseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a Model.
     * </p>
     * 
     * @param updateModelRequest <p>
     *            Updates a Model.
     *            </p>
     * @return updateModelResult The response from the UpdateModel service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateModelResult updateModel(UpdateModelRequest updateModelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a Route.
     * </p>
     * 
     * @param updateRouteRequest <p>
     *            Updates a Route.
     *            </p>
     * @return updateRouteResult The response from the UpdateRoute service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateRouteResult updateRoute(UpdateRouteRequest updateRouteRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a RouteResponse.
     * </p>
     * 
     * @param updateRouteResponseRequest <p>
     *            Updates a RouteResponse.
     *            </p>
     * @return updateRouteResponseResult The response from the
     *         UpdateRouteResponse service method, as returned by
     *         AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateRouteResponseResult updateRouteResponse(
            UpdateRouteResponseRequest updateRouteResponseRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates a Stage.
     * </p>
     * 
     * @param updateStageRequest <p>
     *            Updates a Stage.
     *            </p>
     * @return updateStageResult The response from the UpdateStage service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateStageResult updateStage(UpdateStageRequest updateStageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a VPC link.
     * </p>
     * 
     * @param updateVpcLinkRequest <p>
     *            Updates a VPC link.
     *            </p>
     * @return updateVpcLinkResult The response from the UpdateVpcLink service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateVpcLinkResult updateVpcLink(UpdateVpcLinkRequest updateVpcLinkRequest)
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
