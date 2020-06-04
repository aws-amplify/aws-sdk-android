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
 * Creates one or more Amazon Lightsail instances.
 * </p>
 * <p>
 * The <code>create instances</code> operation supports tag-based access control
 * via request tags. For more information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class CreateInstancesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The names to use for your new Lightsail instances. Separate multiple
     * values using quotation marks and commas, for example:
     * <code>["MyFirstInstance","MySecondInstance"]</code>
     * </p>
     */
    private java.util.List<String> instanceNames;

    /**
     * <p>
     * The Availability Zone in which to create your instance. Use the following
     * format: <code>us-east-2a</code> (case sensitive). You can get a list of
     * Availability Zones by using the <a href=
     * "http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html"
     * >get regions</a> operation. Be sure to add the
     * <code>include Availability Zones</code> parameter to your request.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * (Deprecated) The name for your custom image.
     * </p>
     * <note>
     * <p>
     * In releases prior to June 12, 2017, this parameter was ignored by the
     * API. It is now deprecated.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String customImageName;

    /**
     * <p>
     * The ID for a virtual private server image (e.g.,
     * <code>app_wordpress_4_4</code> or <code>app_lamp_7_0</code>). Use the
     * <code>get blueprints</code> operation to return a list of available
     * images (or <i>blueprints</i>).
     * </p>
     * <note>
     * <p>
     * Use active blueprints when creating new instances. Inactive blueprints
     * are listed to support customers with existing instances and are not
     * necessarily available to create new instances. Blueprints are marked
     * inactive when they become outdated due to operating system updates or new
     * application releases.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String blueprintId;

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
     * A launch script you can create that configures a server with additional
     * user data. For example, you might want to run
     * <code>apt-get -y update</code>.
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
     * The name of your key pair.
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
     * The names to use for your new Lightsail instances. Separate multiple
     * values using quotation marks and commas, for example:
     * <code>["MyFirstInstance","MySecondInstance"]</code>
     * </p>
     *
     * @return <p>
     *         The names to use for your new Lightsail instances. Separate
     *         multiple values using quotation marks and commas, for example:
     *         <code>["MyFirstInstance","MySecondInstance"]</code>
     *         </p>
     */
    public java.util.List<String> getInstanceNames() {
        return instanceNames;
    }

    /**
     * <p>
     * The names to use for your new Lightsail instances. Separate multiple
     * values using quotation marks and commas, for example:
     * <code>["MyFirstInstance","MySecondInstance"]</code>
     * </p>
     *
     * @param instanceNames <p>
     *            The names to use for your new Lightsail instances. Separate
     *            multiple values using quotation marks and commas, for example:
     *            <code>["MyFirstInstance","MySecondInstance"]</code>
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
     * The names to use for your new Lightsail instances. Separate multiple
     * values using quotation marks and commas, for example:
     * <code>["MyFirstInstance","MySecondInstance"]</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceNames <p>
     *            The names to use for your new Lightsail instances. Separate
     *            multiple values using quotation marks and commas, for example:
     *            <code>["MyFirstInstance","MySecondInstance"]</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstancesRequest withInstanceNames(String... instanceNames) {
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
     * The names to use for your new Lightsail instances. Separate multiple
     * values using quotation marks and commas, for example:
     * <code>["MyFirstInstance","MySecondInstance"]</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceNames <p>
     *            The names to use for your new Lightsail instances. Separate
     *            multiple values using quotation marks and commas, for example:
     *            <code>["MyFirstInstance","MySecondInstance"]</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstancesRequest withInstanceNames(java.util.Collection<String> instanceNames) {
        setInstanceNames(instanceNames);
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which to create your instance. Use the following
     * format: <code>us-east-2a</code> (case sensitive). You can get a list of
     * Availability Zones by using the <a href=
     * "http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html"
     * >get regions</a> operation. Be sure to add the
     * <code>include Availability Zones</code> parameter to your request.
     * </p>
     *
     * @return <p>
     *         The Availability Zone in which to create your instance. Use the
     *         following format: <code>us-east-2a</code> (case sensitive). You
     *         can get a list of Availability Zones by using the <a href=
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
     * The Availability Zone in which to create your instance. Use the following
     * format: <code>us-east-2a</code> (case sensitive). You can get a list of
     * Availability Zones by using the <a href=
     * "http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html"
     * >get regions</a> operation. Be sure to add the
     * <code>include Availability Zones</code> parameter to your request.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone in which to create your instance. Use
     *            the following format: <code>us-east-2a</code> (case
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
     * The Availability Zone in which to create your instance. Use the following
     * format: <code>us-east-2a</code> (case sensitive). You can get a list of
     * Availability Zones by using the <a href=
     * "http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html"
     * >get regions</a> operation. Be sure to add the
     * <code>include Availability Zones</code> parameter to your request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone in which to create your instance. Use
     *            the following format: <code>us-east-2a</code> (case
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
    public CreateInstancesRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * (Deprecated) The name for your custom image.
     * </p>
     * <note>
     * <p>
     * In releases prior to June 12, 2017, this parameter was ignored by the
     * API. It is now deprecated.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         (Deprecated) The name for your custom image.
     *         </p>
     *         <note>
     *         <p>
     *         In releases prior to June 12, 2017, this parameter was ignored by
     *         the API. It is now deprecated.
     *         </p>
     *         </note>
     */
    public String getCustomImageName() {
        return customImageName;
    }

    /**
     * <p>
     * (Deprecated) The name for your custom image.
     * </p>
     * <note>
     * <p>
     * In releases prior to June 12, 2017, this parameter was ignored by the
     * API. It is now deprecated.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param customImageName <p>
     *            (Deprecated) The name for your custom image.
     *            </p>
     *            <note>
     *            <p>
     *            In releases prior to June 12, 2017, this parameter was ignored
     *            by the API. It is now deprecated.
     *            </p>
     *            </note>
     */
    public void setCustomImageName(String customImageName) {
        this.customImageName = customImageName;
    }

    /**
     * <p>
     * (Deprecated) The name for your custom image.
     * </p>
     * <note>
     * <p>
     * In releases prior to June 12, 2017, this parameter was ignored by the
     * API. It is now deprecated.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param customImageName <p>
     *            (Deprecated) The name for your custom image.
     *            </p>
     *            <note>
     *            <p>
     *            In releases prior to June 12, 2017, this parameter was ignored
     *            by the API. It is now deprecated.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstancesRequest withCustomImageName(String customImageName) {
        this.customImageName = customImageName;
        return this;
    }

    /**
     * <p>
     * The ID for a virtual private server image (e.g.,
     * <code>app_wordpress_4_4</code> or <code>app_lamp_7_0</code>). Use the
     * <code>get blueprints</code> operation to return a list of available
     * images (or <i>blueprints</i>).
     * </p>
     * <note>
     * <p>
     * Use active blueprints when creating new instances. Inactive blueprints
     * are listed to support customers with existing instances and are not
     * necessarily available to create new instances. Blueprints are marked
     * inactive when they become outdated due to operating system updates or new
     * application releases.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ID for a virtual private server image (e.g.,
     *         <code>app_wordpress_4_4</code> or <code>app_lamp_7_0</code>). Use
     *         the <code>get blueprints</code> operation to return a list of
     *         available images (or <i>blueprints</i>).
     *         </p>
     *         <note>
     *         <p>
     *         Use active blueprints when creating new instances. Inactive
     *         blueprints are listed to support customers with existing
     *         instances and are not necessarily available to create new
     *         instances. Blueprints are marked inactive when they become
     *         outdated due to operating system updates or new application
     *         releases.
     *         </p>
     *         </note>
     */
    public String getBlueprintId() {
        return blueprintId;
    }

    /**
     * <p>
     * The ID for a virtual private server image (e.g.,
     * <code>app_wordpress_4_4</code> or <code>app_lamp_7_0</code>). Use the
     * <code>get blueprints</code> operation to return a list of available
     * images (or <i>blueprints</i>).
     * </p>
     * <note>
     * <p>
     * Use active blueprints when creating new instances. Inactive blueprints
     * are listed to support customers with existing instances and are not
     * necessarily available to create new instances. Blueprints are marked
     * inactive when they become outdated due to operating system updates or new
     * application releases.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param blueprintId <p>
     *            The ID for a virtual private server image (e.g.,
     *            <code>app_wordpress_4_4</code> or <code>app_lamp_7_0</code>).
     *            Use the <code>get blueprints</code> operation to return a list
     *            of available images (or <i>blueprints</i>).
     *            </p>
     *            <note>
     *            <p>
     *            Use active blueprints when creating new instances. Inactive
     *            blueprints are listed to support customers with existing
     *            instances and are not necessarily available to create new
     *            instances. Blueprints are marked inactive when they become
     *            outdated due to operating system updates or new application
     *            releases.
     *            </p>
     *            </note>
     */
    public void setBlueprintId(String blueprintId) {
        this.blueprintId = blueprintId;
    }

    /**
     * <p>
     * The ID for a virtual private server image (e.g.,
     * <code>app_wordpress_4_4</code> or <code>app_lamp_7_0</code>). Use the
     * <code>get blueprints</code> operation to return a list of available
     * images (or <i>blueprints</i>).
     * </p>
     * <note>
     * <p>
     * Use active blueprints when creating new instances. Inactive blueprints
     * are listed to support customers with existing instances and are not
     * necessarily available to create new instances. Blueprints are marked
     * inactive when they become outdated due to operating system updates or new
     * application releases.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param blueprintId <p>
     *            The ID for a virtual private server image (e.g.,
     *            <code>app_wordpress_4_4</code> or <code>app_lamp_7_0</code>).
     *            Use the <code>get blueprints</code> operation to return a list
     *            of available images (or <i>blueprints</i>).
     *            </p>
     *            <note>
     *            <p>
     *            Use active blueprints when creating new instances. Inactive
     *            blueprints are listed to support customers with existing
     *            instances and are not necessarily available to create new
     *            instances. Blueprints are marked inactive when they become
     *            outdated due to operating system updates or new application
     *            releases.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstancesRequest withBlueprintId(String blueprintId) {
        this.blueprintId = blueprintId;
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
    public CreateInstancesRequest withBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    /**
     * <p>
     * A launch script you can create that configures a server with additional
     * user data. For example, you might want to run
     * <code>apt-get -y update</code>.
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
     *         A launch script you can create that configures a server with
     *         additional user data. For example, you might want to run
     *         <code>apt-get -y update</code>.
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
     * A launch script you can create that configures a server with additional
     * user data. For example, you might want to run
     * <code>apt-get -y update</code>.
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
     *            A launch script you can create that configures a server with
     *            additional user data. For example, you might want to run
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
     * A launch script you can create that configures a server with additional
     * user data. For example, you might want to run
     * <code>apt-get -y update</code>.
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
     *            A launch script you can create that configures a server with
     *            additional user data. For example, you might want to run
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
    public CreateInstancesRequest withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * <p>
     * The name of your key pair.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of your key pair.
     *         </p>
     */
    public String getKeyPairName() {
        return keyPairName;
    }

    /**
     * <p>
     * The name of your key pair.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param keyPairName <p>
     *            The name of your key pair.
     *            </p>
     */
    public void setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
    }

    /**
     * <p>
     * The name of your key pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param keyPairName <p>
     *            The name of your key pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstancesRequest withKeyPairName(String keyPairName) {
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
    public CreateInstancesRequest withTags(Tag... tags) {
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
    public CreateInstancesRequest withTags(java.util.Collection<Tag> tags) {
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
    public CreateInstancesRequest withAddOns(AddOnRequest... addOns) {
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
    public CreateInstancesRequest withAddOns(java.util.Collection<AddOnRequest> addOns) {
        setAddOns(addOns);
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
        if (getAvailabilityZone() != null)
            sb.append("availabilityZone: " + getAvailabilityZone() + ",");
        if (getCustomImageName() != null)
            sb.append("customImageName: " + getCustomImageName() + ",");
        if (getBlueprintId() != null)
            sb.append("blueprintId: " + getBlueprintId() + ",");
        if (getBundleId() != null)
            sb.append("bundleId: " + getBundleId() + ",");
        if (getUserData() != null)
            sb.append("userData: " + getUserData() + ",");
        if (getKeyPairName() != null)
            sb.append("keyPairName: " + getKeyPairName() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getAddOns() != null)
            sb.append("addOns: " + getAddOns());
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
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode
                + ((getCustomImageName() == null) ? 0 : getCustomImageName().hashCode());
        hashCode = prime * hashCode
                + ((getBlueprintId() == null) ? 0 : getBlueprintId().hashCode());
        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        hashCode = prime * hashCode
                + ((getKeyPairName() == null) ? 0 : getKeyPairName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getAddOns() == null) ? 0 : getAddOns().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInstancesRequest == false)
            return false;
        CreateInstancesRequest other = (CreateInstancesRequest) obj;

        if (other.getInstanceNames() == null ^ this.getInstanceNames() == null)
            return false;
        if (other.getInstanceNames() != null
                && other.getInstanceNames().equals(this.getInstanceNames()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getCustomImageName() == null ^ this.getCustomImageName() == null)
            return false;
        if (other.getCustomImageName() != null
                && other.getCustomImageName().equals(this.getCustomImageName()) == false)
            return false;
        if (other.getBlueprintId() == null ^ this.getBlueprintId() == null)
            return false;
        if (other.getBlueprintId() != null
                && other.getBlueprintId().equals(this.getBlueprintId()) == false)
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
        return true;
    }
}
