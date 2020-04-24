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

package com.amazonaws.services.amazondatalifecyclemanager.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies a rule for cross-Region snapshot copies.
 * </p>
 */
public class CrossRegionCopyRule implements Serializable {
    /**
     * <p>
     * The target Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 16<br/>
     * <b>Pattern: </b>([a-z]+-){2,3}\d<br/>
     */
    private String targetRegion;

    /**
     * <p>
     * To encrypt a copy of an unencrypted snapshot if encryption by default is
     * not enabled, enable encryption using this parameter. Copies of encrypted
     * snapshots are encrypted, even if this parameter is false or if encryption
     * by default is not enabled.
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK)
     * to use for EBS encryption. If this parameter is not specified, your AWS
     * managed CMK for EBS is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[a-z]{1,3}){0,2}:kms:([a-z]+-){2,3}\d:\d+:key/.*
     * <br/>
     */
    private String cmkArn;

    /**
     * <p>
     * Copy all user-defined tags from the source snapshot to the copied
     * snapshot.
     * </p>
     */
    private Boolean copyTags;

    /**
     * <p>
     * The retention rule.
     * </p>
     */
    private CrossRegionCopyRetainRule retainRule;

    /**
     * <p>
     * The target Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 16<br/>
     * <b>Pattern: </b>([a-z]+-){2,3}\d<br/>
     *
     * @return <p>
     *         The target Region.
     *         </p>
     */
    public String getTargetRegion() {
        return targetRegion;
    }

    /**
     * <p>
     * The target Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 16<br/>
     * <b>Pattern: </b>([a-z]+-){2,3}\d<br/>
     *
     * @param targetRegion <p>
     *            The target Region.
     *            </p>
     */
    public void setTargetRegion(String targetRegion) {
        this.targetRegion = targetRegion;
    }

