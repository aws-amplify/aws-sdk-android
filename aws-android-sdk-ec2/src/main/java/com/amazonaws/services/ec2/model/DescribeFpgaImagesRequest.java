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
 * Describes the Amazon FPGA Images (AFIs) available to you. These include
 * public AFIs, private AFIs that you own, and AFIs owned by other AWS accounts
 * for which you have load permissions.
 * </p>
 */
public class DescribeFpgaImagesRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The AFI IDs.
     * </p>
     */
    private java.util.List<String> fpgaImageIds;

    /**
     * <p>
     * Filters the AFI by owner. Specify an AWS account ID, <code>self</code>
     * (owner is the sender of the request), or an AWS owner alias (valid values
     * are <code>amazon</code> | <code>aws-marketplace</code>).
     * </p>
     */
    private java.util.List<String> owners;

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-time</code> - The creation time of the AFI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fpga-image-id</code> - The FPGA image identifier (AFI ID).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fpga-image-global-id</code> - The global FPGA image identifier
     * (AGFI ID).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code> - The name of the AFI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the AFI owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shell-version</code> - The version of the AWS Shell that was used
     * to create the bitstream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the AFI (<code>pending</code> |
     * <code>failed</code> | <code>available</code> | <code>unavailable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     * assigned to the resource. Use the tag key in the filter name and the tag
     * value as the filter value. For example, to find all resources that have a
     * tag with the key <code>Owner</code> and the value <code>TeamA</code>,
     * specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     * for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>update-time</code> - The time of the most recent update.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     */
    private Integer maxResults;

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
    public DescribeFpgaImagesRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The AFI IDs.
     * </p>
     *
     * @return <p>
     *         The AFI IDs.
     *         </p>
     */
    public java.util.List<String> getFpgaImageIds() {
        return fpgaImageIds;
    }

    /**
     * <p>
     * The AFI IDs.
     * </p>
     *
     * @param fpgaImageIds <p>
     *            The AFI IDs.
     *            </p>
     */
    public void setFpgaImageIds(java.util.Collection<String> fpgaImageIds) {
        if (fpgaImageIds == null) {
            this.fpgaImageIds = null;
            return;
        }

        this.fpgaImageIds = new java.util.ArrayList<String>(fpgaImageIds);
    }

    /**
     * <p>
     * The AFI IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fpgaImageIds <p>
     *            The AFI IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFpgaImagesRequest withFpgaImageIds(String... fpgaImageIds) {
        if (getFpgaImageIds() == null) {
            this.fpgaImageIds = new java.util.ArrayList<String>(fpgaImageIds.length);
        }
        for (String value : fpgaImageIds) {
            this.fpgaImageIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The AFI IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fpgaImageIds <p>
     *            The AFI IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFpgaImagesRequest withFpgaImageIds(java.util.Collection<String> fpgaImageIds) {
        setFpgaImageIds(fpgaImageIds);
        return this;
    }

    /**
     * <p>
     * Filters the AFI by owner. Specify an AWS account ID, <code>self</code>
     * (owner is the sender of the request), or an AWS owner alias (valid values
     * are <code>amazon</code> | <code>aws-marketplace</code>).
     * </p>
     *
     * @return <p>
     *         Filters the AFI by owner. Specify an AWS account ID,
     *         <code>self</code> (owner is the sender of the request), or an AWS
     *         owner alias (valid values are <code>amazon</code> |
     *         <code>aws-marketplace</code>).
     *         </p>
     */
    public java.util.List<String> getOwners() {
        return owners;
    }

    /**
     * <p>
     * Filters the AFI by owner. Specify an AWS account ID, <code>self</code>
     * (owner is the sender of the request), or an AWS owner alias (valid values
     * are <code>amazon</code> | <code>aws-marketplace</code>).
     * </p>
     *
     * @param owners <p>
     *            Filters the AFI by owner. Specify an AWS account ID,
     *            <code>self</code> (owner is the sender of the request), or an
     *            AWS owner alias (valid values are <code>amazon</code> |
     *            <code>aws-marketplace</code>).
     *            </p>
     */
    public void setOwners(java.util.Collection<String> owners) {
        if (owners == null) {
            this.owners = null;
            return;
        }

        this.owners = new java.util.ArrayList<String>(owners);
    }

    /**
     * <p>
     * Filters the AFI by owner. Specify an AWS account ID, <code>self</code>
     * (owner is the sender of the request), or an AWS owner alias (valid values
     * are <code>amazon</code> | <code>aws-marketplace</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param owners <p>
     *            Filters the AFI by owner. Specify an AWS account ID,
     *            <code>self</code> (owner is the sender of the request), or an
     *            AWS owner alias (valid values are <code>amazon</code> |
     *            <code>aws-marketplace</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFpgaImagesRequest withOwners(String... owners) {
        if (getOwners() == null) {
            this.owners = new java.util.ArrayList<String>(owners.length);
        }
        for (String value : owners) {
            this.owners.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Filters the AFI by owner. Specify an AWS account ID, <code>self</code>
     * (owner is the sender of the request), or an AWS owner alias (valid values
     * are <code>amazon</code> | <code>aws-marketplace</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param owners <p>
     *            Filters the AFI by owner. Specify an AWS account ID,
     *            <code>self</code> (owner is the sender of the request), or an
     *            AWS owner alias (valid values are <code>amazon</code> |
     *            <code>aws-marketplace</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFpgaImagesRequest withOwners(java.util.Collection<String> owners) {
        setOwners(owners);
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-time</code> - The creation time of the AFI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fpga-image-id</code> - The FPGA image identifier (AFI ID).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fpga-image-global-id</code> - The global FPGA image identifier
     * (AGFI ID).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code> - The name of the AFI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the AFI owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shell-version</code> - The version of the AWS Shell that was used
     * to create the bitstream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the AFI (<code>pending</code> |
     * <code>failed</code> | <code>available</code> | <code>unavailable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     * assigned to the resource. Use the tag key in the filter name and the tag
     * value as the filter value. For example, to find all resources that have a
     * tag with the key <code>Owner</code> and the value <code>TeamA</code>,
     * specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     * for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>update-time</code> - The time of the most recent update.
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
     *         <code>create-time</code> - The creation time of the AFI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>fpga-image-id</code> - The FPGA image identifier (AFI ID).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>fpga-image-global-id</code> - The global FPGA image
     *         identifier (AGFI ID).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>name</code> - The name of the AFI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-id</code> - The AWS account ID of the AFI owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>product-code</code> - The product code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>shell-version</code> - The version of the AWS Shell that
     *         was used to create the bitstream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the AFI (<code>pending</code> |
     *         <code>failed</code> | <code>available</code> |
     *         <code>unavailable</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     *         assigned to the resource. Use the tag key in the filter name and
     *         the tag value as the filter value. For example, to find all
     *         resources that have a tag with the key <code>Owner</code> and the
     *         value <code>TeamA</code>, specify <code>tag:Owner</code> for the
     *         filter name and <code>TeamA</code> for the filter value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-key</code> - The key of a tag assigned to the resource.
     *         Use this filter to find all resources assigned a tag with a
     *         specific key, regardless of the tag value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>update-time</code> - The time of the most recent update.
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
     * <code>create-time</code> - The creation time of the AFI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fpga-image-id</code> - The FPGA image identifier (AFI ID).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fpga-image-global-id</code> - The global FPGA image identifier
     * (AGFI ID).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code> - The name of the AFI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the AFI owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shell-version</code> - The version of the AWS Shell that was used
     * to create the bitstream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the AFI (<code>pending</code> |
     * <code>failed</code> | <code>available</code> | <code>unavailable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     * assigned to the resource. Use the tag key in the filter name and the tag
     * value as the filter value. For example, to find all resources that have a
     * tag with the key <code>Owner</code> and the value <code>TeamA</code>,
     * specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     * for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>update-time</code> - The time of the most recent update.
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
     *            <code>create-time</code> - The creation time of the AFI.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>fpga-image-id</code> - The FPGA image identifier (AFI
     *            ID).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>fpga-image-global-id</code> - The global FPGA image
     *            identifier (AGFI ID).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>name</code> - The name of the AFI.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The AWS account ID of the AFI owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>product-code</code> - The product code.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>shell-version</code> - The version of the AWS Shell that
     *            was used to create the bitstream.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the AFI (
     *            <code>pending</code> | <code>failed</code> |
     *            <code>available</code> | <code>unavailable</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag</code>:&lt;key&gt; - The key/value combination of a
     *            tag assigned to the resource. Use the tag key in the filter
     *            name and the tag value as the filter value. For example, to
     *            find all resources that have a tag with the key
     *            <code>Owner</code> and the value <code>TeamA</code>, specify
     *            <code>tag:Owner</code> for the filter name and
     *            <code>TeamA</code> for the filter value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag-key</code> - The key of a tag assigned to the
     *            resource. Use this filter to find all resources assigned a tag
     *            with a specific key, regardless of the tag value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>update-time</code> - The time of the most recent update.
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
     * <code>create-time</code> - The creation time of the AFI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fpga-image-id</code> - The FPGA image identifier (AFI ID).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fpga-image-global-id</code> - The global FPGA image identifier
     * (AGFI ID).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code> - The name of the AFI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the AFI owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shell-version</code> - The version of the AWS Shell that was used
     * to create the bitstream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the AFI (<code>pending</code> |
     * <code>failed</code> | <code>available</code> | <code>unavailable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     * assigned to the resource. Use the tag key in the filter name and the tag
     * value as the filter value. For example, to find all resources that have a
     * tag with the key <code>Owner</code> and the value <code>TeamA</code>,
     * specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     * for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>update-time</code> - The time of the most recent update.
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
     *            <code>create-time</code> - The creation time of the AFI.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>fpga-image-id</code> - The FPGA image identifier (AFI
     *            ID).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>fpga-image-global-id</code> - The global FPGA image
     *            identifier (AGFI ID).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>name</code> - The name of the AFI.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The AWS account ID of the AFI owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>product-code</code> - The product code.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>shell-version</code> - The version of the AWS Shell that
     *            was used to create the bitstream.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the AFI (
     *            <code>pending</code> | <code>failed</code> |
     *            <code>available</code> | <code>unavailable</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag</code>:&lt;key&gt; - The key/value combination of a
     *            tag assigned to the resource. Use the tag key in the filter
     *            name and the tag value as the filter value. For example, to
     *            find all resources that have a tag with the key
     *            <code>Owner</code> and the value <code>TeamA</code>, specify
     *            <code>tag:Owner</code> for the filter name and
     *            <code>TeamA</code> for the filter value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag-key</code> - The key of a tag assigned to the
     *            resource. Use this filter to find all resources assigned a tag
     *            with a specific key, regardless of the tag value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>update-time</code> - The time of the most recent update.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFpgaImagesRequest withFilters(Filter... filters) {
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
     * <code>create-time</code> - The creation time of the AFI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fpga-image-id</code> - The FPGA image identifier (AFI ID).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fpga-image-global-id</code> - The global FPGA image identifier
     * (AGFI ID).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code> - The name of the AFI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the AFI owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shell-version</code> - The version of the AWS Shell that was used
     * to create the bitstream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the AFI (<code>pending</code> |
     * <code>failed</code> | <code>available</code> | <code>unavailable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     * assigned to the resource. Use the tag key in the filter name and the tag
     * value as the filter value. For example, to find all resources that have a
     * tag with the key <code>Owner</code> and the value <code>TeamA</code>,
     * specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     * for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>update-time</code> - The time of the most recent update.
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
     *            <code>create-time</code> - The creation time of the AFI.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>fpga-image-id</code> - The FPGA image identifier (AFI
     *            ID).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>fpga-image-global-id</code> - The global FPGA image
     *            identifier (AGFI ID).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>name</code> - The name of the AFI.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The AWS account ID of the AFI owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>product-code</code> - The product code.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>shell-version</code> - The version of the AWS Shell that
     *            was used to create the bitstream.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the AFI (
     *            <code>pending</code> | <code>failed</code> |
     *            <code>available</code> | <code>unavailable</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag</code>:&lt;key&gt; - The key/value combination of a
     *            tag assigned to the resource. Use the tag key in the filter
     *            name and the tag value as the filter value. For example, to
     *            find all resources that have a tag with the key
     *            <code>Owner</code> and the value <code>TeamA</code>, specify
     *            <code>tag:Owner</code> for the filter name and
     *            <code>TeamA</code> for the filter value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag-key</code> - The key of a tag assigned to the
     *            resource. Use this filter to find all resources assigned a tag
     *            with a specific key, regardless of the tag value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>update-time</code> - The time of the most recent update.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFpgaImagesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     *
     * @return <p>
     *         The token to retrieve the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to retrieve the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to retrieve the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFpgaImagesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     *
     * @return <p>
     *         The maximum number of results to return in a single call.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFpgaImagesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getFpgaImageIds() != null)
            sb.append("FpgaImageIds: " + getFpgaImageIds() + ",");
        if (getOwners() != null)
            sb.append("Owners: " + getOwners() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getFpgaImageIds() == null) ? 0 : getFpgaImageIds().hashCode());
        hashCode = prime * hashCode + ((getOwners() == null) ? 0 : getOwners().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFpgaImagesRequest == false)
            return false;
        DescribeFpgaImagesRequest other = (DescribeFpgaImagesRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getFpgaImageIds() == null ^ this.getFpgaImageIds() == null)
            return false;
        if (other.getFpgaImageIds() != null
                && other.getFpgaImageIds().equals(this.getFpgaImageIds()) == false)
            return false;
        if (other.getOwners() == null ^ this.getOwners() == null)
            return false;
        if (other.getOwners() != null && other.getOwners().equals(this.getOwners()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
