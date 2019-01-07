/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a set of temporary security credentials (consisting of an access key
 * ID, a secret access key, and a security token) for a federated user. A
 * typical use is in a proxy application that gets temporary security
 * credentials on behalf of distributed applications inside a corporate network.
 * Because you must call the <code>GetFederationToken</code> action using the
 * long-term security credentials of an IAM user, this call is appropriate in
 * contexts where those credentials can be safely stored, usually in a
 * server-based application. For a comparison of <code>GetFederationToken</code>
 * with the other APIs that produce temporary credentials, see <a href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html"
 * >Requesting Temporary Security Credentials</a> and <a href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
 * >Comparing the AWS STS APIs</a> in the <i>IAM User Guide</i>.
 * </p>
 * <note>
 * <p>
 * If you are creating a mobile-based or browser-based app that can authenticate
 * users using a web identity provider like Login with Amazon, Facebook, Google,
 * or an OpenID Connect-compatible identity provider, we recommend that you use
 * <a href="http://aws.amazon.com/cognito/">Amazon Cognito</a> or
 * <code>AssumeRoleWithWebIdentity</code>. For more information, see <a href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_assumerolewithwebidentity"
 * >Federation Through a Web-based Identity Provider</a>.
 * </p>
 * </note>
 * <p>
 * The <code>GetFederationToken</code> action must be called by using the
 * long-term AWS security credentials of an IAM user. You can also call
 * <code>GetFederationToken</code> using the security credentials of an AWS root
 * account, but we do not recommended it. Instead, we recommend that you create
 * an IAM user for the purpose of the proxy application and then attach a policy
 * to the IAM user that limits federated users to only the actions and resources
 * that they need access to. For more information, see <a
 * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html"
 * >IAM Best Practices</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * The temporary security credentials that are obtained by using the long-term
 * credentials of an IAM user are valid for the specified duration, from 900
 * seconds (15 minutes) up to a maximium of 129600 seconds (36 hours). The
 * default is 43200 seconds (12 hours). Temporary credentials that are obtained
 * by using AWS root account credentials have a maximum duration of 3600 seconds
 * (1 hour).
 * </p>
 * <p>
 * The temporary security credentials created by <code>GetFederationToken</code>
 * can be used to make API calls to any AWS service with the following
 * exceptions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You cannot use these credentials to call any IAM APIs.
 * </p>
 * </li>
 * <li>
 * <p>
 * You cannot call any STS APIs except <code>GetCallerIdentity</code>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Permissions</b>
 * </p>
 * <p>
 * The permissions for the temporary security credentials returned by
 * <code>GetFederationToken</code> are determined by a combination of the
 * following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The policy or policies that are attached to the IAM user whose credentials
 * are used to call <code>GetFederationToken</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The policy that is passed as a parameter in the call.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The passed policy is attached to the temporary security credentials that
 * result from the <code>GetFederationToken</code> API call--that is, to the
 * <i>federated user</i>. When the federated user makes an AWS request, AWS
 * evaluates the policy attached to the federated user in combination with the
 * policy or policies attached to the IAM user whose credentials were used to
 * call <code>GetFederationToken</code>. AWS allows the federated user's request
 * only when both the federated user <i> <b>and</b> </i> the IAM user are
 * explicitly allowed to perform the requested action. The passed policy cannot
 * grant more permissions than those that are defined in the IAM user policy.
 * </p>
 * <p>
 * A typical use case is that the permissions of the IAM user whose credentials
 * are used to call <code>GetFederationToken</code> are designed to allow access
 * to all the actions and resources that any federated user will need. Then, for
 * individual users, you pass a policy to the operation that scopes down the
 * permissions to a level that's appropriate to that individual user, using a
 * policy that allows only a subset of permissions that are granted to the IAM
 * user.
 * </p>
 * <p>
 * If you do not pass a policy, the resulting temporary security credentials
 * have no effective permissions. The only exception is when the temporary
 * security credentials are used to access a resource that has a resource-based
 * policy that specifically allows the federated user to access the resource.
 * </p>
 * <p>
 * For more information about how permissions work, see <a href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_getfederationtoken.html"
 * >Permissions for GetFederationToken</a>. For information about using
 * <code>GetFederationToken</code> to create temporary security credentials, see
 * <a href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_getfederationtoken"
 * >GetFederationToken—Federation Through a Custom Identity Broker</a>.
 * </p>
 */
