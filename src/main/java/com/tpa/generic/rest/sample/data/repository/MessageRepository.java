/*
 * Copyright 2017 the original author or authors.
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

package com.tpa.generic.rest.sample.data.repository;

import com.tpa.generic.rest.mongodbbased.generic.data.repository.RepositoryInt;
import com.tpa.generic.rest.sample.data.bean.Message;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 
 * @author Alexandre Veremme @ The POC Agency | alex [at] the-poc-agency.com
 */

@RepositoryRestResource(exported = false)
public interface MessageRepository extends RepositoryInt<Message> {

}
