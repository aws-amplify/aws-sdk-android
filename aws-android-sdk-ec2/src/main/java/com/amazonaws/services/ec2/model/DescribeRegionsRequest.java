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
 * Describes the Regions that are enabled for your account, or all Regions.
 * </p>
 * <p>
 * For a list of the Regions supported by Amazon EC2, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#ec2_region">
 * Regions and Endpoints</a>.
 * </p>
 * <p>
 * For information about enabling and disabling Regions for your account, see <a
 * href
 * ="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html">Managing
 * AWS Regions</a> in the <i>AWS General Reference</i>.
 * </p>
 */
public class DescribeRegionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>endpoint</code> - The endpoint of the Region (for example,
     * <code>ec2.us-east-1.amazonaws.com</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>opt-in-status</code> - The opt-in status of the Region (
     * <code>opt-in-not-required</code> | <code>opted-in</code> |
     * <code>not-opted-in</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region-name</code> - The name of the Region (for example,
     * <code>us-east-1</code>).
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The names of the Regions. You can specify any Regions, whether they are
     * enabled and disabled for your account.
     * </p>
     */
    private java.util.List<String> regionNames;

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
     * Indicates whether to display all Regions, including Regions that are
     * disabled for your account.
     * </p>
     */
    private Boolean allRegions;

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>endpoint</code> - The endpoint of the Region (for example,
     * <code>ec2.us-east-1.amazonaws.com</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>opt-in-status</code> - The opt-in status of the Region (
     * <code>opt-in-not-required</code> | <code>opted-in</code> |
     * <code>not-opted-in</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region-name</code> - The name of the Region (for example,
     * <code>us-east-1</code>).
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The filters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>endpoint</code> - The endpoint of the Region (for example,
     *         <code>ec2.us-east-1.amazonaws.com</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>opt-in-status</code> - The opt-in status of the Region (
     *         <code>opt-in-not-required</code> | <code>opted-in</code> |
     *         <code>not-opted-in</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>region-name</code> - The name of the Region (for example,
     *         <code>us-east-1</code>).
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>endpoint</code> - The endpoint of the Region (for example,
     * <code>ec2.us-east-1.amazonaws.com</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>opt-in-status</code> - The opt-in status of the Region (
     * <code>opt-in-not-required</code> | <code>opted-in</code> |
     * <code>not-opted-in</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region-name</code> - The name of the Region (for example,
     * <code>us-east-1</code>).
     * </p>
     * </li>
     * </ul>
     *
     * @param filters <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>endpoint</code> - The endpoint of the Region (for
     *            example, <code>ec2.us-east-1.amazonaws.com</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>opt-in-status</code> - The opt-in status of the Region (
     *            <code>opt-in-not-required</code> | <code>opted-in</code> |
     *            <code>not-opted-in</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>region-name</code> - The name of the Region (for
     *            example, <code>us-east-1</code>).
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>endpoint</code> - The endpoint of the Region (for example,
     * <code>ec2.us-east-1.amazonaws.com</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>opt-in-status</code> - The opt-in status of the Region (
     * <code>opt-in-not-required</code> | <code>opted-in</code> |
     * <code>not-opted-in</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region-name</code> - The name of the Region (for example,
     * <code>us-east-1</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>endpoint</code> - The endpoint of the Region (for
     *            example, <code>ec2.us-east-1.amazonaws.com</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>opt-in-status</code> - The opt-in status of the Region (
     *            <code>opt-in-not-required</code> | <code>opted-in</code> |
     *            <code>not-opted-in</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>region-name</code> - The name of the Region (for
     *            example, <code>us-east-1</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRegionsRequest withFilters(Filter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<Filter>(filters.length);
        }
        for (Filter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>endpoint</code> - The endpoint of the Region (for example,
     * <code>ec2.us-east-1.amazonaws.com</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>opt-in-status</code> - The opt-in status of the Region (
     * <code>opt-in-not-required</code> | <code>opted-in</code> |
     * <code>not-opted-in</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region-name</code> - The name of the Region (for example,
     * <code>us-east-1</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>endpoint</code> - The endpoint of the Region (for
     *            example, <code>ec2.us-east-1.amazonaws.com</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>opt-in-status</code> - The opt-in status of the Region (
     *            <code>opt-in-not-required</code> | <code>opted-in</code> |
     *            <code>not-opted-in</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>region-name</code> - The name of the Region (for
     *            example, <code>us-east-1</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRegionsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The names of the Regions. You can specify any Regions, whether they are
     * enabled and disabled for your account.
     * </p>
     *
     * @return <p>
     *         The names of the Regions. You can specify any Regions, whether
     *         they are enabled and disabled for your account.
     *         </p>
     */
    public java.util.List<String> getRegionNames() {
        return regionNames;
    }

    /**
     * <p>
     * The names of the Regions. You can specify any Regions, whether they are
     * enabled and disabled for your account.
     * </p>
     *
     * @param regionNames <p>
     *            The names of the Regions. You can specify any Regions, whether
     *            they are enabled and disabled for your account.
     *            </p>
     */
    public void setRegionNames(java.util.Collection<String> regionNames) {
        if (regionNames == null) {
            this.regionNames = null;
            return;
        }

        this.regionNames = new java.util.ArrayList<String>(regionNames);
    }

    /**
     * <p>
     * The names of the Regions. You can specify any Regions, whether they are
     * enabled and disabled for your account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionNames <p>
     *            The names of the Regions. You can specify any Regions, whether
     *            they are enabled and disabled for your account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRegionsRequest withRegionNames(String... regionNames) {
        if (getRegionNames() == null) {
            this.regionNames = new java.util.ArrayList<String>(regionNames.length);
        }
        for (String value : regionNames) {
            this.regionNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the Regions. You can specify any Regions, whether they are
     * enabled and disabled for your account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionNames <p>
     *            The names of the Regions. You can specify any Regions, whether
     *            they are enabled and disabled for your account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRegionsRequest withRegionNames(java.util.Collection<String> regionNames) {
        setRegionNames(regionNames);
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
    public DescribeRegionsRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * Indicates whether to display all Regions, including Regions that are
     * disabled for your account.
     * </p>
     *
     * @return <p>
     *         Indicates whether to display all Regions, including Regions that
     *         are disabled for your account.
     *         </p>
     */
    public Boolean isAllRegions() {
        return allRegions;
    }

    /**
     * <p>
     * Indicates whether to display all Regions, including Regions that are
     * disabled for your account.
     * </p>
     *
     * @return <p>
     *         Indicates whether to display all Regions, including Regions that
     *         are disabled for your account.
     *         </p>
     */
    public Boolean getAllRegions() {
        return allRegions;
    }

    /**
     * <p>
     * Indicates whether to display all Regions, including Regions that are
     * disabled for your account.
     * </p>
     *
     * @param allRegions <p>
     *            Indicates whether to display all Regions, including Regions
     *            that are disabled for your account.
     *            </p>
     */
    public void setAllRegions(Boolean allRegions) {
        this.allRegions = allRegions;
    }

    /**
     * <p>
     * Indicates whether to display all Regions, including Regions that are
     * disabled for your account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allRegions <p>
     *            Indicates whether to display all Regions, including Regions
     *            that are disabled for your account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRegionsRequest withAllRegions(Boolean allRegions) {
        this.allRegions = allRegions;
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
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getRegionNames() != null)
            sb.append("RegionNames: " + getRegionNames() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getAllRegions() != null)
            sb.append("AllRegions: " + getAllRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode
                + ((getRegionNames() == null) ? 0 : getRegionNames().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getAllRegions() == null) ? 0 : getAllRegions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRegionsRequest == false)
            return false;
        DescribeRegionsRequest other = (DescribeRegionsRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getRegionNames() == null ^ this.getRegionNames() == null)
            return false;
        if (other.getRegionNames() != null
                && other.getRegionNames().equals(this.getRegionNames()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getAllRegions() == null ^ this.getAllRegions() == null)
            return false;
        if (other.getAllRegions() != null
                && other.getAllRegions().equals(this.getAllRegions()) == false)
            return false;
        return true;
    }
}
