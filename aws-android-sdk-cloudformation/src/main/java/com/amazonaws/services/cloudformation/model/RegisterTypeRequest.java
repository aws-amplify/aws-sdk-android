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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Registers a type with the CloudFormation service. Registering a type makes it
 * available for use in CloudFormation templates in your AWS account, and
 * includes:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Validating the resource schema
 * </p>
 * </li>
 * <li>
 * <p>
 * Determining which handlers have been specified for the resource
 * </p>
 * </li>
 * <li>
 * <p>
 * Making the resource type available for use in your account
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information on how to develop types and ready them for
 * registeration, see <a href=
 * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-types.html"
 * >Creating Resource Providers</a> in the <i>CloudFormation CLI User Guide</i>.
 * </p>
 * <p>
 * You can have a maximum of 50 resource type versions registered at a time.
 * This maximum is per account and per region. Use <a
 * href="AWSCloudFormation/latest/APIReference/API_DeregisterType.html"
 * >DeregisterType</a> to deregister specific resource type versions if
 * necessary.
 * </p>
 * <p>
 * Once you have initiated a registration request using
 * <code> <a>RegisterType</a> </code>, you can use
 * <code> <a>DescribeTypeRegistration</a> </code> to monitor the progress of the
 * registration request.
 * </p>
 */
