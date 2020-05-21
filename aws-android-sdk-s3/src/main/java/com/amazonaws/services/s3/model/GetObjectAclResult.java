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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

public class GetObjectAclResult implements Serializable {
    /**
     * <p>
     * Container for the bucket owner's display name and ID.
     * </p>
     */
    private Owner owner;

    /**
     * <p>
     * A list of grants.
     * </p>
     */
    private java.util.List<Grant> grants;

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     */
    private String requestCharged;

    /**
     * <p>
     * Container for the bucket owner's display name and ID.
     * </p>
     *
     * @return <p>
     *         Container for the bucket owner's display name and ID.
     *         </p>
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * <p>
     * Container for the bucket owner's display name and ID.
     * </p>
     *
     * @param owner <p>
     *            Container for the bucket owner's display name and ID.
     *            </p>
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * Container for the bucket owner's display name and ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param owner <p>
     *            Container for the bucket owner's display name and ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectAclResult withOwner(Owner owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p>
     * A list of grants.
     * </p>
     *
     * @return <p>
     *         A list of grants.
     *         </p>
     */
    public java.util.List<Grant> getGrants() {
        return grants;
    }

    /**
     * <p>
     * A list of grants.
     * </p>
     *
     * @param grants <p>
     *            A list of grants.
     *            </p>
     */
    public void setGrants(java.util.Collection<Grant> grants) {
        if (grants == null) {
            this.grants = null;
            return;
        }

        this.grants = new java.util.ArrayList<Grant>(grants);
    }

    /**
     * <p>
     * A list of grants.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grants <p>
     *            A list of grants.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectAclResult withGrants(Grant... grants) {
        if (getGrants() == null) {
            this.grants = new java.util.ArrayList<Grant>(grants.length);
        }
        for (Grant value : grants) {
            this.grants.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of grants.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grants <p>
     *            A list of grants.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectAclResult withGrants(java.util.Collection<Grant> grants) {
        setGrants(grants);
        return this;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @return <p>
     *         If present, indicates that the requester was successfully charged
     *         for the request.
     *         </p>
     * @see RequestCharged
     */
    public String getRequestCharged() {
        return requestCharged;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @see RequestCharged
     */
    public void setRequestCharged(String requestCharged) {
        this.requestCharged = requestCharged;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestCharged
     */
    public GetObjectAclResult withRequestCharged(String requestCharged) {
        this.requestCharged = requestCharged;
        return this;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @see RequestCharged
     */
    public void setRequestCharged(RequestCharged requestCharged) {
        this.requestCharged = requestCharged.toString();
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestCharged
     */
    public GetObjectAclResult withRequestCharged(RequestCharged requestCharged) {
        this.requestCharged = requestCharged.toString();
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
        if (getOwner() != null)
            sb.append("Owner: " + getOwner() + ",");
        if (getGrants() != null)
            sb.append("Grants: " + getGrants() + ",");
        if (getRequestCharged() != null)
            sb.append("RequestCharged: " + getRequestCharged());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getGrants() == null) ? 0 : getGrants().hashCode());
        hashCode = prime * hashCode
                + ((getRequestCharged() == null) ? 0 : getRequestCharged().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetObjectAclResult == false)
            return false;
        GetObjectAclResult other = (GetObjectAclResult) obj;

        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getGrants() == null ^ this.getGrants() == null)
            return false;
        if (other.getGrants() != null && other.getGrants().equals(this.getGrants()) == false)
            return false;
        if (other.getRequestCharged() == null ^ this.getRequestCharged() == null)
            return false;
        if (other.getRequestCharged() != null
                && other.getRequestCharged().equals(this.getRequestCharged()) == false)
            return false;
        return true;
    }
}
