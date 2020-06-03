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

package com.amazonaws.services.es.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the connection status of an outbound cross-cluster search
 * connection.
 * </p>
 */
public class OutboundCrossClusterSearchConnectionStatus implements Serializable {
    /**
     * <p>
     * The state code for outbound connection. This can be one of the following:
     * </p>
     * <ul>
     * <li>VALIDATING: The outbound connection request is being validated.</li>
     * <li>VALIDATION_FAILED: Validation failed for the connection request.</li>
     * <li>PENDING_ACCEPTANCE: Outbound connection request is validated and is
     * not yet accepted by destination domain owner.</li>
     * <li>PROVISIONING: Outbound connection request is in process.</li>
     * <li>ACTIVE: Outbound connection is active and ready to use.</li>
     * <li>REJECTED: Outbound connection request is rejected by destination
     * domain owner.</li>
     * <li>DELETING: Outbound connection deletion is in progress.</li>
     * <li>DELETED: Outbound connection is deleted and cannot be used further.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_ACCEPTANCE, VALIDATING, VALIDATION_FAILED,
     * PROVISIONING, ACTIVE, REJECTED, DELETING, DELETED
     */
    private String statusCode;

    /**
     * <p>
     * Specifies verbose information for the outbound connection status.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The state code for outbound connection. This can be one of the following:
     * </p>
     * <ul>
     * <li>VALIDATING: The outbound connection request is being validated.</li>
     * <li>VALIDATION_FAILED: Validation failed for the connection request.</li>
     * <li>PENDING_ACCEPTANCE: Outbound connection request is validated and is
     * not yet accepted by destination domain owner.</li>
     * <li>PROVISIONING: Outbound connection request is in process.</li>
     * <li>ACTIVE: Outbound connection is active and ready to use.</li>
     * <li>REJECTED: Outbound connection request is rejected by destination
     * domain owner.</li>
     * <li>DELETING: Outbound connection deletion is in progress.</li>
     * <li>DELETED: Outbound connection is deleted and cannot be used further.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_ACCEPTANCE, VALIDATING, VALIDATION_FAILED,
     * PROVISIONING, ACTIVE, REJECTED, DELETING, DELETED
     *
     * @return <p>
     *         The state code for outbound connection. This can be one of the
     *         following:
     *         </p>
     *         <ul>
     *         <li>VALIDATING: The outbound connection request is being
     *         validated.</li>
     *         <li>VALIDATION_FAILED: Validation failed for the connection
     *         request.</li>
     *         <li>PENDING_ACCEPTANCE: Outbound connection request is validated
     *         and is not yet accepted by destination domain owner.</li>
     *         <li>PROVISIONING: Outbound connection request is in process.</li>
     *         <li>ACTIVE: Outbound connection is active and ready to use.</li>
     *         <li>REJECTED: Outbound connection request is rejected by
     *         destination domain owner.</li>
     *         <li>DELETING: Outbound connection deletion is in progress.</li>
     *         <li>DELETED: Outbound connection is deleted and cannot be used
     *         further.</li>
     *         </ul>
     * @see OutboundCrossClusterSearchConnectionStatusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * <p>
     * The state code for outbound connection. This can be one of the following:
     * </p>
     * <ul>
     * <li>VALIDATING: The outbound connection request is being validated.</li>
     * <li>VALIDATION_FAILED: Validation failed for the connection request.</li>
     * <li>PENDING_ACCEPTANCE: Outbound connection request is validated and is
     * not yet accepted by destination domain owner.</li>
     * <li>PROVISIONING: Outbound connection request is in process.</li>
     * <li>ACTIVE: Outbound connection is active and ready to use.</li>
     * <li>REJECTED: Outbound connection request is rejected by destination
     * domain owner.</li>
     * <li>DELETING: Outbound connection deletion is in progress.</li>
     * <li>DELETED: Outbound connection is deleted and cannot be used further.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_ACCEPTANCE, VALIDATING, VALIDATION_FAILED,
     * PROVISIONING, ACTIVE, REJECTED, DELETING, DELETED
     *
     * @param statusCode <p>
     *            The state code for outbound connection. This can be one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>VALIDATING: The outbound connection request is being
     *            validated.</li>
     *            <li>VALIDATION_FAILED: Validation failed for the connection
     *            request.</li>
     *            <li>PENDING_ACCEPTANCE: Outbound connection request is
     *            validated and is not yet accepted by destination domain owner.
     *            </li>
     *            <li>PROVISIONING: Outbound connection request is in process.</li>
     *            <li>ACTIVE: Outbound connection is active and ready to use.</li>
     *            <li>REJECTED: Outbound connection request is rejected by
     *            destination domain owner.</li>
     *            <li>DELETING: Outbound connection deletion is in progress.</li>
     *            <li>DELETED: Outbound connection is deleted and cannot be used
     *            further.</li>
     *            </ul>
     * @see OutboundCrossClusterSearchConnectionStatusCode
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The state code for outbound connection. This can be one of the following:
     * </p>
     * <ul>
     * <li>VALIDATING: The outbound connection request is being validated.</li>
     * <li>VALIDATION_FAILED: Validation failed for the connection request.</li>
     * <li>PENDING_ACCEPTANCE: Outbound connection request is validated and is
     * not yet accepted by destination domain owner.</li>
     * <li>PROVISIONING: Outbound connection request is in process.</li>
     * <li>ACTIVE: Outbound connection is active and ready to use.</li>
     * <li>REJECTED: Outbound connection request is rejected by destination
     * domain owner.</li>
     * <li>DELETING: Outbound connection deletion is in progress.</li>
     * <li>DELETED: Outbound connection is deleted and cannot be used further.</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_ACCEPTANCE, VALIDATING, VALIDATION_FAILED,
     * PROVISIONING, ACTIVE, REJECTED, DELETING, DELETED
     *
     * @param statusCode <p>
     *            The state code for outbound connection. This can be one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>VALIDATING: The outbound connection request is being
     *            validated.</li>
     *            <li>VALIDATION_FAILED: Validation failed for the connection
     *            request.</li>
     *            <li>PENDING_ACCEPTANCE: Outbound connection request is
     *            validated and is not yet accepted by destination domain owner.
     *            </li>
     *            <li>PROVISIONING: Outbound connection request is in process.</li>
     *            <li>ACTIVE: Outbound connection is active and ready to use.</li>
     *            <li>REJECTED: Outbound connection request is rejected by
     *            destination domain owner.</li>
     *            <li>DELETING: Outbound connection deletion is in progress.</li>
     *            <li>DELETED: Outbound connection is deleted and cannot be used
     *            further.</li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OutboundCrossClusterSearchConnectionStatusCode
     */
    public OutboundCrossClusterSearchConnectionStatus withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * <p>
     * The state code for outbound connection. This can be one of the following:
     * </p>
     * <ul>
     * <li>VALIDATING: The outbound connection request is being validated.</li>
     * <li>VALIDATION_FAILED: Validation failed for the connection request.</li>
     * <li>PENDING_ACCEPTANCE: Outbound connection request is validated and is
     * not yet accepted by destination domain owner.</li>
     * <li>PROVISIONING: Outbound connection request is in process.</li>
     * <li>ACTIVE: Outbound connection is active and ready to use.</li>
     * <li>REJECTED: Outbound connection request is rejected by destination
     * domain owner.</li>
     * <li>DELETING: Outbound connection deletion is in progress.</li>
     * <li>DELETED: Outbound connection is deleted and cannot be used further.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_ACCEPTANCE, VALIDATING, VALIDATION_FAILED,
     * PROVISIONING, ACTIVE, REJECTED, DELETING, DELETED
     *
     * @param statusCode <p>
     *            The state code for outbound connection. This can be one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>VALIDATING: The outbound connection request is being
     *            validated.</li>
     *            <li>VALIDATION_FAILED: Validation failed for the connection
     *            request.</li>
     *            <li>PENDING_ACCEPTANCE: Outbound connection request is
     *            validated and is not yet accepted by destination domain owner.
     *            </li>
     *            <li>PROVISIONING: Outbound connection request is in process.</li>
     *            <li>ACTIVE: Outbound connection is active and ready to use.</li>
     *            <li>REJECTED: Outbound connection request is rejected by
     *            destination domain owner.</li>
     *            <li>DELETING: Outbound connection deletion is in progress.</li>
     *            <li>DELETED: Outbound connection is deleted and cannot be used
     *            further.</li>
     *            </ul>
     * @see OutboundCrossClusterSearchConnectionStatusCode
     */
    public void setStatusCode(OutboundCrossClusterSearchConnectionStatusCode statusCode) {
        this.statusCode = statusCode.toString();
    }

