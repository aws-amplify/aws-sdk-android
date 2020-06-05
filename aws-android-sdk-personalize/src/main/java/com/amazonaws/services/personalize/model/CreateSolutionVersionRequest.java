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
 * Trains or retrains an active solution. A solution is created using the
 * <a>CreateSolution</a> operation and must be in the ACTIVE state before
 * calling <code>CreateSolutionVersion</code>. A new version of the solution is
 * created every time you call this operation.
 * </p>
 * <p>
 * <b>Status</b>
 * </p>
 * <p>
 * A solution version can be in one of the following states:
 * </p>
 * <ul>
 * <li>
 * <p>
 * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
 * </p>
 * </li>
 * </ul>
 * <p>
 * To get the status of the version, call <a>DescribeSolutionVersion</a>. Wait
 * until the status shows as ACTIVE before calling <code>CreateCampaign</code>.
 * </p>
 * <p>
 * If the status shows as CREATE FAILED, the response includes a
 * <code>failureReason</code> key, which describes why the job failed.
 * </p>
 * <p class="title">
 * <b>Related APIs</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListSolutionVersions</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeSolutionVersion</a>
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * <a>ListSolutions</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateSolution</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeSolution</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteSolution</a>
 * </p>
 * </li>
 * </ul>
 */
