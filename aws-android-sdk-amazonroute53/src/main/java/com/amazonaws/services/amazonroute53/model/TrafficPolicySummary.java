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
 * A complex type that contains information about the latest version of one
 * traffic policy that is associated with the current AWS account.
 * </p>
 */
public class TrafficPolicySummary implements Serializable {
    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the traffic policy when you
     * created it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     */
    private String id;

    /**
     * <p>
     * The name that you specified for the traffic policy when you created it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     */
    private String name;

    /**
     * <p>
     * The DNS type of the resource record sets that Amazon Route 53 creates
     * when you use a traffic policy to create a traffic policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     */
    private String type;

    /**
     * <p>
     * The version number of the latest version of the traffic policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer latestVersion;

    /**
     * <p>
     * The number of traffic policies that are associated with the current AWS
     * account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer trafficPolicyCount;

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the traffic policy when you
     * created it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @return <p>
     *         The ID that Amazon Route 53 assigned to the traffic policy when
     *         you created it.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the traffic policy when you
     * created it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param id <p>
     *            The ID that Amazon Route 53 assigned to the traffic policy
     *            when you created it.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the traffic policy when you
     * created it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param id <p>
     *            The ID that Amazon Route 53 assigned to the traffic policy
     *            when you created it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficPolicySummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name that you specified for the traffic policy when you created it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     *
     * @return <p>
     *         The name that you specified for the traffic policy when you
     *         created it.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name that you specified for the traffic policy when you created it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     *
     * @param name <p>
     *            The name that you specified for the traffic policy when you
     *            created it.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name that you specified for the traffic policy when you created it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     *
     * @param name <p>
     *            The name that you specified for the traffic policy when you
     *            created it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficPolicySummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The DNS type of the resource record sets that Amazon Route 53 creates
     * when you use a traffic policy to create a traffic policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @return <p>
     *         The DNS type of the resource record sets that Amazon Route 53
     *         creates when you use a traffic policy to create a traffic policy
     *         instance.
     *         </p>
     * @see RRType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The DNS type of the resource record sets that Amazon Route 53 creates
     * when you use a traffic policy to create a traffic policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param type <p>
     *            The DNS type of the resource record sets that Amazon Route 53
     *            creates when you use a traffic policy to create a traffic
     *            policy instance.
     *            </p>
     * @see RRType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The DNS type of the resource record sets that Amazon Route 53 creates
     * when you use a traffic policy to create a traffic policy instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param type <p>
     *            The DNS type of the resource record sets that Amazon Route 53
     *            creates when you use a traffic policy to create a traffic
     *            policy instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public TrafficPolicySummary withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The DNS type of the resource record sets that Amazon Route 53 creates
     * when you use a traffic policy to create a traffic policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param type <p>
     *            The DNS type of the resource record sets that Amazon Route 53
     *            creates when you use a traffic policy to create a traffic
     *            policy instance.
     *            </p>
     * @see RRType
     */
    public void setType(RRType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The DNS type of the resource record sets that Amazon Route 53 creates
     * when you use a traffic policy to create a traffic policy instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param type <p>
     *            The DNS type of the resource record sets that Amazon Route 53
     *            creates when you use a traffic policy to create a traffic
     *            policy instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public TrafficPolicySummary withType(RRType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The version number of the latest version of the traffic policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The version number of the latest version of the traffic policy.
     *         </p>
     */
    public Integer getLatestVersion() {
        return latestVersion;
    }

    /**
     * <p>
     * The version number of the latest version of the traffic policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param latestVersion <p>
     *            The version number of the latest version of the traffic
     *            policy.
     *            </p>
     */
    public void setLatestVersion(Integer latestVersion) {
        this.latestVersion = latestVersion;
    }

    /**
     * <p>
     * The version number of the latest version of the traffic policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param latestVersion <p>
     *            The version number of the latest version of the traffic
     *            policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficPolicySummary withLatestVersion(Integer latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * <p>
     * The number of traffic policies that are associated with the current AWS
     * account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The number of traffic policies that are associated with the
     *         current AWS account.
     *         </p>
     */
    public Integer getTrafficPolicyCount() {
        return trafficPolicyCount;
    }

    /**
     * <p>
     * The number of traffic policies that are associated with the current AWS
     * account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param trafficPolicyCount <p>
     *            The number of traffic policies that are associated with the
     *            current AWS account.
     *            </p>
     */
    public void setTrafficPolicyCount(Integer trafficPolicyCount) {
        this.trafficPolicyCount = trafficPolicyCount;
    }

    /**
     * <p>
     * The number of traffic policies that are associated with the current AWS
     * account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param trafficPolicyCount <p>
     *            The number of traffic policies that are associated with the
     *            current AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficPolicySummary withTrafficPolicyCount(Integer trafficPolicyCount) {
        this.trafficPolicyCount = trafficPolicyCount;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getLatestVersion() != null)
            sb.append("LatestVersion: " + getLatestVersion() + ",");
        if (getTrafficPolicyCount() != null)
            sb.append("TrafficPolicyCount: " + getTrafficPolicyCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getLatestVersion() == null) ? 0 : getLatestVersion().hashCode());
        hashCode = prime * hashCode
                + ((getTrafficPolicyCount() == null) ? 0 : getTrafficPolicyCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficPolicySummary == false)
            return false;
        TrafficPolicySummary other = (TrafficPolicySummary) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getLatestVersion() == null ^ this.getLatestVersion() == null)
            return false;
        if (other.getLatestVersion() != null
                && other.getLatestVersion().equals(this.getLatestVersion()) == false)
            return false;
        if (other.getTrafficPolicyCount() == null ^ this.getTrafficPolicyCount() == null)
            return false;
        if (other.getTrafficPolicyCount() != null
                && other.getTrafficPolicyCount().equals(this.getTrafficPolicyCount()) == false)
            return false;
        return true;
    }
}
