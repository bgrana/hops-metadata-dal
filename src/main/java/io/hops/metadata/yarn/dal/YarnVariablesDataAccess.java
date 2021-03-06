/*
 * Copyright (C) 2015 hops.io.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

public interface YarnVariablesDataAccess<T> extends EntityDataAccess {

  /**
   * To fetch the only row in the table with id zero, param id must be equal
   * to Integer.MIN_VALUE.
   *
   * @param id
   * @return
   * @throws io.hops.exception.StorageException
   */
  T findById(int id) throws StorageException;

  void add(T toAdd) throws StorageException;
}
