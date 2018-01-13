/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.lex.interactionkit.listeners;

import com.amazonaws.mobileconnectors.lex.interactionkit.Response;
import com.amazonaws.mobileconnectors.lex.interactionkit.continuations.LexServiceContinuation;

/**
 * Interaction listener.
 */
public interface InteractionListener {

    /**
     * This is invoked when all information required to fulfill a transaction
     * has been recovered.
     *
     * @param response {@link Response}, contains the service
     *            response.
     */
    public void onReadyForFulfillment(final Response response);

    /**
     * This is invoked when input is required from the user.
     *
     * @param response {@link Response}, contains the service
     *            response.
     * @param continuation {@link LexServiceContinuation}, allows to
     *            continue with the current transaction.
     */
    public void promptUserToRespond(final Response response,
            final LexServiceContinuation continuation);

    /**
     * This method is invoked on error.
     *
     * @param response {@link Response}, contains the service
     *            response.
     * @param e error reported as {@link Exception}.
     */
    public void onInteractionError(final Response response, final Exception e);
}
