/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class GetDASHStreamingSessionURLResult implements Serializable {
    /**
     * <p>
     * The URL (containing the session token) that a media player can use to
     * retrieve the MPEG-DASH manifest.
     * </p>
     */
    private String dASHStreamingSessionURL;

    /**
     * <p>
     * The URL (containing the session token) that a media player can use to
     * retrieve the MPEG-DASH manifest.
     * </p>
     *
     * @return <p>
     *         The URL (containing the session token) that a media player can
     *         use to retrieve the MPEG-DASH manifest.
     *         </p>
     */
    public String getDASHStreamingSessionURL() {
        return dASHStreamingSessionURL;
    }

    /**
     * <p>
     * The URL (containing the session token) that a media player can use to
     * retrieve the MPEG-DASH manifest.
     * </p>
     *
     * @param dASHStreamingSessionURL <p>
     *            The URL (containing the session token) that a media player can
     *            use to retrieve the MPEG-DASH manifest.
     *            </p>
     */
    public void setDASHStreamingSessionURL(String dASHStreamingSessionURL) {
        this.dASHStreamingSessionURL = dASHStreamingSessionURL;
    }

    /**
     * <p>
     * The URL (containing the session token) that a media player can use to
     * retrieve the MPEG-DASH manifest.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dASHStreamingSessionURL <p>
     *            The URL (containing the session token) that a media player can
     *            use to retrieve the MPEG-DASH manifest.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDASHStreamingSessionURLResult withDASHStreamingSessionURL(
            String dASHStreamingSessionURL) {
        this.dASHStreamingSessionURL = dASHStreamingSessionURL;
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
        if (getDASHStreamingSessionURL() != null)
            sb.append("DASHStreamingSessionURL: " + getDASHStreamingSessionURL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDASHStreamingSessionURL() == null) ? 0 : getDASHStreamingSessionURL()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDASHStreamingSessionURLResult == false)
            return false;
        GetDASHStreamingSessionURLResult other = (GetDASHStreamingSessionURLResult) obj;

        if (other.getDASHStreamingSessionURL() == null ^ this.getDASHStreamingSessionURL() == null)
            return false;
        if (other.getDASHStreamingSessionURL() != null
                && other.getDASHStreamingSessionURL().equals(this.getDASHStreamingSessionURL()) == false)
            return false;
        return true;
    }
}
