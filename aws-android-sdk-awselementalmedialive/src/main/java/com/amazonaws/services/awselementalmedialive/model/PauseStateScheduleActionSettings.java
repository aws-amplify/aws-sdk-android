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
 * Settings for the action to set pause state of a channel.
 */
public class PauseStateScheduleActionSettings implements Serializable {
    /**
     * Placeholder documentation for __listOfPipelinePauseStateSettings
     */
    private java.util.List<PipelinePauseStateSettings> pipelines;

    /**
     * Placeholder documentation for __listOfPipelinePauseStateSettings
     *
     * @return Placeholder documentation for __listOfPipelinePauseStateSettings
     */
    public java.util.List<PipelinePauseStateSettings> getPipelines() {
        return pipelines;
    }

    /**
     * Placeholder documentation for __listOfPipelinePauseStateSettings
     *
     * @param pipelines Placeholder documentation for
     *            __listOfPipelinePauseStateSettings
     */
    public void setPipelines(java.util.Collection<PipelinePauseStateSettings> pipelines) {
        if (pipelines == null) {
            this.pipelines = null;
            return;
        }

        this.pipelines = new java.util.ArrayList<PipelinePauseStateSettings>(pipelines);
    }

    /**
     * Placeholder documentation for __listOfPipelinePauseStateSettings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pipelines Placeholder documentation for
     *            __listOfPipelinePauseStateSettings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PauseStateScheduleActionSettings withPipelines(PipelinePauseStateSettings... pipelines) {
        if (getPipelines() == null) {
            this.pipelines = new java.util.ArrayList<PipelinePauseStateSettings>(pipelines.length);
        }
        for (PipelinePauseStateSettings value : pipelines) {
            this.pipelines.add(value);
        }
        return this;
    }

    /**
     * Placeholder documentation for __listOfPipelinePauseStateSettings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pipelines Placeholder documentation for
     *            __listOfPipelinePauseStateSettings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PauseStateScheduleActionSettings withPipelines(
            java.util.Collection<PipelinePauseStateSettings> pipelines) {
        setPipelines(pipelines);
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
        if (getPipelines() != null)
            sb.append("Pipelines: " + getPipelines());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelines() == null) ? 0 : getPipelines().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PauseStateScheduleActionSettings == false)
            return false;
        PauseStateScheduleActionSettings other = (PauseStateScheduleActionSettings) obj;

        if (other.getPipelines() == null ^ this.getPipelines() == null)
            return false;
        if (other.getPipelines() != null
                && other.getPipelines().equals(this.getPipelines()) == false)
            return false;
        return true;
    }
}
