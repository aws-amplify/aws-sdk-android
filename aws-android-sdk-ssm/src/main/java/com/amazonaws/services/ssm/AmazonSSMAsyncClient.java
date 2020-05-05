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

package com.amazonaws.services.ssm;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

import com.amazonaws.services.ssm.model.*;

/**
 * Interface for accessing Amazon Simple Systems Manager (SSM) asynchronously.
 * <fullname>AWS Systems Manager</fullname>
 * <p>
 * AWS Systems Manager is a collection of capabilities that helps you automate
 * management tasks such as collecting system inventory, applying operating
 * system (OS) patches, automating the creation of Amazon Machine Images (AMIs),
 * and configuring operating systems (OSs) and applications at scale. Systems
 * Manager lets you remotely and securely manage the configuration of your
 * managed instances. A <i>managed instance</i> is any Amazon Elastic Compute
 * Cloud instance (EC2 instance), or any on-premises server or virtual machine
 * (VM) in your hybrid environment that has been configured for Systems Manager.
 * </p>
 * <p>
 * This reference is intended to be used with the <a
 * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/">AWS
 * Systems Manager User Guide</a>.
 * </p>
 * <p>
 * To get started, verify prerequisites and configure managed instances. For
 * more information, see <a href=
 * "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-setting-up.html"
 * >Setting up AWS Systems Manager</a> in the <i>AWS Systems Manager User
 * Guide</i>.
 * </p>
 * <p>
 * For information about other API actions you can perform on EC2 instances, see
 * the <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/">Amazon
 * EC2 API Reference</a>. For information about how to use a Query API, see <a
 * href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/making-api-requests.html"
 * >Making API requests</a>.
 * </p>
 **/