public class CreateSolutionVersionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution containing the training
     * configuration information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String solutionArn;

    /**
     * <p>
     * The scope of training to be performed when creating the solution version.
     * The <code>FULL</code> option trains the solution version based on the
     * entirety of the input solution's training data, while the
     * <code>UPDATE</code> option processes only the data that has changed in
     * comparison to the input solution. Choose <code>UPDATE</code> when you
     * want to incrementally update your solution version instead of creating an
     * entirely new one.
     * </p>
     * <important>
     * <p>
     * The <code>UPDATE</code> option can only be used when you already have an
     * active solution version created from the input solution using the
     * <code>FULL</code> option and the input solution was trained with the
     * <a>native-recipe-hrnn-coldstart</a> recipe.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL, UPDATE
     */
    private String trainingMode;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution containing the training
     * configuration information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the solution containing the
     *         training configuration information.
     *         </p>
     */
    public String getSolutionArn() {
        return solutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution containing the training
     * configuration information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param solutionArn <p>
     *            The Amazon Resource Name (ARN) of the solution containing the
     *            training configuration information.
     *            </p>
     */
    public void setSolutionArn(String solutionArn) {
        this.solutionArn = solutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution containing the training
     * configuration information.
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
     *            The Amazon Resource Name (ARN) of the solution containing the
     *            training configuration information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSolutionVersionRequest withSolutionArn(String solutionArn) {
        this.solutionArn = solutionArn;
        return this;
    }

    /**
     * <p>
     * The scope of training to be performed when creating the solution version.
     * The <code>FULL</code> option trains the solution version based on the
     * entirety of the input solution's training data, while the
     * <code>UPDATE</code> option processes only the data that has changed in
     * comparison to the input solution. Choose <code>UPDATE</code> when you
     * want to incrementally update your solution version instead of creating an
     * entirely new one.
     * </p>
     * <important>
     * <p>
     * The <code>UPDATE</code> option can only be used when you already have an
     * active solution version created from the input solution using the
     * <code>FULL</code> option and the input solution was trained with the
     * <a>native-recipe-hrnn-coldstart</a> recipe.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL, UPDATE
     *
     * @return <p>
     *         The scope of training to be performed when creating the solution
     *         version. The <code>FULL</code> option trains the solution version
     *         based on the entirety of the input solution's training data,
     *         while the <code>UPDATE</code> option processes only the data that
     *         has changed in comparison to the input solution. Choose
     *         <code>UPDATE</code> when you want to incrementally update your
     *         solution version instead of creating an entirely new one.
     *         </p>
     *         <important>
     *         <p>
     *         The <code>UPDATE</code> option can only be used when you already
     *         have an active solution version created from the input solution
     *         using the <code>FULL</code> option and the input solution was
     *         trained with the <a>native-recipe-hrnn-coldstart</a> recipe.
     *         </p>
     *         </important>
     * @see TrainingMode
     */
    public String getTrainingMode() {
        return trainingMode;
    }

    /**
     * <p>
     * The scope of training to be performed when creating the solution version.
     * The <code>FULL</code> option trains the solution version based on the
     * entirety of the input solution's training data, while the
     * <code>UPDATE</code> option processes only the data that has changed in
     * comparison to the input solution. Choose <code>UPDATE</code> when you
     * want to incrementally update your solution version instead of creating an
     * entirely new one.
     * </p>
     * <important>
     * <p>
     * The <code>UPDATE</code> option can only be used when you already have an
     * active solution version created from the input solution using the
     * <code>FULL</code> option and the input solution was trained with the
     * <a>native-recipe-hrnn-coldstart</a> recipe.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL, UPDATE
     *
     * @param trainingMode <p>
     *            The scope of training to be performed when creating the
     *            solution version. The <code>FULL</code> option trains the
     *            solution version based on the entirety of the input solution's
     *            training data, while the <code>UPDATE</code> option processes
     *            only the data that has changed in comparison to the input
     *            solution. Choose <code>UPDATE</code> when you want to
     *            incrementally update your solution version instead of creating
     *            an entirely new one.
     *            </p>
     *            <important>
     *            <p>
     *            The <code>UPDATE</code> option can only be used when you
     *            already have an active solution version created from the input
     *            solution using the <code>FULL</code> option and the input
     *            solution was trained with the
     *            <a>native-recipe-hrnn-coldstart</a> recipe.
     *            </p>
     *            </important>
     * @see TrainingMode
     */
    public void setTrainingMode(String trainingMode) {
        this.trainingMode = trainingMode;
    }

    /**
     * <p>
     * The scope of training to be performed when creating the solution version.
     * The <code>FULL</code> option trains the solution version based on the
     * entirety of the input solution's training data, while the
     * <code>UPDATE</code> option processes only the data that has changed in
     * comparison to the input solution. Choose <code>UPDATE</code> when you
     * want to incrementally update your solution version instead of creating an
     * entirely new one.
     * </p>
     * <important>
     * <p>
     * The <code>UPDATE</code> option can only be used when you already have an
     * active solution version created from the input solution using the
     * <code>FULL</code> option and the input solution was trained with the
     * <a>native-recipe-hrnn-coldstart</a> recipe.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL, UPDATE
     *
     * @param trainingMode <p>
     *            The scope of training to be performed when creating the
     *            solution version. The <code>FULL</code> option trains the
     *            solution version based on the entirety of the input solution's
     *            training data, while the <code>UPDATE</code> option processes
     *            only the data that has changed in comparison to the input
     *            solution. Choose <code>UPDATE</code> when you want to
     *            incrementally update your solution version instead of creating
     *            an entirely new one.
     *            </p>
     *            <important>
     *            <p>
     *            The <code>UPDATE</code> option can only be used when you
     *            already have an active solution version created from the input
     *            solution using the <code>FULL</code> option and the input
     *            solution was trained with the
     *            <a>native-recipe-hrnn-coldstart</a> recipe.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrainingMode
     */
    public CreateSolutionVersionRequest withTrainingMode(String trainingMode) {
        this.trainingMode = trainingMode;
        return this;
    }

    /**
     * <p>
     * The scope of training to be performed when creating the solution version.
     * The <code>FULL</code> option trains the solution version based on the
     * entirety of the input solution's training data, while the
     * <code>UPDATE</code> option processes only the data that has changed in
     * comparison to the input solution. Choose <code>UPDATE</code> when you
     * want to incrementally update your solution version instead of creating an
     * entirely new one.
     * </p>
     * <important>
     * <p>
     * The <code>UPDATE</code> option can only be used when you already have an
     * active solution version created from the input solution using the
     * <code>FULL</code> option and the input solution was trained with the
     * <a>native-recipe-hrnn-coldstart</a> recipe.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL, UPDATE
     *
     * @param trainingMode <p>
     *            The scope of training to be performed when creating the
     *            solution version. The <code>FULL</code> option trains the
     *            solution version based on the entirety of the input solution's
     *            training data, while the <code>UPDATE</code> option processes
     *            only the data that has changed in comparison to the input
     *            solution. Choose <code>UPDATE</code> when you want to
     *            incrementally update your solution version instead of creating
     *            an entirely new one.
     *            </p>
     *            <important>
     *            <p>
     *            The <code>UPDATE</code> option can only be used when you
     *            already have an active solution version created from the input
     *            solution using the <code>FULL</code> option and the input
     *            solution was trained with the
     *            <a>native-recipe-hrnn-coldstart</a> recipe.
     *            </p>
     *            </important>
     * @see TrainingMode
     */
    public void setTrainingMode(TrainingMode trainingMode) {
        this.trainingMode = trainingMode.toString();
    }

    /**
     * <p>
     * The scope of training to be performed when creating the solution version.
     * The <code>FULL</code> option trains the solution version based on the
     * entirety of the input solution's training data, while the
     * <code>UPDATE</code> option processes only the data that has changed in
     * comparison to the input solution. Choose <code>UPDATE</code> when you
     * want to incrementally update your solution version instead of creating an
     * entirely new one.
     * </p>
     * <important>
     * <p>
     * The <code>UPDATE</code> option can only be used when you already have an
     * active solution version created from the input solution using the
     * <code>FULL</code> option and the input solution was trained with the
     * <a>native-recipe-hrnn-coldstart</a> recipe.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL, UPDATE
     *
     * @param trainingMode <p>
     *            The scope of training to be performed when creating the
     *            solution version. The <code>FULL</code> option trains the
     *            solution version based on the entirety of the input solution's
     *            training data, while the <code>UPDATE</code> option processes
     *            only the data that has changed in comparison to the input
     *            solution. Choose <code>UPDATE</code> when you want to
     *            incrementally update your solution version instead of creating
     *            an entirely new one.
     *            </p>
     *            <important>
     *            <p>
     *            The <code>UPDATE</code> option can only be used when you
     *            already have an active solution version created from the input
     *            solution using the <code>FULL</code> option and the input
     *            solution was trained with the
     *            <a>native-recipe-hrnn-coldstart</a> recipe.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrainingMode
     */
    public CreateSolutionVersionRequest withTrainingMode(TrainingMode trainingMode) {
        this.trainingMode = trainingMode.toString();
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
            sb.append("solutionArn: " + getSolutionArn() + ",");
        if (getTrainingMode() != null)
            sb.append("trainingMode: " + getTrainingMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSolutionArn() == null) ? 0 : getSolutionArn().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingMode() == null) ? 0 : getTrainingMode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSolutionVersionRequest == false)
            return false;
        CreateSolutionVersionRequest other = (CreateSolutionVersionRequest) obj;

        if (other.getSolutionArn() == null ^ this.getSolutionArn() == null)
            return false;
        if (other.getSolutionArn() != null
                && other.getSolutionArn().equals(this.getSolutionArn()) == false)
            return false;
        if (other.getTrainingMode() == null ^ this.getTrainingMode() == null)
            return false;
        if (other.getTrainingMode() != null
                && other.getTrainingMode().equals(this.getTrainingMode()) == false)
            return false;
        return true;
    }
}
