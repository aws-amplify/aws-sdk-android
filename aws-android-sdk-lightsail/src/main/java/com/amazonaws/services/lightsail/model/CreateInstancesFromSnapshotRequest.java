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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates one or more new instances from a manual or automatic snapshot of an
 * instance.
 * </p>
 * <p>
 * The <code>create instances from snapshot</code> operation supports tag-based
 * access control via request tags and resource tags applied to the resource
 * identified by <code>instance snapshot name</code>. For more information, see
 * the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class CreateInstancesFromSnapshotRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The names for your new instances.
     * </p>
     */
    private java.util.List<String> instanceNames;

    /**
     * <p>
     * An object containing information about one or more disk mappings.
     * </p>
     */
    private java.util.Map<String, java.util.List<DiskMap>> attachedDiskMapping;

    /**
     * <p>
     * The Availability Zone where you want to create your instances. Use the
     * following formatting: <code>us-east-2a</code> (case sensitive). You can
     * get a list of Availability Zones by using the <a href=
     * "http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html"
     * >get regions</a> operation. Be sure to add the
     * <code>include Availability Zones</code> parameter to your request.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The name of the instance snapshot on which you are basing your new
     * instances. Use the get instance snapshots operation to return information
     * about your existing snapshots.
     * </p>
     * <p>
     * Constraint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>source instance name</code> parameter. The
     * <code>instance snapshot name</code> and <code>source instance name</code>
     * parameters are mutually exclusive.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String instanceSnapshotName;

    /**
     * <p>
     * The bundle of specification information for your virtual private server
     * (or <i>instance</i>), including the pricing plan (e.g.,
     * <code>micro_1_0</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String bundleId;

    /**
     * <p>
     * You can create a launch script that configures a server with additional
     * user data. For example, <code>apt-get -y update</code>.
     * </p>
     * <note>
     * <p>
     * Depending on the machine image you choose, the command to get software on
     * your instance varies. Amazon Linux and CentOS use <code>yum</code>,
     * Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses
     * <code>pkg</code>. For a complete list, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/getting-started/article/compare-options-choose-lightsail-instance-image"
     * >Dev Guide</a>.
     * </p>
     * </note>
     */
    private String userData;

    /**
     * <p>
     * The name for your key pair.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String keyPairName;

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * An array of objects representing the add-ons to enable for the new
     * instance.
     * </p>
     */
    private java.util.List<AddOnRequest> addOns;

    /**
     * <p>
     * The name of the source instance from which the source automatic snapshot
     * was created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>instance snapshot name</code> parameter. The
     * <code>source instance name</code> and <code>instance snapshot name</code>
     * parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceInstanceName;

    /**
     * <p>
     * The date of the automatic snapshot to use for the new instance. Use the
     * <code>get auto snapshots</code> operation to identify the dates of the
     * available automatic snapshots.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be specified in <code>YYYY-MM-DD</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>use latest restorable auto snapshot</code> parameter. The
     * <code>restore date</code> and
     * <code>use latest restorable auto snapshot</code> parameters are mutually
     * exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String restoreDate;

    /**
     * <p>
     * A Boolean value to indicate whether to use the latest available automatic
     * snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>restore date</code> parameter. The
     * <code>use latest restorable auto snapshot</code> and
     * <code>restore date</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean useLatestRestorableAutoSnapshot;

    /**
     * <p>
     * The names for your new instances.
     * </p>
     *
     * @return <p>
     *         The names for your new instances.
     *         </p>
     */
    public java.util.List<String> getInstanceNames() {
        return instanceNames;
    }

    /**
     * <p>
     * The names for your new instances.
     * </p>
     *
     * @param instanceNames <p>
     *            The names for your new instances.
     *            </p>
     */
    public void setInstanceNames(java.util.Collection<String> instanceNames) {
        if (instanceNames == null) {
            this.instanceNames = null;
            return;
        }

        this.instanceNames = new java.util.ArrayList<String>(instanceNames);
    }

    /**
     * <p>
     * The names for your new instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceNames <p>
     *            The names for your new instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstancesFromSnapshotRequest withInstanceNames(String... instanceNames) {
        if (getInstanceNames() == null) {
            this.instanceNames = new java.util.ArrayList<String>(instanceNames.length);
        }
        for (String value : instanceNames) {
            this.instanceNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names for your new instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceNames <p>
     *            The names for your new instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstancesFromSnapshotRequest withInstanceNames(
            java.util.Collection<String> instanceNames) {
        setInstanceNames(instanceNames);
        return this;
    }

    /**
     * <p>
     * An object containing information about one or more disk mappings.
     * </p>
     *
     * @return <p>
     *         An object containing information about one or more disk mappings.
     *         </p>
     */
    public java.util.Map<String, java.util.List<DiskMap>> getAttachedDiskMapping() {
        return attachedDiskMapping;
    }

    /**
     * <p>
     * An object containing information about one or more disk mappings.
     * </p>
     *
     * @param attachedDiskMapping <p>
     *            An object containing information about one or more disk
     *            mappings.
     *            </p>
     */
    public void setAttachedDiskMapping(
            java.util.Map<String, java.util.List<DiskMap>> attachedDiskMapping) {
        this.attachedDiskMapping = attachedDiskMapping;
    }

    /**
     * <p>
     * An object containing information about one or more disk mappings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachedDiskMapping <p>
     *            An object containing information about one or more disk
     *            mappings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstancesFromSnapshotRequest withAttachedDiskMapping(
            java.util.Map<String, java.util.List<DiskMap>> attachedDiskMapping) {
        this.attachedDiskMapping = attachedDiskMapping;
        return this;
    }

    /**
     * <p>
     * An object containing information about one or more disk mappings.
     * </p>
     * <p>
     * The method adds a new key-value pair into attachedDiskMapping parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into attachedDiskMapping.
     * @param value The corresponding value of the entry to be added into
     *            attachedDiskMapping.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstancesFromSnapshotRequest addattachedDiskMappingEntry(String key,
            java.util.List<DiskMap> value) {
        if (null == this.attachedDiskMapping) {
            this.attachedDiskMapping = new java.util.HashMap<String, java.util.List<DiskMap>>();
        }
        if (this.attachedDiskMapping.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attachedDiskMapping.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into attachedDiskMapping.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateInstancesFromSnapshotRequest clearattachedDiskMappingEntries() {
        this.attachedDiskMapping = null;
        return this;
    }

    /**
     * <p>
     * The Availability Zone where you want to create your instances. Use the
     * following formatting: <code>us-east-2a</code> (case sensitive). You can
     * get a list of Availability Zones by using the <a href=
     * "http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html"
     * >get regions</a> operation. Be sure to add the
     * <code>include Availability Zones</code> parameter to your request.
     * </p>
     *
     * @return <p>
     *         The Availability Zone where you want to create your instances.
     *         Use the following formatting: <code>us-east-2a</code> (case
     *         sensitive). You can get a list of Availability Zones by using the
     *         <a href=
     *         "http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html"
     *         >get regions</a> operation. Be sure to add the
     *         <code>include Availability Zones</code> parameter to your
     *         request.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where you want to create your instances. Use the
     * following formatting: <code>us-east-2a</code> (case sensitive). You can
     * get a list of Availability Zones by using the <a href=
     * "http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html"
     * >get regions</a> operation. Be sure to add the
     * <code>include Availability Zones</code> parameter to your request.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone where you want to create your instances.
     *            Use the following formatting: <code>us-east-2a</code> (case
     *            sensitive). You can get a list of Availability Zones by using
     *            the <a href=
     *            "http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html"
     *            >get regions</a> operation. Be sure to add the
     *            <code>include Availability Zones</code> parameter to your
     *            request.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where you want to create your instances. Use the
     * following formatting: <code>us-east-2a</code> (case sensitive). You can
     * get a list of Availability Zones by using the <a href=
     * "http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html"
     * >get regions</a> operation. Be sure to add the
     * <code>include Availability Zones</code> parameter to your request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone where you want to create your instances.
     *            Use the following formatting: <code>us-east-2a</code> (case
     *            sensitive). You can get a list of Availability Zones by using
     *            the <a href=
     *            "http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html"
     *            >get regions</a> operation. Be sure to add the
     *            <code>include Availability Zones</code> parameter to your
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstancesFromSnapshotRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The name of the instance snapshot on which you are basing your new
     * instances. Use the get instance snapshots operation to return information
     * about your existing snapshots.
     * </p>
     * <p>
     * Constraint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>source instance name</code> parameter. The
     * <code>instance snapshot name</code> and <code>source instance name</code>
     * parameters are mutually exclusive.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the instance snapshot on which you are basing your
     *         new instances. Use the get instance snapshots operation to return
     *         information about your existing snapshots.
     *         </p>
     *         <p>
     *         Constraint:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         This parameter cannot be defined together with the
     *         <code>source instance name</code> parameter. The
     *         <code>instance snapshot name</code> and
     *         <code>source instance name</code> parameters are mutually
     *         exclusive.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getInstanceSnapshotName() {
        return instanceSnapshotName;
    }

    /**
     * <p>
     * The name of the instance snapshot on which you are basing your new
     * instances. Use the get instance snapshots operation to return information
     * about your existing snapshots.
     * </p>
     * <p>
     * Constraint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>source instance name</code> parameter. The
     * <code>instance snapshot name</code> and <code>source instance name</code>
     * parameters are mutually exclusive.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param instanceSnapshotName <p>
     *            The name of the instance snapshot on which you are basing your
     *            new instances. Use the get instance snapshots operation to
     *            return information about your existing snapshots.
     *            </p>
     *            <p>
     *            Constraint:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            This parameter cannot be defined together with the
     *            <code>source instance name</code> parameter. The
     *            <code>instance snapshot name</code> and
     *            <code>source instance name</code> parameters are mutually
     *            exclusive.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setInstanceSnapshotName(String instanceSnapshotName) {
        this.instanceSnapshotName = instanceSnapshotName;
    }

    /**
     * <p>
     * The name of the instance snapshot on which you are basing your new
     * instances. Use the get instance snapshots operation to return information
     * about your existing snapshots.
     * </p>
     * <p>
     * Constraint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>source instance name</code> parameter. The
     * <code>instance snapshot name</code> and <code>source instance name</code>
     * parameters are mutually exclusive.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param instanceSnapshotName <p>
     *            The name of the instance snapshot on which you are basing your
     *            new instances. Use the get instance snapshots operation to
     *            return information about your existing snapshots.
     *            </p>
     *            <p>
     *            Constraint:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            This parameter cannot be defined together with the
     *            <code>source instance name</code> parameter. The
     *            <code>instance snapshot name</code> and
     *            <code>source instance name</code> parameters are mutually
     *            exclusive.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstancesFromSnapshotRequest withInstanceSnapshotName(String instanceSnapshotName) {
        this.instanceSnapshotName = instanceSnapshotName;
        return this;
    }

    /**
     * <p>
     * The bundle of specification information for your virtual private server
     * (or <i>instance</i>), including the pricing plan (e.g.,
     * <code>micro_1_0</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The bundle of specification information for your virtual private
     *         server (or <i>instance</i>), including the pricing plan (e.g.,
     *         <code>micro_1_0</code>).
     *         </p>
     */
    public String getBundleId() {
        return bundleId;
    }

    /**
     * <p>
     * The bundle of specification information for your virtual private server
     * (or <i>instance</i>), including the pricing plan (e.g.,
     * <code>micro_1_0</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param bundleId <p>
     *            The bundle of specification information for your virtual
     *            private server (or <i>instance</i>), including the pricing
     *            plan (e.g., <code>micro_1_0</code>).
     *            </p>
     */
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The bundle of specification information for your virtual private server
     * (or <i>instance</i>), including the pricing plan (e.g.,
     * <code>micro_1_0</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param bundleId <p>
     *            The bundle of specification information for your virtual
     *            private server (or <i>instance</i>), including the pricing
     *            plan (e.g., <code>micro_1_0</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstancesFromSnapshotRequest withBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    /**
     * <p>
     * You can create a launch script that configures a server with additional
     * user data. For example, <code>apt-get -y update</code>.
     * </p>
     * <note>
     * <p>
     * Depending on the machine image you choose, the command to get software on
     * your instance varies. Amazon Linux and CentOS use <code>yum</code>,
     * Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses
     * <code>pkg</code>. For a complete list, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/getting-started/article/compare-options-choose-lightsail-instance-image"
     * >Dev Guide</a>.
     * </p>
     * </note>
     *
     * @return <p>
     *         You can create a launch script that configures a server with
     *         additional user data. For example, <code>apt-get -y update</code>
     *         .
     *         </p>
     *         <note>
     *         <p>
     *         Depending on the machine image you choose, the command to get
     *         software on your instance varies. Amazon Linux and CentOS use
     *         <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and
     *         FreeBSD uses <code>pkg</code>. For a complete list, see the <a
     *         href=
     *         "https://lightsail.aws.amazon.com/ls/docs/getting-started/article/compare-options-choose-lightsail-instance-image"
     *         >Dev Guide</a>.
     *         </p>
     *         </note>
     */
    public String getUserData() {
        return userData;
    }

    /**
     * <p>
     * You can create a launch script that configures a server with additional
     * user data. For example, <code>apt-get -y update</code>.
     * </p>
     * <note>
     * <p>
     * Depending on the machine image you choose, the command to get software on
     * your instance varies. Amazon Linux and CentOS use <code>yum</code>,
     * Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses
     * <code>pkg</code>. For a complete list, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/getting-started/article/compare-options-choose-lightsail-instance-image"
     * >Dev Guide</a>.
     * </p>
     * </note>
     *
     * @param userData <p>
     *            You can create a launch script that configures a server with
     *            additional user data. For example,
     *            <code>apt-get -y update</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Depending on the machine image you choose, the command to get
     *            software on your instance varies. Amazon Linux and CentOS use
     *            <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>,
     *            and FreeBSD uses <code>pkg</code>. For a complete list, see
     *            the <a href=
     *            "https://lightsail.aws.amazon.com/ls/docs/getting-started/article/compare-options-choose-lightsail-instance-image"
     *            >Dev Guide</a>.
     *            </p>
     *            </note>
     */
    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * You can create a launch script that configures a server with additional
     * user data. For example, <code>apt-get -y update</code>.
     * </p>
     * <note>
     * <p>
     * Depending on the machine image you choose, the command to get software on
     * your instance varies. Amazon Linux and CentOS use <code>yum</code>,
     * Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses
     * <code>pkg</code>. For a complete list, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/getting-started/article/compare-options-choose-lightsail-instance-image"
     * >Dev Guide</a>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userData <p>
     *            You can create a launch script that configures a server with
     *            additional user data. For example,
     *            <code>apt-get -y update</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Depending on the machine image you choose, the command to get
     *            software on your instance varies. Amazon Linux and CentOS use
     *            <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>,
     *            and FreeBSD uses <code>pkg</code>. For a complete list, see
     *            the <a href=
     *            "https://lightsail.aws.amazon.com/ls/docs/getting-started/article/compare-options-choose-lightsail-instance-image"
     *            >Dev Guide</a>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstancesFromSnapshotRequest withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * <p>
     * The name for your key pair.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name for your key pair.
     *         </p>
     */
    public String getKeyPairName() {
        return keyPairName;
    }

    /**
     * <p>
     * The name for your key pair.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param keyPairName <p>
     *            The name for your key pair.
     *            </p>
     */
    public void setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
    }

    /**
     * <p>
     * The name for your key pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param keyPairName <p>
     *            The name for your key pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstancesFromSnapshotRequest withKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     *
     * @return <p>
     *         The tag keys and optional values to add to the resource during
     *         create.
     *         </p>
     *         <p>
     *         To tag a resource after it has been created, see the
     *         <code>tag resource</code> operation.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     *
     * @param tags <p>
     *            The tag keys and optional values to add to the resource during
     *            create.
     *            </p>
     *            <p>
     *            To tag a resource after it has been created, see the
     *            <code>tag resource</code> operation.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag keys and optional values to add to the resource during
     *            create.
     *            </p>
     *            <p>
     *            To tag a resource after it has been created, see the
     *            <code>tag resource</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstancesFromSnapshotRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag keys and optional values to add to the resource during
     *            create.
     *            </p>
     *            <p>
     *            To tag a resource after it has been created, see the
     *            <code>tag resource</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstancesFromSnapshotRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * An array of objects representing the add-ons to enable for the new
     * instance.
     * </p>
     *
     * @return <p>
     *         An array of objects representing the add-ons to enable for the
     *         new instance.
     *         </p>
     */
    public java.util.List<AddOnRequest> getAddOns() {
        return addOns;
    }

    /**
     * <p>
     * An array of objects representing the add-ons to enable for the new
     * instance.
     * </p>
     *
     * @param addOns <p>
     *            An array of objects representing the add-ons to enable for the
     *            new instance.
     *            </p>
     */
    public void setAddOns(java.util.Collection<AddOnRequest> addOns) {
        if (addOns == null) {
            this.addOns = null;
            return;
        }

        this.addOns = new java.util.ArrayList<AddOnRequest>(addOns);
    }

    /**
     * <p>
     * An array of objects representing the add-ons to enable for the new
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addOns <p>
     *            An array of objects representing the add-ons to enable for the
     *            new instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstancesFromSnapshotRequest withAddOns(AddOnRequest... addOns) {
        if (getAddOns() == null) {
            this.addOns = new java.util.ArrayList<AddOnRequest>(addOns.length);
        }
        for (AddOnRequest value : addOns) {
            this.addOns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects representing the add-ons to enable for the new
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addOns <p>
     *            An array of objects representing the add-ons to enable for the
     *            new instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstancesFromSnapshotRequest withAddOns(java.util.Collection<AddOnRequest> addOns) {
        setAddOns(addOns);
        return this;
    }

    /**
     * <p>
     * The name of the source instance from which the source automatic snapshot
     * was created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>instance snapshot name</code> parameter. The
     * <code>source instance name</code> and <code>instance snapshot name</code>
     * parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name of the source instance from which the source automatic
     *         snapshot was created.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         This parameter cannot be defined together with the
     *         <code>instance snapshot name</code> parameter. The
     *         <code>source instance name</code> and
     *         <code>instance snapshot name</code> parameters are mutually
     *         exclusive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Define this parameter only when creating a new instance from an
     *         automatic snapshot. For more information, see the <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     *         >Lightsail Dev Guide</a>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getSourceInstanceName() {
        return sourceInstanceName;
    }

    /**
     * <p>
     * The name of the source instance from which the source automatic snapshot
     * was created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>instance snapshot name</code> parameter. The
     * <code>source instance name</code> and <code>instance snapshot name</code>
     * parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     *
     * @param sourceInstanceName <p>
     *            The name of the source instance from which the source
     *            automatic snapshot was created.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            This parameter cannot be defined together with the
     *            <code>instance snapshot name</code> parameter. The
     *            <code>source instance name</code> and
     *            <code>instance snapshot name</code> parameters are mutually
     *            exclusive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Define this parameter only when creating a new instance from
     *            an automatic snapshot. For more information, see the <a href=
     *            "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     *            >Lightsail Dev Guide</a>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setSourceInstanceName(String sourceInstanceName) {
        this.sourceInstanceName = sourceInstanceName;
    }

    /**
     * <p>
     * The name of the source instance from which the source automatic snapshot
     * was created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>instance snapshot name</code> parameter. The
     * <code>source instance name</code> and <code>instance snapshot name</code>
     * parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceInstanceName <p>
     *            The name of the source instance from which the source
     *            automatic snapshot was created.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            This parameter cannot be defined together with the
     *            <code>instance snapshot name</code> parameter. The
     *            <code>source instance name</code> and
     *            <code>instance snapshot name</code> parameters are mutually
     *            exclusive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Define this parameter only when creating a new instance from
     *            an automatic snapshot. For more information, see the <a href=
     *            "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     *            >Lightsail Dev Guide</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstancesFromSnapshotRequest withSourceInstanceName(String sourceInstanceName) {
        this.sourceInstanceName = sourceInstanceName;
        return this;
    }

    /**
     * <p>
     * The date of the automatic snapshot to use for the new instance. Use the
     * <code>get auto snapshots</code> operation to identify the dates of the
     * available automatic snapshots.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be specified in <code>YYYY-MM-DD</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>use latest restorable auto snapshot</code> parameter. The
     * <code>restore date</code> and
     * <code>use latest restorable auto snapshot</code> parameters are mutually
     * exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The date of the automatic snapshot to use for the new instance.
     *         Use the <code>get auto snapshots</code> operation to identify the
     *         dates of the available automatic snapshots.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be specified in <code>YYYY-MM-DD</code> format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         This parameter cannot be defined together with the
     *         <code>use latest restorable auto snapshot</code> parameter. The
     *         <code>restore date</code> and
     *         <code>use latest restorable auto snapshot</code> parameters are
     *         mutually exclusive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Define this parameter only when creating a new instance from an
     *         automatic snapshot. For more information, see the <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     *         >Lightsail Dev Guide</a>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getRestoreDate() {
        return restoreDate;
    }

    /**
     * <p>
     * The date of the automatic snapshot to use for the new instance. Use the
     * <code>get auto snapshots</code> operation to identify the dates of the
     * available automatic snapshots.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be specified in <code>YYYY-MM-DD</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>use latest restorable auto snapshot</code> parameter. The
     * <code>restore date</code> and
     * <code>use latest restorable auto snapshot</code> parameters are mutually
     * exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     *
     * @param restoreDate <p>
     *            The date of the automatic snapshot to use for the new
     *            instance. Use the <code>get auto snapshots</code> operation to
     *            identify the dates of the available automatic snapshots.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be specified in <code>YYYY-MM-DD</code> format.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            This parameter cannot be defined together with the
     *            <code>use latest restorable auto snapshot</code> parameter.
     *            The <code>restore date</code> and
     *            <code>use latest restorable auto snapshot</code> parameters
     *            are mutually exclusive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Define this parameter only when creating a new instance from
     *            an automatic snapshot. For more information, see the <a href=
     *            "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     *            >Lightsail Dev Guide</a>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setRestoreDate(String restoreDate) {
        this.restoreDate = restoreDate;
    }

    /**
     * <p>
     * The date of the automatic snapshot to use for the new instance. Use the
     * <code>get auto snapshots</code> operation to identify the dates of the
     * available automatic snapshots.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be specified in <code>YYYY-MM-DD</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>use latest restorable auto snapshot</code> parameter. The
     * <code>restore date</code> and
     * <code>use latest restorable auto snapshot</code> parameters are mutually
     * exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restoreDate <p>
     *            The date of the automatic snapshot to use for the new
     *            instance. Use the <code>get auto snapshots</code> operation to
     *            identify the dates of the available automatic snapshots.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be specified in <code>YYYY-MM-DD</code> format.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            This parameter cannot be defined together with the
     *            <code>use latest restorable auto snapshot</code> parameter.
     *            The <code>restore date</code> and
     *            <code>use latest restorable auto snapshot</code> parameters
     *            are mutually exclusive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Define this parameter only when creating a new instance from
     *            an automatic snapshot. For more information, see the <a href=
     *            "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     *            >Lightsail Dev Guide</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstancesFromSnapshotRequest withRestoreDate(String restoreDate) {
        this.restoreDate = restoreDate;
        return this;
    }

    /**
     * <p>
     * A Boolean value to indicate whether to use the latest available automatic
     * snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>restore date</code> parameter. The
     * <code>use latest restorable auto snapshot</code> and
     * <code>restore date</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A Boolean value to indicate whether to use the latest available
     *         automatic snapshot.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         This parameter cannot be defined together with the
     *         <code>restore date</code> parameter. The
     *         <code>use latest restorable auto snapshot</code> and
     *         <code>restore date</code> parameters are mutually exclusive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Define this parameter only when creating a new instance from an
     *         automatic snapshot. For more information, see the <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     *         >Lightsail Dev Guide</a>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean isUseLatestRestorableAutoSnapshot() {
        return useLatestRestorableAutoSnapshot;
    }

    /**
     * <p>
     * A Boolean value to indicate whether to use the latest available automatic
     * snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>restore date</code> parameter. The
     * <code>use latest restorable auto snapshot</code> and
     * <code>restore date</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A Boolean value to indicate whether to use the latest available
     *         automatic snapshot.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         This parameter cannot be defined together with the
     *         <code>restore date</code> parameter. The
     *         <code>use latest restorable auto snapshot</code> and
     *         <code>restore date</code> parameters are mutually exclusive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Define this parameter only when creating a new instance from an
     *         automatic snapshot. For more information, see the <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     *         >Lightsail Dev Guide</a>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean getUseLatestRestorableAutoSnapshot() {
        return useLatestRestorableAutoSnapshot;
    }

    /**
     * <p>
     * A Boolean value to indicate whether to use the latest available automatic
     * snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>restore date</code> parameter. The
     * <code>use latest restorable auto snapshot</code> and
     * <code>restore date</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     *
     * @param useLatestRestorableAutoSnapshot <p>
     *            A Boolean value to indicate whether to use the latest
     *            available automatic snapshot.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            This parameter cannot be defined together with the
     *            <code>restore date</code> parameter. The
     *            <code>use latest restorable auto snapshot</code> and
     *            <code>restore date</code> parameters are mutually exclusive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Define this parameter only when creating a new instance from
     *            an automatic snapshot. For more information, see the <a href=
     *            "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     *            >Lightsail Dev Guide</a>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setUseLatestRestorableAutoSnapshot(Boolean useLatestRestorableAutoSnapshot) {
        this.useLatestRestorableAutoSnapshot = useLatestRestorableAutoSnapshot;
    }

    /**
     * <p>
     * A Boolean value to indicate whether to use the latest available automatic
     * snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the
     * <code>restore date</code> parameter. The
     * <code>use latest restorable auto snapshot</code> and
     * <code>restore date</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when creating a new instance from an automatic
     * snapshot. For more information, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     * >Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param useLatestRestorableAutoSnapshot <p>
     *            A Boolean value to indicate whether to use the latest
     *            available automatic snapshot.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            This parameter cannot be defined together with the
     *            <code>restore date</code> parameter. The
     *            <code>use latest restorable auto snapshot</code> and
     *            <code>restore date</code> parameters are mutually exclusive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Define this parameter only when creating a new instance from
     *            an automatic snapshot. For more information, see the <a href=
     *            "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
     *            >Lightsail Dev Guide</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstancesFromSnapshotRequest withUseLatestRestorableAutoSnapshot(
            Boolean useLatestRestorableAutoSnapshot) {
        this.useLatestRestorableAutoSnapshot = useLatestRestorableAutoSnapshot;
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
        if (getInstanceNames() != null)
            sb.append("instanceNames: " + getInstanceNames() + ",");
        if (getAttachedDiskMapping() != null)
            sb.append("attachedDiskMapping: " + getAttachedDiskMapping() + ",");
        if (getAvailabilityZone() != null)
            sb.append("availabilityZone: " + getAvailabilityZone() + ",");
        if (getInstanceSnapshotName() != null)
            sb.append("instanceSnapshotName: " + getInstanceSnapshotName() + ",");
        if (getBundleId() != null)
            sb.append("bundleId: " + getBundleId() + ",");
        if (getUserData() != null)
            sb.append("userData: " + getUserData() + ",");
        if (getKeyPairName() != null)
            sb.append("keyPairName: " + getKeyPairName() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getAddOns() != null)
            sb.append("addOns: " + getAddOns() + ",");
        if (getSourceInstanceName() != null)
            sb.append("sourceInstanceName: " + getSourceInstanceName() + ",");
        if (getRestoreDate() != null)
            sb.append("restoreDate: " + getRestoreDate() + ",");
        if (getUseLatestRestorableAutoSnapshot() != null)
            sb.append("useLatestRestorableAutoSnapshot: " + getUseLatestRestorableAutoSnapshot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceNames() == null) ? 0 : getInstanceNames().hashCode());
        hashCode = prime * hashCode
                + ((getAttachedDiskMapping() == null) ? 0 : getAttachedDiskMapping().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceSnapshotName() == null) ? 0 : getInstanceSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        hashCode = prime * hashCode
                + ((getKeyPairName() == null) ? 0 : getKeyPairName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getAddOns() == null) ? 0 : getAddOns().hashCode());
        hashCode = prime * hashCode
                + ((getSourceInstanceName() == null) ? 0 : getSourceInstanceName().hashCode());
        hashCode = prime * hashCode
                + ((getRestoreDate() == null) ? 0 : getRestoreDate().hashCode());
        hashCode = prime
                * hashCode
                + ((getUseLatestRestorableAutoSnapshot() == null) ? 0
                        : getUseLatestRestorableAutoSnapshot().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInstancesFromSnapshotRequest == false)
            return false;
        CreateInstancesFromSnapshotRequest other = (CreateInstancesFromSnapshotRequest) obj;

        if (other.getInstanceNames() == null ^ this.getInstanceNames() == null)
            return false;
        if (other.getInstanceNames() != null
                && other.getInstanceNames().equals(this.getInstanceNames()) == false)
            return false;
        if (other.getAttachedDiskMapping() == null ^ this.getAttachedDiskMapping() == null)
            return false;
        if (other.getAttachedDiskMapping() != null
                && other.getAttachedDiskMapping().equals(this.getAttachedDiskMapping()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getInstanceSnapshotName() == null ^ this.getInstanceSnapshotName() == null)
            return false;
        if (other.getInstanceSnapshotName() != null
                && other.getInstanceSnapshotName().equals(this.getInstanceSnapshotName()) == false)
            return false;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false)
            return false;
        if (other.getKeyPairName() == null ^ this.getKeyPairName() == null)
            return false;
        if (other.getKeyPairName() != null
                && other.getKeyPairName().equals(this.getKeyPairName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getAddOns() == null ^ this.getAddOns() == null)
            return false;
        if (other.getAddOns() != null && other.getAddOns().equals(this.getAddOns()) == false)
            return false;
        if (other.getSourceInstanceName() == null ^ this.getSourceInstanceName() == null)
            return false;
        if (other.getSourceInstanceName() != null
                && other.getSourceInstanceName().equals(this.getSourceInstanceName()) == false)
            return false;
        if (other.getRestoreDate() == null ^ this.getRestoreDate() == null)
            return false;
        if (other.getRestoreDate() != null
                && other.getRestoreDate().equals(this.getRestoreDate()) == false)
            return false;
        if (other.getUseLatestRestorableAutoSnapshot() == null
                ^ this.getUseLatestRestorableAutoSnapshot() == null)
            return false;
        if (other.getUseLatestRestorableAutoSnapshot() != null
                && other.getUseLatestRestorableAutoSnapshot().equals(
                        this.getUseLatestRestorableAutoSnapshot()) == false)
            return false;
        return true;
    }
}
