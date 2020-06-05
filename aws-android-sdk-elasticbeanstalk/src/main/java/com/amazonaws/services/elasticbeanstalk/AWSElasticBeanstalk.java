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

package com.amazonaws.services.elasticbeanstalk;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.elasticbeanstalk.model.*;

/**
 * Interface for accessing AWS Elastic Beanstalk <fullname>AWS Elastic
 * Beanstalk</fullname>
 * <p>
 * AWS Elastic Beanstalk makes it easy for you to create, deploy, and manage
 * scalable, fault-tolerant applications running on the Amazon Web Services
 * cloud.
 * </p>
 * <p>
 * For more information about this product, go to the <a
 * href="http://aws.amazon.com/elasticbeanstalk/">AWS Elastic Beanstalk</a>
 * details page. The location of the latest AWS Elastic Beanstalk WSDL is <a
 * href=
 * "https://elasticbeanstalk.s3.amazonaws.com/doc/2010-12-01/AWSElasticBeanstalk.wsdl"
 * >https://elasticbeanstalk.s3.amazonaws.com/doc/2010-12-01/AWSElasticBeanstalk
 * .wsdl</a>. To install the Software Development Kits (SDKs), Integrated
 * Development Environment (IDE) Toolkits, and command line tools that enable
 * you to access the API, go to <a href="http://aws.amazon.com/tools/">Tools for
 * Amazon Web Services</a>.
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * For a list of region-specific endpoints that AWS Elastic Beanstalk supports,
 * go to <a href=
 * "https://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region"
 * >Regions and Endpoints</a> in the <i>Amazon Web Services Glossary</i>.
 * </p>
 **/
public interface AWSElasticBeanstalk {

