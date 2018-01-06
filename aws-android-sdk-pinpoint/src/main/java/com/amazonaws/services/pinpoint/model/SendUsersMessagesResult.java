/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class SendUsersMessagesResult implements Serializable {
    /**
     * User send message response.
     */
    private SendUsersMessageResponse sendUsersMessageResponse;

    /**
     * User send message response.
     *
     * @return User send message response.
     */
    public SendUsersMessageResponse getSendUsersMessageResponse() {
        return sendUsersMessageResponse;
    }

    /**
     * User send message response.
     *
     * @param sendUsersMessageResponse User send message response.
     */
    public void setSendUsersMessageResponse(SendUsersMessageResponse sendUsersMessageResponse) {
        this.sendUsersMessageResponse = sendUsersMessageResponse;
    }

    /**
     * User send message response.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sendUsersMessageResponse User send message response.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendUsersMessagesResult withSendUsersMessageResponse(
            SendUsersMessageResponse sendUsersMessageResponse) {
        this.sendUsersMessageResponse = sendUsersMessageResponse;
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
        if (getSendUsersMessageResponse() != null)
            sb.append("SendUsersMessageResponse: " + getSendUsersMessageResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSendUsersMessageResponse() == null) ? 0 : getSendUsersMessageResponse()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendUsersMessagesResult == false)
            return false;
        SendUsersMessagesResult other = (SendUsersMessagesResult) obj;

        if (other.getSendUsersMessageResponse() == null
                ^ this.getSendUsersMessageResponse() == null)
            return false;
        if (other.getSendUsersMessageResponse() != null
                && other.getSendUsersMessageResponse().equals(this.getSendUsersMessageResponse()) == false)
            return false;
        return true;
    }
}
