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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists all stacks that are importing an exported output value. To modify or
 * remove an exported output value, first use this action to see which stacks
 * are using it. To see the exported output values in your account, see
 * <a>ListExports</a>.
 * </p>
 * <p>
 * For more information about importing an exported output value, see the <a
 * href=
 * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-importvalue.html"
 * > <code>Fn::ImportValue</code> </a> function.
 * </p>
 */
public class ListImportsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the exported output value. AWS CloudFormation returns the
     * stack names that are importing this value.
     * </p>
     */
    private String exportName;

    /**
     * <p>
     * A string (provided by the <a>ListImports</a> response output) that
     * identifies the next page of stacks that are importing the specified
     * exported output value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the exported output value. AWS CloudFormation returns the
     * stack names that are importing this value.
     * </p>
     *
     * @return <p>
     *         The name of the exported output value. AWS CloudFormation returns
     *         the stack names that are importing this value.
     *         </p>
     */
    public String getExportName() {
        return exportName;
    }

    /**
     * <p>
     * The name of the exported output value. AWS CloudFormation returns the
     * stack names that are importing this value.
     * </p>
     *
     * @param exportName <p>
     *            The name of the exported output value. AWS CloudFormation
     *            returns the stack names that are importing this value.
     *            </p>
     */
    public void setExportName(String exportName) {
        this.exportName = exportName;
    }

    /**
     * <p>
     * The name of the exported output value. AWS CloudFormation returns the
     * stack names that are importing this value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportName <p>
     *            The name of the exported output value. AWS CloudFormation
     *            returns the stack names that are importing this value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListImportsRequest withExportName(String exportName) {
        this.exportName = exportName;
        return this;
    }

    /**
     * <p>
     * A string (provided by the <a>ListImports</a> response output) that
     * identifies the next page of stacks that are importing the specified
     * exported output value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         A string (provided by the <a>ListImports</a> response output)
     *         that identifies the next page of stacks that are importing the
     *         specified exported output value.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A string (provided by the <a>ListImports</a> response output) that
     * identifies the next page of stacks that are importing the specified
     * exported output value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            A string (provided by the <a>ListImports</a> response output)
     *            that identifies the next page of stacks that are importing the
     *            specified exported output value.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string (provided by the <a>ListImports</a> response output) that
     * identifies the next page of stacks that are importing the specified
     * exported output value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            A string (provided by the <a>ListImports</a> response output)
     *            that identifies the next page of stacks that are importing the
     *            specified exported output value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListImportsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getExportName() != null)
            sb.append("ExportName: " + getExportName() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportName() == null) ? 0 : getExportName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListImportsRequest == false)
            return false;
        ListImportsRequest other = (ListImportsRequest) obj;

        if (other.getExportName() == null ^ this.getExportName() == null)
            return false;
        if (other.getExportName() != null
                && other.getExportName().equals(this.getExportName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
