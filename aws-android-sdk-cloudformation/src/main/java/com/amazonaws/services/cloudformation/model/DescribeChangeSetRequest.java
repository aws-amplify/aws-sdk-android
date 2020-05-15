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
 * Returns the inputs for the change set and a list of changes that AWS
 * CloudFormation will make if you execute the change set. For more information,
 * see <a href=
 * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-changesets.html"
 * >Updating Stacks Using Change Sets</a> in the AWS CloudFormation User Guide.
 * </p>
 */
public class DescribeChangeSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the change set that you want to
     * describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[a-zA-Z][-a-zA-Z0-9]*|arn:[-a-zA-Z0-9:/]*<br/>
     */
    private String changeSetName;

    /**
     * <p>
     * If you specified the name of a change set, specify the stack name or ID
     * (ARN) of the change set you want to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     */
    private String stackName;

    /**
     * <p>
     * A string (provided by the <a>DescribeChangeSet</a> response output) that
     * identifies the next page of information that you want to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the change set that you want to
     * describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[a-zA-Z][-a-zA-Z0-9]*|arn:[-a-zA-Z0-9:/]*<br/>
     *
     * @return <p>
     *         The name or Amazon Resource Name (ARN) of the change set that you
     *         want to describe.
     *         </p>
     */
    public String getChangeSetName() {
        return changeSetName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the change set that you want to
     * describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[a-zA-Z][-a-zA-Z0-9]*|arn:[-a-zA-Z0-9:/]*<br/>
     *
     * @param changeSetName <p>
     *            The name or Amazon Resource Name (ARN) of the change set that
     *            you want to describe.
     *            </p>
     */
    public void setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the change set that you want to
     * describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[a-zA-Z][-a-zA-Z0-9]*|arn:[-a-zA-Z0-9:/]*<br/>
     *
     * @param changeSetName <p>
     *            The name or Amazon Resource Name (ARN) of the change set that
     *            you want to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChangeSetRequest withChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
        return this;
    }

    /**
     * <p>
     * If you specified the name of a change set, specify the stack name or ID
     * (ARN) of the change set you want to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     *
     * @return <p>
     *         If you specified the name of a change set, specify the stack name
     *         or ID (ARN) of the change set you want to describe.
     *         </p>
     */
    public String getStackName() {
        return stackName;
    }

    /**
     * <p>
     * If you specified the name of a change set, specify the stack name or ID
     * (ARN) of the change set you want to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     *
     * @param stackName <p>
     *            If you specified the name of a change set, specify the stack
     *            name or ID (ARN) of the change set you want to describe.
     *            </p>
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * If you specified the name of a change set, specify the stack name or ID
     * (ARN) of the change set you want to describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     *
     * @param stackName <p>
     *            If you specified the name of a change set, specify the stack
     *            name or ID (ARN) of the change set you want to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChangeSetRequest withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * <p>
     * A string (provided by the <a>DescribeChangeSet</a> response output) that
     * identifies the next page of information that you want to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         A string (provided by the <a>DescribeChangeSet</a> response
     *         output) that identifies the next page of information that you
     *         want to retrieve.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A string (provided by the <a>DescribeChangeSet</a> response output) that
     * identifies the next page of information that you want to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            A string (provided by the <a>DescribeChangeSet</a> response
     *            output) that identifies the next page of information that you
     *            want to retrieve.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string (provided by the <a>DescribeChangeSet</a> response output) that
     * identifies the next page of information that you want to retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            A string (provided by the <a>DescribeChangeSet</a> response
     *            output) that identifies the next page of information that you
     *            want to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChangeSetRequest withNextToken(String nextToken) {
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
        if (getChangeSetName() != null)
            sb.append("ChangeSetName: " + getChangeSetName() + ",");
        if (getStackName() != null)
            sb.append("StackName: " + getStackName() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getChangeSetName() == null) ? 0 : getChangeSetName().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeChangeSetRequest == false)
            return false;
        DescribeChangeSetRequest other = (DescribeChangeSetRequest) obj;

        if (other.getChangeSetName() == null ^ this.getChangeSetName() == null)
            return false;
        if (other.getChangeSetName() != null
                && other.getChangeSetName().equals(this.getChangeSetName()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null
                && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
