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

package com.amazonaws.services.amazonroute53.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the resource record sets in a specified hosted zone that were created
 * based on the settings in a specified traffic policy version.
 * </p>
 * <p>
 * When you update a traffic policy instance, Amazon Route 53 continues to
 * respond to DNS queries for the root resource record set name (such as
 * example.com) while it replaces one group of resource record sets with
 * another. Route 53 performs the following operations:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Route 53 creates a new group of resource record sets based on the specified
 * traffic policy. This is true regardless of how significant the differences
 * are between the existing resource record sets and the new resource record
 * sets.
 * </p>
 * </li>
 * <li>
 * <p>
 * When all of the new resource record sets have been created, Route 53 starts
 * to respond to DNS queries for the root resource record set name (such as
 * example.com) by using the new resource record sets.
 * </p>
 * </li>
 * <li>
 * <p>
 * Route 53 deletes the old group of resource record sets that are associated
 * with the root resource record set name.
 * </p>
 * </li>
 * </ol>
 */
public class UpdateTrafficPolicyInstanceRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the traffic policy instance that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     */
    private String id;

    /**
     * <p>
     * The TTL that you want Amazon Route 53 to assign to all of the updated
     * resource record sets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Long tTL;

    /**
     * <p>
     * The ID of the traffic policy that you want Amazon Route 53 to use to
     * update resource record sets for the specified traffic policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     */
    private String trafficPolicyId;

    /**
     * <p>
     * The version of the traffic policy that you want Amazon Route 53 to use to
     * update resource record sets for the specified traffic policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer trafficPolicyVersion;

    /**
     * <p>
     * The ID of the traffic policy instance that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @return <p>
     *         The ID of the traffic policy instance that you want to update.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the traffic policy instance that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param id <p>
     *            The ID of the traffic policy instance that you want to update.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the traffic policy instance that you want to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param id <p>
     *            The ID of the traffic policy instance that you want to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrafficPolicyInstanceRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The TTL that you want Amazon Route 53 to assign to all of the updated
     * resource record sets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return <p>
     *         The TTL that you want Amazon Route 53 to assign to all of the
     *         updated resource record sets.
     *         </p>
     */
    public Long getTTL() {
        return tTL;
    }

    /**
     * <p>
     * The TTL that you want Amazon Route 53 to assign to all of the updated
     * resource record sets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param tTL <p>
     *            The TTL that you want Amazon Route 53 to assign to all of the
     *            updated resource record sets.
     *            </p>
     */
    public void setTTL(Long tTL) {
        this.tTL = tTL;
    }

    /**
     * <p>
     * The TTL that you want Amazon Route 53 to assign to all of the updated
     * resource record sets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param tTL <p>
     *            The TTL that you want Amazon Route 53 to assign to all of the
     *            updated resource record sets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrafficPolicyInstanceRequest withTTL(Long tTL) {
        this.tTL = tTL;
        return this;
    }

    /**
     * <p>
     * The ID of the traffic policy that you want Amazon Route 53 to use to
     * update resource record sets for the specified traffic policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @return <p>
     *         The ID of the traffic policy that you want Amazon Route 53 to use
     *         to update resource record sets for the specified traffic policy
     *         instance.
     *         </p>
     */
    public String getTrafficPolicyId() {
        return trafficPolicyId;
    }

    /**
     * <p>
     * The ID of the traffic policy that you want Amazon Route 53 to use to
     * update resource record sets for the specified traffic policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param trafficPolicyId <p>
     *            The ID of the traffic policy that you want Amazon Route 53 to
     *            use to update resource record sets for the specified traffic
     *            policy instance.
     *            </p>
     */
    public void setTrafficPolicyId(String trafficPolicyId) {
        this.trafficPolicyId = trafficPolicyId;
    }

    /**
     * <p>
     * The ID of the traffic policy that you want Amazon Route 53 to use to
     * update resource record sets for the specified traffic policy instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param trafficPolicyId <p>
     *            The ID of the traffic policy that you want Amazon Route 53 to
     *            use to update resource record sets for the specified traffic
     *            policy instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrafficPolicyInstanceRequest withTrafficPolicyId(String trafficPolicyId) {
        this.trafficPolicyId = trafficPolicyId;
        return this;
    }

    /**
     * <p>
     * The version of the traffic policy that you want Amazon Route 53 to use to
     * update resource record sets for the specified traffic policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The version of the traffic policy that you want Amazon Route 53
     *         to use to update resource record sets for the specified traffic
     *         policy instance.
     *         </p>
     */
    public Integer getTrafficPolicyVersion() {
        return trafficPolicyVersion;
    }

    /**
     * <p>
     * The version of the traffic policy that you want Amazon Route 53 to use to
     * update resource record sets for the specified traffic policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param trafficPolicyVersion <p>
     *            The version of the traffic policy that you want Amazon Route
     *            53 to use to update resource record sets for the specified
     *            traffic policy instance.
     *            </p>
     */
    public void setTrafficPolicyVersion(Integer trafficPolicyVersion) {
        this.trafficPolicyVersion = trafficPolicyVersion;
    }

    /**
     * <p>
     * The version of the traffic policy that you want Amazon Route 53 to use to
     * update resource record sets for the specified traffic policy instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param trafficPolicyVersion <p>
     *            The version of the traffic policy that you want Amazon Route
     *            53 to use to update resource record sets for the specified
     *            traffic policy instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrafficPolicyInstanceRequest withTrafficPolicyVersion(Integer trafficPolicyVersion) {
        this.trafficPolicyVersion = trafficPolicyVersion;
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
        if (getTTL() != null)
            sb.append("TTL: " + getTTL() + ",");
        if (getTrafficPolicyId() != null)
            sb.append("TrafficPolicyId: " + getTrafficPolicyId() + ",");
        if (getTrafficPolicyVersion() != null)
            sb.append("TrafficPolicyVersion: " + getTrafficPolicyVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getTTL() == null) ? 0 : getTTL().hashCode());
        hashCode = prime * hashCode
                + ((getTrafficPolicyId() == null) ? 0 : getTrafficPolicyId().hashCode());
        hashCode = prime * hashCode
                + ((getTrafficPolicyVersion() == null) ? 0 : getTrafficPolicyVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTrafficPolicyInstanceRequest == false)
            return false;
        UpdateTrafficPolicyInstanceRequest other = (UpdateTrafficPolicyInstanceRequest) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getTTL() == null ^ this.getTTL() == null)
            return false;
        if (other.getTTL() != null && other.getTTL().equals(this.getTTL()) == false)
            return false;
        if (other.getTrafficPolicyId() == null ^ this.getTrafficPolicyId() == null)
            return false;
        if (other.getTrafficPolicyId() != null
                && other.getTrafficPolicyId().equals(this.getTrafficPolicyId()) == false)
            return false;
        if (other.getTrafficPolicyVersion() == null ^ this.getTrafficPolicyVersion() == null)
            return false;
        if (other.getTrafficPolicyVersion() != null
                && other.getTrafficPolicyVersion().equals(this.getTrafficPolicyVersion()) == false)
            return false;
        return true;
    }
}
