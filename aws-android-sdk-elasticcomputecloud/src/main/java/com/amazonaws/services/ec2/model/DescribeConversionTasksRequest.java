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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes the specified conversion tasks or all your conversion tasks. For
 * more information, see the <a
 * href="https://docs.aws.amazon.com/vm-import/latest/userguide/">VM
 * Import/Export User Guide</a>.
 * </p>
 * <p>
 * For information about the import manifest referenced by this API action, see
 * <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/manifest.html"
 * >VM Import Manifest</a>.
 * </p>
 */
public class DescribeConversionTasksRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The conversion task IDs.
     * </p>
     */
    private java.util.List<String> conversionTaskIds;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The conversion task IDs.
     * </p>
     *
     * @return <p>
     *         The conversion task IDs.
     *         </p>
     */
    public java.util.List<String> getConversionTaskIds() {
        return conversionTaskIds;
    }

    /**
     * <p>
     * The conversion task IDs.
     * </p>
     *
     * @param conversionTaskIds <p>
     *            The conversion task IDs.
     *            </p>
     */
    public void setConversionTaskIds(java.util.Collection<String> conversionTaskIds) {
        if (conversionTaskIds == null) {
            this.conversionTaskIds = null;
            return;
        }

        this.conversionTaskIds = new java.util.ArrayList<String>(conversionTaskIds);
    }

    /**
     * <p>
     * The conversion task IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conversionTaskIds <p>
     *            The conversion task IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeConversionTasksRequest withConversionTaskIds(String... conversionTaskIds) {
        if (getConversionTaskIds() == null) {
            this.conversionTaskIds = new java.util.ArrayList<String>(conversionTaskIds.length);
        }
        for (String value : conversionTaskIds) {
            this.conversionTaskIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The conversion task IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conversionTaskIds <p>
     *            The conversion task IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeConversionTasksRequest withConversionTaskIds(
            java.util.Collection<String> conversionTaskIds) {
        setConversionTaskIds(conversionTaskIds);
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeConversionTasksRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getConversionTaskIds() != null)
            sb.append("ConversionTaskIds: " + getConversionTaskIds() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConversionTaskIds() == null) ? 0 : getConversionTaskIds().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConversionTasksRequest == false)
            return false;
        DescribeConversionTasksRequest other = (DescribeConversionTasksRequest) obj;

        if (other.getConversionTaskIds() == null ^ this.getConversionTaskIds() == null)
            return false;
        if (other.getConversionTaskIds() != null
                && other.getConversionTaskIds().equals(this.getConversionTaskIds()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
