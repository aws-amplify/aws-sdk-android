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

package com.amazonaws.services.awsresourceaccessmanager.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the shareable resource types and the AWS services to which
 * they belong.
 * </p>
 */
public class ServiceNameAndResourceType implements Serializable {
    /**
     * <p>
     * The shareable resource types.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The name of the AWS services to which the resources belong.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The shareable resource types.
     * </p>
     *
     * @return <p>
     *         The shareable resource types.
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The shareable resource types.
     * </p>
     *
     * @param resourceType <p>
     *            The shareable resource types.
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The shareable resource types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceType <p>
     *            The shareable resource types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceNameAndResourceType withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The name of the AWS services to which the resources belong.
     * </p>
     *
     * @return <p>
     *         The name of the AWS services to which the resources belong.
     *         </p>
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * <p>
     * The name of the AWS services to which the resources belong.
     * </p>
     *
     * @param serviceName <p>
     *            The name of the AWS services to which the resources belong.
     *            </p>
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the AWS services to which the resources belong.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceName <p>
     *            The name of the AWS services to which the resources belong.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceNameAndResourceType withServiceName(String serviceName) {
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
        if (getResourceType() != null)
            sb.append("resourceType: " + getResourceType() + ",");
        if (getServiceName() != null)
            sb.append("serviceName: " + getServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
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

        if (obj instanceof ServiceNameAndResourceType == false)
            return false;
        ServiceNameAndResourceType other = (ServiceNameAndResourceType) obj;

        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null
                && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        return true;
    }
}