    /**
     * <p>
     * The target Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 16<br/>
     * <b>Pattern: </b>([a-z]+-){2,3}\d<br/>
     *
     * @param targetRegion <p>
     *            The target Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CrossRegionCopyRule withTargetRegion(String targetRegion) {
        this.targetRegion = targetRegion;
        return this;
    }

    /**
     * <p>
     * To encrypt a copy of an unencrypted snapshot if encryption by default is
     * not enabled, enable encryption using this parameter. Copies of encrypted
     * snapshots are encrypted, even if this parameter is false or if encryption
     * by default is not enabled.
     * </p>
     *
     * @return <p>
     *         To encrypt a copy of an unencrypted snapshot if encryption by
     *         default is not enabled, enable encryption using this parameter.
     *         Copies of encrypted snapshots are encrypted, even if this
     *         parameter is false or if encryption by default is not enabled.
     *         </p>
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * To encrypt a copy of an unencrypted snapshot if encryption by default is
     * not enabled, enable encryption using this parameter. Copies of encrypted
     * snapshots are encrypted, even if this parameter is false or if encryption
     * by default is not enabled.
     * </p>
     *
     * @return <p>
     *         To encrypt a copy of an unencrypted snapshot if encryption by
     *         default is not enabled, enable encryption using this parameter.
     *         Copies of encrypted snapshots are encrypted, even if this
     *         parameter is false or if encryption by default is not enabled.
     *         </p>
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * To encrypt a copy of an unencrypted snapshot if encryption by default is
     * not enabled, enable encryption using this parameter. Copies of encrypted
     * snapshots are encrypted, even if this parameter is false or if encryption
     * by default is not enabled.
     * </p>
     *
     * @param encrypted <p>
     *            To encrypt a copy of an unencrypted snapshot if encryption by
     *            default is not enabled, enable encryption using this
     *            parameter. Copies of encrypted snapshots are encrypted, even
     *            if this parameter is false or if encryption by default is not
     *            enabled.
     *            </p>
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * To encrypt a copy of an unencrypted snapshot if encryption by default is
     * not enabled, enable encryption using this parameter. Copies of encrypted
     * snapshots are encrypted, even if this parameter is false or if encryption
     * by default is not enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encrypted <p>
     *            To encrypt a copy of an unencrypted snapshot if encryption by
     *            default is not enabled, enable encryption using this
     *            parameter. Copies of encrypted snapshots are encrypted, even
     *            if this parameter is false or if encryption by default is not
     *            enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CrossRegionCopyRule withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK)
     * to use for EBS encryption. If this parameter is not specified, your AWS
     * managed CMK for EBS is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[a-z]{1,3}){0,2}:kms:([a-z]+-){2,3}\d:\d+:key/.*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS KMS customer master key
     *         (CMK) to use for EBS encryption. If this parameter is not
     *         specified, your AWS managed CMK for EBS is used.
     *         </p>
     */
    public String getCmkArn() {
        return cmkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK)
     * to use for EBS encryption. If this parameter is not specified, your AWS
     * managed CMK for EBS is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[a-z]{1,3}){0,2}:kms:([a-z]+-){2,3}\d:\d+:key/.*
     * <br/>
     *
     * @param cmkArn <p>
     *            The Amazon Resource Name (ARN) of the AWS KMS customer master
     *            key (CMK) to use for EBS encryption. If this parameter is not
     *            specified, your AWS managed CMK for EBS is used.
     *            </p>
     */
    public void setCmkArn(String cmkArn) {
        this.cmkArn = cmkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK)
     * to use for EBS encryption. If this parameter is not specified, your AWS
     * managed CMK for EBS is used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[a-z]{1,3}){0,2}:kms:([a-z]+-){2,3}\d:\d+:key/.*
     * <br/>
     *
     * @param cmkArn <p>
     *            The Amazon Resource Name (ARN) of the AWS KMS customer master
     *            key (CMK) to use for EBS encryption. If this parameter is not
     *            specified, your AWS managed CMK for EBS is used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CrossRegionCopyRule withCmkArn(String cmkArn) {
        this.cmkArn = cmkArn;
        return this;
    }

    /**
     * <p>
     * Copy all user-defined tags from the source snapshot to the copied
     * snapshot.
     * </p>
     *
     * @return <p>
     *         Copy all user-defined tags from the source snapshot to the copied
     *         snapshot.
     *         </p>
     */
    public Boolean isCopyTags() {
        return copyTags;
    }

    /**
     * <p>
     * Copy all user-defined tags from the source snapshot to the copied
     * snapshot.
     * </p>
     *
     * @return <p>
     *         Copy all user-defined tags from the source snapshot to the copied
     *         snapshot.
     *         </p>
     */
    public Boolean getCopyTags() {
        return copyTags;
    }

    /**
     * <p>
     * Copy all user-defined tags from the source snapshot to the copied
     * snapshot.
     * </p>
     *
     * @param copyTags <p>
     *            Copy all user-defined tags from the source snapshot to the
     *            copied snapshot.
     *            </p>
     */
    public void setCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
    }

    /**
     * <p>
     * Copy all user-defined tags from the source snapshot to the copied
     * snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copyTags <p>
     *            Copy all user-defined tags from the source snapshot to the
     *            copied snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CrossRegionCopyRule withCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
        return this;
    }

    /**
     * <p>
     * The retention rule.
     * </p>
     *
     * @return <p>
     *         The retention rule.
     *         </p>
     */
    public CrossRegionCopyRetainRule getRetainRule() {
        return retainRule;
    }

    /**
     * <p>
     * The retention rule.
     * </p>
     *
     * @param retainRule <p>
     *            The retention rule.
     *            </p>
     */
    public void setRetainRule(CrossRegionCopyRetainRule retainRule) {
        this.retainRule = retainRule;
    }

    /**
     * <p>
     * The retention rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param retainRule <p>
     *            The retention rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CrossRegionCopyRule withRetainRule(CrossRegionCopyRetainRule retainRule) {
        this.retainRule = retainRule;
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
        if (getTargetRegion() != null)
            sb.append("TargetRegion: " + getTargetRegion() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted() + ",");
        if (getCmkArn() != null)
            sb.append("CmkArn: " + getCmkArn() + ",");
        if (getCopyTags() != null)
            sb.append("CopyTags: " + getCopyTags() + ",");
        if (getRetainRule() != null)
            sb.append("RetainRule: " + getRetainRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTargetRegion() == null) ? 0 : getTargetRegion().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getCmkArn() == null) ? 0 : getCmkArn().hashCode());
        hashCode = prime * hashCode + ((getCopyTags() == null) ? 0 : getCopyTags().hashCode());
        hashCode = prime * hashCode + ((getRetainRule() == null) ? 0 : getRetainRule().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CrossRegionCopyRule == false)
            return false;
        CrossRegionCopyRule other = (CrossRegionCopyRule) obj;

        if (other.getTargetRegion() == null ^ this.getTargetRegion() == null)
            return false;
        if (other.getTargetRegion() != null
                && other.getTargetRegion().equals(this.getTargetRegion()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null
                && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getCmkArn() == null ^ this.getCmkArn() == null)
            return false;
        if (other.getCmkArn() != null && other.getCmkArn().equals(this.getCmkArn()) == false)
            return false;
        if (other.getCopyTags() == null ^ this.getCopyTags() == null)
            return false;
        if (other.getCopyTags() != null && other.getCopyTags().equals(this.getCopyTags()) == false)
            return false;
        if (other.getRetainRule() == null ^ this.getRetainRule() == null)
            return false;
        if (other.getRetainRule() != null
                && other.getRetainRule().equals(this.getRetainRule()) == false)
            return false;
        return true;
    }
}
