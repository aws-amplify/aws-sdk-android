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

package com.amazonaws.services.backup.model;

import java.io.Serializable;

/**
 * <p>
 * Used to specify a set of resources to a backup plan.
 * </p>
 */
public class BackupSelection implements Serializable {
    /**
     * <p>
     * The display name of a resource selection document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     */
    private String selectionName;

    /**
     * <p>
     * The ARN of the IAM role that AWS Backup uses to authenticate when
     * restoring the target resource; for example,
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     */
    private String iamRoleArn;

    /**
     * <p>
     * An array of strings that contain Amazon Resource Names (ARNs) of
     * resources to assign to a backup plan.
     * </p>
     */
    private java.util.List<String> resources;

    /**
     * <p>
     * An array of conditions used to specify a set of resources to assign to a
     * backup plan; for example,
     * <code>"STRINGEQUALS": {"ec2:ResourceTag/Department": "accounting"</code>.
     * </p>
     */
    private java.util.List<Condition> listOfTags;

    /**
     * <p>
     * The display name of a resource selection document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @return <p>
     *         The display name of a resource selection document.
     *         </p>
     */
    public String getSelectionName() {
        return selectionName;
    }

    /**
     * <p>
     * The display name of a resource selection document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param selectionName <p>
     *            The display name of a resource selection document.
     *            </p>
     */
    public void setSelectionName(String selectionName) {
        this.selectionName = selectionName;
    }

    /**
     * <p>
     * The display name of a resource selection document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param selectionName <p>
     *            The display name of a resource selection document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupSelection withSelectionName(String selectionName) {
        this.selectionName = selectionName;
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that AWS Backup uses to authenticate when
     * restoring the target resource; for example,
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     *
     * @return <p>
     *         The ARN of the IAM role that AWS Backup uses to authenticate when
     *         restoring the target resource; for example,
     *         <code>arn:aws:iam::123456789012:role/S3Access</code>.
     *         </p>
     */
    public String getIamRoleArn() {
        return iamRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that AWS Backup uses to authenticate when
     * restoring the target resource; for example,
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     *
     * @param iamRoleArn <p>
     *            The ARN of the IAM role that AWS Backup uses to authenticate
     *            when restoring the target resource; for example,
     *            <code>arn:aws:iam::123456789012:role/S3Access</code>.
     *            </p>
     */
    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that AWS Backup uses to authenticate when
     * restoring the target resource; for example,
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iamRoleArn <p>
     *            The ARN of the IAM role that AWS Backup uses to authenticate
     *            when restoring the target resource; for example,
     *            <code>arn:aws:iam::123456789012:role/S3Access</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupSelection withIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
        return this;
    }

    /**
     * <p>
     * An array of strings that contain Amazon Resource Names (ARNs) of
     * resources to assign to a backup plan.
     * </p>
     *
     * @return <p>
     *         An array of strings that contain Amazon Resource Names (ARNs) of
     *         resources to assign to a backup plan.
     *         </p>
     */
    public java.util.List<String> getResources() {
        return resources;
    }

    /**
     * <p>
     * An array of strings that contain Amazon Resource Names (ARNs) of
     * resources to assign to a backup plan.
     * </p>
     *
     * @param resources <p>
     *            An array of strings that contain Amazon Resource Names (ARNs)
     *            of resources to assign to a backup plan.
     *            </p>
     */
    public void setResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<String>(resources);
    }

    /**
     * <p>
     * An array of strings that contain Amazon Resource Names (ARNs) of
     * resources to assign to a backup plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resources <p>
     *            An array of strings that contain Amazon Resource Names (ARNs)
     *            of resources to assign to a backup plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupSelection withResources(String... resources) {
        if (getResources() == null) {
            this.resources = new java.util.ArrayList<String>(resources.length);
        }
        for (String value : resources) {
            this.resources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings that contain Amazon Resource Names (ARNs) of
     * resources to assign to a backup plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resources <p>
     *            An array of strings that contain Amazon Resource Names (ARNs)
     *            of resources to assign to a backup plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupSelection withResources(java.util.Collection<String> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * An array of conditions used to specify a set of resources to assign to a
     * backup plan; for example,
     * <code>"STRINGEQUALS": {"ec2:ResourceTag/Department": "accounting"</code>.
     * </p>
     *
     * @return <p>
     *         An array of conditions used to specify a set of resources to
     *         assign to a backup plan; for example,
     *         <code>"STRINGEQUALS": {"ec2:ResourceTag/Department": "accounting"</code>
     *         .
     *         </p>
     */
    public java.util.List<Condition> getListOfTags() {
        return listOfTags;
    }

    /**
     * <p>
     * An array of conditions used to specify a set of resources to assign to a
     * backup plan; for example,
     * <code>"STRINGEQUALS": {"ec2:ResourceTag/Department": "accounting"</code>.
     * </p>
     *
     * @param listOfTags <p>
     *            An array of conditions used to specify a set of resources to
     *            assign to a backup plan; for example,
     *            <code>"STRINGEQUALS": {"ec2:ResourceTag/Department": "accounting"</code>
     *            .
     *            </p>
     */
    public void setListOfTags(java.util.Collection<Condition> listOfTags) {
        if (listOfTags == null) {
            this.listOfTags = null;
            return;
        }

        this.listOfTags = new java.util.ArrayList<Condition>(listOfTags);
    }

    /**
     * <p>
     * An array of conditions used to specify a set of resources to assign to a
     * backup plan; for example,
     * <code>"STRINGEQUALS": {"ec2:ResourceTag/Department": "accounting"</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param listOfTags <p>
     *            An array of conditions used to specify a set of resources to
     *            assign to a backup plan; for example,
     *            <code>"STRINGEQUALS": {"ec2:ResourceTag/Department": "accounting"</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupSelection withListOfTags(Condition... listOfTags) {
        if (getListOfTags() == null) {
            this.listOfTags = new java.util.ArrayList<Condition>(listOfTags.length);
        }
        for (Condition value : listOfTags) {
            this.listOfTags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of conditions used to specify a set of resources to assign to a
     * backup plan; for example,
     * <code>"STRINGEQUALS": {"ec2:ResourceTag/Department": "accounting"</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param listOfTags <p>
     *            An array of conditions used to specify a set of resources to
     *            assign to a backup plan; for example,
     *            <code>"STRINGEQUALS": {"ec2:ResourceTag/Department": "accounting"</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupSelection withListOfTags(java.util.Collection<Condition> listOfTags) {
        setListOfTags(listOfTags);
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
        if (getSelectionName() != null)
            sb.append("SelectionName: " + getSelectionName() + ",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: " + getIamRoleArn() + ",");
        if (getResources() != null)
            sb.append("Resources: " + getResources() + ",");
        if (getListOfTags() != null)
            sb.append("ListOfTags: " + getListOfTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSelectionName() == null) ? 0 : getSelectionName().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getListOfTags() == null) ? 0 : getListOfTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackupSelection == false)
            return false;
        BackupSelection other = (BackupSelection) obj;

        if (other.getSelectionName() == null ^ this.getSelectionName() == null)
            return false;
        if (other.getSelectionName() != null
                && other.getSelectionName().equals(this.getSelectionName()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null
                && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null
                && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getListOfTags() == null ^ this.getListOfTags() == null)
            return false;
        if (other.getListOfTags() != null
                && other.getListOfTags().equals(this.getListOfTags()) == false)
            return false;
        return true;
    }
}
