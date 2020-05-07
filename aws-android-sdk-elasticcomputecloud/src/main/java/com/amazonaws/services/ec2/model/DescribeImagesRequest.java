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
 * Describes the specified images (AMIs, AKIs, and ARIs) available to you or all
 * of the images available to you.
 * </p>
 * <p>
 * The images available to you include public images, private images that you
 * own, and private images owned by other AWS accounts for which you have
 * explicit launch permissions.
 * </p>
 * <p>
 * Recently deregistered images appear in the returned results for a short
 * interval and then return empty results. After all instances that reference a
 * deregistered AMI are terminated, specifying the ID of the image results in an
 * error indicating that the AMI ID cannot be found.
 * </p>
 */
public class DescribeImagesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Scopes the images by users with explicit launch permissions. Specify an
     * AWS account ID, <code>self</code> (the sender of the request), or
     * <code>all</code> (public AMIs).
     * </p>
     */
    private java.util.List<String> executableUsers;

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>architecture</code> - The image architecture (<code>i386</code> |
     * <code>x86_64</code> | <code>arm64</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.delete-on-termination</code> - A Boolean value
     * that indicates whether the Amazon EBS volume is deleted on instance
     * termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.device-name</code> - The device name specified
     * in the block device mapping (for example, <code>/dev/sdh</code> or
     * <code>xvdh</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.snapshot-id</code> - The ID of the snapshot
     * used for the EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-size</code> - The volume size of the
     * EBS volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-type</code> - The volume type of the
     * EBS volume (<code>gp2</code> | <code>io1</code> | <code>st1 </code>|
     * <code>sc1</code> | <code>standard</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.encrypted</code> - A Boolean that indicates
     * whether the EBS volume is encrypted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code> - The description of the image (provided during
     * image creation).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ena-support</code> - A Boolean that indicates whether enhanced
     * networking with ENA is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor type (<code>ovm</code> |
     * <code>xen</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the image.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-type</code> - The image type (<code>machine</code> |
     * <code>kernel</code> | <code>ramdisk</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>is-public</code> - A Boolean that indicates whether the image is
     * public.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manifest-location</code> - The location of the image manifest.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code> - The name of the AMI (provided during image creation).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-alias</code> - String value from an Amazon-maintained list (
     * <code>amazon</code> | <code>aws-marketplace</code> |
     * <code>microsoft</code>) of snapshot owners. Not to be confused with the
     * user-configured AWS account alias, which is set from the IAM console.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the image owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform. To only list Windows-based AMIs,
     * use <code>windows</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code.type</code> - The type of the product code (
     * <code>devpay</code> | <code>marketplace</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-name</code> - The device name of the root device volume
     * (for example, <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-type</code> - The type of the root device volume (
     * <code>ebs</code> | <code>instance-store</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the image (<code>available</code> |
     * <code>pending</code> | <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-code</code> - The reason code for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-message</code> - The message for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sriov-net-support</code> - A value of <code>simple</code> indicates
     * that enhanced networking with the Intel 82599 VF interface is enabled.
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
     * <code>virtualization-type</code> - The virtualization type (
     * <code>paravirtual</code> | <code>hvm</code>).
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The image IDs.
     * </p>
     * <p>
     * Default: Describes all images available to you.
     * </p>
     */
    private java.util.List<String> imageIds;

    /**
     * <p>
     * Filters the images by the owner. Specify an AWS account ID,
     * <code>self</code> (owner is the sender of the request), or an AWS owner
     * alias (valid values are <code>amazon</code> |
     * <code>aws-marketplace</code> | <code>microsoft</code>). Omitting this
     * option returns all images for which you have launch permissions,
     * regardless of ownership.
     * </p>
     */
    private java.util.List<String> owners;

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
     * Scopes the images by users with explicit launch permissions. Specify an
     * AWS account ID, <code>self</code> (the sender of the request), or
     * <code>all</code> (public AMIs).
     * </p>
     *
     * @return <p>
     *         Scopes the images by users with explicit launch permissions.
     *         Specify an AWS account ID, <code>self</code> (the sender of the
     *         request), or <code>all</code> (public AMIs).
     *         </p>
     */
    public java.util.List<String> getExecutableUsers() {
        return executableUsers;
    }

    /**
     * <p>
     * Scopes the images by users with explicit launch permissions. Specify an
     * AWS account ID, <code>self</code> (the sender of the request), or
     * <code>all</code> (public AMIs).
     * </p>
     *
     * @param executableUsers <p>
     *            Scopes the images by users with explicit launch permissions.
     *            Specify an AWS account ID, <code>self</code> (the sender of
     *            the request), or <code>all</code> (public AMIs).
     *            </p>
     */
    public void setExecutableUsers(java.util.Collection<String> executableUsers) {
        if (executableUsers == null) {
            this.executableUsers = null;
            return;
        }

        this.executableUsers = new java.util.ArrayList<String>(executableUsers);
    }

    /**
     * <p>
     * Scopes the images by users with explicit launch permissions. Specify an
     * AWS account ID, <code>self</code> (the sender of the request), or
     * <code>all</code> (public AMIs).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executableUsers <p>
     *            Scopes the images by users with explicit launch permissions.
     *            Specify an AWS account ID, <code>self</code> (the sender of
     *            the request), or <code>all</code> (public AMIs).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImagesRequest withExecutableUsers(String... executableUsers) {
        if (getExecutableUsers() == null) {
            this.executableUsers = new java.util.ArrayList<String>(executableUsers.length);
        }
        for (String value : executableUsers) {
            this.executableUsers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Scopes the images by users with explicit launch permissions. Specify an
     * AWS account ID, <code>self</code> (the sender of the request), or
     * <code>all</code> (public AMIs).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executableUsers <p>
     *            Scopes the images by users with explicit launch permissions.
     *            Specify an AWS account ID, <code>self</code> (the sender of
     *            the request), or <code>all</code> (public AMIs).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImagesRequest withExecutableUsers(java.util.Collection<String> executableUsers) {
        setExecutableUsers(executableUsers);
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>architecture</code> - The image architecture (<code>i386</code> |
     * <code>x86_64</code> | <code>arm64</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.delete-on-termination</code> - A Boolean value
     * that indicates whether the Amazon EBS volume is deleted on instance
     * termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.device-name</code> - The device name specified
     * in the block device mapping (for example, <code>/dev/sdh</code> or
     * <code>xvdh</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.snapshot-id</code> - The ID of the snapshot
     * used for the EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-size</code> - The volume size of the
     * EBS volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-type</code> - The volume type of the
     * EBS volume (<code>gp2</code> | <code>io1</code> | <code>st1 </code>|
     * <code>sc1</code> | <code>standard</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.encrypted</code> - A Boolean that indicates
     * whether the EBS volume is encrypted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code> - The description of the image (provided during
     * image creation).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ena-support</code> - A Boolean that indicates whether enhanced
     * networking with ENA is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor type (<code>ovm</code> |
     * <code>xen</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the image.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-type</code> - The image type (<code>machine</code> |
     * <code>kernel</code> | <code>ramdisk</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>is-public</code> - A Boolean that indicates whether the image is
     * public.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manifest-location</code> - The location of the image manifest.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code> - The name of the AMI (provided during image creation).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-alias</code> - String value from an Amazon-maintained list (
     * <code>amazon</code> | <code>aws-marketplace</code> |
     * <code>microsoft</code>) of snapshot owners. Not to be confused with the
     * user-configured AWS account alias, which is set from the IAM console.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the image owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform. To only list Windows-based AMIs,
     * use <code>windows</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code.type</code> - The type of the product code (
     * <code>devpay</code> | <code>marketplace</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-name</code> - The device name of the root device volume
     * (for example, <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-type</code> - The type of the root device volume (
     * <code>ebs</code> | <code>instance-store</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the image (<code>available</code> |
     * <code>pending</code> | <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-code</code> - The reason code for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-message</code> - The message for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sriov-net-support</code> - A value of <code>simple</code> indicates
     * that enhanced networking with the Intel 82599 VF interface is enabled.
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
     * <code>virtualization-type</code> - The virtualization type (
     * <code>paravirtual</code> | <code>hvm</code>).
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
     *         <code>architecture</code> - The image architecture (
     *         <code>i386</code> | <code>x86_64</code> | <code>arm64</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>block-device-mapping.delete-on-termination</code> - A
     *         Boolean value that indicates whether the Amazon EBS volume is
     *         deleted on instance termination.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>block-device-mapping.device-name</code> - The device name
     *         specified in the block device mapping (for example,
     *         <code>/dev/sdh</code> or <code>xvdh</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>block-device-mapping.snapshot-id</code> - The ID of the
     *         snapshot used for the EBS volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>block-device-mapping.volume-size</code> - The volume size
     *         of the EBS volume, in GiB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>block-device-mapping.volume-type</code> - The volume type
     *         of the EBS volume (<code>gp2</code> | <code>io1</code> |
     *         <code>st1 </code>| <code>sc1</code> | <code>standard</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>block-device-mapping.encrypted</code> - A Boolean that
     *         indicates whether the EBS volume is encrypted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>description</code> - The description of the image (provided
     *         during image creation).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ena-support</code> - A Boolean that indicates whether
     *         enhanced networking with ENA is enabled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>hypervisor</code> - The hypervisor type (<code>ovm</code> |
     *         <code>xen</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>image-id</code> - The ID of the image.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>image-type</code> - The image type (<code>machine</code> |
     *         <code>kernel</code> | <code>ramdisk</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>is-public</code> - A Boolean that indicates whether the
     *         image is public.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>kernel-id</code> - The kernel ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>manifest-location</code> - The location of the image
     *         manifest.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>name</code> - The name of the AMI (provided during image
     *         creation).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-alias</code> - String value from an Amazon-maintained
     *         list (<code>amazon</code> | <code>aws-marketplace</code> |
     *         <code>microsoft</code>) of snapshot owners. Not to be confused
     *         with the user-configured AWS account alias, which is set from the
     *         IAM console.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-id</code> - The AWS account ID of the image owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>platform</code> - The platform. To only list Windows-based
     *         AMIs, use <code>windows</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>product-code</code> - The product code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>product-code.type</code> - The type of the product code (
     *         <code>devpay</code> | <code>marketplace</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ramdisk-id</code> - The RAM disk ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>root-device-name</code> - The device name of the root
     *         device volume (for example, <code>/dev/sda1</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>root-device-type</code> - The type of the root device
     *         volume (<code>ebs</code> | <code>instance-store</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the image (
     *         <code>available</code> | <code>pending</code> |
     *         <code>failed</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state-reason-code</code> - The reason code for the state
     *         change.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state-reason-message</code> - The message for the state
     *         change.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sriov-net-support</code> - A value of <code>simple</code>
     *         indicates that enhanced networking with the Intel 82599 VF
     *         interface is enabled.
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
     *         <code>virtualization-type</code> - The virtualization type (
     *         <code>paravirtual</code> | <code>hvm</code>).
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
     * <code>architecture</code> - The image architecture (<code>i386</code> |
     * <code>x86_64</code> | <code>arm64</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.delete-on-termination</code> - A Boolean value
     * that indicates whether the Amazon EBS volume is deleted on instance
     * termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.device-name</code> - The device name specified
     * in the block device mapping (for example, <code>/dev/sdh</code> or
     * <code>xvdh</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.snapshot-id</code> - The ID of the snapshot
     * used for the EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-size</code> - The volume size of the
     * EBS volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-type</code> - The volume type of the
     * EBS volume (<code>gp2</code> | <code>io1</code> | <code>st1 </code>|
     * <code>sc1</code> | <code>standard</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.encrypted</code> - A Boolean that indicates
     * whether the EBS volume is encrypted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code> - The description of the image (provided during
     * image creation).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ena-support</code> - A Boolean that indicates whether enhanced
     * networking with ENA is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor type (<code>ovm</code> |
     * <code>xen</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the image.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-type</code> - The image type (<code>machine</code> |
     * <code>kernel</code> | <code>ramdisk</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>is-public</code> - A Boolean that indicates whether the image is
     * public.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manifest-location</code> - The location of the image manifest.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code> - The name of the AMI (provided during image creation).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-alias</code> - String value from an Amazon-maintained list (
     * <code>amazon</code> | <code>aws-marketplace</code> |
     * <code>microsoft</code>) of snapshot owners. Not to be confused with the
     * user-configured AWS account alias, which is set from the IAM console.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the image owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform. To only list Windows-based AMIs,
     * use <code>windows</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code.type</code> - The type of the product code (
     * <code>devpay</code> | <code>marketplace</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-name</code> - The device name of the root device volume
     * (for example, <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-type</code> - The type of the root device volume (
     * <code>ebs</code> | <code>instance-store</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the image (<code>available</code> |
     * <code>pending</code> | <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-code</code> - The reason code for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-message</code> - The message for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sriov-net-support</code> - A value of <code>simple</code> indicates
     * that enhanced networking with the Intel 82599 VF interface is enabled.
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
     * <code>virtualization-type</code> - The virtualization type (
     * <code>paravirtual</code> | <code>hvm</code>).
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
     *            <code>architecture</code> - The image architecture (
     *            <code>i386</code> | <code>x86_64</code> | <code>arm64</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.delete-on-termination</code> - A
     *            Boolean value that indicates whether the Amazon EBS volume is
     *            deleted on instance termination.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.device-name</code> - The device
     *            name specified in the block device mapping (for example,
     *            <code>/dev/sdh</code> or <code>xvdh</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.snapshot-id</code> - The ID of the
     *            snapshot used for the EBS volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.volume-size</code> - The volume
     *            size of the EBS volume, in GiB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.volume-type</code> - The volume
     *            type of the EBS volume (<code>gp2</code> | <code>io1</code> |
     *            <code>st1 </code>| <code>sc1</code> | <code>standard</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.encrypted</code> - A Boolean that
     *            indicates whether the EBS volume is encrypted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>description</code> - The description of the image
     *            (provided during image creation).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ena-support</code> - A Boolean that indicates whether
     *            enhanced networking with ENA is enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>hypervisor</code> - The hypervisor type (
     *            <code>ovm</code> | <code>xen</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>image-id</code> - The ID of the image.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>image-type</code> - The image type (<code>machine</code>
     *            | <code>kernel</code> | <code>ramdisk</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>is-public</code> - A Boolean that indicates whether the
     *            image is public.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>kernel-id</code> - The kernel ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>manifest-location</code> - The location of the image
     *            manifest.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>name</code> - The name of the AMI (provided during image
     *            creation).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-alias</code> - String value from an
     *            Amazon-maintained list (<code>amazon</code> |
     *            <code>aws-marketplace</code> | <code>microsoft</code>) of
     *            snapshot owners. Not to be confused with the user-configured
     *            AWS account alias, which is set from the IAM console.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The AWS account ID of the image owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>platform</code> - The platform. To only list
     *            Windows-based AMIs, use <code>windows</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>product-code</code> - The product code.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>product-code.type</code> - The type of the product code
     *            (<code>devpay</code> | <code>marketplace</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ramdisk-id</code> - The RAM disk ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>root-device-name</code> - The device name of the root
     *            device volume (for example, <code>/dev/sda1</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>root-device-type</code> - The type of the root device
     *            volume (<code>ebs</code> | <code>instance-store</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the image (
     *            <code>available</code> | <code>pending</code> |
     *            <code>failed</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state-reason-code</code> - The reason code for the state
     *            change.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state-reason-message</code> - The message for the state
     *            change.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sriov-net-support</code> - A value of
     *            <code>simple</code> indicates that enhanced networking with
     *            the Intel 82599 VF interface is enabled.
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
     *            <code>virtualization-type</code> - The virtualization type (
     *            <code>paravirtual</code> | <code>hvm</code>).
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
     * <code>architecture</code> - The image architecture (<code>i386</code> |
     * <code>x86_64</code> | <code>arm64</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.delete-on-termination</code> - A Boolean value
     * that indicates whether the Amazon EBS volume is deleted on instance
     * termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.device-name</code> - The device name specified
     * in the block device mapping (for example, <code>/dev/sdh</code> or
     * <code>xvdh</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.snapshot-id</code> - The ID of the snapshot
     * used for the EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-size</code> - The volume size of the
     * EBS volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-type</code> - The volume type of the
     * EBS volume (<code>gp2</code> | <code>io1</code> | <code>st1 </code>|
     * <code>sc1</code> | <code>standard</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.encrypted</code> - A Boolean that indicates
     * whether the EBS volume is encrypted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code> - The description of the image (provided during
     * image creation).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ena-support</code> - A Boolean that indicates whether enhanced
     * networking with ENA is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor type (<code>ovm</code> |
     * <code>xen</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the image.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-type</code> - The image type (<code>machine</code> |
     * <code>kernel</code> | <code>ramdisk</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>is-public</code> - A Boolean that indicates whether the image is
     * public.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manifest-location</code> - The location of the image manifest.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code> - The name of the AMI (provided during image creation).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-alias</code> - String value from an Amazon-maintained list (
     * <code>amazon</code> | <code>aws-marketplace</code> |
     * <code>microsoft</code>) of snapshot owners. Not to be confused with the
     * user-configured AWS account alias, which is set from the IAM console.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the image owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform. To only list Windows-based AMIs,
     * use <code>windows</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code.type</code> - The type of the product code (
     * <code>devpay</code> | <code>marketplace</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-name</code> - The device name of the root device volume
     * (for example, <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-type</code> - The type of the root device volume (
     * <code>ebs</code> | <code>instance-store</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the image (<code>available</code> |
     * <code>pending</code> | <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-code</code> - The reason code for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-message</code> - The message for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sriov-net-support</code> - A value of <code>simple</code> indicates
     * that enhanced networking with the Intel 82599 VF interface is enabled.
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
     * <code>virtualization-type</code> - The virtualization type (
     * <code>paravirtual</code> | <code>hvm</code>).
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
     *            <code>architecture</code> - The image architecture (
     *            <code>i386</code> | <code>x86_64</code> | <code>arm64</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.delete-on-termination</code> - A
     *            Boolean value that indicates whether the Amazon EBS volume is
     *            deleted on instance termination.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.device-name</code> - The device
     *            name specified in the block device mapping (for example,
     *            <code>/dev/sdh</code> or <code>xvdh</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.snapshot-id</code> - The ID of the
     *            snapshot used for the EBS volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.volume-size</code> - The volume
     *            size of the EBS volume, in GiB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.volume-type</code> - The volume
     *            type of the EBS volume (<code>gp2</code> | <code>io1</code> |
     *            <code>st1 </code>| <code>sc1</code> | <code>standard</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.encrypted</code> - A Boolean that
     *            indicates whether the EBS volume is encrypted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>description</code> - The description of the image
     *            (provided during image creation).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ena-support</code> - A Boolean that indicates whether
     *            enhanced networking with ENA is enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>hypervisor</code> - The hypervisor type (
     *            <code>ovm</code> | <code>xen</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>image-id</code> - The ID of the image.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>image-type</code> - The image type (<code>machine</code>
     *            | <code>kernel</code> | <code>ramdisk</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>is-public</code> - A Boolean that indicates whether the
     *            image is public.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>kernel-id</code> - The kernel ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>manifest-location</code> - The location of the image
     *            manifest.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>name</code> - The name of the AMI (provided during image
     *            creation).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-alias</code> - String value from an
     *            Amazon-maintained list (<code>amazon</code> |
     *            <code>aws-marketplace</code> | <code>microsoft</code>) of
     *            snapshot owners. Not to be confused with the user-configured
     *            AWS account alias, which is set from the IAM console.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The AWS account ID of the image owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>platform</code> - The platform. To only list
     *            Windows-based AMIs, use <code>windows</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>product-code</code> - The product code.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>product-code.type</code> - The type of the product code
     *            (<code>devpay</code> | <code>marketplace</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ramdisk-id</code> - The RAM disk ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>root-device-name</code> - The device name of the root
     *            device volume (for example, <code>/dev/sda1</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>root-device-type</code> - The type of the root device
     *            volume (<code>ebs</code> | <code>instance-store</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the image (
     *            <code>available</code> | <code>pending</code> |
     *            <code>failed</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state-reason-code</code> - The reason code for the state
     *            change.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state-reason-message</code> - The message for the state
     *            change.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sriov-net-support</code> - A value of
     *            <code>simple</code> indicates that enhanced networking with
     *            the Intel 82599 VF interface is enabled.
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
     *            <code>virtualization-type</code> - The virtualization type (
     *            <code>paravirtual</code> | <code>hvm</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImagesRequest withFilters(Filter... filters) {
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
     * <code>architecture</code> - The image architecture (<code>i386</code> |
     * <code>x86_64</code> | <code>arm64</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.delete-on-termination</code> - A Boolean value
     * that indicates whether the Amazon EBS volume is deleted on instance
     * termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.device-name</code> - The device name specified
     * in the block device mapping (for example, <code>/dev/sdh</code> or
     * <code>xvdh</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.snapshot-id</code> - The ID of the snapshot
     * used for the EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-size</code> - The volume size of the
     * EBS volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.volume-type</code> - The volume type of the
     * EBS volume (<code>gp2</code> | <code>io1</code> | <code>st1 </code>|
     * <code>sc1</code> | <code>standard</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-device-mapping.encrypted</code> - A Boolean that indicates
     * whether the EBS volume is encrypted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code> - The description of the image (provided during
     * image creation).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ena-support</code> - A Boolean that indicates whether enhanced
     * networking with ENA is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor type (<code>ovm</code> |
     * <code>xen</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the image.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-type</code> - The image type (<code>machine</code> |
     * <code>kernel</code> | <code>ramdisk</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>is-public</code> - A Boolean that indicates whether the image is
     * public.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manifest-location</code> - The location of the image manifest.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code> - The name of the AMI (provided during image creation).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-alias</code> - String value from an Amazon-maintained list (
     * <code>amazon</code> | <code>aws-marketplace</code> |
     * <code>microsoft</code>) of snapshot owners. Not to be confused with the
     * user-configured AWS account alias, which is set from the IAM console.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the image owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform. To only list Windows-based AMIs,
     * use <code>windows</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code</code> - The product code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-code.type</code> - The type of the product code (
     * <code>devpay</code> | <code>marketplace</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-name</code> - The device name of the root device volume
     * (for example, <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>root-device-type</code> - The type of the root device volume (
     * <code>ebs</code> | <code>instance-store</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the image (<code>available</code> |
     * <code>pending</code> | <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-code</code> - The reason code for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state-reason-message</code> - The message for the state change.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sriov-net-support</code> - A value of <code>simple</code> indicates
     * that enhanced networking with the Intel 82599 VF interface is enabled.
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
     * <code>virtualization-type</code> - The virtualization type (
     * <code>paravirtual</code> | <code>hvm</code>).
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
     *            <code>architecture</code> - The image architecture (
     *            <code>i386</code> | <code>x86_64</code> | <code>arm64</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.delete-on-termination</code> - A
     *            Boolean value that indicates whether the Amazon EBS volume is
     *            deleted on instance termination.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.device-name</code> - The device
     *            name specified in the block device mapping (for example,
     *            <code>/dev/sdh</code> or <code>xvdh</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.snapshot-id</code> - The ID of the
     *            snapshot used for the EBS volume.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.volume-size</code> - The volume
     *            size of the EBS volume, in GiB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.volume-type</code> - The volume
     *            type of the EBS volume (<code>gp2</code> | <code>io1</code> |
     *            <code>st1 </code>| <code>sc1</code> | <code>standard</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>block-device-mapping.encrypted</code> - A Boolean that
     *            indicates whether the EBS volume is encrypted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>description</code> - The description of the image
     *            (provided during image creation).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ena-support</code> - A Boolean that indicates whether
     *            enhanced networking with ENA is enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>hypervisor</code> - The hypervisor type (
     *            <code>ovm</code> | <code>xen</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>image-id</code> - The ID of the image.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>image-type</code> - The image type (<code>machine</code>
     *            | <code>kernel</code> | <code>ramdisk</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>is-public</code> - A Boolean that indicates whether the
     *            image is public.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>kernel-id</code> - The kernel ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>manifest-location</code> - The location of the image
     *            manifest.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>name</code> - The name of the AMI (provided during image
     *            creation).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-alias</code> - String value from an
     *            Amazon-maintained list (<code>amazon</code> |
     *            <code>aws-marketplace</code> | <code>microsoft</code>) of
     *            snapshot owners. Not to be confused with the user-configured
     *            AWS account alias, which is set from the IAM console.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>owner-id</code> - The AWS account ID of the image owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>platform</code> - The platform. To only list
     *            Windows-based AMIs, use <code>windows</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>product-code</code> - The product code.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>product-code.type</code> - The type of the product code
     *            (<code>devpay</code> | <code>marketplace</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ramdisk-id</code> - The RAM disk ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>root-device-name</code> - The device name of the root
     *            device volume (for example, <code>/dev/sda1</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>root-device-type</code> - The type of the root device
     *            volume (<code>ebs</code> | <code>instance-store</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the image (
     *            <code>available</code> | <code>pending</code> |
     *            <code>failed</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state-reason-code</code> - The reason code for the state
     *            change.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state-reason-message</code> - The message for the state
     *            change.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sriov-net-support</code> - A value of
     *            <code>simple</code> indicates that enhanced networking with
     *            the Intel 82599 VF interface is enabled.
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
     *            <code>virtualization-type</code> - The virtualization type (
     *            <code>paravirtual</code> | <code>hvm</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImagesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The image IDs.
     * </p>
     * <p>
     * Default: Describes all images available to you.
     * </p>
     *
     * @return <p>
     *         The image IDs.
     *         </p>
     *         <p>
     *         Default: Describes all images available to you.
     *         </p>
     */
    public java.util.List<String> getImageIds() {
        return imageIds;
    }

    /**
     * <p>
     * The image IDs.
     * </p>
     * <p>
     * Default: Describes all images available to you.
     * </p>
     *
     * @param imageIds <p>
     *            The image IDs.
     *            </p>
     *            <p>
     *            Default: Describes all images available to you.
     *            </p>
     */
    public void setImageIds(java.util.Collection<String> imageIds) {
        if (imageIds == null) {
            this.imageIds = null;
            return;
        }

        this.imageIds = new java.util.ArrayList<String>(imageIds);
    }

    /**
     * <p>
     * The image IDs.
     * </p>
     * <p>
     * Default: Describes all images available to you.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageIds <p>
     *            The image IDs.
     *            </p>
     *            <p>
     *            Default: Describes all images available to you.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImagesRequest withImageIds(String... imageIds) {
        if (getImageIds() == null) {
            this.imageIds = new java.util.ArrayList<String>(imageIds.length);
        }
        for (String value : imageIds) {
            this.imageIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The image IDs.
     * </p>
     * <p>
     * Default: Describes all images available to you.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageIds <p>
     *            The image IDs.
     *            </p>
     *            <p>
     *            Default: Describes all images available to you.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImagesRequest withImageIds(java.util.Collection<String> imageIds) {
        setImageIds(imageIds);
        return this;
    }

    /**
     * <p>
     * Filters the images by the owner. Specify an AWS account ID,
     * <code>self</code> (owner is the sender of the request), or an AWS owner
     * alias (valid values are <code>amazon</code> |
     * <code>aws-marketplace</code> | <code>microsoft</code>). Omitting this
     * option returns all images for which you have launch permissions,
     * regardless of ownership.
     * </p>
     *
     * @return <p>
     *         Filters the images by the owner. Specify an AWS account ID,
     *         <code>self</code> (owner is the sender of the request), or an AWS
     *         owner alias (valid values are <code>amazon</code> |
     *         <code>aws-marketplace</code> | <code>microsoft</code>). Omitting
     *         this option returns all images for which you have launch
     *         permissions, regardless of ownership.
     *         </p>
     */
    public java.util.List<String> getOwners() {
        return owners;
    }

    /**
     * <p>
     * Filters the images by the owner. Specify an AWS account ID,
     * <code>self</code> (owner is the sender of the request), or an AWS owner
     * alias (valid values are <code>amazon</code> |
     * <code>aws-marketplace</code> | <code>microsoft</code>). Omitting this
     * option returns all images for which you have launch permissions,
     * regardless of ownership.
     * </p>
     *
     * @param owners <p>
     *            Filters the images by the owner. Specify an AWS account ID,
     *            <code>self</code> (owner is the sender of the request), or an
     *            AWS owner alias (valid values are <code>amazon</code> |
     *            <code>aws-marketplace</code> | <code>microsoft</code>).
     *            Omitting this option returns all images for which you have
     *            launch permissions, regardless of ownership.
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
     * Filters the images by the owner. Specify an AWS account ID,
     * <code>self</code> (owner is the sender of the request), or an AWS owner
     * alias (valid values are <code>amazon</code> |
     * <code>aws-marketplace</code> | <code>microsoft</code>). Omitting this
     * option returns all images for which you have launch permissions,
     * regardless of ownership.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param owners <p>
     *            Filters the images by the owner. Specify an AWS account ID,
     *            <code>self</code> (owner is the sender of the request), or an
     *            AWS owner alias (valid values are <code>amazon</code> |
     *            <code>aws-marketplace</code> | <code>microsoft</code>).
     *            Omitting this option returns all images for which you have
     *            launch permissions, regardless of ownership.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImagesRequest withOwners(String... owners) {
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
     * Filters the images by the owner. Specify an AWS account ID,
     * <code>self</code> (owner is the sender of the request), or an AWS owner
     * alias (valid values are <code>amazon</code> |
     * <code>aws-marketplace</code> | <code>microsoft</code>). Omitting this
     * option returns all images for which you have launch permissions,
     * regardless of ownership.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param owners <p>
     *            Filters the images by the owner. Specify an AWS account ID,
     *            <code>self</code> (owner is the sender of the request), or an
     *            AWS owner alias (valid values are <code>amazon</code> |
     *            <code>aws-marketplace</code> | <code>microsoft</code>).
     *            Omitting this option returns all images for which you have
     *            launch permissions, regardless of ownership.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImagesRequest withOwners(java.util.Collection<String> owners) {
        setOwners(owners);
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
    public DescribeImagesRequest withDryRun(Boolean dryRun) {
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
        if (getExecutableUsers() != null)
            sb.append("ExecutableUsers: " + getExecutableUsers() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getImageIds() != null)
            sb.append("ImageIds: " + getImageIds() + ",");
        if (getOwners() != null)
            sb.append("Owners: " + getOwners() + ",");
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
                + ((getExecutableUsers() == null) ? 0 : getExecutableUsers().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getImageIds() == null) ? 0 : getImageIds().hashCode());
        hashCode = prime * hashCode + ((getOwners() == null) ? 0 : getOwners().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeImagesRequest == false)
            return false;
        DescribeImagesRequest other = (DescribeImagesRequest) obj;

        if (other.getExecutableUsers() == null ^ this.getExecutableUsers() == null)
            return false;
        if (other.getExecutableUsers() != null
                && other.getExecutableUsers().equals(this.getExecutableUsers()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getImageIds() == null ^ this.getImageIds() == null)
            return false;
        if (other.getImageIds() != null && other.getImageIds().equals(this.getImageIds()) == false)
            return false;
        if (other.getOwners() == null ^ this.getOwners() == null)
            return false;
        if (other.getOwners() != null && other.getOwners().equals(this.getOwners()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
