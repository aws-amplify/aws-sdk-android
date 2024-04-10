/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Configuration of the answering machine detection.
 * </p>
 */
public class AnswerMachineDetectionConfig implements Serializable {
    /**
     * <p>
     * The flag to indicate if answer machine detection analysis needs to be
     * performed for a voice call. If set to <code>true</code>,
     * <code>TrafficType</code> must be set as <code>CAMPAIGN</code>.
     * </p>
     */
    private Boolean enableAnswerMachineDetection;

    /**
     * <p>
     * Wait for the answering machine prompt.
     * </p>
     */
    private Boolean awaitAnswerMachinePrompt;

    /**
     * <p>
     * The flag to indicate if answer machine detection analysis needs to be
     * performed for a voice call. If set to <code>true</code>,
     * <code>TrafficType</code> must be set as <code>CAMPAIGN</code>.
     * </p>
     *
     * @return <p>
     *         The flag to indicate if answer machine detection analysis needs
     *         to be performed for a voice call. If set to <code>true</code>,
     *         <code>TrafficType</code> must be set as <code>CAMPAIGN</code>.
     *         </p>
     */
    public Boolean isEnableAnswerMachineDetection() {
        return enableAnswerMachineDetection;
    }

    /**
     * <p>
     * The flag to indicate if answer machine detection analysis needs to be
     * performed for a voice call. If set to <code>true</code>,
     * <code>TrafficType</code> must be set as <code>CAMPAIGN</code>.
     * </p>
     *
     * @return <p>
     *         The flag to indicate if answer machine detection analysis needs
     *         to be performed for a voice call. If set to <code>true</code>,
     *         <code>TrafficType</code> must be set as <code>CAMPAIGN</code>.
     *         </p>
     */
    public Boolean getEnableAnswerMachineDetection() {
        return enableAnswerMachineDetection;
    }

    /**
     * <p>
     * The flag to indicate if answer machine detection analysis needs to be
     * performed for a voice call. If set to <code>true</code>,
     * <code>TrafficType</code> must be set as <code>CAMPAIGN</code>.
     * </p>
     *
     * @param enableAnswerMachineDetection <p>
     *            The flag to indicate if answer machine detection analysis
     *            needs to be performed for a voice call. If set to
     *            <code>true</code>, <code>TrafficType</code> must be set as
     *            <code>CAMPAIGN</code>.
     *            </p>
     */
    public void setEnableAnswerMachineDetection(Boolean enableAnswerMachineDetection) {
        this.enableAnswerMachineDetection = enableAnswerMachineDetection;
    }

    /**
     * <p>
     * The flag to indicate if answer machine detection analysis needs to be
     * performed for a voice call. If set to <code>true</code>,
     * <code>TrafficType</code> must be set as <code>CAMPAIGN</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableAnswerMachineDetection <p>
     *            The flag to indicate if answer machine detection analysis
     *            needs to be performed for a voice call. If set to
     *            <code>true</code>, <code>TrafficType</code> must be set as
     *            <code>CAMPAIGN</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnswerMachineDetectionConfig withEnableAnswerMachineDetection(
            Boolean enableAnswerMachineDetection) {
        this.enableAnswerMachineDetection = enableAnswerMachineDetection;
        return this;
    }

    /**
     * <p>
     * Wait for the answering machine prompt.
     * </p>
     *
     * @return <p>
     *         Wait for the answering machine prompt.
     *         </p>
     */
    public Boolean isAwaitAnswerMachinePrompt() {
        return awaitAnswerMachinePrompt;
    }

    /**
     * <p>
     * Wait for the answering machine prompt.
     * </p>
     *
     * @return <p>
     *         Wait for the answering machine prompt.
     *         </p>
     */
    public Boolean getAwaitAnswerMachinePrompt() {
        return awaitAnswerMachinePrompt;
    }

    /**
     * <p>
     * Wait for the answering machine prompt.
     * </p>
     *
     * @param awaitAnswerMachinePrompt <p>
     *            Wait for the answering machine prompt.
     *            </p>
     */
    public void setAwaitAnswerMachinePrompt(Boolean awaitAnswerMachinePrompt) {
        this.awaitAnswerMachinePrompt = awaitAnswerMachinePrompt;
    }

    /**
     * <p>
     * Wait for the answering machine prompt.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awaitAnswerMachinePrompt <p>
     *            Wait for the answering machine prompt.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnswerMachineDetectionConfig withAwaitAnswerMachinePrompt(
            Boolean awaitAnswerMachinePrompt) {
        this.awaitAnswerMachinePrompt = awaitAnswerMachinePrompt;
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
        if (getEnableAnswerMachineDetection() != null)
            sb.append("EnableAnswerMachineDetection: " + getEnableAnswerMachineDetection() + ",");
        if (getAwaitAnswerMachinePrompt() != null)
            sb.append("AwaitAnswerMachinePrompt: " + getAwaitAnswerMachinePrompt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getEnableAnswerMachineDetection() == null) ? 0
                        : getEnableAnswerMachineDetection().hashCode());
        hashCode = prime
                * hashCode
                + ((getAwaitAnswerMachinePrompt() == null) ? 0 : getAwaitAnswerMachinePrompt()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnswerMachineDetectionConfig == false)
            return false;
        AnswerMachineDetectionConfig other = (AnswerMachineDetectionConfig) obj;

        if (other.getEnableAnswerMachineDetection() == null
                ^ this.getEnableAnswerMachineDetection() == null)
            return false;
        if (other.getEnableAnswerMachineDetection() != null
                && other.getEnableAnswerMachineDetection().equals(
                        this.getEnableAnswerMachineDetection()) == false)
            return false;
        if (other.getAwaitAnswerMachinePrompt() == null
                ^ this.getAwaitAnswerMachinePrompt() == null)
            return false;
        if (other.getAwaitAnswerMachinePrompt() != null
                && other.getAwaitAnswerMachinePrompt().equals(this.getAwaitAnswerMachinePrompt()) == false)
            return false;
        return true;
    }
}
