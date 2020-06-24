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

package com.amazonaws.services.iam;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.iam.model.*;

/**
 * Interface for accessing AWS Identity and Access Management <fullname>AWS
 * Identity and Access Management</fullname>
 * <p>
 * AWS Identity and Access Management (IAM) is a web service for securely
 * controlling access to AWS services. With IAM, you can centrally manage users,
 * security credentials such as access keys, and permissions that control which
 * AWS resources users and applications can access. For more information about
 * IAM, see <a href="http://aws.amazon.com/iam/">AWS Identity and Access
 * Management (IAM)</a> and the <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/">AWS Identity and
 * Access Management User Guide</a>.
 * </p>
 **/
public interface AWSIdentityAndAccessManagement {

    /**
     * Overrides the default endpoint for this client
     * ("https://iam.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "iam.us-east-1.amazonaws.com")
     * or a full URL, including the protocol (ex:
     * "https://iam.us-east-1.amazonaws.com"). If the protocol is not specified
     * here, the default protocol from this client's {@link ClientConfiguration}
     * will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint The endpoint (ex: "iam.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://iam.us-east-1.amazonaws.com") of the region specific
     *            AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to
     * {@link AWSIdentityAndAccessManagement#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException If the given region is null,
     *             or if this service isn't available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;

    /**
     * <p>
     * Adds a new client ID (also known as audience) to the list of client IDs
     * already registered for the specified IAM OpenID Connect (OIDC) provider
     * resource.
     * </p>
     * <p>
     * This operation is idempotent; it does not fail or return an error if you
     * add an existing client ID to the provider.
     * </p>
     * 
     * @param addClientIDToOpenIDConnectProviderRequest
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void addClientIDToOpenIDConnectProvider(
            AddClientIDToOpenIDConnectProviderRequest addClientIDToOpenIDConnectProviderRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds the specified IAM role to the specified instance profile. An
     * instance profile can contain only one role. (The number and size of IAM
     * resources in an AWS account are limited. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html"
     * >IAM and STS Quotas</a> in the <i>IAM User Guide</i>.) You can remove the
     * existing role and then add a different role to an instance profile. You
     * must then wait for the change to appear across all of AWS because of <a
     * href="https://en.wikipedia.org/wiki/Eventual_consistency">eventual
     * consistency</a>. To force the change, you must <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DisassociateIamInstanceProfile.html"
     * >disassociate the instance profile</a> and then <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AssociateIamInstanceProfile.html"
     * >associate the instance profile</a>, or you can stop your instance and
     * then restart it.
     * </p>
     * <note>
     * <p>
     * The caller of this API must be granted the <code>PassRole</code>
     * permission on the IAM role by a permissions policy.
     * </p>
     * </note>
     * <p>
     * For more information about roles, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"
     * >Working with Roles</a>. For more information about instance profiles, go
     * to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"
     * >About Instance Profiles</a>.
     * </p>
     * 
     * @param addRoleToInstanceProfileRequest
     * @throws NoSuchEntityException
     * @throws EntityAlreadyExistsException
     * @throws LimitExceededException
     * @throws UnmodifiableEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void addRoleToInstanceProfile(AddRoleToInstanceProfileRequest addRoleToInstanceProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds the specified user to the specified group.
     * </p>
     * 
     * @param addUserToGroupRequest
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void addUserToGroup(AddUserToGroupRequest addUserToGroupRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Attaches the specified managed policy to the specified IAM group.
     * </p>
     * <p>
     * You use this API to attach a managed policy to a group. To embed an
     * inline policy in a group, use <a>PutGroupPolicy</a>.
     * </p>
     * <p>
     * For more information about policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param attachGroupPolicyRequest
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws InvalidInputException
     * @throws PolicyNotAttachableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void attachGroupPolicy(AttachGroupPolicyRequest attachGroupPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Attaches the specified managed policy to the specified IAM role. When you
     * attach a managed policy to a role, the managed policy becomes part of the
     * role's permission (access) policy.
     * </p>
     * <note>
     * <p>
     * You cannot use a managed policy as the role's trust policy. The role's
     * trust policy is created at the same time as the role, using
     * <a>CreateRole</a>. You can update a role's trust policy using
     * <a>UpdateAssumeRolePolicy</a>.
     * </p>
     * </note>
     * <p>
     * Use this API to attach a <i>managed</i> policy to a role. To embed an
     * inline policy in a role, use <a>PutRolePolicy</a>. For more information
     * about policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param attachRolePolicyRequest
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws InvalidInputException
     * @throws UnmodifiableEntityException
     * @throws PolicyNotAttachableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void attachRolePolicy(AttachRolePolicyRequest attachRolePolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Attaches the specified managed policy to the specified user.
     * </p>
     * <p>
     * You use this API to attach a <i>managed</i> policy to a user. To embed an
     * inline policy in a user, use <a>PutUserPolicy</a>.
     * </p>
     * <p>
     * For more information about policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param attachUserPolicyRequest
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws InvalidInputException
     * @throws PolicyNotAttachableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void attachUserPolicy(AttachUserPolicyRequest attachUserPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Changes the password of the IAM user who is calling this operation. The
     * AWS account root user password is not affected by this operation.
     * </p>
     * <p>
     * To change the password for a different user, see
     * <a>UpdateLoginProfile</a>. For more information about modifying
     * passwords, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html"
     * >Managing Passwords</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param changePasswordRequest
     * @throws NoSuchEntityException
     * @throws InvalidUserTypeException
     * @throws LimitExceededException
     * @throws EntityTemporarilyUnmodifiableException
     * @throws PasswordPolicyViolationException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void changePassword(ChangePasswordRequest changePasswordRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a new AWS secret access key and corresponding AWS access key ID
     * for the specified user. The default status for new keys is
     * <code>Active</code>.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS access key ID signing the request. This
     * operation works for access keys under the AWS account. Consequently, you
     * can use this operation to manage AWS account root user credentials. This
     * is true even if the AWS account has no associated users.
     * </p>
     * <p>
     * The number and size of IAM resources in an AWS account are limited. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html"
     * >IAM and STS Quotas</a> in the <i>IAM User Guide</i>.
     * </p>
     * <important>
     * <p>
     * To ensure the security of your AWS account, the secret access key is
     * accessible only during key and user creation. You must save the key (for
     * example, in a text file) if you want to be able to access it again. If a
     * secret key is lost, you can delete the access keys for the associated
     * user and then create new keys.
     * </p>
     * </important>
     * 
     * @param createAccessKeyRequest
     * @return createAccessKeyResult The response from the CreateAccessKey
     *         service method, as returned by AWS Identity and Access
     *         Management.
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    CreateAccessKeyResult createAccessKey(CreateAccessKeyRequest createAccessKeyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an alias for your AWS account. For information about using an AWS
     * account alias, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html"
     * >Using an Alias for Your AWS Account ID</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createAccountAliasRequest
     * @throws EntityAlreadyExistsException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void createAccountAlias(CreateAccountAliasRequest createAccountAliasRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new group.
     * </p>
     * <p>
     * The number and size of IAM resources in an AWS account are limited. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html"
     * >IAM and STS Quotas</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createGroupRequest
     * @return createGroupResult The response from the CreateGroup service
     *         method, as returned by AWS Identity and Access Management.
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    CreateGroupResult createGroup(CreateGroupRequest createGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new instance profile. For information about instance profiles,
     * go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"
     * >About Instance Profiles</a>.
     * </p>
     * <p>
     * The number and size of IAM resources in an AWS account are limited. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html"
     * >IAM and STS Quotas</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createInstanceProfileRequest
     * @return createInstanceProfileResult The response from the
     *         CreateInstanceProfile service method, as returned by AWS Identity
     *         and Access Management.
     * @throws EntityAlreadyExistsException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    CreateInstanceProfileResult createInstanceProfile(
            CreateInstanceProfileRequest createInstanceProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a password for the specified user, giving the user the ability to
     * access AWS services through the AWS Management Console. For more
     * information about managing passwords, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html"
     * >Managing Passwords</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createLoginProfileRequest
     * @return createLoginProfileResult The response from the CreateLoginProfile
     *         service method, as returned by AWS Identity and Access
     *         Management.
     * @throws EntityAlreadyExistsException
     * @throws NoSuchEntityException
     * @throws PasswordPolicyViolationException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    CreateLoginProfileResult createLoginProfile(CreateLoginProfileRequest createLoginProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an IAM entity to describe an identity provider (IdP) that
     * supports <a href="http://openid.net/connect/">OpenID Connect (OIDC)</a>.
     * </p>
     * <p>
     * The OIDC provider that you create with this operation can be used as a
     * principal in a role's trust policy. Such a policy establishes a trust
     * relationship between AWS and the OIDC provider.
     * </p>
     * <p>
     * When you create the IAM OIDC provider, you specify the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The URL of the OIDC identity provider (IdP) to trust
     * </p>
     * </li>
     * <li>
     * <p>
     * A list of client IDs (also known as audiences) that identify the
     * application or applications that are allowed to authenticate using the
     * OIDC provider
     * </p>
     * </li>
     * <li>
     * <p>
     * A list of thumbprints of one or more server certificates that the IdP
     * uses
     * </p>
     * </li>
     * </ul>
     * <p>
     * You get all of this information from the OIDC IdP that you want to use to
     * access AWS.
     * </p>
     * <note>
     * <p>
     * The trust for the OIDC provider is derived from the IAM provider that
     * this operation creates. Therefore, it is best to limit access to the
     * <a>CreateOpenIDConnectProvider</a> operation to highly privileged users.
     * </p>
     * </note>
     * 
     * @param createOpenIDConnectProviderRequest
     * @return createOpenIDConnectProviderResult The response from the
     *         CreateOpenIDConnectProvider service method, as returned by AWS
     *         Identity and Access Management.
     * @throws InvalidInputException
     * @throws EntityAlreadyExistsException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    CreateOpenIDConnectProviderResult createOpenIDConnectProvider(
            CreateOpenIDConnectProviderRequest createOpenIDConnectProviderRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new managed policy for your AWS account.
     * </p>
     * <p>
     * This operation creates a policy version with a version identifier of
     * <code>v1</code> and sets v1 as the policy's default version. For more
     * information about policy versions, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For more information about managed policies in general, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createPolicyRequest
     * @return createPolicyResult The response from the CreatePolicy service
     *         method, as returned by AWS Identity and Access Management.
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     * @throws MalformedPolicyDocumentException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    CreatePolicyResult createPolicy(CreatePolicyRequest createPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new version of the specified managed policy. To update a
     * managed policy, you create a new policy version. A managed policy can
     * have up to five versions. If the policy has five versions, you must
     * delete an existing version using <a>DeletePolicyVersion</a> before you
     * create a new version.
     * </p>
     * <p>
     * Optionally, you can set the new version as the policy's default version.
     * The default version is the version that is in effect for the IAM users,
     * groups, and roles to which the policy is attached.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createPolicyVersionRequest
     * @return createPolicyVersionResult The response from the
     *         CreatePolicyVersion service method, as returned by AWS Identity
     *         and Access Management.
     * @throws NoSuchEntityException
     * @throws MalformedPolicyDocumentException
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    CreatePolicyVersionResult createPolicyVersion(
            CreatePolicyVersionRequest createPolicyVersionRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a new role for your AWS account. For more information about
     * roles, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"
     * >IAM Roles</a>. The number and size of IAM resources in an AWS account
     * are limited. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html"
     * >IAM and STS Quotas</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createRoleRequest
     * @return createRoleResult The response from the CreateRole service method,
     *         as returned by AWS Identity and Access Management.
     * @throws LimitExceededException
     * @throws InvalidInputException
     * @throws EntityAlreadyExistsException
     * @throws MalformedPolicyDocumentException
     * @throws ConcurrentModificationException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    CreateRoleResult createRole(CreateRoleRequest createRoleRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates an IAM resource that describes an identity provider (IdP) that
     * supports SAML 2.0.
     * </p>
     * <p>
     * The SAML provider resource that you create with this operation can be
     * used as a principal in an IAM role's trust policy. Such a policy can
     * enable federated users who sign in using the SAML IdP to assume the role.
     * You can create an IAM role that supports Web-based single sign-on (SSO)
     * to the AWS Management Console or one that supports API access to AWS.
     * </p>
     * <p>
     * When you create the SAML provider resource, you upload a SAML metadata
     * document that you get from your IdP. That document includes the issuer's
     * name, expiration information, and keys that can be used to validate the
     * SAML authentication response (assertions) that the IdP sends. You must
     * generate the metadata document using the identity management software
     * that is used as your organization's IdP.
     * </p>
     * <note>
     * <p>
     * This operation requires <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4</a>.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-saml.html"
     * >Enabling SAML 2.0 Federated Users to Access the AWS Management
     * Console</a> and <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html"
     * >About SAML 2.0-based Federation</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createSAMLProviderRequest
     * @return createSAMLProviderResult The response from the CreateSAMLProvider
     *         service method, as returned by AWS Identity and Access
     *         Management.
     * @throws InvalidInputException
     * @throws EntityAlreadyExistsException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    CreateSAMLProviderResult createSAMLProvider(CreateSAMLProviderRequest createSAMLProviderRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an IAM role that is linked to a specific AWS service. The service
     * controls the attached policies and when the role can be deleted. This
     * helps ensure that the service is not broken by an unexpectedly changed or
     * deleted role, which could put your AWS resources into an unknown state.
     * Allowing the service to control the role helps improve service stability
     * and proper cleanup when a service and its role are no longer needed. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html"
     * >Using Service-Linked Roles</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * To attach a policy to this service-linked role, you must make the request
     * using the AWS service that depends on this role.
     * </p>
     * 
     * @param createServiceLinkedRoleRequest
     * @return createServiceLinkedRoleResult The response from the
     *         CreateServiceLinkedRole service method, as returned by AWS
     *         Identity and Access Management.
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    CreateServiceLinkedRoleResult createServiceLinkedRole(
            CreateServiceLinkedRoleRequest createServiceLinkedRoleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Generates a set of credentials consisting of a user name and password
     * that can be used to access the service specified in the request. These
     * credentials are generated by IAM, and can be used only for the specified
     * service.
     * </p>
     * <p>
     * You can have a maximum of two sets of service-specific credentials for
     * each supported service per user.
     * </p>
     * <p>
     * The only supported service at this time is AWS CodeCommit.
     * </p>
     * <p>
     * You can reset the password to a new service-generated value by calling
     * <a>ResetServiceSpecificCredential</a>.
     * </p>
     * <p>
     * For more information about service-specific credentials, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_ssh-keys.html"
     * >Using IAM with AWS CodeCommit: Git Credentials, SSH Keys, and AWS Access
     * Keys</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createServiceSpecificCredentialRequest
     * @return createServiceSpecificCredentialResult The response from the
     *         CreateServiceSpecificCredential service method, as returned by
     *         AWS Identity and Access Management.
     * @throws LimitExceededException
     * @throws NoSuchEntityException
     * @throws ServiceNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    CreateServiceSpecificCredentialResult createServiceSpecificCredential(
            CreateServiceSpecificCredentialRequest createServiceSpecificCredentialRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new IAM user for your AWS account.
     * </p>
     * <p>
     * The number and size of IAM resources in an AWS account are limited. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html"
     * >IAM and STS Quotas</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createUserRequest
     * @return createUserResult The response from the CreateUser service method,
     *         as returned by AWS Identity and Access Management.
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     * @throws NoSuchEntityException
     * @throws InvalidInputException
     * @throws ConcurrentModificationException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    CreateUserResult createUser(CreateUserRequest createUserRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a new virtual MFA device for the AWS account. After creating the
     * virtual MFA, use <a>EnableMFADevice</a> to attach the MFA device to an
     * IAM user. For more information about creating and working with virtual
     * MFA devices, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html"
     * >Using a Virtual MFA Device</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The number and size of IAM resources in an AWS account are limited. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html"
     * >IAM and STS Quotas</a> in the <i>IAM User Guide</i>.
     * </p>
     * <important>
     * <p>
     * The seed information contained in the QR code and the Base32 string
     * should be treated like any other secret access information. In other
     * words, protect the seed information as you would your AWS access keys or
     * your passwords. After you provision your virtual device, you should
     * ensure that the information is destroyed following secure procedures.
     * </p>
     * </important>
     * 
     * @param createVirtualMFADeviceRequest
     * @return createVirtualMFADeviceResult The response from the
     *         CreateVirtualMFADevice service method, as returned by AWS
     *         Identity and Access Management.
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    CreateVirtualMFADeviceResult createVirtualMFADevice(
            CreateVirtualMFADeviceRequest createVirtualMFADeviceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deactivates the specified MFA device and removes it from association with
     * the user name for which it was originally enabled.
     * </p>
     * <p>
     * For more information about creating and working with virtual MFA devices,
     * go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html"
     * >Enabling a Virtual Multi-factor Authentication (MFA) Device</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deactivateMFADeviceRequest
     * @throws EntityTemporarilyUnmodifiableException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void deactivateMFADevice(DeactivateMFADeviceRequest deactivateMFADeviceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the access key pair associated with the specified IAM user.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS access key ID signing the request. This
     * operation works for access keys under the AWS account. Consequently, you
     * can use this operation to manage AWS account root user credentials even
     * if the AWS account has no associated users.
     * </p>
     * 
     * @param deleteAccessKeyRequest
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void deleteAccessKey(DeleteAccessKeyRequest deleteAccessKeyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified AWS account alias. For information about using an
     * AWS account alias, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html"
     * >Using an Alias for Your AWS Account ID</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deleteAccountAliasRequest
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void deleteAccountAlias(DeleteAccountAliasRequest deleteAccountAliasRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the password policy for the AWS account. There are no parameters.
     * </p>
     * 
     * @param deleteAccountPasswordPolicyRequest
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void deleteAccountPasswordPolicy(
            DeleteAccountPasswordPolicyRequest deleteAccountPasswordPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified IAM group. The group must not contain any users or
     * have any attached policies.
     * </p>
     * 
     * @param deleteGroupRequest
     * @throws NoSuchEntityException
     * @throws DeleteConflictException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void deleteGroup(DeleteGroupRequest deleteGroupRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified inline policy that is embedded in the specified IAM
     * group.
     * </p>
     * <p>
     * A group can also have managed policies attached to it. To detach a
     * managed policy from a group, use <a>DetachGroupPolicy</a>. For more
     * information about policies, refer to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deleteGroupPolicyRequest
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void deleteGroupPolicy(DeleteGroupPolicyRequest deleteGroupPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified instance profile. The instance profile must not
     * have an associated role.
     * </p>
     * <important>
     * <p>
     * Make sure that you do not have any Amazon EC2 instances running with the
     * instance profile you are about to delete. Deleting a role or instance
     * profile that is associated with a running instance will break any
     * applications running on the instance.
     * </p>
     * </important>
     * <p>
     * For more information about instance profiles, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"
     * >About Instance Profiles</a>.
     * </p>
     * 
     * @param deleteInstanceProfileRequest
     * @throws NoSuchEntityException
     * @throws DeleteConflictException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void deleteInstanceProfile(DeleteInstanceProfileRequest deleteInstanceProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the password for the specified IAM user, which terminates the
     * user's ability to access AWS services through the AWS Management Console.
     * </p>
     * <important>
     * <p>
     * Deleting a user's password does not prevent a user from accessing AWS
     * through the command line interface or the API. To prevent all user
     * access, you must also either make any access keys inactive or delete
     * them. For more information about making keys inactive or deleting them,
     * see <a>UpdateAccessKey</a> and <a>DeleteAccessKey</a>.
     * </p>
     * </important>
     * 
     * @param deleteLoginProfileRequest
     * @throws EntityTemporarilyUnmodifiableException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void deleteLoginProfile(DeleteLoginProfileRequest deleteLoginProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an OpenID Connect identity provider (IdP) resource object in IAM.
     * </p>
     * <p>
     * Deleting an IAM OIDC provider resource does not update any roles that
     * reference the provider as a principal in their trust policies. Any
     * attempt to assume a role that references a deleted provider fails.
     * </p>
     * <p>
     * This operation is idempotent; it does not fail or return an error if you
     * call the operation for a provider that does not exist.
     * </p>
     * 
     * @param deleteOpenIDConnectProviderRequest
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void deleteOpenIDConnectProvider(
            DeleteOpenIDConnectProviderRequest deleteOpenIDConnectProviderRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified managed policy.
     * </p>
     * <p>
     * Before you can delete a managed policy, you must first detach the policy
     * from all users, groups, and roles that it is attached to. In addition,
     * you must delete all the policy's versions. The following steps describe
     * the process for deleting a managed policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Detach the policy from all users, groups, and roles that the policy is
     * attached to, using the <a>DetachUserPolicy</a>, <a>DetachGroupPolicy</a>,
     * or <a>DetachRolePolicy</a> API operations. To list all the users, groups,
     * and roles that a policy is attached to, use <a>ListEntitiesForPolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete all versions of the policy using <a>DeletePolicyVersion</a>. To
     * list the policy's versions, use <a>ListPolicyVersions</a>. You cannot use
     * <a>DeletePolicyVersion</a> to delete the version that is marked as the
     * default version. You delete the policy's default version in the next step
     * of the process.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete the policy (this automatically deletes the policy's default
     * version) using this API.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about managed policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deletePolicyRequest
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws InvalidInputException
     * @throws DeleteConflictException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void deletePolicy(DeletePolicyRequest deletePolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified version from the specified managed policy.
     * </p>
     * <p>
     * You cannot delete the default version from a policy using this API. To
     * delete the default version from a policy, use <a>DeletePolicy</a>. To
     * find out which version of a policy is marked as the default version, use
     * <a>ListPolicyVersions</a>.
     * </p>
     * <p>
     * For information about versions for managed policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deletePolicyVersionRequest
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws InvalidInputException
     * @throws DeleteConflictException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void deletePolicyVersion(DeletePolicyVersionRequest deletePolicyVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified role. The role must not have any policies attached.
     * For more information about roles, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"
     * >Working with Roles</a>.
     * </p>
     * <important>
     * <p>
     * Make sure that you do not have any Amazon EC2 instances running with the
     * role you are about to delete. Deleting a role or instance profile that is
     * associated with a running instance will break any applications running on
     * the instance.
     * </p>
     * </important>
     * 
     * @param deleteRoleRequest
     * @throws NoSuchEntityException
     * @throws DeleteConflictException
     * @throws LimitExceededException
     * @throws UnmodifiableEntityException
     * @throws ConcurrentModificationException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void deleteRole(DeleteRoleRequest deleteRoleRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the permissions boundary for the specified IAM role.
     * </p>
     * <important>
     * <p>
     * Deleting the permissions boundary for a role might increase its
     * permissions. For example, it might allow anyone who assumes the role to
     * perform all the actions granted in its permissions policies.
     * </p>
     * </important>
     * 
     * @param deleteRolePermissionsBoundaryRequest
     * @throws NoSuchEntityException
     * @throws UnmodifiableEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void deleteRolePermissionsBoundary(
            DeleteRolePermissionsBoundaryRequest deleteRolePermissionsBoundaryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified inline policy that is embedded in the specified IAM
     * role.
     * </p>
     * <p>
     * A role can also have managed policies attached to it. To detach a managed
     * policy from a role, use <a>DetachRolePolicy</a>. For more information
     * about policies, refer to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deleteRolePolicyRequest
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws UnmodifiableEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void deleteRolePolicy(DeleteRolePolicyRequest deleteRolePolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a SAML provider resource in IAM.
     * </p>
     * <p>
     * Deleting the provider resource from IAM does not update any roles that
     * reference the SAML provider resource's ARN as a principal in their trust
     * policies. Any attempt to assume a role that references a non-existent
     * provider resource ARN fails.
     * </p>
     * <note>
     * <p>
     * This operation requires <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4</a>.
     * </p>
     * </note>
     * 
     * @param deleteSAMLProviderRequest
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void deleteSAMLProvider(DeleteSAMLProviderRequest deleteSAMLProviderRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified SSH public key.
     * </p>
     * <p>
     * The SSH public key deleted by this operation is used only for
     * authenticating the associated IAM user to an AWS CodeCommit repository.
     * For more information about using SSH keys to authenticate to an AWS
     * CodeCommit repository, see <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html"
     * >Set up AWS CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit
     * User Guide</i>.
     * </p>
     * 
     * @param deleteSSHPublicKeyRequest
     * @throws NoSuchEntityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void deleteSSHPublicKey(DeleteSSHPublicKeyRequest deleteSSHPublicKeyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified server certificate.
     * </p>
     * <p>
     * For more information about working with server certificates, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html"
     * >Working with Server Certificates</a> in the <i>IAM User Guide</i>. This
     * topic also includes a list of AWS services that can use the server
     * certificates that you manage with IAM.
     * </p>
     * <important>
     * <p>
     * If you are using a server certificate with Elastic Load Balancing,
     * deleting the certificate could have implications for your application. If
     * Elastic Load Balancing doesn't detect the deletion of bound certificates,
     * it may continue to use the certificates. This could cause Elastic Load
     * Balancing to stop accepting traffic. We recommend that you remove the
     * reference to the certificate from Elastic Load Balancing before using
     * this command to delete the certificate. For more information, go to <a
     * href=
     * "https://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DeleteLoadBalancerListeners.html"
     * >DeleteLoadBalancerListeners</a> in the <i>Elastic Load Balancing API
     * Reference</i>.
     * </p>
     * </important>
     * 
     * @param deleteServerCertificateRequest
     * @throws NoSuchEntityException
     * @throws DeleteConflictException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void deleteServerCertificate(DeleteServerCertificateRequest deleteServerCertificateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Submits a service-linked role deletion request and returns a
     * <code>DeletionTaskId</code>, which you can use to check the status of the
     * deletion. Before you call this operation, confirm that the role has no
     * active sessions and that any resources used by the role in the linked
     * service are deleted. If you call this operation more than once for the
     * same service-linked role and an earlier deletion task is not complete,
     * then the <code>DeletionTaskId</code> of the earlier request is returned.
     * </p>
     * <p>
     * If you submit a deletion request for a service-linked role whose linked
     * service is still accessing a resource, then the deletion task fails. If
     * it fails, the <a>GetServiceLinkedRoleDeletionStatus</a> API operation
     * returns the reason for the failure, usually including the resources that
     * must be deleted. To delete the service-linked role, you must first remove
     * those resources from the linked service and then submit the deletion
     * request again. Resources are specific to the service that is linked to
     * the role. For more information about removing resources from a service,
     * see the <a href="http://docs.aws.amazon.com/">AWS documentation</a> for
     * your service.
     * </p>
     * <p>
     * For more information about service-linked roles, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html#iam-term-service-linked-role"
     * >Roles Terms and Concepts: AWS Service-Linked Role</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * 
     * @param deleteServiceLinkedRoleRequest
     * @return deleteServiceLinkedRoleResult The response from the
     *         DeleteServiceLinkedRole service method, as returned by AWS
     *         Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    DeleteServiceLinkedRoleResult deleteServiceLinkedRole(
            DeleteServiceLinkedRoleRequest deleteServiceLinkedRoleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified service-specific credential.
     * </p>
     * 
     * @param deleteServiceSpecificCredentialRequest
     * @throws NoSuchEntityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void deleteServiceSpecificCredential(
            DeleteServiceSpecificCredentialRequest deleteServiceSpecificCredentialRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a signing certificate associated with the specified IAM user.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS access key ID signing the request. This
     * operation works for access keys under the AWS account. Consequently, you
     * can use this operation to manage AWS account root user credentials even
     * if the AWS account has no associated IAM users.
     * </p>
     * 
     * @param deleteSigningCertificateRequest
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void deleteSigningCertificate(DeleteSigningCertificateRequest deleteSigningCertificateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified IAM user. Unlike the AWS Management Console, when
     * you delete a user programmatically, you must delete the items attached to
     * the user manually, or the deletion fails. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_users_manage.html#id_users_deleting_cli"
     * >Deleting an IAM User</a>. Before attempting to delete a user, remove the
     * following items:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Password (<a>DeleteLoginProfile</a>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Access keys (<a>DeleteAccessKey</a>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Signing certificate (<a>DeleteSigningCertificate</a>)
     * </p>
     * </li>
     * <li>
     * <p>
     * SSH public key (<a>DeleteSSHPublicKey</a>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Git credentials (<a>DeleteServiceSpecificCredential</a>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Multi-factor authentication (MFA) device (<a>DeactivateMFADevice</a>,
     * <a>DeleteVirtualMFADevice</a>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Inline policies (<a>DeleteUserPolicy</a>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Attached managed policies (<a>DetachUserPolicy</a>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Group memberships (<a>RemoveUserFromGroup</a>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteUserRequest
     * @throws LimitExceededException
     * @throws NoSuchEntityException
     * @throws DeleteConflictException
     * @throws ConcurrentModificationException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void deleteUser(DeleteUserRequest deleteUserRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the permissions boundary for the specified IAM user.
     * </p>
     * <important>
     * <p>
     * Deleting the permissions boundary for a user might increase its
     * permissions by allowing the user to perform all the actions granted in
     * its permissions policies.
     * </p>
     * </important>
     * 
     * @param deleteUserPermissionsBoundaryRequest
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void deleteUserPermissionsBoundary(
            DeleteUserPermissionsBoundaryRequest deleteUserPermissionsBoundaryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified inline policy that is embedded in the specified IAM
     * user.
     * </p>
     * <p>
     * A user can also have managed policies attached to it. To detach a managed
     * policy from a user, use <a>DetachUserPolicy</a>. For more information
     * about policies, refer to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deleteUserPolicyRequest
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void deleteUserPolicy(DeleteUserPolicyRequest deleteUserPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a virtual MFA device.
     * </p>
     * <note>
     * <p>
     * You must deactivate a user's virtual MFA device before you can delete it.
     * For information about deactivating MFA devices, see
     * <a>DeactivateMFADevice</a>.
     * </p>
     * </note>
     * 
     * @param deleteVirtualMFADeviceRequest
     * @throws NoSuchEntityException
     * @throws DeleteConflictException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest deleteVirtualMFADeviceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes the specified managed policy from the specified IAM group.
     * </p>
     * <p>
     * A group can also have inline policies embedded with it. To delete an
     * inline policy, use the <a>DeleteGroupPolicy</a> API. For information
     * about policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param detachGroupPolicyRequest
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws InvalidInputException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void detachGroupPolicy(DetachGroupPolicyRequest detachGroupPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes the specified managed policy from the specified role.
     * </p>
     * <p>
     * A role can also have inline policies embedded with it. To delete an
     * inline policy, use the <a>DeleteRolePolicy</a> API. For information about
     * policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param detachRolePolicyRequest
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws InvalidInputException
     * @throws UnmodifiableEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void detachRolePolicy(DetachRolePolicyRequest detachRolePolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes the specified managed policy from the specified user.
     * </p>
     * <p>
     * A user can also have inline policies embedded with it. To delete an
     * inline policy, use the <a>DeleteUserPolicy</a> API. For information about
     * policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param detachUserPolicyRequest
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws InvalidInputException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void detachUserPolicy(DetachUserPolicyRequest detachUserPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables the specified MFA device and associates it with the specified IAM
     * user. When enabled, the MFA device is required for every subsequent login
     * by the IAM user associated with the device.
     * </p>
     * 
     * @param enableMFADeviceRequest
     * @throws EntityAlreadyExistsException
     * @throws EntityTemporarilyUnmodifiableException
     * @throws InvalidAuthenticationCodeException
     * @throws LimitExceededException
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void enableMFADevice(EnableMFADeviceRequest enableMFADeviceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Generates a credential report for the AWS account. For more information
     * about the credential report, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html"
     * >Getting Credential Reports</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param generateCredentialReportRequest
     * @return generateCredentialReportResult The response from the
     *         GenerateCredentialReport service method, as returned by AWS
     *         Identity and Access Management.
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GenerateCredentialReportResult generateCredentialReport(
            GenerateCredentialReportRequest generateCredentialReportRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Generates a report for service last accessed data for AWS Organizations.
     * You can generate a report for any entities (organization root,
     * organizational unit, or account) or policies in your organization.
     * </p>
     * <p>
     * To call this operation, you must be signed in using your AWS
     * Organizations master account credentials. You can use your long-term IAM
     * user or root user credentials, or temporary credentials from assuming an
     * IAM role. SCPs must be enabled for your organization root. You must have
     * the required IAM and AWS Organizations permissions. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html"
     * >Refining Permissions Using Service Last Accessed Data</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * You can generate a service last accessed data report for entities by
     * specifying only the entity's path. This data includes a list of services
     * that are allowed by any service control policies (SCPs) that apply to the
     * entity.
     * </p>
     * <p>
     * You can generate a service last accessed data report for a policy by
     * specifying an entity's path and an optional AWS Organizations policy ID.
     * This data includes a list of services that are allowed by the specified
     * SCP.
     * </p>
     * <p>
     * For each service in both report types, the data includes the most recent
     * account activity that the policy allows to account principals in the
     * entity or the entity's children. For important information about the
     * data, reporting period, permissions required, troubleshooting, and
     * supported Regions see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html"
     * >Reducing Permissions Using Service Last Accessed Data</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <important>
     * <p>
     * The data includes all attempts to access AWS, not just the successful
     * ones. This includes all attempts that were made using the AWS Management
     * Console, the AWS API through any of the SDKs, or any of the command line
     * tools. An unexpected entry in the service last accessed data does not
     * mean that an account has been compromised, because the request might have
     * been denied. Refer to your CloudTrail logs as the authoritative source
     * for information about all API calls and whether they were successful or
     * denied access. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/cloudtrail-integration.html"
     * >Logging IAM Events with CloudTrail</a> in the <i>IAM User Guide</i>.
     * </p>
     * </important>
     * <p>
     * This operation returns a <code>JobId</code>. Use this parameter in the
     * <code> <a>GetOrganizationsAccessReport</a> </code> operation to check the
     * status of the report generation. To check the status of this request, use
     * the <code>JobId</code> parameter in the
     * <code> <a>GetOrganizationsAccessReport</a> </code> operation and test the
     * <code>JobStatus</code> response parameter. When the job is complete, you
     * can retrieve the report.
     * </p>
     * <p>
     * To generate a service last accessed data report for entities, specify an
     * entity path without specifying the optional AWS Organizations policy ID.
     * The type of entity that you specify determines the data returned in the
     * report.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> – When you specify the organizations root as the entity, the
     * resulting report lists all of the services allowed by SCPs that are
     * attached to your root. For each service, the report includes data for all
     * accounts in your organization except the master account, because the
     * master account is not limited by SCPs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OU</b> – When you specify an organizational unit (OU) as the entity,
     * the resulting report lists all of the services allowed by SCPs that are
     * attached to the OU and its parents. For each service, the report includes
     * data for all accounts in the OU or its children. This data excludes the
     * master account, because the master account is not limited by SCPs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Master account</b> – When you specify the master account, the
     * resulting report lists all AWS services, because the master account is
     * not limited by SCPs. For each service, the report includes data for only
     * the master account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Account</b> – When you specify another account as the entity, the
     * resulting report lists all of the services allowed by SCPs that are
     * attached to the account and its parents. For each service, the report
     * includes data for only the specified account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To generate a service last accessed data report for policies, specify an
     * entity path and the optional AWS Organizations policy ID. The type of
     * entity that you specify determines the data returned for each service.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> – When you specify the root entity and a policy ID, the
     * resulting report lists all of the services that are allowed by the
     * specified SCP. For each service, the report includes data for all
     * accounts in your organization to which the SCP applies. This data
     * excludes the master account, because the master account is not limited by
     * SCPs. If the SCP is not attached to any entities in the organization,
     * then the report will return a list of services with no data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OU</b> – When you specify an OU entity and a policy ID, the resulting
     * report lists all of the services that are allowed by the specified SCP.
     * For each service, the report includes data for all accounts in the OU or
     * its children to which the SCP applies. This means that other accounts
     * outside the OU that are affected by the SCP might not be included in the
     * data. This data excludes the master account, because the master account
     * is not limited by SCPs. If the SCP is not attached to the OU or one of
     * its children, the report will return a list of services with no data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Master account</b> – When you specify the master account, the
     * resulting report lists all AWS services, because the master account is
     * not limited by SCPs. If you specify a policy ID in the CLI or API, the
     * policy is ignored. For each service, the report includes data for only
     * the master account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Account</b> – When you specify another account entity and a policy ID,
     * the resulting report lists all of the services that are allowed by the
     * specified SCP. For each service, the report includes data for only the
     * specified account. This means that other accounts in the organization
     * that are affected by the SCP might not be included in the data. If the
     * SCP is not attached to the account, the report will return a list of
     * services with no data.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Service last accessed data does not use other policy types when
     * determining whether a principal could access a service. These other
     * policy types include identity-based policies, resource-based policies,
     * access control lists, IAM permissions boundaries, and STS assume role
     * policies. It only applies SCP logic. For more about the evaluation of
     * policy types, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics"
     * >Evaluating Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * <p>
     * For more information about service last accessed data, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html"
     * >Reducing Policy Scope by Viewing User Activity</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * 
     * @param generateOrganizationsAccessReportRequest
     * @return generateOrganizationsAccessReportResult The response from the
     *         GenerateOrganizationsAccessReport service method, as returned by
     *         AWS Identity and Access Management.
     * @throws ReportGenerationLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GenerateOrganizationsAccessReportResult generateOrganizationsAccessReport(
            GenerateOrganizationsAccessReportRequest generateOrganizationsAccessReportRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Generates a report that includes details about when an IAM resource
     * (user, group, role, or policy) was last used in an attempt to access AWS
     * services. Recent activity usually appears within four hours. IAM reports
     * activity for the last 365 days, or less if your Region began supporting
     * this feature within the last year. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access-advisor_tracking-period"
     * >Regions Where Data Is Tracked</a>.
     * </p>
     * <important>
     * <p>
     * The service last accessed data includes all attempts to access an AWS
     * API, not just the successful ones. This includes all attempts that were
     * made using the AWS Management Console, the AWS API through any of the
     * SDKs, or any of the command line tools. An unexpected entry in the
     * service last accessed data does not mean that your account has been
     * compromised, because the request might have been denied. Refer to your
     * CloudTrail logs as the authoritative source for information about all API
     * calls and whether they were successful or denied access. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/cloudtrail-integration.html"
     * >Logging IAM Events with CloudTrail</a> in the <i>IAM User Guide</i>.
     * </p>
     * </important>
     * <p>
     * The <code>GenerateServiceLastAccessedDetails</code> operation returns a
     * <code>JobId</code>. Use this parameter in the following operations to
     * retrieve the following details from your report:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GetServiceLastAccessedDetails</a> – Use this operation for users,
     * groups, roles, or policies to list every AWS service that the resource
     * could access using permissions policies. For each service, the response
     * includes information about the most recent access attempt.
     * </p>
     * <p>
     * The <code>JobId</code> returned by
     * <code>GenerateServiceLastAccessedDetail</code> must be used by the same
     * role within a session, or by the same user when used to call
     * <code>GetServiceLastAccessedDetail</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetServiceLastAccessedDetailsWithEntities</a> – Use this operation for
     * groups and policies to list information about the associated entities
     * (users or roles) that attempted to access a specific AWS service.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To check the status of the
     * <code>GenerateServiceLastAccessedDetails</code> request, use the
     * <code>JobId</code> parameter in the same operations and test the
     * <code>JobStatus</code> response parameter.
     * </p>
     * <p>
     * For additional information about the permissions policies that allow an
     * identity (user, group, or role) to access specific services, use the
     * <a>ListPoliciesGrantingServiceAccess</a> operation.
     * </p>
     * <note>
     * <p>
     * Service last accessed data does not use other policy types when
     * determining whether a resource could access a service. These other policy
     * types include resource-based policies, access control lists, AWS
     * Organizations policies, IAM permissions boundaries, and AWS STS assume
     * role policies. It only applies permissions policy logic. For more about
     * the evaluation of policy types, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics"
     * >Evaluating Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * <p>
     * For more information about service and action last accessed data, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html"
     * >Reducing Permissions Using Service Last Accessed Data</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * 
     * @param generateServiceLastAccessedDetailsRequest
     * @return generateServiceLastAccessedDetailsResult The response from the
     *         GenerateServiceLastAccessedDetails service method, as returned by
     *         AWS Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GenerateServiceLastAccessedDetailsResult generateServiceLastAccessedDetails(
            GenerateServiceLastAccessedDetailsRequest generateServiceLastAccessedDetailsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about when the specified access key was last used.
     * The information includes the date and time of last use, along with the
     * AWS service and Region that were specified in the last request made with
     * that key.
     * </p>
     * 
     * @param getAccessKeyLastUsedRequest
     * @return getAccessKeyLastUsedResult The response from the
     *         GetAccessKeyLastUsed service method, as returned by AWS Identity
     *         and Access Management.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GetAccessKeyLastUsedResult getAccessKeyLastUsed(
            GetAccessKeyLastUsedRequest getAccessKeyLastUsedRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves information about all IAM users, groups, roles, and policies in
     * your AWS account, including their relationships to one another. Use this
     * API to obtain a snapshot of the configuration of IAM permissions (users,
     * groups, roles, and policies) in your account.
     * </p>
     * <note>
     * <p>
     * Policies returned by this API are URL-encoded compliant with <a
     * href="https://tools.ietf.org/html/rfc3986">RFC 3986</a>. You can use a
     * URL decoding method to convert the policy back to plain JSON text. For
     * example, if you use Java, you can use the <code>decode</code> method of
     * the <code>java.net.URLDecoder</code> utility class in the Java SDK. Other
     * languages and SDKs provide similar functionality.
     * </p>
     * </note>
     * <p>
     * You can optionally filter the results using the <code>Filter</code>
     * parameter. You can paginate the results using the <code>MaxItems</code>
     * and <code>Marker</code> parameters.
     * </p>
     * 
     * @param getAccountAuthorizationDetailsRequest
     * @return getAccountAuthorizationDetailsResult The response from the
     *         GetAccountAuthorizationDetails service method, as returned by AWS
     *         Identity and Access Management.
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GetAccountAuthorizationDetailsResult getAccountAuthorizationDetails(
            GetAccountAuthorizationDetailsRequest getAccountAuthorizationDetailsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the password policy for the AWS account. For more information
     * about using a password policy, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html"
     * >Managing an IAM Password Policy</a>.
     * </p>
     * 
     * @param getAccountPasswordPolicyRequest
     * @return getAccountPasswordPolicyResult The response from the
     *         GetAccountPasswordPolicy service method, as returned by AWS
     *         Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GetAccountPasswordPolicyResult getAccountPasswordPolicy(
            GetAccountPasswordPolicyRequest getAccountPasswordPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about IAM entity usage and IAM quotas in the AWS
     * account.
     * </p>
     * <p>
     * The number and size of IAM resources in an AWS account are limited. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html"
     * >IAM and STS Quotas</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getAccountSummaryRequest
     * @return getAccountSummaryResult The response from the GetAccountSummary
     *         service method, as returned by AWS Identity and Access
     *         Management.
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GetAccountSummaryResult getAccountSummary(GetAccountSummaryRequest getAccountSummaryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of all of the context keys referenced in the input policies.
     * The policies are supplied as a list of one or more strings. To get the
     * context keys from policies associated with an IAM user, group, or role,
     * use <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     * <p>
     * Context keys are variables maintained by AWS and its services that
     * provide details about the context of an API query request. Context keys
     * can be evaluated by testing against a value specified in an IAM policy.
     * Use <code>GetContextKeysForCustomPolicy</code> to understand what key
     * names and values you must supply when you call
     * <a>SimulateCustomPolicy</a>. Note that all parameters are shown in
     * unencoded form here for clarity but must be URL encoded to be included as
     * a part of a real HTML request.
     * </p>
     * 
     * @param getContextKeysForCustomPolicyRequest
     * @return getContextKeysForCustomPolicyResult The response from the
     *         GetContextKeysForCustomPolicy service method, as returned by AWS
     *         Identity and Access Management.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GetContextKeysForCustomPolicyResult getContextKeysForCustomPolicy(
            GetContextKeysForCustomPolicyRequest getContextKeysForCustomPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of all of the context keys referenced in all the IAM policies
     * that are attached to the specified IAM entity. The entity can be an IAM
     * user, group, or role. If you specify a user, then the request also
     * includes all of the policies attached to groups that the user is a member
     * of.
     * </p>
     * <p>
     * You can optionally include a list of one or more additional policies,
     * specified as strings. If you want to include <i>only</i> a list of
     * policies by string, use <a>GetContextKeysForCustomPolicy</a> instead.
     * </p>
     * <p>
     * <b>Note:</b> This API discloses information about the permissions granted
     * to other users. If you do not want users to see other user's permissions,
     * then consider allowing them to use <a>GetContextKeysForCustomPolicy</a>
     * instead.
     * </p>
     * <p>
     * Context keys are variables maintained by AWS and its services that
     * provide details about the context of an API query request. Context keys
     * can be evaluated by testing against a value in an IAM policy. Use
     * <a>GetContextKeysForPrincipalPolicy</a> to understand what key names and
     * values you must supply when you call <a>SimulatePrincipalPolicy</a>.
     * </p>
     * 
     * @param getContextKeysForPrincipalPolicyRequest
     * @return getContextKeysForPrincipalPolicyResult The response from the
     *         GetContextKeysForPrincipalPolicy service method, as returned by
     *         AWS Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GetContextKeysForPrincipalPolicyResult getContextKeysForPrincipalPolicy(
            GetContextKeysForPrincipalPolicyRequest getContextKeysForPrincipalPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a credential report for the AWS account. For more information
     * about the credential report, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html"
     * >Getting Credential Reports</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getCredentialReportRequest
     * @return getCredentialReportResult The response from the
     *         GetCredentialReport service method, as returned by AWS Identity
     *         and Access Management.
     * @throws CredentialReportNotPresentException
     * @throws CredentialReportExpiredException
     * @throws CredentialReportNotReadyException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GetCredentialReportResult getCredentialReport(
            GetCredentialReportRequest getCredentialReportRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of IAM users that are in the specified IAM group. You can
     * paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param getGroupRequest
     * @return getGroupResult The response from the GetGroup service method, as
     *         returned by AWS Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GetGroupResult getGroup(GetGroupRequest getGroupRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves the specified inline policy document that is embedded in the
     * specified IAM group.
     * </p>
     * <note>
     * <p>
     * Policies returned by this API are URL-encoded compliant with <a
     * href="https://tools.ietf.org/html/rfc3986">RFC 3986</a>. You can use a
     * URL decoding method to convert the policy back to plain JSON text. For
     * example, if you use Java, you can use the <code>decode</code> method of
     * the <code>java.net.URLDecoder</code> utility class in the Java SDK. Other
     * languages and SDKs provide similar functionality.
     * </p>
     * </note>
     * <p>
     * An IAM group can also have managed policies attached to it. To retrieve a
     * managed policy document that is attached to a group, use <a>GetPolicy</a>
     * to determine the policy's default version, then use
     * <a>GetPolicyVersion</a> to retrieve the policy document.
     * </p>
     * <p>
     * For more information about policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getGroupPolicyRequest
     * @return getGroupPolicyResult The response from the GetGroupPolicy service
     *         method, as returned by AWS Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GetGroupPolicyResult getGroupPolicy(GetGroupPolicyRequest getGroupPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the specified instance profile, including the
     * instance profile's path, GUID, ARN, and role. For more information about
     * instance profiles, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"
     * >About Instance Profiles</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getInstanceProfileRequest
     * @return getInstanceProfileResult The response from the GetInstanceProfile
     *         service method, as returned by AWS Identity and Access
     *         Management.
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GetInstanceProfileResult getInstanceProfile(GetInstanceProfileRequest getInstanceProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the user name and password-creation date for the specified IAM
     * user. If the user has not been assigned a password, the operation returns
     * a 404 (<code>NoSuchEntity</code>) error.
     * </p>
     * 
     * @param getLoginProfileRequest
     * @return getLoginProfileResult The response from the GetLoginProfile
     *         service method, as returned by AWS Identity and Access
     *         Management.
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GetLoginProfileResult getLoginProfile(GetLoginProfileRequest getLoginProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the specified OpenID Connect (OIDC) provider
     * resource object in IAM.
     * </p>
     * 
     * @param getOpenIDConnectProviderRequest
     * @return getOpenIDConnectProviderResult The response from the
     *         GetOpenIDConnectProvider service method, as returned by AWS
     *         Identity and Access Management.
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GetOpenIDConnectProviderResult getOpenIDConnectProvider(
            GetOpenIDConnectProviderRequest getOpenIDConnectProviderRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the service last accessed data report for AWS Organizations
     * that was previously generated using the
     * <code> <a>GenerateOrganizationsAccessReport</a> </code> operation. This
     * operation retrieves the status of your report job and the report
     * contents.
     * </p>
     * <p>
     * Depending on the parameters that you passed when you generated the
     * report, the data returned could include different information. For
     * details, see <a>GenerateOrganizationsAccessReport</a>.
     * </p>
     * <p>
     * To call this operation, you must be signed in to the master account in
     * your organization. SCPs must be enabled for your organization root. You
     * must have permissions to perform this operation. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html"
     * >Refining Permissions Using Service Last Accessed Data</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * For each service that principals in an account (root users, IAM users, or
     * IAM roles) could access using SCPs, the operation returns details about
     * the most recent access attempt. If there was no attempt, the service is
     * listed without details about the most recent attempt to access the
     * service. If the operation fails, it returns the reason that it failed.
     * </p>
     * <p>
     * By default, the list is sorted by service namespace.
     * </p>
     * 
     * @param getOrganizationsAccessReportRequest
     * @return getOrganizationsAccessReportResult The response from the
     *         GetOrganizationsAccessReport service method, as returned by AWS
     *         Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GetOrganizationsAccessReportResult getOrganizationsAccessReport(
            GetOrganizationsAccessReportRequest getOrganizationsAccessReportRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the specified managed policy, including the
     * policy's default version and the total number of IAM users, groups, and
     * roles to which the policy is attached. To retrieve the list of the
     * specific users, groups, and roles that the policy is attached to, use the
     * <a>ListEntitiesForPolicy</a> API. This API returns metadata about the
     * policy. To retrieve the actual policy document for a specific version of
     * the policy, use <a>GetPolicyVersion</a>.
     * </p>
     * <p>
     * This API retrieves information about managed policies. To retrieve
     * information about an inline policy that is embedded with an IAM user,
     * group, or role, use the <a>GetUserPolicy</a>, <a>GetGroupPolicy</a>, or
     * <a>GetRolePolicy</a> API.
     * </p>
     * <p>
     * For more information about policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getPolicyRequest
     * @return getPolicyResult The response from the GetPolicy service method,
     *         as returned by AWS Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws InvalidInputException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GetPolicyResult getPolicy(GetPolicyRequest getPolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the specified version of the specified
     * managed policy, including the policy document.
     * </p>
     * <note>
     * <p>
     * Policies returned by this API are URL-encoded compliant with <a
     * href="https://tools.ietf.org/html/rfc3986">RFC 3986</a>. You can use a
     * URL decoding method to convert the policy back to plain JSON text. For
     * example, if you use Java, you can use the <code>decode</code> method of
     * the <code>java.net.URLDecoder</code> utility class in the Java SDK. Other
     * languages and SDKs provide similar functionality.
     * </p>
     * </note>
     * <p>
     * To list the available versions for a policy, use
     * <a>ListPolicyVersions</a>.
     * </p>
     * <p>
     * This API retrieves information about managed policies. To retrieve
     * information about an inline policy that is embedded in a user, group, or
     * role, use the <a>GetUserPolicy</a>, <a>GetGroupPolicy</a>, or
     * <a>GetRolePolicy</a> API.
     * </p>
     * <p>
     * For more information about the types of policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getPolicyVersionRequest
     * @return getPolicyVersionResult The response from the GetPolicyVersion
     *         service method, as returned by AWS Identity and Access
     *         Management.
     * @throws NoSuchEntityException
     * @throws InvalidInputException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GetPolicyVersionResult getPolicyVersion(GetPolicyVersionRequest getPolicyVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the specified role, including the role's
     * path, GUID, ARN, and the role's trust policy that grants permission to
     * assume the role. For more information about roles, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"
     * >Working with Roles</a>.
     * </p>
     * <note>
     * <p>
     * Policies returned by this API are URL-encoded compliant with <a
     * href="https://tools.ietf.org/html/rfc3986">RFC 3986</a>. You can use a
     * URL decoding method to convert the policy back to plain JSON text. For
     * example, if you use Java, you can use the <code>decode</code> method of
     * the <code>java.net.URLDecoder</code> utility class in the Java SDK. Other
     * languages and SDKs provide similar functionality.
     * </p>
     * </note>
     * 
     * @param getRoleRequest
     * @return getRoleResult The response from the GetRole service method, as
     *         returned by AWS Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GetRoleResult getRole(GetRoleRequest getRoleRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves the specified inline policy document that is embedded with the
     * specified IAM role.
     * </p>
     * <note>
     * <p>
     * Policies returned by this API are URL-encoded compliant with <a
     * href="https://tools.ietf.org/html/rfc3986">RFC 3986</a>. You can use a
     * URL decoding method to convert the policy back to plain JSON text. For
     * example, if you use Java, you can use the <code>decode</code> method of
     * the <code>java.net.URLDecoder</code> utility class in the Java SDK. Other
     * languages and SDKs provide similar functionality.
     * </p>
     * </note>
     * <p>
     * An IAM role can also have managed policies attached to it. To retrieve a
     * managed policy document that is attached to a role, use <a>GetPolicy</a>
     * to determine the policy's default version, then use
     * <a>GetPolicyVersion</a> to retrieve the policy document.
     * </p>
     * <p>
     * For more information about policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For more information about roles, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html"
     * >Using Roles to Delegate Permissions and Federate Identities</a>.
     * </p>
     * 
     * @param getRolePolicyRequest
     * @return getRolePolicyResult The response from the GetRolePolicy service
     *         method, as returned by AWS Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GetRolePolicyResult getRolePolicy(GetRolePolicyRequest getRolePolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the SAML provider metadocument that was uploaded when the IAM
     * SAML provider resource object was created or updated.
     * </p>
     * <note>
     * <p>
     * This operation requires <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4</a>.
     * </p>
     * </note>
     * 
     * @param getSAMLProviderRequest
     * @return getSAMLProviderResult The response from the GetSAMLProvider
     *         service method, as returned by AWS Identity and Access
     *         Management.
     * @throws NoSuchEntityException
     * @throws InvalidInputException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GetSAMLProviderResult getSAMLProvider(GetSAMLProviderRequest getSAMLProviderRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the specified SSH public key, including metadata about the key.
     * </p>
     * <p>
     * The SSH public key retrieved by this operation is used only for
     * authenticating the associated IAM user to an AWS CodeCommit repository.
     * For more information about using SSH keys to authenticate to an AWS
     * CodeCommit repository, see <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html"
     * >Set up AWS CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit
     * User Guide</i>.
     * </p>
     * 
     * @param getSSHPublicKeyRequest
     * @return getSSHPublicKeyResult The response from the GetSSHPublicKey
     *         service method, as returned by AWS Identity and Access
     *         Management.
     * @throws NoSuchEntityException
     * @throws UnrecognizedPublicKeyEncodingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GetSSHPublicKeyResult getSSHPublicKey(GetSSHPublicKeyRequest getSSHPublicKeyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the specified server certificate stored in
     * IAM.
     * </p>
     * <p>
     * For more information about working with server certificates, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html"
     * >Working with Server Certificates</a> in the <i>IAM User Guide</i>. This
     * topic includes a list of AWS services that can use the server
     * certificates that you manage with IAM.
     * </p>
     * 
     * @param getServerCertificateRequest
     * @return getServerCertificateResult The response from the
     *         GetServerCertificate service method, as returned by AWS Identity
     *         and Access Management.
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GetServerCertificateResult getServerCertificate(
            GetServerCertificateRequest getServerCertificateRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves a service last accessed report that was created using the
     * <code>GenerateServiceLastAccessedDetails</code> operation. You can use
     * the <code>JobId</code> parameter in
     * <code>GetServiceLastAccessedDetails</code> to retrieve the status of your
     * report job. When the report is complete, you can retrieve the generated
     * report. The report includes a list of AWS services that the resource
     * (user, group, role, or managed policy) can access.
     * </p>
     * <note>
     * <p>
     * Service last accessed data does not use other policy types when
     * determining whether a resource could access a service. These other policy
     * types include resource-based policies, access control lists, AWS
     * Organizations policies, IAM permissions boundaries, and AWS STS assume
     * role policies. It only applies permissions policy logic. For more about
     * the evaluation of policy types, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics"
     * >Evaluating Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * <p>
     * For each service that the resource could access using permissions
     * policies, the operation returns details about the most recent access
     * attempt. If there was no attempt, the service is listed without details
     * about the most recent attempt to access the service. If the operation
     * fails, the <code>GetServiceLastAccessedDetails</code> operation returns
     * the reason that it failed.
     * </p>
     * <p>
     * The <code>GetServiceLastAccessedDetails</code> operation returns a list
     * of services. This list includes the number of entities that have
     * attempted to access the service and the date and time of the last
     * attempt. It also returns the ARN of the following entity, depending on
     * the resource ARN that you used to generate the report:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>User</b> – Returns the user ARN that you used to generate the report
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Group</b> – Returns the ARN of the group member (user) that last
     * attempted to access the service
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Role</b> – Returns the role ARN that you used to generate the report
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Policy</b> – Returns the ARN of the user or role that last used the
     * policy to attempt to access the service
     * </p>
     * </li>
     * </ul>
     * <p>
     * By default, the list is sorted by service namespace.
     * </p>
     * <p>
     * If you specified <code>ACTION_LEVEL</code> granularity when you generated
     * the report, this operation returns service and action last accessed data.
     * This includes the most recent access attempt for each tracked action
     * within a service. Otherwise, this operation returns only service data.
     * </p>
     * <p>
     * For more information about service and action last accessed data, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html"
     * >Reducing Permissions Using Service Last Accessed Data</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * 
     * @param getServiceLastAccessedDetailsRequest
     * @return getServiceLastAccessedDetailsResult The response from the
     *         GetServiceLastAccessedDetails service method, as returned by AWS
     *         Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GetServiceLastAccessedDetailsResult getServiceLastAccessedDetails(
            GetServiceLastAccessedDetailsRequest getServiceLastAccessedDetailsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * After you generate a group or policy report using the
     * <code>GenerateServiceLastAccessedDetails</code> operation, you can use
     * the <code>JobId</code> parameter in
     * <code>GetServiceLastAccessedDetailsWithEntities</code>. This operation
     * retrieves the status of your report job and a list of entities that could
     * have used group or policy permissions to access the specified service.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Group</b> – For a group report, this operation returns a list of users
     * in the group that could have used the group’s policies in an attempt to
     * access the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Policy</b> – For a policy report, this operation returns a list of
     * entities (users or roles) that could have used the policy in an attempt
     * to access the service.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can also use this operation for user or role reports to retrieve
     * details about those entities.
     * </p>
     * <p>
     * If the operation fails, the
     * <code>GetServiceLastAccessedDetailsWithEntities</code> operation returns
     * the reason that it failed.
     * </p>
     * <p>
     * By default, the list of associated entities is sorted by date, with the
     * most recent access listed first.
     * </p>
     * 
     * @param getServiceLastAccessedDetailsWithEntitiesRequest
     * @return getServiceLastAccessedDetailsWithEntitiesResult The response from
     *         the GetServiceLastAccessedDetailsWithEntities service method, as
     *         returned by AWS Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GetServiceLastAccessedDetailsWithEntitiesResult getServiceLastAccessedDetailsWithEntities(
            GetServiceLastAccessedDetailsWithEntitiesRequest getServiceLastAccessedDetailsWithEntitiesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the status of your service-linked role deletion. After you use
     * the <a>DeleteServiceLinkedRole</a> API operation to submit a
     * service-linked role for deletion, you can use the
     * <code>DeletionTaskId</code> parameter in
     * <code>GetServiceLinkedRoleDeletionStatus</code> to check the status of
     * the deletion. If the deletion fails, this operation returns the reason
     * that it failed, if that information is returned by the service.
     * </p>
     * 
     * @param getServiceLinkedRoleDeletionStatusRequest
     * @return getServiceLinkedRoleDeletionStatusResult The response from the
     *         GetServiceLinkedRoleDeletionStatus service method, as returned by
     *         AWS Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws InvalidInputException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GetServiceLinkedRoleDeletionStatusResult getServiceLinkedRoleDeletionStatus(
            GetServiceLinkedRoleDeletionStatusRequest getServiceLinkedRoleDeletionStatusRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the specified IAM user, including the user's
     * creation date, path, unique ID, and ARN.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS access key ID used to sign the request to
     * this API.
     * </p>
     * 
     * @param getUserRequest
     * @return getUserResult The response from the GetUser service method, as
     *         returned by AWS Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GetUserResult getUser(GetUserRequest getUserRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves the specified inline policy document that is embedded in the
     * specified IAM user.
     * </p>
     * <note>
     * <p>
     * Policies returned by this API are URL-encoded compliant with <a
     * href="https://tools.ietf.org/html/rfc3986">RFC 3986</a>. You can use a
     * URL decoding method to convert the policy back to plain JSON text. For
     * example, if you use Java, you can use the <code>decode</code> method of
     * the <code>java.net.URLDecoder</code> utility class in the Java SDK. Other
     * languages and SDKs provide similar functionality.
     * </p>
     * </note>
     * <p>
     * An IAM user can also have managed policies attached to it. To retrieve a
     * managed policy document that is attached to a user, use <a>GetPolicy</a>
     * to determine the policy's default version. Then use
     * <a>GetPolicyVersion</a> to retrieve the policy document.
     * </p>
     * <p>
     * For more information about policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getUserPolicyRequest
     * @return getUserPolicyResult The response from the GetUserPolicy service
     *         method, as returned by AWS Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    GetUserPolicyResult getUserPolicy(GetUserPolicyRequest getUserPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the access key IDs associated with the
     * specified IAM user. If there is none, the operation returns an empty
     * list.
     * </p>
     * <p>
     * Although each user is limited to a small number of keys, you can still
     * paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the user name is
     * determined implicitly based on the AWS access key ID used to sign the
     * request. This operation works for access keys under the AWS account.
     * Consequently, you can use this operation to manage AWS account root user
     * credentials even if the AWS account has no associated users.
     * </p>
     * <note>
     * <p>
     * To ensure the security of your AWS account, the secret access key is
     * accessible only during key and user creation.
     * </p>
     * </note>
     * 
     * @param listAccessKeysRequest
     * @return listAccessKeysResult The response from the ListAccessKeys service
     *         method, as returned by AWS Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListAccessKeysResult listAccessKeys(ListAccessKeysRequest listAccessKeysRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the account alias associated with the AWS account (Note: you can
     * have only one). For information about using an AWS account alias, see <a
     * href
     * ="https://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html">
     * Using an Alias for Your AWS Account ID</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listAccountAliasesRequest
     * @return listAccountAliasesResult The response from the ListAccountAliases
     *         service method, as returned by AWS Identity and Access
     *         Management.
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListAccountAliasesResult listAccountAliases(ListAccountAliasesRequest listAccountAliasesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all managed policies that are attached to the specified IAM group.
     * </p>
     * <p>
     * An IAM group can also have inline policies embedded with it. To list the
     * inline policies for a group, use the <a>ListGroupPolicies</a> API. For
     * information about policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters. You can use the <code>PathPrefix</code>
     * parameter to limit the list of policies to only those matching the
     * specified path prefix. If there are no policies attached to the specified
     * group (or none that match the specified path prefix), the operation
     * returns an empty list.
     * </p>
     * 
     * @param listAttachedGroupPoliciesRequest
     * @return listAttachedGroupPoliciesResult The response from the
     *         ListAttachedGroupPolicies service method, as returned by AWS
     *         Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws InvalidInputException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListAttachedGroupPoliciesResult listAttachedGroupPolicies(
            ListAttachedGroupPoliciesRequest listAttachedGroupPoliciesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all managed policies that are attached to the specified IAM role.
     * </p>
     * <p>
     * An IAM role can also have inline policies embedded with it. To list the
     * inline policies for a role, use the <a>ListRolePolicies</a> API. For
     * information about policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters. You can use the <code>PathPrefix</code>
     * parameter to limit the list of policies to only those matching the
     * specified path prefix. If there are no policies attached to the specified
     * role (or none that match the specified path prefix), the operation
     * returns an empty list.
     * </p>
     * 
     * @param listAttachedRolePoliciesRequest
     * @return listAttachedRolePoliciesResult The response from the
     *         ListAttachedRolePolicies service method, as returned by AWS
     *         Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws InvalidInputException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListAttachedRolePoliciesResult listAttachedRolePolicies(
            ListAttachedRolePoliciesRequest listAttachedRolePoliciesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all managed policies that are attached to the specified IAM user.
     * </p>
     * <p>
     * An IAM user can also have inline policies embedded with it. To list the
     * inline policies for a user, use the <a>ListUserPolicies</a> API. For
     * information about policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters. You can use the <code>PathPrefix</code>
     * parameter to limit the list of policies to only those matching the
     * specified path prefix. If there are no policies attached to the specified
     * group (or none that match the specified path prefix), the operation
     * returns an empty list.
     * </p>
     * 
     * @param listAttachedUserPoliciesRequest
     * @return listAttachedUserPoliciesResult The response from the
     *         ListAttachedUserPolicies service method, as returned by AWS
     *         Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws InvalidInputException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListAttachedUserPoliciesResult listAttachedUserPolicies(
            ListAttachedUserPoliciesRequest listAttachedUserPoliciesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all IAM users, groups, and roles that the specified managed policy
     * is attached to.
     * </p>
     * <p>
     * You can use the optional <code>EntityFilter</code> parameter to limit the
     * results to a particular type of entity (users, groups, or roles). For
     * example, to list only the roles that are attached to the specified
     * policy, set <code>EntityFilter</code> to <code>Role</code>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listEntitiesForPolicyRequest
     * @return listEntitiesForPolicyResult The response from the
     *         ListEntitiesForPolicy service method, as returned by AWS Identity
     *         and Access Management.
     * @throws NoSuchEntityException
     * @throws InvalidInputException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListEntitiesForPolicyResult listEntitiesForPolicy(
            ListEntitiesForPolicyRequest listEntitiesForPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the names of the inline policies that are embedded in the specified
     * IAM group.
     * </p>
     * <p>
     * An IAM group can also have managed policies attached to it. To list the
     * managed policies that are attached to a group, use
     * <a>ListAttachedGroupPolicies</a>. For more information about policies,
     * see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters. If there are no inline policies embedded
     * with the specified group, the operation returns an empty list.
     * </p>
     * 
     * @param listGroupPoliciesRequest
     * @return listGroupPoliciesResult The response from the ListGroupPolicies
     *         service method, as returned by AWS Identity and Access
     *         Management.
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListGroupPoliciesResult listGroupPolicies(ListGroupPoliciesRequest listGroupPoliciesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the IAM groups that have the specified path prefix.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listGroupsRequest
     * @return listGroupsResult The response from the ListGroups service method,
     *         as returned by AWS Identity and Access Management.
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListGroupsResult listGroups(ListGroupsRequest listGroupsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the IAM groups that the specified IAM user belongs to.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listGroupsForUserRequest
     * @return listGroupsForUserResult The response from the ListGroupsForUser
     *         service method, as returned by AWS Identity and Access
     *         Management.
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListGroupsForUserResult listGroupsForUser(ListGroupsForUserRequest listGroupsForUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the instance profiles that have the specified path prefix. If there
     * are none, the operation returns an empty list. For more information about
     * instance profiles, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"
     * >About Instance Profiles</a>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listInstanceProfilesRequest
     * @return listInstanceProfilesResult The response from the
     *         ListInstanceProfiles service method, as returned by AWS Identity
     *         and Access Management.
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListInstanceProfilesResult listInstanceProfiles(
            ListInstanceProfilesRequest listInstanceProfilesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the instance profiles that have the specified associated IAM role.
     * If there are none, the operation returns an empty list. For more
     * information about instance profiles, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"
     * >About Instance Profiles</a>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listInstanceProfilesForRoleRequest
     * @return listInstanceProfilesForRoleResult The response from the
     *         ListInstanceProfilesForRole service method, as returned by AWS
     *         Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListInstanceProfilesForRoleResult listInstanceProfilesForRole(
            ListInstanceProfilesForRoleRequest listInstanceProfilesForRoleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the MFA devices for an IAM user. If the request includes a IAM user
     * name, then this operation lists all the MFA devices associated with the
     * specified user. If you do not specify a user name, IAM determines the
     * user name implicitly based on the AWS access key ID signing the request
     * for this API.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listMFADevicesRequest
     * @return listMFADevicesResult The response from the ListMFADevices service
     *         method, as returned by AWS Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListMFADevicesResult listMFADevices(ListMFADevicesRequest listMFADevicesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists information about the IAM OpenID Connect (OIDC) provider resource
     * objects defined in the AWS account.
     * </p>
     * 
     * @param listOpenIDConnectProvidersRequest
     * @return listOpenIDConnectProvidersResult The response from the
     *         ListOpenIDConnectProviders service method, as returned by AWS
     *         Identity and Access Management.
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListOpenIDConnectProvidersResult listOpenIDConnectProviders(
            ListOpenIDConnectProvidersRequest listOpenIDConnectProvidersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all the managed policies that are available in your AWS account,
     * including your own customer-defined managed policies and all AWS managed
     * policies.
     * </p>
     * <p>
     * You can filter the list of policies that is returned using the optional
     * <code>OnlyAttached</code>, <code>Scope</code>, and
     * <code>PathPrefix</code> parameters. For example, to list only the
     * customer managed policies in your AWS account, set <code>Scope</code> to
     * <code>Local</code>. To list only AWS managed policies, set
     * <code>Scope</code> to <code>AWS</code>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * <p>
     * For more information about managed policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listPoliciesRequest
     * @return listPoliciesResult The response from the ListPolicies service
     *         method, as returned by AWS Identity and Access Management.
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListPoliciesResult listPolicies(ListPoliciesRequest listPoliciesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a list of policies that the IAM identity (user, group, or role)
     * can use to access each specified service.
     * </p>
     * <note>
     * <p>
     * This operation does not use other policy types when determining whether a
     * resource could access a service. These other policy types include
     * resource-based policies, access control lists, AWS Organizations
     * policies, IAM permissions boundaries, and AWS STS assume role policies.
     * It only applies permissions policy logic. For more about the evaluation
     * of policy types, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics"
     * >Evaluating Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * <p>
     * The list of policies returned by the operation depends on the ARN of the
     * identity that you provide.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>User</b> – The list of policies includes the managed and inline
     * policies that are attached to the user directly. The list also includes
     * any additional managed and inline policies that are attached to the group
     * to which the user belongs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Group</b> – The list of policies includes only the managed and inline
     * policies that are attached to the group directly. Policies that are
     * attached to the group’s user are not included.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Role</b> – The list of policies includes only the managed and inline
     * policies that are attached to the role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For each managed policy, this operation returns the ARN and policy name.
     * For each inline policy, it returns the policy name and the entity to
     * which it is attached. Inline policies do not have an ARN. For more
     * information about these policy types, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Policies that are attached to users and roles as permissions boundaries
     * are not returned. To view which managed policy is currently used to set
     * the permissions boundary for a user or role, use the <a>GetUser</a> or
     * <a>GetRole</a> operations.
     * </p>
     * 
     * @param listPoliciesGrantingServiceAccessRequest
     * @return listPoliciesGrantingServiceAccessResult The response from the
     *         ListPoliciesGrantingServiceAccess service method, as returned by
     *         AWS Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListPoliciesGrantingServiceAccessResult listPoliciesGrantingServiceAccess(
            ListPoliciesGrantingServiceAccessRequest listPoliciesGrantingServiceAccessRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists information about the versions of the specified managed policy,
     * including the version that is currently set as the policy's default
     * version.
     * </p>
     * <p>
     * For more information about managed policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listPolicyVersionsRequest
     * @return listPolicyVersionsResult The response from the ListPolicyVersions
     *         service method, as returned by AWS Identity and Access
     *         Management.
     * @throws NoSuchEntityException
     * @throws InvalidInputException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListPolicyVersionsResult listPolicyVersions(ListPolicyVersionsRequest listPolicyVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the names of the inline policies that are embedded in the specified
     * IAM role.
     * </p>
     * <p>
     * An IAM role can also have managed policies attached to it. To list the
     * managed policies that are attached to a role, use
     * <a>ListAttachedRolePolicies</a>. For more information about policies, see
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters. If there are no inline policies embedded
     * with the specified role, the operation returns an empty list.
     * </p>
     * 
     * @param listRolePoliciesRequest
     * @return listRolePoliciesResult The response from the ListRolePolicies
     *         service method, as returned by AWS Identity and Access
     *         Management.
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListRolePoliciesResult listRolePolicies(ListRolePoliciesRequest listRolePoliciesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the tags that are attached to the specified role. The returned list
     * of tags is sorted by tag key. For more information about tagging, see <a
     * href
     * ="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging
     * IAM Identities</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listRoleTagsRequest
     * @return listRoleTagsResult The response from the ListRoleTags service
     *         method, as returned by AWS Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListRoleTagsResult listRoleTags(ListRoleTagsRequest listRoleTagsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the IAM roles that have the specified path prefix. If there are
     * none, the operation returns an empty list. For more information about
     * roles, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"
     * >Working with Roles</a>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listRolesRequest
     * @return listRolesResult The response from the ListRoles service method,
     *         as returned by AWS Identity and Access Management.
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListRolesResult listRoles(ListRolesRequest listRolesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the SAML provider resource objects defined in IAM in the account.
     * </p>
     * <note>
     * <p>
     * This operation requires <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4</a>.
     * </p>
     * </note>
     * 
     * @param listSAMLProvidersRequest
     * @return listSAMLProvidersResult The response from the ListSAMLProviders
     *         service method, as returned by AWS Identity and Access
     *         Management.
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListSAMLProvidersResult listSAMLProviders(ListSAMLProvidersRequest listSAMLProvidersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the SSH public keys associated with the
     * specified IAM user. If none exists, the operation returns an empty list.
     * </p>
     * <p>
     * The SSH public keys returned by this operation are used only for
     * authenticating the IAM user to an AWS CodeCommit repository. For more
     * information about using SSH keys to authenticate to an AWS CodeCommit
     * repository, see <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html"
     * >Set up AWS CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit
     * User Guide</i>.
     * </p>
     * <p>
     * Although each user is limited to a small number of keys, you can still
     * paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listSSHPublicKeysRequest
     * @return listSSHPublicKeysResult The response from the ListSSHPublicKeys
     *         service method, as returned by AWS Identity and Access
     *         Management.
     * @throws NoSuchEntityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListSSHPublicKeysResult listSSHPublicKeys(ListSSHPublicKeysRequest listSSHPublicKeysRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the server certificates stored in IAM that have the specified path
     * prefix. If none exist, the operation returns an empty list.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * <p>
     * For more information about working with server certificates, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html"
     * >Working with Server Certificates</a> in the <i>IAM User Guide</i>. This
     * topic also includes a list of AWS services that can use the server
     * certificates that you manage with IAM.
     * </p>
     * 
     * @param listServerCertificatesRequest
     * @return listServerCertificatesResult The response from the
     *         ListServerCertificates service method, as returned by AWS
     *         Identity and Access Management.
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListServerCertificatesResult listServerCertificates(
            ListServerCertificatesRequest listServerCertificatesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the service-specific credentials associated
     * with the specified IAM user. If none exists, the operation returns an
     * empty list. The service-specific credentials returned by this operation
     * are used only for authenticating the IAM user to a specific service. For
     * more information about using service-specific credentials to authenticate
     * to an AWS service, see <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-gc.html"
     * >Set Up service-specific credentials</a> in the AWS CodeCommit User
     * Guide.
     * </p>
     * 
     * @param listServiceSpecificCredentialsRequest
     * @return listServiceSpecificCredentialsResult The response from the
     *         ListServiceSpecificCredentials service method, as returned by AWS
     *         Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws ServiceNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListServiceSpecificCredentialsResult listServiceSpecificCredentials(
            ListServiceSpecificCredentialsRequest listServiceSpecificCredentialsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the signing certificates associated with the
     * specified IAM user. If none exists, the operation returns an empty list.
     * </p>
     * <p>
     * Although each user is limited to a small number of signing certificates,
     * you can still paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the user name is
     * determined implicitly based on the AWS access key ID used to sign the
     * request for this API. This operation works for access keys under the AWS
     * account. Consequently, you can use this operation to manage AWS account
     * root user credentials even if the AWS account has no associated users.
     * </p>
     * 
     * @param listSigningCertificatesRequest
     * @return listSigningCertificatesResult The response from the
     *         ListSigningCertificates service method, as returned by AWS
     *         Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListSigningCertificatesResult listSigningCertificates(
            ListSigningCertificatesRequest listSigningCertificatesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the names of the inline policies embedded in the specified IAM
     * user.
     * </p>
     * <p>
     * An IAM user can also have managed policies attached to it. To list the
     * managed policies that are attached to a user, use
     * <a>ListAttachedUserPolicies</a>. For more information about policies, see
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters. If there are no inline policies embedded
     * with the specified user, the operation returns an empty list.
     * </p>
     * 
     * @param listUserPoliciesRequest
     * @return listUserPoliciesResult The response from the ListUserPolicies
     *         service method, as returned by AWS Identity and Access
     *         Management.
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListUserPoliciesResult listUserPolicies(ListUserPoliciesRequest listUserPoliciesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the tags that are attached to the specified user. The returned list
     * of tags is sorted by tag key. For more information about tagging, see <a
     * href
     * ="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging
     * IAM Identities</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listUserTagsRequest
     * @return listUserTagsResult The response from the ListUserTags service
     *         method, as returned by AWS Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListUserTagsResult listUserTags(ListUserTagsRequest listUserTagsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the IAM users that have the specified path prefix. If no path
     * prefix is specified, the operation returns all users in the AWS account.
     * If there are none, the operation returns an empty list.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listUsersRequest
     * @return listUsersResult The response from the ListUsers service method,
     *         as returned by AWS Identity and Access Management.
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListUsersResult listUsers(ListUsersRequest listUsersRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the virtual MFA devices defined in the AWS account by assignment
     * status. If you do not specify an assignment status, the operation returns
     * a list of all virtual MFA devices. Assignment status can be
     * <code>Assigned</code>, <code>Unassigned</code>, or <code>Any</code>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listVirtualMFADevicesRequest
     * @return listVirtualMFADevicesResult The response from the
     *         ListVirtualMFADevices service method, as returned by AWS Identity
     *         and Access Management.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ListVirtualMFADevicesResult listVirtualMFADevices(
            ListVirtualMFADevicesRequest listVirtualMFADevicesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds or updates an inline policy document that is embedded in the
     * specified IAM group.
     * </p>
     * <p>
     * A user can also have managed policies attached to it. To attach a managed
     * policy to a group, use <a>AttachGroupPolicy</a>. To create a new managed
     * policy, use <a>CreatePolicy</a>. For information about policies, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For information about limits on the number of inline policies that you
     * can embed in a group, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"
     * >Limitations on IAM Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Because policy documents can be large, you should use POST rather than
     * GET when calling <code>PutGroupPolicy</code>. For general information
     * about using the Query API with IAM, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html"
     * >Making Query Requests</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @param putGroupPolicyRequest
     * @throws LimitExceededException
     * @throws MalformedPolicyDocumentException
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void putGroupPolicy(PutGroupPolicyRequest putGroupPolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Adds or updates the policy that is specified as the IAM role's
     * permissions boundary. You can use an AWS managed policy or a customer
     * managed policy to set the boundary for a role. Use the boundary to
     * control the maximum permissions that the role can have. Setting a
     * permissions boundary is an advanced feature that can affect the
     * permissions for the role.
     * </p>
     * <p>
     * You cannot set the boundary for a service-linked role.
     * </p>
     * <important>
     * <p>
     * Policies used as permissions boundaries do not provide permissions. You
     * must also attach a permissions policy to the role. To learn how the
     * effective permissions for a role are evaluated, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html"
     * >IAM JSON Policy Evaluation Logic</a> in the IAM User Guide.
     * </p>
     * </important>
     * 
     * @param putRolePermissionsBoundaryRequest
     * @throws NoSuchEntityException
     * @throws InvalidInputException
     * @throws UnmodifiableEntityException
     * @throws PolicyNotAttachableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void putRolePermissionsBoundary(
            PutRolePermissionsBoundaryRequest putRolePermissionsBoundaryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds or updates an inline policy document that is embedded in the
     * specified IAM role.
     * </p>
     * <p>
     * When you embed an inline policy in a role, the inline policy is used as
     * part of the role's access (permissions) policy. The role's trust policy
     * is created at the same time as the role, using <a>CreateRole</a>. You can
     * update a role's trust policy using <a>UpdateAssumeRolePolicy</a>. For
     * more information about IAM roles, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html"
     * >Using Roles to Delegate Permissions and Federate Identities</a>.
     * </p>
     * <p>
     * A role can also have a managed policy attached to it. To attach a managed
     * policy to a role, use <a>AttachRolePolicy</a>. To create a new managed
     * policy, use <a>CreatePolicy</a>. For information about policies, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For information about limits on the number of inline policies that you
     * can embed with a role, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"
     * >Limitations on IAM Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Because policy documents can be large, you should use POST rather than
     * GET when calling <code>PutRolePolicy</code>. For general information
     * about using the Query API with IAM, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html"
     * >Making Query Requests</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @param putRolePolicyRequest
     * @throws LimitExceededException
     * @throws MalformedPolicyDocumentException
     * @throws NoSuchEntityException
     * @throws UnmodifiableEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void putRolePolicy(PutRolePolicyRequest putRolePolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Adds or updates the policy that is specified as the IAM user's
     * permissions boundary. You can use an AWS managed policy or a customer
     * managed policy to set the boundary for a user. Use the boundary to
     * control the maximum permissions that the user can have. Setting a
     * permissions boundary is an advanced feature that can affect the
     * permissions for the user.
     * </p>
     * <important>
     * <p>
     * Policies that are used as permissions boundaries do not provide
     * permissions. You must also attach a permissions policy to the user. To
     * learn how the effective permissions for a user are evaluated, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html"
     * >IAM JSON Policy Evaluation Logic</a> in the IAM User Guide.
     * </p>
     * </important>
     * 
     * @param putUserPermissionsBoundaryRequest
     * @throws NoSuchEntityException
     * @throws InvalidInputException
     * @throws PolicyNotAttachableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void putUserPermissionsBoundary(
            PutUserPermissionsBoundaryRequest putUserPermissionsBoundaryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds or updates an inline policy document that is embedded in the
     * specified IAM user.
     * </p>
     * <p>
     * An IAM user can also have a managed policy attached to it. To attach a
     * managed policy to a user, use <a>AttachUserPolicy</a>. To create a new
     * managed policy, use <a>CreatePolicy</a>. For information about policies,
     * see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For information about limits on the number of inline policies that you
     * can embed in a user, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"
     * >Limitations on IAM Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Because policy documents can be large, you should use POST rather than
     * GET when calling <code>PutUserPolicy</code>. For general information
     * about using the Query API with IAM, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html"
     * >Making Query Requests</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @param putUserPolicyRequest
     * @throws LimitExceededException
     * @throws MalformedPolicyDocumentException
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void putUserPolicy(PutUserPolicyRequest putUserPolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Removes the specified client ID (also known as audience) from the list of
     * client IDs registered for the specified IAM OpenID Connect (OIDC)
     * provider resource object.
     * </p>
     * <p>
     * This operation is idempotent; it does not fail or return an error if you
     * try to remove a client ID that does not exist.
     * </p>
     * 
     * @param removeClientIDFromOpenIDConnectProviderRequest
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void removeClientIDFromOpenIDConnectProvider(
            RemoveClientIDFromOpenIDConnectProviderRequest removeClientIDFromOpenIDConnectProviderRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes the specified IAM role from the specified EC2 instance profile.
     * </p>
     * <important>
     * <p>
     * Make sure that you do not have any Amazon EC2 instances running with the
     * role you are about to remove from the instance profile. Removing a role
     * from an instance profile that is associated with a running instance might
     * break any applications running on the instance.
     * </p>
     * </important>
     * <p>
     * For more information about IAM roles, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"
     * >Working with Roles</a>. For more information about instance profiles, go
     * to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"
     * >About Instance Profiles</a>.
     * </p>
     * 
     * @param removeRoleFromInstanceProfileRequest
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws UnmodifiableEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void removeRoleFromInstanceProfile(
            RemoveRoleFromInstanceProfileRequest removeRoleFromInstanceProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes the specified user from the specified group.
     * </p>
     * 
     * @param removeUserFromGroupRequest
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void removeUserFromGroup(RemoveUserFromGroupRequest removeUserFromGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Resets the password for a service-specific credential. The new password
     * is AWS generated and cryptographically strong. It cannot be configured by
     * the user. Resetting the password immediately invalidates the previous
     * password associated with this user.
     * </p>
     * 
     * @param resetServiceSpecificCredentialRequest
     * @return resetServiceSpecificCredentialResult The response from the
     *         ResetServiceSpecificCredential service method, as returned by AWS
     *         Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    ResetServiceSpecificCredentialResult resetServiceSpecificCredential(
            ResetServiceSpecificCredentialRequest resetServiceSpecificCredentialRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Synchronizes the specified MFA device with its IAM resource object on the
     * AWS servers.
     * </p>
     * <p>
     * For more information about creating and working with virtual MFA devices,
     * go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html"
     * >Using a Virtual MFA Device</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param resyncMFADeviceRequest
     * @throws InvalidAuthenticationCodeException
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void resyncMFADevice(ResyncMFADeviceRequest resyncMFADeviceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the specified version of the specified policy as the policy's
     * default (operative) version.
     * </p>
     * <p>
     * This operation affects all users, groups, and roles that the policy is
     * attached to. To list the users, groups, and roles that the policy is
     * attached to, use the <a>ListEntitiesForPolicy</a> API.
     * </p>
     * <p>
     * For information about managed policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param setDefaultPolicyVersionRequest
     * @throws NoSuchEntityException
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void setDefaultPolicyVersion(SetDefaultPolicyVersionRequest setDefaultPolicyVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the specified version of the global endpoint token as the token
     * version used for the AWS account.
     * </p>
     * <p>
     * By default, AWS Security Token Service (STS) is available as a global
     * service, and all STS requests go to a single endpoint at
     * <code>https://sts.amazonaws.com</code>. AWS recommends using Regional STS
     * endpoints to reduce latency, build in redundancy, and increase session
     * token availability. For information about Regional endpoints for STS, see
     * <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande.html#sts_region">AWS
     * Regions and Endpoints</a> in the <i>AWS General Reference</i>.
     * </p>
     * <p>
     * If you make an STS call to the global endpoint, the resulting session
     * tokens might be valid in some Regions but not others. It depends on the
     * version that is set in this operation. Version 1 tokens are valid only in
     * AWS Regions that are available by default. These tokens do not work in
     * manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2
     * tokens are valid in all Regions. However, version 2 tokens are longer and
     * might affect systems where you temporarily store tokens. For information,
     * see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     * >Activating and Deactivating STS in an AWS Region</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * To view the current session token version, see the
     * <code>GlobalEndpointTokenVersion</code> entry in the response of the
     * <a>GetAccountSummary</a> operation.
     * </p>
     * 
     * @param setSecurityTokenServicePreferencesRequest
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void setSecurityTokenServicePreferences(
            SetSecurityTokenServicePreferencesRequest setSecurityTokenServicePreferencesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Simulate how a set of IAM policies and optionally a resource-based policy
     * works with a list of API operations and AWS resources to determine the
     * policies' effective permissions. The policies are provided as strings.
     * </p>
     * <p>
     * The simulation does not perform the API operations; it only checks the
     * authorization to determine if the simulated policies allow or deny the
     * operations.
     * </p>
     * <p>
     * If you want to simulate existing policies that are attached to an IAM
     * user, group, or role, use <a>SimulatePrincipalPolicy</a> instead.
     * </p>
     * <p>
     * Context keys are variables that are maintained by AWS and its services
     * and which provide details about the context of an API query request. You
     * can use the <code>Condition</code> element of an IAM policy to evaluate
     * context keys. To get the list of context keys that the policies require
     * for correct simulation, use <a>GetContextKeysForCustomPolicy</a>.
     * </p>
     * <p>
     * If the output is long, you can use <code>MaxItems</code> and
     * <code>Marker</code> parameters to paginate the results.
     * </p>
     * 
     * @param simulateCustomPolicyRequest
     * @return simulateCustomPolicyResult The response from the
     *         SimulateCustomPolicy service method, as returned by AWS Identity
     *         and Access Management.
     * @throws InvalidInputException
     * @throws PolicyEvaluationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    SimulateCustomPolicyResult simulateCustomPolicy(
            SimulateCustomPolicyRequest simulateCustomPolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Simulate how a set of IAM policies attached to an IAM entity works with a
     * list of API operations and AWS resources to determine the policies'
     * effective permissions. The entity can be an IAM user, group, or role. If
     * you specify a user, then the simulation also includes all of the policies
     * that are attached to groups that the user belongs to.
     * </p>
     * <p>
     * You can optionally include a list of one or more additional policies
     * specified as strings to include in the simulation. If you want to
     * simulate only policies specified as strings, use
     * <a>SimulateCustomPolicy</a> instead.
     * </p>
     * <p>
     * You can also optionally include one resource-based policy to be evaluated
     * with each of the resources included in the simulation.
     * </p>
     * <p>
     * The simulation does not perform the API operations; it only checks the
     * authorization to determine if the simulated policies allow or deny the
     * operations.
     * </p>
     * <p>
     * <b>Note:</b> This API discloses information about the permissions granted
     * to other users. If you do not want users to see other user's permissions,
     * then consider allowing them to use <a>SimulateCustomPolicy</a> instead.
     * </p>
     * <p>
     * Context keys are variables maintained by AWS and its services that
     * provide details about the context of an API query request. You can use
     * the <code>Condition</code> element of an IAM policy to evaluate context
     * keys. To get the list of context keys that the policies require for
     * correct simulation, use <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     * <p>
     * If the output is long, you can use the <code>MaxItems</code> and
     * <code>Marker</code> parameters to paginate the results.
     * </p>
     * 
     * @param simulatePrincipalPolicyRequest
     * @return simulatePrincipalPolicyResult The response from the
     *         SimulatePrincipalPolicy service method, as returned by AWS
     *         Identity and Access Management.
     * @throws NoSuchEntityException
     * @throws InvalidInputException
     * @throws PolicyEvaluationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    SimulatePrincipalPolicyResult simulatePrincipalPolicy(
            SimulatePrincipalPolicyRequest simulatePrincipalPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds one or more tags to an IAM role. The role can be a regular role or a
     * service-linked role. If a tag with the same key name already exists, then
     * that tag is overwritten with the new value.
     * </p>
     * <p>
     * A tag consists of a key name and an associated value. By assigning tags
     * to your resources, you can do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Administrative grouping and discovery</b> - Attach tags to resources
     * to aid in organization and search. For example, you could search for all
     * resources with the key name <i>Project</i> and the value
     * <i>MyImportantProject</i>. Or search for all resources with the key name
     * <i>Cost Center</i> and the value <i>41200</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Access control</b> - Reference tags in IAM user-based and
     * resource-based policies. You can use tags to restrict access to only an
     * IAM user or role that has a specified tag attached. You can also restrict
     * access to only those resources that have a certain tag attached. For
     * examples of policies that show how to use tags to control access, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html">
     * Control Access Using IAM Tags</a> in the <i>IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Cost allocation</b> - Use tags to help track which individuals and
     * teams are using which AWS resources.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Make sure that you have no invalid tags and that you do not exceed the
     * allowed number of tags per role. In either case, the entire request fails
     * and <i>no</i> tags are added to the role.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS always interprets the tag <code>Value</code> as a single string. If
     * you need to store an array, you can store comma-separated values in the
     * string. However, you must interpret the value in your code.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     * >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param tagRoleRequest
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws InvalidInputException
     * @throws ConcurrentModificationException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void tagRole(TagRoleRequest tagRoleRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Adds one or more tags to an IAM user. If a tag with the same key name
     * already exists, then that tag is overwritten with the new value.
     * </p>
     * <p>
     * A tag consists of a key name and an associated value. By assigning tags
     * to your resources, you can do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Administrative grouping and discovery</b> - Attach tags to resources
     * to aid in organization and search. For example, you could search for all
     * resources with the key name <i>Project</i> and the value
     * <i>MyImportantProject</i>. Or search for all resources with the key name
     * <i>Cost Center</i> and the value <i>41200</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Access control</b> - Reference tags in IAM user-based and
     * resource-based policies. You can use tags to restrict access to only an
     * IAM requesting user or to a role that has a specified tag attached. You
     * can also restrict access to only those resources that have a certain tag
     * attached. For examples of policies that show how to use tags to control
     * access, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html"
     * >Control Access Using IAM Tags</a> in the <i>IAM User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Cost allocation</b> - Use tags to help track which individuals and
     * teams are using which AWS resources.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Make sure that you have no invalid tags and that you do not exceed the
     * allowed number of tags per role. In either case, the entire request fails
     * and <i>no</i> tags are added to the role.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS always interprets the tag <code>Value</code> as a single string. If
     * you need to store an array, you can store comma-separated values in the
     * string. However, you must interpret the value in your code.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     * >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param tagUserRequest
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws InvalidInputException
     * @throws ConcurrentModificationException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void tagUser(TagUserRequest tagUserRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Removes the specified tags from the role. For more information about
     * tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     * >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param untagRoleRequest
     * @throws NoSuchEntityException
     * @throws ConcurrentModificationException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void untagRole(UntagRoleRequest untagRoleRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Removes the specified tags from the user. For more information about
     * tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html"
     * >Tagging IAM Identities</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param untagUserRequest
     * @throws NoSuchEntityException
     * @throws ConcurrentModificationException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void untagUser(UntagUserRequest untagUserRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Changes the status of the specified access key from Active to Inactive,
     * or vice versa. This operation can be used to disable a user's key as part
     * of a key rotation workflow.
     * </p>
     * <p>
     * If the <code>UserName</code> is not specified, the user name is
     * determined implicitly based on the AWS access key ID used to sign the
     * request. This operation works for access keys under the AWS account.
     * Consequently, you can use this operation to manage AWS account root user
     * credentials even if the AWS account has no associated users.
     * </p>
     * <p>
     * For information about rotating keys, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/ManagingCredentials.html"
     * >Managing Keys and Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param updateAccessKeyRequest
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void updateAccessKey(UpdateAccessKeyRequest updateAccessKeyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the password policy settings for the AWS account.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * This operation does not support partial updates. No parameters are
     * required, but if you do not specify a parameter, that parameter's value
     * reverts to its default value. See the <b>Request Parameters</b> section
     * for each parameter's default value. Also note that some parameters do not
     * allow the default parameter to be explicitly set. Instead, to invoke the
     * default value, do not include that parameter when you invoke the
     * operation.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * For more information about using a password policy, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html"
     * >Managing an IAM Password Policy</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param updateAccountPasswordPolicyRequest
     * @throws NoSuchEntityException
     * @throws MalformedPolicyDocumentException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void updateAccountPasswordPolicy(
            UpdateAccountPasswordPolicyRequest updateAccountPasswordPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the policy that grants an IAM entity permission to assume a role.
     * This is typically referred to as the "role trust policy". For more
     * information about roles, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html"
     * >Using Roles to Delegate Permissions and Federate Identities</a>.
     * </p>
     * 
     * @param updateAssumeRolePolicyRequest
     * @throws NoSuchEntityException
     * @throws MalformedPolicyDocumentException
     * @throws LimitExceededException
     * @throws UnmodifiableEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void updateAssumeRolePolicy(UpdateAssumeRolePolicyRequest updateAssumeRolePolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the name and/or the path of the specified IAM group.
     * </p>
     * <important>
     * <p>
     * You should understand the implications of changing a group's path or
     * name. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_WorkingWithGroupsAndUsers.html"
     * >Renaming Users and Groups</a> in the <i>IAM User Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * The person making the request (the principal), must have permission to
     * change the role group with the old name and the new name. For example, to
     * change the group named <code>Managers</code> to <code>MGRs</code>, the
     * principal must have a policy that allows them to update both groups. If
     * the principal has permission to update the <code>Managers</code> group,
     * but not the <code>MGRs</code> group, then the update fails. For more
     * information about permissions, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html"
     * >Access Management</a>.
     * </p>
     * </note>
     * 
     * @param updateGroupRequest
     * @throws NoSuchEntityException
     * @throws EntityAlreadyExistsException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void updateGroup(UpdateGroupRequest updateGroupRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Changes the password for the specified IAM user.
     * </p>
     * <p>
     * IAM users can change their own passwords by calling
     * <a>ChangePassword</a>. For more information about modifying passwords,
     * see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html"
     * >Managing Passwords</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param updateLoginProfileRequest
     * @throws EntityTemporarilyUnmodifiableException
     * @throws NoSuchEntityException
     * @throws PasswordPolicyViolationException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void updateLoginProfile(UpdateLoginProfileRequest updateLoginProfileRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Replaces the existing list of server certificate thumbprints associated
     * with an OpenID Connect (OIDC) provider resource object with a new list of
     * thumbprints.
     * </p>
     * <p>
     * The list that you pass with this operation completely replaces the
     * existing list of thumbprints. (The lists are not merged.)
     * </p>
     * <p>
     * Typically, you need to update a thumbprint only when the identity
     * provider's certificate changes, which occurs rarely. However, if the
     * provider's certificate <i>does</i> change, any attempt to assume an IAM
     * role that specifies the OIDC provider as a principal fails until the
     * certificate thumbprint is updated.
     * </p>
     * <note>
     * <p>
     * Trust for the OIDC provider is derived from the provider's certificate
     * and is validated by the thumbprint. Therefore, it is best to limit access
     * to the <code>UpdateOpenIDConnectProviderThumbprint</code> operation to
     * highly privileged users.
     * </p>
     * </note>
     * 
     * @param updateOpenIDConnectProviderThumbprintRequest
     * @throws InvalidInputException
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void updateOpenIDConnectProviderThumbprint(
            UpdateOpenIDConnectProviderThumbprintRequest updateOpenIDConnectProviderThumbprintRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the description or maximum session duration setting of a role.
     * </p>
     * 
     * @param updateRoleRequest
     * @return updateRoleResult The response from the UpdateRole service method,
     *         as returned by AWS Identity and Access Management.
     * @throws UnmodifiableEntityException
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    UpdateRoleResult updateRole(UpdateRoleRequest updateRoleRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Use <a>UpdateRole</a> instead.
     * </p>
     * <p>
     * Modifies only the description of a role. This operation performs the same
     * function as the <code>Description</code> parameter in the
     * <code>UpdateRole</code> operation.
     * </p>
     * 
     * @param updateRoleDescriptionRequest
     * @return updateRoleDescriptionResult The response from the
     *         UpdateRoleDescription service method, as returned by AWS Identity
     *         and Access Management.
     * @throws NoSuchEntityException
     * @throws UnmodifiableEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    UpdateRoleDescriptionResult updateRoleDescription(
            UpdateRoleDescriptionRequest updateRoleDescriptionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the metadata document for an existing SAML provider resource
     * object.
     * </p>
     * <note>
     * <p>
     * This operation requires <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4</a>.
     * </p>
     * </note>
     * 
     * @param updateSAMLProviderRequest
     * @return updateSAMLProviderResult The response from the UpdateSAMLProvider
     *         service method, as returned by AWS Identity and Access
     *         Management.
     * @throws NoSuchEntityException
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    UpdateSAMLProviderResult updateSAMLProvider(UpdateSAMLProviderRequest updateSAMLProviderRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the status of an IAM user's SSH public key to active or inactive.
     * SSH public keys that are inactive cannot be used for authentication. This
     * operation can be used to disable a user's SSH public key as part of a key
     * rotation work flow.
     * </p>
     * <p>
     * The SSH public key affected by this operation is used only for
     * authenticating the associated IAM user to an AWS CodeCommit repository.
     * For more information about using SSH keys to authenticate to an AWS
     * CodeCommit repository, see <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html"
     * >Set up AWS CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit
     * User Guide</i>.
     * </p>
     * 
     * @param updateSSHPublicKeyRequest
     * @throws NoSuchEntityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void updateSSHPublicKey(UpdateSSHPublicKeyRequest updateSSHPublicKeyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the name and/or the path of the specified server certificate
     * stored in IAM.
     * </p>
     * <p>
     * For more information about working with server certificates, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html"
     * >Working with Server Certificates</a> in the <i>IAM User Guide</i>. This
     * topic also includes a list of AWS services that can use the server
     * certificates that you manage with IAM.
     * </p>
     * <important>
     * <p>
     * You should understand the implications of changing a server certificate's
     * path or name. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs_manage.html#RenamingServerCerts"
     * >Renaming a Server Certificate</a> in the <i>IAM User Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * The person making the request (the principal), must have permission to
     * change the server certificate with the old name and the new name. For
     * example, to change the certificate named <code>ProductionCert</code> to
     * <code>ProdCert</code>, the principal must have a policy that allows them
     * to update both certificates. If the principal has permission to update
     * the <code>ProductionCert</code> group, but not the <code>ProdCert</code>
     * certificate, then the update fails. For more information about
     * permissions, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html"
     * >Access Management</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @param updateServerCertificateRequest
     * @throws NoSuchEntityException
     * @throws EntityAlreadyExistsException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void updateServerCertificate(UpdateServerCertificateRequest updateServerCertificateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the status of a service-specific credential to <code>Active</code>
     * or <code>Inactive</code>. Service-specific credentials that are inactive
     * cannot be used for authentication to the service. This operation can be
     * used to disable a user's service-specific credential as part of a
     * credential rotation work flow.
     * </p>
     * 
     * @param updateServiceSpecificCredentialRequest
     * @throws NoSuchEntityException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void updateServiceSpecificCredential(
            UpdateServiceSpecificCredentialRequest updateServiceSpecificCredentialRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Changes the status of the specified user signing certificate from active
     * to disabled, or vice versa. This operation can be used to disable an IAM
     * user's signing certificate as part of a certificate rotation work flow.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the user name is
     * determined implicitly based on the AWS access key ID used to sign the
     * request. This operation works for access keys under the AWS account.
     * Consequently, you can use this operation to manage AWS account root user
     * credentials even if the AWS account has no associated users.
     * </p>
     * 
     * @param updateSigningCertificateRequest
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void updateSigningCertificate(UpdateSigningCertificateRequest updateSigningCertificateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the name and/or the path of the specified IAM user.
     * </p>
     * <important>
     * <p>
     * You should understand the implications of changing an IAM user's path or
     * name. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_users_manage.html#id_users_renaming"
     * >Renaming an IAM User</a> and <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_groups_manage_rename.html"
     * >Renaming an IAM Group</a> in the <i>IAM User Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * To change a user name, the requester must have appropriate permissions on
     * both the source object and the target object. For example, to change Bob
     * to Robert, the entity making the request must have permission on Bob and
     * Robert, or must have permission on all (*). For more information about
     * permissions, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/PermissionsAndPolicies.html"
     * >Permissions and Policies</a>.
     * </p>
     * </note>
     * 
     * @param updateUserRequest
     * @throws NoSuchEntityException
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     * @throws EntityTemporarilyUnmodifiableException
     * @throws ConcurrentModificationException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    void updateUser(UpdateUserRequest updateUserRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Uploads an SSH public key and associates it with the specified IAM user.
     * </p>
     * <p>
     * The SSH public key uploaded by this operation can be used only for
     * authenticating the associated IAM user to an AWS CodeCommit repository.
     * For more information about using SSH keys to authenticate to an AWS
     * CodeCommit repository, see <a href=
     * "https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html"
     * >Set up AWS CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit
     * User Guide</i>.
     * </p>
     * 
     * @param uploadSSHPublicKeyRequest
     * @return uploadSSHPublicKeyResult The response from the UploadSSHPublicKey
     *         service method, as returned by AWS Identity and Access
     *         Management.
     * @throws LimitExceededException
     * @throws NoSuchEntityException
     * @throws InvalidPublicKeyException
     * @throws DuplicateSSHPublicKeyException
     * @throws UnrecognizedPublicKeyEncodingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    UploadSSHPublicKeyResult uploadSSHPublicKey(UploadSSHPublicKeyRequest uploadSSHPublicKeyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Uploads a server certificate entity for the AWS account. The server
     * certificate entity includes a public key certificate, a private key, and
     * an optional certificate chain, which should all be PEM-encoded.
     * </p>
     * <p>
     * We recommend that you use <a href="https://docs.aws.amazon.com/acm/">AWS
     * Certificate Manager</a> to provision, manage, and deploy your server
     * certificates. With ACM you can request a certificate, deploy it to AWS
     * resources, and let ACM handle certificate renewals for you. Certificates
     * provided by ACM are free. For more information about using ACM, see the
     * <a href="https://docs.aws.amazon.com/acm/latest/userguide/">AWS
     * Certificate Manager User Guide</a>.
     * </p>
     * <p>
     * For more information about working with server certificates, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html"
     * >Working with Server Certificates</a> in the <i>IAM User Guide</i>. This
     * topic includes a list of AWS services that can use the server
     * certificates that you manage with IAM.
     * </p>
     * <p>
     * For information about the number of server certificates you can upload,
     * see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html"
     * >Limitations on IAM Entities and Objects</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * Because the body of the public key certificate, private key, and the
     * certificate chain can be large, you should use POST rather than GET when
     * calling <code>UploadServerCertificate</code>. For information about
     * setting up signatures and authorization through the API, go to <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html"
     * >Signing AWS API Requests</a> in the <i>AWS General Reference</i>. For
     * general information about using the Query API with IAM, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/programming.html"
     * >Calling the API by Making HTTP Query Requests</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * </note>
     * 
     * @param uploadServerCertificateRequest
     * @return uploadServerCertificateResult The response from the
     *         UploadServerCertificate service method, as returned by AWS
     *         Identity and Access Management.
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     * @throws MalformedCertificateException
     * @throws KeyPairMismatchException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    UploadServerCertificateResult uploadServerCertificate(
            UploadServerCertificateRequest uploadServerCertificateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Uploads an X.509 signing certificate and associates it with the specified
     * IAM user. Some AWS services use X.509 signing certificates to validate
     * requests that are signed with a corresponding private key. When you
     * upload the certificate, its default status is <code>Active</code>.
     * </p>
     * <p>
     * If the <code>UserName</code> is not specified, the IAM user name is
     * determined implicitly based on the AWS access key ID used to sign the
     * request. This operation works for access keys under the AWS account.
     * Consequently, you can use this operation to manage AWS account root user
     * credentials even if the AWS account has no associated users.
     * </p>
     * <note>
     * <p>
     * Because the body of an X.509 certificate can be large, you should use
     * POST rather than GET when calling <code>UploadSigningCertificate</code>.
     * For information about setting up signatures and authorization through the
     * API, go to <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html"
     * >Signing AWS API Requests</a> in the <i>AWS General Reference</i>. For
     * general information about using the Query API with IAM, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html"
     * >Making Query Requests</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @param uploadSigningCertificateRequest
     * @return uploadSigningCertificateResult The response from the
     *         UploadSigningCertificate service method, as returned by AWS
     *         Identity and Access Management.
     * @throws LimitExceededException
     * @throws EntityAlreadyExistsException
     * @throws MalformedCertificateException
     * @throws InvalidCertificateException
     * @throws DuplicateCertificateException
     * @throws NoSuchEntityException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Identity and Access Management indicating either a problem
     *             with the data in the request, or a server side issue.
     */
    UploadSigningCertificateResult uploadSigningCertificate(
            UploadSigningCertificateRequest uploadSigningCertificateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request The originally executed request.
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
