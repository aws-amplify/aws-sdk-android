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

package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;

/**
 * <p>
 * A detailed view of a component.
 * </p>
 */
public class Component implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):(?:image-recipe
     * |infrastructure
     * -configuration|distribution-configuration|component|image|image
     * -pipeline)/[a-z0-9-_]+(?:/(?:(?:x|\d+)\.(?:x|\d+)\.(?:x|\d+))(?:/\d+)?)?$
     * <br/>
     */
    private String arn;

    /**
     * <p>
     * The name of the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     */
    private String name;

    /**
     * <p>
     * The version of the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]+\.[0-9]+\.[0-9]+$<br/>
     */
    private String version;

    /**
     * <p>
     * The description of the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The change description of the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String changeDescription;

    /**
     * <p>
     * The type of the component denotes whether the component is used to build
     * the image or only to test it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUILD, TEST
     */
    private String type;

    /**
     * <p>
     * The platform of the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     */
    private String platform;

    /**
     * <p>
     * The operating system (OS) version supported by the component. If the OS
     * information is available, a prefix match is performed against the parent
     * image OS version during image recipe creation.
     * </p>
     */
    private java.util.List<String> supportedOsVersions;

    /**
     * <p>
     * The owner of the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String owner;

    /**
     * <p>
     * The data of the component.
     * </p>
     */
    private String data;

    /**
     * <p>
     * The KMS key identifier used to encrypt the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The encryption status of the component.
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * The date that the component was created.
     * </p>
     */
    private String dateCreated;

    /**
     * <p>
     * The tags associated with the component.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):(?:image-recipe
     * |infrastructure
     * -configuration|distribution-configuration|component|image|image
     * -pipeline)/[a-z0-9-_]+(?:/(?:(?:x|\d+)\.(?:x|\d+)\.(?:x|\d+))(?:/\d+)?)?$
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the component.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):(?:image-recipe
     * |infrastructure
     * -configuration|distribution-configuration|component|image|image
     * -pipeline)/[a-z0-9-_]+(?:/(?:(?:x|\d+)\.(?:x|\d+)\.(?:x|\d+))(?:/\d+)?)?$
     * <br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the component.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):(?:image-recipe
     * |infrastructure
     * -configuration|distribution-configuration|component|image|image
     * -pipeline)/[a-z0-9-_]+(?:/(?:(?:x|\d+)\.(?:x|\d+)\.(?:x|\d+))(?:/\d+)?)?$
     * <br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Component withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     *
     * @return <p>
     *         The name of the component.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     *
     * @param name <p>
     *            The name of the component.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     *
     * @param name <p>
     *            The name of the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Component withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The version of the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]+\.[0-9]+\.[0-9]+$<br/>
     *
     * @return <p>
     *         The version of the component.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The version of the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]+\.[0-9]+\.[0-9]+$<br/>
     *
     * @param version <p>
     *            The version of the component.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]+\.[0-9]+\.[0-9]+$<br/>
     *
     * @param version <p>
     *            The version of the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Component withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The description of the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The description of the component.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The description of the component.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The description of the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Component withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The change description of the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The change description of the component.
     *         </p>
     */
    public String getChangeDescription() {
        return changeDescription;
    }

    /**
     * <p>
     * The change description of the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param changeDescription <p>
     *            The change description of the component.
     *            </p>
     */
    public void setChangeDescription(String changeDescription) {
        this.changeDescription = changeDescription;
    }

    /**
     * <p>
     * The change description of the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param changeDescription <p>
     *            The change description of the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Component withChangeDescription(String changeDescription) {
        this.changeDescription = changeDescription;
        return this;
    }

    /**
     * <p>
     * The type of the component denotes whether the component is used to build
     * the image or only to test it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUILD, TEST
     *
     * @return <p>
     *         The type of the component denotes whether the component is used
     *         to build the image or only to test it.
     *         </p>
     * @see ComponentType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the component denotes whether the component is used to build
     * the image or only to test it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUILD, TEST
     *
     * @param type <p>
     *            The type of the component denotes whether the component is
     *            used to build the image or only to test it.
     *            </p>
     * @see ComponentType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the component denotes whether the component is used to build
     * the image or only to test it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUILD, TEST
     *
     * @param type <p>
     *            The type of the component denotes whether the component is
     *            used to build the image or only to test it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComponentType
     */
    public Component withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the component denotes whether the component is used to build
     * the image or only to test it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUILD, TEST
     *
     * @param type <p>
     *            The type of the component denotes whether the component is
     *            used to build the image or only to test it.
     *            </p>
     * @see ComponentType
     */
    public void setType(ComponentType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the component denotes whether the component is used to build
     * the image or only to test it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUILD, TEST
     *
     * @param type <p>
     *            The type of the component denotes whether the component is
     *            used to build the image or only to test it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComponentType
     */
    public Component withType(ComponentType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The platform of the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     *
     * @return <p>
     *         The platform of the component.
     *         </p>
     * @see Platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * <p>
     * The platform of the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     *
     * @param platform <p>
     *            The platform of the component.
     *            </p>
     * @see Platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     *
     * @param platform <p>
     *            The platform of the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Platform
     */
    public Component withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * <p>
     * The platform of the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     *
     * @param platform <p>
     *            The platform of the component.
     *            </p>
     * @see Platform
     */
    public void setPlatform(Platform platform) {
        this.platform = platform.toString();
    }

    /**
     * <p>
     * The platform of the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     *
     * @param platform <p>
     *            The platform of the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Platform
     */
    public Component withPlatform(Platform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * The operating system (OS) version supported by the component. If the OS
     * information is available, a prefix match is performed against the parent
     * image OS version during image recipe creation.
     * </p>
     *
     * @return <p>
     *         The operating system (OS) version supported by the component. If
     *         the OS information is available, a prefix match is performed
     *         against the parent image OS version during image recipe creation.
     *         </p>
     */
    public java.util.List<String> getSupportedOsVersions() {
        return supportedOsVersions;
    }

    /**
     * <p>
     * The operating system (OS) version supported by the component. If the OS
     * information is available, a prefix match is performed against the parent
     * image OS version during image recipe creation.
     * </p>
     *
     * @param supportedOsVersions <p>
     *            The operating system (OS) version supported by the component.
     *            If the OS information is available, a prefix match is
     *            performed against the parent image OS version during image
     *            recipe creation.
     *            </p>
     */
    public void setSupportedOsVersions(java.util.Collection<String> supportedOsVersions) {
        if (supportedOsVersions == null) {
            this.supportedOsVersions = null;
            return;
        }

        this.supportedOsVersions = new java.util.ArrayList<String>(supportedOsVersions);
    }

    /**
     * <p>
     * The operating system (OS) version supported by the component. If the OS
     * information is available, a prefix match is performed against the parent
     * image OS version during image recipe creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedOsVersions <p>
     *            The operating system (OS) version supported by the component.
     *            If the OS information is available, a prefix match is
     *            performed against the parent image OS version during image
     *            recipe creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Component withSupportedOsVersions(String... supportedOsVersions) {
        if (getSupportedOsVersions() == null) {
            this.supportedOsVersions = new java.util.ArrayList<String>(supportedOsVersions.length);
        }
        for (String value : supportedOsVersions) {
            this.supportedOsVersions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The operating system (OS) version supported by the component. If the OS
     * information is available, a prefix match is performed against the parent
     * image OS version during image recipe creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedOsVersions <p>
     *            The operating system (OS) version supported by the component.
     *            If the OS information is available, a prefix match is
     *            performed against the parent image OS version during image
     *            recipe creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Component withSupportedOsVersions(java.util.Collection<String> supportedOsVersions) {
        setSupportedOsVersions(supportedOsVersions);
        return this;
    }

    /**
     * <p>
     * The owner of the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The owner of the component.
     *         </p>
     */
    public String getOwner() {
        return owner;
    }

    /**
     * <p>
     * The owner of the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param owner <p>
     *            The owner of the component.
     *            </p>
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param owner <p>
     *            The owner of the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Component withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p>
     * The data of the component.
     * </p>
     *
     * @return <p>
     *         The data of the component.
     *         </p>
     */
    public String getData() {
        return data;
    }

    /**
     * <p>
     * The data of the component.
     * </p>
     *
     * @param data <p>
     *            The data of the component.
     *            </p>
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * <p>
     * The data of the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param data <p>
     *            The data of the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Component withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * <p>
     * The KMS key identifier used to encrypt the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The KMS key identifier used to encrypt the component.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier used to encrypt the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param kmsKeyId <p>
     *            The KMS key identifier used to encrypt the component.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier used to encrypt the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param kmsKeyId <p>
     *            The KMS key identifier used to encrypt the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Component withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The encryption status of the component.
     * </p>
     *
     * @return <p>
     *         The encryption status of the component.
     *         </p>
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * The encryption status of the component.
     * </p>
     *
     * @return <p>
     *         The encryption status of the component.
     *         </p>
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * The encryption status of the component.
     * </p>
     *
     * @param encrypted <p>
     *            The encryption status of the component.
     *            </p>
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * The encryption status of the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encrypted <p>
     *            The encryption status of the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Component withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * <p>
     * The date that the component was created.
     * </p>
     *
     * @return <p>
     *         The date that the component was created.
     *         </p>
     */
    public String getDateCreated() {
        return dateCreated;
    }

    /**
     * <p>
     * The date that the component was created.
     * </p>
     *
     * @param dateCreated <p>
     *            The date that the component was created.
     *            </p>
     */
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The date that the component was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateCreated <p>
     *            The date that the component was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Component withDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    /**
     * <p>
     * The tags associated with the component.
     * </p>
     *
     * @return <p>
     *         The tags associated with the component.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the component.
     * </p>
     *
     * @param tags <p>
     *            The tags associated with the component.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags associated with the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags associated with the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Component withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags associated with the component.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Component addtagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Component cleartagsEntries() {
        this.tags = null;
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
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getVersion() != null)
            sb.append("version: " + getVersion() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getChangeDescription() != null)
            sb.append("changeDescription: " + getChangeDescription() + ",");
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getPlatform() != null)
            sb.append("platform: " + getPlatform() + ",");
        if (getSupportedOsVersions() != null)
            sb.append("supportedOsVersions: " + getSupportedOsVersions() + ",");
        if (getOwner() != null)
            sb.append("owner: " + getOwner() + ",");
        if (getData() != null)
            sb.append("data: " + getData() + ",");
        if (getKmsKeyId() != null)
            sb.append("kmsKeyId: " + getKmsKeyId() + ",");
        if (getEncrypted() != null)
            sb.append("encrypted: " + getEncrypted() + ",");
        if (getDateCreated() != null)
            sb.append("dateCreated: " + getDateCreated() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getChangeDescription() == null) ? 0 : getChangeDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode
                + ((getSupportedOsVersions() == null) ? 0 : getSupportedOsVersions().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode
                + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Component == false)
            return false;
        Component other = (Component) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getChangeDescription() == null ^ this.getChangeDescription() == null)
            return false;
        if (other.getChangeDescription() != null
                && other.getChangeDescription().equals(this.getChangeDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getSupportedOsVersions() == null ^ this.getSupportedOsVersions() == null)
            return false;
        if (other.getSupportedOsVersions() != null
                && other.getSupportedOsVersions().equals(this.getSupportedOsVersions()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null
                && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null
                && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
