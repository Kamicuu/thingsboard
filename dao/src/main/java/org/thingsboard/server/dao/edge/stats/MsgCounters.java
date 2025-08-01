/**
 * Copyright © 2016-2025 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.dao.edge.stats;

import lombok.Data;
import org.thingsboard.server.common.data.id.TenantId;

import java.util.concurrent.atomic.AtomicLong;

@Data
public class MsgCounters {

    private final TenantId tenantId;
    private final AtomicLong msgsAdded = new AtomicLong();
    private final AtomicLong msgsPushed = new AtomicLong();
    private final AtomicLong msgsPermanentlyFailed = new AtomicLong();
    private final AtomicLong msgsTmpFailed = new AtomicLong();
    private final AtomicLong msgsLag = new AtomicLong();

    public void clear() {
        msgsAdded.set(0);
        msgsPushed.set(0);
        msgsPermanentlyFailed.set(0);
        msgsTmpFailed.set(0);
        msgsLag.set(0);
    }

}
