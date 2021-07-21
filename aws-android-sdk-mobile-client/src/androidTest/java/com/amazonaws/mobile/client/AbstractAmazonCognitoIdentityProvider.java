/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates.
 * All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobile.client;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.regions.Region;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider;
import com.amazonaws.services.cognitoidentityprovider.model.*;

public class AbstractAmazonCognitoIdentityProvider implements AmazonCognitoIdentityProvider {
    @Override
    public void setEndpoint(String endpoint) throws IllegalArgumentException {

    }

    @Override
    public void setRegion(Region region) throws IllegalArgumentException {

    }

    @Override
    public AddCustomAttributesResult addCustomAttributes(AddCustomAttributesRequest addCustomAttributesRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public void adminAddUserToGroup(AdminAddUserToGroupRequest adminAddUserToGroupRequest) throws AmazonClientException, AmazonServiceException {

    }

    @Override
    public AdminConfirmSignUpResult adminConfirmSignUp(AdminConfirmSignUpRequest adminConfirmSignUpRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public AdminCreateUserResult adminCreateUser(AdminCreateUserRequest adminCreateUserRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public void adminDeleteUser(AdminDeleteUserRequest adminDeleteUserRequest) throws AmazonClientException, AmazonServiceException {

    }

    @Override
    public AdminDeleteUserAttributesResult adminDeleteUserAttributes(AdminDeleteUserAttributesRequest adminDeleteUserAttributesRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public AdminDisableProviderForUserResult adminDisableProviderForUser(AdminDisableProviderForUserRequest adminDisableProviderForUserRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public AdminDisableUserResult adminDisableUser(AdminDisableUserRequest adminDisableUserRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public AdminEnableUserResult adminEnableUser(AdminEnableUserRequest adminEnableUserRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public void adminForgetDevice(AdminForgetDeviceRequest adminForgetDeviceRequest) throws AmazonClientException, AmazonServiceException {

    }

    @Override
    public AdminGetDeviceResult adminGetDevice(AdminGetDeviceRequest adminGetDeviceRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public AdminGetUserResult adminGetUser(AdminGetUserRequest adminGetUserRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public AdminInitiateAuthResult adminInitiateAuth(AdminInitiateAuthRequest adminInitiateAuthRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public AdminLinkProviderForUserResult adminLinkProviderForUser(AdminLinkProviderForUserRequest adminLinkProviderForUserRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public AdminListDevicesResult adminListDevices(AdminListDevicesRequest adminListDevicesRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public AdminListGroupsForUserResult adminListGroupsForUser(AdminListGroupsForUserRequest adminListGroupsForUserRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public AdminListUserAuthEventsResult adminListUserAuthEvents(AdminListUserAuthEventsRequest adminListUserAuthEventsRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public void adminRemoveUserFromGroup(AdminRemoveUserFromGroupRequest adminRemoveUserFromGroupRequest) throws AmazonClientException, AmazonServiceException {

    }

    @Override
    public AdminResetUserPasswordResult adminResetUserPassword(AdminResetUserPasswordRequest adminResetUserPasswordRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public AdminRespondToAuthChallengeResult adminRespondToAuthChallenge(AdminRespondToAuthChallengeRequest adminRespondToAuthChallengeRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public AdminSetUserMFAPreferenceResult adminSetUserMFAPreference(AdminSetUserMFAPreferenceRequest adminSetUserMFAPreferenceRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public AdminSetUserPasswordResult adminSetUserPassword(AdminSetUserPasswordRequest adminSetUserPasswordRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public AdminSetUserSettingsResult adminSetUserSettings(AdminSetUserSettingsRequest adminSetUserSettingsRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public AdminUpdateAuthEventFeedbackResult adminUpdateAuthEventFeedback(AdminUpdateAuthEventFeedbackRequest adminUpdateAuthEventFeedbackRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public AdminUpdateDeviceStatusResult adminUpdateDeviceStatus(AdminUpdateDeviceStatusRequest adminUpdateDeviceStatusRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public AdminUpdateUserAttributesResult adminUpdateUserAttributes(AdminUpdateUserAttributesRequest adminUpdateUserAttributesRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public AdminUserGlobalSignOutResult adminUserGlobalSignOut(AdminUserGlobalSignOutRequest adminUserGlobalSignOutRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public AssociateSoftwareTokenResult associateSoftwareToken(AssociateSoftwareTokenRequest associateSoftwareTokenRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public ChangePasswordResult changePassword(ChangePasswordRequest changePasswordRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public ConfirmDeviceResult confirmDevice(ConfirmDeviceRequest confirmDeviceRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public ConfirmForgotPasswordResult confirmForgotPassword(ConfirmForgotPasswordRequest confirmForgotPasswordRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public ConfirmSignUpResult confirmSignUp(ConfirmSignUpRequest confirmSignUpRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public CreateGroupResult createGroup(CreateGroupRequest createGroupRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public CreateIdentityProviderResult createIdentityProvider(CreateIdentityProviderRequest createIdentityProviderRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public CreateResourceServerResult createResourceServer(CreateResourceServerRequest createResourceServerRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public CreateUserImportJobResult createUserImportJob(CreateUserImportJobRequest createUserImportJobRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public CreateUserPoolResult createUserPool(CreateUserPoolRequest createUserPoolRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public CreateUserPoolClientResult createUserPoolClient(CreateUserPoolClientRequest createUserPoolClientRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public CreateUserPoolDomainResult createUserPoolDomain(CreateUserPoolDomainRequest createUserPoolDomainRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public void deleteGroup(DeleteGroupRequest deleteGroupRequest) throws AmazonClientException, AmazonServiceException {

    }

    @Override
    public void deleteIdentityProvider(DeleteIdentityProviderRequest deleteIdentityProviderRequest) throws AmazonClientException, AmazonServiceException {

    }

    @Override
    public void deleteResourceServer(DeleteResourceServerRequest deleteResourceServerRequest) throws AmazonClientException, AmazonServiceException {

    }

    @Override
    public void deleteUser(DeleteUserRequest deleteUserRequest) throws AmazonClientException,
            AmazonServiceException {

    }

    @Override
    public DeleteUserAttributesResult deleteUserAttributes(DeleteUserAttributesRequest deleteUserAttributesRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public void deleteUserPool(DeleteUserPoolRequest deleteUserPoolRequest) throws AmazonClientException, AmazonServiceException {

    }

    @Override
    public void deleteUserPoolClient(DeleteUserPoolClientRequest deleteUserPoolClientRequest) throws AmazonClientException, AmazonServiceException {

    }

    @Override
    public DeleteUserPoolDomainResult deleteUserPoolDomain(DeleteUserPoolDomainRequest deleteUserPoolDomainRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public DescribeIdentityProviderResult describeIdentityProvider(DescribeIdentityProviderRequest describeIdentityProviderRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public DescribeResourceServerResult describeResourceServer(DescribeResourceServerRequest describeResourceServerRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public DescribeRiskConfigurationResult describeRiskConfiguration(DescribeRiskConfigurationRequest describeRiskConfigurationRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public DescribeUserImportJobResult describeUserImportJob(DescribeUserImportJobRequest describeUserImportJobRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public DescribeUserPoolResult describeUserPool(DescribeUserPoolRequest describeUserPoolRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public DescribeUserPoolClientResult describeUserPoolClient(DescribeUserPoolClientRequest describeUserPoolClientRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public DescribeUserPoolDomainResult describeUserPoolDomain(DescribeUserPoolDomainRequest describeUserPoolDomainRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public void forgetDevice(ForgetDeviceRequest forgetDeviceRequest) throws AmazonClientException, AmazonServiceException {

    }

    @Override
    public ForgotPasswordResult forgotPassword(ForgotPasswordRequest forgotPasswordRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public GetCSVHeaderResult getCSVHeader(GetCSVHeaderRequest getCSVHeaderRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public GetDeviceResult getDevice(GetDeviceRequest getDeviceRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public GetGroupResult getGroup(GetGroupRequest getGroupRequest) throws AmazonClientException,
            AmazonServiceException {
        return null;
    }

    @Override
    public GetIdentityProviderByIdentifierResult getIdentityProviderByIdentifier(GetIdentityProviderByIdentifierRequest getIdentityProviderByIdentifierRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public GetSigningCertificateResult getSigningCertificate(GetSigningCertificateRequest getSigningCertificateRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public GetUICustomizationResult getUICustomization(GetUICustomizationRequest getUICustomizationRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public GetUserResult getUser(GetUserRequest getUserRequest) throws AmazonClientException,
            AmazonServiceException {
        return null;
    }

    @Override
    public GetUserAttributeVerificationCodeResult getUserAttributeVerificationCode(GetUserAttributeVerificationCodeRequest getUserAttributeVerificationCodeRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public GetUserPoolMfaConfigResult getUserPoolMfaConfig(GetUserPoolMfaConfigRequest getUserPoolMfaConfigRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public GlobalSignOutResult globalSignOut(GlobalSignOutRequest globalSignOutRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public InitiateAuthResult initiateAuth(InitiateAuthRequest initiateAuthRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public ListDevicesResult listDevices(ListDevicesRequest listDevicesRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public ListGroupsResult listGroups(ListGroupsRequest listGroupsRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public ListIdentityProvidersResult listIdentityProviders(ListIdentityProvidersRequest listIdentityProvidersRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public ListResourceServersResult listResourceServers(ListResourceServersRequest listResourceServersRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public ListUserImportJobsResult listUserImportJobs(ListUserImportJobsRequest listUserImportJobsRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public ListUserPoolClientsResult listUserPoolClients(ListUserPoolClientsRequest listUserPoolClientsRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public ListUserPoolsResult listUserPools(ListUserPoolsRequest listUserPoolsRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public ListUsersResult listUsers(ListUsersRequest listUsersRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public ListUsersInGroupResult listUsersInGroup(ListUsersInGroupRequest listUsersInGroupRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public ResendConfirmationCodeResult resendConfirmationCode(ResendConfirmationCodeRequest resendConfirmationCodeRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public RespondToAuthChallengeResult respondToAuthChallenge(RespondToAuthChallengeRequest respondToAuthChallengeRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public RevokeTokenResult revokeToken(RevokeTokenRequest revokeTokenRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public SetRiskConfigurationResult setRiskConfiguration(SetRiskConfigurationRequest setRiskConfigurationRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public SetUICustomizationResult setUICustomization(SetUICustomizationRequest setUICustomizationRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public SetUserMFAPreferenceResult setUserMFAPreference(SetUserMFAPreferenceRequest setUserMFAPreferenceRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public SetUserPoolMfaConfigResult setUserPoolMfaConfig(SetUserPoolMfaConfigRequest setUserPoolMfaConfigRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public SetUserSettingsResult setUserSettings(SetUserSettingsRequest setUserSettingsRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public SignUpResult signUp(SignUpRequest signUpRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public StartUserImportJobResult startUserImportJob(StartUserImportJobRequest startUserImportJobRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public StopUserImportJobResult stopUserImportJob(StopUserImportJobRequest stopUserImportJobRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest tagResourceRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public UpdateAuthEventFeedbackResult updateAuthEventFeedback(UpdateAuthEventFeedbackRequest updateAuthEventFeedbackRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public UpdateDeviceStatusResult updateDeviceStatus(UpdateDeviceStatusRequest updateDeviceStatusRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public UpdateGroupResult updateGroup(UpdateGroupRequest updateGroupRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public UpdateIdentityProviderResult updateIdentityProvider(UpdateIdentityProviderRequest updateIdentityProviderRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public UpdateResourceServerResult updateResourceServer(UpdateResourceServerRequest updateResourceServerRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public UpdateUserAttributesResult updateUserAttributes(UpdateUserAttributesRequest updateUserAttributesRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public UpdateUserPoolResult updateUserPool(UpdateUserPoolRequest updateUserPoolRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public UpdateUserPoolClientResult updateUserPoolClient(UpdateUserPoolClientRequest updateUserPoolClientRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public UpdateUserPoolDomainResult updateUserPoolDomain(UpdateUserPoolDomainRequest updateUserPoolDomainRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public VerifySoftwareTokenResult verifySoftwareToken(VerifySoftwareTokenRequest verifySoftwareTokenRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public VerifyUserAttributeResult verifyUserAttribute(VerifyUserAttributeRequest verifyUserAttributeRequest) throws AmazonClientException, AmazonServiceException {
        return null;
    }

    @Override
    public void shutdown() {

    }

    @Override
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return null;
    }
}
