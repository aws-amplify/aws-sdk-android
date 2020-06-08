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
 * Submits a request to perform the following operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Update the TTL setting for existing <code>DnsRecords</code> configurations
 * </p>
 * </li>
 * <li>
 * <p>
 * Add, update, or delete <code>HealthCheckConfig</code> for a specified service
 * </p>
 * <note>
 * <p>
 * You can't add, update, or delete a <code>HealthCheckCustomConfig</code>
 * configuration.
 * </p>
 * </note></li>
 * </ul>
 * <p>
 * For public and private DNS namespaces, note the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * If you omit any existing <code>DnsRecords</code> or
 * <code>HealthCheckConfig</code> configurations from an
 * <code>UpdateService</code> request, the configurations are deleted from the
 * service.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you omit an existing <code>HealthCheckCustomConfig</code> configuration
 * from an <code>UpdateService</code> request, the configuration is not deleted
 * from the service.
 * </p>
 * </li>
 * </ul>
 * <p>
 * When you update settings for a service, AWS Cloud Map also updates the
 * corresponding settings in all the records and health checks that were created
 * by using the specified service.
 * </p>
 */
public class UpdateServiceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the service that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String id;

    /**
     * <p>
     * A complex type that contains the new settings for the service.
     * </p>
     */
    private ServiceChange service;

    /**
     * <p>
     * The ID of the service that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         The ID of the service that you want to update.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the service that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param id <p>
     *            The ID of the service that you want to update.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the service that you want to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param id <p>
     *            The ID of the service that you want to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateServiceRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * A complex type that contains the new settings for the service.
     * </p>
     *
     * @return <p>
     *         A complex type that contains the new settings for the service.
     *         </p>
     */
    public ServiceChange getService() {
        return service;
    }

    /**
     * <p>
     * A complex type that contains the new settings for the service.
     * </p>
     *
     * @param service <p>
     *            A complex type that contains the new settings for the service.
     *            </p>
     */
    public void setService(ServiceChange service) {
        this.service = service;
    }

    /**
     * <p>
     * A complex type that contains the new settings for the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param service <p>
     *            A complex type that contains the new settings for the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateServiceRequest withService(ServiceChange service) {
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getService() != null)
            sb.append("Service: " + getService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServiceRequest == false)
            return false;
        UpdateServiceRequest other = (UpdateServiceRequest) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        return true;
    }
}
