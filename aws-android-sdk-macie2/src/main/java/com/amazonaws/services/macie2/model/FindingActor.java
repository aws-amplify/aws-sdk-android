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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about an entity that performed an action that produced a
 * policy finding for a resource.
 * </p>
 */
public class FindingActor implements Serializable {
    /**
     * <p>
     * The DNS name of the entity that performed the action on the affected
     * resource.
     * </p>
     */
    private DomainDetails domainDetails;

    /**
     * <p>
     * The IP address of the device that the entity used to perform the action
     * on the affected resource. This object also provides information such as
     * the owner and geographical location for the IP address.
     * </p>
     */
    private IpAddressDetails ipAddressDetails;

    /**
     * <p>
     * The name and type of entity that performed the action on the affected
     * resource.
     * </p>
     */
    private UserIdentity userIdentity;

    /**
     * <p>
     * The DNS name of the entity that performed the action on the affected
     * resource.
     * </p>
     *
     * @return <p>
     *         The DNS name of the entity that performed the action on the
     *         affected resource.
     *         </p>
     */
    public DomainDetails getDomainDetails() {
        return domainDetails;
    }

    /**
     * <p>
     * The DNS name of the entity that performed the action on the affected
     * resource.
     * </p>
     *
     * @param domainDetails <p>
     *            The DNS name of the entity that performed the action on the
     *            affected resource.
     *            </p>
     */
    public void setDomainDetails(DomainDetails domainDetails) {
        this.domainDetails = domainDetails;
    }

    /**
     * <p>
     * The DNS name of the entity that performed the action on the affected
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainDetails <p>
     *            The DNS name of the entity that performed the action on the
     *            affected resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingActor withDomainDetails(DomainDetails domainDetails) {
        this.domainDetails = domainDetails;
        return this;
    }

    /**
     * <p>
     * The IP address of the device that the entity used to perform the action
     * on the affected resource. This object also provides information such as
     * the owner and geographical location for the IP address.
     * </p>
     *
     * @return <p>
     *         The IP address of the device that the entity used to perform the
     *         action on the affected resource. This object also provides
     *         information such as the owner and geographical location for the
     *         IP address.
     *         </p>
     */
    public IpAddressDetails getIpAddressDetails() {
        return ipAddressDetails;
    }

    /**
     * <p>
     * The IP address of the device that the entity used to perform the action
     * on the affected resource. This object also provides information such as
     * the owner and geographical location for the IP address.
     * </p>
     *
     * @param ipAddressDetails <p>
     *            The IP address of the device that the entity used to perform
     *            the action on the affected resource. This object also provides
     *            information such as the owner and geographical location for
     *            the IP address.
     *            </p>
     */
    public void setIpAddressDetails(IpAddressDetails ipAddressDetails) {
        this.ipAddressDetails = ipAddressDetails;
    }

    /**
     * <p>
     * The IP address of the device that the entity used to perform the action
     * on the affected resource. This object also provides information such as
     * the owner and geographical location for the IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipAddressDetails <p>
     *            The IP address of the device that the entity used to perform
     *            the action on the affected resource. This object also provides
     *            information such as the owner and geographical location for
     *            the IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingActor withIpAddressDetails(IpAddressDetails ipAddressDetails) {
        this.ipAddressDetails = ipAddressDetails;
        return this;
    }

    /**
     * <p>
     * The name and type of entity that performed the action on the affected
     * resource.
     * </p>
     *
     * @return <p>
     *         The name and type of entity that performed the action on the
     *         affected resource.
     *         </p>
     */
    public UserIdentity getUserIdentity() {
        return userIdentity;
    }

    /**
     * <p>
     * The name and type of entity that performed the action on the affected
     * resource.
     * </p>
     *
     * @param userIdentity <p>
     *            The name and type of entity that performed the action on the
     *            affected resource.
     *            </p>
     */
    public void setUserIdentity(UserIdentity userIdentity) {
        this.userIdentity = userIdentity;
    }

    /**
     * <p>
     * The name and type of entity that performed the action on the affected
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userIdentity <p>
     *            The name and type of entity that performed the action on the
     *            affected resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingActor withUserIdentity(UserIdentity userIdentity) {
        this.userIdentity = userIdentity;
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
        if (getDomainDetails() != null)
            sb.append("domainDetails: " + getDomainDetails() + ",");
        if (getIpAddressDetails() != null)
            sb.append("ipAddressDetails: " + getIpAddressDetails() + ",");
        if (getUserIdentity() != null)
            sb.append("userIdentity: " + getUserIdentity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDomainDetails() == null) ? 0 : getDomainDetails().hashCode());
        hashCode = prime * hashCode
                + ((getIpAddressDetails() == null) ? 0 : getIpAddressDetails().hashCode());
        hashCode = prime * hashCode
                + ((getUserIdentity() == null) ? 0 : getUserIdentity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindingActor == false)
            return false;
        FindingActor other = (FindingActor) obj;

        if (other.getDomainDetails() == null ^ this.getDomainDetails() == null)
            return false;
        if (other.getDomainDetails() != null
                && other.getDomainDetails().equals(this.getDomainDetails()) == false)
            return false;
        if (other.getIpAddressDetails() == null ^ this.getIpAddressDetails() == null)
            return false;
        if (other.getIpAddressDetails() != null
                && other.getIpAddressDetails().equals(this.getIpAddressDetails()) == false)
            return false;
        if (other.getUserIdentity() == null ^ this.getUserIdentity() == null)
            return false;
        if (other.getUserIdentity() != null
                && other.getUserIdentity().equals(this.getUserIdentity()) == false)
            return false;
        return true;
    }
}
