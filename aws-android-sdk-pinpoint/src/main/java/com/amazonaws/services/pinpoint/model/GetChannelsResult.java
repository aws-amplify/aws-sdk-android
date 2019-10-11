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

public class GetChannelsResult implements Serializable {
    /**
     * <p>
     * Provides information about the general settings and status of all
     * channels for an application, including channels that aren't enabled for
     * the application.
     * </p>
     */
    private ChannelsResponse channelsResponse;

    /**
     * <p>
     * Provides information about the general settings and status of all
     * channels for an application, including channels that aren't enabled for
     * the application.
     * </p>
     *
     * @return <p>
     *         Provides information about the general settings and status of all
     *         channels for an application, including channels that aren't
     *         enabled for the application.
     *         </p>
     */
    public ChannelsResponse getChannelsResponse() {
        return channelsResponse;
    }

    /**
     * <p>
     * Provides information about the general settings and status of all
     * channels for an application, including channels that aren't enabled for
     * the application.
     * </p>
     *
     * @param channelsResponse <p>
     *            Provides information about the general settings and status of
     *            all channels for an application, including channels that
     *            aren't enabled for the application.
     *            </p>
     */
    public void setChannelsResponse(ChannelsResponse channelsResponse) {
        this.channelsResponse = channelsResponse;
    }

    /**
     * <p>
     * Provides information about the general settings and status of all
     * channels for an application, including channels that aren't enabled for
     * the application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelsResponse <p>
     *            Provides information about the general settings and status of
     *            all channels for an application, including channels that
     *            aren't enabled for the application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetChannelsResult withChannelsResponse(ChannelsResponse channelsResponse) {
        this.channelsResponse = channelsResponse;
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
        if (getChannelsResponse() != null)
            sb.append("ChannelsResponse: " + getChannelsResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getChannelsResponse() == null) ? 0 : getChannelsResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetChannelsResult == false)
            return false;
        GetChannelsResult other = (GetChannelsResult) obj;

        if (other.getChannelsResponse() == null ^ this.getChannelsResponse() == null)
            return false;
        if (other.getChannelsResponse() != null
                && other.getChannelsResponse().equals(this.getChannelsResponse()) == false)
            return false;
        return true;
    }
}