public class AmazonSSMAsyncClient extends AmazonSSMClient implements AmazonSSMAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 10;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Systems Manager (SSM). A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonSSMAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Systems Manager (SSM). A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to Amazon Simple Systems Manager
     *            (SSM) (ex: proxy settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonSSMAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Systems Manager (SSM) using the specified AWS account credentials.
     * Default client settings will be used, and a fixed size thread pool will
     * be created for executing the asynchronous tasks.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     */
    public AmazonSSMAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Systems Manager (SSM) using the specified AWS account credentials
     * and executor service. Default client settings will be used.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public AmazonSSMAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Systems Manager (SSM) using the specified AWS account credentials,
     * executor service, and client configuration options.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param clientConfiguration Client configuration options (ex: max retry
     *            limit, proxy settings, etc).
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public AmazonSSMAsyncClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Systems Manager (SSM) using the specified AWS account credentials
     * provider. Default client settings will be used, and a fixed size thread
     * pool will be created for executing the asynchronous tasks.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     */
    public AmazonSSMAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Systems Manager (SSM) using the specified AWS account credentials
     * provider and executor service. Default client settings will be used.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public AmazonSSMAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Systems Manager (SSM) using the specified AWS account credentials
     * provider and client configuration options.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration Client configuration options (ex: max retry
     *            limit, proxy settings, etc).
     */
    public AmazonSSMAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Systems Manager (SSM) using the specified AWS account credentials
     * provider, executor service, and client configuration options.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration Client configuration options (ex: max retry
     *            limit, proxy settings, etc).
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public AmazonSSMAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Returns the executor service used by this async client to execute
     * requests.
     *
     * @return The executor service used by this async client to execute
     *         requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call getExecutorService().shutdown() followed by
     * getExecutorService().awaitTermination() prior to calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified resource. Tags are
     * metadata that you can assign to your documents, managed instances,
     * maintenance windows, Parameter Store parameters, and patch baselines.
     * Tags enable you to categorize your resources in different ways, for
     * example, by purpose, owner, or environment. Each tag consists of a key
     * and an optional value, both of which you define. For example, you could
     * define a set of tags for your account's managed instances that helps you
     * track each instance's owner and stack level. For example: Key=Owner and
     * Value=DbAdmin, SysAdmin, or Dev. Or Key=Stack and Value=Production,
     * Pre-Production, or Test.
     * </p>
     * <p>
     * Each resource can have a maximum of 50 tags.
     * </p>
     * <p>
     * We recommend that you devise a set of tag keys that meets your needs for
     * each resource type. Using a consistent set of tag keys makes it easier
     * for you to manage your resources. You can search and filter the resources
     * based on the tags you add. Tags don't have any semantic meaning to and
     * are interpreted strictly as a string of characters.
     * </p>
     * <p>
     * For more information about using tags with EC2 instances, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"
     * >Tagging your Amazon EC2 resources</a> in the <i>Amazon EC2 User
     * Guide</i>.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @return A Java Future object containing the response from the
     *         AddTagsToResource service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidResourceTypeException
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws TooManyTagsErrorException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<AddTagsToResourceResult> addTagsToResourceAsync(
            final AddTagsToResourceRequest addTagsToResourceRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<AddTagsToResourceResult>() {
            public AddTagsToResourceResult call() throws Exception {
                return addTagsToResource(addTagsToResourceRequest);
            }
        });
    }

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified resource. Tags are
     * metadata that you can assign to your documents, managed instances,
     * maintenance windows, Parameter Store parameters, and patch baselines.
     * Tags enable you to categorize your resources in different ways, for
     * example, by purpose, owner, or environment. Each tag consists of a key
     * and an optional value, both of which you define. For example, you could
     * define a set of tags for your account's managed instances that helps you
     * track each instance's owner and stack level. For example: Key=Owner and
     * Value=DbAdmin, SysAdmin, or Dev. Or Key=Stack and Value=Production,
     * Pre-Production, or Test.
     * </p>
     * <p>
     * Each resource can have a maximum of 50 tags.
     * </p>
     * <p>
     * We recommend that you devise a set of tag keys that meets your needs for
     * each resource type. Using a consistent set of tag keys makes it easier
     * for you to manage your resources. You can search and filter the resources
     * based on the tags you add. Tags don't have any semantic meaning to and
     * are interpreted strictly as a string of characters.
     * </p>
     * <p>
     * For more information about using tags with EC2 instances, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"
     * >Tagging your Amazon EC2 resources</a> in the <i>Amazon EC2 User
     * Guide</i>.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @return A Java Future object containing the response from the
     *         AddTagsToResource service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidResourceTypeException
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws TooManyTagsErrorException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<AddTagsToResourceResult> addTagsToResourceAsync(
            final AddTagsToResourceRequest addTagsToResourceRequest,
            final AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AddTagsToResourceResult>() {
            public AddTagsToResourceResult call() throws Exception {
                AddTagsToResourceResult result = null;
                try {
                    result = addTagsToResource(addTagsToResourceRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(addTagsToResourceRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Attempts to cancel the command specified by the Command ID. There is no
     * guarantee that the command will be terminated and the underlying process
     * stopped.
     * </p>
     * 
     * @param cancelCommandRequest <p/>
     * @return A Java Future object containing the response from the
     *         CancelCommand service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     * @throws DuplicateInstanceIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CancelCommandResult> cancelCommandAsync(
            final CancelCommandRequest cancelCommandRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<CancelCommandResult>() {
            public CancelCommandResult call() throws Exception {
                return cancelCommand(cancelCommandRequest);
            }
        });
    }

    /**
     * <p>
     * Attempts to cancel the command specified by the Command ID. There is no
     * guarantee that the command will be terminated and the underlying process
     * stopped.
     * </p>
     * 
     * @param cancelCommandRequest <p/>
     * @return A Java Future object containing the response from the
     *         CancelCommand service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     * @throws DuplicateInstanceIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CancelCommandResult> cancelCommandAsync(
            final CancelCommandRequest cancelCommandRequest,
            final AsyncHandler<CancelCommandRequest, CancelCommandResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CancelCommandResult>() {
            public CancelCommandResult call() throws Exception {
                CancelCommandResult result = null;
                try {
                    result = cancelCommand(cancelCommandRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(cancelCommandRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Stops a maintenance window execution that is already in progress and
     * cancels any tasks in the window that have not already starting running.
     * (Tasks already in progress will continue to completion.)
     * </p>
     * 
     * @param cancelMaintenanceWindowExecutionRequest
     * @return A Java Future object containing the response from the
     *         CancelMaintenanceWindowExecution service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws DoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CancelMaintenanceWindowExecutionResult> cancelMaintenanceWindowExecutionAsync(
            final CancelMaintenanceWindowExecutionRequest cancelMaintenanceWindowExecutionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CancelMaintenanceWindowExecutionResult>() {
            public CancelMaintenanceWindowExecutionResult call() throws Exception {
                return cancelMaintenanceWindowExecution(cancelMaintenanceWindowExecutionRequest);
            }
        });
    }

    /**
     * <p>
     * Stops a maintenance window execution that is already in progress and
     * cancels any tasks in the window that have not already starting running.
     * (Tasks already in progress will continue to completion.)
     * </p>
     * 
     * @param cancelMaintenanceWindowExecutionRequest
     * @return A Java Future object containing the response from the
     *         CancelMaintenanceWindowExecution service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws DoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CancelMaintenanceWindowExecutionResult> cancelMaintenanceWindowExecutionAsync(
            final CancelMaintenanceWindowExecutionRequest cancelMaintenanceWindowExecutionRequest,
            final AsyncHandler<CancelMaintenanceWindowExecutionRequest, CancelMaintenanceWindowExecutionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CancelMaintenanceWindowExecutionResult>() {
            public CancelMaintenanceWindowExecutionResult call() throws Exception {
                CancelMaintenanceWindowExecutionResult result = null;
                try {
                    result = cancelMaintenanceWindowExecution(cancelMaintenanceWindowExecutionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(cancelMaintenanceWindowExecutionRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Generates an activation code and activation ID you can use to register
     * your on-premises server or virtual machine (VM) with Systems Manager.
     * Registering these machines with Systems Manager makes it possible to
     * manage them using Systems Manager capabilities. You use the activation
     * code and ID when installing SSM Agent on machines in your hybrid
     * environment. For more information about requirements for managing
     * on-premises instances and VMs using Systems Manager, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-managedinstances.html"
     * >Setting up AWS Systems Manager for hybrid environments</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <note>
     * <p>
     * On-premises servers or VMs that are registered with Systems Manager and
     * EC2 instances that you manage with Systems Manager are all called
     * <i>managed instances</i>.
     * </p>
     * </note>
     * 
     * @param createActivationRequest
     * @return A Java Future object containing the response from the
     *         CreateActivation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CreateActivationResult> createActivationAsync(
            final CreateActivationRequest createActivationRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<CreateActivationResult>() {
            public CreateActivationResult call() throws Exception {
                return createActivation(createActivationRequest);
            }
        });
    }

    /**
     * <p>
     * Generates an activation code and activation ID you can use to register
     * your on-premises server or virtual machine (VM) with Systems Manager.
     * Registering these machines with Systems Manager makes it possible to
     * manage them using Systems Manager capabilities. You use the activation
     * code and ID when installing SSM Agent on machines in your hybrid
     * environment. For more information about requirements for managing
     * on-premises instances and VMs using Systems Manager, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-managedinstances.html"
     * >Setting up AWS Systems Manager for hybrid environments</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <note>
     * <p>
     * On-premises servers or VMs that are registered with Systems Manager and
     * EC2 instances that you manage with Systems Manager are all called
     * <i>managed instances</i>.
     * </p>
     * </note>
     * 
     * @param createActivationRequest
     * @return A Java Future object containing the response from the
     *         CreateActivation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CreateActivationResult> createActivationAsync(
            final CreateActivationRequest createActivationRequest,
            final AsyncHandler<CreateActivationRequest, CreateActivationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateActivationResult>() {
            public CreateActivationResult call() throws Exception {
                CreateActivationResult result = null;
                try {
                    result = createActivation(createActivationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createActivationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Associates the specified Systems Manager document with the specified
     * instances or targets.
     * </p>
     * <p>
     * When you associate a document with one or more instances using instance
     * IDs or tags, SSM Agent running on the instance processes the document and
     * configures the instance as specified.
     * </p>
     * <p>
     * If you associate a document with an instance that already has an
     * associated document, the system returns the AssociationAlreadyExists
     * exception.
     * </p>
     * 
     * @param createAssociationRequest
     * @return A Java Future object containing the response from the
     *         CreateAssociation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws AssociationAlreadyExistsException
     * @throws AssociationLimitExceededException
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws InvalidInstanceIdException
     * @throws UnsupportedPlatformTypeException
     * @throws InvalidOutputLocationException
     * @throws InvalidParametersException
     * @throws InvalidTargetException
     * @throws InvalidScheduleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CreateAssociationResult> createAssociationAsync(
            final CreateAssociationRequest createAssociationRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<CreateAssociationResult>() {
            public CreateAssociationResult call() throws Exception {
                return createAssociation(createAssociationRequest);
            }
        });
    }

    /**
     * <p>
     * Associates the specified Systems Manager document with the specified
     * instances or targets.
     * </p>
     * <p>
     * When you associate a document with one or more instances using instance
     * IDs or tags, SSM Agent running on the instance processes the document and
     * configures the instance as specified.
     * </p>
     * <p>
     * If you associate a document with an instance that already has an
     * associated document, the system returns the AssociationAlreadyExists
     * exception.
     * </p>
     * 
     * @param createAssociationRequest
     * @return A Java Future object containing the response from the
     *         CreateAssociation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws AssociationAlreadyExistsException
     * @throws AssociationLimitExceededException
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws InvalidInstanceIdException
     * @throws UnsupportedPlatformTypeException
     * @throws InvalidOutputLocationException
     * @throws InvalidParametersException
     * @throws InvalidTargetException
     * @throws InvalidScheduleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CreateAssociationResult> createAssociationAsync(
            final CreateAssociationRequest createAssociationRequest,
            final AsyncHandler<CreateAssociationRequest, CreateAssociationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateAssociationResult>() {
            public CreateAssociationResult call() throws Exception {
                CreateAssociationResult result = null;
                try {
                    result = createAssociation(createAssociationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createAssociationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Associates the specified Systems Manager document with the specified
     * instances or targets.
     * </p>
     * <p>
     * When you associate a document with one or more instances using instance
     * IDs or tags, SSM Agent running on the instance processes the document and
     * configures the instance as specified.
     * </p>
     * <p>
     * If you associate a document with an instance that already has an
     * associated document, the system returns the AssociationAlreadyExists
     * exception.
     * </p>
     * 
     * @param createAssociationBatchRequest
     * @return A Java Future object containing the response from the
     *         CreateAssociationBatch service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws InvalidInstanceIdException
     * @throws InvalidParametersException
     * @throws DuplicateInstanceIdException
     * @throws AssociationLimitExceededException
     * @throws UnsupportedPlatformTypeException
     * @throws InvalidOutputLocationException
     * @throws InvalidTargetException
     * @throws InvalidScheduleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CreateAssociationBatchResult> createAssociationBatchAsync(
            final CreateAssociationBatchRequest createAssociationBatchRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateAssociationBatchResult>() {
            public CreateAssociationBatchResult call() throws Exception {
                return createAssociationBatch(createAssociationBatchRequest);
            }
        });
    }

    /**
     * <p>
     * Associates the specified Systems Manager document with the specified
     * instances or targets.
     * </p>
     * <p>
     * When you associate a document with one or more instances using instance
     * IDs or tags, SSM Agent running on the instance processes the document and
     * configures the instance as specified.
     * </p>
     * <p>
     * If you associate a document with an instance that already has an
     * associated document, the system returns the AssociationAlreadyExists
     * exception.
     * </p>
     * 
     * @param createAssociationBatchRequest
     * @return A Java Future object containing the response from the
     *         CreateAssociationBatch service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws InvalidInstanceIdException
     * @throws InvalidParametersException
     * @throws DuplicateInstanceIdException
     * @throws AssociationLimitExceededException
     * @throws UnsupportedPlatformTypeException
     * @throws InvalidOutputLocationException
     * @throws InvalidTargetException
     * @throws InvalidScheduleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CreateAssociationBatchResult> createAssociationBatchAsync(
            final CreateAssociationBatchRequest createAssociationBatchRequest,
            final AsyncHandler<CreateAssociationBatchRequest, CreateAssociationBatchResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateAssociationBatchResult>() {
            public CreateAssociationBatchResult call() throws Exception {
                CreateAssociationBatchResult result = null;
                try {
                    result = createAssociationBatch(createAssociationBatchRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createAssociationBatchRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a Systems Manager (SSM) document. An SSM document defines the
     * actions that Systems Manager performs on your managed instances. For more
     * information about SSM documents, including information about supported
     * schemas, features, and syntax, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-ssm-docs.html"
     * >AWS Systems Manager Documents</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param createDocumentRequest
     * @return A Java Future object containing the response from the
     *         CreateDocument service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DocumentAlreadyExistsException
     * @throws MaxDocumentSizeExceededException
     * @throws InternalServerErrorException
     * @throws InvalidDocumentContentException
     * @throws DocumentLimitExceededException
     * @throws InvalidDocumentSchemaVersionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CreateDocumentResult> createDocumentAsync(
            final CreateDocumentRequest createDocumentRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<CreateDocumentResult>() {
            public CreateDocumentResult call() throws Exception {
                return createDocument(createDocumentRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a Systems Manager (SSM) document. An SSM document defines the
     * actions that Systems Manager performs on your managed instances. For more
     * information about SSM documents, including information about supported
     * schemas, features, and syntax, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-ssm-docs.html"
     * >AWS Systems Manager Documents</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param createDocumentRequest
     * @return A Java Future object containing the response from the
     *         CreateDocument service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DocumentAlreadyExistsException
     * @throws MaxDocumentSizeExceededException
     * @throws InternalServerErrorException
     * @throws InvalidDocumentContentException
     * @throws DocumentLimitExceededException
     * @throws InvalidDocumentSchemaVersionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CreateDocumentResult> createDocumentAsync(
            final CreateDocumentRequest createDocumentRequest,
            final AsyncHandler<CreateDocumentRequest, CreateDocumentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDocumentResult>() {
            public CreateDocumentResult call() throws Exception {
                CreateDocumentResult result = null;
                try {
                    result = createDocument(createDocumentRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createDocumentRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a new maintenance window.
     * </p>
     * <note>
     * <p>
     * The value you specify for <code>Duration</code> determines the specific
     * end time for the maintenance window based on the time it begins. No
     * maintenance window tasks are permitted to start after the resulting
     * endtime minus the number of hours you specify for <code>Cutoff</code>.
     * For example, if the maintenance window starts at 3 PM, the duration is
     * three hours, and the value you specify for <code>Cutoff</code> is one
     * hour, no maintenance window tasks can start after 5 PM.
     * </p>
     * </note>
     * 
     * @param createMaintenanceWindowRequest
     * @return A Java Future object containing the response from the
     *         CreateMaintenanceWindow service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws IdempotentParameterMismatchException
     * @throws ResourceLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CreateMaintenanceWindowResult> createMaintenanceWindowAsync(
            final CreateMaintenanceWindowRequest createMaintenanceWindowRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateMaintenanceWindowResult>() {
            public CreateMaintenanceWindowResult call() throws Exception {
                return createMaintenanceWindow(createMaintenanceWindowRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a new maintenance window.
     * </p>
     * <note>
     * <p>
     * The value you specify for <code>Duration</code> determines the specific
     * end time for the maintenance window based on the time it begins. No
     * maintenance window tasks are permitted to start after the resulting
     * endtime minus the number of hours you specify for <code>Cutoff</code>.
     * For example, if the maintenance window starts at 3 PM, the duration is
     * three hours, and the value you specify for <code>Cutoff</code> is one
     * hour, no maintenance window tasks can start after 5 PM.
     * </p>
     * </note>
     * 
     * @param createMaintenanceWindowRequest
     * @return A Java Future object containing the response from the
     *         CreateMaintenanceWindow service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws IdempotentParameterMismatchException
     * @throws ResourceLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CreateMaintenanceWindowResult> createMaintenanceWindowAsync(
            final CreateMaintenanceWindowRequest createMaintenanceWindowRequest,
            final AsyncHandler<CreateMaintenanceWindowRequest, CreateMaintenanceWindowResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateMaintenanceWindowResult>() {
            public CreateMaintenanceWindowResult call() throws Exception {
                CreateMaintenanceWindowResult result = null;
                try {
                    result = createMaintenanceWindow(createMaintenanceWindowRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createMaintenanceWindowRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a new OpsItem. You must have permission in AWS Identity and
     * Access Management (IAM) to create a new OpsItem. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
     * >Getting started with OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view,
     * investigate, and remediate operational issues impacting the performance
     * and health of their AWS resources. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
     * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param createOpsItemRequest
     * @return A Java Future object containing the response from the
     *         CreateOpsItem service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws OpsItemAlreadyExistsException
     * @throws OpsItemLimitExceededException
     * @throws OpsItemInvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CreateOpsItemResult> createOpsItemAsync(
            final CreateOpsItemRequest createOpsItemRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<CreateOpsItemResult>() {
            public CreateOpsItemResult call() throws Exception {
                return createOpsItem(createOpsItemRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a new OpsItem. You must have permission in AWS Identity and
     * Access Management (IAM) to create a new OpsItem. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
     * >Getting started with OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view,
     * investigate, and remediate operational issues impacting the performance
     * and health of their AWS resources. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
     * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param createOpsItemRequest
     * @return A Java Future object containing the response from the
     *         CreateOpsItem service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws OpsItemAlreadyExistsException
     * @throws OpsItemLimitExceededException
     * @throws OpsItemInvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CreateOpsItemResult> createOpsItemAsync(
            final CreateOpsItemRequest createOpsItemRequest,
            final AsyncHandler<CreateOpsItemRequest, CreateOpsItemResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateOpsItemResult>() {
            public CreateOpsItemResult call() throws Exception {
                CreateOpsItemResult result = null;
                try {
                    result = createOpsItem(createOpsItemRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createOpsItemRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a patch baseline.
     * </p>
     * <note>
     * <p>
     * For information about valid key and value pairs in
     * <code>PatchFilters</code> for each supported operating system type, see
     * <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html"
     * >PatchFilter</a>.
     * </p>
     * </note>
     * 
     * @param createPatchBaselineRequest
     * @return A Java Future object containing the response from the
     *         CreatePatchBaseline service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws IdempotentParameterMismatchException
     * @throws ResourceLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CreatePatchBaselineResult> createPatchBaselineAsync(
            final CreatePatchBaselineRequest createPatchBaselineRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreatePatchBaselineResult>() {
            public CreatePatchBaselineResult call() throws Exception {
                return createPatchBaseline(createPatchBaselineRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a patch baseline.
     * </p>
     * <note>
     * <p>
     * For information about valid key and value pairs in
     * <code>PatchFilters</code> for each supported operating system type, see
     * <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html"
     * >PatchFilter</a>.
     * </p>
     * </note>
     * 
     * @param createPatchBaselineRequest
     * @return A Java Future object containing the response from the
     *         CreatePatchBaseline service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws IdempotentParameterMismatchException
     * @throws ResourceLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CreatePatchBaselineResult> createPatchBaselineAsync(
            final CreatePatchBaselineRequest createPatchBaselineRequest,
            final AsyncHandler<CreatePatchBaselineRequest, CreatePatchBaselineResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreatePatchBaselineResult>() {
            public CreatePatchBaselineResult call() throws Exception {
                CreatePatchBaselineResult result = null;
                try {
                    result = createPatchBaseline(createPatchBaselineRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createPatchBaselineRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * A resource data sync helps you view data from multiple sources in a
     * single location. Systems Manager offers two types of resource data sync:
     * <code>SyncToDestination</code> and <code>SyncFromSource</code>.
     * </p>
     * <p>
     * You can configure Systems Manager Inventory to use the
     * <code>SyncToDestination</code> type to synchronize Inventory data from
     * multiple AWS Regions to a single S3 bucket. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-datasync.html"
     * >Configuring Resource Data Sync for Inventory</a> in the <i>AWS Systems
     * Manager User Guide</i>.
     * </p>
     * <p>
     * You can configure Systems Manager Explorer to use the
     * <code>SyncFromSource</code> type to synchronize operational work items
     * (OpsItems) and operational data (OpsData) from multiple AWS Regions to a
     * single S3 bucket. This type can synchronize OpsItems and OpsData from
     * multiple AWS accounts and Regions or <code>EntireOrganization</code> by
     * using AWS Organizations. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/Explorer-resource-data-sync.html"
     * >Setting up Systems Manager Explorer to display data from multiple
     * accounts and Regions</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * A resource data sync is an asynchronous operation that returns
     * immediately. After a successful initial sync is completed, the system
     * continuously syncs data. To check the status of a sync, use the
     * <a>ListResourceDataSync</a>.
     * </p>
     * <note>
     * <p>
     * By default, data is not encrypted in Amazon S3. We strongly recommend
     * that you enable encryption in Amazon S3 to ensure secure data storage. We
     * also recommend that you secure access to the Amazon S3 bucket by creating
     * a restrictive bucket policy.
     * </p>
     * </note>
     * 
     * @param createResourceDataSyncRequest
     * @return A Java Future object containing the response from the
     *         CreateResourceDataSync service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ResourceDataSyncCountExceededException
     * @throws ResourceDataSyncAlreadyExistsException
     * @throws ResourceDataSyncInvalidConfigurationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CreateResourceDataSyncResult> createResourceDataSyncAsync(
            final CreateResourceDataSyncRequest createResourceDataSyncRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateResourceDataSyncResult>() {
            public CreateResourceDataSyncResult call() throws Exception {
                return createResourceDataSync(createResourceDataSyncRequest);
            }
        });
    }

    /**
     * <p>
     * A resource data sync helps you view data from multiple sources in a
     * single location. Systems Manager offers two types of resource data sync:
     * <code>SyncToDestination</code> and <code>SyncFromSource</code>.
     * </p>
     * <p>
     * You can configure Systems Manager Inventory to use the
     * <code>SyncToDestination</code> type to synchronize Inventory data from
     * multiple AWS Regions to a single S3 bucket. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-datasync.html"
     * >Configuring Resource Data Sync for Inventory</a> in the <i>AWS Systems
     * Manager User Guide</i>.
     * </p>
     * <p>
     * You can configure Systems Manager Explorer to use the
     * <code>SyncFromSource</code> type to synchronize operational work items
     * (OpsItems) and operational data (OpsData) from multiple AWS Regions to a
     * single S3 bucket. This type can synchronize OpsItems and OpsData from
     * multiple AWS accounts and Regions or <code>EntireOrganization</code> by
     * using AWS Organizations. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/Explorer-resource-data-sync.html"
     * >Setting up Systems Manager Explorer to display data from multiple
     * accounts and Regions</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * A resource data sync is an asynchronous operation that returns
     * immediately. After a successful initial sync is completed, the system
     * continuously syncs data. To check the status of a sync, use the
     * <a>ListResourceDataSync</a>.
     * </p>
     * <note>
     * <p>
     * By default, data is not encrypted in Amazon S3. We strongly recommend
     * that you enable encryption in Amazon S3 to ensure secure data storage. We
     * also recommend that you secure access to the Amazon S3 bucket by creating
     * a restrictive bucket policy.
     * </p>
     * </note>
     * 
     * @param createResourceDataSyncRequest
     * @return A Java Future object containing the response from the
     *         CreateResourceDataSync service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ResourceDataSyncCountExceededException
     * @throws ResourceDataSyncAlreadyExistsException
     * @throws ResourceDataSyncInvalidConfigurationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<CreateResourceDataSyncResult> createResourceDataSyncAsync(
            final CreateResourceDataSyncRequest createResourceDataSyncRequest,
            final AsyncHandler<CreateResourceDataSyncRequest, CreateResourceDataSyncResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateResourceDataSyncResult>() {
            public CreateResourceDataSyncResult call() throws Exception {
                CreateResourceDataSyncResult result = null;
                try {
                    result = createResourceDataSync(createResourceDataSyncRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createResourceDataSyncRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes an activation. You are not required to delete an activation. If
     * you delete an activation, you can no longer use it to register additional
     * managed instances. Deleting an activation does not de-register managed
     * instances. You must manually de-register managed instances.
     * </p>
     * 
     * @param deleteActivationRequest
     * @return A Java Future object containing the response from the
     *         DeleteActivation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidActivationIdException
     * @throws InvalidActivationException
     * @throws InternalServerErrorException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeleteActivationResult> deleteActivationAsync(
            final DeleteActivationRequest deleteActivationRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DeleteActivationResult>() {
            public DeleteActivationResult call() throws Exception {
                return deleteActivation(deleteActivationRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes an activation. You are not required to delete an activation. If
     * you delete an activation, you can no longer use it to register additional
     * managed instances. Deleting an activation does not de-register managed
     * instances. You must manually de-register managed instances.
     * </p>
     * 
     * @param deleteActivationRequest
     * @return A Java Future object containing the response from the
     *         DeleteActivation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidActivationIdException
     * @throws InvalidActivationException
     * @throws InternalServerErrorException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeleteActivationResult> deleteActivationAsync(
            final DeleteActivationRequest deleteActivationRequest,
            final AsyncHandler<DeleteActivationRequest, DeleteActivationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteActivationResult>() {
            public DeleteActivationResult call() throws Exception {
                DeleteActivationResult result = null;
                try {
                    result = deleteActivation(deleteActivationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteActivationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Disassociates the specified Systems Manager document from the specified
     * instance.
     * </p>
     * <p>
     * When you disassociate a document from an instance, it does not change the
     * configuration of the instance. To change the configuration state of an
     * instance after you disassociate a document, you must create a new
     * document with the desired configuration and associate it with the
     * instance.
     * </p>
     * 
     * @param deleteAssociationRequest
     * @return A Java Future object containing the response from the
     *         DeleteAssociation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws AssociationDoesNotExistException
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidInstanceIdException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeleteAssociationResult> deleteAssociationAsync(
            final DeleteAssociationRequest deleteAssociationRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DeleteAssociationResult>() {
            public DeleteAssociationResult call() throws Exception {
                return deleteAssociation(deleteAssociationRequest);
            }
        });
    }

    /**
     * <p>
     * Disassociates the specified Systems Manager document from the specified
     * instance.
     * </p>
     * <p>
     * When you disassociate a document from an instance, it does not change the
     * configuration of the instance. To change the configuration state of an
     * instance after you disassociate a document, you must create a new
     * document with the desired configuration and associate it with the
     * instance.
     * </p>
     * 
     * @param deleteAssociationRequest
     * @return A Java Future object containing the response from the
     *         DeleteAssociation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws AssociationDoesNotExistException
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidInstanceIdException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeleteAssociationResult> deleteAssociationAsync(
            final DeleteAssociationRequest deleteAssociationRequest,
            final AsyncHandler<DeleteAssociationRequest, DeleteAssociationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteAssociationResult>() {
            public DeleteAssociationResult call() throws Exception {
                DeleteAssociationResult result = null;
                try {
                    result = deleteAssociation(deleteAssociationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteAssociationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes the Systems Manager document and all instance associations to the
     * document.
     * </p>
     * <p>
     * Before you delete the document, we recommend that you use
     * <a>DeleteAssociation</a> to disassociate all instances that are
     * associated with the document.
     * </p>
     * 
     * @param deleteDocumentRequest
     * @return A Java Future object containing the response from the
     *         DeleteDocument service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentOperationException
     * @throws AssociatedInstancesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeleteDocumentResult> deleteDocumentAsync(
            final DeleteDocumentRequest deleteDocumentRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DeleteDocumentResult>() {
            public DeleteDocumentResult call() throws Exception {
                return deleteDocument(deleteDocumentRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes the Systems Manager document and all instance associations to the
     * document.
     * </p>
     * <p>
     * Before you delete the document, we recommend that you use
     * <a>DeleteAssociation</a> to disassociate all instances that are
     * associated with the document.
     * </p>
     * 
     * @param deleteDocumentRequest
     * @return A Java Future object containing the response from the
     *         DeleteDocument service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentOperationException
     * @throws AssociatedInstancesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeleteDocumentResult> deleteDocumentAsync(
            final DeleteDocumentRequest deleteDocumentRequest,
            final AsyncHandler<DeleteDocumentRequest, DeleteDocumentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteDocumentResult>() {
            public DeleteDocumentResult call() throws Exception {
                DeleteDocumentResult result = null;
                try {
                    result = deleteDocument(deleteDocumentRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteDocumentRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Delete a custom inventory type, or the data associated with a custom
     * Inventory type. Deleting a custom inventory type is also referred to as
     * deleting a custom inventory schema.
     * </p>
     * 
     * @param deleteInventoryRequest
     * @return A Java Future object containing the response from the
     *         DeleteInventory service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidTypeNameException
     * @throws InvalidOptionException
     * @throws InvalidDeleteInventoryParametersException
     * @throws InvalidInventoryRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeleteInventoryResult> deleteInventoryAsync(
            final DeleteInventoryRequest deleteInventoryRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DeleteInventoryResult>() {
            public DeleteInventoryResult call() throws Exception {
                return deleteInventory(deleteInventoryRequest);
            }
        });
    }

    /**
     * <p>
     * Delete a custom inventory type, or the data associated with a custom
     * Inventory type. Deleting a custom inventory type is also referred to as
     * deleting a custom inventory schema.
     * </p>
     * 
     * @param deleteInventoryRequest
     * @return A Java Future object containing the response from the
     *         DeleteInventory service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidTypeNameException
     * @throws InvalidOptionException
     * @throws InvalidDeleteInventoryParametersException
     * @throws InvalidInventoryRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeleteInventoryResult> deleteInventoryAsync(
            final DeleteInventoryRequest deleteInventoryRequest,
            final AsyncHandler<DeleteInventoryRequest, DeleteInventoryResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteInventoryResult>() {
            public DeleteInventoryResult call() throws Exception {
                DeleteInventoryResult result = null;
                try {
                    result = deleteInventory(deleteInventoryRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteInventoryRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a maintenance window.
     * </p>
     * 
     * @param deleteMaintenanceWindowRequest
     * @return A Java Future object containing the response from the
     *         DeleteMaintenanceWindow service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeleteMaintenanceWindowResult> deleteMaintenanceWindowAsync(
            final DeleteMaintenanceWindowRequest deleteMaintenanceWindowRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteMaintenanceWindowResult>() {
            public DeleteMaintenanceWindowResult call() throws Exception {
                return deleteMaintenanceWindow(deleteMaintenanceWindowRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes a maintenance window.
     * </p>
     * 
     * @param deleteMaintenanceWindowRequest
     * @return A Java Future object containing the response from the
     *         DeleteMaintenanceWindow service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeleteMaintenanceWindowResult> deleteMaintenanceWindowAsync(
            final DeleteMaintenanceWindowRequest deleteMaintenanceWindowRequest,
            final AsyncHandler<DeleteMaintenanceWindowRequest, DeleteMaintenanceWindowResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteMaintenanceWindowResult>() {
            public DeleteMaintenanceWindowResult call() throws Exception {
                DeleteMaintenanceWindowResult result = null;
                try {
                    result = deleteMaintenanceWindow(deleteMaintenanceWindowRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteMaintenanceWindowRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Delete a parameter from the system.
     * </p>
     * 
     * @param deleteParameterRequest
     * @return A Java Future object containing the response from the
     *         DeleteParameter service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ParameterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeleteParameterResult> deleteParameterAsync(
            final DeleteParameterRequest deleteParameterRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DeleteParameterResult>() {
            public DeleteParameterResult call() throws Exception {
                return deleteParameter(deleteParameterRequest);
            }
        });
    }

    /**
     * <p>
     * Delete a parameter from the system.
     * </p>
     * 
     * @param deleteParameterRequest
     * @return A Java Future object containing the response from the
     *         DeleteParameter service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ParameterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeleteParameterResult> deleteParameterAsync(
            final DeleteParameterRequest deleteParameterRequest,
            final AsyncHandler<DeleteParameterRequest, DeleteParameterResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteParameterResult>() {
            public DeleteParameterResult call() throws Exception {
                DeleteParameterResult result = null;
                try {
                    result = deleteParameter(deleteParameterRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteParameterRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Delete a list of parameters.
     * </p>
     * 
     * @param deleteParametersRequest
     * @return A Java Future object containing the response from the
     *         DeleteParameters service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeleteParametersResult> deleteParametersAsync(
            final DeleteParametersRequest deleteParametersRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DeleteParametersResult>() {
            public DeleteParametersResult call() throws Exception {
                return deleteParameters(deleteParametersRequest);
            }
        });
    }

    /**
     * <p>
     * Delete a list of parameters.
     * </p>
     * 
     * @param deleteParametersRequest
     * @return A Java Future object containing the response from the
     *         DeleteParameters service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeleteParametersResult> deleteParametersAsync(
            final DeleteParametersRequest deleteParametersRequest,
            final AsyncHandler<DeleteParametersRequest, DeleteParametersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteParametersResult>() {
            public DeleteParametersResult call() throws Exception {
                DeleteParametersResult result = null;
                try {
                    result = deleteParameters(deleteParametersRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteParametersRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a patch baseline.
     * </p>
     * 
     * @param deletePatchBaselineRequest
     * @return A Java Future object containing the response from the
     *         DeletePatchBaseline service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws ResourceInUseException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeletePatchBaselineResult> deletePatchBaselineAsync(
            final DeletePatchBaselineRequest deletePatchBaselineRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeletePatchBaselineResult>() {
            public DeletePatchBaselineResult call() throws Exception {
                return deletePatchBaseline(deletePatchBaselineRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes a patch baseline.
     * </p>
     * 
     * @param deletePatchBaselineRequest
     * @return A Java Future object containing the response from the
     *         DeletePatchBaseline service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws ResourceInUseException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeletePatchBaselineResult> deletePatchBaselineAsync(
            final DeletePatchBaselineRequest deletePatchBaselineRequest,
            final AsyncHandler<DeletePatchBaselineRequest, DeletePatchBaselineResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeletePatchBaselineResult>() {
            public DeletePatchBaselineResult call() throws Exception {
                DeletePatchBaselineResult result = null;
                try {
                    result = deletePatchBaseline(deletePatchBaselineRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deletePatchBaselineRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a Resource Data Sync configuration. After the configuration is
     * deleted, changes to data on managed instances are no longer synced to or
     * from the target. Deleting a sync configuration does not delete data.
     * </p>
     * 
     * @param deleteResourceDataSyncRequest
     * @return A Java Future object containing the response from the
     *         DeleteResourceDataSync service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ResourceDataSyncNotFoundException
     * @throws ResourceDataSyncInvalidConfigurationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeleteResourceDataSyncResult> deleteResourceDataSyncAsync(
            final DeleteResourceDataSyncRequest deleteResourceDataSyncRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteResourceDataSyncResult>() {
            public DeleteResourceDataSyncResult call() throws Exception {
                return deleteResourceDataSync(deleteResourceDataSyncRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes a Resource Data Sync configuration. After the configuration is
     * deleted, changes to data on managed instances are no longer synced to or
     * from the target. Deleting a sync configuration does not delete data.
     * </p>
     * 
     * @param deleteResourceDataSyncRequest
     * @return A Java Future object containing the response from the
     *         DeleteResourceDataSync service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ResourceDataSyncNotFoundException
     * @throws ResourceDataSyncInvalidConfigurationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeleteResourceDataSyncResult> deleteResourceDataSyncAsync(
            final DeleteResourceDataSyncRequest deleteResourceDataSyncRequest,
            final AsyncHandler<DeleteResourceDataSyncRequest, DeleteResourceDataSyncResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteResourceDataSyncResult>() {
            public DeleteResourceDataSyncResult call() throws Exception {
                DeleteResourceDataSyncResult result = null;
                try {
                    result = deleteResourceDataSync(deleteResourceDataSyncRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteResourceDataSyncRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Removes the server or virtual machine from the list of registered
     * servers. You can reregister the instance again at any time. If you don't
     * plan to use Run Command on the server, we suggest uninstalling SSM Agent
     * first.
     * </p>
     * 
     * @param deregisterManagedInstanceRequest
     * @return A Java Future object containing the response from the
     *         DeregisterManagedInstance service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InvalidInstanceIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeregisterManagedInstanceResult> deregisterManagedInstanceAsync(
            final DeregisterManagedInstanceRequest deregisterManagedInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeregisterManagedInstanceResult>() {
            public DeregisterManagedInstanceResult call() throws Exception {
                return deregisterManagedInstance(deregisterManagedInstanceRequest);
            }
        });
    }

    /**
     * <p>
     * Removes the server or virtual machine from the list of registered
     * servers. You can reregister the instance again at any time. If you don't
     * plan to use Run Command on the server, we suggest uninstalling SSM Agent
     * first.
     * </p>
     * 
     * @param deregisterManagedInstanceRequest
     * @return A Java Future object containing the response from the
     *         DeregisterManagedInstance service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InvalidInstanceIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeregisterManagedInstanceResult> deregisterManagedInstanceAsync(
            final DeregisterManagedInstanceRequest deregisterManagedInstanceRequest,
            final AsyncHandler<DeregisterManagedInstanceRequest, DeregisterManagedInstanceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeregisterManagedInstanceResult>() {
            public DeregisterManagedInstanceResult call() throws Exception {
                DeregisterManagedInstanceResult result = null;
                try {
                    result = deregisterManagedInstance(deregisterManagedInstanceRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deregisterManagedInstanceRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Removes a patch group from a patch baseline.
     * </p>
     * 
     * @param deregisterPatchBaselineForPatchGroupRequest
     * @return A Java Future object containing the response from the
     *         DeregisterPatchBaselineForPatchGroup service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeregisterPatchBaselineForPatchGroupResult> deregisterPatchBaselineForPatchGroupAsync(
            final DeregisterPatchBaselineForPatchGroupRequest deregisterPatchBaselineForPatchGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeregisterPatchBaselineForPatchGroupResult>() {
            public DeregisterPatchBaselineForPatchGroupResult call() throws Exception {
                return deregisterPatchBaselineForPatchGroup(deregisterPatchBaselineForPatchGroupRequest);
            }
        });
    }

    /**
     * <p>
     * Removes a patch group from a patch baseline.
     * </p>
     * 
     * @param deregisterPatchBaselineForPatchGroupRequest
     * @return A Java Future object containing the response from the
     *         DeregisterPatchBaselineForPatchGroup service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeregisterPatchBaselineForPatchGroupResult> deregisterPatchBaselineForPatchGroupAsync(
            final DeregisterPatchBaselineForPatchGroupRequest deregisterPatchBaselineForPatchGroupRequest,
            final AsyncHandler<DeregisterPatchBaselineForPatchGroupRequest, DeregisterPatchBaselineForPatchGroupResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeregisterPatchBaselineForPatchGroupResult>() {
            public DeregisterPatchBaselineForPatchGroupResult call() throws Exception {
                DeregisterPatchBaselineForPatchGroupResult result = null;
                try {
                    result = deregisterPatchBaselineForPatchGroup(deregisterPatchBaselineForPatchGroupRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deregisterPatchBaselineForPatchGroupRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Removes a target from a maintenance window.
     * </p>
     * 
     * @param deregisterTargetFromMaintenanceWindowRequest
     * @return A Java Future object containing the response from the
     *         DeregisterTargetFromMaintenanceWindow service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws TargetInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeregisterTargetFromMaintenanceWindowResult> deregisterTargetFromMaintenanceWindowAsync(
            final DeregisterTargetFromMaintenanceWindowRequest deregisterTargetFromMaintenanceWindowRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeregisterTargetFromMaintenanceWindowResult>() {
            public DeregisterTargetFromMaintenanceWindowResult call() throws Exception {
                return deregisterTargetFromMaintenanceWindow(deregisterTargetFromMaintenanceWindowRequest);
            }
        });
    }

    /**
     * <p>
     * Removes a target from a maintenance window.
     * </p>
     * 
     * @param deregisterTargetFromMaintenanceWindowRequest
     * @return A Java Future object containing the response from the
     *         DeregisterTargetFromMaintenanceWindow service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws TargetInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeregisterTargetFromMaintenanceWindowResult> deregisterTargetFromMaintenanceWindowAsync(
            final DeregisterTargetFromMaintenanceWindowRequest deregisterTargetFromMaintenanceWindowRequest,
            final AsyncHandler<DeregisterTargetFromMaintenanceWindowRequest, DeregisterTargetFromMaintenanceWindowResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeregisterTargetFromMaintenanceWindowResult>() {
            public DeregisterTargetFromMaintenanceWindowResult call() throws Exception {
                DeregisterTargetFromMaintenanceWindowResult result = null;
                try {
                    result = deregisterTargetFromMaintenanceWindow(deregisterTargetFromMaintenanceWindowRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deregisterTargetFromMaintenanceWindowRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Removes a task from a maintenance window.
     * </p>
     * 
     * @param deregisterTaskFromMaintenanceWindowRequest
     * @return A Java Future object containing the response from the
     *         DeregisterTaskFromMaintenanceWindow service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeregisterTaskFromMaintenanceWindowResult> deregisterTaskFromMaintenanceWindowAsync(
            final DeregisterTaskFromMaintenanceWindowRequest deregisterTaskFromMaintenanceWindowRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeregisterTaskFromMaintenanceWindowResult>() {
            public DeregisterTaskFromMaintenanceWindowResult call() throws Exception {
                return deregisterTaskFromMaintenanceWindow(deregisterTaskFromMaintenanceWindowRequest);
            }
        });
    }

    /**
     * <p>
     * Removes a task from a maintenance window.
     * </p>
     * 
     * @param deregisterTaskFromMaintenanceWindowRequest
     * @return A Java Future object containing the response from the
     *         DeregisterTaskFromMaintenanceWindow service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DeregisterTaskFromMaintenanceWindowResult> deregisterTaskFromMaintenanceWindowAsync(
            final DeregisterTaskFromMaintenanceWindowRequest deregisterTaskFromMaintenanceWindowRequest,
            final AsyncHandler<DeregisterTaskFromMaintenanceWindowRequest, DeregisterTaskFromMaintenanceWindowResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeregisterTaskFromMaintenanceWindowResult>() {
            public DeregisterTaskFromMaintenanceWindowResult call() throws Exception {
                DeregisterTaskFromMaintenanceWindowResult result = null;
                try {
                    result = deregisterTaskFromMaintenanceWindow(deregisterTaskFromMaintenanceWindowRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deregisterTaskFromMaintenanceWindowRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes details about the activation, such as the date and time the
     * activation was created, its expiration date, the IAM role assigned to the
     * instances in the activation, and the number of instances registered by
     * using this activation.
     * </p>
     * 
     * @param describeActivationsRequest
     * @return A Java Future object containing the response from the
     *         DescribeActivations service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeActivationsResult> describeActivationsAsync(
            final DescribeActivationsRequest describeActivationsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeActivationsResult>() {
            public DescribeActivationsResult call() throws Exception {
                return describeActivations(describeActivationsRequest);
            }
        });
    }

    /**
     * <p>
     * Describes details about the activation, such as the date and time the
     * activation was created, its expiration date, the IAM role assigned to the
     * instances in the activation, and the number of instances registered by
     * using this activation.
     * </p>
     * 
     * @param describeActivationsRequest
     * @return A Java Future object containing the response from the
     *         DescribeActivations service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeActivationsResult> describeActivationsAsync(
            final DescribeActivationsRequest describeActivationsRequest,
            final AsyncHandler<DescribeActivationsRequest, DescribeActivationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeActivationsResult>() {
            public DescribeActivationsResult call() throws Exception {
                DescribeActivationsResult result = null;
                try {
                    result = describeActivations(describeActivationsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeActivationsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the association for the specified target or instance. If you
     * created the association by using the <code>Targets</code> parameter, then
     * you must retrieve the association by using the association ID. If you
     * created the association by specifying an instance ID and a Systems
     * Manager document, then you retrieve the association by specifying the
     * document name and the instance ID.
     * </p>
     * 
     * @param describeAssociationRequest
     * @return A Java Future object containing the response from the
     *         DescribeAssociation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws AssociationDoesNotExistException
     * @throws InvalidAssociationVersionException
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidInstanceIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeAssociationResult> describeAssociationAsync(
            final DescribeAssociationRequest describeAssociationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAssociationResult>() {
            public DescribeAssociationResult call() throws Exception {
                return describeAssociation(describeAssociationRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the association for the specified target or instance. If you
     * created the association by using the <code>Targets</code> parameter, then
     * you must retrieve the association by using the association ID. If you
     * created the association by specifying an instance ID and a Systems
     * Manager document, then you retrieve the association by specifying the
     * document name and the instance ID.
     * </p>
     * 
     * @param describeAssociationRequest
     * @return A Java Future object containing the response from the
     *         DescribeAssociation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws AssociationDoesNotExistException
     * @throws InvalidAssociationVersionException
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidInstanceIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeAssociationResult> describeAssociationAsync(
            final DescribeAssociationRequest describeAssociationRequest,
            final AsyncHandler<DescribeAssociationRequest, DescribeAssociationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAssociationResult>() {
            public DescribeAssociationResult call() throws Exception {
                DescribeAssociationResult result = null;
                try {
                    result = describeAssociation(describeAssociationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeAssociationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Use this API action to view information about a specific execution of a
     * specific association.
     * </p>
     * 
     * @param describeAssociationExecutionTargetsRequest
     * @return A Java Future object containing the response from the
     *         DescribeAssociationExecutionTargets service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AssociationDoesNotExistException
     * @throws InvalidNextTokenException
     * @throws AssociationExecutionDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeAssociationExecutionTargetsResult> describeAssociationExecutionTargetsAsync(
            final DescribeAssociationExecutionTargetsRequest describeAssociationExecutionTargetsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAssociationExecutionTargetsResult>() {
            public DescribeAssociationExecutionTargetsResult call() throws Exception {
                return describeAssociationExecutionTargets(describeAssociationExecutionTargetsRequest);
            }
        });
    }

    /**
     * <p>
     * Use this API action to view information about a specific execution of a
     * specific association.
     * </p>
     * 
     * @param describeAssociationExecutionTargetsRequest
     * @return A Java Future object containing the response from the
     *         DescribeAssociationExecutionTargets service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AssociationDoesNotExistException
     * @throws InvalidNextTokenException
     * @throws AssociationExecutionDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeAssociationExecutionTargetsResult> describeAssociationExecutionTargetsAsync(
            final DescribeAssociationExecutionTargetsRequest describeAssociationExecutionTargetsRequest,
            final AsyncHandler<DescribeAssociationExecutionTargetsRequest, DescribeAssociationExecutionTargetsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAssociationExecutionTargetsResult>() {
            public DescribeAssociationExecutionTargetsResult call() throws Exception {
                DescribeAssociationExecutionTargetsResult result = null;
                try {
                    result = describeAssociationExecutionTargets(describeAssociationExecutionTargetsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeAssociationExecutionTargetsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Use this API action to view all executions for a specific association ID.
     * </p>
     * 
     * @param describeAssociationExecutionsRequest
     * @return A Java Future object containing the response from the
     *         DescribeAssociationExecutions service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AssociationDoesNotExistException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeAssociationExecutionsResult> describeAssociationExecutionsAsync(
            final DescribeAssociationExecutionsRequest describeAssociationExecutionsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAssociationExecutionsResult>() {
            public DescribeAssociationExecutionsResult call() throws Exception {
                return describeAssociationExecutions(describeAssociationExecutionsRequest);
            }
        });
    }

    /**
     * <p>
     * Use this API action to view all executions for a specific association ID.
     * </p>
     * 
     * @param describeAssociationExecutionsRequest
     * @return A Java Future object containing the response from the
     *         DescribeAssociationExecutions service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AssociationDoesNotExistException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeAssociationExecutionsResult> describeAssociationExecutionsAsync(
            final DescribeAssociationExecutionsRequest describeAssociationExecutionsRequest,
            final AsyncHandler<DescribeAssociationExecutionsRequest, DescribeAssociationExecutionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAssociationExecutionsResult>() {
            public DescribeAssociationExecutionsResult call() throws Exception {
                DescribeAssociationExecutionsResult result = null;
                try {
                    result = describeAssociationExecutions(describeAssociationExecutionsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeAssociationExecutionsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides details about all active and terminated Automation executions.
     * </p>
     * 
     * @param describeAutomationExecutionsRequest
     * @return A Java Future object containing the response from the
     *         DescribeAutomationExecutions service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InvalidFilterKeyException
     * @throws InvalidFilterValueException
     * @throws InvalidNextTokenException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeAutomationExecutionsResult> describeAutomationExecutionsAsync(
            final DescribeAutomationExecutionsRequest describeAutomationExecutionsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAutomationExecutionsResult>() {
            public DescribeAutomationExecutionsResult call() throws Exception {
                return describeAutomationExecutions(describeAutomationExecutionsRequest);
            }
        });
    }

    /**
     * <p>
     * Provides details about all active and terminated Automation executions.
     * </p>
     * 
     * @param describeAutomationExecutionsRequest
     * @return A Java Future object containing the response from the
     *         DescribeAutomationExecutions service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InvalidFilterKeyException
     * @throws InvalidFilterValueException
     * @throws InvalidNextTokenException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeAutomationExecutionsResult> describeAutomationExecutionsAsync(
            final DescribeAutomationExecutionsRequest describeAutomationExecutionsRequest,
            final AsyncHandler<DescribeAutomationExecutionsRequest, DescribeAutomationExecutionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAutomationExecutionsResult>() {
            public DescribeAutomationExecutionsResult call() throws Exception {
                DescribeAutomationExecutionsResult result = null;
                try {
                    result = describeAutomationExecutions(describeAutomationExecutionsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeAutomationExecutionsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Information about all active and terminated step executions in an
     * Automation workflow.
     * </p>
     * 
     * @param describeAutomationStepExecutionsRequest
     * @return A Java Future object containing the response from the
     *         DescribeAutomationStepExecutions service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws AutomationExecutionNotFoundException
     * @throws InvalidNextTokenException
     * @throws InvalidFilterKeyException
     * @throws InvalidFilterValueException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeAutomationStepExecutionsResult> describeAutomationStepExecutionsAsync(
            final DescribeAutomationStepExecutionsRequest describeAutomationStepExecutionsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAutomationStepExecutionsResult>() {
            public DescribeAutomationStepExecutionsResult call() throws Exception {
                return describeAutomationStepExecutions(describeAutomationStepExecutionsRequest);
            }
        });
    }

    /**
     * <p>
     * Information about all active and terminated step executions in an
     * Automation workflow.
     * </p>
     * 
     * @param describeAutomationStepExecutionsRequest
     * @return A Java Future object containing the response from the
     *         DescribeAutomationStepExecutions service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws AutomationExecutionNotFoundException
     * @throws InvalidNextTokenException
     * @throws InvalidFilterKeyException
     * @throws InvalidFilterValueException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeAutomationStepExecutionsResult> describeAutomationStepExecutionsAsync(
            final DescribeAutomationStepExecutionsRequest describeAutomationStepExecutionsRequest,
            final AsyncHandler<DescribeAutomationStepExecutionsRequest, DescribeAutomationStepExecutionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAutomationStepExecutionsResult>() {
            public DescribeAutomationStepExecutionsResult call() throws Exception {
                DescribeAutomationStepExecutionsResult result = null;
                try {
                    result = describeAutomationStepExecutions(describeAutomationStepExecutionsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeAutomationStepExecutionsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists all patches eligible to be included in a patch baseline.
     * </p>
     * 
     * @param describeAvailablePatchesRequest
     * @return A Java Future object containing the response from the
     *         DescribeAvailablePatches service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeAvailablePatchesResult> describeAvailablePatchesAsync(
            final DescribeAvailablePatchesRequest describeAvailablePatchesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAvailablePatchesResult>() {
            public DescribeAvailablePatchesResult call() throws Exception {
                return describeAvailablePatches(describeAvailablePatchesRequest);
            }
        });
    }

    /**
     * <p>
     * Lists all patches eligible to be included in a patch baseline.
     * </p>
     * 
     * @param describeAvailablePatchesRequest
     * @return A Java Future object containing the response from the
     *         DescribeAvailablePatches service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeAvailablePatchesResult> describeAvailablePatchesAsync(
            final DescribeAvailablePatchesRequest describeAvailablePatchesRequest,
            final AsyncHandler<DescribeAvailablePatchesRequest, DescribeAvailablePatchesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAvailablePatchesResult>() {
            public DescribeAvailablePatchesResult call() throws Exception {
                DescribeAvailablePatchesResult result = null;
                try {
                    result = describeAvailablePatches(describeAvailablePatchesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeAvailablePatchesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the specified Systems Manager document.
     * </p>
     * 
     * @param describeDocumentRequest
     * @return A Java Future object containing the response from the
     *         DescribeDocument service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeDocumentResult> describeDocumentAsync(
            final DescribeDocumentRequest describeDocumentRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DescribeDocumentResult>() {
            public DescribeDocumentResult call() throws Exception {
                return describeDocument(describeDocumentRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the specified Systems Manager document.
     * </p>
     * 
     * @param describeDocumentRequest
     * @return A Java Future object containing the response from the
     *         DescribeDocument service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeDocumentResult> describeDocumentAsync(
            final DescribeDocumentRequest describeDocumentRequest,
            final AsyncHandler<DescribeDocumentRequest, DescribeDocumentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDocumentResult>() {
            public DescribeDocumentResult call() throws Exception {
                DescribeDocumentResult result = null;
                try {
                    result = describeDocument(describeDocumentRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeDocumentRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes the permissions for a Systems Manager document. If you created
     * the document, you are the owner. If a document is shared, it can either
     * be shared privately (by specifying a user's AWS account ID) or publicly
     * (<i>All</i>).
     * </p>
     * 
     * @param describeDocumentPermissionRequest
     * @return A Java Future object containing the response from the
     *         DescribeDocumentPermission service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidPermissionTypeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeDocumentPermissionResult> describeDocumentPermissionAsync(
            final DescribeDocumentPermissionRequest describeDocumentPermissionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDocumentPermissionResult>() {
            public DescribeDocumentPermissionResult call() throws Exception {
                return describeDocumentPermission(describeDocumentPermissionRequest);
            }
        });
    }

    /**
     * <p>
     * Describes the permissions for a Systems Manager document. If you created
     * the document, you are the owner. If a document is shared, it can either
     * be shared privately (by specifying a user's AWS account ID) or publicly
     * (<i>All</i>).
     * </p>
     * 
     * @param describeDocumentPermissionRequest
     * @return A Java Future object containing the response from the
     *         DescribeDocumentPermission service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidPermissionTypeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeDocumentPermissionResult> describeDocumentPermissionAsync(
            final DescribeDocumentPermissionRequest describeDocumentPermissionRequest,
            final AsyncHandler<DescribeDocumentPermissionRequest, DescribeDocumentPermissionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDocumentPermissionResult>() {
            public DescribeDocumentPermissionResult call() throws Exception {
                DescribeDocumentPermissionResult result = null;
                try {
                    result = describeDocumentPermission(describeDocumentPermissionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeDocumentPermissionRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * All associations for the instance(s).
     * </p>
     * 
     * @param describeEffectiveInstanceAssociationsRequest
     * @return A Java Future object containing the response from the
     *         DescribeEffectiveInstanceAssociations service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeEffectiveInstanceAssociationsResult> describeEffectiveInstanceAssociationsAsync(
            final DescribeEffectiveInstanceAssociationsRequest describeEffectiveInstanceAssociationsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEffectiveInstanceAssociationsResult>() {
            public DescribeEffectiveInstanceAssociationsResult call() throws Exception {
                return describeEffectiveInstanceAssociations(describeEffectiveInstanceAssociationsRequest);
            }
        });
    }

    /**
     * <p>
     * All associations for the instance(s).
     * </p>
     * 
     * @param describeEffectiveInstanceAssociationsRequest
     * @return A Java Future object containing the response from the
     *         DescribeEffectiveInstanceAssociations service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeEffectiveInstanceAssociationsResult> describeEffectiveInstanceAssociationsAsync(
            final DescribeEffectiveInstanceAssociationsRequest describeEffectiveInstanceAssociationsRequest,
            final AsyncHandler<DescribeEffectiveInstanceAssociationsRequest, DescribeEffectiveInstanceAssociationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeEffectiveInstanceAssociationsResult>() {
            public DescribeEffectiveInstanceAssociationsResult call() throws Exception {
                DescribeEffectiveInstanceAssociationsResult result = null;
                try {
                    result = describeEffectiveInstanceAssociations(describeEffectiveInstanceAssociationsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeEffectiveInstanceAssociationsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves the current effective patches (the patch and the approval
     * state) for the specified patch baseline. Note that this API applies only
     * to Windows patch baselines.
     * </p>
     * 
     * @param describeEffectivePatchesForPatchBaselineRequest
     * @return A Java Future object containing the response from the
     *         DescribeEffectivePatchesForPatchBaseline service method, as
     *         returned by Amazon Simple Systems Manager (SSM).
     * @throws InvalidResourceIdException
     * @throws DoesNotExistException
     * @throws UnsupportedOperatingSystemException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeEffectivePatchesForPatchBaselineResult> describeEffectivePatchesForPatchBaselineAsync(
            final DescribeEffectivePatchesForPatchBaselineRequest describeEffectivePatchesForPatchBaselineRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService
                .submit(new Callable<DescribeEffectivePatchesForPatchBaselineResult>() {
                    public DescribeEffectivePatchesForPatchBaselineResult call() throws Exception {
                        return describeEffectivePatchesForPatchBaseline(describeEffectivePatchesForPatchBaselineRequest);
                    }
                });
    }

    /**
     * <p>
     * Retrieves the current effective patches (the patch and the approval
     * state) for the specified patch baseline. Note that this API applies only
     * to Windows patch baselines.
     * </p>
     * 
     * @param describeEffectivePatchesForPatchBaselineRequest
     * @return A Java Future object containing the response from the
     *         DescribeEffectivePatchesForPatchBaseline service method, as
     *         returned by Amazon Simple Systems Manager (SSM).
     * @throws InvalidResourceIdException
     * @throws DoesNotExistException
     * @throws UnsupportedOperatingSystemException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeEffectivePatchesForPatchBaselineResult> describeEffectivePatchesForPatchBaselineAsync(
            final DescribeEffectivePatchesForPatchBaselineRequest describeEffectivePatchesForPatchBaselineRequest,
            final AsyncHandler<DescribeEffectivePatchesForPatchBaselineRequest, DescribeEffectivePatchesForPatchBaselineResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService
                .submit(new Callable<DescribeEffectivePatchesForPatchBaselineResult>() {
                    public DescribeEffectivePatchesForPatchBaselineResult call() throws Exception {
                        DescribeEffectivePatchesForPatchBaselineResult result = null;
                        try {
                            result = describeEffectivePatchesForPatchBaseline(describeEffectivePatchesForPatchBaselineRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(describeEffectivePatchesForPatchBaselineRequest,
                                result);
                        return result;
                    }
                });
    }

    /**
     * <p>
     * The status of the associations for the instance(s).
     * </p>
     * 
     * @param describeInstanceAssociationsStatusRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstanceAssociationsStatus service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeInstanceAssociationsStatusResult> describeInstanceAssociationsStatusAsync(
            final DescribeInstanceAssociationsStatusRequest describeInstanceAssociationsStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeInstanceAssociationsStatusResult>() {
            public DescribeInstanceAssociationsStatusResult call() throws Exception {
                return describeInstanceAssociationsStatus(describeInstanceAssociationsStatusRequest);
            }
        });
    }

    /**
     * <p>
     * The status of the associations for the instance(s).
     * </p>
     * 
     * @param describeInstanceAssociationsStatusRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstanceAssociationsStatus service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeInstanceAssociationsStatusResult> describeInstanceAssociationsStatusAsync(
            final DescribeInstanceAssociationsStatusRequest describeInstanceAssociationsStatusRequest,
            final AsyncHandler<DescribeInstanceAssociationsStatusRequest, DescribeInstanceAssociationsStatusResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeInstanceAssociationsStatusResult>() {
            public DescribeInstanceAssociationsStatusResult call() throws Exception {
                DescribeInstanceAssociationsStatusResult result = null;
                try {
                    result = describeInstanceAssociationsStatus(describeInstanceAssociationsStatusRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeInstanceAssociationsStatusRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes one or more of your instances, including information about the
     * operating system platform, the version of SSM Agent installed on the
     * instance, instance status, and so on.
     * </p>
     * <p>
     * If you specify one or more instance IDs, it returns information for those
     * instances. If you do not specify instance IDs, it returns information for
     * all your instances. If you specify an instance ID that is not valid or an
     * instance that you do not own, you receive an error.
     * </p>
     * <note>
     * <p>
     * The IamRole field for this API action is the Amazon Identity and Access
     * Management (IAM) role assigned to on-premises instances. This call does
     * not return the IAM role for EC2 instances.
     * </p>
     * </note>
     * 
     * @param describeInstanceInformationRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstanceInformation service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidNextTokenException
     * @throws InvalidInstanceInformationFilterValueException
     * @throws InvalidFilterKeyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeInstanceInformationResult> describeInstanceInformationAsync(
            final DescribeInstanceInformationRequest describeInstanceInformationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeInstanceInformationResult>() {
            public DescribeInstanceInformationResult call() throws Exception {
                return describeInstanceInformation(describeInstanceInformationRequest);
            }
        });
    }

    /**
     * <p>
     * Describes one or more of your instances, including information about the
     * operating system platform, the version of SSM Agent installed on the
     * instance, instance status, and so on.
     * </p>
     * <p>
     * If you specify one or more instance IDs, it returns information for those
     * instances. If you do not specify instance IDs, it returns information for
     * all your instances. If you specify an instance ID that is not valid or an
     * instance that you do not own, you receive an error.
     * </p>
     * <note>
     * <p>
     * The IamRole field for this API action is the Amazon Identity and Access
     * Management (IAM) role assigned to on-premises instances. This call does
     * not return the IAM role for EC2 instances.
     * </p>
     * </note>
     * 
     * @param describeInstanceInformationRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstanceInformation service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidNextTokenException
     * @throws InvalidInstanceInformationFilterValueException
     * @throws InvalidFilterKeyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeInstanceInformationResult> describeInstanceInformationAsync(
            final DescribeInstanceInformationRequest describeInstanceInformationRequest,
            final AsyncHandler<DescribeInstanceInformationRequest, DescribeInstanceInformationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeInstanceInformationResult>() {
            public DescribeInstanceInformationResult call() throws Exception {
                DescribeInstanceInformationResult result = null;
                try {
                    result = describeInstanceInformation(describeInstanceInformationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeInstanceInformationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves the high-level patch state of one or more instances.
     * </p>
     * 
     * @param describeInstancePatchStatesRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstancePatchStates service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeInstancePatchStatesResult> describeInstancePatchStatesAsync(
            final DescribeInstancePatchStatesRequest describeInstancePatchStatesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeInstancePatchStatesResult>() {
            public DescribeInstancePatchStatesResult call() throws Exception {
                return describeInstancePatchStates(describeInstancePatchStatesRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves the high-level patch state of one or more instances.
     * </p>
     * 
     * @param describeInstancePatchStatesRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstancePatchStates service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeInstancePatchStatesResult> describeInstancePatchStatesAsync(
            final DescribeInstancePatchStatesRequest describeInstancePatchStatesRequest,
            final AsyncHandler<DescribeInstancePatchStatesRequest, DescribeInstancePatchStatesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeInstancePatchStatesResult>() {
            public DescribeInstancePatchStatesResult call() throws Exception {
                DescribeInstancePatchStatesResult result = null;
                try {
                    result = describeInstancePatchStates(describeInstancePatchStatesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeInstancePatchStatesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves the high-level patch state for the instances in the specified
     * patch group.
     * </p>
     * 
     * @param describeInstancePatchStatesForPatchGroupRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstancePatchStatesForPatchGroup service method, as
     *         returned by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeInstancePatchStatesForPatchGroupResult> describeInstancePatchStatesForPatchGroupAsync(
            final DescribeInstancePatchStatesForPatchGroupRequest describeInstancePatchStatesForPatchGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService
                .submit(new Callable<DescribeInstancePatchStatesForPatchGroupResult>() {
                    public DescribeInstancePatchStatesForPatchGroupResult call() throws Exception {
                        return describeInstancePatchStatesForPatchGroup(describeInstancePatchStatesForPatchGroupRequest);
                    }
                });
    }

    /**
     * <p>
     * Retrieves the high-level patch state for the instances in the specified
     * patch group.
     * </p>
     * 
     * @param describeInstancePatchStatesForPatchGroupRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstancePatchStatesForPatchGroup service method, as
     *         returned by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeInstancePatchStatesForPatchGroupResult> describeInstancePatchStatesForPatchGroupAsync(
            final DescribeInstancePatchStatesForPatchGroupRequest describeInstancePatchStatesForPatchGroupRequest,
            final AsyncHandler<DescribeInstancePatchStatesForPatchGroupRequest, DescribeInstancePatchStatesForPatchGroupResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService
                .submit(new Callable<DescribeInstancePatchStatesForPatchGroupResult>() {
                    public DescribeInstancePatchStatesForPatchGroupResult call() throws Exception {
                        DescribeInstancePatchStatesForPatchGroupResult result = null;
                        try {
                            result = describeInstancePatchStatesForPatchGroup(describeInstancePatchStatesForPatchGroupRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(describeInstancePatchStatesForPatchGroupRequest,
                                result);
                        return result;
                    }
                });
    }

    /**
     * <p>
     * Retrieves information about the patches on the specified instance and
     * their state relative to the patch baseline being used for the instance.
     * </p>
     * 
     * @param describeInstancePatchesRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstancePatches service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeInstancePatchesResult> describeInstancePatchesAsync(
            final DescribeInstancePatchesRequest describeInstancePatchesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeInstancePatchesResult>() {
            public DescribeInstancePatchesResult call() throws Exception {
                return describeInstancePatches(describeInstancePatchesRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves information about the patches on the specified instance and
     * their state relative to the patch baseline being used for the instance.
     * </p>
     * 
     * @param describeInstancePatchesRequest
     * @return A Java Future object containing the response from the
     *         DescribeInstancePatches service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeInstancePatchesResult> describeInstancePatchesAsync(
            final DescribeInstancePatchesRequest describeInstancePatchesRequest,
            final AsyncHandler<DescribeInstancePatchesRequest, DescribeInstancePatchesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeInstancePatchesResult>() {
            public DescribeInstancePatchesResult call() throws Exception {
                DescribeInstancePatchesResult result = null;
                try {
                    result = describeInstancePatches(describeInstancePatchesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeInstancePatchesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Describes a specific delete inventory operation.
     * </p>
     * 
     * @param describeInventoryDeletionsRequest
     * @return A Java Future object containing the response from the
     *         DescribeInventoryDeletions service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDeletionIdException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeInventoryDeletionsResult> describeInventoryDeletionsAsync(
            final DescribeInventoryDeletionsRequest describeInventoryDeletionsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeInventoryDeletionsResult>() {
            public DescribeInventoryDeletionsResult call() throws Exception {
                return describeInventoryDeletions(describeInventoryDeletionsRequest);
            }
        });
    }

    /**
     * <p>
     * Describes a specific delete inventory operation.
     * </p>
     * 
     * @param describeInventoryDeletionsRequest
     * @return A Java Future object containing the response from the
     *         DescribeInventoryDeletions service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDeletionIdException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeInventoryDeletionsResult> describeInventoryDeletionsAsync(
            final DescribeInventoryDeletionsRequest describeInventoryDeletionsRequest,
            final AsyncHandler<DescribeInventoryDeletionsRequest, DescribeInventoryDeletionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeInventoryDeletionsResult>() {
            public DescribeInventoryDeletionsResult call() throws Exception {
                DescribeInventoryDeletionsResult result = null;
                try {
                    result = describeInventoryDeletions(describeInventoryDeletionsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeInventoryDeletionsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves the individual task executions (one per target) for a
     * particular task run as part of a maintenance window execution.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTaskInvocationsRequest
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowExecutionTaskInvocations service method,
     *         as returned by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeMaintenanceWindowExecutionTaskInvocationsResult> describeMaintenanceWindowExecutionTaskInvocationsAsync(
            final DescribeMaintenanceWindowExecutionTaskInvocationsRequest describeMaintenanceWindowExecutionTaskInvocationsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService
                .submit(new Callable<DescribeMaintenanceWindowExecutionTaskInvocationsResult>() {
                    public DescribeMaintenanceWindowExecutionTaskInvocationsResult call()
                            throws Exception {
                        return describeMaintenanceWindowExecutionTaskInvocations(describeMaintenanceWindowExecutionTaskInvocationsRequest);
                    }
                });
    }

    /**
     * <p>
     * Retrieves the individual task executions (one per target) for a
     * particular task run as part of a maintenance window execution.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTaskInvocationsRequest
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowExecutionTaskInvocations service method,
     *         as returned by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeMaintenanceWindowExecutionTaskInvocationsResult> describeMaintenanceWindowExecutionTaskInvocationsAsync(
            final DescribeMaintenanceWindowExecutionTaskInvocationsRequest describeMaintenanceWindowExecutionTaskInvocationsRequest,
            final AsyncHandler<DescribeMaintenanceWindowExecutionTaskInvocationsRequest, DescribeMaintenanceWindowExecutionTaskInvocationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService
                .submit(new Callable<DescribeMaintenanceWindowExecutionTaskInvocationsResult>() {
                    public DescribeMaintenanceWindowExecutionTaskInvocationsResult call()
                            throws Exception {
                        DescribeMaintenanceWindowExecutionTaskInvocationsResult result = null;
                        try {
                            result = describeMaintenanceWindowExecutionTaskInvocations(describeMaintenanceWindowExecutionTaskInvocationsRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(
                                describeMaintenanceWindowExecutionTaskInvocationsRequest, result);
                        return result;
                    }
                });
    }

    /**
     * <p>
     * For a given maintenance window execution, lists the tasks that were run.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTasksRequest
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowExecutionTasks service method, as
     *         returned by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeMaintenanceWindowExecutionTasksResult> describeMaintenanceWindowExecutionTasksAsync(
            final DescribeMaintenanceWindowExecutionTasksRequest describeMaintenanceWindowExecutionTasksRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService
                .submit(new Callable<DescribeMaintenanceWindowExecutionTasksResult>() {
                    public DescribeMaintenanceWindowExecutionTasksResult call() throws Exception {
                        return describeMaintenanceWindowExecutionTasks(describeMaintenanceWindowExecutionTasksRequest);
                    }
                });
    }

    /**
     * <p>
     * For a given maintenance window execution, lists the tasks that were run.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTasksRequest
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowExecutionTasks service method, as
     *         returned by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeMaintenanceWindowExecutionTasksResult> describeMaintenanceWindowExecutionTasksAsync(
            final DescribeMaintenanceWindowExecutionTasksRequest describeMaintenanceWindowExecutionTasksRequest,
            final AsyncHandler<DescribeMaintenanceWindowExecutionTasksRequest, DescribeMaintenanceWindowExecutionTasksResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService
                .submit(new Callable<DescribeMaintenanceWindowExecutionTasksResult>() {
                    public DescribeMaintenanceWindowExecutionTasksResult call() throws Exception {
                        DescribeMaintenanceWindowExecutionTasksResult result = null;
                        try {
                            result = describeMaintenanceWindowExecutionTasks(describeMaintenanceWindowExecutionTasksRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(describeMaintenanceWindowExecutionTasksRequest,
                                result);
                        return result;
                    }
                });
    }

    /**
     * <p>
     * Lists the executions of a maintenance window. This includes information
     * about when the maintenance window was scheduled to be active, and
     * information about tasks registered and run with the maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionsRequest
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowExecutions service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeMaintenanceWindowExecutionsResult> describeMaintenanceWindowExecutionsAsync(
            final DescribeMaintenanceWindowExecutionsRequest describeMaintenanceWindowExecutionsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeMaintenanceWindowExecutionsResult>() {
            public DescribeMaintenanceWindowExecutionsResult call() throws Exception {
                return describeMaintenanceWindowExecutions(describeMaintenanceWindowExecutionsRequest);
            }
        });
    }

    /**
     * <p>
     * Lists the executions of a maintenance window. This includes information
     * about when the maintenance window was scheduled to be active, and
     * information about tasks registered and run with the maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionsRequest
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowExecutions service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeMaintenanceWindowExecutionsResult> describeMaintenanceWindowExecutionsAsync(
            final DescribeMaintenanceWindowExecutionsRequest describeMaintenanceWindowExecutionsRequest,
            final AsyncHandler<DescribeMaintenanceWindowExecutionsRequest, DescribeMaintenanceWindowExecutionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeMaintenanceWindowExecutionsResult>() {
            public DescribeMaintenanceWindowExecutionsResult call() throws Exception {
                DescribeMaintenanceWindowExecutionsResult result = null;
                try {
                    result = describeMaintenanceWindowExecutions(describeMaintenanceWindowExecutionsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeMaintenanceWindowExecutionsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves information about upcoming executions of a maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowScheduleRequest
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowSchedule service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws DoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeMaintenanceWindowScheduleResult> describeMaintenanceWindowScheduleAsync(
            final DescribeMaintenanceWindowScheduleRequest describeMaintenanceWindowScheduleRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeMaintenanceWindowScheduleResult>() {
            public DescribeMaintenanceWindowScheduleResult call() throws Exception {
                return describeMaintenanceWindowSchedule(describeMaintenanceWindowScheduleRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves information about upcoming executions of a maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowScheduleRequest
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowSchedule service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws DoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeMaintenanceWindowScheduleResult> describeMaintenanceWindowScheduleAsync(
            final DescribeMaintenanceWindowScheduleRequest describeMaintenanceWindowScheduleRequest,
            final AsyncHandler<DescribeMaintenanceWindowScheduleRequest, DescribeMaintenanceWindowScheduleResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeMaintenanceWindowScheduleResult>() {
            public DescribeMaintenanceWindowScheduleResult call() throws Exception {
                DescribeMaintenanceWindowScheduleResult result = null;
                try {
                    result = describeMaintenanceWindowSchedule(describeMaintenanceWindowScheduleRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeMaintenanceWindowScheduleRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists the targets registered with the maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowTargetsRequest
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowTargets service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeMaintenanceWindowTargetsResult> describeMaintenanceWindowTargetsAsync(
            final DescribeMaintenanceWindowTargetsRequest describeMaintenanceWindowTargetsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeMaintenanceWindowTargetsResult>() {
            public DescribeMaintenanceWindowTargetsResult call() throws Exception {
                return describeMaintenanceWindowTargets(describeMaintenanceWindowTargetsRequest);
            }
        });
    }

    /**
     * <p>
     * Lists the targets registered with the maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowTargetsRequest
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowTargets service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeMaintenanceWindowTargetsResult> describeMaintenanceWindowTargetsAsync(
            final DescribeMaintenanceWindowTargetsRequest describeMaintenanceWindowTargetsRequest,
            final AsyncHandler<DescribeMaintenanceWindowTargetsRequest, DescribeMaintenanceWindowTargetsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeMaintenanceWindowTargetsResult>() {
            public DescribeMaintenanceWindowTargetsResult call() throws Exception {
                DescribeMaintenanceWindowTargetsResult result = null;
                try {
                    result = describeMaintenanceWindowTargets(describeMaintenanceWindowTargetsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeMaintenanceWindowTargetsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists the tasks in a maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowTasksRequest
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowTasks service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeMaintenanceWindowTasksResult> describeMaintenanceWindowTasksAsync(
            final DescribeMaintenanceWindowTasksRequest describeMaintenanceWindowTasksRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeMaintenanceWindowTasksResult>() {
            public DescribeMaintenanceWindowTasksResult call() throws Exception {
                return describeMaintenanceWindowTasks(describeMaintenanceWindowTasksRequest);
            }
        });
    }

    /**
     * <p>
     * Lists the tasks in a maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowTasksRequest
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowTasks service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeMaintenanceWindowTasksResult> describeMaintenanceWindowTasksAsync(
            final DescribeMaintenanceWindowTasksRequest describeMaintenanceWindowTasksRequest,
            final AsyncHandler<DescribeMaintenanceWindowTasksRequest, DescribeMaintenanceWindowTasksResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeMaintenanceWindowTasksResult>() {
            public DescribeMaintenanceWindowTasksResult call() throws Exception {
                DescribeMaintenanceWindowTasksResult result = null;
                try {
                    result = describeMaintenanceWindowTasks(describeMaintenanceWindowTasksRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeMaintenanceWindowTasksRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves the maintenance windows in an AWS account.
     * </p>
     * 
     * @param describeMaintenanceWindowsRequest
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindows service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeMaintenanceWindowsResult> describeMaintenanceWindowsAsync(
            final DescribeMaintenanceWindowsRequest describeMaintenanceWindowsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeMaintenanceWindowsResult>() {
            public DescribeMaintenanceWindowsResult call() throws Exception {
                return describeMaintenanceWindows(describeMaintenanceWindowsRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves the maintenance windows in an AWS account.
     * </p>
     * 
     * @param describeMaintenanceWindowsRequest
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindows service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeMaintenanceWindowsResult> describeMaintenanceWindowsAsync(
            final DescribeMaintenanceWindowsRequest describeMaintenanceWindowsRequest,
            final AsyncHandler<DescribeMaintenanceWindowsRequest, DescribeMaintenanceWindowsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeMaintenanceWindowsResult>() {
            public DescribeMaintenanceWindowsResult call() throws Exception {
                DescribeMaintenanceWindowsResult result = null;
                try {
                    result = describeMaintenanceWindows(describeMaintenanceWindowsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeMaintenanceWindowsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves information about the maintenance window targets or tasks that
     * an instance is associated with.
     * </p>
     * 
     * @param describeMaintenanceWindowsForTargetRequest
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowsForTarget service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeMaintenanceWindowsForTargetResult> describeMaintenanceWindowsForTargetAsync(
            final DescribeMaintenanceWindowsForTargetRequest describeMaintenanceWindowsForTargetRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeMaintenanceWindowsForTargetResult>() {
            public DescribeMaintenanceWindowsForTargetResult call() throws Exception {
                return describeMaintenanceWindowsForTarget(describeMaintenanceWindowsForTargetRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves information about the maintenance window targets or tasks that
     * an instance is associated with.
     * </p>
     * 
     * @param describeMaintenanceWindowsForTargetRequest
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceWindowsForTarget service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeMaintenanceWindowsForTargetResult> describeMaintenanceWindowsForTargetAsync(
            final DescribeMaintenanceWindowsForTargetRequest describeMaintenanceWindowsForTargetRequest,
            final AsyncHandler<DescribeMaintenanceWindowsForTargetRequest, DescribeMaintenanceWindowsForTargetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeMaintenanceWindowsForTargetResult>() {
            public DescribeMaintenanceWindowsForTargetResult call() throws Exception {
                DescribeMaintenanceWindowsForTargetResult result = null;
                try {
                    result = describeMaintenanceWindowsForTarget(describeMaintenanceWindowsForTargetRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeMaintenanceWindowsForTargetRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Query a set of OpsItems. You must have permission in AWS Identity and
     * Access Management (IAM) to query a list of OpsItems. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
     * >Getting started with OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view,
     * investigate, and remediate operational issues impacting the performance
     * and health of their AWS resources. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
     * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param describeOpsItemsRequest
     * @return A Java Future object containing the response from the
     *         DescribeOpsItems service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeOpsItemsResult> describeOpsItemsAsync(
            final DescribeOpsItemsRequest describeOpsItemsRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DescribeOpsItemsResult>() {
            public DescribeOpsItemsResult call() throws Exception {
                return describeOpsItems(describeOpsItemsRequest);
            }
        });
    }

    /**
     * <p>
     * Query a set of OpsItems. You must have permission in AWS Identity and
     * Access Management (IAM) to query a list of OpsItems. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
     * >Getting started with OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view,
     * investigate, and remediate operational issues impacting the performance
     * and health of their AWS resources. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
     * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param describeOpsItemsRequest
     * @return A Java Future object containing the response from the
     *         DescribeOpsItems service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeOpsItemsResult> describeOpsItemsAsync(
            final DescribeOpsItemsRequest describeOpsItemsRequest,
            final AsyncHandler<DescribeOpsItemsRequest, DescribeOpsItemsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeOpsItemsResult>() {
            public DescribeOpsItemsResult call() throws Exception {
                DescribeOpsItemsResult result = null;
                try {
                    result = describeOpsItems(describeOpsItemsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeOpsItemsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Get information about a parameter.
     * </p>
     * <note>
     * <p>
     * Request results are returned on a best-effort basis. If you specify
     * <code>MaxResults</code> in the request, the response includes information
     * up to the limit specified. The number of items returned, however, can be
     * between zero and the value of <code>MaxResults</code>. If the service
     * reaches an internal limit while processing the results, it stops the
     * operation and returns the matching values up to that point and a
     * <code>NextToken</code>. You can specify the <code>NextToken</code> in a
     * subsequent call to get the next set of results.
     * </p>
     * </note>
     * 
     * @param describeParametersRequest
     * @return A Java Future object containing the response from the
     *         DescribeParameters service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidFilterKeyException
     * @throws InvalidFilterOptionException
     * @throws InvalidFilterValueException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeParametersResult> describeParametersAsync(
            final DescribeParametersRequest describeParametersRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeParametersResult>() {
            public DescribeParametersResult call() throws Exception {
                return describeParameters(describeParametersRequest);
            }
        });
    }

    /**
     * <p>
     * Get information about a parameter.
     * </p>
     * <note>
     * <p>
     * Request results are returned on a best-effort basis. If you specify
     * <code>MaxResults</code> in the request, the response includes information
     * up to the limit specified. The number of items returned, however, can be
     * between zero and the value of <code>MaxResults</code>. If the service
     * reaches an internal limit while processing the results, it stops the
     * operation and returns the matching values up to that point and a
     * <code>NextToken</code>. You can specify the <code>NextToken</code> in a
     * subsequent call to get the next set of results.
     * </p>
     * </note>
     * 
     * @param describeParametersRequest
     * @return A Java Future object containing the response from the
     *         DescribeParameters service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidFilterKeyException
     * @throws InvalidFilterOptionException
     * @throws InvalidFilterValueException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeParametersResult> describeParametersAsync(
            final DescribeParametersRequest describeParametersRequest,
            final AsyncHandler<DescribeParametersRequest, DescribeParametersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeParametersResult>() {
            public DescribeParametersResult call() throws Exception {
                DescribeParametersResult result = null;
                try {
                    result = describeParameters(describeParametersRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeParametersRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists the patch baselines in your AWS account.
     * </p>
     * 
     * @param describePatchBaselinesRequest
     * @return A Java Future object containing the response from the
     *         DescribePatchBaselines service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribePatchBaselinesResult> describePatchBaselinesAsync(
            final DescribePatchBaselinesRequest describePatchBaselinesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribePatchBaselinesResult>() {
            public DescribePatchBaselinesResult call() throws Exception {
                return describePatchBaselines(describePatchBaselinesRequest);
            }
        });
    }

    /**
     * <p>
     * Lists the patch baselines in your AWS account.
     * </p>
     * 
     * @param describePatchBaselinesRequest
     * @return A Java Future object containing the response from the
     *         DescribePatchBaselines service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribePatchBaselinesResult> describePatchBaselinesAsync(
            final DescribePatchBaselinesRequest describePatchBaselinesRequest,
            final AsyncHandler<DescribePatchBaselinesRequest, DescribePatchBaselinesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribePatchBaselinesResult>() {
            public DescribePatchBaselinesResult call() throws Exception {
                DescribePatchBaselinesResult result = null;
                try {
                    result = describePatchBaselines(describePatchBaselinesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describePatchBaselinesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns high-level aggregated patch compliance state for a patch group.
     * </p>
     * 
     * @param describePatchGroupStateRequest
     * @return A Java Future object containing the response from the
     *         DescribePatchGroupState service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribePatchGroupStateResult> describePatchGroupStateAsync(
            final DescribePatchGroupStateRequest describePatchGroupStateRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribePatchGroupStateResult>() {
            public DescribePatchGroupStateResult call() throws Exception {
                return describePatchGroupState(describePatchGroupStateRequest);
            }
        });
    }

    /**
     * <p>
     * Returns high-level aggregated patch compliance state for a patch group.
     * </p>
     * 
     * @param describePatchGroupStateRequest
     * @return A Java Future object containing the response from the
     *         DescribePatchGroupState service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribePatchGroupStateResult> describePatchGroupStateAsync(
            final DescribePatchGroupStateRequest describePatchGroupStateRequest,
            final AsyncHandler<DescribePatchGroupStateRequest, DescribePatchGroupStateResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribePatchGroupStateResult>() {
            public DescribePatchGroupStateResult call() throws Exception {
                DescribePatchGroupStateResult result = null;
                try {
                    result = describePatchGroupState(describePatchGroupStateRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describePatchGroupStateRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists all patch groups that have been registered with patch baselines.
     * </p>
     * 
     * @param describePatchGroupsRequest
     * @return A Java Future object containing the response from the
     *         DescribePatchGroups service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribePatchGroupsResult> describePatchGroupsAsync(
            final DescribePatchGroupsRequest describePatchGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribePatchGroupsResult>() {
            public DescribePatchGroupsResult call() throws Exception {
                return describePatchGroups(describePatchGroupsRequest);
            }
        });
    }

    /**
     * <p>
     * Lists all patch groups that have been registered with patch baselines.
     * </p>
     * 
     * @param describePatchGroupsRequest
     * @return A Java Future object containing the response from the
     *         DescribePatchGroups service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribePatchGroupsResult> describePatchGroupsAsync(
            final DescribePatchGroupsRequest describePatchGroupsRequest,
            final AsyncHandler<DescribePatchGroupsRequest, DescribePatchGroupsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribePatchGroupsResult>() {
            public DescribePatchGroupsResult call() throws Exception {
                DescribePatchGroupsResult result = null;
                try {
                    result = describePatchGroups(describePatchGroupsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describePatchGroupsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists the properties of available patches organized by product, product
     * family, classification, severity, and other properties of available
     * patches. You can use the reported properties in the filters you specify
     * in requests for actions such as <a>CreatePatchBaseline</a>,
     * <a>UpdatePatchBaseline</a>, <a>DescribeAvailablePatches</a>, and
     * <a>DescribePatchBaselines</a>.
     * </p>
     * <p>
     * The following section lists the properties that can be used in filters
     * for each major operating system type:
     * </p>
     * <dl>
     * <dt>WINDOWS</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, MSRC_SEVERITY
     * </p>
     * </dd>
     * <dt>AMAZON_LINUX</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>AMAZON_LINUX_2</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>UBUNTU</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, PRIORITY
     * </p>
     * </dd>
     * <dt>REDHAT_ENTERPRISE_LINUX</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>SUSE</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>CENTOS</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * </dl>
     * 
     * @param describePatchPropertiesRequest
     * @return A Java Future object containing the response from the
     *         DescribePatchProperties service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribePatchPropertiesResult> describePatchPropertiesAsync(
            final DescribePatchPropertiesRequest describePatchPropertiesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribePatchPropertiesResult>() {
            public DescribePatchPropertiesResult call() throws Exception {
                return describePatchProperties(describePatchPropertiesRequest);
            }
        });
    }

    /**
     * <p>
     * Lists the properties of available patches organized by product, product
     * family, classification, severity, and other properties of available
     * patches. You can use the reported properties in the filters you specify
     * in requests for actions such as <a>CreatePatchBaseline</a>,
     * <a>UpdatePatchBaseline</a>, <a>DescribeAvailablePatches</a>, and
     * <a>DescribePatchBaselines</a>.
     * </p>
     * <p>
     * The following section lists the properties that can be used in filters
     * for each major operating system type:
     * </p>
     * <dl>
     * <dt>WINDOWS</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, MSRC_SEVERITY
     * </p>
     * </dd>
     * <dt>AMAZON_LINUX</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>AMAZON_LINUX_2</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>UBUNTU</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, PRIORITY
     * </p>
     * </dd>
     * <dt>REDHAT_ENTERPRISE_LINUX</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>SUSE</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * <dt>CENTOS</dt>
     * <dd>
     * <p>
     * Valid properties: PRODUCT, CLASSIFICATION, SEVERITY
     * </p>
     * </dd>
     * </dl>
     * 
     * @param describePatchPropertiesRequest
     * @return A Java Future object containing the response from the
     *         DescribePatchProperties service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribePatchPropertiesResult> describePatchPropertiesAsync(
            final DescribePatchPropertiesRequest describePatchPropertiesRequest,
            final AsyncHandler<DescribePatchPropertiesRequest, DescribePatchPropertiesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribePatchPropertiesResult>() {
            public DescribePatchPropertiesResult call() throws Exception {
                DescribePatchPropertiesResult result = null;
                try {
                    result = describePatchProperties(describePatchPropertiesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describePatchPropertiesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves a list of all active sessions (both connected and disconnected)
     * or terminated sessions from the past 30 days.
     * </p>
     * 
     * @param describeSessionsRequest
     * @return A Java Future object containing the response from the
     *         DescribeSessions service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidFilterKeyException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeSessionsResult> describeSessionsAsync(
            final DescribeSessionsRequest describeSessionsRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DescribeSessionsResult>() {
            public DescribeSessionsResult call() throws Exception {
                return describeSessions(describeSessionsRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves a list of all active sessions (both connected and disconnected)
     * or terminated sessions from the past 30 days.
     * </p>
     * 
     * @param describeSessionsRequest
     * @return A Java Future object containing the response from the
     *         DescribeSessions service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidFilterKeyException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<DescribeSessionsResult> describeSessionsAsync(
            final DescribeSessionsRequest describeSessionsRequest,
            final AsyncHandler<DescribeSessionsRequest, DescribeSessionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeSessionsResult>() {
            public DescribeSessionsResult call() throws Exception {
                DescribeSessionsResult result = null;
                try {
                    result = describeSessions(describeSessionsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeSessionsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Get detailed information about a particular Automation execution.
     * </p>
     * 
     * @param getAutomationExecutionRequest
     * @return A Java Future object containing the response from the
     *         GetAutomationExecution service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws AutomationExecutionNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetAutomationExecutionResult> getAutomationExecutionAsync(
            final GetAutomationExecutionRequest getAutomationExecutionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetAutomationExecutionResult>() {
            public GetAutomationExecutionResult call() throws Exception {
                return getAutomationExecution(getAutomationExecutionRequest);
            }
        });
    }

    /**
     * <p>
     * Get detailed information about a particular Automation execution.
     * </p>
     * 
     * @param getAutomationExecutionRequest
     * @return A Java Future object containing the response from the
     *         GetAutomationExecution service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws AutomationExecutionNotFoundException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetAutomationExecutionResult> getAutomationExecutionAsync(
            final GetAutomationExecutionRequest getAutomationExecutionRequest,
            final AsyncHandler<GetAutomationExecutionRequest, GetAutomationExecutionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetAutomationExecutionResult>() {
            public GetAutomationExecutionResult call() throws Exception {
                GetAutomationExecutionResult result = null;
                try {
                    result = getAutomationExecution(getAutomationExecutionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getAutomationExecutionRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets the state of the AWS Systems Manager Change Calendar at an optional,
     * specified time. If you specify a time, <code>GetCalendarState</code>
     * returns the state of the calendar at a specific time, and returns the
     * next time that the Change Calendar state will transition. If you do not
     * specify a time, <code>GetCalendarState</code> assumes the current time.
     * Change Calendar entries have two possible states: <code>OPEN</code> or
     * <code>CLOSED</code>. For more information about Systems Manager Change
     * Calendar, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-change-calendar.html"
     * >AWS Systems Manager Change Calendar</a> in the <i>AWS Systems Manager
     * User Guide</i>.
     * </p>
     * 
     * @param getCalendarStateRequest
     * @return A Java Future object containing the response from the
     *         GetCalendarState service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentTypeException
     * @throws UnsupportedCalendarException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetCalendarStateResult> getCalendarStateAsync(
            final GetCalendarStateRequest getCalendarStateRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<GetCalendarStateResult>() {
            public GetCalendarStateResult call() throws Exception {
                return getCalendarState(getCalendarStateRequest);
            }
        });
    }

    /**
     * <p>
     * Gets the state of the AWS Systems Manager Change Calendar at an optional,
     * specified time. If you specify a time, <code>GetCalendarState</code>
     * returns the state of the calendar at a specific time, and returns the
     * next time that the Change Calendar state will transition. If you do not
     * specify a time, <code>GetCalendarState</code> assumes the current time.
     * Change Calendar entries have two possible states: <code>OPEN</code> or
     * <code>CLOSED</code>. For more information about Systems Manager Change
     * Calendar, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-change-calendar.html"
     * >AWS Systems Manager Change Calendar</a> in the <i>AWS Systems Manager
     * User Guide</i>.
     * </p>
     * 
     * @param getCalendarStateRequest
     * @return A Java Future object containing the response from the
     *         GetCalendarState service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentTypeException
     * @throws UnsupportedCalendarException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetCalendarStateResult> getCalendarStateAsync(
            final GetCalendarStateRequest getCalendarStateRequest,
            final AsyncHandler<GetCalendarStateRequest, GetCalendarStateResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetCalendarStateResult>() {
            public GetCalendarStateResult call() throws Exception {
                GetCalendarStateResult result = null;
                try {
                    result = getCalendarState(getCalendarStateRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getCalendarStateRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns detailed information about command execution for an invocation or
     * plugin.
     * </p>
     * 
     * @param getCommandInvocationRequest
     * @return A Java Future object containing the response from the
     *         GetCommandInvocation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     * @throws InvalidPluginNameException
     * @throws InvocationDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetCommandInvocationResult> getCommandInvocationAsync(
            final GetCommandInvocationRequest getCommandInvocationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetCommandInvocationResult>() {
            public GetCommandInvocationResult call() throws Exception {
                return getCommandInvocation(getCommandInvocationRequest);
            }
        });
    }

    /**
     * <p>
     * Returns detailed information about command execution for an invocation or
     * plugin.
     * </p>
     * 
     * @param getCommandInvocationRequest
     * @return A Java Future object containing the response from the
     *         GetCommandInvocation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     * @throws InvalidPluginNameException
     * @throws InvocationDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetCommandInvocationResult> getCommandInvocationAsync(
            final GetCommandInvocationRequest getCommandInvocationRequest,
            final AsyncHandler<GetCommandInvocationRequest, GetCommandInvocationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetCommandInvocationResult>() {
            public GetCommandInvocationResult call() throws Exception {
                GetCommandInvocationResult result = null;
                try {
                    result = getCommandInvocation(getCommandInvocationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getCommandInvocationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves the Session Manager connection status for an instance to
     * determine whether it is running and ready to receive Session Manager
     * connections.
     * </p>
     * 
     * @param getConnectionStatusRequest
     * @return A Java Future object containing the response from the
     *         GetConnectionStatus service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetConnectionStatusResult> getConnectionStatusAsync(
            final GetConnectionStatusRequest getConnectionStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetConnectionStatusResult>() {
            public GetConnectionStatusResult call() throws Exception {
                return getConnectionStatus(getConnectionStatusRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves the Session Manager connection status for an instance to
     * determine whether it is running and ready to receive Session Manager
     * connections.
     * </p>
     * 
     * @param getConnectionStatusRequest
     * @return A Java Future object containing the response from the
     *         GetConnectionStatus service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetConnectionStatusResult> getConnectionStatusAsync(
            final GetConnectionStatusRequest getConnectionStatusRequest,
            final AsyncHandler<GetConnectionStatusRequest, GetConnectionStatusResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetConnectionStatusResult>() {
            public GetConnectionStatusResult call() throws Exception {
                GetConnectionStatusResult result = null;
                try {
                    result = getConnectionStatus(getConnectionStatusRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getConnectionStatusRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves the default patch baseline. Note that Systems Manager supports
     * creating multiple default patch baselines. For example, you can create a
     * default patch baseline for each operating system.
     * </p>
     * <p>
     * If you do not specify an operating system value, the default patch
     * baseline for Windows is returned.
     * </p>
     * 
     * @param getDefaultPatchBaselineRequest
     * @return A Java Future object containing the response from the
     *         GetDefaultPatchBaseline service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetDefaultPatchBaselineResult> getDefaultPatchBaselineAsync(
            final GetDefaultPatchBaselineRequest getDefaultPatchBaselineRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDefaultPatchBaselineResult>() {
            public GetDefaultPatchBaselineResult call() throws Exception {
                return getDefaultPatchBaseline(getDefaultPatchBaselineRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves the default patch baseline. Note that Systems Manager supports
     * creating multiple default patch baselines. For example, you can create a
     * default patch baseline for each operating system.
     * </p>
     * <p>
     * If you do not specify an operating system value, the default patch
     * baseline for Windows is returned.
     * </p>
     * 
     * @param getDefaultPatchBaselineRequest
     * @return A Java Future object containing the response from the
     *         GetDefaultPatchBaseline service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetDefaultPatchBaselineResult> getDefaultPatchBaselineAsync(
            final GetDefaultPatchBaselineRequest getDefaultPatchBaselineRequest,
            final AsyncHandler<GetDefaultPatchBaselineRequest, GetDefaultPatchBaselineResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDefaultPatchBaselineResult>() {
            public GetDefaultPatchBaselineResult call() throws Exception {
                GetDefaultPatchBaselineResult result = null;
                try {
                    result = getDefaultPatchBaseline(getDefaultPatchBaselineRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getDefaultPatchBaselineRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves the current snapshot for the patch baseline the instance uses.
     * This API is primarily used by the AWS-RunPatchBaseline Systems Manager
     * document.
     * </p>
     * 
     * @param getDeployablePatchSnapshotForInstanceRequest
     * @return A Java Future object containing the response from the
     *         GetDeployablePatchSnapshotForInstance service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws UnsupportedOperatingSystemException
     * @throws UnsupportedFeatureRequiredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetDeployablePatchSnapshotForInstanceResult> getDeployablePatchSnapshotForInstanceAsync(
            final GetDeployablePatchSnapshotForInstanceRequest getDeployablePatchSnapshotForInstanceRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDeployablePatchSnapshotForInstanceResult>() {
            public GetDeployablePatchSnapshotForInstanceResult call() throws Exception {
                return getDeployablePatchSnapshotForInstance(getDeployablePatchSnapshotForInstanceRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves the current snapshot for the patch baseline the instance uses.
     * This API is primarily used by the AWS-RunPatchBaseline Systems Manager
     * document.
     * </p>
     * 
     * @param getDeployablePatchSnapshotForInstanceRequest
     * @return A Java Future object containing the response from the
     *         GetDeployablePatchSnapshotForInstance service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws UnsupportedOperatingSystemException
     * @throws UnsupportedFeatureRequiredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetDeployablePatchSnapshotForInstanceResult> getDeployablePatchSnapshotForInstanceAsync(
            final GetDeployablePatchSnapshotForInstanceRequest getDeployablePatchSnapshotForInstanceRequest,
            final AsyncHandler<GetDeployablePatchSnapshotForInstanceRequest, GetDeployablePatchSnapshotForInstanceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDeployablePatchSnapshotForInstanceResult>() {
            public GetDeployablePatchSnapshotForInstanceResult call() throws Exception {
                GetDeployablePatchSnapshotForInstanceResult result = null;
                try {
                    result = getDeployablePatchSnapshotForInstance(getDeployablePatchSnapshotForInstanceRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getDeployablePatchSnapshotForInstanceRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Gets the contents of the specified Systems Manager document.
     * </p>
     * 
     * @param getDocumentRequest
     * @return A Java Future object containing the response from the GetDocument
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetDocumentResult> getDocumentAsync(final GetDocumentRequest getDocumentRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDocumentResult>() {
            public GetDocumentResult call() throws Exception {
                return getDocument(getDocumentRequest);
            }
        });
    }

    /**
     * <p>
     * Gets the contents of the specified Systems Manager document.
     * </p>
     * 
     * @param getDocumentRequest
     * @return A Java Future object containing the response from the GetDocument
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetDocumentResult> getDocumentAsync(final GetDocumentRequest getDocumentRequest,
            final AsyncHandler<GetDocumentRequest, GetDocumentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDocumentResult>() {
            public GetDocumentResult call() throws Exception {
                GetDocumentResult result = null;
                try {
                    result = getDocument(getDocumentRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getDocumentRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Query inventory information.
     * </p>
     * 
     * @param getInventoryRequest
     * @return A Java Future object containing the response from the
     *         GetInventory service method, as returned by Amazon Simple Systems
     *         Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidFilterException
     * @throws InvalidInventoryGroupException
     * @throws InvalidNextTokenException
     * @throws InvalidTypeNameException
     * @throws InvalidAggregatorException
     * @throws InvalidResultAttributeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetInventoryResult> getInventoryAsync(
            final GetInventoryRequest getInventoryRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<GetInventoryResult>() {
            public GetInventoryResult call() throws Exception {
                return getInventory(getInventoryRequest);
            }
        });
    }

    /**
     * <p>
     * Query inventory information.
     * </p>
     * 
     * @param getInventoryRequest
     * @return A Java Future object containing the response from the
     *         GetInventory service method, as returned by Amazon Simple Systems
     *         Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidFilterException
     * @throws InvalidInventoryGroupException
     * @throws InvalidNextTokenException
     * @throws InvalidTypeNameException
     * @throws InvalidAggregatorException
     * @throws InvalidResultAttributeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetInventoryResult> getInventoryAsync(
            final GetInventoryRequest getInventoryRequest,
            final AsyncHandler<GetInventoryRequest, GetInventoryResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetInventoryResult>() {
            public GetInventoryResult call() throws Exception {
                GetInventoryResult result = null;
                try {
                    result = getInventory(getInventoryRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getInventoryRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Return a list of inventory type names for the account, or return a list
     * of attribute names for a specific Inventory item type.
     * </p>
     * 
     * @param getInventorySchemaRequest
     * @return A Java Future object containing the response from the
     *         GetInventorySchema service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidTypeNameException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetInventorySchemaResult> getInventorySchemaAsync(
            final GetInventorySchemaRequest getInventorySchemaRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetInventorySchemaResult>() {
            public GetInventorySchemaResult call() throws Exception {
                return getInventorySchema(getInventorySchemaRequest);
            }
        });
    }

    /**
     * <p>
     * Return a list of inventory type names for the account, or return a list
     * of attribute names for a specific Inventory item type.
     * </p>
     * 
     * @param getInventorySchemaRequest
     * @return A Java Future object containing the response from the
     *         GetInventorySchema service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidTypeNameException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetInventorySchemaResult> getInventorySchemaAsync(
            final GetInventorySchemaRequest getInventorySchemaRequest,
            final AsyncHandler<GetInventorySchemaRequest, GetInventorySchemaResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetInventorySchemaResult>() {
            public GetInventorySchemaResult call() throws Exception {
                GetInventorySchemaResult result = null;
                try {
                    result = getInventorySchema(getInventorySchemaRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getInventorySchemaRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves a maintenance window.
     * </p>
     * 
     * @param getMaintenanceWindowRequest
     * @return A Java Future object containing the response from the
     *         GetMaintenanceWindow service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetMaintenanceWindowResult> getMaintenanceWindowAsync(
            final GetMaintenanceWindowRequest getMaintenanceWindowRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetMaintenanceWindowResult>() {
            public GetMaintenanceWindowResult call() throws Exception {
                return getMaintenanceWindow(getMaintenanceWindowRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves a maintenance window.
     * </p>
     * 
     * @param getMaintenanceWindowRequest
     * @return A Java Future object containing the response from the
     *         GetMaintenanceWindow service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetMaintenanceWindowResult> getMaintenanceWindowAsync(
            final GetMaintenanceWindowRequest getMaintenanceWindowRequest,
            final AsyncHandler<GetMaintenanceWindowRequest, GetMaintenanceWindowResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetMaintenanceWindowResult>() {
            public GetMaintenanceWindowResult call() throws Exception {
                GetMaintenanceWindowResult result = null;
                try {
                    result = getMaintenanceWindow(getMaintenanceWindowRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getMaintenanceWindowRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves details about a specific a maintenance window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionRequest
     * @return A Java Future object containing the response from the
     *         GetMaintenanceWindowExecution service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetMaintenanceWindowExecutionResult> getMaintenanceWindowExecutionAsync(
            final GetMaintenanceWindowExecutionRequest getMaintenanceWindowExecutionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetMaintenanceWindowExecutionResult>() {
            public GetMaintenanceWindowExecutionResult call() throws Exception {
                return getMaintenanceWindowExecution(getMaintenanceWindowExecutionRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves details about a specific a maintenance window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionRequest
     * @return A Java Future object containing the response from the
     *         GetMaintenanceWindowExecution service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetMaintenanceWindowExecutionResult> getMaintenanceWindowExecutionAsync(
            final GetMaintenanceWindowExecutionRequest getMaintenanceWindowExecutionRequest,
            final AsyncHandler<GetMaintenanceWindowExecutionRequest, GetMaintenanceWindowExecutionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetMaintenanceWindowExecutionResult>() {
            public GetMaintenanceWindowExecutionResult call() throws Exception {
                GetMaintenanceWindowExecutionResult result = null;
                try {
                    result = getMaintenanceWindowExecution(getMaintenanceWindowExecutionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getMaintenanceWindowExecutionRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves the details about a specific task run as part of a maintenance
     * window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionTaskRequest
     * @return A Java Future object containing the response from the
     *         GetMaintenanceWindowExecutionTask service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetMaintenanceWindowExecutionTaskResult> getMaintenanceWindowExecutionTaskAsync(
            final GetMaintenanceWindowExecutionTaskRequest getMaintenanceWindowExecutionTaskRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetMaintenanceWindowExecutionTaskResult>() {
            public GetMaintenanceWindowExecutionTaskResult call() throws Exception {
                return getMaintenanceWindowExecutionTask(getMaintenanceWindowExecutionTaskRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves the details about a specific task run as part of a maintenance
     * window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionTaskRequest
     * @return A Java Future object containing the response from the
     *         GetMaintenanceWindowExecutionTask service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetMaintenanceWindowExecutionTaskResult> getMaintenanceWindowExecutionTaskAsync(
            final GetMaintenanceWindowExecutionTaskRequest getMaintenanceWindowExecutionTaskRequest,
            final AsyncHandler<GetMaintenanceWindowExecutionTaskRequest, GetMaintenanceWindowExecutionTaskResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetMaintenanceWindowExecutionTaskResult>() {
            public GetMaintenanceWindowExecutionTaskResult call() throws Exception {
                GetMaintenanceWindowExecutionTaskResult result = null;
                try {
                    result = getMaintenanceWindowExecutionTask(getMaintenanceWindowExecutionTaskRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getMaintenanceWindowExecutionTaskRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves information about a specific task running on a specific target.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionTaskInvocationRequest
     * @return A Java Future object containing the response from the
     *         GetMaintenanceWindowExecutionTaskInvocation service method, as
     *         returned by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetMaintenanceWindowExecutionTaskInvocationResult> getMaintenanceWindowExecutionTaskInvocationAsync(
            final GetMaintenanceWindowExecutionTaskInvocationRequest getMaintenanceWindowExecutionTaskInvocationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService
                .submit(new Callable<GetMaintenanceWindowExecutionTaskInvocationResult>() {
                    public GetMaintenanceWindowExecutionTaskInvocationResult call()
                            throws Exception {
                        return getMaintenanceWindowExecutionTaskInvocation(getMaintenanceWindowExecutionTaskInvocationRequest);
                    }
                });
    }

    /**
     * <p>
     * Retrieves information about a specific task running on a specific target.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionTaskInvocationRequest
     * @return A Java Future object containing the response from the
     *         GetMaintenanceWindowExecutionTaskInvocation service method, as
     *         returned by Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetMaintenanceWindowExecutionTaskInvocationResult> getMaintenanceWindowExecutionTaskInvocationAsync(
            final GetMaintenanceWindowExecutionTaskInvocationRequest getMaintenanceWindowExecutionTaskInvocationRequest,
            final AsyncHandler<GetMaintenanceWindowExecutionTaskInvocationRequest, GetMaintenanceWindowExecutionTaskInvocationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService
                .submit(new Callable<GetMaintenanceWindowExecutionTaskInvocationResult>() {
                    public GetMaintenanceWindowExecutionTaskInvocationResult call()
                            throws Exception {
                        GetMaintenanceWindowExecutionTaskInvocationResult result = null;
                        try {
                            result = getMaintenanceWindowExecutionTaskInvocation(getMaintenanceWindowExecutionTaskInvocationRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(getMaintenanceWindowExecutionTaskInvocationRequest,
                                result);
                        return result;
                    }
                });
    }

    /**
     * <p>
     * Lists the tasks in a maintenance window.
     * </p>
     * 
     * @param getMaintenanceWindowTaskRequest
     * @return A Java Future object containing the response from the
     *         GetMaintenanceWindowTask service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetMaintenanceWindowTaskResult> getMaintenanceWindowTaskAsync(
            final GetMaintenanceWindowTaskRequest getMaintenanceWindowTaskRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetMaintenanceWindowTaskResult>() {
            public GetMaintenanceWindowTaskResult call() throws Exception {
                return getMaintenanceWindowTask(getMaintenanceWindowTaskRequest);
            }
        });
    }

    /**
     * <p>
     * Lists the tasks in a maintenance window.
     * </p>
     * 
     * @param getMaintenanceWindowTaskRequest
     * @return A Java Future object containing the response from the
     *         GetMaintenanceWindowTask service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetMaintenanceWindowTaskResult> getMaintenanceWindowTaskAsync(
            final GetMaintenanceWindowTaskRequest getMaintenanceWindowTaskRequest,
            final AsyncHandler<GetMaintenanceWindowTaskRequest, GetMaintenanceWindowTaskResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetMaintenanceWindowTaskResult>() {
            public GetMaintenanceWindowTaskResult call() throws Exception {
                GetMaintenanceWindowTaskResult result = null;
                try {
                    result = getMaintenanceWindowTask(getMaintenanceWindowTaskRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getMaintenanceWindowTaskRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Get information about an OpsItem by using the ID. You must have
     * permission in AWS Identity and Access Management (IAM) to view
     * information about an OpsItem. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
     * >Getting started with OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view,
     * investigate, and remediate operational issues impacting the performance
     * and health of their AWS resources. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
     * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param getOpsItemRequest
     * @return A Java Future object containing the response from the GetOpsItem
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InternalServerErrorException
     * @throws OpsItemNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetOpsItemResult> getOpsItemAsync(final GetOpsItemRequest getOpsItemRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetOpsItemResult>() {
            public GetOpsItemResult call() throws Exception {
                return getOpsItem(getOpsItemRequest);
            }
        });
    }

    /**
     * <p>
     * Get information about an OpsItem by using the ID. You must have
     * permission in AWS Identity and Access Management (IAM) to view
     * information about an OpsItem. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
     * >Getting started with OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view,
     * investigate, and remediate operational issues impacting the performance
     * and health of their AWS resources. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
     * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param getOpsItemRequest
     * @return A Java Future object containing the response from the GetOpsItem
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws InternalServerErrorException
     * @throws OpsItemNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetOpsItemResult> getOpsItemAsync(final GetOpsItemRequest getOpsItemRequest,
            final AsyncHandler<GetOpsItemRequest, GetOpsItemResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetOpsItemResult>() {
            public GetOpsItemResult call() throws Exception {
                GetOpsItemResult result = null;
                try {
                    result = getOpsItem(getOpsItemRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getOpsItemRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * View a summary of OpsItems based on specified filters and aggregators.
     * </p>
     * 
     * @param getOpsSummaryRequest
     * @return A Java Future object containing the response from the
     *         GetOpsSummary service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ResourceDataSyncNotFoundException
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws InvalidTypeNameException
     * @throws InvalidAggregatorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetOpsSummaryResult> getOpsSummaryAsync(
            final GetOpsSummaryRequest getOpsSummaryRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<GetOpsSummaryResult>() {
            public GetOpsSummaryResult call() throws Exception {
                return getOpsSummary(getOpsSummaryRequest);
            }
        });
    }

    /**
     * <p>
     * View a summary of OpsItems based on specified filters and aggregators.
     * </p>
     * 
     * @param getOpsSummaryRequest
     * @return A Java Future object containing the response from the
     *         GetOpsSummary service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ResourceDataSyncNotFoundException
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws InvalidTypeNameException
     * @throws InvalidAggregatorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetOpsSummaryResult> getOpsSummaryAsync(
            final GetOpsSummaryRequest getOpsSummaryRequest,
            final AsyncHandler<GetOpsSummaryRequest, GetOpsSummaryResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetOpsSummaryResult>() {
            public GetOpsSummaryResult call() throws Exception {
                GetOpsSummaryResult result = null;
                try {
                    result = getOpsSummary(getOpsSummaryRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getOpsSummaryRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Get information about a parameter by using the parameter name. Don't
     * confuse this API action with the <a>GetParameters</a> API action.
     * </p>
     * 
     * @param getParameterRequest
     * @return A Java Future object containing the response from the
     *         GetParameter service method, as returned by Amazon Simple Systems
     *         Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidKeyIdException
     * @throws ParameterNotFoundException
     * @throws ParameterVersionNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetParameterResult> getParameterAsync(
            final GetParameterRequest getParameterRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<GetParameterResult>() {
            public GetParameterResult call() throws Exception {
                return getParameter(getParameterRequest);
            }
        });
    }

    /**
     * <p>
     * Get information about a parameter by using the parameter name. Don't
     * confuse this API action with the <a>GetParameters</a> API action.
     * </p>
     * 
     * @param getParameterRequest
     * @return A Java Future object containing the response from the
     *         GetParameter service method, as returned by Amazon Simple Systems
     *         Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidKeyIdException
     * @throws ParameterNotFoundException
     * @throws ParameterVersionNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetParameterResult> getParameterAsync(
            final GetParameterRequest getParameterRequest,
            final AsyncHandler<GetParameterRequest, GetParameterResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetParameterResult>() {
            public GetParameterResult call() throws Exception {
                GetParameterResult result = null;
                try {
                    result = getParameter(getParameterRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getParameterRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Query a list of all parameters used by the AWS account.
     * </p>
     * 
     * @param getParameterHistoryRequest
     * @return A Java Future object containing the response from the
     *         GetParameterHistory service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ParameterNotFoundException
     * @throws InvalidNextTokenException
     * @throws InvalidKeyIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetParameterHistoryResult> getParameterHistoryAsync(
            final GetParameterHistoryRequest getParameterHistoryRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetParameterHistoryResult>() {
            public GetParameterHistoryResult call() throws Exception {
                return getParameterHistory(getParameterHistoryRequest);
            }
        });
    }

    /**
     * <p>
     * Query a list of all parameters used by the AWS account.
     * </p>
     * 
     * @param getParameterHistoryRequest
     * @return A Java Future object containing the response from the
     *         GetParameterHistory service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ParameterNotFoundException
     * @throws InvalidNextTokenException
     * @throws InvalidKeyIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetParameterHistoryResult> getParameterHistoryAsync(
            final GetParameterHistoryRequest getParameterHistoryRequest,
            final AsyncHandler<GetParameterHistoryRequest, GetParameterHistoryResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetParameterHistoryResult>() {
            public GetParameterHistoryResult call() throws Exception {
                GetParameterHistoryResult result = null;
                try {
                    result = getParameterHistory(getParameterHistoryRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getParameterHistoryRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Get details of a parameter. Don't confuse this API action with the
     * <a>GetParameter</a> API action.
     * </p>
     * 
     * @param getParametersRequest
     * @return A Java Future object containing the response from the
     *         GetParameters service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidKeyIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetParametersResult> getParametersAsync(
            final GetParametersRequest getParametersRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<GetParametersResult>() {
            public GetParametersResult call() throws Exception {
                return getParameters(getParametersRequest);
            }
        });
    }

    /**
     * <p>
     * Get details of a parameter. Don't confuse this API action with the
     * <a>GetParameter</a> API action.
     * </p>
     * 
     * @param getParametersRequest
     * @return A Java Future object containing the response from the
     *         GetParameters service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidKeyIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetParametersResult> getParametersAsync(
            final GetParametersRequest getParametersRequest,
            final AsyncHandler<GetParametersRequest, GetParametersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetParametersResult>() {
            public GetParametersResult call() throws Exception {
                GetParametersResult result = null;
                try {
                    result = getParameters(getParametersRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getParametersRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieve information about one or more parameters in a specific
     * hierarchy.
     * </p>
     * <note>
     * <p>
     * Request results are returned on a best-effort basis. If you specify
     * <code>MaxResults</code> in the request, the response includes information
     * up to the limit specified. The number of items returned, however, can be
     * between zero and the value of <code>MaxResults</code>. If the service
     * reaches an internal limit while processing the results, it stops the
     * operation and returns the matching values up to that point and a
     * <code>NextToken</code>. You can specify the <code>NextToken</code> in a
     * subsequent call to get the next set of results.
     * </p>
     * </note>
     * 
     * @param getParametersByPathRequest
     * @return A Java Future object containing the response from the
     *         GetParametersByPath service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidFilterKeyException
     * @throws InvalidFilterOptionException
     * @throws InvalidFilterValueException
     * @throws InvalidKeyIdException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetParametersByPathResult> getParametersByPathAsync(
            final GetParametersByPathRequest getParametersByPathRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetParametersByPathResult>() {
            public GetParametersByPathResult call() throws Exception {
                return getParametersByPath(getParametersByPathRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieve information about one or more parameters in a specific
     * hierarchy.
     * </p>
     * <note>
     * <p>
     * Request results are returned on a best-effort basis. If you specify
     * <code>MaxResults</code> in the request, the response includes information
     * up to the limit specified. The number of items returned, however, can be
     * between zero and the value of <code>MaxResults</code>. If the service
     * reaches an internal limit while processing the results, it stops the
     * operation and returns the matching values up to that point and a
     * <code>NextToken</code>. You can specify the <code>NextToken</code> in a
     * subsequent call to get the next set of results.
     * </p>
     * </note>
     * 
     * @param getParametersByPathRequest
     * @return A Java Future object containing the response from the
     *         GetParametersByPath service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidFilterKeyException
     * @throws InvalidFilterOptionException
     * @throws InvalidFilterValueException
     * @throws InvalidKeyIdException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetParametersByPathResult> getParametersByPathAsync(
            final GetParametersByPathRequest getParametersByPathRequest,
            final AsyncHandler<GetParametersByPathRequest, GetParametersByPathResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetParametersByPathResult>() {
            public GetParametersByPathResult call() throws Exception {
                GetParametersByPathResult result = null;
                try {
                    result = getParametersByPath(getParametersByPathRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getParametersByPathRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves information about a patch baseline.
     * </p>
     * 
     * @param getPatchBaselineRequest
     * @return A Java Future object containing the response from the
     *         GetPatchBaseline service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetPatchBaselineResult> getPatchBaselineAsync(
            final GetPatchBaselineRequest getPatchBaselineRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<GetPatchBaselineResult>() {
            public GetPatchBaselineResult call() throws Exception {
                return getPatchBaseline(getPatchBaselineRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves information about a patch baseline.
     * </p>
     * 
     * @param getPatchBaselineRequest
     * @return A Java Future object containing the response from the
     *         GetPatchBaseline service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetPatchBaselineResult> getPatchBaselineAsync(
            final GetPatchBaselineRequest getPatchBaselineRequest,
            final AsyncHandler<GetPatchBaselineRequest, GetPatchBaselineResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetPatchBaselineResult>() {
            public GetPatchBaselineResult call() throws Exception {
                GetPatchBaselineResult result = null;
                try {
                    result = getPatchBaseline(getPatchBaselineRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getPatchBaselineRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves the patch baseline that should be used for the specified patch
     * group.
     * </p>
     * 
     * @param getPatchBaselineForPatchGroupRequest
     * @return A Java Future object containing the response from the
     *         GetPatchBaselineForPatchGroup service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetPatchBaselineForPatchGroupResult> getPatchBaselineForPatchGroupAsync(
            final GetPatchBaselineForPatchGroupRequest getPatchBaselineForPatchGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetPatchBaselineForPatchGroupResult>() {
            public GetPatchBaselineForPatchGroupResult call() throws Exception {
                return getPatchBaselineForPatchGroup(getPatchBaselineForPatchGroupRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves the patch baseline that should be used for the specified patch
     * group.
     * </p>
     * 
     * @param getPatchBaselineForPatchGroupRequest
     * @return A Java Future object containing the response from the
     *         GetPatchBaselineForPatchGroup service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetPatchBaselineForPatchGroupResult> getPatchBaselineForPatchGroupAsync(
            final GetPatchBaselineForPatchGroupRequest getPatchBaselineForPatchGroupRequest,
            final AsyncHandler<GetPatchBaselineForPatchGroupRequest, GetPatchBaselineForPatchGroupResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetPatchBaselineForPatchGroupResult>() {
            public GetPatchBaselineForPatchGroupResult call() throws Exception {
                GetPatchBaselineForPatchGroupResult result = null;
                try {
                    result = getPatchBaselineForPatchGroup(getPatchBaselineForPatchGroupRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getPatchBaselineForPatchGroupRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * <code>ServiceSetting</code> is an account-level setting for an AWS
     * service. This setting defines how a user interacts with or uses a service
     * or a feature of a service. For example, if an AWS service charges money
     * to the account based on feature or service usage, then the AWS service
     * team might create a default setting of "false". This means the user can't
     * use this feature unless they change the setting to "true" and
     * intentionally opt in for a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS
     * services teams define the default value for a <code>SettingId</code>. You
     * can't create a new <code>SettingId</code>, but you can overwrite the
     * default value if you have the <code>ssm:UpdateServiceSetting</code>
     * permission for the setting. Use the <a>UpdateServiceSetting</a> API
     * action to change the default setting. Or use the
     * <a>ResetServiceSetting</a> to change the value back to the original value
     * defined by the AWS service team.
     * </p>
     * <p>
     * Query the current service setting for the account.
     * </p>
     * 
     * @param getServiceSettingRequest <p>
     *            The request body of the GetServiceSetting API action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetServiceSetting service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ServiceSettingNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetServiceSettingResult> getServiceSettingAsync(
            final GetServiceSettingRequest getServiceSettingRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<GetServiceSettingResult>() {
            public GetServiceSettingResult call() throws Exception {
                return getServiceSetting(getServiceSettingRequest);
            }
        });
    }

    /**
     * <p>
     * <code>ServiceSetting</code> is an account-level setting for an AWS
     * service. This setting defines how a user interacts with or uses a service
     * or a feature of a service. For example, if an AWS service charges money
     * to the account based on feature or service usage, then the AWS service
     * team might create a default setting of "false". This means the user can't
     * use this feature unless they change the setting to "true" and
     * intentionally opt in for a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS
     * services teams define the default value for a <code>SettingId</code>. You
     * can't create a new <code>SettingId</code>, but you can overwrite the
     * default value if you have the <code>ssm:UpdateServiceSetting</code>
     * permission for the setting. Use the <a>UpdateServiceSetting</a> API
     * action to change the default setting. Or use the
     * <a>ResetServiceSetting</a> to change the value back to the original value
     * defined by the AWS service team.
     * </p>
     * <p>
     * Query the current service setting for the account.
     * </p>
     * 
     * @param getServiceSettingRequest <p>
     *            The request body of the GetServiceSetting API action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetServiceSetting service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ServiceSettingNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<GetServiceSettingResult> getServiceSettingAsync(
            final GetServiceSettingRequest getServiceSettingRequest,
            final AsyncHandler<GetServiceSettingRequest, GetServiceSettingResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetServiceSettingResult>() {
            public GetServiceSettingResult call() throws Exception {
                GetServiceSettingResult result = null;
                try {
                    result = getServiceSetting(getServiceSettingRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getServiceSettingRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * A parameter label is a user-defined alias to help you manage different
     * versions of a parameter. When you modify a parameter, Systems Manager
     * automatically saves a new version and increments the version number by
     * one. A label can help you remember the purpose of a parameter when there
     * are multiple versions.
     * </p>
     * <p>
     * Parameter labels have the following requirements and restrictions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A version of a parameter can have a maximum of 10 labels.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't attach the same label to different versions of the same
     * parameter. For example, if version 1 has the label Production, then you
     * can't attach Production to version 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can move a label from one version of a parameter to another.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't create a label when you create a new parameter. You must attach
     * a label to a specific version of a parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't delete a parameter label. If you no longer want to use a
     * parameter label, then you must move it to a different version of a
     * parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A label can have a maximum of 100 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Labels can contain letters (case sensitive), numbers, periods (.),
     * hyphens (-), or underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Labels can't begin with a number, "aws," or "ssm" (not case sensitive).
     * If a label fails to meet these requirements, then the label is not
     * associated with a parameter and the system displays it in the list of
     * InvalidLabels.
     * </p>
     * </li>
     * </ul>
     * 
     * @param labelParameterVersionRequest
     * @return A Java Future object containing the response from the
     *         LabelParameterVersion service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws TooManyUpdatesException
     * @throws ParameterNotFoundException
     * @throws ParameterVersionNotFoundException
     * @throws ParameterVersionLabelLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<LabelParameterVersionResult> labelParameterVersionAsync(
            final LabelParameterVersionRequest labelParameterVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<LabelParameterVersionResult>() {
            public LabelParameterVersionResult call() throws Exception {
                return labelParameterVersion(labelParameterVersionRequest);
            }
        });
    }

    /**
     * <p>
     * A parameter label is a user-defined alias to help you manage different
     * versions of a parameter. When you modify a parameter, Systems Manager
     * automatically saves a new version and increments the version number by
     * one. A label can help you remember the purpose of a parameter when there
     * are multiple versions.
     * </p>
     * <p>
     * Parameter labels have the following requirements and restrictions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A version of a parameter can have a maximum of 10 labels.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't attach the same label to different versions of the same
     * parameter. For example, if version 1 has the label Production, then you
     * can't attach Production to version 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can move a label from one version of a parameter to another.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't create a label when you create a new parameter. You must attach
     * a label to a specific version of a parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't delete a parameter label. If you no longer want to use a
     * parameter label, then you must move it to a different version of a
     * parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A label can have a maximum of 100 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Labels can contain letters (case sensitive), numbers, periods (.),
     * hyphens (-), or underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Labels can't begin with a number, "aws," or "ssm" (not case sensitive).
     * If a label fails to meet these requirements, then the label is not
     * associated with a parameter and the system displays it in the list of
     * InvalidLabels.
     * </p>
     * </li>
     * </ul>
     * 
     * @param labelParameterVersionRequest
     * @return A Java Future object containing the response from the
     *         LabelParameterVersion service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws TooManyUpdatesException
     * @throws ParameterNotFoundException
     * @throws ParameterVersionNotFoundException
     * @throws ParameterVersionLabelLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<LabelParameterVersionResult> labelParameterVersionAsync(
            final LabelParameterVersionRequest labelParameterVersionRequest,
            final AsyncHandler<LabelParameterVersionRequest, LabelParameterVersionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<LabelParameterVersionResult>() {
            public LabelParameterVersionResult call() throws Exception {
                LabelParameterVersionResult result = null;
                try {
                    result = labelParameterVersion(labelParameterVersionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(labelParameterVersionRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Retrieves all versions of an association for a specific association ID.
     * </p>
     * 
     * @param listAssociationVersionsRequest
     * @return A Java Future object containing the response from the
     *         ListAssociationVersions service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws AssociationDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListAssociationVersionsResult> listAssociationVersionsAsync(
            final ListAssociationVersionsRequest listAssociationVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListAssociationVersionsResult>() {
            public ListAssociationVersionsResult call() throws Exception {
                return listAssociationVersions(listAssociationVersionsRequest);
            }
        });
    }

    /**
     * <p>
     * Retrieves all versions of an association for a specific association ID.
     * </p>
     * 
     * @param listAssociationVersionsRequest
     * @return A Java Future object containing the response from the
     *         ListAssociationVersions service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws AssociationDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListAssociationVersionsResult> listAssociationVersionsAsync(
            final ListAssociationVersionsRequest listAssociationVersionsRequest,
            final AsyncHandler<ListAssociationVersionsRequest, ListAssociationVersionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListAssociationVersionsResult>() {
            public ListAssociationVersionsResult call() throws Exception {
                ListAssociationVersionsResult result = null;
                try {
                    result = listAssociationVersions(listAssociationVersionsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listAssociationVersionsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns all State Manager associations in the current AWS account and
     * Region. You can limit the results to a specific State Manager association
     * document or instance by specifying a filter.
     * </p>
     * 
     * @param listAssociationsRequest
     * @return A Java Future object containing the response from the
     *         ListAssociations service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListAssociationsResult> listAssociationsAsync(
            final ListAssociationsRequest listAssociationsRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<ListAssociationsResult>() {
            public ListAssociationsResult call() throws Exception {
                return listAssociations(listAssociationsRequest);
            }
        });
    }

    /**
     * <p>
     * Returns all State Manager associations in the current AWS account and
     * Region. You can limit the results to a specific State Manager association
     * document or instance by specifying a filter.
     * </p>
     * 
     * @param listAssociationsRequest
     * @return A Java Future object containing the response from the
     *         ListAssociations service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListAssociationsResult> listAssociationsAsync(
            final ListAssociationsRequest listAssociationsRequest,
            final AsyncHandler<ListAssociationsRequest, ListAssociationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListAssociationsResult>() {
            public ListAssociationsResult call() throws Exception {
                ListAssociationsResult result = null;
                try {
                    result = listAssociations(listAssociationsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listAssociationsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * An invocation is copy of a command sent to a specific instance. A command
     * can apply to one or more instances. A command invocation applies to one
     * instance. For example, if a user runs SendCommand against three
     * instances, then a command invocation is created for each requested
     * instance ID. ListCommandInvocations provide status about command
     * execution.
     * </p>
     * 
     * @param listCommandInvocationsRequest
     * @return A Java Future object containing the response from the
     *         ListCommandInvocations service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     * @throws InvalidFilterKeyException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListCommandInvocationsResult> listCommandInvocationsAsync(
            final ListCommandInvocationsRequest listCommandInvocationsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListCommandInvocationsResult>() {
            public ListCommandInvocationsResult call() throws Exception {
                return listCommandInvocations(listCommandInvocationsRequest);
            }
        });
    }

    /**
     * <p>
     * An invocation is copy of a command sent to a specific instance. A command
     * can apply to one or more instances. A command invocation applies to one
     * instance. For example, if a user runs SendCommand against three
     * instances, then a command invocation is created for each requested
     * instance ID. ListCommandInvocations provide status about command
     * execution.
     * </p>
     * 
     * @param listCommandInvocationsRequest
     * @return A Java Future object containing the response from the
     *         ListCommandInvocations service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     * @throws InvalidFilterKeyException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListCommandInvocationsResult> listCommandInvocationsAsync(
            final ListCommandInvocationsRequest listCommandInvocationsRequest,
            final AsyncHandler<ListCommandInvocationsRequest, ListCommandInvocationsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListCommandInvocationsResult>() {
            public ListCommandInvocationsResult call() throws Exception {
                ListCommandInvocationsResult result = null;
                try {
                    result = listCommandInvocations(listCommandInvocationsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listCommandInvocationsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists the commands requested by users of the AWS account.
     * </p>
     * 
     * @param listCommandsRequest
     * @return A Java Future object containing the response from the
     *         ListCommands service method, as returned by Amazon Simple Systems
     *         Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     * @throws InvalidFilterKeyException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListCommandsResult> listCommandsAsync(
            final ListCommandsRequest listCommandsRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<ListCommandsResult>() {
            public ListCommandsResult call() throws Exception {
                return listCommands(listCommandsRequest);
            }
        });
    }

    /**
     * <p>
     * Lists the commands requested by users of the AWS account.
     * </p>
     * 
     * @param listCommandsRequest
     * @return A Java Future object containing the response from the
     *         ListCommands service method, as returned by Amazon Simple Systems
     *         Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     * @throws InvalidFilterKeyException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListCommandsResult> listCommandsAsync(
            final ListCommandsRequest listCommandsRequest,
            final AsyncHandler<ListCommandsRequest, ListCommandsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListCommandsResult>() {
            public ListCommandsResult call() throws Exception {
                ListCommandsResult result = null;
                try {
                    result = listCommands(listCommandsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listCommandsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * For a specified resource ID, this API action returns a list of compliance
     * statuses for different resource types. Currently, you can only specify
     * one resource ID per call. List results depend on the criteria specified
     * in the filter.
     * </p>
     * 
     * @param listComplianceItemsRequest
     * @return A Java Future object containing the response from the
     *         ListComplianceItems service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidResourceTypeException
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListComplianceItemsResult> listComplianceItemsAsync(
            final ListComplianceItemsRequest listComplianceItemsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListComplianceItemsResult>() {
            public ListComplianceItemsResult call() throws Exception {
                return listComplianceItems(listComplianceItemsRequest);
            }
        });
    }

    /**
     * <p>
     * For a specified resource ID, this API action returns a list of compliance
     * statuses for different resource types. Currently, you can only specify
     * one resource ID per call. List results depend on the criteria specified
     * in the filter.
     * </p>
     * 
     * @param listComplianceItemsRequest
     * @return A Java Future object containing the response from the
     *         ListComplianceItems service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidResourceTypeException
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListComplianceItemsResult> listComplianceItemsAsync(
            final ListComplianceItemsRequest listComplianceItemsRequest,
            final AsyncHandler<ListComplianceItemsRequest, ListComplianceItemsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListComplianceItemsResult>() {
            public ListComplianceItemsResult call() throws Exception {
                ListComplianceItemsResult result = null;
                try {
                    result = listComplianceItems(listComplianceItemsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listComplianceItemsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns a summary count of compliant and non-compliant resources for a
     * compliance type. For example, this call can return State Manager
     * associations, patches, or custom compliance types according to the filter
     * criteria that you specify.
     * </p>
     * 
     * @param listComplianceSummariesRequest
     * @return A Java Future object containing the response from the
     *         ListComplianceSummaries service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListComplianceSummariesResult> listComplianceSummariesAsync(
            final ListComplianceSummariesRequest listComplianceSummariesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListComplianceSummariesResult>() {
            public ListComplianceSummariesResult call() throws Exception {
                return listComplianceSummaries(listComplianceSummariesRequest);
            }
        });
    }

    /**
     * <p>
     * Returns a summary count of compliant and non-compliant resources for a
     * compliance type. For example, this call can return State Manager
     * associations, patches, or custom compliance types according to the filter
     * criteria that you specify.
     * </p>
     * 
     * @param listComplianceSummariesRequest
     * @return A Java Future object containing the response from the
     *         ListComplianceSummaries service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListComplianceSummariesResult> listComplianceSummariesAsync(
            final ListComplianceSummariesRequest listComplianceSummariesRequest,
            final AsyncHandler<ListComplianceSummariesRequest, ListComplianceSummariesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListComplianceSummariesResult>() {
            public ListComplianceSummariesResult call() throws Exception {
                ListComplianceSummariesResult result = null;
                try {
                    result = listComplianceSummaries(listComplianceSummariesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listComplianceSummariesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * List all versions for a document.
     * </p>
     * 
     * @param listDocumentVersionsRequest
     * @return A Java Future object containing the response from the
     *         ListDocumentVersions service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws InvalidDocumentException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListDocumentVersionsResult> listDocumentVersionsAsync(
            final ListDocumentVersionsRequest listDocumentVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDocumentVersionsResult>() {
            public ListDocumentVersionsResult call() throws Exception {
                return listDocumentVersions(listDocumentVersionsRequest);
            }
        });
    }

    /**
     * <p>
     * List all versions for a document.
     * </p>
     * 
     * @param listDocumentVersionsRequest
     * @return A Java Future object containing the response from the
     *         ListDocumentVersions service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws InvalidDocumentException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListDocumentVersionsResult> listDocumentVersionsAsync(
            final ListDocumentVersionsRequest listDocumentVersionsRequest,
            final AsyncHandler<ListDocumentVersionsRequest, ListDocumentVersionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDocumentVersionsResult>() {
            public ListDocumentVersionsResult call() throws Exception {
                ListDocumentVersionsResult result = null;
                try {
                    result = listDocumentVersions(listDocumentVersionsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listDocumentVersionsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns all Systems Manager (SSM) documents in the current AWS account
     * and Region. You can limit the results of this request by using a filter.
     * </p>
     * 
     * @param listDocumentsRequest
     * @return A Java Future object containing the response from the
     *         ListDocuments service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws InvalidFilterKeyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListDocumentsResult> listDocumentsAsync(
            final ListDocumentsRequest listDocumentsRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<ListDocumentsResult>() {
            public ListDocumentsResult call() throws Exception {
                return listDocuments(listDocumentsRequest);
            }
        });
    }

    /**
     * <p>
     * Returns all Systems Manager (SSM) documents in the current AWS account
     * and Region. You can limit the results of this request by using a filter.
     * </p>
     * 
     * @param listDocumentsRequest
     * @return A Java Future object containing the response from the
     *         ListDocuments service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws InvalidFilterKeyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListDocumentsResult> listDocumentsAsync(
            final ListDocumentsRequest listDocumentsRequest,
            final AsyncHandler<ListDocumentsRequest, ListDocumentsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDocumentsResult>() {
            public ListDocumentsResult call() throws Exception {
                ListDocumentsResult result = null;
                try {
                    result = listDocuments(listDocumentsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listDocumentsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * A list of inventory items returned by the request.
     * </p>
     * 
     * @param listInventoryEntriesRequest
     * @return A Java Future object containing the response from the
     *         ListInventoryEntries service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidTypeNameException
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListInventoryEntriesResult> listInventoryEntriesAsync(
            final ListInventoryEntriesRequest listInventoryEntriesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListInventoryEntriesResult>() {
            public ListInventoryEntriesResult call() throws Exception {
                return listInventoryEntries(listInventoryEntriesRequest);
            }
        });
    }

    /**
     * <p>
     * A list of inventory items returned by the request.
     * </p>
     * 
     * @param listInventoryEntriesRequest
     * @return A Java Future object containing the response from the
     *         ListInventoryEntries service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidTypeNameException
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListInventoryEntriesResult> listInventoryEntriesAsync(
            final ListInventoryEntriesRequest listInventoryEntriesRequest,
            final AsyncHandler<ListInventoryEntriesRequest, ListInventoryEntriesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListInventoryEntriesResult>() {
            public ListInventoryEntriesResult call() throws Exception {
                ListInventoryEntriesResult result = null;
                try {
                    result = listInventoryEntries(listInventoryEntriesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listInventoryEntriesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns a resource-level summary count. The summary includes information
     * about compliant and non-compliant statuses and detailed compliance-item
     * severity counts, according to the filter criteria you specify.
     * </p>
     * 
     * @param listResourceComplianceSummariesRequest
     * @return A Java Future object containing the response from the
     *         ListResourceComplianceSummaries service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListResourceComplianceSummariesResult> listResourceComplianceSummariesAsync(
            final ListResourceComplianceSummariesRequest listResourceComplianceSummariesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListResourceComplianceSummariesResult>() {
            public ListResourceComplianceSummariesResult call() throws Exception {
                return listResourceComplianceSummaries(listResourceComplianceSummariesRequest);
            }
        });
    }

    /**
     * <p>
     * Returns a resource-level summary count. The summary includes information
     * about compliant and non-compliant statuses and detailed compliance-item
     * severity counts, according to the filter criteria you specify.
     * </p>
     * 
     * @param listResourceComplianceSummariesRequest
     * @return A Java Future object containing the response from the
     *         ListResourceComplianceSummaries service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InvalidFilterException
     * @throws InvalidNextTokenException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListResourceComplianceSummariesResult> listResourceComplianceSummariesAsync(
            final ListResourceComplianceSummariesRequest listResourceComplianceSummariesRequest,
            final AsyncHandler<ListResourceComplianceSummariesRequest, ListResourceComplianceSummariesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListResourceComplianceSummariesResult>() {
            public ListResourceComplianceSummariesResult call() throws Exception {
                ListResourceComplianceSummariesResult result = null;
                try {
                    result = listResourceComplianceSummaries(listResourceComplianceSummariesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listResourceComplianceSummariesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists your resource data sync configurations. Includes information about
     * the last time a sync attempted to start, the last sync status, and the
     * last time a sync successfully completed.
     * </p>
     * <p>
     * The number of sync configurations might be too large to return using a
     * single call to <code>ListResourceDataSync</code>. You can limit the
     * number of sync configurations returned by using the
     * <code>MaxResults</code> parameter. To determine whether there are more
     * sync configurations to list, check the value of <code>NextToken</code> in
     * the output. If there are more sync configurations to list, you can
     * request them by specifying the <code>NextToken</code> returned in the
     * call to the parameter of a subsequent call.
     * </p>
     * 
     * @param listResourceDataSyncRequest
     * @return A Java Future object containing the response from the
     *         ListResourceDataSync service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws ResourceDataSyncInvalidConfigurationException
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListResourceDataSyncResult> listResourceDataSyncAsync(
            final ListResourceDataSyncRequest listResourceDataSyncRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListResourceDataSyncResult>() {
            public ListResourceDataSyncResult call() throws Exception {
                return listResourceDataSync(listResourceDataSyncRequest);
            }
        });
    }

    /**
     * <p>
     * Lists your resource data sync configurations. Includes information about
     * the last time a sync attempted to start, the last sync status, and the
     * last time a sync successfully completed.
     * </p>
     * <p>
     * The number of sync configurations might be too large to return using a
     * single call to <code>ListResourceDataSync</code>. You can limit the
     * number of sync configurations returned by using the
     * <code>MaxResults</code> parameter. To determine whether there are more
     * sync configurations to list, check the value of <code>NextToken</code> in
     * the output. If there are more sync configurations to list, you can
     * request them by specifying the <code>NextToken</code> returned in the
     * call to the parameter of a subsequent call.
     * </p>
     * 
     * @param listResourceDataSyncRequest
     * @return A Java Future object containing the response from the
     *         ListResourceDataSync service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws ResourceDataSyncInvalidConfigurationException
     * @throws InternalServerErrorException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListResourceDataSyncResult> listResourceDataSyncAsync(
            final ListResourceDataSyncRequest listResourceDataSyncRequest,
            final AsyncHandler<ListResourceDataSyncRequest, ListResourceDataSyncResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListResourceDataSyncResult>() {
            public ListResourceDataSyncResult call() throws Exception {
                ListResourceDataSyncResult result = null;
                try {
                    result = listResourceDataSync(listResourceDataSyncRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listResourceDataSyncRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns a list of the tags assigned to the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidResourceTypeException
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListTagsForResourceResult> listTagsForResourceAsync(
            final ListTagsForResourceRequest listTagsForResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTagsForResourceResult>() {
            public ListTagsForResourceResult call() throws Exception {
                return listTagsForResource(listTagsForResourceRequest);
            }
        });
    }

    /**
     * <p>
     * Returns a list of the tags assigned to the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InvalidResourceTypeException
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ListTagsForResourceResult> listTagsForResourceAsync(
            final ListTagsForResourceRequest listTagsForResourceRequest,
            final AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTagsForResourceResult>() {
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;
                try {
                    result = listTagsForResource(listTagsForResourceRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listTagsForResourceRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Shares a Systems Manager document publicly or privately. If you share a
     * document privately, you must specify the AWS user account IDs for those
     * people who can use the document. If you share a document publicly, you
     * must specify <i>All</i> as the account ID.
     * </p>
     * 
     * @param modifyDocumentPermissionRequest
     * @return A Java Future object containing the response from the
     *         ModifyDocumentPermission service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidPermissionTypeException
     * @throws DocumentPermissionLimitException
     * @throws DocumentLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ModifyDocumentPermissionResult> modifyDocumentPermissionAsync(
            final ModifyDocumentPermissionRequest modifyDocumentPermissionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ModifyDocumentPermissionResult>() {
            public ModifyDocumentPermissionResult call() throws Exception {
                return modifyDocumentPermission(modifyDocumentPermissionRequest);
            }
        });
    }

    /**
     * <p>
     * Shares a Systems Manager document publicly or privately. If you share a
     * document privately, you must specify the AWS user account IDs for those
     * people who can use the document. If you share a document publicly, you
     * must specify <i>All</i> as the account ID.
     * </p>
     * 
     * @param modifyDocumentPermissionRequest
     * @return A Java Future object containing the response from the
     *         ModifyDocumentPermission service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidPermissionTypeException
     * @throws DocumentPermissionLimitException
     * @throws DocumentLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ModifyDocumentPermissionResult> modifyDocumentPermissionAsync(
            final ModifyDocumentPermissionRequest modifyDocumentPermissionRequest,
            final AsyncHandler<ModifyDocumentPermissionRequest, ModifyDocumentPermissionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ModifyDocumentPermissionResult>() {
            public ModifyDocumentPermissionResult call() throws Exception {
                ModifyDocumentPermissionResult result = null;
                try {
                    result = modifyDocumentPermission(modifyDocumentPermissionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(modifyDocumentPermissionRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Registers a compliance type and other compliance details on a designated
     * resource. This action lets you register custom compliance details with a
     * resource. This call overwrites existing compliance information on the
     * resource, so you must provide a full list of compliance items each time
     * that you send the request.
     * </p>
     * <p>
     * ComplianceType can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ExecutionId: The execution ID when the patch, association, or custom
     * compliance item was applied.
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecutionType: Specify patch, association, or Custom:<code>string</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecutionTime. The time the patch, association, or custom compliance item
     * was applied to the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Id: The patch, association, or custom compliance ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * Title: A title.
     * </p>
     * </li>
     * <li>
     * <p>
     * Status: The status of the compliance item. For example,
     * <code>approved</code> for patches, or <code>Failed</code> for
     * associations.
     * </p>
     * </li>
     * <li>
     * <p>
     * Severity: A patch severity. For example, <code>critical</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DocumentName: A SSM document name. For example, AWS-RunPatchBaseline.
     * </p>
     * </li>
     * <li>
     * <p>
     * DocumentVersion: An SSM document version number. For example, 4.
     * </p>
     * </li>
     * <li>
     * <p>
     * Classification: A patch classification. For example,
     * <code>security updates</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchBaselineId: A patch baseline ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchSeverity: A patch severity. For example, <code>Critical</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchState: A patch state. For example,
     * <code>InstancesWithFailedPatches</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchGroup: The name of a patch group.
     * </p>
     * </li>
     * <li>
     * <p>
     * InstalledTime: The time the association, patch, or custom compliance item
     * was applied to the resource. Specify the time by using the following
     * format: yyyy-MM-dd'T'HH:mm:ss'Z'
     * </p>
     * </li>
     * </ul>
     * 
     * @param putComplianceItemsRequest
     * @return A Java Future object containing the response from the
     *         PutComplianceItems service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidItemContentException
     * @throws TotalSizeLimitExceededException
     * @throws ItemSizeLimitExceededException
     * @throws ComplianceTypeCountLimitExceededException
     * @throws InvalidResourceTypeException
     * @throws InvalidResourceIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<PutComplianceItemsResult> putComplianceItemsAsync(
            final PutComplianceItemsRequest putComplianceItemsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PutComplianceItemsResult>() {
            public PutComplianceItemsResult call() throws Exception {
                return putComplianceItems(putComplianceItemsRequest);
            }
        });
    }

    /**
     * <p>
     * Registers a compliance type and other compliance details on a designated
     * resource. This action lets you register custom compliance details with a
     * resource. This call overwrites existing compliance information on the
     * resource, so you must provide a full list of compliance items each time
     * that you send the request.
     * </p>
     * <p>
     * ComplianceType can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ExecutionId: The execution ID when the patch, association, or custom
     * compliance item was applied.
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecutionType: Specify patch, association, or Custom:<code>string</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecutionTime. The time the patch, association, or custom compliance item
     * was applied to the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Id: The patch, association, or custom compliance ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * Title: A title.
     * </p>
     * </li>
     * <li>
     * <p>
     * Status: The status of the compliance item. For example,
     * <code>approved</code> for patches, or <code>Failed</code> for
     * associations.
     * </p>
     * </li>
     * <li>
     * <p>
     * Severity: A patch severity. For example, <code>critical</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DocumentName: A SSM document name. For example, AWS-RunPatchBaseline.
     * </p>
     * </li>
     * <li>
     * <p>
     * DocumentVersion: An SSM document version number. For example, 4.
     * </p>
     * </li>
     * <li>
     * <p>
     * Classification: A patch classification. For example,
     * <code>security updates</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchBaselineId: A patch baseline ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchSeverity: A patch severity. For example, <code>Critical</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchState: A patch state. For example,
     * <code>InstancesWithFailedPatches</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchGroup: The name of a patch group.
     * </p>
     * </li>
     * <li>
     * <p>
     * InstalledTime: The time the association, patch, or custom compliance item
     * was applied to the resource. Specify the time by using the following
     * format: yyyy-MM-dd'T'HH:mm:ss'Z'
     * </p>
     * </li>
     * </ul>
     * 
     * @param putComplianceItemsRequest
     * @return A Java Future object containing the response from the
     *         PutComplianceItems service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidItemContentException
     * @throws TotalSizeLimitExceededException
     * @throws ItemSizeLimitExceededException
     * @throws ComplianceTypeCountLimitExceededException
     * @throws InvalidResourceTypeException
     * @throws InvalidResourceIdException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<PutComplianceItemsResult> putComplianceItemsAsync(
            final PutComplianceItemsRequest putComplianceItemsRequest,
            final AsyncHandler<PutComplianceItemsRequest, PutComplianceItemsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PutComplianceItemsResult>() {
            public PutComplianceItemsResult call() throws Exception {
                PutComplianceItemsResult result = null;
                try {
                    result = putComplianceItems(putComplianceItemsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(putComplianceItemsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Bulk update custom inventory items on one more instance. The request adds
     * an inventory item, if it doesn't already exist, or updates an inventory
     * item, if it does exist.
     * </p>
     * 
     * @param putInventoryRequest
     * @return A Java Future object containing the response from the
     *         PutInventory service method, as returned by Amazon Simple Systems
     *         Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidTypeNameException
     * @throws InvalidItemContentException
     * @throws TotalSizeLimitExceededException
     * @throws ItemSizeLimitExceededException
     * @throws ItemContentMismatchException
     * @throws CustomSchemaCountLimitExceededException
     * @throws UnsupportedInventorySchemaVersionException
     * @throws UnsupportedInventoryItemContextException
     * @throws InvalidInventoryItemContextException
     * @throws SubTypeCountLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<PutInventoryResult> putInventoryAsync(
            final PutInventoryRequest putInventoryRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<PutInventoryResult>() {
            public PutInventoryResult call() throws Exception {
                return putInventory(putInventoryRequest);
            }
        });
    }

    /**
     * <p>
     * Bulk update custom inventory items on one more instance. The request adds
     * an inventory item, if it doesn't already exist, or updates an inventory
     * item, if it does exist.
     * </p>
     * 
     * @param putInventoryRequest
     * @return A Java Future object containing the response from the
     *         PutInventory service method, as returned by Amazon Simple Systems
     *         Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidTypeNameException
     * @throws InvalidItemContentException
     * @throws TotalSizeLimitExceededException
     * @throws ItemSizeLimitExceededException
     * @throws ItemContentMismatchException
     * @throws CustomSchemaCountLimitExceededException
     * @throws UnsupportedInventorySchemaVersionException
     * @throws UnsupportedInventoryItemContextException
     * @throws InvalidInventoryItemContextException
     * @throws SubTypeCountLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<PutInventoryResult> putInventoryAsync(
            final PutInventoryRequest putInventoryRequest,
            final AsyncHandler<PutInventoryRequest, PutInventoryResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PutInventoryResult>() {
            public PutInventoryResult call() throws Exception {
                PutInventoryResult result = null;
                try {
                    result = putInventory(putInventoryRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(putInventoryRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Add a parameter to the system.
     * </p>
     * 
     * @param putParameterRequest
     * @return A Java Future object containing the response from the
     *         PutParameter service method, as returned by Amazon Simple Systems
     *         Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidKeyIdException
     * @throws ParameterLimitExceededException
     * @throws TooManyUpdatesException
     * @throws ParameterAlreadyExistsException
     * @throws HierarchyLevelLimitExceededException
     * @throws HierarchyTypeMismatchException
     * @throws InvalidAllowedPatternException
     * @throws ParameterMaxVersionLimitExceededException
     * @throws ParameterPatternMismatchException
     * @throws UnsupportedParameterTypeException
     * @throws PoliciesLimitExceededException
     * @throws InvalidPolicyTypeException
     * @throws InvalidPolicyAttributeException
     * @throws IncompatiblePolicyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<PutParameterResult> putParameterAsync(
            final PutParameterRequest putParameterRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<PutParameterResult>() {
            public PutParameterResult call() throws Exception {
                return putParameter(putParameterRequest);
            }
        });
    }

    /**
     * <p>
     * Add a parameter to the system.
     * </p>
     * 
     * @param putParameterRequest
     * @return A Java Future object containing the response from the
     *         PutParameter service method, as returned by Amazon Simple Systems
     *         Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidKeyIdException
     * @throws ParameterLimitExceededException
     * @throws TooManyUpdatesException
     * @throws ParameterAlreadyExistsException
     * @throws HierarchyLevelLimitExceededException
     * @throws HierarchyTypeMismatchException
     * @throws InvalidAllowedPatternException
     * @throws ParameterMaxVersionLimitExceededException
     * @throws ParameterPatternMismatchException
     * @throws UnsupportedParameterTypeException
     * @throws PoliciesLimitExceededException
     * @throws InvalidPolicyTypeException
     * @throws InvalidPolicyAttributeException
     * @throws IncompatiblePolicyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<PutParameterResult> putParameterAsync(
            final PutParameterRequest putParameterRequest,
            final AsyncHandler<PutParameterRequest, PutParameterResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PutParameterResult>() {
            public PutParameterResult call() throws Exception {
                PutParameterResult result = null;
                try {
                    result = putParameter(putParameterRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(putParameterRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Defines the default patch baseline for the relevant operating system.
     * </p>
     * <p>
     * To reset the AWS predefined patch baseline as the default, specify the
     * full patch baseline ARN as the baseline ID value. For example, for
     * CentOS, specify
     * <code>arn:aws:ssm:us-east-2:733109147000:patchbaseline/pb-0574b43a65ea646ed</code>
     * instead of <code>pb-0574b43a65ea646ed</code>.
     * </p>
     * 
     * @param registerDefaultPatchBaselineRequest
     * @return A Java Future object containing the response from the
     *         RegisterDefaultPatchBaseline service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InvalidResourceIdException
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<RegisterDefaultPatchBaselineResult> registerDefaultPatchBaselineAsync(
            final RegisterDefaultPatchBaselineRequest registerDefaultPatchBaselineRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RegisterDefaultPatchBaselineResult>() {
            public RegisterDefaultPatchBaselineResult call() throws Exception {
                return registerDefaultPatchBaseline(registerDefaultPatchBaselineRequest);
            }
        });
    }

    /**
     * <p>
     * Defines the default patch baseline for the relevant operating system.
     * </p>
     * <p>
     * To reset the AWS predefined patch baseline as the default, specify the
     * full patch baseline ARN as the baseline ID value. For example, for
     * CentOS, specify
     * <code>arn:aws:ssm:us-east-2:733109147000:patchbaseline/pb-0574b43a65ea646ed</code>
     * instead of <code>pb-0574b43a65ea646ed</code>.
     * </p>
     * 
     * @param registerDefaultPatchBaselineRequest
     * @return A Java Future object containing the response from the
     *         RegisterDefaultPatchBaseline service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InvalidResourceIdException
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<RegisterDefaultPatchBaselineResult> registerDefaultPatchBaselineAsync(
            final RegisterDefaultPatchBaselineRequest registerDefaultPatchBaselineRequest,
            final AsyncHandler<RegisterDefaultPatchBaselineRequest, RegisterDefaultPatchBaselineResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RegisterDefaultPatchBaselineResult>() {
            public RegisterDefaultPatchBaselineResult call() throws Exception {
                RegisterDefaultPatchBaselineResult result = null;
                try {
                    result = registerDefaultPatchBaseline(registerDefaultPatchBaselineRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(registerDefaultPatchBaselineRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Registers a patch baseline for a patch group.
     * </p>
     * 
     * @param registerPatchBaselineForPatchGroupRequest
     * @return A Java Future object containing the response from the
     *         RegisterPatchBaselineForPatchGroup service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws AlreadyExistsException
     * @throws DoesNotExistException
     * @throws InvalidResourceIdException
     * @throws ResourceLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<RegisterPatchBaselineForPatchGroupResult> registerPatchBaselineForPatchGroupAsync(
            final RegisterPatchBaselineForPatchGroupRequest registerPatchBaselineForPatchGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RegisterPatchBaselineForPatchGroupResult>() {
            public RegisterPatchBaselineForPatchGroupResult call() throws Exception {
                return registerPatchBaselineForPatchGroup(registerPatchBaselineForPatchGroupRequest);
            }
        });
    }

    /**
     * <p>
     * Registers a patch baseline for a patch group.
     * </p>
     * 
     * @param registerPatchBaselineForPatchGroupRequest
     * @return A Java Future object containing the response from the
     *         RegisterPatchBaselineForPatchGroup service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws AlreadyExistsException
     * @throws DoesNotExistException
     * @throws InvalidResourceIdException
     * @throws ResourceLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<RegisterPatchBaselineForPatchGroupResult> registerPatchBaselineForPatchGroupAsync(
            final RegisterPatchBaselineForPatchGroupRequest registerPatchBaselineForPatchGroupRequest,
            final AsyncHandler<RegisterPatchBaselineForPatchGroupRequest, RegisterPatchBaselineForPatchGroupResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RegisterPatchBaselineForPatchGroupResult>() {
            public RegisterPatchBaselineForPatchGroupResult call() throws Exception {
                RegisterPatchBaselineForPatchGroupResult result = null;
                try {
                    result = registerPatchBaselineForPatchGroup(registerPatchBaselineForPatchGroupRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(registerPatchBaselineForPatchGroupRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Registers a target with a maintenance window.
     * </p>
     * 
     * @param registerTargetWithMaintenanceWindowRequest
     * @return A Java Future object containing the response from the
     *         RegisterTargetWithMaintenanceWindow service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws IdempotentParameterMismatchException
     * @throws DoesNotExistException
     * @throws ResourceLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<RegisterTargetWithMaintenanceWindowResult> registerTargetWithMaintenanceWindowAsync(
            final RegisterTargetWithMaintenanceWindowRequest registerTargetWithMaintenanceWindowRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RegisterTargetWithMaintenanceWindowResult>() {
            public RegisterTargetWithMaintenanceWindowResult call() throws Exception {
                return registerTargetWithMaintenanceWindow(registerTargetWithMaintenanceWindowRequest);
            }
        });
    }

    /**
     * <p>
     * Registers a target with a maintenance window.
     * </p>
     * 
     * @param registerTargetWithMaintenanceWindowRequest
     * @return A Java Future object containing the response from the
     *         RegisterTargetWithMaintenanceWindow service method, as returned
     *         by Amazon Simple Systems Manager (SSM).
     * @throws IdempotentParameterMismatchException
     * @throws DoesNotExistException
     * @throws ResourceLimitExceededException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<RegisterTargetWithMaintenanceWindowResult> registerTargetWithMaintenanceWindowAsync(
            final RegisterTargetWithMaintenanceWindowRequest registerTargetWithMaintenanceWindowRequest,
            final AsyncHandler<RegisterTargetWithMaintenanceWindowRequest, RegisterTargetWithMaintenanceWindowResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RegisterTargetWithMaintenanceWindowResult>() {
            public RegisterTargetWithMaintenanceWindowResult call() throws Exception {
                RegisterTargetWithMaintenanceWindowResult result = null;
                try {
                    result = registerTargetWithMaintenanceWindow(registerTargetWithMaintenanceWindowRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(registerTargetWithMaintenanceWindowRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Adds a new task to a maintenance window.
     * </p>
     * 
     * @param registerTaskWithMaintenanceWindowRequest
     * @return A Java Future object containing the response from the
     *         RegisterTaskWithMaintenanceWindow service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws IdempotentParameterMismatchException
     * @throws DoesNotExistException
     * @throws ResourceLimitExceededException
     * @throws FeatureNotAvailableException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<RegisterTaskWithMaintenanceWindowResult> registerTaskWithMaintenanceWindowAsync(
            final RegisterTaskWithMaintenanceWindowRequest registerTaskWithMaintenanceWindowRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RegisterTaskWithMaintenanceWindowResult>() {
            public RegisterTaskWithMaintenanceWindowResult call() throws Exception {
                return registerTaskWithMaintenanceWindow(registerTaskWithMaintenanceWindowRequest);
            }
        });
    }

    /**
     * <p>
     * Adds a new task to a maintenance window.
     * </p>
     * 
     * @param registerTaskWithMaintenanceWindowRequest
     * @return A Java Future object containing the response from the
     *         RegisterTaskWithMaintenanceWindow service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws IdempotentParameterMismatchException
     * @throws DoesNotExistException
     * @throws ResourceLimitExceededException
     * @throws FeatureNotAvailableException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<RegisterTaskWithMaintenanceWindowResult> registerTaskWithMaintenanceWindowAsync(
            final RegisterTaskWithMaintenanceWindowRequest registerTaskWithMaintenanceWindowRequest,
            final AsyncHandler<RegisterTaskWithMaintenanceWindowRequest, RegisterTaskWithMaintenanceWindowResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RegisterTaskWithMaintenanceWindowResult>() {
            public RegisterTaskWithMaintenanceWindowResult call() throws Exception {
                RegisterTaskWithMaintenanceWindowResult result = null;
                try {
                    result = registerTaskWithMaintenanceWindow(registerTaskWithMaintenanceWindowRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(registerTaskWithMaintenanceWindowRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Removes tag keys from the specified resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @return A Java Future object containing the response from the
     *         RemoveTagsFromResource service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InvalidResourceTypeException
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(
            final RemoveTagsFromResourceRequest removeTagsFromResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RemoveTagsFromResourceResult>() {
            public RemoveTagsFromResourceResult call() throws Exception {
                return removeTagsFromResource(removeTagsFromResourceRequest);
            }
        });
    }

    /**
     * <p>
     * Removes tag keys from the specified resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @return A Java Future object containing the response from the
     *         RemoveTagsFromResource service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InvalidResourceTypeException
     * @throws InvalidResourceIdException
     * @throws InternalServerErrorException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(
            final RemoveTagsFromResourceRequest removeTagsFromResourceRequest,
            final AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RemoveTagsFromResourceResult>() {
            public RemoveTagsFromResourceResult call() throws Exception {
                RemoveTagsFromResourceResult result = null;
                try {
                    result = removeTagsFromResource(removeTagsFromResourceRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(removeTagsFromResourceRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * <code>ServiceSetting</code> is an account-level setting for an AWS
     * service. This setting defines how a user interacts with or uses a service
     * or a feature of a service. For example, if an AWS service charges money
     * to the account based on feature or service usage, then the AWS service
     * team might create a default setting of "false". This means the user can't
     * use this feature unless they change the setting to "true" and
     * intentionally opt in for a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS
     * services teams define the default value for a <code>SettingId</code>. You
     * can't create a new <code>SettingId</code>, but you can overwrite the
     * default value if you have the <code>ssm:UpdateServiceSetting</code>
     * permission for the setting. Use the <a>GetServiceSetting</a> API action
     * to view the current value. Use the <a>UpdateServiceSetting</a> API action
     * to change the default setting.
     * </p>
     * <p>
     * Reset the service setting for the account to the default value as
     * provisioned by the AWS service team.
     * </p>
     * 
     * @param resetServiceSettingRequest <p>
     *            The request body of the ResetServiceSetting API action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ResetServiceSetting service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ServiceSettingNotFoundException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ResetServiceSettingResult> resetServiceSettingAsync(
            final ResetServiceSettingRequest resetServiceSettingRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ResetServiceSettingResult>() {
            public ResetServiceSettingResult call() throws Exception {
                return resetServiceSetting(resetServiceSettingRequest);
            }
        });
    }

    /**
     * <p>
     * <code>ServiceSetting</code> is an account-level setting for an AWS
     * service. This setting defines how a user interacts with or uses a service
     * or a feature of a service. For example, if an AWS service charges money
     * to the account based on feature or service usage, then the AWS service
     * team might create a default setting of "false". This means the user can't
     * use this feature unless they change the setting to "true" and
     * intentionally opt in for a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS
     * services teams define the default value for a <code>SettingId</code>. You
     * can't create a new <code>SettingId</code>, but you can overwrite the
     * default value if you have the <code>ssm:UpdateServiceSetting</code>
     * permission for the setting. Use the <a>GetServiceSetting</a> API action
     * to view the current value. Use the <a>UpdateServiceSetting</a> API action
     * to change the default setting.
     * </p>
     * <p>
     * Reset the service setting for the account to the default value as
     * provisioned by the AWS service team.
     * </p>
     * 
     * @param resetServiceSettingRequest <p>
     *            The request body of the ResetServiceSetting API action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ResetServiceSetting service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ServiceSettingNotFoundException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ResetServiceSettingResult> resetServiceSettingAsync(
            final ResetServiceSettingRequest resetServiceSettingRequest,
            final AsyncHandler<ResetServiceSettingRequest, ResetServiceSettingResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ResetServiceSettingResult>() {
            public ResetServiceSettingResult call() throws Exception {
                ResetServiceSettingResult result = null;
                try {
                    result = resetServiceSetting(resetServiceSettingRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(resetServiceSettingRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Reconnects a session to an instance after it has been disconnected.
     * Connections can be resumed for disconnected sessions, but not terminated
     * sessions.
     * </p>
     * <note>
     * <p>
     * This command is primarily for use by client machines to automatically
     * reconnect during intermittent network issues. It is not intended for any
     * other use.
     * </p>
     * </note>
     * 
     * @param resumeSessionRequest
     * @return A Java Future object containing the response from the
     *         ResumeSession service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ResumeSessionResult> resumeSessionAsync(
            final ResumeSessionRequest resumeSessionRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<ResumeSessionResult>() {
            public ResumeSessionResult call() throws Exception {
                return resumeSession(resumeSessionRequest);
            }
        });
    }

    /**
     * <p>
     * Reconnects a session to an instance after it has been disconnected.
     * Connections can be resumed for disconnected sessions, but not terminated
     * sessions.
     * </p>
     * <note>
     * <p>
     * This command is primarily for use by client machines to automatically
     * reconnect during intermittent network issues. It is not intended for any
     * other use.
     * </p>
     * </note>
     * 
     * @param resumeSessionRequest
     * @return A Java Future object containing the response from the
     *         ResumeSession service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<ResumeSessionResult> resumeSessionAsync(
            final ResumeSessionRequest resumeSessionRequest,
            final AsyncHandler<ResumeSessionRequest, ResumeSessionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ResumeSessionResult>() {
            public ResumeSessionResult call() throws Exception {
                ResumeSessionResult result = null;
                try {
                    result = resumeSession(resumeSessionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(resumeSessionRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Sends a signal to an Automation execution to change the current behavior
     * or status of the execution.
     * </p>
     * 
     * @param sendAutomationSignalRequest
     * @return A Java Future object containing the response from the
     *         SendAutomationSignal service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws AutomationExecutionNotFoundException
     * @throws AutomationStepNotFoundException
     * @throws InvalidAutomationSignalException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<SendAutomationSignalResult> sendAutomationSignalAsync(
            final SendAutomationSignalRequest sendAutomationSignalRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendAutomationSignalResult>() {
            public SendAutomationSignalResult call() throws Exception {
                return sendAutomationSignal(sendAutomationSignalRequest);
            }
        });
    }

    /**
     * <p>
     * Sends a signal to an Automation execution to change the current behavior
     * or status of the execution.
     * </p>
     * 
     * @param sendAutomationSignalRequest
     * @return A Java Future object containing the response from the
     *         SendAutomationSignal service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws AutomationExecutionNotFoundException
     * @throws AutomationStepNotFoundException
     * @throws InvalidAutomationSignalException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<SendAutomationSignalResult> sendAutomationSignalAsync(
            final SendAutomationSignalRequest sendAutomationSignalRequest,
            final AsyncHandler<SendAutomationSignalRequest, SendAutomationSignalResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendAutomationSignalResult>() {
            public SendAutomationSignalResult call() throws Exception {
                SendAutomationSignalResult result = null;
                try {
                    result = sendAutomationSignal(sendAutomationSignalRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(sendAutomationSignalRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Runs commands on one or more managed instances.
     * </p>
     * 
     * @param sendCommandRequest
     * @return A Java Future object containing the response from the SendCommand
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws DuplicateInstanceIdException
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws InvalidOutputFolderException
     * @throws InvalidParametersException
     * @throws UnsupportedPlatformTypeException
     * @throws MaxDocumentSizeExceededException
     * @throws InvalidRoleException
     * @throws InvalidNotificationConfigException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<SendCommandResult> sendCommandAsync(final SendCommandRequest sendCommandRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendCommandResult>() {
            public SendCommandResult call() throws Exception {
                return sendCommand(sendCommandRequest);
            }
        });
    }

    /**
     * <p>
     * Runs commands on one or more managed instances.
     * </p>
     * 
     * @param sendCommandRequest
     * @return A Java Future object containing the response from the SendCommand
     *         service method, as returned by Amazon Simple Systems Manager
     *         (SSM).
     * @throws DuplicateInstanceIdException
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws InvalidOutputFolderException
     * @throws InvalidParametersException
     * @throws UnsupportedPlatformTypeException
     * @throws MaxDocumentSizeExceededException
     * @throws InvalidRoleException
     * @throws InvalidNotificationConfigException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<SendCommandResult> sendCommandAsync(final SendCommandRequest sendCommandRequest,
            final AsyncHandler<SendCommandRequest, SendCommandResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendCommandResult>() {
            public SendCommandResult call() throws Exception {
                SendCommandResult result = null;
                try {
                    result = sendCommand(sendCommandRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(sendCommandRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Use this API action to run an association immediately and only one time.
     * This action can be helpful when troubleshooting associations.
     * </p>
     * 
     * @param startAssociationsOnceRequest
     * @return A Java Future object containing the response from the
     *         StartAssociationsOnce service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InvalidAssociationException
     * @throws AssociationDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<StartAssociationsOnceResult> startAssociationsOnceAsync(
            final StartAssociationsOnceRequest startAssociationsOnceRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartAssociationsOnceResult>() {
            public StartAssociationsOnceResult call() throws Exception {
                return startAssociationsOnce(startAssociationsOnceRequest);
            }
        });
    }

    /**
     * <p>
     * Use this API action to run an association immediately and only one time.
     * This action can be helpful when troubleshooting associations.
     * </p>
     * 
     * @param startAssociationsOnceRequest
     * @return A Java Future object containing the response from the
     *         StartAssociationsOnce service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InvalidAssociationException
     * @throws AssociationDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<StartAssociationsOnceResult> startAssociationsOnceAsync(
            final StartAssociationsOnceRequest startAssociationsOnceRequest,
            final AsyncHandler<StartAssociationsOnceRequest, StartAssociationsOnceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartAssociationsOnceResult>() {
            public StartAssociationsOnceResult call() throws Exception {
                StartAssociationsOnceResult result = null;
                try {
                    result = startAssociationsOnce(startAssociationsOnceRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(startAssociationsOnceRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Initiates execution of an Automation document.
     * </p>
     * 
     * @param startAutomationExecutionRequest
     * @return A Java Future object containing the response from the
     *         StartAutomationExecution service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws AutomationDefinitionNotFoundException
     * @throws InvalidAutomationExecutionParametersException
     * @throws AutomationExecutionLimitExceededException
     * @throws AutomationDefinitionVersionNotFoundException
     * @throws IdempotentParameterMismatchException
     * @throws InvalidTargetException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<StartAutomationExecutionResult> startAutomationExecutionAsync(
            final StartAutomationExecutionRequest startAutomationExecutionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartAutomationExecutionResult>() {
            public StartAutomationExecutionResult call() throws Exception {
                return startAutomationExecution(startAutomationExecutionRequest);
            }
        });
    }

    /**
     * <p>
     * Initiates execution of an Automation document.
     * </p>
     * 
     * @param startAutomationExecutionRequest
     * @return A Java Future object containing the response from the
     *         StartAutomationExecution service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws AutomationDefinitionNotFoundException
     * @throws InvalidAutomationExecutionParametersException
     * @throws AutomationExecutionLimitExceededException
     * @throws AutomationDefinitionVersionNotFoundException
     * @throws IdempotentParameterMismatchException
     * @throws InvalidTargetException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<StartAutomationExecutionResult> startAutomationExecutionAsync(
            final StartAutomationExecutionRequest startAutomationExecutionRequest,
            final AsyncHandler<StartAutomationExecutionRequest, StartAutomationExecutionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartAutomationExecutionResult>() {
            public StartAutomationExecutionResult call() throws Exception {
                StartAutomationExecutionResult result = null;
                try {
                    result = startAutomationExecution(startAutomationExecutionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(startAutomationExecutionRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Initiates a connection to a target (for example, an instance) for a
     * Session Manager session. Returns a URL and token that can be used to open
     * a WebSocket connection for sending input and receiving outputs.
     * </p>
     * <note>
     * <p>
     * AWS CLI usage: <code>start-session</code> is an interactive command that
     * requires the Session Manager plugin to be installed on the client machine
     * making the call. For information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/session-manager-working-with-install-plugin.html"
     * >Install the Session Manager plugin for the AWS CLI</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <p>
     * AWS Tools for PowerShell usage: Start-SSMSession is not currently
     * supported by AWS Tools for PowerShell on Windows local machines.
     * </p>
     * </note>
     * 
     * @param startSessionRequest
     * @return A Java Future object containing the response from the
     *         StartSession service method, as returned by Amazon Simple Systems
     *         Manager (SSM).
     * @throws InvalidDocumentException
     * @throws TargetNotConnectedException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<StartSessionResult> startSessionAsync(
            final StartSessionRequest startSessionRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<StartSessionResult>() {
            public StartSessionResult call() throws Exception {
                return startSession(startSessionRequest);
            }
        });
    }

    /**
     * <p>
     * Initiates a connection to a target (for example, an instance) for a
     * Session Manager session. Returns a URL and token that can be used to open
     * a WebSocket connection for sending input and receiving outputs.
     * </p>
     * <note>
     * <p>
     * AWS CLI usage: <code>start-session</code> is an interactive command that
     * requires the Session Manager plugin to be installed on the client machine
     * making the call. For information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/session-manager-working-with-install-plugin.html"
     * >Install the Session Manager plugin for the AWS CLI</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <p>
     * AWS Tools for PowerShell usage: Start-SSMSession is not currently
     * supported by AWS Tools for PowerShell on Windows local machines.
     * </p>
     * </note>
     * 
     * @param startSessionRequest
     * @return A Java Future object containing the response from the
     *         StartSession service method, as returned by Amazon Simple Systems
     *         Manager (SSM).
     * @throws InvalidDocumentException
     * @throws TargetNotConnectedException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<StartSessionResult> startSessionAsync(
            final StartSessionRequest startSessionRequest,
            final AsyncHandler<StartSessionRequest, StartSessionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartSessionResult>() {
            public StartSessionResult call() throws Exception {
                StartSessionResult result = null;
                try {
                    result = startSession(startSessionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(startSessionRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Stop an Automation that is currently running.
     * </p>
     * 
     * @param stopAutomationExecutionRequest
     * @return A Java Future object containing the response from the
     *         StopAutomationExecution service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws AutomationExecutionNotFoundException
     * @throws InvalidAutomationStatusUpdateException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<StopAutomationExecutionResult> stopAutomationExecutionAsync(
            final StopAutomationExecutionRequest stopAutomationExecutionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StopAutomationExecutionResult>() {
            public StopAutomationExecutionResult call() throws Exception {
                return stopAutomationExecution(stopAutomationExecutionRequest);
            }
        });
    }

    /**
     * <p>
     * Stop an Automation that is currently running.
     * </p>
     * 
     * @param stopAutomationExecutionRequest
     * @return A Java Future object containing the response from the
     *         StopAutomationExecution service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws AutomationExecutionNotFoundException
     * @throws InvalidAutomationStatusUpdateException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<StopAutomationExecutionResult> stopAutomationExecutionAsync(
            final StopAutomationExecutionRequest stopAutomationExecutionRequest,
            final AsyncHandler<StopAutomationExecutionRequest, StopAutomationExecutionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StopAutomationExecutionResult>() {
            public StopAutomationExecutionResult call() throws Exception {
                StopAutomationExecutionResult result = null;
                try {
                    result = stopAutomationExecution(stopAutomationExecutionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(stopAutomationExecutionRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Permanently ends a session and closes the data connection between the
     * Session Manager client and SSM Agent on the instance. A terminated
     * session cannot be resumed.
     * </p>
     * 
     * @param terminateSessionRequest
     * @return A Java Future object containing the response from the
     *         TerminateSession service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<TerminateSessionResult> terminateSessionAsync(
            final TerminateSessionRequest terminateSessionRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<TerminateSessionResult>() {
            public TerminateSessionResult call() throws Exception {
                return terminateSession(terminateSessionRequest);
            }
        });
    }

    /**
     * <p>
     * Permanently ends a session and closes the data connection between the
     * Session Manager client and SSM Agent on the instance. A terminated
     * session cannot be resumed.
     * </p>
     * 
     * @param terminateSessionRequest
     * @return A Java Future object containing the response from the
     *         TerminateSession service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<TerminateSessionResult> terminateSessionAsync(
            final TerminateSessionRequest terminateSessionRequest,
            final AsyncHandler<TerminateSessionRequest, TerminateSessionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<TerminateSessionResult>() {
            public TerminateSessionResult call() throws Exception {
                TerminateSessionResult result = null;
                try {
                    result = terminateSession(terminateSessionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(terminateSessionRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates an association. You can update the association name and version,
     * the document version, schedule, parameters, and Amazon S3 output.
     * </p>
     * <p>
     * In order to call this API action, your IAM user account, group, or role
     * must be configured with permission to call the <a>DescribeAssociation</a>
     * API action. If you don't have permission to call DescribeAssociation,
     * then you receive the following error:
     * <code>An error occurred (AccessDeniedException) when calling the UpdateAssociation operation: User: &lt;user_arn&gt; is not authorized to perform: ssm:DescribeAssociation on resource: &lt;resource_arn&gt;</code>
     * </p>
     * <important>
     * <p>
     * When you update an association, the association immediately runs against
     * the specified targets.
     * </p>
     * </important>
     * 
     * @param updateAssociationRequest
     * @return A Java Future object containing the response from the
     *         UpdateAssociation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidScheduleException
     * @throws InvalidParametersException
     * @throws InvalidOutputLocationException
     * @throws InvalidDocumentVersionException
     * @throws AssociationDoesNotExistException
     * @throws InvalidUpdateException
     * @throws TooManyUpdatesException
     * @throws InvalidDocumentException
     * @throws InvalidTargetException
     * @throws InvalidAssociationVersionException
     * @throws AssociationVersionLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UpdateAssociationResult> updateAssociationAsync(
            final UpdateAssociationRequest updateAssociationRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<UpdateAssociationResult>() {
            public UpdateAssociationResult call() throws Exception {
                return updateAssociation(updateAssociationRequest);
            }
        });
    }

    /**
     * <p>
     * Updates an association. You can update the association name and version,
     * the document version, schedule, parameters, and Amazon S3 output.
     * </p>
     * <p>
     * In order to call this API action, your IAM user account, group, or role
     * must be configured with permission to call the <a>DescribeAssociation</a>
     * API action. If you don't have permission to call DescribeAssociation,
     * then you receive the following error:
     * <code>An error occurred (AccessDeniedException) when calling the UpdateAssociation operation: User: &lt;user_arn&gt; is not authorized to perform: ssm:DescribeAssociation on resource: &lt;resource_arn&gt;</code>
     * </p>
     * <important>
     * <p>
     * When you update an association, the association immediately runs against
     * the specified targets.
     * </p>
     * </important>
     * 
     * @param updateAssociationRequest
     * @return A Java Future object containing the response from the
     *         UpdateAssociation service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidScheduleException
     * @throws InvalidParametersException
     * @throws InvalidOutputLocationException
     * @throws InvalidDocumentVersionException
     * @throws AssociationDoesNotExistException
     * @throws InvalidUpdateException
     * @throws TooManyUpdatesException
     * @throws InvalidDocumentException
     * @throws InvalidTargetException
     * @throws InvalidAssociationVersionException
     * @throws AssociationVersionLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UpdateAssociationResult> updateAssociationAsync(
            final UpdateAssociationRequest updateAssociationRequest,
            final AsyncHandler<UpdateAssociationRequest, UpdateAssociationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateAssociationResult>() {
            public UpdateAssociationResult call() throws Exception {
                UpdateAssociationResult result = null;
                try {
                    result = updateAssociation(updateAssociationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateAssociationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates the status of the Systems Manager document associated with the
     * specified instance.
     * </p>
     * 
     * @param updateAssociationStatusRequest
     * @return A Java Future object containing the response from the
     *         UpdateAssociationStatus service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidDocumentException
     * @throws AssociationDoesNotExistException
     * @throws StatusUnchangedException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UpdateAssociationStatusResult> updateAssociationStatusAsync(
            final UpdateAssociationStatusRequest updateAssociationStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateAssociationStatusResult>() {
            public UpdateAssociationStatusResult call() throws Exception {
                return updateAssociationStatus(updateAssociationStatusRequest);
            }
        });
    }

    /**
     * <p>
     * Updates the status of the Systems Manager document associated with the
     * specified instance.
     * </p>
     * 
     * @param updateAssociationStatusRequest
     * @return A Java Future object containing the response from the
     *         UpdateAssociationStatus service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidInstanceIdException
     * @throws InvalidDocumentException
     * @throws AssociationDoesNotExistException
     * @throws StatusUnchangedException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UpdateAssociationStatusResult> updateAssociationStatusAsync(
            final UpdateAssociationStatusRequest updateAssociationStatusRequest,
            final AsyncHandler<UpdateAssociationStatusRequest, UpdateAssociationStatusResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateAssociationStatusResult>() {
            public UpdateAssociationStatusResult call() throws Exception {
                UpdateAssociationStatusResult result = null;
                try {
                    result = updateAssociationStatus(updateAssociationStatusRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateAssociationStatusRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates one or more values for an SSM document.
     * </p>
     * 
     * @param updateDocumentRequest
     * @return A Java Future object containing the response from the
     *         UpdateDocument service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws MaxDocumentSizeExceededException
     * @throws DocumentVersionLimitExceededException
     * @throws InternalServerErrorException
     * @throws DuplicateDocumentContentException
     * @throws DuplicateDocumentVersionNameException
     * @throws InvalidDocumentContentException
     * @throws InvalidDocumentVersionException
     * @throws InvalidDocumentSchemaVersionException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UpdateDocumentResult> updateDocumentAsync(
            final UpdateDocumentRequest updateDocumentRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<UpdateDocumentResult>() {
            public UpdateDocumentResult call() throws Exception {
                return updateDocument(updateDocumentRequest);
            }
        });
    }

    /**
     * <p>
     * Updates one or more values for an SSM document.
     * </p>
     * 
     * @param updateDocumentRequest
     * @return A Java Future object containing the response from the
     *         UpdateDocument service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws MaxDocumentSizeExceededException
     * @throws DocumentVersionLimitExceededException
     * @throws InternalServerErrorException
     * @throws DuplicateDocumentContentException
     * @throws DuplicateDocumentVersionNameException
     * @throws InvalidDocumentContentException
     * @throws InvalidDocumentVersionException
     * @throws InvalidDocumentSchemaVersionException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UpdateDocumentResult> updateDocumentAsync(
            final UpdateDocumentRequest updateDocumentRequest,
            final AsyncHandler<UpdateDocumentRequest, UpdateDocumentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateDocumentResult>() {
            public UpdateDocumentResult call() throws Exception {
                UpdateDocumentResult result = null;
                try {
                    result = updateDocument(updateDocumentRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateDocumentRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Set the default version of a document.
     * </p>
     * 
     * @param updateDocumentDefaultVersionRequest
     * @return A Java Future object containing the response from the
     *         UpdateDocumentDefaultVersion service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws InvalidDocumentSchemaVersionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UpdateDocumentDefaultVersionResult> updateDocumentDefaultVersionAsync(
            final UpdateDocumentDefaultVersionRequest updateDocumentDefaultVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateDocumentDefaultVersionResult>() {
            public UpdateDocumentDefaultVersionResult call() throws Exception {
                return updateDocumentDefaultVersion(updateDocumentDefaultVersionRequest);
            }
        });
    }

    /**
     * <p>
     * Set the default version of a document.
     * </p>
     * 
     * @param updateDocumentDefaultVersionRequest
     * @return A Java Future object containing the response from the
     *         UpdateDocumentDefaultVersion service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws InvalidDocumentException
     * @throws InvalidDocumentVersionException
     * @throws InvalidDocumentSchemaVersionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UpdateDocumentDefaultVersionResult> updateDocumentDefaultVersionAsync(
            final UpdateDocumentDefaultVersionRequest updateDocumentDefaultVersionRequest,
            final AsyncHandler<UpdateDocumentDefaultVersionRequest, UpdateDocumentDefaultVersionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateDocumentDefaultVersionResult>() {
            public UpdateDocumentDefaultVersionResult call() throws Exception {
                UpdateDocumentDefaultVersionResult result = null;
                try {
                    result = updateDocumentDefaultVersion(updateDocumentDefaultVersionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateDocumentDefaultVersionRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates an existing maintenance window. Only specified parameters are
     * modified.
     * </p>
     * <note>
     * <p>
     * The value you specify for <code>Duration</code> determines the specific
     * end time for the maintenance window based on the time it begins. No
     * maintenance window tasks are permitted to start after the resulting
     * endtime minus the number of hours you specify for <code>Cutoff</code>.
     * For example, if the maintenance window starts at 3 PM, the duration is
     * three hours, and the value you specify for <code>Cutoff</code> is one
     * hour, no maintenance window tasks can start after 5 PM.
     * </p>
     * </note>
     * 
     * @param updateMaintenanceWindowRequest
     * @return A Java Future object containing the response from the
     *         UpdateMaintenanceWindow service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UpdateMaintenanceWindowResult> updateMaintenanceWindowAsync(
            final UpdateMaintenanceWindowRequest updateMaintenanceWindowRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateMaintenanceWindowResult>() {
            public UpdateMaintenanceWindowResult call() throws Exception {
                return updateMaintenanceWindow(updateMaintenanceWindowRequest);
            }
        });
    }

    /**
     * <p>
     * Updates an existing maintenance window. Only specified parameters are
     * modified.
     * </p>
     * <note>
     * <p>
     * The value you specify for <code>Duration</code> determines the specific
     * end time for the maintenance window based on the time it begins. No
     * maintenance window tasks are permitted to start after the resulting
     * endtime minus the number of hours you specify for <code>Cutoff</code>.
     * For example, if the maintenance window starts at 3 PM, the duration is
     * three hours, and the value you specify for <code>Cutoff</code> is one
     * hour, no maintenance window tasks can start after 5 PM.
     * </p>
     * </note>
     * 
     * @param updateMaintenanceWindowRequest
     * @return A Java Future object containing the response from the
     *         UpdateMaintenanceWindow service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UpdateMaintenanceWindowResult> updateMaintenanceWindowAsync(
            final UpdateMaintenanceWindowRequest updateMaintenanceWindowRequest,
            final AsyncHandler<UpdateMaintenanceWindowRequest, UpdateMaintenanceWindowResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateMaintenanceWindowResult>() {
            public UpdateMaintenanceWindowResult call() throws Exception {
                UpdateMaintenanceWindowResult result = null;
                try {
                    result = updateMaintenanceWindow(updateMaintenanceWindowRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateMaintenanceWindowRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Modifies the target of an existing maintenance window. You can change the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Name
     * </p>
     * </li>
     * <li>
     * <p>
     * Description
     * </p>
     * </li>
     * <li>
     * <p>
     * Owner
     * </p>
     * </li>
     * <li>
     * <p>
     * IDs for an ID target
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags for a Tag target
     * </p>
     * </li>
     * <li>
     * <p>
     * From any supported tag type to another. The three supported tag types are
     * ID target, Tag target, and resource group. For more information, see
     * <a>Target</a>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If a parameter is null, then the corresponding field is not modified.
     * </p>
     * </note>
     * 
     * @param updateMaintenanceWindowTargetRequest
     * @return A Java Future object containing the response from the
     *         UpdateMaintenanceWindowTarget service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UpdateMaintenanceWindowTargetResult> updateMaintenanceWindowTargetAsync(
            final UpdateMaintenanceWindowTargetRequest updateMaintenanceWindowTargetRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateMaintenanceWindowTargetResult>() {
            public UpdateMaintenanceWindowTargetResult call() throws Exception {
                return updateMaintenanceWindowTarget(updateMaintenanceWindowTargetRequest);
            }
        });
    }

    /**
     * <p>
     * Modifies the target of an existing maintenance window. You can change the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Name
     * </p>
     * </li>
     * <li>
     * <p>
     * Description
     * </p>
     * </li>
     * <li>
     * <p>
     * Owner
     * </p>
     * </li>
     * <li>
     * <p>
     * IDs for an ID target
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags for a Tag target
     * </p>
     * </li>
     * <li>
     * <p>
     * From any supported tag type to another. The three supported tag types are
     * ID target, Tag target, and resource group. For more information, see
     * <a>Target</a>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If a parameter is null, then the corresponding field is not modified.
     * </p>
     * </note>
     * 
     * @param updateMaintenanceWindowTargetRequest
     * @return A Java Future object containing the response from the
     *         UpdateMaintenanceWindowTarget service method, as returned by
     *         Amazon Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UpdateMaintenanceWindowTargetResult> updateMaintenanceWindowTargetAsync(
            final UpdateMaintenanceWindowTargetRequest updateMaintenanceWindowTargetRequest,
            final AsyncHandler<UpdateMaintenanceWindowTargetRequest, UpdateMaintenanceWindowTargetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateMaintenanceWindowTargetResult>() {
            public UpdateMaintenanceWindowTargetResult call() throws Exception {
                UpdateMaintenanceWindowTargetResult result = null;
                try {
                    result = updateMaintenanceWindowTarget(updateMaintenanceWindowTargetRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateMaintenanceWindowTargetRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Modifies a task assigned to a maintenance window. You can't change the
     * task type, but you can change the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TaskARN. For example, you can change a RUN_COMMAND task from
     * AWS-RunPowerShellScript to AWS-RunShellScript.
     * </p>
     * </li>
     * <li>
     * <p>
     * ServiceRoleArn
     * </p>
     * </li>
     * <li>
     * <p>
     * TaskInvocationParameters
     * </p>
     * </li>
     * <li>
     * <p>
     * Priority
     * </p>
     * </li>
     * <li>
     * <p>
     * MaxConcurrency
     * </p>
     * </li>
     * <li>
     * <p>
     * MaxErrors
     * </p>
     * </li>
     * </ul>
     * <p>
     * If a parameter is null, then the corresponding field is not modified.
     * Also, if you set Replace to true, then all fields required by the
     * <a>RegisterTaskWithMaintenanceWindow</a> action are required for this
     * request. Optional fields that aren't specified are set to null.
     * </p>
     * 
     * @param updateMaintenanceWindowTaskRequest
     * @return A Java Future object containing the response from the
     *         UpdateMaintenanceWindowTask service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UpdateMaintenanceWindowTaskResult> updateMaintenanceWindowTaskAsync(
            final UpdateMaintenanceWindowTaskRequest updateMaintenanceWindowTaskRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateMaintenanceWindowTaskResult>() {
            public UpdateMaintenanceWindowTaskResult call() throws Exception {
                return updateMaintenanceWindowTask(updateMaintenanceWindowTaskRequest);
            }
        });
    }

    /**
     * <p>
     * Modifies a task assigned to a maintenance window. You can't change the
     * task type, but you can change the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TaskARN. For example, you can change a RUN_COMMAND task from
     * AWS-RunPowerShellScript to AWS-RunShellScript.
     * </p>
     * </li>
     * <li>
     * <p>
     * ServiceRoleArn
     * </p>
     * </li>
     * <li>
     * <p>
     * TaskInvocationParameters
     * </p>
     * </li>
     * <li>
     * <p>
     * Priority
     * </p>
     * </li>
     * <li>
     * <p>
     * MaxConcurrency
     * </p>
     * </li>
     * <li>
     * <p>
     * MaxErrors
     * </p>
     * </li>
     * </ul>
     * <p>
     * If a parameter is null, then the corresponding field is not modified.
     * Also, if you set Replace to true, then all fields required by the
     * <a>RegisterTaskWithMaintenanceWindow</a> action are required for this
     * request. Optional fields that aren't specified are set to null.
     * </p>
     * 
     * @param updateMaintenanceWindowTaskRequest
     * @return A Java Future object containing the response from the
     *         UpdateMaintenanceWindowTask service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UpdateMaintenanceWindowTaskResult> updateMaintenanceWindowTaskAsync(
            final UpdateMaintenanceWindowTaskRequest updateMaintenanceWindowTaskRequest,
            final AsyncHandler<UpdateMaintenanceWindowTaskRequest, UpdateMaintenanceWindowTaskResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateMaintenanceWindowTaskResult>() {
            public UpdateMaintenanceWindowTaskResult call() throws Exception {
                UpdateMaintenanceWindowTaskResult result = null;
                try {
                    result = updateMaintenanceWindowTask(updateMaintenanceWindowTaskRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateMaintenanceWindowTaskRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Changes the Amazon Identity and Access Management (IAM) role that is
     * assigned to the on-premises instance or virtual machines (VM). IAM roles
     * are first assigned to these hybrid instances during the activation
     * process. For more information, see <a>CreateActivation</a>.
     * </p>
     * 
     * @param updateManagedInstanceRoleRequest
     * @return A Java Future object containing the response from the
     *         UpdateManagedInstanceRole service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InvalidInstanceIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UpdateManagedInstanceRoleResult> updateManagedInstanceRoleAsync(
            final UpdateManagedInstanceRoleRequest updateManagedInstanceRoleRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateManagedInstanceRoleResult>() {
            public UpdateManagedInstanceRoleResult call() throws Exception {
                return updateManagedInstanceRole(updateManagedInstanceRoleRequest);
            }
        });
    }

    /**
     * <p>
     * Changes the Amazon Identity and Access Management (IAM) role that is
     * assigned to the on-premises instance or virtual machines (VM). IAM roles
     * are first assigned to these hybrid instances during the activation
     * process. For more information, see <a>CreateActivation</a>.
     * </p>
     * 
     * @param updateManagedInstanceRoleRequest
     * @return A Java Future object containing the response from the
     *         UpdateManagedInstanceRole service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws InvalidInstanceIdException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UpdateManagedInstanceRoleResult> updateManagedInstanceRoleAsync(
            final UpdateManagedInstanceRoleRequest updateManagedInstanceRoleRequest,
            final AsyncHandler<UpdateManagedInstanceRoleRequest, UpdateManagedInstanceRoleResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateManagedInstanceRoleResult>() {
            public UpdateManagedInstanceRoleResult call() throws Exception {
                UpdateManagedInstanceRoleResult result = null;
                try {
                    result = updateManagedInstanceRole(updateManagedInstanceRoleRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateManagedInstanceRoleRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Edit or change an OpsItem. You must have permission in AWS Identity and
     * Access Management (IAM) to update an OpsItem. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
     * >Getting started with OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view,
     * investigate, and remediate operational issues impacting the performance
     * and health of their AWS resources. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
     * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param updateOpsItemRequest
     * @return A Java Future object containing the response from the
     *         UpdateOpsItem service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws OpsItemNotFoundException
     * @throws OpsItemAlreadyExistsException
     * @throws OpsItemLimitExceededException
     * @throws OpsItemInvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UpdateOpsItemResult> updateOpsItemAsync(
            final UpdateOpsItemRequest updateOpsItemRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<UpdateOpsItemResult>() {
            public UpdateOpsItemResult call() throws Exception {
                return updateOpsItem(updateOpsItemRequest);
            }
        });
    }

    /**
     * <p>
     * Edit or change an OpsItem. You must have permission in AWS Identity and
     * Access Management (IAM) to update an OpsItem. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
     * >Getting started with OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use OpsCenter to view,
     * investigate, and remediate operational issues impacting the performance
     * and health of their AWS resources. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
     * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * 
     * @param updateOpsItemRequest
     * @return A Java Future object containing the response from the
     *         UpdateOpsItem service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws OpsItemNotFoundException
     * @throws OpsItemAlreadyExistsException
     * @throws OpsItemLimitExceededException
     * @throws OpsItemInvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UpdateOpsItemResult> updateOpsItemAsync(
            final UpdateOpsItemRequest updateOpsItemRequest,
            final AsyncHandler<UpdateOpsItemRequest, UpdateOpsItemResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateOpsItemResult>() {
            public UpdateOpsItemResult call() throws Exception {
                UpdateOpsItemResult result = null;
                try {
                    result = updateOpsItem(updateOpsItemRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateOpsItemRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Modifies an existing patch baseline. Fields not specified in the request
     * are left unchanged.
     * </p>
     * <note>
     * <p>
     * For information about valid key and value pairs in
     * <code>PatchFilters</code> for each supported operating system type, see
     * <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html"
     * >PatchFilter</a>.
     * </p>
     * </note>
     * 
     * @param updatePatchBaselineRequest
     * @return A Java Future object containing the response from the
     *         UpdatePatchBaseline service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UpdatePatchBaselineResult> updatePatchBaselineAsync(
            final UpdatePatchBaselineRequest updatePatchBaselineRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdatePatchBaselineResult>() {
            public UpdatePatchBaselineResult call() throws Exception {
                return updatePatchBaseline(updatePatchBaselineRequest);
            }
        });
    }

    /**
     * <p>
     * Modifies an existing patch baseline. Fields not specified in the request
     * are left unchanged.
     * </p>
     * <note>
     * <p>
     * For information about valid key and value pairs in
     * <code>PatchFilters</code> for each supported operating system type, see
     * <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html"
     * >PatchFilter</a>.
     * </p>
     * </note>
     * 
     * @param updatePatchBaselineRequest
     * @return A Java Future object containing the response from the
     *         UpdatePatchBaseline service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws DoesNotExistException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UpdatePatchBaselineResult> updatePatchBaselineAsync(
            final UpdatePatchBaselineRequest updatePatchBaselineRequest,
            final AsyncHandler<UpdatePatchBaselineRequest, UpdatePatchBaselineResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdatePatchBaselineResult>() {
            public UpdatePatchBaselineResult call() throws Exception {
                UpdatePatchBaselineResult result = null;
                try {
                    result = updatePatchBaseline(updatePatchBaselineRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updatePatchBaselineRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Update a resource data sync. After you create a resource data sync for a
     * Region, you can't change the account options for that sync. For example,
     * if you create a sync in the us-east-2 (Ohio) Region and you choose the
     * Include only the current account option, you can't edit that sync later
     * and choose the Include all accounts from my AWS Organizations
     * configuration option. Instead, you must delete the first resource data
     * sync, and create a new one.
     * </p>
     * <note>
     * <p>
     * This API action only supports a resource data sync that was created with
     * a SyncFromSource <code>SyncType</code>.
     * </p>
     * </note>
     * 
     * @param updateResourceDataSyncRequest
     * @return A Java Future object containing the response from the
     *         UpdateResourceDataSync service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws ResourceDataSyncNotFoundException
     * @throws ResourceDataSyncInvalidConfigurationException
     * @throws ResourceDataSyncConflictException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UpdateResourceDataSyncResult> updateResourceDataSyncAsync(
            final UpdateResourceDataSyncRequest updateResourceDataSyncRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateResourceDataSyncResult>() {
            public UpdateResourceDataSyncResult call() throws Exception {
                return updateResourceDataSync(updateResourceDataSyncRequest);
            }
        });
    }

    /**
     * <p>
     * Update a resource data sync. After you create a resource data sync for a
     * Region, you can't change the account options for that sync. For example,
     * if you create a sync in the us-east-2 (Ohio) Region and you choose the
     * Include only the current account option, you can't edit that sync later
     * and choose the Include all accounts from my AWS Organizations
     * configuration option. Instead, you must delete the first resource data
     * sync, and create a new one.
     * </p>
     * <note>
     * <p>
     * This API action only supports a resource data sync that was created with
     * a SyncFromSource <code>SyncType</code>.
     * </p>
     * </note>
     * 
     * @param updateResourceDataSyncRequest
     * @return A Java Future object containing the response from the
     *         UpdateResourceDataSync service method, as returned by Amazon
     *         Simple Systems Manager (SSM).
     * @throws ResourceDataSyncNotFoundException
     * @throws ResourceDataSyncInvalidConfigurationException
     * @throws ResourceDataSyncConflictException
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UpdateResourceDataSyncResult> updateResourceDataSyncAsync(
            final UpdateResourceDataSyncRequest updateResourceDataSyncRequest,
            final AsyncHandler<UpdateResourceDataSyncRequest, UpdateResourceDataSyncResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateResourceDataSyncResult>() {
            public UpdateResourceDataSyncResult call() throws Exception {
                UpdateResourceDataSyncResult result = null;
                try {
                    result = updateResourceDataSync(updateResourceDataSyncRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateResourceDataSyncRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * <code>ServiceSetting</code> is an account-level setting for an AWS
     * service. This setting defines how a user interacts with or uses a service
     * or a feature of a service. For example, if an AWS service charges money
     * to the account based on feature or service usage, then the AWS service
     * team might create a default setting of "false". This means the user can't
     * use this feature unless they change the setting to "true" and
     * intentionally opt in for a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS
     * services teams define the default value for a <code>SettingId</code>. You
     * can't create a new <code>SettingId</code>, but you can overwrite the
     * default value if you have the <code>ssm:UpdateServiceSetting</code>
     * permission for the setting. Use the <a>GetServiceSetting</a> API action
     * to view the current value. Or, use the <a>ResetServiceSetting</a> to
     * change the value back to the original value defined by the AWS service
     * team.
     * </p>
     * <p>
     * Update the service setting for the account.
     * </p>
     * 
     * @param updateServiceSettingRequest <p>
     *            The request body of the UpdateServiceSetting API action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         UpdateServiceSetting service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ServiceSettingNotFoundException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UpdateServiceSettingResult> updateServiceSettingAsync(
            final UpdateServiceSettingRequest updateServiceSettingRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateServiceSettingResult>() {
            public UpdateServiceSettingResult call() throws Exception {
                return updateServiceSetting(updateServiceSettingRequest);
            }
        });
    }

    /**
     * <p>
     * <code>ServiceSetting</code> is an account-level setting for an AWS
     * service. This setting defines how a user interacts with or uses a service
     * or a feature of a service. For example, if an AWS service charges money
     * to the account based on feature or service usage, then the AWS service
     * team might create a default setting of "false". This means the user can't
     * use this feature unless they change the setting to "true" and
     * intentionally opt in for a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS
     * services teams define the default value for a <code>SettingId</code>. You
     * can't create a new <code>SettingId</code>, but you can overwrite the
     * default value if you have the <code>ssm:UpdateServiceSetting</code>
     * permission for the setting. Use the <a>GetServiceSetting</a> API action
     * to view the current value. Or, use the <a>ResetServiceSetting</a> to
     * change the value back to the original value defined by the AWS service
     * team.
     * </p>
     * <p>
     * Update the service setting for the account.
     * </p>
     * 
     * @param updateServiceSettingRequest <p>
     *            The request body of the UpdateServiceSetting API action.
     *            </p>
     * @return A Java Future object containing the response from the
     *         UpdateServiceSetting service method, as returned by Amazon Simple
     *         Systems Manager (SSM).
     * @throws InternalServerErrorException
     * @throws ServiceSettingNotFoundException
     * @throws TooManyUpdatesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Systems Manager (SSM) indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public Future<UpdateServiceSettingResult> updateServiceSettingAsync(
            final UpdateServiceSettingRequest updateServiceSettingRequest,
            final AsyncHandler<UpdateServiceSettingRequest, UpdateServiceSettingResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateServiceSettingResult>() {
            public UpdateServiceSettingResult call() throws Exception {
                UpdateServiceSettingResult result = null;
                try {
                    result = updateServiceSetting(updateServiceSettingRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateServiceSettingRequest, result);
                return result;
            }
        });
    }

}
