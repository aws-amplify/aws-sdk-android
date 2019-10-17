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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

public class UpdateEmailChannelResult implements Serializable {
    /**
     * Email Channel Response.
     */
    private EmailChannelResponse emailChannelResponse;

    /**
     * Email Channel Response.
     *
     * @return Email Channel Response.
     */
    public EmailChannelResponse getEmailChannelResponse() {
        return emailChannelResponse;
    }

    /**
     * Email Channel Response.
     *
     * @param emailChannelResponse Email Channel Response.
     */
    public void setEmailChannelResponse(EmailChannelResponse emailChannelResponse) {
        this.emailChannelResponse = emailChannelResponse;
    }

    /**
     * Email Channel Response.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param emailChannelResponse Email Channel Response.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEmailChannelResult withEmailChannelResponse(
            EmailChannelResponse emailChannelResponse) {
        this.emailChannelResponse = emailChannelResponse;
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
        if (getEmailChannelResponse() != null)
            sb.append("EmailChannelResponse: " + getEmailChannelResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEmailChannelResponse() == null) ? 0 : getEmailChannelResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEmailChannelResult == false)
            return false;
        UpdateEmailChannelResult other = (UpdateEmailChannelResult) obj;

        if (other.getEmailChannelResponse() == null ^ this.getEmailChannelResponse() == null)
            return false;
        if (other.getEmailChannelResponse() != null
                && other.getEmailChannelResponse().equals(this.getEmailChannelResponse()) == false)
            return false;
        return true;
    }
}
