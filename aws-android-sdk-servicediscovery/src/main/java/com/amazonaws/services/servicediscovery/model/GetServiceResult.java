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

package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;

public class GetServiceResult implements Serializable {
    /**
     * <p>
     * A complex type that contains information about the service.
     * </p>
     */
    private Service service;

    /**
     * <p>
     * A complex type that contains information about the service.
     * </p>
     *
     * @return <p>
     *         A complex type that contains information about the service.
     *         </p>
     */
    public Service getService() {
        return service;
    }

    /**
     * <p>
     * A complex type that contains information about the service.
     * </p>
     *
     * @param service <p>
     *            A complex type that contains information about the service.
     *            </p>
     */
    public void setService(Service service) {
        this.service = service;
    }

    /**
     * <p>
     * A complex type that contains information about the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param service <p>
     *            A complex type that contains information about the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetServiceResult withService(Service service) {
        this.service = service;
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
        if (getService() != null)
            sb.append("Service: " + getService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceResult == false)
            return false;
        GetServiceResult other = (GetServiceResult) obj;

        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        return true;
    }
}
