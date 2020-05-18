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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

/**
 * <p>
 * The streaming configuration associated with an Amazon Chime Voice Connector.
 * Specifies whether media streaming is enabled for sending to Amazon Kinesis,
 * and shows the retention period for the Amazon Kinesis data, in hours.
 * </p>
 */
public class StreamingConfiguration implements Serializable {
    /**
     * <p>
     * The retention period, in hours, for the Amazon Kinesis data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer dataRetentionInHours;

    /**
     * <p>
     * When true, media streaming to Amazon Kinesis is turned off.
     * </p>
     */
    private Boolean disabled;

    /**
     * <p>
     * The retention period, in hours, for the Amazon Kinesis data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The retention period, in hours, for the Amazon Kinesis data.
     *         </p>
     */
    public Integer getDataRetentionInHours() {
        return dataRetentionInHours;
    }

    /**
     * <p>
     * The retention period, in hours, for the Amazon Kinesis data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param dataRetentionInHours <p>
     *            The retention period, in hours, for the Amazon Kinesis data.
     *            </p>
     */
    public void setDataRetentionInHours(Integer dataRetentionInHours) {
        this.dataRetentionInHours = dataRetentionInHours;
    }

    /**
     * <p>
     * The retention period, in hours, for the Amazon Kinesis data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param dataRetentionInHours <p>
     *            The retention period, in hours, for the Amazon Kinesis data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamingConfiguration withDataRetentionInHours(Integer dataRetentionInHours) {
        this.dataRetentionInHours = dataRetentionInHours;
        return this;
    }

    /**
     * <p>
     * When true, media streaming to Amazon Kinesis is turned off.
     * </p>
     *
     * @return <p>
     *         When true, media streaming to Amazon Kinesis is turned off.
     *         </p>
     */
    public Boolean isDisabled() {
        return disabled;
    }

    /**
     * <p>
     * When true, media streaming to Amazon Kinesis is turned off.
     * </p>
     *
     * @return <p>
     *         When true, media streaming to Amazon Kinesis is turned off.
     *         </p>
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * <p>
     * When true, media streaming to Amazon Kinesis is turned off.
     * </p>
     *
     * @param disabled <p>
     *            When true, media streaming to Amazon Kinesis is turned off.
     *            </p>
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * <p>
     * When true, media streaming to Amazon Kinesis is turned off.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disabled <p>
     *            When true, media streaming to Amazon Kinesis is turned off.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamingConfiguration withDisabled(Boolean disabled) {
        this.disabled = disabled;
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
        if (getDataRetentionInHours() != null)
            sb.append("DataRetentionInHours: " + getDataRetentionInHours() + ",");
        if (getDisabled() != null)
            sb.append("Disabled: " + getDisabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDataRetentionInHours() == null) ? 0 : getDataRetentionInHours().hashCode());
        hashCode = prime * hashCode + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamingConfiguration == false)
            return false;
        StreamingConfiguration other = (StreamingConfiguration) obj;

        if (other.getDataRetentionInHours() == null ^ this.getDataRetentionInHours() == null)
            return false;
        if (other.getDataRetentionInHours() != null
                && other.getDataRetentionInHours().equals(this.getDataRetentionInHours()) == false)
            return false;
        if (other.getDisabled() == null ^ this.getDisabled() == null)
            return false;
        if (other.getDisabled() != null && other.getDisabled().equals(this.getDisabled()) == false)
            return false;
        return true;
    }
}
