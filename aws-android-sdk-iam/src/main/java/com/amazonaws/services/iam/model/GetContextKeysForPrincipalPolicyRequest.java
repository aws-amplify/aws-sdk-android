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
 * Gets a list of all of the context keys referenced in all the IAM policies
 * that are attached to the specified IAM entity. The entity can be an IAM user,
 * group, or role. If you specify a user, then the request also includes all of
 * the policies attached to groups that the user is a member of.
 * </p>
 * <p>
 * You can optionally include a list of one or more additional policies,
 * specified as strings. If you want to include <i>only</i> a list of policies
 * by string, use <a>GetContextKeysForCustomPolicy</a> instead.
 * </p>
 * <p>
 * <b>Note:</b> This API discloses information about the permissions granted to
 * other users. If you do not want users to see other user's permissions, then
 * consider allowing them to use <a>GetContextKeysForCustomPolicy</a> instead.
 * </p>
 * <p>
 * Context keys are variables maintained by AWS and its services that provide
 * details about the context of an API query request. Context keys can be
 * evaluated by testing against a value in an IAM policy. Use
 * <a>GetContextKeysForPrincipalPolicy</a> to understand what key names and
 * values you must supply when you call <a>SimulatePrincipalPolicy</a>.
 * </p>
 */
public class GetContextKeysForPrincipalPolicyRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ARN of a user, group, or role whose policies contain the context keys
     * that you want listed. If you specify a user, the list includes context
     * keys that are found in all policies that are attached to the user. The
     * list also includes all groups that the user is a member of. If you pick a
     * group or a role, then it includes only those context keys that are found
     * in policies attached to that entity. Note that all parameters are shown
     * in unencoded form here for clarity, but must be URL encoded to be
     * included as a part of a real HTML request.
     * </p>
     * <p>
     * For more information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String policySourceArn;

    /**
     * <p>
     * An optional list of additional policies for which you want the list of
     * context keys that are referenced.
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
     */
    private java.util.List<String> policyInputList;

    /**
     * <p>
     * The ARN of a user, group, or role whose policies contain the context keys
     * that you want listed. If you specify a user, the list includes context
     * keys that are found in all policies that are attached to the user. The
     * list also includes all groups that the user is a member of. If you pick a
     * group or a role, then it includes only those context keys that are found
     * in policies attached to that entity. Note that all parameters are shown
     * in unencoded form here for clarity, but must be URL encoded to be
     * included as a part of a real HTML request.
     * </p>
     * <p>
     * For more information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The ARN of a user, group, or role whose policies contain the
     *         context keys that you want listed. If you specify a user, the
     *         list includes context keys that are found in all policies that
     *         are attached to the user. The list also includes all groups that
     *         the user is a member of. If you pick a group or a role, then it
     *         includes only those context keys that are found in policies
     *         attached to that entity. Note that all parameters are shown in
     *         unencoded form here for clarity, but must be URL encoded to be
     *         included as a part of a real HTML request.
     *         </p>
     *         <p>
     *         For more information about ARNs, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in
     *         the <i>AWS General Reference</i>.
     *         </p>
     */
    public String getPolicySourceArn() {
        return policySourceArn;
    }

    /**
     * <p>
     * The ARN of a user, group, or role whose policies contain the context keys
     * that you want listed. If you specify a user, the list includes context
     * keys that are found in all policies that are attached to the user. The
     * list also includes all groups that the user is a member of. If you pick a
     * group or a role, then it includes only those context keys that are found
     * in policies attached to that entity. Note that all parameters are shown
     * in unencoded form here for clarity, but must be URL encoded to be
     * included as a part of a real HTML request.
     * </p>
     * <p>
     * For more information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param policySourceArn <p>
     *            The ARN of a user, group, or role whose policies contain the
     *            context keys that you want listed. If you specify a user, the
     *            list includes context keys that are found in all policies that
     *            are attached to the user. The list also includes all groups
     *            that the user is a member of. If you pick a group or a role,
     *            then it includes only those context keys that are found in
     *            policies attached to that entity. Note that all parameters are
     *            shown in unencoded form here for clarity, but must be URL
     *            encoded to be included as a part of a real HTML request.
     *            </p>
     *            <p>
     *            For more information about ARNs, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>
     *            in the <i>AWS General Reference</i>.
     *            </p>
     */
    public void setPolicySourceArn(String policySourceArn) {
        this.policySourceArn = policySourceArn;
    }

    /**
     * <p>
     * The ARN of a user, group, or role whose policies contain the context keys
     * that you want listed. If you specify a user, the list includes context
     * keys that are found in all policies that are attached to the user. The
     * list also includes all groups that the user is a member of. If you pick a
     * group or a role, then it includes only those context keys that are found
     * in policies attached to that entity. Note that all parameters are shown
     * in unencoded form here for clarity, but must be URL encoded to be
     * included as a part of a real HTML request.
     * </p>
     * <p>
     * For more information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param policySourceArn <p>
     *            The ARN of a user, group, or role whose policies contain the
     *            context keys that you want listed. If you specify a user, the
     *            list includes context keys that are found in all policies that
     *            are attached to the user. The list also includes all groups
     *            that the user is a member of. If you pick a group or a role,
     *            then it includes only those context keys that are found in
     *            policies attached to that entity. Note that all parameters are
     *            shown in unencoded form here for clarity, but must be URL
     *            encoded to be included as a part of a real HTML request.
     *            </p>
     *            <p>
     *            For more information about ARNs, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>
     *            in the <i>AWS General Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetContextKeysForPrincipalPolicyRequest withPolicySourceArn(String policySourceArn) {
        this.policySourceArn = policySourceArn;
        return this;
    }

    /**
     * <p>
     * An optional list of additional policies for which you want the list of
     * context keys that are referenced.
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
     *
     * @return <p>
     *         An optional list of additional policies for which you want the
     *         list of context keys that are referenced.
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
     */
    public java.util.List<String> getPolicyInputList() {
        return policyInputList;
    }

    /**
     * <p>
     * An optional list of additional policies for which you want the list of
     * context keys that are referenced.
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
     *
     * @param policyInputList <p>
     *            An optional list of additional policies for which you want the
     *            list of context keys that are referenced.
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
     */
    public void setPolicyInputList(java.util.Collection<String> policyInputList) {
        if (policyInputList == null) {
            this.policyInputList = null;
            return;
        }

        this.policyInputList = new java.util.ArrayList<String>(policyInputList);
    }

    /**
     * <p>
     * An optional list of additional policies for which you want the list of
     * context keys that are referenced.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyInputList <p>
     *            An optional list of additional policies for which you want the
     *            list of context keys that are referenced.
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetContextKeysForPrincipalPolicyRequest withPolicyInputList(String... policyInputList) {
        if (getPolicyInputList() == null) {
            this.policyInputList = new java.util.ArrayList<String>(policyInputList.length);
        }
        for (String value : policyInputList) {
            this.policyInputList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An optional list of additional policies for which you want the list of
     * context keys that are referenced.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyInputList <p>
     *            An optional list of additional policies for which you want the
     *            list of context keys that are referenced.
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetContextKeysForPrincipalPolicyRequest withPolicyInputList(
            java.util.Collection<String> policyInputList) {
        setPolicyInputList(policyInputList);
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
        if (getPolicySourceArn() != null)
            sb.append("PolicySourceArn: " + getPolicySourceArn() + ",");
        if (getPolicyInputList() != null)
            sb.append("PolicyInputList: " + getPolicyInputList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPolicySourceArn() == null) ? 0 : getPolicySourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyInputList() == null) ? 0 : getPolicyInputList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContextKeysForPrincipalPolicyRequest == false)
            return false;
        GetContextKeysForPrincipalPolicyRequest other = (GetContextKeysForPrincipalPolicyRequest) obj;

        if (other.getPolicySourceArn() == null ^ this.getPolicySourceArn() == null)
            return false;
        if (other.getPolicySourceArn() != null
                && other.getPolicySourceArn().equals(this.getPolicySourceArn()) == false)
            return false;
        if (other.getPolicyInputList() == null ^ this.getPolicyInputList() == null)
            return false;
        if (other.getPolicyInputList() != null
                && other.getPolicyInputList().equals(this.getPolicyInputList()) == false)
            return false;
        return true;
    }
}
