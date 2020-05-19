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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

/**
 * <p>
 * The configuration that allows a bot to receive outgoing events. Can be either
 * an HTTPS endpoint or a Lambda function ARN.
 * </p>
 */
public class EventsConfiguration implements Serializable {
    /**
     * <p>
     * The bot ID.
     * </p>
     */
    private String botId;

    /**
     * <p>
     * HTTPS endpoint that allows a bot to receive outgoing events.
     * </p>
     */
    private String outboundEventsHTTPSEndpoint;

    /**
     * <p>
     * Lambda function ARN that allows a bot to receive outgoing events.
     * </p>
     */
    private String lambdaFunctionArn;

    /**
     * <p>
     * The bot ID.
     * </p>
     *
     * @return <p>
     *         The bot ID.
     *         </p>
     */
    public String getBotId() {
        return botId;
    }

    /**
     * <p>
     * The bot ID.
     * </p>
     *
     * @param botId <p>
     *            The bot ID.
     *            </p>
     */
    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The bot ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param botId <p>
     *            The bot ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventsConfiguration withBotId(String botId) {
        this.botId = botId;
        return this;
    }

    /**
     * <p>
     * HTTPS endpoint that allows a bot to receive outgoing events.
     * </p>
     *
     * @return <p>
     *         HTTPS endpoint that allows a bot to receive outgoing events.
     *         </p>
     */
    public String getOutboundEventsHTTPSEndpoint() {
        return outboundEventsHTTPSEndpoint;
    }

    /**
     * <p>
     * HTTPS endpoint that allows a bot to receive outgoing events.
     * </p>
     *
     * @param outboundEventsHTTPSEndpoint <p>
     *            HTTPS endpoint that allows a bot to receive outgoing events.
     *            </p>
     */
    public void setOutboundEventsHTTPSEndpoint(String outboundEventsHTTPSEndpoint) {
        this.outboundEventsHTTPSEndpoint = outboundEventsHTTPSEndpoint;
    }

    /**
     * <p>
     * HTTPS endpoint that allows a bot to receive outgoing events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outboundEventsHTTPSEndpoint <p>
     *            HTTPS endpoint that allows a bot to receive outgoing events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventsConfiguration withOutboundEventsHTTPSEndpoint(String outboundEventsHTTPSEndpoint) {
        this.outboundEventsHTTPSEndpoint = outboundEventsHTTPSEndpoint;
        return this;
    }

    /**
     * <p>
     * Lambda function ARN that allows a bot to receive outgoing events.
     * </p>
     *
     * @return <p>
     *         Lambda function ARN that allows a bot to receive outgoing events.
     *         </p>
     */
    public String getLambdaFunctionArn() {
        return lambdaFunctionArn;
    }

    /**
     * <p>
     * Lambda function ARN that allows a bot to receive outgoing events.
     * </p>
     *
     * @param lambdaFunctionArn <p>
     *            Lambda function ARN that allows a bot to receive outgoing
     *            events.
     *            </p>
     */
    public void setLambdaFunctionArn(String lambdaFunctionArn) {
        this.lambdaFunctionArn = lambdaFunctionArn;
    }

    /**
     * <p>
     * Lambda function ARN that allows a bot to receive outgoing events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lambdaFunctionArn <p>
     *            Lambda function ARN that allows a bot to receive outgoing
     *            events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventsConfiguration withLambdaFunctionArn(String lambdaFunctionArn) {
        this.lambdaFunctionArn = lambdaFunctionArn;
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
        if (getBotId() != null)
            sb.append("BotId: " + getBotId() + ",");
        if (getOutboundEventsHTTPSEndpoint() != null)
            sb.append("OutboundEventsHTTPSEndpoint: " + getOutboundEventsHTTPSEndpoint() + ",");
        if (getLambdaFunctionArn() != null)
            sb.append("LambdaFunctionArn: " + getLambdaFunctionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime
                * hashCode
                + ((getOutboundEventsHTTPSEndpoint() == null) ? 0
                        : getOutboundEventsHTTPSEndpoint().hashCode());
        hashCode = prime * hashCode
                + ((getLambdaFunctionArn() == null) ? 0 : getLambdaFunctionArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventsConfiguration == false)
            return false;
        EventsConfiguration other = (EventsConfiguration) obj;

        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getOutboundEventsHTTPSEndpoint() == null
                ^ this.getOutboundEventsHTTPSEndpoint() == null)
            return false;
        if (other.getOutboundEventsHTTPSEndpoint() != null
                && other.getOutboundEventsHTTPSEndpoint().equals(
                        this.getOutboundEventsHTTPSEndpoint()) == false)
            return false;
        if (other.getLambdaFunctionArn() == null ^ this.getLambdaFunctionArn() == null)
            return false;
        if (other.getLambdaFunctionArn() != null
                && other.getLambdaFunctionArn().equals(this.getLambdaFunctionArn()) == false)
            return false;
        return true;
    }
}
