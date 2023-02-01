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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies MQTT Version 5.0 headers information. For more information, see <a
 * href="https://docs.aws.amazon.com/iot/latest/developerguide/mqtt.html">
 * MQTT</a> from Amazon Web Services IoT Core Developer Guide.
 * </p>
 */
public class MqttHeaders implements Serializable {
    /**
     * <p>
     * An <code>Enum</code> string value that indicates whether the payload is
     * formatted as UTF-8.
     * </p>
     * <p>
     * Valid values are <code>UNSPECIFIED_BYTES</code> and
     * <code>UTF8_DATA</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901111"
     * > Payload Format Indicator</a> from the MQTT Version 5.0 specification.
     * </p>
     * <p>
     * Supports <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     * >substitution templates</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String payloadFormatIndicator;

    /**
     * <p>
     * A UTF-8 encoded string that describes the content of the publishing
     * message.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901118"
     * > Content Type</a> from the MQTT Version 5.0 specification.
     * </p>
     * <p>
     * Supports <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     * >substitution templates</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String contentType;

    /**
     * <p>
     * A UTF-8 encoded string that's used as the topic name for a response
     * message. The response topic is used to describe the topic which the
     * receiver should publish to as part of the request-response flow. The
     * topic must not contain wildcard characters.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901114"
     * > Response Topic</a> from the MQTT Version 5.0 specification.
     * </p>
     * <p>
     * Supports <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     * >substitution templates</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String responseTopic;

    /**
     * <p>
     * The base64-encoded binary data used by the sender of the request message
     * to identify which request the response message is for when it's received.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901115"
     * > Correlation Data</a> from the MQTT Version 5.0 specification.
     * </p>
     * <note>
     * <p>
     * This binary data must be based64-encoded.
     * </p>
     * </note>
     * <p>
     * Supports <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     * >substitution templates</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String correlationData;

    /**
     * <p>
     * A user-defined integer value that will persist a message at the message
     * broker for a specified amount of time to ensure that the message will
     * expire if it's no longer relevant to the subscriber. The value of
     * <code>messageExpiry</code> represents the number of seconds before it
     * expires. For more information about the limits of
     * <code>messageExpiry</code>, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/mqtt.html"
     * >Amazon Web Services IoT Core message broker and protocol limits and
     * quotas </a> from the Amazon Web Services Reference Guide.
     * </p>
     * <p>
     * Supports <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     * >substitution templates</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String messageExpiry;

    /**
     * <p>
     * An array of key-value pairs that you define in the MQTT5 header.
     * </p>
     */
    private java.util.List<UserProperty> userProperties;

    /**
     * <p>
     * An <code>Enum</code> string value that indicates whether the payload is
     * formatted as UTF-8.
     * </p>
     * <p>
     * Valid values are <code>UNSPECIFIED_BYTES</code> and
     * <code>UTF8_DATA</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901111"
     * > Payload Format Indicator</a> from the MQTT Version 5.0 specification.
     * </p>
     * <p>
     * Supports <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     * >substitution templates</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         An <code>Enum</code> string value that indicates whether the
     *         payload is formatted as UTF-8.
     *         </p>
     *         <p>
     *         Valid values are <code>UNSPECIFIED_BYTES</code> and
     *         <code>UTF8_DATA</code>.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901111"
     *         > Payload Format Indicator</a> from the MQTT Version 5.0
     *         specification.
     *         </p>
     *         <p>
     *         Supports <a href=
     *         "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     *         >substitution templates</a>.
     *         </p>
     */
    public String getPayloadFormatIndicator() {
        return payloadFormatIndicator;
    }

