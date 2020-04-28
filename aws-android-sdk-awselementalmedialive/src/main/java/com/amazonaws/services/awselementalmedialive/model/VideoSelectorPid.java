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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Video Selector Pid
 */
public class VideoSelectorPid implements Serializable {
    /**
     * Selects a specific PID from within a video source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 8191<br/>
     */
    private Integer pid;

    /**
     * Selects a specific PID from within a video source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 8191<br/>
     *
     * @return Selects a specific PID from within a video source.
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * Selects a specific PID from within a video source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 8191<br/>
     *
     * @param pid Selects a specific PID from within a video source.
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * Selects a specific PID from within a video source.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 8191<br/>
     *
     * @param pid Selects a specific PID from within a video source.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoSelectorPid withPid(Integer pid) {
        this.pid = pid;
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
        if (getPid() != null)
            sb.append("Pid: " + getPid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPid() == null) ? 0 : getPid().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoSelectorPid == false)
            return false;
        VideoSelectorPid other = (VideoSelectorPid) obj;

        if (other.getPid() == null ^ this.getPid() == null)
            return false;
        if (other.getPid() != null && other.getPid().equals(this.getPid()) == false)
            return false;
        return true;
    }
}
