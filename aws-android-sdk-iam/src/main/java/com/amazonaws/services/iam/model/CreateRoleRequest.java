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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new role for your AWS account. For more information about roles, go
 * to <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html">IAM
 * Roles</a>. For information about limitations on role names and the number of
 * roles you can create, go to <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"
 * >Limitations on IAM Entities</a> in the <i>IAM User Guide</i>.
 * </p>
 */
public class CreateRoleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The path to the role. For more information about paths, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string
     * that must begin and end with forward slashes. In addition, it can contain
     * any ASCII character from the ! (<code>\u0021</code>) through the DEL
     * character (<code>\u007F</code>), including most punctuation characters,
     * digits, and upper and lowercased letters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     */
    private String path;

    /**
     * <p>
     * The name of the role to create.
     * </p>
     * <p>
     * IAM user, group, role, and policy names must be unique within the
     * account. Names are not distinguished by case. For example, you cannot
     * create resources named both "MyResource" and "myresource".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String roleName;

    /**
     * <p>
     * The trust relationship policy document that grants an entity permission
     * to assume the role.
     * </p>
     * <p>
     * In IAM, you must provide a JSON policy that has been converted to a
     * string. However, for AWS CloudFormation templates formatted in YAML, you
     * can provide the policy in JSON or YAML format. AWS CloudFormation always
     * converts a YAML policy to JSON format before submitting it to IAM.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Upon success, the response includes the same trust policy in JSON format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String assumeRolePolicyDocument;

    /**
     * <p>
     * A description of the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     */
    private String description;

    /**
     * <p>
     * The maximum session duration (in seconds) that you want to set for the
     * specified role. If you do not specify a value for this setting, the
     * default maximum of one hour is applied. This setting can have a value
     * from 1 hour to 12 hours.
     * </p>
     * <p>
     * Anyone who assumes the role from the AWS CLI or API can use the
     * <code>DurationSeconds</code> API parameter or the
     * <code>duration-seconds</code> CLI parameter to request a longer session.
     * The <code>MaxSessionDuration</code> setting determines the maximum
     * duration that can be requested using the <code>DurationSeconds</code>
     * parameter. If users don't specify a value for the
     * <code>DurationSeconds</code> parameter, their security credentials are
     * valid for one hour by default. This applies when you use the
     * <code>AssumeRole*</code> API operations or the <code>assume-role*</code>
     * CLI operations but does not apply when you use those operations to create
     * a console URL. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html"
     * >Using IAM Roles</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3600 - 43200<br/>
     */
    private Integer maxSessionDuration;

    /**
     * <p>
     * The ARN of the policy that is used to set the permissions boundary for
     * the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String permissionsBoundary;

    /**
     * <p>
     * A list of tags that you want to attach to the newly created role. Each
     * tag consists of a key name and an associated value. For more information
     * about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     * >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If any one of the tags is invalid or if you exceed the allowed number of
     * tags per role, then the entire request fails and the role is not created.
     * </p>
     * </note>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The path to the role. For more information about paths, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string
     * that must begin and end with forward slashes. In addition, it can contain
     * any ASCII character from the ! (<code>\u0021</code>) through the DEL
     * character (<code>\u007F</code>), including most punctuation characters,
     * digits, and upper and lowercased letters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @return <p>
     *         The path to the role. For more information about paths, see <a
     *         href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *         >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         <p>
     *         This parameter is optional. If it is not included, it defaults to
     *         a slash (/).
     *         </p>
     *         <p>
     *         This parameter allows (through its <a
     *         href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *         string of characters consisting of either a forward slash (/) by
     *         itself or a string that must begin and end with forward slashes.
     *         In addition, it can contain any ASCII character from the ! (
     *         <code>\u0021</code>) through the DEL character (
     *         <code>\u007F</code>), including most punctuation characters,
     *         digits, and upper and lowercased letters.
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * The path to the role. For more information about paths, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string
     * that must begin and end with forward slashes. In addition, it can contain
     * any ASCII character from the ! (<code>\u0021</code>) through the DEL
     * character (<code>\u007F</code>), including most punctuation characters,
     * digits, and upper and lowercased letters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param path <p>
     *            The path to the role. For more information about paths, see <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            This parameter is optional. If it is not included, it defaults
     *            to a slash (/).
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of either a forward slash (/)
     *            by itself or a string that must begin and end with forward
     *            slashes. In addition, it can contain any ASCII character from
     *            the ! (<code>\u0021</code>) through the DEL character (
     *            <code>\u007F</code>), including most punctuation characters,
     *            digits, and upper and lowercased letters.
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the role. For more information about paths, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string
     * that must begin and end with forward slashes. In addition, it can contain
     * any ASCII character from the ! (<code>\u0021</code>) through the DEL
     * character (<code>\u007F</code>), including most punctuation characters,
     * digits, and upper and lowercased letters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param path <p>
     *            The path to the role. For more information about paths, see <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            This parameter is optional. If it is not included, it defaults
     *            to a slash (/).
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of either a forward slash (/)
     *            by itself or a string that must begin and end with forward
     *            slashes. In addition, it can contain any ASCII character from
     *            the ! (<code>\u0021</code>) through the DEL character (
     *            <code>\u007F</code>), including most punctuation characters,
     *            digits, and upper and lowercased letters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRoleRequest withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * <p>
     * The name of the role to create.
     * </p>
     * <p>
     * IAM user, group, role, and policy names must be unique within the
     * account. Names are not distinguished by case. For example, you cannot
     * create resources named both "MyResource" and "myresource".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The name of the role to create.
     *         </p>
     *         <p>
     *         IAM user, group, role, and policy names must be unique within the
     *         account. Names are not distinguished by case. For example, you
     *         cannot create resources named both "MyResource" and "myresource".
     *         </p>
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * <p>
     * The name of the role to create.
     * </p>
     * <p>
     * IAM user, group, role, and policy names must be unique within the
     * account. Names are not distinguished by case. For example, you cannot
     * create resources named both "MyResource" and "myresource".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param roleName <p>
     *            The name of the role to create.
     *            </p>
     *            <p>
     *            IAM user, group, role, and policy names must be unique within
     *            the account. Names are not distinguished by case. For example,
     *            you cannot create resources named both "MyResource" and
     *            "myresource".
     *            </p>
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the role to create.
     * </p>
     * <p>
     * IAM user, group, role, and policy names must be unique within the
     * account. Names are not distinguished by case. For example, you cannot
     * create resources named both "MyResource" and "myresource".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param roleName <p>
     *            The name of the role to create.
     *            </p>
     *            <p>
     *            IAM user, group, role, and policy names must be unique within
     *            the account. Names are not distinguished by case. For example,
     *            you cannot create resources named both "MyResource" and
     *            "myresource".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRoleRequest withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * <p>
     * The trust relationship policy document that grants an entity permission
     * to assume the role.
     * </p>
     * <p>
     * In IAM, you must provide a JSON policy that has been converted to a
     * string. However, for AWS CloudFormation templates formatted in YAML, you
     * can provide the policy in JSON or YAML format. AWS CloudFormation always
     * converts a YAML policy to JSON format before submitting it to IAM.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Upon success, the response includes the same trust policy in JSON format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The trust relationship policy document that grants an entity
     *         permission to assume the role.
     *         </p>
     *         <p>
     *         In IAM, you must provide a JSON policy that has been converted to
     *         a string. However, for AWS CloudFormation templates formatted in
     *         YAML, you can provide the policy in JSON or YAML format. AWS
     *         CloudFormation always converts a YAML policy to JSON format
     *         before submitting it to IAM.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         used to validate this parameter is a string of characters
     *         consisting of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Any printable ASCII character ranging from the space character (
     *         <code>\u0020</code>) through the end of the ASCII character range
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The printable characters in the Basic Latin and Latin-1
     *         Supplement character set (through <code>\u00FF</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The special characters tab (<code>\u0009</code>), line feed (
     *         <code>\u000A</code>), and carriage return (<code>\u000D</code>)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Upon success, the response includes the same trust policy in JSON
     *         format.
     *         </p>
     */
    public String getAssumeRolePolicyDocument() {
        return assumeRolePolicyDocument;
    }

    /**
     * <p>
     * The trust relationship policy document that grants an entity permission
     * to assume the role.
     * </p>
     * <p>
     * In IAM, you must provide a JSON policy that has been converted to a
     * string. However, for AWS CloudFormation templates formatted in YAML, you
     * can provide the policy in JSON or YAML format. AWS CloudFormation always
     * converts a YAML policy to JSON format before submitting it to IAM.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Upon success, the response includes the same trust policy in JSON format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param assumeRolePolicyDocument <p>
     *            The trust relationship policy document that grants an entity
     *            permission to assume the role.
     *            </p>
     *            <p>
     *            In IAM, you must provide a JSON policy that has been converted
     *            to a string. However, for AWS CloudFormation templates
     *            formatted in YAML, you can provide the policy in JSON or YAML
     *            format. AWS CloudFormation always converts a YAML policy to
     *            JSON format before submitting it to IAM.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> used to validate this parameter is a string of
     *            characters consisting of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Any printable ASCII character ranging from the space character
     *            (<code>\u0020</code>) through the end of the ASCII character
     *            range
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The printable characters in the Basic Latin and Latin-1
     *            Supplement character set (through <code>\u00FF</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The special characters tab (<code>\u0009</code>), line feed (
     *            <code>\u000A</code>), and carriage return (<code>\u000D</code>
     *            )
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Upon success, the response includes the same trust policy in
     *            JSON format.
     *            </p>
     */
    public void setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
    }

    /**
     * <p>
     * The trust relationship policy document that grants an entity permission
     * to assume the role.
     * </p>
     * <p>
     * In IAM, you must provide a JSON policy that has been converted to a
     * string. However, for AWS CloudFormation templates formatted in YAML, you
     * can provide the policy in JSON or YAML format. AWS CloudFormation always
     * converts a YAML policy to JSON format before submitting it to IAM.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to
     * validate this parameter is a string of characters consisting of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character (
     * <code>\u0020</code>) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement
     * character set (through <code>\u00FF</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     * ), and carriage return (<code>\u000D</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Upon success, the response includes the same trust policy in JSON format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param assumeRolePolicyDocument <p>
     *            The trust relationship policy document that grants an entity
     *            permission to assume the role.
     *            </p>
     *            <p>
     *            In IAM, you must provide a JSON policy that has been converted
     *            to a string. However, for AWS CloudFormation templates
     *            formatted in YAML, you can provide the policy in JSON or YAML
     *            format. AWS CloudFormation always converts a YAML policy to
     *            JSON format before submitting it to IAM.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> used to validate this parameter is a string of
     *            characters consisting of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Any printable ASCII character ranging from the space character
     *            (<code>\u0020</code>) through the end of the ASCII character
     *            range
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The printable characters in the Basic Latin and Latin-1
     *            Supplement character set (through <code>\u00FF</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The special characters tab (<code>\u0009</code>), line feed (
     *            <code>\u000A</code>), and carriage return (<code>\u000D</code>
     *            )
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Upon success, the response includes the same trust policy in
     *            JSON format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRoleRequest withAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
        return this;
    }

    /**
     * <p>
     * A description of the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @return <p>
     *         A description of the role.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @param description <p>
     *            A description of the role.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @param description <p>
     *            A description of the role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRoleRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The maximum session duration (in seconds) that you want to set for the
     * specified role. If you do not specify a value for this setting, the
     * default maximum of one hour is applied. This setting can have a value
     * from 1 hour to 12 hours.
     * </p>
     * <p>
     * Anyone who assumes the role from the AWS CLI or API can use the
     * <code>DurationSeconds</code> API parameter or the
     * <code>duration-seconds</code> CLI parameter to request a longer session.
     * The <code>MaxSessionDuration</code> setting determines the maximum
     * duration that can be requested using the <code>DurationSeconds</code>
     * parameter. If users don't specify a value for the
     * <code>DurationSeconds</code> parameter, their security credentials are
     * valid for one hour by default. This applies when you use the
     * <code>AssumeRole*</code> API operations or the <code>assume-role*</code>
     * CLI operations but does not apply when you use those operations to create
     * a console URL. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html"
     * >Using IAM Roles</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3600 - 43200<br/>
     *
     * @return <p>
     *         The maximum session duration (in seconds) that you want to set
     *         for the specified role. If you do not specify a value for this
     *         setting, the default maximum of one hour is applied. This setting
     *         can have a value from 1 hour to 12 hours.
     *         </p>
     *         <p>
     *         Anyone who assumes the role from the AWS CLI or API can use the
     *         <code>DurationSeconds</code> API parameter or the
     *         <code>duration-seconds</code> CLI parameter to request a longer
     *         session. The <code>MaxSessionDuration</code> setting determines
     *         the maximum duration that can be requested using the
     *         <code>DurationSeconds</code> parameter. If users don't specify a
     *         value for the <code>DurationSeconds</code> parameter, their
     *         security credentials are valid for one hour by default. This
     *         applies when you use the <code>AssumeRole*</code> API operations
     *         or the <code>assume-role*</code> CLI operations but does not
     *         apply when you use those operations to create a console URL. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html"
     *         >Using IAM Roles</a> in the <i>IAM User Guide</i>.
     *         </p>
     */
    public Integer getMaxSessionDuration() {
        return maxSessionDuration;
    }

    /**
     * <p>
     * The maximum session duration (in seconds) that you want to set for the
     * specified role. If you do not specify a value for this setting, the
     * default maximum of one hour is applied. This setting can have a value
     * from 1 hour to 12 hours.
     * </p>
     * <p>
     * Anyone who assumes the role from the AWS CLI or API can use the
     * <code>DurationSeconds</code> API parameter or the
     * <code>duration-seconds</code> CLI parameter to request a longer session.
     * The <code>MaxSessionDuration</code> setting determines the maximum
     * duration that can be requested using the <code>DurationSeconds</code>
     * parameter. If users don't specify a value for the
     * <code>DurationSeconds</code> parameter, their security credentials are
     * valid for one hour by default. This applies when you use the
     * <code>AssumeRole*</code> API operations or the <code>assume-role*</code>
     * CLI operations but does not apply when you use those operations to create
     * a console URL. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html"
     * >Using IAM Roles</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3600 - 43200<br/>
     *
     * @param maxSessionDuration <p>
     *            The maximum session duration (in seconds) that you want to set
     *            for the specified role. If you do not specify a value for this
     *            setting, the default maximum of one hour is applied. This
     *            setting can have a value from 1 hour to 12 hours.
     *            </p>
     *            <p>
     *            Anyone who assumes the role from the AWS CLI or API can use
     *            the <code>DurationSeconds</code> API parameter or the
     *            <code>duration-seconds</code> CLI parameter to request a
     *            longer session. The <code>MaxSessionDuration</code> setting
     *            determines the maximum duration that can be requested using
     *            the <code>DurationSeconds</code> parameter. If users don't
     *            specify a value for the <code>DurationSeconds</code>
     *            parameter, their security credentials are valid for one hour
     *            by default. This applies when you use the
     *            <code>AssumeRole*</code> API operations or the
     *            <code>assume-role*</code> CLI operations but does not apply
     *            when you use those operations to create a console URL. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html"
     *            >Using IAM Roles</a> in the <i>IAM User Guide</i>.
     *            </p>
     */
    public void setMaxSessionDuration(Integer maxSessionDuration) {
        this.maxSessionDuration = maxSessionDuration;
    }

    /**
     * <p>
     * The maximum session duration (in seconds) that you want to set for the
     * specified role. If you do not specify a value for this setting, the
     * default maximum of one hour is applied. This setting can have a value
     * from 1 hour to 12 hours.
     * </p>
     * <p>
     * Anyone who assumes the role from the AWS CLI or API can use the
     * <code>DurationSeconds</code> API parameter or the
     * <code>duration-seconds</code> CLI parameter to request a longer session.
     * The <code>MaxSessionDuration</code> setting determines the maximum
     * duration that can be requested using the <code>DurationSeconds</code>
     * parameter. If users don't specify a value for the
     * <code>DurationSeconds</code> parameter, their security credentials are
     * valid for one hour by default. This applies when you use the
     * <code>AssumeRole*</code> API operations or the <code>assume-role*</code>
     * CLI operations but does not apply when you use those operations to create
     * a console URL. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html"
     * >Using IAM Roles</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3600 - 43200<br/>
     *
     * @param maxSessionDuration <p>
     *            The maximum session duration (in seconds) that you want to set
     *            for the specified role. If you do not specify a value for this
     *            setting, the default maximum of one hour is applied. This
     *            setting can have a value from 1 hour to 12 hours.
     *            </p>
     *            <p>
     *            Anyone who assumes the role from the AWS CLI or API can use
     *            the <code>DurationSeconds</code> API parameter or the
     *            <code>duration-seconds</code> CLI parameter to request a
     *            longer session. The <code>MaxSessionDuration</code> setting
     *            determines the maximum duration that can be requested using
     *            the <code>DurationSeconds</code> parameter. If users don't
     *            specify a value for the <code>DurationSeconds</code>
     *            parameter, their security credentials are valid for one hour
     *            by default. This applies when you use the
     *            <code>AssumeRole*</code> API operations or the
     *            <code>assume-role*</code> CLI operations but does not apply
     *            when you use those operations to create a console URL. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html"
     *            >Using IAM Roles</a> in the <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRoleRequest withMaxSessionDuration(Integer maxSessionDuration) {
        this.maxSessionDuration = maxSessionDuration;
        return this;
    }

    /**
     * <p>
     * The ARN of the policy that is used to set the permissions boundary for
     * the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The ARN of the policy that is used to set the permissions
     *         boundary for the role.
     *         </p>
     */
    public String getPermissionsBoundary() {
        return permissionsBoundary;
    }

    /**
     * <p>
     * The ARN of the policy that is used to set the permissions boundary for
     * the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param permissionsBoundary <p>
     *            The ARN of the policy that is used to set the permissions
     *            boundary for the role.
     *            </p>
     */
    public void setPermissionsBoundary(String permissionsBoundary) {
        this.permissionsBoundary = permissionsBoundary;
    }

    /**
     * <p>
     * The ARN of the policy that is used to set the permissions boundary for
     * the role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param permissionsBoundary <p>
     *            The ARN of the policy that is used to set the permissions
     *            boundary for the role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRoleRequest withPermissionsBoundary(String permissionsBoundary) {
        this.permissionsBoundary = permissionsBoundary;
        return this;
    }

    /**
     * <p>
     * A list of tags that you want to attach to the newly created role. Each
     * tag consists of a key name and an associated value. For more information
     * about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     * >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If any one of the tags is invalid or if you exceed the allowed number of
     * tags per role, then the entire request fails and the role is not created.
     * </p>
     * </note>
     *
     * @return <p>
     *         A list of tags that you want to attach to the newly created role.
     *         Each tag consists of a key name and an associated value. For more
     *         information about tagging, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     *         >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         If any one of the tags is invalid or if you exceed the allowed
     *         number of tags per role, then the entire request fails and the
     *         role is not created.
     *         </p>
     *         </note>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags that you want to attach to the newly created role. Each
     * tag consists of a key name and an associated value. For more information
     * about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     * >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If any one of the tags is invalid or if you exceed the allowed number of
     * tags per role, then the entire request fails and the role is not created.
     * </p>
     * </note>
     *
     * @param tags <p>
     *            A list of tags that you want to attach to the newly created
     *            role. Each tag consists of a key name and an associated value.
     *            For more information about tagging, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     *            >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            If any one of the tags is invalid or if you exceed the allowed
     *            number of tags per role, then the entire request fails and the
     *            role is not created.
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
     * A list of tags that you want to attach to the newly created role. Each
     * tag consists of a key name and an associated value. For more information
     * about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     * >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If any one of the tags is invalid or if you exceed the allowed number of
     * tags per role, then the entire request fails and the role is not created.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags that you want to attach to the newly created
     *            role. Each tag consists of a key name and an associated value.
     *            For more information about tagging, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     *            >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            If any one of the tags is invalid or if you exceed the allowed
     *            number of tags per role, then the entire request fails and the
     *            role is not created.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRoleRequest withTags(Tag... tags) {
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
     * A list of tags that you want to attach to the newly created role. Each
     * tag consists of a key name and an associated value. For more information
     * about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     * >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If any one of the tags is invalid or if you exceed the allowed number of
     * tags per role, then the entire request fails and the role is not created.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags that you want to attach to the newly created
     *            role. Each tag consists of a key name and an associated value.
     *            For more information about tagging, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     *            >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            If any one of the tags is invalid or if you exceed the allowed
     *            number of tags per role, then the entire request fails and the
     *            role is not created.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRoleRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getPath() != null)
            sb.append("Path: " + getPath() + ",");
        if (getRoleName() != null)
            sb.append("RoleName: " + getRoleName() + ",");
        if (getAssumeRolePolicyDocument() != null)
            sb.append("AssumeRolePolicyDocument: " + getAssumeRolePolicyDocument() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getMaxSessionDuration() != null)
            sb.append("MaxSessionDuration: " + getMaxSessionDuration() + ",");
        if (getPermissionsBoundary() != null)
            sb.append("PermissionsBoundary: " + getPermissionsBoundary() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssumeRolePolicyDocument() == null) ? 0 : getAssumeRolePolicyDocument()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getMaxSessionDuration() == null) ? 0 : getMaxSessionDuration().hashCode());
        hashCode = prime * hashCode
                + ((getPermissionsBoundary() == null) ? 0 : getPermissionsBoundary().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRoleRequest == false)
            return false;
        CreateRoleRequest other = (CreateRoleRequest) obj;

        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getAssumeRolePolicyDocument() == null
                ^ this.getAssumeRolePolicyDocument() == null)
            return false;
        if (other.getAssumeRolePolicyDocument() != null
                && other.getAssumeRolePolicyDocument().equals(this.getAssumeRolePolicyDocument()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getMaxSessionDuration() == null ^ this.getMaxSessionDuration() == null)
            return false;
        if (other.getMaxSessionDuration() != null
                && other.getMaxSessionDuration().equals(this.getMaxSessionDuration()) == false)
            return false;
        if (other.getPermissionsBoundary() == null ^ this.getPermissionsBoundary() == null)
            return false;
        if (other.getPermissionsBoundary() != null
                && other.getPermissionsBoundary().equals(this.getPermissionsBoundary()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