    /**
     * <p>
     * An <code>Enum</code> string value that indicates whether the payload is
     * formatted as UTF-8.
     * </p>
     * <p>
     * Valid values are <code>UNSPECIFIED_BYTES</code> and
     * <code>UTF8_DATA</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901111"
     * > Payload Format Indicator</a> from the MQTT Version 5.0 specification.
     * </p>
     * <p>
     * Supports <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     * >substitution templates</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param payloadFormatIndicator <p>
     *            An <code>Enum</code> string value that indicates whether the
     *            payload is formatted as UTF-8.
     *            </p>
     *            <p>
     *            Valid values are <code>UNSPECIFIED_BYTES</code> and
     *            <code>UTF8_DATA</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901111"
     *            > Payload Format Indicator</a> from the MQTT Version 5.0
     *            specification.
     *            </p>
     *            <p>
     *            Supports <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     *            >substitution templates</a>.
     *            </p>
     */
    public void setPayloadFormatIndicator(String payloadFormatIndicator) {
        this.payloadFormatIndicator = payloadFormatIndicator;
    }

    /**
     * <p>
     * An <code>Enum</code> string value that indicates whether the payload is
     * formatted as UTF-8.
     * </p>
     * <p>
     * Valid values are <code>UNSPECIFIED_BYTES</code> and
     * <code>UTF8_DATA</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901111"
     * > Payload Format Indicator</a> from the MQTT Version 5.0 specification.
     * </p>
     * <p>
     * Supports <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     * >substitution templates</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param payloadFormatIndicator <p>
     *            An <code>Enum</code> string value that indicates whether the
     *            payload is formatted as UTF-8.
     *            </p>
     *            <p>
     *            Valid values are <code>UNSPECIFIED_BYTES</code> and
     *            <code>UTF8_DATA</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901111"
     *            > Payload Format Indicator</a> from the MQTT Version 5.0
     *            specification.
     *            </p>
     *            <p>
     *            Supports <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     *            >substitution templates</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MqttHeaders withPayloadFormatIndicator(String payloadFormatIndicator) {
        this.payloadFormatIndicator = payloadFormatIndicator;
        return this;
    }

    /**
     * <p>
     * A UTF-8 encoded string that describes the content of the publishing
     * message.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901118"
     * > Content Type</a> from the MQTT Version 5.0 specification.
     * </p>
     * <p>
     * Supports <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     * >substitution templates</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         A UTF-8 encoded string that describes the content of the
     *         publishing message.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901118"
     *         > Content Type</a> from the MQTT Version 5.0 specification.
     *         </p>
     *         <p>
     *         Supports <a href=
     *         "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     *         >substitution templates</a>.
     *         </p>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * A UTF-8 encoded string that describes the content of the publishing
     * message.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901118"
     * > Content Type</a> from the MQTT Version 5.0 specification.
     * </p>
     * <p>
     * Supports <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     * >substitution templates</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param contentType <p>
     *            A UTF-8 encoded string that describes the content of the
     *            publishing message.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901118"
     *            > Content Type</a> from the MQTT Version 5.0 specification.
     *            </p>
     *            <p>
     *            Supports <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     *            >substitution templates</a>.
     *            </p>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * A UTF-8 encoded string that describes the content of the publishing
     * message.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901118"
     * > Content Type</a> from the MQTT Version 5.0 specification.
     * </p>
     * <p>
     * Supports <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     * >substitution templates</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param contentType <p>
     *            A UTF-8 encoded string that describes the content of the
     *            publishing message.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901118"
     *            > Content Type</a> from the MQTT Version 5.0 specification.
     *            </p>
     *            <p>
     *            Supports <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     *            >substitution templates</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MqttHeaders withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * A UTF-8 encoded string that's used as the topic name for a response
     * message. The response topic is used to describe the topic which the
     * receiver should publish to as part of the request-response flow. The
     * topic must not contain wildcard characters.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901114"
     * > Response Topic</a> from the MQTT Version 5.0 specification.
     * </p>
     * <p>
     * Supports <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     * >substitution templates</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         A UTF-8 encoded string that's used as the topic name for a
     *         response message. The response topic is used to describe the
     *         topic which the receiver should publish to as part of the
     *         request-response flow. The topic must not contain wildcard
     *         characters.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901114"
     *         > Response Topic</a> from the MQTT Version 5.0 specification.
     *         </p>
     *         <p>
     *         Supports <a href=
     *         "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     *         >substitution templates</a>.
     *         </p>
     */
    public String getResponseTopic() {
        return responseTopic;
    }

