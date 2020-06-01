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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

public class DescribeWorkforceResult implements Serializable {
    /**
     * <p>
     * A single private workforce, which is automatically created when you
     * create your first private work team. You can create one private work
     * force in each AWS Region. By default, any workforce-related API operation
     * used in a specific region will apply to the workforce created in that
     * region. To learn how to create a private workforce, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-workforce-create-private.html"
     * >Create a Private Workforce</a>.
     * </p>
     */
    private Workforce workforce;

    /**
     * <p>
     * A single private workforce, which is automatically created when you
     * create your first private work team. You can create one private work
     * force in each AWS Region. By default, any workforce-related API operation
     * used in a specific region will apply to the workforce created in that
     * region. To learn how to create a private workforce, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-workforce-create-private.html"
     * >Create a Private Workforce</a>.
     * </p>
     *
     * @return <p>
     *         A single private workforce, which is automatically created when
     *         you create your first private work team. You can create one
     *         private work force in each AWS Region. By default, any
     *         workforce-related API operation used in a specific region will
     *         apply to the workforce created in that region. To learn how to
     *         create a private workforce, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-workforce-create-private.html"
     *         >Create a Private Workforce</a>.
     *         </p>
     */
    public Workforce getWorkforce() {
        return workforce;
    }

    /**
     * <p>
     * A single private workforce, which is automatically created when you
     * create your first private work team. You can create one private work
     * force in each AWS Region. By default, any workforce-related API operation
     * used in a specific region will apply to the workforce created in that
     * region. To learn how to create a private workforce, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-workforce-create-private.html"
     * >Create a Private Workforce</a>.
     * </p>
     *
     * @param workforce <p>
     *            A single private workforce, which is automatically created
     *            when you create your first private work team. You can create
     *            one private work force in each AWS Region. By default, any
     *            workforce-related API operation used in a specific region will
     *            apply to the workforce created in that region. To learn how to
     *            create a private workforce, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-workforce-create-private.html"
     *            >Create a Private Workforce</a>.
     *            </p>
     */
    public void setWorkforce(Workforce workforce) {
        this.workforce = workforce;
    }

    /**
     * <p>
     * A single private workforce, which is automatically created when you
     * create your first private work team. You can create one private work
     * force in each AWS Region. By default, any workforce-related API operation
     * used in a specific region will apply to the workforce created in that
     * region. To learn how to create a private workforce, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-workforce-create-private.html"
     * >Create a Private Workforce</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param workforce <p>
     *            A single private workforce, which is automatically created
     *            when you create your first private work team. You can create
     *            one private work force in each AWS Region. By default, any
     *            workforce-related API operation used in a specific region will
     *            apply to the workforce created in that region. To learn how to
     *            create a private workforce, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-workforce-create-private.html"
     *            >Create a Private Workforce</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeWorkforceResult withWorkforce(Workforce workforce) {
        this.workforce = workforce;
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
        if (getWorkforce() != null)
            sb.append("Workforce: " + getWorkforce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkforce() == null) ? 0 : getWorkforce().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeWorkforceResult == false)
            return false;
        DescribeWorkforceResult other = (DescribeWorkforceResult) obj;

        if (other.getWorkforce() == null ^ this.getWorkforce() == null)
            return false;
        if (other.getWorkforce() != null
                && other.getWorkforce().equals(this.getWorkforce()) == false)
            return false;
        return true;
    }
}
