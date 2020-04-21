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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * Provides status change reason details for the instance fleet.
 * </p>
 * <note>
 * <p>
 * The instance fleet configuration is available only in Amazon EMR versions
 * 4.8.0 and later, excluding 5.0.x versions.
 * </p>
 * </note>
 */
public class InstanceFleetStateChangeReason implements Serializable {
    /**
     * <p>
     * A code corresponding to the reason the state change occurred.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERNAL_ERROR, VALIDATION_ERROR,
     * INSTANCE_FAILURE, CLUSTER_TERMINATED
     */
    private String code;

    /**
     * <p>
     * An explanatory message.
     * </p>
     */
    private String message;

    /**
     * <p>
     * A code corresponding to the reason the state change occurred.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERNAL_ERROR, VALIDATION_ERROR,
     * INSTANCE_FAILURE, CLUSTER_TERMINATED
     *
     * @return <p>
     *         A code corresponding to the reason the state change occurred.
     *         </p>
     * @see InstanceFleetStateChangeReasonCode
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>
     * A code corresponding to the reason the state change occurred.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERNAL_ERROR, VALIDATION_ERROR,
     * INSTANCE_FAILURE, CLUSTER_TERMINATED
     *
     * @param code <p>
     *            A code corresponding to the reason the state change occurred.
     *            </p>
     * @see InstanceFleetStateChangeReasonCode
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * A code corresponding to the reason the state change occurred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERNAL_ERROR, VALIDATION_ERROR,
     * INSTANCE_FAILURE, CLUSTER_TERMINATED
     *
     * @param code <p>
     *            A code corresponding to the reason the state change occurred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceFleetStateChangeReasonCode
     */
    public InstanceFleetStateChangeReason withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * <p>
     * A code corresponding to the reason the state change occurred.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERNAL_ERROR, VALIDATION_ERROR,
     * INSTANCE_FAILURE, CLUSTER_TERMINATED
     *
     * @param code <p>
     *            A code corresponding to the reason the state change occurred.
     *            </p>
     * @see InstanceFleetStateChangeReasonCode
     */
    public void setCode(InstanceFleetStateChangeReasonCode code) {
        this.code = code.toString();
    }

    /**
     * <p>
     * A code corresponding to the reason the state change occurred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERNAL_ERROR, VALIDATION_ERROR,
     * INSTANCE_FAILURE, CLUSTER_TERMINATED
     *
     * @param code <p>
     *            A code corresponding to the reason the state change occurred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceFleetStateChangeReasonCode
     */
    public InstanceFleetStateChangeReason withCode(InstanceFleetStateChangeReasonCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * An explanatory message.
     * </p>
     *
     * @return <p>
     *         An explanatory message.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * An explanatory message.
     * </p>
     *
     * @param message <p>
     *            An explanatory message.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * An explanatory message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            An explanatory message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceFleetStateChangeReason withMessage(String message) {
        this.message = message;
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
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceFleetStateChangeReason == false)
            return false;
        InstanceFleetStateChangeReason other = (InstanceFleetStateChangeReason) obj;

        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }
}
