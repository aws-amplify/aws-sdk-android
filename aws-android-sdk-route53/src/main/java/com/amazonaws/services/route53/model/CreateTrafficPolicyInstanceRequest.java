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
 * Creates resource record sets in a specified hosted zone based on the settings
 * in a specified traffic policy version. In addition,
 * <code>CreateTrafficPolicyInstance</code> associates the resource record sets
 * with a specified domain name (such as example.com) or subdomain name (such as
 * www.example.com). Amazon Route 53 responds to DNS queries for the domain or
 * subdomain name by using the resource record sets that
 * <code>CreateTrafficPolicyInstance</code> created.
 * </p>
 */
public class CreateTrafficPolicyInstanceRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the hosted zone that you want Amazon Route 53 to create
     * resource record sets in by using the configuration in a traffic policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String hostedZoneId;

    /**
     * <p>
     * The domain name (such as example.com) or subdomain name (such as
     * www.example.com) for which Amazon Route 53 responds to DNS queries by
     * using the resource record sets that Route 53 creates for this traffic
     * policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String name;

    /**
     * <p>
     * (Optional) The TTL that you want Amazon Route 53 to assign to all of the
     * resource record sets that it creates in the specified hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Long tTL;

    /**
     * <p>
     * The ID of the traffic policy that you want to use to create resource
     * record sets in the specified hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     */
    private String trafficPolicyId;

    /**
     * <p>
     * The version of the traffic policy that you want to use to create resource
     * record sets in the specified hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer trafficPolicyVersion;

    /**
     * <p>
     * The ID of the hosted zone that you want Amazon Route 53 to create
     * resource record sets in by using the configuration in a traffic policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return <p>
     *         The ID of the hosted zone that you want Amazon Route 53 to create
     *         resource record sets in by using the configuration in a traffic
     *         policy.
     *         </p>
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that you want Amazon Route 53 to create
     * resource record sets in by using the configuration in a traffic policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The ID of the hosted zone that you want Amazon Route 53 to
     *            create resource record sets in by using the configuration in a
     *            traffic policy.
     *            </p>
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that you want Amazon Route 53 to create
     * resource record sets in by using the configuration in a traffic policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The ID of the hosted zone that you want Amazon Route 53 to
     *            create resource record sets in by using the configuration in a
     *            traffic policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficPolicyInstanceRequest withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * <p>
     * The domain name (such as example.com) or subdomain name (such as
     * www.example.com) for which Amazon Route 53 responds to DNS queries by
     * using the resource record sets that Route 53 creates for this traffic
     * policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The domain name (such as example.com) or subdomain name (such as
     *         www.example.com) for which Amazon Route 53 responds to DNS
     *         queries by using the resource record sets that Route 53 creates
     *         for this traffic policy instance.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The domain name (such as example.com) or subdomain name (such as
     * www.example.com) for which Amazon Route 53 responds to DNS queries by
     * using the resource record sets that Route 53 creates for this traffic
     * policy instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param name <p>
     *            The domain name (such as example.com) or subdomain name (such
     *            as www.example.com) for which Amazon Route 53 responds to DNS
     *            queries by using the resource record sets that Route 53
     *            creates for this traffic policy instance.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The domain name (such as example.com) or subdomain name (such as
     * www.example.com) for which Amazon Route 53 responds to DNS queries by
     * using the resource record sets that Route 53 creates for this traffic
     * policy instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param name <p>
     *            The domain name (such as example.com) or subdomain name (such
     *            as www.example.com) for which Amazon Route 53 responds to DNS
     *            queries by using the resource record sets that Route 53
     *            creates for this traffic policy instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficPolicyInstanceRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * (Optional) The TTL that you want Amazon Route 53 to assign to all of the
     * resource record sets that it creates in the specified hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return <p>
     *         (Optional) The TTL that you want Amazon Route 53 to assign to all
     *         of the resource record sets that it creates in the specified
     *         hosted zone.
     *         </p>
     */
    public Long getTTL() {
        return tTL;
    }

    /**
     * <p>
     * (Optional) The TTL that you want Amazon Route 53 to assign to all of the
     * resource record sets that it creates in the specified hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param tTL <p>
     *            (Optional) The TTL that you want Amazon Route 53 to assign to
     *            all of the resource record sets that it creates in the
     *            specified hosted zone.
     *            </p>
     */
    public void setTTL(Long tTL) {
        this.tTL = tTL;
    }

    /**
     * <p>
     * (Optional) The TTL that you want Amazon Route 53 to assign to all of the
     * resource record sets that it creates in the specified hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param tTL <p>
     *            (Optional) The TTL that you want Amazon Route 53 to assign to
     *            all of the resource record sets that it creates in the
     *            specified hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficPolicyInstanceRequest withTTL(Long tTL) {
        this.tTL = tTL;
        return this;
    }

    /**
     * <p>
     * The ID of the traffic policy that you want to use to create resource
     * record sets in the specified hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @return <p>
     *         The ID of the traffic policy that you want to use to create
     *         resource record sets in the specified hosted zone.
     *         </p>
     */
    public String getTrafficPolicyId() {
        return trafficPolicyId;
    }

    /**
     * <p>
     * The ID of the traffic policy that you want to use to create resource
     * record sets in the specified hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param trafficPolicyId <p>
     *            The ID of the traffic policy that you want to use to create
     *            resource record sets in the specified hosted zone.
     *            </p>
     */
    public void setTrafficPolicyId(String trafficPolicyId) {
        this.trafficPolicyId = trafficPolicyId;
    }

    /**
     * <p>
     * The ID of the traffic policy that you want to use to create resource
     * record sets in the specified hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param trafficPolicyId <p>
     *            The ID of the traffic policy that you want to use to create
     *            resource record sets in the specified hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficPolicyInstanceRequest withTrafficPolicyId(String trafficPolicyId) {
        this.trafficPolicyId = trafficPolicyId;
        return this;
    }

    /**
     * <p>
     * The version of the traffic policy that you want to use to create resource
     * record sets in the specified hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The version of the traffic policy that you want to use to create
     *         resource record sets in the specified hosted zone.
     *         </p>
     */
    public Integer getTrafficPolicyVersion() {
        return trafficPolicyVersion;
    }

    /**
     * <p>
     * The version of the traffic policy that you want to use to create resource
     * record sets in the specified hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param trafficPolicyVersion <p>
     *            The version of the traffic policy that you want to use to
     *            create resource record sets in the specified hosted zone.
     *            </p>
     */
    public void setTrafficPolicyVersion(Integer trafficPolicyVersion) {
        this.trafficPolicyVersion = trafficPolicyVersion;
    }

    /**
     * <p>
     * The version of the traffic policy that you want to use to create resource
     * record sets in the specified hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param trafficPolicyVersion <p>
     *            The version of the traffic policy that you want to use to
     *            create resource record sets in the specified hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficPolicyInstanceRequest withTrafficPolicyVersion(Integer trafficPolicyVersion) {
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
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
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

        hashCode = prime * hashCode
                + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
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

        if (obj instanceof CreateTrafficPolicyInstanceRequest == false)
            return false;
        CreateTrafficPolicyInstanceRequest other = (CreateTrafficPolicyInstanceRequest) obj;

        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null
                && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
