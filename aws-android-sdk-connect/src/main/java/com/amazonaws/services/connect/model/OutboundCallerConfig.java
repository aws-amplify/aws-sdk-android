/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * The outbound caller ID name, number, and outbound whisper flow.
 * </p>
 */
public class OutboundCallerConfig implements Serializable {
    /**
     * <p>
     * The caller ID name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String outboundCallerIdName;

    /**
     * <p>
     * The caller ID number.
     * </p>
     */
    private String outboundCallerIdNumberId;

    /**
     * <p>
     * The outbound whisper flow to be used during an outbound call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String outboundFlowId;

    /**
     * <p>
     * The caller ID name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The caller ID name.
     *         </p>
     */
    public String getOutboundCallerIdName() {
        return outboundCallerIdName;
    }

    /**
     * <p>
     * The caller ID name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param outboundCallerIdName <p>
     *            The caller ID name.
     *            </p>
     */
    public void setOutboundCallerIdName(String outboundCallerIdName) {
        this.outboundCallerIdName = outboundCallerIdName;
    }

    /**
     * <p>
     * The caller ID name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param outboundCallerIdName <p>
     *            The caller ID name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutboundCallerConfig withOutboundCallerIdName(String outboundCallerIdName) {
        this.outboundCallerIdName = outboundCallerIdName;
        return this;
    }

    /**
     * <p>
     * The caller ID number.
     * </p>
     *
     * @return <p>
     *         The caller ID number.
     *         </p>
     */
    public String getOutboundCallerIdNumberId() {
        return outboundCallerIdNumberId;
    }

    /**
     * <p>
     * The caller ID number.
     * </p>
     *
     * @param outboundCallerIdNumberId <p>
     *            The caller ID number.
     *            </p>
     */
    public void setOutboundCallerIdNumberId(String outboundCallerIdNumberId) {
        this.outboundCallerIdNumberId = outboundCallerIdNumberId;
    }

    /**
     * <p>
     * The caller ID number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outboundCallerIdNumberId <p>
     *            The caller ID number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutboundCallerConfig withOutboundCallerIdNumberId(String outboundCallerIdNumberId) {
        this.outboundCallerIdNumberId = outboundCallerIdNumberId;
        return this;
    }

    /**
     * <p>
     * The outbound whisper flow to be used during an outbound call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         The outbound whisper flow to be used during an outbound call.
     *         </p>
     */
    public String getOutboundFlowId() {
        return outboundFlowId;
    }

    /**
     * <p>
     * The outbound whisper flow to be used during an outbound call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param outboundFlowId <p>
     *            The outbound whisper flow to be used during an outbound call.
     *            </p>
     */
    public void setOutboundFlowId(String outboundFlowId) {
        this.outboundFlowId = outboundFlowId;
    }

    /**
     * <p>
     * The outbound whisper flow to be used during an outbound call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param outboundFlowId <p>
     *            The outbound whisper flow to be used during an outbound call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutboundCallerConfig withOutboundFlowId(String outboundFlowId) {
        this.outboundFlowId = outboundFlowId;
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
        if (getOutboundCallerIdName() != null)
            sb.append("OutboundCallerIdName: " + getOutboundCallerIdName() + ",");
        if (getOutboundCallerIdNumberId() != null)
            sb.append("OutboundCallerIdNumberId: " + getOutboundCallerIdNumberId() + ",");
        if (getOutboundFlowId() != null)
            sb.append("OutboundFlowId: " + getOutboundFlowId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOutboundCallerIdName() == null) ? 0 : getOutboundCallerIdName().hashCode());
        hashCode = prime
                * hashCode
                + ((getOutboundCallerIdNumberId() == null) ? 0 : getOutboundCallerIdNumberId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getOutboundFlowId() == null) ? 0 : getOutboundFlowId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutboundCallerConfig == false)
            return false;
        OutboundCallerConfig other = (OutboundCallerConfig) obj;

        if (other.getOutboundCallerIdName() == null ^ this.getOutboundCallerIdName() == null)
            return false;
        if (other.getOutboundCallerIdName() != null
                && other.getOutboundCallerIdName().equals(this.getOutboundCallerIdName()) == false)
            return false;
        if (other.getOutboundCallerIdNumberId() == null
                ^ this.getOutboundCallerIdNumberId() == null)
            return false;
        if (other.getOutboundCallerIdNumberId() != null
                && other.getOutboundCallerIdNumberId().equals(this.getOutboundCallerIdNumberId()) == false)
            return false;
        if (other.getOutboundFlowId() == null ^ this.getOutboundFlowId() == null)
            return false;
        if (other.getOutboundFlowId() != null
                && other.getOutboundFlowId().equals(this.getOutboundFlowId()) == false)
            return false;
        return true;
    }
}
