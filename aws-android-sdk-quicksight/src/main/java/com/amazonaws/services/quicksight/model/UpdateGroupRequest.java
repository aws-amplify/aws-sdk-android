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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Changes a group description.
 * </p>
 */
public class UpdateGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the group that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String groupName;

    /**
     * <p>
     * The description for the group that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String description;

    /**
     * <p>
     * The ID for the AWS account that the group is in. Currently, you use the
     * ID for the AWS account that contains your Amazon QuickSight account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String awsAccountId;

    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9._-]*$<br/>
     */
    private String namespace;

    /**
     * <p>
     * The name of the group that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The name of the group that you want to update.
     *         </p>
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * <p>
     * The name of the group that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param groupName <p>
     *            The name of the group that you want to update.
     *            </p>
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the group that you want to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param groupName <p>
     *            The name of the group that you want to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGroupRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * <p>
     * The description for the group that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return <p>
     *         The description for the group that you want to update.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description for the group that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param description <p>
     *            The description for the group that you want to update.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the group that you want to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param description <p>
     *            The description for the group that you want to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGroupRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The ID for the AWS account that the group is in. Currently, you use the
     * ID for the AWS account that contains your Amazon QuickSight account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         The ID for the AWS account that the group is in. Currently, you
     *         use the ID for the AWS account that contains your Amazon
     *         QuickSight account.
     *         </p>
     */
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that the group is in. Currently, you use the
     * ID for the AWS account that contains your Amazon QuickSight account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The ID for the AWS account that the group is in. Currently,
     *            you use the ID for the AWS account that contains your Amazon
     *            QuickSight account.
     *            </p>
     */
    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that the group is in. Currently, you use the
     * ID for the AWS account that contains your Amazon QuickSight account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The ID for the AWS account that the group is in. Currently,
     *            you use the ID for the AWS account that contains your Amazon
     *            QuickSight account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGroupRequest withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9._-]*$<br/>
     *
     * @return <p>
     *         The namespace. Currently, you should set this to
     *         <code>default</code>.
     *         </p>
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9._-]*$<br/>
     *
     * @param namespace <p>
     *            The namespace. Currently, you should set this to
     *            <code>default</code>.
     *            </p>
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9._-]*$<br/>
     *
     * @param namespace <p>
     *            The namespace. Currently, you should set this to
     *            <code>default</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGroupRequest withNamespace(String namespace) {
        this.namespace = namespace;
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
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: " + getAwsAccountId() + ",");
        if (getNamespace() != null)
            sb.append("Namespace: " + getNamespace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGroupRequest == false)
            return false;
        UpdateGroupRequest other = (UpdateGroupRequest) obj;

        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null
                && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null
                && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        return true;
    }
}
