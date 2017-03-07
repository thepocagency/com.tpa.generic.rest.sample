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

package com.tpa.generic.rest.sample.controller;

import com.tpa.generic.rest.mongodbbased.generic.controller.SecuredCRUDControllerAbst;
import com.tpa.generic.rest.mongodbbased.security.data.bean.Role;
import com.tpa.generic.rest.mongodbbased.security.service.SimpleAccessTokenService;
import com.tpa.generic.rest.sample.data.bean.Message;
import com.tpa.generic.rest.sample.service.MessageService;
import com.tpa.generic.tools.primitivetype.exception.type.ForbiddenAccessException;
import com.tpa.generic.tools.primitivetype.uri.RequestUtils;
import com.tpa.generic.tools.service.global.GlobalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Alexandre Veremme @ The POC Agency | alex [at] the-poc-agency.com
 */

@RestController
@RequestMapping("/message")
public class MessageController extends SecuredCRUDControllerAbst<SimpleAccessTokenService, Message, MessageService> {
    
    @Autowired
    MessageController(GlobalService globalService, SimpleAccessTokenService simpleAccessTokenService, MessageService messageService) throws ForbiddenAccessException {
        super(globalService, simpleAccessTokenService, messageService);
        setRights(RequestUtils.initRights(Role.VISITOR));
    }
}
