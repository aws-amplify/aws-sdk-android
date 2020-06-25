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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Changes the default customer master key (CMK) for EBS encryption by default
 * for your account in this Region.
 * </p>
 * <p>
 * AWS creates a unique AWS managed CMK in each Region for use with encryption
 * by default. If you change the default CMK to a symmetric customer managed
 * CMK, it is used instead of the AWS managed CMK. To reset the default CMK to
 * the AWS managed CMK for EBS, use <a>ResetEbsDefaultKmsKeyId</a>. Amazon EBS
 * does not support asymmetric CMKs.
 * </p>
 * <p>
 * If you delete or disable the customer managed CMK that you specified for use
 * with encryption by default, your instances will fail to launch.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
 * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide</i>.
 * </p>
 */
public class ModifyEbsDefaultKmsKeyIdRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) customer
     * master key (CMK) to use for Amazon EBS encryption. If this parameter is
     * not specified, your AWS managed CMK for EBS is used. If
     * <code>KmsKeyId</code> is specified, the encrypted state must be
     * <code>true</code>.
     * </p>
     * <p>
     * You can specify the CMK using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. For example, alias/ExampleAlias.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key
     * /<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias
     * /<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an
     * ID, alias, or ARN that is not valid, the action can appear to complete,
     * but eventually fails.
     * </p>
     * <p>
     * Amazon EBS does not support asymmetric CMKs.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) customer
     * master key (CMK) to use for Amazon EBS encryption. If this parameter is
     * not specified, your AWS managed CMK for EBS is used. If
     * <code>KmsKeyId</code> is specified, the encrypted state must be
     * <code>true</code>.
     * </p>
     * <p>
     * You can specify the CMK using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. For example, alias/ExampleAlias.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key
     * /<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias
     * /<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an
     * ID, alias, or ARN that is not valid, the action can appear to complete,
     * but eventually fails.
     * </p>
     * <p>
     * Amazon EBS does not support asymmetric CMKs.
     * </p>
     *
     * @return <p>
     *         The identifier of the AWS Key Management Service (AWS KMS)
     *         customer master key (CMK) to use for Amazon EBS encryption. If
     *         this parameter is not specified, your AWS managed CMK for EBS is
     *         used. If <code>KmsKeyId</code> is specified, the encrypted state
     *         must be <code>true</code>.
     *         </p>
     *         <p>
     *         You can specify the CMK using any of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key alias. For example, alias/ExampleAlias.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN. For example,
     *         arn:aws:kms:<i>us-east-1</i>:<i>012345678910
     *         </i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias ARN. For example,
     *         arn:aws:kms:<i>us-east-1</i>:<i>012345678910
     *         </i>:alias/<i>ExampleAlias</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         AWS authenticates the CMK asynchronously. Therefore, if you
     *         specify an ID, alias, or ARN that is not valid, the action can
     *         appear to complete, but eventually fails.
     *         </p>
     *         <p>
     *         Amazon EBS does not support asymmetric CMKs.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) customer
     * master key (CMK) to use for Amazon EBS encryption. If this parameter is
     * not specified, your AWS managed CMK for EBS is used. If
     * <code>KmsKeyId</code> is specified, the encrypted state must be
     * <code>true</code>.
     * </p>
     * <p>
     * You can specify the CMK using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. For example, alias/ExampleAlias.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key
     * /<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias
     * /<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an
     * ID, alias, or ARN that is not valid, the action can appear to complete,
     * but eventually fails.
     * </p>
     * <p>
     * Amazon EBS does not support asymmetric CMKs.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The identifier of the AWS Key Management Service (AWS KMS)
     *            customer master key (CMK) to use for Amazon EBS encryption. If
     *            this parameter is not specified, your AWS managed CMK for EBS
     *            is used. If <code>KmsKeyId</code> is specified, the encrypted
     *            state must be <code>true</code>.
     *            </p>
     *            <p>
     *            You can specify the CMK using any of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key alias. For example, alias/ExampleAlias.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN. For example,
     *            arn:aws:kms:<i>us-east-1</i>:<i>012345678910
     *            </i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias ARN. For example,
     *            arn:aws:kms:<i>us-east-1</i>:<i>012345678910
     *            </i>:alias/<i>ExampleAlias</i>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            AWS authenticates the CMK asynchronously. Therefore, if you
     *            specify an ID, alias, or ARN that is not valid, the action can
     *            appear to complete, but eventually fails.
     *            </p>
     *            <p>
     *            Amazon EBS does not support asymmetric CMKs.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) customer
     * master key (CMK) to use for Amazon EBS encryption. If this parameter is
     * not specified, your AWS managed CMK for EBS is used. If
     * <code>KmsKeyId</code> is specified, the encrypted state must be
     * <code>true</code>.
     * </p>
     * <p>
     * You can specify the CMK using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. For example, alias/ExampleAlias.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key
     * /<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias
     * /<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an
     * ID, alias, or ARN that is not valid, the action can appear to complete,
     * but eventually fails.
     * </p>
     * <p>
     * Amazon EBS does not support asymmetric CMKs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The identifier of the AWS Key Management Service (AWS KMS)
     *            customer master key (CMK) to use for Amazon EBS encryption. If
     *            this parameter is not specified, your AWS managed CMK for EBS
     *            is used. If <code>KmsKeyId</code> is specified, the encrypted
     *            state must be <code>true</code>.
     *            </p>
     *            <p>
     *            You can specify the CMK using any of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key alias. For example, alias/ExampleAlias.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN. For example,
     *            arn:aws:kms:<i>us-east-1</i>:<i>012345678910
     *            </i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias ARN. For example,
     *            arn:aws:kms:<i>us-east-1</i>:<i>012345678910
     *            </i>:alias/<i>ExampleAlias</i>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            AWS authenticates the CMK asynchronously. Therefore, if you
     *            specify an ID, alias, or ARN that is not valid, the action can
     *            appear to complete, but eventually fails.
     *            </p>
     *            <p>
     *            Amazon EBS does not support asymmetric CMKs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEbsDefaultKmsKeyIdRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEbsDefaultKmsKeyIdRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyEbsDefaultKmsKeyIdRequest == false)
            return false;
        ModifyEbsDefaultKmsKeyIdRequest other = (ModifyEbsDefaultKmsKeyIdRequest) obj;

        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
