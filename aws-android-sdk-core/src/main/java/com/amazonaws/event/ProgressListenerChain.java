/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * An implementation of ProgressListener interface that delegates
 * progressChanged callback to multiple listeners. It also takes an optional
 * ProgressEventFilter to filter incoming events before passing them to the
 * listeners.
 * <p>
 * This class could be used for both Amazon S3 and Amazon Glacier clients. The
 * legacy Amazon S3 progress listener chain
 * com.amazonaws.services.s3.transfer.internal.ProgressListenerChain has been
 * deprecated in favor of this new class.
 * </p>
 */
public class ProgressListenerChain implements ProgressListener {
    private final List<ProgressListener> listeners = new CopyOnWriteArrayList<ProgressListener>();
    private final ProgressEventFilter progressEventFilter;

    private static final Log log = LogFactory.getLog(ProgressListenerChain.class);

    /**
     * Create a listener chain that directly passes all the progress events to
     * the specified listeners.
     * @param listeners the progress listener.
     */
    public ProgressListenerChain(ProgressListener... listeners) {
        this(null, listeners);
    }

    /**
     * Create a listener chain with a ProgressEventFilter.
     * @param listeners the progress listener.
     * @param progressEventFilter the progress event filter.
     */
    public ProgressListenerChain(ProgressEventFilter progressEventFilter,
            ProgressListener... listeners) {
        if (listeners == null) {
            throw new IllegalArgumentException(
                    "Progress Listeners cannot be null.");
        }
        for (ProgressListener listener : listeners)
            addProgressListener(listener);
        this.progressEventFilter = progressEventFilter;
    }

    /**
     * Adds the progress listener.
     * @param listener the progress listener.
     */
    public synchronized void addProgressListener(ProgressListener listener) {
        if (listener == null)
            return;
        this.listeners.add(listener);
    }

    /**
     * Removes the progress listeners.
     * @param listener the progress listener.
     */
    public synchronized void removeProgressListener(ProgressListener listener) {
        if (listener == null)
            return;
        this.listeners.remove(listener);
    }

    /**
     * @return the listeners associated with this listener chain.
     */
    protected List<ProgressListener> getListeners() {
        return listeners;
    }

    @Override
    public void progressChanged(final ProgressEvent progressEvent) {
        ProgressEvent filteredEvent = progressEvent;
        if (progressEventFilter != null) {
            filteredEvent = progressEventFilter.filter(progressEvent);
            if (filteredEvent == null)
                return;
        }

        for (ProgressListener listener : listeners) {
            try {
                listener.progressChanged(filteredEvent);
            } catch (RuntimeException e) {
                log.warn("Couldn't update progress listener", e);
            }
        }
    }

    /**
     * An interface that filters the incoming events before passing them into
     * the registered listeners.
     */
    public static interface ProgressEventFilter {

        /**
         * @param progressEvent the progress event.
         * @return the filtered event object that will be actually passed into
         * the listeners. Returns null if the event should be completely
         * blocked.
         */
        public ProgressEvent filter(ProgressEvent progressEvent);
    }
}
