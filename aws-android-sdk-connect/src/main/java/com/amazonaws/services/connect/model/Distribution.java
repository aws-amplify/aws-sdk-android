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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a traffic distribution.
 * </p>
 */
public class Distribution implements Serializable {
    /**
     * <p>
     * The Amazon Web Services Region where the traffic is distributed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 31<br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     */
    private String region;

    /**
     * <p>
     * The percentage of the traffic that is distributed, in increments of 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer percentage;

    /**
     * <p>
     * The Amazon Web Services Region where the traffic is distributed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 31<br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     *
     * @return <p>
     *         The Amazon Web Services Region where the traffic is distributed.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The Amazon Web Services Region where the traffic is distributed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 31<br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     *
     * @param region <p>
     *            The Amazon Web Services Region where the traffic is
     *            distributed.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services Region where the traffic is distributed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 31<br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     *
     * @param region <p>
     *            The Amazon Web Services Region where the traffic is
     *            distributed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Distribution withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <p>
     * The percentage of the traffic that is distributed, in increments of 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         The percentage of the traffic that is distributed, in increments
     *         of 10.
     *         </p>
     */
    public Integer getPercentage() {
        return percentage;
    }

    /**
     * <p>
     * The percentage of the traffic that is distributed, in increments of 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param percentage <p>
     *            The percentage of the traffic that is distributed, in
     *            increments of 10.
     *            </p>
     */
    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    /**
     * <p>
     * The percentage of the traffic that is distributed, in increments of 10.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param percentage <p>
     *            The percentage of the traffic that is distributed, in
     *            increments of 10.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Distribution withPercentage(Integer percentage) {
        this.percentage = percentage;
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
        if (getRegion() != null)
            sb.append("Region: " + getRegion() + ",");
        if (getPercentage() != null)
            sb.append("Percentage: " + getPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getPercentage() == null) ? 0 : getPercentage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Distribution == false)
            return false;
        Distribution other = (Distribution) obj;

        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getPercentage() == null ^ this.getPercentage() == null)
            return false;
        if (other.getPercentage() != null
                && other.getPercentage().equals(this.getPercentage()) == false)
            return false;
        return true;
    }
}
