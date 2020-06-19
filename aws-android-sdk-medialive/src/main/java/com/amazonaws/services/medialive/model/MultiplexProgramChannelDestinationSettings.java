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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Multiplex Program Input Destination Settings for outputting a Channel to a
 * Multiplex
 */
public class MultiplexProgramChannelDestinationSettings implements Serializable {
    /**
     * The ID of the Multiplex that the encoder is providing output to. You do
     * not need to specify the individual inputs to the Multiplex; MediaLive
     * will handle the connection of the two MediaLive pipelines to the two
     * Multiplex instances. The Multiplex must be in the same region as the
     * Channel.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String multiplexId;

    /**
     * The program name of the Multiplex program that the encoder is providing
     * output to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String programName;

    /**
     * The ID of the Multiplex that the encoder is providing output to. You do
     * not need to specify the individual inputs to the Multiplex; MediaLive
     * will handle the connection of the two MediaLive pipelines to the two
     * Multiplex instances. The Multiplex must be in the same region as the
     * Channel.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The ID of the Multiplex that the encoder is providing output to.
     *         You do not need to specify the individual inputs to the
     *         Multiplex; MediaLive will handle the connection of the two
     *         MediaLive pipelines to the two Multiplex instances. The Multiplex
     *         must be in the same region as the Channel.
     */
    public String getMultiplexId() {
        return multiplexId;
    }

    /**
     * The ID of the Multiplex that the encoder is providing output to. You do
     * not need to specify the individual inputs to the Multiplex; MediaLive
     * will handle the connection of the two MediaLive pipelines to the two
     * Multiplex instances. The Multiplex must be in the same region as the
     * Channel.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param multiplexId The ID of the Multiplex that the encoder is providing
     *            output to. You do not need to specify the individual inputs to
     *            the Multiplex; MediaLive will handle the connection of the two
     *            MediaLive pipelines to the two Multiplex instances. The
     *            Multiplex must be in the same region as the Channel.
     */
    public void setMultiplexId(String multiplexId) {
        this.multiplexId = multiplexId;
    }

    /**
     * The ID of the Multiplex that the encoder is providing output to. You do
     * not need to specify the individual inputs to the Multiplex; MediaLive
     * will handle the connection of the two MediaLive pipelines to the two
     * Multiplex instances. The Multiplex must be in the same region as the
     * Channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param multiplexId The ID of the Multiplex that the encoder is providing
     *            output to. You do not need to specify the individual inputs to
     *            the Multiplex; MediaLive will handle the connection of the two
     *            MediaLive pipelines to the two Multiplex instances. The
     *            Multiplex must be in the same region as the Channel.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexProgramChannelDestinationSettings withMultiplexId(String multiplexId) {
        this.multiplexId = multiplexId;
        return this;
    }

    /**
     * The program name of the Multiplex program that the encoder is providing
     * output to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The program name of the Multiplex program that the encoder is
     *         providing output to.
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * The program name of the Multiplex program that the encoder is providing
     * output to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param programName The program name of the Multiplex program that the
     *            encoder is providing output to.
     */
    public void setProgramName(String programName) {
        this.programName = programName;
    }

    /**
     * The program name of the Multiplex program that the encoder is providing
     * output to.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param programName The program name of the Multiplex program that the
     *            encoder is providing output to.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexProgramChannelDestinationSettings withProgramName(String programName) {
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

        if (obj instanceof MultiplexProgramChannelDestinationSettings == false)
            return false;
        MultiplexProgramChannelDestinationSettings other = (MultiplexProgramChannelDestinationSettings) obj;

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
