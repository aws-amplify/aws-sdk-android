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
 * The service can't be created because a service with the same name already
 * exists.
 * </p>
 */
public class ServiceAlreadyExistsException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The <code>CreatorRequestId</code> that was used to create the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String creatorRequestId;

    /**
     * <p>
     * The ID of the existing service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String serviceId;

    /**
     * Constructs a new ServiceAlreadyExistsException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ServiceAlreadyExistsException(String message) {
        super(message);
    }

    /**
     * <p>
     * The <code>CreatorRequestId</code> that was used to create the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         The <code>CreatorRequestId</code> that was used to create the
     *         service.
     *         </p>
     */
    public String getCreatorRequestId() {
        return creatorRequestId;
    }

    /**
     * <p>
     * The <code>CreatorRequestId</code> that was used to create the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param creatorRequestId <p>
     *            The <code>CreatorRequestId</code> that was used to create the
     *            service.
     *            </p>
     */
    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * The ID of the existing service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         The ID of the existing service.
     *         </p>
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * <p>
     * The ID of the existing service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param serviceId <p>
     *            The ID of the existing service.
     *            </p>
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
}