public class GetFederationTokenRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the federated user. The name is used as an identifier for the
     * temporary security credentials (such as <code>Bob</code>). For example,
     * you can reference the federated user name in a resource-based policy,
     * such as in an Amazon S3 bucket policy.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 32<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String name;

    /**
     * <p>
     * An IAM policy in JSON format that is passed with the
     * <code>GetFederationToken</code> call and evaluated along with the policy
     * or policies that are attached to the IAM user whose credentials are used
     * to call <code>GetFederationToken</code>. The passed policy is used to
     * scope down the permissions that are available to the IAM user, by
     * allowing only a subset of the permissions that are granted to the IAM
     * user. The passed policy cannot grant more permissions than those granted
     * to the IAM user. The final permissions for the federated user are the
     * most restrictive set based on the intersection of the passed policy and
     * the IAM user policy.
     * </p>
     * <p>
     * If you do not pass a policy, the resulting temporary security credentials
     * have no effective permissions. The only exception is when the temporary
     * security credentials are used to access a resource that has a
     * resource-based policy that specifically allows the federated user to
     * access the resource.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a
     * string of characters up to 2048 characters in length. The characters can
     * be any ASCII character from the space character to the end of the valid
     * character list ( -\u00FF). It can also include the tab ( ), linefeed ( ),
     * and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * The policy plain text must be 2048 bytes or shorter. However, an internal
     * conversion compresses it into a packed binary format with a separate
     * limit. The PackedPolicySize response element indicates by percentage how
     * close to the upper size limit the policy is, with 100% equaling the
     * maximum allowed size.
     * </p>
     * </note>
     * <p>
     * For more information about how permissions work, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_getfederationtoken.html"
     * >Permissions for GetFederationToken</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String policy;

    /**
     * <p>
     * The duration, in seconds, that the session should last. Acceptable
     * durations for federation sessions range from 900 seconds (15 minutes) to
     * 129600 seconds (36 hours), with 43200 seconds (12 hours) as the default.
     * Sessions obtained using AWS account (root) credentials are restricted to
     * a maximum of 3600 seconds (one hour). If the specified duration is longer
     * than one hour, the session obtained by using AWS account (root)
     * credentials defaults to one hour.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     */
    private Integer durationSeconds;

    /**
     * Default constructor for GetFederationTokenRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     */
    public GetFederationTokenRequest() {
    }

    /**
     * Constructs a new GetFederationTokenRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param name <p>
     *            The name of the federated user. The name is used as an
     *            identifier for the temporary security credentials (such as
     *            <code>Bob</code>). For example, you can reference the
     *            federated user name in a resource-based policy, such as in an
     *            Amazon S3 bucket policy.
     *            </p>
     *            <p>
     *            The regex used to validate this parameter is a string of
     *            characters consisting of upper- and lower-case alphanumeric
     *            characters with no spaces. You can also include underscores or
     *            any of the following characters: =,.@-
     *            </p>
     */
    public GetFederationTokenRequest(String name) {
        setName(name);
    }

    /**
     * <p>
     * The name of the federated user. The name is used as an identifier for the
     * temporary security credentials (such as <code>Bob</code>). For example,
     * you can reference the federated user name in a resource-based policy,
     * such as in an Amazon S3 bucket policy.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 32<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return <p>
     *         The name of the federated user. The name is used as an identifier
     *         for the temporary security credentials (such as <code>Bob</code>
     *         ). For example, you can reference the federated user name in a
     *         resource-based policy, such as in an Amazon S3 bucket policy.
     *         </p>
     *         <p>
     *         The regex used to validate this parameter is a string of
     *         characters consisting of upper- and lower-case alphanumeric
     *         characters with no spaces. You can also include underscores or
     *         any of the following characters: =,.@-
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the federated user. The name is used as an identifier for the
     * temporary security credentials (such as <code>Bob</code>). For example,
     * you can reference the federated user name in a resource-based policy,
     * such as in an Amazon S3 bucket policy.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 32<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param name <p>
     *            The name of the federated user. The name is used as an
     *            identifier for the temporary security credentials (such as
     *            <code>Bob</code>). For example, you can reference the
     *            federated user name in a resource-based policy, such as in an
     *            Amazon S3 bucket policy.
     *            </p>
     *            <p>
     *            The regex used to validate this parameter is a string of
     *            characters consisting of upper- and lower-case alphanumeric
     *            characters with no spaces. You can also include underscores or
     *            any of the following characters: =,.@-
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the federated user. The name is used as an identifier for the
     * temporary security credentials (such as <code>Bob</code>). For example,
     * you can reference the federated user name in a resource-based policy,
     * such as in an Amazon S3 bucket policy.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@-
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 32<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param name <p>
     *            The name of the federated user. The name is used as an
     *            identifier for the temporary security credentials (such as
     *            <code>Bob</code>). For example, you can reference the
     *            federated user name in a resource-based policy, such as in an
     *            Amazon S3 bucket policy.
     *            </p>
     *            <p>
     *            The regex used to validate this parameter is a string of
     *            characters consisting of upper- and lower-case alphanumeric
     *            characters with no spaces. You can also include underscores or
     *            any of the following characters: =,.@-
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFederationTokenRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * An IAM policy in JSON format that is passed with the
     * <code>GetFederationToken</code> call and evaluated along with the policy
     * or policies that are attached to the IAM user whose credentials are used
     * to call <code>GetFederationToken</code>. The passed policy is used to
     * scope down the permissions that are available to the IAM user, by
     * allowing only a subset of the permissions that are granted to the IAM
     * user. The passed policy cannot grant more permissions than those granted
     * to the IAM user. The final permissions for the federated user are the
     * most restrictive set based on the intersection of the passed policy and
     * the IAM user policy.
     * </p>
     * <p>
     * If you do not pass a policy, the resulting temporary security credentials
     * have no effective permissions. The only exception is when the temporary
     * security credentials are used to access a resource that has a
     * resource-based policy that specifically allows the federated user to
     * access the resource.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a
     * string of characters up to 2048 characters in length. The characters can
     * be any ASCII character from the space character to the end of the valid
     * character list ( -\u00FF). It can also include the tab ( ), linefeed ( ),
     * and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * The policy plain text must be 2048 bytes or shorter. However, an internal
     * conversion compresses it into a packed binary format with a separate
     * limit. The PackedPolicySize response element indicates by percentage how
     * close to the upper size limit the policy is, with 100% equaling the
     * maximum allowed size.
     * </p>
     * </note>
     * <p>
     * For more information about how permissions work, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_getfederationtoken.html"
     * >Permissions for GetFederationToken</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         An IAM policy in JSON format that is passed with the
     *         <code>GetFederationToken</code> call and evaluated along with the
     *         policy or policies that are attached to the IAM user whose
     *         credentials are used to call <code>GetFederationToken</code>. The
     *         passed policy is used to scope down the permissions that are
     *         available to the IAM user, by allowing only a subset of the
     *         permissions that are granted to the IAM user. The passed policy
     *         cannot grant more permissions than those granted to the IAM user.
     *         The final permissions for the federated user are the most
     *         restrictive set based on the intersection of the passed policy
     *         and the IAM user policy.
     *         </p>
     *         <p>
     *         If you do not pass a policy, the resulting temporary security
     *         credentials have no effective permissions. The only exception is
     *         when the temporary security credentials are used to access a
     *         resource that has a resource-based policy that specifically
     *         allows the federated user to access the resource.
     *         </p>
     *         <p>
     *         The format for this parameter, as described by its regex pattern,
     *         is a string of characters up to 2048 characters in length. The
     *         characters can be any ASCII character from the space character to
     *         the end of the valid character list ( -\u00FF). It can also
     *         include the tab ( ), linefeed ( ), and carriage return ( )
     *         characters.
     *         </p>
     *         <note>
     *         <p>
     *         The policy plain text must be 2048 bytes or shorter. However, an
     *         internal conversion compresses it into a packed binary format
     *         with a separate limit. The PackedPolicySize response element
     *         indicates by percentage how close to the upper size limit the
     *         policy is, with 100% equaling the maximum allowed size.
     *         </p>
     *         </note>
     *         <p>
     *         For more information about how permissions work, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_getfederationtoken.html"
     *         >Permissions for GetFederationToken</a>.
     *         </p>
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * <p>
     * An IAM policy in JSON format that is passed with the
     * <code>GetFederationToken</code> call and evaluated along with the policy
     * or policies that are attached to the IAM user whose credentials are used
     * to call <code>GetFederationToken</code>. The passed policy is used to
     * scope down the permissions that are available to the IAM user, by
     * allowing only a subset of the permissions that are granted to the IAM
     * user. The passed policy cannot grant more permissions than those granted
     * to the IAM user. The final permissions for the federated user are the
     * most restrictive set based on the intersection of the passed policy and
     * the IAM user policy.
     * </p>
     * <p>
     * If you do not pass a policy, the resulting temporary security credentials
     * have no effective permissions. The only exception is when the temporary
     * security credentials are used to access a resource that has a
     * resource-based policy that specifically allows the federated user to
     * access the resource.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a
     * string of characters up to 2048 characters in length. The characters can
     * be any ASCII character from the space character to the end of the valid
     * character list ( -\u00FF). It can also include the tab ( ), linefeed ( ),
     * and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * The policy plain text must be 2048 bytes or shorter. However, an internal
     * conversion compresses it into a packed binary format with a separate
     * limit. The PackedPolicySize response element indicates by percentage how
     * close to the upper size limit the policy is, with 100% equaling the
     * maximum allowed size.
     * </p>
     * </note>
     * <p>
     * For more information about how permissions work, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_getfederationtoken.html"
     * >Permissions for GetFederationToken</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param policy <p>
     *            An IAM policy in JSON format that is passed with the
     *            <code>GetFederationToken</code> call and evaluated along with
     *            the policy or policies that are attached to the IAM user whose
     *            credentials are used to call <code>GetFederationToken</code>.
     *            The passed policy is used to scope down the permissions that
     *            are available to the IAM user, by allowing only a subset of
     *            the permissions that are granted to the IAM user. The passed
     *            policy cannot grant more permissions than those granted to the
     *            IAM user. The final permissions for the federated user are the
     *            most restrictive set based on the intersection of the passed
     *            policy and the IAM user policy.
     *            </p>
     *            <p>
     *            If you do not pass a policy, the resulting temporary security
     *            credentials have no effective permissions. The only exception
     *            is when the temporary security credentials are used to access
     *            a resource that has a resource-based policy that specifically
     *            allows the federated user to access the resource.
     *            </p>
     *            <p>
     *            The format for this parameter, as described by its regex
     *            pattern, is a string of characters up to 2048 characters in
     *            length. The characters can be any ASCII character from the
     *            space character to the end of the valid character list (
     *            -\u00FF). It can also include the tab ( ), linefeed ( ), and
     *            carriage return ( ) characters.
     *            </p>
     *            <note>
     *            <p>
     *            The policy plain text must be 2048 bytes or shorter. However,
     *            an internal conversion compresses it into a packed binary
     *            format with a separate limit. The PackedPolicySize response
     *            element indicates by percentage how close to the upper size
     *            limit the policy is, with 100% equaling the maximum allowed
     *            size.
     *            </p>
     *            </note>
     *            <p>
     *            For more information about how permissions work, see <a href=
     *            "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_getfederationtoken.html"
     *            >Permissions for GetFederationToken</a>.
     *            </p>
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * An IAM policy in JSON format that is passed with the
     * <code>GetFederationToken</code> call and evaluated along with the policy
     * or policies that are attached to the IAM user whose credentials are used
     * to call <code>GetFederationToken</code>. The passed policy is used to
     * scope down the permissions that are available to the IAM user, by
     * allowing only a subset of the permissions that are granted to the IAM
     * user. The passed policy cannot grant more permissions than those granted
     * to the IAM user. The final permissions for the federated user are the
     * most restrictive set based on the intersection of the passed policy and
     * the IAM user policy.
     * </p>
     * <p>
     * If you do not pass a policy, the resulting temporary security credentials
     * have no effective permissions. The only exception is when the temporary
     * security credentials are used to access a resource that has a
     * resource-based policy that specifically allows the federated user to
     * access the resource.
     * </p>
     * <p>
     * The format for this parameter, as described by its regex pattern, is a
     * string of characters up to 2048 characters in length. The characters can
     * be any ASCII character from the space character to the end of the valid
     * character list ( -\u00FF). It can also include the tab ( ), linefeed ( ),
     * and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * The policy plain text must be 2048 bytes or shorter. However, an internal
     * conversion compresses it into a packed binary format with a separate
     * limit. The PackedPolicySize response element indicates by percentage how
     * close to the upper size limit the policy is, with 100% equaling the
     * maximum allowed size.
     * </p>
     * </note>
     * <p>
     * For more information about how permissions work, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_getfederationtoken.html"
     * >Permissions for GetFederationToken</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param policy <p>
     *            An IAM policy in JSON format that is passed with the
     *            <code>GetFederationToken</code> call and evaluated along with
     *            the policy or policies that are attached to the IAM user whose
     *            credentials are used to call <code>GetFederationToken</code>.
     *            The passed policy is used to scope down the permissions that
     *            are available to the IAM user, by allowing only a subset of
     *            the permissions that are granted to the IAM user. The passed
     *            policy cannot grant more permissions than those granted to the
     *            IAM user. The final permissions for the federated user are the
     *            most restrictive set based on the intersection of the passed
     *            policy and the IAM user policy.
     *            </p>
     *            <p>
     *            If you do not pass a policy, the resulting temporary security
     *            credentials have no effective permissions. The only exception
     *            is when the temporary security credentials are used to access
     *            a resource that has a resource-based policy that specifically
     *            allows the federated user to access the resource.
     *            </p>
     *            <p>
     *            The format for this parameter, as described by its regex
     *            pattern, is a string of characters up to 2048 characters in
     *            length. The characters can be any ASCII character from the
     *            space character to the end of the valid character list (
     *            -\u00FF). It can also include the tab ( ), linefeed ( ), and
     *            carriage return ( ) characters.
     *            </p>
     *            <note>
     *            <p>
     *            The policy plain text must be 2048 bytes or shorter. However,
     *            an internal conversion compresses it into a packed binary
     *            format with a separate limit. The PackedPolicySize response
     *            element indicates by percentage how close to the upper size
     *            limit the policy is, with 100% equaling the maximum allowed
     *            size.
     *            </p>
     *            </note>
     *            <p>
     *            For more information about how permissions work, see <a href=
     *            "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_getfederationtoken.html"
     *            >Permissions for GetFederationToken</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFederationTokenRequest withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * <p>
     * The duration, in seconds, that the session should last. Acceptable
     * durations for federation sessions range from 900 seconds (15 minutes) to
     * 129600 seconds (36 hours), with 43200 seconds (12 hours) as the default.
     * Sessions obtained using AWS account (root) credentials are restricted to
     * a maximum of 3600 seconds (one hour). If the specified duration is longer
     * than one hour, the session obtained by using AWS account (root)
     * credentials defaults to one hour.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     *
     * @return <p>
     *         The duration, in seconds, that the session should last.
     *         Acceptable durations for federation sessions range from 900
     *         seconds (15 minutes) to 129600 seconds (36 hours), with 43200
     *         seconds (12 hours) as the default. Sessions obtained using AWS
     *         account (root) credentials are restricted to a maximum of 3600
     *         seconds (one hour). If the specified duration is longer than one
     *         hour, the session obtained by using AWS account (root)
     *         credentials defaults to one hour.
     *         </p>
     */
    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, that the session should last. Acceptable
     * durations for federation sessions range from 900 seconds (15 minutes) to
     * 129600 seconds (36 hours), with 43200 seconds (12 hours) as the default.
     * Sessions obtained using AWS account (root) credentials are restricted to
     * a maximum of 3600 seconds (one hour). If the specified duration is longer
     * than one hour, the session obtained by using AWS account (root)
     * credentials defaults to one hour.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     *
     * @param durationSeconds <p>
     *            The duration, in seconds, that the session should last.
     *            Acceptable durations for federation sessions range from 900
     *            seconds (15 minutes) to 129600 seconds (36 hours), with 43200
     *            seconds (12 hours) as the default. Sessions obtained using AWS
     *            account (root) credentials are restricted to a maximum of 3600
     *            seconds (one hour). If the specified duration is longer than
     *            one hour, the session obtained by using AWS account (root)
     *            credentials defaults to one hour.
     *            </p>
     */
    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, that the session should last. Acceptable
     * durations for federation sessions range from 900 seconds (15 minutes) to
     * 129600 seconds (36 hours), with 43200 seconds (12 hours) as the default.
     * Sessions obtained using AWS account (root) credentials are restricted to
     * a maximum of 3600 seconds (one hour). If the specified duration is longer
     * than one hour, the session obtained by using AWS account (root)
     * credentials defaults to one hour.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     *
     * @param durationSeconds <p>
     *            The duration, in seconds, that the session should last.
     *            Acceptable durations for federation sessions range from 900
     *            seconds (15 minutes) to 129600 seconds (36 hours), with 43200
     *            seconds (12 hours) as the default. Sessions obtained using AWS
     *            account (root) credentials are restricted to a maximum of 3600
     *            seconds (one hour). If the specified duration is longer than
     *            one hour, the session obtained by using AWS account (root)
     *            credentials defaults to one hour.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFederationTokenRequest withDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
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
        if (getPolicy() != null)
            sb.append("Policy: " + getPolicy() + ",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: " + getDurationSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode
                + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFederationTokenRequest == false)
            return false;
        GetFederationTokenRequest other = (GetFederationTokenRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null
                && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        return true;
    }
}
