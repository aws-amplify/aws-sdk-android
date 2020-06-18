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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Add a parameter to the system.
 * </p>
 */
public class PutParameterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The fully qualified name of the parameter that you want to add to the
     * system. The fully qualified name includes the complete hierarchy of the
     * parameter path and name. For parameters in a hierarchy, you must include
     * a leading forward slash character (/) when you create or reference a
     * parameter. For example: <code>/Dev/DBServer/MySQL/db-string13</code>
     * </p>
     * <p>
     * Naming Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Parameter names are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * A parameter name must be unique within an AWS Region
     * </p>
     * </li>
     * <li>
     * <p>
     * A parameter name can't be prefixed with "aws" or "ssm"
     * (case-insensitive).
     * </p>
     * </li>
     * <li>
     * <p>
     * Parameter names can include only the following symbols and letters:
     * <code>a-zA-Z0-9_.-/</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A parameter name can't include spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * Parameter hierarchies are limited to a maximum depth of fifteen levels.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional information about valid values for parameter names, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-parameter-name-constraints.html"
     * >About requirements and constraints for parameter names</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The maximum length constraint listed below includes capacity for
     * additional system attributes that are not part of the name. The maximum
     * length for a parameter name, including the full length of the parameter
     * ARN, is 1011 characters. For example, the length of the following
     * parameter name is 65 characters, not 20 characters:
     * </p>
     * <p>
     * <code>arn:aws:ssm:us-east-2:111122223333:parameter/ExampleParameterName</code>
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String name;

    /**
     * <p>
     * Information about the parameter that you want to add to the system.
     * Optional but recommended.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The parameter value that you want to add to the system. Standard
     * parameters have a value limit of 4 KB. Advanced parameters have a value
     * limit of 8 KB.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The type of parameter that you want to add to the system.
     * </p>
     * <note>
     * <p>
     * <code>SecureString</code> is not currently supported for AWS
     * CloudFormation templates or in the China Regions.
     * </p>
     * </note>
     * <p>
     * Items in a <code>StringList</code> must be separated by a comma (,). You
     * can't use other punctuation or special character to escape items in the
     * list. If you have a parameter value that requires a comma, then use the
     * <code>String</code> data type.
     * </p>
     * <important>
     * <p>
     * Specifying a parameter type is not required when updating a parameter.
     * You must specify a parameter type when creating a parameter.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, StringList, SecureString
     */
    private String type;

    /**
     * <p>
     * The KMS Key ID that you want to use to encrypt a parameter. Either the
     * default AWS Key Management Service (AWS KMS) key automatically assigned
     * to your AWS account or a custom key. Required for parameters that use the
     * <code>SecureString</code> data type.
     * </p>
     * <p>
     * If you don't specify a key ID, the system uses the default key associated
     * with your AWS account.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To use your default AWS KMS key, choose the <code>SecureString</code>
     * data type, and do <i>not</i> specify the <code>Key ID</code> when you
     * create the parameter. The system automatically populates
     * <code>Key ID</code> with your default KMS key.
     * </p>
     * </li>
     * <li>
     * <p>
     * To use a custom KMS key, choose the <code>SecureString</code> data type
     * with the <code>Key ID</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9:/_-]+)$<br/>
     */
    private String keyId;

    /**
     * <p>
     * Overwrite an existing parameter. If not specified, will default to
     * "false".
     * </p>
     */
    private Boolean overwrite;

    /**
     * <p>
     * A regular expression used to validate the parameter value. For example,
     * for String types with values restricted to numbers, you can specify the
     * following: AllowedPattern=^\d+$
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String allowedPattern;

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to
     * categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a Systems Manager
     * parameter to identify the type of resource to which it applies, the
     * environment, or the type of configuration data referenced by the
     * parameter. In this case, you could specify the following key name/value
     * pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=Resource,Value=S3bucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=ParameterType,Value=LicenseKey</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing Systems Manager parameter, use the
     * <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The parameter tier to assign to a parameter.
     * </p>
     * <p>
     * Parameter Store offers a standard tier and an advanced tier for
     * parameters. Standard parameters have a content size limit of 4 KB and
     * can't be configured to use parameter policies. You can create a maximum
     * of 10,000 standard parameters for each Region in an AWS account. Standard
     * parameters are offered at no additional cost.
     * </p>
     * <p>
     * Advanced parameters have a content size limit of 8 KB and can be
     * configured to use parameter policies. You can create a maximum of 100,000
     * advanced parameters for each Region in an AWS account. Advanced
     * parameters incur a charge. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-advanced-parameters.html"
     * >Standard and advanced parameter tiers</a> in the <i>AWS Systems Manager
     * User Guide</i>.
     * </p>
     * <p>
     * You can change a standard parameter to an advanced parameter any time.
     * But you can't revert an advanced parameter to a standard parameter.
     * Reverting an advanced parameter to a standard parameter would result in
     * data loss because the system would truncate the size of the parameter
     * from 8 KB to 4 KB. Reverting would also remove any policies attached to
     * the parameter. Lastly, advanced parameters use a different form of
     * encryption than standard parameters.
     * </p>
     * <p>
     * If you no longer need an advanced parameter, or if you no longer want to
     * incur charges for an advanced parameter, you must delete it and recreate
     * it as a new standard parameter.
     * </p>
     * <p>
     * <b>Using the Default Tier Configuration</b>
     * </p>
     * <p>
     * In <code>PutParameter</code> requests, you can specify the tier to create
     * the parameter in. Whenever you specify a tier in the request, Parameter
     * Store creates or updates the parameter according to that request.
     * However, if you do not specify a tier in a request, Parameter Store
     * assigns the tier based on the current Parameter Store default tier
     * configuration.
     * </p>
     * <p>
     * The default tier when you begin using Parameter Store is the
     * standard-parameter tier. If you use the advanced-parameter tier, you can
     * specify one of the following as the default:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Advanced</b>: With this option, Parameter Store evaluates all requests
     * as advanced parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Intelligent-Tiering</b>: With this option, Parameter Store evaluates
     * each request to determine if the parameter is standard or advanced.
     * </p>
     * <p>
     * If the request doesn't include any options that require an advanced
     * parameter, the parameter is created in the standard-parameter tier. If
     * one or more options requiring an advanced parameter are included in the
     * request, Parameter Store create a parameter in the advanced-parameter
     * tier.
     * </p>
     * <p>
     * This approach helps control your parameter-related costs by always
     * creating standard parameters unless an advanced parameter is necessary.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Options that require an advanced parameter include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The content size of the parameter is more than 4 KB.
     * </p>
     * </li>
     * <li>
     * <p>
     * The parameter uses a parameter policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * More than 10,000 parameters already exist in your AWS account in the
     * current Region.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about configuring the default tier option, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/ps-default-tier.html"
     * >Specifying a default parameter tier</a> in the <i>AWS Systems Manager
     * User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Advanced, Intelligent-Tiering
     */
    private String tier;

    /**
     * <p>
     * One or more policies to apply to a parameter. This action takes a JSON
     * array. Parameter Store supports the following policy types:
     * </p>
     * <p>
     * Expiration: This policy deletes the parameter after it expires. When you
     * create the policy, you specify the expiration date. You can update the
     * expiration date and time by updating the policy. Updating the
     * <i>parameter</i> does not affect the expiration date and time. When the
     * expiration time is reached, Parameter Store deletes the parameter.
     * </p>
     * <p>
     * ExpirationNotification: This policy triggers an event in Amazon
     * CloudWatch Events that notifies you about the expiration. By using this
     * policy, you can receive notification before or after the expiration time
     * is reached, in units of days or hours.
     * </p>
     * <p>
     * NoChangeNotification: This policy triggers a CloudWatch event if a
     * parameter has not been modified for a specified period of time. This
     * policy type is useful when, for example, a secret needs to be changed
     * within a period of time, but it has not been changed.
     * </p>
     * <p>
     * All existing policies are preserved until you send new policies or an
     * empty policy. For more information about parameter policies, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-policies.html"
     * >Assigning parameter policies</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     */
    private String policies;

    /**
     * <p>
     * The data type for a <code>String</code> parameter. Supported data types
     * include plain text and Amazon Machine Image IDs.
     * </p>
     * <p>
     * <b>The following data type values are supported.</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>text</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aws:ec2:image</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you create a <code>String</code> parameter and specify
     * <code>aws:ec2:image</code>, Systems Manager validates the parameter value
     * is in the required format, such as <code>ami-12345abcdeEXAMPLE</code>,
     * and that the specified AMI is available in your AWS account. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-ec2-aliases.html"
     * >Native parameter support for Amazon Machine Image IDs</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     */
    private String dataType;

    /**
     * <p>
     * The fully qualified name of the parameter that you want to add to the
     * system. The fully qualified name includes the complete hierarchy of the
     * parameter path and name. For parameters in a hierarchy, you must include
     * a leading forward slash character (/) when you create or reference a
     * parameter. For example: <code>/Dev/DBServer/MySQL/db-string13</code>
     * </p>
     * <p>
     * Naming Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Parameter names are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * A parameter name must be unique within an AWS Region
     * </p>
     * </li>
     * <li>
     * <p>
     * A parameter name can't be prefixed with "aws" or "ssm"
     * (case-insensitive).
     * </p>
     * </li>
     * <li>
     * <p>
     * Parameter names can include only the following symbols and letters:
     * <code>a-zA-Z0-9_.-/</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A parameter name can't include spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * Parameter hierarchies are limited to a maximum depth of fifteen levels.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional information about valid values for parameter names, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-parameter-name-constraints.html"
     * >About requirements and constraints for parameter names</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The maximum length constraint listed below includes capacity for
     * additional system attributes that are not part of the name. The maximum
     * length for a parameter name, including the full length of the parameter
     * ARN, is 1011 characters. For example, the length of the following
     * parameter name is 65 characters, not 20 characters:
     * </p>
     * <p>
     * <code>arn:aws:ssm:us-east-2:111122223333:parameter/ExampleParameterName</code>
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The fully qualified name of the parameter that you want to add to
     *         the system. The fully qualified name includes the complete
     *         hierarchy of the parameter path and name. For parameters in a
     *         hierarchy, you must include a leading forward slash character (/)
     *         when you create or reference a parameter. For example:
     *         <code>/Dev/DBServer/MySQL/db-string13</code>
     *         </p>
     *         <p>
     *         Naming Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Parameter names are case sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A parameter name must be unique within an AWS Region
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A parameter name can't be prefixed with "aws" or "ssm"
     *         (case-insensitive).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Parameter names can include only the following symbols and
     *         letters: <code>a-zA-Z0-9_.-/</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A parameter name can't include spaces.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Parameter hierarchies are limited to a maximum depth of fifteen
     *         levels.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For additional information about valid values for parameter
     *         names, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-parameter-name-constraints.html"
     *         >About requirements and constraints for parameter names</a> in
     *         the <i>AWS Systems Manager User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         The maximum length constraint listed below includes capacity for
     *         additional system attributes that are not part of the name. The
     *         maximum length for a parameter name, including the full length of
     *         the parameter ARN, is 1011 characters. For example, the length of
     *         the following parameter name is 65 characters, not 20 characters:
     *         </p>
     *         <p>
     *         <code>arn:aws:ssm:us-east-2:111122223333:parameter/ExampleParameterName</code>
     *         </p>
     *         </note>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The fully qualified name of the parameter that you want to add to the
     * system. The fully qualified name includes the complete hierarchy of the
     * parameter path and name. For parameters in a hierarchy, you must include
     * a leading forward slash character (/) when you create or reference a
     * parameter. For example: <code>/Dev/DBServer/MySQL/db-string13</code>
     * </p>
     * <p>
     * Naming Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Parameter names are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * A parameter name must be unique within an AWS Region
     * </p>
     * </li>
     * <li>
     * <p>
     * A parameter name can't be prefixed with "aws" or "ssm"
     * (case-insensitive).
     * </p>
     * </li>
     * <li>
     * <p>
     * Parameter names can include only the following symbols and letters:
     * <code>a-zA-Z0-9_.-/</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A parameter name can't include spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * Parameter hierarchies are limited to a maximum depth of fifteen levels.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional information about valid values for parameter names, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-parameter-name-constraints.html"
     * >About requirements and constraints for parameter names</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The maximum length constraint listed below includes capacity for
     * additional system attributes that are not part of the name. The maximum
     * length for a parameter name, including the full length of the parameter
     * ARN, is 1011 characters. For example, the length of the following
     * parameter name is 65 characters, not 20 characters:
     * </p>
     * <p>
     * <code>arn:aws:ssm:us-east-2:111122223333:parameter/ExampleParameterName</code>
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param name <p>
     *            The fully qualified name of the parameter that you want to add
     *            to the system. The fully qualified name includes the complete
     *            hierarchy of the parameter path and name. For parameters in a
     *            hierarchy, you must include a leading forward slash character
     *            (/) when you create or reference a parameter. For example:
     *            <code>/Dev/DBServer/MySQL/db-string13</code>
     *            </p>
     *            <p>
     *            Naming Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Parameter names are case sensitive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A parameter name must be unique within an AWS Region
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A parameter name can't be prefixed with "aws" or "ssm"
     *            (case-insensitive).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Parameter names can include only the following symbols and
     *            letters: <code>a-zA-Z0-9_.-/</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A parameter name can't include spaces.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Parameter hierarchies are limited to a maximum depth of
     *            fifteen levels.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For additional information about valid values for parameter
     *            names, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-parameter-name-constraints.html"
     *            >About requirements and constraints for parameter names</a> in
     *            the <i>AWS Systems Manager User Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            The maximum length constraint listed below includes capacity
     *            for additional system attributes that are not part of the
     *            name. The maximum length for a parameter name, including the
     *            full length of the parameter ARN, is 1011 characters. For
     *            example, the length of the following parameter name is 65
     *            characters, not 20 characters:
     *            </p>
     *            <p>
     *            <code>arn:aws:ssm:us-east-2:111122223333:parameter/ExampleParameterName</code>
     *            </p>
     *            </note>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The fully qualified name of the parameter that you want to add to the
     * system. The fully qualified name includes the complete hierarchy of the
     * parameter path and name. For parameters in a hierarchy, you must include
     * a leading forward slash character (/) when you create or reference a
     * parameter. For example: <code>/Dev/DBServer/MySQL/db-string13</code>
     * </p>
     * <p>
     * Naming Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Parameter names are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * A parameter name must be unique within an AWS Region
     * </p>
     * </li>
     * <li>
     * <p>
     * A parameter name can't be prefixed with "aws" or "ssm"
     * (case-insensitive).
     * </p>
     * </li>
     * <li>
     * <p>
     * Parameter names can include only the following symbols and letters:
     * <code>a-zA-Z0-9_.-/</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A parameter name can't include spaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * Parameter hierarchies are limited to a maximum depth of fifteen levels.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional information about valid values for parameter names, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-parameter-name-constraints.html"
     * >About requirements and constraints for parameter names</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The maximum length constraint listed below includes capacity for
     * additional system attributes that are not part of the name. The maximum
     * length for a parameter name, including the full length of the parameter
     * ARN, is 1011 characters. For example, the length of the following
     * parameter name is 65 characters, not 20 characters:
     * </p>
     * <p>
     * <code>arn:aws:ssm:us-east-2:111122223333:parameter/ExampleParameterName</code>
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param name <p>
     *            The fully qualified name of the parameter that you want to add
     *            to the system. The fully qualified name includes the complete
     *            hierarchy of the parameter path and name. For parameters in a
     *            hierarchy, you must include a leading forward slash character
     *            (/) when you create or reference a parameter. For example:
     *            <code>/Dev/DBServer/MySQL/db-string13</code>
     *            </p>
     *            <p>
     *            Naming Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Parameter names are case sensitive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A parameter name must be unique within an AWS Region
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A parameter name can't be prefixed with "aws" or "ssm"
     *            (case-insensitive).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Parameter names can include only the following symbols and
     *            letters: <code>a-zA-Z0-9_.-/</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A parameter name can't include spaces.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Parameter hierarchies are limited to a maximum depth of
     *            fifteen levels.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For additional information about valid values for parameter
     *            names, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-parameter-name-constraints.html"
     *            >About requirements and constraints for parameter names</a> in
     *            the <i>AWS Systems Manager User Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            The maximum length constraint listed below includes capacity
     *            for additional system attributes that are not part of the
     *            name. The maximum length for a parameter name, including the
     *            full length of the parameter ARN, is 1011 characters. For
     *            example, the length of the following parameter name is 65
     *            characters, not 20 characters:
     *            </p>
     *            <p>
     *            <code>arn:aws:ssm:us-east-2:111122223333:parameter/ExampleParameterName</code>
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutParameterRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Information about the parameter that you want to add to the system.
     * Optional but recommended.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         Information about the parameter that you want to add to the
     *         system. Optional but recommended.
     *         </p>
     *         <important>
     *         <p>
     *         Do not enter personally identifiable information in this field.
     *         </p>
     *         </important>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Information about the parameter that you want to add to the system.
     * Optional but recommended.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            Information about the parameter that you want to add to the
     *            system. Optional but recommended.
     *            </p>
     *            <important>
     *            <p>
     *            Do not enter personally identifiable information in this
     *            field.
     *            </p>
     *            </important>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Information about the parameter that you want to add to the system.
     * Optional but recommended.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            Information about the parameter that you want to add to the
     *            system. Optional but recommended.
     *            </p>
     *            <important>
     *            <p>
     *            Do not enter personally identifiable information in this
     *            field.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutParameterRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The parameter value that you want to add to the system. Standard
     * parameters have a value limit of 4 KB. Advanced parameters have a value
     * limit of 8 KB.
     * </p>
     *
     * @return <p>
     *         The parameter value that you want to add to the system. Standard
     *         parameters have a value limit of 4 KB. Advanced parameters have a
     *         value limit of 8 KB.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The parameter value that you want to add to the system. Standard
     * parameters have a value limit of 4 KB. Advanced parameters have a value
     * limit of 8 KB.
     * </p>
     *
     * @param value <p>
     *            The parameter value that you want to add to the system.
     *            Standard parameters have a value limit of 4 KB. Advanced
     *            parameters have a value limit of 8 KB.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The parameter value that you want to add to the system. Standard
     * parameters have a value limit of 4 KB. Advanced parameters have a value
     * limit of 8 KB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The parameter value that you want to add to the system.
     *            Standard parameters have a value limit of 4 KB. Advanced
     *            parameters have a value limit of 8 KB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutParameterRequest withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The type of parameter that you want to add to the system.
     * </p>
     * <note>
     * <p>
     * <code>SecureString</code> is not currently supported for AWS
     * CloudFormation templates or in the China Regions.
     * </p>
     * </note>
     * <p>
     * Items in a <code>StringList</code> must be separated by a comma (,). You
     * can't use other punctuation or special character to escape items in the
     * list. If you have a parameter value that requires a comma, then use the
     * <code>String</code> data type.
     * </p>
     * <important>
     * <p>
     * Specifying a parameter type is not required when updating a parameter.
     * You must specify a parameter type when creating a parameter.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, StringList, SecureString
     *
     * @return <p>
     *         The type of parameter that you want to add to the system.
     *         </p>
     *         <note>
     *         <p>
     *         <code>SecureString</code> is not currently supported for AWS
     *         CloudFormation templates or in the China Regions.
     *         </p>
     *         </note>
     *         <p>
     *         Items in a <code>StringList</code> must be separated by a comma
     *         (,). You can't use other punctuation or special character to
     *         escape items in the list. If you have a parameter value that
     *         requires a comma, then use the <code>String</code> data type.
     *         </p>
     *         <important>
     *         <p>
     *         Specifying a parameter type is not required when updating a
     *         parameter. You must specify a parameter type when creating a
     *         parameter.
     *         </p>
     *         </important>
     * @see ParameterType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of parameter that you want to add to the system.
     * </p>
     * <note>
     * <p>
     * <code>SecureString</code> is not currently supported for AWS
     * CloudFormation templates or in the China Regions.
     * </p>
     * </note>
     * <p>
     * Items in a <code>StringList</code> must be separated by a comma (,). You
     * can't use other punctuation or special character to escape items in the
     * list. If you have a parameter value that requires a comma, then use the
     * <code>String</code> data type.
     * </p>
     * <important>
     * <p>
     * Specifying a parameter type is not required when updating a parameter.
     * You must specify a parameter type when creating a parameter.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, StringList, SecureString
     *
     * @param type <p>
     *            The type of parameter that you want to add to the system.
     *            </p>
     *            <note>
     *            <p>
     *            <code>SecureString</code> is not currently supported for AWS
     *            CloudFormation templates or in the China Regions.
     *            </p>
     *            </note>
     *            <p>
     *            Items in a <code>StringList</code> must be separated by a
     *            comma (,). You can't use other punctuation or special
     *            character to escape items in the list. If you have a parameter
     *            value that requires a comma, then use the <code>String</code>
     *            data type.
     *            </p>
     *            <important>
     *            <p>
     *            Specifying a parameter type is not required when updating a
     *            parameter. You must specify a parameter type when creating a
     *            parameter.
     *            </p>
     *            </important>
     * @see ParameterType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of parameter that you want to add to the system.
     * </p>
     * <note>
     * <p>
     * <code>SecureString</code> is not currently supported for AWS
     * CloudFormation templates or in the China Regions.
     * </p>
     * </note>
     * <p>
     * Items in a <code>StringList</code> must be separated by a comma (,). You
     * can't use other punctuation or special character to escape items in the
     * list. If you have a parameter value that requires a comma, then use the
     * <code>String</code> data type.
     * </p>
     * <important>
     * <p>
     * Specifying a parameter type is not required when updating a parameter.
     * You must specify a parameter type when creating a parameter.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, StringList, SecureString
     *
     * @param type <p>
     *            The type of parameter that you want to add to the system.
     *            </p>
     *            <note>
     *            <p>
     *            <code>SecureString</code> is not currently supported for AWS
     *            CloudFormation templates or in the China Regions.
     *            </p>
     *            </note>
     *            <p>
     *            Items in a <code>StringList</code> must be separated by a
     *            comma (,). You can't use other punctuation or special
     *            character to escape items in the list. If you have a parameter
     *            value that requires a comma, then use the <code>String</code>
     *            data type.
     *            </p>
     *            <important>
     *            <p>
     *            Specifying a parameter type is not required when updating a
     *            parameter. You must specify a parameter type when creating a
     *            parameter.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParameterType
     */
    public PutParameterRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of parameter that you want to add to the system.
     * </p>
     * <note>
     * <p>
     * <code>SecureString</code> is not currently supported for AWS
     * CloudFormation templates or in the China Regions.
     * </p>
     * </note>
     * <p>
     * Items in a <code>StringList</code> must be separated by a comma (,). You
     * can't use other punctuation or special character to escape items in the
     * list. If you have a parameter value that requires a comma, then use the
     * <code>String</code> data type.
     * </p>
     * <important>
     * <p>
     * Specifying a parameter type is not required when updating a parameter.
     * You must specify a parameter type when creating a parameter.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, StringList, SecureString
     *
     * @param type <p>
     *            The type of parameter that you want to add to the system.
     *            </p>
     *            <note>
     *            <p>
     *            <code>SecureString</code> is not currently supported for AWS
     *            CloudFormation templates or in the China Regions.
     *            </p>
     *            </note>
     *            <p>
     *            Items in a <code>StringList</code> must be separated by a
     *            comma (,). You can't use other punctuation or special
     *            character to escape items in the list. If you have a parameter
     *            value that requires a comma, then use the <code>String</code>
     *            data type.
     *            </p>
     *            <important>
     *            <p>
     *            Specifying a parameter type is not required when updating a
     *            parameter. You must specify a parameter type when creating a
     *            parameter.
     *            </p>
     *            </important>
     * @see ParameterType
     */
    public void setType(ParameterType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of parameter that you want to add to the system.
     * </p>
     * <note>
     * <p>
     * <code>SecureString</code> is not currently supported for AWS
     * CloudFormation templates or in the China Regions.
     * </p>
     * </note>
     * <p>
     * Items in a <code>StringList</code> must be separated by a comma (,). You
     * can't use other punctuation or special character to escape items in the
     * list. If you have a parameter value that requires a comma, then use the
     * <code>String</code> data type.
     * </p>
     * <important>
     * <p>
     * Specifying a parameter type is not required when updating a parameter.
     * You must specify a parameter type when creating a parameter.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, StringList, SecureString
     *
     * @param type <p>
     *            The type of parameter that you want to add to the system.
     *            </p>
     *            <note>
     *            <p>
     *            <code>SecureString</code> is not currently supported for AWS
     *            CloudFormation templates or in the China Regions.
     *            </p>
     *            </note>
     *            <p>
     *            Items in a <code>StringList</code> must be separated by a
     *            comma (,). You can't use other punctuation or special
     *            character to escape items in the list. If you have a parameter
     *            value that requires a comma, then use the <code>String</code>
     *            data type.
     *            </p>
     *            <important>
     *            <p>
     *            Specifying a parameter type is not required when updating a
     *            parameter. You must specify a parameter type when creating a
     *            parameter.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParameterType
     */
    public PutParameterRequest withType(ParameterType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The KMS Key ID that you want to use to encrypt a parameter. Either the
     * default AWS Key Management Service (AWS KMS) key automatically assigned
     * to your AWS account or a custom key. Required for parameters that use the
     * <code>SecureString</code> data type.
     * </p>
     * <p>
     * If you don't specify a key ID, the system uses the default key associated
     * with your AWS account.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To use your default AWS KMS key, choose the <code>SecureString</code>
     * data type, and do <i>not</i> specify the <code>Key ID</code> when you
     * create the parameter. The system automatically populates
     * <code>Key ID</code> with your default KMS key.
     * </p>
     * </li>
     * <li>
     * <p>
     * To use a custom KMS key, choose the <code>SecureString</code> data type
     * with the <code>Key ID</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9:/_-]+)$<br/>
     *
     * @return <p>
     *         The KMS Key ID that you want to use to encrypt a parameter.
     *         Either the default AWS Key Management Service (AWS KMS) key
     *         automatically assigned to your AWS account or a custom key.
     *         Required for parameters that use the <code>SecureString</code>
     *         data type.
     *         </p>
     *         <p>
     *         If you don't specify a key ID, the system uses the default key
     *         associated with your AWS account.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To use your default AWS KMS key, choose the
     *         <code>SecureString</code> data type, and do <i>not</i> specify
     *         the <code>Key ID</code> when you create the parameter. The system
     *         automatically populates <code>Key ID</code> with your default KMS
     *         key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To use a custom KMS key, choose the <code>SecureString</code>
     *         data type with the <code>Key ID</code> parameter.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The KMS Key ID that you want to use to encrypt a parameter. Either the
     * default AWS Key Management Service (AWS KMS) key automatically assigned
     * to your AWS account or a custom key. Required for parameters that use the
     * <code>SecureString</code> data type.
     * </p>
     * <p>
     * If you don't specify a key ID, the system uses the default key associated
     * with your AWS account.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To use your default AWS KMS key, choose the <code>SecureString</code>
     * data type, and do <i>not</i> specify the <code>Key ID</code> when you
     * create the parameter. The system automatically populates
     * <code>Key ID</code> with your default KMS key.
     * </p>
     * </li>
     * <li>
     * <p>
     * To use a custom KMS key, choose the <code>SecureString</code> data type
     * with the <code>Key ID</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9:/_-]+)$<br/>
     *
     * @param keyId <p>
     *            The KMS Key ID that you want to use to encrypt a parameter.
     *            Either the default AWS Key Management Service (AWS KMS) key
     *            automatically assigned to your AWS account or a custom key.
     *            Required for parameters that use the <code>SecureString</code>
     *            data type.
     *            </p>
     *            <p>
     *            If you don't specify a key ID, the system uses the default key
     *            associated with your AWS account.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            To use your default AWS KMS key, choose the
     *            <code>SecureString</code> data type, and do <i>not</i> specify
     *            the <code>Key ID</code> when you create the parameter. The
     *            system automatically populates <code>Key ID</code> with your
     *            default KMS key.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To use a custom KMS key, choose the <code>SecureString</code>
     *            data type with the <code>Key ID</code> parameter.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The KMS Key ID that you want to use to encrypt a parameter. Either the
     * default AWS Key Management Service (AWS KMS) key automatically assigned
     * to your AWS account or a custom key. Required for parameters that use the
     * <code>SecureString</code> data type.
     * </p>
     * <p>
     * If you don't specify a key ID, the system uses the default key associated
     * with your AWS account.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To use your default AWS KMS key, choose the <code>SecureString</code>
     * data type, and do <i>not</i> specify the <code>Key ID</code> when you
     * create the parameter. The system automatically populates
     * <code>Key ID</code> with your default KMS key.
     * </p>
     * </li>
     * <li>
     * <p>
     * To use a custom KMS key, choose the <code>SecureString</code> data type
     * with the <code>Key ID</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9:/_-]+)$<br/>
     *
     * @param keyId <p>
     *            The KMS Key ID that you want to use to encrypt a parameter.
     *            Either the default AWS Key Management Service (AWS KMS) key
     *            automatically assigned to your AWS account or a custom key.
     *            Required for parameters that use the <code>SecureString</code>
     *            data type.
     *            </p>
     *            <p>
     *            If you don't specify a key ID, the system uses the default key
     *            associated with your AWS account.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            To use your default AWS KMS key, choose the
     *            <code>SecureString</code> data type, and do <i>not</i> specify
     *            the <code>Key ID</code> when you create the parameter. The
     *            system automatically populates <code>Key ID</code> with your
     *            default KMS key.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To use a custom KMS key, choose the <code>SecureString</code>
     *            data type with the <code>Key ID</code> parameter.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutParameterRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * Overwrite an existing parameter. If not specified, will default to
     * "false".
     * </p>
     *
     * @return <p>
     *         Overwrite an existing parameter. If not specified, will default
     *         to "false".
     *         </p>
     */
    public Boolean isOverwrite() {
        return overwrite;
    }

    /**
     * <p>
     * Overwrite an existing parameter. If not specified, will default to
     * "false".
     * </p>
     *
     * @return <p>
     *         Overwrite an existing parameter. If not specified, will default
     *         to "false".
     *         </p>
     */
    public Boolean getOverwrite() {
        return overwrite;
    }

    /**
     * <p>
     * Overwrite an existing parameter. If not specified, will default to
     * "false".
     * </p>
     *
     * @param overwrite <p>
     *            Overwrite an existing parameter. If not specified, will
     *            default to "false".
     *            </p>
     */
    public void setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
    }

    /**
     * <p>
     * Overwrite an existing parameter. If not specified, will default to
     * "false".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param overwrite <p>
     *            Overwrite an existing parameter. If not specified, will
     *            default to "false".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutParameterRequest withOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }

    /**
     * <p>
     * A regular expression used to validate the parameter value. For example,
     * for String types with values restricted to numbers, you can specify the
     * following: AllowedPattern=^\d+$
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         A regular expression used to validate the parameter value. For
     *         example, for String types with values restricted to numbers, you
     *         can specify the following: AllowedPattern=^\d+$
     *         </p>
     */
    public String getAllowedPattern() {
        return allowedPattern;
    }

    /**
     * <p>
     * A regular expression used to validate the parameter value. For example,
     * for String types with values restricted to numbers, you can specify the
     * following: AllowedPattern=^\d+$
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param allowedPattern <p>
     *            A regular expression used to validate the parameter value. For
     *            example, for String types with values restricted to numbers,
     *            you can specify the following: AllowedPattern=^\d+$
     *            </p>
     */
    public void setAllowedPattern(String allowedPattern) {
        this.allowedPattern = allowedPattern;
    }

    /**
     * <p>
     * A regular expression used to validate the parameter value. For example,
     * for String types with values restricted to numbers, you can specify the
     * following: AllowedPattern=^\d+$
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param allowedPattern <p>
     *            A regular expression used to validate the parameter value. For
     *            example, for String types with values restricted to numbers,
     *            you can specify the following: AllowedPattern=^\d+$
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutParameterRequest withAllowedPattern(String allowedPattern) {
        this.allowedPattern = allowedPattern;
        return this;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to
     * categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a Systems Manager
     * parameter to identify the type of resource to which it applies, the
     * environment, or the type of configuration data referenced by the
     * parameter. In this case, you could specify the following key name/value
     * pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=Resource,Value=S3bucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=ParameterType,Value=LicenseKey</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing Systems Manager parameter, use the
     * <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     *
     * @return <p>
     *         Optional metadata that you assign to a resource. Tags enable you
     *         to categorize a resource in different ways, such as by purpose,
     *         owner, or environment. For example, you might want to tag a
     *         Systems Manager parameter to identify the type of resource to
     *         which it applies, the environment, or the type of configuration
     *         data referenced by the parameter. In this case, you could specify
     *         the following key name/value pairs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Key=Resource,Value=S3bucket</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Key=OS,Value=Windows</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Key=ParameterType,Value=LicenseKey</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         To add tags to an existing Systems Manager parameter, use the
     *         <a>AddTagsToResource</a> action.
     *         </p>
     *         </note>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to
     * categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a Systems Manager
     * parameter to identify the type of resource to which it applies, the
     * environment, or the type of configuration data referenced by the
     * parameter. In this case, you could specify the following key name/value
     * pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=Resource,Value=S3bucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=ParameterType,Value=LicenseKey</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing Systems Manager parameter, use the
     * <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     *
     * @param tags <p>
     *            Optional metadata that you assign to a resource. Tags enable
     *            you to categorize a resource in different ways, such as by
     *            purpose, owner, or environment. For example, you might want to
     *            tag a Systems Manager parameter to identify the type of
     *            resource to which it applies, the environment, or the type of
     *            configuration data referenced by the parameter. In this case,
     *            you could specify the following key name/value pairs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Key=Resource,Value=S3bucket</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Key=OS,Value=Windows</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Key=ParameterType,Value=LicenseKey</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            To add tags to an existing Systems Manager parameter, use the
     *            <a>AddTagsToResource</a> action.
     *            </p>
     *            </note>
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
     * Optional metadata that you assign to a resource. Tags enable you to
     * categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a Systems Manager
     * parameter to identify the type of resource to which it applies, the
     * environment, or the type of configuration data referenced by the
     * parameter. In this case, you could specify the following key name/value
     * pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=Resource,Value=S3bucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=ParameterType,Value=LicenseKey</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing Systems Manager parameter, use the
     * <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Optional metadata that you assign to a resource. Tags enable
     *            you to categorize a resource in different ways, such as by
     *            purpose, owner, or environment. For example, you might want to
     *            tag a Systems Manager parameter to identify the type of
     *            resource to which it applies, the environment, or the type of
     *            configuration data referenced by the parameter. In this case,
     *            you could specify the following key name/value pairs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Key=Resource,Value=S3bucket</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Key=OS,Value=Windows</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Key=ParameterType,Value=LicenseKey</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            To add tags to an existing Systems Manager parameter, use the
     *            <a>AddTagsToResource</a> action.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutParameterRequest withTags(Tag... tags) {
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
     * Optional metadata that you assign to a resource. Tags enable you to
     * categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a Systems Manager
     * parameter to identify the type of resource to which it applies, the
     * environment, or the type of configuration data referenced by the
     * parameter. In this case, you could specify the following key name/value
     * pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=Resource,Value=S3bucket</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=ParameterType,Value=LicenseKey</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing Systems Manager parameter, use the
     * <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Optional metadata that you assign to a resource. Tags enable
     *            you to categorize a resource in different ways, such as by
     *            purpose, owner, or environment. For example, you might want to
     *            tag a Systems Manager parameter to identify the type of
     *            resource to which it applies, the environment, or the type of
     *            configuration data referenced by the parameter. In this case,
     *            you could specify the following key name/value pairs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Key=Resource,Value=S3bucket</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Key=OS,Value=Windows</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Key=ParameterType,Value=LicenseKey</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            To add tags to an existing Systems Manager parameter, use the
     *            <a>AddTagsToResource</a> action.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutParameterRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The parameter tier to assign to a parameter.
     * </p>
     * <p>
     * Parameter Store offers a standard tier and an advanced tier for
     * parameters. Standard parameters have a content size limit of 4 KB and
     * can't be configured to use parameter policies. You can create a maximum
     * of 10,000 standard parameters for each Region in an AWS account. Standard
     * parameters are offered at no additional cost.
     * </p>
     * <p>
     * Advanced parameters have a content size limit of 8 KB and can be
     * configured to use parameter policies. You can create a maximum of 100,000
     * advanced parameters for each Region in an AWS account. Advanced
     * parameters incur a charge. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-advanced-parameters.html"
     * >Standard and advanced parameter tiers</a> in the <i>AWS Systems Manager
     * User Guide</i>.
     * </p>
     * <p>
     * You can change a standard parameter to an advanced parameter any time.
     * But you can't revert an advanced parameter to a standard parameter.
     * Reverting an advanced parameter to a standard parameter would result in
     * data loss because the system would truncate the size of the parameter
     * from 8 KB to 4 KB. Reverting would also remove any policies attached to
     * the parameter. Lastly, advanced parameters use a different form of
     * encryption than standard parameters.
     * </p>
     * <p>
     * If you no longer need an advanced parameter, or if you no longer want to
     * incur charges for an advanced parameter, you must delete it and recreate
     * it as a new standard parameter.
     * </p>
     * <p>
     * <b>Using the Default Tier Configuration</b>
     * </p>
     * <p>
     * In <code>PutParameter</code> requests, you can specify the tier to create
     * the parameter in. Whenever you specify a tier in the request, Parameter
     * Store creates or updates the parameter according to that request.
     * However, if you do not specify a tier in a request, Parameter Store
     * assigns the tier based on the current Parameter Store default tier
     * configuration.
     * </p>
     * <p>
     * The default tier when you begin using Parameter Store is the
     * standard-parameter tier. If you use the advanced-parameter tier, you can
     * specify one of the following as the default:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Advanced</b>: With this option, Parameter Store evaluates all requests
     * as advanced parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Intelligent-Tiering</b>: With this option, Parameter Store evaluates
     * each request to determine if the parameter is standard or advanced.
     * </p>
     * <p>
     * If the request doesn't include any options that require an advanced
     * parameter, the parameter is created in the standard-parameter tier. If
     * one or more options requiring an advanced parameter are included in the
     * request, Parameter Store create a parameter in the advanced-parameter
     * tier.
     * </p>
     * <p>
     * This approach helps control your parameter-related costs by always
     * creating standard parameters unless an advanced parameter is necessary.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Options that require an advanced parameter include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The content size of the parameter is more than 4 KB.
     * </p>
     * </li>
     * <li>
     * <p>
     * The parameter uses a parameter policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * More than 10,000 parameters already exist in your AWS account in the
     * current Region.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about configuring the default tier option, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/ps-default-tier.html"
     * >Specifying a default parameter tier</a> in the <i>AWS Systems Manager
     * User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Advanced, Intelligent-Tiering
     *
     * @return <p>
     *         The parameter tier to assign to a parameter.
     *         </p>
     *         <p>
     *         Parameter Store offers a standard tier and an advanced tier for
     *         parameters. Standard parameters have a content size limit of 4 KB
     *         and can't be configured to use parameter policies. You can create
     *         a maximum of 10,000 standard parameters for each Region in an AWS
     *         account. Standard parameters are offered at no additional cost.
     *         </p>
     *         <p>
     *         Advanced parameters have a content size limit of 8 KB and can be
     *         configured to use parameter policies. You can create a maximum of
     *         100,000 advanced parameters for each Region in an AWS account.
     *         Advanced parameters incur a charge. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-advanced-parameters.html"
     *         >Standard and advanced parameter tiers</a> in the <i>AWS Systems
     *         Manager User Guide</i>.
     *         </p>
     *         <p>
     *         You can change a standard parameter to an advanced parameter any
     *         time. But you can't revert an advanced parameter to a standard
     *         parameter. Reverting an advanced parameter to a standard
     *         parameter would result in data loss because the system would
     *         truncate the size of the parameter from 8 KB to 4 KB. Reverting
     *         would also remove any policies attached to the parameter. Lastly,
     *         advanced parameters use a different form of encryption than
     *         standard parameters.
     *         </p>
     *         <p>
     *         If you no longer need an advanced parameter, or if you no longer
     *         want to incur charges for an advanced parameter, you must delete
     *         it and recreate it as a new standard parameter.
     *         </p>
     *         <p>
     *         <b>Using the Default Tier Configuration</b>
     *         </p>
     *         <p>
     *         In <code>PutParameter</code> requests, you can specify the tier
     *         to create the parameter in. Whenever you specify a tier in the
     *         request, Parameter Store creates or updates the parameter
     *         according to that request. However, if you do not specify a tier
     *         in a request, Parameter Store assigns the tier based on the
     *         current Parameter Store default tier configuration.
     *         </p>
     *         <p>
     *         The default tier when you begin using Parameter Store is the
     *         standard-parameter tier. If you use the advanced-parameter tier,
     *         you can specify one of the following as the default:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Advanced</b>: With this option, Parameter Store evaluates all
     *         requests as advanced parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Intelligent-Tiering</b>: With this option, Parameter Store
     *         evaluates each request to determine if the parameter is standard
     *         or advanced.
     *         </p>
     *         <p>
     *         If the request doesn't include any options that require an
     *         advanced parameter, the parameter is created in the
     *         standard-parameter tier. If one or more options requiring an
     *         advanced parameter are included in the request, Parameter Store
     *         create a parameter in the advanced-parameter tier.
     *         </p>
     *         <p>
     *         This approach helps control your parameter-related costs by
     *         always creating standard parameters unless an advanced parameter
     *         is necessary.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Options that require an advanced parameter include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The content size of the parameter is more than 4 KB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The parameter uses a parameter policy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         More than 10,000 parameters already exist in your AWS account in
     *         the current Region.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about configuring the default tier option,
     *         see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/ps-default-tier.html"
     *         >Specifying a default parameter tier</a> in the <i>AWS Systems
     *         Manager User Guide</i>.
     *         </p>
     * @see ParameterTier
     */
    public String getTier() {
        return tier;
    }

    /**
     * <p>
     * The parameter tier to assign to a parameter.
     * </p>
     * <p>
     * Parameter Store offers a standard tier and an advanced tier for
     * parameters. Standard parameters have a content size limit of 4 KB and
     * can't be configured to use parameter policies. You can create a maximum
     * of 10,000 standard parameters for each Region in an AWS account. Standard
     * parameters are offered at no additional cost.
     * </p>
     * <p>
     * Advanced parameters have a content size limit of 8 KB and can be
     * configured to use parameter policies. You can create a maximum of 100,000
     * advanced parameters for each Region in an AWS account. Advanced
     * parameters incur a charge. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-advanced-parameters.html"
     * >Standard and advanced parameter tiers</a> in the <i>AWS Systems Manager
     * User Guide</i>.
     * </p>
     * <p>
     * You can change a standard parameter to an advanced parameter any time.
     * But you can't revert an advanced parameter to a standard parameter.
     * Reverting an advanced parameter to a standard parameter would result in
     * data loss because the system would truncate the size of the parameter
     * from 8 KB to 4 KB. Reverting would also remove any policies attached to
     * the parameter. Lastly, advanced parameters use a different form of
     * encryption than standard parameters.
     * </p>
     * <p>
     * If you no longer need an advanced parameter, or if you no longer want to
     * incur charges for an advanced parameter, you must delete it and recreate
     * it as a new standard parameter.
     * </p>
     * <p>
     * <b>Using the Default Tier Configuration</b>
     * </p>
     * <p>
     * In <code>PutParameter</code> requests, you can specify the tier to create
     * the parameter in. Whenever you specify a tier in the request, Parameter
     * Store creates or updates the parameter according to that request.
     * However, if you do not specify a tier in a request, Parameter Store
     * assigns the tier based on the current Parameter Store default tier
     * configuration.
     * </p>
     * <p>
     * The default tier when you begin using Parameter Store is the
     * standard-parameter tier. If you use the advanced-parameter tier, you can
     * specify one of the following as the default:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Advanced</b>: With this option, Parameter Store evaluates all requests
     * as advanced parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Intelligent-Tiering</b>: With this option, Parameter Store evaluates
     * each request to determine if the parameter is standard or advanced.
     * </p>
     * <p>
     * If the request doesn't include any options that require an advanced
     * parameter, the parameter is created in the standard-parameter tier. If
     * one or more options requiring an advanced parameter are included in the
     * request, Parameter Store create a parameter in the advanced-parameter
     * tier.
     * </p>
     * <p>
     * This approach helps control your parameter-related costs by always
     * creating standard parameters unless an advanced parameter is necessary.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Options that require an advanced parameter include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The content size of the parameter is more than 4 KB.
     * </p>
     * </li>
     * <li>
     * <p>
     * The parameter uses a parameter policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * More than 10,000 parameters already exist in your AWS account in the
     * current Region.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about configuring the default tier option, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/ps-default-tier.html"
     * >Specifying a default parameter tier</a> in the <i>AWS Systems Manager
     * User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Advanced, Intelligent-Tiering
     *
     * @param tier <p>
     *            The parameter tier to assign to a parameter.
     *            </p>
     *            <p>
     *            Parameter Store offers a standard tier and an advanced tier
     *            for parameters. Standard parameters have a content size limit
     *            of 4 KB and can't be configured to use parameter policies. You
     *            can create a maximum of 10,000 standard parameters for each
     *            Region in an AWS account. Standard parameters are offered at
     *            no additional cost.
     *            </p>
     *            <p>
     *            Advanced parameters have a content size limit of 8 KB and can
     *            be configured to use parameter policies. You can create a
     *            maximum of 100,000 advanced parameters for each Region in an
     *            AWS account. Advanced parameters incur a charge. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-advanced-parameters.html"
     *            >Standard and advanced parameter tiers</a> in the <i>AWS
     *            Systems Manager User Guide</i>.
     *            </p>
     *            <p>
     *            You can change a standard parameter to an advanced parameter
     *            any time. But you can't revert an advanced parameter to a
     *            standard parameter. Reverting an advanced parameter to a
     *            standard parameter would result in data loss because the
     *            system would truncate the size of the parameter from 8 KB to 4
     *            KB. Reverting would also remove any policies attached to the
     *            parameter. Lastly, advanced parameters use a different form of
     *            encryption than standard parameters.
     *            </p>
     *            <p>
     *            If you no longer need an advanced parameter, or if you no
     *            longer want to incur charges for an advanced parameter, you
     *            must delete it and recreate it as a new standard parameter.
     *            </p>
     *            <p>
     *            <b>Using the Default Tier Configuration</b>
     *            </p>
     *            <p>
     *            In <code>PutParameter</code> requests, you can specify the
     *            tier to create the parameter in. Whenever you specify a tier
     *            in the request, Parameter Store creates or updates the
     *            parameter according to that request. However, if you do not
     *            specify a tier in a request, Parameter Store assigns the tier
     *            based on the current Parameter Store default tier
     *            configuration.
     *            </p>
     *            <p>
     *            The default tier when you begin using Parameter Store is the
     *            standard-parameter tier. If you use the advanced-parameter
     *            tier, you can specify one of the following as the default:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Advanced</b>: With this option, Parameter Store evaluates
     *            all requests as advanced parameters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Intelligent-Tiering</b>: With this option, Parameter Store
     *            evaluates each request to determine if the parameter is
     *            standard or advanced.
     *            </p>
     *            <p>
     *            If the request doesn't include any options that require an
     *            advanced parameter, the parameter is created in the
     *            standard-parameter tier. If one or more options requiring an
     *            advanced parameter are included in the request, Parameter
     *            Store create a parameter in the advanced-parameter tier.
     *            </p>
     *            <p>
     *            This approach helps control your parameter-related costs by
     *            always creating standard parameters unless an advanced
     *            parameter is necessary.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Options that require an advanced parameter include the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The content size of the parameter is more than 4 KB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The parameter uses a parameter policy.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            More than 10,000 parameters already exist in your AWS account
     *            in the current Region.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about configuring the default tier
     *            option, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/ps-default-tier.html"
     *            >Specifying a default parameter tier</a> in the <i>AWS Systems
     *            Manager User Guide</i>.
     *            </p>
     * @see ParameterTier
     */
    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * The parameter tier to assign to a parameter.
     * </p>
     * <p>
     * Parameter Store offers a standard tier and an advanced tier for
     * parameters. Standard parameters have a content size limit of 4 KB and
     * can't be configured to use parameter policies. You can create a maximum
     * of 10,000 standard parameters for each Region in an AWS account. Standard
     * parameters are offered at no additional cost.
     * </p>
     * <p>
     * Advanced parameters have a content size limit of 8 KB and can be
     * configured to use parameter policies. You can create a maximum of 100,000
     * advanced parameters for each Region in an AWS account. Advanced
     * parameters incur a charge. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-advanced-parameters.html"
     * >Standard and advanced parameter tiers</a> in the <i>AWS Systems Manager
     * User Guide</i>.
     * </p>
     * <p>
     * You can change a standard parameter to an advanced parameter any time.
     * But you can't revert an advanced parameter to a standard parameter.
     * Reverting an advanced parameter to a standard parameter would result in
     * data loss because the system would truncate the size of the parameter
     * from 8 KB to 4 KB. Reverting would also remove any policies attached to
     * the parameter. Lastly, advanced parameters use a different form of
     * encryption than standard parameters.
     * </p>
     * <p>
     * If you no longer need an advanced parameter, or if you no longer want to
     * incur charges for an advanced parameter, you must delete it and recreate
     * it as a new standard parameter.
     * </p>
     * <p>
     * <b>Using the Default Tier Configuration</b>
     * </p>
     * <p>
     * In <code>PutParameter</code> requests, you can specify the tier to create
     * the parameter in. Whenever you specify a tier in the request, Parameter
     * Store creates or updates the parameter according to that request.
     * However, if you do not specify a tier in a request, Parameter Store
     * assigns the tier based on the current Parameter Store default tier
     * configuration.
     * </p>
     * <p>
     * The default tier when you begin using Parameter Store is the
     * standard-parameter tier. If you use the advanced-parameter tier, you can
     * specify one of the following as the default:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Advanced</b>: With this option, Parameter Store evaluates all requests
     * as advanced parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Intelligent-Tiering</b>: With this option, Parameter Store evaluates
     * each request to determine if the parameter is standard or advanced.
     * </p>
     * <p>
     * If the request doesn't include any options that require an advanced
     * parameter, the parameter is created in the standard-parameter tier. If
     * one or more options requiring an advanced parameter are included in the
     * request, Parameter Store create a parameter in the advanced-parameter
     * tier.
     * </p>
     * <p>
     * This approach helps control your parameter-related costs by always
     * creating standard parameters unless an advanced parameter is necessary.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Options that require an advanced parameter include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The content size of the parameter is more than 4 KB.
     * </p>
     * </li>
     * <li>
     * <p>
     * The parameter uses a parameter policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * More than 10,000 parameters already exist in your AWS account in the
     * current Region.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about configuring the default tier option, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/ps-default-tier.html"
     * >Specifying a default parameter tier</a> in the <i>AWS Systems Manager
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Advanced, Intelligent-Tiering
     *
     * @param tier <p>
     *            The parameter tier to assign to a parameter.
     *            </p>
     *            <p>
     *            Parameter Store offers a standard tier and an advanced tier
     *            for parameters. Standard parameters have a content size limit
     *            of 4 KB and can't be configured to use parameter policies. You
     *            can create a maximum of 10,000 standard parameters for each
     *            Region in an AWS account. Standard parameters are offered at
     *            no additional cost.
     *            </p>
     *            <p>
     *            Advanced parameters have a content size limit of 8 KB and can
     *            be configured to use parameter policies. You can create a
     *            maximum of 100,000 advanced parameters for each Region in an
     *            AWS account. Advanced parameters incur a charge. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-advanced-parameters.html"
     *            >Standard and advanced parameter tiers</a> in the <i>AWS
     *            Systems Manager User Guide</i>.
     *            </p>
     *            <p>
     *            You can change a standard parameter to an advanced parameter
     *            any time. But you can't revert an advanced parameter to a
     *            standard parameter. Reverting an advanced parameter to a
     *            standard parameter would result in data loss because the
     *            system would truncate the size of the parameter from 8 KB to 4
     *            KB. Reverting would also remove any policies attached to the
     *            parameter. Lastly, advanced parameters use a different form of
     *            encryption than standard parameters.
     *            </p>
     *            <p>
     *            If you no longer need an advanced parameter, or if you no
     *            longer want to incur charges for an advanced parameter, you
     *            must delete it and recreate it as a new standard parameter.
     *            </p>
     *            <p>
     *            <b>Using the Default Tier Configuration</b>
     *            </p>
     *            <p>
     *            In <code>PutParameter</code> requests, you can specify the
     *            tier to create the parameter in. Whenever you specify a tier
     *            in the request, Parameter Store creates or updates the
     *            parameter according to that request. However, if you do not
     *            specify a tier in a request, Parameter Store assigns the tier
     *            based on the current Parameter Store default tier
     *            configuration.
     *            </p>
     *            <p>
     *            The default tier when you begin using Parameter Store is the
     *            standard-parameter tier. If you use the advanced-parameter
     *            tier, you can specify one of the following as the default:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Advanced</b>: With this option, Parameter Store evaluates
     *            all requests as advanced parameters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Intelligent-Tiering</b>: With this option, Parameter Store
     *            evaluates each request to determine if the parameter is
     *            standard or advanced.
     *            </p>
     *            <p>
     *            If the request doesn't include any options that require an
     *            advanced parameter, the parameter is created in the
     *            standard-parameter tier. If one or more options requiring an
     *            advanced parameter are included in the request, Parameter
     *            Store create a parameter in the advanced-parameter tier.
     *            </p>
     *            <p>
     *            This approach helps control your parameter-related costs by
     *            always creating standard parameters unless an advanced
     *            parameter is necessary.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Options that require an advanced parameter include the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The content size of the parameter is more than 4 KB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The parameter uses a parameter policy.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            More than 10,000 parameters already exist in your AWS account
     *            in the current Region.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about configuring the default tier
     *            option, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/ps-default-tier.html"
     *            >Specifying a default parameter tier</a> in the <i>AWS Systems
     *            Manager User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParameterTier
     */
    public PutParameterRequest withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * <p>
     * The parameter tier to assign to a parameter.
     * </p>
     * <p>
     * Parameter Store offers a standard tier and an advanced tier for
     * parameters. Standard parameters have a content size limit of 4 KB and
     * can't be configured to use parameter policies. You can create a maximum
     * of 10,000 standard parameters for each Region in an AWS account. Standard
     * parameters are offered at no additional cost.
     * </p>
     * <p>
     * Advanced parameters have a content size limit of 8 KB and can be
     * configured to use parameter policies. You can create a maximum of 100,000
     * advanced parameters for each Region in an AWS account. Advanced
     * parameters incur a charge. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-advanced-parameters.html"
     * >Standard and advanced parameter tiers</a> in the <i>AWS Systems Manager
     * User Guide</i>.
     * </p>
     * <p>
     * You can change a standard parameter to an advanced parameter any time.
     * But you can't revert an advanced parameter to a standard parameter.
     * Reverting an advanced parameter to a standard parameter would result in
     * data loss because the system would truncate the size of the parameter
     * from 8 KB to 4 KB. Reverting would also remove any policies attached to
     * the parameter. Lastly, advanced parameters use a different form of
     * encryption than standard parameters.
     * </p>
     * <p>
     * If you no longer need an advanced parameter, or if you no longer want to
     * incur charges for an advanced parameter, you must delete it and recreate
     * it as a new standard parameter.
     * </p>
     * <p>
     * <b>Using the Default Tier Configuration</b>
     * </p>
     * <p>
     * In <code>PutParameter</code> requests, you can specify the tier to create
     * the parameter in. Whenever you specify a tier in the request, Parameter
     * Store creates or updates the parameter according to that request.
     * However, if you do not specify a tier in a request, Parameter Store
     * assigns the tier based on the current Parameter Store default tier
     * configuration.
     * </p>
     * <p>
     * The default tier when you begin using Parameter Store is the
     * standard-parameter tier. If you use the advanced-parameter tier, you can
     * specify one of the following as the default:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Advanced</b>: With this option, Parameter Store evaluates all requests
     * as advanced parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Intelligent-Tiering</b>: With this option, Parameter Store evaluates
     * each request to determine if the parameter is standard or advanced.
     * </p>
     * <p>
     * If the request doesn't include any options that require an advanced
     * parameter, the parameter is created in the standard-parameter tier. If
     * one or more options requiring an advanced parameter are included in the
     * request, Parameter Store create a parameter in the advanced-parameter
     * tier.
     * </p>
     * <p>
     * This approach helps control your parameter-related costs by always
     * creating standard parameters unless an advanced parameter is necessary.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Options that require an advanced parameter include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The content size of the parameter is more than 4 KB.
     * </p>
     * </li>
     * <li>
     * <p>
     * The parameter uses a parameter policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * More than 10,000 parameters already exist in your AWS account in the
     * current Region.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about configuring the default tier option, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/ps-default-tier.html"
     * >Specifying a default parameter tier</a> in the <i>AWS Systems Manager
     * User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Advanced, Intelligent-Tiering
     *
     * @param tier <p>
     *            The parameter tier to assign to a parameter.
     *            </p>
     *            <p>
     *            Parameter Store offers a standard tier and an advanced tier
     *            for parameters. Standard parameters have a content size limit
     *            of 4 KB and can't be configured to use parameter policies. You
     *            can create a maximum of 10,000 standard parameters for each
     *            Region in an AWS account. Standard parameters are offered at
     *            no additional cost.
     *            </p>
     *            <p>
     *            Advanced parameters have a content size limit of 8 KB and can
     *            be configured to use parameter policies. You can create a
     *            maximum of 100,000 advanced parameters for each Region in an
     *            AWS account. Advanced parameters incur a charge. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-advanced-parameters.html"
     *            >Standard and advanced parameter tiers</a> in the <i>AWS
     *            Systems Manager User Guide</i>.
     *            </p>
     *            <p>
     *            You can change a standard parameter to an advanced parameter
     *            any time. But you can't revert an advanced parameter to a
     *            standard parameter. Reverting an advanced parameter to a
     *            standard parameter would result in data loss because the
     *            system would truncate the size of the parameter from 8 KB to 4
     *            KB. Reverting would also remove any policies attached to the
     *            parameter. Lastly, advanced parameters use a different form of
     *            encryption than standard parameters.
     *            </p>
     *            <p>
     *            If you no longer need an advanced parameter, or if you no
     *            longer want to incur charges for an advanced parameter, you
     *            must delete it and recreate it as a new standard parameter.
     *            </p>
     *            <p>
     *            <b>Using the Default Tier Configuration</b>
     *            </p>
     *            <p>
     *            In <code>PutParameter</code> requests, you can specify the
     *            tier to create the parameter in. Whenever you specify a tier
     *            in the request, Parameter Store creates or updates the
     *            parameter according to that request. However, if you do not
     *            specify a tier in a request, Parameter Store assigns the tier
     *            based on the current Parameter Store default tier
     *            configuration.
     *            </p>
     *            <p>
     *            The default tier when you begin using Parameter Store is the
     *            standard-parameter tier. If you use the advanced-parameter
     *            tier, you can specify one of the following as the default:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Advanced</b>: With this option, Parameter Store evaluates
     *            all requests as advanced parameters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Intelligent-Tiering</b>: With this option, Parameter Store
     *            evaluates each request to determine if the parameter is
     *            standard or advanced.
     *            </p>
     *            <p>
     *            If the request doesn't include any options that require an
     *            advanced parameter, the parameter is created in the
     *            standard-parameter tier. If one or more options requiring an
     *            advanced parameter are included in the request, Parameter
     *            Store create a parameter in the advanced-parameter tier.
     *            </p>
     *            <p>
     *            This approach helps control your parameter-related costs by
     *            always creating standard parameters unless an advanced
     *            parameter is necessary.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Options that require an advanced parameter include the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The content size of the parameter is more than 4 KB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The parameter uses a parameter policy.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            More than 10,000 parameters already exist in your AWS account
     *            in the current Region.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about configuring the default tier
     *            option, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/ps-default-tier.html"
     *            >Specifying a default parameter tier</a> in the <i>AWS Systems
     *            Manager User Guide</i>.
     *            </p>
     * @see ParameterTier
     */
    public void setTier(ParameterTier tier) {
        this.tier = tier.toString();
    }

    /**
     * <p>
     * The parameter tier to assign to a parameter.
     * </p>
     * <p>
     * Parameter Store offers a standard tier and an advanced tier for
     * parameters. Standard parameters have a content size limit of 4 KB and
     * can't be configured to use parameter policies. You can create a maximum
     * of 10,000 standard parameters for each Region in an AWS account. Standard
     * parameters are offered at no additional cost.
     * </p>
     * <p>
     * Advanced parameters have a content size limit of 8 KB and can be
     * configured to use parameter policies. You can create a maximum of 100,000
     * advanced parameters for each Region in an AWS account. Advanced
     * parameters incur a charge. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-advanced-parameters.html"
     * >Standard and advanced parameter tiers</a> in the <i>AWS Systems Manager
     * User Guide</i>.
     * </p>
     * <p>
     * You can change a standard parameter to an advanced parameter any time.
     * But you can't revert an advanced parameter to a standard parameter.
     * Reverting an advanced parameter to a standard parameter would result in
     * data loss because the system would truncate the size of the parameter
     * from 8 KB to 4 KB. Reverting would also remove any policies attached to
     * the parameter. Lastly, advanced parameters use a different form of
     * encryption than standard parameters.
     * </p>
     * <p>
     * If you no longer need an advanced parameter, or if you no longer want to
     * incur charges for an advanced parameter, you must delete it and recreate
     * it as a new standard parameter.
     * </p>
     * <p>
     * <b>Using the Default Tier Configuration</b>
     * </p>
     * <p>
     * In <code>PutParameter</code> requests, you can specify the tier to create
     * the parameter in. Whenever you specify a tier in the request, Parameter
     * Store creates or updates the parameter according to that request.
     * However, if you do not specify a tier in a request, Parameter Store
     * assigns the tier based on the current Parameter Store default tier
     * configuration.
     * </p>
     * <p>
     * The default tier when you begin using Parameter Store is the
     * standard-parameter tier. If you use the advanced-parameter tier, you can
     * specify one of the following as the default:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Advanced</b>: With this option, Parameter Store evaluates all requests
     * as advanced parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Intelligent-Tiering</b>: With this option, Parameter Store evaluates
     * each request to determine if the parameter is standard or advanced.
     * </p>
     * <p>
     * If the request doesn't include any options that require an advanced
     * parameter, the parameter is created in the standard-parameter tier. If
     * one or more options requiring an advanced parameter are included in the
     * request, Parameter Store create a parameter in the advanced-parameter
     * tier.
     * </p>
     * <p>
     * This approach helps control your parameter-related costs by always
     * creating standard parameters unless an advanced parameter is necessary.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Options that require an advanced parameter include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The content size of the parameter is more than 4 KB.
     * </p>
     * </li>
     * <li>
     * <p>
     * The parameter uses a parameter policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * More than 10,000 parameters already exist in your AWS account in the
     * current Region.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about configuring the default tier option, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/ps-default-tier.html"
     * >Specifying a default parameter tier</a> in the <i>AWS Systems Manager
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Advanced, Intelligent-Tiering
     *
     * @param tier <p>
     *            The parameter tier to assign to a parameter.
     *            </p>
     *            <p>
     *            Parameter Store offers a standard tier and an advanced tier
     *            for parameters. Standard parameters have a content size limit
     *            of 4 KB and can't be configured to use parameter policies. You
     *            can create a maximum of 10,000 standard parameters for each
     *            Region in an AWS account. Standard parameters are offered at
     *            no additional cost.
     *            </p>
     *            <p>
     *            Advanced parameters have a content size limit of 8 KB and can
     *            be configured to use parameter policies. You can create a
     *            maximum of 100,000 advanced parameters for each Region in an
     *            AWS account. Advanced parameters incur a charge. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-advanced-parameters.html"
     *            >Standard and advanced parameter tiers</a> in the <i>AWS
     *            Systems Manager User Guide</i>.
     *            </p>
     *            <p>
     *            You can change a standard parameter to an advanced parameter
     *            any time. But you can't revert an advanced parameter to a
     *            standard parameter. Reverting an advanced parameter to a
     *            standard parameter would result in data loss because the
     *            system would truncate the size of the parameter from 8 KB to 4
     *            KB. Reverting would also remove any policies attached to the
     *            parameter. Lastly, advanced parameters use a different form of
     *            encryption than standard parameters.
     *            </p>
     *            <p>
     *            If you no longer need an advanced parameter, or if you no
     *            longer want to incur charges for an advanced parameter, you
     *            must delete it and recreate it as a new standard parameter.
     *            </p>
     *            <p>
     *            <b>Using the Default Tier Configuration</b>
     *            </p>
     *            <p>
     *            In <code>PutParameter</code> requests, you can specify the
     *            tier to create the parameter in. Whenever you specify a tier
     *            in the request, Parameter Store creates or updates the
     *            parameter according to that request. However, if you do not
     *            specify a tier in a request, Parameter Store assigns the tier
     *            based on the current Parameter Store default tier
     *            configuration.
     *            </p>
     *            <p>
     *            The default tier when you begin using Parameter Store is the
     *            standard-parameter tier. If you use the advanced-parameter
     *            tier, you can specify one of the following as the default:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Advanced</b>: With this option, Parameter Store evaluates
     *            all requests as advanced parameters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Intelligent-Tiering</b>: With this option, Parameter Store
     *            evaluates each request to determine if the parameter is
     *            standard or advanced.
     *            </p>
     *            <p>
     *            If the request doesn't include any options that require an
     *            advanced parameter, the parameter is created in the
     *            standard-parameter tier. If one or more options requiring an
     *            advanced parameter are included in the request, Parameter
     *            Store create a parameter in the advanced-parameter tier.
     *            </p>
     *            <p>
     *            This approach helps control your parameter-related costs by
     *            always creating standard parameters unless an advanced
     *            parameter is necessary.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Options that require an advanced parameter include the
     *            following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The content size of the parameter is more than 4 KB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The parameter uses a parameter policy.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            More than 10,000 parameters already exist in your AWS account
     *            in the current Region.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about configuring the default tier
     *            option, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/ps-default-tier.html"
     *            >Specifying a default parameter tier</a> in the <i>AWS Systems
     *            Manager User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParameterTier
     */
    public PutParameterRequest withTier(ParameterTier tier) {
        this.tier = tier.toString();
        return this;
    }

    /**
     * <p>
     * One or more policies to apply to a parameter. This action takes a JSON
     * array. Parameter Store supports the following policy types:
     * </p>
     * <p>
     * Expiration: This policy deletes the parameter after it expires. When you
     * create the policy, you specify the expiration date. You can update the
     * expiration date and time by updating the policy. Updating the
     * <i>parameter</i> does not affect the expiration date and time. When the
     * expiration time is reached, Parameter Store deletes the parameter.
     * </p>
     * <p>
     * ExpirationNotification: This policy triggers an event in Amazon
     * CloudWatch Events that notifies you about the expiration. By using this
     * policy, you can receive notification before or after the expiration time
     * is reached, in units of days or hours.
     * </p>
     * <p>
     * NoChangeNotification: This policy triggers a CloudWatch event if a
     * parameter has not been modified for a specified period of time. This
     * policy type is useful when, for example, a secret needs to be changed
     * within a period of time, but it has not been changed.
     * </p>
     * <p>
     * All existing policies are preserved until you send new policies or an
     * empty policy. For more information about parameter policies, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-policies.html"
     * >Assigning parameter policies</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @return <p>
     *         One or more policies to apply to a parameter. This action takes a
     *         JSON array. Parameter Store supports the following policy types:
     *         </p>
     *         <p>
     *         Expiration: This policy deletes the parameter after it expires.
     *         When you create the policy, you specify the expiration date. You
     *         can update the expiration date and time by updating the policy.
     *         Updating the <i>parameter</i> does not affect the expiration date
     *         and time. When the expiration time is reached, Parameter Store
     *         deletes the parameter.
     *         </p>
     *         <p>
     *         ExpirationNotification: This policy triggers an event in Amazon
     *         CloudWatch Events that notifies you about the expiration. By
     *         using this policy, you can receive notification before or after
     *         the expiration time is reached, in units of days or hours.
     *         </p>
     *         <p>
     *         NoChangeNotification: This policy triggers a CloudWatch event if
     *         a parameter has not been modified for a specified period of time.
     *         This policy type is useful when, for example, a secret needs to
     *         be changed within a period of time, but it has not been changed.
     *         </p>
     *         <p>
     *         All existing policies are preserved until you send new policies
     *         or an empty policy. For more information about parameter
     *         policies, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-policies.html"
     *         >Assigning parameter policies</a>.
     *         </p>
     */
    public String getPolicies() {
        return policies;
    }

    /**
     * <p>
     * One or more policies to apply to a parameter. This action takes a JSON
     * array. Parameter Store supports the following policy types:
     * </p>
     * <p>
     * Expiration: This policy deletes the parameter after it expires. When you
     * create the policy, you specify the expiration date. You can update the
     * expiration date and time by updating the policy. Updating the
     * <i>parameter</i> does not affect the expiration date and time. When the
     * expiration time is reached, Parameter Store deletes the parameter.
     * </p>
     * <p>
     * ExpirationNotification: This policy triggers an event in Amazon
     * CloudWatch Events that notifies you about the expiration. By using this
     * policy, you can receive notification before or after the expiration time
     * is reached, in units of days or hours.
     * </p>
     * <p>
     * NoChangeNotification: This policy triggers a CloudWatch event if a
     * parameter has not been modified for a specified period of time. This
     * policy type is useful when, for example, a secret needs to be changed
     * within a period of time, but it has not been changed.
     * </p>
     * <p>
     * All existing policies are preserved until you send new policies or an
     * empty policy. For more information about parameter policies, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-policies.html"
     * >Assigning parameter policies</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param policies <p>
     *            One or more policies to apply to a parameter. This action
     *            takes a JSON array. Parameter Store supports the following
     *            policy types:
     *            </p>
     *            <p>
     *            Expiration: This policy deletes the parameter after it
     *            expires. When you create the policy, you specify the
     *            expiration date. You can update the expiration date and time
     *            by updating the policy. Updating the <i>parameter</i> does not
     *            affect the expiration date and time. When the expiration time
     *            is reached, Parameter Store deletes the parameter.
     *            </p>
     *            <p>
     *            ExpirationNotification: This policy triggers an event in
     *            Amazon CloudWatch Events that notifies you about the
     *            expiration. By using this policy, you can receive notification
     *            before or after the expiration time is reached, in units of
     *            days or hours.
     *            </p>
     *            <p>
     *            NoChangeNotification: This policy triggers a CloudWatch event
     *            if a parameter has not been modified for a specified period of
     *            time. This policy type is useful when, for example, a secret
     *            needs to be changed within a period of time, but it has not
     *            been changed.
     *            </p>
     *            <p>
     *            All existing policies are preserved until you send new
     *            policies or an empty policy. For more information about
     *            parameter policies, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-policies.html"
     *            >Assigning parameter policies</a>.
     *            </p>
     */
    public void setPolicies(String policies) {
        this.policies = policies;
    }

    /**
     * <p>
     * One or more policies to apply to a parameter. This action takes a JSON
     * array. Parameter Store supports the following policy types:
     * </p>
     * <p>
     * Expiration: This policy deletes the parameter after it expires. When you
     * create the policy, you specify the expiration date. You can update the
     * expiration date and time by updating the policy. Updating the
     * <i>parameter</i> does not affect the expiration date and time. When the
     * expiration time is reached, Parameter Store deletes the parameter.
     * </p>
     * <p>
     * ExpirationNotification: This policy triggers an event in Amazon
     * CloudWatch Events that notifies you about the expiration. By using this
     * policy, you can receive notification before or after the expiration time
     * is reached, in units of days or hours.
     * </p>
     * <p>
     * NoChangeNotification: This policy triggers a CloudWatch event if a
     * parameter has not been modified for a specified period of time. This
     * policy type is useful when, for example, a secret needs to be changed
     * within a period of time, but it has not been changed.
     * </p>
     * <p>
     * All existing policies are preserved until you send new policies or an
     * empty policy. For more information about parameter policies, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-policies.html"
     * >Assigning parameter policies</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param policies <p>
     *            One or more policies to apply to a parameter. This action
     *            takes a JSON array. Parameter Store supports the following
     *            policy types:
     *            </p>
     *            <p>
     *            Expiration: This policy deletes the parameter after it
     *            expires. When you create the policy, you specify the
     *            expiration date. You can update the expiration date and time
     *            by updating the policy. Updating the <i>parameter</i> does not
     *            affect the expiration date and time. When the expiration time
     *            is reached, Parameter Store deletes the parameter.
     *            </p>
     *            <p>
     *            ExpirationNotification: This policy triggers an event in
     *            Amazon CloudWatch Events that notifies you about the
     *            expiration. By using this policy, you can receive notification
     *            before or after the expiration time is reached, in units of
     *            days or hours.
     *            </p>
     *            <p>
     *            NoChangeNotification: This policy triggers a CloudWatch event
     *            if a parameter has not been modified for a specified period of
     *            time. This policy type is useful when, for example, a secret
     *            needs to be changed within a period of time, but it has not
     *            been changed.
     *            </p>
     *            <p>
     *            All existing policies are preserved until you send new
     *            policies or an empty policy. For more information about
     *            parameter policies, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-policies.html"
     *            >Assigning parameter policies</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutParameterRequest withPolicies(String policies) {
        this.policies = policies;
        return this;
    }

    /**
     * <p>
     * The data type for a <code>String</code> parameter. Supported data types
     * include plain text and Amazon Machine Image IDs.
     * </p>
     * <p>
     * <b>The following data type values are supported.</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>text</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aws:ec2:image</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you create a <code>String</code> parameter and specify
     * <code>aws:ec2:image</code>, Systems Manager validates the parameter value
     * is in the required format, such as <code>ami-12345abcdeEXAMPLE</code>,
     * and that the specified AMI is available in your AWS account. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-ec2-aliases.html"
     * >Native parameter support for Amazon Machine Image IDs</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @return <p>
     *         The data type for a <code>String</code> parameter. Supported data
     *         types include plain text and Amazon Machine Image IDs.
     *         </p>
     *         <p>
     *         <b>The following data type values are supported.</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>text</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>aws:ec2:image</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When you create a <code>String</code> parameter and specify
     *         <code>aws:ec2:image</code>, Systems Manager validates the
     *         parameter value is in the required format, such as
     *         <code>ami-12345abcdeEXAMPLE</code>, and that the specified AMI is
     *         available in your AWS account. For more information, see <a href=
     *         "http://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-ec2-aliases.html"
     *         >Native parameter support for Amazon Machine Image IDs</a> in the
     *         <i>AWS Systems Manager User Guide</i>.
     *         </p>
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * <p>
     * The data type for a <code>String</code> parameter. Supported data types
     * include plain text and Amazon Machine Image IDs.
     * </p>
     * <p>
     * <b>The following data type values are supported.</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>text</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aws:ec2:image</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you create a <code>String</code> parameter and specify
     * <code>aws:ec2:image</code>, Systems Manager validates the parameter value
     * is in the required format, such as <code>ami-12345abcdeEXAMPLE</code>,
     * and that the specified AMI is available in your AWS account. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-ec2-aliases.html"
     * >Native parameter support for Amazon Machine Image IDs</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param dataType <p>
     *            The data type for a <code>String</code> parameter. Supported
     *            data types include plain text and Amazon Machine Image IDs.
     *            </p>
     *            <p>
     *            <b>The following data type values are supported.</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>text</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>aws:ec2:image</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            When you create a <code>String</code> parameter and specify
     *            <code>aws:ec2:image</code>, Systems Manager validates the
     *            parameter value is in the required format, such as
     *            <code>ami-12345abcdeEXAMPLE</code>, and that the specified AMI
     *            is available in your AWS account. For more information, see <a
     *            href=
     *            "http://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-ec2-aliases.html"
     *            >Native parameter support for Amazon Machine Image IDs</a> in
     *            the <i>AWS Systems Manager User Guide</i>.
     *            </p>
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The data type for a <code>String</code> parameter. Supported data types
     * include plain text and Amazon Machine Image IDs.
     * </p>
     * <p>
     * <b>The following data type values are supported.</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>text</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aws:ec2:image</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you create a <code>String</code> parameter and specify
     * <code>aws:ec2:image</code>, Systems Manager validates the parameter value
     * is in the required format, such as <code>ami-12345abcdeEXAMPLE</code>,
     * and that the specified AMI is available in your AWS account. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-ec2-aliases.html"
     * >Native parameter support for Amazon Machine Image IDs</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param dataType <p>
     *            The data type for a <code>String</code> parameter. Supported
     *            data types include plain text and Amazon Machine Image IDs.
     *            </p>
     *            <p>
     *            <b>The following data type values are supported.</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>text</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>aws:ec2:image</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            When you create a <code>String</code> parameter and specify
     *            <code>aws:ec2:image</code>, Systems Manager validates the
     *            parameter value is in the required format, such as
     *            <code>ami-12345abcdeEXAMPLE</code>, and that the specified AMI
     *            is available in your AWS account. For more information, see <a
     *            href=
     *            "http://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-ec2-aliases.html"
     *            >Native parameter support for Amazon Machine Image IDs</a> in
     *            the <i>AWS Systems Manager User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutParameterRequest withDataType(String dataType) {
        this.dataType = dataType;
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
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getOverwrite() != null)
            sb.append("Overwrite: " + getOverwrite() + ",");
        if (getAllowedPattern() != null)
            sb.append("AllowedPattern: " + getAllowedPattern() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getTier() != null)
            sb.append("Tier: " + getTier() + ",");
        if (getPolicies() != null)
            sb.append("Policies: " + getPolicies() + ",");
        if (getDataType() != null)
            sb.append("DataType: " + getDataType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getOverwrite() == null) ? 0 : getOverwrite().hashCode());
        hashCode = prime * hashCode
                + ((getAllowedPattern() == null) ? 0 : getAllowedPattern().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutParameterRequest == false)
            return false;
        PutParameterRequest other = (PutParameterRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getOverwrite() == null ^ this.getOverwrite() == null)
            return false;
        if (other.getOverwrite() != null
                && other.getOverwrite().equals(this.getOverwrite()) == false)
            return false;
        if (other.getAllowedPattern() == null ^ this.getAllowedPattern() == null)
            return false;
        if (other.getAllowedPattern() != null
                && other.getAllowedPattern().equals(this.getAllowedPattern()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        if (other.getPolicies() == null ^ this.getPolicies() == null)
            return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        return true;
    }
}