public class RegisterTypeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Currently, the only valid value is <code>RESOURCE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESOURCE
     */
    private String type;

    /**
     * <p>
     * The name of the type being registered.
     * </p>
     * <p>
     * We recommend that type names adhere to the following pattern:
     * <i>company_or_organization</i>::<i>service</i>::<i>type</i>.
     * </p>
     * <note>
     * <p>
     * The following organization namespaces are reserved and cannot be used in
     * your resource type names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Alexa</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AMZN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Amazon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Custom</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dev</code>
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 196<br/>
     * <b>Pattern: </b>[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}
     * <br/>
     */
    private String typeName;

    /**
     * <p>
     * A url to the S3 bucket containing the schema handler package that
     * contains the schema, event handlers, and associated files for the type
     * you want to register.
     * </p>
     * <p>
     * For information on generating a schema handler package for the type you
     * want to register, see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html"
     * >submit</a> in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     * <note>
     * <p>
     * As part of registering a resource provider type, CloudFormation must be
     * able to access the S3 bucket which contains the schema handler package
     * for that resource provider. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry.html#registry-register-permissions"
     * >IAM Permissions for Registering a Resource Provider</a> in the <i>AWS
     * CloudFormation User Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     */
    private String schemaHandlerPackage;

    /**
     * <p>
     * Specifies logging configuration information for a type.
     * </p>
     */
    private LoggingConfig loggingConfig;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM execution role to use to
     * register the type. If your resource type calls AWS APIs in any of its
     * handlers, you must create an <i> <a
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
     * A unique identifier that acts as an idempotency key for this registration
     * request. Specifying a client request token prevents CloudFormation from
     * generating more than one version of a type from the same registeration
     * request, even if the request is submitted multiple times.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Currently, the only valid value is <code>RESOURCE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESOURCE
     *
     * @return <p>
     *         The kind of type.
     *         </p>
     *         <p>
     *         Currently, the only valid value is <code>RESOURCE</code>.
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
     * Currently, the only valid value is <code>RESOURCE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESOURCE
     *
     * @param type <p>
     *            The kind of type.
     *            </p>
     *            <p>
     *            Currently, the only valid value is <code>RESOURCE</code>.
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
     * Currently, the only valid value is <code>RESOURCE</code>.
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
     *            Currently, the only valid value is <code>RESOURCE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RegistryType
     */
    public RegisterTypeRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Currently, the only valid value is <code>RESOURCE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESOURCE
     *
     * @param type <p>
     *            The kind of type.
     *            </p>
     *            <p>
     *            Currently, the only valid value is <code>RESOURCE</code>.
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
     * Currently, the only valid value is <code>RESOURCE</code>.
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
     *            Currently, the only valid value is <code>RESOURCE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RegistryType
     */
    public RegisterTypeRequest withType(RegistryType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the type being registered.
     * </p>
     * <p>
     * We recommend that type names adhere to the following pattern:
     * <i>company_or_organization</i>::<i>service</i>::<i>type</i>.
     * </p>
     * <note>
     * <p>
     * The following organization namespaces are reserved and cannot be used in
     * your resource type names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Alexa</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AMZN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Amazon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Custom</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dev</code>
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 196<br/>
     * <b>Pattern: </b>[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}
     * <br/>
     *
     * @return <p>
     *         The name of the type being registered.
     *         </p>
     *         <p>
     *         We recommend that type names adhere to the following pattern:
     *         <i>company_or_organization</i>::<i>service</i>::<i>type</i>.
     *         </p>
     *         <note>
     *         <p>
     *         The following organization namespaces are reserved and cannot be
     *         used in your resource type names:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Alexa</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AMZN</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Amazon</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Custom</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Dev</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </note>
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * <p>
     * The name of the type being registered.
     * </p>
     * <p>
     * We recommend that type names adhere to the following pattern:
     * <i>company_or_organization</i>::<i>service</i>::<i>type</i>.
     * </p>
     * <note>
     * <p>
     * The following organization namespaces are reserved and cannot be used in
     * your resource type names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Alexa</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AMZN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Amazon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Custom</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dev</code>
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 196<br/>
     * <b>Pattern: </b>[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}
     * <br/>
     *
     * @param typeName <p>
     *            The name of the type being registered.
     *            </p>
     *            <p>
     *            We recommend that type names adhere to the following pattern:
     *            <i>company_or_organization</i>::<i>service</i>::<i>type</i>.
     *            </p>
     *            <note>
     *            <p>
     *            The following organization namespaces are reserved and cannot
     *            be used in your resource type names:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Alexa</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AMZN</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Amazon</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AWS</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Custom</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Dev</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </note>
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the type being registered.
     * </p>
     * <p>
     * We recommend that type names adhere to the following pattern:
     * <i>company_or_organization</i>::<i>service</i>::<i>type</i>.
     * </p>
     * <note>
     * <p>
     * The following organization namespaces are reserved and cannot be used in
     * your resource type names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Alexa</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AMZN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Amazon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Custom</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dev</code>
     * </p>
     * </li>
     * </ul>
     * </note>
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
     *            The name of the type being registered.
     *            </p>
     *            <p>
     *            We recommend that type names adhere to the following pattern:
     *            <i>company_or_organization</i>::<i>service</i>::<i>type</i>.
     *            </p>
     *            <note>
     *            <p>
     *            The following organization namespaces are reserved and cannot
     *            be used in your resource type names:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Alexa</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AMZN</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Amazon</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AWS</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Custom</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Dev</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTypeRequest withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * <p>
     * A url to the S3 bucket containing the schema handler package that
     * contains the schema, event handlers, and associated files for the type
     * you want to register.
     * </p>
     * <p>
     * For information on generating a schema handler package for the type you
     * want to register, see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html"
     * >submit</a> in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     * <note>
     * <p>
     * As part of registering a resource provider type, CloudFormation must be
     * able to access the S3 bucket which contains the schema handler package
     * for that resource provider. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry.html#registry-register-permissions"
     * >IAM Permissions for Registering a Resource Provider</a> in the <i>AWS
     * CloudFormation User Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @return <p>
     *         A url to the S3 bucket containing the schema handler package that
     *         contains the schema, event handlers, and associated files for the
     *         type you want to register.
     *         </p>
     *         <p>
     *         For information on generating a schema handler package for the
     *         type you want to register, see <a href=
     *         "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html"
     *         >submit</a> in the <i>CloudFormation CLI User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         As part of registering a resource provider type, CloudFormation
     *         must be able to access the S3 bucket which contains the schema
     *         handler package for that resource provider. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry.html#registry-register-permissions"
     *         >IAM Permissions for Registering a Resource Provider</a> in the
     *         <i>AWS CloudFormation User Guide</i>.
     *         </p>
     *         </note>
     */
    public String getSchemaHandlerPackage() {
        return schemaHandlerPackage;
    }

    /**
     * <p>
     * A url to the S3 bucket containing the schema handler package that
     * contains the schema, event handlers, and associated files for the type
     * you want to register.
     * </p>
     * <p>
     * For information on generating a schema handler package for the type you
     * want to register, see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html"
     * >submit</a> in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     * <note>
     * <p>
     * As part of registering a resource provider type, CloudFormation must be
     * able to access the S3 bucket which contains the schema handler package
     * for that resource provider. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry.html#registry-register-permissions"
     * >IAM Permissions for Registering a Resource Provider</a> in the <i>AWS
     * CloudFormation User Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param schemaHandlerPackage <p>
     *            A url to the S3 bucket containing the schema handler package
     *            that contains the schema, event handlers, and associated files
     *            for the type you want to register.
     *            </p>
     *            <p>
     *            For information on generating a schema handler package for the
     *            type you want to register, see <a href=
     *            "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html"
     *            >submit</a> in the <i>CloudFormation CLI User Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            As part of registering a resource provider type,
     *            CloudFormation must be able to access the S3 bucket which
     *            contains the schema handler package for that resource
     *            provider. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry.html#registry-register-permissions"
     *            >IAM Permissions for Registering a Resource Provider</a> in
     *            the <i>AWS CloudFormation User Guide</i>.
     *            </p>
     *            </note>
     */
    public void setSchemaHandlerPackage(String schemaHandlerPackage) {
        this.schemaHandlerPackage = schemaHandlerPackage;
    }

    /**
     * <p>
     * A url to the S3 bucket containing the schema handler package that
     * contains the schema, event handlers, and associated files for the type
     * you want to register.
     * </p>
     * <p>
     * For information on generating a schema handler package for the type you
     * want to register, see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html"
     * >submit</a> in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     * <note>
     * <p>
     * As part of registering a resource provider type, CloudFormation must be
     * able to access the S3 bucket which contains the schema handler package
     * for that resource provider. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry.html#registry-register-permissions"
     * >IAM Permissions for Registering a Resource Provider</a> in the <i>AWS
     * CloudFormation User Guide</i>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param schemaHandlerPackage <p>
     *            A url to the S3 bucket containing the schema handler package
     *            that contains the schema, event handlers, and associated files
     *            for the type you want to register.
     *            </p>
     *            <p>
     *            For information on generating a schema handler package for the
     *            type you want to register, see <a href=
     *            "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-cli-submit.html"
     *            >submit</a> in the <i>CloudFormation CLI User Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            As part of registering a resource provider type,
     *            CloudFormation must be able to access the S3 bucket which
     *            contains the schema handler package for that resource
     *            provider. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry.html#registry-register-permissions"
     *            >IAM Permissions for Registering a Resource Provider</a> in
     *            the <i>AWS CloudFormation User Guide</i>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTypeRequest withSchemaHandlerPackage(String schemaHandlerPackage) {
        this.schemaHandlerPackage = schemaHandlerPackage;
        return this;
    }

    /**
     * <p>
     * Specifies logging configuration information for a type.
     * </p>
     *
     * @return <p>
     *         Specifies logging configuration information for a type.
     *         </p>
     */
    public LoggingConfig getLoggingConfig() {
        return loggingConfig;
    }

    /**
     * <p>
     * Specifies logging configuration information for a type.
     * </p>
     *
     * @param loggingConfig <p>
     *            Specifies logging configuration information for a type.
     *            </p>
     */
    public void setLoggingConfig(LoggingConfig loggingConfig) {
        this.loggingConfig = loggingConfig;
    }

    /**
     * <p>
     * Specifies logging configuration information for a type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loggingConfig <p>
     *            Specifies logging configuration information for a type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTypeRequest withLoggingConfig(LoggingConfig loggingConfig) {
        this.loggingConfig = loggingConfig;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM execution role to use to
     * register the type. If your resource type calls AWS APIs in any of its
     * handlers, you must create an <i> <a
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
     *         The Amazon Resource Name (ARN) of the IAM execution role to use
     *         to register the type. If your resource type calls AWS APIs in any
     *         of its handlers, you must create an <i> <a href=
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
     * The Amazon Resource Name (ARN) of the IAM execution role to use to
     * register the type. If your resource type calls AWS APIs in any of its
     * handlers, you must create an <i> <a
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
     *            The Amazon Resource Name (ARN) of the IAM execution role to
     *            use to register the type. If your resource type calls AWS APIs
     *            in any of its handlers, you must create an <i> <a href=
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
     * The Amazon Resource Name (ARN) of the IAM execution role to use to
     * register the type. If your resource type calls AWS APIs in any of its
     * handlers, you must create an <i> <a
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
     *            The Amazon Resource Name (ARN) of the IAM execution role to
     *            use to register the type. If your resource type calls AWS APIs
     *            in any of its handlers, you must create an <i> <a href=
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
    public RegisterTypeRequest withExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }

    /**
     * <p>
     * A unique identifier that acts as an idempotency key for this registration
     * request. Specifying a client request token prevents CloudFormation from
     * generating more than one version of a type from the same registeration
     * request, even if the request is submitted multiple times.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         A unique identifier that acts as an idempotency key for this
     *         registration request. Specifying a client request token prevents
     *         CloudFormation from generating more than one version of a type
     *         from the same registeration request, even if the request is
     *         submitted multiple times.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier that acts as an idempotency key for this registration
     * request. Specifying a client request token prevents CloudFormation from
     * generating more than one version of a type from the same registeration
     * request, even if the request is submitted multiple times.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @param clientRequestToken <p>
     *            A unique identifier that acts as an idempotency key for this
     *            registration request. Specifying a client request token
     *            prevents CloudFormation from generating more than one version
     *            of a type from the same registeration request, even if the
     *            request is submitted multiple times.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier that acts as an idempotency key for this registration
     * request. Specifying a client request token prevents CloudFormation from
     * generating more than one version of a type from the same registeration
     * request, even if the request is submitted multiple times.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @param clientRequestToken <p>
     *            A unique identifier that acts as an idempotency key for this
     *            registration request. Specifying a client request token
     *            prevents CloudFormation from generating more than one version
     *            of a type from the same registeration request, even if the
     *            request is submitted multiple times.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTypeRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getTypeName() != null)
            sb.append("TypeName: " + getTypeName() + ",");
        if (getSchemaHandlerPackage() != null)
            sb.append("SchemaHandlerPackage: " + getSchemaHandlerPackage() + ",");
        if (getLoggingConfig() != null)
            sb.append("LoggingConfig: " + getLoggingConfig() + ",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: " + getExecutionRoleArn() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode
                + ((getSchemaHandlerPackage() == null) ? 0 : getSchemaHandlerPackage().hashCode());
        hashCode = prime * hashCode
                + ((getLoggingConfig() == null) ? 0 : getLoggingConfig().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterTypeRequest == false)
            return false;
        RegisterTypeRequest other = (RegisterTypeRequest) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getSchemaHandlerPackage() == null ^ this.getSchemaHandlerPackage() == null)
            return false;
        if (other.getSchemaHandlerPackage() != null
                && other.getSchemaHandlerPackage().equals(this.getSchemaHandlerPackage()) == false)
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
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }
}
