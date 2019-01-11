/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * The description of the Time to Live (TTL) status on the specified table.
 * </p>
 */
public class TimeToLiveDescription implements Serializable {
    /**
     * <p>
     * The Time to Live status for the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, DISABLING, ENABLED, DISABLED
     */
    private String timeToLiveStatus;

    /**
     * <p>
     * The name of the Time to Live attribute for items in the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String attributeName;

    /**
     * <p>
     * The Time to Live status for the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, DISABLING, ENABLED, DISABLED
     *
     * @return <p>
     *         The Time to Live status for the table.
     *         </p>
     * @see TimeToLiveStatus
     */
    public String getTimeToLiveStatus() {
        return timeToLiveStatus;
    }

    /**
     * <p>
     * The Time to Live status for the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, DISABLING, ENABLED, DISABLED
     *
     * @param timeToLiveStatus <p>
     *            The Time to Live status for the table.
     *            </p>
     * @see TimeToLiveStatus
     */
    public void setTimeToLiveStatus(String timeToLiveStatus) {
        this.timeToLiveStatus = timeToLiveStatus;
    }

    /**
     * <p>
     * The Time to Live status for the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, DISABLING, ENABLED, DISABLED
     *
     * @param timeToLiveStatus <p>
     *            The Time to Live status for the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TimeToLiveStatus
     */
    public TimeToLiveDescription withTimeToLiveStatus(String timeToLiveStatus) {
        this.timeToLiveStatus = timeToLiveStatus;
        return this;
    }

    /**
     * <p>
     * The Time to Live status for the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, DISABLING, ENABLED, DISABLED
     *
     * @param timeToLiveStatus <p>
     *            The Time to Live status for the table.
     *            </p>
     * @see TimeToLiveStatus
     */
    public void setTimeToLiveStatus(TimeToLiveStatus timeToLiveStatus) {
        this.timeToLiveStatus = timeToLiveStatus.toString();
    }

    /**
     * <p>
     * The Time to Live status for the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, DISABLING, ENABLED, DISABLED
     *
     * @param timeToLiveStatus <p>
     *            The Time to Live status for the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TimeToLiveStatus
     */
    public TimeToLiveDescription withTimeToLiveStatus(TimeToLiveStatus timeToLiveStatus) {
        this.timeToLiveStatus = timeToLiveStatus.toString();
        return this;
    }

    /**
     * <p>
     * The name of the Time to Live attribute for items in the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the Time to Live attribute for items in the table.
     *         </p>
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * <p>
     * The name of the Time to Live attribute for items in the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param attributeName <p>
     *            The name of the Time to Live attribute for items in the table.
     *            </p>
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the Time to Live attribute for items in the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param attributeName <p>
     *            The name of the Time to Live attribute for items in the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimeToLiveDescription withAttributeName(String attributeName) {
        this.attributeName = attributeName;
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
        if (getTimeToLiveStatus() != null)
            sb.append("TimeToLiveStatus: " + getTimeToLiveStatus() + ",");
        if (getAttributeName() != null)
            sb.append("AttributeName: " + getAttributeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTimeToLiveStatus() == null) ? 0 : getTimeToLiveStatus().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeToLiveDescription == false)
            return false;
        TimeToLiveDescription other = (TimeToLiveDescription) obj;

        if (other.getTimeToLiveStatus() == null ^ this.getTimeToLiveStatus() == null)
            return false;
        if (other.getTimeToLiveStatus() != null
                && other.getTimeToLiveStatus().equals(this.getTimeToLiveStatus()) == false)
            return false;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null
                && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        return true;
    }
}