    /**
     * Overrides the default endpoint for this client
     * ("https://elasticbeanstalk.us-east-1.amazonaws.com"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "elasticbeanstalk.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://elasticbeanstalk.us-east-1.amazonaws.com"). If the
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
     *            "elasticbeanstalk.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex:
     *            "https://elasticbeanstalk.us-east-1.amazonaws.com") of the
     *            region specific AWS endpoint this client will communicate
     *            with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSElasticBeanstalk#setEndpoint(String)}, sets
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
     * Cancels in-progress environment configuration update or application
     * version deployment.
     * </p>
     * 
     * @param abortEnvironmentUpdateRequest <p/>
     * @throws InsufficientPrivilegesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void abortEnvironmentUpdate(AbortEnvironmentUpdateRequest abortEnvironmentUpdateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Applies a scheduled managed action immediately. A managed action can be
     * applied only if its status is <code>Scheduled</code>. Get the status and
     * action ID of a managed action with
     * <a>DescribeEnvironmentManagedActions</a>.
     * </p>
     * 
     * @param applyEnvironmentManagedActionRequest <p>
     *            Request to execute a scheduled managed action immediately.
     *            </p>
     * @return applyEnvironmentManagedActionResult The response from the
     *         ApplyEnvironmentManagedAction service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws ElasticBeanstalkServiceException
     * @throws ManagedActionInvalidStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ApplyEnvironmentManagedActionResult applyEnvironmentManagedAction(
            ApplyEnvironmentManagedActionRequest applyEnvironmentManagedActionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Add or change the operations role used by an environment. After this call
     * is made, Elastic Beanstalk uses the associated operations role for
     * permissions to downstream services during subsequent calls acting on this
     * environment. For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/iam-operationsrole.html"
     * >Operations roles</a> in the <i>AWS Elastic Beanstalk Developer
     * Guide</i>.
     * </p>
     * 
     * @param associateEnvironmentOperationsRoleRequest <p>
     *            Request to add or change the operations role used by an
     *            environment.
     *            </p>
     * @throws InsufficientPrivilegesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void associateEnvironmentOperationsRole(
            AssociateEnvironmentOperationsRoleRequest associateEnvironmentOperationsRoleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Checks if the specified CNAME is available.
     * </p>
     * 
     * @param checkDNSAvailabilityRequest <p>
     *            Results message indicating whether a CNAME is available.
     *            </p>
     * @return checkDNSAvailabilityResult The response from the
     *         CheckDNSAvailability service method, as returned by AWS Elastic
     *         Beanstalk.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CheckDNSAvailabilityResult checkDNSAvailability(
            CheckDNSAvailabilityRequest checkDNSAvailabilityRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Create or update a group of environments that each run a separate
     * component of a single application. Takes a list of version labels that
     * specify application source bundles for each of the environments to create
     * or update. The name of each environment and other required information
     * must be included in the source bundles in an environment manifest named
     * <code>env.yaml</code>. See <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-mgmt-compose.html"
     * >Compose Environments</a> for details.
     * </p>
     * 
     * @param composeEnvironmentsRequest <p>
     *            Request to create or update a group of environments.
     *            </p>
     * @return composeEnvironmentsResult The response from the
     *         ComposeEnvironments service method, as returned by AWS Elastic
     *         Beanstalk.
     * @throws TooManyEnvironmentsException
     * @throws InsufficientPrivilegesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ComposeEnvironmentsResult composeEnvironments(
            ComposeEnvironmentsRequest composeEnvironmentsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates an application that has one configuration template named
     * <code>default</code> and no application versions.
     * </p>
     * 
     * @param createApplicationRequest <p>
     *            Request to create an application.
     *            </p>
     * @return createApplicationResult The response from the CreateApplication
     *         service method, as returned by AWS Elastic Beanstalk.
     * @throws TooManyApplicationsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an application version for the specified application. You can
     * create an application version from a source bundle in Amazon S3, a commit
     * in AWS CodeCommit, or the output of an AWS CodeBuild build as follows:
     * </p>
     * <p>
     * Specify a commit in an AWS CodeCommit repository with
     * <code>SourceBuildInformation</code>.
     * </p>
     * <p>
     * Specify a build in an AWS CodeBuild with
     * <code>SourceBuildInformation</code> and <code>BuildConfiguration</code>.
     * </p>
     * <p>
     * Specify a source bundle in S3 with <code>SourceBundle</code>
     * </p>
     * <p>
     * Omit both <code>SourceBuildInformation</code> and
     * <code>SourceBundle</code> to use the default sample application.
     * </p>
     * <note>
     * <p>
     * After you create an application version with a specified Amazon S3 bucket
     * and key location, you can't change that Amazon S3 location. If you change
     * the Amazon S3 location, you receive an exception when you attempt to
     * launch an environment from the application version.
     * </p>
     * </note>
     * 
     * @param createApplicationVersionRequest <p/>
     * @return createApplicationVersionResult The response from the
     *         CreateApplicationVersion service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws TooManyApplicationsException
     * @throws TooManyApplicationVersionsException
     * @throws InsufficientPrivilegesException
     * @throws S3LocationNotInServiceRegionException
     * @throws CodeBuildNotInServiceRegionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateApplicationVersionResult createApplicationVersion(
            CreateApplicationVersionRequest createApplicationVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an AWS Elastic Beanstalk configuration template, associated with
     * a specific Elastic Beanstalk application. You define application
     * configuration settings in a configuration template. You can then use the
     * configuration template to deploy different versions of the application
     * with the same configuration settings.
     * </p>
     * <p>
     * Templates aren't associated with any environment. The
     * <code>EnvironmentName</code> response element is always <code>null</code>
     * .
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeConfigurationOptions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeConfigurationSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAvailableSolutionStacks</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createConfigurationTemplateRequest <p>
     *            Request to create a configuration template.
     *            </p>
     * @return createConfigurationTemplateResult The response from the
     *         CreateConfigurationTemplate service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws InsufficientPrivilegesException
     * @throws TooManyBucketsException
     * @throws TooManyConfigurationTemplatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateConfigurationTemplateResult createConfigurationTemplate(
            CreateConfigurationTemplateRequest createConfigurationTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Launches an AWS Elastic Beanstalk environment for the specified
     * application using the specified configuration.
     * </p>
     * 
     * @param createEnvironmentRequest <p/>
     * @return createEnvironmentResult The response from the CreateEnvironment
     *         service method, as returned by AWS Elastic Beanstalk.
     * @throws TooManyEnvironmentsException
     * @throws InsufficientPrivilegesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateEnvironmentResult createEnvironment(CreateEnvironmentRequest createEnvironmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Create a new version of your custom platform.
     * </p>
     * 
     * @param createPlatformVersionRequest <p>
     *            Request to create a new platform version.
     *            </p>
     * @return createPlatformVersionResult The response from the
     *         CreatePlatformVersion service method, as returned by AWS Elastic
     *         Beanstalk.
     * @throws InsufficientPrivilegesException
     * @throws ElasticBeanstalkServiceException
     * @throws TooManyPlatformsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreatePlatformVersionResult createPlatformVersion(
            CreatePlatformVersionRequest createPlatformVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a bucket in Amazon S3 to store application versions, logs, and
     * other files used by Elastic Beanstalk environments. The Elastic Beanstalk
     * console and EB CLI call this API the first time you create an environment
     * in a region. If the storage location already exists,
     * <code>CreateStorageLocation</code> still returns the bucket name but does
     * not create a new bucket.
     * </p>
     * 
     * @param createStorageLocationRequest
     * @return createStorageLocationResult The response from the
     *         CreateStorageLocation service method, as returned by AWS Elastic
     *         Beanstalk.
     * @throws TooManyBucketsException
     * @throws S3SubscriptionRequiredException
     * @throws InsufficientPrivilegesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateStorageLocationResult createStorageLocation(
            CreateStorageLocationRequest createStorageLocationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified application along with all associated versions and
     * configurations. The application versions will not be deleted from your
     * Amazon S3 bucket.
     * </p>
     * <note>
     * <p>
     * You cannot delete an application that has a running environment.
     * </p>
     * </note>
     * 
     * @param deleteApplicationRequest <p>
     *            Request to delete an application.
     *            </p>
     * @throws OperationInProgressException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteApplication(DeleteApplicationRequest deleteApplicationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified version from the specified application.
     * </p>
     * <note>
     * <p>
     * You cannot delete an application version that is associated with a
     * running environment.
     * </p>
     * </note>
     * 
     * @param deleteApplicationVersionRequest <p>
     *            Request to delete an application version.
     *            </p>
     * @throws SourceBundleDeletionException
     * @throws InsufficientPrivilegesException
     * @throws OperationInProgressException
     * @throws S3LocationNotInServiceRegionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteApplicationVersion(DeleteApplicationVersionRequest deleteApplicationVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified configuration template.
     * </p>
     * <note>
     * <p>
     * When you launch an environment using a configuration template, the
     * environment gets a copy of the template. You can delete or modify the
     * environment's copy of the template without affecting the running
     * environment.
     * </p>
     * </note>
     * 
     * @param deleteConfigurationTemplateRequest <p>
     *            Request to delete a configuration template.
     *            </p>
     * @throws OperationInProgressException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteConfigurationTemplate(
            DeleteConfigurationTemplateRequest deleteConfigurationTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the draft configuration associated with the running environment.
     * </p>
     * <p>
     * Updating a running environment with any configuration changes creates a
     * draft configuration set. You can get the draft configuration using
     * <a>DescribeConfigurationSettings</a> while the update is in progress or
     * if the update fails. The <code>DeploymentStatus</code> for the draft
     * configuration indicates whether the deployment is in process or has
     * failed. The draft configuration remains in existence until it is deleted
     * with this action.
     * </p>
     * 
     * @param deleteEnvironmentConfigurationRequest <p>
     *            Request to delete a draft environment configuration.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteEnvironmentConfiguration(
            DeleteEnvironmentConfigurationRequest deleteEnvironmentConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified version of a custom platform.
     * </p>
     * 
     * @param deletePlatformVersionRequest
     * @return deletePlatformVersionResult The response from the
     *         DeletePlatformVersion service method, as returned by AWS Elastic
     *         Beanstalk.
     * @throws OperationInProgressException
     * @throws InsufficientPrivilegesException
     * @throws ElasticBeanstalkServiceException
     * @throws PlatformVersionStillReferencedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DeletePlatformVersionResult deletePlatformVersion(
            DeletePlatformVersionRequest deletePlatformVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns attributes related to AWS Elastic Beanstalk that are associated
     * with the calling AWS account.
     * </p>
     * <p>
     * The result currently has one set of attributes—resource quotas.
     * </p>
     * 
     * @param describeAccountAttributesRequest
     * @return describeAccountAttributesResult The response from the
     *         DescribeAccountAttributes service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws InsufficientPrivilegesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeAccountAttributesResult describeAccountAttributes(
            DescribeAccountAttributesRequest describeAccountAttributesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieve a list of application versions.
     * </p>
     * 
     * @param describeApplicationVersionsRequest <p>
     *            Request to describe application versions.
     *            </p>
     * @return describeApplicationVersionsResult The response from the
     *         DescribeApplicationVersions service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeApplicationVersionsResult describeApplicationVersions(
            DescribeApplicationVersionsRequest describeApplicationVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the descriptions of existing applications.
     * </p>
     * 
     * @param describeApplicationsRequest <p>
     *            Request to describe one or more applications.
     *            </p>
     * @return describeApplicationsResult The response from the
     *         DescribeApplications service method, as returned by AWS Elastic
     *         Beanstalk.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeApplicationsResult describeApplications(
            DescribeApplicationsRequest describeApplicationsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes the configuration options that are used in a particular
     * configuration template or environment, or that a specified solution stack
     * defines. The description includes the values the options, their default
     * values, and an indication of the required action on a running environment
     * if an option value is changed.
     * </p>
     * 
     * @param describeConfigurationOptionsRequest <p>
     *            Result message containing a list of application version
     *            descriptions.
     *            </p>
     * @return describeConfigurationOptionsResult The response from the
     *         DescribeConfigurationOptions service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws TooManyBucketsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeConfigurationOptionsResult describeConfigurationOptions(
            DescribeConfigurationOptionsRequest describeConfigurationOptionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a description of the settings for the specified configuration
     * set, that is, either a configuration template or the configuration set
     * associated with a running environment.
     * </p>
     * <p>
     * When describing the settings for the configuration set associated with a
     * running environment, it is possible to receive two sets of setting
     * descriptions. One is the deployed configuration set, and the other is a
     * draft configuration of an environment that is either in the process of
     * deployment or that failed to deploy.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DeleteEnvironmentConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeConfigurationSettingsRequest <p>
     *            Result message containing all of the configuration settings
     *            for a specified solution stack or configuration template.
     *            </p>
     * @return describeConfigurationSettingsResult The response from the
     *         DescribeConfigurationSettings service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws TooManyBucketsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeConfigurationSettingsResult describeConfigurationSettings(
            DescribeConfigurationSettingsRequest describeConfigurationSettingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the overall health of the specified
     * environment. The <b>DescribeEnvironmentHealth</b> operation is only
     * available with AWS Elastic Beanstalk Enhanced Health.
     * </p>
     * 
     * @param describeEnvironmentHealthRequest <p>
     *            See the example below to learn how to create a request body.
     *            </p>
     * @return describeEnvironmentHealthResult The response from the
     *         DescribeEnvironmentHealth service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws InvalidRequestException
     * @throws ElasticBeanstalkServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeEnvironmentHealthResult describeEnvironmentHealth(
            DescribeEnvironmentHealthRequest describeEnvironmentHealthRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists an environment's completed and failed managed actions.
     * </p>
     * 
     * @param describeEnvironmentManagedActionHistoryRequest <p>
     *            Request to list completed and failed managed actions.
     *            </p>
     * @return describeEnvironmentManagedActionHistoryResult The response from
     *         the DescribeEnvironmentManagedActionHistory service method, as
     *         returned by AWS Elastic Beanstalk.
     * @throws ElasticBeanstalkServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeEnvironmentManagedActionHistoryResult describeEnvironmentManagedActionHistory(
            DescribeEnvironmentManagedActionHistoryRequest describeEnvironmentManagedActionHistoryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists an environment's upcoming and in-progress managed actions.
     * </p>
     * 
     * @param describeEnvironmentManagedActionsRequest <p>
     *            Request to list an environment's upcoming and in-progress
     *            managed actions.
     *            </p>
     * @return describeEnvironmentManagedActionsResult The response from the
     *         DescribeEnvironmentManagedActions service method, as returned by
     *         AWS Elastic Beanstalk.
     * @throws ElasticBeanstalkServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeEnvironmentManagedActionsResult describeEnvironmentManagedActions(
            DescribeEnvironmentManagedActionsRequest describeEnvironmentManagedActionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns AWS resources for this environment.
     * </p>
     * 
     * @param describeEnvironmentResourcesRequest <p>
     *            Request to describe the resources in an environment.
     *            </p>
     * @return describeEnvironmentResourcesResult The response from the
     *         DescribeEnvironmentResources service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws InsufficientPrivilegesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeEnvironmentResourcesResult describeEnvironmentResources(
            DescribeEnvironmentResourcesRequest describeEnvironmentResourcesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns descriptions for existing environments.
     * </p>
     * 
     * @param describeEnvironmentsRequest <p>
     *            Request to describe one or more environments.
     *            </p>
     * @return describeEnvironmentsResult The response from the
     *         DescribeEnvironments service method, as returned by AWS Elastic
     *         Beanstalk.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeEnvironmentsResult describeEnvironments(
            DescribeEnvironmentsRequest describeEnvironmentsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns list of event descriptions matching criteria up to the last 6
     * weeks.
     * </p>
     * <note>
     * <p>
     * This action returns the most recent 1,000 events from the specified
     * <code>NextToken</code>.
     * </p>
     * </note>
     * 
     * @param describeEventsRequest <p>
     *            Request to retrieve a list of events for an environment.
     *            </p>
     * @return describeEventsResult The response from the DescribeEvents service
     *         method, as returned by AWS Elastic Beanstalk.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves detailed information about the health of instances in your AWS
     * Elastic Beanstalk. This operation requires <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced.html"
     * >enhanced health reporting</a>.
     * </p>
     * 
     * @param describeInstancesHealthRequest <p>
     *            Parameters for a call to <code>DescribeInstancesHealth</code>.
     *            </p>
     * @return describeInstancesHealthResult The response from the
     *         DescribeInstancesHealth service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws InvalidRequestException
     * @throws ElasticBeanstalkServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeInstancesHealthResult describeInstancesHealth(
            DescribeInstancesHealthRequest describeInstancesHealthRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes a platform version. Provides full details. Compare to
     * <a>ListPlatformVersions</a>, which provides summary information about a
     * list of platform versions.
     * </p>
     * <p>
     * For definitions of platform version and other platform-related terms, see
     * <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/platforms-glossary.html"
     * >AWS Elastic Beanstalk Platforms Glossary</a>.
     * </p>
     * 
     * @param describePlatformVersionRequest
     * @return describePlatformVersionResult The response from the
     *         DescribePlatformVersion service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws InsufficientPrivilegesException
     * @throws ElasticBeanstalkServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribePlatformVersionResult describePlatformVersion(
            DescribePlatformVersionRequest describePlatformVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociate the operations role from an environment. After this call is
     * made, Elastic Beanstalk uses the caller's permissions for permissions to
     * downstream services during subsequent calls acting on this environment.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/iam-operationsrole.html"
     * >Operations roles</a> in the <i>AWS Elastic Beanstalk Developer
     * Guide</i>.
     * </p>
     * 
     * @param disassociateEnvironmentOperationsRoleRequest <p>
     *            Request to disassociate the operations role from an
     *            environment.
     *            </p>
     * @throws InsufficientPrivilegesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void disassociateEnvironmentOperationsRole(
            DisassociateEnvironmentOperationsRoleRequest disassociateEnvironmentOperationsRoleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of the available solution stack names, with the public
     * version first and then in reverse chronological order.
     * </p>
     * 
     * @param listAvailableSolutionStacksRequest
     * @return listAvailableSolutionStacksResult The response from the
     *         ListAvailableSolutionStacks service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListAvailableSolutionStacksResult listAvailableSolutionStacks(
            ListAvailableSolutionStacksRequest listAvailableSolutionStacksRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the platform branches available for your account in an AWS Region.
     * Provides summary information about each platform branch.
     * </p>
     * <p>
     * For definitions of platform branch and other platform-related terms, see
     * <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/platforms-glossary.html"
     * >AWS Elastic Beanstalk Platforms Glossary</a>.
     * </p>
     * 
     * @param listPlatformBranchesRequest
     * @return listPlatformBranchesResult The response from the
     *         ListPlatformBranches service method, as returned by AWS Elastic
     *         Beanstalk.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListPlatformBranchesResult listPlatformBranches(
            ListPlatformBranchesRequest listPlatformBranchesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the platform versions available for your account in an AWS Region.
     * Provides summary information about each platform version. Compare to
     * <a>DescribePlatformVersion</a>, which provides full details about a
     * single platform version.
     * </p>
     * <p>
     * For definitions of platform version and other platform-related terms, see
     * <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/platforms-glossary.html"
     * >AWS Elastic Beanstalk Platforms Glossary</a>.
     * </p>
     * 
     * @param listPlatformVersionsRequest
     * @return listPlatformVersionsResult The response from the
     *         ListPlatformVersions service method, as returned by AWS Elastic
     *         Beanstalk.
     * @throws InsufficientPrivilegesException
     * @throws ElasticBeanstalkServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListPlatformVersionsResult listPlatformVersions(
            ListPlatformVersionsRequest listPlatformVersionsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Return the tags applied to an AWS Elastic Beanstalk resource. The
     * response contains a list of tag key-value pairs.
     * </p>
     * <p>
     * Elastic Beanstalk supports tagging of all of its resources. For details
     * about resource tagging, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/applications-tagging-resources.html"
     * >Tagging Application Resources</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS Elastic
     *         Beanstalk.
     * @throws InsufficientPrivilegesException
     * @throws ResourceNotFoundException
     * @throws ResourceTypeNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes and recreates all of the AWS resources (for example: the Auto
     * Scaling group, load balancer, etc.) for a specified environment and
     * forces a restart.
     * </p>
     * 
     * @param rebuildEnvironmentRequest <p/>
     * @throws InsufficientPrivilegesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void rebuildEnvironment(RebuildEnvironmentRequest rebuildEnvironmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Initiates a request to compile the specified type of information of the
     * deployed environment.
     * </p>
     * <p>
     * Setting the <code>InfoType</code> to <code>tail</code> compiles the last
     * lines from the application server log files of every Amazon EC2 instance
     * in your environment.
     * </p>
     * <p>
     * Setting the <code>InfoType</code> to <code>bundle</code> compresses the
     * application server log files for every Amazon EC2 instance into a
     * <code>.zip</code> file. Legacy and .NET containers do not support bundle
     * logs.
     * </p>
     * <p>
     * Use <a>RetrieveEnvironmentInfo</a> to obtain the set of logs.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>RetrieveEnvironmentInfo</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param requestEnvironmentInfoRequest <p>
     *            Request to retrieve logs from an environment and store them in
     *            your Elastic Beanstalk storage bucket.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void requestEnvironmentInfo(RequestEnvironmentInfoRequest requestEnvironmentInfoRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Causes the environment to restart the application container server
     * running on each Amazon EC2 instance.
     * </p>
     * 
     * @param restartAppServerRequest <p/>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void restartAppServer(RestartAppServerRequest restartAppServerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the compiled information from a <a>RequestEnvironmentInfo</a>
     * request.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>RequestEnvironmentInfo</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param retrieveEnvironmentInfoRequest <p>
     *            Request to download logs retrieved with
     *            <a>RequestEnvironmentInfo</a>.
     *            </p>
     * @return retrieveEnvironmentInfoResult The response from the
     *         RetrieveEnvironmentInfo service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    RetrieveEnvironmentInfoResult retrieveEnvironmentInfo(
            RetrieveEnvironmentInfoRequest retrieveEnvironmentInfoRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Swaps the CNAMEs of two environments.
     * </p>
     * 
     * @param swapEnvironmentCNAMEsRequest <p>
     *            Swaps the CNAMEs of two environments.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void swapEnvironmentCNAMEs(SwapEnvironmentCNAMEsRequest swapEnvironmentCNAMEsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Terminates the specified environment.
     * </p>
     * 
     * @param terminateEnvironmentRequest <p>
     *            Request to terminate an environment.
     *            </p>
     * @return terminateEnvironmentResult The response from the
     *         TerminateEnvironment service method, as returned by AWS Elastic
     *         Beanstalk.
     * @throws InsufficientPrivilegesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    TerminateEnvironmentResult terminateEnvironment(
            TerminateEnvironmentRequest terminateEnvironmentRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates the specified application to have the specified properties.
     * </p>
     * <note>
     * <p>
     * If a property (for example, <code>description</code>) is not provided,
     * the value remains unchanged. To clear these properties, specify an empty
     * string.
     * </p>
     * </note>
     * 
     * @param updateApplicationRequest <p>
     *            Request to update an application.
     *            </p>
     * @return updateApplicationResult The response from the UpdateApplication
     *         service method, as returned by AWS Elastic Beanstalk.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateApplicationResult updateApplication(UpdateApplicationRequest updateApplicationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies lifecycle settings for an application.
     * </p>
     * 
     * @param updateApplicationResourceLifecycleRequest
     * @return updateApplicationResourceLifecycleResult The response from the
     *         UpdateApplicationResourceLifecycle service method, as returned by
     *         AWS Elastic Beanstalk.
     * @throws InsufficientPrivilegesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateApplicationResourceLifecycleResult updateApplicationResourceLifecycle(
            UpdateApplicationResourceLifecycleRequest updateApplicationResourceLifecycleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the specified application version to have the specified
     * properties.
     * </p>
     * <note>
     * <p>
     * If a property (for example, <code>description</code>) is not provided,
     * the value remains unchanged. To clear properties, specify an empty
     * string.
     * </p>
     * </note>
     * 
     * @param updateApplicationVersionRequest <p/>
     * @return updateApplicationVersionResult The response from the
     *         UpdateApplicationVersion service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateApplicationVersionResult updateApplicationVersion(
            UpdateApplicationVersionRequest updateApplicationVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the specified configuration template to have the specified
     * properties or configuration option values.
     * </p>
     * <note>
     * <p>
     * If a property (for example, <code>ApplicationName</code>) is not
     * provided, its value remains unchanged. To clear such properties, specify
     * an empty string.
     * </p>
     * </note>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeConfigurationOptions</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateConfigurationTemplateRequest <p>
     *            The result message containing the options for the specified
     *            solution stack.
     *            </p>
     * @return updateConfigurationTemplateResult The response from the
     *         UpdateConfigurationTemplate service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws InsufficientPrivilegesException
     * @throws TooManyBucketsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateConfigurationTemplateResult updateConfigurationTemplate(
            UpdateConfigurationTemplateRequest updateConfigurationTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the environment description, deploys a new application version,
     * updates the configuration settings to an entirely new configuration
     * template, or updates select configuration option values in the running
     * environment.
     * </p>
     * <p>
     * Attempting to update both the release and configuration is not allowed
     * and AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error.
     * </p>
     * <p>
     * When updating the configuration settings to a new template or individual
     * settings, a draft configuration is created and
     * <a>DescribeConfigurationSettings</a> for this environment returns two
     * setting descriptions with different <code>DeploymentStatus</code> values.
     * </p>
     * 
     * @param updateEnvironmentRequest <p>
     *            Request to update an environment.
     *            </p>
     * @return updateEnvironmentResult The response from the UpdateEnvironment
     *         service method, as returned by AWS Elastic Beanstalk.
     * @throws InsufficientPrivilegesException
     * @throws TooManyBucketsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateEnvironmentResult updateEnvironment(UpdateEnvironmentRequest updateEnvironmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Update the list of tags applied to an AWS Elastic Beanstalk resource. Two
     * lists can be passed: <code>TagsToAdd</code> for tags to add or update,
     * and <code>TagsToRemove</code>.
     * </p>
     * <p>
     * Elastic Beanstalk supports tagging of all of its resources. For details
     * about resource tagging, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/applications-tagging-resources.html"
     * >Tagging Application Resources</a>.
     * </p>
     * <p>
     * If you create a custom IAM user policy to control permission to this
     * operation, specify one of the following two virtual actions (or both)
     * instead of the API operation name:
     * </p>
     * <dl>
     * <dt>elasticbeanstalk:AddTags</dt>
     * <dd>
     * <p>
     * Controls permission to call <code>UpdateTagsForResource</code> and pass a
     * list of tags to add in the <code>TagsToAdd</code> parameter.
     * </p>
     * </dd>
     * <dt>elasticbeanstalk:RemoveTags</dt>
     * <dd>
     * <p>
     * Controls permission to call <code>UpdateTagsForResource</code> and pass a
     * list of tag keys to remove in the <code>TagsToRemove</code> parameter.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * For details about creating a custom user policy, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/AWSHowTo.iam.managed-policies.html#AWSHowTo.iam.policies"
     * >Creating a Custom User Policy</a>.
     * </p>
     * 
     * @param updateTagsForResourceRequest
     * @throws InsufficientPrivilegesException
     * @throws OperationInProgressException
     * @throws TooManyTagsException
     * @throws ResourceNotFoundException
     * @throws ResourceTypeNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void updateTagsForResource(UpdateTagsForResourceRequest updateTagsForResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Takes a set of configuration settings and either a configuration template
     * or environment, and determines whether those values are valid.
     * </p>
     * <p>
     * This action returns a list of messages indicating any errors or warnings
     * associated with the selection of option values.
     * </p>
     * 
     * @param validateConfigurationSettingsRequest <p>
     *            A list of validation messages for a specified configuration
     *            template.
     *            </p>
     * @return validateConfigurationSettingsResult The response from the
     *         ValidateConfigurationSettings service method, as returned by AWS
     *         Elastic Beanstalk.
     * @throws InsufficientPrivilegesException
     * @throws TooManyBucketsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elastic Beanstalk indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ValidateConfigurationSettingsResult validateConfigurationSettings(
            ValidateConfigurationSettingsRequest validateConfigurationSettingsRequest)
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
