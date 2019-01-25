/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

public class CreateEntityRecognizerResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the entity recognizer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:entity-recognizer
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String entityRecognizerArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the entity recognizer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:entity-recognizer
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) that identifies the entity
     *         recognizer.
     *         </p>
     */
    public String getEntityRecognizerArn() {
        return entityRecognizerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the entity recognizer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:entity-recognizer
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param entityRecognizerArn <p>
     *            The Amazon Resource Name (ARN) that identifies the entity
     *            recognizer.
     *            </p>
     */
    public void setEntityRecognizerArn(String entityRecognizerArn) {
        this.entityRecognizerArn = entityRecognizerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the entity recognizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:entity-recognizer
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param entityRecognizerArn <p>
     *            The Amazon Resource Name (ARN) that identifies the entity
     *            recognizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEntityRecognizerResult withEntityRecognizerArn(String entityRecognizerArn) {
        this.entityRecognizerArn = entityRecognizerArn;
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
        if (getEntityRecognizerArn() != null)
            sb.append("EntityRecognizerArn: " + getEntityRecognizerArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEntityRecognizerArn() == null) ? 0 : getEntityRecognizerArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEntityRecognizerResult == false)
            return false;
        CreateEntityRecognizerResult other = (CreateEntityRecognizerResult) obj;

        if (other.getEntityRecognizerArn() == null ^ this.getEntityRecognizerArn() == null)
            return false;
        if (other.getEntityRecognizerArn() != null
                && other.getEntityRecognizerArn().equals(this.getEntityRecognizerArn()) == false)
            return false;
        return true;
    }
}
