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

package com.amazonaws.services.amazonelasticfilesystem.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Applies an Amazon EFS <code>FileSystemPolicy</code> to an Amazon EFS file
 * system. A file system policy is an IAM resource-based policy and can contain
 * multiple policy statements. A file system always has exactly one file system
 * policy, which can be the default policy or an explicit policy set or updated
 * using this API operation. When an explicit policy is set, it overrides the
 * default policy. For more information about the default file system policy,
 * see <a href=
 * "https://docs.aws.amazon.com/efs/latest/ug/iam-access-control-nfs-efs.html#default-filesystempolicy"
 * >Default EFS File System Policy</a>.
 * </p>
 * <p>
 * This operation requires permissions for the
 * <code>elasticfilesystem:PutFileSystemPolicy</code> action.
 * </p>
 */
public class PutFileSystemPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the EFS file system that you want to create or update the
     * <code>FileSystemPolicy</code> for.
     * </p>
     */
    private String fileSystemId;

    /**
     * <p>
     * The <code>FileSystemPolicy</code> that you're creating. Accepts a JSON
     * formatted policy definition. To find out more about the elements that
     * make up a file system policy, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies"
     * >EFS Resource-based Policies</a>.
     * </p>
     */
    private String policy;

    /**
     * <p>
     * (Optional) A flag to indicate whether to bypass the
     * <code>FileSystemPolicy</code> lockout safety check. The policy lockout
     * safety check determines whether the policy in the request will prevent
     * the principal making the request will be locked out from making future
     * <code>PutFileSystemPolicy</code> requests on the file system. Set
     * <code>BypassPolicyLockoutSafetyCheck</code> to <code>True</code> only
     * when you intend to prevent the principal that is making the request from
     * making a subsequent <code>PutFileSystemPolicy</code> request on the file
     * system. The default value is False.
     * </p>
     */
    private Boolean bypassPolicyLockoutSafetyCheck;

    /**
     * <p>
     * The ID of the EFS file system that you want to create or update the
     * <code>FileSystemPolicy</code> for.
     * </p>
     *
     * @return <p>
     *         The ID of the EFS file system that you want to create or update
     *         the <code>FileSystemPolicy</code> for.
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * The ID of the EFS file system that you want to create or update the
     * <code>FileSystemPolicy</code> for.
     * </p>
     *
     * @param fileSystemId <p>
     *            The ID of the EFS file system that you want to create or
     *            update the <code>FileSystemPolicy</code> for.
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the EFS file system that you want to create or update the
     * <code>FileSystemPolicy</code> for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSystemId <p>
     *            The ID of the EFS file system that you want to create or
     *            update the <code>FileSystemPolicy</code> for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutFileSystemPolicyRequest withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * <p>
     * The <code>FileSystemPolicy</code> that you're creating. Accepts a JSON
     * formatted policy definition. To find out more about the elements that
     * make up a file system policy, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies"
     * >EFS Resource-based Policies</a>.
     * </p>
     *
     * @return <p>
     *         The <code>FileSystemPolicy</code> that you're creating. Accepts a
     *         JSON formatted policy definition. To find out more about the
     *         elements that make up a file system policy, see <a href=
     *         "https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies"
     *         >EFS Resource-based Policies</a>.
     *         </p>
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * <p>
     * The <code>FileSystemPolicy</code> that you're creating. Accepts a JSON
     * formatted policy definition. To find out more about the elements that
     * make up a file system policy, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies"
     * >EFS Resource-based Policies</a>.
     * </p>
     *
     * @param policy <p>
     *            The <code>FileSystemPolicy</code> that you're creating.
     *            Accepts a JSON formatted policy definition. To find out more
     *            about the elements that make up a file system policy, see <a
     *            href=
     *            "https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies"
     *            >EFS Resource-based Policies</a>.
     *            </p>
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The <code>FileSystemPolicy</code> that you're creating. Accepts a JSON
     * formatted policy definition. To find out more about the elements that
     * make up a file system policy, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies"
     * >EFS Resource-based Policies</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policy <p>
     *            The <code>FileSystemPolicy</code> that you're creating.
     *            Accepts a JSON formatted policy definition. To find out more
     *            about the elements that make up a file system policy, see <a
     *            href=
     *            "https://docs.aws.amazon.com/efs/latest/ug/access-control-overview.html#access-control-manage-access-intro-resource-policies"
     *            >EFS Resource-based Policies</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutFileSystemPolicyRequest withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * <p>
     * (Optional) A flag to indicate whether to bypass the
     * <code>FileSystemPolicy</code> lockout safety check. The policy lockout
     * safety check determines whether the policy in the request will prevent
     * the principal making the request will be locked out from making future
     * <code>PutFileSystemPolicy</code> requests on the file system. Set
     * <code>BypassPolicyLockoutSafetyCheck</code> to <code>True</code> only
     * when you intend to prevent the principal that is making the request from
     * making a subsequent <code>PutFileSystemPolicy</code> request on the file
     * system. The default value is False.
     * </p>
     *
     * @return <p>
     *         (Optional) A flag to indicate whether to bypass the
     *         <code>FileSystemPolicy</code> lockout safety check. The policy
     *         lockout safety check determines whether the policy in the request
     *         will prevent the principal making the request will be locked out
     *         from making future <code>PutFileSystemPolicy</code> requests on
     *         the file system. Set <code>BypassPolicyLockoutSafetyCheck</code>
     *         to <code>True</code> only when you intend to prevent the
     *         principal that is making the request from making a subsequent
     *         <code>PutFileSystemPolicy</code> request on the file system. The
     *         default value is False.
     *         </p>
     */
    public Boolean isBypassPolicyLockoutSafetyCheck() {
        return bypassPolicyLockoutSafetyCheck;
    }

    /**
     * <p>
     * (Optional) A flag to indicate whether to bypass the
     * <code>FileSystemPolicy</code> lockout safety check. The policy lockout
     * safety check determines whether the policy in the request will prevent
     * the principal making the request will be locked out from making future
     * <code>PutFileSystemPolicy</code> requests on the file system. Set
     * <code>BypassPolicyLockoutSafetyCheck</code> to <code>True</code> only
     * when you intend to prevent the principal that is making the request from
     * making a subsequent <code>PutFileSystemPolicy</code> request on the file
     * system. The default value is False.
     * </p>
     *
     * @return <p>
     *         (Optional) A flag to indicate whether to bypass the
     *         <code>FileSystemPolicy</code> lockout safety check. The policy
     *         lockout safety check determines whether the policy in the request
     *         will prevent the principal making the request will be locked out
     *         from making future <code>PutFileSystemPolicy</code> requests on
     *         the file system. Set <code>BypassPolicyLockoutSafetyCheck</code>
     *         to <code>True</code> only when you intend to prevent the
     *         principal that is making the request from making a subsequent
     *         <code>PutFileSystemPolicy</code> request on the file system. The
     *         default value is False.
     *         </p>
     */
    public Boolean getBypassPolicyLockoutSafetyCheck() {
        return bypassPolicyLockoutSafetyCheck;
    }

    /**
     * <p>
     * (Optional) A flag to indicate whether to bypass the
     * <code>FileSystemPolicy</code> lockout safety check. The policy lockout
     * safety check determines whether the policy in the request will prevent
     * the principal making the request will be locked out from making future
     * <code>PutFileSystemPolicy</code> requests on the file system. Set
     * <code>BypassPolicyLockoutSafetyCheck</code> to <code>True</code> only
     * when you intend to prevent the principal that is making the request from
     * making a subsequent <code>PutFileSystemPolicy</code> request on the file
     * system. The default value is False.
     * </p>
     *
     * @param bypassPolicyLockoutSafetyCheck <p>
     *            (Optional) A flag to indicate whether to bypass the
     *            <code>FileSystemPolicy</code> lockout safety check. The policy
     *            lockout safety check determines whether the policy in the
     *            request will prevent the principal making the request will be
     *            locked out from making future <code>PutFileSystemPolicy</code>
     *            requests on the file system. Set
     *            <code>BypassPolicyLockoutSafetyCheck</code> to
     *            <code>True</code> only when you intend to prevent the
     *            principal that is making the request from making a subsequent
     *            <code>PutFileSystemPolicy</code> request on the file system.
     *            The default value is False.
     *            </p>
     */
    public void setBypassPolicyLockoutSafetyCheck(Boolean bypassPolicyLockoutSafetyCheck) {
        this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
    }

    /**
     * <p>
     * (Optional) A flag to indicate whether to bypass the
     * <code>FileSystemPolicy</code> lockout safety check. The policy lockout
     * safety check determines whether the policy in the request will prevent
     * the principal making the request will be locked out from making future
     * <code>PutFileSystemPolicy</code> requests on the file system. Set
     * <code>BypassPolicyLockoutSafetyCheck</code> to <code>True</code> only
     * when you intend to prevent the principal that is making the request from
     * making a subsequent <code>PutFileSystemPolicy</code> request on the file
     * system. The default value is False.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bypassPolicyLockoutSafetyCheck <p>
     *            (Optional) A flag to indicate whether to bypass the
     *            <code>FileSystemPolicy</code> lockout safety check. The policy
     *            lockout safety check determines whether the policy in the
     *            request will prevent the principal making the request will be
     *            locked out from making future <code>PutFileSystemPolicy</code>
     *            requests on the file system. Set
     *            <code>BypassPolicyLockoutSafetyCheck</code> to
     *            <code>True</code> only when you intend to prevent the
     *            principal that is making the request from making a subsequent
     *            <code>PutFileSystemPolicy</code> request on the file system.
     *            The default value is False.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutFileSystemPolicyRequest withBypassPolicyLockoutSafetyCheck(
            Boolean bypassPolicyLockoutSafetyCheck) {
        this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
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
        if (getFileSystemId() != null)
            sb.append("FileSystemId: " + getFileSystemId() + ",");
        if (getPolicy() != null)
            sb.append("Policy: " + getPolicy() + ",");
        if (getBypassPolicyLockoutSafetyCheck() != null)
            sb.append("BypassPolicyLockoutSafetyCheck: " + getBypassPolicyLockoutSafetyCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime
                * hashCode
                + ((getBypassPolicyLockoutSafetyCheck() == null) ? 0
                        : getBypassPolicyLockoutSafetyCheck().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutFileSystemPolicyRequest == false)
            return false;
        PutFileSystemPolicyRequest other = (PutFileSystemPolicyRequest) obj;

        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getBypassPolicyLockoutSafetyCheck() == null
                ^ this.getBypassPolicyLockoutSafetyCheck() == null)
            return false;
        if (other.getBypassPolicyLockoutSafetyCheck() != null
                && other.getBypassPolicyLockoutSafetyCheck().equals(
                        this.getBypassPolicyLockoutSafetyCheck()) == false)
            return false;
        return true;
    }
}
