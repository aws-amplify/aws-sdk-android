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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

/**
 * <p>
 * The configuration that consists of the <code>ScheduleExpression</code> and
 * the <code>DurationInMinutes</code> details that specify the scheduling to
 * record from a camera, or local media file, onto the Edge Agent. If the
 * <code>ScheduleConfig</code> is not provided in the
 * <code>UploaderConfig</code>, then the Edge Agent will upload at regular
 * intervals (every 1 hour).
 * </p>
 */
public class UploaderConfig implements Serializable {
    /**
     * <p>
     * The configuration that consists of the <code>ScheduleExpression</code>
     * and the <code>DurationInMinutes</code> details that specify the
     * scheduling to record from a camera, or local media file, onto the Edge
     * Agent. If the <code>ScheduleConfig</code> is not provided in this
     * <code>UploaderConfig</code>, then the Edge Agent will upload at regular
     * intervals (every 1 hour).
     * </p>
     */
    private ScheduleConfig scheduleConfig;

    /**
     * <p>
     * The configuration that consists of the <code>ScheduleExpression</code>
     * and the <code>DurationInMinutes</code> details that specify the
     * scheduling to record from a camera, or local media file, onto the Edge
     * Agent. If the <code>ScheduleConfig</code> is not provided in this
     * <code>UploaderConfig</code>, then the Edge Agent will upload at regular
     * intervals (every 1 hour).
     * </p>
     *
     * @return <p>
     *         The configuration that consists of the
     *         <code>ScheduleExpression</code> and the
     *         <code>DurationInMinutes</code> details that specify the
     *         scheduling to record from a camera, or local media file, onto the
     *         Edge Agent. If the <code>ScheduleConfig</code> is not provided in
     *         this <code>UploaderConfig</code>, then the Edge Agent will upload
     *         at regular intervals (every 1 hour).
     *         </p>
     */
    public ScheduleConfig getScheduleConfig() {
        return scheduleConfig;
    }

    /**
     * <p>
     * The configuration that consists of the <code>ScheduleExpression</code>
     * and the <code>DurationInMinutes</code> details that specify the
     * scheduling to record from a camera, or local media file, onto the Edge
     * Agent. If the <code>ScheduleConfig</code> is not provided in this
     * <code>UploaderConfig</code>, then the Edge Agent will upload at regular
     * intervals (every 1 hour).
     * </p>
     *
     * @param scheduleConfig <p>
     *            The configuration that consists of the
     *            <code>ScheduleExpression</code> and the
     *            <code>DurationInMinutes</code> details that specify the
     *            scheduling to record from a camera, or local media file, onto
     *            the Edge Agent. If the <code>ScheduleConfig</code> is not
     *            provided in this <code>UploaderConfig</code>, then the Edge
     *            Agent will upload at regular intervals (every 1 hour).
     *            </p>
     */
    public void setScheduleConfig(ScheduleConfig scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
    }

    /**
     * <p>
     * The configuration that consists of the <code>ScheduleExpression</code>
     * and the <code>DurationInMinutes</code> details that specify the
     * scheduling to record from a camera, or local media file, onto the Edge
     * Agent. If the <code>ScheduleConfig</code> is not provided in this
     * <code>UploaderConfig</code>, then the Edge Agent will upload at regular
     * intervals (every 1 hour).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleConfig <p>
     *            The configuration that consists of the
     *            <code>ScheduleExpression</code> and the
     *            <code>DurationInMinutes</code> details that specify the
     *            scheduling to record from a camera, or local media file, onto
     *            the Edge Agent. If the <code>ScheduleConfig</code> is not
     *            provided in this <code>UploaderConfig</code>, then the Edge
     *            Agent will upload at regular intervals (every 1 hour).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UploaderConfig withScheduleConfig(ScheduleConfig scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
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
        if (getScheduleConfig() != null)
            sb.append("ScheduleConfig: " + getScheduleConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getScheduleConfig() == null) ? 0 : getScheduleConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UploaderConfig == false)
            return false;
        UploaderConfig other = (UploaderConfig) obj;

        if (other.getScheduleConfig() == null ^ this.getScheduleConfig() == null)
            return false;
        if (other.getScheduleConfig() != null
                && other.getScheduleConfig().equals(this.getScheduleConfig()) == false)
            return false;
        return true;
    }
}
