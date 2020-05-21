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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * The container element for specifying the default Object Lock retention
 * settings for new objects placed in the specified bucket.
 * </p>
 */
public class DefaultRetention implements Serializable {
    /**
     * <p>
     * The default Object Lock retention mode you want to apply to new objects
     * placed in the specified bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     */
    private String mode;

    /**
     * <p>
     * The number of days that you want to specify for the default retention
     * period.
     * </p>
     */
    private Integer days;

    /**
     * <p>
     * The number of years that you want to specify for the default retention
     * period.
     * </p>
     */
    private Integer years;

    /**
     * <p>
     * The default Object Lock retention mode you want to apply to new objects
     * placed in the specified bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @return <p>
     *         The default Object Lock retention mode you want to apply to new
     *         objects placed in the specified bucket.
     *         </p>
     * @see ObjectLockRetentionMode
     */
    public String getMode() {
        return mode;
    }

    /**
     * <p>
     * The default Object Lock retention mode you want to apply to new objects
     * placed in the specified bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @param mode <p>
     *            The default Object Lock retention mode you want to apply to
     *            new objects placed in the specified bucket.
     *            </p>
     * @see ObjectLockRetentionMode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The default Object Lock retention mode you want to apply to new objects
     * placed in the specified bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @param mode <p>
     *            The default Object Lock retention mode you want to apply to
     *            new objects placed in the specified bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectLockRetentionMode
     */
    public DefaultRetention withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * <p>
     * The default Object Lock retention mode you want to apply to new objects
     * placed in the specified bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @param mode <p>
     *            The default Object Lock retention mode you want to apply to
     *            new objects placed in the specified bucket.
     *            </p>
     * @see ObjectLockRetentionMode
     */
    public void setMode(ObjectLockRetentionMode mode) {
        this.mode = mode.toString();
    }

    /**
     * <p>
     * The default Object Lock retention mode you want to apply to new objects
     * placed in the specified bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @param mode <p>
     *            The default Object Lock retention mode you want to apply to
     *            new objects placed in the specified bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectLockRetentionMode
     */
    public DefaultRetention withMode(ObjectLockRetentionMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * The number of days that you want to specify for the default retention
     * period.
     * </p>
     *
     * @return <p>
     *         The number of days that you want to specify for the default
     *         retention period.
     *         </p>
     */
    public Integer getDays() {
        return days;
    }

    /**
     * <p>
     * The number of days that you want to specify for the default retention
     * period.
     * </p>
     *
     * @param days <p>
     *            The number of days that you want to specify for the default
     *            retention period.
     *            </p>
     */
    public void setDays(Integer days) {
        this.days = days;
    }

    /**
     * <p>
     * The number of days that you want to specify for the default retention
     * period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param days <p>
     *            The number of days that you want to specify for the default
     *            retention period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultRetention withDays(Integer days) {
        this.days = days;
        return this;
    }

    /**
     * <p>
     * The number of years that you want to specify for the default retention
     * period.
     * </p>
     *
     * @return <p>
     *         The number of years that you want to specify for the default
     *         retention period.
     *         </p>
     */
    public Integer getYears() {
        return years;
    }

    /**
     * <p>
     * The number of years that you want to specify for the default retention
     * period.
     * </p>
     *
     * @param years <p>
     *            The number of years that you want to specify for the default
     *            retention period.
     *            </p>
     */
    public void setYears(Integer years) {
        this.years = years;
    }

    /**
     * <p>
     * The number of years that you want to specify for the default retention
     * period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param years <p>
     *            The number of years that you want to specify for the default
     *            retention period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultRetention withYears(Integer years) {
        this.years = years;
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
        if (getMode() != null)
            sb.append("Mode: " + getMode() + ",");
        if (getDays() != null)
            sb.append("Days: " + getDays() + ",");
        if (getYears() != null)
            sb.append("Years: " + getYears());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getDays() == null) ? 0 : getDays().hashCode());
        hashCode = prime * hashCode + ((getYears() == null) ? 0 : getYears().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultRetention == false)
            return false;
        DefaultRetention other = (DefaultRetention) obj;

        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getDays() == null ^ this.getDays() == null)
            return false;
        if (other.getDays() != null && other.getDays().equals(this.getDays()) == false)
            return false;
        if (other.getYears() == null ^ this.getYears() == null)
            return false;
        if (other.getYears() != null && other.getYears().equals(this.getYears()) == false)
            return false;
        return true;
    }
}
