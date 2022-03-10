/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

/**
 * <p>
 * A reference to the IAM managed policy that is passed as a session policy for
 * a role session or a federated user session.
 * </p>
 */
public class PolicyDescriptorType implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM managed policy to use as a
     * session policy for the role. For more information about ARNs, see <a
     * href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and Amazon Web Services Service
     * Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]+<br/>
     */
    private String arn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM managed policy to use as a
     * session policy for the role. For more information about ARNs, see <a
     * href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and Amazon Web Services Service
     * Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM managed policy to use
     *         as a session policy for the role. For more information about
     *         ARNs, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Names (ARNs) and Amazon Web Services Service
     *         Namespaces</a> in the <i>Amazon Web Services General
     *         Reference</i>.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM managed policy to use as a
     * session policy for the role. For more information about ARNs, see <a
     * href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and Amazon Web Services Service
     * Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]+<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the IAM managed policy to
     *            use as a session policy for the role. For more information
     *            about ARNs, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and Amazon Web Services Service
     *            Namespaces</a> in the <i>Amazon Web Services General
     *            Reference</i>.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM managed policy to use as a
     * session policy for the role. For more information about ARNs, see <a
     * href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and Amazon Web Services Service
     * Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]+<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the IAM managed policy to
     *            use as a session policy for the role. For more information
     *            about ARNs, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and Amazon Web Services Service
     *            Namespaces</a> in the <i>Amazon Web Services General
     *            Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyDescriptorType withArn(String arn) {
        this.arn = arn;
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
        if (getArn() != null)
            sb.append("arn: " + getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyDescriptorType == false)
            return false;
        PolicyDescriptorType other = (PolicyDescriptorType) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }
}
