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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes the Amazon Route 53 DNS records and health check, if any, that AWS
 * Cloud Map created for the specified instance.
 * </p>
 */
public class DeregisterInstanceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the service that the instance is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String serviceId;

    /**
     * <p>
     * The value that you specified for <code>Id</code> in the <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The ID of the service that the instance is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         The ID of the service that the instance is associated with.
     *         </p>
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * <p>
     * The ID of the service that the instance is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param serviceId <p>
     *            The ID of the service that the instance is associated with.
     *            </p>
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the service that the instance is associated with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param serviceId <p>
     *            The ID of the service that the instance is associated with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeregisterInstanceRequest withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * <p>
     * The value that you specified for <code>Id</code> in the <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         The value that you specified for <code>Id</code> in the <a href=
     *         "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     *         >RegisterInstance</a> request.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The value that you specified for <code>Id</code> in the <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param instanceId <p>
     *            The value that you specified for <code>Id</code> in the <a
     *            href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     *            >RegisterInstance</a> request.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The value that you specified for <code>Id</code> in the <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     * >RegisterInstance</a> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param instanceId <p>
     *            The value that you specified for <code>Id</code> in the <a
     *            href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
     *            >RegisterInstance</a> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeregisterInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
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
        if (getServiceId() != null)
            sb.append("ServiceId: " + getServiceId() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterInstanceRequest == false)
            return false;
        DeregisterInstanceRequest other = (DeregisterInstanceRequest) obj;

        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null
                && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        return true;
    }
}
