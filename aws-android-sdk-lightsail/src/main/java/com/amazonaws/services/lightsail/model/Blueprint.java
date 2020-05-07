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

/**
 * <p>
 * Describes a blueprint (a virtual private server image).
 * </p>
 */
public class Blueprint implements Serializable {
    /**
     * <p>
     * The ID for the virtual private server image (e.g.,
     * <code>app_wordpress_4_4</code> or <code>app_lamp_7_0</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String blueprintId;

    /**
     * <p>
     * The friendly name of the blueprint (e.g., <code>Amazon Linux</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String name;

    /**
     * <p>
     * The group name of the blueprint (e.g., <code>amazon-linux</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String group;

    /**
     * <p>
     * The type of the blueprint (e.g., <code>os</code> or <code>app</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>os, app
     */
    private String type;

    /**
     * <p>
     * The description of the blueprint.
     * </p>
     */
    private String description;

    /**
     * <p>
     * A Boolean value indicating whether the blueprint is active. Inactive
     * blueprints are listed to support customers with existing instances but
     * are not necessarily available for launch of new instances. Blueprints are
     * marked inactive when they become outdated due to operating system updates
     * or new application releases.
     * </p>
     */
    private Boolean isActive;

    /**
     * <p>
     * The minimum bundle power required to run this blueprint. For example, you
     * need a bundle with a power value of 500 or more to create an instance
     * that uses a blueprint with a minimum power value of 500. <code>0</code>
     * indicates that the blueprint runs on all instance sizes.
     * </p>
     */
    private Integer minPower;

    /**
     * <p>
     * The version number of the operating system, application, or stack (e.g.,
     * <code>2016.03.0</code>).
     * </p>
     */
    private String version;

    /**
     * <p>
     * The version code.
     * </p>
     */
    private String versionCode;

    /**
     * <p>
     * The product URL to learn more about the image or blueprint.
     * </p>
     */
    private String productUrl;

    /**
     * <p>
     * The end-user license agreement URL for the image or blueprint.
     * </p>
     */
    private String licenseUrl;

    /**
     * <p>
     * The operating system platform (either Linux/Unix-based or Windows
     * Server-based) of the blueprint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINUX_UNIX, WINDOWS
     */
    private String platform;

    /**
     * <p>
     * The ID for the virtual private server image (e.g.,
     * <code>app_wordpress_4_4</code> or <code>app_lamp_7_0</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ID for the virtual private server image (e.g.,
     *         <code>app_wordpress_4_4</code> or <code>app_lamp_7_0</code>).
     *         </p>
     */
    public String getBlueprintId() {
        return blueprintId;
    }

    /**
     * <p>
     * The ID for the virtual private server image (e.g.,
     * <code>app_wordpress_4_4</code> or <code>app_lamp_7_0</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param blueprintId <p>
     *            The ID for the virtual private server image (e.g.,
     *            <code>app_wordpress_4_4</code> or <code>app_lamp_7_0</code>).
     *            </p>
     */
    public void setBlueprintId(String blueprintId) {
        this.blueprintId = blueprintId;
    }

    /**
     * <p>
     * The ID for the virtual private server image (e.g.,
     * <code>app_wordpress_4_4</code> or <code>app_lamp_7_0</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param blueprintId <p>
     *            The ID for the virtual private server image (e.g.,
     *            <code>app_wordpress_4_4</code> or <code>app_lamp_7_0</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Blueprint withBlueprintId(String blueprintId) {
        this.blueprintId = blueprintId;
        return this;
    }

    /**
     * <p>
     * The friendly name of the blueprint (e.g., <code>Amazon Linux</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The friendly name of the blueprint (e.g.,
     *         <code>Amazon Linux</code>).
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The friendly name of the blueprint (e.g., <code>Amazon Linux</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The friendly name of the blueprint (e.g.,
     *            <code>Amazon Linux</code>).
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name of the blueprint (e.g., <code>Amazon Linux</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The friendly name of the blueprint (e.g.,
     *            <code>Amazon Linux</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Blueprint withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The group name of the blueprint (e.g., <code>amazon-linux</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The group name of the blueprint (e.g., <code>amazon-linux</code>
     *         ).
     *         </p>
     */
    public String getGroup() {
        return group;
    }

