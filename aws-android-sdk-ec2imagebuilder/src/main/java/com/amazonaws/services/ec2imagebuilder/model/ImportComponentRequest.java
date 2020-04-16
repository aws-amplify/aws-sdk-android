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

package com.amazonaws.services.ec2imagebuilder.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Imports a component and transforms its data into a component document.
 * </p>
 */
public class ImportComponentRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The semantic version of the component. This version follows the semantic
     * version syntax. For example, major.minor.patch. This could be versioned
     * like software (2.0.1) or like a date (2019.12.01).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]+\.[0-9]+\.[0-9]+$<br/>
     */
    private String semanticVersion;

    /**
     * <p>
     * The description of the component. Describes the contents of the
     * component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The change description of the component. Describes what change has been
     * made in this version, or what makes this version different from other
     * versions of this component.
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
     * The format of the resource that you want to import as a component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SHELL
     */
    private String format;

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
     * The data of the component. Used to specify the data inline. Either
     * <code>data</code> or <code>uri</code> can be used to specify the data
     * within the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String data;

    /**
     * <p>
     * The uri of the component. Must be an S3 URL and the requester must have
     * permission to access the S3 bucket. If you use S3, you can specify
     * component content up to your service quota. Either <code>data</code> or
     * <code>uri</code> can be used to specify the data within the component.
     * </p>
     */
    private String uri;

    /**
     * <p>
     * The ID of the KMS key that should be used to encrypt this component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The tags of the component.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The idempotency token of the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     */
    private String clientToken;

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
    public ImportComponentRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The semantic version of the component. This version follows the semantic
     * version syntax. For example, major.minor.patch. This could be versioned
     * like software (2.0.1) or like a date (2019.12.01).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]+\.[0-9]+\.[0-9]+$<br/>
     *
     * @return <p>
     *         The semantic version of the component. This version follows the
     *         semantic version syntax. For example, major.minor.patch. This
     *         could be versioned like software (2.0.1) or like a date
     *         (2019.12.01).
     *         </p>
     */
    public String getSemanticVersion() {
        return semanticVersion;
    }

    /**
     * <p>
     * The semantic version of the component. This version follows the semantic
     * version syntax. For example, major.minor.patch. This could be versioned
     * like software (2.0.1) or like a date (2019.12.01).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]+\.[0-9]+\.[0-9]+$<br/>
     *
     * @param semanticVersion <p>
     *            The semantic version of the component. This version follows
     *            the semantic version syntax. For example, major.minor.patch.
     *            This could be versioned like software (2.0.1) or like a date
     *            (2019.12.01).
     *            </p>
     */
    public void setSemanticVersion(String semanticVersion) {
        this.semanticVersion = semanticVersion;
    }

    /**
     * <p>
     * The semantic version of the component. This version follows the semantic
     * version syntax. For example, major.minor.patch. This could be versioned
     * like software (2.0.1) or like a date (2019.12.01).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]+\.[0-9]+\.[0-9]+$<br/>
     *
     * @param semanticVersion <p>
     *            The semantic version of the component. This version follows
     *            the semantic version syntax. For example, major.minor.patch.
     *            This could be versioned like software (2.0.1) or like a date
     *            (2019.12.01).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportComponentRequest withSemanticVersion(String semanticVersion) {
        this.semanticVersion = semanticVersion;
        return this;
    }

    /**
     * <p>
     * The description of the component. Describes the contents of the
     * component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The description of the component. Describes the contents of the
     *         component.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the component. Describes the contents of the
     * component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The description of the component. Describes the contents of
     *            the component.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the component. Describes the contents of the
     * component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The description of the component. Describes the contents of
     *            the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportComponentRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The change description of the component. Describes what change has been
     * made in this version, or what makes this version different from other
     * versions of this component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The change description of the component. Describes what change
     *         has been made in this version, or what makes this version
     *         different from other versions of this component.
     *         </p>
     */
    public String getChangeDescription() {
        return changeDescription;
    }

    /**
     * <p>
     * The change description of the component. Describes what change has been
     * made in this version, or what makes this version different from other
     * versions of this component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param changeDescription <p>
     *            The change description of the component. Describes what change
     *            has been made in this version, or what makes this version
     *            different from other versions of this component.
     *            </p>
     */
    public void setChangeDescription(String changeDescription) {
        this.changeDescription = changeDescription;
    }

    /**
     * <p>
     * The change description of the component. Describes what change has been
     * made in this version, or what makes this version different from other
     * versions of this component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param changeDescription <p>
     *            The change description of the component. Describes what change
     *            has been made in this version, or what makes this version
     *            different from other versions of this component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportComponentRequest withChangeDescription(String changeDescription) {
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
    public ImportComponentRequest withType(String type) {
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
    public ImportComponentRequest withType(ComponentType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The format of the resource that you want to import as a component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SHELL
     *
     * @return <p>
     *         The format of the resource that you want to import as a
     *         component.
     *         </p>
     * @see ComponentFormat
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * The format of the resource that you want to import as a component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SHELL
     *
     * @param format <p>
     *            The format of the resource that you want to import as a
     *            component.
     *            </p>
     * @see ComponentFormat
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the resource that you want to import as a component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SHELL
     *
     * @param format <p>
     *            The format of the resource that you want to import as a
     *            component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComponentFormat
     */
    public ImportComponentRequest withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p>
     * The format of the resource that you want to import as a component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SHELL
     *
     * @param format <p>
     *            The format of the resource that you want to import as a
     *            component.
     *            </p>
     * @see ComponentFormat
     */
    public void setFormat(ComponentFormat format) {
        this.format = format.toString();
    }

    /**
     * <p>
     * The format of the resource that you want to import as a component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SHELL
     *
     * @param format <p>
     *            The format of the resource that you want to import as a
     *            component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComponentFormat
     */
    public ImportComponentRequest withFormat(ComponentFormat format) {
        this.format = format.toString();
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
    public ImportComponentRequest withPlatform(String platform) {
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
    public ImportComponentRequest withPlatform(Platform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * The data of the component. Used to specify the data inline. Either
     * <code>data</code> or <code>uri</code> can be used to specify the data
     * within the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The data of the component. Used to specify the data inline.
     *         Either <code>data</code> or <code>uri</code> can be used to
     *         specify the data within the component.
     *         </p>
     */
    public String getData() {
        return data;
    }

    /**
     * <p>
     * The data of the component. Used to specify the data inline. Either
     * <code>data</code> or <code>uri</code> can be used to specify the data
     * within the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param data <p>
     *            The data of the component. Used to specify the data inline.
     *            Either <code>data</code> or <code>uri</code> can be used to
     *            specify the data within the component.
     *            </p>
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * <p>
     * The data of the component. Used to specify the data inline. Either
     * <code>data</code> or <code>uri</code> can be used to specify the data
     * within the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param data <p>
     *            The data of the component. Used to specify the data inline.
     *            Either <code>data</code> or <code>uri</code> can be used to
     *            specify the data within the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportComponentRequest withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * <p>
     * The uri of the component. Must be an S3 URL and the requester must have
     * permission to access the S3 bucket. If you use S3, you can specify
     * component content up to your service quota. Either <code>data</code> or
     * <code>uri</code> can be used to specify the data within the component.
     * </p>
     *
     * @return <p>
     *         The uri of the component. Must be an S3 URL and the requester
     *         must have permission to access the S3 bucket. If you use S3, you
     *         can specify component content up to your service quota. Either
     *         <code>data</code> or <code>uri</code> can be used to specify the
     *         data within the component.
     *         </p>
     */
    public String getUri() {
        return uri;
    }

    /**
     * <p>
     * The uri of the component. Must be an S3 URL and the requester must have
     * permission to access the S3 bucket. If you use S3, you can specify
     * component content up to your service quota. Either <code>data</code> or
     * <code>uri</code> can be used to specify the data within the component.
     * </p>
     *
     * @param uri <p>
     *            The uri of the component. Must be an S3 URL and the requester
     *            must have permission to access the S3 bucket. If you use S3,
     *            you can specify component content up to your service quota.
     *            Either <code>data</code> or <code>uri</code> can be used to
     *            specify the data within the component.
     *            </p>
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * The uri of the component. Must be an S3 URL and the requester must have
     * permission to access the S3 bucket. If you use S3, you can specify
     * component content up to your service quota. Either <code>data</code> or
     * <code>uri</code> can be used to specify the data within the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uri <p>
     *            The uri of the component. Must be an S3 URL and the requester
     *            must have permission to access the S3 bucket. If you use S3,
     *            you can specify component content up to your service quota.
     *            Either <code>data</code> or <code>uri</code> can be used to
     *            specify the data within the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportComponentRequest withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * <p>
     * The ID of the KMS key that should be used to encrypt this component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The ID of the KMS key that should be used to encrypt this
     *         component.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key that should be used to encrypt this component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param kmsKeyId <p>
     *            The ID of the KMS key that should be used to encrypt this
     *            component.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key that should be used to encrypt this component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param kmsKeyId <p>
     *            The ID of the KMS key that should be used to encrypt this
     *            component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportComponentRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The tags of the component.
     * </p>
     *
     * @return <p>
     *         The tags of the component.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of the component.
     * </p>
     *
     * @param tags <p>
     *            The tags of the component.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags of the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportComponentRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags of the component.
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
    public ImportComponentRequest addtagsEntry(String key, String value) {
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
    public ImportComponentRequest cleartagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The idempotency token of the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @return <p>
     *         The idempotency token of the component.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * The idempotency token of the component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param clientToken <p>
     *            The idempotency token of the component.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token of the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param clientToken <p>
     *            The idempotency token of the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportComponentRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getSemanticVersion() != null)
            sb.append("semanticVersion: " + getSemanticVersion() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getChangeDescription() != null)
            sb.append("changeDescription: " + getChangeDescription() + ",");
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getFormat() != null)
            sb.append("format: " + getFormat() + ",");
        if (getPlatform() != null)
            sb.append("platform: " + getPlatform() + ",");
        if (getData() != null)
            sb.append("data: " + getData() + ",");
        if (getUri() != null)
            sb.append("uri: " + getUri() + ",");
        if (getKmsKeyId() != null)
            sb.append("kmsKeyId: " + getKmsKeyId() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getSemanticVersion() == null) ? 0 : getSemanticVersion().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getChangeDescription() == null) ? 0 : getChangeDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportComponentRequest == false)
            return false;
        ImportComponentRequest other = (ImportComponentRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSemanticVersion() == null ^ this.getSemanticVersion() == null)
            return false;
        if (other.getSemanticVersion() != null
                && other.getSemanticVersion().equals(this.getSemanticVersion()) == false)
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
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}