    /**
     * <p>
     * A UTF-8 encoded string that's used as the topic name for a response
     * message. The response topic is used to describe the topic which the
     * receiver should publish to as part of the request-response flow. The
     * topic must not contain wildcard characters.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901114"
     * > Response Topic</a> from the MQTT Version 5.0 specification.
     * </p>
     * <p>
     * Supports <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     * >substitution templates</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param responseTopic <p>
     *            A UTF-8 encoded string that's used as the topic name for a
     *            response message. The response topic is used to describe the
     *            topic which the receiver should publish to as part of the
     *            request-response flow. The topic must not contain wildcard
     *            characters.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901114"
     *            > Response Topic</a> from the MQTT Version 5.0 specification.
     *            </p>
     *            <p>
     *            Supports <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     *            >substitution templates</a>.
     *            </p>
     */
    public void setResponseTopic(String responseTopic) {
        this.responseTopic = responseTopic;
    }

    /**
     * <p>
     * A UTF-8 encoded string that's used as the topic name for a response
     * message. The response topic is used to describe the topic which the
     * receiver should publish to as part of the request-response flow. The
     * topic must not contain wildcard characters.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901114"
     * > Response Topic</a> from the MQTT Version 5.0 specification.
     * </p>
     * <p>
     * Supports <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     * >substitution templates</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param responseTopic <p>
     *            A UTF-8 encoded string that's used as the topic name for a
     *            response message. The response topic is used to describe the
     *            topic which the receiver should publish to as part of the
     *            request-response flow. The topic must not contain wildcard
     *            characters.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901114"
     *            > Response Topic</a> from the MQTT Version 5.0 specification.
     *            </p>
     *            <p>
     *            Supports <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     *            >substitution templates</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MqttHeaders withResponseTopic(String responseTopic) {
        this.responseTopic = responseTopic;
        return this;
    }

    /**
     * <p>
     * The base64-encoded binary data used by the sender of the request message
     * to identify which request the response message is for when it's received.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901115"
     * > Correlation Data</a> from the MQTT Version 5.0 specification.
     * </p>
     * <note>
     * <p>
     * This binary data must be based64-encoded.
     * </p>
     * </note>
     * <p>
     * Supports <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     * >substitution templates</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         The base64-encoded binary data used by the sender of the request
     *         message to identify which request the response message is for
     *         when it's received.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901115"
     *         > Correlation Data</a> from the MQTT Version 5.0 specification.
     *         </p>
     *         <note>
     *         <p>
     *         This binary data must be based64-encoded.
     *         </p>
     *         </note>
     *         <p>
     *         Supports <a href=
     *         "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     *         >substitution templates</a>.
     *         </p>
     */
    public String getCorrelationData() {
        return correlationData;
    }

    /**
     * <p>
     * The base64-encoded binary data used by the sender of the request message
     * to identify which request the response message is for when it's received.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901115"
     * > Correlation Data</a> from the MQTT Version 5.0 specification.
     * </p>
     * <note>
     * <p>
     * This binary data must be based64-encoded.
     * </p>
     * </note>
     * <p>
     * Supports <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     * >substitution templates</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param correlationData <p>
     *            The base64-encoded binary data used by the sender of the
     *            request message to identify which request the response message
     *            is for when it's received.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901115"
     *            > Correlation Data</a> from the MQTT Version 5.0
     *            specification.
     *            </p>
     *            <note>
     *            <p>
     *            This binary data must be based64-encoded.
     *            </p>
     *            </note>
     *            <p>
     *            Supports <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     *            >substitution templates</a>.
     *            </p>
     */
    public void setCorrelationData(String correlationData) {
        this.correlationData = correlationData;
    }

