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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * <p>
 * An origin group includes two origins (a primary origin and a second origin to
 * failover to) and a failover criteria that you specify. You create an origin
 * group to support origin failover in CloudFront. When you create or update a
 * distribution, you can specifiy the origin group instead of a single origin,
 * and CloudFront will failover from the primary origin to the second origin
 * under the failover conditions that you've chosen.
 * </p>
 */
public class OriginGroup implements Serializable {
    /**
     * <p>
     * The origin group's ID.
     * </p>
     */
    private String id;

    /**
     * <p>
     * A complex type that contains information about the failover criteria for
     * an origin group.
     * </p>
     */
    private OriginGroupFailoverCriteria failoverCriteria;

    /**
     * <p>
     * A complex type that contains information about the origins in an origin
     * group.
     * </p>
     */
    private OriginGroupMembers members;

    /**
     * <p>
     * The origin group's ID.
     * </p>
     *
     * @return <p>
     *         The origin group's ID.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The origin group's ID.
     * </p>
     *
     * @param id <p>
     *            The origin group's ID.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The origin group's ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The origin group's ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OriginGroup withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the failover criteria for
     * an origin group.
     * </p>
     *
     * @return <p>
     *         A complex type that contains information about the failover
     *         criteria for an origin group.
     *         </p>
     */
    public OriginGroupFailoverCriteria getFailoverCriteria() {
        return failoverCriteria;
    }

    /**
     * <p>
     * A complex type that contains information about the failover criteria for
     * an origin group.
     * </p>
     *
     * @param failoverCriteria <p>
     *            A complex type that contains information about the failover
     *            criteria for an origin group.
     *            </p>
     */
    public void setFailoverCriteria(OriginGroupFailoverCriteria failoverCriteria) {
        this.failoverCriteria = failoverCriteria;
    }

    /**
     * <p>
     * A complex type that contains information about the failover criteria for
     * an origin group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failoverCriteria <p>
     *            A complex type that contains information about the failover
     *            criteria for an origin group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OriginGroup withFailoverCriteria(OriginGroupFailoverCriteria failoverCriteria) {
        this.failoverCriteria = failoverCriteria;
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the origins in an origin
     * group.
     * </p>
     *
     * @return <p>
     *         A complex type that contains information about the origins in an
     *         origin group.
     *         </p>
     */
    public OriginGroupMembers getMembers() {
        return members;
    }

    /**
     * <p>
     * A complex type that contains information about the origins in an origin
     * group.
     * </p>
     *
     * @param members <p>
     *            A complex type that contains information about the origins in
     *            an origin group.
     *            </p>
     */
    public void setMembers(OriginGroupMembers members) {
        this.members = members;
    }

    /**
     * <p>
     * A complex type that contains information about the origins in an origin
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param members <p>
     *            A complex type that contains information about the origins in
     *            an origin group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OriginGroup withMembers(OriginGroupMembers members) {
        this.members = members;
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
        if (getFailoverCriteria() != null)
            sb.append("FailoverCriteria: " + getFailoverCriteria() + ",");
        if (getMembers() != null)
            sb.append("Members: " + getMembers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getFailoverCriteria() == null) ? 0 : getFailoverCriteria().hashCode());
        hashCode = prime * hashCode + ((getMembers() == null) ? 0 : getMembers().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OriginGroup == false)
            return false;
        OriginGroup other = (OriginGroup) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getFailoverCriteria() == null ^ this.getFailoverCriteria() == null)
            return false;
        if (other.getFailoverCriteria() != null
                && other.getFailoverCriteria().equals(this.getFailoverCriteria()) == false)
            return false;
        if (other.getMembers() == null ^ this.getMembers() == null)
            return false;
        if (other.getMembers() != null && other.getMembers().equals(this.getMembers()) == false)
            return false;
        return true;
    }
}
