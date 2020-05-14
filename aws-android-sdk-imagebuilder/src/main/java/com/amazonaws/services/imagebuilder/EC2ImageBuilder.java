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

package com.amazonaws.services.imagebuilder;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.imagebuilder.model.*;

/**
 * Interface for accessing EC2 Image Builder
 * <p>
 * EC2 Image Builder is a fully managed AWS service that makes it easier to
 * automate the creation, management, and deployment of customized, secure, and
 * up-to-date “golden” server images that are pre-installed and pre-configured
 * with software and settings to meet specific IT standards.
 * </p>
 **/
public interface EC2ImageBuilder {

    /**
     * Overrides the default endpoint for this client
     * ("https://imagebuilder.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "imagebuilder.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://imagebuilder.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex: "imagebuilder.us-east-1.amazonaws.com")
     *            or a full URL, including the protocol (ex:
     *            "https://imagebuilder.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link EC2ImageBuilder#setEndpoint(String)}, sets the
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
     * CancelImageCreation cancels the creation of Image. This operation can
     * only be used on images in a non-terminal state.
     * </p>
     * 
     * @param cancelImageCreationRequest
     * @return cancelImageCreationResult The response from the
     *         CancelImageCreation service method, as returned by EC2 Image
     *         Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws IdempotentParameterMismatchException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CancelImageCreationResult cancelImageCreation(
            CancelImageCreationRequest cancelImageCreationRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a new component that can be used to build, validate, test, and
     * assess your image.
     * </p>
     * 
     * @param createComponentRequest
     * @return createComponentResult The response from the CreateComponent
     *         service method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws IdempotentParameterMismatchException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws InvalidVersionNumberException
     * @throws ResourceInUseException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateComponentResult createComponent(CreateComponentRequest createComponentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new distribution configuration. Distribution configurations
     * define and configure the outputs of your pipeline.
     * </p>
     * 
     * @param createDistributionConfigurationRequest
     * @return createDistributionConfigurationResult The response from the
     *         CreateDistributionConfiguration service method, as returned by
     *         EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws IdempotentParameterMismatchException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceInUseException
     * @throws ResourceAlreadyExistsException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateDistributionConfigurationResult createDistributionConfiguration(
            CreateDistributionConfigurationRequest createDistributionConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new image. This request will create a new image along with all
     * of the configured output resources defined in the distribution
     * configuration.
     * </p>
     * 
     * @param createImageRequest
     * @return createImageResult The response from the CreateImage service
     *         method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws IdempotentParameterMismatchException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateImageResult createImage(CreateImageRequest createImageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new image pipeline. Image pipelines enable you to automate the
     * creation and distribution of images.
     * </p>
     * 
     * @param createImagePipelineRequest
     * @return createImagePipelineResult The response from the
     *         CreateImagePipeline service method, as returned by EC2 Image
     *         Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws IdempotentParameterMismatchException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceInUseException
     * @throws ResourceAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateImagePipelineResult createImagePipeline(
            CreateImagePipelineRequest createImagePipelineRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a new image recipe. Image recipes define how images are
     * configured, tested, and assessed.
     * </p>
     * 
     * @param createImageRecipeRequest
     * @return createImageRecipeResult The response from the CreateImageRecipe
     *         service method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws IdempotentParameterMismatchException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws InvalidVersionNumberException
     * @throws ResourceInUseException
     * @throws ResourceAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateImageRecipeResult createImageRecipe(CreateImageRecipeRequest createImageRecipeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new infrastructure configuration. An infrastructure
     * configuration defines the environment in which your image will be built
     * and tested.
     * </p>
     * 
     * @param createInfrastructureConfigurationRequest
     * @return createInfrastructureConfigurationResult The response from the
     *         CreateInfrastructureConfiguration service method, as returned by
     *         EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws IdempotentParameterMismatchException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceInUseException
     * @throws ResourceAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateInfrastructureConfigurationResult createInfrastructureConfiguration(
            CreateInfrastructureConfigurationRequest createInfrastructureConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a component build version.
     * </p>
     * 
     * @param deleteComponentRequest
     * @return deleteComponentResult The response from the DeleteComponent
     *         service method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceDependencyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteComponentResult deleteComponent(DeleteComponentRequest deleteComponentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a distribution configuration.
     * </p>
     * 
     * @param deleteDistributionConfigurationRequest
     * @return deleteDistributionConfigurationResult The response from the
     *         DeleteDistributionConfiguration service method, as returned by
     *         EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws InvalidRequestException
     * @throws ServiceUnavailableException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceDependencyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteDistributionConfigurationResult deleteDistributionConfiguration(
            DeleteDistributionConfigurationRequest deleteDistributionConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an image.
     * </p>
     * 
     * @param deleteImageRequest
     * @return deleteImageResult The response from the DeleteImage service
     *         method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws InvalidRequestException
     * @throws ServiceUnavailableException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceDependencyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteImageResult deleteImage(DeleteImageRequest deleteImageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an image pipeline.
     * </p>
     * 
     * @param deleteImagePipelineRequest
     * @return deleteImagePipelineResult The response from the
     *         DeleteImagePipeline service method, as returned by EC2 Image
     *         Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceDependencyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteImagePipelineResult deleteImagePipeline(
            DeleteImagePipelineRequest deleteImagePipelineRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes an image recipe.
     * </p>
     * 
     * @param deleteImageRecipeRequest
     * @return deleteImageRecipeResult The response from the DeleteImageRecipe
     *         service method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceDependencyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteImageRecipeResult deleteImageRecipe(DeleteImageRecipeRequest deleteImageRecipeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an infrastructure configuration.
     * </p>
     * 
     * @param deleteInfrastructureConfigurationRequest
     * @return deleteInfrastructureConfigurationResult The response from the
     *         DeleteInfrastructureConfiguration service method, as returned by
     *         EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceDependencyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteInfrastructureConfigurationResult deleteInfrastructureConfiguration(
            DeleteInfrastructureConfigurationRequest deleteInfrastructureConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a component object.
     * </p>
     * 
     * @param getComponentRequest
     * @return getComponentResult The response from the GetComponent service
     *         method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetComponentResult getComponent(GetComponentRequest getComponentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a component policy.
     * </p>
     * 
     * @param getComponentPolicyRequest
     * @return getComponentPolicyResult The response from the GetComponentPolicy
     *         service method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ServiceUnavailableException
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetComponentPolicyResult getComponentPolicy(GetComponentPolicyRequest getComponentPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a distribution configuration.
     * </p>
     * 
     * @param getDistributionConfigurationRequest
     * @return getDistributionConfigurationResult The response from the
     *         GetDistributionConfiguration service method, as returned by EC2
     *         Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetDistributionConfigurationResult getDistributionConfiguration(
            GetDistributionConfigurationRequest getDistributionConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets an image.
     * </p>
     * 
     * @param getImageRequest
     * @return getImageResult The response from the GetImage service method, as
     *         returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetImageResult getImage(GetImageRequest getImageRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets an image pipeline.
     * </p>
     * 
     * @param getImagePipelineRequest
     * @return getImagePipelineResult The response from the GetImagePipeline
     *         service method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetImagePipelineResult getImagePipeline(GetImagePipelineRequest getImagePipelineRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets an image policy.
     * </p>
     * 
     * @param getImagePolicyRequest
     * @return getImagePolicyResult The response from the GetImagePolicy service
     *         method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ServiceUnavailableException
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetImagePolicyResult getImagePolicy(GetImagePolicyRequest getImagePolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets an image recipe.
     * </p>
     * 
     * @param getImageRecipeRequest
     * @return getImageRecipeResult The response from the GetImageRecipe service
     *         method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetImageRecipeResult getImageRecipe(GetImageRecipeRequest getImageRecipeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets an image recipe policy.
     * </p>
     * 
     * @param getImageRecipePolicyRequest
     * @return getImageRecipePolicyResult The response from the
     *         GetImageRecipePolicy service method, as returned by EC2 Image
     *         Builder.
     * @throws ServiceException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetImageRecipePolicyResult getImageRecipePolicy(
            GetImageRecipePolicyRequest getImageRecipePolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets an infrastructure configuration.
     * </p>
     * 
     * @param getInfrastructureConfigurationRequest <p>
     *            GetInfrastructureConfiguration request object.
     *            </p>
     * @return getInfrastructureConfigurationResult The response from the
     *         GetInfrastructureConfiguration service method, as returned by EC2
     *         Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetInfrastructureConfigurationResult getInfrastructureConfiguration(
            GetInfrastructureConfigurationRequest getInfrastructureConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Imports a component and transforms its data into a component document.
     * </p>
     * 
     * @param importComponentRequest
     * @return importComponentResult The response from the ImportComponent
     *         service method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws IdempotentParameterMismatchException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws InvalidVersionNumberException
     * @throws ResourceInUseException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ImportComponentResult importComponent(ImportComponentRequest importComponentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the list of component build versions for the specified semantic
     * version.
     * </p>
     * 
     * @param listComponentBuildVersionsRequest
     * @return listComponentBuildVersionsResult The response from the
     *         ListComponentBuildVersions service method, as returned by EC2
     *         Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws InvalidPaginationTokenException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListComponentBuildVersionsResult listComponentBuildVersions(
            ListComponentBuildVersionsRequest listComponentBuildVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the list of component build versions for the specified semantic
     * version.
     * </p>
     * 
     * @param listComponentsRequest
     * @return listComponentsResult The response from the ListComponents service
     *         method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws InvalidPaginationTokenException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListComponentsResult listComponents(ListComponentsRequest listComponentsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of distribution configurations.
     * </p>
     * 
     * @param listDistributionConfigurationsRequest
     * @return listDistributionConfigurationsResult The response from the
     *         ListDistributionConfigurations service method, as returned by EC2
     *         Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws InvalidPaginationTokenException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListDistributionConfigurationsResult listDistributionConfigurations(
            ListDistributionConfigurationsRequest listDistributionConfigurationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of distribution configurations.
     * </p>
     * 
     * @param listImageBuildVersionsRequest
     * @return listImageBuildVersionsResult The response from the
     *         ListImageBuildVersions service method, as returned by EC2 Image
     *         Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws InvalidPaginationTokenException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListImageBuildVersionsResult listImageBuildVersions(
            ListImageBuildVersionsRequest listImageBuildVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of images created by the specified pipeline.
     * </p>
     * 
     * @param listImagePipelineImagesRequest
     * @return listImagePipelineImagesResult The response from the
     *         ListImagePipelineImages service method, as returned by EC2 Image
     *         Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws InvalidPaginationTokenException
     * @throws ResourceNotFoundException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListImagePipelineImagesResult listImagePipelineImages(
            ListImagePipelineImagesRequest listImagePipelineImagesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of image pipelines.
     * </p>
     * 
     * @param listImagePipelinesRequest
     * @return listImagePipelinesResult The response from the ListImagePipelines
     *         service method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws InvalidPaginationTokenException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListImagePipelinesResult listImagePipelines(ListImagePipelinesRequest listImagePipelinesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of image recipes.
     * </p>
     * 
     * @param listImageRecipesRequest
     * @return listImageRecipesResult The response from the ListImageRecipes
     *         service method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws InvalidPaginationTokenException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListImageRecipesResult listImageRecipes(ListImageRecipesRequest listImageRecipesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the list of image build versions for the specified semantic
     * version.
     * </p>
     * 
     * @param listImagesRequest
     * @return listImagesResult The response from the ListImages service method,
     *         as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws InvalidPaginationTokenException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListImagesResult listImages(ListImagesRequest listImagesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of infrastructure configurations.
     * </p>
     * 
     * @param listInfrastructureConfigurationsRequest
     * @return listInfrastructureConfigurationsResult The response from the
     *         ListInfrastructureConfigurations service method, as returned by
     *         EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws InvalidPaginationTokenException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListInfrastructureConfigurationsResult listInfrastructureConfigurations(
            ListInfrastructureConfigurationsRequest listInfrastructureConfigurationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the list of tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by EC2 Image
     *         Builder.
     * @throws ServiceException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Applies a policy to a component. We recommend that you call the RAM API
     * <a href=
     * "https://docs.aws.amazon.com/ram/latest/APIReference/API_CreateResourceShare.html"
     * >CreateResourceShare</a> to share resources. If you call the Image
     * Builder API <code>PutComponentPolicy</code>, you must also call the RAM
     * API <a href=
     * "https://docs.aws.amazon.com/ram/latest/APIReference/API_PromoteResourceShareCreatedFromPolicy.html"
     * >PromoteResourceShareCreatedFromPolicy</a> in order for the resource to
     * be visible to all principals with whom the resource is shared.
     * </p>
     * 
     * @param putComponentPolicyRequest
     * @return putComponentPolicyResult The response from the PutComponentPolicy
     *         service method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    PutComponentPolicyResult putComponentPolicy(PutComponentPolicyRequest putComponentPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Applies a policy to an image. We recommend that you call the RAM API <a
     * href=
     * "https://docs.aws.amazon.com/ram/latest/APIReference/API_CreateResourceShare.html"
     * >CreateResourceShare</a> to share resources. If you call the Image
     * Builder API <code>PutImagePolicy</code>, you must also call the RAM API
     * <a href=
     * "https://docs.aws.amazon.com/ram/latest/APIReference/API_PromoteResourceShareCreatedFromPolicy.html"
     * >PromoteResourceShareCreatedFromPolicy</a> in order for the resource to
     * be visible to all principals with whom the resource is shared.
     * </p>
     * 
     * @param putImagePolicyRequest
     * @return putImagePolicyResult The response from the PutImagePolicy service
     *         method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    PutImagePolicyResult putImagePolicy(PutImagePolicyRequest putImagePolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Applies a policy to an image recipe. We recommend that you call the RAM
     * API <a href=
     * "https://docs.aws.amazon.com/ram/latest/APIReference/API_CreateResourceShare.html"
     * >CreateResourceShare</a> to share resources. If you call the Image
     * Builder API <code>PutImageRecipePolicy</code>, you must also call the RAM
     * API <a href=
     * "https://docs.aws.amazon.com/ram/latest/APIReference/API_PromoteResourceShareCreatedFromPolicy.html"
     * >PromoteResourceShareCreatedFromPolicy</a> in order for the resource to
     * be visible to all principals with whom the resource is shared.
     * </p>
     * 
     * @param putImageRecipePolicyRequest
     * @return putImageRecipePolicyResult The response from the
     *         PutImageRecipePolicy service method, as returned by EC2 Image
     *         Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    PutImageRecipePolicyResult putImageRecipePolicy(
            PutImageRecipePolicyRequest putImageRecipePolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Manually triggers a pipeline to create an image.
     * </p>
     * 
     * @param startImagePipelineExecutionRequest
     * @return startImagePipelineExecutionResult The response from the
     *         StartImagePipelineExecution service method, as returned by EC2
     *         Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws IdempotentParameterMismatchException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    StartImagePipelineExecutionResult startImagePipelineExecution(
            StartImagePipelineExecutionRequest startImagePipelineExecutionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds a tag to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes a tag from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a new distribution configuration. Distribution configurations
     * define and configure the outputs of your pipeline.
     * </p>
     * 
     * @param updateDistributionConfigurationRequest
     * @return updateDistributionConfigurationResult The response from the
     *         UpdateDistributionConfiguration service method, as returned by
     *         EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws IdempotentParameterMismatchException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceInUseException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateDistributionConfigurationResult updateDistributionConfiguration(
            UpdateDistributionConfigurationRequest updateDistributionConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a new image pipeline. Image pipelines enable you to automate the
     * creation and distribution of images.
     * </p>
     * 
     * @param updateImagePipelineRequest
     * @return updateImagePipelineResult The response from the
     *         UpdateImagePipeline service method, as returned by EC2 Image
     *         Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws IdempotentParameterMismatchException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateImagePipelineResult updateImagePipeline(
            UpdateImagePipelineRequest updateImagePipelineRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates a new infrastructure configuration. An infrastructure
     * configuration defines the environment in which your image will be built
     * and tested.
     * </p>
     * 
     * @param updateInfrastructureConfigurationRequest
     * @return updateInfrastructureConfigurationResult The response from the
     *         UpdateInfrastructureConfiguration service method, as returned by
     *         EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws IdempotentParameterMismatchException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateInfrastructureConfigurationResult updateInfrastructureConfiguration(
            UpdateInfrastructureConfigurationRequest updateInfrastructureConfigurationRequest)
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
