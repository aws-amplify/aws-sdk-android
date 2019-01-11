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
 * Sends a message to all of a topic's subscribed endpoints. When a
 * <code>messageId</code> is returned, the message has been saved and Amazon SNS
 * will attempt to deliver it to the topic's subscribers shortly. The format of
 * the outgoing message to each subscribed endpoint depends on the notification
 * protocol.
 * </p>
 * <p>
 * To use the <code>Publish</code> action for sending a message to a mobile
 * endpoint, such as an app on a Kindle device or mobile phone, you must specify
 * the EndpointArn for the TargetArn parameter. The EndpointArn is returned when
 * making a call with the <code>CreatePlatformEndpoint</code> action. The second
 * example below shows a request and response for publishing to a mobile
 * endpoint.
 * </p>
 * <p>
 * For more information about formatting messages, see <a href=
 * "http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-custommessage.html"
 * >Send Custom Platform-Specific Payloads in Messages to Mobile Devices</a>.
 * </p>
 */
public class PublishRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The topic you want to publish to.
     * </p>
     * <p>
     * If you don't specify a value for the <code>TopicArn</code> parameter, you
     * must specify a value for the <code>PhoneNumber</code> or
     * <code>TargetArn</code> parameters.
     * </p>
     */
    private String topicArn;

    /**
     * <p>
     * Either TopicArn or EndpointArn, but not both.
     * </p>
     * <p>
     * If you don't specify a value for the <code>TargetArn</code> parameter,
     * you must specify a value for the <code>PhoneNumber</code> or
     * <code>TopicArn</code> parameters.
     * </p>
     */
    private String targetArn;

    /**
     * <p>
     * The phone number to which you want to deliver an SMS message. Use E.164
     * format.
     * </p>
     * <p>
     * If you don't specify a value for the <code>PhoneNumber</code> parameter,
     * you must specify a value for the <code>TargetArn</code> or
     * <code>TopicArn</code> parameters.
     * </p>
     */
    private String phoneNumber;

    /**
     * <p>
     * The message you want to send to the topic.
     * </p>
     * <p>
     * If you want to send the same message to all transport protocols, include
     * the text of the message as a String value.
     * </p>
     * <p>
     * If you want to send different messages for each transport protocol, set
     * the value of the <code>MessageStructure</code> parameter to
     * <code>json</code> and use a JSON object for the <code>Message</code>
     * parameter. See the Examples section for the format of the JSON object.
     * </p>
     * <p>
     * Constraints: Messages must be UTF-8 encoded strings at most 256 KB in
     * size (262144 bytes, not 262144 characters).
     * </p>
     * <p>
     * JSON-specific constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Keys in the JSON object that correspond to supported transport protocols
     * must have simple JSON string values.
     * </p>
     * </li>
     * <li>
     * <p>
     * The values will be parsed (unescaped) before they are used in outgoing
     * messages.
     * </p>
     * </li>
     * <li>
     * <p>
     * Outbound notifications are JSON encoded (meaning that the characters will
     * be reescaped for sending).
     * </p>
     * </li>
     * <li>
     * <p>
     * Values have a minimum length of 0 (the empty string, "", is allowed).
     * </p>
     * </li>
     * <li>
     * <p>
     * Values have a maximum length bounded by the overall message size (so,
     * including multiple protocols may limit message sizes).
     * </p>
     * </li>
     * <li>
     * <p>
     * Non-string values will cause the key to be ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys that do not correspond to supported transport protocols are ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * Duplicate keys are not allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failure to parse or validate any key or value in the message will cause
     * the <code>Publish</code> call to return an error (no partial delivery).
     * </p>
     * </li>
     * </ul>
     */
    private String message;

    /**
     * <p>
     * Optional parameter to be used as the "Subject" line when the message is
     * delivered to email endpoints. This field will also be included, if
     * present, in the standard JSON messages delivered to other endpoints.
     * </p>
     * <p>
     * Constraints: Subjects must be ASCII text that begins with a letter,
     * number, or punctuation mark; must not include line breaks or control
     * characters; and must be less than 100 characters long.
     * </p>
     */
    private String subject;

    /**
     * <p>
     * Set <code>MessageStructure</code> to <code>json</code> if you want to
     * send a different message for each protocol. For example, using one
     * publish action, you can send a short message to your SMS subscribers and
     * a longer message to your email subscribers. If you set
     * <code>MessageStructure</code> to <code>json</code>, the value of the
     * <code>Message</code> parameter must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * be a syntactically valid JSON object; and
     * </p>
     * </li>
     * <li>
     * <p>
     * contain at least a top-level JSON key of "default" with a value that is a
     * string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can define other top-level keys that define the message you want to
     * send to a specific transport protocol (e.g., "http").
     * </p>
     * <p>
     * For information about sending different messages for each protocol using
     * the AWS Management Console, go to <a href=
     * "http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol"
     * >Create Different Messages for Each Protocol</a> in the <i>Amazon Simple
     * Notification Service Getting Started Guide</i>.
     * </p>
     * <p>
     * Valid value: <code>json</code>
     * </p>
     */
    private String messageStructure;

    /**
     * <p>
     * Message attributes for Publish action.
     * </p>
     */
    private java.util.Map<String, MessageAttributeValue> messageAttributes = new java.util.HashMap<String, MessageAttributeValue>();

    /**
     * Default constructor for PublishRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     */
    public PublishRequest() {
    }

    /**
     * Constructs a new PublishRequest object. Callers should use the setter or
     * fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param topicArn <p>
     *            The topic you want to publish to.
     *            </p>
     *            <p>
     *            If you don't specify a value for the <code>TopicArn</code>
     *            parameter, you must specify a value for the
     *            <code>PhoneNumber</code> or <code>TargetArn</code> parameters.
     *            </p>
     * @param message <p>
     *            The message you want to send to the topic.
     *            </p>
     *            <p>
     *            If you want to send the same message to all transport
     *            protocols, include the text of the message as a String value.
     *            </p>
     *            <p>
     *            If you want to send different messages for each transport
     *            protocol, set the value of the <code>MessageStructure</code>
     *            parameter to <code>json</code> and use a JSON object for the
     *            <code>Message</code> parameter. See the Examples section for
     *            the format of the JSON object.
     *            </p>
     *            <p>
     *            Constraints: Messages must be UTF-8 encoded strings at most
     *            256 KB in size (262144 bytes, not 262144 characters).
     *            </p>
     *            <p>
     *            JSON-specific constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Keys in the JSON object that correspond to supported transport
     *            protocols must have simple JSON string values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The values will be parsed (unescaped) before they are used in
     *            outgoing messages.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Outbound notifications are JSON encoded (meaning that the
     *            characters will be reescaped for sending).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Values have a minimum length of 0 (the empty string, "", is
     *            allowed).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Values have a maximum length bounded by the overall message
     *            size (so, including multiple protocols may limit message
     *            sizes).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Non-string values will cause the key to be ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Keys that do not correspond to supported transport protocols
     *            are ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Duplicate keys are not allowed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Failure to parse or validate any key or value in the message
     *            will cause the <code>Publish</code> call to return an error
     *            (no partial delivery).
     *            </p>
     *            </li>
     *            </ul>
     */
    public PublishRequest(String topicArn, String message) {
        setTopicArn(topicArn);
        setMessage(message);
    }

    /**
     * Constructs a new PublishRequest object. Callers should use the setter or
     * fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param topicArn <p>
     *            The topic you want to publish to.
     *            </p>
     *            <p>
     *            If you don't specify a value for the <code>TopicArn</code>
     *            parameter, you must specify a value for the
     *            <code>PhoneNumber</code> or <code>TargetArn</code> parameters.
     *            </p>
     * @param message <p>
     *            The message you want to send to the topic.
     *            </p>
     *            <p>
     *            If you want to send the same message to all transport
     *            protocols, include the text of the message as a String value.
     *            </p>
     *            <p>
     *            If you want to send different messages for each transport
     *            protocol, set the value of the <code>MessageStructure</code>
     *            parameter to <code>json</code> and use a JSON object for the
     *            <code>Message</code> parameter. See the Examples section for
     *            the format of the JSON object.
     *            </p>
     *            <p>
     *            Constraints: Messages must be UTF-8 encoded strings at most
     *            256 KB in size (262144 bytes, not 262144 characters).
     *            </p>
     *            <p>
     *            JSON-specific constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Keys in the JSON object that correspond to supported transport
     *            protocols must have simple JSON string values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The values will be parsed (unescaped) before they are used in
     *            outgoing messages.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Outbound notifications are JSON encoded (meaning that the
     *            characters will be reescaped for sending).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Values have a minimum length of 0 (the empty string, "", is
     *            allowed).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Values have a maximum length bounded by the overall message
     *            size (so, including multiple protocols may limit message
     *            sizes).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Non-string values will cause the key to be ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Keys that do not correspond to supported transport protocols
     *            are ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Duplicate keys are not allowed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Failure to parse or validate any key or value in the message
     *            will cause the <code>Publish</code> call to return an error
     *            (no partial delivery).
     *            </p>
     *            </li>
     *            </ul>
     * @param subject <p>
     *            Optional parameter to be used as the "Subject" line when the
     *            message is delivered to email endpoints. This field will also
     *            be included, if present, in the standard JSON messages
     *            delivered to other endpoints.
     *            </p>
     *            <p>
     *            Constraints: Subjects must be ASCII text that begins with a
     *            letter, number, or punctuation mark; must not include line
     *            breaks or control characters; and must be less than 100
     *            characters long.
     *            </p>
     */
    public PublishRequest(String topicArn, String message, String subject) {
        setTopicArn(topicArn);
        setMessage(message);
        setSubject(subject);
    }

    /**
     * <p>
     * The topic you want to publish to.
     * </p>
     * <p>
     * If you don't specify a value for the <code>TopicArn</code> parameter, you
     * must specify a value for the <code>PhoneNumber</code> or
     * <code>TargetArn</code> parameters.
     * </p>
     *
     * @return <p>
     *         The topic you want to publish to.
     *         </p>
     *         <p>
     *         If you don't specify a value for the <code>TopicArn</code>
     *         parameter, you must specify a value for the
     *         <code>PhoneNumber</code> or <code>TargetArn</code> parameters.
     *         </p>
     */
    public String getTopicArn() {
        return topicArn;
    }

    /**
     * <p>
     * The topic you want to publish to.
     * </p>
     * <p>
     * If you don't specify a value for the <code>TopicArn</code> parameter, you
     * must specify a value for the <code>PhoneNumber</code> or
     * <code>TargetArn</code> parameters.
     * </p>
     *
     * @param topicArn <p>
     *            The topic you want to publish to.
     *            </p>
     *            <p>
     *            If you don't specify a value for the <code>TopicArn</code>
     *            parameter, you must specify a value for the
     *            <code>PhoneNumber</code> or <code>TargetArn</code> parameters.
     *            </p>
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The topic you want to publish to.
     * </p>
     * <p>
     * If you don't specify a value for the <code>TopicArn</code> parameter, you
     * must specify a value for the <code>PhoneNumber</code> or
     * <code>TargetArn</code> parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topicArn <p>
     *            The topic you want to publish to.
     *            </p>
     *            <p>
     *            If you don't specify a value for the <code>TopicArn</code>
     *            parameter, you must specify a value for the
     *            <code>PhoneNumber</code> or <code>TargetArn</code> parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublishRequest withTopicArn(String topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    /**
     * <p>
     * Either TopicArn or EndpointArn, but not both.
     * </p>
     * <p>
     * If you don't specify a value for the <code>TargetArn</code> parameter,
     * you must specify a value for the <code>PhoneNumber</code> or
     * <code>TopicArn</code> parameters.
     * </p>
     *
     * @return <p>
     *         Either TopicArn or EndpointArn, but not both.
     *         </p>
     *         <p>
     *         If you don't specify a value for the <code>TargetArn</code>
     *         parameter, you must specify a value for the
     *         <code>PhoneNumber</code> or <code>TopicArn</code> parameters.
     *         </p>
     */
    public String getTargetArn() {
        return targetArn;
    }

    /**
     * <p>
     * Either TopicArn or EndpointArn, but not both.
     * </p>
     * <p>
     * If you don't specify a value for the <code>TargetArn</code> parameter,
     * you must specify a value for the <code>PhoneNumber</code> or
     * <code>TopicArn</code> parameters.
     * </p>
     *
     * @param targetArn <p>
     *            Either TopicArn or EndpointArn, but not both.
     *            </p>
     *            <p>
     *            If you don't specify a value for the <code>TargetArn</code>
     *            parameter, you must specify a value for the
     *            <code>PhoneNumber</code> or <code>TopicArn</code> parameters.
     *            </p>
     */
    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * Either TopicArn or EndpointArn, but not both.
     * </p>
     * <p>
     * If you don't specify a value for the <code>TargetArn</code> parameter,
     * you must specify a value for the <code>PhoneNumber</code> or
     * <code>TopicArn</code> parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetArn <p>
     *            Either TopicArn or EndpointArn, but not both.
     *            </p>
     *            <p>
     *            If you don't specify a value for the <code>TargetArn</code>
     *            parameter, you must specify a value for the
     *            <code>PhoneNumber</code> or <code>TopicArn</code> parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublishRequest withTargetArn(String targetArn) {
        this.targetArn = targetArn;
        return this;
    }

    /**
     * <p>
     * The phone number to which you want to deliver an SMS message. Use E.164
     * format.
     * </p>
     * <p>
     * If you don't specify a value for the <code>PhoneNumber</code> parameter,
     * you must specify a value for the <code>TargetArn</code> or
     * <code>TopicArn</code> parameters.
     * </p>
     *
     * @return <p>
     *         The phone number to which you want to deliver an SMS message. Use
     *         E.164 format.
     *         </p>
     *         <p>
     *         If you don't specify a value for the <code>PhoneNumber</code>
     *         parameter, you must specify a value for the
     *         <code>TargetArn</code> or <code>TopicArn</code> parameters.
     *         </p>
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * <p>
     * The phone number to which you want to deliver an SMS message. Use E.164
     * format.
     * </p>
     * <p>
     * If you don't specify a value for the <code>PhoneNumber</code> parameter,
     * you must specify a value for the <code>TargetArn</code> or
     * <code>TopicArn</code> parameters.
     * </p>
     *
     * @param phoneNumber <p>
     *            The phone number to which you want to deliver an SMS message.
     *            Use E.164 format.
     *            </p>
     *            <p>
     *            If you don't specify a value for the <code>PhoneNumber</code>
     *            parameter, you must specify a value for the
     *            <code>TargetArn</code> or <code>TopicArn</code> parameters.
     *            </p>
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number to which you want to deliver an SMS message. Use E.164
     * format.
     * </p>
     * <p>
     * If you don't specify a value for the <code>PhoneNumber</code> parameter,
     * you must specify a value for the <code>TargetArn</code> or
     * <code>TopicArn</code> parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumber <p>
     *            The phone number to which you want to deliver an SMS message.
     *            Use E.164 format.
     *            </p>
     *            <p>
     *            If you don't specify a value for the <code>PhoneNumber</code>
     *            parameter, you must specify a value for the
     *            <code>TargetArn</code> or <code>TopicArn</code> parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublishRequest withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * <p>
     * The message you want to send to the topic.
     * </p>
     * <p>
     * If you want to send the same message to all transport protocols, include
     * the text of the message as a String value.
     * </p>
     * <p>
     * If you want to send different messages for each transport protocol, set
     * the value of the <code>MessageStructure</code> parameter to
     * <code>json</code> and use a JSON object for the <code>Message</code>
     * parameter. See the Examples section for the format of the JSON object.
     * </p>
     * <p>
     * Constraints: Messages must be UTF-8 encoded strings at most 256 KB in
     * size (262144 bytes, not 262144 characters).
     * </p>
     * <p>
     * JSON-specific constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Keys in the JSON object that correspond to supported transport protocols
     * must have simple JSON string values.
     * </p>
     * </li>
     * <li>
     * <p>
     * The values will be parsed (unescaped) before they are used in outgoing
     * messages.
     * </p>
     * </li>
     * <li>
     * <p>
     * Outbound notifications are JSON encoded (meaning that the characters will
     * be reescaped for sending).
     * </p>
     * </li>
     * <li>
     * <p>
     * Values have a minimum length of 0 (the empty string, "", is allowed).
     * </p>
     * </li>
     * <li>
     * <p>
     * Values have a maximum length bounded by the overall message size (so,
     * including multiple protocols may limit message sizes).
     * </p>
     * </li>
     * <li>
     * <p>
     * Non-string values will cause the key to be ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys that do not correspond to supported transport protocols are ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * Duplicate keys are not allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failure to parse or validate any key or value in the message will cause
     * the <code>Publish</code> call to return an error (no partial delivery).
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The message you want to send to the topic.
     *         </p>
     *         <p>
     *         If you want to send the same message to all transport protocols,
     *         include the text of the message as a String value.
     *         </p>
     *         <p>
     *         If you want to send different messages for each transport
     *         protocol, set the value of the <code>MessageStructure</code>
     *         parameter to <code>json</code> and use a JSON object for the
     *         <code>Message</code> parameter. See the Examples section for the
     *         format of the JSON object.
     *         </p>
     *         <p>
     *         Constraints: Messages must be UTF-8 encoded strings at most 256
     *         KB in size (262144 bytes, not 262144 characters).
     *         </p>
     *         <p>
     *         JSON-specific constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Keys in the JSON object that correspond to supported transport
     *         protocols must have simple JSON string values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The values will be parsed (unescaped) before they are used in
     *         outgoing messages.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Outbound notifications are JSON encoded (meaning that the
     *         characters will be reescaped for sending).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Values have a minimum length of 0 (the empty string, "", is
     *         allowed).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Values have a maximum length bounded by the overall message size
     *         (so, including multiple protocols may limit message sizes).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Non-string values will cause the key to be ignored.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Keys that do not correspond to supported transport protocols are
     *         ignored.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Duplicate keys are not allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Failure to parse or validate any key or value in the message will
     *         cause the <code>Publish</code> call to return an error (no
     *         partial delivery).
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * The message you want to send to the topic.
     * </p>
     * <p>
     * If you want to send the same message to all transport protocols, include
     * the text of the message as a String value.
     * </p>
     * <p>
     * If you want to send different messages for each transport protocol, set
     * the value of the <code>MessageStructure</code> parameter to
     * <code>json</code> and use a JSON object for the <code>Message</code>
     * parameter. See the Examples section for the format of the JSON object.
     * </p>
     * <p>
     * Constraints: Messages must be UTF-8 encoded strings at most 256 KB in
     * size (262144 bytes, not 262144 characters).
     * </p>
     * <p>
     * JSON-specific constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Keys in the JSON object that correspond to supported transport protocols
     * must have simple JSON string values.
     * </p>
     * </li>
     * <li>
     * <p>
     * The values will be parsed (unescaped) before they are used in outgoing
     * messages.
     * </p>
     * </li>
     * <li>
     * <p>
     * Outbound notifications are JSON encoded (meaning that the characters will
     * be reescaped for sending).
     * </p>
     * </li>
     * <li>
     * <p>
     * Values have a minimum length of 0 (the empty string, "", is allowed).
     * </p>
     * </li>
     * <li>
     * <p>
     * Values have a maximum length bounded by the overall message size (so,
     * including multiple protocols may limit message sizes).
     * </p>
     * </li>
     * <li>
     * <p>
     * Non-string values will cause the key to be ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys that do not correspond to supported transport protocols are ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * Duplicate keys are not allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failure to parse or validate any key or value in the message will cause
     * the <code>Publish</code> call to return an error (no partial delivery).
     * </p>
     * </li>
     * </ul>
     *
     * @param message <p>
     *            The message you want to send to the topic.
     *            </p>
     *            <p>
     *            If you want to send the same message to all transport
     *            protocols, include the text of the message as a String value.
     *            </p>
     *            <p>
     *            If you want to send different messages for each transport
     *            protocol, set the value of the <code>MessageStructure</code>
     *            parameter to <code>json</code> and use a JSON object for the
     *            <code>Message</code> parameter. See the Examples section for
     *            the format of the JSON object.
     *            </p>
     *            <p>
     *            Constraints: Messages must be UTF-8 encoded strings at most
     *            256 KB in size (262144 bytes, not 262144 characters).
     *            </p>
     *            <p>
     *            JSON-specific constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Keys in the JSON object that correspond to supported transport
     *            protocols must have simple JSON string values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The values will be parsed (unescaped) before they are used in
     *            outgoing messages.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Outbound notifications are JSON encoded (meaning that the
     *            characters will be reescaped for sending).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Values have a minimum length of 0 (the empty string, "", is
     *            allowed).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Values have a maximum length bounded by the overall message
     *            size (so, including multiple protocols may limit message
     *            sizes).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Non-string values will cause the key to be ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Keys that do not correspond to supported transport protocols
     *            are ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Duplicate keys are not allowed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Failure to parse or validate any key or value in the message
     *            will cause the <code>Publish</code> call to return an error
     *            (no partial delivery).
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message you want to send to the topic.
     * </p>
     * <p>
     * If you want to send the same message to all transport protocols, include
     * the text of the message as a String value.
     * </p>
     * <p>
     * If you want to send different messages for each transport protocol, set
     * the value of the <code>MessageStructure</code> parameter to
     * <code>json</code> and use a JSON object for the <code>Message</code>
     * parameter. See the Examples section for the format of the JSON object.
     * </p>
     * <p>
     * Constraints: Messages must be UTF-8 encoded strings at most 256 KB in
     * size (262144 bytes, not 262144 characters).
     * </p>
     * <p>
     * JSON-specific constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Keys in the JSON object that correspond to supported transport protocols
     * must have simple JSON string values.
     * </p>
     * </li>
     * <li>
     * <p>
     * The values will be parsed (unescaped) before they are used in outgoing
     * messages.
     * </p>
     * </li>
     * <li>
     * <p>
     * Outbound notifications are JSON encoded (meaning that the characters will
     * be reescaped for sending).
     * </p>
     * </li>
     * <li>
     * <p>
     * Values have a minimum length of 0 (the empty string, "", is allowed).
     * </p>
     * </li>
     * <li>
     * <p>
     * Values have a maximum length bounded by the overall message size (so,
     * including multiple protocols may limit message sizes).
     * </p>
     * </li>
     * <li>
     * <p>
     * Non-string values will cause the key to be ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * Keys that do not correspond to supported transport protocols are ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * Duplicate keys are not allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failure to parse or validate any key or value in the message will cause
     * the <code>Publish</code> call to return an error (no partial delivery).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            The message you want to send to the topic.
     *            </p>
     *            <p>
     *            If you want to send the same message to all transport
     *            protocols, include the text of the message as a String value.
     *            </p>
     *            <p>
     *            If you want to send different messages for each transport
     *            protocol, set the value of the <code>MessageStructure</code>
     *            parameter to <code>json</code> and use a JSON object for the
     *            <code>Message</code> parameter. See the Examples section for
     *            the format of the JSON object.
     *            </p>
     *            <p>
     *            Constraints: Messages must be UTF-8 encoded strings at most
     *            256 KB in size (262144 bytes, not 262144 characters).
     *            </p>
     *            <p>
     *            JSON-specific constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Keys in the JSON object that correspond to supported transport
     *            protocols must have simple JSON string values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The values will be parsed (unescaped) before they are used in
     *            outgoing messages.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Outbound notifications are JSON encoded (meaning that the
     *            characters will be reescaped for sending).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Values have a minimum length of 0 (the empty string, "", is
     *            allowed).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Values have a maximum length bounded by the overall message
     *            size (so, including multiple protocols may limit message
     *            sizes).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Non-string values will cause the key to be ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Keys that do not correspond to supported transport protocols
     *            are ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Duplicate keys are not allowed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Failure to parse or validate any key or value in the message
     *            will cause the <code>Publish</code> call to return an error
     *            (no partial delivery).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublishRequest withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * Optional parameter to be used as the "Subject" line when the message is
     * delivered to email endpoints. This field will also be included, if
     * present, in the standard JSON messages delivered to other endpoints.
     * </p>
     * <p>
     * Constraints: Subjects must be ASCII text that begins with a letter,
     * number, or punctuation mark; must not include line breaks or control
     * characters; and must be less than 100 characters long.
     * </p>
     *
     * @return <p>
     *         Optional parameter to be used as the "Subject" line when the
     *         message is delivered to email endpoints. This field will also be
     *         included, if present, in the standard JSON messages delivered to
     *         other endpoints.
     *         </p>
     *         <p>
     *         Constraints: Subjects must be ASCII text that begins with a
     *         letter, number, or punctuation mark; must not include line breaks
     *         or control characters; and must be less than 100 characters long.
     *         </p>
     */
    public String getSubject() {
        return subject;
    }

    /**
     * <p>
     * Optional parameter to be used as the "Subject" line when the message is
     * delivered to email endpoints. This field will also be included, if
     * present, in the standard JSON messages delivered to other endpoints.
     * </p>
     * <p>
     * Constraints: Subjects must be ASCII text that begins with a letter,
     * number, or punctuation mark; must not include line breaks or control
     * characters; and must be less than 100 characters long.
     * </p>
     *
     * @param subject <p>
     *            Optional parameter to be used as the "Subject" line when the
     *            message is delivered to email endpoints. This field will also
     *            be included, if present, in the standard JSON messages
     *            delivered to other endpoints.
     *            </p>
     *            <p>
     *            Constraints: Subjects must be ASCII text that begins with a
     *            letter, number, or punctuation mark; must not include line
     *            breaks or control characters; and must be less than 100
     *            characters long.
     *            </p>
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * Optional parameter to be used as the "Subject" line when the message is
     * delivered to email endpoints. This field will also be included, if
     * present, in the standard JSON messages delivered to other endpoints.
     * </p>
     * <p>
     * Constraints: Subjects must be ASCII text that begins with a letter,
     * number, or punctuation mark; must not include line breaks or control
     * characters; and must be less than 100 characters long.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subject <p>
     *            Optional parameter to be used as the "Subject" line when the
     *            message is delivered to email endpoints. This field will also
     *            be included, if present, in the standard JSON messages
     *            delivered to other endpoints.
     *            </p>
     *            <p>
     *            Constraints: Subjects must be ASCII text that begins with a
     *            letter, number, or punctuation mark; must not include line
     *            breaks or control characters; and must be less than 100
     *            characters long.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublishRequest withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * <p>
     * Set <code>MessageStructure</code> to <code>json</code> if you want to
     * send a different message for each protocol. For example, using one
     * publish action, you can send a short message to your SMS subscribers and
     * a longer message to your email subscribers. If you set
     * <code>MessageStructure</code> to <code>json</code>, the value of the
     * <code>Message</code> parameter must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * be a syntactically valid JSON object; and
     * </p>
     * </li>
     * <li>
     * <p>
     * contain at least a top-level JSON key of "default" with a value that is a
     * string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can define other top-level keys that define the message you want to
     * send to a specific transport protocol (e.g., "http").
     * </p>
     * <p>
     * For information about sending different messages for each protocol using
     * the AWS Management Console, go to <a href=
     * "http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol"
     * >Create Different Messages for Each Protocol</a> in the <i>Amazon Simple
     * Notification Service Getting Started Guide</i>.
     * </p>
     * <p>
     * Valid value: <code>json</code>
     * </p>
     *
     * @return <p>
     *         Set <code>MessageStructure</code> to <code>json</code> if you
     *         want to send a different message for each protocol. For example,
     *         using one publish action, you can send a short message to your
     *         SMS subscribers and a longer message to your email subscribers.
     *         If you set <code>MessageStructure</code> to <code>json</code>,
     *         the value of the <code>Message</code> parameter must:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         be a syntactically valid JSON object; and
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         contain at least a top-level JSON key of "default" with a value
     *         that is a string.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can define other top-level keys that define the message you
     *         want to send to a specific transport protocol (e.g., "http").
     *         </p>
     *         <p>
     *         For information about sending different messages for each
     *         protocol using the AWS Management Console, go to <a href=
     *         "http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol"
     *         >Create Different Messages for Each Protocol</a> in the <i>Amazon
     *         Simple Notification Service Getting Started Guide</i>.
     *         </p>
     *         <p>
     *         Valid value: <code>json</code>
     *         </p>
     */
    public String getMessageStructure() {
        return messageStructure;
    }

    /**
     * <p>
     * Set <code>MessageStructure</code> to <code>json</code> if you want to
     * send a different message for each protocol. For example, using one
     * publish action, you can send a short message to your SMS subscribers and
     * a longer message to your email subscribers. If you set
     * <code>MessageStructure</code> to <code>json</code>, the value of the
     * <code>Message</code> parameter must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * be a syntactically valid JSON object; and
     * </p>
     * </li>
     * <li>
     * <p>
     * contain at least a top-level JSON key of "default" with a value that is a
     * string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can define other top-level keys that define the message you want to
     * send to a specific transport protocol (e.g., "http").
     * </p>
     * <p>
     * For information about sending different messages for each protocol using
     * the AWS Management Console, go to <a href=
     * "http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol"
     * >Create Different Messages for Each Protocol</a> in the <i>Amazon Simple
     * Notification Service Getting Started Guide</i>.
     * </p>
     * <p>
     * Valid value: <code>json</code>
     * </p>
     *
     * @param messageStructure <p>
     *            Set <code>MessageStructure</code> to <code>json</code> if you
     *            want to send a different message for each protocol. For
     *            example, using one publish action, you can send a short
     *            message to your SMS subscribers and a longer message to your
     *            email subscribers. If you set <code>MessageStructure</code> to
     *            <code>json</code>, the value of the <code>Message</code>
     *            parameter must:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            be a syntactically valid JSON object; and
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            contain at least a top-level JSON key of "default" with a
     *            value that is a string.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You can define other top-level keys that define the message
     *            you want to send to a specific transport protocol (e.g.,
     *            "http").
     *            </p>
     *            <p>
     *            For information about sending different messages for each
     *            protocol using the AWS Management Console, go to <a href=
     *            "http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol"
     *            >Create Different Messages for Each Protocol</a> in the
     *            <i>Amazon Simple Notification Service Getting Started
     *            Guide</i>.
     *            </p>
     *            <p>
     *            Valid value: <code>json</code>
     *            </p>
     */
    public void setMessageStructure(String messageStructure) {
        this.messageStructure = messageStructure;
    }

    /**
     * <p>
     * Set <code>MessageStructure</code> to <code>json</code> if you want to
     * send a different message for each protocol. For example, using one
     * publish action, you can send a short message to your SMS subscribers and
     * a longer message to your email subscribers. If you set
     * <code>MessageStructure</code> to <code>json</code>, the value of the
     * <code>Message</code> parameter must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * be a syntactically valid JSON object; and
     * </p>
     * </li>
     * <li>
     * <p>
     * contain at least a top-level JSON key of "default" with a value that is a
     * string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can define other top-level keys that define the message you want to
     * send to a specific transport protocol (e.g., "http").
     * </p>
     * <p>
     * For information about sending different messages for each protocol using
     * the AWS Management Console, go to <a href=
     * "http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol"
     * >Create Different Messages for Each Protocol</a> in the <i>Amazon Simple
     * Notification Service Getting Started Guide</i>.
     * </p>
     * <p>
     * Valid value: <code>json</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageStructure <p>
     *            Set <code>MessageStructure</code> to <code>json</code> if you
     *            want to send a different message for each protocol. For
     *            example, using one publish action, you can send a short
     *            message to your SMS subscribers and a longer message to your
     *            email subscribers. If you set <code>MessageStructure</code> to
     *            <code>json</code>, the value of the <code>Message</code>
     *            parameter must:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            be a syntactically valid JSON object; and
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            contain at least a top-level JSON key of "default" with a
     *            value that is a string.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You can define other top-level keys that define the message
     *            you want to send to a specific transport protocol (e.g.,
     *            "http").
     *            </p>
     *            <p>
     *            For information about sending different messages for each
     *            protocol using the AWS Management Console, go to <a href=
     *            "http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol"
     *            >Create Different Messages for Each Protocol</a> in the
     *            <i>Amazon Simple Notification Service Getting Started
     *            Guide</i>.
     *            </p>
     *            <p>
     *            Valid value: <code>json</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublishRequest withMessageStructure(String messageStructure) {
        this.messageStructure = messageStructure;
        return this;
    }

    /**
     * <p>
     * Message attributes for Publish action.
     * </p>
     *
     * @return <p>
     *         Message attributes for Publish action.
     *         </p>
     */
    public java.util.Map<String, MessageAttributeValue> getMessageAttributes() {
        return messageAttributes;
    }

    /**
     * <p>
     * Message attributes for Publish action.
     * </p>
     *
     * @param messageAttributes <p>
     *            Message attributes for Publish action.
     *            </p>
     */
    public void setMessageAttributes(java.util.Map<String, MessageAttributeValue> messageAttributes) {
        this.messageAttributes = messageAttributes;
    }

    /**
     * <p>
     * Message attributes for Publish action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageAttributes <p>
     *            Message attributes for Publish action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublishRequest withMessageAttributes(
            java.util.Map<String, MessageAttributeValue> messageAttributes) {
        this.messageAttributes = messageAttributes;
        return this;
    }

    /**
     * <p>
     * Message attributes for Publish action.
     * </p>
     * <p>
     * The method adds a new key-value pair into MessageAttributes parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into MessageAttributes.
     * @param value The corresponding value of the entry to be added into
     *            MessageAttributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublishRequest addMessageAttributesEntry(String key, MessageAttributeValue value) {
        if (null == this.messageAttributes) {
            this.messageAttributes = new java.util.HashMap<String, MessageAttributeValue>();
        }
        if (this.messageAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.messageAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MessageAttributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public PublishRequest clearMessageAttributesEntries() {
        this.messageAttributes = null;
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
        if (getTargetArn() != null)
            sb.append("TargetArn: " + getTargetArn() + ",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: " + getPhoneNumber() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getSubject() != null)
            sb.append("Subject: " + getSubject() + ",");
        if (getMessageStructure() != null)
            sb.append("MessageStructure: " + getMessageStructure() + ",");
        if (getMessageAttributes() != null)
            sb.append("MessageAttributes: " + getMessageAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode
                + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode
                + ((getMessageStructure() == null) ? 0 : getMessageStructure().hashCode());
        hashCode = prime * hashCode
                + ((getMessageAttributes() == null) ? 0 : getMessageAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublishRequest == false)
            return false;
        PublishRequest other = (PublishRequest) obj;

        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null
                && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null
                && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getMessageStructure() == null ^ this.getMessageStructure() == null)
            return false;
        if (other.getMessageStructure() != null
                && other.getMessageStructure().equals(this.getMessageStructure()) == false)
            return false;
        if (other.getMessageAttributes() == null ^ this.getMessageAttributes() == null)
            return false;
        if (other.getMessageAttributes() != null
                && other.getMessageAttributes().equals(this.getMessageAttributes()) == false)
            return false;
        return true;
    }
}
