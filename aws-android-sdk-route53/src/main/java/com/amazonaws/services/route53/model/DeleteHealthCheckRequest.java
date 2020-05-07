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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a health check.
 * </p>
 * <important>
 * <p>
 * Amazon Route 53 does not prevent you from deleting a health check even if the
 * health check is associated with one or more resource record sets. If you
 * delete a health check and you don't update the associated resource record
 * sets, the future status of the health check can't be predicted and may
 * change. This will affect the routing of DNS queries for your DNS failover
 * configuration. For more information, see <a href=
 * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/health-checks-creating-deleting.html#health-checks-deleting.html"
 * >Replacing and Deleting Health Checks</a> in the <i>Amazon Route 53 Developer
 * Guide</i>.
 * </p>
 * </important>
 * <p>
 * If you're using AWS Cloud Map and you configured Cloud Map to create a Route
 * 53 health check when you register an instance, you can't use the Route 53
 * <code>DeleteHealthCheck</code> command to delete the health check. The health
 * check is deleted automatically when you deregister the instance; there can be
 * a delay of several hours before the health check is deleted from Route 53.
 * </p>
 */
public class DeleteHealthCheckRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the health check that you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String healthCheckId;

    /**
     * <p>
     * The ID of the health check that you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         The ID of the health check that you want to delete.
     *         </p>
     */
    public String getHealthCheckId() {
        return healthCheckId;
    }

    /**
     * <p>
     * The ID of the health check that you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param healthCheckId <p>
     *            The ID of the health check that you want to delete.
     *            </p>
     */
    public void setHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
    }

    /**
     * <p>
     * The ID of the health check that you want to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param healthCheckId <p>
     *            The ID of the health check that you want to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteHealthCheckRequest withHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
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
        if (getHealthCheckId() != null)
            sb.append("HealthCheckId: " + getHealthCheckId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHealthCheckId() == null) ? 0 : getHealthCheckId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteHealthCheckRequest == false)
            return false;
        DeleteHealthCheckRequest other = (DeleteHealthCheckRequest) obj;

        if (other.getHealthCheckId() == null ^ this.getHealthCheckId() == null)
            return false;
        if (other.getHealthCheckId() != null
                && other.getHealthCheckId().equals(this.getHealthCheckId()) == false)
            return false;
        return true;
    }
}
