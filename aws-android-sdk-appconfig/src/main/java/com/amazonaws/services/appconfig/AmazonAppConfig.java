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

package com.amazonaws.services.appconfig;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.appconfig.model.*;

/**
 * Interface for accessing Amazon AppConfig <fullname>AWS AppConfig</fullname>
 * <p>
 * Use AWS AppConfig, a capability of AWS Systems Manager, to create, manage,
 * and quickly deploy application configurations. AppConfig supports controlled
 * deployments to applications of any size and includes built-in validation
 * checks and monitoring. You can use AppConfig with applications hosted on
 * Amazon EC2 instances, AWS Lambda, containers, mobile applications, or IoT
 * devices.
 * </p>
 * <p>
 * To prevent errors when deploying application configurations, especially for
 * production systems where a simple typo could cause an unexpected outage,
 * AppConfig includes validators. A validator provides a syntactic or semantic
 * check to ensure that the configuration you want to deploy works as intended.
 * To validate your application configuration data, you provide a schema or a
 * Lambda function that runs against the configuration. The configuration
 * deployment or update can only proceed when the configuration data is valid.
 * </p>
 * <p>
 * During a configuration deployment, AppConfig monitors the application to
 * ensure that the deployment is successful. If the system encounters an error,
 * AppConfig rolls back the change to minimize impact for your application
 * users. You can configure a deployment strategy for each application or
 * environment that includes deployment criteria, including velocity, bake time,
 * and alarms to monitor. Similar to error monitoring, if a deployment triggers
 * an alarm, AppConfig automatically rolls back to the previous version.
 * </p>
 * <p>
 * AppConfig supports multiple use cases. Here are some examples.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Application tuning</b>: Use AppConfig to carefully introduce changes to
 * your application that can only be tested with production traffic.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Feature toggle</b>: Use AppConfig to turn on new features that require a
 * timely deployment, such as a product launch or announcement.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>User membership</b>: Use AppConfig to allow premium subscribers to access
 * paid content.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Operational issues</b>: Use AppConfig to reduce stress on your application
 * when a dependency or other external factor impacts the system.
 * </p>
 * </li>
 * </ul>
 * <p>
 * This reference is intended to be used with the <a href=
 * "http://docs.aws.amazon.com/systems-manager/latest/userguide/appconfig.html"
 * >AWS AppConfig User Guide</a>.
 * </p>
 **/
public interface AmazonAppConfig {

