/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.seatunnel.datasource.service;

import org.apache.seatunnel.datasource.model.Table;

import java.util.List;
import java.util.Map;

public interface SeaTunnelTableService {
    Boolean createTable(Long datasourceId, String databaseName, String tableName, Map<String, String> tableFields, String description);

    Boolean dropSchema(String schemaId);

    Table getTable(Long datasourceId, String databaseName, String tableName);

    List<String> getTableNames(Long datasourceId, String databaseName);

    List<String> getDatabaseNames(Long datasourceId);

    List<Table> getTables(String datasourceId, String databaseName);

}
