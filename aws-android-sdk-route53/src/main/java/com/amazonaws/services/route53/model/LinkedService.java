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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * If a health check or hosted zone was created by another service,
 * <code>LinkedService</code> is a complex type that describes the service that
 * created the resource. When a resource is created by another service, you
 * can't edit or delete it using Amazon Route 53.
 * </p>
 */
public class LinkedService implements Serializable {
    /**
     * <p>
     * If the health check or hosted zone was created by another service, the
     * service that created the resource. When a resource is created by another
     * service, you can't edit or delete it using Amazon Route 53.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     */
    private String servicePrincipal;

    /**
     * <p>
     * If the health check or hosted zone was created by another service, an
     * optional description that can be provided by the other service. When a
     * resource is created by another service, you can't edit or delete it using
     * Amazon Route 53.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String description;

    /**
     * <p>
     * If the health check or hosted zone was created by another service, the
     * service that created the resource. When a resource is created by another
     * service, you can't edit or delete it using Amazon Route 53.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @return <p>
     *         If the health check or hosted zone was created by another
     *         service, the service that created the resource. When a resource
     *         is created by another service, you can't edit or delete it using
     *         Amazon Route 53.
     *         </p>
     */
    public String getServicePrincipal() {
        return servicePrincipal;
    }

    /**
     * <p>
     * If the health check or hosted zone was created by another service, the
     * service that created the resource. When a resource is created by another
     * service, you can't edit or delete it using Amazon Route 53.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param servicePrincipal <p>
     *            If the health check or hosted zone was created by another
     *            service, the service that created the resource. When a
     *            resource is created by another service, you can't edit or
     *            delete it using Amazon Route 53.
     *            </p>
     */
    public void setServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
    }

    /**
     * <p>
     * If the health check or hosted zone was created by another service, the
     * service that created the resource. When a resource is created by another
     * service, you can't edit or delete it using Amazon Route 53.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param servicePrincipal <p>
     *            If the health check or hosted zone was created by another
     *            service, the service that created the resource. When a
     *            resource is created by another service, you can't edit or
     *            delete it using Amazon Route 53.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LinkedService withServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
        return this;
    }

    /**
     * <p>
     * If the health check or hosted zone was created by another service, an
     * optional description that can be provided by the other service. When a
     * resource is created by another service, you can't edit or delete it using
     * Amazon Route 53.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         If the health check or hosted zone was created by another
     *         service, an optional description that can be provided by the
     *         other service. When a resource is created by another service, you
     *         can't edit or delete it using Amazon Route 53.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * If the health check or hosted zone was created by another service, an
     * optional description that can be provided by the other service. When a
     * resource is created by another service, you can't edit or delete it using
     * Amazon Route 53.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param description <p>
     *            If the health check or hosted zone was created by another
     *            service, an optional description that can be provided by the
     *            other service. When a resource is created by another service,
     *            you can't edit or delete it using Amazon Route 53.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * If the health check or hosted zone was created by another service, an
     * optional description that can be provided by the other service. When a
     * resource is created by another service, you can't edit or delete it using
     * Amazon Route 53.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param description <p>
     *            If the health check or hosted zone was created by another
     *            service, an optional description that can be provided by the
     *            other service. When a resource is created by another service,
     *            you can't edit or delete it using Amazon Route 53.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LinkedService withDescription(String description) {
        this.description = description;
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
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
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LinkedService == false)
            return false;
        LinkedService other = (LinkedService) obj;

        if (other.getServicePrincipal() == null ^ this.getServicePrincipal() == null)
            return false;
        if (other.getServicePrincipal() != null
                && other.getServicePrincipal().equals(this.getServicePrincipal()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
