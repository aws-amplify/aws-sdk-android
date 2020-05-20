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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a Lambda function specified in a deployment.
 * </p>
 */
public class LambdaFunctionInfo implements Serializable {
    /**
     * <p>
     * The name of a Lambda function.
     * </p>
     */
    private String functionName;

    /**
     * <p>
     * The alias of a Lambda function. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"
     * >AWS Lambda Function Aliases</a> in the <i>AWS Lambda Developer
     * Guide</i>.
     * </p>
     */
    private String functionAlias;

    /**
     * <p>
     * The version of a Lambda function that production traffic points to.
     * </p>
     */
    private String currentVersion;

    /**
     * <p>
     * The version of a Lambda function that production traffic points to after
     * the Lambda function is deployed.
     * </p>
     */
    private String targetVersion;

    /**
     * <p>
     * The percentage of production traffic that the target version of a Lambda
     * function receives.
     * </p>
     */
    private Double targetVersionWeight;

    /**
     * <p>
     * The name of a Lambda function.
     * </p>
     *
     * @return <p>
     *         The name of a Lambda function.
     *         </p>
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * <p>
     * The name of a Lambda function.
     * </p>
     *
     * @param functionName <p>
     *            The name of a Lambda function.
     *            </p>
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of a Lambda function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param functionName <p>
     *            The name of a Lambda function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaFunctionInfo withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * <p>
     * The alias of a Lambda function. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"
     * >AWS Lambda Function Aliases</a> in the <i>AWS Lambda Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         The alias of a Lambda function. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"
     *         >AWS Lambda Function Aliases</a> in the <i>AWS Lambda Developer
     *         Guide</i>.
     *         </p>
     */
    public String getFunctionAlias() {
        return functionAlias;
    }

    /**
     * <p>
     * The alias of a Lambda function. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"
     * >AWS Lambda Function Aliases</a> in the <i>AWS Lambda Developer
     * Guide</i>.
     * </p>
     *
     * @param functionAlias <p>
     *            The alias of a Lambda function. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"
     *            >AWS Lambda Function Aliases</a> in the <i>AWS Lambda
     *            Developer Guide</i>.
     *            </p>
     */
    public void setFunctionAlias(String functionAlias) {
        this.functionAlias = functionAlias;
    }

    /**
     * <p>
     * The alias of a Lambda function. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"
     * >AWS Lambda Function Aliases</a> in the <i>AWS Lambda Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param functionAlias <p>
     *            The alias of a Lambda function. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"
     *            >AWS Lambda Function Aliases</a> in the <i>AWS Lambda
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaFunctionInfo withFunctionAlias(String functionAlias) {
        this.functionAlias = functionAlias;
        return this;
    }

    /**
     * <p>
     * The version of a Lambda function that production traffic points to.
     * </p>
     *
     * @return <p>
     *         The version of a Lambda function that production traffic points
     *         to.
     *         </p>
     */
    public String getCurrentVersion() {
        return currentVersion;
    }

    /**
     * <p>
     * The version of a Lambda function that production traffic points to.
     * </p>
     *
     * @param currentVersion <p>
     *            The version of a Lambda function that production traffic
     *            points to.
     *            </p>
     */
    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The version of a Lambda function that production traffic points to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentVersion <p>
     *            The version of a Lambda function that production traffic
     *            points to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaFunctionInfo withCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    /**
     * <p>
     * The version of a Lambda function that production traffic points to after
     * the Lambda function is deployed.
     * </p>
     *
     * @return <p>
     *         The version of a Lambda function that production traffic points
     *         to after the Lambda function is deployed.
     *         </p>
     */
    public String getTargetVersion() {
        return targetVersion;
    }

    /**
     * <p>
     * The version of a Lambda function that production traffic points to after
     * the Lambda function is deployed.
     * </p>
     *
     * @param targetVersion <p>
     *            The version of a Lambda function that production traffic
     *            points to after the Lambda function is deployed.
     *            </p>
     */
    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    /**
     * <p>
     * The version of a Lambda function that production traffic points to after
     * the Lambda function is deployed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetVersion <p>
     *            The version of a Lambda function that production traffic
     *            points to after the Lambda function is deployed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaFunctionInfo withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * <p>
     * The percentage of production traffic that the target version of a Lambda
     * function receives.
     * </p>
     *
     * @return <p>
     *         The percentage of production traffic that the target version of a
     *         Lambda function receives.
     *         </p>
     */
    public Double getTargetVersionWeight() {
        return targetVersionWeight;
    }

    /**
     * <p>
     * The percentage of production traffic that the target version of a Lambda
     * function receives.
     * </p>
     *
     * @param targetVersionWeight <p>
     *            The percentage of production traffic that the target version
     *            of a Lambda function receives.
     *            </p>
     */
    public void setTargetVersionWeight(Double targetVersionWeight) {
        this.targetVersionWeight = targetVersionWeight;
    }

    /**
     * <p>
     * The percentage of production traffic that the target version of a Lambda
     * function receives.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetVersionWeight <p>
     *            The percentage of production traffic that the target version
     *            of a Lambda function receives.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaFunctionInfo withTargetVersionWeight(Double targetVersionWeight) {
        this.targetVersionWeight = targetVersionWeight;
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
        if (getFunctionName() != null)
            sb.append("functionName: " + getFunctionName() + ",");
        if (getFunctionAlias() != null)
            sb.append("functionAlias: " + getFunctionAlias() + ",");
        if (getCurrentVersion() != null)
            sb.append("currentVersion: " + getCurrentVersion() + ",");
        if (getTargetVersion() != null)
            sb.append("targetVersion: " + getTargetVersion() + ",");
        if (getTargetVersionWeight() != null)
            sb.append("targetVersionWeight: " + getTargetVersionWeight());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode
                + ((getFunctionAlias() == null) ? 0 : getFunctionAlias().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode
                + ((getTargetVersion() == null) ? 0 : getTargetVersion().hashCode());
        hashCode = prime * hashCode
                + ((getTargetVersionWeight() == null) ? 0 : getTargetVersionWeight().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaFunctionInfo == false)
            return false;
        LambdaFunctionInfo other = (LambdaFunctionInfo) obj;

        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null
                && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getFunctionAlias() == null ^ this.getFunctionAlias() == null)
            return false;
        if (other.getFunctionAlias() != null
                && other.getFunctionAlias().equals(this.getFunctionAlias()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null
                && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        if (other.getTargetVersion() == null ^ this.getTargetVersion() == null)
            return false;
        if (other.getTargetVersion() != null
                && other.getTargetVersion().equals(this.getTargetVersion()) == false)
            return false;
        if (other.getTargetVersionWeight() == null ^ this.getTargetVersionWeight() == null)
            return false;
        if (other.getTargetVersionWeight() != null
                && other.getTargetVersionWeight().equals(this.getTargetVersionWeight()) == false)
            return false;
        return true;
    }
}
