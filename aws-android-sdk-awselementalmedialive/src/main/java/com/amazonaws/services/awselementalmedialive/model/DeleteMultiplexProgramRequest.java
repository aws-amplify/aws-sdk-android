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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Delete a program from a multiplex.
 */
public class DeleteMultiplexProgramRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The ID of the multiplex that the program belongs to.
     */
    private String multiplexId;

    /**
     * The multiplex program name.
     */
    private String programName;

    /**
     * The ID of the multiplex that the program belongs to.
     *
     * @return The ID of the multiplex that the program belongs to.
     */
    public String getMultiplexId() {
        return multiplexId;
    }

    /**
     * The ID of the multiplex that the program belongs to.
     *
     * @param multiplexId The ID of the multiplex that the program belongs to.
     */
    public void setMultiplexId(String multiplexId) {
        this.multiplexId = multiplexId;
    }

    /**
     * The ID of the multiplex that the program belongs to.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiplexId The ID of the multiplex that the program belongs to.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteMultiplexProgramRequest withMultiplexId(String multiplexId) {
        this.multiplexId = multiplexId;
        return this;
    }

    /**
     * The multiplex program name.
     *
     * @return The multiplex program name.
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * The multiplex program name.
     *
     * @param programName The multiplex program name.
     */
    public void setProgramName(String programName) {
        this.programName = programName;
    }

    /**
     * The multiplex program name.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param programName The multiplex program name.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteMultiplexProgramRequest withProgramName(String programName) {
        this.programName = programName;
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
        if (getMultiplexId() != null)
            sb.append("MultiplexId: " + getMultiplexId() + ",");
        if (getProgramName() != null)
            sb.append("ProgramName: " + getProgramName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMultiplexId() == null) ? 0 : getMultiplexId().hashCode());
        hashCode = prime * hashCode
                + ((getProgramName() == null) ? 0 : getProgramName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteMultiplexProgramRequest == false)
            return false;
        DeleteMultiplexProgramRequest other = (DeleteMultiplexProgramRequest) obj;

        if (other.getMultiplexId() == null ^ this.getMultiplexId() == null)
            return false;
        if (other.getMultiplexId() != null
                && other.getMultiplexId().equals(this.getMultiplexId()) == false)
            return false;
        if (other.getProgramName() == null ^ this.getProgramName() == null)
            return false;
        if (other.getProgramName() != null
                && other.getProgramName().equals(this.getProgramName()) == false)
            return false;
        return true;
    }
}
