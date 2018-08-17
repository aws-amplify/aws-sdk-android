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

package com.amazonaws.services.kinesisvideoarchivedmedia.model;

import java.io.Serializable;

public class GetHLSStreamingSessionURLResult implements Serializable {
    /**
     * <p>
     * The URL (containing the session token) that a media player can use to
     * retrieve the HLS master playlist.
     * </p>
     */
    private String hLSStreamingSessionURL;

    /**
     * <p>
     * The URL (containing the session token) that a media player can use to
     * retrieve the HLS master playlist.
     * </p>
     *
     * @return <p>
     *         The URL (containing the session token) that a media player can
     *         use to retrieve the HLS master playlist.
     *         </p>
     */
    public String getHLSStreamingSessionURL() {
        return hLSStreamingSessionURL;
    }

    /**
     * <p>
     * The URL (containing the session token) that a media player can use to
     * retrieve the HLS master playlist.
     * </p>
     *
     * @param hLSStreamingSessionURL <p>
     *            The URL (containing the session token) that a media player can
     *            use to retrieve the HLS master playlist.
     *            </p>
     */
    public void setHLSStreamingSessionURL(String hLSStreamingSessionURL) {
        this.hLSStreamingSessionURL = hLSStreamingSessionURL;
    }

    /**
     * <p>
     * The URL (containing the session token) that a media player can use to
     * retrieve the HLS master playlist.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hLSStreamingSessionURL <p>
     *            The URL (containing the session token) that a media player can
     *            use to retrieve the HLS master playlist.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetHLSStreamingSessionURLResult withHLSStreamingSessionURL(String hLSStreamingSessionURL) {
        this.hLSStreamingSessionURL = hLSStreamingSessionURL;
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
        if (getHLSStreamingSessionURL() != null)
            sb.append("HLSStreamingSessionURL: " + getHLSStreamingSessionURL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getHLSStreamingSessionURL() == null) ? 0 : getHLSStreamingSessionURL()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetHLSStreamingSessionURLResult == false)
            return false;
        GetHLSStreamingSessionURLResult other = (GetHLSStreamingSessionURLResult) obj;

        if (other.getHLSStreamingSessionURL() == null ^ this.getHLSStreamingSessionURL() == null)
            return false;
        if (other.getHLSStreamingSessionURL() != null
                && other.getHLSStreamingSessionURL().equals(this.getHLSStreamingSessionURL()) == false)
            return false;
        return true;
    }
}