    /**
     * <p>
     * The state code for outbound connection. This can be one of the following:
     * </p>
     * <ul>
     * <li>VALIDATING: The outbound connection request is being validated.</li>
     * <li>VALIDATION_FAILED: Validation failed for the connection request.</li>
     * <li>PENDING_ACCEPTANCE: Outbound connection request is validated and is
     * not yet accepted by destination domain owner.</li>
     * <li>PROVISIONING: Outbound connection request is in process.</li>
     * <li>ACTIVE: Outbound connection is active and ready to use.</li>
     * <li>REJECTED: Outbound connection request is rejected by destination
     * domain owner.</li>
     * <li>DELETING: Outbound connection deletion is in progress.</li>
     * <li>DELETED: Outbound connection is deleted and cannot be used further.</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_ACCEPTANCE, VALIDATING, VALIDATION_FAILED,
     * PROVISIONING, ACTIVE, REJECTED, DELETING, DELETED
     *
     * @param statusCode <p>
     *            The state code for outbound connection. This can be one of the
     *            following:
     *            </p>
     *            <ul>
     *            <li>VALIDATING: The outbound connection request is being
     *            validated.</li>
     *            <li>VALIDATION_FAILED: Validation failed for the connection
     *            request.</li>
     *            <li>PENDING_ACCEPTANCE: Outbound connection request is
     *            validated and is not yet accepted by destination domain owner.
     *            </li>
     *            <li>PROVISIONING: Outbound connection request is in process.</li>
     *            <li>ACTIVE: Outbound connection is active and ready to use.</li>
     *            <li>REJECTED: Outbound connection request is rejected by
     *            destination domain owner.</li>
     *            <li>DELETING: Outbound connection deletion is in progress.</li>
     *            <li>DELETED: Outbound connection is deleted and cannot be used
     *            further.</li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OutboundCrossClusterSearchConnectionStatusCode
     */
    public OutboundCrossClusterSearchConnectionStatus withStatusCode(
            OutboundCrossClusterSearchConnectionStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * Specifies verbose information for the outbound connection status.
     * </p>
     *
     * @return <p>
     *         Specifies verbose information for the outbound connection status.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * Specifies verbose information for the outbound connection status.
     * </p>
     *
     * @param message <p>
     *            Specifies verbose information for the outbound connection
     *            status.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Specifies verbose information for the outbound connection status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            Specifies verbose information for the outbound connection
     *            status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutboundCrossClusterSearchConnectionStatus withMessage(String message) {
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
        if (getStatusCode() != null)
            sb.append("StatusCode: " + getStatusCode() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutboundCrossClusterSearchConnectionStatus == false)
            return false;
        OutboundCrossClusterSearchConnectionStatus other = (OutboundCrossClusterSearchConnectionStatus) obj;

        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null
                && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }
}
