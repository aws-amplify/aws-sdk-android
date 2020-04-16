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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

public class CreateHumanTaskUiResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human review workflow user
     * interface you create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:human-task-ui/.*<br/>
     */
    private String humanTaskUiArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human review workflow user
     * interface you create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:human-task-ui/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the human review workflow user
     *         interface you create.
     *         </p>
     */
    public String getHumanTaskUiArn() {
        return humanTaskUiArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human review workflow user
     * interface you create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:human-task-ui/.*<br/>
     *
     * @param humanTaskUiArn <p>
     *            The Amazon Resource Name (ARN) of the human review workflow
     *            user interface you create.
     *            </p>
     */
    public void setHumanTaskUiArn(String humanTaskUiArn) {
        this.humanTaskUiArn = humanTaskUiArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human review workflow user
     * interface you create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:human-task-ui/.*<br/>
     *
     * @param humanTaskUiArn <p>
     *            The Amazon Resource Name (ARN) of the human review workflow
     *            user interface you create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHumanTaskUiResult withHumanTaskUiArn(String humanTaskUiArn) {
        this.humanTaskUiArn = humanTaskUiArn;
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
        if (getHumanTaskUiArn() != null)
            sb.append("HumanTaskUiArn: " + getHumanTaskUiArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHumanTaskUiArn() == null) ? 0 : getHumanTaskUiArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHumanTaskUiResult == false)
            return false;
        CreateHumanTaskUiResult other = (CreateHumanTaskUiResult) obj;

        if (other.getHumanTaskUiArn() == null ^ this.getHumanTaskUiArn() == null)
            return false;
        if (other.getHumanTaskUiArn() != null
                && other.getHumanTaskUiArn().equals(this.getHumanTaskUiArn()) == false)
            return false;
        return true;
    }
}
