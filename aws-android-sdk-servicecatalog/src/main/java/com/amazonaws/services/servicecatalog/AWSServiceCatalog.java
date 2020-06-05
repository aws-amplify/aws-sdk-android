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

package com.amazonaws.services.servicecatalog;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.servicecatalog.model.*;

/**
 * Interface for accessing AWS Service Catalog <fullname>AWS Service
 * Catalog</fullname>
 * <p>
 * <a href="https://aws.amazon.com/servicecatalog/">AWS Service Catalog</a>
 * enables organizations to create and manage catalogs of IT services that are
 * approved for use on AWS. To get the most out of this documentation, you
 * should be familiar with the terminology discussed in <a href=
 * "http://docs.aws.amazon.com/servicecatalog/latest/adminguide/what-is_concepts.html"
 * >AWS Service Catalog Concepts</a>.
 * </p>
 **/
public interface AWSServiceCatalog {

    /**
     * Overrides the default endpoint for this client
     * ("https://servicecatalog.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "servicecatalog.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://servicecatalog.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex:
     *            "servicecatalog.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex:
     *            "https://servicecatalog.us-east-1.amazonaws.com") of the
     *            region specific AWS endpoint this client will communicate
     *            with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSServiceCatalog#setEndpoint(String)}, sets the
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
     * Accepts an offer to share the specified portfolio.
     * </p>
     * 
     * @param acceptPortfolioShareRequest
     * @return acceptPortfolioShareResult The response from the
     *         AcceptPortfolioShare service method, as returned by AWS Service
     *         Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    AcceptPortfolioShareResult acceptPortfolioShare(
            AcceptPortfolioShareRequest acceptPortfolioShareRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Associates the specified budget with the specified resource.
     * </p>
     * 
     * @param associateBudgetWithResourceRequest
     * @return associateBudgetWithResourceResult The response from the
     *         AssociateBudgetWithResource service method, as returned by AWS
     *         Service Catalog.
     * @throws InvalidParametersException
     * @throws DuplicateResourceException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    AssociateBudgetWithResourceResult associateBudgetWithResource(
            AssociateBudgetWithResourceRequest associateBudgetWithResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates the specified principal ARN with the specified portfolio.
     * </p>
     * 
     * @param associatePrincipalWithPortfolioRequest
     * @return associatePrincipalWithPortfolioResult The response from the
     *         AssociatePrincipalWithPortfolio service method, as returned by
     *         AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    AssociatePrincipalWithPortfolioResult associatePrincipalWithPortfolio(
            AssociatePrincipalWithPortfolioRequest associatePrincipalWithPortfolioRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates the specified product with the specified portfolio.
     * </p>
     * 
     * @param associateProductWithPortfolioRequest
     * @return associateProductWithPortfolioResult The response from the
     *         AssociateProductWithPortfolio service method, as returned by AWS
     *         Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    AssociateProductWithPortfolioResult associateProductWithPortfolio(
            AssociateProductWithPortfolioRequest associateProductWithPortfolioRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates a self-service action with a provisioning artifact.
     * </p>
     * 
     * @param associateServiceActionWithProvisioningArtifactRequest
     * @return associateServiceActionWithProvisioningArtifactResult The response
     *         from the AssociateServiceActionWithProvisioningArtifact service
     *         method, as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws DuplicateResourceException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    AssociateServiceActionWithProvisioningArtifactResult associateServiceActionWithProvisioningArtifact(
            AssociateServiceActionWithProvisioningArtifactRequest associateServiceActionWithProvisioningArtifactRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associate the specified TagOption with the specified portfolio or
     * product.
     * </p>
     * 
     * @param associateTagOptionWithResourceRequest
     * @return associateTagOptionWithResourceResult The response from the
     *         AssociateTagOptionWithResource service method, as returned by AWS
     *         Service Catalog.
     * @throws TagOptionNotMigratedException
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws LimitExceededException
     * @throws DuplicateResourceException
     * @throws InvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    AssociateTagOptionWithResourceResult associateTagOptionWithResource(
            AssociateTagOptionWithResourceRequest associateTagOptionWithResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates multiple self-service actions with provisioning artifacts.
     * </p>
     * 
     * @param batchAssociateServiceActionWithProvisioningArtifactRequest
     * @return batchAssociateServiceActionWithProvisioningArtifactResult The
     *         response from the
     *         BatchAssociateServiceActionWithProvisioningArtifact service
     *         method, as returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    BatchAssociateServiceActionWithProvisioningArtifactResult batchAssociateServiceActionWithProvisioningArtifact(
            BatchAssociateServiceActionWithProvisioningArtifactRequest batchAssociateServiceActionWithProvisioningArtifactRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates a batch of self-service actions from the specified
     * provisioning artifact.
     * </p>
     * 
     * @param batchDisassociateServiceActionFromProvisioningArtifactRequest
     * @return batchDisassociateServiceActionFromProvisioningArtifactResult The
     *         response from the
     *         BatchDisassociateServiceActionFromProvisioningArtifact service
     *         method, as returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    BatchDisassociateServiceActionFromProvisioningArtifactResult batchDisassociateServiceActionFromProvisioningArtifact(
            BatchDisassociateServiceActionFromProvisioningArtifactRequest batchDisassociateServiceActionFromProvisioningArtifactRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Copies the specified source product to the specified target product or a
     * new product.
     * </p>
     * <p>
     * You can copy a product to the same account or another account. You can
     * copy a product to the same region or another region.
     * </p>
     * <p>
     * This operation is performed asynchronously. To track the progress of the
     * operation, use <a>DescribeCopyProductStatus</a>.
     * </p>
     * 
     * @param copyProductRequest
     * @return copyProductResult The response from the CopyProduct service
     *         method, as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CopyProductResult copyProduct(CopyProductRequest copyProductRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a constraint.
     * </p>
     * 
     * @param createConstraintRequest
     * @return createConstraintResult The response from the CreateConstraint
     *         service method, as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws LimitExceededException
     * @throws DuplicateResourceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateConstraintResult createConstraint(CreateConstraintRequest createConstraintRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a portfolio.
     * </p>
     * 
     * @param createPortfolioRequest
     * @return createPortfolioResult The response from the CreatePortfolio
     *         service method, as returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws LimitExceededException
     * @throws TagOptionNotMigratedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreatePortfolioResult createPortfolio(CreatePortfolioRequest createPortfolioRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Shares the specified portfolio with the specified account or organization
     * node. Shares to an organization node can only be created by the master
     * account of an Organization. AWSOrganizationsAccess must be enabled in
     * order to create a portfolio share to an organization node.
     * </p>
     * 
     * @param createPortfolioShareRequest
     * @return createPortfolioShareResult The response from the
     *         CreatePortfolioShare service method, as returned by AWS Service
     *         Catalog.
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InvalidParametersException
     * @throws OperationNotSupportedException
     * @throws InvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreatePortfolioShareResult createPortfolioShare(
            CreatePortfolioShareRequest createPortfolioShareRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a product.
     * </p>
     * 
     * @param createProductRequest
     * @return createProductResult The response from the CreateProduct service
     *         method, as returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws LimitExceededException
     * @throws TagOptionNotMigratedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateProductResult createProduct(CreateProductRequest createProductRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a plan. A plan includes the list of resources to be created (when
     * provisioning a new product) or modified (when updating a provisioned
     * product) when the plan is executed.
     * </p>
     * <p>
     * You can create one plan per provisioned product. To create a plan for an
     * existing provisioned product, the product status must be AVAILBLE or
     * TAINTED.
     * </p>
     * <p>
     * To view the resource changes in the change set, use
     * <a>DescribeProvisionedProductPlan</a>. To create or modify the
     * provisioned product, use <a>ExecuteProvisionedProductPlan</a>.
     * </p>
     * 
     * @param createProvisionedProductPlanRequest
     * @return createProvisionedProductPlanResult The response from the
     *         CreateProvisionedProductPlan service method, as returned by AWS
     *         Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws InvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateProvisionedProductPlanResult createProvisionedProductPlan(
            CreateProvisionedProductPlanRequest createProvisionedProductPlanRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a provisioning artifact (also known as a version) for the
     * specified product.
     * </p>
     * <p>
     * You cannot create a provisioning artifact for a product that was shared
     * with you.
     * </p>
     * 
     * @param createProvisioningArtifactRequest
     * @return createProvisioningArtifactResult The response from the
     *         CreateProvisioningArtifact service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateProvisioningArtifactResult createProvisioningArtifact(
            CreateProvisioningArtifactRequest createProvisioningArtifactRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a self-service action.
     * </p>
     * 
     * @param createServiceActionRequest
     * @return createServiceActionResult The response from the
     *         CreateServiceAction service method, as returned by AWS Service
     *         Catalog.
     * @throws InvalidParametersException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateServiceActionResult createServiceAction(
            CreateServiceActionRequest createServiceActionRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a TagOption.
     * </p>
     * 
     * @param createTagOptionRequest
     * @return createTagOptionResult The response from the CreateTagOption
     *         service method, as returned by AWS Service Catalog.
     * @throws TagOptionNotMigratedException
     * @throws DuplicateResourceException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateTagOptionResult createTagOption(CreateTagOptionRequest createTagOptionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified constraint.
     * </p>
     * 
     * @param deleteConstraintRequest
     * @return deleteConstraintResult The response from the DeleteConstraint
     *         service method, as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteConstraintResult deleteConstraint(DeleteConstraintRequest deleteConstraintRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified portfolio.
     * </p>
     * <p>
     * You cannot delete a portfolio if it was shared with you or if it has
     * associated products, users, constraints, or shared accounts.
     * </p>
     * 
     * @param deletePortfolioRequest
     * @return deletePortfolioResult The response from the DeletePortfolio
     *         service method, as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws ResourceInUseException
     * @throws TagOptionNotMigratedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeletePortfolioResult deletePortfolio(DeletePortfolioRequest deletePortfolioRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops sharing the specified portfolio with the specified account or
     * organization node. Shares to an organization node can only be deleted by
     * the master account of an Organization.
     * </p>
     * 
     * @param deletePortfolioShareRequest
     * @return deletePortfolioShareResult The response from the
     *         DeletePortfolioShare service method, as returned by AWS Service
     *         Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws OperationNotSupportedException
     * @throws InvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeletePortfolioShareResult deletePortfolioShare(
            DeletePortfolioShareRequest deletePortfolioShareRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified product.
     * </p>
     * <p>
     * You cannot delete a product if it was shared with you or is associated
     * with a portfolio.
     * </p>
     * 
     * @param deleteProductRequest
     * @return deleteProductResult The response from the DeleteProduct service
     *         method, as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws InvalidParametersException
     * @throws TagOptionNotMigratedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteProductResult deleteProduct(DeleteProductRequest deleteProductRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified plan.
     * </p>
     * 
     * @param deleteProvisionedProductPlanRequest
     * @return deleteProvisionedProductPlanResult The response from the
     *         DeleteProvisionedProductPlan service method, as returned by AWS
     *         Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteProvisionedProductPlanResult deleteProvisionedProductPlan(
            DeleteProvisionedProductPlanRequest deleteProvisionedProductPlanRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified provisioning artifact (also known as a version) for
     * the specified product.
     * </p>
     * <p>
     * You cannot delete a provisioning artifact associated with a product that
     * was shared with you. You cannot delete the last provisioning artifact for
     * a product, because a product must have at least one provisioning
     * artifact.
     * </p>
     * 
     * @param deleteProvisioningArtifactRequest
     * @return deleteProvisioningArtifactResult The response from the
     *         DeleteProvisioningArtifact service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteProvisioningArtifactResult deleteProvisioningArtifact(
            DeleteProvisioningArtifactRequest deleteProvisioningArtifactRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a self-service action.
     * </p>
     * 
     * @param deleteServiceActionRequest
     * @return deleteServiceActionResult The response from the
     *         DeleteServiceAction service method, as returned by AWS Service
     *         Catalog.
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteServiceActionResult deleteServiceAction(
            DeleteServiceActionRequest deleteServiceActionRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified TagOption.
     * </p>
     * <p>
     * You cannot delete a TagOption if it is associated with a product or
     * portfolio.
     * </p>
     * 
     * @param deleteTagOptionRequest
     * @return deleteTagOptionResult The response from the DeleteTagOption
     *         service method, as returned by AWS Service Catalog.
     * @throws TagOptionNotMigratedException
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteTagOptionResult deleteTagOption(DeleteTagOptionRequest deleteTagOptionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the specified constraint.
     * </p>
     * 
     * @param describeConstraintRequest
     * @return describeConstraintResult The response from the DescribeConstraint
     *         service method, as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeConstraintResult describeConstraint(DescribeConstraintRequest describeConstraintRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the status of the specified copy product operation.
     * </p>
     * 
     * @param describeCopyProductStatusRequest
     * @return describeCopyProductStatusResult The response from the
     *         DescribeCopyProductStatus service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeCopyProductStatusResult describeCopyProductStatus(
            DescribeCopyProductStatusRequest describeCopyProductStatusRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the specified portfolio.
     * </p>
     * 
     * @param describePortfolioRequest
     * @return describePortfolioResult The response from the DescribePortfolio
     *         service method, as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribePortfolioResult describePortfolio(DescribePortfolioRequest describePortfolioRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the status of the specified portfolio share operation. This API can
     * only be called by the master account in the organization.
     * </p>
     * 
     * @param describePortfolioShareStatusRequest
     * @return describePortfolioShareStatusResult The response from the
     *         DescribePortfolioShareStatus service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws OperationNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribePortfolioShareStatusResult describePortfolioShareStatus(
            DescribePortfolioShareStatusRequest describePortfolioShareStatusRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the specified product.
     * </p>
     * 
     * @param describeProductRequest
     * @return describeProductResult The response from the DescribeProduct
     *         service method, as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeProductResult describeProduct(DescribeProductRequest describeProductRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the specified product. This operation is run with
     * administrator access.
     * </p>
     * 
     * @param describeProductAsAdminRequest
     * @return describeProductAsAdminResult The response from the
     *         DescribeProductAsAdmin service method, as returned by AWS Service
     *         Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeProductAsAdminResult describeProductAsAdmin(
            DescribeProductAsAdminRequest describeProductAsAdminRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the specified product.
     * </p>
     * 
     * @param describeProductViewRequest
     * @return describeProductViewResult The response from the
     *         DescribeProductView service method, as returned by AWS Service
     *         Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeProductViewResult describeProductView(
            DescribeProductViewRequest describeProductViewRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets information about the specified provisioned product.
     * </p>
     * 
     * @param describeProvisionedProductRequest
     * @return describeProvisionedProductResult The response from the
     *         DescribeProvisionedProduct service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeProvisionedProductResult describeProvisionedProduct(
            DescribeProvisionedProductRequest describeProvisionedProductRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the resource changes for the specified plan.
     * </p>
     * 
     * @param describeProvisionedProductPlanRequest
     * @return describeProvisionedProductPlanResult The response from the
     *         DescribeProvisionedProductPlan service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeProvisionedProductPlanResult describeProvisionedProductPlan(
            DescribeProvisionedProductPlanRequest describeProvisionedProductPlanRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the specified provisioning artifact (also known as
     * a version) for the specified product.
     * </p>
     * 
     * @param describeProvisioningArtifactRequest
     * @return describeProvisioningArtifactResult The response from the
     *         DescribeProvisioningArtifact service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeProvisioningArtifactResult describeProvisioningArtifact(
            DescribeProvisioningArtifactRequest describeProvisioningArtifactRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the configuration required to provision the
     * specified product using the specified provisioning artifact.
     * </p>
     * <p>
     * If the output contains a TagOption key with an empty list of values,
     * there is a TagOption conflict for that key. The end user cannot take
     * action to fix the conflict, and launch is not blocked. In subsequent
     * calls to <a>ProvisionProduct</a>, do not include conflicted TagOption
     * keys as tags, or this causes the error
     * "Parameter validation failed: Missing required parameter in Tags[<i>N</i>]:<i>Value</i>"
     * . Tag the provisioned product with the value
     * <code>sc-tagoption-conflict-portfolioId-productId</code>.
     * </p>
     * 
     * @param describeProvisioningParametersRequest
     * @return describeProvisioningParametersResult The response from the
     *         DescribeProvisioningParameters service method, as returned by AWS
     *         Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeProvisioningParametersResult describeProvisioningParameters(
            DescribeProvisioningParametersRequest describeProvisioningParametersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the specified request operation.
     * </p>
     * <p>
     * Use this operation after calling a request operation (for example,
     * <a>ProvisionProduct</a>, <a>TerminateProvisionedProduct</a>, or
     * <a>UpdateProvisionedProduct</a>).
     * </p>
     * <note>
     * <p>
     * If a provisioned product was transferred to a new owner using
     * <a>UpdateProvisionedProductProperties</a>, the new owner will be able to
     * describe all past records for that product. The previous owner will no
     * longer be able to describe the records, but will be able to use
     * <a>ListRecordHistory</a> to see the product's history from when he was
     * the owner.
     * </p>
     * </note>
     * 
     * @param describeRecordRequest
     * @return describeRecordResult The response from the DescribeRecord service
     *         method, as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeRecordResult describeRecord(DescribeRecordRequest describeRecordRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes a self-service action.
     * </p>
     * 
     * @param describeServiceActionRequest
     * @return describeServiceActionResult The response from the
     *         DescribeServiceAction service method, as returned by AWS Service
     *         Catalog.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeServiceActionResult describeServiceAction(
            DescribeServiceActionRequest describeServiceActionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Finds the default parameters for a specific self-service action on a
     * specific provisioned product and returns a map of the results to the
     * user.
     * </p>
     * 
     * @param describeServiceActionExecutionParametersRequest
     * @return describeServiceActionExecutionParametersResult The response from
     *         the DescribeServiceActionExecutionParameters service method, as
     *         returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeServiceActionExecutionParametersResult describeServiceActionExecutionParameters(
            DescribeServiceActionExecutionParametersRequest describeServiceActionExecutionParametersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the specified TagOption.
     * </p>
     * 
     * @param describeTagOptionRequest
     * @return describeTagOptionResult The response from the DescribeTagOption
     *         service method, as returned by AWS Service Catalog.
     * @throws TagOptionNotMigratedException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeTagOptionResult describeTagOption(DescribeTagOptionRequest describeTagOptionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disable portfolio sharing through AWS Organizations feature. This feature
     * will not delete your current shares but it will prevent you from creating
     * new shares throughout your organization. Current shares will not be in
     * sync with your organization structure if it changes after calling this
     * API. This API can only be called by the master account in the
     * organization.
     * </p>
     * 
     * @param disableAWSOrganizationsAccessRequest
     * @return disableAWSOrganizationsAccessResult The response from the
     *         DisableAWSOrganizationsAccess service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidStateException
     * @throws OperationNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DisableAWSOrganizationsAccessResult disableAWSOrganizationsAccess(
            DisableAWSOrganizationsAccessRequest disableAWSOrganizationsAccessRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates the specified budget from the specified resource.
     * </p>
     * 
     * @param disassociateBudgetFromResourceRequest
     * @return disassociateBudgetFromResourceResult The response from the
     *         DisassociateBudgetFromResource service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DisassociateBudgetFromResourceResult disassociateBudgetFromResource(
            DisassociateBudgetFromResourceRequest disassociateBudgetFromResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates a previously associated principal ARN from a specified
     * portfolio.
     * </p>
     * 
     * @param disassociatePrincipalFromPortfolioRequest
     * @return disassociatePrincipalFromPortfolioResult The response from the
     *         DisassociatePrincipalFromPortfolio service method, as returned by
     *         AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DisassociatePrincipalFromPortfolioResult disassociatePrincipalFromPortfolio(
            DisassociatePrincipalFromPortfolioRequest disassociatePrincipalFromPortfolioRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates the specified product from the specified portfolio.
     * </p>
     * 
     * @param disassociateProductFromPortfolioRequest
     * @return disassociateProductFromPortfolioResult The response from the
     *         DisassociateProductFromPortfolio service method, as returned by
     *         AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DisassociateProductFromPortfolioResult disassociateProductFromPortfolio(
            DisassociateProductFromPortfolioRequest disassociateProductFromPortfolioRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates the specified self-service action association from the
     * specified provisioning artifact.
     * </p>
     * 
     * @param disassociateServiceActionFromProvisioningArtifactRequest
     * @return disassociateServiceActionFromProvisioningArtifactResult The
     *         response from the
     *         DisassociateServiceActionFromProvisioningArtifact service method,
     *         as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DisassociateServiceActionFromProvisioningArtifactResult disassociateServiceActionFromProvisioningArtifact(
            DisassociateServiceActionFromProvisioningArtifactRequest disassociateServiceActionFromProvisioningArtifactRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates the specified TagOption from the specified resource.
     * </p>
     * 
     * @param disassociateTagOptionFromResourceRequest
     * @return disassociateTagOptionFromResourceResult The response from the
     *         DisassociateTagOptionFromResource service method, as returned by
     *         AWS Service Catalog.
     * @throws TagOptionNotMigratedException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DisassociateTagOptionFromResourceResult disassociateTagOptionFromResource(
            DisassociateTagOptionFromResourceRequest disassociateTagOptionFromResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enable portfolio sharing feature through AWS Organizations. This API will
     * allow Service Catalog to receive updates on your organization in order to
     * sync your shares with the current structure. This API can only be called
     * by the master account in the organization.
     * </p>
     * <p>
     * By calling this API Service Catalog will make a call to
     * organizations:EnableAWSServiceAccess on your behalf so that your shares
     * can be in sync with any changes in your AWS Organizations structure.
     * </p>
     * 
     * @param enableAWSOrganizationsAccessRequest
     * @return enableAWSOrganizationsAccessResult The response from the
     *         EnableAWSOrganizationsAccess service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidStateException
     * @throws OperationNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    EnableAWSOrganizationsAccessResult enableAWSOrganizationsAccess(
            EnableAWSOrganizationsAccessRequest enableAWSOrganizationsAccessRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provisions or modifies a product based on the resource changes for the
     * specified plan.
     * </p>
     * 
     * @param executeProvisionedProductPlanRequest
     * @return executeProvisionedProductPlanResult The response from the
     *         ExecuteProvisionedProductPlan service method, as returned by AWS
     *         Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws InvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ExecuteProvisionedProductPlanResult executeProvisionedProductPlan(
            ExecuteProvisionedProductPlanRequest executeProvisionedProductPlanRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Executes a self-service action against a provisioned product.
     * </p>
     * 
     * @param executeProvisionedProductServiceActionRequest
     * @return executeProvisionedProductServiceActionResult The response from
     *         the ExecuteProvisionedProductServiceAction service method, as
     *         returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws InvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ExecuteProvisionedProductServiceActionResult executeProvisionedProductServiceAction(
            ExecuteProvisionedProductServiceActionRequest executeProvisionedProductServiceActionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Get the Access Status for AWS Organization portfolio share feature. This
     * API can only be called by the master account in the organization.
     * </p>
     * 
     * @param getAWSOrganizationsAccessStatusRequest
     * @return getAWSOrganizationsAccessStatusResult The response from the
     *         GetAWSOrganizationsAccessStatus service method, as returned by
     *         AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws OperationNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetAWSOrganizationsAccessStatusResult getAWSOrganizationsAccessStatus(
            GetAWSOrganizationsAccessStatusRequest getAWSOrganizationsAccessStatusRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all portfolios for which sharing was accepted by this account.
     * </p>
     * 
     * @param listAcceptedPortfolioSharesRequest
     * @return listAcceptedPortfolioSharesResult The response from the
     *         ListAcceptedPortfolioShares service method, as returned by AWS
     *         Service Catalog.
     * @throws InvalidParametersException
     * @throws OperationNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListAcceptedPortfolioSharesResult listAcceptedPortfolioShares(
            ListAcceptedPortfolioSharesRequest listAcceptedPortfolioSharesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all the budgets associated to the specified resource.
     * </p>
     * 
     * @param listBudgetsForResourceRequest
     * @return listBudgetsForResourceResult The response from the
     *         ListBudgetsForResource service method, as returned by AWS Service
     *         Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListBudgetsForResourceResult listBudgetsForResource(
            ListBudgetsForResourceRequest listBudgetsForResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the constraints for the specified portfolio and product.
     * </p>
     * 
     * @param listConstraintsForPortfolioRequest
     * @return listConstraintsForPortfolioResult The response from the
     *         ListConstraintsForPortfolio service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListConstraintsForPortfolioResult listConstraintsForPortfolio(
            ListConstraintsForPortfolioRequest listConstraintsForPortfolioRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the paths to the specified product. A path is how the user has
     * access to a specified product, and is necessary when provisioning a
     * product. A path also determines the constraints put on the product.
     * </p>
     * 
     * @param listLaunchPathsRequest
     * @return listLaunchPathsResult The response from the ListLaunchPaths
     *         service method, as returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListLaunchPathsResult listLaunchPaths(ListLaunchPathsRequest listLaunchPathsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the organization nodes that have access to the specified portfolio.
     * This API can only be called by the master account in the organization.
     * </p>
     * 
     * @param listOrganizationPortfolioAccessRequest
     * @return listOrganizationPortfolioAccessResult The response from the
     *         ListOrganizationPortfolioAccess service method, as returned by
     *         AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws OperationNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListOrganizationPortfolioAccessResult listOrganizationPortfolioAccess(
            ListOrganizationPortfolioAccessRequest listOrganizationPortfolioAccessRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the account IDs that have access to the specified portfolio.
     * </p>
     * 
     * @param listPortfolioAccessRequest
     * @return listPortfolioAccessResult The response from the
     *         ListPortfolioAccess service method, as returned by AWS Service
     *         Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListPortfolioAccessResult listPortfolioAccess(
            ListPortfolioAccessRequest listPortfolioAccessRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists all portfolios in the catalog.
     * </p>
     * 
     * @param listPortfoliosRequest
     * @return listPortfoliosResult The response from the ListPortfolios service
     *         method, as returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListPortfoliosResult listPortfolios(ListPortfoliosRequest listPortfoliosRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all portfolios that the specified product is associated with.
     * </p>
     * 
     * @param listPortfoliosForProductRequest
     * @return listPortfoliosForProductResult The response from the
     *         ListPortfoliosForProduct service method, as returned by AWS
     *         Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListPortfoliosForProductResult listPortfoliosForProduct(
            ListPortfoliosForProductRequest listPortfoliosForProductRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all principal ARNs associated with the specified portfolio.
     * </p>
     * 
     * @param listPrincipalsForPortfolioRequest
     * @return listPrincipalsForPortfolioResult The response from the
     *         ListPrincipalsForPortfolio service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListPrincipalsForPortfolioResult listPrincipalsForPortfolio(
            ListPrincipalsForPortfolioRequest listPrincipalsForPortfolioRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the plans for the specified provisioned product or all plans to
     * which the user has access.
     * </p>
     * 
     * @param listProvisionedProductPlansRequest
     * @return listProvisionedProductPlansResult The response from the
     *         ListProvisionedProductPlans service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListProvisionedProductPlansResult listProvisionedProductPlans(
            ListProvisionedProductPlansRequest listProvisionedProductPlansRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all provisioning artifacts (also known as versions) for the
     * specified product.
     * </p>
     * 
     * @param listProvisioningArtifactsRequest
     * @return listProvisioningArtifactsResult The response from the
     *         ListProvisioningArtifacts service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListProvisioningArtifactsResult listProvisioningArtifacts(
            ListProvisioningArtifactsRequest listProvisioningArtifactsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all provisioning artifacts (also known as versions) for the
     * specified self-service action.
     * </p>
     * 
     * @param listProvisioningArtifactsForServiceActionRequest
     * @return listProvisioningArtifactsForServiceActionResult The response from
     *         the ListProvisioningArtifactsForServiceAction service method, as
     *         returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListProvisioningArtifactsForServiceActionResult listProvisioningArtifactsForServiceAction(
            ListProvisioningArtifactsForServiceActionRequest listProvisioningArtifactsForServiceActionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the specified requests or all performed requests.
     * </p>
     * 
     * @param listRecordHistoryRequest
     * @return listRecordHistoryResult The response from the ListRecordHistory
     *         service method, as returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListRecordHistoryResult listRecordHistory(ListRecordHistoryRequest listRecordHistoryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the resources associated with the specified TagOption.
     * </p>
     * 
     * @param listResourcesForTagOptionRequest
     * @return listResourcesForTagOptionResult The response from the
     *         ListResourcesForTagOption service method, as returned by AWS
     *         Service Catalog.
     * @throws TagOptionNotMigratedException
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListResourcesForTagOptionResult listResourcesForTagOption(
            ListResourcesForTagOptionRequest listResourcesForTagOptionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all self-service actions.
     * </p>
     * 
     * @param listServiceActionsRequest
     * @return listServiceActionsResult The response from the ListServiceActions
     *         service method, as returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListServiceActionsResult listServiceActions(ListServiceActionsRequest listServiceActionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a paginated list of self-service actions associated with the
     * specified Product ID and Provisioning Artifact ID.
     * </p>
     * 
     * @param listServiceActionsForProvisioningArtifactRequest
     * @return listServiceActionsForProvisioningArtifactResult The response from
     *         the ListServiceActionsForProvisioningArtifact service method, as
     *         returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListServiceActionsForProvisioningArtifactResult listServiceActionsForProvisioningArtifact(
            ListServiceActionsForProvisioningArtifactRequest listServiceActionsForProvisioningArtifactRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns summary information about stack instances that are associated
     * with the specified <code>CFN_STACKSET</code> type provisioned product.
     * You can filter for stack instances that are associated with a specific
     * AWS account name or region.
     * </p>
     * 
     * @param listStackInstancesForProvisionedProductRequest
     * @return listStackInstancesForProvisionedProductResult The response from
     *         the ListStackInstancesForProvisionedProduct service method, as
     *         returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListStackInstancesForProvisionedProductResult listStackInstancesForProvisionedProduct(
            ListStackInstancesForProvisionedProductRequest listStackInstancesForProvisionedProductRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the specified TagOptions or all TagOptions.
     * </p>
     * 
     * @param listTagOptionsRequest
     * @return listTagOptionsResult The response from the ListTagOptions service
     *         method, as returned by AWS Service Catalog.
     * @throws TagOptionNotMigratedException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListTagOptionsResult listTagOptions(ListTagOptionsRequest listTagOptionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provisions the specified product.
     * </p>
     * <p>
     * A provisioned product is a resourced instance of a product. For example,
     * provisioning a product based on a CloudFormation template launches a
     * CloudFormation stack and its underlying resources. You can check the
     * status of this request using <a>DescribeRecord</a>.
     * </p>
     * <p>
     * If the request contains a tag key with an empty list of values, there is
     * a tag conflict for that key. Do not include conflicted keys as tags, or
     * this causes the error
     * "Parameter validation failed: Missing required parameter in Tags[<i>N</i>]:<i>Value</i>"
     * .
     * </p>
     * 
     * @param provisionProductRequest
     * @return provisionProductResult The response from the ProvisionProduct
     *         service method, as returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws DuplicateResourceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ProvisionProductResult provisionProduct(ProvisionProductRequest provisionProductRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Rejects an offer to share the specified portfolio.
     * </p>
     * 
     * @param rejectPortfolioShareRequest
     * @return rejectPortfolioShareResult The response from the
     *         RejectPortfolioShare service method, as returned by AWS Service
     *         Catalog.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    RejectPortfolioShareResult rejectPortfolioShare(
            RejectPortfolioShareRequest rejectPortfolioShareRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the provisioned products that are available (not terminated).
     * </p>
     * <p>
     * To use additional filtering, see <a>SearchProvisionedProducts</a>.
     * </p>
     * 
     * @param scanProvisionedProductsRequest
     * @return scanProvisionedProductsResult The response from the
     *         ScanProvisionedProducts service method, as returned by AWS
     *         Service Catalog.
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ScanProvisionedProductsResult scanProvisionedProducts(
            ScanProvisionedProductsRequest scanProvisionedProductsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the products to which the caller has access.
     * </p>
     * 
     * @param searchProductsRequest
     * @return searchProductsResult The response from the SearchProducts service
     *         method, as returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    SearchProductsResult searchProducts(SearchProductsRequest searchProductsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the products for the specified portfolio or all
     * products.
     * </p>
     * 
     * @param searchProductsAsAdminRequest
     * @return searchProductsAsAdminResult The response from the
     *         SearchProductsAsAdmin service method, as returned by AWS Service
     *         Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    SearchProductsAsAdminResult searchProductsAsAdmin(
            SearchProductsAsAdminRequest searchProductsAsAdminRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the provisioned products that meet the specified
     * criteria.
     * </p>
     * 
     * @param searchProvisionedProductsRequest
     * @return searchProvisionedProductsResult The response from the
     *         SearchProvisionedProducts service method, as returned by AWS
     *         Service Catalog.
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    SearchProvisionedProductsResult searchProvisionedProducts(
            SearchProvisionedProductsRequest searchProvisionedProductsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Terminates the specified provisioned product.
     * </p>
     * <p>
     * This operation does not delete any records associated with the
     * provisioned product.
     * </p>
     * <p>
     * You can check the status of this request using <a>DescribeRecord</a>.
     * </p>
     * 
     * @param terminateProvisionedProductRequest
     * @return terminateProvisionedProductResult The response from the
     *         TerminateProvisionedProduct service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    TerminateProvisionedProductResult terminateProvisionedProduct(
            TerminateProvisionedProductRequest terminateProvisionedProductRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the specified constraint.
     * </p>
     * 
     * @param updateConstraintRequest
     * @return updateConstraintResult The response from the UpdateConstraint
     *         service method, as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateConstraintResult updateConstraint(UpdateConstraintRequest updateConstraintRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the specified portfolio.
     * </p>
     * <p>
     * You cannot update a product that was shared with you.
     * </p>
     * 
     * @param updatePortfolioRequest
     * @return updatePortfolioResult The response from the UpdatePortfolio
     *         service method, as returned by AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws TagOptionNotMigratedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdatePortfolioResult updatePortfolio(UpdatePortfolioRequest updatePortfolioRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the specified product.
     * </p>
     * 
     * @param updateProductRequest
     * @return updateProductResult The response from the UpdateProduct service
     *         method, as returned by AWS Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws TagOptionNotMigratedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateProductResult updateProduct(UpdateProductRequest updateProductRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Requests updates to the configuration of the specified provisioned
     * product.
     * </p>
     * <p>
     * If there are tags associated with the object, they cannot be updated or
     * added. Depending on the specific updates requested, this operation can
     * update with no interruption, with some interruption, or replace the
     * provisioned product entirely.
     * </p>
     * <p>
     * You can check the status of this request using <a>DescribeRecord</a>.
     * </p>
     * 
     * @param updateProvisionedProductRequest
     * @return updateProvisionedProductResult The response from the
     *         UpdateProvisionedProduct service method, as returned by AWS
     *         Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateProvisionedProductResult updateProvisionedProduct(
            UpdateProvisionedProductRequest updateProvisionedProductRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Requests updates to the properties of the specified provisioned product.
     * </p>
     * 
     * @param updateProvisionedProductPropertiesRequest
     * @return updateProvisionedProductPropertiesResult The response from the
     *         UpdateProvisionedProductProperties service method, as returned by
     *         AWS Service Catalog.
     * @throws InvalidParametersException
     * @throws ResourceNotFoundException
     * @throws InvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateProvisionedProductPropertiesResult updateProvisionedProductProperties(
            UpdateProvisionedProductPropertiesRequest updateProvisionedProductPropertiesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the specified provisioning artifact (also known as a version) for
     * the specified product.
     * </p>
     * <p>
     * You cannot update a provisioning artifact for a product that was shared
     * with you.
     * </p>
     * 
     * @param updateProvisioningArtifactRequest
     * @return updateProvisioningArtifactResult The response from the
     *         UpdateProvisioningArtifact service method, as returned by AWS
     *         Service Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateProvisioningArtifactResult updateProvisioningArtifact(
            UpdateProvisioningArtifactRequest updateProvisioningArtifactRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a self-service action.
     * </p>
     * 
     * @param updateServiceActionRequest
     * @return updateServiceActionResult The response from the
     *         UpdateServiceAction service method, as returned by AWS Service
     *         Catalog.
     * @throws ResourceNotFoundException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateServiceActionResult updateServiceAction(
            UpdateServiceActionRequest updateServiceActionRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates the specified TagOption.
     * </p>
     * 
     * @param updateTagOptionRequest
     * @return updateTagOptionResult The response from the UpdateTagOption
     *         service method, as returned by AWS Service Catalog.
     * @throws TagOptionNotMigratedException
     * @throws ResourceNotFoundException
     * @throws DuplicateResourceException
     * @throws InvalidParametersException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Service Catalog indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateTagOptionResult updateTagOption(UpdateTagOptionRequest updateTagOptionRequest)
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
