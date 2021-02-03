/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Parameters to define a mitigation action that changes the state of the device
 * certificate to inactive.
 * </p>
 */
public class UpdateDeviceCertificateParams implements Serializable {
    /**
     * <p>
     * The action that you want to apply to the device certificate. The only
     * supported value is <code>DEACTIVATE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEACTIVATE
     */
    private String action;

    /**
     * <p>
     * The action that you want to apply to the device certificate. The only
     * supported value is <code>DEACTIVATE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEACTIVATE
     *
     * @return <p>
     *         The action that you want to apply to the device certificate. The
     *         only supported value is <code>DEACTIVATE</code>.
     *         </p>
     * @see DeviceCertificateUpdateAction
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * The action that you want to apply to the device certificate. The only
     * supported value is <code>DEACTIVATE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEACTIVATE
     *
     * @param action <p>
     *            The action that you want to apply to the device certificate.
     *            The only supported value is <code>DEACTIVATE</code>.
     *            </p>
     * @see DeviceCertificateUpdateAction
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action that you want to apply to the device certificate. The only
     * supported value is <code>DEACTIVATE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEACTIVATE
     *
     * @param action <p>
     *            The action that you want to apply to the device certificate.
     *            The only supported value is <code>DEACTIVATE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceCertificateUpdateAction
     */
    public UpdateDeviceCertificateParams withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The action that you want to apply to the device certificate. The only
     * supported value is <code>DEACTIVATE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEACTIVATE
     *
     * @param action <p>
     *            The action that you want to apply to the device certificate.
     *            The only supported value is <code>DEACTIVATE</code>.
     *            </p>
     * @see DeviceCertificateUpdateAction
     */
    public void setAction(DeviceCertificateUpdateAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * The action that you want to apply to the device certificate. The only
     * supported value is <code>DEACTIVATE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEACTIVATE
     *
     * @param action <p>
     *            The action that you want to apply to the device certificate.
     *            The only supported value is <code>DEACTIVATE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceCertificateUpdateAction
     */
    public UpdateDeviceCertificateParams withAction(DeviceCertificateUpdateAction action) {
        this.action = action.toString();
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
        if (getAction() != null)
            sb.append("action: " + getAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDeviceCertificateParams == false)
            return false;
        UpdateDeviceCertificateParams other = (UpdateDeviceCertificateParams) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        return true;
    }
}
