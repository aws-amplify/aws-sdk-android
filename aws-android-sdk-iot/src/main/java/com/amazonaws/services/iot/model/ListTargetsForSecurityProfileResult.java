/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class ListTargetsForSecurityProfileResult implements Serializable {
    /**
     * <p>
     * The thing groups to which the security profile is attached.
     * </p>
     */
    private java.util.List<SecurityProfileTarget> securityProfileTargets;

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The thing groups to which the security profile is attached.
     * </p>
     *
     * @return <p>
     *         The thing groups to which the security profile is attached.
     *         </p>
     */
    public java.util.List<SecurityProfileTarget> getSecurityProfileTargets() {
        return securityProfileTargets;
    }

    /**
     * <p>
     * The thing groups to which the security profile is attached.
     * </p>
     *
     * @param securityProfileTargets <p>
     *            The thing groups to which the security profile is attached.
     *            </p>
     */
    public void setSecurityProfileTargets(
            java.util.Collection<SecurityProfileTarget> securityProfileTargets) {
        if (securityProfileTargets == null) {
            this.securityProfileTargets = null;
            return;
        }

        this.securityProfileTargets = new java.util.ArrayList<SecurityProfileTarget>(
                securityProfileTargets);
    }

    /**
     * <p>
     * The thing groups to which the security profile is attached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityProfileTargets <p>
     *            The thing groups to which the security profile is attached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTargetsForSecurityProfileResult withSecurityProfileTargets(
            SecurityProfileTarget... securityProfileTargets) {
        if (getSecurityProfileTargets() == null) {
            this.securityProfileTargets = new java.util.ArrayList<SecurityProfileTarget>(
                    securityProfileTargets.length);
        }
        for (SecurityProfileTarget value : securityProfileTargets) {
            this.securityProfileTargets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The thing groups to which the security profile is attached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityProfileTargets <p>
     *            The thing groups to which the security profile is attached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTargetsForSecurityProfileResult withSecurityProfileTargets(
            java.util.Collection<SecurityProfileTarget> securityProfileTargets) {
        setSecurityProfileTargets(securityProfileTargets);
        return this;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     *
     * @return <p>
     *         A token that can be used to retrieve the next set of results, or
     *         <code>null</code> if there are no additional results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     *
     * @param nextToken <p>
     *            A token that can be used to retrieve the next set of results,
     *            or <code>null</code> if there are no additional results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token that can be used to retrieve the next set of results,
     *            or <code>null</code> if there are no additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTargetsForSecurityProfileResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getSecurityProfileTargets() != null)
            sb.append("securityProfileTargets: " + getSecurityProfileTargets() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSecurityProfileTargets() == null) ? 0 : getSecurityProfileTargets()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTargetsForSecurityProfileResult == false)
            return false;
        ListTargetsForSecurityProfileResult other = (ListTargetsForSecurityProfileResult) obj;

        if (other.getSecurityProfileTargets() == null ^ this.getSecurityProfileTargets() == null)
            return false;
        if (other.getSecurityProfileTargets() != null
                && other.getSecurityProfileTargets().equals(this.getSecurityProfileTargets()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
