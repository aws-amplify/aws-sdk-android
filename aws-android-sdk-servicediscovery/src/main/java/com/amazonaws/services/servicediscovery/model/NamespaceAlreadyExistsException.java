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

package com.amazonaws.services.servicediscovery.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The namespace that you're trying to create already exists.
 * </p>
 */
public class NamespaceAlreadyExistsException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The <code>CreatorRequestId</code> that was used to create the namespace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String creatorRequestId;

    /**
     * <p>
     * The ID of the existing namespace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String namespaceId;

    /**
     * Constructs a new NamespaceAlreadyExistsException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public NamespaceAlreadyExistsException(String message) {
        super(message);
    }

    /**
     * <p>
     * The <code>CreatorRequestId</code> that was used to create the namespace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         The <code>CreatorRequestId</code> that was used to create the
     *         namespace.
     *         </p>
     */
    public String getCreatorRequestId() {
        return creatorRequestId;
    }

    /**
     * <p>
     * The <code>CreatorRequestId</code> that was used to create the namespace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param creatorRequestId <p>
     *            The <code>CreatorRequestId</code> that was used to create the
     *            namespace.
     *            </p>
     */
    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * The ID of the existing namespace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         The ID of the existing namespace.
     *         </p>
     */
    public String getNamespaceId() {
        return namespaceId;
    }

    /**
     * <p>
     * The ID of the existing namespace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param namespaceId <p>
     *            The ID of the existing namespace.
     *            </p>
     */
    public void setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
    }
}