    /**
     * <p>
     * The group name of the blueprint (e.g., <code>amazon-linux</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param group <p>
     *            The group name of the blueprint (e.g.,
     *            <code>amazon-linux</code>).
     *            </p>
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * <p>
     * The group name of the blueprint (e.g., <code>amazon-linux</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param group <p>
     *            The group name of the blueprint (e.g.,
     *            <code>amazon-linux</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Blueprint withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * <p>
     * The type of the blueprint (e.g., <code>os</code> or <code>app</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>os, app
     *
     * @return <p>
     *         The type of the blueprint (e.g., <code>os</code> or
     *         <code>app</code>).
     *         </p>
     * @see BlueprintType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the blueprint (e.g., <code>os</code> or <code>app</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>os, app
     *
     * @param type <p>
     *            The type of the blueprint (e.g., <code>os</code> or
     *            <code>app</code>).
     *            </p>
     * @see BlueprintType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the blueprint (e.g., <code>os</code> or <code>app</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>os, app
     *
     * @param type <p>
     *            The type of the blueprint (e.g., <code>os</code> or
     *            <code>app</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BlueprintType
     */
    public Blueprint withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the blueprint (e.g., <code>os</code> or <code>app</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>os, app
     *
     * @param type <p>
     *            The type of the blueprint (e.g., <code>os</code> or
     *            <code>app</code>).
     *            </p>
     * @see BlueprintType
     */
    public void setType(BlueprintType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the blueprint (e.g., <code>os</code> or <code>app</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>os, app
     *
     * @param type <p>
     *            The type of the blueprint (e.g., <code>os</code> or
     *            <code>app</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BlueprintType
     */
    public Blueprint withType(BlueprintType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The description of the blueprint.
     * </p>
     *
     * @return <p>
     *         The description of the blueprint.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the blueprint.
     * </p>
     *
     * @param description <p>
     *            The description of the blueprint.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the blueprint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the blueprint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Blueprint withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the blueprint is active. Inactive
     * blueprints are listed to support customers with existing instances but
     * are not necessarily available for launch of new instances. Blueprints are
     * marked inactive when they become outdated due to operating system updates
     * or new application releases.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether the blueprint is active.
     *         Inactive blueprints are listed to support customers with existing
     *         instances but are not necessarily available for launch of new
     *         instances. Blueprints are marked inactive when they become
     *         outdated due to operating system updates or new application
     *         releases.
     *         </p>
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * <p>
     * A Boolean value indicating whether the blueprint is active. Inactive
     * blueprints are listed to support customers with existing instances but
     * are not necessarily available for launch of new instances. Blueprints are
     * marked inactive when they become outdated due to operating system updates
     * or new application releases.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether the blueprint is active.
     *         Inactive blueprints are listed to support customers with existing
     *         instances but are not necessarily available for launch of new
     *         instances. Blueprints are marked inactive when they become
     *         outdated due to operating system updates or new application
     *         releases.
     *         </p>
     */
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * <p>
     * A Boolean value indicating whether the blueprint is active. Inactive
     * blueprints are listed to support customers with existing instances but
     * are not necessarily available for launch of new instances. Blueprints are
     * marked inactive when they become outdated due to operating system updates
     * or new application releases.
     * </p>
     *
     * @param isActive <p>
     *            A Boolean value indicating whether the blueprint is active.
     *            Inactive blueprints are listed to support customers with
     *            existing instances but are not necessarily available for
     *            launch of new instances. Blueprints are marked inactive when
     *            they become outdated due to operating system updates or new
     *            application releases.
     *            </p>
     */
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * <p>
     * A Boolean value indicating whether the blueprint is active. Inactive
     * blueprints are listed to support customers with existing instances but
     * are not necessarily available for launch of new instances. Blueprints are
     * marked inactive when they become outdated due to operating system updates
     * or new application releases.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isActive <p>
     *            A Boolean value indicating whether the blueprint is active.
     *            Inactive blueprints are listed to support customers with
     *            existing instances but are not necessarily available for
     *            launch of new instances. Blueprints are marked inactive when
     *            they become outdated due to operating system updates or new
     *            application releases.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Blueprint withIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     * <p>
     * The minimum bundle power required to run this blueprint. For example, you
     * need a bundle with a power value of 500 or more to create an instance
     * that uses a blueprint with a minimum power value of 500. <code>0</code>
     * indicates that the blueprint runs on all instance sizes.
     * </p>
     *
     * @return <p>
     *         The minimum bundle power required to run this blueprint. For
     *         example, you need a bundle with a power value of 500 or more to
     *         create an instance that uses a blueprint with a minimum power
     *         value of 500. <code>0</code> indicates that the blueprint runs on
     *         all instance sizes.
     *         </p>
     */
    public Integer getMinPower() {
        return minPower;
    }

    /**
     * <p>
     * The minimum bundle power required to run this blueprint. For example, you
     * need a bundle with a power value of 500 or more to create an instance
     * that uses a blueprint with a minimum power value of 500. <code>0</code>
     * indicates that the blueprint runs on all instance sizes.
     * </p>
     *
     * @param minPower <p>
     *            The minimum bundle power required to run this blueprint. For
     *            example, you need a bundle with a power value of 500 or more
     *            to create an instance that uses a blueprint with a minimum
     *            power value of 500. <code>0</code> indicates that the
     *            blueprint runs on all instance sizes.
     *            </p>
     */
    public void setMinPower(Integer minPower) {
        this.minPower = minPower;
    }

    /**
     * <p>
     * The minimum bundle power required to run this blueprint. For example, you
     * need a bundle with a power value of 500 or more to create an instance
     * that uses a blueprint with a minimum power value of 500. <code>0</code>
     * indicates that the blueprint runs on all instance sizes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minPower <p>
     *            The minimum bundle power required to run this blueprint. For
     *            example, you need a bundle with a power value of 500 or more
     *            to create an instance that uses a blueprint with a minimum
     *            power value of 500. <code>0</code> indicates that the
     *            blueprint runs on all instance sizes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Blueprint withMinPower(Integer minPower) {
        this.minPower = minPower;
        return this;
    }

    /**
     * <p>
     * The version number of the operating system, application, or stack (e.g.,
     * <code>2016.03.0</code>).
     * </p>
     *
     * @return <p>
     *         The version number of the operating system, application, or stack
     *         (e.g., <code>2016.03.0</code>).
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The version number of the operating system, application, or stack (e.g.,
     * <code>2016.03.0</code>).
     * </p>
     *
     * @param version <p>
     *            The version number of the operating system, application, or
     *            stack (e.g., <code>2016.03.0</code>).
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number of the operating system, application, or stack (e.g.,
     * <code>2016.03.0</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The version number of the operating system, application, or
     *            stack (e.g., <code>2016.03.0</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Blueprint withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The version code.
     * </p>
     *
     * @return <p>
     *         The version code.
     *         </p>
     */
    public String getVersionCode() {
        return versionCode;
    }

    /**
     * <p>
     * The version code.
     * </p>
     *
     * @param versionCode <p>
     *            The version code.
     *            </p>
     */
    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    /**
     * <p>
     * The version code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionCode <p>
     *            The version code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Blueprint withVersionCode(String versionCode) {
        this.versionCode = versionCode;
        return this;
    }

    /**
     * <p>
     * The product URL to learn more about the image or blueprint.
     * </p>
     *
     * @return <p>
     *         The product URL to learn more about the image or blueprint.
     *         </p>
     */
    public String getProductUrl() {
        return productUrl;
    }

    /**
     * <p>
     * The product URL to learn more about the image or blueprint.
     * </p>
     *
     * @param productUrl <p>
     *            The product URL to learn more about the image or blueprint.
     *            </p>
     */
    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    /**
     * <p>
     * The product URL to learn more about the image or blueprint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productUrl <p>
     *            The product URL to learn more about the image or blueprint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Blueprint withProductUrl(String productUrl) {
        this.productUrl = productUrl;
        return this;
    }

    /**
     * <p>
     * The end-user license agreement URL for the image or blueprint.
     * </p>
     *
     * @return <p>
     *         The end-user license agreement URL for the image or blueprint.
     *         </p>
     */
    public String getLicenseUrl() {
        return licenseUrl;
    }

    /**
     * <p>
     * The end-user license agreement URL for the image or blueprint.
     * </p>
     *
     * @param licenseUrl <p>
     *            The end-user license agreement URL for the image or blueprint.
     *            </p>
     */
    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }

    /**
     * <p>
     * The end-user license agreement URL for the image or blueprint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param licenseUrl <p>
     *            The end-user license agreement URL for the image or blueprint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Blueprint withLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
        return this;
    }

    /**
     * <p>
     * The operating system platform (either Linux/Unix-based or Windows
     * Server-based) of the blueprint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINUX_UNIX, WINDOWS
     *
     * @return <p>
     *         The operating system platform (either Linux/Unix-based or Windows
     *         Server-based) of the blueprint.
     *         </p>
     * @see InstancePlatform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * <p>
     * The operating system platform (either Linux/Unix-based or Windows
     * Server-based) of the blueprint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINUX_UNIX, WINDOWS
     *
     * @param platform <p>
     *            The operating system platform (either Linux/Unix-based or
     *            Windows Server-based) of the blueprint.
     *            </p>
     * @see InstancePlatform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The operating system platform (either Linux/Unix-based or Windows
     * Server-based) of the blueprint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINUX_UNIX, WINDOWS
     *
     * @param platform <p>
     *            The operating system platform (either Linux/Unix-based or
     *            Windows Server-based) of the blueprint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstancePlatform
     */
    public Blueprint withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * <p>
     * The operating system platform (either Linux/Unix-based or Windows
     * Server-based) of the blueprint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINUX_UNIX, WINDOWS
     *
     * @param platform <p>
     *            The operating system platform (either Linux/Unix-based or
     *            Windows Server-based) of the blueprint.
     *            </p>
     * @see InstancePlatform
     */
    public void setPlatform(InstancePlatform platform) {
        this.platform = platform.toString();
    }

    /**
     * <p>
     * The operating system platform (either Linux/Unix-based or Windows
     * Server-based) of the blueprint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINUX_UNIX, WINDOWS
     *
     * @param platform <p>
     *            The operating system platform (either Linux/Unix-based or
     *            Windows Server-based) of the blueprint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstancePlatform
     */
    public Blueprint withPlatform(InstancePlatform platform) {
        this.platform = platform.toString();
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
        if (getBlueprintId() != null)
            sb.append("blueprintId: " + getBlueprintId() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getGroup() != null)
            sb.append("group: " + getGroup() + ",");
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getIsActive() != null)
            sb.append("isActive: " + getIsActive() + ",");
        if (getMinPower() != null)
            sb.append("minPower: " + getMinPower() + ",");
        if (getVersion() != null)
            sb.append("version: " + getVersion() + ",");
        if (getVersionCode() != null)
            sb.append("versionCode: " + getVersionCode() + ",");
        if (getProductUrl() != null)
            sb.append("productUrl: " + getProductUrl() + ",");
        if (getLicenseUrl() != null)
            sb.append("licenseUrl: " + getLicenseUrl() + ",");
        if (getPlatform() != null)
            sb.append("platform: " + getPlatform());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBlueprintId() == null) ? 0 : getBlueprintId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIsActive() == null) ? 0 : getIsActive().hashCode());
        hashCode = prime * hashCode + ((getMinPower() == null) ? 0 : getMinPower().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode
                + ((getVersionCode() == null) ? 0 : getVersionCode().hashCode());
        hashCode = prime * hashCode + ((getProductUrl() == null) ? 0 : getProductUrl().hashCode());
        hashCode = prime * hashCode + ((getLicenseUrl() == null) ? 0 : getLicenseUrl().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Blueprint == false)
            return false;
        Blueprint other = (Blueprint) obj;

        if (other.getBlueprintId() == null ^ this.getBlueprintId() == null)
            return false;
        if (other.getBlueprintId() != null
                && other.getBlueprintId().equals(this.getBlueprintId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIsActive() == null ^ this.getIsActive() == null)
            return false;
        if (other.getIsActive() != null && other.getIsActive().equals(this.getIsActive()) == false)
            return false;
        if (other.getMinPower() == null ^ this.getMinPower() == null)
            return false;
        if (other.getMinPower() != null && other.getMinPower().equals(this.getMinPower()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getVersionCode() == null ^ this.getVersionCode() == null)
            return false;
        if (other.getVersionCode() != null
                && other.getVersionCode().equals(this.getVersionCode()) == false)
            return false;
        if (other.getProductUrl() == null ^ this.getProductUrl() == null)
            return false;
        if (other.getProductUrl() != null
                && other.getProductUrl().equals(this.getProductUrl()) == false)
            return false;
        if (other.getLicenseUrl() == null ^ this.getLicenseUrl() == null)
            return false;
        if (other.getLicenseUrl() != null
                && other.getLicenseUrl().equals(this.getLicenseUrl()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        return true;
    }
}
