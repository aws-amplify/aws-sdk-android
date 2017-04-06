/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

public class UpdateEndpointsBatchResult implements Serializable {
    /**
     * The new value for the accessControlAllowOrigin property for this object.
     */
    private String accessControlAllowOrigin;

    /**
     * The new value for the messageBody property for this object.
     */
    private MessageBody messageBody;

    /**
     * Returns the value of the accessControlAllowOrigin property for this
     * object.
     *
     * @return The value of the accessControlAllowOrigin property for this
     *         object.
     */
    public String getAccessControlAllowOrigin() {
        return accessControlAllowOrigin;
    }

    /**
     * Sets the value of accessControlAllowOrigin
     *
     * @param accessControlAllowOrigin The new value for the
     *            accessControlAllowOrigin property for this object.
     */
    public void setAccessControlAllowOrigin(String accessControlAllowOrigin) {
        this.accessControlAllowOrigin = accessControlAllowOrigin;
    }

    /**
     * Sets the value of the accessControlAllowOrigin property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessControlAllowOrigin The new value for the
     *            accessControlAllowOrigin property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEndpointsBatchResult withAccessControlAllowOrigin(String accessControlAllowOrigin) {
        this.accessControlAllowOrigin = accessControlAllowOrigin;
        return this;
    }

    /**
     * Returns the value of the messageBody property for this object.
     *
     * @return The value of the messageBody property for this object.
     */
    public MessageBody getMessageBody() {
        return messageBody;
    }

    /**
     * Sets the value of messageBody
     *
     * @param messageBody The new value for the messageBody property for this
     *            object.
     */
    public void setMessageBody(MessageBody messageBody) {
        this.messageBody = messageBody;
    }

    /**
     * Sets the value of the messageBody property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageBody The new value for the messageBody property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEndpointsBatchResult withMessageBody(MessageBody messageBody) {
        this.messageBody = messageBody;
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
        if (getAccessControlAllowOrigin() != null)
            sb.append("AccessControlAllowOrigin: " + getAccessControlAllowOrigin() + ",");
        if (getMessageBody() != null)
            sb.append("MessageBody: " + getMessageBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAccessControlAllowOrigin() == null) ? 0 : getAccessControlAllowOrigin()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMessageBody() == null) ? 0 : getMessageBody().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEndpointsBatchResult == false)
            return false;
        UpdateEndpointsBatchResult other = (UpdateEndpointsBatchResult) obj;

        if (other.getAccessControlAllowOrigin() == null
                ^ this.getAccessControlAllowOrigin() == null)
            return false;
        if (other.getAccessControlAllowOrigin() != null
                && other.getAccessControlAllowOrigin().equals(this.getAccessControlAllowOrigin()) == false)
            return false;
        if (other.getMessageBody() == null ^ this.getMessageBody() == null)
            return false;
        if (other.getMessageBody() != null
                && other.getMessageBody().equals(this.getMessageBody()) == false)
            return false;
        return true;
    }
}
