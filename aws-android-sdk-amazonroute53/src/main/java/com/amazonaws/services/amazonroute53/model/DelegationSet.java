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
 * A complex type that lists the name servers in a delegation set, as well as
 * the <code>CallerReference</code> and the <code>ID</code> for the delegation
 * set.
 * </p>
 */
public class DelegationSet implements Serializable {
    /**
     * <p>
     * The ID that Amazon Route 53 assigns to a reusable delegation set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String id;

    /**
     * <p>
     * The value that you specified for <code>CallerReference</code> when you
     * created the reusable delegation set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String callerReference;

    /**
     * <p>
     * A complex type that contains a list of the authoritative name servers for
     * a hosted zone or for a reusable delegation set.
     * </p>
     */
    private java.util.List<String> nameServers;

    /**
     * <p>
     * The ID that Amazon Route 53 assigns to a reusable delegation set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return <p>
     *         The ID that Amazon Route 53 assigns to a reusable delegation set.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigns to a reusable delegation set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param id <p>
     *            The ID that Amazon Route 53 assigns to a reusable delegation
     *            set.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigns to a reusable delegation set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param id <p>
     *            The ID that Amazon Route 53 assigns to a reusable delegation
     *            set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DelegationSet withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The value that you specified for <code>CallerReference</code> when you
     * created the reusable delegation set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The value that you specified for <code>CallerReference</code>
     *         when you created the reusable delegation set.
     *         </p>
     */
    public String getCallerReference() {
        return callerReference;
    }

    /**
     * <p>
     * The value that you specified for <code>CallerReference</code> when you
     * created the reusable delegation set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param callerReference <p>
     *            The value that you specified for <code>CallerReference</code>
     *            when you created the reusable delegation set.
     *            </p>
     */
    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * The value that you specified for <code>CallerReference</code> when you
     * created the reusable delegation set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param callerReference <p>
     *            The value that you specified for <code>CallerReference</code>
     *            when you created the reusable delegation set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DelegationSet withCallerReference(String callerReference) {
        this.callerReference = callerReference;
        return this;
    }

    /**
     * <p>
     * A complex type that contains a list of the authoritative name servers for
     * a hosted zone or for a reusable delegation set.
     * </p>
     *
     * @return <p>
     *         A complex type that contains a list of the authoritative name
     *         servers for a hosted zone or for a reusable delegation set.
     *         </p>
     */
    public java.util.List<String> getNameServers() {
        return nameServers;
    }

    /**
     * <p>
     * A complex type that contains a list of the authoritative name servers for
     * a hosted zone or for a reusable delegation set.
     * </p>
     *
     * @param nameServers <p>
     *            A complex type that contains a list of the authoritative name
     *            servers for a hosted zone or for a reusable delegation set.
     *            </p>
     */
    public void setNameServers(java.util.Collection<String> nameServers) {
        if (nameServers == null) {
            this.nameServers = null;
            return;
        }

        this.nameServers = new java.util.ArrayList<String>(nameServers);
    }

    /**
     * <p>
     * A complex type that contains a list of the authoritative name servers for
     * a hosted zone or for a reusable delegation set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nameServers <p>
     *            A complex type that contains a list of the authoritative name
     *            servers for a hosted zone or for a reusable delegation set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DelegationSet withNameServers(String... nameServers) {
        if (getNameServers() == null) {
            this.nameServers = new java.util.ArrayList<String>(nameServers.length);
        }
        for (String value : nameServers) {
            this.nameServers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains a list of the authoritative name servers for
     * a hosted zone or for a reusable delegation set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nameServers <p>
     *            A complex type that contains a list of the authoritative name
     *            servers for a hosted zone or for a reusable delegation set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DelegationSet withNameServers(java.util.Collection<String> nameServers) {
        setNameServers(nameServers);
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
        if (getCallerReference() != null)
            sb.append("CallerReference: " + getCallerReference() + ",");
        if (getNameServers() != null)
            sb.append("NameServers: " + getNameServers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode());
        hashCode = prime * hashCode
                + ((getNameServers() == null) ? 0 : getNameServers().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DelegationSet == false)
            return false;
        DelegationSet other = (DelegationSet) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getCallerReference() == null ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null
                && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getNameServers() == null ^ this.getNameServers() == null)
            return false;
        if (other.getNameServers() != null
                && other.getNameServers().equals(this.getNameServers()) == false)
            return false;
        return true;
    }
}
