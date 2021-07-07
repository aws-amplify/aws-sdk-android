/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * You must call the <code>GetFederationToken</code> operation using the
 * long-term security credentials of an IAM user. As a result, this call is
 * appropriate in contexts where those credentials can be safely stored, usually
 * in a server-based application. For a comparison of
 * <code>GetFederationToken</code> with the other API operations that produce
 * temporary credentials, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html"
 * >Requesting Temporary Security Credentials</a> and <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
 * >Comparing the STS API operations</a> in the <i>IAM User Guide</i>.
 * </p>
 * <note>
 * <p>
 * You can create a mobile-based or browser-based app that can authenticate
 * users using a web identity provider like Login with Amazon, Facebook, Google,
 * or an OpenID Connect-compatible identity provider. In this case, we recommend
 * that you use <a href="http://aws.amazon.com/cognito/">Amazon Cognito</a> or
 * <code>AssumeRoleWithWebIdentity</code>. For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_assumerolewithwebidentity"
 * >Federation Through a Web-based Identity Provider</a> in the <i>IAM User
 * Guide</i>.
 * </p>
 * </note>
 * <p>
 * You can also call <code>GetFederationToken</code> using the security
 * credentials of an Amazon Web Services account root user, but we do not
 * recommend it. Instead, we recommend that you create an IAM user for the
 * purpose of the proxy application. Then attach a policy to the IAM user that
 * limits federated users to only the actions and resources that they need to
 * access. For more information, see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html"
 * >IAM Best Practices</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * <b>Session duration</b>
 * </p>
 * <p>
 * The temporary credentials are valid for the specified duration, from 900
 * seconds (15 minutes) up to a maximum of 129,600 seconds (36 hours). The
 * default session duration is 43,200 seconds (12 hours). Temporary credentials
 * that are obtained by using Amazon Web Services account root user credentials
 * have a maximum duration of 3,600 seconds (1 hour).
 * </p>
 * <p>
 * <b>Permissions</b>
 * </p>
 * <p>
 * You can use the temporary credentials created by
 * <code>GetFederationToken</code> in any Amazon Web Services service except the
 * following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You cannot call any IAM operations using the CLI or the Amazon Web Services
 * API.
 * </p>
 * </li>
 * <li>
 * <p>
 * You cannot call any STS operations except <code>GetCallerIdentity</code>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You must pass an inline or managed <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
 * >session policy</a> to this operation. You can pass a single JSON policy
 * document to use as an inline session policy. You can also specify up to 10
 * managed policies to use as managed session policies. The plaintext that you
 * use for both inline and managed session policies can't exceed 2,048
 * characters.
 * </p>
 * <p>
 * Though the session policy parameters are optional, if you do not pass a
 * policy, then the resulting federated user session has no permissions. When
 * you pass session policies, the session permissions are the intersection of
 * the IAM user policies and the session policies that you pass. This gives you
 * a way to further restrict the permissions for a federated user. You cannot
 * use session policies to grant more permissions than those that are defined in
 * the permissions policy of the IAM user. For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
 * >Session Policies</a> in the <i>IAM User Guide</i>. For information about
 * using <code>GetFederationToken</code> to create temporary security
 * credentials, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_getfederationtoken"
 * >GetFederationToken—Federation Through a Custom Identity Broker</a>.
 * </p>
 * <p>
 * You can use the credentials to access a resource that has a resource-based
 * policy. If that policy specifically references the federated user session in
 * the <code>Principal</code> element of the policy, the session has the
 * permissions allowed by the policy. These permissions are granted in addition
 * to the permissions granted by the session policies.
 * </p>
 * <p>
 * <b>Tags</b>
 * </p>
 * <p>
 * (Optional) You can pass tag key-value pairs to your session. These are called
 * session tags. For more information about session tags, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html"
 * >Passing Session Tags in STS</a> in the <i>IAM User Guide</i>.
 * </p>
 * <note>
 * <p>
 * You can create a mobile-based or browser-based app that can authenticate
 * users using a web identity provider like Login with Amazon, Facebook, Google,
 * or an OpenID Connect-compatible identity provider. In this case, we recommend
 * that you use <a href="http://aws.amazon.com/cognito/">Amazon Cognito</a> or
 * <code>AssumeRoleWithWebIdentity</code>. For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_assumerolewithwebidentity"
 * >Federation Through a Web-based Identity Provider</a> in the <i>IAM User
 * Guide</i>.
 * </p>
 * </note>
 * <p>
 * You can also call <code>GetFederationToken</code> using the security
 * credentials of an Amazon Web Services account root user, but we do not
 * recommend it. Instead, we recommend that you create an IAM user for the
 * purpose of the proxy application. Then attach a policy to the IAM user that
 * limits federated users to only the actions and resources that they need to
 * access. For more information, see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html"
 * >IAM Best Practices</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * <b>Session duration</b>
 * </p>
 * <p>
 * The temporary credentials are valid for the specified duration, from 900
 * seconds (15 minutes) up to a maximum of 129,600 seconds (36 hours). The
 * default session duration is 43,200 seconds (12 hours). Temporary credentials
 * that are obtained by using Amazon Web Services account root user credentials
 * have a maximum duration of 3,600 seconds (1 hour).
 * </p>
 * <p>
 * <b>Permissions</b>
 * </p>
 * <p>
 * You can use the temporary credentials created by
 * <code>GetFederationToken</code> in any Amazon Web Services service except the
 * following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You cannot call any IAM operations using the CLI or the Amazon Web Services
 * API.
 * </p>
 * </li>
 * <li>
 * <p>
 * You cannot call any STS operations except <code>GetCallerIdentity</code>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You must pass an inline or managed <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
 * >session policy</a> to this operation. You can pass a single JSON policy
 * document to use as an inline session policy. You can also specify up to 10
 * managed policies to use as managed session policies. The plain text that you
 * use for both inline and managed session policies can't exceed 2,048
 * characters.
 * </p>
 * <p>
 * Though the session policy parameters are optional, if you do not pass a
 * policy, then the resulting federated user session has no permissions. When
 * you pass session policies, the session permissions are the intersection of
 * the IAM user policies and the session policies that you pass. This gives you
 * a way to further restrict the permissions for a federated user. You cannot
 * use session policies to grant more permissions than those that are defined in
 * the permissions policy of the IAM user. For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
 * >Session Policies</a> in the <i>IAM User Guide</i>. For information about
 * using <code>GetFederationToken</code> to create temporary security
 * credentials, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_getfederationtoken"
 * >GetFederationToken—Federation Through a Custom Identity Broker</a>.
 * </p>
 * <p>
 * You can use the credentials to access a resource that has a resource-based
 * policy. If that policy specifically references the federated user session in
 * the <code>Principal</code> element of the policy, the session has the
 * permissions allowed by the policy. These permissions are granted in addition
 * to the permissions granted by the session policies.
 * </p>
 * <p>
 * <b>Tags</b>
 * </p>
 * <p>
 * (Optional) You can pass tag key-value pairs to your session. These are called
 * session tags. For more information about session tags, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html"
 * >Passing Session Tags in STS</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * An administrator must grant you the permissions necessary to pass session
 * tags. The administrator can also create granular permissions to allow you to
 * pass only specific session tags. For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_attribute-based-access-control.html"
 * >Tutorial: Using Tags for Attribute-Based Access Control</a> in the <i>IAM
 * User Guide</i>.
 * </p>
 * <p>
 * Tag key–value pairs are not case sensitive, but case is preserved. This means
 * that you cannot have separate <code>Department</code> and
 * <code>department</code> tag keys. Assume that the user that you are
 * federating has the <code>Department</code>=<code>Marketing</code> tag and you
 * pass the <code>department</code>=<code>engineering</code> session tag.
 * <code>Department</code> and <code>department</code> are not saved as separate
 * tags, and the session tag passed in the request takes precedence over the
 * user tag.
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
     * An IAM policy in JSON format that you want to use as an inline session
     * policy.
     * </p>
     * <p>
     * You must pass an inline or managed <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >session policy</a> to this operation. You can pass a single JSON policy
     * document to use as an inline session policy. You can also specify up to
     * 10 managed policies to use as managed session policies.
     * </p>
     * <p>
     * This parameter is optional. However, if you do not pass any session
     * policies, then the resulting federated user session has no permissions.
     * </p>
     * <p>
     * When you pass session policies, the session permissions are the
     * intersection of the IAM user policies and the session policies that you
     * pass. This gives you a way to further restrict the permissions for a
     * federated user. You cannot use session policies to grant more permissions
     * than those that are defined in the permissions policy of the IAM user.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The resulting credentials can be used to access a resource that has a
     * resource-based policy. If that policy specifically references the
     * federated user session in the <code>Principal</code> element of the
     * policy, the session has the permissions allowed by the policy. These
     * permissions are granted in addition to the permissions that are granted
     * by the session policies.
     * </p>
     * <p>
     * The plaintext that you use for both inline and managed session policies
     * can't exceed 2,048 characters. The JSON policy characters can be any
     * ASCII character from the space character to the end of the valid
     * character list ( through \u00FF). It can also include the tab ( ),
     * linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String policy;

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you
     * want to use as a managed session policy. The policies must exist in the
     * same account as the IAM user that is requesting federated access.
     * </p>
     * <p>
     * You must pass an inline or managed <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >session policy</a> to this operation. You can pass a single JSON policy
     * document to use as an inline session policy. You can also specify up to
     * 10 managed policies to use as managed session policies. The plaintext
     * that you use for both inline and managed session policies can't exceed
     * 2,048 characters. You can provide up to 10 managed policy ARNs. For more
     * information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and Amazon Web Services Service
     * Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * <p>
     * This parameter is optional. However, if you do not pass any session
     * policies, then the resulting federated user session has no permissions.
     * </p>
     * <p>
     * When you pass session policies, the session permissions are the
     * intersection of the IAM user policies and the session policies that you
     * pass. This gives you a way to further restrict the permissions for a
     * federated user. You cannot use session policies to grant more permissions
     * than those that are defined in the permissions policy of the IAM user.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The resulting credentials can be used to access a resource that has a
     * resource-based policy. If that policy specifically references the
     * federated user session in the <code>Principal</code> element of the
     * policy, the session has the permissions allowed by the policy. These
     * permissions are granted in addition to the permissions that are granted
     * by the session policies.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     */
    private java.util.List<PolicyDescriptorType> policyArns;

    /**
     * <p>
     * The duration, in seconds, that the session should last. Acceptable
     * durations for federation sessions range from 900 seconds (15 minutes) to
     * 129,600 seconds (36 hours), with 43,200 seconds (12 hours) as the
     * default. Sessions obtained using Amazon Web Services account root user
     * credentials are restricted to a maximum of 3,600 seconds (one hour). If
     * the specified duration is longer than one hour, the session obtained by
     * using root user credentials defaults to one hour.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     */
    private Integer durationSeconds;

    /**
     * <p>
     * A list of session tags. Each session tag consists of a key name and an
     * associated value. For more information about session tags, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html"
     * >Passing Session Tags in STS</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. You can pass up to 50 session tags. The
     * plaintext session tag keys can’t exceed 128 characters and the values
     * can’t exceed 256 characters. For these and additional limits, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * You can pass a session tag with the same key as a tag that is already
     * attached to the user you are federating. When you do, session tags
     * override a user tag with the same key.
     * </p>
     * <p>
     * Tag key–value pairs are not case sensitive, but case is preserved. This
     * means that you cannot have separate <code>Department</code> and
     * <code>department</code> tag keys. Assume that the role has the
     * <code>Department</code>=<code>Marketing</code> tag and you pass the
     * <code>department</code>=<code>engineering</code> session tag.
     * <code>Department</code> and <code>department</code> are not saved as
     * separate tags, and the session tag passed in the request takes precedence
     * over the role tag.
     * </p>
     */
    private java.util.List<Tag> tags;

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
     * An IAM policy in JSON format that you want to use as an inline session
     * policy.
     * </p>
     * <p>
     * You must pass an inline or managed <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >session policy</a> to this operation. You can pass a single JSON policy
     * document to use as an inline session policy. You can also specify up to
     * 10 managed policies to use as managed session policies.
     * </p>
     * <p>
     * This parameter is optional. However, if you do not pass any session
     * policies, then the resulting federated user session has no permissions.
     * </p>
     * <p>
     * When you pass session policies, the session permissions are the
     * intersection of the IAM user policies and the session policies that you
     * pass. This gives you a way to further restrict the permissions for a
     * federated user. You cannot use session policies to grant more permissions
     * than those that are defined in the permissions policy of the IAM user.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The resulting credentials can be used to access a resource that has a
     * resource-based policy. If that policy specifically references the
     * federated user session in the <code>Principal</code> element of the
     * policy, the session has the permissions allowed by the policy. These
     * permissions are granted in addition to the permissions that are granted
     * by the session policies.
     * </p>
     * <p>
     * The plaintext that you use for both inline and managed session policies
     * can't exceed 2,048 characters. The JSON policy characters can be any
     * ASCII character from the space character to the end of the valid
     * character list ( through \u00FF). It can also include the tab ( ),
     * linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         An IAM policy in JSON format that you want to use as an inline
     *         session policy.
     *         </p>
     *         <p>
     *         You must pass an inline or managed <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *         >session policy</a> to this operation. You can pass a single JSON
     *         policy document to use as an inline session policy. You can also
     *         specify up to 10 managed policies to use as managed session
     *         policies.
     *         </p>
     *         <p>
     *         This parameter is optional. However, if you do not pass any
     *         session policies, then the resulting federated user session has
     *         no permissions.
     *         </p>
     *         <p>
     *         When you pass session policies, the session permissions are the
     *         intersection of the IAM user policies and the session policies
     *         that you pass. This gives you a way to further restrict the
     *         permissions for a federated user. You cannot use session policies
     *         to grant more permissions than those that are defined in the
     *         permissions policy of the IAM user. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *         >Session Policies</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         <p>
     *         The resulting credentials can be used to access a resource that
     *         has a resource-based policy. If that policy specifically
     *         references the federated user session in the
     *         <code>Principal</code> element of the policy, the session has the
     *         permissions allowed by the policy. These permissions are granted
     *         in addition to the permissions that are granted by the session
     *         policies.
     *         </p>
     *         <p>
     *         The plaintext that you use for both inline and managed session
     *         policies can't exceed 2,048 characters. The JSON policy
     *         characters can be any ASCII character from the space character to
     *         the end of the valid character list ( through \u00FF). It can
     *         also include the tab ( ), linefeed ( ), and carriage return ( )
     *         characters.
     *         </p>
     *         <note>
     *         <p>
     *         An Amazon Web Services conversion compresses the passed session
     *         policies and session tags into a packed binary format that has a
     *         separate limit. Your request can fail for this limit even if your
     *         plaintext meets the other requirements. The
     *         <code>PackedPolicySize</code> response element indicates by
     *         percentage how close the policies and tags for your request are
     *         to the upper size limit.
     *         </p>
     *         </note>
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * <p>
     * An IAM policy in JSON format that you want to use as an inline session
     * policy.
     * </p>
     * <p>
     * You must pass an inline or managed <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >session policy</a> to this operation. You can pass a single JSON policy
     * document to use as an inline session policy. You can also specify up to
     * 10 managed policies to use as managed session policies.
     * </p>
     * <p>
     * This parameter is optional. However, if you do not pass any session
     * policies, then the resulting federated user session has no permissions.
     * </p>
     * <p>
     * When you pass session policies, the session permissions are the
     * intersection of the IAM user policies and the session policies that you
     * pass. This gives you a way to further restrict the permissions for a
     * federated user. You cannot use session policies to grant more permissions
     * than those that are defined in the permissions policy of the IAM user.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The resulting credentials can be used to access a resource that has a
     * resource-based policy. If that policy specifically references the
     * federated user session in the <code>Principal</code> element of the
     * policy, the session has the permissions allowed by the policy. These
     * permissions are granted in addition to the permissions that are granted
     * by the session policies.
     * </p>
     * <p>
     * The plaintext that you use for both inline and managed session policies
     * can't exceed 2,048 characters. The JSON policy characters can be any
     * ASCII character from the space character to the end of the valid
     * character list ( through \u00FF). It can also include the tab ( ),
     * linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param policy <p>
     *            An IAM policy in JSON format that you want to use as an inline
     *            session policy.
     *            </p>
     *            <p>
     *            You must pass an inline or managed <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *            >session policy</a> to this operation. You can pass a single
     *            JSON policy document to use as an inline session policy. You
     *            can also specify up to 10 managed policies to use as managed
     *            session policies.
     *            </p>
     *            <p>
     *            This parameter is optional. However, if you do not pass any
     *            session policies, then the resulting federated user session
     *            has no permissions.
     *            </p>
     *            <p>
     *            When you pass session policies, the session permissions are
     *            the intersection of the IAM user policies and the session
     *            policies that you pass. This gives you a way to further
     *            restrict the permissions for a federated user. You cannot use
     *            session policies to grant more permissions than those that are
     *            defined in the permissions policy of the IAM user. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *            >Session Policies</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            The resulting credentials can be used to access a resource
     *            that has a resource-based policy. If that policy specifically
     *            references the federated user session in the
     *            <code>Principal</code> element of the policy, the session has
     *            the permissions allowed by the policy. These permissions are
     *            granted in addition to the permissions that are granted by the
     *            session policies.
     *            </p>
     *            <p>
     *            The plaintext that you use for both inline and managed session
     *            policies can't exceed 2,048 characters. The JSON policy
     *            characters can be any ASCII character from the space character
     *            to the end of the valid character list ( through \u00FF). It
     *            can also include the tab ( ), linefeed ( ), and carriage
     *            return ( ) characters.
     *            </p>
     *            <note>
     *            <p>
     *            An Amazon Web Services conversion compresses the passed
     *            session policies and session tags into a packed binary format
     *            that has a separate limit. Your request can fail for this
     *            limit even if your plaintext meets the other requirements. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policies and tags for your request
     *            are to the upper size limit.
     *            </p>
     *            </note>
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * An IAM policy in JSON format that you want to use as an inline session
     * policy.
     * </p>
     * <p>
     * You must pass an inline or managed <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >session policy</a> to this operation. You can pass a single JSON policy
     * document to use as an inline session policy. You can also specify up to
     * 10 managed policies to use as managed session policies.
     * </p>
     * <p>
     * This parameter is optional. However, if you do not pass any session
     * policies, then the resulting federated user session has no permissions.
     * </p>
     * <p>
     * When you pass session policies, the session permissions are the
     * intersection of the IAM user policies and the session policies that you
     * pass. This gives you a way to further restrict the permissions for a
     * federated user. You cannot use session policies to grant more permissions
     * than those that are defined in the permissions policy of the IAM user.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The resulting credentials can be used to access a resource that has a
     * resource-based policy. If that policy specifically references the
     * federated user session in the <code>Principal</code> element of the
     * policy, the session has the permissions allowed by the policy. These
     * permissions are granted in addition to the permissions that are granted
     * by the session policies.
     * </p>
     * <p>
     * The plaintext that you use for both inline and managed session policies
     * can't exceed 2,048 characters. The JSON policy characters can be any
     * ASCII character from the space character to the end of the valid
     * character list ( through \u00FF). It can also include the tab ( ),
     * linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param policy <p>
     *            An IAM policy in JSON format that you want to use as an inline
     *            session policy.
     *            </p>
     *            <p>
     *            You must pass an inline or managed <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *            >session policy</a> to this operation. You can pass a single
     *            JSON policy document to use as an inline session policy. You
     *            can also specify up to 10 managed policies to use as managed
     *            session policies.
     *            </p>
     *            <p>
     *            This parameter is optional. However, if you do not pass any
     *            session policies, then the resulting federated user session
     *            has no permissions.
     *            </p>
     *            <p>
     *            When you pass session policies, the session permissions are
     *            the intersection of the IAM user policies and the session
     *            policies that you pass. This gives you a way to further
     *            restrict the permissions for a federated user. You cannot use
     *            session policies to grant more permissions than those that are
     *            defined in the permissions policy of the IAM user. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *            >Session Policies</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            The resulting credentials can be used to access a resource
     *            that has a resource-based policy. If that policy specifically
     *            references the federated user session in the
     *            <code>Principal</code> element of the policy, the session has
     *            the permissions allowed by the policy. These permissions are
     *            granted in addition to the permissions that are granted by the
     *            session policies.
     *            </p>
     *            <p>
     *            The plaintext that you use for both inline and managed session
     *            policies can't exceed 2,048 characters. The JSON policy
     *            characters can be any ASCII character from the space character
     *            to the end of the valid character list ( through \u00FF). It
     *            can also include the tab ( ), linefeed ( ), and carriage
     *            return ( ) characters.
     *            </p>
     *            <note>
     *            <p>
     *            An Amazon Web Services conversion compresses the passed
     *            session policies and session tags into a packed binary format
     *            that has a separate limit. Your request can fail for this
     *            limit even if your plaintext meets the other requirements. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policies and tags for your request
     *            are to the upper size limit.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFederationTokenRequest withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you
     * want to use as a managed session policy. The policies must exist in the
     * same account as the IAM user that is requesting federated access.
     * </p>
     * <p>
     * You must pass an inline or managed <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >session policy</a> to this operation. You can pass a single JSON policy
     * document to use as an inline session policy. You can also specify up to
     * 10 managed policies to use as managed session policies. The plaintext
     * that you use for both inline and managed session policies can't exceed
     * 2,048 characters. You can provide up to 10 managed policy ARNs. For more
     * information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and Amazon Web Services Service
     * Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * <p>
     * This parameter is optional. However, if you do not pass any session
     * policies, then the resulting federated user session has no permissions.
     * </p>
     * <p>
     * When you pass session policies, the session permissions are the
     * intersection of the IAM user policies and the session policies that you
     * pass. This gives you a way to further restrict the permissions for a
     * federated user. You cannot use session policies to grant more permissions
     * than those that are defined in the permissions policy of the IAM user.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The resulting credentials can be used to access a resource that has a
     * resource-based policy. If that policy specifically references the
     * federated user session in the <code>Principal</code> element of the
     * policy, the session has the permissions allowed by the policy. These
     * permissions are granted in addition to the permissions that are granted
     * by the session policies.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     *
     * @return <p>
     *         The Amazon Resource Names (ARNs) of the IAM managed policies that
     *         you want to use as a managed session policy. The policies must
     *         exist in the same account as the IAM user that is requesting
     *         federated access.
     *         </p>
     *         <p>
     *         You must pass an inline or managed <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *         >session policy</a> to this operation. You can pass a single JSON
     *         policy document to use as an inline session policy. You can also
     *         specify up to 10 managed policies to use as managed session
     *         policies. The plaintext that you use for both inline and managed
     *         session policies can't exceed 2,048 characters. You can provide
     *         up to 10 managed policy ARNs. For more information about ARNs,
     *         see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Names (ARNs) and Amazon Web Services Service
     *         Namespaces</a> in the Amazon Web Services General Reference.
     *         </p>
     *         <p>
     *         This parameter is optional. However, if you do not pass any
     *         session policies, then the resulting federated user session has
     *         no permissions.
     *         </p>
     *         <p>
     *         When you pass session policies, the session permissions are the
     *         intersection of the IAM user policies and the session policies
     *         that you pass. This gives you a way to further restrict the
     *         permissions for a federated user. You cannot use session policies
     *         to grant more permissions than those that are defined in the
     *         permissions policy of the IAM user. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *         >Session Policies</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         <p>
     *         The resulting credentials can be used to access a resource that
     *         has a resource-based policy. If that policy specifically
     *         references the federated user session in the
     *         <code>Principal</code> element of the policy, the session has the
     *         permissions allowed by the policy. These permissions are granted
     *         in addition to the permissions that are granted by the session
     *         policies.
     *         </p>
     *         <note>
     *         <p>
     *         An Amazon Web Services conversion compresses the passed session
     *         policies and session tags into a packed binary format that has a
     *         separate limit. Your request can fail for this limit even if your
     *         plaintext meets the other requirements. The
     *         <code>PackedPolicySize</code> response element indicates by
     *         percentage how close the policies and tags for your request are
     *         to the upper size limit.
     *         </p>
     *         </note>
     */
    public java.util.List<PolicyDescriptorType> getPolicyArns() {
        return policyArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you
     * want to use as a managed session policy. The policies must exist in the
     * same account as the IAM user that is requesting federated access.
     * </p>
     * <p>
     * You must pass an inline or managed <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >session policy</a> to this operation. You can pass a single JSON policy
     * document to use as an inline session policy. You can also specify up to
     * 10 managed policies to use as managed session policies. The plaintext
     * that you use for both inline and managed session policies can't exceed
     * 2,048 characters. You can provide up to 10 managed policy ARNs. For more
     * information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and Amazon Web Services Service
     * Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * <p>
     * This parameter is optional. However, if you do not pass any session
     * policies, then the resulting federated user session has no permissions.
     * </p>
     * <p>
     * When you pass session policies, the session permissions are the
     * intersection of the IAM user policies and the session policies that you
     * pass. This gives you a way to further restrict the permissions for a
     * federated user. You cannot use session policies to grant more permissions
     * than those that are defined in the permissions policy of the IAM user.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The resulting credentials can be used to access a resource that has a
     * resource-based policy. If that policy specifically references the
     * federated user session in the <code>Principal</code> element of the
     * policy, the session has the permissions allowed by the policy. These
     * permissions are granted in addition to the permissions that are granted
     * by the session policies.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     *
     * @param policyArns <p>
     *            The Amazon Resource Names (ARNs) of the IAM managed policies
     *            that you want to use as a managed session policy. The policies
     *            must exist in the same account as the IAM user that is
     *            requesting federated access.
     *            </p>
     *            <p>
     *            You must pass an inline or managed <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *            >session policy</a> to this operation. You can pass a single
     *            JSON policy document to use as an inline session policy. You
     *            can also specify up to 10 managed policies to use as managed
     *            session policies. The plaintext that you use for both inline
     *            and managed session policies can't exceed 2,048 characters.
     *            You can provide up to 10 managed policy ARNs. For more
     *            information about ARNs, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and Amazon Web Services Service
     *            Namespaces</a> in the Amazon Web Services General Reference.
     *            </p>
     *            <p>
     *            This parameter is optional. However, if you do not pass any
     *            session policies, then the resulting federated user session
     *            has no permissions.
     *            </p>
     *            <p>
     *            When you pass session policies, the session permissions are
     *            the intersection of the IAM user policies and the session
     *            policies that you pass. This gives you a way to further
     *            restrict the permissions for a federated user. You cannot use
     *            session policies to grant more permissions than those that are
     *            defined in the permissions policy of the IAM user. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *            >Session Policies</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            The resulting credentials can be used to access a resource
     *            that has a resource-based policy. If that policy specifically
     *            references the federated user session in the
     *            <code>Principal</code> element of the policy, the session has
     *            the permissions allowed by the policy. These permissions are
     *            granted in addition to the permissions that are granted by the
     *            session policies.
     *            </p>
     *            <note>
     *            <p>
     *            An Amazon Web Services conversion compresses the passed
     *            session policies and session tags into a packed binary format
     *            that has a separate limit. Your request can fail for this
     *            limit even if your plaintext meets the other requirements. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policies and tags for your request
     *            are to the upper size limit.
     *            </p>
     *            </note>
     */
    public void setPolicyArns(java.util.Collection<PolicyDescriptorType> policyArns) {
        if (policyArns == null) {
            this.policyArns = null;
            return;
        }

        this.policyArns = new java.util.ArrayList<PolicyDescriptorType>(policyArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you
     * want to use as a managed session policy. The policies must exist in the
     * same account as the IAM user that is requesting federated access.
     * </p>
     * <p>
     * You must pass an inline or managed <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >session policy</a> to this operation. You can pass a single JSON policy
     * document to use as an inline session policy. You can also specify up to
     * 10 managed policies to use as managed session policies. The plaintext
     * that you use for both inline and managed session policies can't exceed
     * 2,048 characters. You can provide up to 10 managed policy ARNs. For more
     * information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and Amazon Web Services Service
     * Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * <p>
     * This parameter is optional. However, if you do not pass any session
     * policies, then the resulting federated user session has no permissions.
     * </p>
     * <p>
     * When you pass session policies, the session permissions are the
     * intersection of the IAM user policies and the session policies that you
     * pass. This gives you a way to further restrict the permissions for a
     * federated user. You cannot use session policies to grant more permissions
     * than those that are defined in the permissions policy of the IAM user.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The resulting credentials can be used to access a resource that has a
     * resource-based policy. If that policy specifically references the
     * federated user session in the <code>Principal</code> element of the
     * policy, the session has the permissions allowed by the policy. These
     * permissions are granted in addition to the permissions that are granted
     * by the session policies.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyArns <p>
     *            The Amazon Resource Names (ARNs) of the IAM managed policies
     *            that you want to use as a managed session policy. The policies
     *            must exist in the same account as the IAM user that is
     *            requesting federated access.
     *            </p>
     *            <p>
     *            You must pass an inline or managed <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *            >session policy</a> to this operation. You can pass a single
     *            JSON policy document to use as an inline session policy. You
     *            can also specify up to 10 managed policies to use as managed
     *            session policies. The plaintext that you use for both inline
     *            and managed session policies can't exceed 2,048 characters.
     *            You can provide up to 10 managed policy ARNs. For more
     *            information about ARNs, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and Amazon Web Services Service
     *            Namespaces</a> in the Amazon Web Services General Reference.
     *            </p>
     *            <p>
     *            This parameter is optional. However, if you do not pass any
     *            session policies, then the resulting federated user session
     *            has no permissions.
     *            </p>
     *            <p>
     *            When you pass session policies, the session permissions are
     *            the intersection of the IAM user policies and the session
     *            policies that you pass. This gives you a way to further
     *            restrict the permissions for a federated user. You cannot use
     *            session policies to grant more permissions than those that are
     *            defined in the permissions policy of the IAM user. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *            >Session Policies</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            The resulting credentials can be used to access a resource
     *            that has a resource-based policy. If that policy specifically
     *            references the federated user session in the
     *            <code>Principal</code> element of the policy, the session has
     *            the permissions allowed by the policy. These permissions are
     *            granted in addition to the permissions that are granted by the
     *            session policies.
     *            </p>
     *            <note>
     *            <p>
     *            An Amazon Web Services conversion compresses the passed
     *            session policies and session tags into a packed binary format
     *            that has a separate limit. Your request can fail for this
     *            limit even if your plaintext meets the other requirements. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policies and tags for your request
     *            are to the upper size limit.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFederationTokenRequest withPolicyArns(PolicyDescriptorType... policyArns) {
        if (getPolicyArns() == null) {
            this.policyArns = new java.util.ArrayList<PolicyDescriptorType>(policyArns.length);
        }
        for (PolicyDescriptorType value : policyArns) {
            this.policyArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you
     * want to use as a managed session policy. The policies must exist in the
     * same account as the IAM user that is requesting federated access.
     * </p>
     * <p>
     * You must pass an inline or managed <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >session policy</a> to this operation. You can pass a single JSON policy
     * document to use as an inline session policy. You can also specify up to
     * 10 managed policies to use as managed session policies. The plaintext
     * that you use for both inline and managed session policies can't exceed
     * 2,048 characters. You can provide up to 10 managed policy ARNs. For more
     * information about ARNs, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and Amazon Web Services Service
     * Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * <p>
     * This parameter is optional. However, if you do not pass any session
     * policies, then the resulting federated user session has no permissions.
     * </p>
     * <p>
     * When you pass session policies, the session permissions are the
     * intersection of the IAM user policies and the session policies that you
     * pass. This gives you a way to further restrict the permissions for a
     * federated user. You cannot use session policies to grant more permissions
     * than those that are defined in the permissions policy of the IAM user.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The resulting credentials can be used to access a resource that has a
     * resource-based policy. If that policy specifically references the
     * federated user session in the <code>Principal</code> element of the
     * policy, the session has the permissions allowed by the policy. These
     * permissions are granted in addition to the permissions that are granted
     * by the session policies.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyArns <p>
     *            The Amazon Resource Names (ARNs) of the IAM managed policies
     *            that you want to use as a managed session policy. The policies
     *            must exist in the same account as the IAM user that is
     *            requesting federated access.
     *            </p>
     *            <p>
     *            You must pass an inline or managed <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *            >session policy</a> to this operation. You can pass a single
     *            JSON policy document to use as an inline session policy. You
     *            can also specify up to 10 managed policies to use as managed
     *            session policies. The plaintext that you use for both inline
     *            and managed session policies can't exceed 2,048 characters.
     *            You can provide up to 10 managed policy ARNs. For more
     *            information about ARNs, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and Amazon Web Services Service
     *            Namespaces</a> in the Amazon Web Services General Reference.
     *            </p>
     *            <p>
     *            This parameter is optional. However, if you do not pass any
     *            session policies, then the resulting federated user session
     *            has no permissions.
     *            </p>
     *            <p>
     *            When you pass session policies, the session permissions are
     *            the intersection of the IAM user policies and the session
     *            policies that you pass. This gives you a way to further
     *            restrict the permissions for a federated user. You cannot use
     *            session policies to grant more permissions than those that are
     *            defined in the permissions policy of the IAM user. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *            >Session Policies</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            The resulting credentials can be used to access a resource
     *            that has a resource-based policy. If that policy specifically
     *            references the federated user session in the
     *            <code>Principal</code> element of the policy, the session has
     *            the permissions allowed by the policy. These permissions are
     *            granted in addition to the permissions that are granted by the
     *            session policies.
     *            </p>
     *            <note>
     *            <p>
     *            An Amazon Web Services conversion compresses the passed
     *            session policies and session tags into a packed binary format
     *            that has a separate limit. Your request can fail for this
     *            limit even if your plaintext meets the other requirements. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policies and tags for your request
     *            are to the upper size limit.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFederationTokenRequest withPolicyArns(
            java.util.Collection<PolicyDescriptorType> policyArns) {
        setPolicyArns(policyArns);
        return this;
    }

    /**
     * <p>
     * The duration, in seconds, that the session should last. Acceptable
     * durations for federation sessions range from 900 seconds (15 minutes) to
     * 129,600 seconds (36 hours), with 43,200 seconds (12 hours) as the
     * default. Sessions obtained using Amazon Web Services account root user
     * credentials are restricted to a maximum of 3,600 seconds (one hour). If
     * the specified duration is longer than one hour, the session obtained by
     * using root user credentials defaults to one hour.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     *
     * @return <p>
     *         The duration, in seconds, that the session should last.
     *         Acceptable durations for federation sessions range from 900
     *         seconds (15 minutes) to 129,600 seconds (36 hours), with 43,200
     *         seconds (12 hours) as the default. Sessions obtained using Amazon
     *         Web Services account root user credentials are restricted to a
     *         maximum of 3,600 seconds (one hour). If the specified duration is
     *         longer than one hour, the session obtained by using root user
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
     * 129,600 seconds (36 hours), with 43,200 seconds (12 hours) as the
     * default. Sessions obtained using Amazon Web Services account root user
     * credentials are restricted to a maximum of 3,600 seconds (one hour). If
     * the specified duration is longer than one hour, the session obtained by
     * using root user credentials defaults to one hour.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 129600<br/>
     *
     * @param durationSeconds <p>
     *            The duration, in seconds, that the session should last.
     *            Acceptable durations for federation sessions range from 900
     *            seconds (15 minutes) to 129,600 seconds (36 hours), with
     *            43,200 seconds (12 hours) as the default. Sessions obtained
     *            using Amazon Web Services account root user credentials are
     *            restricted to a maximum of 3,600 seconds (one hour). If the
     *            specified duration is longer than one hour, the session
     *            obtained by using root user credentials defaults to one hour.
     *            </p>
     */
    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, that the session should last. Acceptable
     * durations for federation sessions range from 900 seconds (15 minutes) to
     * 129,600 seconds (36 hours), with 43,200 seconds (12 hours) as the
     * default. Sessions obtained using Amazon Web Services account root user
     * credentials are restricted to a maximum of 3,600 seconds (one hour). If
     * the specified duration is longer than one hour, the session obtained by
     * using root user credentials defaults to one hour.
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
     *            seconds (15 minutes) to 129,600 seconds (36 hours), with
     *            43,200 seconds (12 hours) as the default. Sessions obtained
     *            using Amazon Web Services account root user credentials are
     *            restricted to a maximum of 3,600 seconds (one hour). If the
     *            specified duration is longer than one hour, the session
     *            obtained by using root user credentials defaults to one hour.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFederationTokenRequest withDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    /**
     * <p>
     * A list of session tags. Each session tag consists of a key name and an
     * associated value. For more information about session tags, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html"
     * >Passing Session Tags in STS</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. You can pass up to 50 session tags. The
     * plaintext session tag keys can’t exceed 128 characters and the values
     * can’t exceed 256 characters. For these and additional limits, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * You can pass a session tag with the same key as a tag that is already
     * attached to the user you are federating. When you do, session tags
     * override a user tag with the same key.
     * </p>
     * <p>
     * Tag key–value pairs are not case sensitive, but case is preserved. This
     * means that you cannot have separate <code>Department</code> and
     * <code>department</code> tag keys. Assume that the role has the
     * <code>Department</code>=<code>Marketing</code> tag and you pass the
     * <code>department</code>=<code>engineering</code> session tag.
     * <code>Department</code> and <code>department</code> are not saved as
     * separate tags, and the session tag passed in the request takes precedence
     * over the role tag.
     * </p>
     *
     * @return <p>
     *         A list of session tags. Each session tag consists of a key name
     *         and an associated value. For more information about session tags,
     *         see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html"
     *         >Passing Session Tags in STS</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         <p>
     *         This parameter is optional. You can pass up to 50 session tags.
     *         The plaintext session tag keys can’t exceed 128 characters and
     *         the values can’t exceed 256 characters. For these and additional
     *         limits, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     *         >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         An Amazon Web Services conversion compresses the passed session
     *         policies and session tags into a packed binary format that has a
     *         separate limit. Your request can fail for this limit even if your
     *         plaintext meets the other requirements. The
     *         <code>PackedPolicySize</code> response element indicates by
     *         percentage how close the policies and tags for your request are
     *         to the upper size limit.
     *         </p>
     *         </note>
     *         <p>
     *         You can pass a session tag with the same key as a tag that is
     *         already attached to the user you are federating. When you do,
     *         session tags override a user tag with the same key.
     *         </p>
     *         <p>
     *         Tag key–value pairs are not case sensitive, but case is
     *         preserved. This means that you cannot have separate
     *         <code>Department</code> and <code>department</code> tag keys.
     *         Assume that the role has the <code>Department</code>=
     *         <code>Marketing</code> tag and you pass the
     *         <code>department</code>=<code>engineering</code> session tag.
     *         <code>Department</code> and <code>department</code> are not saved
     *         as separate tags, and the session tag passed in the request takes
     *         precedence over the role tag.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of session tags. Each session tag consists of a key name and an
     * associated value. For more information about session tags, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html"
     * >Passing Session Tags in STS</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. You can pass up to 50 session tags. The
     * plaintext session tag keys can’t exceed 128 characters and the values
     * can’t exceed 256 characters. For these and additional limits, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * You can pass a session tag with the same key as a tag that is already
     * attached to the user you are federating. When you do, session tags
     * override a user tag with the same key.
     * </p>
     * <p>
     * Tag key–value pairs are not case sensitive, but case is preserved. This
     * means that you cannot have separate <code>Department</code> and
     * <code>department</code> tag keys. Assume that the role has the
     * <code>Department</code>=<code>Marketing</code> tag and you pass the
     * <code>department</code>=<code>engineering</code> session tag.
     * <code>Department</code> and <code>department</code> are not saved as
     * separate tags, and the session tag passed in the request takes precedence
     * over the role tag.
     * </p>
     *
     * @param tags <p>
     *            A list of session tags. Each session tag consists of a key
     *            name and an associated value. For more information about
     *            session tags, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html"
     *            >Passing Session Tags in STS</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            This parameter is optional. You can pass up to 50 session
     *            tags. The plaintext session tag keys can’t exceed 128
     *            characters and the values can’t exceed 256 characters. For
     *            these and additional limits, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     *            >IAM and STS Character Limits</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            An Amazon Web Services conversion compresses the passed
     *            session policies and session tags into a packed binary format
     *            that has a separate limit. Your request can fail for this
     *            limit even if your plaintext meets the other requirements. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policies and tags for your request
     *            are to the upper size limit.
     *            </p>
     *            </note>
     *            <p>
     *            You can pass a session tag with the same key as a tag that is
     *            already attached to the user you are federating. When you do,
     *            session tags override a user tag with the same key.
     *            </p>
     *            <p>
     *            Tag key–value pairs are not case sensitive, but case is
     *            preserved. This means that you cannot have separate
     *            <code>Department</code> and <code>department</code> tag keys.
     *            Assume that the role has the <code>Department</code>=
     *            <code>Marketing</code> tag and you pass the
     *            <code>department</code>=<code>engineering</code> session tag.
     *            <code>Department</code> and <code>department</code> are not
     *            saved as separate tags, and the session tag passed in the
     *            request takes precedence over the role tag.
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
     * A list of session tags. Each session tag consists of a key name and an
     * associated value. For more information about session tags, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html"
     * >Passing Session Tags in STS</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. You can pass up to 50 session tags. The
     * plaintext session tag keys can’t exceed 128 characters and the values
     * can’t exceed 256 characters. For these and additional limits, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * You can pass a session tag with the same key as a tag that is already
     * attached to the user you are federating. When you do, session tags
     * override a user tag with the same key.
     * </p>
     * <p>
     * Tag key–value pairs are not case sensitive, but case is preserved. This
     * means that you cannot have separate <code>Department</code> and
     * <code>department</code> tag keys. Assume that the role has the
     * <code>Department</code>=<code>Marketing</code> tag and you pass the
     * <code>department</code>=<code>engineering</code> session tag.
     * <code>Department</code> and <code>department</code> are not saved as
     * separate tags, and the session tag passed in the request takes precedence
     * over the role tag.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of session tags. Each session tag consists of a key
     *            name and an associated value. For more information about
     *            session tags, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html"
     *            >Passing Session Tags in STS</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            This parameter is optional. You can pass up to 50 session
     *            tags. The plaintext session tag keys can’t exceed 128
     *            characters and the values can’t exceed 256 characters. For
     *            these and additional limits, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     *            >IAM and STS Character Limits</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            An Amazon Web Services conversion compresses the passed
     *            session policies and session tags into a packed binary format
     *            that has a separate limit. Your request can fail for this
     *            limit even if your plaintext meets the other requirements. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policies and tags for your request
     *            are to the upper size limit.
     *            </p>
     *            </note>
     *            <p>
     *            You can pass a session tag with the same key as a tag that is
     *            already attached to the user you are federating. When you do,
     *            session tags override a user tag with the same key.
     *            </p>
     *            <p>
     *            Tag key–value pairs are not case sensitive, but case is
     *            preserved. This means that you cannot have separate
     *            <code>Department</code> and <code>department</code> tag keys.
     *            Assume that the role has the <code>Department</code>=
     *            <code>Marketing</code> tag and you pass the
     *            <code>department</code>=<code>engineering</code> session tag.
     *            <code>Department</code> and <code>department</code> are not
     *            saved as separate tags, and the session tag passed in the
     *            request takes precedence over the role tag.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFederationTokenRequest withTags(Tag... tags) {
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
     * A list of session tags. Each session tag consists of a key name and an
     * associated value. For more information about session tags, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html"
     * >Passing Session Tags in STS</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. You can pass up to 50 session tags. The
     * plaintext session tag keys can’t exceed 128 characters and the values
     * can’t exceed 256 characters. For these and additional limits, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * You can pass a session tag with the same key as a tag that is already
     * attached to the user you are federating. When you do, session tags
     * override a user tag with the same key.
     * </p>
     * <p>
     * Tag key–value pairs are not case sensitive, but case is preserved. This
     * means that you cannot have separate <code>Department</code> and
     * <code>department</code> tag keys. Assume that the role has the
     * <code>Department</code>=<code>Marketing</code> tag and you pass the
     * <code>department</code>=<code>engineering</code> session tag.
     * <code>Department</code> and <code>department</code> are not saved as
     * separate tags, and the session tag passed in the request takes precedence
     * over the role tag.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of session tags. Each session tag consists of a key
     *            name and an associated value. For more information about
     *            session tags, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html"
     *            >Passing Session Tags in STS</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            This parameter is optional. You can pass up to 50 session
     *            tags. The plaintext session tag keys can’t exceed 128
     *            characters and the values can’t exceed 256 characters. For
     *            these and additional limits, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
     *            >IAM and STS Character Limits</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            An Amazon Web Services conversion compresses the passed
     *            session policies and session tags into a packed binary format
     *            that has a separate limit. Your request can fail for this
     *            limit even if your plaintext meets the other requirements. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policies and tags for your request
     *            are to the upper size limit.
     *            </p>
     *            </note>
     *            <p>
     *            You can pass a session tag with the same key as a tag that is
     *            already attached to the user you are federating. When you do,
     *            session tags override a user tag with the same key.
     *            </p>
     *            <p>
     *            Tag key–value pairs are not case sensitive, but case is
     *            preserved. This means that you cannot have separate
     *            <code>Department</code> and <code>department</code> tag keys.
     *            Assume that the role has the <code>Department</code>=
     *            <code>Marketing</code> tag and you pass the
     *            <code>department</code>=<code>engineering</code> session tag.
     *            <code>Department</code> and <code>department</code> are not
     *            saved as separate tags, and the session tag passed in the
     *            request takes precedence over the role tag.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFederationTokenRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getPolicy() != null)
            sb.append("Policy: " + getPolicy() + ",");
        if (getPolicyArns() != null)
            sb.append("PolicyArns: " + getPolicyArns() + ",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: " + getDurationSeconds() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getPolicyArns() == null) ? 0 : getPolicyArns().hashCode());
        hashCode = prime * hashCode
                + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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
        if (other.getPolicyArns() == null ^ this.getPolicyArns() == null)
            return false;
        if (other.getPolicyArns() != null
                && other.getPolicyArns().equals(this.getPolicyArns()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null
                && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
