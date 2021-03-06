/*******************************************************************************
 * Copyright 2013 Apigee Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.usergrid.services.exceptions;


import org.usergrid.services.ServiceContext;
import org.usergrid.services.ServiceRequest;


public class ForbiddenServiceOperationException extends ServiceInvocationException {

    private static final long serialVersionUID = 1L;


    public ForbiddenServiceOperationException( ServiceContext context ) {
        super( context, "Service operation not allowed" );
    }


    public ForbiddenServiceOperationException( ServiceRequest request ) {
        super( request, "Service operation not allowed" );
    }


    public ForbiddenServiceOperationException( ServiceRequest request, String message ) {
        super( request, message );
    }
}
