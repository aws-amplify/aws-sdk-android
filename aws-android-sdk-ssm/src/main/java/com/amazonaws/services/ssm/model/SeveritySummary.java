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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * The number of managed instances found for each patch severity level defined
 * in the request filter.
 * </p>
 */
public class SeveritySummary implements Serializable {
    /**
     * <p>
     * The total number of resources or compliance items that have a severity
     * level of critical. Critical severity is determined by the organization
     * that published the compliance items.
     * </p>
     */
    private Integer criticalCount;

    /**
     * <p>
     * The total number of resources or compliance items that have a severity
     * level of high. High severity is determined by the organization that
     * published the compliance items.
     * </p>
     */
    private Integer highCount;

    /**
     * <p>
     * The total number of resources or compliance items that have a severity
     * level of medium. Medium severity is determined by the organization that
     * published the compliance items.
     * </p>
     */
    private Integer mediumCount;

    /**
     * <p>
     * The total number of resources or compliance items that have a severity
     * level of low. Low severity is determined by the organization that
     * published the compliance items.
     * </p>
     */
    private Integer lowCount;

    /**
     * <p>
     * The total number of resources or compliance items that have a severity
     * level of informational. Informational severity is determined by the
     * organization that published the compliance items.
     * </p>
     */
    private Integer informationalCount;

    /**
     * <p>
     * The total number of resources or compliance items that have a severity
     * level of unspecified. Unspecified severity is determined by the
     * organization that published the compliance items.
     * </p>
     */
    private Integer unspecifiedCount;

