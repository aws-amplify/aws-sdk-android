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
 * Runtime details of a pipeline when a channel is running.
 */
public class PipelineDetail implements Serializable {
    /**
     * The name of the active input attachment currently being ingested by this
     * pipeline.
     */
    private String activeInputAttachmentName;

    /**
     * The name of the input switch schedule action that occurred most recently
     * and that resulted in the switch to the current input attachment for this
     * pipeline.
     */
    private String activeInputSwitchActionName;

    /**
     * Pipeline ID
     */
    private String pipelineId;

    /**
     * The name of the active input attachment currently being ingested by this
     * pipeline.
     *
     * @return The name of the active input attachment currently being ingested
     *         by this pipeline.
     */
    public String getActiveInputAttachmentName() {
        return activeInputAttachmentName;
    }

    /**
     * The name of the active input attachment currently being ingested by this
     * pipeline.
     *
     * @param activeInputAttachmentName The name of the active input attachment
     *            currently being ingested by this pipeline.
     */
    public void setActiveInputAttachmentName(String activeInputAttachmentName) {
        this.activeInputAttachmentName = activeInputAttachmentName;
    }

    /**
     * The name of the active input attachment currently being ingested by this
     * pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activeInputAttachmentName The name of the active input attachment
     *            currently being ingested by this pipeline.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PipelineDetail withActiveInputAttachmentName(String activeInputAttachmentName) {
        this.activeInputAttachmentName = activeInputAttachmentName;
        return this;
    }

    /**
     * The name of the input switch schedule action that occurred most recently
     * and that resulted in the switch to the current input attachment for this
     * pipeline.
     *
     * @return The name of the input switch schedule action that occurred most
     *         recently and that resulted in the switch to the current input
     *         attachment for this pipeline.
     */
    public String getActiveInputSwitchActionName() {
        return activeInputSwitchActionName;
    }

    /**
     * The name of the input switch schedule action that occurred most recently
     * and that resulted in the switch to the current input attachment for this
     * pipeline.
     *
     * @param activeInputSwitchActionName The name of the input switch schedule
     *            action that occurred most recently and that resulted in the
     *            switch to the current input attachment for this pipeline.
     */
    public void setActiveInputSwitchActionName(String activeInputSwitchActionName) {
        this.activeInputSwitchActionName = activeInputSwitchActionName;
    }

    /**
     * The name of the input switch schedule action that occurred most recently
     * and that resulted in the switch to the current input attachment for this
     * pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activeInputSwitchActionName The name of the input switch schedule
     *            action that occurred most recently and that resulted in the
     *            switch to the current input attachment for this pipeline.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PipelineDetail withActiveInputSwitchActionName(String activeInputSwitchActionName) {
        this.activeInputSwitchActionName = activeInputSwitchActionName;
        return this;
    }

    /**
     * Pipeline ID
     *
     * @return Pipeline ID
     */
    public String getPipelineId() {
        return pipelineId;
    }

    /**
     * Pipeline ID
     *
     * @param pipelineId Pipeline ID
     */
    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    /**
     * Pipeline ID
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pipelineId Pipeline ID
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PipelineDetail withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
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
        if (getActiveInputAttachmentName() != null)
            sb.append("ActiveInputAttachmentName: " + getActiveInputAttachmentName() + ",");
        if (getActiveInputSwitchActionName() != null)
            sb.append("ActiveInputSwitchActionName: " + getActiveInputSwitchActionName() + ",");
        if (getPipelineId() != null)
            sb.append("PipelineId: " + getPipelineId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getActiveInputAttachmentName() == null) ? 0 : getActiveInputAttachmentName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getActiveInputSwitchActionName() == null) ? 0
                        : getActiveInputSwitchActionName().hashCode());
        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipelineDetail == false)
            return false;
        PipelineDetail other = (PipelineDetail) obj;

        if (other.getActiveInputAttachmentName() == null
                ^ this.getActiveInputAttachmentName() == null)
            return false;
        if (other.getActiveInputAttachmentName() != null
                && other.getActiveInputAttachmentName().equals(this.getActiveInputAttachmentName()) == false)
            return false;
        if (other.getActiveInputSwitchActionName() == null
                ^ this.getActiveInputSwitchActionName() == null)
            return false;
        if (other.getActiveInputSwitchActionName() != null
                && other.getActiveInputSwitchActionName().equals(
                        this.getActiveInputSwitchActionName()) == false)
            return false;
        if (other.getPipelineId() == null ^ this.getPipelineId() == null)
            return false;
        if (other.getPipelineId() != null
                && other.getPipelineId().equals(this.getPipelineId()) == false)
            return false;
        return true;
    }
}
