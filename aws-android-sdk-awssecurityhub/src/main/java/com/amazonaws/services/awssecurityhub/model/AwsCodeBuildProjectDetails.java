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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an AWS CodeBuild project.
 * </p>
 */
public class AwsCodeBuildProjectDetails implements Serializable {
    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) used
     * to encrypt the build output artifacts.
     * </p>
     * <p>
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if
     * available, the CMK alias (using the format alias/alias-name).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String encryptionKey;

    /**
     * <p>
     * Information about the build environment for this build project.
     * </p>
     */
    private AwsCodeBuildProjectEnvironment environment;

    /**
     * <p>
     * The name of the build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String name;

    /**
     * <p>
     * Information about the build input source code for this build project.
     * </p>
     */
    private AwsCodeBuildProjectSource source;

    /**
     * <p>
     * The ARN of the IAM role that enables AWS CodeBuild to interact with
     * dependent AWS services on behalf of the AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String serviceRole;

    /**
     * <p>
     * Information about the VPC configuration that AWS CodeBuild accesses.
     * </p>
     */
    private AwsCodeBuildProjectVpcConfig vpcConfig;

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) used
     * to encrypt the build output artifacts.
     * </p>
     * <p>
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if
     * available, the CMK alias (using the format alias/alias-name).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The AWS Key Management Service (AWS KMS) customer master key
     *         (CMK) used to encrypt the build output artifacts.
     *         </p>
     *         <p>
     *         You can specify either the Amazon Resource Name (ARN) of the CMK
     *         or, if available, the CMK alias (using the format
     *         alias/alias-name).
     *         </p>
     */
    public String getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) used
     * to encrypt the build output artifacts.
     * </p>
     * <p>
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if
     * available, the CMK alias (using the format alias/alias-name).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param encryptionKey <p>
     *            The AWS Key Management Service (AWS KMS) customer master key
     *            (CMK) used to encrypt the build output artifacts.
     *            </p>
     *            <p>
     *            You can specify either the Amazon Resource Name (ARN) of the
     *            CMK or, if available, the CMK alias (using the format
     *            alias/alias-name).
     *            </p>
     */
    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) used
     * to encrypt the build output artifacts.
     * </p>
     * <p>
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if
     * available, the CMK alias (using the format alias/alias-name).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param encryptionKey <p>
     *            The AWS Key Management Service (AWS KMS) customer master key
     *            (CMK) used to encrypt the build output artifacts.
     *            </p>
     *            <p>
     *            You can specify either the Amazon Resource Name (ARN) of the
     *            CMK or, if available, the CMK alias (using the format
     *            alias/alias-name).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCodeBuildProjectDetails withEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }

    /**
     * <p>
     * Information about the build environment for this build project.
     * </p>
     *
     * @return <p>
     *         Information about the build environment for this build project.
     *         </p>
     */
    public AwsCodeBuildProjectEnvironment getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * Information about the build environment for this build project.
     * </p>
     *
     * @param environment <p>
     *            Information about the build environment for this build
     *            project.
     *            </p>
     */
    public void setEnvironment(AwsCodeBuildProjectEnvironment environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * Information about the build environment for this build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environment <p>
     *            Information about the build environment for this build
     *            project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCodeBuildProjectDetails withEnvironment(AwsCodeBuildProjectEnvironment environment) {
        this.environment = environment;
        return this;
    }

    /**
     * <p>
     * The name of the build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The name of the build project.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The name of the build project.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The name of the build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCodeBuildProjectDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Information about the build input source code for this build project.
     * </p>
     *
     * @return <p>
     *         Information about the build input source code for this build
     *         project.
     *         </p>
     */
    public AwsCodeBuildProjectSource getSource() {
        return source;
    }

    /**
     * <p>
     * Information about the build input source code for this build project.
     * </p>
     *
     * @param source <p>
     *            Information about the build input source code for this build
     *            project.
     *            </p>
     */
    public void setSource(AwsCodeBuildProjectSource source) {
        this.source = source;
    }

    /**
     * <p>
     * Information about the build input source code for this build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param source <p>
     *            Information about the build input source code for this build
     *            project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCodeBuildProjectDetails withSource(AwsCodeBuildProjectSource source) {
        this.source = source;
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that enables AWS CodeBuild to interact with
     * dependent AWS services on behalf of the AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ARN of the IAM role that enables AWS CodeBuild to interact
     *         with dependent AWS services on behalf of the AWS account.
     *         </p>
     */
    public String getServiceRole() {
        return serviceRole;
    }

    /**
     * <p>
     * The ARN of the IAM role that enables AWS CodeBuild to interact with
     * dependent AWS services on behalf of the AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param serviceRole <p>
     *            The ARN of the IAM role that enables AWS CodeBuild to interact
     *            with dependent AWS services on behalf of the AWS account.
     *            </p>
     */
    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The ARN of the IAM role that enables AWS CodeBuild to interact with
     * dependent AWS services on behalf of the AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param serviceRole <p>
     *            The ARN of the IAM role that enables AWS CodeBuild to interact
     *            with dependent AWS services on behalf of the AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCodeBuildProjectDetails withServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }

    /**
     * <p>
     * Information about the VPC configuration that AWS CodeBuild accesses.
     * </p>
     *
     * @return <p>
     *         Information about the VPC configuration that AWS CodeBuild
     *         accesses.
     *         </p>
     */
    public AwsCodeBuildProjectVpcConfig getVpcConfig() {
        return vpcConfig;
    }

    /**
     * <p>
     * Information about the VPC configuration that AWS CodeBuild accesses.
     * </p>
     *
     * @param vpcConfig <p>
     *            Information about the VPC configuration that AWS CodeBuild
     *            accesses.
     *            </p>
     */
    public void setVpcConfig(AwsCodeBuildProjectVpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * Information about the VPC configuration that AWS CodeBuild accesses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcConfig <p>
     *            Information about the VPC configuration that AWS CodeBuild
     *            accesses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCodeBuildProjectDetails withVpcConfig(AwsCodeBuildProjectVpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
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
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: " + getEncryptionKey() + ",");
        if (getEnvironment() != null)
            sb.append("Environment: " + getEnvironment() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getSource() != null)
            sb.append("Source: " + getSource() + ",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: " + getServiceRole() + ",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: " + getVpcConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode
                + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCodeBuildProjectDetails == false)
            return false;
        AwsCodeBuildProjectDetails other = (AwsCodeBuildProjectDetails) obj;

        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null
                && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null
                && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null
                && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null
                && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        return true;
    }
}
