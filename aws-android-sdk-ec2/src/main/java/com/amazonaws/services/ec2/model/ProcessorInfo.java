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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the processor used by the instance type.
 * </p>
 */
public class ProcessorInfo implements Serializable {
    /**
     * <p>
     * A list of architectures supported by the instance type.
     * </p>
     */
    private java.util.List<String> supportedArchitectures;

    /**
     * <p>
     * The speed of the processor, in GHz.
     * </p>
     */
    private Double sustainedClockSpeedInGhz;

    /**
     * <p>
     * A list of architectures supported by the instance type.
     * </p>
     *
     * @return <p>
     *         A list of architectures supported by the instance type.
     *         </p>
     */
    public java.util.List<String> getSupportedArchitectures() {
        return supportedArchitectures;
    }

    /**
     * <p>
     * A list of architectures supported by the instance type.
     * </p>
     *
     * @param supportedArchitectures <p>
     *            A list of architectures supported by the instance type.
     *            </p>
     */
    public void setSupportedArchitectures(java.util.Collection<String> supportedArchitectures) {
        if (supportedArchitectures == null) {
            this.supportedArchitectures = null;
            return;
        }

        this.supportedArchitectures = new java.util.ArrayList<String>(supportedArchitectures);
    }

    /**
     * <p>
     * A list of architectures supported by the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedArchitectures <p>
     *            A list of architectures supported by the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessorInfo withSupportedArchitectures(String... supportedArchitectures) {
        if (getSupportedArchitectures() == null) {
            this.supportedArchitectures = new java.util.ArrayList<String>(
                    supportedArchitectures.length);
        }
        for (String value : supportedArchitectures) {
            this.supportedArchitectures.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of architectures supported by the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedArchitectures <p>
     *            A list of architectures supported by the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessorInfo withSupportedArchitectures(
            java.util.Collection<String> supportedArchitectures) {
        setSupportedArchitectures(supportedArchitectures);
        return this;
    }

    /**
     * <p>
     * The speed of the processor, in GHz.
     * </p>
     *
     * @return <p>
     *         The speed of the processor, in GHz.
     *         </p>
     */
    public Double getSustainedClockSpeedInGhz() {
        return sustainedClockSpeedInGhz;
    }

    /**
     * <p>
     * The speed of the processor, in GHz.
     * </p>
     *
     * @param sustainedClockSpeedInGhz <p>
     *            The speed of the processor, in GHz.
     *            </p>
     */
    public void setSustainedClockSpeedInGhz(Double sustainedClockSpeedInGhz) {
        this.sustainedClockSpeedInGhz = sustainedClockSpeedInGhz;
    }

    /**
     * <p>
     * The speed of the processor, in GHz.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sustainedClockSpeedInGhz <p>
     *            The speed of the processor, in GHz.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessorInfo withSustainedClockSpeedInGhz(Double sustainedClockSpeedInGhz) {
        this.sustainedClockSpeedInGhz = sustainedClockSpeedInGhz;
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
        if (getSupportedArchitectures() != null)
            sb.append("SupportedArchitectures: " + getSupportedArchitectures() + ",");
        if (getSustainedClockSpeedInGhz() != null)
            sb.append("SustainedClockSpeedInGhz: " + getSustainedClockSpeedInGhz());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSupportedArchitectures() == null) ? 0 : getSupportedArchitectures()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSustainedClockSpeedInGhz() == null) ? 0 : getSustainedClockSpeedInGhz()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessorInfo == false)
            return false;
        ProcessorInfo other = (ProcessorInfo) obj;

        if (other.getSupportedArchitectures() == null ^ this.getSupportedArchitectures() == null)
            return false;
        if (other.getSupportedArchitectures() != null
                && other.getSupportedArchitectures().equals(this.getSupportedArchitectures()) == false)
            return false;
        if (other.getSustainedClockSpeedInGhz() == null
                ^ this.getSustainedClockSpeedInGhz() == null)
            return false;
        if (other.getSustainedClockSpeedInGhz() != null
                && other.getSustainedClockSpeedInGhz().equals(this.getSustainedClockSpeedInGhz()) == false)
            return false;
        return true;
    }
}
