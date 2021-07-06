/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.sns.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Subscribes an endpoint to an Amazon SNS topic. If the endpoint type is HTTP/S
 * or email, or if the endpoint and the topic are not in the same account, the
 * endpoint owner must run the <code>ConfirmSubscription</code> action to
 * confirm the subscription.
 * </p>
 * <p>
 * You call the <code>ConfirmSubscription</code> action with the token from the
 * subscription response. Confirmation tokens are valid for three days.
 * </p>
 * <p>
 * This action is throttled at 100 transactions per second (TPS).
 * </p>
 */
public class SubscribeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the topic you want to subscribe to.
     * </p>
     */
    private String topicArn;

    /**
     * <p>
     * The protocol that you want to use. Supported protocols include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>http</code> – delivery of JSON-encoded message via HTTP POST
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https</code> – delivery of JSON-encoded message via HTTPS POST
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email</code> – delivery of message via SMTP
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email-json</code> – delivery of JSON-encoded message via SMTP
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sms</code> – delivery of message via SMS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqs</code> – delivery of JSON-encoded message to an Amazon SQS
     * queue
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application</code> – delivery of JSON-encoded message to an
     * EndpointArn for a mobile app and device
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda</code> – delivery of JSON-encoded message to an Lambda
     * function
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>firehose</code> – delivery of JSON-encoded message to an Amazon
     * Kinesis Data Firehose delivery stream.
     * </p>
     * </li>
     * </ul>
     */
    private String protocol;

    /**
     * <p>
     * The endpoint that you want to receive notifications. Endpoints vary by
     * protocol:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>http</code> protocol, the (public) endpoint is a URL
     * beginning with <code>http://</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>https</code> protocol, the (public) endpoint is a URL
     * beginning with <code>https://</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>email</code> protocol, the endpoint is an email address.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>email-json</code> protocol, the endpoint is an email
     * address.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>sms</code> protocol, the endpoint is a phone number of an
     * SMS-enabled device.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>sqs</code> protocol, the endpoint is the ARN of an Amazon
     * SQS queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>application</code> protocol, the endpoint is the
     * EndpointArn of a mobile app and device.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>lambda</code> protocol, the endpoint is the ARN of an
     * Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>firehose</code> protocol, the endpoint is the ARN of an
     * Amazon Kinesis Data Firehose delivery stream.
     * </p>
     * </li>
     * </ul>
     */
    private String endpoint;

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special
     * request parameters that the <code>Subscribe</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS
     * retries failed deliveries to HTTP/S endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FilterPolicy</code> – The simple JSON object that lets your
     * subscriber receive only a subset of messages, rather than receiving every
     * message published to the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RawMessageDelivery</code> – When set to <code>true</code>, enables
     * raw message delivery to Amazon SQS or HTTP/S endpoints. This eliminates
     * the need for the endpoints to process JSON formatting, which is otherwise
     * created for Amazon SNS metadata.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> – When specified, sends undeliverable messages
     * to the specified Amazon SQS dead-letter queue. Messages that can't be
     * delivered due to client errors (for example, when the subscribed endpoint
     * is unreachable) or server errors (for example, when the service that
     * powers the subscribed endpoint becomes unavailable) are held in the
     * dead-letter queue for further analysis or reprocessing.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute applies only to Amazon Kinesis Data Firehose
     * delivery stream subscriptions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SubscriptionRoleArn</code> – The ARN of the IAM role that has the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Permission to write to the Kinesis Data Firehose delivery stream
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SNS listed as a trusted entity
     * </p>
     * </li>
     * </ul>
     * <p>
     * Specifying a valid ARN for this attribute is required for Kinesis Data
     * Firehose delivery stream subscriptions. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-firehose-as-subscriber.html"
     * >Fanout to Kinesis Data Firehose delivery streams</a> in the <i>Amazon
     * SNS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> attributes = new java.util.HashMap<String, String>();

    /**
     * <p>
     * Sets whether the response from the <code>Subscribe</code> request
     * includes the subscription ARN, even if the subscription is not yet
     * confirmed.
     * </p>
     * <p>
     * If you set this parameter to <code>true</code>, the response includes the
     * ARN in all cases, even if the subscription is not yet confirmed. In
     * addition to the ARN for confirmed subscriptions, the response also
     * includes the <code>pending subscription</code> ARN value for
     * subscriptions that aren't yet confirmed. A subscription becomes confirmed
     * when the subscriber calls the <code>ConfirmSubscription</code> action
     * with a confirmation token.
     * </p>
     * <p/>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     */
    private Boolean returnSubscriptionArn;

    /**
     * Default constructor for SubscribeRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     */
    public SubscribeRequest() {
    }

    /**
     * Constructs a new SubscribeRequest object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param topicArn <p>
     *            The ARN of the topic you want to subscribe to.
     *            </p>
     * @param protocol <p>
     *            The protocol that you want to use. Supported protocols
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>http</code> – delivery of JSON-encoded message via HTTP
     *            POST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>https</code> – delivery of JSON-encoded message via
     *            HTTPS POST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>email</code> – delivery of message via SMTP
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>email-json</code> – delivery of JSON-encoded message via
     *            SMTP
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sms</code> – delivery of message via SMS
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sqs</code> – delivery of JSON-encoded message to an
     *            Amazon SQS queue
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>application</code> – delivery of JSON-encoded message to
     *            an EndpointArn for a mobile app and device
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>lambda</code> – delivery of JSON-encoded message to an
     *            Lambda function
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>firehose</code> – delivery of JSON-encoded message to an
     *            Amazon Kinesis Data Firehose delivery stream.
     *            </p>
     *            </li>
     *            </ul>
     * @param endpoint <p>
     *            The endpoint that you want to receive notifications. Endpoints
     *            vary by protocol:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For the <code>http</code> protocol, the (public) endpoint is a
     *            URL beginning with <code>http://</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>https</code> protocol, the (public) endpoint is
     *            a URL beginning with <code>https://</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>email</code> protocol, the endpoint is an email
     *            address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>email-json</code> protocol, the endpoint is an
     *            email address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>sms</code> protocol, the endpoint is a phone
     *            number of an SMS-enabled device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>sqs</code> protocol, the endpoint is the ARN of
     *            an Amazon SQS queue.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>application</code> protocol, the endpoint is the
     *            EndpointArn of a mobile app and device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>lambda</code> protocol, the endpoint is the ARN
     *            of an Lambda function.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>firehose</code> protocol, the endpoint is the
     *            ARN of an Amazon Kinesis Data Firehose delivery stream.
     *            </p>
     *            </li>
     *            </ul>
     */
    public SubscribeRequest(String topicArn, String protocol, String endpoint) {
        setTopicArn(topicArn);
        setProtocol(protocol);
        setEndpoint(endpoint);
    }

    /**
     * <p>
     * The ARN of the topic you want to subscribe to.
     * </p>
     *
     * @return <p>
     *         The ARN of the topic you want to subscribe to.
     *         </p>
     */
    public String getTopicArn() {
        return topicArn;
    }

    /**
     * <p>
     * The ARN of the topic you want to subscribe to.
     * </p>
     *
     * @param topicArn <p>
     *            The ARN of the topic you want to subscribe to.
     *            </p>
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The ARN of the topic you want to subscribe to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topicArn <p>
     *            The ARN of the topic you want to subscribe to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubscribeRequest withTopicArn(String topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    /**
     * <p>
     * The protocol that you want to use. Supported protocols include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>http</code> – delivery of JSON-encoded message via HTTP POST
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https</code> – delivery of JSON-encoded message via HTTPS POST
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email</code> – delivery of message via SMTP
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email-json</code> – delivery of JSON-encoded message via SMTP
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sms</code> – delivery of message via SMS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqs</code> – delivery of JSON-encoded message to an Amazon SQS
     * queue
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application</code> – delivery of JSON-encoded message to an
     * EndpointArn for a mobile app and device
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda</code> – delivery of JSON-encoded message to an Lambda
     * function
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>firehose</code> – delivery of JSON-encoded message to an Amazon
     * Kinesis Data Firehose delivery stream.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The protocol that you want to use. Supported protocols include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>http</code> – delivery of JSON-encoded message via HTTP
     *         POST
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>https</code> – delivery of JSON-encoded message via HTTPS
     *         POST
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>email</code> – delivery of message via SMTP
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>email-json</code> – delivery of JSON-encoded message via
     *         SMTP
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sms</code> – delivery of message via SMS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqs</code> – delivery of JSON-encoded message to an Amazon
     *         SQS queue
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>application</code> – delivery of JSON-encoded message to an
     *         EndpointArn for a mobile app and device
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>lambda</code> – delivery of JSON-encoded message to an
     *         Lambda function
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>firehose</code> – delivery of JSON-encoded message to an
     *         Amazon Kinesis Data Firehose delivery stream.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * The protocol that you want to use. Supported protocols include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>http</code> – delivery of JSON-encoded message via HTTP POST
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https</code> – delivery of JSON-encoded message via HTTPS POST
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email</code> – delivery of message via SMTP
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email-json</code> – delivery of JSON-encoded message via SMTP
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sms</code> – delivery of message via SMS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqs</code> – delivery of JSON-encoded message to an Amazon SQS
     * queue
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application</code> – delivery of JSON-encoded message to an
     * EndpointArn for a mobile app and device
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda</code> – delivery of JSON-encoded message to an Lambda
     * function
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>firehose</code> – delivery of JSON-encoded message to an Amazon
     * Kinesis Data Firehose delivery stream.
     * </p>
     * </li>
     * </ul>
     *
     * @param protocol <p>
     *            The protocol that you want to use. Supported protocols
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>http</code> – delivery of JSON-encoded message via HTTP
     *            POST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>https</code> – delivery of JSON-encoded message via
     *            HTTPS POST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>email</code> – delivery of message via SMTP
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>email-json</code> – delivery of JSON-encoded message via
     *            SMTP
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sms</code> – delivery of message via SMS
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sqs</code> – delivery of JSON-encoded message to an
     *            Amazon SQS queue
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>application</code> – delivery of JSON-encoded message to
     *            an EndpointArn for a mobile app and device
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>lambda</code> – delivery of JSON-encoded message to an
     *            Lambda function
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>firehose</code> – delivery of JSON-encoded message to an
     *            Amazon Kinesis Data Firehose delivery stream.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol that you want to use. Supported protocols include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>http</code> – delivery of JSON-encoded message via HTTP POST
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https</code> – delivery of JSON-encoded message via HTTPS POST
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email</code> – delivery of message via SMTP
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email-json</code> – delivery of JSON-encoded message via SMTP
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sms</code> – delivery of message via SMS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqs</code> – delivery of JSON-encoded message to an Amazon SQS
     * queue
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application</code> – delivery of JSON-encoded message to an
     * EndpointArn for a mobile app and device
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda</code> – delivery of JSON-encoded message to an Lambda
     * function
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>firehose</code> – delivery of JSON-encoded message to an Amazon
     * Kinesis Data Firehose delivery stream.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param protocol <p>
     *            The protocol that you want to use. Supported protocols
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>http</code> – delivery of JSON-encoded message via HTTP
     *            POST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>https</code> – delivery of JSON-encoded message via
     *            HTTPS POST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>email</code> – delivery of message via SMTP
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>email-json</code> – delivery of JSON-encoded message via
     *            SMTP
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sms</code> – delivery of message via SMS
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sqs</code> – delivery of JSON-encoded message to an
     *            Amazon SQS queue
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>application</code> – delivery of JSON-encoded message to
     *            an EndpointArn for a mobile app and device
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>lambda</code> – delivery of JSON-encoded message to an
     *            Lambda function
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>firehose</code> – delivery of JSON-encoded message to an
     *            Amazon Kinesis Data Firehose delivery stream.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubscribeRequest withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * <p>
     * The endpoint that you want to receive notifications. Endpoints vary by
     * protocol:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>http</code> protocol, the (public) endpoint is a URL
     * beginning with <code>http://</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>https</code> protocol, the (public) endpoint is a URL
     * beginning with <code>https://</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>email</code> protocol, the endpoint is an email address.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>email-json</code> protocol, the endpoint is an email
     * address.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>sms</code> protocol, the endpoint is a phone number of an
     * SMS-enabled device.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>sqs</code> protocol, the endpoint is the ARN of an Amazon
     * SQS queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>application</code> protocol, the endpoint is the
     * EndpointArn of a mobile app and device.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>lambda</code> protocol, the endpoint is the ARN of an
     * Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>firehose</code> protocol, the endpoint is the ARN of an
     * Amazon Kinesis Data Firehose delivery stream.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The endpoint that you want to receive notifications. Endpoints
     *         vary by protocol:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For the <code>http</code> protocol, the (public) endpoint is a
     *         URL beginning with <code>http://</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>https</code> protocol, the (public) endpoint is a
     *         URL beginning with <code>https://</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>email</code> protocol, the endpoint is an email
     *         address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>email-json</code> protocol, the endpoint is an
     *         email address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>sms</code> protocol, the endpoint is a phone number
     *         of an SMS-enabled device.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>sqs</code> protocol, the endpoint is the ARN of an
     *         Amazon SQS queue.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>application</code> protocol, the endpoint is the
     *         EndpointArn of a mobile app and device.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>lambda</code> protocol, the endpoint is the ARN of
     *         an Lambda function.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>firehose</code> protocol, the endpoint is the ARN
     *         of an Amazon Kinesis Data Firehose delivery stream.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * <p>
     * The endpoint that you want to receive notifications. Endpoints vary by
     * protocol:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>http</code> protocol, the (public) endpoint is a URL
     * beginning with <code>http://</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>https</code> protocol, the (public) endpoint is a URL
     * beginning with <code>https://</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>email</code> protocol, the endpoint is an email address.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>email-json</code> protocol, the endpoint is an email
     * address.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>sms</code> protocol, the endpoint is a phone number of an
     * SMS-enabled device.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>sqs</code> protocol, the endpoint is the ARN of an Amazon
     * SQS queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>application</code> protocol, the endpoint is the
     * EndpointArn of a mobile app and device.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>lambda</code> protocol, the endpoint is the ARN of an
     * Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>firehose</code> protocol, the endpoint is the ARN of an
     * Amazon Kinesis Data Firehose delivery stream.
     * </p>
     * </li>
     * </ul>
     *
     * @param endpoint <p>
     *            The endpoint that you want to receive notifications. Endpoints
     *            vary by protocol:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For the <code>http</code> protocol, the (public) endpoint is a
     *            URL beginning with <code>http://</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>https</code> protocol, the (public) endpoint is
     *            a URL beginning with <code>https://</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>email</code> protocol, the endpoint is an email
     *            address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>email-json</code> protocol, the endpoint is an
     *            email address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>sms</code> protocol, the endpoint is a phone
     *            number of an SMS-enabled device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>sqs</code> protocol, the endpoint is the ARN of
     *            an Amazon SQS queue.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>application</code> protocol, the endpoint is the
     *            EndpointArn of a mobile app and device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>lambda</code> protocol, the endpoint is the ARN
     *            of an Lambda function.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>firehose</code> protocol, the endpoint is the
     *            ARN of an Amazon Kinesis Data Firehose delivery stream.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint that you want to receive notifications. Endpoints vary by
     * protocol:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>http</code> protocol, the (public) endpoint is a URL
     * beginning with <code>http://</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>https</code> protocol, the (public) endpoint is a URL
     * beginning with <code>https://</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>email</code> protocol, the endpoint is an email address.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>email-json</code> protocol, the endpoint is an email
     * address.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>sms</code> protocol, the endpoint is a phone number of an
     * SMS-enabled device.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>sqs</code> protocol, the endpoint is the ARN of an Amazon
     * SQS queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>application</code> protocol, the endpoint is the
     * EndpointArn of a mobile app and device.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>lambda</code> protocol, the endpoint is the ARN of an
     * Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>firehose</code> protocol, the endpoint is the ARN of an
     * Amazon Kinesis Data Firehose delivery stream.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpoint <p>
     *            The endpoint that you want to receive notifications. Endpoints
     *            vary by protocol:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For the <code>http</code> protocol, the (public) endpoint is a
     *            URL beginning with <code>http://</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>https</code> protocol, the (public) endpoint is
     *            a URL beginning with <code>https://</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>email</code> protocol, the endpoint is an email
     *            address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>email-json</code> protocol, the endpoint is an
     *            email address.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>sms</code> protocol, the endpoint is a phone
     *            number of an SMS-enabled device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>sqs</code> protocol, the endpoint is the ARN of
     *            an Amazon SQS queue.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>application</code> protocol, the endpoint is the
     *            EndpointArn of a mobile app and device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>lambda</code> protocol, the endpoint is the ARN
     *            of an Lambda function.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>firehose</code> protocol, the endpoint is the
     *            ARN of an Amazon Kinesis Data Firehose delivery stream.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubscribeRequest withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special
     * request parameters that the <code>Subscribe</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS
     * retries failed deliveries to HTTP/S endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FilterPolicy</code> – The simple JSON object that lets your
     * subscriber receive only a subset of messages, rather than receiving every
     * message published to the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RawMessageDelivery</code> – When set to <code>true</code>, enables
     * raw message delivery to Amazon SQS or HTTP/S endpoints. This eliminates
     * the need for the endpoints to process JSON formatting, which is otherwise
     * created for Amazon SNS metadata.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> – When specified, sends undeliverable messages
     * to the specified Amazon SQS dead-letter queue. Messages that can't be
     * delivered due to client errors (for example, when the subscribed endpoint
     * is unreachable) or server errors (for example, when the service that
     * powers the subscribed endpoint becomes unavailable) are held in the
     * dead-letter queue for further analysis or reprocessing.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute applies only to Amazon Kinesis Data Firehose
     * delivery stream subscriptions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SubscriptionRoleArn</code> – The ARN of the IAM role that has the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Permission to write to the Kinesis Data Firehose delivery stream
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SNS listed as a trusted entity
     * </p>
     * </li>
     * </ul>
     * <p>
     * Specifying a valid ARN for this attribute is required for Kinesis Data
     * Firehose delivery stream subscriptions. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-firehose-as-subscriber.html"
     * >Fanout to Kinesis Data Firehose delivery streams</a> in the <i>Amazon
     * SNS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A map of attributes with their corresponding values.
     *         </p>
     *         <p>
     *         The following lists the names, descriptions, and values of the
     *         special request parameters that the <code>Subscribe</code> action
     *         uses:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DeliveryPolicy</code> – The policy that defines how Amazon
     *         SNS retries failed deliveries to HTTP/S endpoints.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FilterPolicy</code> – The simple JSON object that lets your
     *         subscriber receive only a subset of messages, rather than
     *         receiving every message published to the topic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RawMessageDelivery</code> – When set to <code>true</code>,
     *         enables raw message delivery to Amazon SQS or HTTP/S endpoints.
     *         This eliminates the need for the endpoints to process JSON
     *         formatting, which is otherwise created for Amazon SNS metadata.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RedrivePolicy</code> – When specified, sends undeliverable
     *         messages to the specified Amazon SQS dead-letter queue. Messages
     *         that can't be delivered due to client errors (for example, when
     *         the subscribed endpoint is unreachable) or server errors (for
     *         example, when the service that powers the subscribed endpoint
     *         becomes unavailable) are held in the dead-letter queue for
     *         further analysis or reprocessing.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following attribute applies only to Amazon Kinesis Data
     *         Firehose delivery stream subscriptions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SubscriptionRoleArn</code> – The ARN of the IAM role that
     *         has the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Permission to write to the Kinesis Data Firehose delivery stream
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon SNS listed as a trusted entity
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Specifying a valid ARN for this attribute is required for Kinesis
     *         Data Firehose delivery stream subscriptions. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/sns/latest/dg/sns-firehose-as-subscriber.html"
     *         >Fanout to Kinesis Data Firehose delivery streams</a> in the
     *         <i>Amazon SNS Developer Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special
     * request parameters that the <code>Subscribe</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS
     * retries failed deliveries to HTTP/S endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FilterPolicy</code> – The simple JSON object that lets your
     * subscriber receive only a subset of messages, rather than receiving every
     * message published to the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RawMessageDelivery</code> – When set to <code>true</code>, enables
     * raw message delivery to Amazon SQS or HTTP/S endpoints. This eliminates
     * the need for the endpoints to process JSON formatting, which is otherwise
     * created for Amazon SNS metadata.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> – When specified, sends undeliverable messages
     * to the specified Amazon SQS dead-letter queue. Messages that can't be
     * delivered due to client errors (for example, when the subscribed endpoint
     * is unreachable) or server errors (for example, when the service that
     * powers the subscribed endpoint becomes unavailable) are held in the
     * dead-letter queue for further analysis or reprocessing.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute applies only to Amazon Kinesis Data Firehose
     * delivery stream subscriptions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SubscriptionRoleArn</code> – The ARN of the IAM role that has the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Permission to write to the Kinesis Data Firehose delivery stream
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SNS listed as a trusted entity
     * </p>
     * </li>
     * </ul>
     * <p>
     * Specifying a valid ARN for this attribute is required for Kinesis Data
     * Firehose delivery stream subscriptions. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-firehose-as-subscriber.html"
     * >Fanout to Kinesis Data Firehose delivery streams</a> in the <i>Amazon
     * SNS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     *
     * @param attributes <p>
     *            A map of attributes with their corresponding values.
     *            </p>
     *            <p>
     *            The following lists the names, descriptions, and values of the
     *            special request parameters that the <code>Subscribe</code>
     *            action uses:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DeliveryPolicy</code> – The policy that defines how
     *            Amazon SNS retries failed deliveries to HTTP/S endpoints.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FilterPolicy</code> – The simple JSON object that lets
     *            your subscriber receive only a subset of messages, rather than
     *            receiving every message published to the topic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RawMessageDelivery</code> – When set to
     *            <code>true</code>, enables raw message delivery to Amazon SQS
     *            or HTTP/S endpoints. This eliminates the need for the
     *            endpoints to process JSON formatting, which is otherwise
     *            created for Amazon SNS metadata.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RedrivePolicy</code> – When specified, sends
     *            undeliverable messages to the specified Amazon SQS dead-letter
     *            queue. Messages that can't be delivered due to client errors
     *            (for example, when the subscribed endpoint is unreachable) or
     *            server errors (for example, when the service that powers the
     *            subscribed endpoint becomes unavailable) are held in the
     *            dead-letter queue for further analysis or reprocessing.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The following attribute applies only to Amazon Kinesis Data
     *            Firehose delivery stream subscriptions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SubscriptionRoleArn</code> – The ARN of the IAM role
     *            that has the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Permission to write to the Kinesis Data Firehose delivery
     *            stream
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon SNS listed as a trusted entity
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Specifying a valid ARN for this attribute is required for
     *            Kinesis Data Firehose delivery stream subscriptions. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-firehose-as-subscriber.html"
     *            >Fanout to Kinesis Data Firehose delivery streams</a> in the
     *            <i>Amazon SNS Developer Guide</i>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special
     * request parameters that the <code>Subscribe</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS
     * retries failed deliveries to HTTP/S endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FilterPolicy</code> – The simple JSON object that lets your
     * subscriber receive only a subset of messages, rather than receiving every
     * message published to the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RawMessageDelivery</code> – When set to <code>true</code>, enables
     * raw message delivery to Amazon SQS or HTTP/S endpoints. This eliminates
     * the need for the endpoints to process JSON formatting, which is otherwise
     * created for Amazon SNS metadata.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> – When specified, sends undeliverable messages
     * to the specified Amazon SQS dead-letter queue. Messages that can't be
     * delivered due to client errors (for example, when the subscribed endpoint
     * is unreachable) or server errors (for example, when the service that
     * powers the subscribed endpoint becomes unavailable) are held in the
     * dead-letter queue for further analysis or reprocessing.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute applies only to Amazon Kinesis Data Firehose
     * delivery stream subscriptions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SubscriptionRoleArn</code> – The ARN of the IAM role that has the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Permission to write to the Kinesis Data Firehose delivery stream
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SNS listed as a trusted entity
     * </p>
     * </li>
     * </ul>
     * <p>
     * Specifying a valid ARN for this attribute is required for Kinesis Data
     * Firehose delivery stream subscriptions. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-firehose-as-subscriber.html"
     * >Fanout to Kinesis Data Firehose delivery streams</a> in the <i>Amazon
     * SNS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            A map of attributes with their corresponding values.
     *            </p>
     *            <p>
     *            The following lists the names, descriptions, and values of the
     *            special request parameters that the <code>Subscribe</code>
     *            action uses:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DeliveryPolicy</code> – The policy that defines how
     *            Amazon SNS retries failed deliveries to HTTP/S endpoints.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FilterPolicy</code> – The simple JSON object that lets
     *            your subscriber receive only a subset of messages, rather than
     *            receiving every message published to the topic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RawMessageDelivery</code> – When set to
     *            <code>true</code>, enables raw message delivery to Amazon SQS
     *            or HTTP/S endpoints. This eliminates the need for the
     *            endpoints to process JSON formatting, which is otherwise
     *            created for Amazon SNS metadata.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RedrivePolicy</code> – When specified, sends
     *            undeliverable messages to the specified Amazon SQS dead-letter
     *            queue. Messages that can't be delivered due to client errors
     *            (for example, when the subscribed endpoint is unreachable) or
     *            server errors (for example, when the service that powers the
     *            subscribed endpoint becomes unavailable) are held in the
     *            dead-letter queue for further analysis or reprocessing.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The following attribute applies only to Amazon Kinesis Data
     *            Firehose delivery stream subscriptions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>SubscriptionRoleArn</code> – The ARN of the IAM role
     *            that has the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Permission to write to the Kinesis Data Firehose delivery
     *            stream
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon SNS listed as a trusted entity
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Specifying a valid ARN for this attribute is required for
     *            Kinesis Data Firehose delivery stream subscriptions. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-firehose-as-subscriber.html"
     *            >Fanout to Kinesis Data Firehose delivery streams</a> in the
     *            <i>Amazon SNS Developer Guide</i>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubscribeRequest withAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special
     * request parameters that the <code>Subscribe</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS
     * retries failed deliveries to HTTP/S endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FilterPolicy</code> – The simple JSON object that lets your
     * subscriber receive only a subset of messages, rather than receiving every
     * message published to the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RawMessageDelivery</code> – When set to <code>true</code>, enables
     * raw message delivery to Amazon SQS or HTTP/S endpoints. This eliminates
     * the need for the endpoints to process JSON formatting, which is otherwise
     * created for Amazon SNS metadata.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RedrivePolicy</code> – When specified, sends undeliverable messages
     * to the specified Amazon SQS dead-letter queue. Messages that can't be
     * delivered due to client errors (for example, when the subscribed endpoint
     * is unreachable) or server errors (for example, when the service that
     * powers the subscribed endpoint becomes unavailable) are held in the
     * dead-letter queue for further analysis or reprocessing.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute applies only to Amazon Kinesis Data Firehose
     * delivery stream subscriptions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SubscriptionRoleArn</code> – The ARN of the IAM role that has the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Permission to write to the Kinesis Data Firehose delivery stream
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SNS listed as a trusted entity
     * </p>
     * </li>
     * </ul>
     * <p>
     * Specifying a valid ARN for this attribute is required for Kinesis Data
     * Firehose delivery stream subscriptions. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-firehose-as-subscriber.html"
     * >Fanout to Kinesis Data Firehose delivery streams</a> in the <i>Amazon
     * SNS Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into
     *            Attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubscribeRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public SubscribeRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * Sets whether the response from the <code>Subscribe</code> request
     * includes the subscription ARN, even if the subscription is not yet
     * confirmed.
     * </p>
     * <p>
     * If you set this parameter to <code>true</code>, the response includes the
     * ARN in all cases, even if the subscription is not yet confirmed. In
     * addition to the ARN for confirmed subscriptions, the response also
     * includes the <code>pending subscription</code> ARN value for
     * subscriptions that aren't yet confirmed. A subscription becomes confirmed
     * when the subscriber calls the <code>ConfirmSubscription</code> action
     * with a confirmation token.
     * </p>
     * <p/>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         Sets whether the response from the <code>Subscribe</code> request
     *         includes the subscription ARN, even if the subscription is not
     *         yet confirmed.
     *         </p>
     *         <p>
     *         If you set this parameter to <code>true</code>, the response
     *         includes the ARN in all cases, even if the subscription is not
     *         yet confirmed. In addition to the ARN for confirmed
     *         subscriptions, the response also includes the
     *         <code>pending subscription</code> ARN value for subscriptions
     *         that aren't yet confirmed. A subscription becomes confirmed when
     *         the subscriber calls the <code>ConfirmSubscription</code> action
     *         with a confirmation token.
     *         </p>
     *         <p/>
     *         <p>
     *         The default value is <code>false</code>.
     *         </p>
     */
    public Boolean isReturnSubscriptionArn() {
        return returnSubscriptionArn;
    }

    /**
     * <p>
     * Sets whether the response from the <code>Subscribe</code> request
     * includes the subscription ARN, even if the subscription is not yet
     * confirmed.
     * </p>
     * <p>
     * If you set this parameter to <code>true</code>, the response includes the
     * ARN in all cases, even if the subscription is not yet confirmed. In
     * addition to the ARN for confirmed subscriptions, the response also
     * includes the <code>pending subscription</code> ARN value for
     * subscriptions that aren't yet confirmed. A subscription becomes confirmed
     * when the subscriber calls the <code>ConfirmSubscription</code> action
     * with a confirmation token.
     * </p>
     * <p/>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         Sets whether the response from the <code>Subscribe</code> request
     *         includes the subscription ARN, even if the subscription is not
     *         yet confirmed.
     *         </p>
     *         <p>
     *         If you set this parameter to <code>true</code>, the response
     *         includes the ARN in all cases, even if the subscription is not
     *         yet confirmed. In addition to the ARN for confirmed
     *         subscriptions, the response also includes the
     *         <code>pending subscription</code> ARN value for subscriptions
     *         that aren't yet confirmed. A subscription becomes confirmed when
     *         the subscriber calls the <code>ConfirmSubscription</code> action
     *         with a confirmation token.
     *         </p>
     *         <p/>
     *         <p>
     *         The default value is <code>false</code>.
     *         </p>
     */
    public Boolean getReturnSubscriptionArn() {
        return returnSubscriptionArn;
    }

    /**
     * <p>
     * Sets whether the response from the <code>Subscribe</code> request
     * includes the subscription ARN, even if the subscription is not yet
     * confirmed.
     * </p>
     * <p>
     * If you set this parameter to <code>true</code>, the response includes the
     * ARN in all cases, even if the subscription is not yet confirmed. In
     * addition to the ARN for confirmed subscriptions, the response also
     * includes the <code>pending subscription</code> ARN value for
     * subscriptions that aren't yet confirmed. A subscription becomes confirmed
     * when the subscriber calls the <code>ConfirmSubscription</code> action
     * with a confirmation token.
     * </p>
     * <p/>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     *
     * @param returnSubscriptionArn <p>
     *            Sets whether the response from the <code>Subscribe</code>
     *            request includes the subscription ARN, even if the
     *            subscription is not yet confirmed.
     *            </p>
     *            <p>
     *            If you set this parameter to <code>true</code>, the response
     *            includes the ARN in all cases, even if the subscription is not
     *            yet confirmed. In addition to the ARN for confirmed
     *            subscriptions, the response also includes the
     *            <code>pending subscription</code> ARN value for subscriptions
     *            that aren't yet confirmed. A subscription becomes confirmed
     *            when the subscriber calls the <code>ConfirmSubscription</code>
     *            action with a confirmation token.
     *            </p>
     *            <p/>
     *            <p>
     *            The default value is <code>false</code>.
     *            </p>
     */
    public void setReturnSubscriptionArn(Boolean returnSubscriptionArn) {
        this.returnSubscriptionArn = returnSubscriptionArn;
    }

    /**
     * <p>
     * Sets whether the response from the <code>Subscribe</code> request
     * includes the subscription ARN, even if the subscription is not yet
     * confirmed.
     * </p>
     * <p>
     * If you set this parameter to <code>true</code>, the response includes the
     * ARN in all cases, even if the subscription is not yet confirmed. In
     * addition to the ARN for confirmed subscriptions, the response also
     * includes the <code>pending subscription</code> ARN value for
     * subscriptions that aren't yet confirmed. A subscription becomes confirmed
     * when the subscriber calls the <code>ConfirmSubscription</code> action
     * with a confirmation token.
     * </p>
     * <p/>
     * <p>
     * The default value is <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param returnSubscriptionArn <p>
     *            Sets whether the response from the <code>Subscribe</code>
     *            request includes the subscription ARN, even if the
     *            subscription is not yet confirmed.
     *            </p>
     *            <p>
     *            If you set this parameter to <code>true</code>, the response
     *            includes the ARN in all cases, even if the subscription is not
     *            yet confirmed. In addition to the ARN for confirmed
     *            subscriptions, the response also includes the
     *            <code>pending subscription</code> ARN value for subscriptions
     *            that aren't yet confirmed. A subscription becomes confirmed
     *            when the subscriber calls the <code>ConfirmSubscription</code>
     *            action with a confirmation token.
     *            </p>
     *            <p/>
     *            <p>
     *            The default value is <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubscribeRequest withReturnSubscriptionArn(Boolean returnSubscriptionArn) {
        this.returnSubscriptionArn = returnSubscriptionArn;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTopicArn() != null)
            sb.append("TopicArn: " + getTopicArn() + ",");
        if (getProtocol() != null)
            sb.append("Protocol: " + getProtocol() + ",");
        if (getEndpoint() != null)
            sb.append("Endpoint: " + getEndpoint() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getReturnSubscriptionArn() != null)
            sb.append("ReturnSubscriptionArn: " + getReturnSubscriptionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime
                * hashCode
                + ((getReturnSubscriptionArn() == null) ? 0 : getReturnSubscriptionArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubscribeRequest == false)
            return false;
        SubscribeRequest other = (SubscribeRequest) obj;

        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getReturnSubscriptionArn() == null ^ this.getReturnSubscriptionArn() == null)
            return false;
        if (other.getReturnSubscriptionArn() != null
                && other.getReturnSubscriptionArn().equals(this.getReturnSubscriptionArn()) == false)
            return false;
        return true;
    }
}
