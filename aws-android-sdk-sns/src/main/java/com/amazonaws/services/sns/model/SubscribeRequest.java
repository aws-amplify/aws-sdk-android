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

package com.amazonaws.services.sns.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Prepares to subscribe an endpoint by sending the endpoint a confirmation
 * message. To actually create a subscription, the endpoint owner must call the
 * <code>ConfirmSubscription</code> action with the token from the confirmation
 * message. Confirmation tokens are valid for three days.
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
     * The protocol you want to use. Supported protocols include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>http</code> -- delivery of JSON-encoded message via HTTP POST
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https</code> -- delivery of JSON-encoded message via HTTPS POST
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email</code> -- delivery of message via SMTP
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email-json</code> -- delivery of JSON-encoded message via SMTP
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sms</code> -- delivery of message via SMS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqs</code> -- delivery of JSON-encoded message to an Amazon SQS
     * queue
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application</code> -- delivery of JSON-encoded message to an
     * EndpointArn for a mobile app and device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda</code> -- delivery of JSON-encoded message to an AWS Lambda
     * function.
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
     * For the <code>http</code> protocol, the endpoint is an URL beginning with
     * "http://"
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>https</code> protocol, the endpoint is a URL beginning with
     * "https://"
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>email</code> protocol, the endpoint is an email address
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>email-json</code> protocol, the endpoint is an email
     * address
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>sms</code> protocol, the endpoint is a phone number of an
     * SMS-enabled device
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>sqs</code> protocol, the endpoint is the ARN of an Amazon
     * SQS queue
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
     * For the <code>lambda</code> protocol, the endpoint is the ARN of an AWS
     * Lambda function.
     * </p>
     * </li>
     * </ul>
     */
    private String endpoint;

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
     *            The protocol you want to use. Supported protocols include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>http</code> -- delivery of JSON-encoded message via HTTP
     *            POST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>https</code> -- delivery of JSON-encoded message via
     *            HTTPS POST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>email</code> -- delivery of message via SMTP
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>email-json</code> -- delivery of JSON-encoded message
     *            via SMTP
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sms</code> -- delivery of message via SMS
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sqs</code> -- delivery of JSON-encoded message to an
     *            Amazon SQS queue
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>application</code> -- delivery of JSON-encoded message
     *            to an EndpointArn for a mobile app and device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>lambda</code> -- delivery of JSON-encoded message to an
     *            AWS Lambda function.
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
     *            For the <code>http</code> protocol, the endpoint is an URL
     *            beginning with "http://"
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>https</code> protocol, the endpoint is a URL
     *            beginning with "https://"
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>email</code> protocol, the endpoint is an email
     *            address
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>email-json</code> protocol, the endpoint is an
     *            email address
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>sms</code> protocol, the endpoint is a phone
     *            number of an SMS-enabled device
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>sqs</code> protocol, the endpoint is the ARN of
     *            an Amazon SQS queue
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
     *            of an AWS Lambda function.
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
     * The protocol you want to use. Supported protocols include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>http</code> -- delivery of JSON-encoded message via HTTP POST
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https</code> -- delivery of JSON-encoded message via HTTPS POST
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email</code> -- delivery of message via SMTP
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email-json</code> -- delivery of JSON-encoded message via SMTP
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sms</code> -- delivery of message via SMS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqs</code> -- delivery of JSON-encoded message to an Amazon SQS
     * queue
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application</code> -- delivery of JSON-encoded message to an
     * EndpointArn for a mobile app and device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda</code> -- delivery of JSON-encoded message to an AWS Lambda
     * function.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The protocol you want to use. Supported protocols include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>http</code> -- delivery of JSON-encoded message via HTTP
     *         POST
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>https</code> -- delivery of JSON-encoded message via HTTPS
     *         POST
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>email</code> -- delivery of message via SMTP
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>email-json</code> -- delivery of JSON-encoded message via
     *         SMTP
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sms</code> -- delivery of message via SMS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqs</code> -- delivery of JSON-encoded message to an Amazon
     *         SQS queue
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>application</code> -- delivery of JSON-encoded message to
     *         an EndpointArn for a mobile app and device.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>lambda</code> -- delivery of JSON-encoded message to an AWS
     *         Lambda function.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * The protocol you want to use. Supported protocols include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>http</code> -- delivery of JSON-encoded message via HTTP POST
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https</code> -- delivery of JSON-encoded message via HTTPS POST
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email</code> -- delivery of message via SMTP
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email-json</code> -- delivery of JSON-encoded message via SMTP
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sms</code> -- delivery of message via SMS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqs</code> -- delivery of JSON-encoded message to an Amazon SQS
     * queue
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application</code> -- delivery of JSON-encoded message to an
     * EndpointArn for a mobile app and device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda</code> -- delivery of JSON-encoded message to an AWS Lambda
     * function.
     * </p>
     * </li>
     * </ul>
     *
     * @param protocol <p>
     *            The protocol you want to use. Supported protocols include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>http</code> -- delivery of JSON-encoded message via HTTP
     *            POST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>https</code> -- delivery of JSON-encoded message via
     *            HTTPS POST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>email</code> -- delivery of message via SMTP
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>email-json</code> -- delivery of JSON-encoded message
     *            via SMTP
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sms</code> -- delivery of message via SMS
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sqs</code> -- delivery of JSON-encoded message to an
     *            Amazon SQS queue
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>application</code> -- delivery of JSON-encoded message
     *            to an EndpointArn for a mobile app and device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>lambda</code> -- delivery of JSON-encoded message to an
     *            AWS Lambda function.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol you want to use. Supported protocols include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>http</code> -- delivery of JSON-encoded message via HTTP POST
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https</code> -- delivery of JSON-encoded message via HTTPS POST
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email</code> -- delivery of message via SMTP
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email-json</code> -- delivery of JSON-encoded message via SMTP
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sms</code> -- delivery of message via SMS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqs</code> -- delivery of JSON-encoded message to an Amazon SQS
     * queue
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application</code> -- delivery of JSON-encoded message to an
     * EndpointArn for a mobile app and device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda</code> -- delivery of JSON-encoded message to an AWS Lambda
     * function.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param protocol <p>
     *            The protocol you want to use. Supported protocols include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>http</code> -- delivery of JSON-encoded message via HTTP
     *            POST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>https</code> -- delivery of JSON-encoded message via
     *            HTTPS POST
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>email</code> -- delivery of message via SMTP
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>email-json</code> -- delivery of JSON-encoded message
     *            via SMTP
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sms</code> -- delivery of message via SMS
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sqs</code> -- delivery of JSON-encoded message to an
     *            Amazon SQS queue
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>application</code> -- delivery of JSON-encoded message
     *            to an EndpointArn for a mobile app and device.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>lambda</code> -- delivery of JSON-encoded message to an
     *            AWS Lambda function.
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
     * For the <code>http</code> protocol, the endpoint is an URL beginning with
     * "http://"
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>https</code> protocol, the endpoint is a URL beginning with
     * "https://"
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>email</code> protocol, the endpoint is an email address
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>email-json</code> protocol, the endpoint is an email
     * address
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>sms</code> protocol, the endpoint is a phone number of an
     * SMS-enabled device
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>sqs</code> protocol, the endpoint is the ARN of an Amazon
     * SQS queue
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
     * For the <code>lambda</code> protocol, the endpoint is the ARN of an AWS
     * Lambda function.
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
     *         For the <code>http</code> protocol, the endpoint is an URL
     *         beginning with "http://"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>https</code> protocol, the endpoint is a URL
     *         beginning with "https://"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>email</code> protocol, the endpoint is an email
     *         address
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>email-json</code> protocol, the endpoint is an
     *         email address
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>sms</code> protocol, the endpoint is a phone number
     *         of an SMS-enabled device
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>sqs</code> protocol, the endpoint is the ARN of an
     *         Amazon SQS queue
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
     *         an AWS Lambda function.
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
     * For the <code>http</code> protocol, the endpoint is an URL beginning with
     * "http://"
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>https</code> protocol, the endpoint is a URL beginning with
     * "https://"
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>email</code> protocol, the endpoint is an email address
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>email-json</code> protocol, the endpoint is an email
     * address
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>sms</code> protocol, the endpoint is a phone number of an
     * SMS-enabled device
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>sqs</code> protocol, the endpoint is the ARN of an Amazon
     * SQS queue
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
     * For the <code>lambda</code> protocol, the endpoint is the ARN of an AWS
     * Lambda function.
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
     *            For the <code>http</code> protocol, the endpoint is an URL
     *            beginning with "http://"
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>https</code> protocol, the endpoint is a URL
     *            beginning with "https://"
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>email</code> protocol, the endpoint is an email
     *            address
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>email-json</code> protocol, the endpoint is an
     *            email address
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>sms</code> protocol, the endpoint is a phone
     *            number of an SMS-enabled device
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>sqs</code> protocol, the endpoint is the ARN of
     *            an Amazon SQS queue
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
     *            of an AWS Lambda function.
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
     * For the <code>http</code> protocol, the endpoint is an URL beginning with
     * "http://"
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>https</code> protocol, the endpoint is a URL beginning with
     * "https://"
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>email</code> protocol, the endpoint is an email address
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>email-json</code> protocol, the endpoint is an email
     * address
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>sms</code> protocol, the endpoint is a phone number of an
     * SMS-enabled device
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>sqs</code> protocol, the endpoint is the ARN of an Amazon
     * SQS queue
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
     * For the <code>lambda</code> protocol, the endpoint is the ARN of an AWS
     * Lambda function.
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
     *            For the <code>http</code> protocol, the endpoint is an URL
     *            beginning with "http://"
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>https</code> protocol, the endpoint is a URL
     *            beginning with "https://"
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>email</code> protocol, the endpoint is an email
     *            address
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>email-json</code> protocol, the endpoint is an
     *            email address
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>sms</code> protocol, the endpoint is a phone
     *            number of an SMS-enabled device
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>sqs</code> protocol, the endpoint is the ARN of
     *            an Amazon SQS queue
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
     *            of an AWS Lambda function.
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
            sb.append("Endpoint: " + getEndpoint());
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
        return true;
    }
}
