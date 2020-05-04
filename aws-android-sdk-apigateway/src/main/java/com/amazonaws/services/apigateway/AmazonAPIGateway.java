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

package com.amazonaws.services.apigateway;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.apigateway.model.*;

/**
 * Interface for accessing Amazon API Gateway <fullname>Amazon API
 * Gateway</fullname>
 * <p>
 * Amazon API Gateway helps developers deliver robust, secure, and scalable
 * mobile and web application back ends. API Gateway allows developers to
 * securely connect mobile and web applications to APIs that run on AWS Lambda,
 * Amazon EC2, or other publicly addressable web services that are hosted
 * outside of AWS.
 * </p>
 **/
public interface AmazonAPIGateway {

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
     * An alternative to {@link AmazonAPIGateway#setEndpoint(String)}, sets the
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
     * Create an <a>ApiKey</a> resource.
     * </p>
     * <div class="seeAlso"><a href=
     * "https://docs.aws.amazon.com/cli/latest/reference/apigateway/create-api-key.html"
     * >AWS CLI</a></div>
     * 
     * @param createApiKeyRequest <p>
     *            Request to create an <a>ApiKey</a> resource.
     *            </p>
     * @return createApiKeyResult The response from the CreateApiKey service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateApiKeyResult createApiKey(CreateApiKeyRequest createApiKeyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds a new <a>Authorizer</a> resource to an existing <a>RestApi</a>
     * resource.
     * </p>
     * <div class="seeAlso"><a href=
     * "https://docs.aws.amazon.com/cli/latest/reference/apigateway/create-authorizer.html"
     * >AWS CLI</a></div>
     * 
     * @param createAuthorizerRequest <p>
     *            Request to add a new <a>Authorizer</a> to an existing
     *            <a>RestApi</a> resource.
     *            </p>
     * @return createAuthorizerResult The response from the CreateAuthorizer
     *         service method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateAuthorizerResult createAuthorizer(CreateAuthorizerRequest createAuthorizerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param createBasePathMappingRequest <p>
     *            Requests API Gateway to create a new <a>BasePathMapping</a>
     *            resource.
     *            </p>
     * @return createBasePathMappingResult The response from the
     *         CreateBasePathMapping service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateBasePathMappingResult createBasePathMapping(
            CreateBasePathMappingRequest createBasePathMappingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a <a>Deployment</a> resource, which makes a specified
     * <a>RestApi</a> callable over the internet.
     * </p>
     * 
     * @param createDeploymentRequest <p>
     *            Requests API Gateway to create a <a>Deployment</a> resource.
     *            </p>
     * @return createDeploymentResult The response from the CreateDeployment
     *         service method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDeploymentResult createDeployment(CreateDeploymentRequest createDeploymentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * @param createDocumentationPartRequest <p>
     *            Creates a new documentation part of a given API.
     *            </p>
     * @return createDocumentationPartResult The response from the
     *         CreateDocumentationPart service method, as returned by Amazon API
     *         Gateway.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDocumentationPartResult createDocumentationPart(
            CreateDocumentationPartRequest createDocumentationPartRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * @param createDocumentationVersionRequest <p>
     *            Creates a new documentation version of a given API.
     *            </p>
     * @return createDocumentationVersionResult The response from the
     *         CreateDocumentationVersion service method, as returned by Amazon
     *         API Gateway.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDocumentationVersionResult createDocumentationVersion(
            CreateDocumentationVersionRequest createDocumentationVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new domain name.
     * </p>
     * 
     * @param createDomainNameRequest <p>
     *            A request to create a new domain name.
     *            </p>
     * @return createDomainNameResult The response from the CreateDomainName
     *         service method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDomainNameResult createDomainName(CreateDomainNameRequest createDomainNameRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds a new <a>Model</a> resource to an existing <a>RestApi</a> resource.
     * </p>
     * 
     * @param createModelRequest <p>
     *            Request to add a new <a>Model</a> to an existing
     *            <a>RestApi</a> resource.
     *            </p>
     * @return createModelResult The response from the CreateModel service
     *         method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateModelResult createModel(CreateModelRequest createModelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a <a>ReqeustValidator</a> of a given <a>RestApi</a>.
     * </p>
     * 
     * @param createRequestValidatorRequest <p>
     *            Creates a <a>RequestValidator</a> of a given <a>RestApi</a>.
     *            </p>
     * @return createRequestValidatorResult The response from the
     *         CreateRequestValidator service method, as returned by Amazon API
     *         Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateRequestValidatorResult createRequestValidator(
            CreateRequestValidatorRequest createRequestValidatorRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a <a>Resource</a> resource.
     * </p>
     * 
     * @param createResourceRequest <p>
     *            Requests API Gateway to create a <a>Resource</a> resource.
     *            </p>
     * @return createResourceResult The response from the CreateResource service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateResourceResult createResource(CreateResourceRequest createResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new <a>RestApi</a> resource.
     * </p>
     * 
     * @param createRestApiRequest <p>
     *            The POST Request to add a new <a>RestApi</a> resource to your
     *            collection.
     *            </p>
     * @return createRestApiResult The response from the CreateRestApi service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateRestApiResult createRestApi(CreateRestApiRequest createRestApiRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new <a>Stage</a> resource that references a pre-existing
     * <a>Deployment</a> for the API.
     * </p>
     * 
     * @param createStageRequest <p>
     *            Requests API Gateway to create a <a>Stage</a> resource.
     *            </p>
     * @return createStageResult The response from the CreateStage service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateStageResult createStage(CreateStageRequest createStageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a usage plan with the throttle and quota limits, as well as the
     * associated API stages, specified in the payload.
     * </p>
     * 
     * @param createUsagePlanRequest <p>
     *            The POST request to create a usage plan with the name,
     *            description, throttle limits and quota limits, as well as the
     *            associated API stages, specified in the payload.
     *            </p>
     * @return createUsagePlanResult The response from the CreateUsagePlan
     *         service method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws ConflictException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateUsagePlanResult createUsagePlan(CreateUsagePlanRequest createUsagePlanRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a usage plan key for adding an existing API key to a usage plan.
     * </p>
     * 
     * @param createUsagePlanKeyRequest <p>
     *            The POST request to create a usage plan key for adding an
     *            existing API key to a usage plan.
     *            </p>
     * @return createUsagePlanKeyResult The response from the CreateUsagePlanKey
     *         service method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateUsagePlanKeyResult createUsagePlanKey(CreateUsagePlanKeyRequest createUsagePlanKeyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a VPC link, under the caller's account in a selected region, in
     * an asynchronous operation that typically takes 2-4 minutes to complete
     * and become operational. The caller must have permissions to create and
     * update VPC Endpoint services.
     * </p>
     * 
     * @param createVpcLinkRequest <p>
     *            Creates a VPC link, under the caller's account in a selected
     *            region, in an asynchronous operation that typically takes 2-4
     *            minutes to complete and become operational. The caller must
     *            have permissions to create and update VPC Endpoint services.
     *            </p>
     * @return createVpcLinkResult The response from the CreateVpcLink service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateVpcLinkResult createVpcLink(CreateVpcLinkRequest createVpcLinkRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the <a>ApiKey</a> resource.
     * </p>
     * 
     * @param deleteApiKeyRequest <p>
     *            A request to delete the <a>ApiKey</a> resource.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteApiKey(DeleteApiKeyRequest deleteApiKeyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes an existing <a>Authorizer</a> resource.
     * </p>
     * <div class="seeAlso"><a href=
     * "https://docs.aws.amazon.com/cli/latest/reference/apigateway/delete-authorizer.html"
     * >AWS CLI</a></div>
     * 
     * @param deleteAuthorizerRequest <p>
     *            Request to delete an existing <a>Authorizer</a> resource.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteAuthorizer(DeleteAuthorizerRequest deleteAuthorizerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param deleteBasePathMappingRequest <p>
     *            A request to delete the <a>BasePathMapping</a> resource.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteBasePathMapping(DeleteBasePathMappingRequest deleteBasePathMappingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the <a>ClientCertificate</a> resource.
     * </p>
     * 
     * @param deleteClientCertificateRequest <p>
     *            A request to delete the <a>ClientCertificate</a> resource.
     *            </p>
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteClientCertificate(DeleteClientCertificateRequest deleteClientCertificateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a <a>Deployment</a> resource. Deleting a deployment will only
     * succeed if there are no <a>Stage</a> resources associated with it.
     * </p>
     * 
     * @param deleteDeploymentRequest <p>
     *            Requests API Gateway to delete a <a>Deployment</a> resource.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteDeployment(DeleteDeploymentRequest deleteDeploymentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * @param deleteDocumentationPartRequest <p>
     *            Deletes an existing documentation part of an API.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteDocumentationPart(DeleteDocumentationPartRequest deleteDocumentationPartRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * @param deleteDocumentationVersionRequest <p>
     *            Deletes an existing documentation version of an API.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteDocumentationVersion(
            DeleteDocumentationVersionRequest deleteDocumentationVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the <a>DomainName</a> resource.
     * </p>
     * 
     * @param deleteDomainNameRequest <p>
     *            A request to delete the <a>DomainName</a> resource.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteDomainName(DeleteDomainNameRequest deleteDomainNameRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Clears any customization of a <a>GatewayResponse</a> of a specified
     * response type on the given <a>RestApi</a> and resets it with the default
     * settings.
     * </p>
     * 
     * @param deleteGatewayResponseRequest <p>
     *            Clears any customization of a <a>GatewayResponse</a> of a
     *            specified response type on the given <a>RestApi</a> and resets
     *            it with the default settings.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteGatewayResponse(DeleteGatewayResponseRequest deleteGatewayResponseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Represents a delete integration.
     * </p>
     * 
     * @param deleteIntegrationRequest <p>
     *            Represents a delete integration request.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteIntegration(DeleteIntegrationRequest deleteIntegrationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Represents a delete integration response.
     * </p>
     * 
     * @param deleteIntegrationResponseRequest <p>
     *            Represents a delete integration response request.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteIntegrationResponse(DeleteIntegrationResponseRequest deleteIntegrationResponseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an existing <a>Method</a> resource.
     * </p>
     * 
     * @param deleteMethodRequest <p>
     *            Request to delete an existing <a>Method</a> resource.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteMethod(DeleteMethodRequest deleteMethodRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes an existing <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param deleteMethodResponseRequest <p>
     *            A request to delete an existing <a>MethodResponse</a>
     *            resource.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteMethodResponse(DeleteMethodResponseRequest deleteMethodResponseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a model.
     * </p>
     * 
     * @param deleteModelRequest <p>
     *            Request to delete an existing model in an existing
     *            <a>RestApi</a> resource.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteModel(DeleteModelRequest deleteModelRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * </p>
     * 
     * @param deleteRequestValidatorRequest <p>
     *            Deletes a specified <a>RequestValidator</a> of a given
     *            <a>RestApi</a>.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteRequestValidator(DeleteRequestValidatorRequest deleteRequestValidatorRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a <a>Resource</a> resource.
     * </p>
     * 
     * @param deleteResourceRequest <p>
     *            Request to delete a <a>Resource</a>.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteResource(DeleteResourceRequest deleteResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified API.
     * </p>
     * 
     * @param deleteRestApiRequest <p>
     *            Request to delete the specified API from your collection.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteRestApi(DeleteRestApiRequest deleteRestApiRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a <a>Stage</a> resource.
     * </p>
     * 
     * @param deleteStageRequest <p>
     *            Requests API Gateway to delete a <a>Stage</a> resource.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteStage(DeleteStageRequest deleteStageRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a usage plan of a given plan Id.
     * </p>
     * 
     * @param deleteUsagePlanRequest <p>
     *            The DELETE request to delete a usage plan of a given plan Id.
     *            </p>
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteUsagePlan(DeleteUsagePlanRequest deleteUsagePlanRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a usage plan key and remove the underlying API key from the
     * associated usage plan.
     * </p>
     * 
     * @param deleteUsagePlanKeyRequest <p>
     *            The DELETE request to delete a usage plan key and remove the
     *            underlying API key from the associated usage plan.
     *            </p>
     * @throws BadRequestException
     * @throws ConflictException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteUsagePlanKey(DeleteUsagePlanKeyRequest deleteUsagePlanKeyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an existing <a>VpcLink</a> of a specified identifier.
     * </p>
     * 
     * @param deleteVpcLinkRequest <p>
     *            Deletes an existing <a>VpcLink</a> of a specified identifier.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteVpcLink(DeleteVpcLinkRequest deleteVpcLinkRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Flushes all authorizer cache entries on a stage.
     * </p>
     * 
     * @param flushStageAuthorizersCacheRequest <p>
     *            Request to flush authorizer cache entries on a specified
     *            stage.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void flushStageAuthorizersCache(
            FlushStageAuthorizersCacheRequest flushStageAuthorizersCacheRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Flushes a stage's cache.
     * </p>
     * 
     * @param flushStageCacheRequest <p>
     *            Requests API Gateway to flush a stage's cache.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void flushStageCache(FlushStageCacheRequest flushStageCacheRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Generates a <a>ClientCertificate</a> resource.
     * </p>
     * 
     * @param generateClientCertificateRequest <p>
     *            A request to generate a <a>ClientCertificate</a> resource.
     *            </p>
     * @return generateClientCertificateResult The response from the
     *         GenerateClientCertificate service method, as returned by Amazon
     *         API Gateway.
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GenerateClientCertificateResult generateClientCertificate(
            GenerateClientCertificateRequest generateClientCertificateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the current <a>Account</a> resource.
     * </p>
     * 
     * @param getAccountRequest <p>
     *            Requests API Gateway to get information about the current
     *            <a>Account</a> resource.
     *            </p>
     * @return getAccountResult The response from the GetAccount service method,
     *         as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetAccountResult getAccount(GetAccountRequest getAccountRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets information about the current <a>ApiKey</a> resource.
     * </p>
     * 
     * @param getApiKeyRequest <p>
     *            A request to get information about the current <a>ApiKey</a>
     *            resource.
     *            </p>
     * @return getApiKeyResult The response from the GetApiKey service method,
     *         as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetApiKeyResult getApiKey(GetApiKeyRequest getApiKeyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets information about the current <a>ApiKeys</a> resource.
     * </p>
     * 
     * @param getApiKeysRequest <p>
     *            A request to get information about the current <a>ApiKeys</a>
     *            resource.
     *            </p>
     * @return getApiKeysResult The response from the GetApiKeys service method,
     *         as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetApiKeysResult getApiKeys(GetApiKeysRequest getApiKeysRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describe an existing <a>Authorizer</a> resource.
     * </p>
     * <div class="seeAlso"><a href=
     * "https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-authorizer.html"
     * >AWS CLI</a></div>
     * 
     * @param getAuthorizerRequest <p>
     *            Request to describe an existing <a>Authorizer</a> resource.
     *            </p>
     * @return getAuthorizerResult The response from the GetAuthorizer service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetAuthorizerResult getAuthorizer(GetAuthorizerRequest getAuthorizerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describe an existing <a>Authorizers</a> resource.
     * </p>
     * <div class="seeAlso"><a href=
     * "https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-authorizers.html"
     * >AWS CLI</a></div>
     * 
     * @param getAuthorizersRequest <p>
     *            Request to describe an existing <a>Authorizers</a> resource.
     *            </p>
     * @return getAuthorizersResult The response from the GetAuthorizers service
     *         method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetAuthorizersResult getAuthorizers(GetAuthorizersRequest getAuthorizersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describe a <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param getBasePathMappingRequest <p>
     *            Request to describe a <a>BasePathMapping</a> resource.
     *            </p>
     * @return getBasePathMappingResult The response from the GetBasePathMapping
     *         service method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetBasePathMappingResult getBasePathMapping(GetBasePathMappingRequest getBasePathMappingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Represents a collection of <a>BasePathMapping</a> resources.
     * </p>
     * 
     * @param getBasePathMappingsRequest <p>
     *            A request to get information about a collection of
     *            <a>BasePathMapping</a> resources.
     *            </p>
     * @return getBasePathMappingsResult The response from the
     *         GetBasePathMappings service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetBasePathMappingsResult getBasePathMappings(
            GetBasePathMappingsRequest getBasePathMappingsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets information about the current <a>ClientCertificate</a> resource.
     * </p>
     * 
     * @param getClientCertificateRequest <p>
     *            A request to get information about the current
     *            <a>ClientCertificate</a> resource.
     *            </p>
     * @return getClientCertificateResult The response from the
     *         GetClientCertificate service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetClientCertificateResult getClientCertificate(
            GetClientCertificateRequest getClientCertificateRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets a collection of <a>ClientCertificate</a> resources.
     * </p>
     * 
     * @param getClientCertificatesRequest <p>
     *            A request to get information about a collection of
     *            <a>ClientCertificate</a> resources.
     *            </p>
     * @return getClientCertificatesResult The response from the
     *         GetClientCertificates service method, as returned by Amazon API
     *         Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetClientCertificatesResult getClientCertificates(
            GetClientCertificatesRequest getClientCertificatesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about a <a>Deployment</a> resource.
     * </p>
     * 
     * @param getDeploymentRequest <p>
     *            Requests API Gateway to get information about a
     *            <a>Deployment</a> resource.
     *            </p>
     * @return getDeploymentResult The response from the GetDeployment service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDeploymentResult getDeployment(GetDeploymentRequest getDeploymentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about a <a>Deployments</a> collection.
     * </p>
     * 
     * @param getDeploymentsRequest <p>
     *            Requests API Gateway to get information about a
     *            <a>Deployments</a> collection.
     *            </p>
     * @return getDeploymentsResult The response from the GetDeployments service
     *         method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDeploymentsResult getDeployments(GetDeploymentsRequest getDeploymentsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * @param getDocumentationPartRequest <p>
     *            Gets a specified documentation part of a given API.
     *            </p>
     * @return getDocumentationPartResult The response from the
     *         GetDocumentationPart service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDocumentationPartResult getDocumentationPart(
            GetDocumentationPartRequest getDocumentationPartRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * @param getDocumentationPartsRequest <p>
     *            Gets the documentation parts of an API. The result may be
     *            filtered by the type, name, or path of API entities (targets).
     *            </p>
     * @return getDocumentationPartsResult The response from the
     *         GetDocumentationParts service method, as returned by Amazon API
     *         Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDocumentationPartsResult getDocumentationParts(
            GetDocumentationPartsRequest getDocumentationPartsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * @param getDocumentationVersionRequest <p>
     *            Gets a documentation snapshot of an API.
     *            </p>
     * @return getDocumentationVersionResult The response from the
     *         GetDocumentationVersion service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDocumentationVersionResult getDocumentationVersion(
            GetDocumentationVersionRequest getDocumentationVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * @param getDocumentationVersionsRequest <p>
     *            Gets the documentation versions of an API.
     *            </p>
     * @return getDocumentationVersionsResult The response from the
     *         GetDocumentationVersions service method, as returned by Amazon
     *         API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDocumentationVersionsResult getDocumentationVersions(
            GetDocumentationVersionsRequest getDocumentationVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Represents a domain name that is contained in a simpler, more intuitive
     * URL that can be called.
     * </p>
     * 
     * @param getDomainNameRequest <p>
     *            Request to get the name of a <a>DomainName</a> resource.
     *            </p>
     * @return getDomainNameResult The response from the GetDomainName service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDomainNameResult getDomainName(GetDomainNameRequest getDomainNameRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Represents a collection of <a>DomainName</a> resources.
     * </p>
     * 
     * @param getDomainNamesRequest <p>
     *            Request to describe a collection of <a>DomainName</a>
     *            resources.
     *            </p>
     * @return getDomainNamesResult The response from the GetDomainNames service
     *         method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDomainNamesResult getDomainNames(GetDomainNamesRequest getDomainNamesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Exports a deployed version of a <a>RestApi</a> in a specified format.
     * </p>
     * 
     * @param getExportRequest <p>
     *            Request a new export of a <a>RestApi</a> for a particular
     *            <a>Stage</a>.
     *            </p>
     * @return getExportResult The response from the GetExport service method,
     *         as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetExportResult getExport(GetExportRequest getExportRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets a <a>GatewayResponse</a> of a specified response type on the given
     * <a>RestApi</a>.
     * </p>
     * 
     * @param getGatewayResponseRequest <p>
     *            Gets a <a>GatewayResponse</a> of a specified response type on
     *            the given <a>RestApi</a>.
     *            </p>
     * @return getGatewayResponseResult The response from the GetGatewayResponse
     *         service method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetGatewayResponseResult getGatewayResponse(GetGatewayResponseRequest getGatewayResponseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the <a>GatewayResponses</a> collection on the given <a>RestApi</a>.
     * If an API developer has not added any definitions for gateway responses,
     * the result will be the API Gateway-generated default
     * <a>GatewayResponses</a> collection for the supported response types.
     * </p>
     * 
     * @param getGatewayResponsesRequest <p>
     *            Gets the <a>GatewayResponses</a> collection on the given
     *            <a>RestApi</a>. If an API developer has not added any
     *            definitions for gateway responses, the result will be the API
     *            Gateway-generated default <a>GatewayResponses</a> collection
     *            for the supported response types.
     *            </p>
     * @return getGatewayResponsesResult The response from the
     *         GetGatewayResponses service method, as returned by Amazon API
     *         Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetGatewayResponsesResult getGatewayResponses(
            GetGatewayResponsesRequest getGatewayResponsesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Get the integration settings.
     * </p>
     * 
     * @param getIntegrationRequest <p>
     *            Represents a request to get the integration configuration.
     *            </p>
     * @return getIntegrationResult The response from the GetIntegration service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetIntegrationResult getIntegration(GetIntegrationRequest getIntegrationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Represents a get integration response.
     * </p>
     * 
     * @param getIntegrationResponseRequest <p>
     *            Represents a get integration response request.
     *            </p>
     * @return getIntegrationResponseResult The response from the
     *         GetIntegrationResponse service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetIntegrationResponseResult getIntegrationResponse(
            GetIntegrationResponseRequest getIntegrationResponseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describe an existing <a>Method</a> resource.
     * </p>
     * 
     * @param getMethodRequest <p>
     *            Request to describe an existing <a>Method</a> resource.
     *            </p>
     * @return getMethodResult The response from the GetMethod service method,
     *         as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetMethodResult getMethod(GetMethodRequest getMethodRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes a <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param getMethodResponseRequest <p>
     *            Request to describe a <a>MethodResponse</a> resource.
     *            </p>
     * @return getMethodResponseResult The response from the GetMethodResponse
     *         service method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetMethodResponseResult getMethodResponse(GetMethodResponseRequest getMethodResponseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes an existing model defined for a <a>RestApi</a> resource.
     * </p>
     * 
     * @param getModelRequest <p>
     *            Request to list information about a model in an existing
     *            <a>RestApi</a> resource.
     *            </p>
     * @return getModelResult The response from the GetModel service method, as
     *         returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetModelResult getModel(GetModelRequest getModelRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Generates a sample mapping template that can be used to transform a
     * payload into the structure of a model.
     * </p>
     * 
     * @param getModelTemplateRequest <p>
     *            Request to generate a sample mapping template used to
     *            transform the payload.
     *            </p>
     * @return getModelTemplateResult The response from the GetModelTemplate
     *         service method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetModelTemplateResult getModelTemplate(GetModelTemplateRequest getModelTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes existing <a>Models</a> defined for a <a>RestApi</a> resource.
     * </p>
     * 
     * @param getModelsRequest <p>
     *            Request to list existing <a>Models</a> defined for a
     *            <a>RestApi</a> resource.
     *            </p>
     * @return getModelsResult The response from the GetModels service method,
     *         as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetModelsResult getModels(GetModelsRequest getModelsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * </p>
     * 
     * @param getRequestValidatorRequest <p>
     *            Gets a <a>RequestValidator</a> of a given <a>RestApi</a>.
     *            </p>
     * @return getRequestValidatorResult The response from the
     *         GetRequestValidator service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRequestValidatorResult getRequestValidator(
            GetRequestValidatorRequest getRequestValidatorRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets the <a>RequestValidators</a> collection of a given <a>RestApi</a>.
     * </p>
     * 
     * @param getRequestValidatorsRequest <p>
     *            Gets the <a>RequestValidators</a> collection of a given
     *            <a>RestApi</a>.
     *            </p>
     * @return getRequestValidatorsResult The response from the
     *         GetRequestValidators service method, as returned by Amazon API
     *         Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRequestValidatorsResult getRequestValidators(
            GetRequestValidatorsRequest getRequestValidatorsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists information about a resource.
     * </p>
     * 
     * @param getResourceRequest <p>
     *            Request to list information about a resource.
     *            </p>
     * @return getResourceResult The response from the GetResource service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetResourceResult getResource(GetResourceRequest getResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists information about a collection of <a>Resource</a> resources.
     * </p>
     * 
     * @param getResourcesRequest <p>
     *            Request to list information about a collection of resources.
     *            </p>
     * @return getResourcesResult The response from the GetResources service
     *         method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetResourcesResult getResources(GetResourcesRequest getResourcesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the <a>RestApi</a> resource in the collection.
     * </p>
     * 
     * @param getRestApiRequest <p>
     *            The GET request to list an existing <a>RestApi</a> defined for
     *            your collection.
     *            </p>
     * @return getRestApiResult The response from the GetRestApi service method,
     *         as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRestApiResult getRestApi(GetRestApiRequest getRestApiRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the <a>RestApis</a> resources for your collection.
     * </p>
     * 
     * @param getRestApisRequest <p>
     *            The GET request to list existing <a>RestApis</a> defined for
     *            your collection.
     *            </p>
     * @return getRestApisResult The response from the GetRestApis service
     *         method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRestApisResult getRestApis(GetRestApisRequest getRestApisRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Generates a client SDK for a <a>RestApi</a> and <a>Stage</a>.
     * </p>
     * 
     * @param getSdkRequest <p>
     *            Request a new generated client SDK for a <a>RestApi</a> and
     *            <a>Stage</a>.
     *            </p>
     * @return getSdkResult The response from the GetSdk service method, as
     *         returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetSdkResult getSdk(GetSdkRequest getSdkRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * @param getSdkTypeRequest <p>
     *            Get an <a>SdkType</a> instance.
     *            </p>
     * @return getSdkTypeResult The response from the GetSdkType service method,
     *         as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetSdkTypeResult getSdkType(GetSdkTypeRequest getSdkTypeRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * @param getSdkTypesRequest <p>
     *            Get the <a>SdkTypes</a> collection.
     *            </p>
     * @return getSdkTypesResult The response from the GetSdkTypes service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetSdkTypesResult getSdkTypes(GetSdkTypesRequest getSdkTypesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about a <a>Stage</a> resource.
     * </p>
     * 
     * @param getStageRequest <p>
     *            Requests API Gateway to get information about a <a>Stage</a>
     *            resource.
     *            </p>
     * @return getStageResult The response from the GetStage service method, as
     *         returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetStageResult getStage(GetStageRequest getStageRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets information about one or more <a>Stage</a> resources.
     * </p>
     * 
     * @param getStagesRequest <p>
     *            Requests API Gateway to get information about one or more
     *            <a>Stage</a> resources.
     *            </p>
     * @return getStagesResult The response from the GetStages service method,
     *         as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetStagesResult getStages(GetStagesRequest getStagesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets the <a>Tags</a> collection for a given resource.
     * </p>
     * 
     * @param getTagsRequest <p>
     *            Gets the <a>Tags</a> collection for a given resource.
     *            </p>
     * @return getTagsResult The response from the GetTags service method, as
     *         returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetTagsResult getTags(GetTagsRequest getTagsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets the usage data of a usage plan in a specified time interval.
     * </p>
     * 
     * @param getUsageRequest <p>
     *            The GET request to get the usage data of a usage plan in a
     *            specified time interval.
     *            </p>
     * @return getUsageResult The response from the GetUsage service method, as
     *         returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetUsageResult getUsage(GetUsageRequest getUsageRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets a usage plan of a given plan identifier.
     * </p>
     * 
     * @param getUsagePlanRequest <p>
     *            The GET request to get a usage plan of a given plan
     *            identifier.
     *            </p>
     * @return getUsagePlanResult The response from the GetUsagePlan service
     *         method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetUsagePlanResult getUsagePlan(GetUsagePlanRequest getUsagePlanRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a usage plan key of a given key identifier.
     * </p>
     * 
     * @param getUsagePlanKeyRequest <p>
     *            The GET request to get a usage plan key of a given key
     *            identifier.
     *            </p>
     * @return getUsagePlanKeyResult The response from the GetUsagePlanKey
     *         service method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetUsagePlanKeyResult getUsagePlanKey(GetUsagePlanKeyRequest getUsagePlanKeyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets all the usage plan keys representing the API keys added to a
     * specified usage plan.
     * </p>
     * 
     * @param getUsagePlanKeysRequest <p>
     *            The GET request to get all the usage plan keys representing
     *            the API keys added to a specified usage plan.
     *            </p>
     * @return getUsagePlanKeysResult The response from the GetUsagePlanKeys
     *         service method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetUsagePlanKeysResult getUsagePlanKeys(GetUsagePlanKeysRequest getUsagePlanKeysRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets all the usage plans of the caller's account.
     * </p>
     * 
     * @param getUsagePlansRequest <p>
     *            The GET request to get all the usage plans of the caller's
     *            account.
     *            </p>
     * @return getUsagePlansResult The response from the GetUsagePlans service
     *         method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws ConflictException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetUsagePlansResult getUsagePlans(GetUsagePlansRequest getUsagePlansRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a specified VPC link under the caller's account in a region.
     * </p>
     * 
     * @param getVpcLinkRequest <p>
     *            Gets a specified VPC link under the caller's account in a
     *            region.
     *            </p>
     * @return getVpcLinkResult The response from the GetVpcLink service method,
     *         as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetVpcLinkResult getVpcLink(GetVpcLinkRequest getVpcLinkRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets the <a>VpcLinks</a> collection under the caller's account in a
     * selected region.
     * </p>
     * 
     * @param getVpcLinksRequest <p>
     *            Gets the <a>VpcLinks</a> collection under the caller's account
     *            in a selected region.
     *            </p>
     * @return getVpcLinksResult The response from the GetVpcLinks service
     *         method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetVpcLinksResult getVpcLinks(GetVpcLinksRequest getVpcLinksRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Import API keys from an external source, such as a CSV-formatted file.
     * </p>
     * 
     * @param importApiKeysRequest <p>
     *            The POST request to import API keys from an external source,
     *            such as a CSV-formatted file.
     *            </p>
     * @return importApiKeysResult The response from the ImportApiKeys service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ImportApiKeysResult importApiKeys(ImportApiKeysRequest importApiKeysRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * @param importDocumentationPartsRequest <p>
     *            Import documentation parts from an external (e.g., OpenAPI)
     *            definition file.
     *            </p>
     * @return importDocumentationPartsResult The response from the
     *         ImportDocumentationParts service method, as returned by Amazon
     *         API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ImportDocumentationPartsResult importDocumentationParts(
            ImportDocumentationPartsRequest importDocumentationPartsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * A feature of the API Gateway control service for creating a new API from
     * an external API definition file.
     * </p>
     * 
     * @param importRestApiRequest <p>
     *            A POST request to import an API to API Gateway using an input
     *            of an API definition file.
     *            </p>
     * @return importRestApiResult The response from the ImportRestApi service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ImportRestApiResult importRestApi(ImportRestApiRequest importRestApiRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a customization of a <a>GatewayResponse</a> of a specified
     * response type and status code on the given <a>RestApi</a>.
     * </p>
     * 
     * @param putGatewayResponseRequest <p>
     *            Creates a customization of a <a>GatewayResponse</a> of a
     *            specified response type and status code on the given
     *            <a>RestApi</a>.
     *            </p>
     * @return putGatewayResponseResult The response from the PutGatewayResponse
     *         service method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutGatewayResponseResult putGatewayResponse(PutGatewayResponseRequest putGatewayResponseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets up a method's integration.
     * </p>
     * 
     * @param putIntegrationRequest <p>
     *            Sets up a method's integration.
     *            </p>
     * @return putIntegrationResult The response from the PutIntegration service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutIntegrationResult putIntegration(PutIntegrationRequest putIntegrationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Represents a put integration.
     * </p>
     * 
     * @param putIntegrationResponseRequest <p>
     *            Represents a put integration response request.
     *            </p>
     * @return putIntegrationResponseResult The response from the
     *         PutIntegrationResponse service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutIntegrationResponseResult putIntegrationResponse(
            PutIntegrationResponseRequest putIntegrationResponseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Add a method to an existing <a>Resource</a> resource.
     * </p>
     * 
     * @param putMethodRequest <p>
     *            Request to add a method to an existing <a>Resource</a>
     *            resource.
     *            </p>
     * @return putMethodResult The response from the PutMethod service method,
     *         as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutMethodResult putMethod(PutMethodRequest putMethodRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Adds a <a>MethodResponse</a> to an existing <a>Method</a> resource.
     * </p>
     * 
     * @param putMethodResponseRequest <p>
     *            Request to add a <a>MethodResponse</a> to an existing
     *            <a>Method</a> resource.
     *            </p>
     * @return putMethodResponseResult The response from the PutMethodResponse
     *         service method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutMethodResponseResult putMethodResponse(PutMethodResponseRequest putMethodResponseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * A feature of the API Gateway control service for updating an existing API
     * with an input of external API definitions. The update can take the form
     * of merging the supplied definition into the existing API or overwriting
     * the existing API.
     * </p>
     * 
     * @param putRestApiRequest <p>
     *            A PUT request to update an existing API, with external API
     *            definitions specified as the request body.
     *            </p>
     * @return putRestApiResult The response from the PutRestApi service method,
     *         as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws LimitExceededException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutRestApiResult putRestApi(PutRestApiRequest putRestApiRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Adds or updates a tag on a given resource.
     * </p>
     * 
     * @param tagResourceRequest <p>
     *            Adds or updates a tag on a given resource.
     *            </p>
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void tagResource(TagResourceRequest tagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Simulate the execution of an <a>Authorizer</a> in your <a>RestApi</a>
     * with headers, parameters, and an incoming request body.
     * </p>
     * <div class="seeAlso"> <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-use-lambda-authorizer.html"
     * >Use Lambda Function as Authorizer</a> <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-integrate-with-cognito.html"
     * >Use Cognito User Pool as Authorizer</a> </div>
     * 
     * @param testInvokeAuthorizerRequest <p>
     *            Make a request to simulate the execution of an
     *            <a>Authorizer</a>.
     *            </p>
     * @return testInvokeAuthorizerResult The response from the
     *         TestInvokeAuthorizer service method, as returned by Amazon API
     *         Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    TestInvokeAuthorizerResult testInvokeAuthorizer(
            TestInvokeAuthorizerRequest testInvokeAuthorizerRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Simulate the execution of a <a>Method</a> in your <a>RestApi</a> with
     * headers, parameters, and an incoming request body.
     * </p>
     * 
     * @param testInvokeMethodRequest <p>
     *            Make a request to simulate the execution of a <a>Method</a>.
     *            </p>
     * @return testInvokeMethodResult The response from the TestInvokeMethod
     *         service method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    TestInvokeMethodResult testInvokeMethod(TestInvokeMethodRequest testInvokeMethodRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes a tag from a given resource.
     * </p>
     * 
     * @param untagResourceRequest <p>
     *            Removes a tag from a given resource.
     *            </p>
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void untagResource(UntagResourceRequest untagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Changes information about the current <a>Account</a> resource.
     * </p>
     * 
     * @param updateAccountRequest <p>
     *            Requests API Gateway to change information about the current
     *            <a>Account</a> resource.
     *            </p>
     * @return updateAccountResult The response from the UpdateAccount service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateAccountResult updateAccount(UpdateAccountRequest updateAccountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Changes information about an <a>ApiKey</a> resource.
     * </p>
     * 
     * @param updateApiKeyRequest <p>
     *            A request to change information about an <a>ApiKey</a>
     *            resource.
     *            </p>
     * @return updateApiKeyResult The response from the UpdateApiKey service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateApiKeyResult updateApiKey(UpdateApiKeyRequest updateApiKeyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an existing <a>Authorizer</a> resource.
     * </p>
     * <div class="seeAlso"><a href=
     * "https://docs.aws.amazon.com/cli/latest/reference/apigateway/update-authorizer.html"
     * >AWS CLI</a></div>
     * 
     * @param updateAuthorizerRequest <p>
     *            Request to update an existing <a>Authorizer</a> resource.
     *            </p>
     * @return updateAuthorizerResult The response from the UpdateAuthorizer
     *         service method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateAuthorizerResult updateAuthorizer(UpdateAuthorizerRequest updateAuthorizerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Changes information about the <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param updateBasePathMappingRequest <p>
     *            A request to change information about the
     *            <a>BasePathMapping</a> resource.
     *            </p>
     * @return updateBasePathMappingResult The response from the
     *         UpdateBasePathMapping service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateBasePathMappingResult updateBasePathMapping(
            UpdateBasePathMappingRequest updateBasePathMappingRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Changes information about an <a>ClientCertificate</a> resource.
     * </p>
     * 
     * @param updateClientCertificateRequest <p>
     *            A request to change information about an
     *            <a>ClientCertificate</a> resource.
     *            </p>
     * @return updateClientCertificateResult The response from the
     *         UpdateClientCertificate service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateClientCertificateResult updateClientCertificate(
            UpdateClientCertificateRequest updateClientCertificateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Changes information about a <a>Deployment</a> resource.
     * </p>
     * 
     * @param updateDeploymentRequest <p>
     *            Requests API Gateway to change information about a
     *            <a>Deployment</a> resource.
     *            </p>
     * @return updateDeploymentResult The response from the UpdateDeployment
     *         service method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateDeploymentResult updateDeployment(UpdateDeploymentRequest updateDeploymentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * @param updateDocumentationPartRequest <p>
     *            Updates an existing documentation part of a given API.
     *            </p>
     * @return updateDocumentationPartResult The response from the
     *         UpdateDocumentationPart service method, as returned by Amazon API
     *         Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateDocumentationPartResult updateDocumentationPart(
            UpdateDocumentationPartRequest updateDocumentationPartRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * @param updateDocumentationVersionRequest <p>
     *            Updates an existing documentation version of an API.
     *            </p>
     * @return updateDocumentationVersionResult The response from the
     *         UpdateDocumentationVersion service method, as returned by Amazon
     *         API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateDocumentationVersionResult updateDocumentationVersion(
            UpdateDocumentationVersionRequest updateDocumentationVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Changes information about the <a>DomainName</a> resource.
     * </p>
     * 
     * @param updateDomainNameRequest <p>
     *            A request to change information about the <a>DomainName</a>
     *            resource.
     *            </p>
     * @return updateDomainNameResult The response from the UpdateDomainName
     *         service method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateDomainNameResult updateDomainName(UpdateDomainNameRequest updateDomainNameRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a <a>GatewayResponse</a> of a specified response type on the
     * given <a>RestApi</a>.
     * </p>
     * 
     * @param updateGatewayResponseRequest <p>
     *            Updates a <a>GatewayResponse</a> of a specified response type
     *            on the given <a>RestApi</a>.
     *            </p>
     * @return updateGatewayResponseResult The response from the
     *         UpdateGatewayResponse service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateGatewayResponseResult updateGatewayResponse(
            UpdateGatewayResponseRequest updateGatewayResponseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Represents an update integration.
     * </p>
     * 
     * @param updateIntegrationRequest <p>
     *            Represents an update integration request.
     *            </p>
     * @return updateIntegrationResult The response from the UpdateIntegration
     *         service method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateIntegrationResult updateIntegration(UpdateIntegrationRequest updateIntegrationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Represents an update integration response.
     * </p>
     * 
     * @param updateIntegrationResponseRequest <p>
     *            Represents an update integration response request.
     *            </p>
     * @return updateIntegrationResponseResult The response from the
     *         UpdateIntegrationResponse service method, as returned by Amazon
     *         API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateIntegrationResponseResult updateIntegrationResponse(
            UpdateIntegrationResponseRequest updateIntegrationResponseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an existing <a>Method</a> resource.
     * </p>
     * 
     * @param updateMethodRequest <p>
     *            Request to update an existing <a>Method</a> resource.
     *            </p>
     * @return updateMethodResult The response from the UpdateMethod service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateMethodResult updateMethod(UpdateMethodRequest updateMethodRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an existing <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param updateMethodResponseRequest <p>
     *            A request to update an existing <a>MethodResponse</a>
     *            resource.
     *            </p>
     * @return updateMethodResponseResult The response from the
     *         UpdateMethodResponse service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateMethodResponseResult updateMethodResponse(
            UpdateMethodResponseRequest updateMethodResponseRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Changes information about a model.
     * </p>
     * 
     * @param updateModelRequest <p>
     *            Request to update an existing model in an existing
     *            <a>RestApi</a> resource.
     *            </p>
     * @return updateModelResult The response from the UpdateModel service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateModelResult updateModel(UpdateModelRequest updateModelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * </p>
     * 
     * @param updateRequestValidatorRequest <p>
     *            Updates a <a>RequestValidator</a> of a given <a>RestApi</a>.
     *            </p>
     * @return updateRequestValidatorResult The response from the
     *         UpdateRequestValidator service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateRequestValidatorResult updateRequestValidator(
            UpdateRequestValidatorRequest updateRequestValidatorRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Changes information about a <a>Resource</a> resource.
     * </p>
     * 
     * @param updateResourceRequest <p>
     *            Request to change information about a <a>Resource</a>
     *            resource.
     *            </p>
     * @return updateResourceResult The response from the UpdateResource service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateResourceResult updateResource(UpdateResourceRequest updateResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Changes information about the specified API.
     * </p>
     * 
     * @param updateRestApiRequest <p>
     *            Request to update an existing <a>RestApi</a> resource in your
     *            collection.
     *            </p>
     * @return updateRestApiResult The response from the UpdateRestApi service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateRestApiResult updateRestApi(UpdateRestApiRequest updateRestApiRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Changes information about a <a>Stage</a> resource.
     * </p>
     * 
     * @param updateStageRequest <p>
     *            Requests API Gateway to change information about a
     *            <a>Stage</a> resource.
     *            </p>
     * @return updateStageResult The response from the UpdateStage service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateStageResult updateStage(UpdateStageRequest updateStageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Grants a temporary extension to the remaining quota of a usage plan
     * associated with a specified API key.
     * </p>
     * 
     * @param updateUsageRequest <p>
     *            The PATCH request to grant a temporary extension to the
     *            remaining quota of a usage plan associated with a specified
     *            API key.
     *            </p>
     * @return updateUsageResult The response from the UpdateUsage service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateUsageResult updateUsage(UpdateUsageRequest updateUsageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a usage plan of a given plan Id.
     * </p>
     * 
     * @param updateUsagePlanRequest <p>
     *            The PATCH request to update a usage plan of a given plan Id.
     *            </p>
     * @return updateUsagePlanResult The response from the UpdateUsagePlan
     *         service method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateUsagePlanResult updateUsagePlan(UpdateUsagePlanRequest updateUsagePlanRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an existing <a>VpcLink</a> of a specified identifier.
     * </p>
     * 
     * @param updateVpcLinkRequest <p>
     *            Updates an existing <a>VpcLink</a> of a specified identifier.
     *            </p>
     * @return updateVpcLinkResult The response from the UpdateVpcLink service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
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
