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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Utilization metrics of the instance.
 * </p>
 */
public class EC2ResourceUtilization implements Serializable {
    /**
     * <p>
     * Maximum observed or expected CPU utilization of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String maxCpuUtilizationPercentage;

    /**
     * <p>
     * Maximum observed or expected memory utilization of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String maxMemoryUtilizationPercentage;

    /**
     * <p>
     * Maximum observed or expected storage utilization of the instance (does
     * not measure EBS storage).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String maxStorageUtilizationPercentage;

    /**
     * <p>
     * Maximum observed or expected CPU utilization of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         Maximum observed or expected CPU utilization of the instance.
     *         </p>
     */
    public String getMaxCpuUtilizationPercentage() {
        return maxCpuUtilizationPercentage;
    }

    /**
     * <p>
     * Maximum observed or expected CPU utilization of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param maxCpuUtilizationPercentage <p>
     *            Maximum observed or expected CPU utilization of the instance.
     *            </p>
     */
    public void setMaxCpuUtilizationPercentage(String maxCpuUtilizationPercentage) {
        this.maxCpuUtilizationPercentage = maxCpuUtilizationPercentage;
    }

    /**
     * <p>
     * Maximum observed or expected CPU utilization of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param maxCpuUtilizationPercentage <p>
     *            Maximum observed or expected CPU utilization of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EC2ResourceUtilization withMaxCpuUtilizationPercentage(String maxCpuUtilizationPercentage) {
        this.maxCpuUtilizationPercentage = maxCpuUtilizationPercentage;
        return this;
    }

    /**
     * <p>
     * Maximum observed or expected memory utilization of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         Maximum observed or expected memory utilization of the instance.
     *         </p>
     */
    public String getMaxMemoryUtilizationPercentage() {
        return maxMemoryUtilizationPercentage;
    }

    /**
     * <p>
     * Maximum observed or expected memory utilization of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param maxMemoryUtilizationPercentage <p>
     *            Maximum observed or expected memory utilization of the
     *            instance.
     *            </p>
     */
    public void setMaxMemoryUtilizationPercentage(String maxMemoryUtilizationPercentage) {
        this.maxMemoryUtilizationPercentage = maxMemoryUtilizationPercentage;
    }

    /**
     * <p>
     * Maximum observed or expected memory utilization of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param maxMemoryUtilizationPercentage <p>
     *            Maximum observed or expected memory utilization of the
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EC2ResourceUtilization withMaxMemoryUtilizationPercentage(
            String maxMemoryUtilizationPercentage) {
        this.maxMemoryUtilizationPercentage = maxMemoryUtilizationPercentage;
        return this;
    }

    /**
     * <p>
     * Maximum observed or expected storage utilization of the instance (does
     * not measure EBS storage).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         Maximum observed or expected storage utilization of the instance
     *         (does not measure EBS storage).
     *         </p>
     */
    public String getMaxStorageUtilizationPercentage() {
        return maxStorageUtilizationPercentage;
    }

    /**
     * <p>
     * Maximum observed or expected storage utilization of the instance (does
     * not measure EBS storage).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param maxStorageUtilizationPercentage <p>
     *            Maximum observed or expected storage utilization of the
     *            instance (does not measure EBS storage).
     *            </p>
     */
    public void setMaxStorageUtilizationPercentage(String maxStorageUtilizationPercentage) {
        this.maxStorageUtilizationPercentage = maxStorageUtilizationPercentage;
    }

    /**
     * <p>
     * Maximum observed or expected storage utilization of the instance (does
     * not measure EBS storage).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param maxStorageUtilizationPercentage <p>
     *            Maximum observed or expected storage utilization of the
     *            instance (does not measure EBS storage).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EC2ResourceUtilization withMaxStorageUtilizationPercentage(
            String maxStorageUtilizationPercentage) {
        this.maxStorageUtilizationPercentage = maxStorageUtilizationPercentage;
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
        if (getMaxCpuUtilizationPercentage() != null)
            sb.append("MaxCpuUtilizationPercentage: " + getMaxCpuUtilizationPercentage() + ",");
        if (getMaxMemoryUtilizationPercentage() != null)
            sb.append("MaxMemoryUtilizationPercentage: " + getMaxMemoryUtilizationPercentage()
                    + ",");
        if (getMaxStorageUtilizationPercentage() != null)
            sb.append("MaxStorageUtilizationPercentage: " + getMaxStorageUtilizationPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getMaxCpuUtilizationPercentage() == null) ? 0
                        : getMaxCpuUtilizationPercentage().hashCode());
        hashCode = prime
                * hashCode
                + ((getMaxMemoryUtilizationPercentage() == null) ? 0
                        : getMaxMemoryUtilizationPercentage().hashCode());
        hashCode = prime
                * hashCode
                + ((getMaxStorageUtilizationPercentage() == null) ? 0
                        : getMaxStorageUtilizationPercentage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EC2ResourceUtilization == false)
            return false;
        EC2ResourceUtilization other = (EC2ResourceUtilization) obj;

        if (other.getMaxCpuUtilizationPercentage() == null
                ^ this.getMaxCpuUtilizationPercentage() == null)
            return false;
        if (other.getMaxCpuUtilizationPercentage() != null
                && other.getMaxCpuUtilizationPercentage().equals(
                        this.getMaxCpuUtilizationPercentage()) == false)
            return false;
        if (other.getMaxMemoryUtilizationPercentage() == null
                ^ this.getMaxMemoryUtilizationPercentage() == null)
            return false;
        if (other.getMaxMemoryUtilizationPercentage() != null
                && other.getMaxMemoryUtilizationPercentage().equals(
                        this.getMaxMemoryUtilizationPercentage()) == false)
            return false;
        if (other.getMaxStorageUtilizationPercentage() == null
                ^ this.getMaxStorageUtilizationPercentage() == null)
            return false;
        if (other.getMaxStorageUtilizationPercentage() != null
                && other.getMaxStorageUtilizationPercentage().equals(
                        this.getMaxStorageUtilizationPercentage()) == false)
            return false;
        return true;
    }
}