    /**
     * <p>
     * The base64-encoded binary data used by the sender of the request message
     * to identify which request the response message is for when it's received.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901115"
     * > Correlation Data</a> from the MQTT Version 5.0 specification.
     * </p>
     * <note>
     * <p>
     * This binary data must be based64-encoded.
     * </p>
     * </note>
     * <p>
     * Supports <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     * >substitution templates</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param correlationData <p>
     *            The base64-encoded binary data used by the sender of the
     *            request message to identify which request the response message
     *            is for when it's received.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901115"
     *            > Correlation Data</a> from the MQTT Version 5.0
     *            specification.
     *            </p>
     *            <note>
     *            <p>
     *            This binary data must be based64-encoded.
     *            </p>
     *            </note>
     *            <p>
     *            Supports <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     *            >substitution templates</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MqttHeaders withCorrelationData(String correlationData) {
        this.correlationData = correlationData;
        return this;
    }

    /**
     * <p>
     * A user-defined integer value that will persist a message at the message
     * broker for a specified amount of time to ensure that the message will
     * expire if it's no longer relevant to the subscriber. The value of
     * <code>messageExpiry</code> represents the number of seconds before it
     * expires. For more information about the limits of
     * <code>messageExpiry</code>, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/mqtt.html"
     * >Amazon Web Services IoT Core message broker and protocol limits and
     * quotas </a> from the Amazon Web Services Reference Guide.
     * </p>
     * <p>
     * Supports <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     * >substitution templates</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         A user-defined integer value that will persist a message at the
     *         message broker for a specified amount of time to ensure that the
     *         message will expire if it's no longer relevant to the subscriber.
     *         The value of <code>messageExpiry</code> represents the number of
     *         seconds before it expires. For more information about the limits
     *         of <code>messageExpiry</code>, see <a
     *         href="https://docs.aws.amazon.com/iot/latest/developerguide/mqtt.html"
     *         >Amazon Web Services IoT Core message broker and protocol limits
     *         and quotas </a> from the Amazon Web Services Reference Guide.
     *         </p>
     *         <p>
     *         Supports <a href=
     *         "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     *         >substitution templates</a>.
     *         </p>
     */
    public String getMessageExpiry() {
        return messageExpiry;
    }

    /**
     * <p>
     * A user-defined integer value that will persist a message at the message
     * broker for a specified amount of time to ensure that the message will
     * expire if it's no longer relevant to the subscriber. The value of
     * <code>messageExpiry</code> represents the number of seconds before it
     * expires. For more information about the limits of
     * <code>messageExpiry</code>, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/mqtt.html"
     * >Amazon Web Services IoT Core message broker and protocol limits and
     * quotas </a> from the Amazon Web Services Reference Guide.
     * </p>
     * <p>
     * Supports <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     * >substitution templates</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param messageExpiry <p>
     *            A user-defined integer value that will persist a message at
     *            the message broker for a specified amount of time to ensure
     *            that the message will expire if it's no longer relevant to the
     *            subscriber. The value of <code>messageExpiry</code> represents
     *            the number of seconds before it expires. For more information
     *            about the limits of <code>messageExpiry</code>, see <a
     *            href="https://docs.aws.amazon.com/iot/latest/developerguide/mqtt.html"
     *            >Amazon Web Services IoT Core message broker and protocol
     *            limits and quotas </a> from the Amazon Web Services Reference
     *            Guide.
     *            </p>
     *            <p>
     *            Supports <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     *            >substitution templates</a>.
     *            </p>
     */
    public void setMessageExpiry(String messageExpiry) {
        this.messageExpiry = messageExpiry;
    }

    /**
     * <p>
     * A user-defined integer value that will persist a message at the message
     * broker for a specified amount of time to ensure that the message will
     * expire if it's no longer relevant to the subscriber. The value of
     * <code>messageExpiry</code> represents the number of seconds before it
     * expires. For more information about the limits of
     * <code>messageExpiry</code>, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/mqtt.html"
     * >Amazon Web Services IoT Core message broker and protocol limits and
     * quotas </a> from the Amazon Web Services Reference Guide.
     * </p>
     * <p>
     * Supports <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     * >substitution templates</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param messageExpiry <p>
     *            A user-defined integer value that will persist a message at
     *            the message broker for a specified amount of time to ensure
     *            that the message will expire if it's no longer relevant to the
     *            subscriber. The value of <code>messageExpiry</code> represents
     *            the number of seconds before it expires. For more information
     *            about the limits of <code>messageExpiry</code>, see <a
     *            href="https://docs.aws.amazon.com/iot/latest/developerguide/mqtt.html"
     *            >Amazon Web Services IoT Core message broker and protocol
     *            limits and quotas </a> from the Amazon Web Services Reference
     *            Guide.
     *            </p>
     *            <p>
     *            Supports <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/iot-substitution-templates.html"
     *            >substitution templates</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MqttHeaders withMessageExpiry(String messageExpiry) {
        this.messageExpiry = messageExpiry;
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs that you define in the MQTT5 header.
     * </p>
     *
     * @return <p>
     *         An array of key-value pairs that you define in the MQTT5 header.
     *         </p>
     */
    public java.util.List<UserProperty> getUserProperties() {
        return userProperties;
    }

