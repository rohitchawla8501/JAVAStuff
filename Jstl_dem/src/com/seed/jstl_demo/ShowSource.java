/*
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements.  See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.seed.jstl_demo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * Display the sources of the JSP file.
 */
public class ShowSource extends TagSupport {

    private static final long serialVersionUID = 1L;

   int num1,num2;
public int add()
{
	int sum =num1+num2;
	return (sum);
}
    @Override
    public int doEndTag() throws JspException {
    JspWriter out=pageContext.getOut();
    try {
		out.print("Running");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}   
    
    int sum1=add();
    try {
		out.print(sum1);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    return super.doEndTag();
    }
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
}


