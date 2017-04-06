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

public class GetGcmChannelResult implements Serializable {
    /**
     * The new value for the accessControlAllowOrigin property for this object.
     */
    private String accessControlAllowOrigin;

    /**
     * The new value for the gCMChannelResponse property for this object.
     */
    private GCMChannelResponse gCMChannelResponse;

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
    public GetGcmChannelResult withAccessControlAllowOrigin(String accessControlAllowOrigin) {
        this.accessControlAllowOrigin = accessControlAllowOrigin;
        return this;
    }

    /**
     * Returns the value of the gCMChannelResponse property for this object.
     *
     * @return The value of the gCMChannelResponse property for this object.
     */
    public GCMChannelResponse getGCMChannelResponse() {
        return gCMChannelResponse;
    }

    /**
     * Sets the value of gCMChannelResponse
     *
     * @param gCMChannelResponse The new value for the gCMChannelResponse
     *            property for this object.
     */
    public void setGCMChannelResponse(GCMChannelResponse gCMChannelResponse) {
        this.gCMChannelResponse = gCMChannelResponse;
    }

    /**
     * Sets the value of the gCMChannelResponse property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gCMChannelResponse The new value for the gCMChannelResponse
     *            property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetGcmChannelResult withGCMChannelResponse(GCMChannelResponse gCMChannelResponse) {
        this.gCMChannelResponse = gCMChannelResponse;
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
        if (getGCMChannelResponse() != null)
            sb.append("GCMChannelResponse: " + getGCMChannelResponse());
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
                + ((getGCMChannelResponse() == null) ? 0 : getGCMChannelResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGcmChannelResult == false)
            return false;
        GetGcmChannelResult other = (GetGcmChannelResult) obj;

        if (other.getAccessControlAllowOrigin() == null
                ^ this.getAccessControlAllowOrigin() == null)
            return false;
        if (other.getAccessControlAllowOrigin() != null
                && other.getAccessControlAllowOrigin().equals(this.getAccessControlAllowOrigin()) == false)
            return false;
        if (other.getGCMChannelResponse() == null ^ this.getGCMChannelResponse() == null)
            return false;
        if (other.getGCMChannelResponse() != null
                && other.getGCMChannelResponse().equals(this.getGCMChannelResponse()) == false)
            return false;
        return true;
    }
}