    /**
     * Overrides the default endpoint for this client
     * ("https://appconfig.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "appconfig.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://appconfig.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex: "appconfig.us-east-1.amazonaws.com") or
     *            a full URL, including the protocol (ex:
     *            "https://appconfig.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonAppConfig#setEndpoint(String)}, sets the
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
     * An application in AppConfig is a logical unit of code that provides
     * capabilities for your customers. For example, an application can be a
     * microservice that runs on Amazon EC2 instances, a mobile application
     * installed by your users, a serverless application using Amazon API
     * Gateway and AWS Lambda, or any system you run on behalf of others.
     * </p>
     * 
     * @param createApplicationRequest
     * @return createApplicationResult The response from the CreateApplication
     *         service method, as returned by Amazon AppConfig.
     * @throws BadRequestException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Information that enables AppConfig to access the configuration source.
     * Valid configuration sources include Systems Manager (SSM) documents, SSM
     * Parameter Store parameters, and Amazon S3 objects. A configuration
     * profile includes the following information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Uri location of the configuration data.
     * </p>
     * </li>
     * <li>
     * <p>
     * The AWS Identity and Access Management (IAM) role that provides access to
     * the configuration data.
     * </p>
     * </li>
     * <li>
     * <p>
     * A validator for the configuration data. Available validators include
     * either a JSON Schema or an AWS Lambda function.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/appconfig-creating-configuration-and-profile.html"
     * >Create a Configuration and a Configuration Profile</a> in the <i>AWS
     * AppConfig User Guide</i>.
     * </p>
     * 
     * @param createConfigurationProfileRequest
     * @return createConfigurationProfileResult The response from the
     *         CreateConfigurationProfile service method, as returned by Amazon
     *         AppConfig.
     * @throws BadRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateConfigurationProfileResult createConfigurationProfile(
            CreateConfigurationProfileRequest createConfigurationProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * A deployment strategy defines important criteria for rolling out your
     * configuration to the designated targets. A deployment strategy includes:
     * the overall duration required, a percentage of targets to receive the
     * deployment during each interval, an algorithm that defines how percentage
     * grows, and bake time.
     * </p>
     * 
     * @param createDeploymentStrategyRequest
     * @return createDeploymentStrategyResult The response from the
     *         CreateDeploymentStrategy service method, as returned by Amazon
     *         AppConfig.
     * @throws InternalServerException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDeploymentStrategyResult createDeploymentStrategy(
            CreateDeploymentStrategyRequest createDeploymentStrategyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * For each application, you define one or more environments. An environment
     * is a logical deployment group of AppConfig targets, such as applications
     * in a <code>Beta</code> or <code>Production</code> environment. You can
     * also define environments for application subcomponents such as the
     * <code>Web</code>, <code>Mobile</code> and <code>Back-end</code>
     * components for your application. You can configure Amazon CloudWatch
     * alarms for each environment. The system monitors alarms during a
     * configuration deployment. If an alarm is triggered, the system rolls back
     * the configuration.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @return createEnvironmentResult The response from the CreateEnvironment
     *         service method, as returned by Amazon AppConfig.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateEnvironmentResult createEnvironment(CreateEnvironmentRequest createEnvironmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Delete an application. Deleting an application does not delete a
     * configuration from a host.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteApplication(DeleteApplicationRequest deleteApplicationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Delete a configuration profile. Deleting a configuration profile does not
     * delete a configuration from a host.
     * </p>
     * 
     * @param deleteConfigurationProfileRequest
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws InternalServerException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteConfigurationProfile(
            DeleteConfigurationProfileRequest deleteConfigurationProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Delete a deployment strategy. Deleting a deployment strategy does not
     * delete a configuration from a host.
     * </p>
     * 
     * @param deleteDeploymentStrategyRequest
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteDeploymentStrategy(DeleteDeploymentStrategyRequest deleteDeploymentStrategyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Delete an environment. Deleting an environment does not delete a
     * configuration from a host.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws InternalServerException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteEnvironment(DeleteEnvironmentRequest deleteEnvironmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieve information about an application.
     * </p>
     * 
     * @param getApplicationRequest
     * @return getApplicationResult The response from the GetApplication service
     *         method, as returned by Amazon AppConfig.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetApplicationResult getApplication(GetApplicationRequest getApplicationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Receive information about a configuration.
     * </p>
     * <important>
     * <p>
     * AWS AppConfig uses the value of the
     * <code>ClientConfigurationVersion</code> parameter to identify the
     * configuration version on your clients. If you don’t send
     * <code>ClientConfigurationVersion</code> with each call to
     * <code>GetConfiguration</code>, your clients receive the current
     * configuration. You are charged each time your clients receive a
     * configuration.
     * </p>
     * <p>
     * To avoid excess charges, we recommend that you include the
     * <code>ClientConfigurationVersion</code> value with every call to
     * <code>GetConfiguration</code>. This value must be saved on your client.
     * Subsequent calls to <code>GetConfiguration</code> must pass this value by
     * using the <code>ClientConfigurationVersion</code> parameter.
     * </p>
     * </important>
     * 
     * @param getConfigurationRequest
     * @return getConfigurationResult The response from the GetConfiguration
     *         service method, as returned by Amazon AppConfig.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetConfigurationResult getConfiguration(GetConfigurationRequest getConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieve information about a configuration profile.
     * </p>
     * 
     * @param getConfigurationProfileRequest
     * @return getConfigurationProfileResult The response from the
     *         GetConfigurationProfile service method, as returned by Amazon
     *         AppConfig.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetConfigurationProfileResult getConfigurationProfile(
            GetConfigurationProfileRequest getConfigurationProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieve information about a configuration deployment.
     * </p>
     * 
     * @param getDeploymentRequest
     * @return getDeploymentResult The response from the GetDeployment service
     *         method, as returned by Amazon AppConfig.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDeploymentResult getDeployment(GetDeploymentRequest getDeploymentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieve information about a deployment strategy. A deployment strategy
     * defines important criteria for rolling out your configuration to the
     * designated targets. A deployment strategy includes: the overall duration
     * required, a percentage of targets to receive the deployment during each
     * interval, an algorithm that defines how percentage grows, and bake time.
     * </p>
     * 
     * @param getDeploymentStrategyRequest
     * @return getDeploymentStrategyResult The response from the
     *         GetDeploymentStrategy service method, as returned by Amazon
     *         AppConfig.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDeploymentStrategyResult getDeploymentStrategy(
            GetDeploymentStrategyRequest getDeploymentStrategyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieve information about an environment. An environment is a logical
     * deployment group of AppConfig applications, such as applications in a
     * <code>Production</code> environment or in an <code>EU_Region</code>
     * environment. Each configuration deployment targets an environment. You
     * can enable one or more Amazon CloudWatch alarms for an environment. If an
     * alarm is triggered during a deployment, AppConfig roles back the
     * configuration.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @return getEnvironmentResult The response from the GetEnvironment service
     *         method, as returned by Amazon AppConfig.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetEnvironmentResult getEnvironment(GetEnvironmentRequest getEnvironmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * List all applications in your AWS account.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return listApplicationsResult The response from the ListApplications
     *         service method, as returned by Amazon AppConfig.
     * @throws InternalServerException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListApplicationsResult listApplications(ListApplicationsRequest listApplicationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the configuration profiles for an application.
     * </p>
     * 
     * @param listConfigurationProfilesRequest
     * @return listConfigurationProfilesResult The response from the
     *         ListConfigurationProfiles service method, as returned by Amazon
     *         AppConfig.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListConfigurationProfilesResult listConfigurationProfiles(
            ListConfigurationProfilesRequest listConfigurationProfilesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * List deployment strategies.
     * </p>
     * 
     * @param listDeploymentStrategiesRequest
     * @return listDeploymentStrategiesResult The response from the
     *         ListDeploymentStrategies service method, as returned by Amazon
     *         AppConfig.
     * @throws InternalServerException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDeploymentStrategiesResult listDeploymentStrategies(
            ListDeploymentStrategiesRequest listDeploymentStrategiesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the deployments for an environment.
     * </p>
     * 
     * @param listDeploymentsRequest
     * @return listDeploymentsResult The response from the ListDeployments
     *         service method, as returned by Amazon AppConfig.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDeploymentsResult listDeployments(ListDeploymentsRequest listDeploymentsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * List the environments for an application.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return listEnvironmentsResult The response from the ListEnvironments
     *         service method, as returned by Amazon AppConfig.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListEnvironmentsResult listEnvironments(ListEnvironmentsRequest listEnvironmentsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the list of key-value tags assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         AppConfig.
     * @throws ResourceNotFoundException
     * @throws BadRequestException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Starts a deployment.
     * </p>
     * 
     * @param startDeploymentRequest
     * @return startDeploymentResult The response from the StartDeployment
     *         service method, as returned by Amazon AppConfig.
     * @throws BadRequestException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartDeploymentResult startDeployment(StartDeploymentRequest startDeploymentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops a deployment. This API action works only on deployments that have a
     * status of <code>DEPLOYING</code>. This action moves the deployment to a
     * status of <code>ROLLED_BACK</code>.
     * </p>
     * 
     * @param stopDeploymentRequest
     * @return stopDeploymentResult The response from the StopDeployment service
     *         method, as returned by Amazon AppConfig.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StopDeploymentResult stopDeployment(StopDeploymentRequest stopDeploymentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Metadata to assign to an AppConfig resource. Tags help organize and
     * categorize your AppConfig resources. Each tag consists of a key and an
     * optional value, both of which you define. You can specify a maximum of 50
     * tags for a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @throws ResourceNotFoundException
     * @throws BadRequestException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void tagResource(TagResourceRequest tagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a tag key and value from an AppConfig resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @throws ResourceNotFoundException
     * @throws BadRequestException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void untagResource(UntagResourceRequest untagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates an application.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return updateApplicationResult The response from the UpdateApplication
     *         service method, as returned by Amazon AppConfig.
     * @throws BadRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateApplicationResult updateApplication(UpdateApplicationRequest updateApplicationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a configuration profile.
     * </p>
     * 
     * @param updateConfigurationProfileRequest
     * @return updateConfigurationProfileResult The response from the
     *         UpdateConfigurationProfile service method, as returned by Amazon
     *         AppConfig.
     * @throws BadRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateConfigurationProfileResult updateConfigurationProfile(
            UpdateConfigurationProfileRequest updateConfigurationProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a deployment strategy.
     * </p>
     * 
     * @param updateDeploymentStrategyRequest
     * @return updateDeploymentStrategyResult The response from the
     *         UpdateDeploymentStrategy service method, as returned by Amazon
     *         AppConfig.
     * @throws BadRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateDeploymentStrategyResult updateDeploymentStrategy(
            UpdateDeploymentStrategyRequest updateDeploymentStrategyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an environment.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @return updateEnvironmentResult The response from the UpdateEnvironment
     *         service method, as returned by Amazon AppConfig.
     * @throws BadRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateEnvironmentResult updateEnvironment(UpdateEnvironmentRequest updateEnvironmentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Uses the validators in a configuration profile to validate a
     * configuration.
     * </p>
     * 
     * @param validateConfigurationRequest
     * @throws BadRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             AppConfig indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void validateConfiguration(ValidateConfigurationRequest validateConfigurationRequest)
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
