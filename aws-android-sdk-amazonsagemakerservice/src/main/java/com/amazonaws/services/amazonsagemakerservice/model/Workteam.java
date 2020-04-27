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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Provides details about a labeling work team.
 * </p>
 */
public class Workteam implements Serializable {
    /**
     * <p>
     * The name of the work team.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String workteamName;

    /**
     * <p>
     * The Amazon Cognito user groups that make up the work team.
     * </p>
     */
    private java.util.List<MemberDefinition> memberDefinitions;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the work team.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workteam/.*<br/>
     */
    private String workteamArn;

    /**
     * <p>
     * The Amazon Marketplace identifier for a vendor's work team.
     * </p>
     */
    private java.util.List<String> productListingIds;

    /**
     * <p>
     * A description of the work team.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String description;

    /**
     * <p>
     * The URI of the labeling job's user interface. Workers open this URI to
     * start labeling your data objects.
     * </p>
     */
    private String subDomain;

    /**
     * <p>
     * The date and time that the work team was created (timestamp).
     * </p>
     */
    private java.util.Date createDate;

    /**
     * <p>
     * The date and time that the work team was last updated (timestamp).
     * </p>
     */
    private java.util.Date lastUpdatedDate;

    /**
     * <p>
     * Configures SNS notifications of available or expiring work items for work
     * teams.
     * </p>
     */
    private NotificationConfiguration notificationConfiguration;

    /**
     * <p>
     * The name of the work team.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the work team.
     *         </p>
     */
    public String getWorkteamName() {
        return workteamName;
    }

    /**
     * <p>
     * The name of the work team.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param workteamName <p>
     *            The name of the work team.
     *            </p>
     */
    public void setWorkteamName(String workteamName) {
        this.workteamName = workteamName;
    }

    /**
     * <p>
     * The name of the work team.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param workteamName <p>
     *            The name of the work team.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Workteam withWorkteamName(String workteamName) {
        this.workteamName = workteamName;
        return this;
    }

    /**
     * <p>
     * The Amazon Cognito user groups that make up the work team.
     * </p>
     *
     * @return <p>
     *         The Amazon Cognito user groups that make up the work team.
     *         </p>
     */
    public java.util.List<MemberDefinition> getMemberDefinitions() {
        return memberDefinitions;
    }

    /**
     * <p>
     * The Amazon Cognito user groups that make up the work team.
     * </p>
     *
     * @param memberDefinitions <p>
     *            The Amazon Cognito user groups that make up the work team.
     *            </p>
     */
    public void setMemberDefinitions(java.util.Collection<MemberDefinition> memberDefinitions) {
        if (memberDefinitions == null) {
            this.memberDefinitions = null;
            return;
        }

        this.memberDefinitions = new java.util.ArrayList<MemberDefinition>(memberDefinitions);
    }

