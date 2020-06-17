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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

/**
 * <p>
 * An object that represents the criteria for determining a request match.
 * </p>
 */
public class GrpcRouteMatch implements Serializable {
    /**
     * <p>
     * An object that represents the data to match from the request.
     * </p>
     */
    private java.util.List<GrpcRouteMetadata> metadata;

    /**
     * <p>
     * The method name to match from the request. If you specify a name, you
     * must also specify a <code>serviceName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     */
    private String methodName;

    /**
     * <p>
     * The fully qualified domain name for the service to match from the
     * request.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * An object that represents the data to match from the request.
     * </p>
     *
     * @return <p>
     *         An object that represents the data to match from the request.
     *         </p>
     */
    public java.util.List<GrpcRouteMetadata> getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * An object that represents the data to match from the request.
     * </p>
     *
     * @param metadata <p>
     *            An object that represents the data to match from the request.
     *            </p>
     */
    public void setMetadata(java.util.Collection<GrpcRouteMetadata> metadata) {
        if (metadata == null) {
            this.metadata = null;
            return;
        }

        this.metadata = new java.util.ArrayList<GrpcRouteMetadata>(metadata);
    }

    /**
     * <p>
     * An object that represents the data to match from the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metadata <p>
     *            An object that represents the data to match from the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GrpcRouteMatch withMetadata(GrpcRouteMetadata... metadata) {
        if (getMetadata() == null) {
            this.metadata = new java.util.ArrayList<GrpcRouteMetadata>(metadata.length);
        }
        for (GrpcRouteMetadata value : metadata) {
            this.metadata.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An object that represents the data to match from the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metadata <p>
     *            An object that represents the data to match from the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GrpcRouteMatch withMetadata(java.util.Collection<GrpcRouteMetadata> metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * The method name to match from the request. If you specify a name, you
     * must also specify a <code>serviceName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @return <p>
     *         The method name to match from the request. If you specify a name,
     *         you must also specify a <code>serviceName</code>.
     *         </p>
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * <p>
     * The method name to match from the request. If you specify a name, you
     * must also specify a <code>serviceName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param methodName <p>
     *            The method name to match from the request. If you specify a
     *            name, you must also specify a <code>serviceName</code>.
     *            </p>
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    /**
     * <p>
     * The method name to match from the request. If you specify a name, you
     * must also specify a <code>serviceName</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param methodName <p>
     *            The method name to match from the request. If you specify a
     *            name, you must also specify a <code>serviceName</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GrpcRouteMatch withMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }

    /**
     * <p>
     * The fully qualified domain name for the service to match from the
     * request.
     * </p>
     *
     * @return <p>
     *         The fully qualified domain name for the service to match from the
     *         request.
     *         </p>
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * <p>
     * The fully qualified domain name for the service to match from the
     * request.
     * </p>
     *
     * @param serviceName <p>
     *            The fully qualified domain name for the service to match from
     *            the request.
     *            </p>
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The fully qualified domain name for the service to match from the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceName <p>
     *            The fully qualified domain name for the service to match from
     *            the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GrpcRouteMatch withServiceName(String serviceName) {
        this.serviceName = serviceName;
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
        if (getMetadata() != null)
            sb.append("metadata: " + getMetadata() + ",");
        if (getMethodName() != null)
            sb.append("methodName: " + getMethodName() + ",");
        if (getServiceName() != null)
            sb.append("serviceName: " + getServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getMethodName() == null) ? 0 : getMethodName().hashCode());
        hashCode = prime * hashCode
                + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GrpcRouteMatch == false)
            return false;
        GrpcRouteMatch other = (GrpcRouteMatch) obj;

        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getMethodName() == null ^ this.getMethodName() == null)
            return false;
        if (other.getMethodName() != null
                && other.getMethodName().equals(this.getMethodName()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null
                && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        return true;
    }
}
