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

package com.amazonaws.services.synthetics.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Permanently deletes the specified canary.
 * </p>
 * <p>
 * When you delete a canary, resources used and created by the canary are not
 * automatically deleted. After you delete a canary that you do not intend to
 * use again, you should also delete the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The Lambda functions and layers used by this canary. These have the prefix
 * <code>cwsyn-<i>MyCanaryName</i> </code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The CloudWatch alarms created for this canary. These alarms have a name of
 * <code>Synthetics-SharpDrop-Alarm-<i>MyCanaryName</i> </code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon S3 objects and buckets, such as the canary's artifact location.
 * </p>
 * </li>
 * <li>
 * <p>
 * IAM roles created for the canary. If they were created in the console, these
 * roles have the name
 * <code> role/service-role/CloudWatchSyntheticsRole-<i>MyCanaryName</i> </code>
 * .
 * </p>
 * </li>
 * <li>
 * <p>
 * CloudWatch Logs log groups created for the canary. These logs groups have the
 * name <code>/aws/lambda/cwsyn-<i>MyCanaryName</i> </code>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Before you delete a canary, you might want to use <code>GetCanary</code> to
 * display the information about this canary. Make note of the information
 * returned by this operation so that you can delete these resources after you
 * delete the canary.
 * </p>
 */
public class DeleteCanaryRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the canary that you want to delete. To find the names of your
     * canaries, use <a>DescribeCanaries</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 21<br/>
     * <b>Pattern: </b>^[0-9a-z_\-]+$<br/>
     */
    private String name;

    /**
     * <p>
     * The name of the canary that you want to delete. To find the names of your
     * canaries, use <a>DescribeCanaries</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 21<br/>
     * <b>Pattern: </b>^[0-9a-z_\-]+$<br/>
     *
     * @return <p>
     *         The name of the canary that you want to delete. To find the names
     *         of your canaries, use <a>DescribeCanaries</a>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the canary that you want to delete. To find the names of your
     * canaries, use <a>DescribeCanaries</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 21<br/>
     * <b>Pattern: </b>^[0-9a-z_\-]+$<br/>
     *
     * @param name <p>
     *            The name of the canary that you want to delete. To find the
     *            names of your canaries, use <a>DescribeCanaries</a>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the canary that you want to delete. To find the names of your
     * canaries, use <a>DescribeCanaries</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 21<br/>
     * <b>Pattern: </b>^[0-9a-z_\-]+$<br/>
     *
     * @param name <p>
     *            The name of the canary that you want to delete. To find the
     *            names of your canaries, use <a>DescribeCanaries</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteCanaryRequest withName(String name) {
        this.name = name;
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
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCanaryRequest == false)
            return false;
        DeleteCanaryRequest other = (DeleteCanaryRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
