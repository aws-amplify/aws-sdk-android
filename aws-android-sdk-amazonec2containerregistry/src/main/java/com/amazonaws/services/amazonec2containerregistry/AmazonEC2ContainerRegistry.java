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

package com.amazonaws.services.amazonec2containerregistry;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.amazonec2containerregistry.model.*;

/**
 * Interface for accessing Amazon EC2 Container Registry <fullname>Amazon
 * Elastic Container Registry</fullname>
 * <p>
 * Amazon Elastic Container Registry (Amazon ECR) is a managed Docker registry
 * service. Customers can use the familiar Docker CLI to push, pull, and manage
 * images. Amazon ECR provides a secure, scalable, and reliable registry. Amazon
 * ECR supports private Docker repositories with resource-based permissions
 * using IAM so that specific users or Amazon EC2 instances can access
 * repositories and images. Developers can use the Docker CLI to author and
 * manage images.
 * </p>
 **/
public interface AmazonEC2ContainerRegistry {

    /**
     * Overrides the default endpoint for this client
     * ("https://api.ecr.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "api.ecr.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://api.ecr.us-east-1.amazonaws.com"). If the protocol is not
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
     * @param endpoint The endpoint (ex: "api.ecr.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://api.ecr.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonEC2ContainerRegistry#setEndpoint(String)},
     * sets the regional endpoint for this client's service calls. Callers can
     * use this method to control which AWS region they want to work with.
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
     * Checks the availability of one or more image layers in a repository.
     * </p>
     * <p>
     * When an image is pushed to a repository, each image layer is checked to
     * verify if it has been uploaded before. If it has been uploaded, then the
     * image layer is skipped.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy and is not generally used
     * by customers for pulling and pushing images. In most cases, you should
     * use the <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param batchCheckLayerAvailabilityRequest
     * @return batchCheckLayerAvailabilityResult The response from the
     *         BatchCheckLayerAvailability service method, as returned by Amazon
     *         EC2 Container Registry.
     * @throws RepositoryNotFoundException
     * @throws InvalidParameterException
     * @throws ServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    BatchCheckLayerAvailabilityResult batchCheckLayerAvailability(
            BatchCheckLayerAvailabilityRequest batchCheckLayerAvailabilityRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a list of specified images within a repository. Images are
     * specified with either an <code>imageTag</code> or
     * <code>imageDigest</code>.
     * </p>
     * <p>
     * You can remove a tag from an image by specifying the image's tag in your
     * request. When you remove the last tag from an image, the image is deleted
     * from your repository.
     * </p>
     * <p>
     * You can completely delete an image (and all of its tags) by specifying
     * the image's digest in your request.
     * </p>
     * 
     * @param batchDeleteImageRequest <p>
     *            Deletes specified images within a specified repository. Images
     *            are specified with either the <code>imageTag</code> or
     *            <code>imageDigest</code>.
     *            </p>
     * @return batchDeleteImageResult The response from the BatchDeleteImage
     *         service method, as returned by Amazon EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    BatchDeleteImageResult batchDeleteImage(BatchDeleteImageRequest batchDeleteImageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets detailed information for an image. Images are specified with either
     * an <code>imageTag</code> or <code>imageDigest</code>.
     * </p>
     * <p>
     * When an image is pulled, the BatchGetImage API is called once to retrieve
     * the image manifest.
     * </p>
     * 
     * @param batchGetImageRequest
     * @return batchGetImageResult The response from the BatchGetImage service
     *         method, as returned by Amazon EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    BatchGetImageResult batchGetImage(BatchGetImageRequest batchGetImageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Informs Amazon ECR that the image layer upload has completed for a
     * specified registry, repository name, and upload ID. You can optionally
     * provide a <code>sha256</code> digest of the image layer for data
     * validation purposes.
     * </p>
     * <p>
     * When an image is pushed, the CompleteLayerUpload API is called once per
     * each new image layer to verify that the upload has completed.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy and is not generally used
     * by customers for pulling and pushing images. In most cases, you should
     * use the <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param completeLayerUploadRequest
     * @return completeLayerUploadResult The response from the
     *         CompleteLayerUpload service method, as returned by Amazon EC2
     *         Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws UploadNotFoundException
     * @throws InvalidLayerException
     * @throws LayerPartTooSmallException
     * @throws LayerAlreadyExistsException
     * @throws EmptyUploadException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CompleteLayerUploadResult completeLayerUpload(
            CompleteLayerUploadRequest completeLayerUploadRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a repository. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECR/latest/userguide/Repositories.html"
     * >Amazon ECR Repositories</a> in the <i>Amazon Elastic Container Registry
     * User Guide</i>.
     * </p>
     * 
     * @param createRepositoryRequest
     * @return createRepositoryResult The response from the CreateRepository
     *         service method, as returned by Amazon EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws InvalidTagParameterException
     * @throws TooManyTagsException
     * @throws RepositoryAlreadyExistsException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateRepositoryResult createRepository(CreateRepositoryRequest createRepositoryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the lifecycle policy associated with the specified repository.
     * </p>
     * 
     * @param deleteLifecyclePolicyRequest
     * @return deleteLifecyclePolicyResult The response from the
     *         DeleteLifecyclePolicy service method, as returned by Amazon EC2
     *         Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws LifecyclePolicyNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteLifecyclePolicyResult deleteLifecyclePolicy(
            DeleteLifecyclePolicyRequest deleteLifecyclePolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a repository. If the repository contains images, you must either
     * delete all images in the repository or use the <code>force</code> option
     * to delete the repository.
     * </p>
     * 
     * @param deleteRepositoryRequest
     * @return deleteRepositoryResult The response from the DeleteRepository
     *         service method, as returned by Amazon EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws RepositoryNotEmptyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteRepositoryResult deleteRepository(DeleteRepositoryRequest deleteRepositoryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the repository policy associated with the specified repository.
     * </p>
     * 
     * @param deleteRepositoryPolicyRequest
     * @return deleteRepositoryPolicyResult The response from the
     *         DeleteRepositoryPolicy service method, as returned by Amazon EC2
     *         Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws RepositoryPolicyNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteRepositoryPolicyResult deleteRepositoryPolicy(
            DeleteRepositoryPolicyRequest deleteRepositoryPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the scan findings for the specified image.
     * </p>
     * 
     * @param describeImageScanFindingsRequest
     * @return describeImageScanFindingsResult The response from the
     *         DescribeImageScanFindings service method, as returned by Amazon
     *         EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws ImageNotFoundException
     * @throws ScanNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeImageScanFindingsResult describeImageScanFindings(
            DescribeImageScanFindingsRequest describeImageScanFindingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns metadata about the images in a repository.
     * </p>
     * <note>
     * <p>
     * Beginning with Docker version 1.9, the Docker client compresses image
     * layers before pushing them to a V2 Docker registry. The output of the
     * <code>docker images</code> command shows the uncompressed image size, so
     * it may return a larger image size than the image sizes returned by
     * <a>DescribeImages</a>.
     * </p>
     * </note>
     * 
     * @param describeImagesRequest
     * @return describeImagesResult The response from the DescribeImages service
     *         method, as returned by Amazon EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws ImageNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeImagesResult describeImages(DescribeImagesRequest describeImagesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes image repositories in a registry.
     * </p>
     * 
     * @param describeRepositoriesRequest
     * @return describeRepositoriesResult The response from the
     *         DescribeRepositories service method, as returned by Amazon EC2
     *         Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeRepositoriesResult describeRepositories(
            DescribeRepositoriesRequest describeRepositoriesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves an authorization token. An authorization token represents your
     * IAM authentication credentials and can be used to access any Amazon ECR
     * registry that your IAM principal has access to. The authorization token
     * is valid for 12 hours.
     * </p>
     * <p>
     * The <code>authorizationToken</code> returned is a base64 encoded string
     * that can be decoded and used in a <code>docker login</code> command to
     * authenticate to a registry. The AWS CLI offers an
     * <code>get-login-password</code> command that simplifies the login
     * process. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECR/latest/userguide/Registries.html#registry_auth"
     * >Registry Authentication</a> in the <i>Amazon Elastic Container Registry
     * User Guide</i>.
     * </p>
     * 
     * @param getAuthorizationTokenRequest
     * @return getAuthorizationTokenResult The response from the
     *         GetAuthorizationToken service method, as returned by Amazon EC2
     *         Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetAuthorizationTokenResult getAuthorizationToken(
            GetAuthorizationTokenRequest getAuthorizationTokenRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the pre-signed Amazon S3 download URL corresponding to an image
     * layer. You can only get URLs for image layers that are referenced in an
     * image.
     * </p>
     * <p>
     * When an image is pulled, the GetDownloadUrlForLayer API is called once
     * per image layer that is not already cached.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy and is not generally used
     * by customers for pulling and pushing images. In most cases, you should
     * use the <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param getDownloadUrlForLayerRequest
     * @return getDownloadUrlForLayerResult The response from the
     *         GetDownloadUrlForLayer service method, as returned by Amazon EC2
     *         Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws LayersNotFoundException
     * @throws LayerInaccessibleException
     * @throws RepositoryNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetDownloadUrlForLayerResult getDownloadUrlForLayer(
            GetDownloadUrlForLayerRequest getDownloadUrlForLayerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the lifecycle policy for the specified repository.
     * </p>
     * 
     * @param getLifecyclePolicyRequest
     * @return getLifecyclePolicyResult The response from the GetLifecyclePolicy
     *         service method, as returned by Amazon EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws LifecyclePolicyNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetLifecyclePolicyResult getLifecyclePolicy(GetLifecyclePolicyRequest getLifecyclePolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the results of the lifecycle policy preview request for the
     * specified repository.
     * </p>
     * 
     * @param getLifecyclePolicyPreviewRequest
     * @return getLifecyclePolicyPreviewResult The response from the
     *         GetLifecyclePolicyPreview service method, as returned by Amazon
     *         EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws LifecyclePolicyPreviewNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetLifecyclePolicyPreviewResult getLifecyclePolicyPreview(
            GetLifecyclePolicyPreviewRequest getLifecyclePolicyPreviewRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the repository policy for the specified repository.
     * </p>
     * 
     * @param getRepositoryPolicyRequest
     * @return getRepositoryPolicyResult The response from the
     *         GetRepositoryPolicy service method, as returned by Amazon EC2
     *         Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws RepositoryPolicyNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetRepositoryPolicyResult getRepositoryPolicy(
            GetRepositoryPolicyRequest getRepositoryPolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Notifies Amazon ECR that you intend to upload an image layer.
     * </p>
     * <p>
     * When an image is pushed, the InitiateLayerUpload API is called once per
     * image layer that has not already been uploaded. Whether or not an image
     * layer has been uploaded is determined by the BatchCheckLayerAvailability
     * API action.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy and is not generally used
     * by customers for pulling and pushing images. In most cases, you should
     * use the <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param initiateLayerUploadRequest
     * @return initiateLayerUploadResult The response from the
     *         InitiateLayerUpload service method, as returned by Amazon EC2
     *         Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    InitiateLayerUploadResult initiateLayerUpload(
            InitiateLayerUploadRequest initiateLayerUploadRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists all the image IDs for the specified repository.
     * </p>
     * <p>
     * You can filter images based on whether or not they are tagged by using
     * the <code>tagStatus</code> filter and specifying either
     * <code>TAGGED</code>, <code>UNTAGGED</code> or <code>ANY</code>. For
     * example, you can filter your results to return only <code>UNTAGGED</code>
     * images and then pipe that result to a <a>BatchDeleteImage</a> operation
     * to delete them. Or, you can filter your results to return only
     * <code>TAGGED</code> images to list all of the tags in your repository.
     * </p>
     * 
     * @param listImagesRequest
     * @return listImagesResult The response from the ListImages service method,
     *         as returned by Amazon EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListImagesResult listImages(ListImagesRequest listImagesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * List the tags for an Amazon ECR resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon EC2
     *         Container Registry.
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws ServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates or updates the image manifest and tags associated with an image.
     * </p>
     * <p>
     * When an image is pushed and all new image layers have been uploaded, the
     * PutImage API is called once to create or update the image manifest and
     * the tags associated with the image.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy and is not generally used
     * by customers for pulling and pushing images. In most cases, you should
     * use the <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param putImageRequest
     * @return putImageResult The response from the PutImage service method, as
     *         returned by Amazon EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws ImageAlreadyExistsException
     * @throws LayersNotFoundException
     * @throws ReferencedImagesNotFoundException
     * @throws LimitExceededException
     * @throws ImageTagAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    PutImageResult putImage(PutImageRequest putImageRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates the image scanning configuration for the specified repository.
     * </p>
     * 
     * @param putImageScanningConfigurationRequest
     * @return putImageScanningConfigurationResult The response from the
     *         PutImageScanningConfiguration service method, as returned by
     *         Amazon EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    PutImageScanningConfigurationResult putImageScanningConfiguration(
            PutImageScanningConfigurationRequest putImageScanningConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the image tag mutability settings for the specified repository.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-tag-mutability.html"
     * >Image Tag Mutability</a> in the <i>Amazon Elastic Container Registry
     * User Guide</i>.
     * </p>
     * 
     * @param putImageTagMutabilityRequest
     * @return putImageTagMutabilityResult The response from the
     *         PutImageTagMutability service method, as returned by Amazon EC2
     *         Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    PutImageTagMutabilityResult putImageTagMutability(
            PutImageTagMutabilityRequest putImageTagMutabilityRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates or updates the lifecycle policy for the specified repository. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html"
     * >Lifecycle Policy Template</a>.
     * </p>
     * 
     * @param putLifecyclePolicyRequest
     * @return putLifecyclePolicyResult The response from the PutLifecyclePolicy
     *         service method, as returned by Amazon EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    PutLifecyclePolicyResult putLifecyclePolicy(PutLifecyclePolicyRequest putLifecyclePolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Applies a repository policy to the specified repository to control access
     * permissions. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECR/latest/userguide/RepositoryPolicies.html"
     * >Amazon ECR Repository Policies</a> in the <i>Amazon Elastic Container
     * Registry User Guide</i>.
     * </p>
     * 
     * @param setRepositoryPolicyRequest
     * @return setRepositoryPolicyResult The response from the
     *         SetRepositoryPolicy service method, as returned by Amazon EC2
     *         Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    SetRepositoryPolicyResult setRepositoryPolicy(
            SetRepositoryPolicyRequest setRepositoryPolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Starts an image vulnerability scan. An image scan can only be started
     * once per day on an individual image. This limit includes if an image was
     * scanned on initial push. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html"
     * >Image Scanning</a> in the <i>Amazon Elastic Container Registry User
     * Guide</i>.
     * </p>
     * 
     * @param startImageScanRequest
     * @return startImageScanResult The response from the StartImageScan service
     *         method, as returned by Amazon EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws UnsupportedImageTypeException
     * @throws LimitExceededException
     * @throws RepositoryNotFoundException
     * @throws ImageNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    StartImageScanResult startImageScan(StartImageScanRequest startImageScanRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts a preview of a lifecycle policy for the specified repository. This
     * allows you to see the results before associating the lifecycle policy
     * with the repository.
     * </p>
     * 
     * @param startLifecyclePolicyPreviewRequest
     * @return startLifecyclePolicyPreviewResult The response from the
     *         StartLifecyclePolicyPreview service method, as returned by Amazon
     *         EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws LifecyclePolicyNotFoundException
     * @throws LifecyclePolicyPreviewInProgressException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    StartLifecyclePolicyPreviewResult startLifecyclePolicyPreview(
            StartLifecyclePolicyPreviewRequest startLifecyclePolicyPreviewRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds specified tags to a resource with the specified ARN. Existing tags
     * on a resource are not changed if they are not specified in the request
     * parameters.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon EC2 Container Registry.
     * @throws InvalidParameterException
     * @throws InvalidTagParameterException
     * @throws TooManyTagsException
     * @throws RepositoryNotFoundException
     * @throws ServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon EC2 Container Registry.
     * @throws InvalidParameterException
     * @throws InvalidTagParameterException
     * @throws TooManyTagsException
     * @throws RepositoryNotFoundException
     * @throws ServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Uploads an image layer part to Amazon ECR.
     * </p>
     * <p>
     * When an image is pushed, each new image layer is uploaded in parts. The
     * maximum size of each image layer part can be 20971520 bytes (or about
     * 20MB). The UploadLayerPart API is called once per each new image layer
     * part.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy and is not generally used
     * by customers for pulling and pushing images. In most cases, you should
     * use the <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param uploadLayerPartRequest
     * @return uploadLayerPartResult The response from the UploadLayerPart
     *         service method, as returned by Amazon EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws InvalidLayerPartException
     * @throws RepositoryNotFoundException
     * @throws UploadNotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UploadLayerPartResult uploadLayerPart(UploadLayerPartRequest uploadLayerPartRequest)
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
