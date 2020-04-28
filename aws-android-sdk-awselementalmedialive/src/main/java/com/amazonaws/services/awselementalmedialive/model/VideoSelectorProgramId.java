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
 * Video Selector Program Id
 */
public class VideoSelectorProgramId implements Serializable {
    /**
     * Selects a specific program from within a multi-program transport stream.
     * If the program doesn't exist, the first program within the transport
     * stream will be selected by default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65536<br/>
     */
    private Integer programId;

    /**
     * Selects a specific program from within a multi-program transport stream.
     * If the program doesn't exist, the first program within the transport
     * stream will be selected by default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65536<br/>
     *
     * @return Selects a specific program from within a multi-program transport
     *         stream. If the program doesn't exist, the first program within
     *         the transport stream will be selected by default.
     */
    public Integer getProgramId() {
        return programId;
    }

    /**
     * Selects a specific program from within a multi-program transport stream.
     * If the program doesn't exist, the first program within the transport
     * stream will be selected by default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65536<br/>
     *
     * @param programId Selects a specific program from within a multi-program
     *            transport stream. If the program doesn't exist, the first
     *            program within the transport stream will be selected by
     *            default.
     */
    public void setProgramId(Integer programId) {
        this.programId = programId;
    }

    /**
     * Selects a specific program from within a multi-program transport stream.
     * If the program doesn't exist, the first program within the transport
     * stream will be selected by default.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65536<br/>
     *
     * @param programId Selects a specific program from within a multi-program
     *            transport stream. If the program doesn't exist, the first
     *            program within the transport stream will be selected by
     *            default.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoSelectorProgramId withProgramId(Integer programId) {
        this.programId = programId;
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
        if (getProgramId() != null)
            sb.append("ProgramId: " + getProgramId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProgramId() == null) ? 0 : getProgramId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoSelectorProgramId == false)
            return false;
        VideoSelectorProgramId other = (VideoSelectorProgramId) obj;

        if (other.getProgramId() == null ^ this.getProgramId() == null)
            return false;
        if (other.getProgramId() != null
                && other.getProgramId().equals(this.getProgramId()) == false)
            return false;
        return true;
    }
}