    /**
     * <p>
     * An array of key-value pairs that you define in the MQTT5 header.
     * </p>
     *
     * @param userProperties <p>
     *            An array of key-value pairs that you define in the MQTT5
     *            header.
     *            </p>
     */
    public void setUserProperties(java.util.Collection<UserProperty> userProperties) {
        if (userProperties == null) {
            this.userProperties = null;
            return;
        }

        this.userProperties = new java.util.ArrayList<UserProperty>(userProperties);
    }

    /**
     * <p>
     * An array of key-value pairs that you define in the MQTT5 header.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userProperties <p>
     *            An array of key-value pairs that you define in the MQTT5
     *            header.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MqttHeaders withUserProperties(UserProperty... userProperties) {
        if (getUserProperties() == null) {
            this.userProperties = new java.util.ArrayList<UserProperty>(userProperties.length);
        }
        for (UserProperty value : userProperties) {
            this.userProperties.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs that you define in the MQTT5 header.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userProperties <p>
     *            An array of key-value pairs that you define in the MQTT5
     *            header.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MqttHeaders withUserProperties(java.util.Collection<UserProperty> userProperties) {
        setUserProperties(userProperties);
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
        if (getPayloadFormatIndicator() != null)
            sb.append("payloadFormatIndicator: " + getPayloadFormatIndicator() + ",");
        if (getContentType() != null)
            sb.append("contentType: " + getContentType() + ",");
        if (getResponseTopic() != null)
            sb.append("responseTopic: " + getResponseTopic() + ",");
        if (getCorrelationData() != null)
            sb.append("correlationData: " + getCorrelationData() + ",");
        if (getMessageExpiry() != null)
            sb.append("messageExpiry: " + getMessageExpiry() + ",");
        if (getUserProperties() != null)
            sb.append("userProperties: " + getUserProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPayloadFormatIndicator() == null) ? 0 : getPayloadFormatIndicator()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode
                + ((getResponseTopic() == null) ? 0 : getResponseTopic().hashCode());
        hashCode = prime * hashCode
                + ((getCorrelationData() == null) ? 0 : getCorrelationData().hashCode());
        hashCode = prime * hashCode
                + ((getMessageExpiry() == null) ? 0 : getMessageExpiry().hashCode());
        hashCode = prime * hashCode
                + ((getUserProperties() == null) ? 0 : getUserProperties().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MqttHeaders == false)
            return false;
        MqttHeaders other = (MqttHeaders) obj;

        if (other.getPayloadFormatIndicator() == null ^ this.getPayloadFormatIndicator() == null)
            return false;
        if (other.getPayloadFormatIndicator() != null
                && other.getPayloadFormatIndicator().equals(this.getPayloadFormatIndicator()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getResponseTopic() == null ^ this.getResponseTopic() == null)
            return false;
        if (other.getResponseTopic() != null
                && other.getResponseTopic().equals(this.getResponseTopic()) == false)
            return false;
        if (other.getCorrelationData() == null ^ this.getCorrelationData() == null)
            return false;
        if (other.getCorrelationData() != null
                && other.getCorrelationData().equals(this.getCorrelationData()) == false)
            return false;
        if (other.getMessageExpiry() == null ^ this.getMessageExpiry() == null)
            return false;
        if (other.getMessageExpiry() != null
                && other.getMessageExpiry().equals(this.getMessageExpiry()) == false)
            return false;
        if (other.getUserProperties() == null ^ this.getUserProperties() == null)
            return false;
        if (other.getUserProperties() != null
                && other.getUserProperties().equals(this.getUserProperties()) == false)
            return false;
        return true;
    }
}
