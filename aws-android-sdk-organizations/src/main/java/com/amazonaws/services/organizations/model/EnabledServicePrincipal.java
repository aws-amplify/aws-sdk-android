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

package com.amazonaws.services.organizations.model;

import java.io.Serializable;

/**
 * <p>
 * A structure that contains details of a service principal that represents an
 * AWS service that is enabled to integrate with AWS Organizations.
 * </p>
 */
public class EnabledServicePrincipal implements Serializable {
    /**
     * <p>
     * The name of the service principal. This is typically in the form of a
     * URL, such as: <code> <i>servicename</i>.amazonaws.com</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String servicePrincipal;

    /**
     * <p>
     * The date that the service principal was enabled for integration with AWS
     * Organizations.
     * </p>
     */
    private java.util.Date dateEnabled;

    /**
     * <p>
     * The name of the service principal. This is typically in the form of a
     * URL, such as: <code> <i>servicename</i>.amazonaws.com</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return <p>
     *         The name of the service principal. This is typically in the form
     *         of a URL, such as: <code> <i>servicename</i>.amazonaws.com</code>
     *         .
     *         </p>
     */
    public String getServicePrincipal() {
        return servicePrincipal;
    }

    /**
     * <p>
     * The name of the service principal. This is typically in the form of a
     * URL, such as: <code> <i>servicename</i>.amazonaws.com</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param servicePrincipal <p>
     *            The name of the service principal. This is typically in the
     *            form of a URL, such as:
     *            <code> <i>servicename</i>.amazonaws.com</code>.
     *            </p>
     */
    public void setServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
    }

    /**
     * <p>
     * The name of the service principal. This is typically in the form of a
     * URL, such as: <code> <i>servicename</i>.amazonaws.com</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param servicePrincipal <p>
     *            The name of the service principal. This is typically in the
     *            form of a URL, such as:
     *            <code> <i>servicename</i>.amazonaws.com</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnabledServicePrincipal withServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
        return this;
    }

    /**
     * <p>
     * The date that the service principal was enabled for integration with AWS
     * Organizations.
     * </p>
     *
     * @return <p>
     *         The date that the service principal was enabled for integration
     *         with AWS Organizations.
     *         </p>
     */
    public java.util.Date getDateEnabled() {
        return dateEnabled;
    }

    /**
     * <p>
     * The date that the service principal was enabled for integration with AWS
     * Organizations.
     * </p>
     *
     * @param dateEnabled <p>
     *            The date that the service principal was enabled for
     *            integration with AWS Organizations.
     *            </p>
     */
    public void setDateEnabled(java.util.Date dateEnabled) {
        this.dateEnabled = dateEnabled;
    }

    /**
     * <p>
     * The date that the service principal was enabled for integration with AWS
     * Organizations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateEnabled <p>
     *            The date that the service principal was enabled for
     *            integration with AWS Organizations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnabledServicePrincipal withDateEnabled(java.util.Date dateEnabled) {
        this.dateEnabled = dateEnabled;
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
        if (getServicePrincipal() != null)
            sb.append("ServicePrincipal: " + getServicePrincipal() + ",");
        if (getDateEnabled() != null)
            sb.append("DateEnabled: " + getDateEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getServicePrincipal() == null) ? 0 : getServicePrincipal().hashCode());
        hashCode = prime * hashCode
                + ((getDateEnabled() == null) ? 0 : getDateEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnabledServicePrincipal == false)
            return false;
        EnabledServicePrincipal other = (EnabledServicePrincipal) obj;

        if (other.getServicePrincipal() == null ^ this.getServicePrincipal() == null)
            return false;
        if (other.getServicePrincipal() != null
                && other.getServicePrincipal().equals(this.getServicePrincipal()) == false)
            return false;
        if (other.getDateEnabled() == null ^ this.getDateEnabled() == null)
            return false;
        if (other.getDateEnabled() != null
                && other.getDateEnabled().equals(this.getDateEnabled()) == false)
            return false;
        return true;
    }
}
