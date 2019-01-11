/**
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.s3.transferutility;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

class TransferThreadPool {
    
    private static final Log LOGGER = LogFactory.getLog(TransferService.class);

    private static ExecutorService executorMainTask;
    private static ExecutorService executorPartTask;

    static synchronized void init(final int transferThreadPoolSize) {
        LOGGER.debug("Initializing the thread pool of size: " + transferThreadPoolSize);
        
        final int poolSize = Math.max((int) (Math.ceil((double) transferThreadPoolSize / 2)), 1);
        
        if (executorMainTask == null) {
            executorMainTask = buildExecutor(poolSize);
        }
        if (executorPartTask == null) {
            executorPartTask = buildExecutor(poolSize);
        }
    }

    public static <T> Future<T> submitTask(Callable<T> c) {
        init(TransferUtilityOptions.getDefaultThreadPoolSize());
        if (c instanceof UploadPartTask) {
            return executorPartTask.submit(c);
        } else {
            return executorMainTask.submit(c);
        }
    }

    public static void closeThreadPool() {
        if (executorPartTask != null) {
            shutdown(executorPartTask);
            executorPartTask = null;
        }
        if (executorMainTask != null) {
            shutdown(executorMainTask);
            executorMainTask = null;
        }
    }

    private static final int WAIT_TIME = 250;

    private static void shutdown(ExecutorService executor) {
        if (executor == null) {
            return;
        }
        // Attempt to shutdown executor
        executor.shutdown();
        try {
            // Wait for existing tasks
            if (!executor.awaitTermination(WAIT_TIME, TimeUnit.MILLISECONDS)) {
                // Cancel tasks in execution
                executor.shutdownNow();
            }
        } catch (final InterruptedException ie) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    private static ExecutorService buildExecutor(int maxThreadsAllowed) {
        /*
         * Create a bounded thread pool for executing transfers; it creates
         * threads as needed (up to maximum) and reclaims them when finished.
         */
        final ThreadPoolExecutor executor = new ThreadPoolExecutor(maxThreadsAllowed,
                maxThreadsAllowed, 10, TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>());
        /*
         * It's safe to discard tasks, as they are saved in database and will be
         * recovered on next database scan.
         */
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
        executor.allowCoreThreadTimeOut(true);
        return executor;
    }
}