    /**
     * <p>
     * The total number of resources or compliance items that have a severity
     * level of critical. Critical severity is determined by the organization
     * that published the compliance items.
     * </p>
     *
     * @return <p>
     *         The total number of resources or compliance items that have a
     *         severity level of critical. Critical severity is determined by
     *         the organization that published the compliance items.
     *         </p>
     */
    public Integer getCriticalCount() {
        return criticalCount;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity
     * level of critical. Critical severity is determined by the organization
     * that published the compliance items.
     * </p>
     *
     * @param criticalCount <p>
     *            The total number of resources or compliance items that have a
     *            severity level of critical. Critical severity is determined by
     *            the organization that published the compliance items.
     *            </p>
     */
    public void setCriticalCount(Integer criticalCount) {
        this.criticalCount = criticalCount;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity
     * level of critical. Critical severity is determined by the organization
     * that published the compliance items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param criticalCount <p>
     *            The total number of resources or compliance items that have a
     *            severity level of critical. Critical severity is determined by
     *            the organization that published the compliance items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SeveritySummary withCriticalCount(Integer criticalCount) {
        this.criticalCount = criticalCount;
        return this;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity
     * level of high. High severity is determined by the organization that
     * published the compliance items.
     * </p>
     *
     * @return <p>
     *         The total number of resources or compliance items that have a
     *         severity level of high. High severity is determined by the
     *         organization that published the compliance items.
     *         </p>
     */
    public Integer getHighCount() {
        return highCount;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity
     * level of high. High severity is determined by the organization that
     * published the compliance items.
     * </p>
     *
     * @param highCount <p>
     *            The total number of resources or compliance items that have a
     *            severity level of high. High severity is determined by the
     *            organization that published the compliance items.
     *            </p>
     */
    public void setHighCount(Integer highCount) {
        this.highCount = highCount;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity
     * level of high. High severity is determined by the organization that
     * published the compliance items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param highCount <p>
     *            The total number of resources or compliance items that have a
     *            severity level of high. High severity is determined by the
     *            organization that published the compliance items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SeveritySummary withHighCount(Integer highCount) {
        this.highCount = highCount;
        return this;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity
     * level of medium. Medium severity is determined by the organization that
     * published the compliance items.
     * </p>
     *
     * @return <p>
     *         The total number of resources or compliance items that have a
     *         severity level of medium. Medium severity is determined by the
     *         organization that published the compliance items.
     *         </p>
     */
    public Integer getMediumCount() {
        return mediumCount;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity
     * level of medium. Medium severity is determined by the organization that
     * published the compliance items.
     * </p>
     *
     * @param mediumCount <p>
     *            The total number of resources or compliance items that have a
     *            severity level of medium. Medium severity is determined by the
     *            organization that published the compliance items.
     *            </p>
     */
    public void setMediumCount(Integer mediumCount) {
        this.mediumCount = mediumCount;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity
     * level of medium. Medium severity is determined by the organization that
     * published the compliance items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediumCount <p>
     *            The total number of resources or compliance items that have a
     *            severity level of medium. Medium severity is determined by the
     *            organization that published the compliance items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SeveritySummary withMediumCount(Integer mediumCount) {
        this.mediumCount = mediumCount;
        return this;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity
     * level of low. Low severity is determined by the organization that
     * published the compliance items.
     * </p>
     *
     * @return <p>
     *         The total number of resources or compliance items that have a
     *         severity level of low. Low severity is determined by the
     *         organization that published the compliance items.
     *         </p>
     */
    public Integer getLowCount() {
        return lowCount;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity
     * level of low. Low severity is determined by the organization that
     * published the compliance items.
     * </p>
     *
     * @param lowCount <p>
     *            The total number of resources or compliance items that have a
     *            severity level of low. Low severity is determined by the
     *            organization that published the compliance items.
     *            </p>
     */
    public void setLowCount(Integer lowCount) {
        this.lowCount = lowCount;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity
     * level of low. Low severity is determined by the organization that
     * published the compliance items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lowCount <p>
     *            The total number of resources or compliance items that have a
     *            severity level of low. Low severity is determined by the
     *            organization that published the compliance items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SeveritySummary withLowCount(Integer lowCount) {
        this.lowCount = lowCount;
        return this;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity
     * level of informational. Informational severity is determined by the
     * organization that published the compliance items.
     * </p>
     *
     * @return <p>
     *         The total number of resources or compliance items that have a
     *         severity level of informational. Informational severity is
     *         determined by the organization that published the compliance
     *         items.
     *         </p>
     */
    public Integer getInformationalCount() {
        return informationalCount;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity
     * level of informational. Informational severity is determined by the
     * organization that published the compliance items.
     * </p>
     *
     * @param informationalCount <p>
     *            The total number of resources or compliance items that have a
     *            severity level of informational. Informational severity is
     *            determined by the organization that published the compliance
     *            items.
     *            </p>
     */
    public void setInformationalCount(Integer informationalCount) {
        this.informationalCount = informationalCount;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity
     * level of informational. Informational severity is determined by the
     * organization that published the compliance items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param informationalCount <p>
     *            The total number of resources or compliance items that have a
     *            severity level of informational. Informational severity is
     *            determined by the organization that published the compliance
     *            items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SeveritySummary withInformationalCount(Integer informationalCount) {
        this.informationalCount = informationalCount;
        return this;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity
     * level of unspecified. Unspecified severity is determined by the
     * organization that published the compliance items.
     * </p>
     *
     * @return <p>
     *         The total number of resources or compliance items that have a
     *         severity level of unspecified. Unspecified severity is determined
     *         by the organization that published the compliance items.
     *         </p>
     */
    public Integer getUnspecifiedCount() {
        return unspecifiedCount;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity
     * level of unspecified. Unspecified severity is determined by the
     * organization that published the compliance items.
     * </p>
     *
     * @param unspecifiedCount <p>
     *            The total number of resources or compliance items that have a
     *            severity level of unspecified. Unspecified severity is
     *            determined by the organization that published the compliance
     *            items.
     *            </p>
     */
    public void setUnspecifiedCount(Integer unspecifiedCount) {
        this.unspecifiedCount = unspecifiedCount;
    }

    /**
     * <p>
     * The total number of resources or compliance items that have a severity
     * level of unspecified. Unspecified severity is determined by the
     * organization that published the compliance items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unspecifiedCount <p>
     *            The total number of resources or compliance items that have a
     *            severity level of unspecified. Unspecified severity is
     *            determined by the organization that published the compliance
     *            items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SeveritySummary withUnspecifiedCount(Integer unspecifiedCount) {
        this.unspecifiedCount = unspecifiedCount;
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
        if (getCriticalCount() != null)
            sb.append("CriticalCount: " + getCriticalCount() + ",");
        if (getHighCount() != null)
            sb.append("HighCount: " + getHighCount() + ",");
        if (getMediumCount() != null)
            sb.append("MediumCount: " + getMediumCount() + ",");
        if (getLowCount() != null)
            sb.append("LowCount: " + getLowCount() + ",");
        if (getInformationalCount() != null)
            sb.append("InformationalCount: " + getInformationalCount() + ",");
        if (getUnspecifiedCount() != null)
            sb.append("UnspecifiedCount: " + getUnspecifiedCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCriticalCount() == null) ? 0 : getCriticalCount().hashCode());
        hashCode = prime * hashCode + ((getHighCount() == null) ? 0 : getHighCount().hashCode());
        hashCode = prime * hashCode
                + ((getMediumCount() == null) ? 0 : getMediumCount().hashCode());
        hashCode = prime * hashCode + ((getLowCount() == null) ? 0 : getLowCount().hashCode());
        hashCode = prime * hashCode
                + ((getInformationalCount() == null) ? 0 : getInformationalCount().hashCode());
        hashCode = prime * hashCode
                + ((getUnspecifiedCount() == null) ? 0 : getUnspecifiedCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SeveritySummary == false)
            return false;
        SeveritySummary other = (SeveritySummary) obj;

        if (other.getCriticalCount() == null ^ this.getCriticalCount() == null)
            return false;
        if (other.getCriticalCount() != null
                && other.getCriticalCount().equals(this.getCriticalCount()) == false)
            return false;
        if (other.getHighCount() == null ^ this.getHighCount() == null)
            return false;
        if (other.getHighCount() != null
                && other.getHighCount().equals(this.getHighCount()) == false)
            return false;
        if (other.getMediumCount() == null ^ this.getMediumCount() == null)
            return false;
        if (other.getMediumCount() != null
                && other.getMediumCount().equals(this.getMediumCount()) == false)
            return false;
        if (other.getLowCount() == null ^ this.getLowCount() == null)
            return false;
        if (other.getLowCount() != null && other.getLowCount().equals(this.getLowCount()) == false)
            return false;
        if (other.getInformationalCount() == null ^ this.getInformationalCount() == null)
            return false;
        if (other.getInformationalCount() != null
                && other.getInformationalCount().equals(this.getInformationalCount()) == false)
            return false;
        if (other.getUnspecifiedCount() == null ^ this.getUnspecifiedCount() == null)
            return false;
        if (other.getUnspecifiedCount() != null
                && other.getUnspecifiedCount().equals(this.getUnspecifiedCount()) == false)
            return false;
        return true;
    }
}
