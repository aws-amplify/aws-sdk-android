/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * The properties of a pre token generation Lambda trigger.
 * </p>
 */
public class PreTokenGenerationVersionConfigType implements Serializable {
    /**
     * <p>
     * The user pool trigger version of the request that Amazon Cognito sends to
     * your Lambda function. Higher-numbered versions add fields that support
     * new features.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>V1_0, V2_0
     */
    private String lambdaVersion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function that you want to assign to
     * your Lambda trigger.
     * </p>
     * <p>
     * This parameter and the <code>PreTokenGeneration</code> property of
     * <code>LambdaConfig</code> have the same value. For new instances of pre
     * token generation triggers, set <code>LambdaArn</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     */
    private String lambdaArn;

    /**
     * <p>
     * The user pool trigger version of the request that Amazon Cognito sends to
     * your Lambda function. Higher-numbered versions add fields that support
     * new features.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>V1_0, V2_0
     *
     * @return <p>
     *         The user pool trigger version of the request that Amazon Cognito
     *         sends to your Lambda function. Higher-numbered versions add
     *         fields that support new features.
     *         </p>
     * @see PreTokenGenerationLambdaVersionType
     */
    public String getLambdaVersion() {
        return lambdaVersion;
    }

    /**
     * <p>
     * The user pool trigger version of the request that Amazon Cognito sends to
     * your Lambda function. Higher-numbered versions add fields that support
     * new features.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>V1_0, V2_0
     *
     * @param lambdaVersion <p>
     *            The user pool trigger version of the request that Amazon
     *            Cognito sends to your Lambda function. Higher-numbered
     *            versions add fields that support new features.
     *            </p>
     * @see PreTokenGenerationLambdaVersionType
     */
    public void setLambdaVersion(String lambdaVersion) {
        this.lambdaVersion = lambdaVersion;
    }

    /**
     * <p>
     * The user pool trigger version of the request that Amazon Cognito sends to
     * your Lambda function. Higher-numbered versions add fields that support
     * new features.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>V1_0, V2_0
     *
     * @param lambdaVersion <p>
     *            The user pool trigger version of the request that Amazon
     *            Cognito sends to your Lambda function. Higher-numbered
     *            versions add fields that support new features.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PreTokenGenerationLambdaVersionType
     */
    public PreTokenGenerationVersionConfigType withLambdaVersion(String lambdaVersion) {
        this.lambdaVersion = lambdaVersion;
        return this;
    }

    /**
     * <p>
     * The user pool trigger version of the request that Amazon Cognito sends to
     * your Lambda function. Higher-numbered versions add fields that support
     * new features.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>V1_0, V2_0
     *
     * @param lambdaVersion <p>
     *            The user pool trigger version of the request that Amazon
     *            Cognito sends to your Lambda function. Higher-numbered
     *            versions add fields that support new features.
     *            </p>
     * @see PreTokenGenerationLambdaVersionType
     */
    public void setLambdaVersion(PreTokenGenerationLambdaVersionType lambdaVersion) {
        this.lambdaVersion = lambdaVersion.toString();
    }

    /**
     * <p>
     * The user pool trigger version of the request that Amazon Cognito sends to
     * your Lambda function. Higher-numbered versions add fields that support
     * new features.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>V1_0, V2_0
     *
     * @param lambdaVersion <p>
     *            The user pool trigger version of the request that Amazon
     *            Cognito sends to your Lambda function. Higher-numbered
     *            versions add fields that support new features.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PreTokenGenerationLambdaVersionType
     */
    public PreTokenGenerationVersionConfigType withLambdaVersion(
            PreTokenGenerationLambdaVersionType lambdaVersion) {
        this.lambdaVersion = lambdaVersion.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function that you want to assign to
     * your Lambda trigger.
     * </p>
     * <p>
     * This parameter and the <code>PreTokenGeneration</code> property of
     * <code>LambdaConfig</code> have the same value. For new instances of pre
     * token generation triggers, set <code>LambdaArn</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the function that you want to
     *         assign to your Lambda trigger.
     *         </p>
     *         <p>
     *         This parameter and the <code>PreTokenGeneration</code> property
     *         of <code>LambdaConfig</code> have the same value. For new
     *         instances of pre token generation triggers, set
     *         <code>LambdaArn</code>.
     *         </p>
     */
    public String getLambdaArn() {
        return lambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function that you want to assign to
     * your Lambda trigger.
     * </p>
     * <p>
     * This parameter and the <code>PreTokenGeneration</code> property of
     * <code>LambdaConfig</code> have the same value. For new instances of pre
     * token generation triggers, set <code>LambdaArn</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param lambdaArn <p>
     *            The Amazon Resource Name (ARN) of the function that you want
     *            to assign to your Lambda trigger.
     *            </p>
     *            <p>
     *            This parameter and the <code>PreTokenGeneration</code>
     *            property of <code>LambdaConfig</code> have the same value. For
     *            new instances of pre token generation triggers, set
     *            <code>LambdaArn</code>.
     *            </p>
     */
    public void setLambdaArn(String lambdaArn) {
        this.lambdaArn = lambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function that you want to assign to
     * your Lambda trigger.
     * </p>
     * <p>
     * This parameter and the <code>PreTokenGeneration</code> property of
     * <code>LambdaConfig</code> have the same value. For new instances of pre
     * token generation triggers, set <code>LambdaArn</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param lambdaArn <p>
     *            The Amazon Resource Name (ARN) of the function that you want
     *            to assign to your Lambda trigger.
     *            </p>
     *            <p>
     *            This parameter and the <code>PreTokenGeneration</code>
     *            property of <code>LambdaConfig</code> have the same value. For
     *            new instances of pre token generation triggers, set
     *            <code>LambdaArn</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PreTokenGenerationVersionConfigType withLambdaArn(String lambdaArn) {
        this.lambdaArn = lambdaArn;
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
        if (getLambdaVersion() != null)
            sb.append("LambdaVersion: " + getLambdaVersion() + ",");
        if (getLambdaArn() != null)
            sb.append("LambdaArn: " + getLambdaArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLambdaVersion() == null) ? 0 : getLambdaVersion().hashCode());
        hashCode = prime * hashCode + ((getLambdaArn() == null) ? 0 : getLambdaArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PreTokenGenerationVersionConfigType == false)
            return false;
        PreTokenGenerationVersionConfigType other = (PreTokenGenerationVersionConfigType) obj;

        if (other.getLambdaVersion() == null ^ this.getLambdaVersion() == null)
            return false;
        if (other.getLambdaVersion() != null
                && other.getLambdaVersion().equals(this.getLambdaVersion()) == false)
            return false;
        if (other.getLambdaArn() == null ^ this.getLambdaArn() == null)
            return false;
        if (other.getLambdaArn() != null
                && other.getLambdaArn().equals(this.getLambdaArn()) == false)
            return false;
        return true;
    }
}
