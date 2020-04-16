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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

/**
 * <p>
 * Sends an AWS IoT Events input, passing in information about the detector
 * model instance and the event that triggered the action.
 * </p>
 */
public class IotEventsAction implements Serializable {
    /**
     * <p>
     * The name of the AWS IoT Events input where the data is sent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     */
    private String inputName;

    /**
     * <p>
     * You can configure the action payload when you send a message to an AWS
     * IoT Events input.
     * </p>
     */
    private Payload payload;

    /**
     * <p>
     * The name of the AWS IoT Events input where the data is sent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @return <p>
     *         The name of the AWS IoT Events input where the data is sent.
     *         </p>
     */
    public String getInputName() {
        return inputName;
    }

    /**
     * <p>
     * The name of the AWS IoT Events input where the data is sent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @param inputName <p>
     *            The name of the AWS IoT Events input where the data is sent.
     *            </p>
     */
    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    /**
     * <p>
     * The name of the AWS IoT Events input where the data is sent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @param inputName <p>
     *            The name of the AWS IoT Events input where the data is sent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IotEventsAction withInputName(String inputName) {
        this.inputName = inputName;
        return this;
    }

    /**
     * <p>
     * You can configure the action payload when you send a message to an AWS
     * IoT Events input.
     * </p>
     *
     * @return <p>
     *         You can configure the action payload when you send a message to
     *         an AWS IoT Events input.
     *         </p>
     */
    public Payload getPayload() {
        return payload;
    }

    /**
     * <p>
     * You can configure the action payload when you send a message to an AWS
     * IoT Events input.
     * </p>
     *
     * @param payload <p>
     *            You can configure the action payload when you send a message
     *            to an AWS IoT Events input.
     *            </p>
     */
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * You can configure the action payload when you send a message to an AWS
     * IoT Events input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param payload <p>
     *            You can configure the action payload when you send a message
     *            to an AWS IoT Events input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IotEventsAction withPayload(Payload payload) {
        this.payload = payload;
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
        if (getInputName() != null)
            sb.append("inputName: " + getInputName() + ",");
        if (getPayload() != null)
            sb.append("payload: " + getPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputName() == null) ? 0 : getInputName().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IotEventsAction == false)
            return false;
        IotEventsAction other = (IotEventsAction) obj;

        if (other.getInputName() == null ^ this.getInputName() == null)
            return false;
        if (other.getInputName() != null
                && other.getInputName().equals(this.getInputName()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        return true;
    }
}
