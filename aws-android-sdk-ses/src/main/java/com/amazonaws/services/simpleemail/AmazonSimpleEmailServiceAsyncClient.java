/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail;

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

import com.amazonaws.services.simpleemail.model.*;

/**
 * Interface for accessing Amazon Simple Email Service asynchronously.
 * <fullname>Amazon Simple Email Service</fullname>
 * <p>
 * This document contains reference information for the <a
 * href="https://aws.amazon.com/ses/">Amazon Simple Email Service</a> (Amazon
 * SES) API, version 2010-12-01. This document is best used in conjunction with
 * the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/Welcome.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 * <note>
 * <p>
 * For a list of Amazon SES endpoints to use in service requests, see <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/regions.html"
 * >Regions and Amazon SES</a> in the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/Welcome.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 * </note>
 **/
public class AmazonSimpleEmailServiceAsyncClient extends AmazonSimpleEmailServiceClient implements
        AmazonSimpleEmailServiceAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 10;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Email Service. A credentials provider chain will be used that
     * searches for credentials in this order:
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
    public AmazonSimpleEmailServiceAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Email Service. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     *            how this client connects to Amazon Simple Email Service (ex:
     *            proxy settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonSimpleEmailServiceAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Email Service using the specified AWS account credentials. Default
     * client settings will be used, and a fixed size thread pool will be
     * created for executing the asynchronous tasks.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     */
    public AmazonSimpleEmailServiceAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Email Service using the specified AWS account credentials and
     * executor service. Default client settings will be used.
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
    public AmazonSimpleEmailServiceAsyncClient(AWSCredentials awsCredentials,
            ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Email Service using the specified AWS account credentials,
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
    public AmazonSimpleEmailServiceAsyncClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Email Service using the specified AWS account credentials
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
    public AmazonSimpleEmailServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Email Service using the specified AWS account credentials provider
     * and executor service. Default client settings will be used.
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
    public AmazonSimpleEmailServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Email Service using the specified AWS account credentials provider
     * and client configuration options.
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
    public AmazonSimpleEmailServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors
                .newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Simple Email Service using the specified AWS account credentials
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
    public AmazonSimpleEmailServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Creates a receipt rule set by cloning an existing one. All receipt rules
     * and configurations are copied to the new receipt rule set and are
     * completely independent of the source rule set.
     * </p>
     * <p>
     * For information about setting up rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param cloneReceiptRuleSetRequest <p>
     *            Represents a request to create a receipt rule set by cloning
     *            an existing one. You use receipt rule sets to receive email
     *            with Amazon SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CloneReceiptRuleSet service method, as returned by Amazon Simple
     *         Email Service.
     * @throws RuleSetDoesNotExistException
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CloneReceiptRuleSetResult> cloneReceiptRuleSetAsync(
            final CloneReceiptRuleSetRequest cloneReceiptRuleSetRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CloneReceiptRuleSetResult>() {
            public CloneReceiptRuleSetResult call() throws Exception {
                return cloneReceiptRuleSet(cloneReceiptRuleSetRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a receipt rule set by cloning an existing one. All receipt rules
     * and configurations are copied to the new receipt rule set and are
     * completely independent of the source rule set.
     * </p>
     * <p>
     * For information about setting up rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param cloneReceiptRuleSetRequest <p>
     *            Represents a request to create a receipt rule set by cloning
     *            an existing one. You use receipt rule sets to receive email
     *            with Amazon SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CloneReceiptRuleSet service method, as returned by Amazon Simple
     *         Email Service.
     * @throws RuleSetDoesNotExistException
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CloneReceiptRuleSetResult> cloneReceiptRuleSetAsync(
            final CloneReceiptRuleSetRequest cloneReceiptRuleSetRequest,
            final AsyncHandler<CloneReceiptRuleSetRequest, CloneReceiptRuleSetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CloneReceiptRuleSetResult>() {
            public CloneReceiptRuleSetResult call() throws Exception {
                CloneReceiptRuleSetResult result = null;
                try {
                    result = cloneReceiptRuleSet(cloneReceiptRuleSetRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(cloneReceiptRuleSetRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a configuration set.
     * </p>
     * <p>
     * Configuration sets enable you to publish email sending events. For
     * information about using configuration sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createConfigurationSetRequest <p>
     *            Represents a request to create a configuration set.
     *            Configuration sets enable you to publish email sending events.
     *            For information about using configuration sets, see the <a
     *            href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreateConfigurationSet service method, as returned by Amazon
     *         Simple Email Service.
     * @throws ConfigurationSetAlreadyExistsException
     * @throws InvalidConfigurationSetException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CreateConfigurationSetResult> createConfigurationSetAsync(
            final CreateConfigurationSetRequest createConfigurationSetRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateConfigurationSetResult>() {
            public CreateConfigurationSetResult call() throws Exception {
                return createConfigurationSet(createConfigurationSetRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a configuration set.
     * </p>
     * <p>
     * Configuration sets enable you to publish email sending events. For
     * information about using configuration sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createConfigurationSetRequest <p>
     *            Represents a request to create a configuration set.
     *            Configuration sets enable you to publish email sending events.
     *            For information about using configuration sets, see the <a
     *            href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreateConfigurationSet service method, as returned by Amazon
     *         Simple Email Service.
     * @throws ConfigurationSetAlreadyExistsException
     * @throws InvalidConfigurationSetException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CreateConfigurationSetResult> createConfigurationSetAsync(
            final CreateConfigurationSetRequest createConfigurationSetRequest,
            final AsyncHandler<CreateConfigurationSetRequest, CreateConfigurationSetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateConfigurationSetResult>() {
            public CreateConfigurationSetResult call() throws Exception {
                CreateConfigurationSetResult result = null;
                try {
                    result = createConfigurationSet(createConfigurationSetRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createConfigurationSetRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a configuration set event destination.
     * </p>
     * <note>
     * <p>
     * When you create or update an event destination, you must provide one, and
     * only one, destination. The destination can be CloudWatch, Amazon Kinesis
     * Firehose, or Amazon Simple Notification Service (Amazon SNS).
     * </p>
     * </note>
     * <p>
     * An event destination is the AWS service to which Amazon SES publishes the
     * email sending events associated with a configuration set. For information
     * about using configuration sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createConfigurationSetEventDestinationRequest <p>
     *            Represents a request to create a configuration set event
     *            destination. A configuration set event destination, which can
     *            be either Amazon CloudWatch or Amazon Kinesis Firehose,
     *            describes an AWS service in which Amazon SES publishes the
     *            email sending events associated with a configuration set. For
     *            information about using configuration sets, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreateConfigurationSetEventDestination service method, as
     *         returned by Amazon Simple Email Service.
     * @throws ConfigurationSetDoesNotExistException
     * @throws EventDestinationAlreadyExistsException
     * @throws InvalidCloudWatchDestinationException
     * @throws InvalidFirehoseDestinationException
     * @throws InvalidSNSDestinationException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CreateConfigurationSetEventDestinationResult> createConfigurationSetEventDestinationAsync(
            final CreateConfigurationSetEventDestinationRequest createConfigurationSetEventDestinationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateConfigurationSetEventDestinationResult>() {
            public CreateConfigurationSetEventDestinationResult call() throws Exception {
                return createConfigurationSetEventDestination(createConfigurationSetEventDestinationRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a configuration set event destination.
     * </p>
     * <note>
     * <p>
     * When you create or update an event destination, you must provide one, and
     * only one, destination. The destination can be CloudWatch, Amazon Kinesis
     * Firehose, or Amazon Simple Notification Service (Amazon SNS).
     * </p>
     * </note>
     * <p>
     * An event destination is the AWS service to which Amazon SES publishes the
     * email sending events associated with a configuration set. For information
     * about using configuration sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createConfigurationSetEventDestinationRequest <p>
     *            Represents a request to create a configuration set event
     *            destination. A configuration set event destination, which can
     *            be either Amazon CloudWatch or Amazon Kinesis Firehose,
     *            describes an AWS service in which Amazon SES publishes the
     *            email sending events associated with a configuration set. For
     *            information about using configuration sets, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreateConfigurationSetEventDestination service method, as
     *         returned by Amazon Simple Email Service.
     * @throws ConfigurationSetDoesNotExistException
     * @throws EventDestinationAlreadyExistsException
     * @throws InvalidCloudWatchDestinationException
     * @throws InvalidFirehoseDestinationException
     * @throws InvalidSNSDestinationException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CreateConfigurationSetEventDestinationResult> createConfigurationSetEventDestinationAsync(
            final CreateConfigurationSetEventDestinationRequest createConfigurationSetEventDestinationRequest,
            final AsyncHandler<CreateConfigurationSetEventDestinationRequest, CreateConfigurationSetEventDestinationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateConfigurationSetEventDestinationResult>() {
            public CreateConfigurationSetEventDestinationResult call() throws Exception {
                CreateConfigurationSetEventDestinationResult result = null;
                try {
                    result = createConfigurationSetEventDestination(createConfigurationSetEventDestinationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createConfigurationSetEventDestinationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates an association between a configuration set and a custom domain
     * for open and click event tracking.
     * </p>
     * <p>
     * By default, images and links used for tracking open and click events are
     * hosted on domains operated by Amazon SES. You can configure a subdomain
     * of your own to handle these events. For information about using custom
     * domains, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/configure-custom-open-click-domains.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param createConfigurationSetTrackingOptionsRequest <p>
     *            Represents a request to create an open and click tracking
     *            option object in a configuration set.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreateConfigurationSetTrackingOptions service method, as returned
     *         by Amazon Simple Email Service.
     * @throws ConfigurationSetDoesNotExistException
     * @throws TrackingOptionsAlreadyExistsException
     * @throws InvalidTrackingOptionsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CreateConfigurationSetTrackingOptionsResult> createConfigurationSetTrackingOptionsAsync(
            final CreateConfigurationSetTrackingOptionsRequest createConfigurationSetTrackingOptionsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateConfigurationSetTrackingOptionsResult>() {
            public CreateConfigurationSetTrackingOptionsResult call() throws Exception {
                return createConfigurationSetTrackingOptions(createConfigurationSetTrackingOptionsRequest);
            }
        });
    }

    /**
     * <p>
     * Creates an association between a configuration set and a custom domain
     * for open and click event tracking.
     * </p>
     * <p>
     * By default, images and links used for tracking open and click events are
     * hosted on domains operated by Amazon SES. You can configure a subdomain
     * of your own to handle these events. For information about using custom
     * domains, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/configure-custom-open-click-domains.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param createConfigurationSetTrackingOptionsRequest <p>
     *            Represents a request to create an open and click tracking
     *            option object in a configuration set.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreateConfigurationSetTrackingOptions service method, as returned
     *         by Amazon Simple Email Service.
     * @throws ConfigurationSetDoesNotExistException
     * @throws TrackingOptionsAlreadyExistsException
     * @throws InvalidTrackingOptionsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CreateConfigurationSetTrackingOptionsResult> createConfigurationSetTrackingOptionsAsync(
            final CreateConfigurationSetTrackingOptionsRequest createConfigurationSetTrackingOptionsRequest,
            final AsyncHandler<CreateConfigurationSetTrackingOptionsRequest, CreateConfigurationSetTrackingOptionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateConfigurationSetTrackingOptionsResult>() {
            public CreateConfigurationSetTrackingOptionsResult call() throws Exception {
                CreateConfigurationSetTrackingOptionsResult result = null;
                try {
                    result = createConfigurationSetTrackingOptions(createConfigurationSetTrackingOptionsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createConfigurationSetTrackingOptionsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a new custom verification email template.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html"
     * >Using Custom Verification Email Templates</a> in the <i>Amazon SES
     * Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createCustomVerificationEmailTemplateRequest <p>
     *            Represents a request to create a custom verification email
     *            template.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreateCustomVerificationEmailTemplate service method, as returned
     *         by Amazon Simple Email Service.
     * @throws CustomVerificationEmailTemplateAlreadyExistsException
     * @throws FromEmailAddressNotVerifiedException
     * @throws CustomVerificationEmailInvalidContentException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<Void> createCustomVerificationEmailTemplateAsync(
            final CreateCustomVerificationEmailTemplateRequest createCustomVerificationEmailTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                createCustomVerificationEmailTemplate(createCustomVerificationEmailTemplateRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Creates a new custom verification email template.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html"
     * >Using Custom Verification Email Templates</a> in the <i>Amazon SES
     * Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createCustomVerificationEmailTemplateRequest <p>
     *            Represents a request to create a custom verification email
     *            template.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreateCustomVerificationEmailTemplate service method, as returned
     *         by Amazon Simple Email Service.
     * @throws CustomVerificationEmailTemplateAlreadyExistsException
     * @throws FromEmailAddressNotVerifiedException
     * @throws CustomVerificationEmailInvalidContentException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<Void> createCustomVerificationEmailTemplateAsync(
            final CreateCustomVerificationEmailTemplateRequest createCustomVerificationEmailTemplateRequest,
            final AsyncHandler<CreateCustomVerificationEmailTemplateRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    createCustomVerificationEmailTemplate(createCustomVerificationEmailTemplateRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createCustomVerificationEmailTemplateRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a new IP address filter.
     * </p>
     * <p>
     * For information about setting up IP address filters, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-ip-filters.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createReceiptFilterRequest <p>
     *            Represents a request to create a new IP address filter. You
     *            use IP address filters when you receive email with Amazon SES.
     *            For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreateReceiptFilter service method, as returned by Amazon Simple
     *         Email Service.
     * @throws LimitExceededException
     * @throws AlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CreateReceiptFilterResult> createReceiptFilterAsync(
            final CreateReceiptFilterRequest createReceiptFilterRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateReceiptFilterResult>() {
            public CreateReceiptFilterResult call() throws Exception {
                return createReceiptFilter(createReceiptFilterRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a new IP address filter.
     * </p>
     * <p>
     * For information about setting up IP address filters, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-ip-filters.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createReceiptFilterRequest <p>
     *            Represents a request to create a new IP address filter. You
     *            use IP address filters when you receive email with Amazon SES.
     *            For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreateReceiptFilter service method, as returned by Amazon Simple
     *         Email Service.
     * @throws LimitExceededException
     * @throws AlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CreateReceiptFilterResult> createReceiptFilterAsync(
            final CreateReceiptFilterRequest createReceiptFilterRequest,
            final AsyncHandler<CreateReceiptFilterRequest, CreateReceiptFilterResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateReceiptFilterResult>() {
            public CreateReceiptFilterResult call() throws Exception {
                CreateReceiptFilterResult result = null;
                try {
                    result = createReceiptFilter(createReceiptFilterRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createReceiptFilterRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a receipt rule.
     * </p>
     * <p>
     * For information about setting up receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createReceiptRuleRequest <p>
     *            Represents a request to create a receipt rule. You use receipt
     *            rules to receive email with Amazon SES. For more information,
     *            see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreateReceiptRule service method, as returned by Amazon Simple
     *         Email Service.
     * @throws InvalidSnsTopicException
     * @throws InvalidS3ConfigurationException
     * @throws InvalidLambdaFunctionException
     * @throws AlreadyExistsException
     * @throws RuleDoesNotExistException
     * @throws RuleSetDoesNotExistException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CreateReceiptRuleResult> createReceiptRuleAsync(
            final CreateReceiptRuleRequest createReceiptRuleRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<CreateReceiptRuleResult>() {
            public CreateReceiptRuleResult call() throws Exception {
                return createReceiptRule(createReceiptRuleRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a receipt rule.
     * </p>
     * <p>
     * For information about setting up receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createReceiptRuleRequest <p>
     *            Represents a request to create a receipt rule. You use receipt
     *            rules to receive email with Amazon SES. For more information,
     *            see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreateReceiptRule service method, as returned by Amazon Simple
     *         Email Service.
     * @throws InvalidSnsTopicException
     * @throws InvalidS3ConfigurationException
     * @throws InvalidLambdaFunctionException
     * @throws AlreadyExistsException
     * @throws RuleDoesNotExistException
     * @throws RuleSetDoesNotExistException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CreateReceiptRuleResult> createReceiptRuleAsync(
            final CreateReceiptRuleRequest createReceiptRuleRequest,
            final AsyncHandler<CreateReceiptRuleRequest, CreateReceiptRuleResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateReceiptRuleResult>() {
            public CreateReceiptRuleResult call() throws Exception {
                CreateReceiptRuleResult result = null;
                try {
                    result = createReceiptRule(createReceiptRuleRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createReceiptRuleRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates an empty receipt rule set.
     * </p>
     * <p>
     * For information about setting up receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createReceiptRuleSetRequest <p>
     *            Represents a request to create an empty receipt rule set. You
     *            use receipt rule sets to receive email with Amazon SES. For
     *            more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreateReceiptRuleSet service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CreateReceiptRuleSetResult> createReceiptRuleSetAsync(
            final CreateReceiptRuleSetRequest createReceiptRuleSetRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateReceiptRuleSetResult>() {
            public CreateReceiptRuleSetResult call() throws Exception {
                return createReceiptRuleSet(createReceiptRuleSetRequest);
            }
        });
    }

    /**
     * <p>
     * Creates an empty receipt rule set.
     * </p>
     * <p>
     * For information about setting up receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createReceiptRuleSetRequest <p>
     *            Represents a request to create an empty receipt rule set. You
     *            use receipt rule sets to receive email with Amazon SES. For
     *            more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreateReceiptRuleSet service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CreateReceiptRuleSetResult> createReceiptRuleSetAsync(
            final CreateReceiptRuleSetRequest createReceiptRuleSetRequest,
            final AsyncHandler<CreateReceiptRuleSetRequest, CreateReceiptRuleSetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateReceiptRuleSetResult>() {
            public CreateReceiptRuleSetResult call() throws Exception {
                CreateReceiptRuleSetResult result = null;
                try {
                    result = createReceiptRuleSet(createReceiptRuleSetRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createReceiptRuleSetRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates an email template. Email templates enable you to send
     * personalized email to one or more destinations in a single API operation.
     * For more information, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createTemplateRequest <p>
     *            Represents a request to create an email template. For more
     *            information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreateTemplate service method, as returned by Amazon Simple Email
     *         Service.
     * @throws AlreadyExistsException
     * @throws InvalidTemplateException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CreateTemplateResult> createTemplateAsync(
            final CreateTemplateRequest createTemplateRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<CreateTemplateResult>() {
            public CreateTemplateResult call() throws Exception {
                return createTemplate(createTemplateRequest);
            }
        });
    }

    /**
     * <p>
     * Creates an email template. Email templates enable you to send
     * personalized email to one or more destinations in a single API operation.
     * For more information, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createTemplateRequest <p>
     *            Represents a request to create an email template. For more
     *            information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         CreateTemplate service method, as returned by Amazon Simple Email
     *         Service.
     * @throws AlreadyExistsException
     * @throws InvalidTemplateException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<CreateTemplateResult> createTemplateAsync(
            final CreateTemplateRequest createTemplateRequest,
            final AsyncHandler<CreateTemplateRequest, CreateTemplateResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateTemplateResult>() {
            public CreateTemplateResult call() throws Exception {
                CreateTemplateResult result = null;
                try {
                    result = createTemplate(createTemplateRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createTemplateRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a configuration set. Configuration sets enable you to publish
     * email sending events. For information about using configuration sets, see
     * the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteConfigurationSetRequest <p>
     *            Represents a request to delete a configuration set.
     *            Configuration sets enable you to publish email sending events.
     *            For information about using configuration sets, see the <a
     *            href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteConfigurationSet service method, as returned by Amazon
     *         Simple Email Service.
     * @throws ConfigurationSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(
            final DeleteConfigurationSetRequest deleteConfigurationSetRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteConfigurationSetResult>() {
            public DeleteConfigurationSetResult call() throws Exception {
                return deleteConfigurationSet(deleteConfigurationSetRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes a configuration set. Configuration sets enable you to publish
     * email sending events. For information about using configuration sets, see
     * the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteConfigurationSetRequest <p>
     *            Represents a request to delete a configuration set.
     *            Configuration sets enable you to publish email sending events.
     *            For information about using configuration sets, see the <a
     *            href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteConfigurationSet service method, as returned by Amazon
     *         Simple Email Service.
     * @throws ConfigurationSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeleteConfigurationSetResult> deleteConfigurationSetAsync(
            final DeleteConfigurationSetRequest deleteConfigurationSetRequest,
            final AsyncHandler<DeleteConfigurationSetRequest, DeleteConfigurationSetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteConfigurationSetResult>() {
            public DeleteConfigurationSetResult call() throws Exception {
                DeleteConfigurationSetResult result = null;
                try {
                    result = deleteConfigurationSet(deleteConfigurationSetRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteConfigurationSetRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes a configuration set event destination. Configuration set event
     * destinations are associated with configuration sets, which enable you to
     * publish email sending events. For information about using configuration
     * sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteConfigurationSetEventDestinationRequest <p>
     *            Represents a request to delete a configuration set event
     *            destination. Configuration set event destinations are
     *            associated with configuration sets, which enable you to
     *            publish email sending events. For information about using
     *            configuration sets, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteConfigurationSetEventDestination service method, as
     *         returned by Amazon Simple Email Service.
     * @throws ConfigurationSetDoesNotExistException
     * @throws EventDestinationDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeleteConfigurationSetEventDestinationResult> deleteConfigurationSetEventDestinationAsync(
            final DeleteConfigurationSetEventDestinationRequest deleteConfigurationSetEventDestinationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteConfigurationSetEventDestinationResult>() {
            public DeleteConfigurationSetEventDestinationResult call() throws Exception {
                return deleteConfigurationSetEventDestination(deleteConfigurationSetEventDestinationRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes a configuration set event destination. Configuration set event
     * destinations are associated with configuration sets, which enable you to
     * publish email sending events. For information about using configuration
     * sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteConfigurationSetEventDestinationRequest <p>
     *            Represents a request to delete a configuration set event
     *            destination. Configuration set event destinations are
     *            associated with configuration sets, which enable you to
     *            publish email sending events. For information about using
     *            configuration sets, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteConfigurationSetEventDestination service method, as
     *         returned by Amazon Simple Email Service.
     * @throws ConfigurationSetDoesNotExistException
     * @throws EventDestinationDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeleteConfigurationSetEventDestinationResult> deleteConfigurationSetEventDestinationAsync(
            final DeleteConfigurationSetEventDestinationRequest deleteConfigurationSetEventDestinationRequest,
            final AsyncHandler<DeleteConfigurationSetEventDestinationRequest, DeleteConfigurationSetEventDestinationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteConfigurationSetEventDestinationResult>() {
            public DeleteConfigurationSetEventDestinationResult call() throws Exception {
                DeleteConfigurationSetEventDestinationResult result = null;
                try {
                    result = deleteConfigurationSetEventDestination(deleteConfigurationSetEventDestinationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteConfigurationSetEventDestinationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes an association between a configuration set and a custom domain
     * for open and click event tracking.
     * </p>
     * <p>
     * By default, images and links used for tracking open and click events are
     * hosted on domains operated by Amazon SES. You can configure a subdomain
     * of your own to handle these events. For information about using custom
     * domains, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/configure-custom-open-click-domains.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <note>
     * <p>
     * Deleting this kind of association will result in emails sent using the
     * specified configuration set to capture open and click events using the
     * standard, Amazon SES-operated domains.
     * </p>
     * </note>
     * 
     * @param deleteConfigurationSetTrackingOptionsRequest <p>
     *            Represents a request to delete open and click tracking options
     *            in a configuration set.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteConfigurationSetTrackingOptions service method, as returned
     *         by Amazon Simple Email Service.
     * @throws ConfigurationSetDoesNotExistException
     * @throws TrackingOptionsDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeleteConfigurationSetTrackingOptionsResult> deleteConfigurationSetTrackingOptionsAsync(
            final DeleteConfigurationSetTrackingOptionsRequest deleteConfigurationSetTrackingOptionsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteConfigurationSetTrackingOptionsResult>() {
            public DeleteConfigurationSetTrackingOptionsResult call() throws Exception {
                return deleteConfigurationSetTrackingOptions(deleteConfigurationSetTrackingOptionsRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes an association between a configuration set and a custom domain
     * for open and click event tracking.
     * </p>
     * <p>
     * By default, images and links used for tracking open and click events are
     * hosted on domains operated by Amazon SES. You can configure a subdomain
     * of your own to handle these events. For information about using custom
     * domains, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/configure-custom-open-click-domains.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <note>
     * <p>
     * Deleting this kind of association will result in emails sent using the
     * specified configuration set to capture open and click events using the
     * standard, Amazon SES-operated domains.
     * </p>
     * </note>
     * 
     * @param deleteConfigurationSetTrackingOptionsRequest <p>
     *            Represents a request to delete open and click tracking options
     *            in a configuration set.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteConfigurationSetTrackingOptions service method, as returned
     *         by Amazon Simple Email Service.
     * @throws ConfigurationSetDoesNotExistException
     * @throws TrackingOptionsDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeleteConfigurationSetTrackingOptionsResult> deleteConfigurationSetTrackingOptionsAsync(
            final DeleteConfigurationSetTrackingOptionsRequest deleteConfigurationSetTrackingOptionsRequest,
            final AsyncHandler<DeleteConfigurationSetTrackingOptionsRequest, DeleteConfigurationSetTrackingOptionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteConfigurationSetTrackingOptionsResult>() {
            public DeleteConfigurationSetTrackingOptionsResult call() throws Exception {
                DeleteConfigurationSetTrackingOptionsResult result = null;
                try {
                    result = deleteConfigurationSetTrackingOptions(deleteConfigurationSetTrackingOptionsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteConfigurationSetTrackingOptionsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes an existing custom verification email template.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html"
     * >Using Custom Verification Email Templates</a> in the <i>Amazon SES
     * Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteCustomVerificationEmailTemplateRequest <p>
     *            Represents a request to delete an existing custom verification
     *            email template.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteCustomVerificationEmailTemplate service method, as returned
     *         by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<Void> deleteCustomVerificationEmailTemplateAsync(
            final DeleteCustomVerificationEmailTemplateRequest deleteCustomVerificationEmailTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteCustomVerificationEmailTemplate(deleteCustomVerificationEmailTemplateRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deletes an existing custom verification email template.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html"
     * >Using Custom Verification Email Templates</a> in the <i>Amazon SES
     * Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteCustomVerificationEmailTemplateRequest <p>
     *            Represents a request to delete an existing custom verification
     *            email template.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteCustomVerificationEmailTemplate service method, as returned
     *         by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<Void> deleteCustomVerificationEmailTemplateAsync(
            final DeleteCustomVerificationEmailTemplateRequest deleteCustomVerificationEmailTemplateRequest,
            final AsyncHandler<DeleteCustomVerificationEmailTemplateRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteCustomVerificationEmailTemplate(deleteCustomVerificationEmailTemplateRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteCustomVerificationEmailTemplateRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes the specified identity (an email address or a domain) from the
     * list of verified identities.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteIdentityRequest <p>
     *            Represents a request to delete one of your Amazon SES
     *            identities (an email address or domain).
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteIdentity service method, as returned by Amazon Simple Email
     *         Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeleteIdentityResult> deleteIdentityAsync(
            final DeleteIdentityRequest deleteIdentityRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DeleteIdentityResult>() {
            public DeleteIdentityResult call() throws Exception {
                return deleteIdentity(deleteIdentityRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes the specified identity (an email address or a domain) from the
     * list of verified identities.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteIdentityRequest <p>
     *            Represents a request to delete one of your Amazon SES
     *            identities (an email address or domain).
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteIdentity service method, as returned by Amazon Simple Email
     *         Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeleteIdentityResult> deleteIdentityAsync(
            final DeleteIdentityRequest deleteIdentityRequest,
            final AsyncHandler<DeleteIdentityRequest, DeleteIdentityResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteIdentityResult>() {
            public DeleteIdentityResult call() throws Exception {
                DeleteIdentityResult result = null;
                try {
                    result = deleteIdentity(deleteIdentityRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteIdentityRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes the specified sending authorization policy for the given identity
     * (an email address or a domain). This API returns successfully even if a
     * policy with the specified name does not exist.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the
     * identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteIdentityPolicyRequest <p>
     *            Represents a request to delete a sending authorization policy
     *            for an identity. Sending authorization is an Amazon SES
     *            feature that enables you to authorize other senders to use
     *            your identities. For information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteIdentityPolicy service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeleteIdentityPolicyResult> deleteIdentityPolicyAsync(
            final DeleteIdentityPolicyRequest deleteIdentityPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteIdentityPolicyResult>() {
            public DeleteIdentityPolicyResult call() throws Exception {
                return deleteIdentityPolicy(deleteIdentityPolicyRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes the specified sending authorization policy for the given identity
     * (an email address or a domain). This API returns successfully even if a
     * policy with the specified name does not exist.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the
     * identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteIdentityPolicyRequest <p>
     *            Represents a request to delete a sending authorization policy
     *            for an identity. Sending authorization is an Amazon SES
     *            feature that enables you to authorize other senders to use
     *            your identities. For information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteIdentityPolicy service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeleteIdentityPolicyResult> deleteIdentityPolicyAsync(
            final DeleteIdentityPolicyRequest deleteIdentityPolicyRequest,
            final AsyncHandler<DeleteIdentityPolicyRequest, DeleteIdentityPolicyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteIdentityPolicyResult>() {
            public DeleteIdentityPolicyResult call() throws Exception {
                DeleteIdentityPolicyResult result = null;
                try {
                    result = deleteIdentityPolicy(deleteIdentityPolicyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteIdentityPolicyRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes the specified IP address filter.
     * </p>
     * <p>
     * For information about managing IP address filters, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteReceiptFilterRequest <p>
     *            Represents a request to delete an IP address filter. You use
     *            IP address filters when you receive email with Amazon SES. For
     *            more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteReceiptFilter service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeleteReceiptFilterResult> deleteReceiptFilterAsync(
            final DeleteReceiptFilterRequest deleteReceiptFilterRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteReceiptFilterResult>() {
            public DeleteReceiptFilterResult call() throws Exception {
                return deleteReceiptFilter(deleteReceiptFilterRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes the specified IP address filter.
     * </p>
     * <p>
     * For information about managing IP address filters, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteReceiptFilterRequest <p>
     *            Represents a request to delete an IP address filter. You use
     *            IP address filters when you receive email with Amazon SES. For
     *            more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteReceiptFilter service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeleteReceiptFilterResult> deleteReceiptFilterAsync(
            final DeleteReceiptFilterRequest deleteReceiptFilterRequest,
            final AsyncHandler<DeleteReceiptFilterRequest, DeleteReceiptFilterResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteReceiptFilterResult>() {
            public DeleteReceiptFilterResult call() throws Exception {
                DeleteReceiptFilterResult result = null;
                try {
                    result = deleteReceiptFilter(deleteReceiptFilterRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteReceiptFilterRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes the specified receipt rule.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteReceiptRuleRequest <p>
     *            Represents a request to delete a receipt rule. You use receipt
     *            rules to receive email with Amazon SES. For more information,
     *            see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteReceiptRule service method, as returned by Amazon Simple
     *         Email Service.
     * @throws RuleSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeleteReceiptRuleResult> deleteReceiptRuleAsync(
            final DeleteReceiptRuleRequest deleteReceiptRuleRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DeleteReceiptRuleResult>() {
            public DeleteReceiptRuleResult call() throws Exception {
                return deleteReceiptRule(deleteReceiptRuleRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes the specified receipt rule.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteReceiptRuleRequest <p>
     *            Represents a request to delete a receipt rule. You use receipt
     *            rules to receive email with Amazon SES. For more information,
     *            see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteReceiptRule service method, as returned by Amazon Simple
     *         Email Service.
     * @throws RuleSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeleteReceiptRuleResult> deleteReceiptRuleAsync(
            final DeleteReceiptRuleRequest deleteReceiptRuleRequest,
            final AsyncHandler<DeleteReceiptRuleRequest, DeleteReceiptRuleResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteReceiptRuleResult>() {
            public DeleteReceiptRuleResult call() throws Exception {
                DeleteReceiptRuleResult result = null;
                try {
                    result = deleteReceiptRule(deleteReceiptRuleRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteReceiptRuleRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes the specified receipt rule set and all of the receipt rules it
     * contains.
     * </p>
     * <note>
     * <p>
     * The currently active rule set cannot be deleted.
     * </p>
     * </note>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteReceiptRuleSetRequest <p>
     *            Represents a request to delete a receipt rule set and all of
     *            the receipt rules it contains. You use receipt rule sets to
     *            receive email with Amazon SES. For more information, see the
     *            <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteReceiptRuleSet service method, as returned by Amazon Simple
     *         Email Service.
     * @throws CannotDeleteException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeleteReceiptRuleSetResult> deleteReceiptRuleSetAsync(
            final DeleteReceiptRuleSetRequest deleteReceiptRuleSetRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteReceiptRuleSetResult>() {
            public DeleteReceiptRuleSetResult call() throws Exception {
                return deleteReceiptRuleSet(deleteReceiptRuleSetRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes the specified receipt rule set and all of the receipt rules it
     * contains.
     * </p>
     * <note>
     * <p>
     * The currently active rule set cannot be deleted.
     * </p>
     * </note>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteReceiptRuleSetRequest <p>
     *            Represents a request to delete a receipt rule set and all of
     *            the receipt rules it contains. You use receipt rule sets to
     *            receive email with Amazon SES. For more information, see the
     *            <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteReceiptRuleSet service method, as returned by Amazon Simple
     *         Email Service.
     * @throws CannotDeleteException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeleteReceiptRuleSetResult> deleteReceiptRuleSetAsync(
            final DeleteReceiptRuleSetRequest deleteReceiptRuleSetRequest,
            final AsyncHandler<DeleteReceiptRuleSetRequest, DeleteReceiptRuleSetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteReceiptRuleSetResult>() {
            public DeleteReceiptRuleSetResult call() throws Exception {
                DeleteReceiptRuleSetResult result = null;
                try {
                    result = deleteReceiptRuleSet(deleteReceiptRuleSetRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteReceiptRuleSetRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deletes an email template.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteTemplateRequest <p>
     *            Represents a request to delete an email template. For more
     *            information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteTemplate service method, as returned by Amazon Simple Email
     *         Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeleteTemplateResult> deleteTemplateAsync(
            final DeleteTemplateRequest deleteTemplateRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<DeleteTemplateResult>() {
            public DeleteTemplateResult call() throws Exception {
                return deleteTemplate(deleteTemplateRequest);
            }
        });
    }

    /**
     * <p>
     * Deletes an email template.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param deleteTemplateRequest <p>
     *            Represents a request to delete an email template. For more
     *            information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteTemplate service method, as returned by Amazon Simple Email
     *         Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DeleteTemplateResult> deleteTemplateAsync(
            final DeleteTemplateRequest deleteTemplateRequest,
            final AsyncHandler<DeleteTemplateRequest, DeleteTemplateResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteTemplateResult>() {
            public DeleteTemplateResult call() throws Exception {
                DeleteTemplateResult result = null;
                try {
                    result = deleteTemplate(deleteTemplateRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteTemplateRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deprecated. Use the <code>DeleteIdentity</code> operation to delete email
     * addresses and domains.
     * </p>
     * 
     * @param deleteVerifiedEmailAddressRequest <p>
     *            Represents a request to delete an email address from the list
     *            of email addresses you have attempted to verify under your AWS
     *            account.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteVerifiedEmailAddress service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<Void> deleteVerifiedEmailAddressAsync(
            final DeleteVerifiedEmailAddressRequest deleteVerifiedEmailAddressRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteVerifiedEmailAddress(deleteVerifiedEmailAddressRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deprecated. Use the <code>DeleteIdentity</code> operation to delete email
     * addresses and domains.
     * </p>
     * 
     * @param deleteVerifiedEmailAddressRequest <p>
     *            Represents a request to delete an email address from the list
     *            of email addresses you have attempted to verify under your AWS
     *            account.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DeleteVerifiedEmailAddress service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<Void> deleteVerifiedEmailAddressAsync(
            final DeleteVerifiedEmailAddressRequest deleteVerifiedEmailAddressRequest,
            final AsyncHandler<DeleteVerifiedEmailAddressRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    deleteVerifiedEmailAddress(deleteVerifiedEmailAddressRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(deleteVerifiedEmailAddressRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns the metadata and receipt rules for the receipt rule set that is
     * currently active.
     * </p>
     * <p>
     * For information about setting up receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param describeActiveReceiptRuleSetRequest <p>
     *            Represents a request to return the metadata and receipt rules
     *            for the receipt rule set that is currently active. You use
     *            receipt rule sets to receive email with Amazon SES. For more
     *            information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DescribeActiveReceiptRuleSet service method, as returned by
     *         Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DescribeActiveReceiptRuleSetResult> describeActiveReceiptRuleSetAsync(
            final DescribeActiveReceiptRuleSetRequest describeActiveReceiptRuleSetRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeActiveReceiptRuleSetResult>() {
            public DescribeActiveReceiptRuleSetResult call() throws Exception {
                return describeActiveReceiptRuleSet(describeActiveReceiptRuleSetRequest);
            }
        });
    }

    /**
     * <p>
     * Returns the metadata and receipt rules for the receipt rule set that is
     * currently active.
     * </p>
     * <p>
     * For information about setting up receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param describeActiveReceiptRuleSetRequest <p>
     *            Represents a request to return the metadata and receipt rules
     *            for the receipt rule set that is currently active. You use
     *            receipt rule sets to receive email with Amazon SES. For more
     *            information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DescribeActiveReceiptRuleSet service method, as returned by
     *         Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DescribeActiveReceiptRuleSetResult> describeActiveReceiptRuleSetAsync(
            final DescribeActiveReceiptRuleSetRequest describeActiveReceiptRuleSetRequest,
            final AsyncHandler<DescribeActiveReceiptRuleSetRequest, DescribeActiveReceiptRuleSetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeActiveReceiptRuleSetResult>() {
            public DescribeActiveReceiptRuleSetResult call() throws Exception {
                DescribeActiveReceiptRuleSetResult result = null;
                try {
                    result = describeActiveReceiptRuleSet(describeActiveReceiptRuleSetRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeActiveReceiptRuleSetRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns the details of the specified configuration set. For information
     * about using configuration sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param describeConfigurationSetRequest <p>
     *            Represents a request to return the details of a configuration
     *            set. Configuration sets enable you to publish email sending
     *            events. For information about using configuration sets, see
     *            the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DescribeConfigurationSet service method, as returned by Amazon
     *         Simple Email Service.
     * @throws ConfigurationSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DescribeConfigurationSetResult> describeConfigurationSetAsync(
            final DescribeConfigurationSetRequest describeConfigurationSetRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeConfigurationSetResult>() {
            public DescribeConfigurationSetResult call() throws Exception {
                return describeConfigurationSet(describeConfigurationSetRequest);
            }
        });
    }

    /**
     * <p>
     * Returns the details of the specified configuration set. For information
     * about using configuration sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param describeConfigurationSetRequest <p>
     *            Represents a request to return the details of a configuration
     *            set. Configuration sets enable you to publish email sending
     *            events. For information about using configuration sets, see
     *            the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DescribeConfigurationSet service method, as returned by Amazon
     *         Simple Email Service.
     * @throws ConfigurationSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DescribeConfigurationSetResult> describeConfigurationSetAsync(
            final DescribeConfigurationSetRequest describeConfigurationSetRequest,
            final AsyncHandler<DescribeConfigurationSetRequest, DescribeConfigurationSetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeConfigurationSetResult>() {
            public DescribeConfigurationSetResult call() throws Exception {
                DescribeConfigurationSetResult result = null;
                try {
                    result = describeConfigurationSet(describeConfigurationSetRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeConfigurationSetRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns the details of the specified receipt rule.
     * </p>
     * <p>
     * For information about setting up receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param describeReceiptRuleRequest <p>
     *            Represents a request to return the details of a receipt rule.
     *            You use receipt rules to receive email with Amazon SES. For
     *            more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DescribeReceiptRule service method, as returned by Amazon Simple
     *         Email Service.
     * @throws RuleDoesNotExistException
     * @throws RuleSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DescribeReceiptRuleResult> describeReceiptRuleAsync(
            final DescribeReceiptRuleRequest describeReceiptRuleRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeReceiptRuleResult>() {
            public DescribeReceiptRuleResult call() throws Exception {
                return describeReceiptRule(describeReceiptRuleRequest);
            }
        });
    }

    /**
     * <p>
     * Returns the details of the specified receipt rule.
     * </p>
     * <p>
     * For information about setting up receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param describeReceiptRuleRequest <p>
     *            Represents a request to return the details of a receipt rule.
     *            You use receipt rules to receive email with Amazon SES. For
     *            more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DescribeReceiptRule service method, as returned by Amazon Simple
     *         Email Service.
     * @throws RuleDoesNotExistException
     * @throws RuleSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DescribeReceiptRuleResult> describeReceiptRuleAsync(
            final DescribeReceiptRuleRequest describeReceiptRuleRequest,
            final AsyncHandler<DescribeReceiptRuleRequest, DescribeReceiptRuleResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeReceiptRuleResult>() {
            public DescribeReceiptRuleResult call() throws Exception {
                DescribeReceiptRuleResult result = null;
                try {
                    result = describeReceiptRule(describeReceiptRuleRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeReceiptRuleRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns the details of the specified receipt rule set.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param describeReceiptRuleSetRequest <p>
     *            Represents a request to return the details of a receipt rule
     *            set. You use receipt rule sets to receive email with Amazon
     *            SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DescribeReceiptRuleSet service method, as returned by Amazon
     *         Simple Email Service.
     * @throws RuleSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DescribeReceiptRuleSetResult> describeReceiptRuleSetAsync(
            final DescribeReceiptRuleSetRequest describeReceiptRuleSetRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeReceiptRuleSetResult>() {
            public DescribeReceiptRuleSetResult call() throws Exception {
                return describeReceiptRuleSet(describeReceiptRuleSetRequest);
            }
        });
    }

    /**
     * <p>
     * Returns the details of the specified receipt rule set.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param describeReceiptRuleSetRequest <p>
     *            Represents a request to return the details of a receipt rule
     *            set. You use receipt rule sets to receive email with Amazon
     *            SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         DescribeReceiptRuleSet service method, as returned by Amazon
     *         Simple Email Service.
     * @throws RuleSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<DescribeReceiptRuleSetResult> describeReceiptRuleSetAsync(
            final DescribeReceiptRuleSetRequest describeReceiptRuleSetRequest,
            final AsyncHandler<DescribeReceiptRuleSetRequest, DescribeReceiptRuleSetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeReceiptRuleSetResult>() {
            public DescribeReceiptRuleSetResult call() throws Exception {
                DescribeReceiptRuleSetResult result = null;
                try {
                    result = describeReceiptRuleSet(describeReceiptRuleSetRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(describeReceiptRuleSetRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns the email sending status of the Amazon SES account for the
     * current region.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getAccountSendingEnabledRequest
     * @return A Java Future object containing the response from the
     *         GetAccountSendingEnabled service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<GetAccountSendingEnabledResult> getAccountSendingEnabledAsync(
            final GetAccountSendingEnabledRequest getAccountSendingEnabledRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetAccountSendingEnabledResult>() {
            public GetAccountSendingEnabledResult call() throws Exception {
                return getAccountSendingEnabled(getAccountSendingEnabledRequest);
            }
        });
    }

    /**
     * <p>
     * Returns the email sending status of the Amazon SES account for the
     * current region.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getAccountSendingEnabledRequest
     * @return A Java Future object containing the response from the
     *         GetAccountSendingEnabled service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<GetAccountSendingEnabledResult> getAccountSendingEnabledAsync(
            final GetAccountSendingEnabledRequest getAccountSendingEnabledRequest,
            final AsyncHandler<GetAccountSendingEnabledRequest, GetAccountSendingEnabledResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetAccountSendingEnabledResult>() {
            public GetAccountSendingEnabledResult call() throws Exception {
                GetAccountSendingEnabledResult result = null;
                try {
                    result = getAccountSendingEnabled(getAccountSendingEnabledRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getAccountSendingEnabledRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns the custom email verification template for the template name you
     * specify.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html"
     * >Using Custom Verification Email Templates</a> in the <i>Amazon SES
     * Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getCustomVerificationEmailTemplateRequest <p>
     *            Represents a request to retrieve an existing custom
     *            verification email template.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetCustomVerificationEmailTemplate service method, as returned by
     *         Amazon Simple Email Service.
     * @throws CustomVerificationEmailTemplateDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<GetCustomVerificationEmailTemplateResult> getCustomVerificationEmailTemplateAsync(
            final GetCustomVerificationEmailTemplateRequest getCustomVerificationEmailTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetCustomVerificationEmailTemplateResult>() {
            public GetCustomVerificationEmailTemplateResult call() throws Exception {
                return getCustomVerificationEmailTemplate(getCustomVerificationEmailTemplateRequest);
            }
        });
    }

    /**
     * <p>
     * Returns the custom email verification template for the template name you
     * specify.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html"
     * >Using Custom Verification Email Templates</a> in the <i>Amazon SES
     * Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getCustomVerificationEmailTemplateRequest <p>
     *            Represents a request to retrieve an existing custom
     *            verification email template.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetCustomVerificationEmailTemplate service method, as returned by
     *         Amazon Simple Email Service.
     * @throws CustomVerificationEmailTemplateDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<GetCustomVerificationEmailTemplateResult> getCustomVerificationEmailTemplateAsync(
            final GetCustomVerificationEmailTemplateRequest getCustomVerificationEmailTemplateRequest,
            final AsyncHandler<GetCustomVerificationEmailTemplateRequest, GetCustomVerificationEmailTemplateResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetCustomVerificationEmailTemplateResult>() {
            public GetCustomVerificationEmailTemplateResult call() throws Exception {
                GetCustomVerificationEmailTemplateResult result = null;
                try {
                    result = getCustomVerificationEmailTemplate(getCustomVerificationEmailTemplateRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getCustomVerificationEmailTemplateRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns the current status of Easy DKIM signing for an entity. For domain
     * name identities, this operation also returns the DKIM tokens that are
     * required for Easy DKIM signing, and whether Amazon SES has successfully
     * verified that these tokens have been published.
     * </p>
     * <p>
     * This operation takes a list of identities as input and returns the
     * following information for each:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether Easy DKIM signing is enabled or disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * A set of DKIM tokens that represent the identity. If the identity is an
     * email address, the tokens represent the domain of that address.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether Amazon SES has successfully verified the DKIM tokens published in
     * the domain's DNS. This information is only returned for domain name
     * identities, not for email addresses.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation is throttled at one request per second and can only get
     * DKIM attributes for up to 100 identities at a time.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to
     * the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param getIdentityDkimAttributesRequest <p>
     *            Represents a request for the status of Amazon SES Easy DKIM
     *            signing for an identity. For domain identities, this request
     *            also returns the DKIM tokens that are required for Easy DKIM
     *            signing, and whether Amazon SES successfully verified that
     *            these tokens were published. For more information about Easy
     *            DKIM, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetIdentityDkimAttributes service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<GetIdentityDkimAttributesResult> getIdentityDkimAttributesAsync(
            final GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetIdentityDkimAttributesResult>() {
            public GetIdentityDkimAttributesResult call() throws Exception {
                return getIdentityDkimAttributes(getIdentityDkimAttributesRequest);
            }
        });
    }

    /**
     * <p>
     * Returns the current status of Easy DKIM signing for an entity. For domain
     * name identities, this operation also returns the DKIM tokens that are
     * required for Easy DKIM signing, and whether Amazon SES has successfully
     * verified that these tokens have been published.
     * </p>
     * <p>
     * This operation takes a list of identities as input and returns the
     * following information for each:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether Easy DKIM signing is enabled or disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * A set of DKIM tokens that represent the identity. If the identity is an
     * email address, the tokens represent the domain of that address.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether Amazon SES has successfully verified the DKIM tokens published in
     * the domain's DNS. This information is only returned for domain name
     * identities, not for email addresses.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation is throttled at one request per second and can only get
     * DKIM attributes for up to 100 identities at a time.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to
     * the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param getIdentityDkimAttributesRequest <p>
     *            Represents a request for the status of Amazon SES Easy DKIM
     *            signing for an identity. For domain identities, this request
     *            also returns the DKIM tokens that are required for Easy DKIM
     *            signing, and whether Amazon SES successfully verified that
     *            these tokens were published. For more information about Easy
     *            DKIM, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetIdentityDkimAttributes service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<GetIdentityDkimAttributesResult> getIdentityDkimAttributesAsync(
            final GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest,
            final AsyncHandler<GetIdentityDkimAttributesRequest, GetIdentityDkimAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetIdentityDkimAttributesResult>() {
            public GetIdentityDkimAttributesResult call() throws Exception {
                GetIdentityDkimAttributesResult result = null;
                try {
                    result = getIdentityDkimAttributes(getIdentityDkimAttributesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getIdentityDkimAttributesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns the custom MAIL FROM attributes for a list of identities (email
     * addresses : domains).
     * </p>
     * <p>
     * This operation is throttled at one request per second and can only get
     * custom MAIL FROM attributes for up to 100 identities at a time.
     * </p>
     * 
     * @param getIdentityMailFromDomainAttributesRequest <p>
     *            Represents a request to return the Amazon SES custom MAIL FROM
     *            attributes for a list of identities. For information about
     *            using a custom MAIL FROM domain, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetIdentityMailFromDomainAttributes service method, as returned
     *         by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<GetIdentityMailFromDomainAttributesResult> getIdentityMailFromDomainAttributesAsync(
            final GetIdentityMailFromDomainAttributesRequest getIdentityMailFromDomainAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetIdentityMailFromDomainAttributesResult>() {
            public GetIdentityMailFromDomainAttributesResult call() throws Exception {
                return getIdentityMailFromDomainAttributes(getIdentityMailFromDomainAttributesRequest);
            }
        });
    }

    /**
     * <p>
     * Returns the custom MAIL FROM attributes for a list of identities (email
     * addresses : domains).
     * </p>
     * <p>
     * This operation is throttled at one request per second and can only get
     * custom MAIL FROM attributes for up to 100 identities at a time.
     * </p>
     * 
     * @param getIdentityMailFromDomainAttributesRequest <p>
     *            Represents a request to return the Amazon SES custom MAIL FROM
     *            attributes for a list of identities. For information about
     *            using a custom MAIL FROM domain, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetIdentityMailFromDomainAttributes service method, as returned
     *         by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<GetIdentityMailFromDomainAttributesResult> getIdentityMailFromDomainAttributesAsync(
            final GetIdentityMailFromDomainAttributesRequest getIdentityMailFromDomainAttributesRequest,
            final AsyncHandler<GetIdentityMailFromDomainAttributesRequest, GetIdentityMailFromDomainAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetIdentityMailFromDomainAttributesResult>() {
            public GetIdentityMailFromDomainAttributesResult call() throws Exception {
                GetIdentityMailFromDomainAttributesResult result = null;
                try {
                    result = getIdentityMailFromDomainAttributes(getIdentityMailFromDomainAttributesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getIdentityMailFromDomainAttributesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Given a list of verified identities (email addresses and/or domains),
     * returns a structure describing identity notification attributes.
     * </p>
     * <p>
     * This operation is throttled at one request per second and can only get
     * notification attributes for up to 100 identities at a time.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see the
     * <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param getIdentityNotificationAttributesRequest <p>
     *            Represents a request to return the notification attributes for
     *            a list of identities you verified with Amazon SES. For
     *            information about Amazon SES notifications, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetIdentityNotificationAttributes service method, as returned by
     *         Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<GetIdentityNotificationAttributesResult> getIdentityNotificationAttributesAsync(
            final GetIdentityNotificationAttributesRequest getIdentityNotificationAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetIdentityNotificationAttributesResult>() {
            public GetIdentityNotificationAttributesResult call() throws Exception {
                return getIdentityNotificationAttributes(getIdentityNotificationAttributesRequest);
            }
        });
    }

    /**
     * <p>
     * Given a list of verified identities (email addresses and/or domains),
     * returns a structure describing identity notification attributes.
     * </p>
     * <p>
     * This operation is throttled at one request per second and can only get
     * notification attributes for up to 100 identities at a time.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see the
     * <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param getIdentityNotificationAttributesRequest <p>
     *            Represents a request to return the notification attributes for
     *            a list of identities you verified with Amazon SES. For
     *            information about Amazon SES notifications, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetIdentityNotificationAttributes service method, as returned by
     *         Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<GetIdentityNotificationAttributesResult> getIdentityNotificationAttributesAsync(
            final GetIdentityNotificationAttributesRequest getIdentityNotificationAttributesRequest,
            final AsyncHandler<GetIdentityNotificationAttributesRequest, GetIdentityNotificationAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetIdentityNotificationAttributesResult>() {
            public GetIdentityNotificationAttributesResult call() throws Exception {
                GetIdentityNotificationAttributesResult result = null;
                try {
                    result = getIdentityNotificationAttributes(getIdentityNotificationAttributesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getIdentityNotificationAttributesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns the requested sending authorization policies for the given
     * identity (an email address or a domain). The policies are returned as a
     * map of policy names to policy contents. You can retrieve a maximum of 20
     * policies at a time.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the
     * identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getIdentityPoliciesRequest <p>
     *            Represents a request to return the requested sending
     *            authorization policies for an identity. Sending authorization
     *            is an Amazon SES feature that enables you to authorize other
     *            senders to use your identities. For information, see the <a
     *            href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetIdentityPolicies service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<GetIdentityPoliciesResult> getIdentityPoliciesAsync(
            final GetIdentityPoliciesRequest getIdentityPoliciesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetIdentityPoliciesResult>() {
            public GetIdentityPoliciesResult call() throws Exception {
                return getIdentityPolicies(getIdentityPoliciesRequest);
            }
        });
    }

    /**
     * <p>
     * Returns the requested sending authorization policies for the given
     * identity (an email address or a domain). The policies are returned as a
     * map of policy names to policy contents. You can retrieve a maximum of 20
     * policies at a time.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the
     * identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getIdentityPoliciesRequest <p>
     *            Represents a request to return the requested sending
     *            authorization policies for an identity. Sending authorization
     *            is an Amazon SES feature that enables you to authorize other
     *            senders to use your identities. For information, see the <a
     *            href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetIdentityPolicies service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<GetIdentityPoliciesResult> getIdentityPoliciesAsync(
            final GetIdentityPoliciesRequest getIdentityPoliciesRequest,
            final AsyncHandler<GetIdentityPoliciesRequest, GetIdentityPoliciesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetIdentityPoliciesResult>() {
            public GetIdentityPoliciesResult call() throws Exception {
                GetIdentityPoliciesResult result = null;
                try {
                    result = getIdentityPolicies(getIdentityPoliciesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getIdentityPoliciesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Given a list of identities (email addresses and/or domains), returns the
     * verification status and (for domain identities) the verification token
     * for each identity.
     * </p>
     * <p>
     * The verification status of an email address is "Pending" until the email
     * address owner clicks the link within the verification email that Amazon
     * SES sent to that address. If the email address owner clicks the link
     * within 24 hours, the verification status of the email address changes to
     * "Success". If the link is not clicked within 24 hours, the verification
     * status changes to "Failed." In that case, if you still want to verify the
     * email address, you must restart the verification process from the
     * beginning.
     * </p>
     * <p>
     * For domain identities, the domain's verification status is "Pending" as
     * Amazon SES searches for the required TXT record in the DNS settings of
     * the domain. When Amazon SES detects the record, the domain's verification
     * status changes to "Success". If Amazon SES is unable to detect the record
     * within 72 hours, the domain's verification status changes to "Failed." In
     * that case, if you still want to verify the domain, you must restart the
     * verification process from the beginning.
     * </p>
     * <p>
     * This operation is throttled at one request per second and can only get
     * verification attributes for up to 100 identities at a time.
     * </p>
     * 
     * @param getIdentityVerificationAttributesRequest <p>
     *            Represents a request to return the Amazon SES verification
     *            status of a list of identities. For domain identities, this
     *            request also returns the verification token. For information
     *            about verifying identities with Amazon SES, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetIdentityVerificationAttributes service method, as returned by
     *         Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<GetIdentityVerificationAttributesResult> getIdentityVerificationAttributesAsync(
            final GetIdentityVerificationAttributesRequest getIdentityVerificationAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetIdentityVerificationAttributesResult>() {
            public GetIdentityVerificationAttributesResult call() throws Exception {
                return getIdentityVerificationAttributes(getIdentityVerificationAttributesRequest);
            }
        });
    }

    /**
     * <p>
     * Given a list of identities (email addresses and/or domains), returns the
     * verification status and (for domain identities) the verification token
     * for each identity.
     * </p>
     * <p>
     * The verification status of an email address is "Pending" until the email
     * address owner clicks the link within the verification email that Amazon
     * SES sent to that address. If the email address owner clicks the link
     * within 24 hours, the verification status of the email address changes to
     * "Success". If the link is not clicked within 24 hours, the verification
     * status changes to "Failed." In that case, if you still want to verify the
     * email address, you must restart the verification process from the
     * beginning.
     * </p>
     * <p>
     * For domain identities, the domain's verification status is "Pending" as
     * Amazon SES searches for the required TXT record in the DNS settings of
     * the domain. When Amazon SES detects the record, the domain's verification
     * status changes to "Success". If Amazon SES is unable to detect the record
     * within 72 hours, the domain's verification status changes to "Failed." In
     * that case, if you still want to verify the domain, you must restart the
     * verification process from the beginning.
     * </p>
     * <p>
     * This operation is throttled at one request per second and can only get
     * verification attributes for up to 100 identities at a time.
     * </p>
     * 
     * @param getIdentityVerificationAttributesRequest <p>
     *            Represents a request to return the Amazon SES verification
     *            status of a list of identities. For domain identities, this
     *            request also returns the verification token. For information
     *            about verifying identities with Amazon SES, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         GetIdentityVerificationAttributes service method, as returned by
     *         Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<GetIdentityVerificationAttributesResult> getIdentityVerificationAttributesAsync(
            final GetIdentityVerificationAttributesRequest getIdentityVerificationAttributesRequest,
            final AsyncHandler<GetIdentityVerificationAttributesRequest, GetIdentityVerificationAttributesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetIdentityVerificationAttributesResult>() {
            public GetIdentityVerificationAttributesResult call() throws Exception {
                GetIdentityVerificationAttributesResult result = null;
                try {
                    result = getIdentityVerificationAttributes(getIdentityVerificationAttributesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getIdentityVerificationAttributesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides the sending limits for the Amazon SES account.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getSendQuotaRequest
     * @return A Java Future object containing the response from the
     *         GetSendQuota service method, as returned by Amazon Simple Email
     *         Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<GetSendQuotaResult> getSendQuotaAsync(
            final GetSendQuotaRequest getSendQuotaRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<GetSendQuotaResult>() {
            public GetSendQuotaResult call() throws Exception {
                return getSendQuota(getSendQuotaRequest);
            }
        });
    }

    /**
     * <p>
     * Provides the sending limits for the Amazon SES account.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getSendQuotaRequest
     * @return A Java Future object containing the response from the
     *         GetSendQuota service method, as returned by Amazon Simple Email
     *         Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<GetSendQuotaResult> getSendQuotaAsync(
            final GetSendQuotaRequest getSendQuotaRequest,
            final AsyncHandler<GetSendQuotaRequest, GetSendQuotaResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetSendQuotaResult>() {
            public GetSendQuotaResult call() throws Exception {
                GetSendQuotaResult result = null;
                try {
                    result = getSendQuota(getSendQuotaRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getSendQuotaRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides sending statistics for the current AWS Region. The result is a
     * list of data points, representing the last two weeks of sending activity.
     * Each data point in the list contains statistics for a 15-minute period of
     * time.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getSendStatisticsRequest
     * @return A Java Future object containing the response from the
     *         GetSendStatistics service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<GetSendStatisticsResult> getSendStatisticsAsync(
            final GetSendStatisticsRequest getSendStatisticsRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<GetSendStatisticsResult>() {
            public GetSendStatisticsResult call() throws Exception {
                return getSendStatistics(getSendStatisticsRequest);
            }
        });
    }

    /**
     * <p>
     * Provides sending statistics for the current AWS Region. The result is a
     * list of data points, representing the last two weeks of sending activity.
     * Each data point in the list contains statistics for a 15-minute period of
     * time.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getSendStatisticsRequest
     * @return A Java Future object containing the response from the
     *         GetSendStatistics service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<GetSendStatisticsResult> getSendStatisticsAsync(
            final GetSendStatisticsRequest getSendStatisticsRequest,
            final AsyncHandler<GetSendStatisticsRequest, GetSendStatisticsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetSendStatisticsResult>() {
            public GetSendStatisticsResult call() throws Exception {
                GetSendStatisticsResult result = null;
                try {
                    result = getSendStatistics(getSendStatisticsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getSendStatisticsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Displays the template object (which includes the Subject line, HTML part
     * and text part) for the template you specify.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getTemplateRequest
     * @return A Java Future object containing the response from the GetTemplate
     *         service method, as returned by Amazon Simple Email Service.
     * @throws TemplateDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<GetTemplateResult> getTemplateAsync(final GetTemplateRequest getTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetTemplateResult>() {
            public GetTemplateResult call() throws Exception {
                return getTemplate(getTemplateRequest);
            }
        });
    }

    /**
     * <p>
     * Displays the template object (which includes the Subject line, HTML part
     * and text part) for the template you specify.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getTemplateRequest
     * @return A Java Future object containing the response from the GetTemplate
     *         service method, as returned by Amazon Simple Email Service.
     * @throws TemplateDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<GetTemplateResult> getTemplateAsync(final GetTemplateRequest getTemplateRequest,
            final AsyncHandler<GetTemplateRequest, GetTemplateResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetTemplateResult>() {
            public GetTemplateResult call() throws Exception {
                GetTemplateResult result = null;
                try {
                    result = getTemplate(getTemplateRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getTemplateRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Provides a list of the configuration sets associated with your Amazon SES
     * account in the current AWS Region. For information about using
     * configuration sets, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     * >Monitoring Your Amazon SES Sending Activity</a> in the <i>Amazon SES
     * Developer Guide.</i>
     * </p>
     * <p>
     * You can execute this operation no more than once per second. This
     * operation will return up to 1,000 configuration sets each time it is run.
     * If your Amazon SES account has more than 1,000 configuration sets, this
     * operation will also return a NextToken element. You can then execute the
     * <code>ListConfigurationSets</code> operation again, passing the
     * <code>NextToken</code> parameter and the value of the NextToken element
     * to retrieve additional results.
     * </p>
     * 
     * @param listConfigurationSetsRequest <p>
     *            Represents a request to list the configuration sets associated
     *            with your AWS account. Configuration sets enable you to
     *            publish email sending events. For information about using
     *            configuration sets, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListConfigurationSets service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<ListConfigurationSetsResult> listConfigurationSetsAsync(
            final ListConfigurationSetsRequest listConfigurationSetsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListConfigurationSetsResult>() {
            public ListConfigurationSetsResult call() throws Exception {
                return listConfigurationSets(listConfigurationSetsRequest);
            }
        });
    }

    /**
     * <p>
     * Provides a list of the configuration sets associated with your Amazon SES
     * account in the current AWS Region. For information about using
     * configuration sets, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     * >Monitoring Your Amazon SES Sending Activity</a> in the <i>Amazon SES
     * Developer Guide.</i>
     * </p>
     * <p>
     * You can execute this operation no more than once per second. This
     * operation will return up to 1,000 configuration sets each time it is run.
     * If your Amazon SES account has more than 1,000 configuration sets, this
     * operation will also return a NextToken element. You can then execute the
     * <code>ListConfigurationSets</code> operation again, passing the
     * <code>NextToken</code> parameter and the value of the NextToken element
     * to retrieve additional results.
     * </p>
     * 
     * @param listConfigurationSetsRequest <p>
     *            Represents a request to list the configuration sets associated
     *            with your AWS account. Configuration sets enable you to
     *            publish email sending events. For information about using
     *            configuration sets, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListConfigurationSets service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<ListConfigurationSetsResult> listConfigurationSetsAsync(
            final ListConfigurationSetsRequest listConfigurationSetsRequest,
            final AsyncHandler<ListConfigurationSetsRequest, ListConfigurationSetsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListConfigurationSetsResult>() {
            public ListConfigurationSetsResult call() throws Exception {
                ListConfigurationSetsResult result = null;
                try {
                    result = listConfigurationSets(listConfigurationSetsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listConfigurationSetsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists the existing custom verification email templates for your account
     * in the current AWS Region.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html"
     * >Using Custom Verification Email Templates</a> in the <i>Amazon SES
     * Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listCustomVerificationEmailTemplatesRequest <p>
     *            Represents a request to list the existing custom verification
     *            email templates for your account.
     *            </p>
     *            <p>
     *            For more information about custom verification email
     *            templates, see <a href=
     *            "ses/latest/DeveloperGuide/custom-verification-emails.html"
     *            >Using Custom Verification Email Templates</a> in the
     *            <i>Amazon SES Developer Guide</i>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListCustomVerificationEmailTemplates service method, as returned
     *         by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<ListCustomVerificationEmailTemplatesResult> listCustomVerificationEmailTemplatesAsync(
            final ListCustomVerificationEmailTemplatesRequest listCustomVerificationEmailTemplatesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListCustomVerificationEmailTemplatesResult>() {
            public ListCustomVerificationEmailTemplatesResult call() throws Exception {
                return listCustomVerificationEmailTemplates(listCustomVerificationEmailTemplatesRequest);
            }
        });
    }

    /**
     * <p>
     * Lists the existing custom verification email templates for your account
     * in the current AWS Region.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html"
     * >Using Custom Verification Email Templates</a> in the <i>Amazon SES
     * Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listCustomVerificationEmailTemplatesRequest <p>
     *            Represents a request to list the existing custom verification
     *            email templates for your account.
     *            </p>
     *            <p>
     *            For more information about custom verification email
     *            templates, see <a href=
     *            "ses/latest/DeveloperGuide/custom-verification-emails.html"
     *            >Using Custom Verification Email Templates</a> in the
     *            <i>Amazon SES Developer Guide</i>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListCustomVerificationEmailTemplates service method, as returned
     *         by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<ListCustomVerificationEmailTemplatesResult> listCustomVerificationEmailTemplatesAsync(
            final ListCustomVerificationEmailTemplatesRequest listCustomVerificationEmailTemplatesRequest,
            final AsyncHandler<ListCustomVerificationEmailTemplatesRequest, ListCustomVerificationEmailTemplatesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListCustomVerificationEmailTemplatesResult>() {
            public ListCustomVerificationEmailTemplatesResult call() throws Exception {
                ListCustomVerificationEmailTemplatesResult result = null;
                try {
                    result = listCustomVerificationEmailTemplates(listCustomVerificationEmailTemplatesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listCustomVerificationEmailTemplatesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns a list containing all of the identities (email addresses and
     * domains) for your AWS account in the current AWS Region, regardless of
     * verification status.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listIdentitiesRequest <p>
     *            Represents a request to return a list of all identities (email
     *            addresses and domains) that you have attempted to verify under
     *            your AWS account, regardless of verification status.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListIdentities service method, as returned by Amazon Simple Email
     *         Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<ListIdentitiesResult> listIdentitiesAsync(
            final ListIdentitiesRequest listIdentitiesRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<ListIdentitiesResult>() {
            public ListIdentitiesResult call() throws Exception {
                return listIdentities(listIdentitiesRequest);
            }
        });
    }

    /**
     * <p>
     * Returns a list containing all of the identities (email addresses and
     * domains) for your AWS account in the current AWS Region, regardless of
     * verification status.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listIdentitiesRequest <p>
     *            Represents a request to return a list of all identities (email
     *            addresses and domains) that you have attempted to verify under
     *            your AWS account, regardless of verification status.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListIdentities service method, as returned by Amazon Simple Email
     *         Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<ListIdentitiesResult> listIdentitiesAsync(
            final ListIdentitiesRequest listIdentitiesRequest,
            final AsyncHandler<ListIdentitiesRequest, ListIdentitiesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListIdentitiesResult>() {
            public ListIdentitiesResult call() throws Exception {
                ListIdentitiesResult result = null;
                try {
                    result = listIdentities(listIdentitiesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listIdentitiesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns a list of sending authorization policies that are attached to the
     * given identity (an email address or a domain). This API returns only a
     * list. If you want the actual policy content, you can use
     * <code>GetIdentityPolicies</code>.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the
     * identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listIdentityPoliciesRequest <p>
     *            Represents a request to return a list of sending authorization
     *            policies that are attached to an identity. Sending
     *            authorization is an Amazon SES feature that enables you to
     *            authorize other senders to use your identities. For
     *            information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListIdentityPolicies service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<ListIdentityPoliciesResult> listIdentityPoliciesAsync(
            final ListIdentityPoliciesRequest listIdentityPoliciesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListIdentityPoliciesResult>() {
            public ListIdentityPoliciesResult call() throws Exception {
                return listIdentityPolicies(listIdentityPoliciesRequest);
            }
        });
    }

    /**
     * <p>
     * Returns a list of sending authorization policies that are attached to the
     * given identity (an email address or a domain). This API returns only a
     * list. If you want the actual policy content, you can use
     * <code>GetIdentityPolicies</code>.
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the
     * identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listIdentityPoliciesRequest <p>
     *            Represents a request to return a list of sending authorization
     *            policies that are attached to an identity. Sending
     *            authorization is an Amazon SES feature that enables you to
     *            authorize other senders to use your identities. For
     *            information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListIdentityPolicies service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<ListIdentityPoliciesResult> listIdentityPoliciesAsync(
            final ListIdentityPoliciesRequest listIdentityPoliciesRequest,
            final AsyncHandler<ListIdentityPoliciesRequest, ListIdentityPoliciesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListIdentityPoliciesResult>() {
            public ListIdentityPoliciesResult call() throws Exception {
                ListIdentityPoliciesResult result = null;
                try {
                    result = listIdentityPolicies(listIdentityPoliciesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listIdentityPoliciesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists the IP address filters associated with your AWS account in the
     * current AWS Region.
     * </p>
     * <p>
     * For information about managing IP address filters, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listReceiptFiltersRequest <p>
     *            Represents a request to list the IP address filters that exist
     *            under your AWS account. You use IP address filters when you
     *            receive email with Amazon SES. For more information, see the
     *            <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListReceiptFilters service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<ListReceiptFiltersResult> listReceiptFiltersAsync(
            final ListReceiptFiltersRequest listReceiptFiltersRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListReceiptFiltersResult>() {
            public ListReceiptFiltersResult call() throws Exception {
                return listReceiptFilters(listReceiptFiltersRequest);
            }
        });
    }

    /**
     * <p>
     * Lists the IP address filters associated with your AWS account in the
     * current AWS Region.
     * </p>
     * <p>
     * For information about managing IP address filters, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listReceiptFiltersRequest <p>
     *            Represents a request to list the IP address filters that exist
     *            under your AWS account. You use IP address filters when you
     *            receive email with Amazon SES. For more information, see the
     *            <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListReceiptFilters service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<ListReceiptFiltersResult> listReceiptFiltersAsync(
            final ListReceiptFiltersRequest listReceiptFiltersRequest,
            final AsyncHandler<ListReceiptFiltersRequest, ListReceiptFiltersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListReceiptFiltersResult>() {
            public ListReceiptFiltersResult call() throws Exception {
                ListReceiptFiltersResult result = null;
                try {
                    result = listReceiptFilters(listReceiptFiltersRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listReceiptFiltersRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists the receipt rule sets that exist under your AWS account in the
     * current AWS Region. If there are additional receipt rule sets to be
     * retrieved, you will receive a <code>NextToken</code> that you can provide
     * to the next call to <code>ListReceiptRuleSets</code> to retrieve the
     * additional entries.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listReceiptRuleSetsRequest <p>
     *            Represents a request to list the receipt rule sets that exist
     *            under your AWS account. You use receipt rule sets to receive
     *            email with Amazon SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListReceiptRuleSets service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<ListReceiptRuleSetsResult> listReceiptRuleSetsAsync(
            final ListReceiptRuleSetsRequest listReceiptRuleSetsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListReceiptRuleSetsResult>() {
            public ListReceiptRuleSetsResult call() throws Exception {
                return listReceiptRuleSets(listReceiptRuleSetsRequest);
            }
        });
    }

    /**
     * <p>
     * Lists the receipt rule sets that exist under your AWS account in the
     * current AWS Region. If there are additional receipt rule sets to be
     * retrieved, you will receive a <code>NextToken</code> that you can provide
     * to the next call to <code>ListReceiptRuleSets</code> to retrieve the
     * additional entries.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listReceiptRuleSetsRequest <p>
     *            Represents a request to list the receipt rule sets that exist
     *            under your AWS account. You use receipt rule sets to receive
     *            email with Amazon SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ListReceiptRuleSets service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<ListReceiptRuleSetsResult> listReceiptRuleSetsAsync(
            final ListReceiptRuleSetsRequest listReceiptRuleSetsRequest,
            final AsyncHandler<ListReceiptRuleSetsRequest, ListReceiptRuleSetsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListReceiptRuleSetsResult>() {
            public ListReceiptRuleSetsResult call() throws Exception {
                ListReceiptRuleSetsResult result = null;
                try {
                    result = listReceiptRuleSets(listReceiptRuleSetsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listReceiptRuleSetsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Lists the email templates present in your Amazon SES account in the
     * current AWS Region.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listTemplatesRequest
     * @return A Java Future object containing the response from the
     *         ListTemplates service method, as returned by Amazon Simple Email
     *         Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<ListTemplatesResult> listTemplatesAsync(
            final ListTemplatesRequest listTemplatesRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<ListTemplatesResult>() {
            public ListTemplatesResult call() throws Exception {
                return listTemplates(listTemplatesRequest);
            }
        });
    }

    /**
     * <p>
     * Lists the email templates present in your Amazon SES account in the
     * current AWS Region.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listTemplatesRequest
     * @return A Java Future object containing the response from the
     *         ListTemplates service method, as returned by Amazon Simple Email
     *         Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<ListTemplatesResult> listTemplatesAsync(
            final ListTemplatesRequest listTemplatesRequest,
            final AsyncHandler<ListTemplatesRequest, ListTemplatesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTemplatesResult>() {
            public ListTemplatesResult call() throws Exception {
                ListTemplatesResult result = null;
                try {
                    result = listTemplates(listTemplatesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listTemplatesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deprecated. Use the <code>ListIdentities</code> operation to list the
     * email addresses and domains associated with your account.
     * </p>
     * 
     * @param listVerifiedEmailAddressesRequest
     * @return A Java Future object containing the response from the
     *         ListVerifiedEmailAddresses service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync(
            final ListVerifiedEmailAddressesRequest listVerifiedEmailAddressesRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListVerifiedEmailAddressesResult>() {
            public ListVerifiedEmailAddressesResult call() throws Exception {
                return listVerifiedEmailAddresses(listVerifiedEmailAddressesRequest);
            }
        });
    }

    /**
     * <p>
     * Deprecated. Use the <code>ListIdentities</code> operation to list the
     * email addresses and domains associated with your account.
     * </p>
     * 
     * @param listVerifiedEmailAddressesRequest
     * @return A Java Future object containing the response from the
     *         ListVerifiedEmailAddresses service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync(
            final ListVerifiedEmailAddressesRequest listVerifiedEmailAddressesRequest,
            final AsyncHandler<ListVerifiedEmailAddressesRequest, ListVerifiedEmailAddressesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListVerifiedEmailAddressesResult>() {
            public ListVerifiedEmailAddressesResult call() throws Exception {
                ListVerifiedEmailAddressesResult result = null;
                try {
                    result = listVerifiedEmailAddresses(listVerifiedEmailAddressesRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(listVerifiedEmailAddressesRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Adds or updates a sending authorization policy for the specified identity
     * (an email address or a domain).
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the
     * identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param putIdentityPolicyRequest <p>
     *            Represents a request to add or update a sending authorization
     *            policy for an identity. Sending authorization is an Amazon SES
     *            feature that enables you to authorize other senders to use
     *            your identities. For information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         PutIdentityPolicy service method, as returned by Amazon Simple
     *         Email Service.
     * @throws InvalidPolicyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<PutIdentityPolicyResult> putIdentityPolicyAsync(
            final PutIdentityPolicyRequest putIdentityPolicyRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<PutIdentityPolicyResult>() {
            public PutIdentityPolicyResult call() throws Exception {
                return putIdentityPolicy(putIdentityPolicyRequest);
            }
        });
    }

    /**
     * <p>
     * Adds or updates a sending authorization policy for the specified identity
     * (an email address or a domain).
     * </p>
     * <note>
     * <p>
     * This API is for the identity owner only. If you have not verified the
     * identity, this API will return an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param putIdentityPolicyRequest <p>
     *            Represents a request to add or update a sending authorization
     *            policy for an identity. Sending authorization is an Amazon SES
     *            feature that enables you to authorize other senders to use
     *            your identities. For information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         PutIdentityPolicy service method, as returned by Amazon Simple
     *         Email Service.
     * @throws InvalidPolicyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<PutIdentityPolicyResult> putIdentityPolicyAsync(
            final PutIdentityPolicyRequest putIdentityPolicyRequest,
            final AsyncHandler<PutIdentityPolicyRequest, PutIdentityPolicyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PutIdentityPolicyResult>() {
            public PutIdentityPolicyResult call() throws Exception {
                PutIdentityPolicyResult result = null;
                try {
                    result = putIdentityPolicy(putIdentityPolicyRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(putIdentityPolicyRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Reorders the receipt rules within a receipt rule set.
     * </p>
     * <note>
     * <p>
     * All of the rules in the rule set must be represented in this request.
     * That is, this API will return an error if the reorder request doesn't
     * explicitly position all of the rules.
     * </p>
     * </note>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param reorderReceiptRuleSetRequest <p>
     *            Represents a request to reorder the receipt rules within a
     *            receipt rule set. You use receipt rule sets to receive email
     *            with Amazon SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ReorderReceiptRuleSet service method, as returned by Amazon
     *         Simple Email Service.
     * @throws RuleSetDoesNotExistException
     * @throws RuleDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<ReorderReceiptRuleSetResult> reorderReceiptRuleSetAsync(
            final ReorderReceiptRuleSetRequest reorderReceiptRuleSetRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReorderReceiptRuleSetResult>() {
            public ReorderReceiptRuleSetResult call() throws Exception {
                return reorderReceiptRuleSet(reorderReceiptRuleSetRequest);
            }
        });
    }

    /**
     * <p>
     * Reorders the receipt rules within a receipt rule set.
     * </p>
     * <note>
     * <p>
     * All of the rules in the rule set must be represented in this request.
     * That is, this API will return an error if the reorder request doesn't
     * explicitly position all of the rules.
     * </p>
     * </note>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param reorderReceiptRuleSetRequest <p>
     *            Represents a request to reorder the receipt rules within a
     *            receipt rule set. You use receipt rule sets to receive email
     *            with Amazon SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         ReorderReceiptRuleSet service method, as returned by Amazon
     *         Simple Email Service.
     * @throws RuleSetDoesNotExistException
     * @throws RuleDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<ReorderReceiptRuleSetResult> reorderReceiptRuleSetAsync(
            final ReorderReceiptRuleSetRequest reorderReceiptRuleSetRequest,
            final AsyncHandler<ReorderReceiptRuleSetRequest, ReorderReceiptRuleSetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ReorderReceiptRuleSetResult>() {
            public ReorderReceiptRuleSetResult call() throws Exception {
                ReorderReceiptRuleSetResult result = null;
                try {
                    result = reorderReceiptRuleSet(reorderReceiptRuleSetRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(reorderReceiptRuleSetRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Generates and sends a bounce message to the sender of an email you
     * received through Amazon SES. You can only use this API on an email up to
     * 24 hours after you receive it.
     * </p>
     * <note>
     * <p>
     * You cannot use this API to send generic bounces for mail that was not
     * received by Amazon SES.
     * </p>
     * </note>
     * <p>
     * For information about receiving email through Amazon SES, see the <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param sendBounceRequest <p>
     *            Represents a request to send a bounce message to the sender of
     *            an email you received through Amazon SES.
     *            </p>
     * @return A Java Future object containing the response from the SendBounce
     *         service method, as returned by Amazon Simple Email Service.
     * @throws MessageRejectedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SendBounceResult> sendBounceAsync(final SendBounceRequest sendBounceRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendBounceResult>() {
            public SendBounceResult call() throws Exception {
                return sendBounce(sendBounceRequest);
            }
        });
    }

    /**
     * <p>
     * Generates and sends a bounce message to the sender of an email you
     * received through Amazon SES. You can only use this API on an email up to
     * 24 hours after you receive it.
     * </p>
     * <note>
     * <p>
     * You cannot use this API to send generic bounces for mail that was not
     * received by Amazon SES.
     * </p>
     * </note>
     * <p>
     * For information about receiving email through Amazon SES, see the <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param sendBounceRequest <p>
     *            Represents a request to send a bounce message to the sender of
     *            an email you received through Amazon SES.
     *            </p>
     * @return A Java Future object containing the response from the SendBounce
     *         service method, as returned by Amazon Simple Email Service.
     * @throws MessageRejectedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SendBounceResult> sendBounceAsync(final SendBounceRequest sendBounceRequest,
            final AsyncHandler<SendBounceRequest, SendBounceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendBounceResult>() {
            public SendBounceResult call() throws Exception {
                SendBounceResult result = null;
                try {
                    result = sendBounce(sendBounceRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(sendBounceRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Composes an email message to multiple destinations. The message body is
     * created using an email template.
     * </p>
     * <p>
     * In order to send email using the <code>SendBulkTemplatedEmail</code>
     * operation, your call to the API must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The call must refer to an existing email template. You can create email
     * templates using the <a>CreateTemplate</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message must be sent from a verified email address or domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account is still in the Amazon SES sandbox, you may only send to
     * verified addresses or domains, or to email addresses associated with the
     * Amazon SES Mailbox Simulator. For more information, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     * >Verifying Email Addresses and Domains</a> in the <i>Amazon SES Developer
     * Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum message size is 10 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each <code>Destination</code> parameter must include at least one
     * recipient email address. The recipient address can be a To: address, a
     * CC: address, or a BCC: address. If a recipient email address is invalid
     * (that is, it is not in the format
     * <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), the entire message
     * will be rejected, even if the message contains other recipients that are
     * valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message may not include more than 50 recipients, across the To:, CC:
     * and BCC: fields. If you need to send an email message to a larger
     * audience, you can divide your recipient list into groups of 50 or fewer,
     * and then call the <code>SendBulkTemplatedEmail</code> operation several
     * times to send the message to each group.
     * </p>
     * </li>
     * <li>
     * <p>
     * The number of destinations you can contact in a single call to the API
     * may be limited by your account's maximum sending rate.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sendBulkTemplatedEmailRequest <p>
     *            Represents a request to send a templated email to multiple
     *            destinations using Amazon SES. For more information, see the
     *            <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SendBulkTemplatedEmail service method, as returned by Amazon
     *         Simple Email Service.
     * @throws MessageRejectedException
     * @throws MailFromDomainNotVerifiedException
     * @throws ConfigurationSetDoesNotExistException
     * @throws TemplateDoesNotExistException
     * @throws ConfigurationSetSendingPausedException
     * @throws AccountSendingPausedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SendBulkTemplatedEmailResult> sendBulkTemplatedEmailAsync(
            final SendBulkTemplatedEmailRequest sendBulkTemplatedEmailRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendBulkTemplatedEmailResult>() {
            public SendBulkTemplatedEmailResult call() throws Exception {
                return sendBulkTemplatedEmail(sendBulkTemplatedEmailRequest);
            }
        });
    }

    /**
     * <p>
     * Composes an email message to multiple destinations. The message body is
     * created using an email template.
     * </p>
     * <p>
     * In order to send email using the <code>SendBulkTemplatedEmail</code>
     * operation, your call to the API must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The call must refer to an existing email template. You can create email
     * templates using the <a>CreateTemplate</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message must be sent from a verified email address or domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account is still in the Amazon SES sandbox, you may only send to
     * verified addresses or domains, or to email addresses associated with the
     * Amazon SES Mailbox Simulator. For more information, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     * >Verifying Email Addresses and Domains</a> in the <i>Amazon SES Developer
     * Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum message size is 10 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each <code>Destination</code> parameter must include at least one
     * recipient email address. The recipient address can be a To: address, a
     * CC: address, or a BCC: address. If a recipient email address is invalid
     * (that is, it is not in the format
     * <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), the entire message
     * will be rejected, even if the message contains other recipients that are
     * valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message may not include more than 50 recipients, across the To:, CC:
     * and BCC: fields. If you need to send an email message to a larger
     * audience, you can divide your recipient list into groups of 50 or fewer,
     * and then call the <code>SendBulkTemplatedEmail</code> operation several
     * times to send the message to each group.
     * </p>
     * </li>
     * <li>
     * <p>
     * The number of destinations you can contact in a single call to the API
     * may be limited by your account's maximum sending rate.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sendBulkTemplatedEmailRequest <p>
     *            Represents a request to send a templated email to multiple
     *            destinations using Amazon SES. For more information, see the
     *            <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SendBulkTemplatedEmail service method, as returned by Amazon
     *         Simple Email Service.
     * @throws MessageRejectedException
     * @throws MailFromDomainNotVerifiedException
     * @throws ConfigurationSetDoesNotExistException
     * @throws TemplateDoesNotExistException
     * @throws ConfigurationSetSendingPausedException
     * @throws AccountSendingPausedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SendBulkTemplatedEmailResult> sendBulkTemplatedEmailAsync(
            final SendBulkTemplatedEmailRequest sendBulkTemplatedEmailRequest,
            final AsyncHandler<SendBulkTemplatedEmailRequest, SendBulkTemplatedEmailResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendBulkTemplatedEmailResult>() {
            public SendBulkTemplatedEmailResult call() throws Exception {
                SendBulkTemplatedEmailResult result = null;
                try {
                    result = sendBulkTemplatedEmail(sendBulkTemplatedEmailRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(sendBulkTemplatedEmailRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Adds an email address to the list of identities for your Amazon SES
     * account in the current AWS Region and attempts to verify it. As a result
     * of executing this operation, a customized verification email is sent to
     * the specified address.
     * </p>
     * <p>
     * To use this operation, you must first create a custom verification email
     * template. For more information about creating and using custom
     * verification email templates, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html"
     * >Using Custom Verification Email Templates</a> in the <i>Amazon SES
     * Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param sendCustomVerificationEmailRequest <p>
     *            Represents a request to send a custom verification email to a
     *            specified recipient.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SendCustomVerificationEmail service method, as returned by Amazon
     *         Simple Email Service.
     * @throws MessageRejectedException
     * @throws ConfigurationSetDoesNotExistException
     * @throws CustomVerificationEmailTemplateDoesNotExistException
     * @throws FromEmailAddressNotVerifiedException
     * @throws ProductionAccessNotGrantedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SendCustomVerificationEmailResult> sendCustomVerificationEmailAsync(
            final SendCustomVerificationEmailRequest sendCustomVerificationEmailRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendCustomVerificationEmailResult>() {
            public SendCustomVerificationEmailResult call() throws Exception {
                return sendCustomVerificationEmail(sendCustomVerificationEmailRequest);
            }
        });
    }

    /**
     * <p>
     * Adds an email address to the list of identities for your Amazon SES
     * account in the current AWS Region and attempts to verify it. As a result
     * of executing this operation, a customized verification email is sent to
     * the specified address.
     * </p>
     * <p>
     * To use this operation, you must first create a custom verification email
     * template. For more information about creating and using custom
     * verification email templates, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html"
     * >Using Custom Verification Email Templates</a> in the <i>Amazon SES
     * Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param sendCustomVerificationEmailRequest <p>
     *            Represents a request to send a custom verification email to a
     *            specified recipient.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SendCustomVerificationEmail service method, as returned by Amazon
     *         Simple Email Service.
     * @throws MessageRejectedException
     * @throws ConfigurationSetDoesNotExistException
     * @throws CustomVerificationEmailTemplateDoesNotExistException
     * @throws FromEmailAddressNotVerifiedException
     * @throws ProductionAccessNotGrantedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SendCustomVerificationEmailResult> sendCustomVerificationEmailAsync(
            final SendCustomVerificationEmailRequest sendCustomVerificationEmailRequest,
            final AsyncHandler<SendCustomVerificationEmailRequest, SendCustomVerificationEmailResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendCustomVerificationEmailResult>() {
            public SendCustomVerificationEmailResult call() throws Exception {
                SendCustomVerificationEmailResult result = null;
                try {
                    result = sendCustomVerificationEmail(sendCustomVerificationEmailRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(sendCustomVerificationEmailRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Composes an email message and immediately queues it for sending. In order
     * to send email using the <code>SendEmail</code> operation, your message
     * must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The message must be sent from a verified email address or domain. If you
     * attempt to send email using a non-verified address or domain, the
     * operation will result in an "Email address not verified" error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account is still in the Amazon SES sandbox, you may only send to
     * verified addresses or domains, or to email addresses associated with the
     * Amazon SES Mailbox Simulator. For more information, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     * >Verifying Email Addresses and Domains</a> in the <i>Amazon SES Developer
     * Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum message size is 10 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message must include at least one recipient email address. The
     * recipient address can be a To: address, a CC: address, or a BCC: address.
     * If a recipient email address is invalid (that is, it is not in the format
     * <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), the entire message
     * will be rejected, even if the message contains other recipients that are
     * valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message may not include more than 50 recipients, across the To:, CC:
     * and BCC: fields. If you need to send an email message to a larger
     * audience, you can divide your recipient list into groups of 50 or fewer,
     * and then call the <code>SendEmail</code> operation several times to send
     * the message to each group.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * For every message that you send, the total number of recipients
     * (including each recipient in the To:, CC: and BCC: fields) is counted
     * against the maximum number of emails you can send in a 24-hour period
     * (your <i>sending quota</i>). For more information about sending quotas in
     * Amazon SES, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html"
     * >Managing Your Amazon SES Sending Limits</a> in the <i>Amazon SES
     * Developer Guide.</i>
     * </p>
     * </important>
     * 
     * @param sendEmailRequest <p>
     *            Represents a request to send a single formatted email using
     *            Amazon SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-formatted.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the SendEmail
     *         service method, as returned by Amazon Simple Email Service.
     * @throws MessageRejectedException
     * @throws MailFromDomainNotVerifiedException
     * @throws ConfigurationSetDoesNotExistException
     * @throws ConfigurationSetSendingPausedException
     * @throws AccountSendingPausedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SendEmailResult> sendEmailAsync(final SendEmailRequest sendEmailRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendEmailResult>() {
            public SendEmailResult call() throws Exception {
                return sendEmail(sendEmailRequest);
            }
        });
    }

    /**
     * <p>
     * Composes an email message and immediately queues it for sending. In order
     * to send email using the <code>SendEmail</code> operation, your message
     * must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The message must be sent from a verified email address or domain. If you
     * attempt to send email using a non-verified address or domain, the
     * operation will result in an "Email address not verified" error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account is still in the Amazon SES sandbox, you may only send to
     * verified addresses or domains, or to email addresses associated with the
     * Amazon SES Mailbox Simulator. For more information, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     * >Verifying Email Addresses and Domains</a> in the <i>Amazon SES Developer
     * Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum message size is 10 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message must include at least one recipient email address. The
     * recipient address can be a To: address, a CC: address, or a BCC: address.
     * If a recipient email address is invalid (that is, it is not in the format
     * <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), the entire message
     * will be rejected, even if the message contains other recipients that are
     * valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message may not include more than 50 recipients, across the To:, CC:
     * and BCC: fields. If you need to send an email message to a larger
     * audience, you can divide your recipient list into groups of 50 or fewer,
     * and then call the <code>SendEmail</code> operation several times to send
     * the message to each group.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * For every message that you send, the total number of recipients
     * (including each recipient in the To:, CC: and BCC: fields) is counted
     * against the maximum number of emails you can send in a 24-hour period
     * (your <i>sending quota</i>). For more information about sending quotas in
     * Amazon SES, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html"
     * >Managing Your Amazon SES Sending Limits</a> in the <i>Amazon SES
     * Developer Guide.</i>
     * </p>
     * </important>
     * 
     * @param sendEmailRequest <p>
     *            Represents a request to send a single formatted email using
     *            Amazon SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-formatted.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the SendEmail
     *         service method, as returned by Amazon Simple Email Service.
     * @throws MessageRejectedException
     * @throws MailFromDomainNotVerifiedException
     * @throws ConfigurationSetDoesNotExistException
     * @throws ConfigurationSetSendingPausedException
     * @throws AccountSendingPausedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SendEmailResult> sendEmailAsync(final SendEmailRequest sendEmailRequest,
            final AsyncHandler<SendEmailRequest, SendEmailResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendEmailResult>() {
            public SendEmailResult call() throws Exception {
                SendEmailResult result = null;
                try {
                    result = sendEmail(sendEmailRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(sendEmailRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Composes an email message and immediately queues it for sending.
     * </p>
     * <p>
     * This operation is more flexible than the <code>SendEmail</code> API
     * operation. When you use the <code>SendRawEmail</code> operation, you can
     * specify the headers of the message as well as its content. This
     * flexibility is useful, for example, when you want to send a multipart
     * MIME email (such a message that contains both a text and an HTML
     * version). You can also use this operation to send messages that include
     * attachments.
     * </p>
     * <p>
     * The <code>SendRawEmail</code> operation has the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can only send email from <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     * >verified email addresses or domains</a>. If you try to send email from
     * an address that isn't verified, the operation results in an
     * "Email address not verified" error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account is still in the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/request-production-access.html"
     * >Amazon SES sandbox</a>, you can only send email to other verified
     * addresses in your account, or to addresses that are associated with the
     * <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mailbox-simulator.html"
     * >Amazon SES mailbox simulator</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum message size, including attachments, is 10 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each message has to include at least one recipient address. A recipient
     * address includes any address on the To:, CC:, or BCC: lines.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a single message to more than one recipient address, and one
     * of the recipient addresses isn't in a valid format (that is, it's not in
     * the format <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), Amazon SES
     * rejects the entire message, even if the other addresses are valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each message can include up to 50 recipient addresses across the To:,
     * CC:, or BCC: lines. If you need to send a single message to more than 50
     * recipients, you have to split the list of recipient addresses into groups
     * of less than 50 recipients, and send separate messages to each group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SES allows you to specify 8-bit Content-Transfer-Encoding for MIME
     * message parts. However, if Amazon SES has to modify the contents of your
     * message (for example, if you use open and click tracking), 8-bit content
     * isn't preserved. For this reason, we highly recommend that you encode all
     * content that isn't 7-bit ASCII. For more information, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html#send-email-mime-encoding"
     * >MIME Encoding</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Additionally, keep the following considerations in mind when using the
     * <code>SendRawEmail</code> operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Although you can customize the message headers when using the
     * <code>SendRawEmail</code> operation, Amazon SES will automatically apply
     * its own <code>Message-ID</code> and <code>Date</code> headers; if you
     * passed these headers when creating the message, they will be overwritten
     * by the values that Amazon SES provides.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are using sending authorization to send on behalf of another user,
     * <code>SendRawEmail</code> enables you to specify the cross-account
     * identity for the email's Source, From, and Return-Path parameters in one
     * of two ways: you can pass optional parameters <code>SourceArn</code>,
     * <code>FromArn</code>, and/or <code>ReturnPathArn</code> to the API, or
     * you can include the following X-headers in the header of your raw email:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>X-SES-SOURCE-ARN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>X-SES-FROM-ARN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>X-SES-RETURN-PATH-ARN</code>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Do not include these X-headers in the DKIM signature; Amazon SES will
     * remove them before sending the email.
     * </p>
     * </important>
     * <p>
     * For most common sending authorization scenarios, we recommend that you
     * specify the <code>SourceIdentityArn</code> parameter and not the
     * <code>FromIdentityArn</code> or <code>ReturnPathIdentityArn</code>
     * parameters. If you only specify the <code>SourceIdentityArn</code>
     * parameter, Amazon SES will set the From and Return Path addresses to the
     * identity specified in <code>SourceIdentityArn</code>. For more
     * information about sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Using Sending Authorization with Amazon SES</a> in the <i>Amazon SES
     * Developer Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * For every message that you send, the total number of recipients
     * (including each recipient in the To:, CC: and BCC: fields) is counted
     * against the maximum number of emails you can send in a 24-hour period
     * (your <i>sending quota</i>). For more information about sending quotas in
     * Amazon SES, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html"
     * >Managing Your Amazon SES Sending Limits</a> in the <i>Amazon SES
     * Developer Guide.</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @param sendRawEmailRequest <p>
     *            Represents a request to send a single raw email using Amazon
     *            SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SendRawEmail service method, as returned by Amazon Simple Email
     *         Service.
     * @throws MessageRejectedException
     * @throws MailFromDomainNotVerifiedException
     * @throws ConfigurationSetDoesNotExistException
     * @throws ConfigurationSetSendingPausedException
     * @throws AccountSendingPausedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SendRawEmailResult> sendRawEmailAsync(
            final SendRawEmailRequest sendRawEmailRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<SendRawEmailResult>() {
            public SendRawEmailResult call() throws Exception {
                return sendRawEmail(sendRawEmailRequest);
            }
        });
    }

    /**
     * <p>
     * Composes an email message and immediately queues it for sending.
     * </p>
     * <p>
     * This operation is more flexible than the <code>SendEmail</code> API
     * operation. When you use the <code>SendRawEmail</code> operation, you can
     * specify the headers of the message as well as its content. This
     * flexibility is useful, for example, when you want to send a multipart
     * MIME email (such a message that contains both a text and an HTML
     * version). You can also use this operation to send messages that include
     * attachments.
     * </p>
     * <p>
     * The <code>SendRawEmail</code> operation has the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can only send email from <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     * >verified email addresses or domains</a>. If you try to send email from
     * an address that isn't verified, the operation results in an
     * "Email address not verified" error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account is still in the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/request-production-access.html"
     * >Amazon SES sandbox</a>, you can only send email to other verified
     * addresses in your account, or to addresses that are associated with the
     * <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mailbox-simulator.html"
     * >Amazon SES mailbox simulator</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum message size, including attachments, is 10 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each message has to include at least one recipient address. A recipient
     * address includes any address on the To:, CC:, or BCC: lines.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you send a single message to more than one recipient address, and one
     * of the recipient addresses isn't in a valid format (that is, it's not in
     * the format <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), Amazon SES
     * rejects the entire message, even if the other addresses are valid.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each message can include up to 50 recipient addresses across the To:,
     * CC:, or BCC: lines. If you need to send a single message to more than 50
     * recipients, you have to split the list of recipient addresses into groups
     * of less than 50 recipients, and send separate messages to each group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SES allows you to specify 8-bit Content-Transfer-Encoding for MIME
     * message parts. However, if Amazon SES has to modify the contents of your
     * message (for example, if you use open and click tracking), 8-bit content
     * isn't preserved. For this reason, we highly recommend that you encode all
     * content that isn't 7-bit ASCII. For more information, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html#send-email-mime-encoding"
     * >MIME Encoding</a> in the <i>Amazon SES Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Additionally, keep the following considerations in mind when using the
     * <code>SendRawEmail</code> operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Although you can customize the message headers when using the
     * <code>SendRawEmail</code> operation, Amazon SES will automatically apply
     * its own <code>Message-ID</code> and <code>Date</code> headers; if you
     * passed these headers when creating the message, they will be overwritten
     * by the values that Amazon SES provides.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are using sending authorization to send on behalf of another user,
     * <code>SendRawEmail</code> enables you to specify the cross-account
     * identity for the email's Source, From, and Return-Path parameters in one
     * of two ways: you can pass optional parameters <code>SourceArn</code>,
     * <code>FromArn</code>, and/or <code>ReturnPathArn</code> to the API, or
     * you can include the following X-headers in the header of your raw email:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>X-SES-SOURCE-ARN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>X-SES-FROM-ARN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>X-SES-RETURN-PATH-ARN</code>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Do not include these X-headers in the DKIM signature; Amazon SES will
     * remove them before sending the email.
     * </p>
     * </important>
     * <p>
     * For most common sending authorization scenarios, we recommend that you
     * specify the <code>SourceIdentityArn</code> parameter and not the
     * <code>FromIdentityArn</code> or <code>ReturnPathIdentityArn</code>
     * parameters. If you only specify the <code>SourceIdentityArn</code>
     * parameter, Amazon SES will set the From and Return Path addresses to the
     * identity specified in <code>SourceIdentityArn</code>. For more
     * information about sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Using Sending Authorization with Amazon SES</a> in the <i>Amazon SES
     * Developer Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * For every message that you send, the total number of recipients
     * (including each recipient in the To:, CC: and BCC: fields) is counted
     * against the maximum number of emails you can send in a 24-hour period
     * (your <i>sending quota</i>). For more information about sending quotas in
     * Amazon SES, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html"
     * >Managing Your Amazon SES Sending Limits</a> in the <i>Amazon SES
     * Developer Guide.</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @param sendRawEmailRequest <p>
     *            Represents a request to send a single raw email using Amazon
     *            SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SendRawEmail service method, as returned by Amazon Simple Email
     *         Service.
     * @throws MessageRejectedException
     * @throws MailFromDomainNotVerifiedException
     * @throws ConfigurationSetDoesNotExistException
     * @throws ConfigurationSetSendingPausedException
     * @throws AccountSendingPausedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SendRawEmailResult> sendRawEmailAsync(
            final SendRawEmailRequest sendRawEmailRequest,
            final AsyncHandler<SendRawEmailRequest, SendRawEmailResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendRawEmailResult>() {
            public SendRawEmailResult call() throws Exception {
                SendRawEmailResult result = null;
                try {
                    result = sendRawEmail(sendRawEmailRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(sendRawEmailRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Composes an email message using an email template and immediately queues
     * it for sending.
     * </p>
     * <p>
     * In order to send email using the <code>SendTemplatedEmail</code>
     * operation, your call to the API must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The call must refer to an existing email template. You can create email
     * templates using the <a>CreateTemplate</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message must be sent from a verified email address or domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account is still in the Amazon SES sandbox, you may only send to
     * verified addresses or domains, or to email addresses associated with the
     * Amazon SES Mailbox Simulator. For more information, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     * >Verifying Email Addresses and Domains</a> in the <i>Amazon SES Developer
     * Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum message size is 10 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * Calls to the <code>SendTemplatedEmail</code> operation may only include
     * one <code>Destination</code> parameter. A destination is a set of
     * recipients who will receive the same version of the email. The
     * <code>Destination</code> parameter can include up to 50 recipients,
     * across the To:, CC: and BCC: fields.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Destination</code> parameter must include at least one
     * recipient email address. The recipient address can be a To: address, a
     * CC: address, or a BCC: address. If a recipient email address is invalid
     * (that is, it is not in the format
     * <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), the entire message
     * will be rejected, even if the message contains other recipients that are
     * valid.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * If your call to the <code>SendTemplatedEmail</code> operation includes
     * all of the required parameters, Amazon SES accepts it and returns a
     * Message ID. However, if Amazon SES can't render the email because the
     * template contains errors, it doesn't send the email. Additionally,
     * because it already accepted the message, Amazon SES doesn't return a
     * message stating that it was unable to send the email.
     * </p>
     * <p>
     * For these reasons, we highly recommend that you set up Amazon SES to send
     * you notifications when Rendering Failure events occur. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html"
     * >Sending Personalized Email Using the Amazon SES API</a> in the <i>Amazon
     * Simple Email Service Developer Guide</i>.
     * </p>
     * </important>
     * 
     * @param sendTemplatedEmailRequest <p>
     *            Represents a request to send a templated email using Amazon
     *            SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SendTemplatedEmail service method, as returned by Amazon Simple
     *         Email Service.
     * @throws MessageRejectedException
     * @throws MailFromDomainNotVerifiedException
     * @throws ConfigurationSetDoesNotExistException
     * @throws TemplateDoesNotExistException
     * @throws ConfigurationSetSendingPausedException
     * @throws AccountSendingPausedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SendTemplatedEmailResult> sendTemplatedEmailAsync(
            final SendTemplatedEmailRequest sendTemplatedEmailRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendTemplatedEmailResult>() {
            public SendTemplatedEmailResult call() throws Exception {
                return sendTemplatedEmail(sendTemplatedEmailRequest);
            }
        });
    }

    /**
     * <p>
     * Composes an email message using an email template and immediately queues
     * it for sending.
     * </p>
     * <p>
     * In order to send email using the <code>SendTemplatedEmail</code>
     * operation, your call to the API must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The call must refer to an existing email template. You can create email
     * templates using the <a>CreateTemplate</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message must be sent from a verified email address or domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account is still in the Amazon SES sandbox, you may only send to
     * verified addresses or domains, or to email addresses associated with the
     * Amazon SES Mailbox Simulator. For more information, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     * >Verifying Email Addresses and Domains</a> in the <i>Amazon SES Developer
     * Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum message size is 10 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * Calls to the <code>SendTemplatedEmail</code> operation may only include
     * one <code>Destination</code> parameter. A destination is a set of
     * recipients who will receive the same version of the email. The
     * <code>Destination</code> parameter can include up to 50 recipients,
     * across the To:, CC: and BCC: fields.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Destination</code> parameter must include at least one
     * recipient email address. The recipient address can be a To: address, a
     * CC: address, or a BCC: address. If a recipient email address is invalid
     * (that is, it is not in the format
     * <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), the entire message
     * will be rejected, even if the message contains other recipients that are
     * valid.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * If your call to the <code>SendTemplatedEmail</code> operation includes
     * all of the required parameters, Amazon SES accepts it and returns a
     * Message ID. However, if Amazon SES can't render the email because the
     * template contains errors, it doesn't send the email. Additionally,
     * because it already accepted the message, Amazon SES doesn't return a
     * message stating that it was unable to send the email.
     * </p>
     * <p>
     * For these reasons, we highly recommend that you set up Amazon SES to send
     * you notifications when Rendering Failure events occur. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html"
     * >Sending Personalized Email Using the Amazon SES API</a> in the <i>Amazon
     * Simple Email Service Developer Guide</i>.
     * </p>
     * </important>
     * 
     * @param sendTemplatedEmailRequest <p>
     *            Represents a request to send a templated email using Amazon
     *            SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SendTemplatedEmail service method, as returned by Amazon Simple
     *         Email Service.
     * @throws MessageRejectedException
     * @throws MailFromDomainNotVerifiedException
     * @throws ConfigurationSetDoesNotExistException
     * @throws TemplateDoesNotExistException
     * @throws ConfigurationSetSendingPausedException
     * @throws AccountSendingPausedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SendTemplatedEmailResult> sendTemplatedEmailAsync(
            final SendTemplatedEmailRequest sendTemplatedEmailRequest,
            final AsyncHandler<SendTemplatedEmailRequest, SendTemplatedEmailResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendTemplatedEmailResult>() {
            public SendTemplatedEmailResult call() throws Exception {
                SendTemplatedEmailResult result = null;
                try {
                    result = sendTemplatedEmail(sendTemplatedEmailRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(sendTemplatedEmailRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Sets the specified receipt rule set as the active receipt rule set.
     * </p>
     * <note>
     * <p>
     * To disable your email-receiving through Amazon SES completely, you can
     * call this API with RuleSetName set to null.
     * </p>
     * </note>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param setActiveReceiptRuleSetRequest <p>
     *            Represents a request to set a receipt rule set as the active
     *            receipt rule set. You use receipt rule sets to receive email
     *            with Amazon SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetActiveReceiptRuleSet service method, as returned by Amazon
     *         Simple Email Service.
     * @throws RuleSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SetActiveReceiptRuleSetResult> setActiveReceiptRuleSetAsync(
            final SetActiveReceiptRuleSetRequest setActiveReceiptRuleSetRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetActiveReceiptRuleSetResult>() {
            public SetActiveReceiptRuleSetResult call() throws Exception {
                return setActiveReceiptRuleSet(setActiveReceiptRuleSetRequest);
            }
        });
    }

    /**
     * <p>
     * Sets the specified receipt rule set as the active receipt rule set.
     * </p>
     * <note>
     * <p>
     * To disable your email-receiving through Amazon SES completely, you can
     * call this API with RuleSetName set to null.
     * </p>
     * </note>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param setActiveReceiptRuleSetRequest <p>
     *            Represents a request to set a receipt rule set as the active
     *            receipt rule set. You use receipt rule sets to receive email
     *            with Amazon SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetActiveReceiptRuleSet service method, as returned by Amazon
     *         Simple Email Service.
     * @throws RuleSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SetActiveReceiptRuleSetResult> setActiveReceiptRuleSetAsync(
            final SetActiveReceiptRuleSetRequest setActiveReceiptRuleSetRequest,
            final AsyncHandler<SetActiveReceiptRuleSetRequest, SetActiveReceiptRuleSetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetActiveReceiptRuleSetResult>() {
            public SetActiveReceiptRuleSetResult call() throws Exception {
                SetActiveReceiptRuleSetResult result = null;
                try {
                    result = setActiveReceiptRuleSet(setActiveReceiptRuleSetRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(setActiveReceiptRuleSetRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Enables or disables Easy DKIM signing of email sent from an identity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If Easy DKIM signing is enabled for a domain name identity (such as
     * <code>example.com</code>), then Amazon SES will DKIM-sign all email sent
     * by addresses under that domain name (for example,
     * <code>user@example.com</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * If Easy DKIM signing is enabled for an email address, then Amazon SES
     * will DKIM-sign all email sent by that email address.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For email addresses (for example, <code>user@example.com</code>), you can
     * only enable Easy DKIM signing if the corresponding domain (in this case,
     * <code>example.com</code>) has been set up for Easy DKIM using the AWS
     * Console or the <code>VerifyDomainDkim</code> operation.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * <p>
     * For more information about Easy DKIM signing, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityDkimEnabledRequest <p>
     *            Represents a request to enable or disable Amazon SES Easy DKIM
     *            signing for an identity. For more information about setting up
     *            Easy DKIM, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetIdentityDkimEnabled service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SetIdentityDkimEnabledResult> setIdentityDkimEnabledAsync(
            final SetIdentityDkimEnabledRequest setIdentityDkimEnabledRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetIdentityDkimEnabledResult>() {
            public SetIdentityDkimEnabledResult call() throws Exception {
                return setIdentityDkimEnabled(setIdentityDkimEnabledRequest);
            }
        });
    }

    /**
     * <p>
     * Enables or disables Easy DKIM signing of email sent from an identity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If Easy DKIM signing is enabled for a domain name identity (such as
     * <code>example.com</code>), then Amazon SES will DKIM-sign all email sent
     * by addresses under that domain name (for example,
     * <code>user@example.com</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * If Easy DKIM signing is enabled for an email address, then Amazon SES
     * will DKIM-sign all email sent by that email address.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For email addresses (for example, <code>user@example.com</code>), you can
     * only enable Easy DKIM signing if the corresponding domain (in this case,
     * <code>example.com</code>) has been set up for Easy DKIM using the AWS
     * Console or the <code>VerifyDomainDkim</code> operation.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * <p>
     * For more information about Easy DKIM signing, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityDkimEnabledRequest <p>
     *            Represents a request to enable or disable Amazon SES Easy DKIM
     *            signing for an identity. For more information about setting up
     *            Easy DKIM, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetIdentityDkimEnabled service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SetIdentityDkimEnabledResult> setIdentityDkimEnabledAsync(
            final SetIdentityDkimEnabledRequest setIdentityDkimEnabledRequest,
            final AsyncHandler<SetIdentityDkimEnabledRequest, SetIdentityDkimEnabledResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetIdentityDkimEnabledResult>() {
            public SetIdentityDkimEnabledResult call() throws Exception {
                SetIdentityDkimEnabledResult result = null;
                try {
                    result = setIdentityDkimEnabled(setIdentityDkimEnabledRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(setIdentityDkimEnabledRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Given an identity (an email address or a domain), enables or disables
     * whether Amazon SES forwards bounce and complaint notifications as email.
     * Feedback forwarding can only be disabled when Amazon Simple Notification
     * Service (Amazon SNS) topics are specified for both bounces and
     * complaints.
     * </p>
     * <note>
     * <p>
     * Feedback forwarding does not apply to delivery notifications. Delivery
     * notifications are only available through Amazon SNS.
     * </p>
     * </note>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see the
     * <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityFeedbackForwardingEnabledRequest <p>
     *            Represents a request to enable or disable whether Amazon SES
     *            forwards you bounce and complaint notifications through email.
     *            For information about email feedback forwarding, see the <a
     *            href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-email.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetIdentityFeedbackForwardingEnabled service method, as returned
     *         by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SetIdentityFeedbackForwardingEnabledResult> setIdentityFeedbackForwardingEnabledAsync(
            final SetIdentityFeedbackForwardingEnabledRequest setIdentityFeedbackForwardingEnabledRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetIdentityFeedbackForwardingEnabledResult>() {
            public SetIdentityFeedbackForwardingEnabledResult call() throws Exception {
                return setIdentityFeedbackForwardingEnabled(setIdentityFeedbackForwardingEnabledRequest);
            }
        });
    }

    /**
     * <p>
     * Given an identity (an email address or a domain), enables or disables
     * whether Amazon SES forwards bounce and complaint notifications as email.
     * Feedback forwarding can only be disabled when Amazon Simple Notification
     * Service (Amazon SNS) topics are specified for both bounces and
     * complaints.
     * </p>
     * <note>
     * <p>
     * Feedback forwarding does not apply to delivery notifications. Delivery
     * notifications are only available through Amazon SNS.
     * </p>
     * </note>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see the
     * <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityFeedbackForwardingEnabledRequest <p>
     *            Represents a request to enable or disable whether Amazon SES
     *            forwards you bounce and complaint notifications through email.
     *            For information about email feedback forwarding, see the <a
     *            href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-email.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetIdentityFeedbackForwardingEnabled service method, as returned
     *         by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SetIdentityFeedbackForwardingEnabledResult> setIdentityFeedbackForwardingEnabledAsync(
            final SetIdentityFeedbackForwardingEnabledRequest setIdentityFeedbackForwardingEnabledRequest,
            final AsyncHandler<SetIdentityFeedbackForwardingEnabledRequest, SetIdentityFeedbackForwardingEnabledResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetIdentityFeedbackForwardingEnabledResult>() {
            public SetIdentityFeedbackForwardingEnabledResult call() throws Exception {
                SetIdentityFeedbackForwardingEnabledResult result = null;
                try {
                    result = setIdentityFeedbackForwardingEnabled(setIdentityFeedbackForwardingEnabledRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(setIdentityFeedbackForwardingEnabledRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Given an identity (an email address or a domain), sets whether Amazon SES
     * includes the original email headers in the Amazon Simple Notification
     * Service (Amazon SNS) notifications of a specified type.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see the
     * <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityHeadersInNotificationsEnabledRequest <p>
     *            Represents a request to set whether Amazon SES includes the
     *            original email headers in the Amazon SNS notifications of a
     *            specified type. For information about notifications, see the
     *            <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-sns.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetIdentityHeadersInNotificationsEnabled service method, as
     *         returned by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SetIdentityHeadersInNotificationsEnabledResult> setIdentityHeadersInNotificationsEnabledAsync(
            final SetIdentityHeadersInNotificationsEnabledRequest setIdentityHeadersInNotificationsEnabledRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService
                .submit(new Callable<SetIdentityHeadersInNotificationsEnabledResult>() {
                    public SetIdentityHeadersInNotificationsEnabledResult call() throws Exception {
                        return setIdentityHeadersInNotificationsEnabled(setIdentityHeadersInNotificationsEnabledRequest);
                    }
                });
    }

    /**
     * <p>
     * Given an identity (an email address or a domain), sets whether Amazon SES
     * includes the original email headers in the Amazon Simple Notification
     * Service (Amazon SNS) notifications of a specified type.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see the
     * <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityHeadersInNotificationsEnabledRequest <p>
     *            Represents a request to set whether Amazon SES includes the
     *            original email headers in the Amazon SNS notifications of a
     *            specified type. For information about notifications, see the
     *            <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-sns.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetIdentityHeadersInNotificationsEnabled service method, as
     *         returned by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SetIdentityHeadersInNotificationsEnabledResult> setIdentityHeadersInNotificationsEnabledAsync(
            final SetIdentityHeadersInNotificationsEnabledRequest setIdentityHeadersInNotificationsEnabledRequest,
            final AsyncHandler<SetIdentityHeadersInNotificationsEnabledRequest, SetIdentityHeadersInNotificationsEnabledResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService
                .submit(new Callable<SetIdentityHeadersInNotificationsEnabledResult>() {
                    public SetIdentityHeadersInNotificationsEnabledResult call() throws Exception {
                        SetIdentityHeadersInNotificationsEnabledResult result = null;
                        try {
                            result = setIdentityHeadersInNotificationsEnabled(setIdentityHeadersInNotificationsEnabledRequest);
                        } catch (Exception ex) {
                            asyncHandler.onError(ex);
                            throw ex;
                        }
                        asyncHandler.onSuccess(setIdentityHeadersInNotificationsEnabledRequest,
                                result);
                        return result;
                    }
                });
    }

    /**
     * <p>
     * Enables or disables the custom MAIL FROM domain setup for a verified
     * identity (an email address or a domain).
     * </p>
     * <important>
     * <p>
     * To send emails using the specified MAIL FROM domain, you must add an MX
     * record to your MAIL FROM domain's DNS settings. If you want your emails
     * to pass Sender Policy Framework (SPF) checks, you must also add or update
     * an SPF record. For more information, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from-set.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </important>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param setIdentityMailFromDomainRequest <p>
     *            Represents a request to enable or disable the Amazon SES
     *            custom MAIL FROM domain setup for a verified identity. For
     *            information about using a custom MAIL FROM domain, see the <a
     *            href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetIdentityMailFromDomain service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SetIdentityMailFromDomainResult> setIdentityMailFromDomainAsync(
            final SetIdentityMailFromDomainRequest setIdentityMailFromDomainRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetIdentityMailFromDomainResult>() {
            public SetIdentityMailFromDomainResult call() throws Exception {
                return setIdentityMailFromDomain(setIdentityMailFromDomainRequest);
            }
        });
    }

    /**
     * <p>
     * Enables or disables the custom MAIL FROM domain setup for a verified
     * identity (an email address or a domain).
     * </p>
     * <important>
     * <p>
     * To send emails using the specified MAIL FROM domain, you must add an MX
     * record to your MAIL FROM domain's DNS settings. If you want your emails
     * to pass Sender Policy Framework (SPF) checks, you must also add or update
     * an SPF record. For more information, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from-set.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </important>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param setIdentityMailFromDomainRequest <p>
     *            Represents a request to enable or disable the Amazon SES
     *            custom MAIL FROM domain setup for a verified identity. For
     *            information about using a custom MAIL FROM domain, see the <a
     *            href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetIdentityMailFromDomain service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SetIdentityMailFromDomainResult> setIdentityMailFromDomainAsync(
            final SetIdentityMailFromDomainRequest setIdentityMailFromDomainRequest,
            final AsyncHandler<SetIdentityMailFromDomainRequest, SetIdentityMailFromDomainResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetIdentityMailFromDomainResult>() {
            public SetIdentityMailFromDomainResult call() throws Exception {
                SetIdentityMailFromDomainResult result = null;
                try {
                    result = setIdentityMailFromDomain(setIdentityMailFromDomainRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(setIdentityMailFromDomainRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Sets an Amazon Simple Notification Service (Amazon SNS) topic to use when
     * delivering notifications. When you use this operation, you specify a
     * verified identity, such as an email address or domain. When you send an
     * email that uses the chosen identity in the Source field, Amazon SES sends
     * notifications to the topic you specified. You can send bounce, complaint,
     * or delivery notifications (or any combination of the three) to the Amazon
     * SNS topic that you specify.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * <p>
     * For more information about feedback notification, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityNotificationTopicRequest <p>
     *            Represents a request to specify the Amazon SNS topic to which
     *            Amazon SES will publish bounce, complaint, or delivery
     *            notifications for emails sent with that identity as the
     *            Source. For information about Amazon SES notifications, see
     *            the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-sns.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetIdentityNotificationTopic service method, as returned by
     *         Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SetIdentityNotificationTopicResult> setIdentityNotificationTopicAsync(
            final SetIdentityNotificationTopicRequest setIdentityNotificationTopicRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetIdentityNotificationTopicResult>() {
            public SetIdentityNotificationTopicResult call() throws Exception {
                return setIdentityNotificationTopic(setIdentityNotificationTopicRequest);
            }
        });
    }

    /**
     * <p>
     * Sets an Amazon Simple Notification Service (Amazon SNS) topic to use when
     * delivering notifications. When you use this operation, you specify a
     * verified identity, such as an email address or domain. When you send an
     * email that uses the chosen identity in the Source field, Amazon SES sends
     * notifications to the topic you specified. You can send bounce, complaint,
     * or delivery notifications (or any combination of the three) to the Amazon
     * SNS topic that you specify.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * <p>
     * For more information about feedback notification, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityNotificationTopicRequest <p>
     *            Represents a request to specify the Amazon SNS topic to which
     *            Amazon SES will publish bounce, complaint, or delivery
     *            notifications for emails sent with that identity as the
     *            Source. For information about Amazon SES notifications, see
     *            the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-sns.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetIdentityNotificationTopic service method, as returned by
     *         Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SetIdentityNotificationTopicResult> setIdentityNotificationTopicAsync(
            final SetIdentityNotificationTopicRequest setIdentityNotificationTopicRequest,
            final AsyncHandler<SetIdentityNotificationTopicRequest, SetIdentityNotificationTopicResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetIdentityNotificationTopicResult>() {
            public SetIdentityNotificationTopicResult call() throws Exception {
                SetIdentityNotificationTopicResult result = null;
                try {
                    result = setIdentityNotificationTopic(setIdentityNotificationTopicRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(setIdentityNotificationTopicRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Sets the position of the specified receipt rule in the receipt rule set.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param setReceiptRulePositionRequest <p>
     *            Represents a request to set the position of a receipt rule in
     *            a receipt rule set. You use receipt rule sets to receive email
     *            with Amazon SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetReceiptRulePosition service method, as returned by Amazon
     *         Simple Email Service.
     * @throws RuleSetDoesNotExistException
     * @throws RuleDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SetReceiptRulePositionResult> setReceiptRulePositionAsync(
            final SetReceiptRulePositionRequest setReceiptRulePositionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetReceiptRulePositionResult>() {
            public SetReceiptRulePositionResult call() throws Exception {
                return setReceiptRulePosition(setReceiptRulePositionRequest);
            }
        });
    }

    /**
     * <p>
     * Sets the position of the specified receipt rule in the receipt rule set.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param setReceiptRulePositionRequest <p>
     *            Represents a request to set the position of a receipt rule in
     *            a receipt rule set. You use receipt rule sets to receive email
     *            with Amazon SES. For more information, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         SetReceiptRulePosition service method, as returned by Amazon
     *         Simple Email Service.
     * @throws RuleSetDoesNotExistException
     * @throws RuleDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<SetReceiptRulePositionResult> setReceiptRulePositionAsync(
            final SetReceiptRulePositionRequest setReceiptRulePositionRequest,
            final AsyncHandler<SetReceiptRulePositionRequest, SetReceiptRulePositionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetReceiptRulePositionResult>() {
            public SetReceiptRulePositionResult call() throws Exception {
                SetReceiptRulePositionResult result = null;
                try {
                    result = setReceiptRulePosition(setReceiptRulePositionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(setReceiptRulePositionRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Creates a preview of the MIME content of an email when provided with a
     * template and a set of replacement data.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param testRenderTemplateRequest
     * @return A Java Future object containing the response from the
     *         TestRenderTemplate service method, as returned by Amazon Simple
     *         Email Service.
     * @throws TemplateDoesNotExistException
     * @throws InvalidRenderingParameterException
     * @throws MissingRenderingAttributeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<TestRenderTemplateResult> testRenderTemplateAsync(
            final TestRenderTemplateRequest testRenderTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<TestRenderTemplateResult>() {
            public TestRenderTemplateResult call() throws Exception {
                return testRenderTemplate(testRenderTemplateRequest);
            }
        });
    }

    /**
     * <p>
     * Creates a preview of the MIME content of an email when provided with a
     * template and a set of replacement data.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param testRenderTemplateRequest
     * @return A Java Future object containing the response from the
     *         TestRenderTemplate service method, as returned by Amazon Simple
     *         Email Service.
     * @throws TemplateDoesNotExistException
     * @throws InvalidRenderingParameterException
     * @throws MissingRenderingAttributeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<TestRenderTemplateResult> testRenderTemplateAsync(
            final TestRenderTemplateRequest testRenderTemplateRequest,
            final AsyncHandler<TestRenderTemplateRequest, TestRenderTemplateResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<TestRenderTemplateResult>() {
            public TestRenderTemplateResult call() throws Exception {
                TestRenderTemplateResult result = null;
                try {
                    result = testRenderTemplate(testRenderTemplateRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(testRenderTemplateRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Enables or disables email sending across your entire Amazon SES account
     * in the current AWS Region. You can use this operation in conjunction with
     * Amazon CloudWatch alarms to temporarily pause email sending across your
     * Amazon SES account in a given AWS Region when reputation metrics (such as
     * your bounce or complaint rates) reach certain thresholds.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateAccountSendingEnabledRequest <p>
     *            Represents a request to enable or disable the email sending
     *            capabilities for your entire Amazon SES account.
     *            </p>
     * @return A Java Future object containing the response from the
     *         UpdateAccountSendingEnabled service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<Void> updateAccountSendingEnabledAsync(
            final UpdateAccountSendingEnabledRequest updateAccountSendingEnabledRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateAccountSendingEnabled(updateAccountSendingEnabledRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Enables or disables email sending across your entire Amazon SES account
     * in the current AWS Region. You can use this operation in conjunction with
     * Amazon CloudWatch alarms to temporarily pause email sending across your
     * Amazon SES account in a given AWS Region when reputation metrics (such as
     * your bounce or complaint rates) reach certain thresholds.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateAccountSendingEnabledRequest <p>
     *            Represents a request to enable or disable the email sending
     *            capabilities for your entire Amazon SES account.
     *            </p>
     * @return A Java Future object containing the response from the
     *         UpdateAccountSendingEnabled service method, as returned by Amazon
     *         Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<Void> updateAccountSendingEnabledAsync(
            final UpdateAccountSendingEnabledRequest updateAccountSendingEnabledRequest,
            final AsyncHandler<UpdateAccountSendingEnabledRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateAccountSendingEnabled(updateAccountSendingEnabledRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateAccountSendingEnabledRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates the event destination of a configuration set. Event destinations
     * are associated with configuration sets, which enable you to publish email
     * sending events to Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon
     * Simple Notification Service (Amazon SNS). For information about using
     * configuration sets, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     * >Monitoring Your Amazon SES Sending Activity</a> in the <i>Amazon SES
     * Developer Guide.</i>
     * </p>
     * <note>
     * <p>
     * When you create or update an event destination, you must provide one, and
     * only one, destination. The destination can be Amazon CloudWatch, Amazon
     * Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS).
     * </p>
     * </note>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateConfigurationSetEventDestinationRequest <p>
     *            Represents a request to update the event destination of a
     *            configuration set. Configuration sets enable you to publish
     *            email sending events. For information about using
     *            configuration sets, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         UpdateConfigurationSetEventDestination service method, as
     *         returned by Amazon Simple Email Service.
     * @throws ConfigurationSetDoesNotExistException
     * @throws EventDestinationDoesNotExistException
     * @throws InvalidCloudWatchDestinationException
     * @throws InvalidFirehoseDestinationException
     * @throws InvalidSNSDestinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<UpdateConfigurationSetEventDestinationResult> updateConfigurationSetEventDestinationAsync(
            final UpdateConfigurationSetEventDestinationRequest updateConfigurationSetEventDestinationRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateConfigurationSetEventDestinationResult>() {
            public UpdateConfigurationSetEventDestinationResult call() throws Exception {
                return updateConfigurationSetEventDestination(updateConfigurationSetEventDestinationRequest);
            }
        });
    }

    /**
     * <p>
     * Updates the event destination of a configuration set. Event destinations
     * are associated with configuration sets, which enable you to publish email
     * sending events to Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon
     * Simple Notification Service (Amazon SNS). For information about using
     * configuration sets, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     * >Monitoring Your Amazon SES Sending Activity</a> in the <i>Amazon SES
     * Developer Guide.</i>
     * </p>
     * <note>
     * <p>
     * When you create or update an event destination, you must provide one, and
     * only one, destination. The destination can be Amazon CloudWatch, Amazon
     * Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS).
     * </p>
     * </note>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateConfigurationSetEventDestinationRequest <p>
     *            Represents a request to update the event destination of a
     *            configuration set. Configuration sets enable you to publish
     *            email sending events. For information about using
     *            configuration sets, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         UpdateConfigurationSetEventDestination service method, as
     *         returned by Amazon Simple Email Service.
     * @throws ConfigurationSetDoesNotExistException
     * @throws EventDestinationDoesNotExistException
     * @throws InvalidCloudWatchDestinationException
     * @throws InvalidFirehoseDestinationException
     * @throws InvalidSNSDestinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<UpdateConfigurationSetEventDestinationResult> updateConfigurationSetEventDestinationAsync(
            final UpdateConfigurationSetEventDestinationRequest updateConfigurationSetEventDestinationRequest,
            final AsyncHandler<UpdateConfigurationSetEventDestinationRequest, UpdateConfigurationSetEventDestinationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateConfigurationSetEventDestinationResult>() {
            public UpdateConfigurationSetEventDestinationResult call() throws Exception {
                UpdateConfigurationSetEventDestinationResult result = null;
                try {
                    result = updateConfigurationSetEventDestination(updateConfigurationSetEventDestinationRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateConfigurationSetEventDestinationRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Enables or disables the publishing of reputation metrics for emails sent
     * using a specific configuration set in a given AWS Region. Reputation
     * metrics include bounce and complaint rates. These metrics are published
     * to Amazon CloudWatch. By using CloudWatch, you can create alarms when
     * bounce or complaint rates exceed certain thresholds.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateConfigurationSetReputationMetricsEnabledRequest <p>
     *            Represents a request to modify the reputation metric
     *            publishing settings for a configuration set.
     *            </p>
     * @return A Java Future object containing the response from the
     *         UpdateConfigurationSetReputationMetricsEnabled service method, as
     *         returned by Amazon Simple Email Service.
     * @throws ConfigurationSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<Void> updateConfigurationSetReputationMetricsEnabledAsync(
            final UpdateConfigurationSetReputationMetricsEnabledRequest updateConfigurationSetReputationMetricsEnabledRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateConfigurationSetReputationMetricsEnabled(updateConfigurationSetReputationMetricsEnabledRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Enables or disables the publishing of reputation metrics for emails sent
     * using a specific configuration set in a given AWS Region. Reputation
     * metrics include bounce and complaint rates. These metrics are published
     * to Amazon CloudWatch. By using CloudWatch, you can create alarms when
     * bounce or complaint rates exceed certain thresholds.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateConfigurationSetReputationMetricsEnabledRequest <p>
     *            Represents a request to modify the reputation metric
     *            publishing settings for a configuration set.
     *            </p>
     * @return A Java Future object containing the response from the
     *         UpdateConfigurationSetReputationMetricsEnabled service method, as
     *         returned by Amazon Simple Email Service.
     * @throws ConfigurationSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<Void> updateConfigurationSetReputationMetricsEnabledAsync(
            final UpdateConfigurationSetReputationMetricsEnabledRequest updateConfigurationSetReputationMetricsEnabledRequest,
            final AsyncHandler<UpdateConfigurationSetReputationMetricsEnabledRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateConfigurationSetReputationMetricsEnabled(updateConfigurationSetReputationMetricsEnabledRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateConfigurationSetReputationMetricsEnabledRequest,
                        result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Enables or disables email sending for messages sent using a specific
     * configuration set in a given AWS Region. You can use this operation in
     * conjunction with Amazon CloudWatch alarms to temporarily pause email
     * sending for a configuration set when the reputation metrics for that
     * configuration set (such as your bounce on complaint rate) exceed certain
     * thresholds.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateConfigurationSetSendingEnabledRequest <p>
     *            Represents a request to enable or disable the email sending
     *            capabilities for a specific configuration set.
     *            </p>
     * @return A Java Future object containing the response from the
     *         UpdateConfigurationSetSendingEnabled service method, as returned
     *         by Amazon Simple Email Service.
     * @throws ConfigurationSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<Void> updateConfigurationSetSendingEnabledAsync(
            final UpdateConfigurationSetSendingEnabledRequest updateConfigurationSetSendingEnabledRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateConfigurationSetSendingEnabled(updateConfigurationSetSendingEnabledRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Enables or disables email sending for messages sent using a specific
     * configuration set in a given AWS Region. You can use this operation in
     * conjunction with Amazon CloudWatch alarms to temporarily pause email
     * sending for a configuration set when the reputation metrics for that
     * configuration set (such as your bounce on complaint rate) exceed certain
     * thresholds.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateConfigurationSetSendingEnabledRequest <p>
     *            Represents a request to enable or disable the email sending
     *            capabilities for a specific configuration set.
     *            </p>
     * @return A Java Future object containing the response from the
     *         UpdateConfigurationSetSendingEnabled service method, as returned
     *         by Amazon Simple Email Service.
     * @throws ConfigurationSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<Void> updateConfigurationSetSendingEnabledAsync(
            final UpdateConfigurationSetSendingEnabledRequest updateConfigurationSetSendingEnabledRequest,
            final AsyncHandler<UpdateConfigurationSetSendingEnabledRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateConfigurationSetSendingEnabled(updateConfigurationSetSendingEnabledRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateConfigurationSetSendingEnabledRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Modifies an association between a configuration set and a custom domain
     * for open and click event tracking.
     * </p>
     * <p>
     * By default, images and links used for tracking open and click events are
     * hosted on domains operated by Amazon SES. You can configure a subdomain
     * of your own to handle these events. For information about using custom
     * domains, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/configure-custom-open-click-domains.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param updateConfigurationSetTrackingOptionsRequest <p>
     *            Represents a request to update the tracking options for a
     *            configuration set.
     *            </p>
     * @return A Java Future object containing the response from the
     *         UpdateConfigurationSetTrackingOptions service method, as returned
     *         by Amazon Simple Email Service.
     * @throws ConfigurationSetDoesNotExistException
     * @throws TrackingOptionsDoesNotExistException
     * @throws InvalidTrackingOptionsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<UpdateConfigurationSetTrackingOptionsResult> updateConfigurationSetTrackingOptionsAsync(
            final UpdateConfigurationSetTrackingOptionsRequest updateConfigurationSetTrackingOptionsRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateConfigurationSetTrackingOptionsResult>() {
            public UpdateConfigurationSetTrackingOptionsResult call() throws Exception {
                return updateConfigurationSetTrackingOptions(updateConfigurationSetTrackingOptionsRequest);
            }
        });
    }

    /**
     * <p>
     * Modifies an association between a configuration set and a custom domain
     * for open and click event tracking.
     * </p>
     * <p>
     * By default, images and links used for tracking open and click events are
     * hosted on domains operated by Amazon SES. You can configure a subdomain
     * of your own to handle these events. For information about using custom
     * domains, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/configure-custom-open-click-domains.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param updateConfigurationSetTrackingOptionsRequest <p>
     *            Represents a request to update the tracking options for a
     *            configuration set.
     *            </p>
     * @return A Java Future object containing the response from the
     *         UpdateConfigurationSetTrackingOptions service method, as returned
     *         by Amazon Simple Email Service.
     * @throws ConfigurationSetDoesNotExistException
     * @throws TrackingOptionsDoesNotExistException
     * @throws InvalidTrackingOptionsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<UpdateConfigurationSetTrackingOptionsResult> updateConfigurationSetTrackingOptionsAsync(
            final UpdateConfigurationSetTrackingOptionsRequest updateConfigurationSetTrackingOptionsRequest,
            final AsyncHandler<UpdateConfigurationSetTrackingOptionsRequest, UpdateConfigurationSetTrackingOptionsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateConfigurationSetTrackingOptionsResult>() {
            public UpdateConfigurationSetTrackingOptionsResult call() throws Exception {
                UpdateConfigurationSetTrackingOptionsResult result = null;
                try {
                    result = updateConfigurationSetTrackingOptions(updateConfigurationSetTrackingOptionsRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateConfigurationSetTrackingOptionsRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates an existing custom verification email template.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html"
     * >Using Custom Verification Email Templates</a> in the <i>Amazon SES
     * Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateCustomVerificationEmailTemplateRequest <p>
     *            Represents a request to update an existing custom verification
     *            email template.
     *            </p>
     * @return A Java Future object containing the response from the
     *         UpdateCustomVerificationEmailTemplate service method, as returned
     *         by Amazon Simple Email Service.
     * @throws CustomVerificationEmailTemplateDoesNotExistException
     * @throws FromEmailAddressNotVerifiedException
     * @throws CustomVerificationEmailInvalidContentException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<Void> updateCustomVerificationEmailTemplateAsync(
            final UpdateCustomVerificationEmailTemplateRequest updateCustomVerificationEmailTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                updateCustomVerificationEmailTemplate(updateCustomVerificationEmailTemplateRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Updates an existing custom verification email template.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html"
     * >Using Custom Verification Email Templates</a> in the <i>Amazon SES
     * Developer Guide</i>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateCustomVerificationEmailTemplateRequest <p>
     *            Represents a request to update an existing custom verification
     *            email template.
     *            </p>
     * @return A Java Future object containing the response from the
     *         UpdateCustomVerificationEmailTemplate service method, as returned
     *         by Amazon Simple Email Service.
     * @throws CustomVerificationEmailTemplateDoesNotExistException
     * @throws FromEmailAddressNotVerifiedException
     * @throws CustomVerificationEmailInvalidContentException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<Void> updateCustomVerificationEmailTemplateAsync(
            final UpdateCustomVerificationEmailTemplateRequest updateCustomVerificationEmailTemplateRequest,
            final AsyncHandler<UpdateCustomVerificationEmailTemplateRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    updateCustomVerificationEmailTemplate(updateCustomVerificationEmailTemplateRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateCustomVerificationEmailTemplateRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates a receipt rule.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateReceiptRuleRequest <p>
     *            Represents a request to update a receipt rule. You use receipt
     *            rules to receive email with Amazon SES. For more information,
     *            see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         UpdateReceiptRule service method, as returned by Amazon Simple
     *         Email Service.
     * @throws InvalidSnsTopicException
     * @throws InvalidS3ConfigurationException
     * @throws InvalidLambdaFunctionException
     * @throws RuleSetDoesNotExistException
     * @throws RuleDoesNotExistException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<UpdateReceiptRuleResult> updateReceiptRuleAsync(
            final UpdateReceiptRuleRequest updateReceiptRuleRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<UpdateReceiptRuleResult>() {
            public UpdateReceiptRuleResult call() throws Exception {
                return updateReceiptRule(updateReceiptRuleRequest);
            }
        });
    }

    /**
     * <p>
     * Updates a receipt rule.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateReceiptRuleRequest <p>
     *            Represents a request to update a receipt rule. You use receipt
     *            rules to receive email with Amazon SES. For more information,
     *            see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         UpdateReceiptRule service method, as returned by Amazon Simple
     *         Email Service.
     * @throws InvalidSnsTopicException
     * @throws InvalidS3ConfigurationException
     * @throws InvalidLambdaFunctionException
     * @throws RuleSetDoesNotExistException
     * @throws RuleDoesNotExistException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<UpdateReceiptRuleResult> updateReceiptRuleAsync(
            final UpdateReceiptRuleRequest updateReceiptRuleRequest,
            final AsyncHandler<UpdateReceiptRuleRequest, UpdateReceiptRuleResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateReceiptRuleResult>() {
            public UpdateReceiptRuleResult call() throws Exception {
                UpdateReceiptRuleResult result = null;
                try {
                    result = updateReceiptRule(updateReceiptRuleRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateReceiptRuleRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Updates an email template. Email templates enable you to send
     * personalized email to one or more destinations in a single API operation.
     * For more information, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateTemplateRequest
     * @return A Java Future object containing the response from the
     *         UpdateTemplate service method, as returned by Amazon Simple Email
     *         Service.
     * @throws TemplateDoesNotExistException
     * @throws InvalidTemplateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<UpdateTemplateResult> updateTemplateAsync(
            final UpdateTemplateRequest updateTemplateRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<UpdateTemplateResult>() {
            public UpdateTemplateResult call() throws Exception {
                return updateTemplate(updateTemplateRequest);
            }
        });
    }

    /**
     * <p>
     * Updates an email template. Email templates enable you to send
     * personalized email to one or more destinations in a single API operation.
     * For more information, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateTemplateRequest
     * @return A Java Future object containing the response from the
     *         UpdateTemplate service method, as returned by Amazon Simple Email
     *         Service.
     * @throws TemplateDoesNotExistException
     * @throws InvalidTemplateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<UpdateTemplateResult> updateTemplateAsync(
            final UpdateTemplateRequest updateTemplateRequest,
            final AsyncHandler<UpdateTemplateRequest, UpdateTemplateResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateTemplateResult>() {
            public UpdateTemplateResult call() throws Exception {
                UpdateTemplateResult result = null;
                try {
                    result = updateTemplate(updateTemplateRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(updateTemplateRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Returns a set of DKIM tokens for a domain. DKIM <i>tokens</i> are
     * character strings that represent your domain's identity. Using these
     * tokens, you will need to create DNS CNAME records that point to DKIM
     * public keys hosted by Amazon SES. Amazon Web Services will eventually
     * detect that you have updated your DNS records; this detection process may
     * take up to 72 hours. Upon successful detection, Amazon SES will be able
     * to DKIM-sign email originating from that domain.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * <p>
     * To enable or disable Easy DKIM signing for a domain, use the
     * <code>SetIdentityDkimEnabled</code> operation.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to
     * the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param verifyDomainDkimRequest <p>
     *            Represents a request to generate the CNAME records needed to
     *            set up Easy DKIM with Amazon SES. For more information about
     *            setting up Easy DKIM, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         VerifyDomainDkim service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<VerifyDomainDkimResult> verifyDomainDkimAsync(
            final VerifyDomainDkimRequest verifyDomainDkimRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<VerifyDomainDkimResult>() {
            public VerifyDomainDkimResult call() throws Exception {
                return verifyDomainDkim(verifyDomainDkimRequest);
            }
        });
    }

    /**
     * <p>
     * Returns a set of DKIM tokens for a domain. DKIM <i>tokens</i> are
     * character strings that represent your domain's identity. Using these
     * tokens, you will need to create DNS CNAME records that point to DKIM
     * public keys hosted by Amazon SES. Amazon Web Services will eventually
     * detect that you have updated your DNS records; this detection process may
     * take up to 72 hours. Upon successful detection, Amazon SES will be able
     * to DKIM-sign email originating from that domain.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * <p>
     * To enable or disable Easy DKIM signing for a domain, use the
     * <code>SetIdentityDkimEnabled</code> operation.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to
     * the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param verifyDomainDkimRequest <p>
     *            Represents a request to generate the CNAME records needed to
     *            set up Easy DKIM with Amazon SES. For more information about
     *            setting up Easy DKIM, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         VerifyDomainDkim service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<VerifyDomainDkimResult> verifyDomainDkimAsync(
            final VerifyDomainDkimRequest verifyDomainDkimRequest,
            final AsyncHandler<VerifyDomainDkimRequest, VerifyDomainDkimResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<VerifyDomainDkimResult>() {
            public VerifyDomainDkimResult call() throws Exception {
                VerifyDomainDkimResult result = null;
                try {
                    result = verifyDomainDkim(verifyDomainDkimRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(verifyDomainDkimRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Adds a domain to the list of identities for your Amazon SES account in
     * the current AWS Region and attempts to verify it. For more information
     * about verifying domains, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     * >Verifying Email Addresses and Domains</a> in the <i>Amazon SES Developer
     * Guide.</i>
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param verifyDomainIdentityRequest <p>
     *            Represents a request to begin Amazon SES domain verification
     *            and to generate the TXT records that you must publish to the
     *            DNS server of your domain to complete the verification. For
     *            information about domain verification, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-domains.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         VerifyDomainIdentity service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<VerifyDomainIdentityResult> verifyDomainIdentityAsync(
            final VerifyDomainIdentityRequest verifyDomainIdentityRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<VerifyDomainIdentityResult>() {
            public VerifyDomainIdentityResult call() throws Exception {
                return verifyDomainIdentity(verifyDomainIdentityRequest);
            }
        });
    }

    /**
     * <p>
     * Adds a domain to the list of identities for your Amazon SES account in
     * the current AWS Region and attempts to verify it. For more information
     * about verifying domains, see <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"
     * >Verifying Email Addresses and Domains</a> in the <i>Amazon SES Developer
     * Guide.</i>
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param verifyDomainIdentityRequest <p>
     *            Represents a request to begin Amazon SES domain verification
     *            and to generate the TXT records that you must publish to the
     *            DNS server of your domain to complete the verification. For
     *            information about domain verification, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-domains.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         VerifyDomainIdentity service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<VerifyDomainIdentityResult> verifyDomainIdentityAsync(
            final VerifyDomainIdentityRequest verifyDomainIdentityRequest,
            final AsyncHandler<VerifyDomainIdentityRequest, VerifyDomainIdentityResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<VerifyDomainIdentityResult>() {
            public VerifyDomainIdentityResult call() throws Exception {
                VerifyDomainIdentityResult result = null;
                try {
                    result = verifyDomainIdentity(verifyDomainIdentityRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(verifyDomainIdentityRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Deprecated. Use the <code>VerifyEmailIdentity</code> operation to verify
     * a new email address.
     * </p>
     * 
     * @param verifyEmailAddressRequest <p>
     *            Represents a request to begin email address verification with
     *            Amazon SES. For information about email address verification,
     *            see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         VerifyEmailAddress service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<Void> verifyEmailAddressAsync(
            final VerifyEmailAddressRequest verifyEmailAddressRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                verifyEmailAddress(verifyEmailAddressRequest);
                return null;
            }
        });
    }

    /**
     * <p>
     * Deprecated. Use the <code>VerifyEmailIdentity</code> operation to verify
     * a new email address.
     * </p>
     * 
     * @param verifyEmailAddressRequest <p>
     *            Represents a request to begin email address verification with
     *            Amazon SES. For information about email address verification,
     *            see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         VerifyEmailAddress service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<Void> verifyEmailAddressAsync(
            final VerifyEmailAddressRequest verifyEmailAddressRequest,
            final AsyncHandler<VerifyEmailAddressRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                Void result = null;
                try {
                    verifyEmailAddress(verifyEmailAddressRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(verifyEmailAddressRequest, result);
                return result;
            }
        });
    }

    /**
     * <p>
     * Adds an email address to the list of identities for your Amazon SES
     * account in the current AWS region and attempts to verify it. As a result
     * of executing this operation, a verification email is sent to the
     * specified address.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param verifyEmailIdentityRequest <p>
     *            Represents a request to begin email address verification with
     *            Amazon SES. For information about email address verification,
     *            see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         VerifyEmailIdentity service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<VerifyEmailIdentityResult> verifyEmailIdentityAsync(
            final VerifyEmailIdentityRequest verifyEmailIdentityRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<VerifyEmailIdentityResult>() {
            public VerifyEmailIdentityResult call() throws Exception {
                return verifyEmailIdentity(verifyEmailIdentityRequest);
            }
        });
    }

    /**
     * <p>
     * Adds an email address to the list of identities for your Amazon SES
     * account in the current AWS region and attempts to verify it. As a result
     * of executing this operation, a verification email is sent to the
     * specified address.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param verifyEmailIdentityRequest <p>
     *            Represents a request to begin email address verification with
     *            Amazon SES. For information about email address verification,
     *            see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A Java Future object containing the response from the
     *         VerifyEmailIdentity service method, as returned by Amazon Simple
     *         Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public Future<VerifyEmailIdentityResult> verifyEmailIdentityAsync(
            final VerifyEmailIdentityRequest verifyEmailIdentityRequest,
            final AsyncHandler<VerifyEmailIdentityRequest, VerifyEmailIdentityResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<VerifyEmailIdentityResult>() {
            public VerifyEmailIdentityResult call() throws Exception {
                VerifyEmailIdentityResult result = null;
                try {
                    result = verifyEmailIdentity(verifyEmailIdentityRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(verifyEmailIdentityRequest, result);
                return result;
            }
        });
    }

}
