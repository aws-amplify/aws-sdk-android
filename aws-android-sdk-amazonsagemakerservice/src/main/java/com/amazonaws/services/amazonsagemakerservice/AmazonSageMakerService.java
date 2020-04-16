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

package com.amazonaws.services.amazonsagemakerservice;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.amazonsagemakerservice.model.*;

/**
 * Interface for accessing Amazon SageMaker Service
 * <p>
 * Provides APIs for creating and managing Amazon SageMaker resources.
 * </p>
 * <p>
 * Other Resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/sagemaker/latest/dg/whatis.html#first-time-user"
 * >Amazon SageMaker Developer Guide</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/augmented-ai/2019-11-07/APIReference/Welcome.html"
 * >Amazon Augmented AI Runtime API Reference</a>
 * </p>
 * </li>
 * </ul>
 **/
public interface AmazonSageMakerService {

    /**
     * Overrides the default endpoint for this client
     * ("https://api.sagemaker.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "api.sagemaker.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://api.sagemaker.us-east-1.amazonaws.com"). If the
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
     *            "api.sagemaker.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex:
     *            "https://api.sagemaker.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonSageMakerService#setEndpoint(String)},
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
     * Adds or overwrites one or more tags for the specified Amazon SageMaker
     * resource. You can add tags to notebook instances, training jobs,
     * hyperparameter tuning jobs, batch transform jobs, models, labeling jobs,
     * work teams, endpoint configurations, and endpoints.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. Tag keys must be unique
     * per resource. For more information about tags, see For more information,
     * see <a href=
     * "https://aws.amazon.com/answers/account-management/aws-tagging-strategies/"
     * >AWS Tagging Strategies</a>.
     * </p>
     * <note>
     * <p>
     * Tags that you add to a hyperparameter tuning job by calling this API are
     * also added to any training jobs that the hyperparameter tuning job
     * launches after you call this API, but not to training jobs that the
     * hyperparameter tuning job launched before you called this API. To make
     * sure that the tags associated with a hyperparameter tuning job are also
     * added to all training jobs that the hyperparameter tuning job launches,
     * add the tags when you first create the tuning job by specifying them in
     * the <code>Tags</code> parameter of <a>CreateHyperParameterTuningJob</a>
     * </p>
     * </note>
     * 
     * @param addTagsRequest
     * @return addTagsResult The response from the AddTags service method, as
     *         returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    AddTagsResult addTags(AddTagsRequest addTagsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Associates a trial component with a trial. A trial component can be
     * associated with multiple trials. To disassociate a trial component from a
     * trial, call the <a>DisassociateTrialComponent</a> API.
     * </p>
     * 
     * @param associateTrialComponentRequest
     * @return associateTrialComponentResult The response from the
     *         AssociateTrialComponent service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    AssociateTrialComponentResult associateTrialComponent(
            AssociateTrialComponentRequest associateTrialComponentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Create a machine learning algorithm that you can use in Amazon SageMaker
     * and list in the AWS Marketplace.
     * </p>
     * 
     * @param createAlgorithmRequest
     * @return createAlgorithmResult The response from the CreateAlgorithm
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateAlgorithmResult createAlgorithm(CreateAlgorithmRequest createAlgorithmRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a running App for the specified UserProfile. Supported Apps are
     * JupyterServer and KernelGateway. This operation is automatically invoked
     * by Amazon SageMaker Amazon SageMaker Studio (Studio) upon access to the
     * associated Studio Domain, and when new kernel configurations are selected
     * by the user. A user may have multiple Apps active simultaneously. Apps
     * will automatically terminate and be deleted when stopped from within
     * Studio, or when the DeleteApp API is manually called. UserProfiles are
     * limited to 5 concurrently running Apps at a time.
     * </p>
     * 
     * @param createAppRequest
     * @return createAppResult The response from the CreateApp service method,
     *         as returned by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateAppResult createApp(CreateAppRequest createAppRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates an AutoPilot job.
     * </p>
     * <p>
     * After you run an AutoPilot job, you can find the best performing model by
     * calling , and then deploy that model by following the steps described in
     * <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/ex1-deploy-model.html"
     * >Step 6.1: Deploy the Model to Amazon SageMaker Hosting Services</a>.
     * </p>
     * <p>
     * For information about how to use AutoPilot, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-automate-model-development.html"
     * >Use AutoPilot to Automate Model Development</a>.
     * </p>
     * 
     * @param createAutoMLJobRequest
     * @return createAutoMLJobResult The response from the CreateAutoMLJob
     *         service method, as returned by Amazon SageMaker Service.
     * @throws ResourceInUseException
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateAutoMLJobResult createAutoMLJob(CreateAutoMLJobRequest createAutoMLJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a Git repository as a resource in your Amazon SageMaker account.
     * You can associate the repository with notebook instances so that you can
     * use Git source control for the notebooks you create. The Git repository
     * is a resource in your Amazon SageMaker account, so it can be associated
     * with more than one notebook instance, and it persists independently from
     * the lifecycle of any notebook instances it is associated with.
     * </p>
     * <p>
     * The repository can be hosted either in <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html"
     * >AWS CodeCommit</a> or in any other Git repository.
     * </p>
     * 
     * @param createCodeRepositoryRequest
     * @return createCodeRepositoryResult The response from the
     *         CreateCodeRepository service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateCodeRepositoryResult createCodeRepository(
            CreateCodeRepositoryRequest createCodeRepositoryRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Starts a model compilation job. After the model has been compiled, Amazon
     * SageMaker saves the resulting model artifacts to an Amazon Simple Storage
     * Service (Amazon S3) bucket that you specify.
     * </p>
     * <p>
     * If you choose to host your model using Amazon SageMaker hosting services,
     * you can use the resulting model artifacts as part of the model. You can
     * also use the artifacts with AWS IoT Greengrass. In that case, deploy them
     * as an ML resource.
     * </p>
     * <p>
     * In the request body, you provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A name for the compilation job
     * </p>
     * </li>
     * <li>
     * <p>
     * Information about the input model artifacts
     * </p>
     * </li>
     * <li>
     * <p>
     * The output location for the compiled model and the device (target) that
     * the model runs on
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker assumes to perform the model compilation job</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can also provide a <code>Tag</code> to track the model compilation
     * job's resource use and costs. The response body contains the
     * <code>CompilationJobArn</code> for the compiled job.
     * </p>
     * <p>
     * To stop a model compilation job, use <a>StopCompilationJob</a>. To get
     * information about a particular model compilation job, use
     * <a>DescribeCompilationJob</a>. To get information about multiple model
     * compilation jobs, use <a>ListCompilationJobs</a>.
     * </p>
     * 
     * @param createCompilationJobRequest
     * @return createCompilationJobResult The response from the
     *         CreateCompilationJob service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceInUseException
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateCompilationJobResult createCompilationJob(
            CreateCompilationJobRequest createCompilationJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a Domain for Amazon SageMaker Amazon SageMaker Studio (Studio),
     * which can be accessed by end-users in a web browser. A Domain has an
     * associated directory, list of authorized users, and a variety of
     * security, application, policies, and Amazon Virtual Private Cloud
     * configurations. An AWS account is limited to one Domain, per region.
     * Users within a domain can share notebook files and other artifacts with
     * each other. When a Domain is created, an Amazon Elastic File System (EFS)
     * is also created for use by all of the users within the Domain. Each user
     * receives a private home directory within the EFS for notebooks, Git
     * repositories, and data files.
     * </p>
     * 
     * @param createDomainRequest
     * @return createDomainResult The response from the CreateDomain service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateDomainResult createDomain(CreateDomainRequest createDomainRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an endpoint using the endpoint configuration specified in the
     * request. Amazon SageMaker uses the endpoint to provision resources and
     * deploy models. You create the endpoint configuration with the
     * <a>CreateEndpointConfig</a> API.
     * </p>
     * <p>
     * Use this API to deploy models using Amazon SageMaker hosting services.
     * </p>
     * <p>
     * For an example that calls this method when deploying a model to Amazon
     * SageMaker hosting services, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/ex1-deploy-model.html#ex1-deploy-model-boto"
     * >Deploy the Model to Amazon SageMaker Hosting Services (AWS SDK for
     * Python (Boto 3)).</a>
     * </p>
     * <note>
     * <p>
     * You must not delete an <code>EndpointConfig</code> that is in use by an
     * endpoint that is live or while the <code>UpdateEndpoint</code> or
     * <code>CreateEndpoint</code> operations are being performed on the
     * endpoint. To update an endpoint, you must create a new
     * <code>EndpointConfig</code>.
     * </p>
     * </note>
     * <p>
     * The endpoint name must be unique within an AWS Region in your AWS
     * account.
     * </p>
     * <p>
     * When it receives the request, Amazon SageMaker creates the endpoint,
     * launches the resources (ML compute instances), and deploys the model(s)
     * on them.
     * </p>
     * <p>
     * When Amazon SageMaker receives the request, it sets the endpoint status
     * to <code>Creating</code>. After it creates the endpoint, it sets the
     * status to <code>InService</code>. Amazon SageMaker can then process
     * incoming requests for inferences. To check the status of an endpoint, use
     * the <a>DescribeEndpoint</a> API.
     * </p>
     * <p>
     * If any of the models hosted at this endpoint get model data from an
     * Amazon S3 location, Amazon SageMaker uses AWS Security Token Service to
     * download model artifacts from the S3 path you provided. AWS STS is
     * activated in your IAM user account by default. If you previously
     * deactivated AWS STS for a region, you need to reactivate AWS STS for that
     * region. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     * >Activating and Deactivating AWS STS in an AWS Region</a> in the <i>AWS
     * Identity and Access Management User Guide</i>.
     * </p>
     * 
     * @param createEndpointRequest
     * @return createEndpointResult The response from the CreateEndpoint service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateEndpointResult createEndpoint(CreateEndpointRequest createEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an endpoint configuration that Amazon SageMaker hosting services
     * uses to deploy models. In the configuration, you identify one or more
     * models, created using the <code>CreateModel</code> API, to deploy and the
     * resources that you want Amazon SageMaker to provision. Then you call the
     * <a>CreateEndpoint</a> API.
     * </p>
     * <note>
     * <p>
     * Use this API if you want to use Amazon SageMaker hosting services to
     * deploy models into production.
     * </p>
     * </note>
     * <p>
     * In the request, you define a <code>ProductionVariant</code>, for each
     * model that you want to deploy. Each <code>ProductionVariant</code>
     * parameter also describes the resources that you want Amazon SageMaker to
     * provision. This includes the number and type of ML compute instances to
     * deploy.
     * </p>
     * <p>
     * If you are hosting multiple models, you also assign a
     * <code>VariantWeight</code> to specify how much traffic you want to
     * allocate to each model. For example, suppose that you want to host two
     * models, A and B, and you assign traffic weight 2 for model A and 1 for
     * model B. Amazon SageMaker distributes two-thirds of the traffic to Model
     * A, and one-third to model B.
     * </p>
     * <p>
     * For an example that calls this method when deploying a model to Amazon
     * SageMaker hosting services, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/ex1-deploy-model.html#ex1-deploy-model-boto"
     * >Deploy the Model to Amazon SageMaker Hosting Services (AWS SDK for
     * Python (Boto 3)).</a>
     * </p>
     * 
     * @param createEndpointConfigRequest
     * @return createEndpointConfigResult The response from the
     *         CreateEndpointConfig service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateEndpointConfigResult createEndpointConfig(
            CreateEndpointConfigRequest createEndpointConfigRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates an Amazon SageMaker <i>experiment</i>. An experiment is a
     * collection of <i>trials</i> that are observed, compared and evaluated as
     * a group. A trial is a set of steps, called <i>trial components</i>, that
     * produce a machine learning model.
     * </p>
     * <p>
     * The goal of an experiment is to determine the components that produce the
     * best model. Multiple trials are performed, each one isolating and
     * measuring the impact of a change to one or more inputs, while keeping the
     * remaining inputs constant.
     * </p>
     * <p>
     * When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK,
     * all experiments, trials, and trial components are automatically tracked,
     * logged, and indexed. When you use the AWS SDK for Python (Boto), you must
     * use the logging APIs provided by the SDK.
     * </p>
     * <p>
     * You can add tags to experiments, trials, trial components and then use
     * the <a>Search</a> API to search for the tags.
     * </p>
     * <p>
     * To add a description to an experiment, specify the optional
     * <code>Description</code> parameter. To add a description later, or to
     * change the description, call the <a>UpdateExperiment</a> API.
     * </p>
     * <p>
     * To get a list of all your experiments, call the <a>ListExperiments</a>
     * API. To view an experiment's properties, call the
     * <a>DescribeExperiment</a> API. To get a list of all the trials associated
     * with an experiment, call the <a>ListTrials</a> API. To create a trial
     * call the <a>CreateTrial</a> API.
     * </p>
     * 
     * @param createExperimentRequest
     * @return createExperimentResult The response from the CreateExperiment
     *         service method, as returned by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateExperimentResult createExperiment(CreateExperimentRequest createExperimentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a flow definition.
     * </p>
     * 
     * @param createFlowDefinitionRequest
     * @return createFlowDefinitionResult The response from the
     *         CreateFlowDefinition service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateFlowDefinitionResult createFlowDefinition(
            CreateFlowDefinitionRequest createFlowDefinitionRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Defines the settings you will use for the human review workflow user
     * interface. Reviewers will see a three-panel interface with an instruction
     * area, the item to review, and an input area.
     * </p>
     * 
     * @param createHumanTaskUiRequest
     * @return createHumanTaskUiResult The response from the CreateHumanTaskUi
     *         service method, as returned by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateHumanTaskUiResult createHumanTaskUi(CreateHumanTaskUiRequest createHumanTaskUiRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts a hyperparameter tuning job. A hyperparameter tuning job finds the
     * best version of a model by running many training jobs on your dataset
     * using the algorithm you choose and values for hyperparameters within
     * ranges that you specify. It then chooses the hyperparameter values that
     * result in a model that performs the best, as measured by an objective
     * metric that you choose.
     * </p>
     * 
     * @param createHyperParameterTuningJobRequest
     * @return createHyperParameterTuningJobResult The response from the
     *         CreateHyperParameterTuningJob service method, as returned by
     *         Amazon SageMaker Service.
     * @throws ResourceInUseException
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateHyperParameterTuningJobResult createHyperParameterTuningJob(
            CreateHyperParameterTuningJobRequest createHyperParameterTuningJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a job that uses workers to label the data objects in your input
     * dataset. You can use the labeled data to train machine learning models.
     * </p>
     * <p>
     * You can select your workforce from one of three providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A private workforce that you create. It can include employees,
     * contractors, and outside experts. Use a private workforce when want the
     * data to stay within your organization or when a specific set of skills is
     * required.
     * </p>
     * </li>
     * <li>
     * <p>
     * One or more vendors that you select from the AWS Marketplace. Vendors
     * provide expertise in specific areas.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon Mechanical Turk workforce. This is the largest workforce, but
     * it should only be used for public data or data that has been stripped of
     * any personally identifiable information.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can also use <i>automated data labeling</i> to reduce the number of
     * data objects that need to be labeled by a human. Automated data labeling
     * uses <i>active learning</i> to determine if a data object can be labeled
     * by machine or if it needs to be sent to a human worker. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-automated-labeling.html"
     * >Using Automated Data Labeling</a>.
     * </p>
     * <p>
     * The data objects to be labeled are contained in an Amazon S3 bucket. You
     * create a <i>manifest file</i> that describes the location of each object.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-data.html"
     * >Using Input and Output Data</a>.
     * </p>
     * <p>
     * The output can be used as the manifest file for another labeling job or
     * as training data for your machine learning models.
     * </p>
     * 
     * @param createLabelingJobRequest
     * @return createLabelingJobResult The response from the CreateLabelingJob
     *         service method, as returned by Amazon SageMaker Service.
     * @throws ResourceInUseException
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateLabelingJobResult createLabelingJob(CreateLabelingJobRequest createLabelingJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a model in Amazon SageMaker. In the request, you name the model
     * and describe a primary container. For the primary container, you specify
     * the Docker image that contains inference code, artifacts (from prior
     * training), and a custom environment map that the inference code uses when
     * you deploy the model for predictions.
     * </p>
     * <p>
     * Use this API to create a model if you want to use Amazon SageMaker
     * hosting services or run a batch transform job.
     * </p>
     * <p>
     * To host your model, you create an endpoint configuration with the
     * <code>CreateEndpointConfig</code> API, and then create an endpoint with
     * the <code>CreateEndpoint</code> API. Amazon SageMaker then deploys all of
     * the containers that you defined for the model in the hosting environment.
     * </p>
     * <p>
     * For an example that calls this method when deploying a model to Amazon
     * SageMaker hosting services, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/ex1-deploy-model.html#ex1-deploy-model-boto"
     * >Deploy the Model to Amazon SageMaker Hosting Services (AWS SDK for
     * Python (Boto 3)).</a>
     * </p>
     * <p>
     * To run a batch transform using your model, you start a job with the
     * <code>CreateTransformJob</code> API. Amazon SageMaker uses your model and
     * your dataset to get inferences which are then saved to a specified S3
     * location.
     * </p>
     * <p>
     * In the <code>CreateModel</code> request, you must define a container with
     * the <code>PrimaryContainer</code> parameter.
     * </p>
     * <p>
     * In the request, you also provide an IAM role that Amazon SageMaker can
     * assume to access model artifacts and docker image for deployment on ML
     * compute hosting instances or for batch transform jobs. In addition, you
     * also use the IAM role to manage permissions the inference code needs. For
     * example, if the inference code access any other AWS resources, you grant
     * necessary permissions via this role.
     * </p>
     * 
     * @param createModelRequest
     * @return createModelResult The response from the CreateModel service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateModelResult createModel(CreateModelRequest createModelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a model package that you can use to create Amazon SageMaker
     * models or list on AWS Marketplace. Buyers can subscribe to model packages
     * listed on AWS Marketplace to create models in Amazon SageMaker.
     * </p>
     * <p>
     * To create a model package by specifying a Docker container that contains
     * your inference code and the Amazon S3 location of your model artifacts,
     * provide values for <code>InferenceSpecification</code>. To create a model
     * from an algorithm resource that you created or subscribed to in AWS
     * Marketplace, provide a value for
     * <code>SourceAlgorithmSpecification</code>.
     * </p>
     * 
     * @param createModelPackageRequest
     * @return createModelPackageResult The response from the CreateModelPackage
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateModelPackageResult createModelPackage(CreateModelPackageRequest createModelPackageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a schedule that regularly starts Amazon SageMaker Processing Jobs
     * to monitor the data captured for an Amazon SageMaker Endoint.
     * </p>
     * 
     * @param createMonitoringScheduleRequest
     * @return createMonitoringScheduleResult The response from the
     *         CreateMonitoringSchedule service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateMonitoringScheduleResult createMonitoringSchedule(
            CreateMonitoringScheduleRequest createMonitoringScheduleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an Amazon SageMaker notebook instance. A notebook instance is a
     * machine learning (ML) compute instance running on a Jupyter notebook.
     * </p>
     * <p>
     * In a <code>CreateNotebookInstance</code> request, specify the type of ML
     * compute instance that you want to run. Amazon SageMaker launches the
     * instance, installs common libraries that you can use to explore datasets
     * for model training, and attaches an ML storage volume to the notebook
     * instance.
     * </p>
     * <p>
     * Amazon SageMaker also provides a set of example notebooks. Each notebook
     * demonstrates how to use Amazon SageMaker with a specific algorithm or
     * with a machine learning framework.
     * </p>
     * <p>
     * After receiving the request, Amazon SageMaker does the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Creates a network interface in the Amazon SageMaker VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Option) If you specified <code>SubnetId</code>, Amazon SageMaker creates
     * a network interface in your own VPC, which is inferred from the subnet ID
     * that you provide in the input. When creating this network interface,
     * Amazon SageMaker attaches the security group that you specified in the
     * request to the network interface that it creates in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Launches an EC2 instance of the type specified in the request in the
     * Amazon SageMaker VPC. If you specified <code>SubnetId</code> of your VPC,
     * Amazon SageMaker specifies both network interfaces when launching this
     * instance. This enables inbound traffic from your own VPC to the notebook
     * instance, assuming that the security groups allow it.
     * </p>
     * </li>
     * </ol>
     * <p>
     * After creating the notebook instance, Amazon SageMaker returns its Amazon
     * Resource Name (ARN). You can't change the name of a notebook instance
     * after you create it.
     * </p>
     * <p>
     * After Amazon SageMaker creates the notebook instance, you can connect to
     * the Jupyter server and work in Jupyter notebooks. For example, you can
     * write code to explore a dataset that you can use for model training,
     * train a model, host models by creating Amazon SageMaker endpoints, and
     * validate hosted models.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works.html">How
     * It Works</a>.
     * </p>
     * 
     * @param createNotebookInstanceRequest
     * @return createNotebookInstanceResult The response from the
     *         CreateNotebookInstance service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateNotebookInstanceResult createNotebookInstance(
            CreateNotebookInstanceRequest createNotebookInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a lifecycle configuration that you can associate with a notebook
     * instance. A <i>lifecycle configuration</i> is a collection of shell
     * scripts that run when you create or start a notebook instance.
     * </p>
     * <p>
     * Each lifecycle configuration script has a limit of 16384 characters.
     * </p>
     * <p>
     * The value of the <code>$PATH</code> environment variable that is
     * available to both scripts is <code>/sbin:bin:/usr/sbin:/usr/bin</code>.
     * </p>
     * <p>
     * View CloudWatch Logs for notebook instance lifecycle configurations in
     * log group <code>/aws/sagemaker/NotebookInstances</code> in log stream
     * <code>[notebook-instance-name]/[LifecycleConfigHook]</code>.
     * </p>
     * <p>
     * Lifecycle configuration scripts cannot run for longer than 5 minutes. If
     * a script runs for longer than 5 minutes, it fails and the notebook
     * instance is not created or started.
     * </p>
     * <p>
     * For information about notebook instance lifestyle configurations, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html"
     * >Step 2.1: (Optional) Customize a Notebook Instance</a>.
     * </p>
     * 
     * @param createNotebookInstanceLifecycleConfigRequest
     * @return createNotebookInstanceLifecycleConfigResult The response from the
     *         CreateNotebookInstanceLifecycleConfig service method, as returned
     *         by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateNotebookInstanceLifecycleConfigResult createNotebookInstanceLifecycleConfig(
            CreateNotebookInstanceLifecycleConfigRequest createNotebookInstanceLifecycleConfigRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a URL for a specified UserProfile in a Domain. When accessed in a
     * web browser, the user will be automatically signed in to Amazon SageMaker
     * Amazon SageMaker Studio (Studio), and granted access to all of the Apps
     * and files associated with that Amazon Elastic File System (EFS). This
     * operation can only be called when AuthMode equals IAM.
     * </p>
     * 
     * @param createPresignedDomainUrlRequest
     * @return createPresignedDomainUrlResult The response from the
     *         CreatePresignedDomainUrl service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreatePresignedDomainUrlResult createPresignedDomainUrl(
            CreatePresignedDomainUrlRequest createPresignedDomainUrlRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a URL that you can use to connect to the Jupyter server from a
     * notebook instance. In the Amazon SageMaker console, when you choose
     * <code>Open</code> next to a notebook instance, Amazon SageMaker opens a
     * new tab showing the Jupyter server home page from the notebook instance.
     * The console uses this API to get the URL and show the page.
     * </p>
     * <p>
     * IAM authorization policies for this API are also enforced for every HTTP
     * request and WebSocket frame that attempts to connect to the notebook
     * instance.For example, you can restrict access to this API and to the URL
     * that it returns to a list of IP addresses that you specify. Use the
     * <code>NotIpAddress</code> condition operator and the
     * <code>aws:SourceIP</code> condition context key to specify the list of IP
     * addresses that you want to have access to the notebook instance. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/security_iam_id-based-policy-examples.html#nbi-ip-filter"
     * >Limit Access to a Notebook Instance by IP Address</a>.
     * </p>
     * <note>
     * <p>
     * The URL that you get from a call to
     * <a>CreatePresignedNotebookInstanceUrl</a> is valid only for 5 minutes. If
     * you try to use the URL after the 5-minute limit expires, you are directed
     * to the AWS console sign-in page.
     * </p>
     * </note>
     * 
     * @param createPresignedNotebookInstanceUrlRequest
     * @return createPresignedNotebookInstanceUrlResult The response from the
     *         CreatePresignedNotebookInstanceUrl service method, as returned by
     *         Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreatePresignedNotebookInstanceUrlResult createPresignedNotebookInstanceUrl(
            CreatePresignedNotebookInstanceUrlRequest createPresignedNotebookInstanceUrlRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a processing job.
     * </p>
     * 
     * @param createProcessingJobRequest
     * @return createProcessingJobResult The response from the
     *         CreateProcessingJob service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceInUseException
     * @throws ResourceLimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateProcessingJobResult createProcessingJob(
            CreateProcessingJobRequest createProcessingJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Starts a model training job. After training completes, Amazon SageMaker
     * saves the resulting model artifacts to an Amazon S3 location that you
     * specify.
     * </p>
     * <p>
     * If you choose to host your model using Amazon SageMaker hosting services,
     * you can use the resulting model artifacts as part of the model. You can
     * also use the artifacts in a machine learning service other than Amazon
     * SageMaker, provided that you know how to use them for inferences.
     * </p>
     * <p>
     * In the request body, you provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AlgorithmSpecification</code> - Identifies the training algorithm
     * to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HyperParameters</code> - Specify these algorithm-specific
     * parameters to enable the estimation of model parameters during training.
     * Hyperparameters can be tuned to optimize this learning process. For a
     * list of hyperparameters for each training algorithm provided by Amazon
     * SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     * >Algorithms</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InputDataConfig</code> - Describes the training dataset and the
     * Amazon S3, EFS, or FSx location where it is stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutputDataConfig</code> - Identifies the Amazon S3 bucket where you
     * want Amazon SageMaker to save the results of model training.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>ResourceConfig</code> - Identifies the resources, ML compute
     * instances, and ML storage volumes to deploy for model training. In
     * distributed training, you specify more than one instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EnableManagedSpotTraining</code> - Optimize the cost of training
     * machine learning models by up to 80% by using Amazon EC2 Spot instances.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/model-managed-spot-training.html"
     * >Managed Spot Training</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RoleARN</code> - The Amazon Resource Number (ARN) that Amazon
     * SageMaker assumes to perform tasks on your behalf during model training.
     * You must grant this role the necessary permissions so that Amazon
     * SageMaker can successfully complete model training.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StoppingCondition</code> - To help cap training costs, use
     * <code>MaxRuntimeInSeconds</code> to set a time limit for training. Use
     * <code>MaxWaitTimeInSeconds</code> to specify how long you are willing to
     * wait for a managed spot training job to complete.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Amazon SageMaker, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works.html">How
     * It Works</a>.
     * </p>
     * 
     * @param createTrainingJobRequest
     * @return createTrainingJobResult The response from the CreateTrainingJob
     *         service method, as returned by Amazon SageMaker Service.
     * @throws ResourceInUseException
     * @throws ResourceLimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateTrainingJobResult createTrainingJob(CreateTrainingJobRequest createTrainingJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts a transform job. A transform job uses a trained model to get
     * inferences on a dataset and saves these results to an Amazon S3 location
     * that you specify.
     * </p>
     * <p>
     * To perform batch transformations, you create a transform job and use the
     * data that you have readily available.
     * </p>
     * <p>
     * In the request body, you provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TransformJobName</code> - Identifies the transform job. The name
     * must be unique within an AWS Region in an AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ModelName</code> - Identifies the model to use.
     * <code>ModelName</code> must be the name of an existing Amazon SageMaker
     * model in the same AWS Region and AWS account. For information on creating
     * a model, see <a>CreateModel</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TransformInput</code> - Describes the dataset to be transformed and
     * the Amazon S3 location where it is stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TransformOutput</code> - Identifies the Amazon S3 location where
     * you want Amazon SageMaker to save the results from the transform job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TransformResources</code> - Identifies the ML compute instances for
     * the transform job.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about how batch transformation works, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform.html"
     * >Batch Transform</a>.
     * </p>
     * 
     * @param createTransformJobRequest
     * @return createTransformJobResult The response from the CreateTransformJob
     *         service method, as returned by Amazon SageMaker Service.
     * @throws ResourceInUseException
     * @throws ResourceLimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateTransformJobResult createTransformJob(CreateTransformJobRequest createTransformJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an Amazon SageMaker <i>trial</i>. A trial is a set of steps
     * called <i>trial components</i> that produce a machine learning model. A
     * trial is part of a single Amazon SageMaker <i>experiment</i>.
     * </p>
     * <p>
     * When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK,
     * all experiments, trials, and trial components are automatically tracked,
     * logged, and indexed. When you use the AWS SDK for Python (Boto), you must
     * use the logging APIs provided by the SDK.
     * </p>
     * <p>
     * You can add tags to a trial and then use the <a>Search</a> API to search
     * for the tags.
     * </p>
     * <p>
     * To get a list of all your trials, call the <a>ListTrials</a> API. To view
     * a trial's properties, call the <a>DescribeTrial</a> API. To create a
     * trial component, call the <a>CreateTrialComponent</a> API.
     * </p>
     * 
     * @param createTrialRequest
     * @return createTrialResult The response from the CreateTrial service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateTrialResult createTrial(CreateTrialRequest createTrialRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a <i>trial component</i>, which is a stage of a machine learning
     * <i>trial</i>. A trial is composed of one or more trial components. A
     * trial component can be used in multiple trials.
     * </p>
     * <p>
     * Trial components include pre-processing jobs, training jobs, and batch
     * transform jobs.
     * </p>
     * <p>
     * When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK,
     * all experiments, trials, and trial components are automatically tracked,
     * logged, and indexed. When you use the AWS SDK for Python (Boto), you must
     * use the logging APIs provided by the SDK.
     * </p>
     * <p>
     * You can add tags to a trial component and then use the <a>Search</a> API
     * to search for the tags.
     * </p>
     * <note>
     * <p>
     * <code>CreateTrialComponent</code> can only be invoked from within an
     * Amazon SageMaker managed environment. This includes Amazon SageMaker
     * training jobs, processing jobs, transform jobs, and Amazon SageMaker
     * notebooks. A call to <code>CreateTrialComponent</code> from outside one
     * of these environments results in an error.
     * </p>
     * </note>
     * 
     * @param createTrialComponentRequest
     * @return createTrialComponentResult The response from the
     *         CreateTrialComponent service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateTrialComponentResult createTrialComponent(
            CreateTrialComponentRequest createTrialComponentRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a new user profile. A user profile represents a single user
     * within a Domain, and is the main way to reference a "person" for the
     * purposes of sharing, reporting and other user-oriented features. This
     * entity is created during on-boarding. If an administrator invites a
     * person by email or imports them from SSO, a new UserProfile is
     * automatically created. This entity is the primary holder of settings for
     * an individual user and has a reference to the user's private Amazon
     * Elastic File System (EFS) home directory.
     * </p>
     * 
     * @param createUserProfileRequest
     * @return createUserProfileResult The response from the CreateUserProfile
     *         service method, as returned by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateUserProfileResult createUserProfile(CreateUserProfileRequest createUserProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new work team for labeling your data. A work team is defined by
     * one or more Amazon Cognito user pools. You must first create the user
     * pools before you can create a work team.
     * </p>
     * <p>
     * You cannot create more than 25 work teams in an account and region.
     * </p>
     * 
     * @param createWorkteamRequest
     * @return createWorkteamResult The response from the CreateWorkteam service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceInUseException
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateWorkteamResult createWorkteam(CreateWorkteamRequest createWorkteamRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes the specified algorithm from your account.
     * </p>
     * 
     * @param deleteAlgorithmRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteAlgorithm(DeleteAlgorithmRequest deleteAlgorithmRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Used to stop and delete an app.
     * </p>
     * 
     * @param deleteAppRequest
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteApp(DeleteAppRequest deleteAppRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified Git repository from your account.
     * </p>
     * 
     * @param deleteCodeRepositoryRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteCodeRepository(DeleteCodeRepositoryRequest deleteCodeRepositoryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Used to delete a domain. If you on-boarded with IAM mode, you will need
     * to delete your domain to on-board again using SSO. Use with caution. All
     * of the members of the domain will lose access to their EFS volume,
     * including data, notebooks, and other artifacts.
     * </p>
     * 
     * @param deleteDomainRequest
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteDomain(DeleteDomainRequest deleteDomainRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes an endpoint. Amazon SageMaker frees up all of the resources that
     * were deployed when the endpoint was created.
     * </p>
     * <p>
     * Amazon SageMaker retires any custom KMS key grants associated with the
     * endpoint, meaning you don't need to use the <a href=
     * "http://docs.aws.amazon.com/kms/latest/APIReference/API_RevokeGrant.html"
     * >RevokeGrant</a> API call.
     * </p>
     * 
     * @param deleteEndpointRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteEndpoint(DeleteEndpointRequest deleteEndpointRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes an endpoint configuration. The <code>DeleteEndpointConfig</code>
     * API deletes only the specified configuration. It does not delete
     * endpoints created using the configuration.
     * </p>
     * 
     * @param deleteEndpointConfigRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteEndpointConfig(DeleteEndpointConfigRequest deleteEndpointConfigRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an Amazon SageMaker experiment. All trials associated with the
     * experiment must be deleted first. Use the <a>ListTrials</a> API to get a
     * list of the trials associated with the experiment.
     * </p>
     * 
     * @param deleteExperimentRequest
     * @return deleteExperimentResult The response from the DeleteExperiment
     *         service method, as returned by Amazon SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DeleteExperimentResult deleteExperiment(DeleteExperimentRequest deleteExperimentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified flow definition.
     * </p>
     * 
     * @param deleteFlowDefinitionRequest
     * @return deleteFlowDefinitionResult The response from the
     *         DeleteFlowDefinition service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DeleteFlowDefinitionResult deleteFlowDefinition(
            DeleteFlowDefinitionRequest deleteFlowDefinitionRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a model. The <code>DeleteModel</code> API deletes only the model
     * entry that was created in Amazon SageMaker when you called the
     * <a>CreateModel</a> API. It does not delete model artifacts, inference
     * code, or the IAM role that you specified when creating the model.
     * </p>
     * 
     * @param deleteModelRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteModel(DeleteModelRequest deleteModelRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a model package.
     * </p>
     * <p>
     * A model package is used to create Amazon SageMaker models or list on AWS
     * Marketplace. Buyers can subscribe to model packages listed on AWS
     * Marketplace to create models in Amazon SageMaker.
     * </p>
     * 
     * @param deleteModelPackageRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteModelPackage(DeleteModelPackageRequest deleteModelPackageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a monitoring schedule. Also stops the schedule had not already
     * been stopped. This does not delete the job execution history of the
     * monitoring schedule.
     * </p>
     * 
     * @param deleteMonitoringScheduleRequest
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteMonitoringSchedule(DeleteMonitoringScheduleRequest deleteMonitoringScheduleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an Amazon SageMaker notebook instance. Before you can delete a
     * notebook instance, you must call the <code>StopNotebookInstance</code>
     * API.
     * </p>
     * <important>
     * <p>
     * When you delete a notebook instance, you lose all of your data. Amazon
     * SageMaker removes the ML compute instance, and deletes the ML storage
     * volume and the network interface associated with the notebook instance.
     * </p>
     * </important>
     * 
     * @param deleteNotebookInstanceRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteNotebookInstance(DeleteNotebookInstanceRequest deleteNotebookInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a notebook instance lifecycle configuration.
     * </p>
     * 
     * @param deleteNotebookInstanceLifecycleConfigRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteNotebookInstanceLifecycleConfig(
            DeleteNotebookInstanceLifecycleConfigRequest deleteNotebookInstanceLifecycleConfigRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified tags from an Amazon SageMaker resource.
     * </p>
     * <p>
     * To list a resource's tags, use the <code>ListTags</code> API.
     * </p>
     * <note>
     * <p>
     * When you call this API to delete tags from a hyperparameter tuning job,
     * the deleted tags are not removed from training jobs that the
     * hyperparameter tuning job launched before you called this API.
     * </p>
     * </note>
     * 
     * @param deleteTagsRequest
     * @return deleteTagsResult The response from the DeleteTags service method,
     *         as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DeleteTagsResult deleteTags(DeleteTagsRequest deleteTagsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified trial. All trial components that make up the trial
     * must be deleted first. Use the <a>DescribeTrialComponent</a> API to get
     * the list of trial components.
     * </p>
     * 
     * @param deleteTrialRequest
     * @return deleteTrialResult The response from the DeleteTrial service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DeleteTrialResult deleteTrial(DeleteTrialRequest deleteTrialRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified trial component. A trial component must be
     * disassociated from all trials before the trial component can be deleted.
     * To disassociate a trial component from a trial, call the
     * <a>DisassociateTrialComponent</a> API.
     * </p>
     * 
     * @param deleteTrialComponentRequest
     * @return deleteTrialComponentResult The response from the
     *         DeleteTrialComponent service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DeleteTrialComponentResult deleteTrialComponent(
            DeleteTrialComponentRequest deleteTrialComponentRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a user profile.
     * </p>
     * 
     * @param deleteUserProfileRequest
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void deleteUserProfile(DeleteUserProfileRequest deleteUserProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an existing work team. This operation can't be undone.
     * </p>
     * 
     * @param deleteWorkteamRequest
     * @return deleteWorkteamResult The response from the DeleteWorkteam service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DeleteWorkteamResult deleteWorkteam(DeleteWorkteamRequest deleteWorkteamRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a description of the specified algorithm that is in your account.
     * </p>
     * 
     * @param describeAlgorithmRequest
     * @return describeAlgorithmResult The response from the DescribeAlgorithm
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeAlgorithmResult describeAlgorithm(DescribeAlgorithmRequest describeAlgorithmRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the app.
     * </p>
     * 
     * @param describeAppRequest
     * @return describeAppResult The response from the DescribeApp service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeAppResult describeApp(DescribeAppRequest describeAppRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about an Amazon SageMaker job.
     * </p>
     * 
     * @param describeAutoMLJobRequest
     * @return describeAutoMLJobResult The response from the DescribeAutoMLJob
     *         service method, as returned by Amazon SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeAutoMLJobResult describeAutoMLJob(DescribeAutoMLJobRequest describeAutoMLJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets details about the specified Git repository.
     * </p>
     * 
     * @param describeCodeRepositoryRequest
     * @return describeCodeRepositoryResult The response from the
     *         DescribeCodeRepository service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeCodeRepositoryResult describeCodeRepository(
            DescribeCodeRepositoryRequest describeCodeRepositoryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a model compilation job.
     * </p>
     * <p>
     * To create a model compilation job, use <a>CreateCompilationJob</a>. To
     * get information about multiple model compilation jobs, use
     * <a>ListCompilationJobs</a>.
     * </p>
     * 
     * @param describeCompilationJobRequest
     * @return describeCompilationJobResult The response from the
     *         DescribeCompilationJob service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeCompilationJobResult describeCompilationJob(
            DescribeCompilationJobRequest describeCompilationJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * The desciption of the domain.
     * </p>
     * 
     * @param describeDomainRequest
     * @return describeDomainResult The response from the DescribeDomain service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeDomainResult describeDomain(DescribeDomainRequest describeDomainRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the description of an endpoint.
     * </p>
     * 
     * @param describeEndpointRequest
     * @return describeEndpointResult The response from the DescribeEndpoint
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeEndpointResult describeEndpoint(DescribeEndpointRequest describeEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the description of an endpoint configuration created using the
     * <code>CreateEndpointConfig</code> API.
     * </p>
     * 
     * @param describeEndpointConfigRequest
     * @return describeEndpointConfigResult The response from the
     *         DescribeEndpointConfig service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeEndpointConfigResult describeEndpointConfig(
            DescribeEndpointConfigRequest describeEndpointConfigRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides a list of an experiment's properties.
     * </p>
     * 
     * @param describeExperimentRequest
     * @return describeExperimentResult The response from the DescribeExperiment
     *         service method, as returned by Amazon SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeExperimentResult describeExperiment(DescribeExperimentRequest describeExperimentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the specified flow definition.
     * </p>
     * 
     * @param describeFlowDefinitionRequest
     * @return describeFlowDefinitionResult The response from the
     *         DescribeFlowDefinition service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeFlowDefinitionResult describeFlowDefinition(
            DescribeFlowDefinitionRequest describeFlowDefinitionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the requested human task user interface.
     * </p>
     * 
     * @param describeHumanTaskUiRequest
     * @return describeHumanTaskUiResult The response from the
     *         DescribeHumanTaskUi service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeHumanTaskUiResult describeHumanTaskUi(
            DescribeHumanTaskUiRequest describeHumanTaskUiRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets a description of a hyperparameter tuning job.
     * </p>
     * 
     * @param describeHyperParameterTuningJobRequest
     * @return describeHyperParameterTuningJobResult The response from the
     *         DescribeHyperParameterTuningJob service method, as returned by
     *         Amazon SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeHyperParameterTuningJobResult describeHyperParameterTuningJob(
            DescribeHyperParameterTuningJobRequest describeHyperParameterTuningJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about a labeling job.
     * </p>
     * 
     * @param describeLabelingJobRequest
     * @return describeLabelingJobResult The response from the
     *         DescribeLabelingJob service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeLabelingJobResult describeLabelingJob(
            DescribeLabelingJobRequest describeLabelingJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes a model that you created using the <code>CreateModel</code>
     * API.
     * </p>
     * 
     * @param describeModelRequest
     * @return describeModelResult The response from the DescribeModel service
     *         method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeModelResult describeModel(DescribeModelRequest describeModelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a description of the specified model package, which is used to
     * create Amazon SageMaker models or list them on AWS Marketplace.
     * </p>
     * <p>
     * To create models in Amazon SageMaker, buyers can subscribe to model
     * packages listed on AWS Marketplace.
     * </p>
     * 
     * @param describeModelPackageRequest
     * @return describeModelPackageResult The response from the
     *         DescribeModelPackage service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeModelPackageResult describeModelPackage(
            DescribeModelPackageRequest describeModelPackageRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes the schedule for a monitoring job.
     * </p>
     * 
     * @param describeMonitoringScheduleRequest
     * @return describeMonitoringScheduleResult The response from the
     *         DescribeMonitoringSchedule service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeMonitoringScheduleResult describeMonitoringSchedule(
            DescribeMonitoringScheduleRequest describeMonitoringScheduleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a notebook instance.
     * </p>
     * 
     * @param describeNotebookInstanceRequest
     * @return describeNotebookInstanceResult The response from the
     *         DescribeNotebookInstance service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeNotebookInstanceResult describeNotebookInstance(
            DescribeNotebookInstanceRequest describeNotebookInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a description of a notebook instance lifecycle configuration.
     * </p>
     * <p>
     * For information about notebook instance lifestyle configurations, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html"
     * >Step 2.1: (Optional) Customize a Notebook Instance</a>.
     * </p>
     * 
     * @param describeNotebookInstanceLifecycleConfigRequest
     * @return describeNotebookInstanceLifecycleConfigResult The response from
     *         the DescribeNotebookInstanceLifecycleConfig service method, as
     *         returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeNotebookInstanceLifecycleConfigResult describeNotebookInstanceLifecycleConfig(
            DescribeNotebookInstanceLifecycleConfigRequest describeNotebookInstanceLifecycleConfigRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a description of a processing job.
     * </p>
     * 
     * @param describeProcessingJobRequest
     * @return describeProcessingJobResult The response from the
     *         DescribeProcessingJob service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeProcessingJobResult describeProcessingJob(
            DescribeProcessingJobRequest describeProcessingJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about a work team provided by a vendor. It returns
     * details about the subscription with a vendor in the AWS Marketplace.
     * </p>
     * 
     * @param describeSubscribedWorkteamRequest
     * @return describeSubscribedWorkteamResult The response from the
     *         DescribeSubscribedWorkteam service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeSubscribedWorkteamResult describeSubscribedWorkteam(
            DescribeSubscribedWorkteamRequest describeSubscribedWorkteamRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a training job.
     * </p>
     * 
     * @param describeTrainingJobRequest
     * @return describeTrainingJobResult The response from the
     *         DescribeTrainingJob service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeTrainingJobResult describeTrainingJob(
            DescribeTrainingJobRequest describeTrainingJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns information about a transform job.
     * </p>
     * 
     * @param describeTransformJobRequest
     * @return describeTransformJobResult The response from the
     *         DescribeTransformJob service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeTransformJobResult describeTransformJob(
            DescribeTransformJobRequest describeTransformJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Provides a list of a trial's properties.
     * </p>
     * 
     * @param describeTrialRequest
     * @return describeTrialResult The response from the DescribeTrial service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeTrialResult describeTrial(DescribeTrialRequest describeTrialRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides a list of a trials component's properties.
     * </p>
     * 
     * @param describeTrialComponentRequest
     * @return describeTrialComponentResult The response from the
     *         DescribeTrialComponent service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeTrialComponentResult describeTrialComponent(
            DescribeTrialComponentRequest describeTrialComponentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the user profile.
     * </p>
     * 
     * @param describeUserProfileRequest
     * @return describeUserProfileResult The response from the
     *         DescribeUserProfile service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeUserProfileResult describeUserProfile(
            DescribeUserProfileRequest describeUserProfileRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists private workforce information, including workforce name, Amazon
     * Resource Name (ARN), and, if applicable, allowed IP address ranges (<a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">
     * CIDRs</a>). Allowable IP address ranges are the IP addresses that workers
     * can use to access tasks.
     * </p>
     * <important>
     * <p>
     * This operation applies only to private workforces.
     * </p>
     * </important>
     * 
     * @param describeWorkforceRequest
     * @return describeWorkforceResult The response from the DescribeWorkforce
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeWorkforceResult describeWorkforce(DescribeWorkforceRequest describeWorkforceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about a specific work team. You can see information such
     * as the create date, the last updated date, membership information, and
     * the work team's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param describeWorkteamRequest
     * @return describeWorkteamResult The response from the DescribeWorkteam
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeWorkteamResult describeWorkteam(DescribeWorkteamRequest describeWorkteamRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates a trial component from a trial. This doesn't effect other
     * trials the component is associated with. Before you can delete a
     * component, you must disassociate the component from all trials it is
     * associated with. To associate a trial component with a trial, call the
     * <a>AssociateTrialComponent</a> API.
     * </p>
     * <p>
     * To get a list of the trials a component is associated with, use the
     * <a>Search</a> API. Specify <code>ExperimentTrialComponent</code> for the
     * <code>Resource</code> parameter. The list appears in the response under
     * <code>Results.TrialComponent.Parents</code>.
     * </p>
     * 
     * @param disassociateTrialComponentRequest
     * @return disassociateTrialComponentResult The response from the
     *         DisassociateTrialComponent service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DisassociateTrialComponentResult disassociateTrialComponent(
            DisassociateTrialComponentRequest disassociateTrialComponentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * An auto-complete API for the search functionality in the Amazon SageMaker
     * console. It returns suggestions of possible matches for the property name
     * to use in <code>Search</code> queries. Provides suggestions for
     * <code>HyperParameters</code>, <code>Tags</code>, and <code>Metrics</code>
     * .
     * </p>
     * 
     * @param getSearchSuggestionsRequest
     * @return getSearchSuggestionsResult The response from the
     *         GetSearchSuggestions service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetSearchSuggestionsResult getSearchSuggestions(
            GetSearchSuggestionsRequest getSearchSuggestionsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the machine learning algorithms that have been created.
     * </p>
     * 
     * @param listAlgorithmsRequest
     * @return listAlgorithmsResult The response from the ListAlgorithms service
     *         method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListAlgorithmsResult listAlgorithms(ListAlgorithmsRequest listAlgorithmsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists apps.
     * </p>
     * 
     * @param listAppsRequest
     * @return listAppsResult The response from the ListApps service method, as
     *         returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListAppsResult listApps(ListAppsRequest listAppsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Request a list of jobs.
     * </p>
     * 
     * @param listAutoMLJobsRequest
     * @return listAutoMLJobsResult The response from the ListAutoMLJobs service
     *         method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListAutoMLJobsResult listAutoMLJobs(ListAutoMLJobsRequest listAutoMLJobsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * List the Candidates created for the job.
     * </p>
     * 
     * @param listCandidatesForAutoMLJobRequest
     * @return listCandidatesForAutoMLJobResult The response from the
     *         ListCandidatesForAutoMLJob service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListCandidatesForAutoMLJobResult listCandidatesForAutoMLJob(
            ListCandidatesForAutoMLJobRequest listCandidatesForAutoMLJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of the Git repositories in your account.
     * </p>
     * 
     * @param listCodeRepositoriesRequest
     * @return listCodeRepositoriesResult The response from the
     *         ListCodeRepositories service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListCodeRepositoriesResult listCodeRepositories(
            ListCodeRepositoriesRequest listCodeRepositoriesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists model compilation jobs that satisfy various filters.
     * </p>
     * <p>
     * To create a model compilation job, use <a>CreateCompilationJob</a>. To
     * get information about a particular model compilation job you have
     * created, use <a>DescribeCompilationJob</a>.
     * </p>
     * 
     * @param listCompilationJobsRequest
     * @return listCompilationJobsResult The response from the
     *         ListCompilationJobs service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListCompilationJobsResult listCompilationJobs(
            ListCompilationJobsRequest listCompilationJobsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the domains.
     * </p>
     * 
     * @param listDomainsRequest
     * @return listDomainsResult The response from the ListDomains service
     *         method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListDomainsResult listDomains(ListDomainsRequest listDomainsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists endpoint configurations.
     * </p>
     * 
     * @param listEndpointConfigsRequest
     * @return listEndpointConfigsResult The response from the
     *         ListEndpointConfigs service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListEndpointConfigsResult listEndpointConfigs(
            ListEndpointConfigsRequest listEndpointConfigsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists endpoints.
     * </p>
     * 
     * @param listEndpointsRequest
     * @return listEndpointsResult The response from the ListEndpoints service
     *         method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListEndpointsResult listEndpoints(ListEndpointsRequest listEndpointsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all the experiments in your account. The list can be filtered to
     * show only experiments that were created in a specific time range. The
     * list can be sorted by experiment name or creation time.
     * </p>
     * 
     * @param listExperimentsRequest
     * @return listExperimentsResult The response from the ListExperiments
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListExperimentsResult listExperiments(ListExperimentsRequest listExperimentsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the flow definitions in your account.
     * </p>
     * 
     * @param listFlowDefinitionsRequest
     * @return listFlowDefinitionsResult The response from the
     *         ListFlowDefinitions service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListFlowDefinitionsResult listFlowDefinitions(
            ListFlowDefinitionsRequest listFlowDefinitionsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns information about the human task user interfaces in your account.
     * </p>
     * 
     * @param listHumanTaskUisRequest
     * @return listHumanTaskUisResult The response from the ListHumanTaskUis
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListHumanTaskUisResult listHumanTaskUis(ListHumanTaskUisRequest listHumanTaskUisRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of <a>HyperParameterTuningJobSummary</a> objects that
     * describe the hyperparameter tuning jobs launched in your account.
     * </p>
     * 
     * @param listHyperParameterTuningJobsRequest
     * @return listHyperParameterTuningJobsResult The response from the
     *         ListHyperParameterTuningJobs service method, as returned by
     *         Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListHyperParameterTuningJobsResult listHyperParameterTuningJobs(
            ListHyperParameterTuningJobsRequest listHyperParameterTuningJobsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of labeling jobs.
     * </p>
     * 
     * @param listLabelingJobsRequest
     * @return listLabelingJobsResult The response from the ListLabelingJobs
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListLabelingJobsResult listLabelingJobs(ListLabelingJobsRequest listLabelingJobsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of labeling jobs assigned to a specified work team.
     * </p>
     * 
     * @param listLabelingJobsForWorkteamRequest
     * @return listLabelingJobsForWorkteamResult The response from the
     *         ListLabelingJobsForWorkteam service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListLabelingJobsForWorkteamResult listLabelingJobsForWorkteam(
            ListLabelingJobsForWorkteamRequest listLabelingJobsForWorkteamRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the model packages that have been created.
     * </p>
     * 
     * @param listModelPackagesRequest
     * @return listModelPackagesResult The response from the ListModelPackages
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListModelPackagesResult listModelPackages(ListModelPackagesRequest listModelPackagesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists models created with the <a>CreateModel</a> API.
     * </p>
     * 
     * @param listModelsRequest
     * @return listModelsResult The response from the ListModels service method,
     *         as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListModelsResult listModels(ListModelsRequest listModelsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns list of all monitoring job executions.
     * </p>
     * 
     * @param listMonitoringExecutionsRequest
     * @return listMonitoringExecutionsResult The response from the
     *         ListMonitoringExecutions service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListMonitoringExecutionsResult listMonitoringExecutions(
            ListMonitoringExecutionsRequest listMonitoringExecutionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns list of all monitoring schedules.
     * </p>
     * 
     * @param listMonitoringSchedulesRequest
     * @return listMonitoringSchedulesResult The response from the
     *         ListMonitoringSchedules service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListMonitoringSchedulesResult listMonitoringSchedules(
            ListMonitoringSchedulesRequest listMonitoringSchedulesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists notebook instance lifestyle configurations created with the
     * <a>CreateNotebookInstanceLifecycleConfig</a> API.
     * </p>
     * 
     * @param listNotebookInstanceLifecycleConfigsRequest
     * @return listNotebookInstanceLifecycleConfigsResult The response from the
     *         ListNotebookInstanceLifecycleConfigs service method, as returned
     *         by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListNotebookInstanceLifecycleConfigsResult listNotebookInstanceLifecycleConfigs(
            ListNotebookInstanceLifecycleConfigsRequest listNotebookInstanceLifecycleConfigsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of the Amazon SageMaker notebook instances in the
     * requester's account in an AWS Region.
     * </p>
     * 
     * @param listNotebookInstancesRequest
     * @return listNotebookInstancesResult The response from the
     *         ListNotebookInstances service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListNotebookInstancesResult listNotebookInstances(
            ListNotebookInstancesRequest listNotebookInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists processing jobs that satisfy various filters.
     * </p>
     * 
     * @param listProcessingJobsRequest
     * @return listProcessingJobsResult The response from the ListProcessingJobs
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListProcessingJobsResult listProcessingJobs(ListProcessingJobsRequest listProcessingJobsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of the work teams that you are subscribed to in the AWS
     * Marketplace. The list may be empty if no work team satisfies the filter
     * specified in the <code>NameContains</code> parameter.
     * </p>
     * 
     * @param listSubscribedWorkteamsRequest
     * @return listSubscribedWorkteamsResult The response from the
     *         ListSubscribedWorkteams service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListSubscribedWorkteamsResult listSubscribedWorkteams(
            ListSubscribedWorkteamsRequest listSubscribedWorkteamsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the tags for the specified Amazon SageMaker resource.
     * </p>
     * 
     * @param listTagsRequest
     * @return listTagsResult The response from the ListTags service method, as
     *         returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListTagsResult listTags(ListTagsRequest listTagsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists training jobs.
     * </p>
     * 
     * @param listTrainingJobsRequest
     * @return listTrainingJobsResult The response from the ListTrainingJobs
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListTrainingJobsResult listTrainingJobs(ListTrainingJobsRequest listTrainingJobsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of <a>TrainingJobSummary</a> objects that describe the
     * training jobs that a hyperparameter tuning job launched.
     * </p>
     * 
     * @param listTrainingJobsForHyperParameterTuningJobRequest
     * @return listTrainingJobsForHyperParameterTuningJobResult The response
     *         from the ListTrainingJobsForHyperParameterTuningJob service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListTrainingJobsForHyperParameterTuningJobResult listTrainingJobsForHyperParameterTuningJob(
            ListTrainingJobsForHyperParameterTuningJobRequest listTrainingJobsForHyperParameterTuningJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists transform jobs.
     * </p>
     * 
     * @param listTransformJobsRequest
     * @return listTransformJobsResult The response from the ListTransformJobs
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListTransformJobsResult listTransformJobs(ListTransformJobsRequest listTransformJobsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the trial components in your account. You can sort the list by
     * trial component name or creation time. You can filter the list to show
     * only components that were created in a specific time range. You can also
     * filter on one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ExperimentName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TrialName</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTrialComponentsRequest
     * @return listTrialComponentsResult The response from the
     *         ListTrialComponents service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListTrialComponentsResult listTrialComponents(
            ListTrialComponentsRequest listTrialComponentsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the trials in your account. Specify an experiment name to limit the
     * list to the trials that are part of that experiment. Specify a trial
     * component name to limit the list to the trials that associated with that
     * trial component. The list can be filtered to show only trials that were
     * created in a specific time range. The list can be sorted by trial name or
     * creation time.
     * </p>
     * 
     * @param listTrialsRequest
     * @return listTrialsResult The response from the ListTrials service method,
     *         as returned by Amazon SageMaker Service.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListTrialsResult listTrials(ListTrialsRequest listTrialsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists user profiles.
     * </p>
     * 
     * @param listUserProfilesRequest
     * @return listUserProfilesResult The response from the ListUserProfiles
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListUserProfilesResult listUserProfiles(ListUserProfilesRequest listUserProfilesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of work teams that you have defined in a region. The list may
     * be empty if no work team satisfies the filter specified in the
     * <code>NameContains</code> parameter.
     * </p>
     * 
     * @param listWorkteamsRequest
     * @return listWorkteamsResult The response from the ListWorkteams service
     *         method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListWorkteamsResult listWorkteams(ListWorkteamsRequest listWorkteamsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Renders the UI template so that you can preview the worker's experience.
     * </p>
     * 
     * @param renderUiTemplateRequest
     * @return renderUiTemplateResult The response from the RenderUiTemplate
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    RenderUiTemplateResult renderUiTemplate(RenderUiTemplateRequest renderUiTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Finds Amazon SageMaker resources that match a search query. Matching
     * resources are returned as a list of <code>SearchRecord</code> objects in
     * the response. You can sort the search results by any resource property in
     * a ascending or descending order.
     * </p>
     * <p>
     * You can query against the following value types: numeric, text, Boolean,
     * and timestamp.
     * </p>
     * 
     * @param searchRequest
     * @return searchResult The response from the Search service method, as
     *         returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    SearchResult search(SearchRequest searchRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Starts a previously stopped monitoring schedule.
     * </p>
     * <note>
     * <p>
     * New monitoring schedules are immediately started after creation.
     * </p>
     * </note>
     * 
     * @param startMonitoringScheduleRequest
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void startMonitoringSchedule(StartMonitoringScheduleRequest startMonitoringScheduleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Launches an ML compute instance with the latest version of the libraries
     * and attaches your ML storage volume. After configuring the notebook
     * instance, Amazon SageMaker sets the notebook instance status to
     * <code>InService</code>. A notebook instance's status must be
     * <code>InService</code> before you can connect to your Jupyter notebook.
     * </p>
     * 
     * @param startNotebookInstanceRequest
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void startNotebookInstance(StartNotebookInstanceRequest startNotebookInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * A method for forcing the termination of a running job.
     * </p>
     * 
     * @param stopAutoMLJobRequest
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void stopAutoMLJob(StopAutoMLJobRequest stopAutoMLJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Stops a model compilation job.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal.
     * This gracefully shuts the job down. If the job hasn't stopped, it sends
     * the SIGKILL signal.
     * </p>
     * <p>
     * When it receives a <code>StopCompilationJob</code> request, Amazon
     * SageMaker changes the <a>CompilationJobSummary$CompilationJobStatus</a>
     * of the job to <code>Stopping</code>. After Amazon SageMaker stops the
     * job, it sets the <a>CompilationJobSummary$CompilationJobStatus</a> to
     * <code>Stopped</code>.
     * </p>
     * 
     * @param stopCompilationJobRequest
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void stopCompilationJob(StopCompilationJobRequest stopCompilationJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops a running hyperparameter tuning job and all running training jobs
     * that the tuning job launched.
     * </p>
     * <p>
     * All model artifacts output from the training jobs are stored in Amazon
     * Simple Storage Service (Amazon S3). All data that the training jobs write
     * to Amazon CloudWatch Logs are still available in CloudWatch. After the
     * tuning job moves to the <code>Stopped</code> state, it releases all
     * reserved resources for the tuning job.
     * </p>
     * 
     * @param stopHyperParameterTuningJobRequest
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void stopHyperParameterTuningJob(
            StopHyperParameterTuningJobRequest stopHyperParameterTuningJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops a running labeling job. A job that is stopped cannot be restarted.
     * Any results obtained before the job is stopped are placed in the Amazon
     * S3 output bucket.
     * </p>
     * 
     * @param stopLabelingJobRequest
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void stopLabelingJob(StopLabelingJobRequest stopLabelingJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops a previously started monitoring schedule.
     * </p>
     * 
     * @param stopMonitoringScheduleRequest
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void stopMonitoringSchedule(StopMonitoringScheduleRequest stopMonitoringScheduleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Terminates the ML compute instance. Before terminating the instance,
     * Amazon SageMaker disconnects the ML storage volume from it. Amazon
     * SageMaker preserves the ML storage volume. Amazon SageMaker stops
     * charging you for the ML compute instance when you call
     * <code>StopNotebookInstance</code>.
     * </p>
     * <p>
     * To access data on the ML storage volume for a notebook instance that has
     * been terminated, call the <code>StartNotebookInstance</code> API.
     * <code>StartNotebookInstance</code> launches another ML compute instance,
     * configures it, and attaches the preserved ML storage volume so you can
     * continue your work.
     * </p>
     * 
     * @param stopNotebookInstanceRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void stopNotebookInstance(StopNotebookInstanceRequest stopNotebookInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops a processing job.
     * </p>
     * 
     * @param stopProcessingJobRequest
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void stopProcessingJob(StopProcessingJobRequest stopProcessingJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops a training job. To stop a job, Amazon SageMaker sends the algorithm
     * the <code>SIGTERM</code> signal, which delays job termination for 120
     * seconds. Algorithms might use this 120-second window to save the model
     * artifacts, so the results of the training is not lost.
     * </p>
     * <p>
     * When it receives a <code>StopTrainingJob</code> request, Amazon SageMaker
     * changes the status of the job to <code>Stopping</code>. After Amazon
     * SageMaker stops the job, it sets the status to <code>Stopped</code>.
     * </p>
     * 
     * @param stopTrainingJobRequest
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void stopTrainingJob(StopTrainingJobRequest stopTrainingJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops a transform job.
     * </p>
     * <p>
     * When Amazon SageMaker receives a <code>StopTransformJob</code> request,
     * the status of the job changes to <code>Stopping</code>. After Amazon
     * SageMaker stops the job, the status is set to <code>Stopped</code>. When
     * you stop a transform job before it is completed, Amazon SageMaker doesn't
     * store the job's output in Amazon S3.
     * </p>
     * 
     * @param stopTransformJobRequest
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void stopTransformJob(StopTransformJobRequest stopTransformJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the specified Git repository with the specified values.
     * </p>
     * 
     * @param updateCodeRepositoryRequest
     * @return updateCodeRepositoryResult The response from the
     *         UpdateCodeRepository service method, as returned by Amazon
     *         SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateCodeRepositoryResult updateCodeRepository(
            UpdateCodeRepositoryRequest updateCodeRepositoryRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates a domain. Changes will impact all of the people in the domain.
     * </p>
     * 
     * @param updateDomainRequest
     * @return updateDomainResult The response from the UpdateDomain service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateDomainResult updateDomain(UpdateDomainRequest updateDomainRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deploys the new <code>EndpointConfig</code> specified in the request,
     * switches to using newly created endpoint, and then deletes resources
     * provisioned for the endpoint using the previous
     * <code>EndpointConfig</code> (there is no availability loss).
     * </p>
     * <p>
     * When Amazon SageMaker receives the request, it sets the endpoint status
     * to <code>Updating</code>. After updating the endpoint, it sets the status
     * to <code>InService</code>. To check the status of an endpoint, use the
     * <a>DescribeEndpoint</a> API.
     * </p>
     * <note>
     * <p>
     * You must not delete an <code>EndpointConfig</code> in use by an endpoint
     * that is live or while the <code>UpdateEndpoint</code> or
     * <code>CreateEndpoint</code> operations are being performed on the
     * endpoint. To update an endpoint, you must create a new
     * <code>EndpointConfig</code>.
     * </p>
     * </note>
     * 
     * @param updateEndpointRequest
     * @return updateEndpointResult The response from the UpdateEndpoint service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateEndpointResult updateEndpoint(UpdateEndpointRequest updateEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates variant weight of one or more variants associated with an
     * existing endpoint, or capacity of one variant associated with an existing
     * endpoint. When it receives the request, Amazon SageMaker sets the
     * endpoint status to <code>Updating</code>. After updating the endpoint, it
     * sets the status to <code>InService</code>. To check the status of an
     * endpoint, use the <a>DescribeEndpoint</a> API.
     * </p>
     * 
     * @param updateEndpointWeightsAndCapacitiesRequest
     * @return updateEndpointWeightsAndCapacitiesResult The response from the
     *         UpdateEndpointWeightsAndCapacities service method, as returned by
     *         Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateEndpointWeightsAndCapacitiesResult updateEndpointWeightsAndCapacities(
            UpdateEndpointWeightsAndCapacitiesRequest updateEndpointWeightsAndCapacitiesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds, updates, or removes the description of an experiment. Updates the
     * display name of an experiment.
     * </p>
     * 
     * @param updateExperimentRequest
     * @return updateExperimentResult The response from the UpdateExperiment
     *         service method, as returned by Amazon SageMaker Service.
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateExperimentResult updateExperiment(UpdateExperimentRequest updateExperimentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a previously created schedule.
     * </p>
     * 
     * @param updateMonitoringScheduleRequest
     * @return updateMonitoringScheduleResult The response from the
     *         UpdateMonitoringSchedule service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateMonitoringScheduleResult updateMonitoringSchedule(
            UpdateMonitoringScheduleRequest updateMonitoringScheduleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a notebook instance. NotebookInstance updates include upgrading
     * or downgrading the ML compute instance used for your notebook instance to
     * accommodate changes in your workload requirements.
     * </p>
     * 
     * @param updateNotebookInstanceRequest
     * @return updateNotebookInstanceResult The response from the
     *         UpdateNotebookInstance service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateNotebookInstanceResult updateNotebookInstance(
            UpdateNotebookInstanceRequest updateNotebookInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a notebook instance lifecycle configuration created with the
     * <a>CreateNotebookInstanceLifecycleConfig</a> API.
     * </p>
     * 
     * @param updateNotebookInstanceLifecycleConfigRequest
     * @return updateNotebookInstanceLifecycleConfigResult The response from the
     *         UpdateNotebookInstanceLifecycleConfig service method, as returned
     *         by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateNotebookInstanceLifecycleConfigResult updateNotebookInstanceLifecycleConfig(
            UpdateNotebookInstanceLifecycleConfigRequest updateNotebookInstanceLifecycleConfigRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the display name of a trial.
     * </p>
     * 
     * @param updateTrialRequest
     * @return updateTrialResult The response from the UpdateTrial service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateTrialResult updateTrial(UpdateTrialRequest updateTrialRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates one or more properties of a trial component.
     * </p>
     * 
     * @param updateTrialComponentRequest
     * @return updateTrialComponentResult The response from the
     *         UpdateTrialComponent service method, as returned by Amazon
     *         SageMaker Service.
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateTrialComponentResult updateTrialComponent(
            UpdateTrialComponentRequest updateTrialComponentRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates a user profile.
     * </p>
     * 
     * @param updateUserProfileRequest
     * @return updateUserProfileResult The response from the UpdateUserProfile
     *         service method, as returned by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateUserProfileResult updateUserProfile(UpdateUserProfileRequest updateUserProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Restricts access to tasks assigned to workers in the specified workforce
     * to those within specific ranges of IP addresses. You specify allowed IP
     * addresses by creating a list of up to four <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html"
     * >CIDRs</a>.
     * </p>
     * <p>
     * By default, a workforce isn't restricted to specific IP addresses. If you
     * specify a range of IP addresses, workers who attempt to access tasks
     * using any IP address outside the specified range are denied access and
     * get a <code>Not Found</code> error message on the worker portal. After
     * restricting access with this operation, you can see the allowed IP values
     * for a private workforce with the operation.
     * </p>
     * <important>
     * <p>
     * This operation applies only to private workforces.
     * </p>
     * </important>
     * 
     * @param updateWorkforceRequest
     * @return updateWorkforceResult The response from the UpdateWorkforce
     *         service method, as returned by Amazon SageMaker Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateWorkforceResult updateWorkforce(UpdateWorkforceRequest updateWorkforceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an existing work team with new member definitions or description.
     * </p>
     * 
     * @param updateWorkteamRequest
     * @return updateWorkteamResult The response from the UpdateWorkteam service
     *         method, as returned by Amazon SageMaker Service.
     * @throws ResourceLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Service indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    UpdateWorkteamResult updateWorkteam(UpdateWorkteamRequest updateWorkteamRequest)
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
