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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts an on-demand Device Defender audit.
 * </p>
 */
public class StartOnDemandAuditTaskRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Which checks are performed during the audit. The checks you specify must
     * be enabled for your account or an exception occurs. Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all
     * checks including those that are enabled or
     * <code>UpdateAccountAuditConfiguration</code> to select which checks are
     * enabled.
     * </p>
     */
    private java.util.List<String> targetCheckNames;

    /**
     * <p>
     * Which checks are performed during the audit. The checks you specify must
     * be enabled for your account or an exception occurs. Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all
     * checks including those that are enabled or
     * <code>UpdateAccountAuditConfiguration</code> to select which checks are
     * enabled.
     * </p>
     *
     * @return <p>
     *         Which checks are performed during the audit. The checks you
     *         specify must be enabled for your account or an exception occurs.
     *         Use <code>DescribeAccountAuditConfiguration</code> to see the
     *         list of all checks including those that are enabled or
     *         <code>UpdateAccountAuditConfiguration</code> to select which
     *         checks are enabled.
     *         </p>
     */
    public java.util.List<String> getTargetCheckNames() {
        return targetCheckNames;
    }

    /**
     * <p>
     * Which checks are performed during the audit. The checks you specify must
     * be enabled for your account or an exception occurs. Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all
     * checks including those that are enabled or
     * <code>UpdateAccountAuditConfiguration</code> to select which checks are
     * enabled.
     * </p>
     *
     * @param targetCheckNames <p>
     *            Which checks are performed during the audit. The checks you
     *            specify must be enabled for your account or an exception
     *            occurs. Use <code>DescribeAccountAuditConfiguration</code> to
     *            see the list of all checks including those that are enabled or
     *            <code>UpdateAccountAuditConfiguration</code> to select which
     *            checks are enabled.
     *            </p>
     */
    public void setTargetCheckNames(java.util.Collection<String> targetCheckNames) {
        if (targetCheckNames == null) {
            this.targetCheckNames = null;
            return;
        }

        this.targetCheckNames = new java.util.ArrayList<String>(targetCheckNames);
    }

    /**
     * <p>
     * Which checks are performed during the audit. The checks you specify must
     * be enabled for your account or an exception occurs. Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all
     * checks including those that are enabled or
     * <code>UpdateAccountAuditConfiguration</code> to select which checks are
     * enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetCheckNames <p>
     *            Which checks are performed during the audit. The checks you
     *            specify must be enabled for your account or an exception
     *            occurs. Use <code>DescribeAccountAuditConfiguration</code> to
     *            see the list of all checks including those that are enabled or
     *            <code>UpdateAccountAuditConfiguration</code> to select which
     *            checks are enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartOnDemandAuditTaskRequest withTargetCheckNames(String... targetCheckNames) {
        if (getTargetCheckNames() == null) {
            this.targetCheckNames = new java.util.ArrayList<String>(targetCheckNames.length);
        }
        for (String value : targetCheckNames) {
            this.targetCheckNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Which checks are performed during the audit. The checks you specify must
     * be enabled for your account or an exception occurs. Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all
     * checks including those that are enabled or
     * <code>UpdateAccountAuditConfiguration</code> to select which checks are
     * enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetCheckNames <p>
     *            Which checks are performed during the audit. The checks you
     *            specify must be enabled for your account or an exception
     *            occurs. Use <code>DescribeAccountAuditConfiguration</code> to
     *            see the list of all checks including those that are enabled or
     *            <code>UpdateAccountAuditConfiguration</code> to select which
     *            checks are enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartOnDemandAuditTaskRequest withTargetCheckNames(
            java.util.Collection<String> targetCheckNames) {
        setTargetCheckNames(targetCheckNames);
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
        if (getTargetCheckNames() != null)
            sb.append("targetCheckNames: " + getTargetCheckNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTargetCheckNames() == null) ? 0 : getTargetCheckNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartOnDemandAuditTaskRequest == false)
            return false;
        StartOnDemandAuditTaskRequest other = (StartOnDemandAuditTaskRequest) obj;

        if (other.getTargetCheckNames() == null ^ this.getTargetCheckNames() == null)
            return false;
        if (other.getTargetCheckNames() != null
                && other.getTargetCheckNames().equals(this.getTargetCheckNames()) == false)
            return false;
        return true;
    }
}
