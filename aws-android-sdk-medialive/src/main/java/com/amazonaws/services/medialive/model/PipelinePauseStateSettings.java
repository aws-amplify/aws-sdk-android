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
 * Settings for pausing a pipeline.
 */
public class PipelinePauseStateSettings implements Serializable {
    /**
     * Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1").
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PIPELINE_0, PIPELINE_1
     */
    private String pipelineId;

    /**
     * Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1").
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PIPELINE_0, PIPELINE_1
     *
     * @return Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1").
     * @see PipelineId
     */
    public String getPipelineId() {
        return pipelineId;
    }

    /**
     * Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1").
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PIPELINE_0, PIPELINE_1
     *
     * @param pipelineId Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1").
     * @see PipelineId
     */
    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    /**
     * Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1").
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PIPELINE_0, PIPELINE_1
     *
     * @param pipelineId Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1").
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PipelineId
     */
    public PipelinePauseStateSettings withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1").
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PIPELINE_0, PIPELINE_1
     *
     * @param pipelineId Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1").
     * @see PipelineId
     */
    public void setPipelineId(PipelineId pipelineId) {
        this.pipelineId = pipelineId.toString();
    }

    /**
     * Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1").
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PIPELINE_0, PIPELINE_1
     *
     * @param pipelineId Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1").
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PipelineId
     */
    public PipelinePauseStateSettings withPipelineId(PipelineId pipelineId) {
        this.pipelineId = pipelineId.toString();
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
        if (getPipelineId() != null)
            sb.append("PipelineId: " + getPipelineId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipelinePauseStateSettings == false)
            return false;
        PipelinePauseStateSettings other = (PipelinePauseStateSettings) obj;

        if (other.getPipelineId() == null ^ this.getPipelineId() == null)
            return false;
        if (other.getPipelineId() != null
                && other.getPipelineId().equals(this.getPipelineId()) == false)
            return false;
        return true;
    }
}
