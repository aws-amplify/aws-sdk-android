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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Stores a resource policy for the ARN of a <code>Project</code> or
 * <code>ReportGroup</code> object.
 * </p>
 */
public class PutResourcePolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A JSON-formatted resource policy. For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/project-sharing.html#project-sharing-share"
     * >Sharing a Project</a> and <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/report-groups-sharing.html#report-groups-sharing-share"
     * >Sharing a Report Group</a> in the <i>AWS CodeBuild User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String policy;

    /**
     * <p>
     * The ARN of the <code>Project</code> or <code>ReportGroup</code> resource
     * you want to associate with a resource policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String resourceArn;

    /**
     * <p>
     * A JSON-formatted resource policy. For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/project-sharing.html#project-sharing-share"
     * >Sharing a Project</a> and <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/report-groups-sharing.html#report-groups-sharing-share"
     * >Sharing a Report Group</a> in the <i>AWS CodeBuild User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         A JSON-formatted resource policy. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/codebuild/latest/userguide/project-sharing.html#project-sharing-share"
     *         >Sharing a Project</a> and <a href=
     *         "https://docs.aws.amazon.com/codebuild/latest/userguide/report-groups-sharing.html#report-groups-sharing-share"
     *         >Sharing a Report Group</a> in the <i>AWS CodeBuild User
     *         Guide</i>.
     *         </p>
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * <p>
     * A JSON-formatted resource policy. For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/project-sharing.html#project-sharing-share"
     * >Sharing a Project</a> and <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/report-groups-sharing.html#report-groups-sharing-share"
     * >Sharing a Report Group</a> in the <i>AWS CodeBuild User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param policy <p>
     *            A JSON-formatted resource policy. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/codebuild/latest/userguide/project-sharing.html#project-sharing-share"
     *            >Sharing a Project</a> and <a href=
     *            "https://docs.aws.amazon.com/codebuild/latest/userguide/report-groups-sharing.html#report-groups-sharing-share"
     *            >Sharing a Report Group</a> in the <i>AWS CodeBuild User
     *            Guide</i>.
     *            </p>
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * A JSON-formatted resource policy. For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/project-sharing.html#project-sharing-share"
     * >Sharing a Project</a> and <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/report-groups-sharing.html#report-groups-sharing-share"
     * >Sharing a Report Group</a> in the <i>AWS CodeBuild User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param policy <p>
     *            A JSON-formatted resource policy. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/codebuild/latest/userguide/project-sharing.html#project-sharing-share"
     *            >Sharing a Project</a> and <a href=
     *            "https://docs.aws.amazon.com/codebuild/latest/userguide/report-groups-sharing.html#report-groups-sharing-share"
     *            >Sharing a Report Group</a> in the <i>AWS CodeBuild User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutResourcePolicyRequest withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * <p>
     * The ARN of the <code>Project</code> or <code>ReportGroup</code> resource
     * you want to associate with a resource policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The ARN of the <code>Project</code> or <code>ReportGroup</code>
     *         resource you want to associate with a resource policy.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The ARN of the <code>Project</code> or <code>ReportGroup</code> resource
     * you want to associate with a resource policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param resourceArn <p>
     *            The ARN of the <code>Project</code> or
     *            <code>ReportGroup</code> resource you want to associate with a
     *            resource policy.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the <code>Project</code> or <code>ReportGroup</code> resource
     * you want to associate with a resource policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param resourceArn <p>
     *            The ARN of the <code>Project</code> or
     *            <code>ReportGroup</code> resource you want to associate with a
     *            resource policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutResourcePolicyRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
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
        if (getPolicy() != null)
            sb.append("policy: " + getPolicy() + ",");
        if (getResourceArn() != null)
            sb.append("resourceArn: " + getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutResourcePolicyRequest == false)
            return false;
        PutResourcePolicyRequest other = (PutResourcePolicyRequest) obj;

        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }
}
