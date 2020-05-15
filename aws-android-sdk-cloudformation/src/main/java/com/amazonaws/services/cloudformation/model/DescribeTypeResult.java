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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

public class DescribeTypeResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[A-Za-z0-9-]{0,64}:cloudformation:[A-Za-z0-9-]{1,64
     * }:([0-9]{12})?:type/.+<br/>
     */
    private String arn;

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESOURCE
     */
    private String type;

    /**
     * <p>
     * The name of the registered type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 196<br/>
     * <b>Pattern: </b>[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}
     * <br/>
     */
    private String typeName;

    /**
     * <p>
     * The ID of the default version of the type. The default version is used
     * when the type version is not specified.
     * </p>
     * <p>
     * To set the default version of a type, use
     * <code> <a>SetTypeDefaultVersion</a> </code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[A-Za-z0-9-]+<br/>
     */
    private String defaultVersionId;

    /**
     * <p>
     * Whether the specified type version is set as the default version.
     * </p>
     */
    private Boolean isDefaultVersion;

    /**
     * <p>
     * The description of the registered type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The schema that defines the type.
     * </p>
     * <p>
     * For more information on type schemas, see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html"
     * >Resource Provider Schema</a> in the <i>CloudFormation CLI User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16777216<br/>
     */
    private String schema;

    /**
     * <p>
     * The provisioning behavior of the type. AWS CloudFormation determines the
     * provisioning type during registration, based on the types of handlers in
     * the schema handler package submitted.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULLY_MUTABLE</code>: The type includes an update handler to
     * process updates to the type during stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMMUTABLE</code>: The type does not include an update handler, so
     * the type cannot be updated and must instead be replaced during stack
     * update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROVISIONABLE</code>: The type does not include all of the
     * following handlers, and therefore cannot actually be provisioned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * create
     * </p>
     * </li>
     * <li>
     * <p>
     * read
     * </p>
     * </li>
     * <li>
     * <p>
     * delete
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NON_PROVISIONABLE, IMMUTABLE, FULLY_MUTABLE
     */
    private String provisioningType;

    /**
     * <p>
     * The deprecation status of the type.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type is registered and can be used in
     * CloudFormation operations, dependent on its provisioning behavior and
     * visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type has been deregistered and can no longer
     * be used in CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, DEPRECATED
     */
    private String deprecatedStatus;

    /**
     * <p>
     * Contains logging configuration information for a type.
     * </p>
     */
    private LoggingConfig loggingConfig;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM execution role used to register
     * the type. If your resource type calls AWS APIs in any of its handlers,
     * you must create an <i> <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM
     * execution role</a> </i> that includes the necessary permissions to call
     * those AWS APIs, and provision that execution role in your account.
     * CloudFormation then assumes that execution role to provide your resource
     * type with the appropriate credentials.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>arn:.+:iam::[0-9]{12}:role/.+<br/>
     */
    private String executionRoleArn;

    /**
     * <p>
     * The scope at which the type is visible and usable in CloudFormation
     * operations.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIVATE</code>: The type is only visible and usable within the
     * account in which it is registered. Currently, AWS CloudFormation marks
     * any types you register as <code>PRIVATE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC</code>: The type is publically visible and usable within any
     * Amazon account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, PRIVATE
     */
    private String visibility;

    /**
     * <p>
     * The URL of the source code for the type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     */
    private String sourceUrl;

    /**
     * <p>
     * The URL of a page providing detailed documentation for this type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     */
    private String documentationUrl;

    /**
     * <p>
     * When the specified type version was registered.
     * </p>
     */
    private java.util.Date lastUpdated;

    /**
     * <p>
     * When the specified type version was registered.
     * </p>
     */
    private java.util.Date timeCreated;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[A-Za-z0-9-]{0,64}:cloudformation:[A-Za-z0-9-]{1,64
     * }:([0-9]{12})?:type/.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the type.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[A-Za-z0-9-]{0,64}:cloudformation:[A-Za-z0-9-]{1,64
     * }:([0-9]{12})?:type/.+<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the type.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[A-Za-z0-9-]{0,64}:cloudformation:[A-Za-z0-9-]{1,64
     * }:([0-9]{12})?:type/.+<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTypeResult withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESOURCE
     *
     * @return <p>
     *         The kind of type.
     *         </p>
     *         <p>
     *         Currently the only valid value is <code>RESOURCE</code>.
     *         </p>
     * @see RegistryType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESOURCE
     *
     * @param type <p>
     *            The kind of type.
     *            </p>
     *            <p>
     *            Currently the only valid value is <code>RESOURCE</code>.
     *            </p>
     * @see RegistryType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESOURCE
     *
     * @param type <p>
     *            The kind of type.
     *            </p>
     *            <p>
     *            Currently the only valid value is <code>RESOURCE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RegistryType
     */
    public DescribeTypeResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESOURCE
     *
     * @param type <p>
     *            The kind of type.
     *            </p>
     *            <p>
     *            Currently the only valid value is <code>RESOURCE</code>.
     *            </p>
     * @see RegistryType
     */
    public void setType(RegistryType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESOURCE
     *
     * @param type <p>
     *            The kind of type.
     *            </p>
     *            <p>
     *            Currently the only valid value is <code>RESOURCE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RegistryType
     */
    public DescribeTypeResult withType(RegistryType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the registered type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 196<br/>
     * <b>Pattern: </b>[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}
     * <br/>
     *
     * @return <p>
     *         The name of the registered type.
     *         </p>
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * <p>
     * The name of the registered type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 196<br/>
     * <b>Pattern: </b>[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}
     * <br/>
     *
     * @param typeName <p>
     *            The name of the registered type.
     *            </p>
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the registered type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 196<br/>
     * <b>Pattern: </b>[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}
     * <br/>
     *
     * @param typeName <p>
     *            The name of the registered type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTypeResult withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * <p>
     * The ID of the default version of the type. The default version is used
     * when the type version is not specified.
     * </p>
     * <p>
     * To set the default version of a type, use
     * <code> <a>SetTypeDefaultVersion</a> </code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[A-Za-z0-9-]+<br/>
     *
     * @return <p>
     *         The ID of the default version of the type. The default version is
     *         used when the type version is not specified.
     *         </p>
     *         <p>
     *         To set the default version of a type, use
     *         <code> <a>SetTypeDefaultVersion</a> </code>.
     *         </p>
     */
    public String getDefaultVersionId() {
        return defaultVersionId;
    }

    /**
     * <p>
     * The ID of the default version of the type. The default version is used
     * when the type version is not specified.
     * </p>
     * <p>
     * To set the default version of a type, use
     * <code> <a>SetTypeDefaultVersion</a> </code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[A-Za-z0-9-]+<br/>
     *
     * @param defaultVersionId <p>
     *            The ID of the default version of the type. The default version
     *            is used when the type version is not specified.
     *            </p>
     *            <p>
     *            To set the default version of a type, use
     *            <code> <a>SetTypeDefaultVersion</a> </code>.
     *            </p>
     */
    public void setDefaultVersionId(String defaultVersionId) {
        this.defaultVersionId = defaultVersionId;
    }

    /**
     * <p>
     * The ID of the default version of the type. The default version is used
     * when the type version is not specified.
     * </p>
     * <p>
     * To set the default version of a type, use
     * <code> <a>SetTypeDefaultVersion</a> </code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[A-Za-z0-9-]+<br/>
     *
     * @param defaultVersionId <p>
     *            The ID of the default version of the type. The default version
     *            is used when the type version is not specified.
     *            </p>
     *            <p>
     *            To set the default version of a type, use
     *            <code> <a>SetTypeDefaultVersion</a> </code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTypeResult withDefaultVersionId(String defaultVersionId) {
        this.defaultVersionId = defaultVersionId;
        return this;
    }

    /**
     * <p>
     * Whether the specified type version is set as the default version.
     * </p>
     *
     * @return <p>
     *         Whether the specified type version is set as the default version.
     *         </p>
     */
    public Boolean isIsDefaultVersion() {
        return isDefaultVersion;
    }

    /**
     * <p>
     * Whether the specified type version is set as the default version.
     * </p>
     *
     * @return <p>
     *         Whether the specified type version is set as the default version.
     *         </p>
     */
    public Boolean getIsDefaultVersion() {
        return isDefaultVersion;
    }

    /**
     * <p>
     * Whether the specified type version is set as the default version.
     * </p>
     *
     * @param isDefaultVersion <p>
     *            Whether the specified type version is set as the default
     *            version.
     *            </p>
     */
    public void setIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
    }

    /**
     * <p>
     * Whether the specified type version is set as the default version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isDefaultVersion <p>
     *            Whether the specified type version is set as the default
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTypeResult withIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
        return this;
    }

    /**
     * <p>
     * The description of the registered type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The description of the registered type.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the registered type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The description of the registered type.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the registered type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The description of the registered type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTypeResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The schema that defines the type.
     * </p>
     * <p>
     * For more information on type schemas, see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html"
     * >Resource Provider Schema</a> in the <i>CloudFormation CLI User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16777216<br/>
     *
     * @return <p>
     *         The schema that defines the type.
     *         </p>
     *         <p>
     *         For more information on type schemas, see <a href=
     *         "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html"
     *         >Resource Provider Schema</a> in the <i>CloudFormation CLI User
     *         Guide</i>.
     *         </p>
     */
    public String getSchema() {
        return schema;
    }

    /**
     * <p>
     * The schema that defines the type.
     * </p>
     * <p>
     * For more information on type schemas, see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html"
     * >Resource Provider Schema</a> in the <i>CloudFormation CLI User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16777216<br/>
     *
     * @param schema <p>
     *            The schema that defines the type.
     *            </p>
     *            <p>
     *            For more information on type schemas, see <a href=
     *            "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html"
     *            >Resource Provider Schema</a> in the <i>CloudFormation CLI
     *            User Guide</i>.
     *            </p>
     */
    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * The schema that defines the type.
     * </p>
     * <p>
     * For more information on type schemas, see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html"
     * >Resource Provider Schema</a> in the <i>CloudFormation CLI User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16777216<br/>
     *
     * @param schema <p>
     *            The schema that defines the type.
     *            </p>
     *            <p>
     *            For more information on type schemas, see <a href=
     *            "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html"
     *            >Resource Provider Schema</a> in the <i>CloudFormation CLI
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTypeResult withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * <p>
     * The provisioning behavior of the type. AWS CloudFormation determines the
     * provisioning type during registration, based on the types of handlers in
     * the schema handler package submitted.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULLY_MUTABLE</code>: The type includes an update handler to
     * process updates to the type during stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMMUTABLE</code>: The type does not include an update handler, so
     * the type cannot be updated and must instead be replaced during stack
     * update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROVISIONABLE</code>: The type does not include all of the
     * following handlers, and therefore cannot actually be provisioned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * create
     * </p>
     * </li>
     * <li>
     * <p>
     * read
     * </p>
     * </li>
     * <li>
     * <p>
     * delete
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NON_PROVISIONABLE, IMMUTABLE, FULLY_MUTABLE
     *
     * @return <p>
     *         The provisioning behavior of the type. AWS CloudFormation
     *         determines the provisioning type during registration, based on
     *         the types of handlers in the schema handler package submitted.
     *         </p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FULLY_MUTABLE</code>: The type includes an update handler
     *         to process updates to the type during stack update operations.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IMMUTABLE</code>: The type does not include an update
     *         handler, so the type cannot be updated and must instead be
     *         replaced during stack update operations.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NON_PROVISIONABLE</code>: The type does not include all of
     *         the following handlers, and therefore cannot actually be
     *         provisioned.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         create
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         read
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         delete
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     * @see ProvisioningType
     */
    public String getProvisioningType() {
        return provisioningType;
    }

    /**
     * <p>
     * The provisioning behavior of the type. AWS CloudFormation determines the
     * provisioning type during registration, based on the types of handlers in
     * the schema handler package submitted.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULLY_MUTABLE</code>: The type includes an update handler to
     * process updates to the type during stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMMUTABLE</code>: The type does not include an update handler, so
     * the type cannot be updated and must instead be replaced during stack
     * update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROVISIONABLE</code>: The type does not include all of the
     * following handlers, and therefore cannot actually be provisioned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * create
     * </p>
     * </li>
     * <li>
     * <p>
     * read
     * </p>
     * </li>
     * <li>
     * <p>
     * delete
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NON_PROVISIONABLE, IMMUTABLE, FULLY_MUTABLE
     *
     * @param provisioningType <p>
     *            The provisioning behavior of the type. AWS CloudFormation
     *            determines the provisioning type during registration, based on
     *            the types of handlers in the schema handler package submitted.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FULLY_MUTABLE</code>: The type includes an update
     *            handler to process updates to the type during stack update
     *            operations.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IMMUTABLE</code>: The type does not include an update
     *            handler, so the type cannot be updated and must instead be
     *            replaced during stack update operations.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NON_PROVISIONABLE</code>: The type does not include all
     *            of the following handlers, and therefore cannot actually be
     *            provisioned.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            create
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            read
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            delete
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @see ProvisioningType
     */
    public void setProvisioningType(String provisioningType) {
        this.provisioningType = provisioningType;
    }

    /**
     * <p>
     * The provisioning behavior of the type. AWS CloudFormation determines the
     * provisioning type during registration, based on the types of handlers in
     * the schema handler package submitted.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULLY_MUTABLE</code>: The type includes an update handler to
     * process updates to the type during stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMMUTABLE</code>: The type does not include an update handler, so
     * the type cannot be updated and must instead be replaced during stack
     * update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROVISIONABLE</code>: The type does not include all of the
     * following handlers, and therefore cannot actually be provisioned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * create
     * </p>
     * </li>
     * <li>
     * <p>
     * read
     * </p>
     * </li>
     * <li>
     * <p>
     * delete
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NON_PROVISIONABLE, IMMUTABLE, FULLY_MUTABLE
     *
     * @param provisioningType <p>
     *            The provisioning behavior of the type. AWS CloudFormation
     *            determines the provisioning type during registration, based on
     *            the types of handlers in the schema handler package submitted.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FULLY_MUTABLE</code>: The type includes an update
     *            handler to process updates to the type during stack update
     *            operations.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IMMUTABLE</code>: The type does not include an update
     *            handler, so the type cannot be updated and must instead be
     *            replaced during stack update operations.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NON_PROVISIONABLE</code>: The type does not include all
     *            of the following handlers, and therefore cannot actually be
     *            provisioned.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            create
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            read
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            delete
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProvisioningType
     */
    public DescribeTypeResult withProvisioningType(String provisioningType) {
        this.provisioningType = provisioningType;
        return this;
    }

    /**
     * <p>
     * The provisioning behavior of the type. AWS CloudFormation determines the
     * provisioning type during registration, based on the types of handlers in
     * the schema handler package submitted.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULLY_MUTABLE</code>: The type includes an update handler to
     * process updates to the type during stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMMUTABLE</code>: The type does not include an update handler, so
     * the type cannot be updated and must instead be replaced during stack
     * update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROVISIONABLE</code>: The type does not include all of the
     * following handlers, and therefore cannot actually be provisioned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * create
     * </p>
     * </li>
     * <li>
     * <p>
     * read
     * </p>
     * </li>
     * <li>
     * <p>
     * delete
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NON_PROVISIONABLE, IMMUTABLE, FULLY_MUTABLE
     *
     * @param provisioningType <p>
     *            The provisioning behavior of the type. AWS CloudFormation
     *            determines the provisioning type during registration, based on
     *            the types of handlers in the schema handler package submitted.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FULLY_MUTABLE</code>: The type includes an update
     *            handler to process updates to the type during stack update
     *            operations.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IMMUTABLE</code>: The type does not include an update
     *            handler, so the type cannot be updated and must instead be
     *            replaced during stack update operations.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NON_PROVISIONABLE</code>: The type does not include all
     *            of the following handlers, and therefore cannot actually be
     *            provisioned.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            create
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            read
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            delete
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @see ProvisioningType
     */
    public void setProvisioningType(ProvisioningType provisioningType) {
        this.provisioningType = provisioningType.toString();
    }

    /**
     * <p>
     * The provisioning behavior of the type. AWS CloudFormation determines the
     * provisioning type during registration, based on the types of handlers in
     * the schema handler package submitted.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULLY_MUTABLE</code>: The type includes an update handler to
     * process updates to the type during stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMMUTABLE</code>: The type does not include an update handler, so
     * the type cannot be updated and must instead be replaced during stack
     * update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROVISIONABLE</code>: The type does not include all of the
     * following handlers, and therefore cannot actually be provisioned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * create
     * </p>
     * </li>
     * <li>
     * <p>
     * read
     * </p>
     * </li>
     * <li>
     * <p>
     * delete
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NON_PROVISIONABLE, IMMUTABLE, FULLY_MUTABLE
     *
     * @param provisioningType <p>
     *            The provisioning behavior of the type. AWS CloudFormation
     *            determines the provisioning type during registration, based on
     *            the types of handlers in the schema handler package submitted.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FULLY_MUTABLE</code>: The type includes an update
     *            handler to process updates to the type during stack update
     *            operations.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IMMUTABLE</code>: The type does not include an update
     *            handler, so the type cannot be updated and must instead be
     *            replaced during stack update operations.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NON_PROVISIONABLE</code>: The type does not include all
     *            of the following handlers, and therefore cannot actually be
     *            provisioned.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            create
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            read
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            delete
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProvisioningType
     */
    public DescribeTypeResult withProvisioningType(ProvisioningType provisioningType) {
        this.provisioningType = provisioningType.toString();
        return this;
    }

    /**
     * <p>
     * The deprecation status of the type.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type is registered and can be used in
     * CloudFormation operations, dependent on its provisioning behavior and
     * visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type has been deregistered and can no longer
     * be used in CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, DEPRECATED
     *
     * @return <p>
     *         The deprecation status of the type.
     *         </p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LIVE</code>: The type is registered and can be used in
     *         CloudFormation operations, dependent on its provisioning behavior
     *         and visibility scope.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DEPRECATED</code>: The type has been deregistered and can
     *         no longer be used in CloudFormation operations.
     *         </p>
     *         </li>
     *         </ul>
     * @see DeprecatedStatus
     */
    public String getDeprecatedStatus() {
        return deprecatedStatus;
    }

    /**
     * <p>
     * The deprecation status of the type.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type is registered and can be used in
     * CloudFormation operations, dependent on its provisioning behavior and
     * visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type has been deregistered and can no longer
     * be used in CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, DEPRECATED
     *
     * @param deprecatedStatus <p>
     *            The deprecation status of the type.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LIVE</code>: The type is registered and can be used in
     *            CloudFormation operations, dependent on its provisioning
     *            behavior and visibility scope.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DEPRECATED</code>: The type has been deregistered and
     *            can no longer be used in CloudFormation operations.
     *            </p>
     *            </li>
     *            </ul>
     * @see DeprecatedStatus
     */
    public void setDeprecatedStatus(String deprecatedStatus) {
        this.deprecatedStatus = deprecatedStatus;
    }

    /**
     * <p>
     * The deprecation status of the type.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type is registered and can be used in
     * CloudFormation operations, dependent on its provisioning behavior and
     * visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type has been deregistered and can no longer
     * be used in CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, DEPRECATED
     *
     * @param deprecatedStatus <p>
     *            The deprecation status of the type.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LIVE</code>: The type is registered and can be used in
     *            CloudFormation operations, dependent on its provisioning
     *            behavior and visibility scope.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DEPRECATED</code>: The type has been deregistered and
     *            can no longer be used in CloudFormation operations.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeprecatedStatus
     */
    public DescribeTypeResult withDeprecatedStatus(String deprecatedStatus) {
        this.deprecatedStatus = deprecatedStatus;
        return this;
    }

    /**
     * <p>
     * The deprecation status of the type.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type is registered and can be used in
     * CloudFormation operations, dependent on its provisioning behavior and
     * visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type has been deregistered and can no longer
     * be used in CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, DEPRECATED
     *
     * @param deprecatedStatus <p>
     *            The deprecation status of the type.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LIVE</code>: The type is registered and can be used in
     *            CloudFormation operations, dependent on its provisioning
     *            behavior and visibility scope.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DEPRECATED</code>: The type has been deregistered and
     *            can no longer be used in CloudFormation operations.
     *            </p>
     *            </li>
     *            </ul>
     * @see DeprecatedStatus
     */
    public void setDeprecatedStatus(DeprecatedStatus deprecatedStatus) {
        this.deprecatedStatus = deprecatedStatus.toString();
    }

    /**
     * <p>
     * The deprecation status of the type.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type is registered and can be used in
     * CloudFormation operations, dependent on its provisioning behavior and
     * visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type has been deregistered and can no longer
     * be used in CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, DEPRECATED
     *
     * @param deprecatedStatus <p>
     *            The deprecation status of the type.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LIVE</code>: The type is registered and can be used in
     *            CloudFormation operations, dependent on its provisioning
     *            behavior and visibility scope.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DEPRECATED</code>: The type has been deregistered and
     *            can no longer be used in CloudFormation operations.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeprecatedStatus
     */
    public DescribeTypeResult withDeprecatedStatus(DeprecatedStatus deprecatedStatus) {
        this.deprecatedStatus = deprecatedStatus.toString();
        return this;
    }

    /**
     * <p>
     * Contains logging configuration information for a type.
     * </p>
     *
     * @return <p>
     *         Contains logging configuration information for a type.
     *         </p>
     */
    public LoggingConfig getLoggingConfig() {
        return loggingConfig;
    }

    /**
     * <p>
     * Contains logging configuration information for a type.
     * </p>
     *
     * @param loggingConfig <p>
     *            Contains logging configuration information for a type.
     *            </p>
     */
    public void setLoggingConfig(LoggingConfig loggingConfig) {
        this.loggingConfig = loggingConfig;
    }

    /**
     * <p>
     * Contains logging configuration information for a type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loggingConfig <p>
     *            Contains logging configuration information for a type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTypeResult withLoggingConfig(LoggingConfig loggingConfig) {
        this.loggingConfig = loggingConfig;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM execution role used to register
     * the type. If your resource type calls AWS APIs in any of its handlers,
     * you must create an <i> <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM
     * execution role</a> </i> that includes the necessary permissions to call
     * those AWS APIs, and provision that execution role in your account.
     * CloudFormation then assumes that execution role to provide your resource
     * type with the appropriate credentials.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>arn:.+:iam::[0-9]{12}:role/.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM execution role used to
     *         register the type. If your resource type calls AWS APIs in any of
     *         its handlers, you must create an <i> <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html"
     *         >IAM execution role</a> </i> that includes the necessary
     *         permissions to call those AWS APIs, and provision that execution
     *         role in your account. CloudFormation then assumes that execution
     *         role to provide your resource type with the appropriate
     *         credentials.
     *         </p>
     */
    public String getExecutionRoleArn() {
        return executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM execution role used to register
     * the type. If your resource type calls AWS APIs in any of its handlers,
     * you must create an <i> <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM
     * execution role</a> </i> that includes the necessary permissions to call
     * those AWS APIs, and provision that execution role in your account.
     * CloudFormation then assumes that execution role to provide your resource
     * type with the appropriate credentials.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>arn:.+:iam::[0-9]{12}:role/.+<br/>
     *
     * @param executionRoleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM execution role used
     *            to register the type. If your resource type calls AWS APIs in
     *            any of its handlers, you must create an <i> <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html"
     *            >IAM execution role</a> </i> that includes the necessary
     *            permissions to call those AWS APIs, and provision that
     *            execution role in your account. CloudFormation then assumes
     *            that execution role to provide your resource type with the
     *            appropriate credentials.
     *            </p>
     */
    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM execution role used to register
     * the type. If your resource type calls AWS APIs in any of its handlers,
     * you must create an <i> <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM
     * execution role</a> </i> that includes the necessary permissions to call
     * those AWS APIs, and provision that execution role in your account.
     * CloudFormation then assumes that execution role to provide your resource
     * type with the appropriate credentials.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>arn:.+:iam::[0-9]{12}:role/.+<br/>
     *
     * @param executionRoleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM execution role used
     *            to register the type. If your resource type calls AWS APIs in
     *            any of its handlers, you must create an <i> <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html"
     *            >IAM execution role</a> </i> that includes the necessary
     *            permissions to call those AWS APIs, and provision that
     *            execution role in your account. CloudFormation then assumes
     *            that execution role to provide your resource type with the
     *            appropriate credentials.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTypeResult withExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }

    /**
     * <p>
     * The scope at which the type is visible and usable in CloudFormation
     * operations.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIVATE</code>: The type is only visible and usable within the
     * account in which it is registered. Currently, AWS CloudFormation marks
     * any types you register as <code>PRIVATE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC</code>: The type is publically visible and usable within any
     * Amazon account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, PRIVATE
     *
     * @return <p>
     *         The scope at which the type is visible and usable in
     *         CloudFormation operations.
     *         </p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PRIVATE</code>: The type is only visible and usable within
     *         the account in which it is registered. Currently, AWS
     *         CloudFormation marks any types you register as
     *         <code>PRIVATE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PUBLIC</code>: The type is publically visible and usable
     *         within any Amazon account.
     *         </p>
     *         </li>
     *         </ul>
     * @see Visibility
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * <p>
     * The scope at which the type is visible and usable in CloudFormation
     * operations.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIVATE</code>: The type is only visible and usable within the
     * account in which it is registered. Currently, AWS CloudFormation marks
     * any types you register as <code>PRIVATE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC</code>: The type is publically visible and usable within any
     * Amazon account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, PRIVATE
     *
     * @param visibility <p>
     *            The scope at which the type is visible and usable in
     *            CloudFormation operations.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PRIVATE</code>: The type is only visible and usable
     *            within the account in which it is registered. Currently, AWS
     *            CloudFormation marks any types you register as
     *            <code>PRIVATE</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PUBLIC</code>: The type is publically visible and usable
     *            within any Amazon account.
     *            </p>
     *            </li>
     *            </ul>
     * @see Visibility
     */
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The scope at which the type is visible and usable in CloudFormation
     * operations.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIVATE</code>: The type is only visible and usable within the
     * account in which it is registered. Currently, AWS CloudFormation marks
     * any types you register as <code>PRIVATE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC</code>: The type is publically visible and usable within any
     * Amazon account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, PRIVATE
     *
     * @param visibility <p>
     *            The scope at which the type is visible and usable in
     *            CloudFormation operations.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PRIVATE</code>: The type is only visible and usable
     *            within the account in which it is registered. Currently, AWS
     *            CloudFormation marks any types you register as
     *            <code>PRIVATE</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PUBLIC</code>: The type is publically visible and usable
     *            within any Amazon account.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Visibility
     */
    public DescribeTypeResult withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * <p>
     * The scope at which the type is visible and usable in CloudFormation
     * operations.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIVATE</code>: The type is only visible and usable within the
     * account in which it is registered. Currently, AWS CloudFormation marks
     * any types you register as <code>PRIVATE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC</code>: The type is publically visible and usable within any
     * Amazon account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, PRIVATE
     *
     * @param visibility <p>
     *            The scope at which the type is visible and usable in
     *            CloudFormation operations.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PRIVATE</code>: The type is only visible and usable
     *            within the account in which it is registered. Currently, AWS
     *            CloudFormation marks any types you register as
     *            <code>PRIVATE</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PUBLIC</code>: The type is publically visible and usable
     *            within any Amazon account.
     *            </p>
     *            </li>
     *            </ul>
     * @see Visibility
     */
    public void setVisibility(Visibility visibility) {
        this.visibility = visibility.toString();
    }

    /**
     * <p>
     * The scope at which the type is visible and usable in CloudFormation
     * operations.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIVATE</code>: The type is only visible and usable within the
     * account in which it is registered. Currently, AWS CloudFormation marks
     * any types you register as <code>PRIVATE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC</code>: The type is publically visible and usable within any
     * Amazon account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, PRIVATE
     *
     * @param visibility <p>
     *            The scope at which the type is visible and usable in
     *            CloudFormation operations.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PRIVATE</code>: The type is only visible and usable
     *            within the account in which it is registered. Currently, AWS
     *            CloudFormation marks any types you register as
     *            <code>PRIVATE</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PUBLIC</code>: The type is publically visible and usable
     *            within any Amazon account.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Visibility
     */
    public DescribeTypeResult withVisibility(Visibility visibility) {
        this.visibility = visibility.toString();
        return this;
    }

    /**
     * <p>
     * The URL of the source code for the type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @return <p>
     *         The URL of the source code for the type.
     *         </p>
     */
    public String getSourceUrl() {
        return sourceUrl;
    }

    /**
     * <p>
     * The URL of the source code for the type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param sourceUrl <p>
     *            The URL of the source code for the type.
     *            </p>
     */
    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    /**
     * <p>
     * The URL of the source code for the type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param sourceUrl <p>
     *            The URL of the source code for the type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTypeResult withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * <p>
     * The URL of a page providing detailed documentation for this type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @return <p>
     *         The URL of a page providing detailed documentation for this type.
     *         </p>
     */
    public String getDocumentationUrl() {
        return documentationUrl;
    }

    /**
     * <p>
     * The URL of a page providing detailed documentation for this type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param documentationUrl <p>
     *            The URL of a page providing detailed documentation for this
     *            type.
     *            </p>
     */
    public void setDocumentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
    }

    /**
     * <p>
     * The URL of a page providing detailed documentation for this type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param documentationUrl <p>
     *            The URL of a page providing detailed documentation for this
     *            type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTypeResult withDocumentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
        return this;
    }

    /**
     * <p>
     * When the specified type version was registered.
     * </p>
     *
     * @return <p>
     *         When the specified type version was registered.
     *         </p>
     */
    public java.util.Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * <p>
     * When the specified type version was registered.
     * </p>
     *
     * @param lastUpdated <p>
     *            When the specified type version was registered.
     *            </p>
     */
    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * When the specified type version was registered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdated <p>
     *            When the specified type version was registered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTypeResult withLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * <p>
     * When the specified type version was registered.
     * </p>
     *
     * @return <p>
     *         When the specified type version was registered.
     *         </p>
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * <p>
     * When the specified type version was registered.
     * </p>
     *
     * @param timeCreated <p>
     *            When the specified type version was registered.
     *            </p>
     */
    public void setTimeCreated(java.util.Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    /**
     * <p>
     * When the specified type version was registered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeCreated <p>
     *            When the specified type version was registered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTypeResult withTimeCreated(java.util.Date timeCreated) {
        this.timeCreated = timeCreated;
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
            sb.append("Arn: " + getArn() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getTypeName() != null)
            sb.append("TypeName: " + getTypeName() + ",");
        if (getDefaultVersionId() != null)
            sb.append("DefaultVersionId: " + getDefaultVersionId() + ",");
        if (getIsDefaultVersion() != null)
            sb.append("IsDefaultVersion: " + getIsDefaultVersion() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getSchema() != null)
            sb.append("Schema: " + getSchema() + ",");
        if (getProvisioningType() != null)
            sb.append("ProvisioningType: " + getProvisioningType() + ",");
        if (getDeprecatedStatus() != null)
            sb.append("DeprecatedStatus: " + getDeprecatedStatus() + ",");
        if (getLoggingConfig() != null)
            sb.append("LoggingConfig: " + getLoggingConfig() + ",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: " + getExecutionRoleArn() + ",");
        if (getVisibility() != null)
            sb.append("Visibility: " + getVisibility() + ",");
        if (getSourceUrl() != null)
            sb.append("SourceUrl: " + getSourceUrl() + ",");
        if (getDocumentationUrl() != null)
            sb.append("DocumentationUrl: " + getDocumentationUrl() + ",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: " + getLastUpdated() + ",");
        if (getTimeCreated() != null)
            sb.append("TimeCreated: " + getTimeCreated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultVersionId() == null) ? 0 : getDefaultVersionId().hashCode());
        hashCode = prime * hashCode
                + ((getIsDefaultVersion() == null) ? 0 : getIsDefaultVersion().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode
                + ((getProvisioningType() == null) ? 0 : getProvisioningType().hashCode());
        hashCode = prime * hashCode
                + ((getDeprecatedStatus() == null) ? 0 : getDeprecatedStatus().hashCode());
        hashCode = prime * hashCode
                + ((getLoggingConfig() == null) ? 0 : getLoggingConfig().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        hashCode = prime * hashCode + ((getSourceUrl() == null) ? 0 : getSourceUrl().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentationUrl() == null) ? 0 : getDocumentationUrl().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode
                + ((getTimeCreated() == null) ? 0 : getTimeCreated().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTypeResult == false)
            return false;
        DescribeTypeResult other = (DescribeTypeResult) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getDefaultVersionId() == null ^ this.getDefaultVersionId() == null)
            return false;
        if (other.getDefaultVersionId() != null
                && other.getDefaultVersionId().equals(this.getDefaultVersionId()) == false)
            return false;
        if (other.getIsDefaultVersion() == null ^ this.getIsDefaultVersion() == null)
            return false;
        if (other.getIsDefaultVersion() != null
                && other.getIsDefaultVersion().equals(this.getIsDefaultVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getProvisioningType() == null ^ this.getProvisioningType() == null)
            return false;
        if (other.getProvisioningType() != null
                && other.getProvisioningType().equals(this.getProvisioningType()) == false)
            return false;
        if (other.getDeprecatedStatus() == null ^ this.getDeprecatedStatus() == null)
            return false;
        if (other.getDeprecatedStatus() != null
                && other.getDeprecatedStatus().equals(this.getDeprecatedStatus()) == false)
            return false;
        if (other.getLoggingConfig() == null ^ this.getLoggingConfig() == null)
            return false;
        if (other.getLoggingConfig() != null
                && other.getLoggingConfig().equals(this.getLoggingConfig()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null
                && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null
                && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        if (other.getSourceUrl() == null ^ this.getSourceUrl() == null)
            return false;
        if (other.getSourceUrl() != null
                && other.getSourceUrl().equals(this.getSourceUrl()) == false)
            return false;
        if (other.getDocumentationUrl() == null ^ this.getDocumentationUrl() == null)
            return false;
        if (other.getDocumentationUrl() != null
                && other.getDocumentationUrl().equals(this.getDocumentationUrl()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null
                && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getTimeCreated() == null ^ this.getTimeCreated() == null)
            return false;
        if (other.getTimeCreated() != null
                && other.getTimeCreated().equals(this.getTimeCreated()) == false)
            return false;
        return true;
    }
}
