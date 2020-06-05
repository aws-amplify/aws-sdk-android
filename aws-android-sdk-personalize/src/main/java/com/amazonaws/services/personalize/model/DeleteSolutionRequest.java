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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes all versions of a solution and the <code>Solution</code> object
 * itself. Before deleting a solution, you must delete all campaigns based on
 * the solution. To determine what campaigns are using the solution, call
 * <a>ListCampaigns</a> and supply the Amazon Resource Name (ARN) of the
 * solution. You can't delete a solution if an associated
 * <code>SolutionVersion</code> is in the CREATE PENDING or IN PROGRESS state.
 * For more information on solutions, see <a>CreateSolution</a>.
 * </p>
 */
public class DeleteSolutionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the solution to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String solutionArn;

    /**
     * <p>
     * The ARN of the solution to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The ARN of the solution to delete.
     *         </p>
     */
    public String getSolutionArn() {
        return solutionArn;
    }

    /**
     * <p>
     * The ARN of the solution to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param solutionArn <p>
     *            The ARN of the solution to delete.
     *            </p>
     */
    public void setSolutionArn(String solutionArn) {
        this.solutionArn = solutionArn;
    }

    /**
     * <p>
     * The ARN of the solution to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param solutionArn <p>
     *            The ARN of the solution to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteSolutionRequest withSolutionArn(String solutionArn) {
        this.solutionArn = solutionArn;
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
        if (getSolutionArn() != null)
            sb.append("solutionArn: " + getSolutionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSolutionArn() == null) ? 0 : getSolutionArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSolutionRequest == false)
            return false;
        DeleteSolutionRequest other = (DeleteSolutionRequest) obj;

        if (other.getSolutionArn() == null ^ this.getSolutionArn() == null)
            return false;
        if (other.getSolutionArn() != null
                && other.getSolutionArn().equals(this.getSolutionArn()) == false)
            return false;
        return true;
    }
}
