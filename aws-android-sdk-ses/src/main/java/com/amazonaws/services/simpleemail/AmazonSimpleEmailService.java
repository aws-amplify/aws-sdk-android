/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.simpleemail.model.*;

/**
 * Interface for accessing Amazon Simple Email Service <fullname>Amazon Simple
 * Email Service</fullname>
 * <p>
 * This document contains reference information for the <a
 * href="https://aws.amazon.com/ses/">Amazon Simple Email Service</a> (Amazon
 * SES) API, version 2010-12-01. This document is best used in conjunction with
 * the <a
 * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/Welcome.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 * <note>
 * <p>
 * For a list of Amazon SES endpoints to use in service requests, see <a
 * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/regions.html"
 * >Regions and Amazon SES</a> in the <a
 * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/Welcome.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 * </note>
 * <p>
 * This documentation contains reference information related to the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/ses/latest/APIReference/API_Operations.html"
 * >Amazon SES API Actions</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/ses/latest/APIReference/API_Types.html">
 * Amazon SES API Data Types</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/ses/latest/APIReference/CommonParameters.html"
 * >Common Parameters</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/ses/latest/APIReference/CommonErrors.html"
 * >Common Errors</a>
 * </p>
 * </li>
 * </ul>
 **/
public interface AmazonSimpleEmailService {

