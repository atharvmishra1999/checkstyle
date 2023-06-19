///////////////////////////////////////////////////////////////////////////////////////////////
// checkstyle: Checks Java source code and other text files for adherence to a set of rules.
// Copyright (C) 2001-2023 the original author or authors.
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
///////////////////////////////////////////////////////////////////////////////////////////////

package com.puppycrawl.tools.checkstyle.checks.whitespace;

import static com.puppycrawl.tools.checkstyle.checks.whitespace.NoLineWrapCheck.MSG_KEY;

import org.junit.jupiter.api.Test;

import com.puppycrawl.tools.checkstyle.AbstractModuleTestSupport;

public class NoLineWrapExamplesTest extends AbstractModuleTestSupport {
    @Override
    protected String getResourceLocation() {
        return "xdocs-examples";
    }

    @Override
    protected String getPackageLocation() {
        return "com/puppycrawl/tools/checkstyle/checks/whitespace/nolinewrap";
    }

    @Test
    public void testExample1() throws Exception {
        final String[] expected = {
            "8:1: " + getCheckMessage(MSG_KEY, "package"),
            "11:1: " + getCheckMessage(MSG_KEY, "import"),
            "14:1: " + getCheckMessage(MSG_KEY, "import"),
        };

        verifyWithInlineConfigParser(getPath("Example1.java"), expected);
    }

    @Test
    public void testExample2() throws Exception {
        final String[] expected = {
            "8:1: " + getCheckMessage(MSG_KEY, "package"),
            "12:1: " + getCheckMessage(MSG_KEY, "import"),
            "15:1: " + getCheckMessage(MSG_KEY, "import"),
        };

        verifyWithInlineConfigParser(getPath("Example2.java"), expected);
    }

    @Test
    public void testExample3() throws Exception {
        final String[] expected = {
            "10:1: " + getCheckMessage(MSG_KEY, "import"),
        };

        verifyWithInlineConfigParser(getPath("Example3.java"), expected);
    }

    @Test
    public void testExample4() throws Exception {
        final String[] expected = {
            "13:1: " + getCheckMessage(MSG_KEY, "import"),
        };

        verifyWithInlineConfigParser(getPath("Example4.java"), expected);
    }

    @Test
    public void testExample5() throws Exception {
        final String[] expected = {
            "14:1: " + getCheckMessage(MSG_KEY, "CLASS_DEF"),
            "20:3: " + getCheckMessage(MSG_KEY, "METHOD_DEF"),
            "26:5: " + getCheckMessage(MSG_KEY, "CTOR_DEF"),
        };

        verifyWithInlineConfigParser(getPath("Example5.java"), expected);
    }
}