    /**
     * <p>
     * The Amazon Cognito user groups that make up the work team.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memberDefinitions <p>
     *            The Amazon Cognito user groups that make up the work team.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Workteam withMemberDefinitions(MemberDefinition... memberDefinitions) {
        if (getMemberDefinitions() == null) {
            this.memberDefinitions = new java.util.ArrayList<MemberDefinition>(
                    memberDefinitions.length);
        }
        for (MemberDefinition value : memberDefinitions) {
            this.memberDefinitions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Cognito user groups that make up the work team.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memberDefinitions <p>
     *            The Amazon Cognito user groups that make up the work team.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Workteam withMemberDefinitions(java.util.Collection<MemberDefinition> memberDefinitions) {
        setMemberDefinitions(memberDefinitions);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the work team.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workteam/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) that identifies the work team.
     *         </p>
     */
    public String getWorkteamArn() {
        return workteamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the work team.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workteam/.*<br/>
     *
     * @param workteamArn <p>
     *            The Amazon Resource Name (ARN) that identifies the work team.
     *            </p>
     */
    public void setWorkteamArn(String workteamArn) {
        this.workteamArn = workteamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the work team.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workteam/.*<br/>
     *
     * @param workteamArn <p>
     *            The Amazon Resource Name (ARN) that identifies the work team.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Workteam withWorkteamArn(String workteamArn) {
        this.workteamArn = workteamArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Marketplace identifier for a vendor's work team.
     * </p>
     *
     * @return <p>
     *         The Amazon Marketplace identifier for a vendor's work team.
     *         </p>
     */
    public java.util.List<String> getProductListingIds() {
        return productListingIds;
    }

    /**
     * <p>
     * The Amazon Marketplace identifier for a vendor's work team.
     * </p>
     *
     * @param productListingIds <p>
     *            The Amazon Marketplace identifier for a vendor's work team.
     *            </p>
     */
    public void setProductListingIds(java.util.Collection<String> productListingIds) {
        if (productListingIds == null) {
            this.productListingIds = null;
            return;
        }

        this.productListingIds = new java.util.ArrayList<String>(productListingIds);
    }

    /**
     * <p>
     * The Amazon Marketplace identifier for a vendor's work team.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productListingIds <p>
     *            The Amazon Marketplace identifier for a vendor's work team.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Workteam withProductListingIds(String... productListingIds) {
        if (getProductListingIds() == null) {
            this.productListingIds = new java.util.ArrayList<String>(productListingIds.length);
        }
        for (String value : productListingIds) {
            this.productListingIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Marketplace identifier for a vendor's work team.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productListingIds <p>
     *            The Amazon Marketplace identifier for a vendor's work team.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Workteam withProductListingIds(java.util.Collection<String> productListingIds) {
        setProductListingIds(productListingIds);
        return this;
    }

    /**
     * <p>
     * A description of the work team.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         A description of the work team.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the work team.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param description <p>
     *            A description of the work team.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the work team.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param description <p>
     *            A description of the work team.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Workteam withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The URI of the labeling job's user interface. Workers open this URI to
     * start labeling your data objects.
     * </p>
     *
     * @return <p>
     *         The URI of the labeling job's user interface. Workers open this
     *         URI to start labeling your data objects.
     *         </p>
     */
    public String getSubDomain() {
        return subDomain;
    }

    /**
     * <p>
     * The URI of the labeling job's user interface. Workers open this URI to
     * start labeling your data objects.
     * </p>
     *
     * @param subDomain <p>
     *            The URI of the labeling job's user interface. Workers open
     *            this URI to start labeling your data objects.
     *            </p>
     */
    public void setSubDomain(String subDomain) {
        this.subDomain = subDomain;
    }

    /**
     * <p>
     * The URI of the labeling job's user interface. Workers open this URI to
     * start labeling your data objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subDomain <p>
     *            The URI of the labeling job's user interface. Workers open
     *            this URI to start labeling your data objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Workteam withSubDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }

    /**
     * <p>
     * The date and time that the work team was created (timestamp).
     * </p>
     *
     * @return <p>
     *         The date and time that the work team was created (timestamp).
     *         </p>
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }

    /**
     * <p>
     * The date and time that the work team was created (timestamp).
     * </p>
     *
     * @param createDate <p>
     *            The date and time that the work team was created (timestamp).
     *            </p>
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time that the work team was created (timestamp).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createDate <p>
     *            The date and time that the work team was created (timestamp).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Workteam withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * <p>
     * The date and time that the work team was last updated (timestamp).
     * </p>
     *
     * @return <p>
     *         The date and time that the work team was last updated
     *         (timestamp).
     *         </p>
     */
    public java.util.Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
     * <p>
     * The date and time that the work team was last updated (timestamp).
     * </p>
     *
     * @param lastUpdatedDate <p>
     *            The date and time that the work team was last updated
     *            (timestamp).
     *            </p>
     */
    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The date and time that the work team was last updated (timestamp).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedDate <p>
     *            The date and time that the work team was last updated
     *            (timestamp).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Workteam withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
        return this;
    }

    /**
     * <p>
     * Configures SNS notifications of available or expiring work items for work
     * teams.
     * </p>
     *
     * @return <p>
     *         Configures SNS notifications of available or expiring work items
     *         for work teams.
     *         </p>
     */
    public NotificationConfiguration getNotificationConfiguration() {
        return notificationConfiguration;
    }

    /**
     * <p>
     * Configures SNS notifications of available or expiring work items for work
     * teams.
     * </p>
     *
     * @param notificationConfiguration <p>
     *            Configures SNS notifications of available or expiring work
     *            items for work teams.
     *            </p>
     */
    public void setNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
    }

    /**
     * <p>
     * Configures SNS notifications of available or expiring work items for work
     * teams.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationConfiguration <p>
     *            Configures SNS notifications of available or expiring work
     *            items for work teams.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Workteam withNotificationConfiguration(
            NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
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
        if (getWorkteamName() != null)
            sb.append("WorkteamName: " + getWorkteamName() + ",");
        if (getMemberDefinitions() != null)
            sb.append("MemberDefinitions: " + getMemberDefinitions() + ",");
        if (getWorkteamArn() != null)
            sb.append("WorkteamArn: " + getWorkteamArn() + ",");
        if (getProductListingIds() != null)
            sb.append("ProductListingIds: " + getProductListingIds() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getSubDomain() != null)
            sb.append("SubDomain: " + getSubDomain() + ",");
        if (getCreateDate() != null)
            sb.append("CreateDate: " + getCreateDate() + ",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: " + getLastUpdatedDate() + ",");
        if (getNotificationConfiguration() != null)
            sb.append("NotificationConfiguration: " + getNotificationConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getWorkteamName() == null) ? 0 : getWorkteamName().hashCode());
        hashCode = prime * hashCode
                + ((getMemberDefinitions() == null) ? 0 : getMemberDefinitions().hashCode());
        hashCode = prime * hashCode
                + ((getWorkteamArn() == null) ? 0 : getWorkteamArn().hashCode());
        hashCode = prime * hashCode
                + ((getProductListingIds() == null) ? 0 : getProductListingIds().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSubDomain() == null) ? 0 : getSubDomain().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        hashCode = prime
                * hashCode
                + ((getNotificationConfiguration() == null) ? 0 : getNotificationConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Workteam == false)
            return false;
        Workteam other = (Workteam) obj;

        if (other.getWorkteamName() == null ^ this.getWorkteamName() == null)
            return false;
        if (other.getWorkteamName() != null
                && other.getWorkteamName().equals(this.getWorkteamName()) == false)
            return false;
        if (other.getMemberDefinitions() == null ^ this.getMemberDefinitions() == null)
            return false;
        if (other.getMemberDefinitions() != null
                && other.getMemberDefinitions().equals(this.getMemberDefinitions()) == false)
            return false;
        if (other.getWorkteamArn() == null ^ this.getWorkteamArn() == null)
            return false;
        if (other.getWorkteamArn() != null
                && other.getWorkteamArn().equals(this.getWorkteamArn()) == false)
            return false;
        if (other.getProductListingIds() == null ^ this.getProductListingIds() == null)
            return false;
        if (other.getProductListingIds() != null
                && other.getProductListingIds().equals(this.getProductListingIds()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSubDomain() == null ^ this.getSubDomain() == null)
            return false;
        if (other.getSubDomain() != null
                && other.getSubDomain().equals(this.getSubDomain()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null
                && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null
                && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
            return false;
        if (other.getNotificationConfiguration() == null
                ^ this.getNotificationConfiguration() == null)
            return false;
        if (other.getNotificationConfiguration() != null
                && other.getNotificationConfiguration().equals(this.getNotificationConfiguration()) == false)
            return false;
        return true;
    }
}
