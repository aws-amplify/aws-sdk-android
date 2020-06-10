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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * The name and type of entity who performed the action on the affected
 * resource.
 * </p>
 */
public class UserIdentity implements Serializable {
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private AssumedRole assumedRole;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private AwsAccount awsAccount;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private AwsService awsService;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private FederatedUser federatedUser;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private IamUser iamUser;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private UserIdentityRoot root;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AssumedRole, IAMUser, FederatedUser, Root,
     * AWSAccount, AWSService
     */
    private String type;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public AssumedRole getAssumedRole() {
        return assumedRole;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param assumedRole <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setAssumedRole(AssumedRole assumedRole) {
        this.assumedRole = assumedRole;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assumedRole <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserIdentity withAssumedRole(AssumedRole assumedRole) {
        this.assumedRole = assumedRole;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public AwsAccount getAwsAccount() {
        return awsAccount;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param awsAccount <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setAwsAccount(AwsAccount awsAccount) {
        this.awsAccount = awsAccount;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsAccount <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserIdentity withAwsAccount(AwsAccount awsAccount) {
        this.awsAccount = awsAccount;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public AwsService getAwsService() {
        return awsService;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param awsService <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setAwsService(AwsService awsService) {
        this.awsService = awsService;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsService <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserIdentity withAwsService(AwsService awsService) {
        this.awsService = awsService;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public FederatedUser getFederatedUser() {
        return federatedUser;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param federatedUser <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setFederatedUser(FederatedUser federatedUser) {
        this.federatedUser = federatedUser;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param federatedUser <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserIdentity withFederatedUser(FederatedUser federatedUser) {
        this.federatedUser = federatedUser;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public IamUser getIamUser() {
        return iamUser;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param iamUser <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setIamUser(IamUser iamUser) {
        this.iamUser = iamUser;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iamUser <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserIdentity withIamUser(IamUser iamUser) {
        this.iamUser = iamUser;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public UserIdentityRoot getRoot() {
        return root;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param root <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setRoot(UserIdentityRoot root) {
        this.root = root;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param root <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserIdentity withRoot(UserIdentityRoot root) {
        this.root = root;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AssumedRole, IAMUser, FederatedUser, Root,
     * AWSAccount, AWSService
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     * @see UserIdentityType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AssumedRole, IAMUser, FederatedUser, Root,
     * AWSAccount, AWSService
     *
     * @param type <p>
     *            Reserved for future use.
     *            </p>
     * @see UserIdentityType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AssumedRole, IAMUser, FederatedUser, Root,
     * AWSAccount, AWSService
     *
     * @param type <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserIdentityType
     */
    public UserIdentity withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AssumedRole, IAMUser, FederatedUser, Root,
     * AWSAccount, AWSService
     *
     * @param type <p>
     *            Reserved for future use.
     *            </p>
     * @see UserIdentityType
     */
    public void setType(UserIdentityType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AssumedRole, IAMUser, FederatedUser, Root,
     * AWSAccount, AWSService
     *
     * @param type <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserIdentityType
     */
    public UserIdentity withType(UserIdentityType type) {
        this.type = type.toString();
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
        if (getAssumedRole() != null)
            sb.append("assumedRole: " + getAssumedRole() + ",");
        if (getAwsAccount() != null)
            sb.append("awsAccount: " + getAwsAccount() + ",");
        if (getAwsService() != null)
            sb.append("awsService: " + getAwsService() + ",");
        if (getFederatedUser() != null)
            sb.append("federatedUser: " + getFederatedUser() + ",");
        if (getIamUser() != null)
            sb.append("iamUser: " + getIamUser() + ",");
        if (getRoot() != null)
            sb.append("root: " + getRoot() + ",");
        if (getType() != null)
            sb.append("type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssumedRole() == null) ? 0 : getAssumedRole().hashCode());
        hashCode = prime * hashCode + ((getAwsAccount() == null) ? 0 : getAwsAccount().hashCode());
        hashCode = prime * hashCode + ((getAwsService() == null) ? 0 : getAwsService().hashCode());
        hashCode = prime * hashCode
                + ((getFederatedUser() == null) ? 0 : getFederatedUser().hashCode());
        hashCode = prime * hashCode + ((getIamUser() == null) ? 0 : getIamUser().hashCode());
        hashCode = prime * hashCode + ((getRoot() == null) ? 0 : getRoot().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserIdentity == false)
            return false;
        UserIdentity other = (UserIdentity) obj;

        if (other.getAssumedRole() == null ^ this.getAssumedRole() == null)
            return false;
        if (other.getAssumedRole() != null
                && other.getAssumedRole().equals(this.getAssumedRole()) == false)
            return false;
        if (other.getAwsAccount() == null ^ this.getAwsAccount() == null)
            return false;
        if (other.getAwsAccount() != null
                && other.getAwsAccount().equals(this.getAwsAccount()) == false)
            return false;
        if (other.getAwsService() == null ^ this.getAwsService() == null)
            return false;
        if (other.getAwsService() != null
                && other.getAwsService().equals(this.getAwsService()) == false)
            return false;
        if (other.getFederatedUser() == null ^ this.getFederatedUser() == null)
            return false;
        if (other.getFederatedUser() != null
                && other.getFederatedUser().equals(this.getFederatedUser()) == false)
            return false;
        if (other.getIamUser() == null ^ this.getIamUser() == null)
            return false;
        if (other.getIamUser() != null && other.getIamUser().equals(this.getIamUser()) == false)
            return false;
        if (other.getRoot() == null ^ this.getRoot() == null)
            return false;
        if (other.getRoot() != null && other.getRoot().equals(this.getRoot()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
