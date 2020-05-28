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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

public class KafkaVersion implements Serializable {
    /**
     * The new value for the version property for this object.
     */
    private String version;

    /**
     * The new value for the status property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DEPRECATED
     */
    private String status;

    /**
     * Returns the value of the version property for this object.
     *
     * @return The value of the version property for this object.
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of version
     *
     * @param version The new value for the version property for this object.
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Sets the value of the version property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version The new value for the version property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KafkaVersion withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Returns the value of the status property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DEPRECATED
     *
     * @return The value of the status property for this object.
     * @see KafkaVersionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of status
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DEPRECATED
     *
     * @param status The new value for the status property for this object.
     * @see KafkaVersionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Sets the value of the status property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DEPRECATED
     *
     * @param status The new value for the status property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KafkaVersionStatus
     */
    public KafkaVersion withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Sets the value of status
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DEPRECATED
     *
     * @param status The new value for the status property for this object.
     * @see KafkaVersionStatus
     */
    public void setStatus(KafkaVersionStatus status) {
        this.status = status.toString();
    }

    /**
     * Sets the value of the status property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DEPRECATED
     *
     * @param status The new value for the status property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see KafkaVersionStatus
     */
    public KafkaVersion withStatus(KafkaVersionStatus status) {
        this.status = status.toString();
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
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KafkaVersion == false)
            return false;
        KafkaVersion other = (KafkaVersion) obj;

        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
