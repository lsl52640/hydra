/*
 * Copyright jd
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.jd.bdp.hydra.hbase.service;

import com.jd.bdp.hydra.Span;

import java.io.IOException;

/**
  * User: yfliuyu
 * Date: 13-4-16
 * Time: 上午11:04
  */
public interface HbaseService {
    public void addSpan(Span span)throws IOException;
    public void annotationIndex(Span span)throws IOException;
    public void durationIndex(Span span)throws  IOException;
}