    /**
     * Overrides the default endpoint for this client
     * ("https://email.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "email.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://email.us-east-1.amazonaws.com"). If the protocol is not
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
     * @param endpoint The endpoint (ex: "email.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://email.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonSimpleEmailService#setEndpoint(String)},
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
     * Creates a receipt rule set by cloning an existing one. All receipt rules
     * and configurations are copied to the new receipt rule set and are
     * completely independent of the source rule set.
     * </p>
     * <p>
     * For information about setting up rule sets, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-concepts.html#receiving-email-concepts-rules"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return cloneReceiptRuleSetResult The response from the
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
    CloneReceiptRuleSetResult cloneReceiptRuleSet(
            CloneReceiptRuleSetRequest cloneReceiptRuleSetRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a configuration set.
     * </p>
     * <p>
     * Configuration sets enable you to publish email sending events. For
     * information about using configuration sets, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity.html"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return createConfigurationSetResult The response from the
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
    CreateConfigurationSetResult createConfigurationSet(
            CreateConfigurationSetRequest createConfigurationSetRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * An event destination is the Amazon Web Services service to which Amazon
     * SES publishes the email sending events associated with a configuration
     * set. For information about using configuration sets, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity.html"
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
     *            describes an Amazon Web Services service in which Amazon SES
     *            publishes the email sending events associated with a
     *            configuration set. For information about using configuration
     *            sets, see the <a href=
     *            "https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return createConfigurationSetEventDestinationResult The response from
     *         the CreateConfigurationSetEventDestination service method, as
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
    CreateConfigurationSetEventDestinationResult createConfigurationSetEventDestination(
            CreateConfigurationSetEventDestinationRequest createConfigurationSetEventDestinationRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * "https://docs.aws.amazon.com/ses/latest/dg/configure-custom-open-click-domains.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param createConfigurationSetTrackingOptionsRequest <p>
     *            Represents a request to create an open and click tracking
     *            option object in a configuration set.
     *            </p>
     * @return createConfigurationSetTrackingOptionsResult The response from the
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
    CreateConfigurationSetTrackingOptionsResult createConfigurationSetTrackingOptions(
            CreateConfigurationSetTrackingOptionsRequest createConfigurationSetTrackingOptionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new custom verification email template.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href=
     * "https://docs.aws.amazon.com/ses/latest/dg/creating-identities.html#send-email-verify-address-custom"
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
    void createCustomVerificationEmailTemplate(
            CreateCustomVerificationEmailTemplateRequest createCustomVerificationEmailTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new IP address filter.
     * </p>
     * <p>
     * For information about setting up IP address filters, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-ip-filtering-console-walkthrough.html"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return createReceiptFilterResult The response from the
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
    CreateReceiptFilterResult createReceiptFilter(
            CreateReceiptFilterRequest createReceiptFilterRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a receipt rule.
     * </p>
     * <p>
     * For information about setting up receipt rules, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-receipt-rules-console-walkthrough.html"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return createReceiptRuleResult The response from the CreateReceiptRule
     *         service method, as returned by Amazon Simple Email Service.
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
    CreateReceiptRuleResult createReceiptRule(CreateReceiptRuleRequest createReceiptRuleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an empty receipt rule set.
     * </p>
     * <p>
     * For information about setting up receipt rule sets, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-concepts.html#receiving-email-concepts-rules"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return createReceiptRuleSetResult The response from the
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
    CreateReceiptRuleSetResult createReceiptRuleSet(
            CreateReceiptRuleSetRequest createReceiptRuleSetRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates an email template. Email templates enable you to send
     * personalized email to one or more destinations in a single operation. For
     * more information, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/send-personalized-email-api.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param createTemplateRequest <p>
     *            Represents a request to create an email template. For more
     *            information, see the <a href=
     *            "https://docs.aws.amazon.com/ses/latest/dg/send-personalized-email-api.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return createTemplateResult The response from the CreateTemplate service
     *         method, as returned by Amazon Simple Email Service.
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
    CreateTemplateResult createTemplate(CreateTemplateRequest createTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a configuration set. Configuration sets enable you to publish
     * email sending events. For information about using configuration sets, see
     * the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity.html"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return deleteConfigurationSetResult The response from the
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
    DeleteConfigurationSetResult deleteConfigurationSet(
            DeleteConfigurationSetRequest deleteConfigurationSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a configuration set event destination. Configuration set event
     * destinations are associated with configuration sets, which enable you to
     * publish email sending events. For information about using configuration
     * sets, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity.html"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return deleteConfigurationSetEventDestinationResult The response from
     *         the DeleteConfigurationSetEventDestination service method, as
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
    DeleteConfigurationSetEventDestinationResult deleteConfigurationSetEventDestination(
            DeleteConfigurationSetEventDestinationRequest deleteConfigurationSetEventDestinationRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * "https://docs.aws.amazon.com/ses/latest/dg/configure-custom-open-click-domains.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <note>
     * <p>
     * Deleting this kind of association results in emails sent using the
     * specified configuration set to capture open and click events using the
     * standard, Amazon SES-operated domains.
     * </p>
     * </note>
     * 
     * @param deleteConfigurationSetTrackingOptionsRequest <p>
     *            Represents a request to delete open and click tracking options
     *            in a configuration set.
     *            </p>
     * @return deleteConfigurationSetTrackingOptionsResult The response from the
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
    DeleteConfigurationSetTrackingOptionsResult deleteConfigurationSetTrackingOptions(
            DeleteConfigurationSetTrackingOptionsRequest deleteConfigurationSetTrackingOptionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an existing custom verification email template.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href=
     * "https://docs.aws.amazon.com/ses/latest/dg/creating-identities.html#send-email-verify-address-custom"
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
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteCustomVerificationEmailTemplate(
            DeleteCustomVerificationEmailTemplateRequest deleteCustomVerificationEmailTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return deleteIdentityResult The response from the DeleteIdentity service
     *         method, as returned by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteIdentityResult deleteIdentity(DeleteIdentityRequest deleteIdentityRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified sending authorization policy for the given identity
     * (an email address or a domain). This operation returns successfully even
     * if a policy with the specified name does not exist.
     * </p>
     * <note>
     * <p>
     * This operation is for the identity owner only. If you have not verified
     * the identity, it returns an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/sending-authorization.html"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return deleteIdentityPolicyResult The response from the
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
    DeleteIdentityPolicyResult deleteIdentityPolicy(
            DeleteIdentityPolicyRequest deleteIdentityPolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified IP address filter.
     * </p>
     * <p>
     * For information about managing IP address filters, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-ip-filtering-console-walkthrough.html"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return deleteReceiptFilterResult The response from the
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
    DeleteReceiptFilterResult deleteReceiptFilter(
            DeleteReceiptFilterRequest deleteReceiptFilterRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified receipt rule.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-receipt-rules-console-walkthrough.html"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return deleteReceiptRuleResult The response from the DeleteReceiptRule
     *         service method, as returned by Amazon Simple Email Service.
     * @throws RuleSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteReceiptRuleResult deleteReceiptRule(DeleteReceiptRuleRequest deleteReceiptRuleRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-receipt-rules-console-walkthrough.html"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return deleteReceiptRuleSetResult The response from the
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
    DeleteReceiptRuleSetResult deleteReceiptRuleSet(
            DeleteReceiptRuleSetRequest deleteReceiptRuleSetRequest) throws AmazonClientException,
            AmazonServiceException;

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
     *            "https://docs.aws.amazon.com/ses/latest/dg/send-personalized-email-api.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return deleteTemplateResult The response from the DeleteTemplate service
     *         method, as returned by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DeleteTemplateResult deleteTemplate(DeleteTemplateRequest deleteTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deprecated. Use the <code>DeleteIdentity</code> operation to delete email
     * addresses and domains.
     * </p>
     * 
     * @param deleteVerifiedEmailAddressRequest <p>
     *            Represents a request to delete an email address from the list
     *            of email addresses you have attempted to verify under your
     *            Amazon Web Services account.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteVerifiedEmailAddress(
            DeleteVerifiedEmailAddressRequest deleteVerifiedEmailAddressRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the metadata and receipt rules for the receipt rule set that is
     * currently active.
     * </p>
     * <p>
     * For information about setting up receipt rule sets, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-concepts.html#receiving-email-concepts-rules"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return describeActiveReceiptRuleSetResult The response from the
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
    DescribeActiveReceiptRuleSetResult describeActiveReceiptRuleSet(
            DescribeActiveReceiptRuleSetRequest describeActiveReceiptRuleSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the details of the specified configuration set. For information
     * about using configuration sets, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity.html"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return describeConfigurationSetResult The response from the
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
    DescribeConfigurationSetResult describeConfigurationSet(
            DescribeConfigurationSetRequest describeConfigurationSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the details of the specified receipt rule.
     * </p>
     * <p>
     * For information about setting up receipt rules, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-receipt-rules-console-walkthrough.html"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return describeReceiptRuleResult The response from the
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
    DescribeReceiptRuleResult describeReceiptRule(
            DescribeReceiptRuleRequest describeReceiptRuleRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns the details of the specified receipt rule set.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-receipt-rules-console-walkthrough.html"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return describeReceiptRuleSetResult The response from the
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
    DescribeReceiptRuleSetResult describeReceiptRuleSet(
            DescribeReceiptRuleSetRequest describeReceiptRuleSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the email sending status of the Amazon SES account for the
     * current Region.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getAccountSendingEnabledRequest
     * @return getAccountSendingEnabledResult The response from the
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
    GetAccountSendingEnabledResult getAccountSendingEnabled(
            GetAccountSendingEnabledRequest getAccountSendingEnabledRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the custom email verification template for the template name you
     * specify.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href=
     * "https://docs.aws.amazon.com/ses/latest/dg/creating-identities.html#send-email-verify-address-custom"
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
     * @return getCustomVerificationEmailTemplateResult The response from the
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
    GetCustomVerificationEmailTemplateResult getCustomVerificationEmailTemplate(
            GetCustomVerificationEmailTemplateRequest getCustomVerificationEmailTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * "https://docs.aws.amazon.com/ses/latest/dg/send-email-authentication-dkim-easy-managing.html"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/send-email-authentication-dkim-easy.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return getIdentityDkimAttributesResult The response from the
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
    GetIdentityDkimAttributesResult getIdentityDkimAttributes(
            GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest)
            throws AmazonClientException, AmazonServiceException;

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
     *            "https://docs.aws.amazon.com/ses/latest/dg/mail-from.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return getIdentityMailFromDomainAttributesResult The response from the
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
    GetIdentityMailFromDomainAttributesResult getIdentityMailFromDomainAttributes(
            GetIdentityMailFromDomainAttributesRequest getIdentityMailFromDomainAttributesRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * "https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity-using-notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param getIdentityNotificationAttributesRequest <p>
     *            Represents a request to return the notification attributes for
     *            a list of identities you verified with Amazon SES. For
     *            information about Amazon SES notifications, see the <a href=
     *            "https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity-using-notifications.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return getIdentityNotificationAttributesResult The response from the
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
    GetIdentityNotificationAttributesResult getIdentityNotificationAttributes(
            GetIdentityNotificationAttributesRequest getIdentityNotificationAttributesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the requested sending authorization policies for the given
     * identity (an email address or a domain). The policies are returned as a
     * map of policy names to policy contents. You can retrieve a maximum of 20
     * policies at a time.
     * </p>
     * <note>
     * <p>
     * This operation is for the identity owner only. If you have not verified
     * the identity, it returns an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/sending-authorization.html"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return getIdentityPoliciesResult The response from the
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
    GetIdentityPoliciesResult getIdentityPolicies(
            GetIdentityPoliciesRequest getIdentityPoliciesRequest) throws AmazonClientException,
            AmazonServiceException;

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
     * status changes to "Failed." In that case, to verify the email address,
     * you must restart the verification process from the beginning.
     * </p>
     * <p>
     * For domain identities, the domain's verification status is "Pending" as
     * Amazon SES searches for the required TXT record in the DNS settings of
     * the domain. When Amazon SES detects the record, the domain's verification
     * status changes to "Success". If Amazon SES is unable to detect the record
     * within 72 hours, the domain's verification status changes to "Failed." In
     * that case, to verify the domain, you must restart the verification
     * process from the beginning.
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/creating-identities.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return getIdentityVerificationAttributesResult The response from the
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
    GetIdentityVerificationAttributesResult getIdentityVerificationAttributes(
            GetIdentityVerificationAttributesRequest getIdentityVerificationAttributesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides the sending limits for the Amazon SES account.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getSendQuotaRequest
     * @return getSendQuotaResult The response from the GetSendQuota service
     *         method, as returned by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetSendQuotaResult getSendQuota(GetSendQuotaRequest getSendQuotaRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides sending statistics for the current Amazon Web Services Region.
     * The result is a list of data points, representing the last two weeks of
     * sending activity. Each data point in the list contains statistics for a
     * 15-minute period of time.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param getSendStatisticsRequest
     * @return getSendStatisticsResult The response from the GetSendStatistics
     *         service method, as returned by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetSendStatisticsResult getSendStatistics(GetSendStatisticsRequest getSendStatisticsRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return getTemplateResult The response from the GetTemplate service
     *         method, as returned by Amazon Simple Email Service.
     * @throws TemplateDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetTemplateResult getTemplate(GetTemplateRequest getTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides a list of the configuration sets associated with your Amazon SES
     * account in the current Amazon Web Services Region. For information about
     * using configuration sets, see <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity.html"
     * >Monitoring Your Amazon SES Sending Activity</a> in the <i>Amazon SES
     * Developer Guide.</i>
     * </p>
     * <p>
     * You can execute this operation no more than once per second. This
     * operation returns up to 1,000 configuration sets each time it is run. If
     * your Amazon SES account has more than 1,000 configuration sets, this
     * operation also returns <code>NextToken</code>. You can then execute the
     * <code>ListConfigurationSets</code> operation again, passing the
     * <code>NextToken</code> parameter and the value of the NextToken element
     * to retrieve additional results.
     * </p>
     * 
     * @param listConfigurationSetsRequest <p>
     *            Represents a request to list the configuration sets associated
     *            with your Amazon Web Services account. Configuration sets
     *            enable you to publish email sending events. For information
     *            about using configuration sets, see the <a href=
     *            "https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return listConfigurationSetsResult The response from the
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
    ListConfigurationSetsResult listConfigurationSets(
            ListConfigurationSetsRequest listConfigurationSetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the existing custom verification email templates for your account
     * in the current Amazon Web Services Region.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href=
     * "https://docs.aws.amazon.com/ses/latest/dg/creating-identities.html#send-email-verify-address-custom"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/creating-identities.html#send-email-verify-address-custom"
     *            >Using Custom Verification Email Templates</a> in the
     *            <i>Amazon SES Developer Guide</i>.
     *            </p>
     * @return listCustomVerificationEmailTemplatesResult The response from the
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
    ListCustomVerificationEmailTemplatesResult listCustomVerificationEmailTemplates(
            ListCustomVerificationEmailTemplatesRequest listCustomVerificationEmailTemplatesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list containing all of the identities (email addresses and
     * domains) for your Amazon Web Services account in the current Amazon Web
     * Services Region, regardless of verification status.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * <note>
     * <p>
     * It's recommended that for successive pagination calls of this API, you
     * continue to the use the same parameter/value pairs as used in the
     * original call, e.g., if you used <code>IdentityType=Domain</code> in the
     * the original call and received a <code>NextToken</code> in the response,
     * you should continue providing the <code>IdentityType=Domain</code>
     * parameter for further <code>NextToken</code> calls; however, if you
     * didn't provide the <code>IdentityType</code> parameter in the original
     * call, then continue to not provide it for successive pagination calls.
     * Using this protocol will ensure consistent results.
     * </p>
     * </note>
     * 
     * @param listIdentitiesRequest <p>
     *            Represents a request to return a list of all identities (email
     *            addresses and domains) that you have attempted to verify under
     *            your Amazon Web Services account, regardless of verification
     *            status.
     *            </p>
     * @return listIdentitiesResult The response from the ListIdentities service
     *         method, as returned by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListIdentitiesResult listIdentities(ListIdentitiesRequest listIdentitiesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of sending authorization policies that are attached to the
     * given identity (an email address or a domain). This operation returns
     * only a list. To get the actual policy content, use
     * <code>GetIdentityPolicies</code>.
     * </p>
     * <note>
     * <p>
     * This operation is for the identity owner only. If you have not verified
     * the identity, it returns an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/sending-authorization.html"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return listIdentityPoliciesResult The response from the
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
    ListIdentityPoliciesResult listIdentityPolicies(
            ListIdentityPoliciesRequest listIdentityPoliciesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the IP address filters associated with your Amazon Web Services
     * account in the current Amazon Web Services Region.
     * </p>
     * <p>
     * For information about managing IP address filters, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-ip-filtering-console-walkthrough.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listReceiptFiltersRequest <p>
     *            Represents a request to list the IP address filters that exist
     *            under your Amazon Web Services account. You use IP address
     *            filters when you receive email with Amazon SES. For more
     *            information, see the <a href=
     *            "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return listReceiptFiltersResult The response from the ListReceiptFilters
     *         service method, as returned by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListReceiptFiltersResult listReceiptFilters(ListReceiptFiltersRequest listReceiptFiltersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the receipt rule sets that exist under your Amazon Web Services
     * account in the current Amazon Web Services Region. If there are
     * additional receipt rule sets to be retrieved, you receive a
     * <code>NextToken</code> that you can provide to the next call to
     * <code>ListReceiptRuleSets</code> to retrieve the additional entries.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-receipt-rules-console-walkthrough.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listReceiptRuleSetsRequest <p>
     *            Represents a request to list the receipt rule sets that exist
     *            under your Amazon Web Services account. You use receipt rule
     *            sets to receive email with Amazon SES. For more information,
     *            see the <a href=
     *            "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return listReceiptRuleSetsResult The response from the
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
    ListReceiptRuleSetsResult listReceiptRuleSets(
            ListReceiptRuleSetsRequest listReceiptRuleSetsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the email templates present in your Amazon SES account in the
     * current Amazon Web Services Region.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param listTemplatesRequest
     * @return listTemplatesResult The response from the ListTemplates service
     *         method, as returned by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListTemplatesResult listTemplates(ListTemplatesRequest listTemplatesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deprecated. Use the <code>ListIdentities</code> operation to list the
     * email addresses and domains associated with your account.
     * </p>
     * 
     * @param listVerifiedEmailAddressesRequest
     * @return listVerifiedEmailAddressesResult The response from the
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
    ListVerifiedEmailAddressesResult listVerifiedEmailAddresses(
            ListVerifiedEmailAddressesRequest listVerifiedEmailAddressesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds or updates the delivery options for a configuration set.
     * </p>
     * 
     * @param putConfigurationSetDeliveryOptionsRequest <p>
     *            A request to modify the delivery options for a configuration
     *            set.
     *            </p>
     * @return putConfigurationSetDeliveryOptionsResult The response from the
     *         PutConfigurationSetDeliveryOptions service method, as returned by
     *         Amazon Simple Email Service.
     * @throws ConfigurationSetDoesNotExistException
     * @throws InvalidDeliveryOptionsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    PutConfigurationSetDeliveryOptionsResult putConfigurationSetDeliveryOptions(
            PutConfigurationSetDeliveryOptionsRequest putConfigurationSetDeliveryOptionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds or updates a sending authorization policy for the specified identity
     * (an email address or a domain).
     * </p>
     * <note>
     * <p>
     * This operation is for the identity owner only. If you have not verified
     * the identity, it returns an error.
     * </p>
     * </note>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/sending-authorization.html"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return putIdentityPolicyResult The response from the PutIdentityPolicy
     *         service method, as returned by Amazon Simple Email Service.
     * @throws InvalidPolicyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    PutIdentityPolicyResult putIdentityPolicy(PutIdentityPolicyRequest putIdentityPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Reorders the receipt rules within a receipt rule set.
     * </p>
     * <note>
     * <p>
     * All of the rules in the rule set must be represented in this request.
     * That is, it is error if the reorder request doesn't explicitly position
     * all of the rules.
     * </p>
     * </note>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-receipt-rules-console-walkthrough.html"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return reorderReceiptRuleSetResult The response from the
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
    ReorderReceiptRuleSetResult reorderReceiptRuleSet(
            ReorderReceiptRuleSetRequest reorderReceiptRuleSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Generates and sends a bounce message to the sender of an email you
     * received through Amazon SES. You can only use this operation on an email
     * up to 24 hours after you receive it.
     * </p>
     * <note>
     * <p>
     * You cannot use this operation to send generic bounces for mail that was
     * not received by Amazon SES.
     * </p>
     * </note>
     * <p>
     * For information about receiving email through Amazon SES, see the <a
     * href=
     * "https://docs.aws.amazon.com/ses/latest/dg/receiving-email.html">Amazon
     * SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param sendBounceRequest <p>
     *            Represents a request to send a bounce message to the sender of
     *            an email you received through Amazon SES.
     *            </p>
     * @return sendBounceResult The response from the SendBounce service method,
     *         as returned by Amazon Simple Email Service.
     * @throws MessageRejectedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    SendBounceResult sendBounce(SendBounceRequest sendBounceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Composes an email message to multiple destinations. The message body is
     * created using an email template.
     * </p>
     * <p>
     * To send email using this operation, your call must meet the following
     * requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The call must refer to an existing email template. You can create email
     * templates using <a>CreateTemplate</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The message must be sent from a verified email address or domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account is still in the Amazon SES sandbox, you may send only to
     * verified addresses or domains, or to email addresses associated with the
     * Amazon SES Mailbox Simulator. For more information, see <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/verify-addresses-and-domains.html"
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
     * <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), the entire message is
     * rejected, even if the message contains other recipients that are valid.
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
     * The number of destinations you can contact in a single call can be
     * limited by your account's maximum sending rate.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sendBulkTemplatedEmailRequest <p>
     *            Represents a request to send a templated email to multiple
     *            destinations using Amazon SES. For more information, see the
     *            <a href=
     *            "https://docs.aws.amazon.com/ses/latest/dg/send-personalized-email-api.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return sendBulkTemplatedEmailResult The response from the
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
    SendBulkTemplatedEmailResult sendBulkTemplatedEmail(
            SendBulkTemplatedEmailRequest sendBulkTemplatedEmailRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds an email address to the list of identities for your Amazon SES
     * account in the current Amazon Web Services Region and attempts to verify
     * it. As a result of executing this operation, a customized verification
     * email is sent to the specified address.
     * </p>
     * <p>
     * To use this operation, you must first create a custom verification email
     * template. For more information about creating and using custom
     * verification email templates, see <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/creating-identities.html#send-email-verify-address-custom"
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
     * @return sendCustomVerificationEmailResult The response from the
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
    SendCustomVerificationEmailResult sendCustomVerificationEmail(
            SendCustomVerificationEmailRequest sendCustomVerificationEmailRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Composes an email message and immediately queues it for sending. To send
     * email using this operation, your message must meet the following
     * requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The message must be sent from a verified email address or domain. If you
     * attempt to send email using a non-verified address or domain, the
     * operation results in an "Email address not verified" error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account is still in the Amazon SES sandbox, you may only send to
     * verified addresses or domains, or to email addresses associated with the
     * Amazon SES Mailbox Simulator. For more information, see <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/verify-addresses-and-domains.html"
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
     * <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), the entire message is
     * rejected, even if the message contains other recipients that are valid.
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
     * "https://docs.aws.amazon.com/ses/latest/dg/manage-sending-quotas.html"
     * >Managing Your Amazon SES Sending Limits</a> in the <i>Amazon SES
     * Developer Guide.</i>
     * </p>
     * </important>
     * 
     * @param sendEmailRequest <p>
     *            Represents a request to send a single formatted email using
     *            Amazon SES. For more information, see the <a href=
     *            "https://docs.aws.amazon.com/ses/latest/dg/send-email-formatted.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return sendEmailResult The response from the SendEmail service method,
     *         as returned by Amazon Simple Email Service.
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
    SendEmailResult sendEmail(SendEmailRequest sendEmailRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Composes an email message and immediately queues it for sending.
     * </p>
     * <p>
     * This operation is more flexible than the <code>SendEmail</code>
     * operation. When you use the <code>SendRawEmail</code> operation, you can
     * specify the headers of the message as well as its content. This
     * flexibility is useful, for example, when you need to send a multipart
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
     * "https://docs.aws.amazon.com/ses/latest/dg/verify-addresses-and-domains.html"
     * >verified email addresses or domains</a>. If you try to send email from
     * an address that isn't verified, the operation results in an
     * "Email address not verified" error.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account is still in the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/request-production-access.html"
     * >Amazon SES sandbox</a>, you can only send email to other verified
     * addresses in your account, or to addresses that are associated with the
     * <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/send-an-email-from-console.html"
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
     * "https://docs.aws.amazon.com/ses/latest/dg/send-email-raw.html#send-email-mime-encoding"
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
     * <code>SendRawEmail</code> operation, Amazon SES automatically applies its
     * own <code>Message-ID</code> and <code>Date</code> headers; if you passed
     * these headers when creating the message, they are overwritten by the
     * values that Amazon SES provides.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are using sending authorization to send on behalf of another user,
     * <code>SendRawEmail</code> enables you to specify the cross-account
     * identity for the email's Source, From, and Return-Path parameters in one
     * of two ways: you can pass optional parameters <code>SourceArn</code>,
     * <code>FromArn</code>, and/or <code>ReturnPathArn</code>, or you can
     * include the following X-headers in the header of your raw email:
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
     * Don't include these X-headers in the DKIM signature. Amazon SES removes
     * these before it sends the email.
     * </p>
     * </important>
     * <p>
     * If you only specify the <code>SourceIdentityArn</code> parameter, Amazon
     * SES sets the From and Return-Path addresses to the same identity that you
     * specified.
     * </p>
     * <p>
     * For more information about sending authorization, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/sending-authorization.html"
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
     * "https://docs.aws.amazon.com/ses/latest/dg/manage-sending-quotas.html"
     * >Managing Your Amazon SES Sending Limits</a> in the <i>Amazon SES
     * Developer Guide.</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @param sendRawEmailRequest <p>
     *            Represents a request to send a single raw email using Amazon
     *            SES. For more information, see the <a href=
     *            "https://docs.aws.amazon.com/ses/latest/dg/send-email-raw.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return sendRawEmailResult The response from the SendRawEmail service
     *         method, as returned by Amazon Simple Email Service.
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
    SendRawEmailResult sendRawEmail(SendRawEmailRequest sendRawEmailRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Composes an email message using an email template and immediately queues
     * it for sending.
     * </p>
     * <p>
     * To send email using this operation, your call must meet the following
     * requirements:
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
     * "https://docs.aws.amazon.com/ses/latest/dg/verify-addresses-and-domains.html"
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
     * recipients that receives the same version of the email. The
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
     * <i>UserName@[SubDomain.]Domain.TopLevelDomain</i>), the entire message is
     * rejected, even if the message contains other recipients that are valid.
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
     * "https://docs.aws.amazon.com/ses/latest/dg/send-personalized-email-api.html"
     * >Sending Personalized Email Using the Amazon SES API</a> in the <i>Amazon
     * Simple Email Service Developer Guide</i>.
     * </p>
     * </important>
     * 
     * @param sendTemplatedEmailRequest <p>
     *            Represents a request to send a templated email using Amazon
     *            SES. For more information, see the <a href=
     *            "https://docs.aws.amazon.com/ses/latest/dg/send-personalized-email-api.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return sendTemplatedEmailResult The response from the SendTemplatedEmail
     *         service method, as returned by Amazon Simple Email Service.
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
    SendTemplatedEmailResult sendTemplatedEmail(SendTemplatedEmailRequest sendTemplatedEmailRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the specified receipt rule set as the active receipt rule set.
     * </p>
     * <note>
     * <p>
     * To disable your email-receiving through Amazon SES completely, you can
     * call this operation with <code>RuleSetName</code> set to null.
     * </p>
     * </note>
     * <p>
     * For information about managing receipt rule sets, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-receipt-rules-console-walkthrough.html"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return setActiveReceiptRuleSetResult The response from the
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
    SetActiveReceiptRuleSetResult setActiveReceiptRuleSet(
            SetActiveReceiptRuleSetRequest setActiveReceiptRuleSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables or disables Easy DKIM signing of email sent from an identity. If
     * Easy DKIM signing is enabled for a domain, then Amazon SES uses DKIM to
     * sign all email that it sends from addresses on that domain. If Easy DKIM
     * signing is enabled for an email address, then Amazon SES uses DKIM to
     * sign all email it sends from that address.
     * </p>
     * <note>
     * <p>
     * For email addresses (for example, <code>user@example.com</code>), you can
     * only enable DKIM signing if the corresponding domain (in this case,
     * <code>example.com</code>) has been set up to use Easy DKIM.
     * </p>
     * </note>
     * <p>
     * You can enable DKIM signing for an identity at any time after you start
     * the verification process for the identity, even if the verification
     * process isn't complete.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * <p>
     * For more information about Easy DKIM signing, go to the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/send-email-authentication-dkim-easy.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityDkimEnabledRequest <p>
     *            Represents a request to enable or disable Amazon SES Easy DKIM
     *            signing for an identity. For more information about setting up
     *            Easy DKIM, see the <a href=
     *            "https://docs.aws.amazon.com/ses/latest/dg/send-email-authentication-dkim-easy.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return setIdentityDkimEnabledResult The response from the
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
    SetIdentityDkimEnabledResult setIdentityDkimEnabled(
            SetIdentityDkimEnabledRequest setIdentityDkimEnabledRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * "https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity-using-notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityFeedbackForwardingEnabledRequest <p>
     *            Represents a request to enable or disable whether Amazon SES
     *            forwards you bounce and complaint notifications through email.
     *            For information about email feedback forwarding, see the <a
     *            href=
     *            "https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity-using-notifications-email.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return setIdentityFeedbackForwardingEnabledResult The response from the
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
    SetIdentityFeedbackForwardingEnabledResult setIdentityFeedbackForwardingEnabled(
            SetIdentityFeedbackForwardingEnabledRequest setIdentityFeedbackForwardingEnabledRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * "https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity-using-notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityHeadersInNotificationsEnabledRequest <p>
     *            Represents a request to set whether Amazon SES includes the
     *            original email headers in the Amazon SNS notifications of a
     *            specified type. For information about notifications, see the
     *            <a href=
     *            "https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity-using-notifications-sns.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return setIdentityHeadersInNotificationsEnabledResult The response from
     *         the SetIdentityHeadersInNotificationsEnabled service method, as
     *         returned by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    SetIdentityHeadersInNotificationsEnabledResult setIdentityHeadersInNotificationsEnabled(
            SetIdentityHeadersInNotificationsEnabledRequest setIdentityHeadersInNotificationsEnabledRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables or disables the custom MAIL FROM domain setup for a verified
     * identity (an email address or a domain).
     * </p>
     * <important>
     * <p>
     * To send emails using the specified MAIL FROM domain, you must add an MX
     * record to your MAIL FROM domain's DNS settings. To ensure that your
     * emails pass Sender Policy Framework (SPF) checks, you must also add or
     * update an SPF record. For more information, see the <a
     * href="https://docs.aws.amazon.com/ses/latest/dg/mail-from.html">Amazon
     * SES Developer Guide</a>.
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
     *            href
     *            ="https://docs.aws.amazon.com/ses/latest/dg/mail-from.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return setIdentityMailFromDomainResult The response from the
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
    SetIdentityMailFromDomainResult setIdentityMailFromDomain(
            SetIdentityMailFromDomainRequest setIdentityMailFromDomainRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * "https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity-using-notifications.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param setIdentityNotificationTopicRequest <p>
     *            Represents a request to specify the Amazon SNS topic to which
     *            Amazon SES publishes bounce, complaint, or delivery
     *            notifications for emails sent with that identity as the
     *            source. For information about Amazon SES notifications, see
     *            the <a href=
     *            "https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity-using-notifications-sns.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return setIdentityNotificationTopicResult The response from the
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
    SetIdentityNotificationTopicResult setIdentityNotificationTopic(
            SetIdentityNotificationTopicRequest setIdentityNotificationTopicRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the position of the specified receipt rule in the receipt rule set.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-receipt-rules-console-walkthrough.html"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return setReceiptRulePositionResult The response from the
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
    SetReceiptRulePositionResult setReceiptRulePosition(
            SetReceiptRulePositionRequest setReceiptRulePositionRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return testRenderTemplateResult The response from the TestRenderTemplate
     *         service method, as returned by Amazon Simple Email Service.
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
    TestRenderTemplateResult testRenderTemplate(TestRenderTemplateRequest testRenderTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables or disables email sending across your entire Amazon SES account
     * in the current Amazon Web Services Region. You can use this operation in
     * conjunction with Amazon CloudWatch alarms to temporarily pause email
     * sending across your Amazon SES account in a given Amazon Web Services
     * Region when reputation metrics (such as your bounce or complaint rates)
     * reach certain thresholds.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateAccountSendingEnabledRequest <p>
     *            Represents a request to enable or disable the email sending
     *            capabilities for your entire Amazon SES account.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void updateAccountSendingEnabled(
            UpdateAccountSendingEnabledRequest updateAccountSendingEnabledRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the event destination of a configuration set. Event destinations
     * are associated with configuration sets, which enable you to publish email
     * sending events to Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon
     * Simple Notification Service (Amazon SNS). For information about using
     * configuration sets, see <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity.html"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return updateConfigurationSetEventDestinationResult The response from
     *         the UpdateConfigurationSetEventDestination service method, as
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
    UpdateConfigurationSetEventDestinationResult updateConfigurationSetEventDestination(
            UpdateConfigurationSetEventDestinationRequest updateConfigurationSetEventDestinationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables or disables the publishing of reputation metrics for emails sent
     * using a specific configuration set in a given Amazon Web Services Region.
     * Reputation metrics include bounce and complaint rates. These metrics are
     * published to Amazon CloudWatch. By using CloudWatch, you can create
     * alarms when bounce or complaint rates exceed certain thresholds.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateConfigurationSetReputationMetricsEnabledRequest <p>
     *            Represents a request to modify the reputation metric
     *            publishing settings for a configuration set.
     *            </p>
     * @throws ConfigurationSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void updateConfigurationSetReputationMetricsEnabled(
            UpdateConfigurationSetReputationMetricsEnabledRequest updateConfigurationSetReputationMetricsEnabledRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables or disables email sending for messages sent using a specific
     * configuration set in a given Amazon Web Services Region. You can use this
     * operation in conjunction with Amazon CloudWatch alarms to temporarily
     * pause email sending for a configuration set when the reputation metrics
     * for that configuration set (such as your bounce on complaint rate) exceed
     * certain thresholds.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateConfigurationSetSendingEnabledRequest <p>
     *            Represents a request to enable or disable the email sending
     *            capabilities for a specific configuration set.
     *            </p>
     * @throws ConfigurationSetDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void updateConfigurationSetSendingEnabled(
            UpdateConfigurationSetSendingEnabledRequest updateConfigurationSetSendingEnabledRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * "https://docs.aws.amazon.com/ses/latest/dg/configure-custom-open-click-domains.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * 
     * @param updateConfigurationSetTrackingOptionsRequest <p>
     *            Represents a request to update the tracking options for a
     *            configuration set.
     *            </p>
     * @return updateConfigurationSetTrackingOptionsResult The response from the
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
    UpdateConfigurationSetTrackingOptionsResult updateConfigurationSetTrackingOptions(
            UpdateConfigurationSetTrackingOptionsRequest updateConfigurationSetTrackingOptionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an existing custom verification email template.
     * </p>
     * <p>
     * For more information about custom verification email templates, see <a
     * href=
     * "https://docs.aws.amazon.com/ses/latest/dg/creating-identities.html#send-email-verify-address-custom"
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
    void updateCustomVerificationEmailTemplate(
            UpdateCustomVerificationEmailTemplateRequest updateCustomVerificationEmailTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a receipt rule.
     * </p>
     * <p>
     * For information about managing receipt rules, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-receipt-rules-console-walkthrough.html"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/receiving-email-concepts.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return updateReceiptRuleResult The response from the UpdateReceiptRule
     *         service method, as returned by Amazon Simple Email Service.
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
    UpdateReceiptRuleResult updateReceiptRule(UpdateReceiptRuleRequest updateReceiptRuleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an email template. Email templates enable you to send
     * personalized email to one or more destinations in a single operation. For
     * more information, see the <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/send-personalized-email-api.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param updateTemplateRequest
     * @return updateTemplateResult The response from the UpdateTemplate service
     *         method, as returned by Amazon Simple Email Service.
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
    UpdateTemplateResult updateTemplate(UpdateTemplateRequest updateTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a set of DKIM tokens for a domain identity.
     * </p>
     * <important>
     * <p>
     * When you execute the <code>VerifyDomainDkim</code> operation, the domain
     * that you specify is added to the list of identities that are associated
     * with your account. This is true even if you haven't already associated
     * the domain with your account by using the
     * <code>VerifyDomainIdentity</code> operation. However, you can't send
     * email from the domain until you either successfully <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/creating-identities.html#verify-domain-procedure"
     * >verify it</a> or you successfully <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/send-email-authentication-dkim-easy.html"
     * >set up DKIM for it</a>.
     * </p>
     * </important>
     * <p>
     * You use the tokens that are generated by this operation to create CNAME
     * records. When Amazon SES detects that you've added these records to the
     * DNS configuration for a domain, you can start sending email from that
     * domain. You can start sending email even if you haven't added the TXT
     * record provided by the VerifyDomainIdentity operation to the DNS
     * configuration for your domain. All email that you send from the domain is
     * authenticated using DKIM.
     * </p>
     * <p>
     * To create the CNAME records for DKIM authentication, use the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Name</b>: <i>token</i>._domainkey.<i>example.com</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Type</b>: CNAME
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Value</b>: <i>token</i>.dkim.amazonses.com
     * </p>
     * </li>
     * </ul>
     * <p>
     * In the preceding example, replace <i>token</i> with one of the tokens
     * that are generated when you execute this operation. Replace
     * <i>example.com</i> with your domain. Repeat this process for each token
     * that's generated by this operation.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param verifyDomainDkimRequest <p>
     *            Represents a request to generate the CNAME records needed to
     *            set up Easy DKIM with Amazon SES. For more information about
     *            setting up Easy DKIM, see the <a href=
     *            "https://docs.aws.amazon.com/ses/latest/dg/send-email-authentication-dkim-easy.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return verifyDomainDkimResult The response from the VerifyDomainDkim
     *         service method, as returned by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    VerifyDomainDkimResult verifyDomainDkim(VerifyDomainDkimRequest verifyDomainDkimRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds a domain to the list of identities for your Amazon SES account in
     * the current Amazon Web Services Region and attempts to verify it. For
     * more information about verifying domains, see <a href=
     * "https://docs.aws.amazon.com/ses/latest/dg/verify-addresses-and-domains.html"
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
     *            "https://docs.aws.amazon.com/ses/latest/dg/creating-identities.html#verify-domain-procedure"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return verifyDomainIdentityResult The response from the
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
    VerifyDomainIdentityResult verifyDomainIdentity(
            VerifyDomainIdentityRequest verifyDomainIdentityRequest) throws AmazonClientException,
            AmazonServiceException;

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
     *            "https://docs.aws.amazon.com/ses/latest/dg/creating-identities.html#verify-email-addresses-procedure"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void verifyEmailAddress(VerifyEmailAddressRequest verifyEmailAddressRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds an email address to the list of identities for your Amazon SES
     * account in the current Amazon Web Services Region and attempts to verify
     * it. As a result of executing this operation, a verification email is sent
     * to the specified address.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @param verifyEmailIdentityRequest <p>
     *            Represents a request to begin email address verification with
     *            Amazon SES. For information about email address verification,
     *            see the <a href=
     *            "https://docs.aws.amazon.com/ses/latest/dg/creating-identities.html#verify-email-addresses-procedure"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return verifyEmailIdentityResult The response from the
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
    VerifyEmailIdentityResult verifyEmailIdentity(
            VerifyEmailIdentityRequest verifyEmailIdentityRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deprecated. Use the <code>ListIdentities</code> operation to list the
     * email addresses and domains associated with your account.
     * </p>
     * 
     * @return listVerifiedEmailAddressesResult The response from the
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
    ListVerifiedEmailAddressesResult listVerifiedEmailAddresses() throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Provides sending statistics for the current Amazon Web Services Region.
     * The result is a list of data points, representing the last two weeks of
     * sending activity. Each data point in the list contains statistics for a
     * 15-minute period of time.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @return getSendStatisticsResult The response from the GetSendStatistics
     *         service method, as returned by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetSendStatisticsResult getSendStatistics() throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list containing all of the identities (email addresses and
     * domains) for your Amazon Web Services account in the current Amazon Web
     * Services Region, regardless of verification status.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * <note>
     * <p>
     * It's recommended that for successive pagination calls of this API, you
     * continue to the use the same parameter/value pairs as used in the
     * original call, e.g., if you used <code>IdentityType=Domain</code> in the
     * the original call and received a <code>NextToken</code> in the response,
     * you should continue providing the <code>IdentityType=Domain</code>
     * parameter for further <code>NextToken</code> calls; however, if you
     * didn't provide the <code>IdentityType</code> parameter in the original
     * call, then continue to not provide it for successive pagination calls.
     * Using this protocol will ensure consistent results.
     * </p>
     * </note>
     * 
     * @return listIdentitiesResult The response from the ListIdentities service
     *         method, as returned by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListIdentitiesResult listIdentities() throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides the sending limits for the Amazon SES account.
     * </p>
     * <p>
     * You can execute this operation no more than once per second.
     * </p>
     * 
     * @return getSendQuotaResult The response from the GetSendQuota service
     *         method, as returned by Amazon Simple Email Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Simple Email Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetSendQuotaResult getSendQuota() throws AmazonClientException, AmazonServiceException;

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
