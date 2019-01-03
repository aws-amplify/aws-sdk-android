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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * The type of the configuration to override the risk decision.
 * </p>
 */
public class RiskExceptionConfigurationType implements Serializable {
    /**
     * <p>
     * Overrides the risk decision to always block the pre-authentication
     * requests. The IP range is in CIDR notation: a compact representation of
     * an IP address and its associated routing prefix.
     * </p>
     */
    private java.util.List<String> blockedIPRangeList;

    /**
     * <p>
     * Risk detection is not performed on the IP addresses in the range list.
     * The IP range is in CIDR notation.
     * </p>
     */
    private java.util.List<String> skippedIPRangeList;

    /**
     * <p>
     * Overrides the risk decision to always block the pre-authentication
     * requests. The IP range is in CIDR notation: a compact representation of
     * an IP address and its associated routing prefix.
     * </p>
     *
     * @return <p>
     *         Overrides the risk decision to always block the
     *         pre-authentication requests. The IP range is in CIDR notation: a
     *         compact representation of an IP address and its associated
     *         routing prefix.
     *         </p>
     */
    public java.util.List<String> getBlockedIPRangeList() {
        return blockedIPRangeList;
    }

    /**
     * <p>
     * Overrides the risk decision to always block the pre-authentication
     * requests. The IP range is in CIDR notation: a compact representation of
     * an IP address and its associated routing prefix.
     * </p>
     *
     * @param blockedIPRangeList <p>
     *            Overrides the risk decision to always block the
     *            pre-authentication requests. The IP range is in CIDR notation:
     *            a compact representation of an IP address and its associated
     *            routing prefix.
     *            </p>
     */
    public void setBlockedIPRangeList(java.util.Collection<String> blockedIPRangeList) {
        if (blockedIPRangeList == null) {
            this.blockedIPRangeList = null;
            return;
        }

        this.blockedIPRangeList = new java.util.ArrayList<String>(blockedIPRangeList);
    }

    /**
     * <p>
     * Overrides the risk decision to always block the pre-authentication
     * requests. The IP range is in CIDR notation: a compact representation of
     * an IP address and its associated routing prefix.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockedIPRangeList <p>
     *            Overrides the risk decision to always block the
     *            pre-authentication requests. The IP range is in CIDR notation:
     *            a compact representation of an IP address and its associated
     *            routing prefix.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RiskExceptionConfigurationType withBlockedIPRangeList(String... blockedIPRangeList) {
        if (getBlockedIPRangeList() == null) {
            this.blockedIPRangeList = new java.util.ArrayList<String>(blockedIPRangeList.length);
        }
        for (String value : blockedIPRangeList) {
            this.blockedIPRangeList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Overrides the risk decision to always block the pre-authentication
     * requests. The IP range is in CIDR notation: a compact representation of
     * an IP address and its associated routing prefix.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockedIPRangeList <p>
     *            Overrides the risk decision to always block the
     *            pre-authentication requests. The IP range is in CIDR notation:
     *            a compact representation of an IP address and its associated
     *            routing prefix.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RiskExceptionConfigurationType withBlockedIPRangeList(
            java.util.Collection<String> blockedIPRangeList) {
        setBlockedIPRangeList(blockedIPRangeList);
        return this;
    }

    /**
     * <p>
     * Risk detection is not performed on the IP addresses in the range list.
     * The IP range is in CIDR notation.
     * </p>
     *
     * @return <p>
     *         Risk detection is not performed on the IP addresses in the range
     *         list. The IP range is in CIDR notation.
     *         </p>
     */
    public java.util.List<String> getSkippedIPRangeList() {
        return skippedIPRangeList;
    }

    /**
     * <p>
     * Risk detection is not performed on the IP addresses in the range list.
     * The IP range is in CIDR notation.
     * </p>
     *
     * @param skippedIPRangeList <p>
     *            Risk detection is not performed on the IP addresses in the
     *            range list. The IP range is in CIDR notation.
     *            </p>
     */
    public void setSkippedIPRangeList(java.util.Collection<String> skippedIPRangeList) {
        if (skippedIPRangeList == null) {
            this.skippedIPRangeList = null;
            return;
        }

        this.skippedIPRangeList = new java.util.ArrayList<String>(skippedIPRangeList);
    }

    /**
     * <p>
     * Risk detection is not performed on the IP addresses in the range list.
     * The IP range is in CIDR notation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skippedIPRangeList <p>
     *            Risk detection is not performed on the IP addresses in the
     *            range list. The IP range is in CIDR notation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RiskExceptionConfigurationType withSkippedIPRangeList(String... skippedIPRangeList) {
        if (getSkippedIPRangeList() == null) {
            this.skippedIPRangeList = new java.util.ArrayList<String>(skippedIPRangeList.length);
        }
        for (String value : skippedIPRangeList) {
            this.skippedIPRangeList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Risk detection is not performed on the IP addresses in the range list.
     * The IP range is in CIDR notation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skippedIPRangeList <p>
     *            Risk detection is not performed on the IP addresses in the
     *            range list. The IP range is in CIDR notation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RiskExceptionConfigurationType withSkippedIPRangeList(
            java.util.Collection<String> skippedIPRangeList) {
        setSkippedIPRangeList(skippedIPRangeList);
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
        if (getBlockedIPRangeList() != null)
            sb.append("BlockedIPRangeList: " + getBlockedIPRangeList() + ",");
        if (getSkippedIPRangeList() != null)
            sb.append("SkippedIPRangeList: " + getSkippedIPRangeList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBlockedIPRangeList() == null) ? 0 : getBlockedIPRangeList().hashCode());
        hashCode = prime * hashCode
                + ((getSkippedIPRangeList() == null) ? 0 : getSkippedIPRangeList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RiskExceptionConfigurationType == false)
            return false;
        RiskExceptionConfigurationType other = (RiskExceptionConfigurationType) obj;

        if (other.getBlockedIPRangeList() == null ^ this.getBlockedIPRangeList() == null)
            return false;
        if (other.getBlockedIPRangeList() != null
                && other.getBlockedIPRangeList().equals(this.getBlockedIPRangeList()) == false)
            return false;
        if (other.getSkippedIPRangeList() == null ^ this.getSkippedIPRangeList() == null)
            return false;
        if (other.getSkippedIPRangeList() != null
                && other.getSkippedIPRangeList().equals(this.getSkippedIPRangeList()) == false)
            return false;
        return true;
    }
}
