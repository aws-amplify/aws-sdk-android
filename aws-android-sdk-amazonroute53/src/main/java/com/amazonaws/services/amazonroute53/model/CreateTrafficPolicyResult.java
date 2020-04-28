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

/**
 * <p>
 * A complex type that contains the response information for the
 * <code>CreateTrafficPolicy</code> request.
 * </p>
 */
public class CreateTrafficPolicyResult implements Serializable {
    /**
     * <p>
     * A complex type that contains settings for the new traffic policy.
     * </p>
     */
    private TrafficPolicy trafficPolicy;

    /**
     * <p>
     * A unique URL that represents a new traffic policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String location;

    /**
     * <p>
     * A complex type that contains settings for the new traffic policy.
     * </p>
     *
     * @return <p>
     *         A complex type that contains settings for the new traffic policy.
     *         </p>
     */
    public TrafficPolicy getTrafficPolicy() {
        return trafficPolicy;
    }

    /**
     * <p>
     * A complex type that contains settings for the new traffic policy.
     * </p>
     *
     * @param trafficPolicy <p>
     *            A complex type that contains settings for the new traffic
     *            policy.
     *            </p>
     */
    public void setTrafficPolicy(TrafficPolicy trafficPolicy) {
        this.trafficPolicy = trafficPolicy;
    }

    /**
     * <p>
     * A complex type that contains settings for the new traffic policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficPolicy <p>
     *            A complex type that contains settings for the new traffic
     *            policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficPolicyResult withTrafficPolicy(TrafficPolicy trafficPolicy) {
        this.trafficPolicy = trafficPolicy;
        return this;
    }

    /**
     * <p>
     * A unique URL that represents a new traffic policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         A unique URL that represents a new traffic policy.
     *         </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * A unique URL that represents a new traffic policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param location <p>
     *            A unique URL that represents a new traffic policy.
     *            </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * A unique URL that represents a new traffic policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param location <p>
     *            A unique URL that represents a new traffic policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficPolicyResult withLocation(String location) {
        this.location = location;
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
        if (getTrafficPolicy() != null)
            sb.append("TrafficPolicy: " + getTrafficPolicy() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTrafficPolicy() == null) ? 0 : getTrafficPolicy().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTrafficPolicyResult == false)
            return false;
        CreateTrafficPolicyResult other = (CreateTrafficPolicyResult) obj;

        if (other.getTrafficPolicy() == null ^ this.getTrafficPolicy() == null)
            return false;
        if (other.getTrafficPolicy() != null
                && other.getTrafficPolicy().equals(this.getTrafficPolicy()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }
}
