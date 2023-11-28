/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The configuration for the allowed capabilities for participants present over
 * the call.
 * </p>
 */
public class ParticipantCapabilities implements Serializable {
    /**
     * <p>
     * The configuration having the video sharing capabilities for participants
     * over the call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEND
     */
    private String video;

    /**
     * <p>
     * The configuration having the video sharing capabilities for participants
     * over the call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEND
     *
     * @return <p>
     *         The configuration having the video sharing capabilities for
     *         participants over the call.
     *         </p>
     * @see VideoCapability
     */
    public String getVideo() {
        return video;
    }

    /**
     * <p>
     * The configuration having the video sharing capabilities for participants
     * over the call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEND
     *
     * @param video <p>
     *            The configuration having the video sharing capabilities for
     *            participants over the call.
     *            </p>
     * @see VideoCapability
     */
    public void setVideo(String video) {
        this.video = video;
    }

    /**
     * <p>
     * The configuration having the video sharing capabilities for participants
     * over the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEND
     *
     * @param video <p>
     *            The configuration having the video sharing capabilities for
     *            participants over the call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VideoCapability
     */
    public ParticipantCapabilities withVideo(String video) {
        this.video = video;
        return this;
    }

    /**
     * <p>
     * The configuration having the video sharing capabilities for participants
     * over the call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEND
     *
     * @param video <p>
     *            The configuration having the video sharing capabilities for
     *            participants over the call.
     *            </p>
     * @see VideoCapability
     */
    public void setVideo(VideoCapability video) {
        this.video = video.toString();
    }

    /**
     * <p>
     * The configuration having the video sharing capabilities for participants
     * over the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEND
     *
     * @param video <p>
     *            The configuration having the video sharing capabilities for
     *            participants over the call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VideoCapability
     */
    public ParticipantCapabilities withVideo(VideoCapability video) {
        this.video = video.toString();
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
        if (getVideo() != null)
            sb.append("Video: " + getVideo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVideo() == null) ? 0 : getVideo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParticipantCapabilities == false)
            return false;
        ParticipantCapabilities other = (ParticipantCapabilities) obj;

        if (other.getVideo() == null ^ this.getVideo() == null)
            return false;
        if (other.getVideo() != null && other.getVideo().equals(this.getVideo()) == false)
            return false;
        return true;
    }
}
