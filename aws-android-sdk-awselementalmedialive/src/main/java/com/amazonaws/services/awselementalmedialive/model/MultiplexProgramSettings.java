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
 * Multiplex Program settings configuration.
 */
public class MultiplexProgramSettings implements Serializable {
    /**
     * Indicates which pipeline is preferred by the multiplex for program
     * ingest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CURRENTLY_ACTIVE, PIPELINE_0, PIPELINE_1
     */
    private String preferredChannelPipeline;

    /**
     * Unique program number.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     */
    private Integer programNumber;

    /**
     * Transport stream service descriptor configuration for the Multiplex
     * program.
     */
    private MultiplexProgramServiceDescriptor serviceDescriptor;

    /**
     * Program video settings configuration.
     */
    private MultiplexVideoSettings videoSettings;

    /**
     * Indicates which pipeline is preferred by the multiplex for program
     * ingest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CURRENTLY_ACTIVE, PIPELINE_0, PIPELINE_1
     *
     * @return Indicates which pipeline is preferred by the multiplex for
     *         program ingest.
     * @see PreferredChannelPipeline
     */
    public String getPreferredChannelPipeline() {
        return preferredChannelPipeline;
    }

    /**
     * Indicates which pipeline is preferred by the multiplex for program
     * ingest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CURRENTLY_ACTIVE, PIPELINE_0, PIPELINE_1
     *
     * @param preferredChannelPipeline Indicates which pipeline is preferred by
     *            the multiplex for program ingest.
     * @see PreferredChannelPipeline
     */
    public void setPreferredChannelPipeline(String preferredChannelPipeline) {
        this.preferredChannelPipeline = preferredChannelPipeline;
    }

    /**
     * Indicates which pipeline is preferred by the multiplex for program
     * ingest.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CURRENTLY_ACTIVE, PIPELINE_0, PIPELINE_1
     *
     * @param preferredChannelPipeline Indicates which pipeline is preferred by
     *            the multiplex for program ingest.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PreferredChannelPipeline
     */
    public MultiplexProgramSettings withPreferredChannelPipeline(String preferredChannelPipeline) {
        this.preferredChannelPipeline = preferredChannelPipeline;
        return this;
    }

    /**
     * Indicates which pipeline is preferred by the multiplex for program
     * ingest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CURRENTLY_ACTIVE, PIPELINE_0, PIPELINE_1
     *
     * @param preferredChannelPipeline Indicates which pipeline is preferred by
     *            the multiplex for program ingest.
     * @see PreferredChannelPipeline
     */
    public void setPreferredChannelPipeline(PreferredChannelPipeline preferredChannelPipeline) {
        this.preferredChannelPipeline = preferredChannelPipeline.toString();
    }

    /**
     * Indicates which pipeline is preferred by the multiplex for program
     * ingest.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CURRENTLY_ACTIVE, PIPELINE_0, PIPELINE_1
     *
     * @param preferredChannelPipeline Indicates which pipeline is preferred by
     *            the multiplex for program ingest.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PreferredChannelPipeline
     */
    public MultiplexProgramSettings withPreferredChannelPipeline(
            PreferredChannelPipeline preferredChannelPipeline) {
        this.preferredChannelPipeline = preferredChannelPipeline.toString();
        return this;
    }

    /**
     * Unique program number.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @return Unique program number.
     */
    public Integer getProgramNumber() {
        return programNumber;
    }

    /**
     * Unique program number.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param programNumber Unique program number.
     */
    public void setProgramNumber(Integer programNumber) {
        this.programNumber = programNumber;
    }

    /**
     * Unique program number.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param programNumber Unique program number.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexProgramSettings withProgramNumber(Integer programNumber) {
        this.programNumber = programNumber;
        return this;
    }

    /**
     * Transport stream service descriptor configuration for the Multiplex
     * program.
     *
     * @return Transport stream service descriptor configuration for the
     *         Multiplex program.
     */
    public MultiplexProgramServiceDescriptor getServiceDescriptor() {
        return serviceDescriptor;
    }

    /**
     * Transport stream service descriptor configuration for the Multiplex
     * program.
     *
     * @param serviceDescriptor Transport stream service descriptor
     *            configuration for the Multiplex program.
     */
    public void setServiceDescriptor(MultiplexProgramServiceDescriptor serviceDescriptor) {
        this.serviceDescriptor = serviceDescriptor;
    }

    /**
     * Transport stream service descriptor configuration for the Multiplex
     * program.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceDescriptor Transport stream service descriptor
     *            configuration for the Multiplex program.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexProgramSettings withServiceDescriptor(
            MultiplexProgramServiceDescriptor serviceDescriptor) {
        this.serviceDescriptor = serviceDescriptor;
        return this;
    }

    /**
     * Program video settings configuration.
     *
     * @return Program video settings configuration.
     */
    public MultiplexVideoSettings getVideoSettings() {
        return videoSettings;
    }

    /**
     * Program video settings configuration.
     *
     * @param videoSettings Program video settings configuration.
     */
    public void setVideoSettings(MultiplexVideoSettings videoSettings) {
        this.videoSettings = videoSettings;
    }

    /**
     * Program video settings configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param videoSettings Program video settings configuration.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexProgramSettings withVideoSettings(MultiplexVideoSettings videoSettings) {
        this.videoSettings = videoSettings;
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
        if (getPreferredChannelPipeline() != null)
            sb.append("PreferredChannelPipeline: " + getPreferredChannelPipeline() + ",");
        if (getProgramNumber() != null)
            sb.append("ProgramNumber: " + getProgramNumber() + ",");
        if (getServiceDescriptor() != null)
            sb.append("ServiceDescriptor: " + getServiceDescriptor() + ",");
        if (getVideoSettings() != null)
            sb.append("VideoSettings: " + getVideoSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPreferredChannelPipeline() == null) ? 0 : getPreferredChannelPipeline()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getProgramNumber() == null) ? 0 : getProgramNumber().hashCode());
        hashCode = prime * hashCode
                + ((getServiceDescriptor() == null) ? 0 : getServiceDescriptor().hashCode());
        hashCode = prime * hashCode
                + ((getVideoSettings() == null) ? 0 : getVideoSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiplexProgramSettings == false)
            return false;
        MultiplexProgramSettings other = (MultiplexProgramSettings) obj;

        if (other.getPreferredChannelPipeline() == null
                ^ this.getPreferredChannelPipeline() == null)
            return false;
        if (other.getPreferredChannelPipeline() != null
                && other.getPreferredChannelPipeline().equals(this.getPreferredChannelPipeline()) == false)
            return false;
        if (other.getProgramNumber() == null ^ this.getProgramNumber() == null)
            return false;
        if (other.getProgramNumber() != null
                && other.getProgramNumber().equals(this.getProgramNumber()) == false)
            return false;
        if (other.getServiceDescriptor() == null ^ this.getServiceDescriptor() == null)
            return false;
        if (other.getServiceDescriptor() != null
                && other.getServiceDescriptor().equals(this.getServiceDescriptor()) == false)
            return false;
        if (other.getVideoSettings() == null ^ this.getVideoSettings() == null)
            return false;
        if (other.getVideoSettings() != null
                && other.getVideoSettings().equals(this.getVideoSettings()) == false)
            return false;
        return true;
    }
}
