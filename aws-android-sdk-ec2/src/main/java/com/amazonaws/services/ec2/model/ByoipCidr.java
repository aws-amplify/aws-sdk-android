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
 * Information about an address range that is provisioned for use with your AWS
 * resources through bring your own IP addresses (BYOIP).
 * </p>
 */
public class ByoipCidr implements Serializable {
    /**
     * <p>
     * The address range, in CIDR notation.
     * </p>
     */
    private String cidr;

    /**
     * <p>
     * The description of the address range.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Upon success, contains the ID of the address pool. Otherwise, contains an
     * error message.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The state of the address pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>advertised, deprovisioned, failed-deprovision,
     * failed-provision, pending-deprovision, pending-provision, provisioned,
     * provisioned-not-publicly-advertisable
     */
    private String state;

    /**
     * <p>
     * The address range, in CIDR notation.
     * </p>
     *
     * @return <p>
     *         The address range, in CIDR notation.
     *         </p>
     */
    public String getCidr() {
        return cidr;
    }

    /**
     * <p>
     * The address range, in CIDR notation.
     * </p>
     *
     * @param cidr <p>
     *            The address range, in CIDR notation.
     *            </p>
     */
    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The address range, in CIDR notation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidr <p>
     *            The address range, in CIDR notation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ByoipCidr withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * <p>
     * The description of the address range.
     * </p>
     *
     * @return <p>
     *         The description of the address range.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the address range.
     * </p>
     *
     * @param description <p>
     *            The description of the address range.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the address range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the address range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ByoipCidr withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Upon success, contains the ID of the address pool. Otherwise, contains an
     * error message.
     * </p>
     *
     * @return <p>
     *         Upon success, contains the ID of the address pool. Otherwise,
     *         contains an error message.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * Upon success, contains the ID of the address pool. Otherwise, contains an
     * error message.
     * </p>
     *
     * @param statusMessage <p>
     *            Upon success, contains the ID of the address pool. Otherwise,
     *            contains an error message.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Upon success, contains the ID of the address pool. Otherwise, contains an
     * error message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            Upon success, contains the ID of the address pool. Otherwise,
     *            contains an error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ByoipCidr withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * The state of the address pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>advertised, deprovisioned, failed-deprovision,
     * failed-provision, pending-deprovision, pending-provision, provisioned,
     * provisioned-not-publicly-advertisable
     *
     * @return <p>
     *         The state of the address pool.
     *         </p>
     * @see ByoipCidrState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the address pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>advertised, deprovisioned, failed-deprovision,
     * failed-provision, pending-deprovision, pending-provision, provisioned,
     * provisioned-not-publicly-advertisable
     *
     * @param state <p>
     *            The state of the address pool.
     *            </p>
     * @see ByoipCidrState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the address pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>advertised, deprovisioned, failed-deprovision,
     * failed-provision, pending-deprovision, pending-provision, provisioned,
     * provisioned-not-publicly-advertisable
     *
     * @param state <p>
     *            The state of the address pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ByoipCidrState
     */
    public ByoipCidr withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the address pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>advertised, deprovisioned, failed-deprovision,
     * failed-provision, pending-deprovision, pending-provision, provisioned,
     * provisioned-not-publicly-advertisable
     *
     * @param state <p>
     *            The state of the address pool.
     *            </p>
     * @see ByoipCidrState
     */
    public void setState(ByoipCidrState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the address pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>advertised, deprovisioned, failed-deprovision,
     * failed-provision, pending-deprovision, pending-provision, provisioned,
     * provisioned-not-publicly-advertisable
     *
     * @param state <p>
     *            The state of the address pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ByoipCidrState
     */
    public ByoipCidr withState(ByoipCidrState state) {
        this.state = state.toString();
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
        if (getCidr() != null)
            sb.append("Cidr: " + getCidr() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getState() != null)
            sb.append("State: " + getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ByoipCidr == false)
            return false;
        ByoipCidr other = (ByoipCidr) obj;

        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }
}
